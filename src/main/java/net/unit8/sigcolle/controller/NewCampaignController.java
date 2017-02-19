package net.unit8.sigcolle.controller;


import javax.inject.Inject;

import enkan.component.doma2.DomaProvider;
import enkan.data.HttpResponse;
import enkan.data.Session;
import kotowari.component.TemplateEngine;

import net.unit8.sigcolle.auth.LoginUserPrincipal;
import net.unit8.sigcolle.dao.CampaignDao;
import net.unit8.sigcolle.dao.NewCampaignDao;
import net.unit8.sigcolle.form.NewCampaignForm;
import net.unit8.sigcolle.model.Campaign;
import net.unit8.sigcolle.model.NewCampaign;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;

import java.io.Serializable;
import java.util.logging.Logger;



import static enkan.util.BeanBuilder.builder;

public class NewCampaignController {

    final Logger logger = Logger.getLogger("SampleLogging");

    @Inject
    private TemplateEngine templateEngine;

    @Inject
    private DomaProvider domaProvider;

    public HttpResponse newcampaignGet(){
        NewCampaignDao NewCampaignDao = domaProvider.getDao(NewCampaignDao.class);
        return templateEngine.render("newcampaign");
    }

    //form:NewCampaignControllerFormクラスを利用してDBへ値を渡す
    public HttpResponse newcampaign(NewCampaignForm form, Session session){

        logger.info("とおりました");

        //Daoの取得
//        NewCampaignDao newCampaignDao = domaProvider.getDao(NewCampaignDao.class);

        CampaignDao newCampaignDao = domaProvider.getDao(CampaignDao.class);

        LoginUserPrincipal ss = (LoginUserPrincipal) session.get("principal");

//        logger.info("クラス確認" + ss + "");

//        NewCampaign campaign = builder(new NewCampaign())
//                .set(NewCampaign::setNewCampaignTitle, form.getNewCampaignTitle())
//                .set(NewCampaign::setNewCampaignStatement, form.getNewCampaignStatement())
//                .set(NewCampaign::setNewCampaignGoal, form.getNewCampaignGoal())
//                .set(NewCampaign::setNewCampaignCreateUserId, ss.getUserId())
//                .build();
//        newCampaignDao.insert(campaign);

        Campaign cp = builder(new Campaign())
                .set(Campaign::setTitle, form.getNewCampaignTitle())
                .set(Campaign::setStatement, form.getNewCampaignStatement())
                .set(Campaign::setGoal, form.getNewCampaignGoal())
                .set(Campaign::setCreateUserId, ss.getUserId())
                .build();
        newCampaignDao.insert(cp);

        CampaignDao campaignDao = domaProvider.getDao(CampaignDao.class);

        return templateEngine.render("index", "campaigns", campaignDao.selectAll());
    }




}

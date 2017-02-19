package net.unit8.sigcolle.dao;

import java.util.List;

import net.unit8.sigcolle.DomaConfig;
import net.unit8.sigcolle.model.Campaign;
import net.unit8.sigcolle.model.NewCampaign;
import net.unit8.sigcolle.model.UserCampaign;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

/**
 * Created by 2140261 on 2017/02/18.
 */

@Dao(config = DomaConfig.class)
public interface NewCampaignDao {
    @Insert
    int insert(NewCampaign newCampaign);
}

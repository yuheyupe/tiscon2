package net.unit8.sigcolle.form;

import java.util.List;

import javax.validation.constraints.NotNull;

import lombok.Data;
import net.unit8.sigcolle.validator.Password;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@Data
public class NewCampaignForm extends FormBase {

    //作成者名
    @NotNull
    @Length(min = 1, max = 20)
//    @Password
    private String createUserName;

    //タイトル
    @NotNull
    @Length(min = 1, max = 100)
    private String newCampaignTitle;

    //キャンペーン本文
    @NotNull
    @Length(min = 1, max = 1000)
    private String newCampaignStatement;

    //達成人数(ゴール,long)
    @NotNull
    private Long newCampaignGoal;
//    @Length(min = 1, max = 6)


    @Override
    public boolean hasErrors() {
        return super.hasErrors();
    }

    @Override
    public boolean hasErrors(String name) {
        return super.hasErrors(name);
    }

    @Override
    public List<String> getErrors(String name) {
        return super.getErrors(name);
    }




}

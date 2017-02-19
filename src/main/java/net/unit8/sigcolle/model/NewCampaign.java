package net.unit8.sigcolle.model;

import java.io.Serializable;
import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

/**
 * Created by 2140261 on 2017/02/18.
 */
@Entity
@Data
public class NewCampaign implements Serializable {

    private String newCampaignTitle;

    // Markdown description
    private String newCampaignStatement;

    private Long newCampaignGoal;

    private Long newCampaignCreateUserId;


}

package net.unit8.sigcolle.model;

import java.io.Serializable;

import lombok.Data;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

/**
 * @author kawasima
 */
@Entity
@Data
public class Signature implements Serializable {

    //賛同数
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long signatureId;

    private String name;
    private String signatureComment;

    //賛同される側のキャンペーンID
    private Long campaignId;
}

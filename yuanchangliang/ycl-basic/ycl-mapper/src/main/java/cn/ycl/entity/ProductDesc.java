package cn.ycl.entity;

import java.io.Serializable;

/**
 * ??Ʒ???(ProductDesc)实体类
 *
 * @author makejava
 * @since 2020-08-29 10:10:00
 */
public class ProductDesc implements Serializable {
    private static final long serialVersionUID = 465022495533335174L;
    /**
     * ?
     */
    private Long id;
    /**
     * ??Ʒ???
     */
    private String description;
    /**
     * ??Ʒ???
     */
    private Long productId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
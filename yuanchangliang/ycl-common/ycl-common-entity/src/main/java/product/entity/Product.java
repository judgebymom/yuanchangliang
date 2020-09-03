package product.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * ??Ʒ??Ϣ?(Product)实体类
 *
 * @author makejava
 * @since 2020-08-29 09:12:52
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -74063309562400322L;
    /**
     * ?
     */
    private Long id;
    /**
     * ??Ʒ?
     */
    private String name;
    /**
     * ?۸
     */
    private Double price;
    /**
     * ?
     */
    private String salePoint;
    /**
     * ͼƬ???
     */
    private String image;
    /**
     * ???
     */
    private Long stock;
    /**
     * ?Ƿ
     */
    private Integer flag;
    /**
     * ????ʱ?
     */
    private Date createTime;
    /**
     * ?????
     */
    private String createBy;
    /**
     * ????ʱ?
     */
    private Date updateTime;
    /**
     * ?????
     */
    private String updateBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(String salePoint) {
        this.salePoint = salePoint;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

}
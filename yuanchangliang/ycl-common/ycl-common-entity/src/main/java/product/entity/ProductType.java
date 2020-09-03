package product.entity;

import java.io.Serializable;

/**
 * ??Ʒ?(ProductType)实体类
 *
 * @author makejava
 * @since 2020-09-03 14:48:49
 */
public class ProductType implements Serializable {
    private static final long serialVersionUID = -14992292455551774L;
    /**
     * ?
     */
    private Long id;
    /**
     * ??Ʒid
     */
    private Long pid;
    /**
     * ??Ʒ?
     */
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
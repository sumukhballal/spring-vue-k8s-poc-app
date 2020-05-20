package hello.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "polls")
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="count")
    private Long count;

    public Long getId()
    {
        return this.id;
    }
    public void setId(Long id)
    {
        this.id=id;
    }

    public Long getCount()
    {
        return this.count;
    }
    public void setCount(Long count)
    {
        this.count=count;
    }

    protected Poll()
    {}

    public Poll(Long id, Long count)
    {
        this.id=id;
        this.count=count;
    }

    @Override
    public String toString()
    {
        return String.format("Poll[id=%d],count=%d", id,count);
    }
}
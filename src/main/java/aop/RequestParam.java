package aop;

/**
 * Created by liaomengge on 16/4/20.
 */
public class RequestParam {
    private String uri;
    private String mobile;
    private String name;
    private int age;

    public RequestParam() {
    }

    public RequestParam(String uri, String mobile, String name, int age) {
        this.uri = uri;
        this.mobile = mobile;
        this.name = name;
        this.age = age;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "RequestParam{" +
                "uri='" + uri + '\'' +
                ", mobile='" + mobile + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

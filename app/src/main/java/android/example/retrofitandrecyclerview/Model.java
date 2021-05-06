package android.example.retrofitandrecyclerview;

public class Model {

private String image;
private String body;

    public Model(String image, String body) {
        this.image = image;
        this.body = body;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}

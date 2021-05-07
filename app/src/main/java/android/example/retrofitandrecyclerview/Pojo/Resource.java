package android.example.retrofitandrecyclerview.Pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resource {
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("resourceable_type")
    @Expose
    private String resourceableType;
    @SerializedName("resourceable_id")
    @Expose
    private int resourceableId;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResourceableType() {
        return resourceableType;
    }

    public void setResourceableType(String resourceableType) {
        this.resourceableType = resourceableType;
    }

    public int getResourceableId() {
        return resourceableId;
    }

    public void setResourceableId(int resourceableId) {
        this.resourceableId = resourceableId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}

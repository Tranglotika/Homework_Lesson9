import com.google.gson.annotations.SerializedName;

public class Movie {
    @SerializedName("id")
    private int id;

    @SerializedName("movie_title")
    private String title;

    @SerializedName("movie_genres")
    private String genres;

    @SerializedName("producer")
    private String producer;

    @SerializedName("duration")
    private int duration;

    @SerializedName("opening")
    private String opening;

    @SerializedName("view")
    private int view;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getOpening() {
        return opening;
    }

    public void setOpening(String opening) {
        this.opening = opening;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                ", producer='" + producer + '\'' +
                ", duration=" + duration +
                ", opening='" + opening + '\'' +
                ", view=" + view +
                '}';
    }
}

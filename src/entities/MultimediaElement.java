package entities;

public abstract class MultimediaElement {
    // ATTRIBUTES
    private final String title;
    private final FileFormats format;

    // CONSTRUCTORS
    public MultimediaElement(String title, FileFormats format) {
        this.title = title;
        this.format = format;
    }

    // GETTERS & SETTERS
    public String getFileName() {
        return this.title + "." + this.format.toString().toLowerCase();
    }
}

public class Magazine {
    private String editor;
    private String month;

    public Magazine(String editor, String month) {
        this.editor = editor;
        this.month = month;
    }

    public String getEditor() {
        return this.editor;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    public String getMonth() {
        return this.month;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void magazineDisplay(){
        System.out.println("Editor: " + editor);
        System.out.println("Month: " + month);
    }
}

package template;

public class Main {
    public static void main(String[] args) {
        InternareTemplateMethod standard = new InternareStandard();
        InternareTemplateMethod urganeta = new InternareUrgenta();
        standard.internare();
        urganeta.internare();
    }
}

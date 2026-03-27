package FactoryMethod;

public abstract class FeluriDeMancareFactory {
    public abstract FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire) throws Exception;

    public abstract FeluriMancare getFeluriDeMancare(TipFelMancare tipFelMancare, String denumire, Double  gramaj) throws Exception;
}

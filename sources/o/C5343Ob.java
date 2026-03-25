package o;

/* JADX INFO: renamed from: o.Ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5343Ob extends NS<java.io.InputStream> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<java.io.InputStream> KWHzl() {
        return java.io.InputStream.class;
    }

    public C5343Ob(android.content.res.AssetManager assetManager, java.lang.String str) {
        super(assetManager, str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.NS
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.io.InputStream AEQbTJ(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        return assetManager.open(str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.NS
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.close();
    }
}

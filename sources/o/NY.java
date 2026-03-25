package o;

/* JADX INFO: loaded from: classes2.dex */
public class NY extends NS<android.content.res.AssetFileDescriptor> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<android.content.res.AssetFileDescriptor> KWHzl() {
        return android.content.res.AssetFileDescriptor.class;
    }

    public NY(android.content.res.AssetManager assetManager, java.lang.String str) {
        super(assetManager, str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/Object; */
    @Override // o.NS
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public android.content.res.AssetFileDescriptor AEQbTJ(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException {
        return assetManager.openFd(str);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.NS
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(android.content.res.AssetFileDescriptor assetFileDescriptor) throws java.io.IOException {
        assetFileDescriptor.close();
    }
}

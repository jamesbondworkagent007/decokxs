package o;

/* JADX INFO: loaded from: classes2.dex */
public final class NO extends AbstractC5346Oe<android.content.res.AssetFileDescriptor> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<android.content.res.AssetFileDescriptor> KWHzl() {
        return android.content.res.AssetFileDescriptor.class;
    }

    public NO(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/Object; */
    @Override // o.AbstractC5346Oe
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public android.content.res.AssetFileDescriptor KWHzl(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new java.io.FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.AbstractC5346Oe
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void AEQbTJ(android.content.res.AssetFileDescriptor assetFileDescriptor) throws java.io.IOException {
        assetFileDescriptor.close();
    }
}

package o;

/* JADX INFO: loaded from: classes2.dex */
public class NZ extends AbstractC5346Oe<android.os.ParcelFileDescriptor> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<android.os.ParcelFileDescriptor> KWHzl() {
        return android.os.ParcelFileDescriptor.class;
    }

    public NZ(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        super(contentResolver, uri);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/net/Uri;Landroid/content/ContentResolver;)Ljava/lang/Object; */
    @Override // o.AbstractC5346Oe
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public android.os.ParcelFileDescriptor KWHzl(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            throw new java.io.FileNotFoundException("FileDescriptor is null for: " + uri);
        }
        return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)V */
    @Override // o.AbstractC5346Oe
    public void AEQbTJ(android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
        parcelFileDescriptor.close();
    }
}

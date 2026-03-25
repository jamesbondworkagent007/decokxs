package o;

/* JADX INFO: loaded from: classes2.dex */
public final class QA implements NL<android.os.ParcelFileDescriptor, android.graphics.Bitmap> {
    public final C5403Qj OLrzqt;

    public QA(C5403Qj c5403Qj) {
        this.OLrzqt = c5403Qj;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull android.os.ParcelFileDescriptor parcelFileDescriptor, @androidx.annotation.NonNull NM nm) {
        return KWHzl(parcelFileDescriptor) && this.OLrzqt.KWHzl(parcelFileDescriptor);
    }

    public final boolean KWHzl(@androidx.annotation.NonNull android.os.ParcelFileDescriptor parcelFileDescriptor) {
        java.lang.String str = android.os.Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull android.os.ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @androidx.annotation.NonNull NM nm) throws java.io.IOException {
        return this.OLrzqt.OLrzqt(parcelFileDescriptor, i, i2, nm);
    }
}

package o;

/* JADX INFO: renamed from: o.Qw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5416Qw implements NL<android.net.Uri, android.graphics.Bitmap> {
    public final OG OLrzqt;
    public final QT copydefault;

    public C5416Qw(QT qt, OG og) {
        this.copydefault = qt;
        this.OLrzqt = og;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean copydefault(@androidx.annotation.NonNull android.net.Uri uri, @androidx.annotation.NonNull NM nm) {
        return "android.resource".equals(uri.getScheme());
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public OC<android.graphics.Bitmap> copydefault(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        OC<android.graphics.drawable.Drawable> ocCopydefault = this.copydefault.copydefault(uri, i, i2, nm);
        if (ocCopydefault == null) {
            return null;
        }
        return C5406Qm.copydefault(this.OLrzqt, ocCopydefault.AEQbTJ(), i, i2);
    }
}

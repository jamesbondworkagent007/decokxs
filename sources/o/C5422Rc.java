package o;

import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5422Rc implements NN<QX> {
    public final NN<android.graphics.Bitmap> KWHzl;

    public C5422Rc(NN<android.graphics.Bitmap> nn) {
        this.KWHzl = (NN) SE.OLrzqt(nn);
    }

    @Override // o.NN
    public OC<QX> OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OC<QX> oc, int i, int i2) {
        QX qxAEQbTJ = oc.AEQbTJ();
        OC<android.graphics.Bitmap> c5398Qe = new C5398Qe(qxAEQbTJ.OLrzqt(), Glide.OLrzqt(context).OLrzqt());
        OC<android.graphics.Bitmap> ocOLrzqt = this.KWHzl.OLrzqt(context, c5398Qe, i, i2);
        if (!c5398Qe.equals(ocOLrzqt)) {
            c5398Qe.djBIcL();
        }
        qxAEQbTJ.AEQbTJ(this.KWHzl, ocOLrzqt.AEQbTJ());
        return oc;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5422Rc) {
            return this.KWHzl.equals(((C5422Rc) obj).KWHzl);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        this.KWHzl.AEQbTJ(messageDigest);
    }
}

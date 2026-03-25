package o;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.Qt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5413Qt implements NN<android.graphics.drawable.Drawable> {
    public final NN<android.graphics.Bitmap> EZpvd;
    public final boolean KWHzl;

    public NN<BitmapDrawable> OLrzqt() {
        return this;
    }

    public C5413Qt(NN<android.graphics.Bitmap> nn, boolean z) {
        this.EZpvd = nn;
        this.KWHzl = z;
    }

    @Override // o.NN
    public OC<android.graphics.drawable.Drawable> OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OC<android.graphics.drawable.Drawable> oc, int i, int i2) {
        OG ogOLrzqt = Glide.OLrzqt(context).OLrzqt();
        android.graphics.drawable.Drawable drawableAEQbTJ = oc.AEQbTJ();
        OC<android.graphics.Bitmap> ocCopydefault = C5406Qm.copydefault(ogOLrzqt, drawableAEQbTJ, i, i2);
        if (ocCopydefault != null) {
            OC<android.graphics.Bitmap> ocOLrzqt = this.EZpvd.OLrzqt(context, ocCopydefault, i, i2);
            if (ocOLrzqt.equals(ocCopydefault)) {
                ocOLrzqt.djBIcL();
                return oc;
            }
            return copydefault(context, ocOLrzqt);
        }
        if (!this.KWHzl) {
            return oc;
        }
        throw new java.lang.IllegalArgumentException("Unable to convert " + drawableAEQbTJ + " to a Bitmap");
    }

    public final OC<android.graphics.drawable.Drawable> copydefault(android.content.Context context, OC<android.graphics.Bitmap> oc) {
        return C5418Qy.copydefault(context.getResources(), oc);
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C5413Qt) {
            return this.EZpvd.equals(((C5413Qt) obj).EZpvd);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        this.EZpvd.AEQbTJ(messageDigest);
    }
}

package o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public class NG<T> implements NN<T> {
    public final java.util.Collection<? extends NN<T>> EZpvd;

    @java.lang.SafeVarargs
    public NG(@androidx.annotation.NonNull NN<T>... nnArr) {
        if (nnArr.length == 0) {
            throw new java.lang.IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.EZpvd = java.util.Arrays.asList(nnArr);
    }

    @Override // o.NN
    public OC<T> OLrzqt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull OC<T> oc, int i, int i2) {
        java.util.Iterator<? extends NN<T>> it = this.EZpvd.iterator();
        OC<T> oc2 = oc;
        while (it.hasNext()) {
            OC<T> ocOLrzqt = it.next().OLrzqt(context, oc2, i, i2);
            if (oc2 != null && !oc2.equals(oc) && !oc2.equals(ocOLrzqt)) {
                oc2.djBIcL();
            }
            oc2 = ocOLrzqt;
        }
        return oc2;
    }

    @Override // o.NH
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof NG) {
            return this.EZpvd.equals(((NG) obj).EZpvd);
        }
        return false;
    }

    @Override // o.NH
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    @Override // o.NH
    public void AEQbTJ(@androidx.annotation.NonNull MessageDigest messageDigest) {
        java.util.Iterator<? extends NN<T>> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            it.next().AEQbTJ(messageDigest);
        }
    }
}

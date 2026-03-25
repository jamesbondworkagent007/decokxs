package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public class ST extends RecyclerView.ViewHolder {
    public final java.util.HashSet<java.lang.Integer> AEQbTJ;
    public final LinkedHashSet<java.lang.Integer> EZpvd;
    public final LinkedHashSet<java.lang.Integer> KWHzl;

    @java.lang.Deprecated
    public android.view.View OLrzqt;
    public SS copydefault;
    public final android.util.SparseArray<android.view.View> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ST OLrzqt(SS ss) {
        this.copydefault = ss;
        return this;
    }

    public ST(android.view.View view) {
        super(view);
        this.djBIcL = new android.util.SparseArray<>();
        this.EZpvd = new LinkedHashSet<>();
        this.KWHzl = new LinkedHashSet<>();
        this.AEQbTJ = new java.util.HashSet<>();
        this.OLrzqt = view;
    }

    public ST copydefault(@androidx.annotation.IdRes int i, java.lang.CharSequence charSequence) {
        ((android.widget.TextView) OLrzqt(i)).setText(charSequence);
        return this;
    }

    public ST EZpvd(@androidx.annotation.IdRes int i, android.graphics.drawable.Drawable drawable) {
        ((android.widget.ImageView) OLrzqt(i)).setImageDrawable(drawable);
        return this;
    }

    public ST KWHzl(@androidx.annotation.IdRes int i, boolean z) {
        OLrzqt(i).setVisibility(z ? 0 : 8);
        return this;
    }

    public <T extends android.view.View> T OLrzqt(@androidx.annotation.IdRes int i) {
        T t = (T) this.djBIcL.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.djBIcL.put(i, t2);
        return t2;
    }
}

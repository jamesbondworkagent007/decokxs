package o;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5476Tf extends RecyclerView.ViewHolder {
    public android.util.SparseArray<android.view.View> copydefault;

    public C5476Tf(android.view.View view) {
        super(view);
        this.copydefault = new android.util.SparseArray<>();
    }

    public <T extends android.view.View> T EZpvd(int i) {
        T t = (T) this.copydefault.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.itemView.findViewById(i);
        this.copydefault.put(i, t2);
        return t2;
    }

    public C5476Tf copydefault(int i, java.lang.String str) {
        ((android.widget.TextView) EZpvd(i)).setText(str);
        return this;
    }

    public C5476Tf EZpvd(int i, int i2) {
        ((android.widget.ImageView) EZpvd(i)).setImageResource(i2);
        return this;
    }
}

package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aiJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7354aiJ extends RecyclerView.ViewHolder {
    public int KWHzl;
    public final C7362aiR OLrzqt;
    public boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7362aiR AEQbTJ() {
        return this.OLrzqt;
    }

    public C7354aiJ(android.view.View view, C7362aiR c7362aiR) {
        super(view);
        this.KWHzl = 0;
        this.OLrzqt = c7362aiR;
    }

    public C7354aiJ(android.view.View view) {
        super(view);
        this.KWHzl = 0;
        this.OLrzqt = null;
    }

    public boolean copydefault() {
        return getItemViewType() == Integer.MIN_VALUE;
    }

    public boolean KWHzl() {
        return getItemViewType() < 0;
    }

    public LuaValue OLrzqt() {
        C7362aiR c7362aiR = this.OLrzqt;
        if (c7362aiR != null) {
            return c7362aiR.OLrzqt();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View] */
    public android.view.View EZpvd() {
        C7362aiR c7362aiR = this.OLrzqt;
        if (c7362aiR != null) {
            return c7362aiR.f_();
        }
        return null;
    }

    public void KWHzl(View.OnClickListener onClickListener) {
        this.copydefault = onClickListener != null;
        this.itemView.setOnClickListener(onClickListener);
    }

    public void KWHzl(View.OnLongClickListener onLongClickListener) {
        this.itemView.setOnLongClickListener(onLongClickListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public java.lang.String toString() {
        return super.toString() + " isfoot: " + copydefault() + " count: " + this.KWHzl;
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDBaseRecyclerLayout;

/* JADX INFO: renamed from: o.aiC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7347aiC extends RecyclerView.ItemDecoration {
    public UDBaseRecyclerLayout EZpvd;
    public boolean copydefault = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(boolean z) {
        this.copydefault = z;
    }

    public C7347aiC(UDBaseRecyclerLayout uDBaseRecyclerLayout) {
        this.EZpvd = uDBaseRecyclerLayout;
    }

    public boolean copydefault(int i, int i2) {
        return i == this.EZpvd.gEmmrt() && i2 == this.EZpvd.djBIcL();
    }
}

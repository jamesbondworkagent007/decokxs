package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16356eiQ extends AbstractC16355eiP {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public long ejfBZ;
    public final android.widget.LinearLayout fARcdN;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.getSubtitle, 2);
        sparseIntArray.put(C13754dXa.ActionBar.extraCallbackWithResult, 3);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 4);
        sparseIntArray.put(C13754dXa.ActionBar.NRYds, 5);
        sparseIntArray.put(C13754dXa.ActionBar.dump, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setHandler, 7);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialatDTRm, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DFbvW, 9);
        sparseIntArray.put(C13754dXa.ActionBar.run, 10);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 11);
        sparseIntArray.put(C13754dXa.ActionBar.gFTCsA, 12);
        sparseIntArray.put(C13754dXa.ActionBar.RihMUf, 13);
    }

    public C16356eiQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, DbNXlk, AkhnZx));
    }

    public C16356eiQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C57518yjt) objArr[10], (C57468yiw) objArr[11], (C57518yjt) objArr[8], (C57518yjt) objArr[9], (C57512yjn) objArr[5], (C55173xeu) objArr[13], (android.widget.FrameLayout) objArr[12], (android.widget.LinearLayout) objArr[3], (C57523yjy) objArr[6], (OKAlertBanner) objArr[2], (C57518yjt) objArr[7], (C57524yjz) objArr[4]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.fARcdN = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}

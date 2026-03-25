package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16353eiN extends AbstractC16354eiO {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long fetchVPNInfo;
    public final android.widget.LinearLayout isConnected;

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
        sparseIntArray.put(C13754dXa.ActionBar.extraCallbackWithResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatBuilder, 3);
        sparseIntArray.put(C13754dXa.ActionBar.PlaybackStateCompatMediaKeyAction, 4);
        sparseIntArray.put(C13754dXa.ActionBar.dump, 5);
        sparseIntArray.put(C13754dXa.ActionBar.hbZCHz, 6);
        sparseIntArray.put(C13754dXa.ActionBar.fkESqH, 7);
        sparseIntArray.put(C13754dXa.ActionBar.gFTCsA, 8);
        sparseIntArray.put(C13754dXa.ActionBar.RihMUf, 9);
    }

    public C16353eiN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, gEmmrt, AkhnZx));
    }

    public C16353eiN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C57468yiw) objArr[7], (C57523yjy) objArr[6], (C55173xeu) objArr[9], (android.widget.FrameLayout) objArr[8], (android.widget.LinearLayout) objArr[2], (C57523yjy) objArr[5], (C57524yjz) objArr[3], (C57512yjn) objArr[4]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}

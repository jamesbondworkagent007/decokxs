package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16236egC extends AbstractC16238egE {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public final android.widget.LinearLayout AubY;
    public long hDKMBd;
    public final android.widget.LinearLayout zsXlph;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.GQzpsZsQwTVT, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi191, 3);
        sparseIntArray.put(C13754dXa.ActionBar.HJWChPOZOJIj, 4);
        sparseIntArray.put(C13754dXa.ActionBar.validateRelationship, 5);
        sparseIntArray.put(C13754dXa.ActionBar.RgaQzq, 6);
        sparseIntArray.put(C13754dXa.ActionBar.component1, 7);
        sparseIntArray.put(C13754dXa.ActionBar.OTJFaA, 8);
        sparseIntArray.put(C13754dXa.ActionBar.onVolumeChanged, 9);
        sparseIntArray.put(C13754dXa.ActionBar.giSNqX, 10);
        sparseIntArray.put(C13754dXa.ActionBar.ibrGus, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ahrCSq, 12);
        sparseIntArray.put(C13754dXa.ActionBar.parseResult, 13);
        sparseIntArray.put(C13754dXa.ActionBar.receiveFile, 14);
        sparseIntArray.put(C13754dXa.ActionBar.component2, 15);
        sparseIntArray.put(C13754dXa.ActionBar.OAhWiU, 16);
        sparseIntArray.put(C13754dXa.ActionBar.zpGcln, 17);
        sparseIntArray.put(C13754dXa.ActionBar.addReporter, 18);
        sparseIntArray.put(C13754dXa.ActionBar.onStart, 19);
        sparseIntArray.put(C13754dXa.ActionBar.SUwuXE, 20);
        sparseIntArray.put(C13754dXa.ActionBar.fACtfg, 21);
        sparseIntArray.put(C13754dXa.ActionBar.onConfigurationChanged, 22);
        sparseIntArray.put(C13754dXa.ActionBar.onRepeatModeChanged, 23);
    }

    public C16236egC(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, uzCIH, getNewProxyInstance));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16236egC(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        OKAlertBanner oKAlertBanner = (OKAlertBanner) objArr[10];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[17];
        android.view.View view2 = (android.view.View) objArr[16];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 0, oKAlertBanner, constraintLayout, view2, obj != null ? C17110ewc.OLrzqt((android.view.View) obj) : null, (android.widget.FrameLayout) objArr[4], (AppCompatImageView) objArr[20], (android.widget.ImageView) objArr[11], (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[12], (AppCompatImageView) objArr[21], (android.widget.LinearLayout) objArr[5], (android.widget.LinearLayout) objArr[14], (RecyclerView) objArr[23], (C57591ylM) objArr[3], (NestedScrollView) objArr[9], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[15]);
        this.hDKMBd = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.zsXlph = linearLayout;
        linearLayout.setTag(null);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) objArr[1];
        this.AubY = linearLayout2;
        linearLayout2.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.hDKMBd = 0L;
        }
    }
}

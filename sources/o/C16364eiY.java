package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16364eiY extends AbstractC16363eiX {
    public static final ViewDataBinding.IncludedLayouts AuCTelauCTel = null;
    public static final android.util.SparseIntArray AxsJAY;
    public long gHZMYf;

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
        AxsJAY = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.DfrfUJ, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatApi23TransportControls, 3);
        sparseIntArray.put(C13754dXa.ActionBar.DGgkXd, 4);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatApi21PlaybackInfo, 5);
        sparseIntArray.put(C13754dXa.ActionBar.fmdvVn, 6);
        sparseIntArray.put(C13754dXa.ActionBar.fJNWhG, 7);
        sparseIntArray.put(C13754dXa.ActionBar.uzCIH, 8);
        sparseIntArray.put(C13754dXa.ActionBar.AhwBna, 9);
        sparseIntArray.put(C13754dXa.ActionBar.onPlaybackPositionUpdate, 10);
        sparseIntArray.put(C13754dXa.ActionBar.reportFullyDrawn, 11);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi181, 12);
        sparseIntArray.put(C13754dXa.ActionBar.DXd, 13);
        sparseIntArray.put(C13754dXa.ActionBar.getLastCustomNonConfigurationInstance, 14);
        sparseIntArray.put(C13754dXa.ActionBar.getLifecycle, 15);
        sparseIntArray.put(C13754dXa.ActionBar.GhqvEQ, 16);
        sparseIntArray.put(C13754dXa.ActionBar.fOrBHg, 17);
        sparseIntArray.put(C13754dXa.ActionBar.onCreate, 18);
        sparseIntArray.put(C13754dXa.ActionBar.removeOnConfigurationChangedListener, 19);
        sparseIntArray.put(C13754dXa.ActionBar.ruDxL, 20);
        sparseIntArray.put(C13754dXa.ActionBar.UvfnWv, 21);
        sparseIntArray.put(C13754dXa.ActionBar.onBackPressed, 22);
        sparseIntArray.put(C13754dXa.ActionBar.fTEjYi, 23);
        sparseIntArray.put(C13754dXa.ActionBar.ORWKdN, 24);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKfNUfqk, 25);
        sparseIntArray.put(C13754dXa.ActionBar.iUnTnt, 26);
        sparseIntArray.put(C13754dXa.ActionBar.getValue, 27);
        sparseIntArray.put(C13754dXa.ActionBar.gCNefq, 28);
    }

    public C16364eiY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 29, AuCTelauCTel, AxsJAY));
    }

    public C16364eiY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[9], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8], (C33537myN) objArr[1], (C52794wYp) objArr[25], (NestedScrollView) objArr[2], (Group) objArr[26], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[24], (C55173xeu) objArr[27], (Group) objArr[16], (android.widget.TextView) objArr[13], (android.widget.FrameLayout) objArr[28], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[6], (android.widget.ImageView) objArr[20], (ConstraintLayout) objArr[21], (ConstraintLayout) objArr[17], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[5], (ConstraintLayout) objArr[3], (android.view.View) objArr[12], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[11]);
        this.gHZMYf = -1L;
        this.fARcdN.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gHZMYf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gHZMYf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gHZMYf = 0L;
        }
    }
}

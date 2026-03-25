package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ert, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16862ert extends AbstractC16858erp {
    public static final ViewDataBinding.IncludedLayouts AhwBna;
    public static final android.util.SparseIntArray DbNXlk;
    public long AkhnZx;
    public final ConstraintLayout isConnected;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        AhwBna = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"item_pending"}, new int[]{3}, new int[]{C13754dXa.TaskDescription.GGlJim});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 4);
        sparseIntArray.put(C13754dXa.ActionBar.isDevMode, 5);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatMediaSessionImplApi21, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setShuffleMode, 7);
        sparseIntArray.put(C13754dXa.ActionBar.xxhdY, 8);
    }

    public C16862ert(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, DbNXlk));
    }

    public C16862ert(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (Guideline) objArr[8], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[5], (AbstractC16867ery) objArr[3], (C15503eKt) objArr[7], (C15509eKz) objArr[6]);
        this.AkhnZx = -1L;
        this.AEQbTJ.setTag(null);
        this.OLrzqt.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.valueOf);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 4L;
        }
        this.valueOf.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AkhnZx != 0) {
                return true;
            }
            return this.valueOf.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.ejfBZ != i) {
            return false;
        }
        EZpvd((C15488eKe) obj);
        return true;
    }

    @Override // o.AbstractC16858erp
    public void EZpvd(@androidx.annotation.Nullable C15488eKe c15488eKe) {
        this.djBIcL = c15488eKe;
        synchronized (this) {
            this.AkhnZx |= 2;
        }
        notifyPropertyChanged(dTV.ejfBZ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return EZpvd((AbstractC16867ery) obj, i2);
    }

    private boolean EZpvd(AbstractC16867ery abstractC16867ery, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.AkhnZx |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strIsConnected;
        java.lang.String strAkhnZx;
        synchronized (this) {
            j = this.AkhnZx;
            this.AkhnZx = 0L;
        }
        C15488eKe c15488eKe = this.djBIcL;
        long j2 = j & 6;
        if (j2 == 0 || c15488eKe == null) {
            strIsConnected = null;
            strAkhnZx = null;
        } else {
            strIsConnected = c15488eKe.isConnected();
            strAkhnZx = c15488eKe.AkhnZx();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.AEQbTJ, strAkhnZx);
            TextViewBindingAdapter.setText(this.OLrzqt, strIsConnected);
        }
        ViewDataBinding.executeBindingsOn(this.valueOf);
    }
}

package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43754rvJ extends AbstractC43753rvI {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout AkhnZx;
    public long fetchVPNInfo;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.sbu, 1);
        sparseIntArray.put(C43662rtX.ActionBar.OJuSTm, 2);
        sparseIntArray.put(C43662rtX.ActionBar.RIuxYh, 3);
        sparseIntArray.put(C43662rtX.ActionBar.aCSzUz, 4);
        sparseIntArray.put(C43662rtX.ActionBar.OcIXYQ, 5);
        sparseIntArray.put(C43662rtX.ActionBar.WS, 6);
        sparseIntArray.put(C43662rtX.ActionBar.sendBehavioSecData, 7);
        sparseIntArray.put(C43662rtX.ActionBar.getSessionID, 8);
    }

    public C43754rvJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AhwBna));
    }

    public C43754rvJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[5], (android.widget.ImageButton) objArr[2], (android.widget.Button) objArr[6], (RecyclerView) objArr[3], (ShapeableImageView) objArr[4], (android.widget.FrameLayout) objArr[1], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
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

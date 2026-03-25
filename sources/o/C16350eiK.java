package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16350eiK extends AbstractC16344eiE {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout fetchVPNInfo;
    public long values;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 1);
        sparseIntArray.put(C13754dXa.ActionBar.sanitizeSessionIdIgnoreCase, 2);
        sparseIntArray.put(C13754dXa.ActionBar.hErYDe, 3);
        sparseIntArray.put(C13754dXa.ActionBar.RjCdvpRjCdvp, 4);
        sparseIntArray.put(C13754dXa.ActionBar.IPostMessageServiceStub, 5);
        sparseIntArray.put(C13754dXa.ActionBar.UimiPO, 6);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickVisualMediaImageAndVideo, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getClipDataUrisactivity_release, 8);
        sparseIntArray.put(C13754dXa.ActionBar.DPHsZd, 9);
    }

    public C16350eiK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, isConnected));
    }

    public C16350eiK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[9], (ShapeableImageView) objArr[4], (ShapeableImageView) objArr[3], (ShapeableImageView) objArr[2], (android.widget.ImageView) objArr[6], (android.widget.LinearLayout) objArr[5], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7]);
        this.values = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.values = 0L;
        }
    }
}

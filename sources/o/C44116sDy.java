package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.imageview.ShapeableImageView;
import o.C44105sDn;

/* JADX INFO: renamed from: o.sDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44116sDy extends sDA {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final ConstraintLayout AkhnZx;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C44105sDn.ActionBar.flVtFt, 1);
        sparseIntArray.put(C44105sDn.ActionBar.OLrzqt, 2);
        sparseIntArray.put(C44105sDn.ActionBar.zsXlph, 3);
        sparseIntArray.put(C44105sDn.ActionBar.AuCTel, 4);
        sparseIntArray.put(C44105sDn.ActionBar.QVAiDq, 5);
        sparseIntArray.put(C44105sDn.ActionBar.QOLQEE, 6);
        sparseIntArray.put(C44105sDn.ActionBar.djBIcL, 7);
    }

    public C44116sDy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, valueOf));
    }

    public C44116sDy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (CardView) objArr[2], (android.widget.TextView) objArr[7], (ShapeableImageView) objArr[4], (LottieAnimationView) objArr[3], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (android.view.View) objArr[1]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AYXKKw != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AYXKKw = 0L;
        }
    }
}

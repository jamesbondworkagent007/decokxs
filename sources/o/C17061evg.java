package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.evg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C17061evg extends AbstractC17057evc {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AYXKKw;
    public final ConstraintLayout djBIcL;

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
        sparseIntArray.put(C13754dXa.ActionBar.SQPLEi, 1);
        sparseIntArray.put(C13754dXa.ActionBar.UPbYzn, 2);
        sparseIntArray.put(C13754dXa.ActionBar.sEAkxl, 3);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherLifecycleOnBackPressedCancellable, 4);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherOnBackPressedCancellable, 5);
        sparseIntArray.put(C13754dXa.ActionBar.zuBGHE, 6);
    }

    public C17061evg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, valueOf, AhwBna));
    }

    public C17061evg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[6], (C57299yfm) objArr[3], (android.widget.ImageView) objArr[1], (LottieAnimationView) objArr[2], (AppCompatTextView) objArr[4], (C55251xgS) objArr[5]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
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

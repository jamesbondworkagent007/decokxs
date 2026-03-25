package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16376eik extends AbstractC16369eid {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts OLrzqt = null;
    public final android.widget.LinearLayout AYXKKw;
    public long valueOf;

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
        sparseIntArray.put(C13754dXa.ActionBar.AudioAttributesImplBaseParcelizer, 1);
        sparseIntArray.put(C13754dXa.ActionBar.connect, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ViewTreeOnBackPressedDispatcherOwner, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getPlaybackType, 4);
    }

    public C16376eik(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, OLrzqt, AhwBna));
    }

    public C16376eik(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (LottieAnimationView) objArr[1], (LottieAnimationView) objArr[2], (RecyclerView) objArr[4], (android.widget.TextView) objArr[3]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}

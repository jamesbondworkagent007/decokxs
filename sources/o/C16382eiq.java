package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eiq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16382eiq extends AbstractC16383eir {
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public static final android.util.SparseIntArray values;
    public final android.widget.FrameLayout AkhnZx;
    public long DbNXlk;

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
        values = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.siEkQe, 1);
        sparseIntArray.put(C13754dXa.ActionBar.write, 2);
        sparseIntArray.put(C13754dXa.ActionBar.pauseLocationServices, 3);
        sparseIntArray.put(C13754dXa.ActionBar.accept, 4);
        sparseIntArray.put(C13754dXa.ActionBar.getText, 5);
        sparseIntArray.put(C13754dXa.ActionBar.setMetadata, 6);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi217, 7);
        sparseIntArray.put(C13754dXa.ActionBar.getQueueTitle, 8);
        sparseIntArray.put(C13754dXa.ActionBar.newArray, 9);
    }

    public C16382eiq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, valueOf, values));
    }

    public C16382eiq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[4], (ConstraintLayout) objArr[3], (ConstraintLayout) objArr[1], (LottieAnimationView) objArr[2], (NestedScrollView) objArr[7], (C52794wYp) objArr[9], (LinearLayoutCompat) objArr[5], (RecyclerView) objArr[8], (android.widget.TextView) objArr[6]);
        this.DbNXlk = -1L;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AkhnZx = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}

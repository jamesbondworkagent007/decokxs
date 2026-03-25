package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43766rvV extends AbstractC43763rvS {
    public static final ViewDataBinding.IncludedLayouts EZpvd;
    public static final android.util.SparseIntArray copydefault;
    public long OLrzqt;
    public final LinearLayoutCompat djBIcL;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(3);
        EZpvd = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar"}, new int[]{1}, new int[]{C43662rtX.TaskDescription.hCLrkq});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialhlXVux, 2);
    }

    public C43766rvV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, EZpvd, copydefault));
    }

    public C43766rvV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (LottieAnimationView) objArr[2], (AbstractC43977rzU) objArr[1]);
        this.OLrzqt = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.djBIcL = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OLrzqt = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.OLrzqt != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return EZpvd((AbstractC43977rzU) obj, i2);
    }

    private boolean EZpvd(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.OLrzqt |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.OLrzqt;
            this.OLrzqt = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.djBIcL, C33570myu.gEmmrt(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}

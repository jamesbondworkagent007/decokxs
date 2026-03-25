package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43802rwE extends AbstractC43801rwD {
    public static final ViewDataBinding.IncludedLayouts AYXKKw;
    public static final android.util.SparseIntArray djBIcL;
    public long AhwBna;
    public final LinearLayoutCompat values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        AYXKKw = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar", "layout_footer"}, new int[]{1, 2}, new int[]{C43662rtX.TaskDescription.hCLrkq, C43662rtX.TaskDescription.DcqEDu});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        djBIcL = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialgBtXYZ, 3);
        sparseIntArray.put(C43662rtX.ActionBar.dLBcXg, 4);
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialhlXVux, 5);
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialhOMIpD, 6);
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialatDTRm, 7);
    }

    public C43802rwE(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AYXKKw, djBIcL));
    }

    public C43802rwE(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 2, (AbstractC43970rzN) objArr[2], (android.widget.FrameLayout) objArr[4], (android.widget.LinearLayout) objArr[7], (android.widget.ImageView) objArr[6], (LottieAnimationView) objArr[5], (LinearLayoutCompat) objArr[3], (AbstractC43977rzU) objArr[1]);
        this.AhwBna = -1L;
        setContainedBinding(this.AEQbTJ);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.values = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.valueOf);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 4L;
        }
        this.valueOf.invalidateAll();
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.AhwBna != 0) {
                return true;
            }
            return this.valueOf.hasPendingBindings() || this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return KWHzl((AbstractC43977rzU) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return OLrzqt((AbstractC43970rzN) obj, i2);
    }

    private boolean KWHzl(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 1;
        }
        return true;
    }

    private boolean OLrzqt(AbstractC43970rzN abstractC43970rzN, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.AhwBna |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.valueOf);
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}

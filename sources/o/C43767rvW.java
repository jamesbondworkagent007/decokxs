package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.uilab.reminder.OKReminder;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43767rvW extends AbstractC43765rvU {
    public static final android.util.SparseIntArray AEQbTJ;
    public static final ViewDataBinding.IncludedLayouts EZpvd;
    public long djBIcL;
    public final LinearLayoutCompat gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        EZpvd = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar"}, new int[]{1}, new int[]{C43662rtX.TaskDescription.hCLrkq});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AEQbTJ = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.invokespecialRtjmuc, 2);
        sparseIntArray.put(C43662rtX.ActionBar.accept, 3);
    }

    public C43767rvW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, EZpvd, AEQbTJ));
    }

    public C43767rvW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (C52794wYp) objArr[3], (OKReminder) objArr[2], (AbstractC43977rzU) objArr[1]);
        this.djBIcL = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.gEmmrt = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.OLrzqt);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
        }
        this.OLrzqt.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.djBIcL != 0) {
                return true;
            }
            return this.OLrzqt.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return OLrzqt((AbstractC43977rzU) obj, i2);
    }

    private boolean OLrzqt(AbstractC43977rzU abstractC43977rzU, int i) {
        if (i != C43664rtZ.KWHzl) {
            return false;
        }
        synchronized (this) {
            this.djBIcL |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.gEmmrt, C33570myu.gEmmrt(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
    }
}

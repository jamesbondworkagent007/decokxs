package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rwy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43848rwy extends AbstractC43849rwz {
    public static final ViewDataBinding.IncludedLayouts KWHzl;
    public static final android.util.SparseIntArray gEmmrt;
    public final LinearLayoutCompat AhwBna;
    public long djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable rIB rib) {
        this.EZpvd = rib;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        KWHzl = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"layout_toolbar"}, new int[]{3}, new int[]{C43662rtX.TaskDescription.hCLrkq});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.getPostValueLengthLimit, 1);
        sparseIntArray.put(C43662rtX.ActionBar.DCUTEI, 2);
    }

    public C43848rwy(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, gEmmrt));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C43848rwy(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        java.lang.Object obj = objArr[2];
        C43961rzE c43961rzEOLrzqt = obj != null ? C43961rzE.OLrzqt((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[1];
        super(dataBindingComponent, view, 1, c43961rzEOLrzqt, obj2 != null ? C43963rzG.EZpvd((android.view.View) obj2) : null, (AbstractC43977rzU) objArr[3]);
        this.djBIcL = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AhwBna = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setContainedBinding(this.AEQbTJ);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 4L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.djBIcL != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43664rtZ.AEQbTJ != i) {
            return false;
        }
        KWHzl((rIB) obj);
        return true;
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
        return KWHzl((AbstractC43977rzU) obj, i2);
    }

    private boolean KWHzl(AbstractC43977rzU abstractC43977rzU, int i) {
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
        synchronized (this) {
            this.djBIcL = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}

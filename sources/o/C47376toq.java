package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.view.OKSortTextView;
import o.C47315tni;

/* JADX INFO: renamed from: o.toq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47376toq extends AbstractC47375top {
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public static final android.util.SparseIntArray valueOf;
    public long AYXKKw;
    public final android.widget.LinearLayout AhwBna;

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
        sparseIntArray.put(C47315tni.TaskDescription.getPostValueLengthLimit, 1);
        sparseIntArray.put(C47315tni.TaskDescription.gGvvIC, 2);
        sparseIntArray.put(C47315tni.TaskDescription.RIuxYh, 3);
        sparseIntArray.put(C47315tni.TaskDescription.DLWbHP, 4);
        sparseIntArray.put(C47315tni.TaskDescription.ODXsMY, 5);
    }

    public C47376toq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, gEmmrt, valueOf));
    }

    public C47376toq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKSortTextView) objArr[2], (C6989aZl) objArr[1], (android.widget.RelativeLayout) objArr[5], (RecyclerView) objArr[4], (C33546myW) objArr[3]);
        this.AYXKKw = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AhwBna = linearLayout;
        linearLayout.setTag(null);
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

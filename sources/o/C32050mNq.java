package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import o.C31976mKx;

/* JADX INFO: renamed from: o.mNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C32050mNq extends AbstractC32047mNn {
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout fetchVPNInfo;

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
        sparseIntArray.put(C31976mKx.Activity.fjfviF, 1);
        sparseIntArray.put(C31976mKx.Activity.gasjUx, 2);
        sparseIntArray.put(C31976mKx.Activity.UeEOUB, 3);
        sparseIntArray.put(C31976mKx.Activity.aKErDB, 4);
        sparseIntArray.put(C31976mKx.Activity.dNCPSb, 5);
        sparseIntArray.put(C31976mKx.Activity.RJOkX, 6);
        sparseIntArray.put(C31976mKx.Activity.QVAiDq, 7);
        sparseIntArray.put(C31976mKx.Activity.QKudOq, 8);
        sparseIntArray.put(C31976mKx.Activity.iZzfmt, 9);
        sparseIntArray.put(C31976mKx.Activity.gkJEwt, 10);
    }

    public C32050mNq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, values));
    }

    public C32050mNq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (TabLayout) objArr[6], (RecyclerView) objArr[7], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[8], (android.widget.TextView) objArr[1]);
        this.DbNXlk = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout;
        constraintLayout.setTag(null);
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

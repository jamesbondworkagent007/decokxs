package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rvH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43752rvH extends AbstractC43755rvK {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final android.widget.LinearLayout gEmmrt;
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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C43662rtX.ActionBar.zuBGHE, 1);
        sparseIntArray.put(C43662rtX.ActionBar.fcfzuX, 2);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKsuEgdN, 3);
        sparseIntArray.put(C43662rtX.ActionBar.getAdvertisingId, 4);
        sparseIntArray.put(C43662rtX.ActionBar.AxsJAYaxsJAY, 5);
    }

    public C43752rvH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, djBIcL, AYXKKw));
    }

    public C43752rvH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (C52794wYp) objArr[5], (android.widget.TextView) objArr[2], (AppCompatTextView) objArr[3], (android.widget.TextView) objArr[4]);
        this.valueOf = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
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

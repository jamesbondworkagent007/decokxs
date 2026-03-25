package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C10026bgg;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16830erN extends AbstractC16826erJ {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray copydefault;
    public final LinearLayoutCompat AYXKKw;
    public long OLrzqt;
    public final android.widget.TextView gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.aWJMta, 2);
    }

    public C16830erN(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 3, KWHzl, copydefault));
    }

    public C16830erN(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2]);
        this.OLrzqt = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AYXKKw = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[1];
        this.gEmmrt = textView;
        textView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.OLrzqt = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.OLrzqt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.valueOf != i) {
            return false;
        }
        KWHzl((C10026bgg.StateListAnimator) obj);
        return true;
    }

    public void KWHzl(@androidx.annotation.Nullable C10026bgg.StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator;
        synchronized (this) {
            this.OLrzqt |= 1;
        }
        notifyPropertyChanged(dTV.valueOf);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.OLrzqt;
            this.OLrzqt = 0L;
        }
        C10026bgg.StateListAnimator stateListAnimator = this.AEQbTJ;
        long j2 = j & 3;
        java.lang.String strKWHzl = (j2 == 0 || stateListAnimator == null) ? null : stateListAnimator.KWHzl();
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.gEmmrt, strKWHzl);
        }
    }
}

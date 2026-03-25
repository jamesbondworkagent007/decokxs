package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33937nLj extends AbstractC33936nLi {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray valueOf;
    public final android.widget.LinearLayout AYXKKw;
    public long djBIcL;
    public final android.widget.TextView gEmmrt;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        valueOf = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.GLcwwN, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.gCZUJG, 4);
    }

    public C33937nLj(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AEQbTJ, valueOf));
    }

    public C33937nLj(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[1]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[2];
        this.gEmmrt = textView;
        textView.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.AYXKKw != i) {
            return false;
        }
        OLrzqt((C37199opN) obj);
        return true;
    }

    @Override // o.AbstractC33936nLi
    public void OLrzqt(@androidx.annotation.Nullable C37199opN c37199opN) {
        this.KWHzl = c37199opN;
        synchronized (this) {
            this.djBIcL |= 1;
        }
        notifyPropertyChanged(C35342ntX.AYXKKw);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        android.text.SpannableString spannableStringCopydefault;
        java.lang.String strAEQbTJ;
        synchronized (this) {
            j = this.djBIcL;
            this.djBIcL = 0L;
        }
        C37199opN c37199opN = this.KWHzl;
        long j2 = j & 3;
        if (j2 != 0) {
            if (c37199opN != null) {
                spannableStringCopydefault = c37199opN.copydefault();
                strAEQbTJ = c37199opN.AEQbTJ();
            } else {
                spannableStringCopydefault = null;
                strAEQbTJ = null;
            }
            z = spannableStringCopydefault == null;
            if (j2 != 0) {
                j = z ? j | 8 : j | 4;
            }
        } else {
            spannableStringCopydefault = null;
            strAEQbTJ = null;
        }
        java.lang.String strEZpvd = ((j & 8) == 0 || c37199opN == null) ? null : c37199opN.EZpvd();
        long j3 = j & 3;
        android.text.SpannableString spannableString = j3 != 0 ? z ? strEZpvd : spannableStringCopydefault : null;
        if (j3 != 0) {
            TextViewBindingAdapter.setText(this.gEmmrt, spannableString);
            TextViewBindingAdapter.setText(this.EZpvd, strAEQbTJ);
        }
    }
}

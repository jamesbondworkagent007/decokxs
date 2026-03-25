package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nIA extends AbstractC33869nIw {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fJNWhG;
    public final android.widget.LinearLayout AuCTel;
    public long ejfBZ;

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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.zbGDDc, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.AxsJAY, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.DcMfJKgMxgjU, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.zMXLsR, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.DdI, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.Slwtri, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.QbewEr, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.QKVWgx, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.sCB, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.ONJgbh, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.putInt, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.DtnWsU, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.zUtmHU, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.finit, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.ddhgMB, 15);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUriFromString, 16);
    }

    public nIA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 17, fARcdN, fJNWhG));
    }

    public nIA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[2], (android.widget.ImageView) objArr[8], (android.widget.ImageView) objArr[7], (C52794wYp) objArr[14], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[3], (RecyclerView) objArr[11], (C55230xfy) objArr[10], (TabLayout) objArr[12], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (C55173xeu) objArr[15], (C55113xdn) objArr[16], (ViewPager2) objArr[13]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AuCTel = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}

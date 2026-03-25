package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16923etA extends AbstractC16924etB {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;

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
        sparseIntArray.put(C13754dXa.ActionBar.keySet, 10);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 11);
    }

    public C16923etA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View[] viewArr) {
        this(dataBindingComponent, viewArr, ViewDataBinding.mapBindings(dataBindingComponent, viewArr, 12, AkhnZx, values));
    }

    public C16923etA(DataBindingComponent dataBindingComponent, android.view.View[] viewArr, java.lang.Object[] objArr) {
        super(dataBindingComponent, viewArr[0], 0, (AppCompatImageView) objArr[11], (C14771drj) objArr[5], (C14764drc) objArr[2], (C55173xeu) objArr[8], (Group) objArr[7], (LottieAnimationView) objArr[9], (AppCompatTextView) objArr[10], (android.widget.LinearLayout) objArr[1], (C14771drj) objArr[6], (AppCompatTextView) objArr[0], (C14766dre) objArr[4], (C14772drk) objArr[3]);
        this.DbNXlk = -1L;
        this.KWHzl.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        this.AEQbTJ.setTag(null);
        this.djBIcL.setTag(null);
        this.AhwBna.setTag(null);
        this.AYXKKw.setTag(null);
        this.valueOf.setTag(null);
        this.isConnected.setTag(null);
        this.fetchVPNInfo.setTag(null);
        setRootTag(viewArr);
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

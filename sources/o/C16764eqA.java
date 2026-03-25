package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.airbnb.lottie.LottieAnimationView;
import o.C10026bgg;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16764eqA extends AbstractC16812eqw {
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout AkhnZx;
    public long values;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sCB, 4);
        sparseIntArray.put(C13754dXa.ActionBar.DsL, 5);
        sparseIntArray.put(C13754dXa.ActionBar.cancel, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aKhcqp, 7);
        sparseIntArray.put(C13754dXa.ActionBar.write, 8);
    }

    public C16764eqA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, isConnected));
    }

    public C16764eqA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C10324bmM) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[3], (C55251xgS) objArr[2], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[5], (LottieAnimationView) objArr[8]);
        this.values = -1L;
        this.OLrzqt.setTag(null);
        this.copydefault.setTag(null);
        this.AhwBna.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.AkhnZx != i) {
            return false;
        }
        AEQbTJ((C10026bgg.TaskDescription) obj);
        return true;
    }

    public void AEQbTJ(@androidx.annotation.Nullable C10026bgg.TaskDescription taskDescription) {
        this.gEmmrt = taskDescription;
        synchronized (this) {
            this.values |= 1;
        }
        notifyPropertyChanged(dTV.AkhnZx);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String str;
        java.lang.String strValueOf;
        java.lang.String strKWHzl;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        C10026bgg.TaskDescription taskDescription = this.gEmmrt;
        long j2 = j & 3;
        java.lang.String strEZpvd = null;
        if (j2 != 0) {
            if (taskDescription != null) {
                strEZpvd = taskDescription.EZpvd();
                strValueOf = taskDescription.valueOf();
                strKWHzl = taskDescription.KWHzl();
            } else {
                strKWHzl = null;
                strValueOf = null;
            }
            boolean zIsEmpty = android.text.TextUtils.isEmpty(strEZpvd);
            java.lang.String strKWHzl2 = C13821dZn.EZpvd.KWHzl(strKWHzl);
            if (j2 != 0) {
                j |= zIsEmpty ? 8L : 4L;
            }
            i = zIsEmpty ? 8 : 0;
            java.lang.String str2 = strEZpvd;
            strEZpvd = strKWHzl2;
            str = str2;
        } else {
            str = null;
            strValueOf = null;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, strEZpvd);
            TextViewBindingAdapter.setText(this.copydefault, str);
            this.copydefault.setVisibility(i);
            TextViewBindingAdapter.setText(this.AhwBna, strValueOf);
        }
    }
}

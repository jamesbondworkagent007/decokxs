package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.airbnb.lottie.LottieAnimationView;
import o.C10026bgg;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16824erH extends AbstractC16823erG {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray values;
    public long DbNXlk;
    public final ConstraintLayout isConnected;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        values = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.sCB, 4);
        sparseIntArray.put(C13754dXa.ActionBar.cancel, 5);
        sparseIntArray.put(C13754dXa.ActionBar.fcfzuX, 6);
        sparseIntArray.put(C13754dXa.ActionBar.aKhcqp, 7);
        sparseIntArray.put(C13754dXa.ActionBar.write, 8);
    }

    public C16824erH(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, AhwBna, values));
    }

    public C16824erH(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C10324bmM) objArr[7], (android.widget.TextView) objArr[5], (C55251xgS) objArr[3], (android.widget.ImageView) objArr[4], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[6], (LottieAnimationView) objArr[8]);
        this.DbNXlk = -1L;
        this.OLrzqt.setTag(null);
        this.KWHzl.setTag(null);
        this.AYXKKw.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.isConnected = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.AYXKKw != i) {
            return false;
        }
        AEQbTJ((C10026bgg.TaskDescription) obj);
        return true;
    }

    public void AEQbTJ(@androidx.annotation.Nullable C10026bgg.TaskDescription taskDescription) {
        this.gEmmrt = taskDescription;
        synchronized (this) {
            this.DbNXlk |= 1;
        }
        notifyPropertyChanged(dTV.AYXKKw);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String strIsConnected;
        java.lang.String strValueOf;
        synchronized (this) {
            j = this.DbNXlk;
            this.DbNXlk = 0L;
        }
        C10026bgg.TaskDescription taskDescription = this.gEmmrt;
        long j2 = j & 3;
        java.lang.String strEZpvd = null;
        int i = 0;
        if (j2 != 0) {
            if (taskDescription != null) {
                strEZpvd = taskDescription.EZpvd();
                strValueOf = taskDescription.valueOf();
                strIsConnected = taskDescription.isConnected();
            } else {
                strIsConnected = null;
                strValueOf = null;
            }
            boolean zIsEmpty = android.text.TextUtils.isEmpty(strEZpvd);
            if (j2 != 0) {
                j |= zIsEmpty ? 8L : 4L;
            }
            if (zIsEmpty) {
                i = 8;
            }
        } else {
            strIsConnected = null;
            strValueOf = null;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.OLrzqt, strEZpvd);
            this.OLrzqt.setVisibility(i);
            TextViewBindingAdapter.setText(this.KWHzl, strValueOf);
            TextViewBindingAdapter.setText(this.AYXKKw, strIsConnected);
        }
    }
}

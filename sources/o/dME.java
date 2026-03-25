package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.dapp.bean.DappSearchResultBean;
import o.dLX;

/* JADX INFO: loaded from: classes4.dex */
public class dME extends AbstractC13482dMz {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public long AYXKKw;
    public final ConstraintLayout valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(dLX.Application.gGvvIC, 3);
        sparseIntArray.put(dLX.Application.ORxRYg, 4);
    }

    public dME(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, gEmmrt, AhwBna));
    }

    public dME(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (wYC) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2]);
        this.AYXKKw = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.valueOf = constraintLayout;
        constraintLayout.setTag(null);
        this.KWHzl.setTag(null);
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AYXKKw = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dLZ.EZpvd != i) {
            return false;
        }
        OLrzqt((DappSearchResultBean) obj);
        return true;
    }

    public void OLrzqt(@androidx.annotation.Nullable DappSearchResultBean dappSearchResultBean) {
        this.copydefault = dappSearchResultBean;
        synchronized (this) {
            this.AYXKKw |= 1;
        }
        notifyPropertyChanged(dLZ.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        java.lang.String name;
        java.lang.String deepLink;
        synchronized (this) {
            j = this.AYXKKw;
            this.AYXKKw = 0L;
        }
        DappSearchResultBean dappSearchResultBean = this.copydefault;
        long j2 = j & 3;
        if (j2 == 0 || dappSearchResultBean == null) {
            name = null;
            deepLink = null;
        } else {
            name = dappSearchResultBean.getName();
            deepLink = dappSearchResultBean.getDeepLink();
        }
        if (j2 != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, name);
            TextViewBindingAdapter.setText(this.OLrzqt, deepLink);
        }
    }
}

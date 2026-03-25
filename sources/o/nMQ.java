package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKPayMessage;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public class nMQ extends nML {
    public static final android.util.SparseIntArray gEmmrt;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AhwBna;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable OKPayMessage oKPayMessage) {
        this.OLrzqt = oKPayMessage;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        gEmmrt = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.getUserContextRegisteredStatus, 1);
        sparseIntArray.put(C35399nuc.StateListAnimator.fzHEvu, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.TarCU, 3);
        sparseIntArray.put(C35399nuc.StateListAnimator.DztXDE, 4);
    }

    public nMQ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, valueOf, gEmmrt));
    }

    public nMQ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[3], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[4], (android.widget.LinearLayout) objArr[0], (android.widget.TextView) objArr[2]);
        this.AhwBna = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AhwBna != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        KWHzl((OKPayMessage) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}

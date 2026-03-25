package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.im.OKMessageContent;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33992nNk extends AbstractC33989nNh {
    public static final ViewDataBinding.IncludedLayouts EZpvd = null;
    public static final android.util.SparseIntArray KWHzl;
    public long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.Nullable OKMessageContent oKMessageContent) {
        this.copydefault = oKMessageContent;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        KWHzl = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.fRNHEq, 1);
    }

    public C33992nNk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, EZpvd, KWHzl));
    }

    public C33992nNk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.FrameLayout) objArr[0], (android.widget.TextView) objArr[1]);
        this.gEmmrt = -1L;
        this.OLrzqt.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.AEQbTJ != i) {
            return false;
        }
        AEQbTJ((OKMessageContent) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}

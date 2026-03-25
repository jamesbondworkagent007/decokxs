package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33947nLt extends AbstractC33946nLs {
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public static final android.util.SparseIntArray copydefault;
    public long AEQbTJ;
    public final android.widget.LinearLayout AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable IMenuItemPerformer iMenuItemPerformer) {
        this.EZpvd = iMenuItemPerformer;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        copydefault = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.iUnTnt, 1);
    }

    public C33947nLt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 2, KWHzl, copydefault));
    }

    public C33947nLt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[1]);
        this.AEQbTJ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AYXKKw = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AEQbTJ = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AEQbTJ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.djBIcL != i) {
            return false;
        }
        EZpvd((IMenuItemPerformer) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AEQbTJ = 0L;
        }
    }
}

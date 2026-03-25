package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindAccountListUIBean;
import o.C13754dXa;

/* JADX INFO: renamed from: o.erq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16859erq extends AbstractC16855erm {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public final ConstraintLayout djBIcL;
    public long gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@androidx.annotation.Nullable EscapeBindAccountListUIBean escapeBindAccountListUIBean) {
        this.KWHzl = escapeBindAccountListUIBean;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.zAGdSp, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onMenuItemSelected, 2);
        sparseIntArray.put(C13754dXa.ActionBar.OLrzqt, 3);
        sparseIntArray.put(C13754dXa.ActionBar.addOnMultiWindowModeChangedListener, 4);
    }

    public C16859erq(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, valueOf, AYXKKw));
    }

    public C16859erq(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C55251xgS) objArr[3], (AppCompatImageView) objArr[1], (AppCompatTextView) objArr[4], (AppCompatTextView) objArr[2]);
        this.gEmmrt = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
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
        if (dTV.isConnected != i) {
            return false;
        }
        AEQbTJ((EscapeBindAccountListUIBean) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}

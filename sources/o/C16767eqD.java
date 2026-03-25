package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.biz.net.bean.DappBTCXRCAssets;
import o.C13754dXa;

/* JADX INFO: renamed from: o.eqD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16767eqD extends AbstractC16766eqC {
    public static final ViewDataBinding.IncludedLayouts AEQbTJ = null;
    public static final android.util.SparseIntArray AhwBna;
    public final ConstraintLayout AYXKKw;
    public long valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@androidx.annotation.Nullable DappBTCXRCAssets dappBTCXRCAssets) {
        this.EZpvd = dappBTCXRCAssets;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AhwBna = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ibrGus, 1);
        sparseIntArray.put(C13754dXa.ActionBar.parseResult, 2);
        sparseIntArray.put(C13754dXa.ActionBar.AnyRes, 3);
    }

    public C16767eqD(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, AEQbTJ, AhwBna));
    }

    public C16767eqD(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (AppCompatImageView) objArr[1], (android.widget.TextView) objArr[2], (C55251xgS) objArr[3]);
        this.valueOf = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AYXKKw = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 2L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.valueOf != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.isConnected != i) {
            return false;
        }
        OLrzqt((DappBTCXRCAssets) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}

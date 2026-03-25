package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31556lwJ extends AbstractC31554lwH {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long fetchVPNInfo;
    public final android.widget.LinearLayout values;

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
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.iLAtSv, 1);
        sparseIntArray.put(C31351lsQ.Application.FQNKFG, 2);
        sparseIntArray.put(C31351lsQ.Application.aeJQwa, 3);
        sparseIntArray.put(C31351lsQ.Application.v, 4);
        sparseIntArray.put(C31351lsQ.Application.zEHIKV, 5);
        sparseIntArray.put(C31351lsQ.Application.DLGVGj, 6);
        sparseIntArray.put(C31351lsQ.Application.Th, 7);
        sparseIntArray.put(C31351lsQ.Application.clearRegistrations, 8);
        sparseIntArray.put(C31351lsQ.Application.fARcdN, 9);
        sparseIntArray.put(C31351lsQ.Application.AuCTel, 10);
    }

    public C31556lwJ(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 11, isConnected, AkhnZx));
    }

    public C31556lwJ(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKAlertBanner) objArr[9], (ComposeView) objArr[10], (mIW) objArr[6], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[2], (C55249xgQ) objArr[4], (AppCompatTextView) objArr[8], (AppCompatTextView) objArr[3], (androidx.appcompat.widget.Toolbar) objArr[1]);
        this.fetchVPNInfo = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fetchVPNInfo != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}

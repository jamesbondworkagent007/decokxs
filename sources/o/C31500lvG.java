package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31500lvG extends AbstractC31494lvA {
    public static final ViewDataBinding.IncludedLayouts AYXKKw = null;
    public static final android.util.SparseIntArray djBIcL;
    public long AhwBna;

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
        djBIcL = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 1);
        sparseIntArray.put(C31351lsQ.Application.DLGVGj, 2);
        sparseIntArray.put(C31351lsQ.Application.QKDJJA, 3);
        sparseIntArray.put(C31351lsQ.Application.DlmWDR, 4);
        sparseIntArray.put(C31351lsQ.Application.DxnCrt, 5);
    }

    public C31500lvG(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AYXKKw, djBIcL));
    }

    public C31500lvG(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (mIW) objArr[2], (OKAlertBanner) objArr[4], (ComposeView) objArr[5], (android.widget.LinearLayout) objArr[3], (android.widget.RelativeLayout) objArr[0], (AppCompatTextView) objArr[1]);
        this.AhwBna = -1L;
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AhwBna = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.AhwBna = 0L;
        }
    }
}

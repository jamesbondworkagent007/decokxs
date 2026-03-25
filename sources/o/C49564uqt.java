package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C49511upt;

/* JADX INFO: renamed from: o.uqt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49564uqt extends AbstractC49563uqs {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts isConnected = null;
    public long fARcdN;
    public final android.widget.RelativeLayout fIwbmz;

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
        sparseIntArray.put(C49511upt.Application.zOIQXb, 1);
        sparseIntArray.put(C49511upt.Application.zhUgOk, 2);
        sparseIntArray.put(C49511upt.Application.OuxcSI, 3);
        sparseIntArray.put(C49511upt.Application.iRxXKY, 4);
        sparseIntArray.put(C49511upt.Application.QfJbVf, 5);
        sparseIntArray.put(C49511upt.Application.ODWQjV, 6);
        sparseIntArray.put(C49511upt.Application.fZBcTu, 7);
        sparseIntArray.put(C49511upt.Application.zqTOFw, 8);
        sparseIntArray.put(C49511upt.Application.zuWLRA, 9);
        sparseIntArray.put(C49511upt.Application.flVtFt, 10);
        sparseIntArray.put(C49511upt.Application.DGUQLIDGUQLI, 11);
        sparseIntArray.put(C49511upt.Application.YqksP, 12);
        sparseIntArray.put(C49511upt.Application.fARcdN, 13);
    }

    public C49564uqt(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 14, isConnected, AkhnZx));
    }

    public C49564uqt(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[13], (wYK) objArr[7], (wYK) objArr[10], (wYK) objArr[4], (android.widget.LinearLayout) objArr[6], (android.widget.LinearLayout) objArr[9], (android.widget.LinearLayout) objArr[3], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[5]);
        this.fARcdN = -1L;
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) objArr[0];
        this.fIwbmz = relativeLayout;
        relativeLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fARcdN = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fARcdN != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fARcdN = 0L;
        }
    }
}

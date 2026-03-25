package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.buysell.ui.transaction.buysell.view.UnifiedOrderDetailBodyTwoStepInfoView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lxk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31609lxk extends AbstractC31606lxh {
    public static final ViewDataBinding.IncludedLayouts DCJXGO;
    public static final android.util.SparseIntArray DXXBbs;
    public final ConstraintLayout ffGIBT;
    public long getPostValueLengthLimit;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(74);
        DCJXGO = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_buy_sell_convert_info"}, new int[]{1}, new int[]{C31351lsQ.ActionBar.gwTjWJ});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DXXBbs = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.aVhqwO, 2);
        sparseIntArray.put(C31351lsQ.Application.HJWChPfrwjPh, 3);
        sparseIntArray.put(C31351lsQ.Application.gasjUx, 4);
        sparseIntArray.put(C31351lsQ.Application.isReflectionWorking, 5);
        sparseIntArray.put(C31351lsQ.Application.QMuEJi, 6);
        sparseIntArray.put(C31351lsQ.Application.hgxRZI, 7);
        sparseIntArray.put(C31351lsQ.Application.ULRxlR, 8);
        sparseIntArray.put(C31351lsQ.Application.aJFbMH, 9);
        sparseIntArray.put(C31351lsQ.Application.aHXSQp, 10);
        sparseIntArray.put(C31351lsQ.Application.gwwzsY, 11);
        sparseIntArray.put(C31351lsQ.Application.gCiISl, 12);
        sparseIntArray.put(C31351lsQ.Application.QhYuFg, 13);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDCKfqP, 14);
        sparseIntArray.put(C31351lsQ.Application.QzqeNH, 15);
        sparseIntArray.put(C31351lsQ.Application.cancel, 16);
        sparseIntArray.put(C31351lsQ.Application.invokespecialatDTRm, 17);
        sparseIntArray.put(C31351lsQ.Application.hpmliR, 18);
        sparseIntArray.put(C31351lsQ.Application.profile, 19);
        sparseIntArray.put(C31351lsQ.Application.fJk, 20);
        sparseIntArray.put(C31351lsQ.Application.OAjjVP, 21);
        sparseIntArray.put(C31351lsQ.Application.fupbxE, 22);
        sparseIntArray.put(C31351lsQ.Application.hfeTOA, 23);
        sparseIntArray.put(C31351lsQ.Application.iOIMNp, 24);
        sparseIntArray.put(C31351lsQ.Application.init, 25);
        sparseIntArray.put(C31351lsQ.Application.sanrWj, 26);
        sparseIntArray.put(C31351lsQ.Application.izFvvl, 27);
        sparseIntArray.put(C31351lsQ.Application.DMb, 28);
        sparseIntArray.put(C31351lsQ.Application.dYepVG, 29);
        sparseIntArray.put(C31351lsQ.Application.seuMaA, 30);
        sparseIntArray.put(C31351lsQ.Application.scanPackages, 31);
        sparseIntArray.put(C31351lsQ.Application.DGgkXd, 32);
        sparseIntArray.put(C31351lsQ.Application.DpxfQh, 33);
        sparseIntArray.put(C31351lsQ.Application.zpGcln, 34);
        sparseIntArray.put(C31351lsQ.Application.siEkQe, 35);
        sparseIntArray.put(C31351lsQ.Application.IYdWPz, 36);
        sparseIntArray.put(C31351lsQ.Application.invokespecialgBtXYZ, 37);
        sparseIntArray.put(C31351lsQ.Application.jFiva, 38);
        sparseIntArray.put(C31351lsQ.Application.hOMIpD, 39);
        sparseIntArray.put(C31351lsQ.Application.aBDePw, 40);
        sparseIntArray.put(C31351lsQ.Application.UscePu, 41);
        sparseIntArray.put(C31351lsQ.Application.invokespecialROgMPW, 42);
        sparseIntArray.put(C31351lsQ.Application.geAOna, 43);
        sparseIntArray.put(C31351lsQ.Application.sbu, 44);
        sparseIntArray.put(C31351lsQ.Application.znKlvJ, 45);
        sparseIntArray.put(C31351lsQ.Application.OFqMGB, 46);
        sparseIntArray.put(C31351lsQ.Application.gBtXYZ, 47);
        sparseIntArray.put(C31351lsQ.Application.isElapsedRealtimeNanosAvailable, 48);
        sparseIntArray.put(C31351lsQ.Application.flVtFt, 49);
        sparseIntArray.put(C31351lsQ.Application.dNxZaP, 50);
        sparseIntArray.put(C31351lsQ.Application.HJWChPdNQGVJ, 51);
        sparseIntArray.put(C31351lsQ.Application.dzkkkq, 52);
        sparseIntArray.put(C31351lsQ.Application.sEcTXd, 53);
        sparseIntArray.put(C31351lsQ.Application.DAIeex, 54);
        sparseIntArray.put(C31351lsQ.Application.DuR, 55);
        sparseIntArray.put(C31351lsQ.Application.HJWChPUUMfbK, 56);
        sparseIntArray.put(C31351lsQ.Application.icKaHr, 57);
        sparseIntArray.put(C31351lsQ.Application.FQMcgEfQMcgE, 58);
        sparseIntArray.put(C31351lsQ.Application.QjzqRB, 59);
        sparseIntArray.put(C31351lsQ.Application.fmB, 60);
        sparseIntArray.put(C31351lsQ.Application.adevsa, 61);
        sparseIntArray.put(C31351lsQ.Application.aWuQzD, 62);
        sparseIntArray.put(C31351lsQ.Application.onComplete, 63);
        sparseIntArray.put(C31351lsQ.Application.iMXFZQ, 64);
        sparseIntArray.put(C31351lsQ.Application.aWJMta, 65);
        sparseIntArray.put(C31351lsQ.Application.getFieldNames, 66);
        sparseIntArray.put(C31351lsQ.Application.uzCIH, 67);
        sparseIntArray.put(C31351lsQ.Application.iqeXgQ, 68);
        sparseIntArray.put(C31351lsQ.Application.RTWSvT, 69);
        sparseIntArray.put(C31351lsQ.Application.iwGUEr, 70);
        sparseIntArray.put(C31351lsQ.Application.ikIEnW, 71);
        sparseIntArray.put(C31351lsQ.Application.OqCbbx, 72);
        sparseIntArray.put(C31351lsQ.Application.RIKbBf, 73);
    }

    public C31609lxk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 74, DCJXGO, DXXBbs));
    }

    public C31609lxk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (ConstraintLayout) objArr[67], (ConstraintLayout) objArr[66], (android.widget.LinearLayout) objArr[70], (android.widget.LinearLayout) objArr[49], (android.widget.LinearLayout) objArr[4], (android.widget.LinearLayout) objArr[54], (ConstraintLayout) objArr[8], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[10], (android.widget.LinearLayout) objArr[41], (ConstraintLayout) objArr[5], (android.widget.ImageView) objArr[69], (android.widget.ImageView) objArr[42], (android.widget.ImageView) objArr[17], (android.widget.ImageView) objArr[37], (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[52], (ConstraintLayout) objArr[47], (ConstraintLayout) objArr[22], (AbstractC31607lxi) objArr[1], (ConstraintLayout) objArr[25], (ConstraintLayout) objArr[39], (ConstraintLayout) objArr[31], (ConstraintLayout) objArr[34], (ConstraintLayout) objArr[35], (ConstraintLayout) objArr[19], (ConstraintLayout) objArr[14], (ConstraintLayout) objArr[60], (ConstraintLayout) objArr[28], (ConstraintLayout) objArr[63], (ConstraintLayout) objArr[44], (android.widget.LinearLayout) objArr[16], (android.widget.TextView) objArr[58], (android.widget.ImageView) objArr[7], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[71], (android.widget.TextView) objArr[68], (android.widget.ImageView) objArr[55], (android.widget.ImageView) objArr[56], (android.widget.ImageView) objArr[50], (android.widget.TextView) objArr[51], (android.widget.TextView) objArr[48], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[24], (android.widget.TextView) objArr[23], (android.widget.TextView) objArr[27], (android.widget.TextView) objArr[26], (android.widget.TextView) objArr[40], (android.widget.TextView) objArr[43], (android.widget.TextView) objArr[72], (android.widget.TextView) objArr[33], (android.widget.TextView) objArr[32], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[65], (android.widget.TextView) objArr[64], (android.widget.TextView) objArr[57], (android.widget.TextView) objArr[53], (android.widget.TextView) objArr[38], (android.widget.TextView) objArr[36], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[18], (C57635ymD) objArr[62], (android.widget.TextView) objArr[61], (android.widget.TextView) objArr[30], (android.widget.TextView) objArr[29], (android.widget.TextView) objArr[46], (android.widget.TextView) objArr[45], (UnifiedOrderDetailBodyTwoStepInfoView) objArr[12], (android.view.View) objArr[13], (android.view.View) objArr[59], (android.view.View) objArr[73]);
        this.getPostValueLengthLimit = -1L;
        setContainedBinding(this.fIwbmz);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.ffGIBT = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getPostValueLengthLimit = 2L;
        }
        this.fIwbmz.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.getPostValueLengthLimit != 0) {
                return true;
            }
            return this.fIwbmz.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.fIwbmz.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return copydefault((AbstractC31607lxi) obj, i2);
    }

    public final boolean copydefault(AbstractC31607lxi abstractC31607lxi, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.getPostValueLengthLimit |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getPostValueLengthLimit = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.fIwbmz);
    }
}

package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31543lvx extends AbstractC31541lvv {
    public static final ViewDataBinding.IncludedLayouts DTwDnp;
    public static final android.util.SparseIntArray QOLQEE;
    public final ConstraintLayout QVAiDq;
    public long QbewEr;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(39);
        DTwDnp = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_recurring_buy_plan_tag"}, new int[]{3}, new int[]{C31351lsQ.ActionBar.OuxcSI});
        int i = C31351lsQ.ActionBar.ODWQjV;
        includedLayouts.setIncludes(2, new java.lang.String[]{"item_recurring_buy_plan_detail_pnl_block", "item_recurring_buy_plan_detail_pnl_block", "item_recurring_buy_plan_detail_pnl_block", "item_recurring_buy_plan_detail_pnl_block"}, new int[]{4, 5, 6, 7}, new int[]{i, i, i, i});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        QOLQEE = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.iLAtSv, 8);
        sparseIntArray.put(C31351lsQ.Application.getNewProxyInstance, 9);
        sparseIntArray.put(C31351lsQ.Application.zLAIeZ, 10);
        sparseIntArray.put(C31351lsQ.Application.QSLkRj, 11);
        sparseIntArray.put(C31351lsQ.Application.valueOf, 12);
        sparseIntArray.put(C31351lsQ.Application.drbYRJ, 13);
        sparseIntArray.put(C31351lsQ.Application.gwwfep, 14);
        sparseIntArray.put(C31351lsQ.Application.DbNXlk, 15);
        sparseIntArray.put(C31351lsQ.Application.fGQ, 16);
        sparseIntArray.put(C31351lsQ.Application.DKtBnz, 17);
        sparseIntArray.put(C31351lsQ.Application.aJZHYI, 18);
        sparseIntArray.put(C31351lsQ.Application.dbwnZN, 19);
        sparseIntArray.put(C31351lsQ.Application.ExKek, 20);
        sparseIntArray.put(C31351lsQ.Application.svhCHd, 21);
        sparseIntArray.put(C31351lsQ.Application.DuXjdv, 22);
        sparseIntArray.put(C31351lsQ.Application.fdt, 23);
        sparseIntArray.put(C31351lsQ.Application.FSMca, 24);
        sparseIntArray.put(C31351lsQ.Application.zvzmfz, 25);
        sparseIntArray.put(C31351lsQ.Application.gVEiQJ, 26);
        sparseIntArray.put(C31351lsQ.Application.gkZNMa, 27);
        sparseIntArray.put(C31351lsQ.Application.UfveVb, 28);
        sparseIntArray.put(C31351lsQ.Application.dPkBzA, 29);
        sparseIntArray.put(C31351lsQ.Application.OijiEz, 30);
        sparseIntArray.put(C31351lsQ.Application.hfdhUn, 31);
        sparseIntArray.put(C31351lsQ.Application.FQMcgE, 32);
        sparseIntArray.put(C31351lsQ.Application.dvKsVJ, 33);
        sparseIntArray.put(C31351lsQ.Application.AxsJAYsNCnLh, 34);
        sparseIntArray.put(C31351lsQ.Application.Dap, 35);
        sparseIntArray.put(C31351lsQ.Application.QiTXOm, 36);
        sparseIntArray.put(C31351lsQ.Application.gUEfcq, 37);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsuEgdN, 38);
    }

    public C31543lvx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 39, DTwDnp, QOLQEE));
    }

    public C31543lvx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 5, (OKAlertBanner) objArr[12], (C52794wYp) objArr[15], (AbstractC31584lwm) objArr[4], (android.widget.ImageView) objArr[9], (ConstraintLayout) objArr[33], (C52794wYp) objArr[34], (C33546myW) objArr[11], (AbstractC31584lwm) objArr[5], (C55173xeu) objArr[37], (android.widget.TextView) objArr[14], (mIW) objArr[17], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[10], (C55113xdn) objArr[38], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[19], (ConstraintLayout) objArr[27], (RecyclerView) objArr[32], (android.widget.TextView) objArr[28], (ConstraintLayout) objArr[29], (android.widget.ImageView) objArr[31], (android.widget.TextView) objArr[30], (C52794wYp) objArr[35], (AbstractC31560lwN) objArr[3], (android.widget.TextView) objArr[21], (mIW) objArr[24], (android.widget.ImageView) objArr[23], (android.widget.TextView) objArr[22], (AbstractC31584lwm) objArr[7], (ConstraintLayout) objArr[2], (android.view.View) objArr[26], (C52794wYp) objArr[36], (android.widget.ScrollView) objArr[13], (ConstraintLayout) objArr[1], (android.view.View) objArr[25], (androidx.appcompat.widget.Toolbar) objArr[8], (AbstractC31584lwm) objArr[6]);
        this.QbewEr = -1L;
        setContainedBinding(this.OLrzqt);
        setContainedBinding(this.valueOf);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.QVAiDq = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.iwGUEr);
        setContainedBinding(this.AubY);
        this.AxsJAY.setTag(null);
        this.zuBGHE.setTag(null);
        setContainedBinding(this.QKVWgx);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.QbewEr = 32L;
        }
        this.iwGUEr.invalidateAll();
        this.OLrzqt.invalidateAll();
        this.valueOf.invalidateAll();
        this.QKVWgx.invalidateAll();
        this.AubY.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.QbewEr != 0) {
                return true;
            }
            return this.iwGUEr.hasPendingBindings() || this.OLrzqt.hasPendingBindings() || this.valueOf.hasPendingBindings() || this.QKVWgx.hasPendingBindings() || this.AubY.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.iwGUEr.setLifecycleOwner(lifecycleOwner);
        this.OLrzqt.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
        this.QKVWgx.setLifecycleOwner(lifecycleOwner);
        this.AubY.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return copydefault((AbstractC31560lwN) obj, i2);
        }
        if (i == 1) {
            return AEQbTJ((AbstractC31584lwm) obj, i2);
        }
        if (i == 2) {
            return OLrzqt((AbstractC31584lwm) obj, i2);
        }
        if (i == 3) {
            return EZpvd((AbstractC31584lwm) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return KWHzl((AbstractC31584lwm) obj, i2);
    }

    public final boolean copydefault(AbstractC31560lwN abstractC31560lwN, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.QbewEr |= 1;
        }
        return true;
    }

    public final boolean AEQbTJ(AbstractC31584lwm abstractC31584lwm, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.QbewEr |= 2;
        }
        return true;
    }

    public final boolean OLrzqt(AbstractC31584lwm abstractC31584lwm, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.QbewEr |= 4;
        }
        return true;
    }

    public final boolean EZpvd(AbstractC31584lwm abstractC31584lwm, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.QbewEr |= 8;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC31584lwm abstractC31584lwm, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.QbewEr |= 16;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.QbewEr;
            this.QbewEr = 0L;
        }
        if ((j & 32) != 0) {
            ViewBindingAdapter.setPaddingTop(this.QVAiDq, C33570myu.gEmmrt(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.iwGUEr);
        ViewDataBinding.executeBindingsOn(this.OLrzqt);
        ViewDataBinding.executeBindingsOn(this.valueOf);
        ViewDataBinding.executeBindingsOn(this.QKVWgx);
        ViewDataBinding.executeBindingsOn(this.AubY);
    }
}

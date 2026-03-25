package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16523elY extends AbstractC16521elW {
    public static final ViewDataBinding.IncludedLayouts ORxRYg;
    public static final android.util.SparseIntArray OcIXYQ;
    public long QKVWgx;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC16521elW
    public void KWHzl(@androidx.annotation.Nullable C19465gDj c19465gDj) {
        this.fIwbmz = c19465gDj;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(36);
        ORxRYg = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"layout_investment_details", "layout_faq_section", "layout_usdg_rewards"}, new int[]{2, 3, 4}, new int[]{C13754dXa.TaskDescription.gLWkOL, C13754dXa.TaskDescription.HJWChPdNQGVJ, C13754dXa.TaskDescription.hpmliR});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        OcIXYQ = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.getVolumeAttributes, 5);
        sparseIntArray.put(C13754dXa.ActionBar.giSNqX, 6);
        sparseIntArray.put(C13754dXa.ActionBar.GQzpsZ, 7);
        sparseIntArray.put(C13754dXa.ActionBar.DzCpqu, 8);
        sparseIntArray.put(C13754dXa.ActionBar.getState, 9);
        sparseIntArray.put(C13754dXa.ActionBar.getErrorMessage, 10);
        sparseIntArray.put(C13754dXa.ActionBar.getCurrentPosition, 11);
        sparseIntArray.put(C13754dXa.ActionBar.getLabel, 12);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatCallback, 13);
        sparseIntArray.put(C13754dXa.ActionBar.onSessionReady, 14);
        sparseIntArray.put(C13754dXa.ActionBar.GravityInt, 15);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsStartIntentSenderForResult, 16);
        sparseIntArray.put(C13754dXa.ActionBar.ViewTreeFullyDrawnReporterOwnerfindViewTreeFullyDrawnReporterOwner1, 17);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcher2, 18);
        sparseIntArray.put(C13754dXa.ActionBar.hasAttributeId, 19);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsCreateDocument, 20);
        sparseIntArray.put(C13754dXa.ActionBar.zpGcln, 21);
        sparseIntArray.put(C13754dXa.ActionBar.addReporter, 22);
        sparseIntArray.put(C13754dXa.ActionBar.getQueueItem, 23);
        sparseIntArray.put(C13754dXa.ActionBar.m, 24);
        sparseIntArray.put(C13754dXa.ActionBar.OnBackPressedDispatcherApi33Impl, 25);
        sparseIntArray.put(C13754dXa.ActionBar.onActiveChanged, 26);
        sparseIntArray.put(C13754dXa.ActionBar.fRNHEq, 27);
        sparseIntArray.put(C13754dXa.ActionBar.DDNONI, 28);
        sparseIntArray.put(C13754dXa.ActionBar.OqFWZa, 29);
        sparseIntArray.put(C13754dXa.ActionBar.fromQueueItemList, 30);
        sparseIntArray.put(C13754dXa.ActionBar.DGOPHZDGOPHZ, 31);
        sparseIntArray.put(C13754dXa.ActionBar.jh, 32);
        sparseIntArray.put(C13754dXa.ActionBar.OhcwxsRkSIEV, 33);
        sparseIntArray.put(C13754dXa.ActionBar.onProviderEnabled, 34);
        sparseIntArray.put(C13754dXa.ActionBar.MenuRes, 35);
    }

    public C16523elY(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 36, ORxRYg, OcIXYQ));
    }

    public C16523elY(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 3, (OKAlertBanner) objArr[6], (AppBarLayout) objArr[1], (android.widget.ImageView) objArr[29], (android.view.View) objArr[31], (C21262gwT) objArr[12], (ConstraintLayout) objArr[21], (C14707dqY) objArr[32], (OKAlertBanner) objArr[7], (AbstractC17019eur) objArr[3], (C19394gAt) objArr[8], (AppCompatTextView) objArr[34], (C21321gxZ) objArr[33], (AbstractC16977euB) objArr[2], (AppCompatImageView) objArr[27], (android.widget.TextView) objArr[28], (ConstraintLayout) objArr[24], (android.widget.TextView) objArr[14], (C33603mza) objArr[5], (android.widget.TextView) objArr[13], (C33546myW) objArr[0], (Group) objArr[30], (android.widget.TextView) objArr[26], (C55251xgS) objArr[23], (AppCompatTextView) objArr[11], (AppCompatTextView) objArr[10], (AppCompatTextView) objArr[9], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[25], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[19], (RecyclerView) objArr[35], (AbstractC17052evX) objArr[4]);
        this.QKVWgx = -1L;
        this.KWHzl.setTag(null);
        setContainedBinding(this.AhwBna);
        setContainedBinding(this.AkhnZx);
        this.uzCIH.setTag(null);
        setContainedBinding(this.DTwDnp);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.QKVWgx = 16L;
        }
        this.AkhnZx.invalidateAll();
        this.AhwBna.invalidateAll();
        this.DTwDnp.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.QKVWgx != 0) {
                return true;
            }
            return this.AkhnZx.hasPendingBindings() || this.AhwBna.hasPendingBindings() || this.DTwDnp.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.fARcdN != i) {
            return false;
        }
        KWHzl((C19465gDj) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AkhnZx.setLifecycleOwner(lifecycleOwner);
        this.AhwBna.setLifecycleOwner(lifecycleOwner);
        this.DTwDnp.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((AbstractC16977euB) obj, i2);
        }
        if (i == 1) {
            return copydefault((AbstractC17019eur) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return KWHzl((AbstractC17052evX) obj, i2);
    }

    public final boolean OLrzqt(AbstractC16977euB abstractC16977euB, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.QKVWgx |= 1;
        }
        return true;
    }

    public final boolean copydefault(AbstractC17019eur abstractC17019eur, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.QKVWgx |= 2;
        }
        return true;
    }

    public final boolean KWHzl(AbstractC17052evX abstractC17052evX, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.QKVWgx |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.QKVWgx = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.AkhnZx);
        ViewDataBinding.executeBindingsOn(this.AhwBna);
        ViewDataBinding.executeBindingsOn(this.DTwDnp);
    }
}

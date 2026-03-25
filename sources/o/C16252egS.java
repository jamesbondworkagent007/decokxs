package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C13754dXa;

/* JADX INFO: renamed from: o.egS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16252egS extends AbstractC16250egQ {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts hDKMBd;
    public long iwGUEr;
    public final ConstraintLayout uzCIH;

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        return true;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(22);
        hDKMBd = includedLayouts;
        includedLayouts.setIncludes(0, new java.lang.String[]{"view_coin_detail_current_price"}, new int[]{2}, new int[]{C13754dXa.TaskDescription.OGitdB});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.setInternalConnectionCallback, 3);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi212, 4);
        sparseIntArray.put(C13754dXa.ActionBar.sCB, 5);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialRtjmuc, 6);
        sparseIntArray.put(C13754dXa.ActionBar.DsL, 7);
        sparseIntArray.put(C13754dXa.ActionBar.jNexW, 8);
        sparseIntArray.put(C13754dXa.ActionBar.hfFNez, 9);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKRKUgwx, 10);
        sparseIntArray.put(C13754dXa.ActionBar.rewind, 11);
        sparseIntArray.put(C13754dXa.ActionBar.vqBjd, 12);
        sparseIntArray.put(C13754dXa.ActionBar.DcMfJKDcMfJK, 13);
        sparseIntArray.put(C13754dXa.ActionBar.prepareFromMediaId, 14);
        sparseIntArray.put(C13754dXa.ActionBar.QVMIlxQVMIlx, 15);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatSessionFlags, 16);
        sparseIntArray.put(C13754dXa.ActionBar.MediaDescriptionCompatApi23, 17);
        sparseIntArray.put(C13754dXa.ActionBar.aPFruk, 18);
        sparseIntArray.put(C13754dXa.ActionBar.playFromMediaId, 19);
        sparseIntArray.put(C13754dXa.ActionBar.giSNqX, 20);
        sparseIntArray.put(C13754dXa.ActionBar.RestrictTo, 21);
    }

    public C16252egS(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, hDKMBd, getNewProxyInstance));
    }

    public C16252egS(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (OKAlertBanner) objArr[20], (AbstractC17124ewq) objArr[2], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[13], (android.widget.TextView) objArr[7], (C55251xgS) objArr[10], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[9], (android.widget.ImageView) objArr[12], (C54989xbV) objArr[18], (android.widget.ImageView) objArr[15], (ConstraintLayout) objArr[3], (android.widget.ImageView) objArr[4], (Group) objArr[17], (OKAlertBanner) objArr[19], (android.widget.ImageView) objArr[14], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[1], (C55244xgL) objArr[16], (ViewPager2) objArr[21]);
        this.iwGUEr = -1L;
        setContainedBinding(this.AEQbTJ);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.uzCIH = constraintLayout;
        constraintLayout.setTag(null);
        this.fARcdN.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 2L;
        }
        this.AEQbTJ.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.iwGUEr != 0) {
                return true;
            }
            return this.AEQbTJ.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.AEQbTJ.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return KWHzl((AbstractC17124ewq) obj, i2);
    }

    public final boolean KWHzl(AbstractC17124ewq abstractC17124ewq, int i) {
        if (i != dTV.EZpvd) {
            return false;
        }
        synchronized (this) {
            this.iwGUEr |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.iwGUEr;
            this.iwGUEr = 0L;
        }
        if ((j & 2) != 0) {
            ViewBindingAdapter.setPaddingTop(this.fARcdN, C33570myu.AEQbTJ(getRoot().getContext()));
        }
        ViewDataBinding.executeBindingsOn(this.AEQbTJ);
    }
}

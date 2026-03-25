package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ere, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16847ere extends AbstractC16845erc {
    public static final ViewDataBinding.IncludedLayouts DbNXlk = null;
    public static final android.util.SparseIntArray isConnected;
    public final ConstraintLayout fJNWhG;
    public long fetchVPNInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i) {
        this.OLrzqt = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(int i) {
        this.djBIcL = i;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        isConnected = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.getDisplayOptions, 7);
        sparseIntArray.put(C13754dXa.ActionBar.izFvvl, 8);
    }

    public C16847ere(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, DbNXlk, isConnected));
    }

    public C16847ere(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[6], (Guideline) objArr[8], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3], (AppCompatImageView) objArr[7], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5]);
        this.fetchVPNInfo = -1L;
        this.KWHzl.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fJNWhG = constraintLayout;
        constraintLayout.setTag(null);
        this.valueOf.setTag(null);
        this.AYXKKw.setTag(null);
        this.AhwBna.setTag(null);
        this.AkhnZx.setTag(null);
        this.values.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 16L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.fJNWhG == i) {
            copydefault(((java.lang.Integer) obj).intValue());
        } else if (dTV.values == i) {
            KWHzl((java.lang.Boolean) obj);
        } else if (dTV.gEmmrt == i) {
            OLrzqt((C10219bkN) obj);
        } else {
            if (dTV.copydefault != i) {
                return false;
            }
            KWHzl(((java.lang.Integer) obj).intValue());
        }
        return true;
    }

    @Override // o.AbstractC16845erc
    public void KWHzl(@androidx.annotation.Nullable java.lang.Boolean bool) {
        this.copydefault = bool;
        synchronized (this) {
            this.fetchVPNInfo |= 2;
        }
        notifyPropertyChanged(dTV.values);
        super.requestRebind();
    }

    @Override // o.AbstractC16845erc
    public void OLrzqt(@androidx.annotation.Nullable C10219bkN c10219bkN) {
        this.AEQbTJ = c10219bkN;
        synchronized (this) {
            this.fetchVPNInfo |= 4;
        }
        notifyPropertyChanged(dTV.gEmmrt);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        int i;
        int i2;
        java.lang.String str;
        java.lang.String str2;
        java.lang.CharSequence charSequence;
        int i3;
        int iOLrzqt;
        java.lang.String strCopydefault;
        java.lang.String str3;
        java.lang.CharSequence charSequenceGEmmrt;
        synchronized (this) {
            j = this.fetchVPNInfo;
            this.fetchVPNInfo = 0L;
        }
        java.lang.Boolean bool = this.copydefault;
        C10219bkN c10219bkN = this.AEQbTJ;
        boolean zSafeUnbox = (j & 18) != 0 ? ViewDataBinding.safeUnbox(bool) : false;
        long j2 = j & 20;
        java.lang.String str4 = null;
        if (j2 != 0) {
            if (c10219bkN != null) {
                java.lang.String strKWHzl = c10219bkN.KWHzl();
                int iValueOf = c10219bkN.valueOf();
                java.lang.String strEZpvd = c10219bkN.EZpvd();
                charSequenceGEmmrt = c10219bkN.gEmmrt();
                iOLrzqt = c10219bkN.OLrzqt();
                strCopydefault = c10219bkN.copydefault();
                str3 = strKWHzl;
                str4 = strEZpvd;
                i3 = iValueOf;
            } else {
                i3 = 0;
                iOLrzqt = 0;
                strCopydefault = null;
                str3 = null;
                charSequenceGEmmrt = null;
            }
            boolean z = str4 == null;
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            str = str4;
            str4 = str3;
            i2 = iOLrzqt;
            str2 = strCopydefault;
            i = z ? 8 : 0;
            i = i3;
            charSequence = charSequenceGEmmrt;
        } else {
            i = 0;
            i2 = 0;
            str = null;
            str2 = null;
            charSequence = null;
        }
        if ((20 & j) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str4);
            TextViewBindingAdapter.setText(this.valueOf, str2);
            this.AYXKKw.setText(i);
            TextViewBindingAdapter.setText(this.AhwBna, charSequence);
            TextViewBindingAdapter.setText(this.AkhnZx, str);
            this.AkhnZx.setVisibility(i);
            this.values.setText(i2);
        }
        if ((j & 18) != 0) {
            C33090mpr.EZpvd(this.fJNWhG, zSafeUnbox);
        }
    }
}

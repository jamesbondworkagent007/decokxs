package o;

import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.mDC;

/* JADX INFO: loaded from: classes8.dex */
public class mFK extends mFM {
    public static final android.util.SparseIntArray AYXKKw = null;
    public static final ViewDataBinding.IncludedLayouts KWHzl = null;
    public final ConstraintLayout gEmmrt;
    public long valueOf;

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    public mFK(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 4, KWHzl, AYXKKw));
    }

    public mFK(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C57682ymy) objArr[3], (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[2]);
        this.valueOf = -1L;
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.gEmmrt = constraintLayout;
        constraintLayout.setTag(null);
        this.copydefault.setTag(null);
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
        if (mDB.EZpvd != i) {
            return false;
        }
        copydefault((C31942mJq) obj);
        return true;
    }

    public void copydefault(@androidx.annotation.Nullable C31942mJq c31942mJq) {
        this.AEQbTJ = c31942mJq;
        synchronized (this) {
            this.valueOf |= 1;
        }
        notifyPropertyChanged(mDB.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        android.graphics.drawable.Drawable drawable;
        java.lang.String strEZpvd;
        boolean zKWHzl;
        android.graphics.drawable.Drawable drawableOLrzqt;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        C31942mJq c31942mJq = this.AEQbTJ;
        long j2 = j & 3;
        if (j2 != 0) {
            if (c31942mJq != null) {
                strEZpvd = c31942mJq.EZpvd();
                drawableOLrzqt = c31942mJq.OLrzqt();
                zKWHzl = c31942mJq.KWHzl();
            } else {
                zKWHzl = false;
                strEZpvd = null;
                drawableOLrzqt = null;
            }
            if (j2 != 0) {
                j |= zKWHzl ? 40L : 20L;
            }
            i = zKWHzl ? 0 : 8;
            drawable = zKWHzl ? AppCompatResources.getDrawable(this.gEmmrt.getContext(), mDC.StateListAnimator.KWHzl) : null;
            drawable = drawableOLrzqt;
        } else {
            drawable = null;
            strEZpvd = null;
        }
        if ((j & 3) != 0) {
            this.OLrzqt.setVisibility(i);
            ImageViewBindingAdapter.setImageDrawable(this.EZpvd, drawable);
            ViewBindingAdapter.setBackground(this.gEmmrt, drawable);
            TextViewBindingAdapter.setText(this.copydefault, strEZpvd);
        }
    }
}

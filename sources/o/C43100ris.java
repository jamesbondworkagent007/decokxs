package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import com.okinc.resource.request.MlnUpdateResp;
import o.C43084ric;

/* JADX INFO: renamed from: o.ris, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43100ris extends AbstractC43096rio {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public final ConstraintLayout djBIcL;
    public long valueOf;

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C43084ric.TaskDescription.AkhnZx, 4);
    }

    public C43100ris(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 5, AhwBna, AYXKKw));
    }

    public C43100ris(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 1, (android.view.View) objArr[4], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[2], (android.widget.ImageView) objArr[1]);
        this.valueOf = -1L;
        this.KWHzl.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.djBIcL = constraintLayout;
        constraintLayout.setTag(null);
        this.OLrzqt.setTag(null);
        this.EZpvd.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 4L;
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
        if (C43024rhV.EZpvd != i) {
            return false;
        }
        copydefault((C43155rju) obj);
        return true;
    }

    @Override // o.AbstractC43096rio
    public void copydefault(@androidx.annotation.Nullable C43155rju c43155rju) {
        this.AEQbTJ = c43155rju;
        synchronized (this) {
            this.valueOf |= 2;
        }
        notifyPropertyChanged(C43024rhV.EZpvd);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return EZpvd((MutableLiveData) obj, i2);
    }

    public final boolean EZpvd(MutableLiveData<java.lang.Boolean> mutableLiveData, int i) {
        if (i != C43024rhV.OLrzqt) {
            return false;
        }
        synchronized (this) {
            this.valueOf |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        java.lang.String name;
        java.lang.String md5;
        synchronized (this) {
            j = this.valueOf;
            this.valueOf = 0L;
        }
        C43155rju c43155rju = this.AEQbTJ;
        long j2 = j & 7;
        java.lang.String str = null;
        if (j2 == 0) {
            name = null;
        } else if ((j & 6) != 0) {
            MlnUpdateResp mlnUpdateRespEZpvd = c43155rju != null ? c43155rju.EZpvd() : null;
            if (mlnUpdateRespEZpvd != null) {
                name = mlnUpdateRespEZpvd.getName();
                md5 = mlnUpdateRespEZpvd.getMd5();
            }
            if (c43155rju == null) {
            }
            updateLiveDataRegistration(0, mutableLiveDataOLrzqt);
            boolean zSafeUnbox = ViewDataBinding.safeUnbox(mutableLiveDataOLrzqt != null ? mutableLiveDataOLrzqt.getValue() : null);
            if (j2 != 0) {
            }
            if (zSafeUnbox) {
            }
            str = md5;
        } else {
            md5 = null;
            name = null;
            MutableLiveData<java.lang.Boolean> mutableLiveDataOLrzqt = c43155rju == null ? c43155rju.OLrzqt() : null;
            updateLiveDataRegistration(0, mutableLiveDataOLrzqt);
            boolean zSafeUnbox2 = ViewDataBinding.safeUnbox(mutableLiveDataOLrzqt != null ? mutableLiveDataOLrzqt.getValue() : null);
            if (j2 != 0) {
                j |= zSafeUnbox2 ? 16L : 8L;
            }
            i = zSafeUnbox2 ? 0 : 4;
            str = md5;
        }
        if ((j & 6) != 0) {
            TextViewBindingAdapter.setText(this.KWHzl, str);
            TextViewBindingAdapter.setText(this.OLrzqt, name);
        }
        if ((j & 7) != 0) {
            this.EZpvd.setVisibility(i);
        }
    }
}

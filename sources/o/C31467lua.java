package o;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.airbnb.lottie.LottieAnimationView;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31467lua extends AbstractC31410ltW {
    public static final android.util.SparseIntArray AkhnZx;
    public static final ViewDataBinding.IncludedLayouts values;
    public final ConstraintLayout fARcdN;
    public Application fJNWhG;
    public long isConnected;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        values = includedLayouts;
        includedLayouts.setIncludes(6, new java.lang.String[]{"layout_buy_sell_footer"}, new int[]{7}, new int[]{C31351lsQ.ActionBar.OqFWZa});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AkhnZx = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.gbIfDn, 8);
        sparseIntArray.put(C31351lsQ.Application.zeUYeG, 9);
        sparseIntArray.put(C31351lsQ.Application.DwQSDd, 10);
        sparseIntArray.put(C31351lsQ.Application.aQtmcU, 11);
    }

    public C31467lua(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, values, AkhnZx));
    }

    public C31467lua(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 6, (android.widget.ImageView) objArr[2], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[6], (LottieAnimationView) objArr[10], (android.widget.ScrollView) objArr[8], (android.widget.TextView) objArr[11], (AbstractC31595lwx) objArr[7], (ConstraintLayout) objArr[9], (android.widget.TextView) objArr[5], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[3]);
        this.isConnected = -1L;
        this.AEQbTJ.setTag(null);
        this.copydefault.setTag(null);
        this.EZpvd.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fARcdN = constraintLayout;
        constraintLayout.setTag(null);
        setContainedBinding(this.djBIcL);
        this.AYXKKw.setTag(null);
        this.fetchVPNInfo.setTag(null);
        this.DbNXlk.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 128L;
        }
        this.djBIcL.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.isConnected != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C31350lsP.AEQbTJ != i) {
            return false;
        }
        copydefault((lSO) obj);
        return true;
    }

    @Override // o.AbstractC31410ltW
    public void copydefault(@androidx.annotation.Nullable lSO lso) {
        this.KWHzl = lso;
        synchronized (this) {
            this.isConnected |= 64;
        }
        notifyPropertyChanged(C31350lsP.AEQbTJ);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i == 0) {
            return OLrzqt((LiveData) obj, i2);
        }
        if (i == 1) {
            return AEQbTJ((LiveData) obj, i2);
        }
        if (i == 2) {
            return KWHzl((LiveData) obj, i2);
        }
        if (i == 3) {
            return EZpvd((LiveData) obj, i2);
        }
        if (i == 4) {
            return copydefault((LiveData<java.lang.String>) obj, i2);
        }
        if (i != 5) {
            return false;
        }
        return copydefault((AbstractC31595lwx) obj, i2);
    }

    private boolean OLrzqt(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 1;
        }
        return true;
    }

    private boolean AEQbTJ(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 2;
        }
        return true;
    }

    private boolean KWHzl(LiveData<java.lang.Boolean> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 4;
        }
        return true;
    }

    private boolean EZpvd(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 8;
        }
        return true;
    }

    private boolean copydefault(LiveData<java.lang.String> liveData, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 16;
        }
        return true;
    }

    private boolean copydefault(AbstractC31595lwx abstractC31595lwx, int i) {
        if (i != C31350lsP.copydefault) {
            return false;
        }
        synchronized (this) {
            this.isConnected |= 32;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[PHI: r2
  0x0050: PHI (r2v3 long) = (r2v0 long), (r2v9 long) binds: [B:9:0x0022, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e A[PHI: r2
  0x009e: PHI (r2v5 long) = (r2v4 long), (r2v7 long) binds: [B:37:0x0072, B:51:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void executeBindings() {
        long j;
        java.lang.String value;
        int i;
        int i2;
        Application applicationOLrzqt;
        java.lang.String str;
        java.lang.String value2;
        java.lang.String value3;
        long j2;
        int i3;
        synchronized (this) {
            j = this.isConnected;
            this.isConnected = 0L;
        }
        lSO lso = this.KWHzl;
        if ((223 & j) != 0) {
            long j3 = j & 193;
            if (j3 == 0) {
                i = 0;
                if ((j & 194) == 0) {
                    value3 = null;
                    j2 = j & 196;
                    if (j2 == 0) {
                        i3 = 0;
                        if ((j & 192) != 0 || lso == null) {
                            applicationOLrzqt = null;
                        } else {
                            Application application = this.fJNWhG;
                            if (application == null) {
                                application = new Application();
                                this.fJNWhG = application;
                            }
                            applicationOLrzqt = application.OLrzqt(lso);
                        }
                        if ((j & 200) == 0) {
                            value2 = null;
                            if ((j & 208) == 0) {
                                value = null;
                                str = value3;
                                i2 = i3;
                            } else {
                                LiveData<java.lang.String> liveDataOLrzqt = lso != null ? lso.OLrzqt() : null;
                                updateLiveDataRegistration(4, liveDataOLrzqt);
                                if (liveDataOLrzqt != null) {
                                    value = liveDataOLrzqt.getValue();
                                }
                                str = value3;
                                i2 = i3;
                            }
                        } else {
                            LiveData<java.lang.String> liveDataEZpvd = lso != null ? lso.EZpvd() : null;
                            updateLiveDataRegistration(3, liveDataEZpvd);
                            if (liveDataEZpvd != null) {
                                value2 = liveDataEZpvd.getValue();
                            }
                            if ((j & 208) == 0) {
                            }
                        }
                    } else {
                        LiveData<java.lang.Boolean> liveDataCopydefault = lso != null ? lso.copydefault() : null;
                        updateLiveDataRegistration(2, liveDataCopydefault);
                        boolean zSafeUnbox = ViewDataBinding.safeUnbox(liveDataCopydefault != null ? liveDataCopydefault.getValue() : null);
                        if (j2 != 0) {
                            j |= zSafeUnbox ? PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH : 1024L;
                        }
                        if (!zSafeUnbox) {
                            i3 = 4;
                        }
                        if ((j & 192) != 0) {
                            applicationOLrzqt = null;
                            if ((j & 200) == 0) {
                            }
                        }
                    }
                } else {
                    LiveData<java.lang.String> liveDataKWHzl = lso != null ? lso.KWHzl() : null;
                    updateLiveDataRegistration(1, liveDataKWHzl);
                    if (liveDataKWHzl != null) {
                        value3 = liveDataKWHzl.getValue();
                    }
                    j2 = j & 196;
                    if (j2 == 0) {
                    }
                }
            } else {
                LiveData<java.lang.Boolean> liveDataAEQbTJ = lso != null ? lso.AEQbTJ() : null;
                updateLiveDataRegistration(0, liveDataAEQbTJ);
                boolean zSafeUnbox2 = ViewDataBinding.safeUnbox(liveDataAEQbTJ != null ? liveDataAEQbTJ.getValue() : null);
                if (j3 != 0) {
                    j |= zSafeUnbox2 ? 512L : 256L;
                }
                if (!zSafeUnbox2) {
                    i = 8;
                }
                if ((j & 194) == 0) {
                }
            }
        } else {
            value = null;
            i = 0;
            i2 = 0;
            applicationOLrzqt = null;
            str = null;
            value2 = null;
        }
        if ((j & 192) != 0) {
            C31913mIo.AEQbTJ(this.AEQbTJ, applicationOLrzqt);
        }
        if ((196 & j) != 0) {
            this.AEQbTJ.setVisibility(i2);
        }
        if ((128 & j) != 0) {
            ViewBindingAdapter.setPaddingTop(this.copydefault, C33570myu.gEmmrt(getRoot().getContext()));
        }
        if ((208 & j) != 0) {
            TextViewBindingAdapter.setText(this.AYXKKw, value);
        }
        if ((194 & j) != 0) {
            TextViewBindingAdapter.setText(this.fetchVPNInfo, str);
        }
        if ((j & 193) != 0) {
            this.fetchVPNInfo.setVisibility(i);
        }
        if ((j & 200) != 0) {
            TextViewBindingAdapter.setText(this.DbNXlk, value2);
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
    }

    /* JADX INFO: renamed from: o.lua$Application */
    public static class Application implements View.OnClickListener {
        public lSO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application OLrzqt(lSO lso) {
            this.copydefault = lso;
            if (lso == null) {
                return null;
            }
            return this;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            this.copydefault.EZpvd(view);
        }
    }
}

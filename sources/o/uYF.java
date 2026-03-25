package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.edit.OKEditText;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uYF extends uYD {
    public static final ViewDataBinding.IncludedLayouts getNewProxyInstance = null;
    public static final android.util.SparseIntArray hDKMBd;
    public final android.widget.LinearLayout getFieldNames;
    public long iwGUEr;

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
        hDKMBd = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.apAOXX, 1);
        sparseIntArray.put(C48033uCm.Application.removeReporter, 2);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsGetMultipleContentsCompanion, 3);
        sparseIntArray.put(C48033uCm.Application.BackHandlerKt, 4);
        sparseIntArray.put(C48033uCm.Application.ViewTreeOnBackPressedDispatcherOwnerfindViewTreeOnBackPressedDispatcherOwner1, 5);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatMediaControllerImpl, 6);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatCallbackStubApi21, 7);
        sparseIntArray.put(C48033uCm.Application.MediaControllerCompatCallbackStubCompat, 8);
        sparseIntArray.put(C48033uCm.Application.rememberLauncherForActivityResult, 9);
        sparseIntArray.put(C48033uCm.Application.ActivityComposeUtilsKt, 10);
        sparseIntArray.put(C48033uCm.Application.HJWChPUUMfbK, 11);
        sparseIntArray.put(C48033uCm.Application.updateBackInvokedCallbackStateactivity_release, 12);
        sparseIntArray.put(C48033uCm.Application.canTextInput, 13);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleHoneycombSetIndicatorInfo, 14);
        sparseIntArray.put(C48033uCm.Application.show, 15);
        sparseIntArray.put(C48033uCm.Application.RihMUf, 16);
        sparseIntArray.put(C48033uCm.Application.QMuEJi, 17);
        sparseIntArray.put(C48033uCm.Application.IResultReceiver2, 18);
        sparseIntArray.put(C48033uCm.Application.postOrRun, 19);
        sparseIntArray.put(C48033uCm.Application.onRepeatModeChanged, 20);
        sparseIntArray.put(C48033uCm.Application.GiPPlLQAswws, 21);
    }

    public uYF(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, getNewProxyInstance, hDKMBd));
    }

    public uYF(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[1], (android.widget.TextView) objArr[16], (C51779vtU) objArr[17], (C52794wYp) objArr[21], (android.widget.TextView) objArr[11], (C50191vFg) objArr[19], (C47988uAv) objArr[20], (android.widget.TextView) objArr[8], (android.widget.LinearLayout) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[18], (NestedScrollView) objArr[2], (android.widget.TextView) objArr[12], (OKEditText) objArr[10], (OKEditText) objArr[5], (android.widget.TextView) objArr[9], (android.widget.TextView) objArr[4], (OKAlertBanner) objArr[3], (C51784vtZ) objArr[15], (android.widget.TextView) objArr[14], (android.widget.FrameLayout) objArr[13]);
        this.iwGUEr = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.getFieldNames = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.iwGUEr = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.iwGUEr != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.iwGUEr = 0L;
        }
    }
}

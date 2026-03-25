package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48308uMr extends AbstractC48304uMn {
    public static final ViewDataBinding.IncludedLayouts ORxRYg = null;
    public static final android.util.SparseIntArray OcIXYQ;
    public long QUSxYX;
    public final ConstraintLayout QbewEr;

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
        OcIXYQ = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.onExtraCallback, 4);
        sparseIntArray.put(C48033uCm.Application.OCdtug, 5);
        sparseIntArray.put(C48033uCm.Application.ComponentActivity1, 6);
        sparseIntArray.put(C48033uCm.Application.ActivityResultCaller, 7);
        sparseIntArray.put(C48033uCm.Application.validateSHA256, 8);
        sparseIntArray.put(C48033uCm.Application.QWpYiD, 9);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatApi23, 10);
        sparseIntArray.put(C48033uCm.Application.getServiceComponent, 11);
        sparseIntArray.put(C48033uCm.Application.createMultiAutoCompleteTextView, 12);
        sparseIntArray.put(C48033uCm.Application.ActionBarTabListener, 13);
        sparseIntArray.put(C48033uCm.Application.setCustomTitle, 14);
        sparseIntArray.put(C48033uCm.Application.bindView, 15);
        sparseIntArray.put(C48033uCm.Application.RSDDiY, 16);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatApi21Builder, 17);
        sparseIntArray.put(C48033uCm.Application.createEditText, 18);
        sparseIntArray.put(C48033uCm.Application.fdt, 19);
        sparseIntArray.put(C48033uCm.Application.createImageButton, 20);
        sparseIntArray.put(C48033uCm.Application.DKr, 21);
        sparseIntArray.put(C48033uCm.Application.QXDzTk, 22);
        sparseIntArray.put(C48033uCm.Application.ActionBarDisplayOptions, 23);
        sparseIntArray.put(C48033uCm.Application.UscePu, 24);
        sparseIntArray.put(C48033uCm.Application.getTitle, 25);
        sparseIntArray.put(C48033uCm.Application.build, 26);
        sparseIntArray.put(C48033uCm.Application.initializePanelMenu, 27);
        sparseIntArray.put(C48033uCm.Application.MediaDescriptionCompatBuilder, 28);
        sparseIntArray.put(C48033uCm.Application.getLocalNightMode, 29);
        sparseIntArray.put(C48033uCm.Application.isActivityManifestHandlingUiMode, 30);
        sparseIntArray.put(C48033uCm.Application.IResultReceiver, 31);
        sparseIntArray.put(C48033uCm.Application.cancelNotification, 32);
        sparseIntArray.put(C48033uCm.Application.onNothingSelected, 33);
        sparseIntArray.put(C48033uCm.Application.PipHintTrackerKttrackPipAnimationHintView2, 34);
        sparseIntArray.put(C48033uCm.Application.access100, 35);
        sparseIntArray.put(C48033uCm.Application.getIconUri, 36);
        sparseIntArray.put(C48033uCm.Application.profile, 37);
        sparseIntArray.put(C48033uCm.Application.getShuffleMode, 38);
    }

    public C48308uMr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 39, ORxRYg, OcIXYQ));
    }

    public C48308uMr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[22], (Barrier) objArr[24], (Flow) objArr[16], (C52794wYp) objArr[37], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[3], (C51601vqB) objArr[19], (C55173xeu) objArr[5], (android.widget.ImageView) objArr[8], (android.widget.FrameLayout) objArr[21], (android.widget.ImageView) objArr[32], (android.widget.ImageView) objArr[4], (android.widget.ImageView) objArr[35], (android.widget.ImageView) objArr[11], (android.widget.LinearLayout) objArr[36], (android.widget.LinearLayout) objArr[0], (android.widget.LinearLayout) objArr[28], (android.widget.LinearLayout) objArr[25], (android.widget.LinearLayout) objArr[26], (android.widget.LinearLayout) objArr[17], (android.widget.LinearLayout) objArr[10], (android.view.View) objArr[38], (RecyclerView) objArr[31], (android.widget.RelativeLayout) objArr[6], (android.widget.ImageView) objArr[34], (C51294vkM) objArr[7], (AppCompatTextView) objArr[23], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[29], (android.widget.TextView) objArr[30], (android.widget.TextView) objArr[27], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[20], (android.widget.TextView) objArr[18], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[33]);
        this.QUSxYX = -1L;
        this.OLrzqt.setTag(null);
        this.gEmmrt.setTag(null);
        this.fARcdN.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[2];
        this.QbewEr = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.QUSxYX = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.QUSxYX != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.QUSxYX;
            this.QUSxYX = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.OLrzqt, C33570myu.gEmmrt(getRoot().getContext()));
            ViewBindingAdapter.setPaddingTop(this.gEmmrt, C33570myu.gEmmrt(getRoot().getContext()));
            ViewBindingAdapter.setPaddingTop(this.QbewEr, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}

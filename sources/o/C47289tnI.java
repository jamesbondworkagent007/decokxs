package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.okex.center.view.TransformableFloatingUnReadMsgActionButton;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47289tnI extends AbstractC47283tnC {
    public static final ViewDataBinding.IncludedLayouts fARcdN = null;
    public static final android.util.SparseIntArray fIwbmz;
    public long ejfBZ;
    public final android.widget.LinearLayout uzCIH;

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
        fIwbmz = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.fVjYLc, 1);
        sparseIntArray.put(C47315tni.TaskDescription.AhwBna, 2);
        sparseIntArray.put(C47315tni.TaskDescription.UrRBLY, 3);
        sparseIntArray.put(C47315tni.TaskDescription.gEmmrt, 4);
        sparseIntArray.put(C47315tni.TaskDescription.KWHzl, 5);
        sparseIntArray.put(C47315tni.TaskDescription.valueOf, 6);
        sparseIntArray.put(C47315tni.TaskDescription.djBIcL, 7);
        sparseIntArray.put(C47315tni.TaskDescription.AEQbTJ, 8);
        sparseIntArray.put(C47315tni.TaskDescription.OLrzqt, 9);
        sparseIntArray.put(C47315tni.TaskDescription.aKErDB, 10);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKsfEqpH, 11);
        sparseIntArray.put(C47315tni.TaskDescription.fXYAwm, 12);
        sparseIntArray.put(C47315tni.TaskDescription.getSessionID, 13);
        sparseIntArray.put(C47315tni.TaskDescription.gwTjWJ, 14);
        sparseIntArray.put(C47315tni.TaskDescription.DarRvM, 15);
        sparseIntArray.put(C47315tni.TaskDescription.QslYrK, 16);
        sparseIntArray.put(C47315tni.TaskDescription.gGNlxh, 17);
    }

    public C47289tnI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 18, fARcdN, fIwbmz));
    }

    public C47289tnI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKAlertBanner) objArr[8], (AppBarLayout) objArr[9], (android.widget.LinearLayout) objArr[5], (android.widget.ImageView) objArr[6], (android.widget.ImageView) objArr[7], (AppCompatTextView) objArr[4], (android.widget.FrameLayout) objArr[2], (CollapsingToolbarLayout) objArr[10], (TransformableFloatingUnReadMsgActionButton) objArr[15], (android.widget.FrameLayout) objArr[14], (android.widget.ImageView) objArr[3], (android.widget.RelativeLayout) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[11], (C55173xeu) objArr[17], (C55113xdn) objArr[16], (android.view.View) objArr[1]);
        this.ejfBZ = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.uzCIH = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.ejfBZ = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.ejfBZ != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.ejfBZ = 0L;
        }
    }
}

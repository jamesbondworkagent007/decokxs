package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.okinc.uilab.banner.OKAlertBanner;
import o.C47315tni;

/* JADX INFO: renamed from: o.tny, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C47331tny extends AbstractC47327tnu {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts values = null;
    public final android.widget.LinearLayout AkhnZx;
    public long isConnected;

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
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C47315tni.TaskDescription.AhwBna, 1);
        sparseIntArray.put(C47315tni.TaskDescription.AEQbTJ, 2);
        sparseIntArray.put(C47315tni.TaskDescription.OLrzqt, 3);
        sparseIntArray.put(C47315tni.TaskDescription.aKErDB, 4);
        sparseIntArray.put(C47315tni.TaskDescription.DcMfJKsfEqpH, 5);
        sparseIntArray.put(C47315tni.TaskDescription.Hx, 6);
        sparseIntArray.put(C47315tni.TaskDescription.fXYAwm, 7);
        sparseIntArray.put(C47315tni.TaskDescription.RdAHlO, 8);
        sparseIntArray.put(C47315tni.TaskDescription.QslYrK, 9);
        sparseIntArray.put(C47315tni.TaskDescription.gGNlxh, 10);
        sparseIntArray.put(C47315tni.TaskDescription.zsXlph, 11);
    }

    public C47331tny(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, values, DbNXlk));
    }

    public C47331tny(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (OKAlertBanner) objArr[2], (AppBarLayout) objArr[3], (C33537myN) objArr[1], (C52794wYp) objArr[11], (CollapsingToolbarLayout) objArr[4], (android.widget.FrameLayout) objArr[8], (C55230xfy) objArr[7], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[5], (C55173xeu) objArr[10], (C55113xdn) objArr[9]);
        this.isConnected = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.isConnected = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.isConnected != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.isConnected = 0L;
        }
    }
}

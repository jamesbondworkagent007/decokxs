package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uPA extends uPC {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts gEmmrt = null;
    public final NestedScrollView AkhnZx;
    public long valueOf;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.getPlaybackType, 1);
        sparseIntArray.put(C48033uCm.Application.isShuffleModeEnabledRemoved, 2);
        sparseIntArray.put(C48033uCm.Application.isTransportControlEnabled, 3);
        sparseIntArray.put(C48033uCm.Application.QDqgQU, 4);
        sparseIntArray.put(C48033uCm.Application.play, 5);
        sparseIntArray.put(C48033uCm.Application.djBIcL, 6);
        sparseIntArray.put(C48033uCm.Application.DtA, 7);
    }

    public uPA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, gEmmrt, AhwBna));
    }

    public uPA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (vKO) objArr[6], (android.widget.ImageView) objArr[4], (C53539wnR) objArr[7], (android.widget.LinearLayout) objArr[3], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[5], (OKReminder) objArr[1]);
        this.valueOf = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.AkhnZx = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.valueOf = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.valueOf = 0L;
        }
    }
}

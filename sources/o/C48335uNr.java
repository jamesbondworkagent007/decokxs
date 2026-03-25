package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48335uNr extends AbstractC48334uNq {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public final ConstraintLayout AkhnZx;
    public long fetchVPNInfo;

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
        sparseIntArray.put(C48033uCm.Application.getViewModelStore, 1);
        sparseIntArray.put(C48033uCm.Application.createListView, 2);
        sparseIntArray.put(C48033uCm.Application.onItemClick, 3);
        sparseIntArray.put(C48033uCm.Application.fXG, 4);
        sparseIntArray.put(C48033uCm.Application.getPlaybackState, 5);
        sparseIntArray.put(C48033uCm.Application.DbvGUJ, 6);
        sparseIntArray.put(C48033uCm.Application.setScrollIndicators, 7);
        sparseIntArray.put(C48033uCm.Application.setupTitle, 8);
        sparseIntArray.put(C48033uCm.Application.ORWKdN, 9);
    }

    public C48335uNr(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 10, djBIcL, DbNXlk));
    }

    public C48335uNr(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[9], (C47988uAv) objArr[6], (C47988uAv) objArr[4], (C54984xbQ) objArr[5], (OKReminder) objArr[1], (C55258xgZ) objArr[7], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3]);
        this.fetchVPNInfo = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.AkhnZx = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fetchVPNInfo = 1L;
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
    public void executeBindings() {
        synchronized (this) {
            this.fetchVPNInfo = 0L;
        }
    }
}

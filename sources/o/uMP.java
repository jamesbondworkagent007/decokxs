package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uMP extends uMO {
    public static final ViewDataBinding.IncludedLayouts hDKMBd = null;
    public static final android.util.SparseIntArray uzCIH;
    public final android.widget.LinearLayout AubY;
    public long wlaJM;

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
        uzCIH = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.AlertDialog, 1);
        sparseIntArray.put(C48033uCm.Application.setNeutralButton, 2);
        sparseIntArray.put(C48033uCm.Application.setNegativeButtonIcon, 3);
        sparseIntArray.put(C48033uCm.Application.MediaSessionCompatQueueItem1, 4);
        sparseIntArray.put(C48033uCm.Application.OnBackPressedDispatcher, 5);
        sparseIntArray.put(C48033uCm.Application.OtRJxF, 6);
        sparseIntArray.put(C48033uCm.Application.iLAtSv, 7);
        sparseIntArray.put(C48033uCm.Application.getIntrinsicWidth, 8);
        sparseIntArray.put(C48033uCm.Application.AnyRes, 9);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsOpenDocument, 10);
        sparseIntArray.put(C48033uCm.Application.resolveDialogTheme, 11);
        sparseIntArray.put(C48033uCm.Application.Dmq, 12);
        sparseIntArray.put(C48033uCm.Application.setView, 13);
        sparseIntArray.put(C48033uCm.Application.onConnectionFailed, 14);
        sparseIntArray.put(C48033uCm.Application.setButtonPanelLayoutHint, 15);
        sparseIntArray.put(C48033uCm.Application.onConnectionSuspended, 16);
        sparseIntArray.put(C48033uCm.Application.AlertController1, 17);
        sparseIntArray.put(C48033uCm.Application.run, 18);
        sparseIntArray.put(C48033uCm.Application.resolvePanel, 19);
        sparseIntArray.put(C48033uCm.Application.setAdapter, 20);
        sparseIntArray.put(C48033uCm.Application.QqiRNA, 21);
        sparseIntArray.put(C48033uCm.Application.onServiceDisconnected, 22);
        sparseIntArray.put(C48033uCm.Application.getPadding, 23);
    }

    public uMP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, hDKMBd, uzCIH));
    }

    public uMP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[12], (android.widget.LinearLayout) objArr[18], (AppCompatTextView) objArr[7], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[21], (android.widget.TextView) objArr[22], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[16], (C55249xgQ) objArr[4], (C55249xgQ) objArr[5], (android.widget.LinearLayout) objArr[10], (android.widget.LinearLayout) objArr[9], (android.widget.TextView) objArr[19], (C55258xgZ) objArr[15], (android.widget.TextView) objArr[13], (C55258xgZ) objArr[17], (android.widget.TextView) objArr[1], (C55258xgZ) objArr[20], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[3], (OKReminder) objArr[8], (ViewPager2) objArr[23]);
        this.wlaJM = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AubY = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.wlaJM = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.wlaJM != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.wlaJM = 0L;
        }
    }
}

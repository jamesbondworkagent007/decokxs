package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uMx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48314uMx extends AbstractC48313uMw {
    public static final android.util.SparseIntArray iwGUEr;
    public static final ViewDataBinding.IncludedLayouts uzCIH = null;
    public long AuCTelauCTel;
    public final LinearLayoutCompat AubY;

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
        iwGUEr = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.aWJMta, 1);
        sparseIntArray.put(C48033uCm.Application.flVtFt, 2);
        sparseIntArray.put(C48033uCm.Application.emit, 3);
        sparseIntArray.put(C48033uCm.Application.gGvvIC, 4);
        sparseIntArray.put(C48033uCm.Application.onRemoveQueueItem, 5);
        sparseIntArray.put(C48033uCm.Application.DoNotInline, 6);
        sparseIntArray.put(C48033uCm.Application.fromInclusive, 7);
        sparseIntArray.put(C48033uCm.Application.DisplayContext, 8);
        sparseIntArray.put(C48033uCm.Application.Discouraged, 9);
        sparseIntArray.put(C48033uCm.Application.GuardedBy, 10);
        sparseIntArray.put(C48033uCm.Application.fGsPTM, 11);
        sparseIntArray.put(C48033uCm.Application.getOpacity, 12);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaImageAndVideo, 13);
        sparseIntArray.put(C48033uCm.Application.r8lambda3HoOD4FOOs4BK4W3sogOQmeeOUI, 14);
        sparseIntArray.put(C48033uCm.Application.invokeSuspendlambda1, 15);
        sparseIntArray.put(C48033uCm.Application.accesstrackPipAnimationHintViewpositionInWindow, 16);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatApi21Builder, 17);
        sparseIntArray.put(C48033uCm.Application.unit, 18);
        sparseIntArray.put(C48033uCm.Application.RcLksq, 19);
        sparseIntArray.put(C48033uCm.Application.HJWChPfrwjPh, 20);
        sparseIntArray.put(C48033uCm.Application.setQueueTitle, 21);
        sparseIntArray.put(C48033uCm.Application.parseTransition, 22);
        sparseIntArray.put(C48033uCm.Application.aGOrKO, 23);
    }

    public C48314uMx(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 24, uzCIH, iwGUEr));
    }

    public C48314uMx(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[4], (C33537myN) objArr[2], (C52567wQe) objArr[23], (C55254xgV) objArr[20], (C52564wQb) objArr[1], (android.widget.TextView) objArr[11], (android.widget.FrameLayout) objArr[19], (wPX) objArr[17], (android.view.View) objArr[21], (OKReminder) objArr[5], (android.widget.ImageView) objArr[3], (android.widget.TextView) objArr[16], (android.widget.LinearLayout) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[13], (ConstraintLayout) objArr[6], (android.view.View) objArr[18], (android.widget.TextView) objArr[8], (android.widget.ImageView) objArr[9], (ConstraintLayout) objArr[7], (C55372xih) objArr[10], (ViewPager2) objArr[22], (C55372xih) objArr[12]);
        this.AuCTelauCTel = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.AubY = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTelauCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTelauCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTelauCTel = 0L;
        }
    }
}

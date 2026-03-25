package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lvk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31530lvk extends AbstractC31531lvl {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray isConnected;
    public final android.widget.FrameLayout DbNXlk;
    public final ConstraintLayout fetchVPNInfo;
    public long values;

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
        isConnected = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.pauseLocationServices, 2);
        sparseIntArray.put(C31351lsQ.Application.processStrongAuthMessage, 3);
        sparseIntArray.put(C31351lsQ.Application.OHqIaq, 4);
        sparseIntArray.put(C31351lsQ.Application.ROgMPW, 5);
        sparseIntArray.put(C31351lsQ.Application.OAUGar, 6);
        sparseIntArray.put(C31351lsQ.Application.invokespecialhlXVux, 7);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKDCKfqPDCfLja, 8);
        sparseIntArray.put(C31351lsQ.Application.RvdRAu, 9);
        sparseIntArray.put(C31351lsQ.Application.AwvSrB, 10);
        sparseIntArray.put(C31351lsQ.Application.YqksP, 11);
    }

    public C31530lvk(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 12, AkhnZx, isConnected));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C31530lvk(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        C30027lJe c30027lJe = (C30027lJe) objArr[10];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[4];
        C30030lJh c30030lJh = (C30030lJh) objArr[11];
        C30043lJu c30043lJu = (C30043lJu) objArr[9];
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[7];
        android.widget.ImageView imageView2 = (android.widget.ImageView) objArr[5];
        java.lang.Object obj = objArr[2];
        C31548lwB c31548lwBOLrzqt = obj != null ? C31548lwB.OLrzqt((android.view.View) obj) : null;
        java.lang.Object obj2 = objArr[3];
        super(dataBindingComponent, view, 0, c30027lJe, constraintLayout, c30030lJh, c30043lJu, imageView, imageView2, c31548lwBOLrzqt, obj2 != null ? C31594lww.KWHzl((android.view.View) obj2) : null, (android.widget.LinearLayout) objArr[8], (android.widget.TextView) objArr[6]);
        this.values = -1L;
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[0];
        this.fetchVPNInfo = constraintLayout2;
        constraintLayout2.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[1];
        this.DbNXlk = frameLayout;
        frameLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.values = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.values != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.values;
            this.values = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.fetchVPNInfo, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}

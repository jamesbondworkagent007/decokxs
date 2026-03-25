package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.airbnb.lottie.LottieAnimationView;
import o.C45508srO;

/* JADX INFO: renamed from: o.srR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C45511srR extends AbstractC45510srQ {
    public static final ViewDataBinding.IncludedLayouts AkhnZx = null;
    public static final android.util.SparseIntArray DbNXlk;
    public final android.widget.FrameLayout AuCTel;
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
        sparseIntArray.put(C45508srO.TaskDescription.DbNXlk, 2);
        sparseIntArray.put(C45508srO.TaskDescription.copydefault, 3);
        sparseIntArray.put(C45508srO.TaskDescription.fetchVPNInfo, 4);
        sparseIntArray.put(C45508srO.TaskDescription.AkhnZx, 5);
        sparseIntArray.put(C45508srO.TaskDescription.valueOf, 6);
        sparseIntArray.put(C45508srO.TaskDescription.getFieldNames, 7);
        sparseIntArray.put(C45508srO.TaskDescription.iwGUEr, 8);
        sparseIntArray.put(C45508srO.TaskDescription.EZpvd, 9);
        sparseIntArray.put(C45508srO.TaskDescription.ejfBZ, 10);
        sparseIntArray.put(C45508srO.TaskDescription.AuCTel, 11);
        sparseIntArray.put(C45508srO.TaskDescription.fJNWhG, 12);
    }

    public C45511srR(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 13, AkhnZx, DbNXlk));
    }

    public C45511srR(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[3], (C52794wYp) objArr[9], (android.widget.FrameLayout) objArr[1], (android.widget.ImageView) objArr[6], (android.widget.LinearLayout) objArr[5], (LottieAnimationView) objArr[4], (android.widget.LinearLayout) objArr[2], (android.widget.LinearLayout) objArr[11], (C55113xdn) objArr[12], (C55317xhf) objArr[10], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7]);
        this.fetchVPNInfo = -1L;
        this.copydefault.setTag(null);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[0];
        this.AuCTel = frameLayout;
        frameLayout.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.fetchVPNInfo;
            this.fetchVPNInfo = 0L;
        }
        if ((j & 1) != 0) {
            ViewBindingAdapter.setPaddingTop(this.copydefault, C33570myu.gEmmrt(getRoot().getContext()));
        }
    }
}

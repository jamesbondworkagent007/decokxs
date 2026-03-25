package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.okinc.uilab.reminder.OKReminder;
import o.C31351lsQ;

/* JADX INFO: renamed from: o.lus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C31485lus extends AbstractC31482lup {
    public static final ViewDataBinding.IncludedLayouts fIwbmz = null;
    public static final android.util.SparseIntArray fJNWhG;
    public final android.widget.TextView getFieldNames;
    public final android.widget.LinearLayout hDKMBd;
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
        fJNWhG = sparseIntArray;
        sparseIntArray.put(C31351lsQ.Application.RXdAnZ, 2);
        sparseIntArray.put(C31351lsQ.Application.ggKfIT, 3);
        sparseIntArray.put(C31351lsQ.Application.QSAYLr, 4);
        sparseIntArray.put(C31351lsQ.Application.invokespecialODCBUN, 5);
        sparseIntArray.put(C31351lsQ.Application.QfJbVf, 6);
        sparseIntArray.put(C31351lsQ.Application.zdxASf, 7);
        sparseIntArray.put(C31351lsQ.Application.dzCpvv, 8);
        sparseIntArray.put(C31351lsQ.Application.invokespecialDaTmkG, 9);
        sparseIntArray.put(C31351lsQ.Application.HrFqwD, 10);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKgMxgjU, 11);
        sparseIntArray.put(C31351lsQ.Application.ilfrrN, 12);
        sparseIntArray.put(C31351lsQ.Application.HJWChPhFGucI, 13);
        sparseIntArray.put(C31351lsQ.Application.HJWChPRGtXKCRGtXKC, 14);
        sparseIntArray.put(C31351lsQ.Application.DcMfJKsgNvtZ, 15);
        sparseIntArray.put(C31351lsQ.Application.gLWkOL, 16);
        sparseIntArray.put(C31351lsQ.Application.dpErvT, 17);
        sparseIntArray.put(C31351lsQ.Application.abAflu, 18);
        sparseIntArray.put(C31351lsQ.Application.aKErDB, 19);
    }

    public C31485lus(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 20, fIwbmz, fJNWhG));
    }

    public C31485lus(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C52794wYp) objArr[19], (android.widget.FrameLayout) objArr[8], (android.widget.FrameLayout) objArr[6], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[5], (android.widget.ImageView) objArr[9], (android.widget.LinearLayout) objArr[15], (android.widget.LinearLayout) objArr[11], (OKReminder) objArr[18], (android.widget.RelativeLayout) objArr[2], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[10], (android.widget.TextView) objArr[7]);
        this.iwGUEr = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.hDKMBd = linearLayout;
        linearLayout.setTag(null);
        android.widget.TextView textView = (android.widget.TextView) objArr[1];
        this.getFieldNames = textView;
        textView.setTag(null);
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
        long j;
        synchronized (this) {
            j = this.iwGUEr;
            this.iwGUEr = 0L;
        }
        if ((j & 1) != 0) {
            TextViewBindingAdapter.setText(this.getFieldNames, "≈");
        }
    }
}

package o;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.reminder.OKReminder;
import o.C49511upt;

/* JADX INFO: renamed from: o.urg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49604urg extends AbstractC49600urc {
    public static final android.util.SparseIntArray getNewProxyInstance;
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public long hDKMBd;

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
        getNewProxyInstance = sparseIntArray;
        sparseIntArray.put(C49511upt.Application.QKVWgx, 2);
        sparseIntArray.put(C49511upt.Application.giSNqX, 3);
        sparseIntArray.put(C49511upt.Application.RJOkX, 4);
        sparseIntArray.put(C49511upt.Application.fvQaOB, 5);
        sparseIntArray.put(C49511upt.Application.hrNTAI, 6);
        sparseIntArray.put(C49511upt.Application.DGOPHZ, 7);
        sparseIntArray.put(C49511upt.Application.hrjNmC, 8);
        sparseIntArray.put(C49511upt.Application.hDKMBd, 9);
        sparseIntArray.put(C49511upt.Application.DLWbHP, 10);
        sparseIntArray.put(C49511upt.Application.zuBGHE, 11);
        sparseIntArray.put(C49511upt.Application.RdAHlO, 12);
        sparseIntArray.put(C49511upt.Application.OHqIaq, 13);
        sparseIntArray.put(C49511upt.Application.OBJEWx, 14);
        sparseIntArray.put(C49511upt.Application.dmfpNf, 15);
        sparseIntArray.put(C49511upt.Application.RlQdEF, 16);
        sparseIntArray.put(C49511upt.Application.DCJXGO, 17);
        sparseIntArray.put(C49511upt.Application.apNbdB, 18);
        sparseIntArray.put(C49511upt.Application.QfsBiF, 19);
        sparseIntArray.put(C49511upt.Application.UeEOUB, 20);
        sparseIntArray.put(C49511upt.Application.sVXHln, 21);
    }

    public C49604urg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 22, iwGUEr, getNewProxyInstance));
    }

    public C49604urg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.view.View) objArr[9], (android.widget.LinearLayout) objArr[11], (ConstraintLayout) objArr[0], (android.widget.TextView) objArr[2], (C55001xbh) objArr[4], (android.widget.TextView) objArr[19], (android.widget.TextView) objArr[20], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[5], (android.widget.TextView) objArr[1], (android.widget.TextView) objArr[16], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[14], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[12], (android.widget.TextView) objArr[13], (CardView) objArr[10], (CardView) objArr[6], (RecyclerView) objArr[7], (android.widget.TextView) objArr[18], (OKReminder) objArr[21], (android.widget.LinearLayout) objArr[8]);
        this.hDKMBd = -1L;
        this.OLrzqt.setTag(null);
        this.djBIcL.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.hDKMBd = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.hDKMBd != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.hDKMBd;
            this.hDKMBd = 0L;
        }
        if ((j & 1) != 0) {
            TextViewBindingAdapter.setText(this.djBIcL, "x");
        }
    }
}

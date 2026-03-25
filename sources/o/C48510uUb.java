package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uUb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48510uUb extends AbstractC48514uUf {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long DbNXlk;
    public final android.widget.LinearLayout values;

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
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.ONJgbh, 1);
        sparseIntArray.put(C48033uCm.Application.RSmiaq, 2);
        sparseIntArray.put(C48033uCm.Application.RWIpjU, 3);
        sparseIntArray.put(C48033uCm.Application.iWlNch, 4);
        sparseIntArray.put(C48033uCm.Application.fTEjYi, 5);
        sparseIntArray.put(C48033uCm.Application.dbUqJD, 6);
        sparseIntArray.put(C48033uCm.Application.GPCHlQ, 7);
        sparseIntArray.put(C48033uCm.Application.OAhWiU, 8);
    }

    public C48510uUb(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, AYXKKw));
    }

    public C48510uUb(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[5], (android.widget.TextView) objArr[8], (AppCompatImageView) objArr[6], (android.widget.TextView) objArr[7], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[4], (AppCompatImageView) objArr[2], (android.widget.TextView) objArr[3]);
        this.DbNXlk = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.DbNXlk = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.DbNXlk != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.DbNXlk = 0L;
        }
    }
}

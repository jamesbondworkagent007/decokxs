package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import o.C43662rtX;

/* JADX INFO: renamed from: o.rzW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C43979rzW extends AbstractC43977rzU {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public long djBIcL;
    public final android.widget.LinearLayout gEmmrt;

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
        sparseIntArray.put(C43662rtX.ActionBar.AwvSrB, 1);
        sparseIntArray.put(C43662rtX.ActionBar.AxsJAY, 2);
        sparseIntArray.put(C43662rtX.ActionBar.DcMfJKDDUqPf, 3);
        sparseIntArray.put(C43662rtX.ActionBar.QCjLjM, 4);
        sparseIntArray.put(C43662rtX.ActionBar.bindToGooglePlayService, 5);
        sparseIntArray.put(C43662rtX.ActionBar.iHkeWl, 6);
    }

    public C43979rzW(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 7, AhwBna, AYXKKw));
    }

    public C43979rzW(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageButton) objArr[2], (androidx.appcompat.widget.Toolbar) objArr[1], (android.widget.ImageView) objArr[4], (C55172xet) objArr[6], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[5]);
        this.djBIcL = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.gEmmrt = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.djBIcL != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}

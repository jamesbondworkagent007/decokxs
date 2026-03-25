package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.edit.OKEditText;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ejg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16425ejg extends AbstractC16427eji {
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public static final android.util.SparseIntArray valueOf;
    public final android.widget.LinearLayout AkhnZx;
    public long gEmmrt;

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
        valueOf = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.accept, 1);
        sparseIntArray.put(C13754dXa.ActionBar.onTrimMemory, 2);
        sparseIntArray.put(C13754dXa.ActionBar.getMediaSession, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getCurrentControllerInfo, 4);
        sparseIntArray.put(C13754dXa.ActionBar.FhERFw, 5);
        sparseIntArray.put(C13754dXa.ActionBar.getCallingPackage, 6);
        sparseIntArray.put(C13754dXa.ActionBar.MediaControllerCompatMediaControllerImplApi24, 7);
    }

    public C16425ejg(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 8, AhwBna, valueOf));
    }

    public C16425ejg(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C33537myN) objArr[1], (android.widget.ImageView) objArr[5], (RecyclerView) objArr[7], (OKEditText) objArr[6], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[3], (AppCompatTextView) objArr[2]);
        this.gEmmrt = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.AkhnZx = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.gEmmrt = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.gEmmrt != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.gEmmrt = 0L;
        }
    }
}

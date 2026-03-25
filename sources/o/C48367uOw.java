package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.view.OKSortTextView;
import o.C48033uCm;

/* JADX INFO: renamed from: o.uOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C48367uOw extends AbstractC48365uOu {
    public static final android.util.SparseIntArray AhwBna;
    public static final ViewDataBinding.IncludedLayouts djBIcL = null;
    public long AkhnZx;
    public final android.widget.LinearLayout isConnected;

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
        AhwBna = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.setDisplayShowHomeEnabled, 1);
        sparseIntArray.put(C48033uCm.Application.setDisplayShowTitleEnabled, 2);
        sparseIntArray.put(C48033uCm.Application.zMXLsR, 3);
        sparseIntArray.put(C48033uCm.Application.onSupportContentChanged, 4);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaImageOnly, 5);
        sparseIntArray.put(C48033uCm.Application.updateStatusGuardColor, 6);
        sparseIntArray.put(C48033uCm.Application.ActivityResultContractsPickVisualMediaVisualMediaType, 7);
        sparseIntArray.put(C48033uCm.Application.PlaybackStateCompatShuffleMode, 8);
    }

    public C48367uOw(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, djBIcL, AhwBna));
    }

    public C48367uOw(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C48157uHb) objArr[3], (RecyclerView) objArr[8], (OKSortTextView) objArr[7], (OKSortTextView) objArr[5], (android.widget.LinearLayout) objArr[1], (C52708wVk) objArr[2], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[6]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.isConnected = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AkhnZx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}

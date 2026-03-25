package o;

import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;
import o.C43471rps;

/* JADX INFO: renamed from: o.rpM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43439rpM extends AbstractC43436rpJ {
    public static final android.util.SparseIntArray AYXKKw;
    public static final ViewDataBinding.IncludedLayouts AhwBna = null;
    public long djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@androidx.annotation.Nullable MediaInfo mediaInfo) {
        this.gEmmrt = mediaInfo;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        AYXKKw = sparseIntArray;
        sparseIntArray.put(C43471rps.Activity.valueOf, 1);
        sparseIntArray.put(C43471rps.Activity.KWHzl, 2);
        sparseIntArray.put(C43471rps.Activity.EZpvd, 3);
        sparseIntArray.put(C43471rps.Activity.OLrzqt, 4);
        sparseIntArray.put(C43471rps.Activity.gEmmrt, 5);
    }

    public C43439rpM(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 6, AhwBna, AYXKKw));
    }

    public C43439rpM(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[2], (android.widget.FrameLayout) objArr[0], (android.widget.TextView) objArr[4], (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[5]);
        this.djBIcL = -1L;
        this.AEQbTJ.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.djBIcL = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C43468rpp.KWHzl != i) {
            return false;
        }
        EZpvd((MediaInfo) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.djBIcL = 0L;
        }
    }
}

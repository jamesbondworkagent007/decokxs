package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import o.C35399nuc;
import o.C44105sDn;

/* JADX INFO: loaded from: classes8.dex */
public class nMP extends nMO {
    public static final ViewDataBinding.IncludedLayouts fIwbmz;
    public static final android.util.SparseIntArray uzCIH;
    public long getFieldNames;
    public final C35888oHk hDKMBd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable OKReferenceMessage oKReferenceMessage) {
        this.valueOf = oKReferenceMessage;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        fIwbmz = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_im_text_og_web_url"}, new int[]{3}, new int[]{C44105sDn.StateListAnimator.copydefault});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        uzCIH = sparseIntArray;
        sparseIntArray.put(C35399nuc.StateListAnimator.DAgZj, 2);
        sparseIntArray.put(C35399nuc.StateListAnimator.gCiISl, 4);
        sparseIntArray.put(C35399nuc.StateListAnimator.fmdvVn, 5);
        sparseIntArray.put(C35399nuc.StateListAnimator.fRNHEq, 6);
        sparseIntArray.put(C35399nuc.StateListAnimator.RdAHlO, 7);
        sparseIntArray.put(C35399nuc.StateListAnimator.getUserContextRegisteredStatus, 8);
        sparseIntArray.put(C35399nuc.StateListAnimator.dPnHjp, 9);
        sparseIntArray.put(C35399nuc.StateListAnimator.aCSzUz, 10);
        sparseIntArray.put(C35399nuc.StateListAnimator.bindToGooglePlayService, 11);
        sparseIntArray.put(C35399nuc.StateListAnimator.getValue, 12);
        sparseIntArray.put(C35399nuc.StateListAnimator.RckOJh, 13);
        sparseIntArray.put(C35399nuc.StateListAnimator.GhqvEQ, 14);
        sparseIntArray.put(C35399nuc.StateListAnimator.hKJZrr, 15);
        sparseIntArray.put(C35399nuc.StateListAnimator.iSpHlg, 16);
        sparseIntArray.put(C35399nuc.StateListAnimator.zHQtTQ, 17);
        sparseIntArray.put(C35399nuc.StateListAnimator.DGUQLIOvDItG, 18);
    }

    public nMP(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, fIwbmz, uzCIH));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nMP(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) objArr[7];
        C37728ozM c37728ozM = (C37728ozM) objArr[18];
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[10];
        android.widget.ImageView imageView2 = (android.widget.ImageView) objArr[9];
        ShapeableImageView shapeableImageView = (ShapeableImageView) objArr[8];
        C55113xdn c55113xdn = (C55113xdn) objArr[11];
        sDA sda = (sDA) objArr[3];
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) objArr[12];
        android.widget.TextView textView = (android.widget.TextView) objArr[15];
        android.widget.ImageView imageView3 = (android.widget.ImageView) objArr[14];
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) objArr[13];
        java.lang.Object obj = objArr[2];
        super(dataBindingComponent, view, 1, frameLayout, c37728ozM, imageView, imageView2, shapeableImageView, c55113xdn, sda, frameLayout2, textView, imageView3, shapeableImageView2, obj != null ? nMT.EZpvd((android.view.View) obj) : null, (LinearLayoutCompat) objArr[1], (oHK) objArr[6], (android.widget.TextView) objArr[17], (android.widget.TextView) objArr[5], (LinearLayoutCompat) objArr[4], (CardView) objArr[16]);
        this.getFieldNames = -1L;
        C35888oHk c35888oHk = (C35888oHk) objArr[0];
        this.hDKMBd = c35888oHk;
        c35888oHk.setTag(null);
        setContainedBinding(this.djBIcL);
        this.isConnected.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 4L;
        }
        this.djBIcL.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.getFieldNames != 0) {
                return true;
            }
            return this.djBIcL.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.AEQbTJ != i) {
            return false;
        }
        KWHzl((OKReferenceMessage) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.djBIcL.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return OLrzqt((sDA) obj, i2);
    }

    public final boolean OLrzqt(sDA sda, int i) {
        if (i != C35342ntX.OLrzqt) {
            return false;
        }
        synchronized (this) {
            this.getFieldNames |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
        ViewDataBinding.executeBindingsOn(this.djBIcL);
    }
}

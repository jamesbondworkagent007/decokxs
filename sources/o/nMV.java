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
public class nMV extends nMS {
    public static final ViewDataBinding.IncludedLayouts ejfBZ;
    public static final android.util.SparseIntArray getNewProxyInstance;
    public long getFieldNames;
    public final C35888oHk iwGUEr;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(@androidx.annotation.Nullable OKReferenceMessage oKReferenceMessage) {
        this.djBIcL = oKReferenceMessage;
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(19);
        ejfBZ = includedLayouts;
        includedLayouts.setIncludes(1, new java.lang.String[]{"item_im_text_og_web_url"}, new int[]{3}, new int[]{C44105sDn.StateListAnimator.copydefault});
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        getNewProxyInstance = sparseIntArray;
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

    public nMV(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 19, ejfBZ, getNewProxyInstance));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nMV(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
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
        this.iwGUEr = c35888oHk;
        c35888oHk.setTag(null);
        setContainedBinding(this.valueOf);
        this.fetchVPNInfo.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 4L;
        }
        this.valueOf.invalidateAll();
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.getFieldNames != 0) {
                return true;
            }
            return this.valueOf.hasPendingBindings();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (C35342ntX.AEQbTJ != i) {
            return false;
        }
        copydefault((OKReferenceMessage) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void setLifecycleOwner(@androidx.annotation.Nullable LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        this.valueOf.setLifecycleOwner(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return copydefault((sDA) obj, i2);
    }

    private boolean copydefault(sDA sda, int i) {
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
        ViewDataBinding.executeBindingsOn(this.valueOf);
    }
}

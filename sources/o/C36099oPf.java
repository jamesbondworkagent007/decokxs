package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import o.C35964oKf;

/* JADX INFO: renamed from: o.oPf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36099oPf extends AbstractC36095oPb {
    public static final ViewDataBinding.IncludedLayouts AuCTel = null;
    public static final android.util.SparseIntArray fARcdN;
    public long fJNWhG;

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
        fARcdN = sparseIntArray;
        sparseIntArray.put(C35964oKf.StateListAnimator.DfrfUJ, 1);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi212, 2);
        sparseIntArray.put(C35964oKf.StateListAnimator.MediaBrowserCompatItemCallbackItemCallbackApi23, 3);
        sparseIntArray.put(C35964oKf.StateListAnimator.DDNONI, 4);
        sparseIntArray.put(C35964oKf.StateListAnimator.OYuSWK, 5);
        sparseIntArray.put(C35964oKf.StateListAnimator.fOrBHg, 6);
        sparseIntArray.put(C35964oKf.StateListAnimator.isConnected, 7);
        sparseIntArray.put(C35964oKf.StateListAnimator.dHAKvv, 8);
        sparseIntArray.put(C35964oKf.StateListAnimator.DbvGUJ, 9);
        sparseIntArray.put(C35964oKf.StateListAnimator.zuWLRA, 10);
        sparseIntArray.put(C35964oKf.StateListAnimator.QgUVrU, 11);
        sparseIntArray.put(C35964oKf.StateListAnimator.zKcAg, 12);
        sparseIntArray.put(C35964oKf.StateListAnimator.aVhqwO, 13);
        sparseIntArray.put(C35964oKf.StateListAnimator.getUserContextRegisteredStatus, 14);
        sparseIntArray.put(C35964oKf.StateListAnimator.fupbxE, 15);
    }

    public C36099oPf(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, AuCTel, fARcdN));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C36099oPf(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        C54984xbQ c54984xbQ = (C54984xbQ) objArr[7];
        C55237xgE c55237xgE = (C55237xgE) objArr[10];
        RecyclerView recyclerView = (RecyclerView) objArr[12];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[13];
        android.widget.ImageView imageView = (android.widget.ImageView) objArr[15];
        android.widget.TextView textView = (android.widget.TextView) objArr[14];
        java.lang.Object obj = objArr[1];
        super(dataBindingComponent, view, 0, c54984xbQ, c55237xgE, recyclerView, constraintLayout, linearLayout, imageView, textView, obj != null ? C36112oPs.AEQbTJ((android.view.View) obj) : null, (android.widget.TextView) objArr[11], (C54984xbQ) objArr[5], (C54984xbQ) objArr[4], (C54984xbQ) objArr[6], (android.widget.FrameLayout) objArr[8], (C39778pyk) objArr[9], (android.widget.HorizontalScrollView) objArr[3], (C55258xgZ) objArr[2]);
        this.fJNWhG = -1L;
        this.KWHzl.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.fJNWhG = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.fJNWhG != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.fJNWhG = 0L;
        }
    }
}

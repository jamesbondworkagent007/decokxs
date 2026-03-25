package o;

import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.robinhood.ticker.TickerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.elA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16499elA extends AbstractC16550elz {
    public static final ViewDataBinding.IncludedLayouts iwGUEr = null;
    public static final android.util.SparseIntArray uzCIH;
    public long getFieldNames;
    public final ConstraintLayout zLjUOn;

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
        uzCIH = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.icKaHr, 1);
        sparseIntArray.put(C13754dXa.ActionBar.jFiva, 2);
        sparseIntArray.put(C13754dXa.ActionBar.parseResult, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getFillInIntent, 4);
        sparseIntArray.put(C13754dXa.ActionBar.Px, 5);
        sparseIntArray.put(C13754dXa.ActionBar.IntentSenderRequest, 6);
        sparseIntArray.put(C13754dXa.ActionBar.IdRes, 7);
        sparseIntArray.put(C13754dXa.ActionBar.BinderThread, 8);
        sparseIntArray.put(C13754dXa.ActionBar.USBtdM, 9);
        sparseIntArray.put(C13754dXa.ActionBar.aCSzUz, 10);
        sparseIntArray.put(C13754dXa.ActionBar.Rtjmuc, 11);
        sparseIntArray.put(C13754dXa.ActionBar.YFmri, 12);
        sparseIntArray.put(C13754dXa.ActionBar.subscribe, 13);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatCallbackHandler, 14);
        sparseIntArray.put(C13754dXa.ActionBar.onReceiveResult, 15);
        sparseIntArray.put(C13754dXa.ActionBar.onError, 16);
        sparseIntArray.put(C13754dXa.ActionBar.UiContext, 17);
        sparseIntArray.put(C13754dXa.ActionBar.StringRes, 18);
        sparseIntArray.put(C13754dXa.ActionBar.StyleRes, 19);
        sparseIntArray.put(C13754dXa.ActionBar.ParcelableVolumeInfo1, 20);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatApi24CallbackProxy, 21);
        sparseIntArray.put(C13754dXa.ActionBar.ParcelableVolumeInfo, 22);
    }

    public C16499elA(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 23, iwGUEr, uzCIH));
    }

    public C16499elA(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (Barrier) objArr[9], (android.widget.FrameLayout) objArr[10], (gIW) objArr[12], (gIW) objArr[11], (android.widget.ImageView) objArr[1], (android.widget.ImageView) objArr[2], (android.widget.LinearLayout) objArr[13], (android.widget.TextView) objArr[14], (android.widget.LinearLayout) objArr[15], (android.widget.TextView) objArr[16], (C54984xbQ) objArr[20], (C54984xbQ) objArr[22], (C54984xbQ) objArr[21], (android.widget.TextView) objArr[3], (android.widget.TextView) objArr[6], (TickerView) objArr[4], (android.widget.TextView) objArr[8], (android.widget.TextView) objArr[7], (android.widget.LinearLayout) objArr[5], (C55113xdn) objArr[19], (C19627gJj) objArr[18], (C19628gJk) objArr[17]);
        this.getFieldNames = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.zLjUOn = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.getFieldNames = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.getFieldNames != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.getFieldNames = 0L;
        }
    }
}

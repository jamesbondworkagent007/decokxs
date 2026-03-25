package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeAccountDetailUIBean;
import o.C13754dXa;

/* JADX INFO: renamed from: o.ern, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16856ern extends AbstractC16854erl {
    public static final android.util.SparseIntArray DbNXlk;
    public static final ViewDataBinding.IncludedLayouts valueOf = null;
    public long AkhnZx;
    public final android.widget.LinearLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@androidx.annotation.Nullable EscapeAccountDetailUIBean escapeAccountDetailUIBean) {
        this.OLrzqt = escapeAccountDetailUIBean;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean onFieldChange(int i, java.lang.Object obj, int i2) {
        return false;
    }

    static {
        android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
        DbNXlk = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.ArkbYM, 1);
        sparseIntArray.put(C13754dXa.ActionBar.znKlvJ, 2);
        sparseIntArray.put(C13754dXa.ActionBar.MediaBrowserCompatMediaBrowserImplApi211, 3);
        sparseIntArray.put(C13754dXa.ActionBar.OqHLSf, 4);
        sparseIntArray.put(C13754dXa.ActionBar.bindToGooglePlayService, 5);
        sparseIntArray.put(C13754dXa.ActionBar.rewind, 6);
        sparseIntArray.put(C13754dXa.ActionBar.setShuffleModeEnabledRemoved, 7);
        sparseIntArray.put(C13754dXa.ActionBar.sendMediaButton, 8);
    }

    public C16856ern(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 9, valueOf, DbNXlk));
    }

    public C16856ern(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.TextView) objArr[5], (ShapeableImageView) objArr[2], (android.widget.ImageView) objArr[4], (ConstraintLayout) objArr[1], (android.widget.TextView) objArr[3], (ConstraintLayout) objArr[6], (android.widget.TextView) objArr[7], (android.widget.TextView) objArr[8]);
        this.AkhnZx = -1L;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) objArr[0];
        this.values = linearLayout;
        linearLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AkhnZx = 2L;
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
    public boolean setVariable(int i, @androidx.annotation.Nullable java.lang.Object obj) {
        if (dTV.isConnected != i) {
            return false;
        }
        KWHzl((EscapeAccountDetailUIBean) obj);
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AkhnZx = 0L;
        }
    }
}

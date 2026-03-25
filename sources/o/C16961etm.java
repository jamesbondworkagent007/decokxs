package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C13754dXa;

/* JADX INFO: renamed from: o.etm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16961etm extends AbstractC16962etn {
    public static final android.util.SparseIntArray fARcdN;
    public static final ViewDataBinding.IncludedLayouts fJNWhG = null;
    public long AuCTel;
    public final ConstraintLayout fIwbmz;

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
        sparseIntArray.put(C13754dXa.ActionBar.setFillInIntent, 1);
        sparseIntArray.put(C13754dXa.ActionBar.iTrKTi, 2);
        sparseIntArray.put(C13754dXa.ActionBar.ddhgMB, 3);
        sparseIntArray.put(C13754dXa.ActionBar.getIntentSender, 4);
        sparseIntArray.put(C13754dXa.ActionBar.IntentSenderRequestCompanion, 5);
        sparseIntArray.put(C13754dXa.ActionBar.IntentSenderRequestBuilderFlag, 6);
        sparseIntArray.put(C13754dXa.ActionBar.iluEmO, 7);
        sparseIntArray.put(C13754dXa.ActionBar.StyleableRes, 8);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMedia, 9);
        sparseIntArray.put(C13754dXa.ActionBar.aLnfMH, 10);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsOpenDocumentTree, 11);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickContact, 12);
        sparseIntArray.put(C13754dXa.ActionBar.ActivityResultContractsPickMultipleVisualMediaExternalSyntheticApiModelOutline0, 13);
        sparseIntArray.put(C13754dXa.ActionBar.DLl, 14);
        sparseIntArray.put(C13754dXa.ActionBar.playFromSearch, 15);
    }

    public C16961etm(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 16, fJNWhG, fARcdN));
    }

    public C16961etm(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.ImageView) objArr[3], (android.widget.ImageView) objArr[7], (android.widget.ImageView) objArr[2], (android.widget.ImageView) objArr[10], (android.widget.ImageView) objArr[14], (OKReminder) objArr[15], (android.widget.TextView) objArr[1], (C14696dqN) objArr[5], (android.widget.TextView) objArr[6], (android.widget.TextView) objArr[4], (android.widget.TextView) objArr[9], (C14696dqN) objArr[12], (android.widget.TextView) objArr[13], (android.widget.TextView) objArr[11], (android.view.View) objArr[8]);
        this.AuCTel = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.fIwbmz = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.AuCTel = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.AuCTel != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.AuCTel = 0L;
        }
    }
}

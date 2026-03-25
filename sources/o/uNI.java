package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.reminder.OKReminder;
import o.C48033uCm;

/* JADX INFO: loaded from: classes11.dex */
public class uNI extends uNF {
    public static final android.util.SparseIntArray AubY;
    public static final ViewDataBinding.IncludedLayouts getFieldNames = null;
    public long zLjUOn;
    public final NestedScrollView zsXlph;

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
        AubY = sparseIntArray;
        sparseIntArray.put(C48033uCm.Application.DdI, 1);
        sparseIntArray.put(C48033uCm.Application.setMediaController, 2);
        sparseIntArray.put(C48033uCm.Application.ActionBarDrawerToggleFrameworkActionBarDelegate, 3);
        sparseIntArray.put(C48033uCm.Application.WorkerThread, 4);
        sparseIntArray.put(C48033uCm.Application.Rattr, 5);
        sparseIntArray.put(C48033uCm.Application.ICustomTabsCallbackStub, 6);
        sparseIntArray.put(C48033uCm.Application.XmlRes, 7);
        sparseIntArray.put(C48033uCm.Application.Experimental, 8);
        sparseIntArray.put(C48033uCm.Application.ExperimentalLevel, 9);
        sparseIntArray.put(C48033uCm.Application.hcetpZ, 10);
        sparseIntArray.put(C48033uCm.Application.dSJNDS, 11);
        sparseIntArray.put(C48033uCm.Application.HJWChPHhYHK, 12);
        sparseIntArray.put(C48033uCm.Application.prepareFromUri, 13);
        sparseIntArray.put(C48033uCm.Application.prepareFromMediaId, 14);
        sparseIntArray.put(C48033uCm.Application.prepare, 15);
        sparseIntArray.put(C48033uCm.Application.DDDCac, 16);
        sparseIntArray.put(C48033uCm.Application.hCLrkq, 17);
        sparseIntArray.put(C48033uCm.Application.onProgressUpdate, 18);
        sparseIntArray.put(C48033uCm.Application.MediaMetadataCompatBitmapKey, 19);
        sparseIntArray.put(C48033uCm.Application.newView, 20);
        sparseIntArray.put(C48033uCm.Application.getLegacyAudioStream, 21);
        sparseIntArray.put(C48033uCm.Application.iwGUEr, 22);
        sparseIntArray.put(C48033uCm.Application.setupContent, 23);
        sparseIntArray.put(C48033uCm.Application.setColorFilter, 24);
    }

    public uNI(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 25, getFieldNames, AubY));
    }

    public uNI(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (C53314wjE) objArr[22], (C53539wnR) objArr[17], (android.widget.TextView) objArr[12], (ConstraintLayout) objArr[10], (android.widget.TextView) objArr[11], (android.widget.TextView) objArr[16], (ConstraintLayout) objArr[1], (C55258xgZ) objArr[6], (android.widget.LinearLayout) objArr[18], (wYK) objArr[19], (android.widget.TextView) objArr[15], (android.widget.TextView) objArr[14], (ConstraintLayout) objArr[13], (android.widget.TextView) objArr[2], (android.widget.TextView) objArr[21], (C47988uAv) objArr[7], (C47988uAv) objArr[9], (C47988uAv) objArr[4], (C47988uAv) objArr[8], (C47988uAv) objArr[5], (C55258xgZ) objArr[3], (android.widget.TextView) objArr[23], (C55258xgZ) objArr[20], (OKReminder) objArr[24]);
        this.zLjUOn = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.zsXlph = nestedScrollView;
        nestedScrollView.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.zLjUOn = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.zLjUOn != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.zLjUOn = 0L;
        }
    }
}

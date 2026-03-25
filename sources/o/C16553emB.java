package o;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.robinhood.ticker.TickerView;
import o.C13754dXa;

/* JADX INFO: renamed from: o.emB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C16553emB extends AbstractC16600emw {
    public static final ViewDataBinding.IncludedLayouts OcIXYQ = null;
    public static final android.util.SparseIntArray QOLQEE;
    public final ConstraintLayout DTwDnp;
    public long QKVWgx;

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
        QOLQEE = sparseIntArray;
        sparseIntArray.put(C13754dXa.ActionBar.RlQdEF, 1);
        sparseIntArray.put(C13754dXa.ActionBar.invokespecialaGOrKO, 2);
        sparseIntArray.put(C13754dXa.ActionBar.next, 3);
        sparseIntArray.put(C13754dXa.ActionBar.isTransportControlEnabled, 4);
        sparseIntArray.put(C13754dXa.ActionBar.sYcwUD, 5);
        sparseIntArray.put(C13754dXa.ActionBar.onChildrenLoaded, 6);
        sparseIntArray.put(C13754dXa.ActionBar.iZzfmt, 7);
        sparseIntArray.put(C13754dXa.ActionBar.applyOptions, 8);
        sparseIntArray.put(C13754dXa.ActionBar.dzkkkq, 9);
        sparseIntArray.put(C13754dXa.ActionBar.arDRxL, 10);
        sparseIntArray.put(C13754dXa.ActionBar.deregisterUser, 11);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver2_Parcel, 12);
        sparseIntArray.put(C13754dXa.ActionBar.itxZVF, 13);
        sparseIntArray.put(C13754dXa.ActionBar.MediaDescriptionCompat, 14);
        sparseIntArray.put(C13754dXa.ActionBar.QsIRgs, 15);
        sparseIntArray.put(C13754dXa.ActionBar.OtZEmZ, 16);
        sparseIntArray.put(C13754dXa.ActionBar.values, 17);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiverStub, 18);
        sparseIntArray.put(C13754dXa.ActionBar.DDjgSw, 19);
        sparseIntArray.put(C13754dXa.ActionBar.IResultReceiver_Parcel, 20);
        sparseIntArray.put(C13754dXa.ActionBar.equals, 21);
        sparseIntArray.put(C13754dXa.ActionBar.MediaSessionCompatToken, 22);
        sparseIntArray.put(C13754dXa.ActionBar.setSessionToken2Bundle, 23);
        sparseIntArray.put(C13754dXa.ActionBar.Rinteger, 24);
        sparseIntArray.put(C13754dXa.ActionBar.Rdimen, 25);
        sparseIntArray.put(C13754dXa.ActionBar.validateAndPutInMap, 26);
        sparseIntArray.put(C13754dXa.ActionBar.gGvvIC, 27);
        sparseIntArray.put(C13754dXa.ActionBar.putBitmap, 28);
        sparseIntArray.put(C13754dXa.ActionBar.OBJEWx, 29);
        sparseIntArray.put(C13754dXa.ActionBar.dHguZz, 30);
        sparseIntArray.put(C13754dXa.ActionBar.QSBOWP, 31);
        sparseIntArray.put(C13754dXa.ActionBar.MediaMetadataCompatApi21Builder, 32);
        sparseIntArray.put(C13754dXa.ActionBar.MediaMetadataCompatLongKey, 33);
        sparseIntArray.put(C13754dXa.ActionBar.RdAHlO, 34);
        sparseIntArray.put(C13754dXa.ActionBar.zFtALg, 35);
        sparseIntArray.put(C13754dXa.ActionBar.INotificationSideChannelStub, 36);
    }

    public C16553emB(@androidx.annotation.Nullable DataBindingComponent dataBindingComponent, @androidx.annotation.NonNull android.view.View view) {
        this(dataBindingComponent, view, ViewDataBinding.mapBindings(dataBindingComponent, view, 37, OcIXYQ, QOLQEE));
    }

    public C16553emB(DataBindingComponent dataBindingComponent, android.view.View view, java.lang.Object[] objArr) {
        super(dataBindingComponent, view, 0, (android.widget.LinearLayout) objArr[17], (C14697dqO) objArr[27], (AppBarLayout) objArr[7], (C33537myN) objArr[1], (android.view.View) objArr[29], (C55244xgL) objArr[31], (NestedScrollView) objArr[30], (ViewPager2) objArr[34], (ShapeableImageView) objArr[2], (ConstraintLayout) objArr[9], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[5], (C55173xeu) objArr[35], (android.widget.FrameLayout) objArr[15], (android.widget.LinearLayout) objArr[13], (AppCompatImageView) objArr[19], (wYC) objArr[16], (android.widget.ImageView) objArr[26], (LinearLayoutCompat) objArr[10], (C55113xdn) objArr[36], (C15828eWu) objArr[6], (android.widget.ImageView) objArr[14], (C15764eUk) objArr[8], (C14706dqX) objArr[28], (SwitchCompat) objArr[32], (android.widget.ImageView) objArr[33], (C33546myW) objArr[3], (C33603mza) objArr[4], (android.widget.LinearLayout) objArr[21], (AppCompatTextView) objArr[22], (C19251fxk) objArr[23], (AppCompatTextView) objArr[18], (AppCompatImageView) objArr[20], (AppCompatImageView) objArr[12], (TickerView) objArr[25], (ConstraintLayout) objArr[24]);
        this.QKVWgx = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.DTwDnp = constraintLayout;
        constraintLayout.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.QKVWgx = 1L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.QKVWgx != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void executeBindings() {
        synchronized (this) {
            this.QKVWgx = 0L;
        }
    }
}

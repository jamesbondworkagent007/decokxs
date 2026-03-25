package o;

import androidx.fragment.app.FragmentActivity;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8610bFv;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.geg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20321geg<T extends AbstractC8610bFv<?>> extends AbstractC20237gdB<T> {
    public boolean copydefault;

    @Override // o.AbstractC20237gdB, o.AbstractC20082gaF
    public void copydefault(@NotNull java.util.Collection<? extends AbstractC9832bcy> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (((AbstractC9832bcy) CollectionsKt___CollectionsKt.RcXXUw(collection)) instanceof C9782bcA) {
            AbstractC20102gaZ.updateReminder$default(this, null, 1, null);
            if (this.copydefault) {
                return;
            }
            this.copydefault = true;
            C55326xho.toastWithFailedIcon$default(C13754dXa.FragmentManager.MediaSessionCompatApi24Callback, 0, 1, (java.lang.Object) null);
            return;
        }
        super.copydefault(collection);
    }

    @Override // o.AbstractC20082gaF
    public void OLrzqt(@NotNull C9748bbT c9748bbT) {
        Intrinsics.checkNotNullParameter(c9748bbT, "");
        java.lang.String strAEQbTJ = c9748bbT.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.String strKWHzl = c9748bbT.KWHzl();
        EZpvd(strAEQbTJ, strKWHzl != null ? strKWHzl : "", ejfBZ().fERRXa().getPublicKey());
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("result", -1);
        bundle.putString("data", str);
        bundle.putString("tx_hash", str2);
        bundle.putString("publicKey", str3);
        bundle.putBoolean("is_reject_sign", false);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1, new android.content.Intent().putExtras(bundle));
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }
}

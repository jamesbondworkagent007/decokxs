package o;

import android.view.View;
import com.okinc.business.defi.wallet.tee.converter.ui.item.SmallAssetsConverterNetworkErrorViewBinding$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.fTZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class fUV extends AbstractC19608gIr<fTZ.ActionBar, C17089ewH> {
    public final Function0<Unit> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fUV(@NotNull Function0<Unit> function0) {
        super(SmallAssetsConverterNetworkErrorViewBinding$1.INSTANCE);
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;)V */
    @Override // o.AbstractC19608gIr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void EZpvd(@NotNull C17089ewH c17089ewH, @NotNull fTZ.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(c17089ewH, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        C55173xeu c55173xeu = c17089ewH.OLrzqt;
        c55173xeu.setEmptyTypeImage(8);
        java.lang.String strOLrzqt = actionBar.OLrzqt();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNLfdT);
        if (strOLrzqt == null || strOLrzqt.length() == 0) {
            strOLrzqt = strAYXKKw;
        }
        c55173xeu.setTitle(strOLrzqt);
        java.lang.String strKWHzl = actionBar.KWHzl();
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX);
        if (strKWHzl == null || strKWHzl.length() == 0) {
            strKWHzl = strAYXKKw2;
        }
        c55173xeu.setSubTitle((java.lang.CharSequence) strKWHzl);
        c55173xeu.setRetry(actionBar.copydefault() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKfNUfqk) : "");
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.fUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                fUV.copydefault(this.copydefault, view);
            }
        });
    }

    public static final void copydefault(fUV fuv, android.view.View view) {
        fuv.AEQbTJ.invoke();
    }
}

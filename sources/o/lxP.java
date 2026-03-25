package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lxP implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get("source"));
        OKPaymentSource oKPaymentSourceKWHzl = OKPaymentSource.Companion.KWHzl(strGEmmrt != null ? strGEmmrt : "");
        if (context instanceof FragmentActivity) {
            InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default((InterfaceC47251tmX) C43248rlh.KWHzl.AEQbTJ(InterfaceC47251tmX.class), (FragmentActivity) context, new BuySellConvertParameters(oKPaymentSourceKWHzl, TargetTab.CONVERT, null, null, null, null, null, null, null, TypedValues.PositionType.TYPE_CURVE_FIT, null), null, 4, null);
        }
    }
}

package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.okx.paymentapi.service.BuySellConvertParameters;
import com.okinc.okx.paymentapi.service.OKPaymentSource;
import com.okinc.okx.paymentapi.service.TargetTab;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC47251tmX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class lzA implements InterfaceC7380aij {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lzA.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC7380aij
    public java.util.Set<java.lang.String> KWHzl() {
        return yEE.AhwBna("BuyCoin", "lite/convert/home");
    }

    @Override // o.InterfaceC7380aij
    public void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull InterfaceC7379aii interfaceC7379aii) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC7379aii, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BuyCoin")) {
            ((InterfaceC43294rma) C43251rlk.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC43294rma.class))).KWHzl(context, "main/otc/quick", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.ENTRANCE_TYPE, "welfare_center_click")), new Function1() { // from class: o.lzC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj5) {
                    return lzA.copydefault((AbstractC43238rlX) obj5);
                }
            });
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "lite/convert/home")) {
            java.lang.String string = (map == null || (obj4 = map.get("from")) == null) ? null : obj4.toString();
            java.lang.String string2 = (map == null || (obj3 = map.get("to")) == null) ? null : obj3.toString();
            java.lang.String string3 = (map == null || (obj2 = map.get("topUpCurrency")) == null) ? null : obj2.toString();
            java.lang.String string4 = (map == null || (obj = map.get("source")) == null) ? null : obj.toString();
            OKPaymentSource.Companion companion = OKPaymentSource.Companion;
            if (string4 == null) {
                string4 = "";
            }
            OKPaymentSource oKPaymentSourceKWHzl = companion.KWHzl(string4);
            if (context instanceof FragmentActivity) {
                InterfaceC47251tmX interfaceC47251tmX = (InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class);
                FragmentActivity fragmentActivity = (FragmentActivity) context;
                TargetTab targetTab = TargetTab.CONVERT;
                java.lang.String str2 = C33129mqd.OLrzqt((java.lang.CharSequence) string2) ? string2 : null;
                InterfaceC47251tmX.StateListAnimator.goToBuySellConvertPage$default(interfaceC47251tmX, fragmentActivity, new BuySellConvertParameters(oKPaymentSourceKWHzl, targetTab, str2 == null ? string == null ? "" : string : str2, null, null, null, null, string3 == null ? "" : string3, null, 376, null), null, 4, null);
            }
        }
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}

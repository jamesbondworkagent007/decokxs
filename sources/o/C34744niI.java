package o;

import com.okinc.core.util.SPUtils;
import com.okinc.fiat.api.bean.CoinType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C34744niI {
    public static final C34744niI OLrzqt = new C34744niI();

    private C34744niI() {
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.niI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getCurrentQuote$default(C34744niI c34744niI, CoinType coinType, java.lang.String str, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.niL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34744niI.OLrzqt();
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.niN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C34744niI.AEQbTJ((java.lang.String) obj2);
                }
            };
        }
        c34744niI.EZpvd(coinType, str, (Function0<Unit>) function0, (Function1<? super java.lang.String, Unit>) function1);
    }

    public static final Unit AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull CoinType coinType, java.lang.String str, @NotNull Function0<Unit> function0, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(coinType, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Intrinsics.copydefault((java.lang.Object) str);
            function1.invoke(str);
            return;
        }
        C34745niJ c34745niJ = C34745niJ.AEQbTJ;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c34745niJ.gEmmrt(coinType))) {
            AhwBna();
            function1.invoke(c34745niJ.gEmmrt(coinType));
        } else {
            getIpQuoteFromNet$default(this, false, new Function1() { // from class: o.niP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C34744niI.OLrzqt(function1, (java.lang.String) obj);
                }
            }, new Function0() { // from class: o.niM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34744niI.copydefault(function1);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1) {
        function1.invoke("");
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        java.lang.String string = SPUtils.getString("fiat_crypto_ip_currency", "");
        if (string == null || string.length() == 0 || SPUtils.getBoolean("fiat_crypto_force_get_ip_currency", false)) {
            getIpQuoteFromNet$default(this, true, null, null, 6, null);
        }
    }

    public final void copydefault(java.lang.String str) {
        SPUtils.put("fiat_crypto_ip_currency", str);
        SPUtils.put("fiat_crypto_force_get_ip_currency", java.lang.Boolean.FALSE);
    }

    public final java.lang.String KWHzl() {
        java.lang.String string = SPUtils.getString("fiat_crypto_ip_currency", "");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.niI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getIpQuoteFromNet$default(C34744niI c34744niI, boolean z, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.niH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C34744niI.OLrzqt((java.lang.String) obj2);
                }
            };
        }
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.niG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C34744niI.copydefault();
                }
            };
        }
        c34744niI.KWHzl(z, function1, function0);
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public final void KWHzl(final boolean z, final Function1<? super java.lang.String, Unit> function1, final Function0<Unit> function0) {
        ((InterfaceC47251tmX) C43251rlk.copydefault(InterfaceC47251tmX.class)).copydefault(new Function1() { // from class: o.niO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34744niI.copydefault(z, function1, function0, (java.lang.String) obj);
            }
        });
    }

    public static final Unit copydefault(boolean z, Function1 function1, Function0 function0, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            function1.invoke(str);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            OLrzqt.copydefault(str);
        } else if (!z) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}

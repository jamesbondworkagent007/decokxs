package o;

import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rWt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42543rWt {
    public static volatile boolean AEQbTJ;
    public static Function1<? super android.app.Activity, ? extends AbstractC42536rWm> AYXKKw;
    public static Function1<? super androidx.fragment.app.Fragment, java.lang.String> AhwBna;
    public static yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> AkhnZx;
    public static final java.lang.String DbNXlk;
    public static volatile java.lang.String EZpvd;
    public static final C42543rWt KWHzl = new C42543rWt();
    public static final int OLrzqt;
    public static volatile long copydefault;
    public static java.lang.String djBIcL;
    public static Function1<? super android.app.Activity, java.lang.String> gEmmrt;
    public static Function1<? super androidx.fragment.app.Fragment, ? extends AbstractC42536rWm> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function1<? super androidx.fragment.app.Fragment, java.lang.String> function1) {
        AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        Intrinsics.checkNotNullParameter(yho, "");
        AkhnZx = yho;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.app.Activity, java.lang.String>, kotlin.jvm.functions.Function1<android.app.Activity, java.lang.String> */
    public final Function1<android.app.Activity, java.lang.String> AYXKKw() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super android.app.Activity, ? extends o.rWm>, kotlin.jvm.functions.Function1<android.app.Activity, o.rWm> */
    public final Function1<android.app.Activity, AbstractC42536rWm> AhwBna() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        copydefault = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Function1<? super androidx.fragment.app.Fragment, ? extends AbstractC42536rWm> function1) {
        valueOf = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super android.app.Activity, ? extends AbstractC42536rWm> function1) {
        AYXKKw = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super android.app.Activity, java.lang.String> function1) {
        gEmmrt = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super androidx.fragment.app.Fragment, ? extends o.rWm>, kotlin.jvm.functions.Function1<androidx.fragment.app.Fragment, o.rWm> */
    public final Function1<androidx.fragment.app.Fragment, AbstractC42536rWm> djBIcL() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super androidx.fragment.app.Fragment, java.lang.String>, kotlin.jvm.functions.Function1<androidx.fragment.app.Fragment, java.lang.String> */
    public final Function1<androidx.fragment.app.Fragment, java.lang.String> gEmmrt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: o.yHO<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit>, o.yHO<java.lang.String, java.lang.String, java.lang.String, kotlin.Unit> */
    public final yHO<java.lang.String, java.lang.String, java.lang.String, Unit> valueOf() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void values() {
        if (AEQbTJ) {
            return;
        }
        AEQbTJ = true;
    }

    private C42543rWt() {
    }

    static {
        java.lang.String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        DbNXlk = string;
        djBIcL = "";
        AkhnZx = new yHO() { // from class: o.rWA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C42543rWt.OLrzqt((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        };
        OLrzqt = 8;
    }

    public final void fetchVPNInfo() {
        if (EZpvd != null) {
            return;
        }
        synchronized (this) {
            if (EZpvd == null) {
                EZpvd = UUID.randomUUID().toString();
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        new Function0() { // from class: o.rWv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C42543rWt.EZpvd();
            }
        };
        return Unit.INSTANCE;
    }
}

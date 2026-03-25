package o;

import com.okinc.core.util.SPUtils;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.preference.data.model.ModifySettingReq;
import com.okinc.preference.data.remote.LocalConfigRemoteDataSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tYa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46538tYa {
    public static int EZpvd = 0;
    public static boolean OLrzqt = false;
    public static final C46538tYa copydefault = new C46538tYa();
    public static final int AEQbTJ = 8;

    private C46538tYa() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() {
        int i;
        boolean z = SPUtils.getBoolean("sp_up_down_timezone_initialized", false);
        OLrzqt = z;
        if (z) {
            EZpvd = SPUtils.getInt("sp_up_down_timezone", 0).intValue();
            return;
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (C38303pTu.KWHzl(locale2)) {
                i = !C34703nhO.AEQbTJ() ? 2 : 1;
            }
        }
        EZpvd = i;
        SPUtils.put("sp_up_down_timezone", java.lang.Integer.valueOf(i));
        SPUtils.put("sp_up_down_timezone_initialized", java.lang.Boolean.TRUE);
    }

    public final void EZpvd(int i) {
        EZpvd = i;
        SPUtils.put("sp_up_down_timezone_logged", java.lang.Integer.valueOf(i));
    }

    public final void OLrzqt(final int i, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        InterfaceC47278tmy interfaceC47278tmyFmB = ((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB();
        if (i == EZpvd) {
            return;
        }
        if (!interfaceC47278tmyFmB.values()) {
            EZpvd = i;
            SPUtils.put("sp_up_down_timezone", java.lang.Integer.valueOf(i));
            function0.invoke();
        } else {
            AbstractC58185ywX abstractC58185ywXKWHzl = C33024moe.KWHzl((AbstractC58185ywX) LocalConfigRemoteDataSource.Companion.KWHzl().modifySettings(new ModifySettingReq(13, i)));
            final Function1 function1 = new Function1() { // from class: o.tYb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46538tYa.copydefault(i, function0, (ResponseData) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.tXY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C46538tYa.OLrzqt(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.tYg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46538tYa.copydefault((java.lang.Throwable) obj);
                }
            };
            abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.tYc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C46538tYa.copydefault(function12, obj);
                }
            });
        }
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(int i, Function0 function0, ResponseData responseData) {
        EZpvd = i;
        SPUtils.put("sp_up_down_timezone_logged", java.lang.Integer.valueOf(i));
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        pUU.KWHzl(th);
        return Unit.INSTANCE;
    }

    public final int EZpvd() {
        if (((InterfaceC47230tmC) C58113yvE.copydefault(C43246rlf.OLrzqt.valueOf(), InterfaceC47230tmC.class)).fmB().values()) {
            int iIntValue = SPUtils.getInt("sp_up_down_timezone_logged", 0).intValue();
            EZpvd = iIntValue;
            return iIntValue;
        }
        int iIntValue2 = SPUtils.getInt("sp_up_down_timezone", 0).intValue();
        EZpvd = iIntValue2;
        return iIntValue2;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        int iEZpvd = EZpvd();
        return iEZpvd != 1 ? iEZpvd != 2 ? str : str3 : str2;
    }

    public final java.lang.String copydefault() {
        int iEZpvd = EZpvd();
        return iEZpvd != 1 ? iEZpvd != 2 ? "change24h" : "u8change" : "u0change";
    }
}

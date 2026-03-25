package o;

import com.okinc.core.util.SPUtils;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.trade.setting.setting_data.SettingType;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.quq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41653quq {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(@NotNull OKReminder oKReminder, boolean z, @NotNull final java.lang.String str) {
        boolean z2;
        Intrinsics.checkNotNullParameter(oKReminder, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            z2 = SPUtils.getBoolean(str, true) && C55697xoo.OLrzqt.isConnected();
        }
        C41431qqg.AEQbTJ(oKReminder, z2, (Function1<? super OKReminder, Unit>) new Function1() { // from class: o.quu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41653quq.OLrzqt(str, (OKReminder) obj);
            }
        });
    }

    public static final Unit OLrzqt(final java.lang.String str, final OKReminder oKReminder) {
        C54606xOp c54606xOpOcIXYQ;
        java.util.List<java.lang.String> listDjSkpj;
        java.lang.String strJoinToString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(oKReminder, "");
        oKReminder.setTitle(C33070mpX.AYXKKw(pVX.LoaderManager.ejfBZ));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (c54606xOpOcIXYQ = interfaceC54581xNrOLrzqt.OcIXYQ()) != null && (listDjSkpj = c54606xOpOcIXYQ.djSkpj()) != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listDjSkpj, null, null, null, 0, null, null, 63, null)) != null) {
            str2 = strJoinToString$default;
        }
        oKReminder.setMessage(C33069mpW.copydefault(pVX.LoaderManager.fIwbmz, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", str2))));
        oKReminder.setStyle(0);
        oKReminder.setLeadingIconVisibility(false);
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.quv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41653quq.AEQbTJ(oKReminder, str);
            }
        });
        oKReminder.setPrimaryAction(C33070mpX.AYXKKw(pVX.LoaderManager.DbNXlk), new Function0() { // from class: o.qux
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C41653quq.KWHzl(oKReminder);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OKReminder oKReminder, java.lang.String str) {
        oKReminder.setVisibility(8);
        SPUtils.put(str, java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(OKReminder oKReminder) {
        InterfaceC49499uph interfaceC49499uph = (InterfaceC49499uph) C43251rlk.copydefault(InterfaceC49499uph.class);
        android.content.Context context = oKReminder.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        interfaceC49499uph.EZpvd(context, SettingType.USD_SETTLE_CCY);
        return Unit.INSTANCE;
    }
}

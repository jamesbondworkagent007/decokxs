package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeProcessInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput;
import com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dJM implements InterfaceC43234rlT {
    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC43233rlS interfaceC43233rlS, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        if (activityAEQbTJ == null) {
            return;
        }
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(map.get("source"));
        if (strGEmmrt.length() == 0) {
            strGEmmrt = ProjectSource.CeDeFi.getValue();
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "passkeyWallet/escape/execute", false, 2, (java.lang.Object) null)) {
            pUU.copydefault("DefiPassKeyWalletDeeplinkHandlerV2", "execute escape process");
            fJX.Companion.KWHzl(activityAEQbTJ, new EscapeProcessInput(ProjectSource.Companion.EZpvd(strGEmmrt)));
            return;
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) strOLrzqt, (java.lang.CharSequence) "passkeyWallet/escape/statusPage", false, 2, (java.lang.Object) null)) {
            pUU.copydefault("DefiPassKeyWalletDeeplinkHandlerV2", "open escape status page");
            fKG.Companion.AEQbTJ(activityAEQbTJ, new EscapeStatusInput(ProjectSource.Companion.EZpvd(strGEmmrt), (java.lang.String) null, 2, (DefaultConstructorMarker) null));
            return;
        }
        pUU.copydefault("DefiPassKeyWalletDeeplinkHandlerV2", "url = " + strOLrzqt + " , params = " + C33129mqd.gEmmrt(map));
    }
}

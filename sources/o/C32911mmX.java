package o;

import com.appsflyer.AppsFlyerProperties;
import com.okinc.okuser.data.User;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32911mmX {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final AtomicInteger OLrzqt = new AtomicInteger(0);
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mmY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32911mmX.KWHzl();
        }
    });

    public static final pUV KWHzl() {
        return new pUV("TrackVerify", false, false, false, 14, null);
    }

    public final pUV OLrzqt() {
        return (pUV) this.KWHzl.getValue();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.OLrzqt.getAndIncrement() > 0) {
            return;
        }
        User userOLrzqt = C43292rmY.OLrzqt.AwvSrB().OLrzqt();
        java.lang.String tk = userOLrzqt != null ? userOLrzqt.getTk() : null;
        if (tk == null) {
            tk = "";
        }
        java.lang.String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID);
        if (Intrinsics.EZpvd((java.lang.Object) tk, (java.lang.Object) (string != null ? string : ""))) {
            OLrzqt().copydefault("AppsFlyer event:" + str + ", verify pass");
            return;
        }
        OLrzqt().AEQbTJ("AppsFlyer event:" + str + ", verify failed");
    }

    /* JADX INFO: renamed from: o.mmX$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mmX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

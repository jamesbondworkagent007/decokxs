package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.RouteData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56058xve;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vek, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51000vek implements InterfaceC43234rlT {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.vek$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vek.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC43234rlT
    public void OLrzqt(@NotNull final android.content.Context context, @NotNull final InterfaceC43233rlS interfaceC43233rlS, @NotNull final java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43233rlS, "");
        Intrinsics.checkNotNullParameter(map, "");
        pUU.KWHzl("BotDeeplinkHandler", "executeDeeplink: " + interfaceC43233rlS.OLrzqt() + ", " + interfaceC43233rlS.KWHzl() + ", " + map);
        java.lang.Object obj = map.get("strategyType");
        if (C51004veo.OLrzqt.OLrzqt(context, interfaceC43233rlS.OLrzqt(), obj instanceof java.lang.String ? (java.lang.String) obj : null, new Function0() { // from class: o.vep
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51000vek.OLrzqt(this.KWHzl, context, interfaceC43233rlS, map);
            }
        })) {
            return;
        }
        EZpvd(context, interfaceC43233rlS, map);
    }

    public static final Unit OLrzqt(C51000vek c51000vek, android.content.Context context, InterfaceC43233rlS interfaceC43233rlS, java.util.Map map) {
        c51000vek.EZpvd(context, interfaceC43233rlS, map);
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.content.Context context, InterfaceC43233rlS interfaceC43233rlS, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        android.os.Bundle bundleEZpvd;
        if (KWHzl(context, interfaceC43233rlS.OLrzqt(), map)) {
            return;
        }
        if (interfaceC43233rlS.KWHzl() == DeeplinkMode.LITE && Intrinsics.EZpvd(map.get(OtcExtraKeys.ORDER), (java.lang.Object) "1")) {
            pUU.KWHzl("BotDeeplinkHandler", "lite mode do not support this path, wrong params!");
            return;
        }
        if (EZpvd(interfaceC43233rlS.OLrzqt(), map)) {
            java.lang.String strOLrzqt = interfaceC43233rlS.OLrzqt();
            pUU.KWHzl("BotDeeplinkHandler", "jump directly for path: " + strOLrzqt);
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "trade_bot/main/page") || Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) "trade_bot/order/page")) {
                bundleEZpvd = C49467upB.EZpvd(map, C56390yDp.OLrzqt("intentFlag", 67108864));
            } else {
                bundleEZpvd = C49467upB.EZpvd(map, new kotlin.Pair[0]);
            }
            C51001vel.copydefault.copydefault(context, strOLrzqt, bundleEZpvd);
            return;
        }
        pUU.KWHzl("BotDeeplinkHandler", "jump through MainRouterService for path: " + interfaceC43233rlS + ".path");
        C56058xve.Activity activityCopydefault = C56058xve.Activity.Companion.copydefault(C49467upB.EZpvd(map, new kotlin.Pair[0]));
        C56058xve c56058xveCopydefault = C56058xve.Companion.copydefault();
        c56058xveCopydefault.KWHzl();
        c56058xveCopydefault.KWHzl(true);
        c56058xveCopydefault.AEQbTJ(activityCopydefault);
        ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).AEQbTJ(context, interfaceC43233rlS.OLrzqt(), C49467upB.EZpvd(map, new kotlin.Pair[0]));
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC43233rlS.OLrzqt(), (java.lang.Object) "trade_bot/main/page")) {
            C53685wqE.copydefault.copydefault().OLrzqt(C49467upB.EZpvd(map, new kotlin.Pair[0]).getString("from"), "bot");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vek */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isBotJumpDirectly$default(C51000vek c51000vek, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        return c51000vek.EZpvd(str, map);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        boolean zOLrzqt;
        switch (str.hashCode()) {
            case -1877945534:
                if (!str.equals("trade_bot/main/page")) {
                    return false;
                }
                java.lang.Object obj = map == null ? map.get("strategyType") : null;
                zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (!(obj instanceof java.lang.String) ? (java.lang.String) obj : null));
                java.lang.Object obj2 = map == null ? map.get("botCategory") : null;
                boolean zOLrzqt2 = C33129mqd.OLrzqt((java.lang.CharSequence) (!(obj2 instanceof java.lang.String) ? (java.lang.String) obj2 : null));
                boolean z = !Intrinsics.EZpvd(map == null ? map.get("from") : null, (java.lang.Object) "bot_page_trade") && C33129mqd.OLrzqt((java.lang.CharSequence) C55946xtY.OLrzqt.AEQbTJ(RouteData.Companion.OLrzqt(java.lang.Integer.valueOf(C33129mqd.AhwBna(map == null ? map.get("bizType") : null)))));
                if (zOLrzqt && !z && !zOLrzqt2) {
                    return false;
                }
                if (!Intrinsics.EZpvd(map == null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2")) {
                    if (!Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "4")) {
                        return false;
                    }
                }
                return true;
            case -1099868621:
                if (!str.equals("trade_bot/order/page")) {
                    return false;
                }
                if (map == null) {
                }
                zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (!(obj instanceof java.lang.String) ? (java.lang.String) obj : null));
                if (map == null) {
                }
                boolean zOLrzqt22 = C33129mqd.OLrzqt((java.lang.CharSequence) (!(obj2 instanceof java.lang.String) ? (java.lang.String) obj2 : null));
                if (Intrinsics.EZpvd(map == null ? map.get("from") : null, (java.lang.Object) "bot_page_trade")) {
                    if (zOLrzqt) {
                    }
                    if (!Intrinsics.EZpvd(map == null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2")) {
                    }
                }
                return true;
            case -255931143:
                if (!str.equals("trade_bot/signal_detail/page")) {
                    return false;
                }
                return Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2");
            case -121250042:
                if (!str.equals("trade_bot/copy/page")) {
                    return false;
                }
                return Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2");
            case 759168264:
                if (!str.equals("trade_bot/guide_card/page")) {
                    return false;
                }
                return Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2");
            case 1249306087:
                if (!str.equals("trade_bot/my_bot/page")) {
                    return false;
                }
                return true;
            case 1401478537:
                if (!str.equals("trade_bot/transition_guide/page")) {
                    return false;
                }
                return Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2");
            case 1759199090:
                if (!str.equals("trade_bot/bot_detail/page")) {
                    return false;
                }
                return Intrinsics.EZpvd(map != null ? map.getOrDefault(OtcExtraKeys.ORDER, "2") : null, (java.lang.Object) "2");
            default:
                return false;
        }
    }

    public final boolean KWHzl(android.content.Context context, java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_bot/order/page") && !C56071xvr.gEmmrt.ejfBZ()) {
            java.lang.Object obj = map.get("algoId");
            java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
                pUU.KWHzl("BotDeeplinkHandler", "routeMain - signal clone flow " + str + ", " + map);
                ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).AEQbTJ(context, str, C49467upB.EZpvd(map, new kotlin.Pair[0]));
                return true;
            }
        }
        return false;
    }
}

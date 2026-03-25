package o;

import com.okinc.tradingbot.impl.deeplink.BotWhitelistHelper$fetchWhitelistAndRoute$1;
import com.okinc.unify_trade.biz.OrderCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.InterfaceC33172mrT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.veo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51004veo {
    public static java.lang.String KWHzl;
    public static final C51004veo OLrzqt = new C51004veo();
    public static Function0<java.lang.String> EZpvd = new Function0() { // from class: o.vem
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C51004veo.EZpvd();
        }
    };
    public static final int copydefault = 8;

    private C51004veo() {
    }

    public static final java.lang.String EZpvd() {
        return C55697xoo.OLrzqt.gEmmrt();
    }

    public final boolean OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str, java.lang.String str2, @NotNull Function0<Unit> function0) {
        xOR xorCopydefault;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "trade_bot/order/page") || str2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2)) {
            return false;
        }
        java.lang.String strInvoke = EZpvd.invoke();
        boolean z = !Intrinsics.EZpvd((java.lang.Object) KWHzl, (java.lang.Object) strInvoke) || KWHzl == null;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.util.List<OrderCategory> listAEQbTJ = (interfaceC54581xNrCopydefault == null || (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) == null) ? null : xorCopydefault.AEQbTJ();
        if (z || listAEQbTJ == null || listAEQbTJ.isEmpty()) {
            KWHzl = strInvoke;
            pUU.KWHzl("BotWhitelistHelper", "Fetching fresh whitelist (uidChanged=" + z + ", cacheEmpty=" + (listAEQbTJ == null || listAEQbTJ.isEmpty()) + ")");
            copydefault(context, str2, function0);
            return true;
        }
        if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((OrderCategory) it.next()).getStrategyType(), (java.lang.Object) str2)) {
                    return false;
                }
            }
        }
        pUU.KWHzl("BotWhitelistHelper", "Non-whitelisted for " + str2 + ", redirecting to marketplace");
        OLrzqt(context);
        return true;
    }

    public final void copydefault(android.content.Context context, java.lang.String str, Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BotWhitelistHelper$fetchWhitelistAndRoute$1(str, context, function0, null), 3, null);
    }

    public final void OLrzqt(android.content.Context context) {
        InterfaceC33172mrT.TaskDescription.routeMain$default((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class), context, "trade/main/strategy", null, 4, null);
    }
}

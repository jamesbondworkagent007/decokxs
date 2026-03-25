package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradingbot.impl.planet.model.BotDisplayType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wpd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53657wpd {
    public static final C53657wpd copydefault = new C53657wpd();

    /* JADX INFO: renamed from: o.wpd$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotDisplayType.values().length];
            try {
                iArr[BotDisplayType.YieldRatioOnly.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotDisplayType.PnLAndYieldRatio.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    private C53657wpd() {
    }

    public final void KWHzl(final boolean z) {
        OLrzqt("Feeds_Whole_PluginCardSelect_View", new Function1() { // from class: o.wpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53657wpd.copydefault(z, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("no_data", java.lang.String.valueOf(z), false);
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        reportEvent$default(this, "Feeds_Whole_PluginCardExpand_Click", null, 1, null);
    }

    public final void copydefault() {
        reportEvent$default(this, "Feeds_Btm_PluginCardConfirm_Click", null, 1, null);
    }

    public final void OLrzqt() {
        reportEvent$default(this, "Feeds_Mid_PluginCardEdit_Click", null, 1, null);
    }

    public final void AEQbTJ(@NotNull final BotDisplayType botDisplayType) {
        Intrinsics.checkNotNullParameter(botDisplayType, "");
        OLrzqt("Feeds_Btm_PluginCardEditConfirm_Click", new Function1() { // from class: o.wpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53657wpd.KWHzl(botDisplayType, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(BotDisplayType botDisplayType, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int i = Activity.AEQbTJ[botDisplayType.ordinal()];
        if (i == 1) {
            str = "pnl_percentage";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "pnl_percentage_and_dollar";
        }
        eventParamsList.put("plugin_option_pnl", str, true);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        reportEvent$default(this, "Feeds_Btm_PluginCardDelete_Click", null, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wpd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void reportEvent$default(C53657wpd c53657wpd, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        c53657wpd.OLrzqt(str, function1);
    }

    public final void OLrzqt(java.lang.String str, final Function1<? super EventParamsList, Unit> function1) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.wpc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53657wpd.AEQbTJ(function1, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(Function1 function1, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("plugin_type", "bot_position", true);
        if (function1 != null) {
            function1.invoke(eventParamsList);
        }
        return Unit.INSTANCE;
    }
}

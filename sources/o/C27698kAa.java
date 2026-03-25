package o;

import com.okinc.business.market.features.trader.ui.TraderAction;
import com.okinc.business.market.features.trader.ui.model.TraderPnLFilter;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9847bdM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kAa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27698kAa {

    /* JADX INFO: renamed from: o.kAa$Activity */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TraderPnLFilter.values().length];
            try {
                iArr[TraderPnLFilter.TOTAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TraderPnLFilter.REALIZED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TraderPnLFilter.UNREALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    public static /* synthetic */ void trackTraderAction$default(java.lang.String str, TraderAction traderAction, java.lang.Boolean bool, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            traderAction = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        EZpvd(str, traderAction, bool, str2);
    }

    public static final void EZpvd(final java.lang.String str, final TraderAction traderAction, final java.lang.Boolean bool, final java.lang.String str2) {
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Token_Page_Click", new TrackChannel[0], new Function1() { // from class: o.kAb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27698kAa.copydefault(str, traderAction, str2, bool, (EventParamsList) obj);
            }
        }, false, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(java.lang.String str, TraderAction traderAction, java.lang.String str2, java.lang.Boolean bool, EventParamsList eventParamsList) {
        java.lang.String str3;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            EventParamsList.put$default(eventParamsList, "trader_label_click", str, false, 4, null);
        }
        if (traderAction != null) {
            EventParamsList.put$default(eventParamsList, "trader_button_app_click", traderAction.getKey(), false, 4, null);
        }
        if (str2 == null) {
            str3 = "none";
        } else {
            str3 = C33129mqd.OLrzqt((java.lang.CharSequence) str2) ? str2 : null;
            if (str3 == null) {
            }
        }
        EventParamsList.put$default(eventParamsList, "wallet_id", str3, false, 4, null);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            EventParamsList.put$default(eventParamsList, "trader_button_app_click", TraderAction.CURRENCY.getKey(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "currency_switch_trader", zBooleanValue ? "native_token" : "stable", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackTraderFilter$default(TraderPnLFilter traderPnLFilter, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        EZpvd(traderPnLFilter, str);
    }

    public static final void EZpvd(@NotNull final TraderPnLFilter traderPnLFilter, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(traderPnLFilter, "");
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("DEXMarket_Token_TraderFilterPage_Click", (TrackChannel[]) null, new Function1() { // from class: o.kzY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27698kAa.OLrzqt(traderPnLFilter, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(TraderPnLFilter traderPnLFilter, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        int i = Activity.AEQbTJ[traderPnLFilter.ordinal()];
        if (i == 1) {
            str2 = "total";
        } else if (i == 2) {
            str2 = "realized";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "unrealized";
        }
        EventParamsList.put$default(eventParamsList, "pnl_type", str2, false, 4, null);
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            EventParamsList.put$default(eventParamsList, "filtered_address", str, false, 4, null);
        }
        return Unit.INSTANCE;
    }
}

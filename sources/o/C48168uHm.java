package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.bot.BacktestDto;
import com.okinc.unify_trade.biz.bot.BotStatus;
import com.okinc.unify_trade.bot.config.ContractDcaTriggerType;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.util.TacticsListButtonItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48168uHm {
    public static final C48168uHm EZpvd = new C48168uHm();

    /* JADX INFO: renamed from: o.uHm$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[BotStatus.values().length];
            try {
                iArr[BotStatus.Running.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[BotStatus.Completed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[BotStatus.Failed.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    private C48168uHm() {
    }

    /* JADX INFO: renamed from: o.uHm$Application */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class Application {
        public final java.util.List<TacticsListButtonItem> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uHm$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.copydefault;
            }
            return application.AEQbTJ(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.util.List<TacticsListButtonItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TacticsListButtonItem> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(detailPageButtons=" + this.copydefault + ")";
        }

        public Application(@NotNull java.util.List<TacticsListButtonItem> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = list;
        }
    }

    public final Application OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2) {
        java.util.List<TacticsListButtonItem> listAEQbTJ;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TacticsListButtonItem tacticsListButtonItemOLrzqt = C55998xuX.copydefault.OLrzqt(str2);
        if (tacticsListButtonItemOLrzqt != null) {
            return new Application(C56402yEa.EZpvd(tacticsListButtonItemOLrzqt));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "spot_dca") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "contract_dca")) {
            listAEQbTJ = AEQbTJ(z, z2);
        } else {
            listAEQbTJ = yDY.AhwBna();
        }
        return new Application(listAEQbTJ);
    }

    public final java.util.List<TacticsListButtonItem> AEQbTJ(boolean z, boolean z2) {
        if (!z) {
            return yDY.AhwBna();
        }
        if (z2) {
            return yDY.gEmmrt(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null), new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return yDY.gEmmrt(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null), new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
    }

    public final java.util.List<C53809wsW> AEQbTJ(@NotNull TacticsData tacticsData) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        BotVo bot = tacticsData.getBot();
        if ((bot != null ? bot.getBacktest() : null) != null) {
            return copydefault(tacticsData);
        }
        if (tacticsData.getHistory()) {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatMediaControllerImplBase);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.MediaControllerCompatPlaybackInfo);
        }
        java.lang.String str = strAYXKKw;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        C48168uHm c48168uHm = EZpvd;
        addButton$default(c48168uHm, listOLrzqt, "edit_name", false, null, null, 14, null);
        addButton$default(c48168uHm, listOLrzqt, "strategy_button_recreate", false, null, str, 6, null);
        addButton$default(c48168uHm, listOLrzqt, "StopAiBot", false, null, null, 14, null);
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.util.List<TacticsListButtonItem> AEQbTJ(boolean z, boolean z2, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TacticsListButtonItem tacticsListButtonItemOLrzqt = C55998xuX.copydefault.OLrzqt(str);
        if (tacticsListButtonItemOLrzqt != null) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(tacticsListButtonItemOLrzqt);
            return C56402yEa.fARcdN(listOLrzqt);
        }
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        if (!z2) {
            listOLrzqt2.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        listOLrzqt2.add(new TacticsListButtonItem("SHARE", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        if (z) {
            listOLrzqt2.add(new TacticsListButtonItem("strategy_button_recreate", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        } else {
            listOLrzqt2.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        return C56402yEa.fARcdN(listOLrzqt2);
    }

    public final java.util.List<TacticsListButtonItem> copydefault(boolean z, BotStatus botStatus) {
        if (botStatus == BotStatus.Init) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(new TacticsListButtonItem("strategy_button_starting", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
            return C56402yEa.fARcdN(listOLrzqt);
        }
        java.util.List listOLrzqt2 = C56402yEa.OLrzqt();
        if (!z) {
            listOLrzqt2.add(new TacticsListButtonItem("strategy_button_details", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        }
        listOLrzqt2.add(new TacticsListButtonItem("CreateAiBotFromBacktest", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        listOLrzqt2.add(new TacticsListButtonItem("MORE_FUNC", false, (java.lang.String) null, 6, (DefaultConstructorMarker) null));
        return C56402yEa.fARcdN(listOLrzqt2);
    }

    public static /* synthetic */ void addButton$default(C48168uHm c48168uHm, java.util.List list, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = "";
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = null;
        }
        c48168uHm.OLrzqt(list, str, z2, str4, str3);
    }

    public final void OLrzqt(java.util.List<C53809wsW> list, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        list.add(new C53809wsW(str, z, str2, null, null, str3, 24, null));
    }

    public final boolean EZpvd(TacticsData tacticsData) {
        return Intrinsics.EZpvd((java.lang.Object) tacticsData.getCopyType(), (java.lang.Object) "2");
    }

    public final boolean OLrzqt(TacticsData tacticsData) {
        java.lang.Object next;
        java.util.List<DcaTriggerParam> triggerParams = tacticsData.getTriggerParams();
        java.lang.String triggerStrategy = null;
        if (triggerParams != null) {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DcaTriggerParam dcaTriggerParam = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam != null ? dcaTriggerParam.getTriggerAction() : null), (java.lang.Object) TtmlNode.START)) {
                    break;
                }
            }
            DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
            if (dcaTriggerParam2 != null) {
                triggerStrategy = dcaTriggerParam2.getTriggerStrategy();
            }
        }
        return Intrinsics.EZpvd((java.lang.Object) triggerStrategy, (java.lang.Object) ContractDcaTriggerType.PRICE.getMode());
    }

    public final boolean AEQbTJ(boolean z) {
        return C56071xvr.gEmmrt.ejfBZ() && z;
    }

    public final boolean KWHzl(TacticsData tacticsData) {
        return tacticsData.getHiddenFeatures().contains("5");
    }

    public final java.util.List<C53809wsW> copydefault(@NotNull TacticsData tacticsData, boolean z) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        C48168uHm c48168uHm = EZpvd;
        addButton$default(c48168uHm, listOLrzqt, "strategy_button_add_order", Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "running"), null, null, 12, null);
        addButton$default(c48168uHm, listOLrzqt, "strategy_button_adjust_margin", false, null, null, 14, null);
        if (!c48168uHm.KWHzl(tacticsData)) {
            addButton$default(c48168uHm, listOLrzqt, "REINVEST_PROFIT", false, null, null, 14, null);
        }
        addButton$default(c48168uHm, listOLrzqt, "strategy_modify_auto_margin", false, null, null, 14, null);
        if (!c48168uHm.EZpvd(tacticsData) && c48168uHm.OLrzqt(tacticsData)) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_modify_start_condition", false, null, null, 14, null);
        }
        addButton$default(c48168uHm, listOLrzqt, "strategy_modify_stop_condition", false, null, null, 14, null);
        if (tacticsData.isTriggerContainsWebHook()) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_trading_view_signal", false, null, null, 14, null);
        }
        if (!c48168uHm.EZpvd(tacticsData)) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_tp_price", C33129mqd.AEQbTJ(tacticsData.getTpPx(), 0), null, null, 12, null);
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_recreate", false, null, null, 14, null);
        }
        addButton$default(c48168uHm, listOLrzqt, "view_on_kline", false, null, null, 14, null);
        if (!Intrinsics.EZpvd((java.lang.Object) tacticsData.getState(), (java.lang.Object) "no_close_position")) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_stop", false, null, null, 14, null);
        } else if (!z) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_related_position", false, null, null, 14, null);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.util.List<C53809wsW> KWHzl(@NotNull TacticsData tacticsData, boolean z) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        C48168uHm c48168uHm = EZpvd;
        addButton$default(c48168uHm, listOLrzqt, "STRATEGY_SPOT_DCA_ADD_INVESTMENT", false, null, null, 14, null);
        addButton$default(c48168uHm, listOLrzqt, "strategy_edit_dca_parameter", false, null, null, 14, null);
        if (!c48168uHm.AEQbTJ(z)) {
            addButton$default(c48168uHm, listOLrzqt, "strategy_button_recreate", false, null, null, 14, null);
        }
        addButton$default(c48168uHm, listOLrzqt, "view_on_kline", false, null, null, 14, null);
        addButton$default(c48168uHm, listOLrzqt, "strategy_button_stop", false, null, null, 14, null);
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final java.util.List<C53809wsW> copydefault(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        BotVo bot = tacticsData.getBot();
        BacktestDto backtest = bot != null ? bot.getBacktest() : null;
        C48168uHm c48168uHm = EZpvd;
        addButton$default(c48168uHm, listOLrzqt, "strategy_button_recreate", false, null, C33070mpX.AYXKKw(C48033uCm.Fragment.apLTlu), 6, null);
        addButton$default(c48168uHm, listOLrzqt, "SHARE", false, null, null, 14, null);
        addButton$default(c48168uHm, listOLrzqt, "EditBacktestName", false, null, null, 14, null);
        BotStatus status = backtest != null ? backtest.getStatus() : null;
        int i = status == null ? -1 : TaskDescription.AEQbTJ[status.ordinal()];
        if (i == 1) {
            addButton$default(c48168uHm, listOLrzqt, "StopBacktest", false, null, null, 14, null);
        } else if (i == 2 || i == 3) {
            addButton$default(c48168uHm, listOLrzqt, "RunBacktestAgain", false, null, null, 14, null);
            addButton$default(c48168uHm, listOLrzqt, "DeleteBacktest", false, null, null, 14, null);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }
}

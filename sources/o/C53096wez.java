package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wez, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C53096wez {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public IceBergReq KWHzl;
    public kotlin.Pair<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull IceBergReq iceBergReq) {
        Intrinsics.checkNotNullParameter(iceBergReq, "");
        this.KWHzl = iceBergReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.OLrzqt = pair;
    }

    public final IceBergReq KWHzl() {
        IceBergReq iceBergReq = this.KWHzl;
        if (iceBergReq != null) {
            return iceBergReq;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        kotlin.Pair<java.lang.String, java.lang.String> pair = this.OLrzqt;
        if (pair != null) {
            return pair;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.wez$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wez.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void AEQbTJ() {
        GridStartTriggerType gridStartTriggerType = GridStartTriggerType.INSTANT;
        AEQbTJ(new IceBergReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "mid", yDY.copydefault(new AdvancedTriggerSign(TtmlNode.START, gridStartTriggerType.getMode(), gridStartTriggerType.getMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4088, (DefaultConstructorMarker) null)), (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_OFF_PUSH, (DefaultConstructorMarker) null));
        copydefault(C56390yDp.OLrzqt("mid", C33070mpX.AYXKKw(C55688xof.Application.installContent)));
    }

    public final void copydefault(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        IceBergReq iceBergReqKWHzl = KWHzl();
        java.util.ArrayList<AdvancedTriggerSign> parcelableArrayList = bundle.getParcelableArrayList("trigger_sign");
        if (parcelableArrayList == null) {
            parcelableArrayList = KWHzl().getTriggerParams();
        }
        iceBergReqKWHzl.setTriggerParams(parcelableArrayList);
    }

    public final void OLrzqt(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        IceBergReq iceBergReqKWHzl = (IceBergReq) bundle.getParcelable("bot_grid_req");
        if (iceBergReqKWHzl == null) {
            iceBergReqKWHzl = KWHzl();
        }
        KWHzl().setPxLimit(iceBergReqKWHzl.getPxLimit());
    }

    public final void AEQbTJ(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        copydefault(pair);
        KWHzl().setAggressiveness(pair.getFirst());
    }

    public final java.lang.String OLrzqt() {
        return copydefault().getSecond();
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        AdvancedTriggerSign advancedTriggerSign;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList<AdvancedTriggerSign> triggerParams = KWHzl().getTriggerParams();
        if (triggerParams == null || (advancedTriggerSign = (AdvancedTriggerSign) CollectionsKt___CollectionsKt.firstOrNull(triggerParams)) == null) {
            return "";
        }
        java.lang.String indicator = advancedTriggerSign.getIndicator();
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.PRICE.getMode())) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.getClipDataUrisactivity_release);
            xMR xmr = xMR.copydefault;
            java.lang.String triggerPx = advancedTriggerSign.getTriggerPx();
            return strAYXKKw + " | " + xmr.copydefault(triggerPx != null ? triggerPx : "") + " " + str;
        }
        if (Intrinsics.EZpvd((java.lang.Object) indicator, (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
            java.lang.String str2 = TriggerCond.Companion.KWHzl(advancedTriggerSign.getTriggerCond()) + advancedTriggerSign.getOversoldThold();
            int i = C55688xof.Application.multiple;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            java.lang.String timePeriod = advancedTriggerSign.getTimePeriod();
            if (timePeriod == null) {
                timePeriod = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod);
            TimeFrame.Application application = TimeFrame.Companion;
            java.lang.String timeframe = advancedTriggerSign.getTimeframe();
            pairArr[1] = C56390yDp.OLrzqt("RSIFactor2", application.copydefault(timeframe != null ? timeframe : ""));
            pairArr[2] = C56390yDp.OLrzqt("RSIFactor3", str2);
            return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        return GridStartTriggerType.Companion.copydefault(advancedTriggerSign.getIndicator());
    }

    public final java.util.List<TradeMenuItemBean> EZpvd() {
        return yDY.copydefault(new TradeMenuItemBean(C33070mpX.AYXKKw(C55688xof.Application.getButton), Intrinsics.EZpvd((java.lang.Object) copydefault().getFirst(), (java.lang.Object) "radical"), "radical", null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null), new TradeMenuItemBean(C33070mpX.AYXKKw(C55688xof.Application.installContent), Intrinsics.EZpvd((java.lang.Object) copydefault().getFirst(), (java.lang.Object) "mid"), "mid", null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null), new TradeMenuItemBean(C33070mpX.AYXKKw(C55688xof.Application.getListView), Intrinsics.EZpvd((java.lang.Object) copydefault().getFirst(), (java.lang.Object) "conservative"), "conservative", null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.AEQbTJ(KWHzl().getPxLimit(), 0)) {
            return "";
        }
        return xMR.copydefault.copydefault(KWHzl().getPxLimit()) + " " + str;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        return iHashCode != 108104 ? iHashCode != 968810586 ? (iHashCode == 1953438253 && str.equals("conservative")) ? "passive" : "" : !str.equals("radical") ? "" : "quick" : !str.equals("mid") ? "" : "price_speed";
    }
}

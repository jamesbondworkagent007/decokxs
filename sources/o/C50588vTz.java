package o;

import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.ArbInvestDetailsBean;
import com.okinc.unify_trade.biz.ArbInvestDetailsItems;
import com.okinc.unify_trade.biz.BotSmartArbItemData;
import com.okinc.unify_trade.bot.constant.ArbInvestDetailsBeanStakingType4UI;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C55770xqH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vTz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50588vTz implements InterfaceC54501xKt<ArbInvestDetailsBean, java.util.List<? extends java.lang.Object>> {

    /* JADX INFO: renamed from: o.vTz$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ArbInvestDetailsBeanStakingType4UI.values().length];
            try {
                iArr[ArbInvestDetailsBeanStakingType4UI.STAKING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ArbInvestDetailsBeanStakingType4UI.NOT_STAKING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.util.List<java.lang.Object> KWHzl(@NotNull ArbInvestDetailsBean arbInvestDetailsBean) {
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.String lever;
        java.lang.String amt;
        java.lang.String amt2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(arbInvestDetailsBean, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = arbInvestDetailsBean.getArbItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ArbInvestDetailsItems arbInvestDetailsItems = (ArbInvestDetailsItems) next;
            if (Intrinsics.EZpvd((java.lang.Object) arbInvestDetailsItems.getInstType(), (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) arbInvestDetailsItems.getInstType(), (java.lang.Object) "MARGIN")) {
                break;
            }
        }
        ArbInvestDetailsItems arbInvestDetailsItems2 = (ArbInvestDetailsItems) next;
        arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.onConnected), C56033xvF.fmtBotValueBySymbol$default(arbInvestDetailsBean.getUnit(), (arbInvestDetailsItems2 == null || (amt2 = arbInvestDetailsItems2.getAmt()) == null) ? "" : amt2, RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.util.Iterator<T> it2 = arbInvestDetailsBean.getArbItems().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((ArbInvestDetailsItems) next2).getInstType(), (java.lang.Object) "SWAP")) {
                break;
            }
        }
        ArbInvestDetailsItems arbInvestDetailsItems3 = (ArbInvestDetailsItems) next2;
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setCallbacksMessenger);
        java.lang.String unit = arbInvestDetailsBean.getUnit();
        java.lang.String str2 = (arbInvestDetailsItems3 == null || (amt = arbInvestDetailsItems3.getAmt()) == null) ? "" : amt;
        RoundingMode roundingMode = RoundingMode.UP;
        arrayList.add(new TacticsInsideItemData(strAYXKKw, C56033xvF.fmtBotValueBySymbol$default(unit, str2, roundingMode, true, null, false, null, null, null, null, null, 2032, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.MediaBrowserCompatConnectionCallback);
        if (arbInvestDetailsItems3 != null && (lever = arbInvestDetailsItems3.getLever()) != null) {
            str = lever;
        }
        arrayList.add(new TacticsInsideItemData(strAYXKKw2, C56033xvF.getBotLever$default(str, false, 2, null), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        int i = Application.OLrzqt[arbInvestDetailsBean.isStaking().ordinal()];
        if (i == 1) {
            int i2 = C55688xof.Application.MediaBrowserCompatCallbackHandler;
            java.lang.String strKWHzl = C55770xqH.ActionBar.OLrzqt.KWHzl(arbInvestDetailsBean.getInstFamily());
            arrayList.add(new TacticsInsideItemData(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strKWHzl != null ? strKWHzl : "--"))), C33070mpX.AYXKKw(C55688xof.Application.accesstrackPipAnimationHintViewpositionInWindow), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        } else if (i == 2) {
            int i3 = C55688xof.Application.MediaBrowserCompatCallbackHandler;
            java.lang.String strKWHzl2 = C55770xqH.ActionBar.OLrzqt.KWHzl(arbInvestDetailsBean.getInstFamily());
            arrayList.add(new TacticsInsideItemData(C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, strKWHzl2 != null ? strKWHzl2 : "--"))), C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintView2), null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 131068, null));
        }
        arrayList.add(new BotSmartArbItemData(C33070mpX.AYXKKw(C55688xof.Application.handleMessage), C56033xvF.fmtBotValueBySymbol$default(arbInvestDetailsBean.getUnit(), arbInvestDetailsBean.getTotalAmt(), roundingMode, true, null, false, null, null, null, null, null, 2032, null)));
        return arrayList;
    }
}

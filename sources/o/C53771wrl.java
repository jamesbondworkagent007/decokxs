package o;

import com.okinc.tradingbot.impl.share.ShareChartDataPoint;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyProfitResponse;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55159xeg;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wrl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53771wrl extends C55159xeg.ActionBar<ShareChartDataPoint> {
    public final TacticsData AEQbTJ;

    @Override // o.C55159xeg.ActionBar
    public float AEQbTJ() {
        return 1.0f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/xeq;)Ljava/lang/String; */
    @Override // o.C55159xeg.ActionBar
    public java.lang.String AEQbTJ(@NotNull ShareChartDataPoint shareChartDataPoint) {
        Intrinsics.checkNotNullParameter(shareChartDataPoint, "");
        return "";
    }

    /* JADX INFO: renamed from: o.wrl$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(((ShareChartDataPoint) t).OLrzqt()), java.lang.Long.valueOf(((ShareChartDataPoint) t2).OLrzqt()));
        }
    }

    public C53771wrl(@NotNull TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(tacticsData, "");
        this.AEQbTJ = tacticsData;
    }

    public static /* synthetic */ void drawChart$default(C53771wrl c53771wrl, java.util.List list, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            bool = null;
        }
        c53771wrl.EZpvd((java.util.List<StrategyProfitResponse>) list, bool);
    }

    public final void EZpvd(@NotNull java.util.List<StrategyProfitResponse> list, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(list, "");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        java.util.List<ShareChartDataPoint> listEZpvd = EZpvd(list, zBooleanValue, bool);
        if (listEZpvd.isEmpty()) {
            listEZpvd = EZpvd(list, !zBooleanValue, bool);
        }
        KWHzl(listEZpvd, true);
    }

    public final java.util.List<ShareChartDataPoint> EZpvd(java.util.List<StrategyProfitResponse> list, boolean z, java.lang.Boolean bool) {
        java.lang.String pnlRatio;
        java.lang.String strCopydefault;
        ShareChartDataPoint shareChartDataPoint;
        BizInstrument suggestedInstrument$default;
        StrategyProfitResponse strategyProfitResponse = (StrategyProfitResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        java.lang.String sourceCcy = strategyProfitResponse != null ? strategyProfitResponse.getSourceCcy() : null;
        if (sourceCcy == null) {
            sourceCcy = "";
        }
        boolean z2 = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StrategyProfitResponse strategyProfitResponse2 = (StrategyProfitResponse) it.next();
            if (z && z2) {
                pnlRatio = strategyProfitResponse2.getTotalPnlInSourceCcy();
            } else if (z && !z2) {
                pnlRatio = strategyProfitResponse2.getTotalPnl();
            } else if (!z && z2) {
                pnlRatio = strategyProfitResponse2.getPnlRatioInSourceCcy();
            } else {
                pnlRatio = strategyProfitResponse2.getPnlRatio();
            }
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) pnlRatio)) {
                shareChartDataPoint = null;
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                boolean zEZpvd = (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, this.AEQbTJ.getInstType(), this.AEQbTJ.getInstId(), null, null, 12, null)) == null) ? false : Intrinsics.EZpvd(suggestedInstrument$default.isNegativeContract(), java.lang.Boolean.TRUE);
                java.lang.String pnlUnit = this.AEQbTJ.getShareData().getPnlUnit();
                java.lang.String priceUnit = this.AEQbTJ.getShareData().getPriceUnit();
                if (pnlUnit == null || pnlUnit.length() == 0) {
                    pnlUnit = priceUnit;
                }
                boolean z3 = StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy) || zEZpvd;
                if (bool != null && !Intrinsics.EZpvd(bool, java.lang.Boolean.valueOf(z))) {
                    strCopydefault = "";
                } else if (z) {
                    strCopydefault = C56033xvF.getBotPnl$default(z3 ? this.AEQbTJ.getInstId() : "", z3 ? this.AEQbTJ.getInstType() : "", pnlRatio, StringsKt__StringsKt.fARcdN((java.lang.CharSequence) sourceCcy) ? pnlUnit : sourceCcy, true, true, null, false, this.AEQbTJ.takeNonBlankTradeQuoteCcy(), null, null, 1728, null);
                } else {
                    strCopydefault = C56068xvo.copydefault.copydefault(pnlRatio, true);
                }
                shareChartDataPoint = new ShareChartDataPoint(C33129mqd.djBIcL(pnlRatio), C33129mqd.valueOf(strategyProfitResponse2.getCTime()), strCopydefault);
            }
            arrayList.add(shareChartDataPoint);
        }
        java.util.List<ShareChartDataPoint> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.QfsBiF(arrayList), new Application()));
        if (listFJNWhG.size() == 1) {
            listFJNWhG.add(0, new ShareChartDataPoint(0.0f, 0L, null, 7, null));
        }
        return listFJNWhG;
    }

    @Override // o.C55159xeg.ActionBar
    public C55170xer OLrzqt() {
        return C55170xer.Companion.copydefault();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Lo/xeq;)Z */
    @Override // o.C55159xeg.ActionBar
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(ShareChartDataPoint shareChartDataPoint) {
        return C33129mqd.copydefault((java.lang.Object) this.AEQbTJ.getShareData().getMainDataValue(), (java.lang.Object) 0);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/xeq;)Ljava/lang/String; */
    @Override // o.C55159xeg.ActionBar
    public java.lang.String EZpvd(@NotNull ShareChartDataPoint shareChartDataPoint) {
        Intrinsics.checkNotNullParameter(shareChartDataPoint, "");
        return shareChartDataPoint.copydefault();
    }
}

package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaAdvancedParams;
import com.okinc.tradingbot.impl.order.strategy.spotdca.model.SpotDcaEditParam;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.config.TimeFrame;
import com.okinc.unify_trade.bot.config.TriggerCond;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wkd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53392wkd implements InterfaceC54501xKt<TacticsData, C53393wke> {
    public final StrategyConfigInfo AEQbTJ;
    public final SpotDcaEditParam EZpvd;
    public java.lang.String OLrzqt = "";
    public java.lang.String copydefault = "";
    public java.lang.String KWHzl = "";

    /* JADX INFO: renamed from: o.wkd$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GridStartTriggerType.values().length];
            try {
                iArr[GridStartTriggerType.RSI_14.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            KWHzl = iArr;
        }
    }

    public C53392wkd(SpotDcaEditParam spotDcaEditParam, StrategyConfigInfo strategyConfigInfo) {
        this.EZpvd = spotDcaEditParam;
        this.AEQbTJ = strategyConfigInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(@NotNull TacticsData tacticsData) {
        boolean z;
        boolean z2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk3;
        SpotDcaEditParam spotDcaEditParam;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk4;
        java.util.List<DcaTriggerParam> listAYXKKw;
        DcaTriggerParam dcaTriggerParam;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna;
        java.util.List<DcaTriggerParam> listAYXKKw2;
        DcaTriggerParam dcaTriggerParam2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna2;
        java.util.List<DcaTriggerParam> listAYXKKw3;
        DcaTriggerParam dcaTriggerParam3;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk5;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna3;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk6;
        java.lang.String strFetchVPNInfo;
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        java.lang.String effectivePxSteps = tacticsData.getEffectivePxSteps();
        java.lang.String effectiveTpPct = tacticsData.getEffectiveTpPct();
        java.lang.String effectiveInitOrdAmt = tacticsData.getEffectiveInitOrdAmt();
        java.lang.String effectiveSafetyOrdAmt = tacticsData.getEffectiveSafetyOrdAmt();
        java.lang.String effectiveMaxSafetyOrds = tacticsData.getEffectiveMaxSafetyOrds();
        java.lang.Boolean effectiveReserveFunds = tacticsData.getEffectiveReserveFunds();
        SpotDcaEditParam spotDcaEditParam2 = this.EZpvd;
        java.lang.String strEZpvd = null;
        boolean z3 = !C33129mqd.OLrzqt((spotDcaEditParam2 == null || (strAYXKKw = spotDcaEditParam2.AYXKKw()) == null) ? null : xMR.formatHundredQuot$default(xMR.copydefault, strAYXKKw, 0, true, null, 10, null), effectivePxSteps);
        SpotDcaEditParam spotDcaEditParam3 = this.EZpvd;
        boolean z4 = !C33129mqd.OLrzqt((spotDcaEditParam3 == null || (strFetchVPNInfo = spotDcaEditParam3.fetchVPNInfo()) == null) ? null : xMR.formatHundredQuot$default(xMR.copydefault, strFetchVPNInfo, 0, true, null, 10, null), effectiveTpPct);
        SpotDcaEditParam spotDcaEditParam4 = this.EZpvd;
        boolean z5 = !C33129mqd.OLrzqt(spotDcaEditParam4 != null ? spotDcaEditParam4.KWHzl() : null, effectiveInitOrdAmt);
        SpotDcaEditParam spotDcaEditParam5 = this.EZpvd;
        boolean z6 = !C33129mqd.OLrzqt(spotDcaEditParam5 != null ? spotDcaEditParam5.isConnected() : null, effectiveSafetyOrdAmt);
        SpotDcaEditParam spotDcaEditParam6 = this.EZpvd;
        boolean z7 = !C33129mqd.OLrzqt(spotDcaEditParam6 != null ? spotDcaEditParam6.valueOf() : null, effectiveMaxSafetyOrds);
        SpotDcaEditParam spotDcaEditParam7 = this.EZpvd;
        java.lang.String strOLrzqt = spotDcaEditParam7 != null ? spotDcaEditParam7.OLrzqt() : null;
        SpotDcaEditParam spotDcaEditParam8 = this.EZpvd;
        boolean z8 = !C33129mqd.OLrzqt(strOLrzqt, spotDcaEditParam8 != null ? spotDcaEditParam8.gEmmrt() : null);
        SpotDcaEditParam spotDcaEditParam9 = this.EZpvd;
        boolean z9 = !Intrinsics.EZpvd(spotDcaEditParam9 != null ? java.lang.Boolean.valueOf(spotDcaEditParam9.values()) : null, effectiveReserveFunds);
        SpotDcaAdvancedParams spotDcaAdvancedParamsAEQbTJ = AEQbTJ(C55998xuX.copydefault.EZpvd(tacticsData));
        SpotDcaEditParam spotDcaEditParam10 = this.EZpvd;
        GridStartTriggerType gridStartTriggerTypeAEQbTJ = (spotDcaEditParam10 == null || (spotDcaAdvancedParamsDbNXlk6 = spotDcaEditParam10.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk6.AEQbTJ();
        SpotDcaEditParam spotDcaEditParam11 = this.EZpvd;
        boolean z10 = gridStartTriggerTypeAEQbTJ != ((spotDcaEditParam11 == null || (spotDcaAdvancedParamsAhwBna3 = spotDcaEditParam11.AhwBna()) == null) ? null : spotDcaAdvancedParamsAhwBna3.AEQbTJ());
        SpotDcaEditParam spotDcaEditParam12 = this.EZpvd;
        if (((spotDcaEditParam12 == null || (spotDcaAdvancedParamsDbNXlk5 = spotDcaEditParam12.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk5.AEQbTJ()) == GridStartTriggerType.INSTANT || (spotDcaEditParam = this.EZpvd) == null || (spotDcaAdvancedParamsDbNXlk4 = spotDcaEditParam.DbNXlk()) == null || (listAYXKKw = spotDcaAdvancedParamsDbNXlk4.AYXKKw()) == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw)) == null) {
            z = true;
        } else {
            java.lang.String thold = dcaTriggerParam.getThold();
            SpotDcaEditParam spotDcaEditParam13 = this.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) thold, (java.lang.Object) ((spotDcaEditParam13 == null || (spotDcaAdvancedParamsAhwBna2 = spotDcaEditParam13.AhwBna()) == null || (listAYXKKw3 = spotDcaAdvancedParamsAhwBna2.AYXKKw()) == null || (dcaTriggerParam3 = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw3)) == null) ? null : dcaTriggerParam3.getThold()))) {
                java.lang.String timeframe = dcaTriggerParam.getTimeframe();
                SpotDcaEditParam spotDcaEditParam14 = this.EZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) timeframe, (java.lang.Object) ((spotDcaEditParam14 == null || (spotDcaAdvancedParamsAhwBna = spotDcaEditParam14.AhwBna()) == null || (listAYXKKw2 = spotDcaAdvancedParamsAhwBna.AYXKKw()) == null || (dcaTriggerParam2 = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw2)) == null) ? null : dcaTriggerParam2.getTimeframe()))) {
                }
            }
            z = false;
        }
        boolean z11 = z10 || !z;
        SpotDcaEditParam spotDcaEditParam15 = this.EZpvd;
        if (C33129mqd.OLrzqt((spotDcaEditParam15 == null || (spotDcaAdvancedParamsDbNXlk3 = spotDcaEditParam15.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk3.AhwBna(), spotDcaAdvancedParamsAEQbTJ.AhwBna())) {
            SpotDcaEditParam spotDcaEditParam16 = this.EZpvd;
            if (C33129mqd.OLrzqt((spotDcaEditParam16 == null || (spotDcaAdvancedParamsDbNXlk2 = spotDcaEditParam16.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk2.OLrzqt(), spotDcaAdvancedParamsAEQbTJ.OLrzqt())) {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        SpotDcaEditParam spotDcaEditParam17 = this.EZpvd;
        if (spotDcaEditParam17 != null && (spotDcaAdvancedParamsDbNXlk = spotDcaEditParam17.DbNXlk()) != null) {
            strEZpvd = spotDcaAdvancedParamsDbNXlk.EZpvd();
        }
        boolean z12 = !C33129mqd.OLrzqt(strEZpvd, spotDcaAdvancedParamsAEQbTJ.EZpvd());
        pUU.copydefault("SpotDcaEditParamsDataMapper isChanged isShowPxStep=" + z3 + " isShowTpPct=" + z4 + " isShowIntAmt=" + z5 + " isShowSafetyAmt =" + z6 + " isShowMaxSafetyOrderNum=" + z7 + " isShowStartCondition=" + z11 + " isShowsafetyOrderSet=" + z2 + " isShowSlSet =" + z12 + " isShowCurrentAmt=" + z8 + " isShowReserveFund=" + z9);
        return z3 || z4 || z5 || z6 || z7 || z11 || z2 || z12 || z8 || z9;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c3e  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d37  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0e81  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0ec5  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0f2a  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0f68  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0f88  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x1000  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x101d  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x1020  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x1086  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x109c  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x10c3  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x10e0  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x129c  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x12f5  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x1307  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x132f  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x1334  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x1340  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x1358  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C53393wke KWHzl(@NotNull TacticsData tacticsData) {
        boolean z;
        boolean z2;
        java.util.ArrayList arrayList;
        boolean z3;
        java.lang.String quoteDig;
        SpotDcaEditParam spotDcaEditParam;
        java.lang.String str;
        java.lang.String strGEmmrt;
        java.lang.String strGEmmrt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        java.lang.String str2;
        java.lang.String quoteDig2;
        SpotDcaEditParam spotDcaEditParam2;
        java.lang.String str3;
        java.lang.String strOLrzqt;
        java.lang.String strOLrzqt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        java.lang.String instFamily2;
        java.lang.String str4;
        java.lang.String strAYXKKw;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk;
        java.lang.String strEZpvd;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk2;
        java.lang.String strOLrzqt3;
        java.lang.String str5;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk3;
        int i;
        java.lang.String strValueOf;
        boolean z4;
        SpotDcaEditParam spotDcaEditParam3;
        SpotDcaEditParam spotDcaEditParam4;
        java.lang.String str6;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk4;
        SpotDcaEditParam spotDcaEditParam5;
        boolean z5;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk5;
        java.lang.String strAhwBna;
        int i2;
        java.lang.String strValueOf2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk6;
        java.lang.String strOLrzqt4;
        java.lang.String strAYXKKw2;
        java.lang.String str7;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk7;
        GridStartTriggerType gridStartTriggerTypeAEQbTJ;
        java.lang.String timePeriod;
        java.lang.String timeframe;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk8;
        java.util.List<DcaTriggerParam> listAYXKKw;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk9;
        java.lang.String strAYXKKw3;
        java.lang.String quoteDig3;
        SpotDcaEditParam spotDcaEditParam6;
        java.lang.String str8;
        java.lang.String strOLrzqt5;
        SpotDcaEditParam spotDcaEditParam7;
        java.lang.String str9;
        java.lang.String strCopydefault;
        java.lang.String strCopydefault2;
        java.lang.String strOLrzqt6;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        java.lang.String instFamily3;
        java.lang.String quoteDig4;
        SpotDcaEditParam spotDcaEditParam8;
        java.lang.String str10;
        java.lang.String strOLrzqt7;
        java.lang.String strOLrzqt8;
        AbstractC54531xLw abstractC54531xLwOLrzqt4;
        java.lang.String instFamily4;
        java.lang.String strValueOf3;
        java.lang.String quoteDig5;
        SpotDcaEditParam spotDcaEditParam9;
        java.lang.String str11;
        java.lang.String strIsConnected;
        java.lang.String strIsConnected2;
        AbstractC54531xLw abstractC54531xLwOLrzqt5;
        java.lang.String instFamily5;
        java.lang.String quoteDig6;
        SpotDcaEditParam spotDcaEditParam10;
        java.lang.String str12;
        java.lang.String strKWHzl;
        java.lang.String strKWHzl2;
        AbstractC54531xLw abstractC54531xLwOLrzqt6;
        java.lang.String instFamily6;
        java.lang.String percent$default;
        java.lang.String strFetchVPNInfo;
        java.lang.String strFetchVPNInfo2;
        java.lang.String percent$default2;
        java.lang.String strAYXKKw4;
        java.lang.String strAYXKKw5;
        java.lang.String strAYXKKw6;
        int i3;
        java.lang.String str13;
        int i4;
        java.lang.String str14;
        java.lang.String timePeriod2;
        java.lang.String timeframe2;
        java.lang.String strCopydefault3;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna;
        java.util.List<DcaTriggerParam> listAYXKKw2;
        java.lang.String str15;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna2;
        GridStartTriggerType gridStartTriggerTypeAEQbTJ2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna3;
        java.lang.String strAYXKKw7;
        java.lang.String quoteDig7;
        SpotDcaEditParam spotDcaEditParam11;
        java.lang.String str16;
        java.lang.String strGEmmrt3;
        SpotDcaEditParam spotDcaEditParam12;
        java.lang.String str17;
        java.lang.String strDjBIcL;
        java.lang.String strDjBIcL2;
        java.lang.String strGEmmrt4;
        AbstractC54531xLw abstractC54531xLwOLrzqt7;
        java.lang.String instFamily7;
        java.lang.String quoteDig8;
        SpotDcaEditParam spotDcaEditParam13;
        java.lang.String str18;
        java.lang.String strGEmmrt5;
        java.lang.String strGEmmrt6;
        AbstractC54531xLw abstractC54531xLwOLrzqt8;
        java.lang.String instFamily8;
        java.lang.String quoteDig9;
        java.lang.String str19;
        AbstractC54531xLw abstractC54531xLwOLrzqt9;
        java.lang.String instFamily9;
        java.lang.String quoteDig10;
        java.lang.String str20;
        AbstractC54531xLw abstractC54531xLwOLrzqt10;
        java.lang.String instFamily10;
        boolean z6;
        java.lang.String percent$default3;
        boolean z7;
        java.util.ArrayList arrayList2;
        java.lang.String percent$default4;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk10;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk11;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk12;
        SpotDcaEditParam spotDcaEditParam14;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk13;
        java.util.List<DcaTriggerParam> listAYXKKw3;
        DcaTriggerParam dcaTriggerParam;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna4;
        java.util.List<DcaTriggerParam> listAYXKKw4;
        DcaTriggerParam dcaTriggerParam2;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna5;
        java.util.List<DcaTriggerParam> listAYXKKw5;
        DcaTriggerParam dcaTriggerParam3;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk14;
        SpotDcaAdvancedParams spotDcaAdvancedParamsAhwBna6;
        SpotDcaAdvancedParams spotDcaAdvancedParamsDbNXlk15;
        java.lang.String strFetchVPNInfo3;
        java.lang.String strAYXKKw8;
        Intrinsics.checkNotNullParameter(tacticsData, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, tacticsData.getInstType(), tacticsData.getInstId(), null, null, 12, null) : null;
        this.OLrzqt = tacticsData.getInstId();
        this.copydefault = tacticsData.getInstType();
        java.lang.String tradeQuoteCcy = tacticsData.getTradeQuoteCcy();
        if (tradeQuoteCcy == null) {
            tradeQuoteCcy = suggestedInstrument$default != null ? suggestedInstrument$default.getDisplayQuoteSymbol() : null;
            if (tradeQuoteCcy == null) {
                tradeQuoteCcy = C56033xvF.AEQbTJ(this.copydefault, this.OLrzqt);
            }
        }
        this.KWHzl = tradeQuoteCcy;
        java.lang.String effectivePxSteps = tacticsData.getEffectivePxSteps();
        java.lang.String effectiveTpPct = tacticsData.getEffectiveTpPct();
        java.lang.String effectiveInitOrdAmt = tacticsData.getEffectiveInitOrdAmt();
        java.lang.String effectiveSafetyOrdAmt = tacticsData.getEffectiveSafetyOrdAmt();
        java.lang.String effectiveMaxSafetyOrds = tacticsData.getEffectiveMaxSafetyOrds();
        java.lang.Boolean effectiveReserveFunds = tacticsData.getEffectiveReserveFunds();
        SpotDcaEditParam spotDcaEditParam15 = this.EZpvd;
        boolean z8 = !C33129mqd.OLrzqt((spotDcaEditParam15 == null || (strAYXKKw8 = spotDcaEditParam15.AYXKKw()) == null) ? null : xMR.formatHundredQuot$default(xMR.copydefault, strAYXKKw8, 0, true, null, 10, null), effectivePxSteps);
        SpotDcaEditParam spotDcaEditParam16 = this.EZpvd;
        boolean z9 = !C33129mqd.OLrzqt((spotDcaEditParam16 == null || (strFetchVPNInfo3 = spotDcaEditParam16.fetchVPNInfo()) == null) ? null : xMR.formatHundredQuot$default(xMR.copydefault, strFetchVPNInfo3, 0, true, null, 10, null), effectiveTpPct);
        SpotDcaEditParam spotDcaEditParam17 = this.EZpvd;
        boolean z10 = !C33129mqd.OLrzqt(spotDcaEditParam17 != null ? spotDcaEditParam17.KWHzl() : null, effectiveInitOrdAmt);
        SpotDcaEditParam spotDcaEditParam18 = this.EZpvd;
        boolean z11 = !C33129mqd.OLrzqt(spotDcaEditParam18 != null ? spotDcaEditParam18.isConnected() : null, effectiveSafetyOrdAmt);
        SpotDcaEditParam spotDcaEditParam19 = this.EZpvd;
        boolean z12 = !C33129mqd.OLrzqt(spotDcaEditParam19 != null ? spotDcaEditParam19.valueOf() : null, effectiveMaxSafetyOrds);
        SpotDcaEditParam spotDcaEditParam20 = this.EZpvd;
        java.lang.String strOLrzqt9 = spotDcaEditParam20 != null ? spotDcaEditParam20.OLrzqt() : null;
        SpotDcaEditParam spotDcaEditParam21 = this.EZpvd;
        boolean z13 = !C33129mqd.OLrzqt(strOLrzqt9, spotDcaEditParam21 != null ? spotDcaEditParam21.gEmmrt() : null);
        SpotDcaEditParam spotDcaEditParam22 = this.EZpvd;
        boolean z14 = !Intrinsics.EZpvd(spotDcaEditParam22 != null ? java.lang.Boolean.valueOf(spotDcaEditParam22.values()) : null, effectiveReserveFunds);
        SpotDcaAdvancedParams spotDcaAdvancedParamsAEQbTJ = AEQbTJ(C55998xuX.copydefault.EZpvd(tacticsData));
        SpotDcaEditParam spotDcaEditParam23 = this.EZpvd;
        GridStartTriggerType gridStartTriggerTypeAEQbTJ3 = (spotDcaEditParam23 == null || (spotDcaAdvancedParamsDbNXlk15 = spotDcaEditParam23.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk15.AEQbTJ();
        SpotDcaEditParam spotDcaEditParam24 = this.EZpvd;
        boolean z15 = gridStartTriggerTypeAEQbTJ3 != ((spotDcaEditParam24 == null || (spotDcaAdvancedParamsAhwBna6 = spotDcaEditParam24.AhwBna()) == null) ? null : spotDcaAdvancedParamsAhwBna6.AEQbTJ());
        SpotDcaEditParam spotDcaEditParam25 = this.EZpvd;
        if (((spotDcaEditParam25 == null || (spotDcaAdvancedParamsDbNXlk14 = spotDcaEditParam25.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk14.AEQbTJ()) == GridStartTriggerType.INSTANT || (spotDcaEditParam14 = this.EZpvd) == null || (spotDcaAdvancedParamsDbNXlk13 = spotDcaEditParam14.DbNXlk()) == null || (listAYXKKw3 = spotDcaAdvancedParamsDbNXlk13.AYXKKw()) == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw3)) == null) {
            z = true;
        } else {
            java.lang.String thold = dcaTriggerParam.getThold();
            SpotDcaEditParam spotDcaEditParam26 = this.EZpvd;
            if (Intrinsics.EZpvd((java.lang.Object) thold, (java.lang.Object) ((spotDcaEditParam26 == null || (spotDcaAdvancedParamsAhwBna5 = spotDcaEditParam26.AhwBna()) == null || (listAYXKKw5 = spotDcaAdvancedParamsAhwBna5.AYXKKw()) == null || (dcaTriggerParam3 = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw5)) == null) ? null : dcaTriggerParam3.getThold()))) {
                java.lang.String timeframe3 = dcaTriggerParam.getTimeframe();
                SpotDcaEditParam spotDcaEditParam27 = this.EZpvd;
                if (Intrinsics.EZpvd((java.lang.Object) timeframe3, (java.lang.Object) ((spotDcaEditParam27 == null || (spotDcaAdvancedParamsAhwBna4 = spotDcaEditParam27.AhwBna()) == null || (listAYXKKw4 = spotDcaAdvancedParamsAhwBna4.AYXKKw()) == null || (dcaTriggerParam2 = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw4)) == null) ? null : dcaTriggerParam2.getTimeframe()))) {
                }
            }
            z = false;
        }
        boolean z16 = z15 || !z;
        SpotDcaEditParam spotDcaEditParam28 = this.EZpvd;
        if (C33129mqd.OLrzqt((spotDcaEditParam28 == null || (spotDcaAdvancedParamsDbNXlk12 = spotDcaEditParam28.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk12.AhwBna(), spotDcaAdvancedParamsAEQbTJ.AhwBna())) {
            SpotDcaEditParam spotDcaEditParam29 = this.EZpvd;
            if (C33129mqd.OLrzqt((spotDcaEditParam29 == null || (spotDcaAdvancedParamsDbNXlk11 = spotDcaEditParam29.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk11.OLrzqt(), spotDcaAdvancedParamsAEQbTJ.OLrzqt())) {
                z2 = false;
            }
        } else {
            z2 = true;
        }
        SpotDcaEditParam spotDcaEditParam30 = this.EZpvd;
        boolean z17 = !C33129mqd.OLrzqt((spotDcaEditParam30 == null || (spotDcaAdvancedParamsDbNXlk10 = spotDcaEditParam30.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk10.EZpvd(), spotDcaAdvancedParamsAEQbTJ.EZpvd());
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.newPercentageRating), null, null, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0, 0, C52761wXj.LoaderManager.fjfviF, null, null, null, null, null, null, null, null, null, 130934, null));
        if (z8) {
            if (effectivePxSteps != null) {
                z7 = true;
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) effectivePxSteps)) {
                    arrayList2 = arrayList3;
                    percent$default4 = "--";
                }
                java.lang.String strAYXKKw9 = C33070mpX.AYXKKw(C55688xof.Application.zblBkD);
                java.lang.String str21 = percent$default4 != null ? "" : percent$default4;
                arrayList = arrayList2;
                arrayList.add(new TacticsInsideItemData(strAYXKKw9, str21, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            } else {
                z7 = true;
            }
            if (effectivePxSteps != null) {
                arrayList2 = arrayList3;
                percent$default4 = xMR.formatPercent$default(xMR.copydefault, effectivePxSteps, 0, 2, RoundingMode.DOWN, 2, null);
            } else {
                arrayList2 = arrayList3;
                percent$default4 = null;
            }
            java.lang.String strAYXKKw92 = C33070mpX.AYXKKw(C55688xof.Application.zblBkD);
            if (percent$default4 != null) {
            }
            arrayList = arrayList2;
            arrayList.add(new TacticsInsideItemData(strAYXKKw92, str21, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        } else {
            arrayList = arrayList3;
        }
        if (z9) {
            if (effectiveTpPct != null) {
                z6 = true;
                if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) effectiveTpPct)) {
                    z3 = true;
                    percent$default3 = "--";
                }
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), percent$default3 != null ? "" : percent$default3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            } else {
                z6 = true;
            }
            if (effectiveTpPct != null) {
                z3 = z6;
                percent$default3 = xMR.formatPercent$default(xMR.copydefault, effectiveTpPct, 0, 2, RoundingMode.DOWN, 2, null);
            } else {
                z3 = z6;
                percent$default3 = null;
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), percent$default3 != null ? "" : percent$default3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        } else {
            z3 = true;
        }
        if (z10) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt10 = interfaceC54581xNrOLrzqt2.OLrzqt(tacticsData.getInstType())) == null) {
                quoteDig10 = null;
                if (effectiveInitOrdAmt == null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) effectiveInitOrdAmt) == z3) {
                    str20 = "--";
                } else {
                    java.lang.String strFmtBotValueBySymbol$default = effectiveInitOrdAmt == null ? C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, effectiveInitOrdAmt, RoundingMode.UP, false, quoteDig10, false, null, null, null, null, null, 2024, null) : null;
                    str20 = strFmtBotValueBySymbol$default + " " + this.KWHzl;
                }
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), str20, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            } else {
                if (suggestedInstrument$default == null || (instFamily10 = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily10 = "";
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt10.AkhnZx(instFamily10);
                if (idxConfigAkhnZx != null) {
                    quoteDig10 = idxConfigAkhnZx.getQuoteDig();
                }
                if (effectiveInitOrdAmt == null) {
                    if (effectiveInitOrdAmt == null) {
                    }
                    str20 = strFmtBotValueBySymbol$default + " " + this.KWHzl;
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), str20, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                }
            }
        }
        if (z11) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt3 == null || (abstractC54531xLwOLrzqt9 = interfaceC54581xNrOLrzqt3.OLrzqt(tacticsData.getInstType())) == null) {
                quoteDig9 = null;
                if (effectiveSafetyOrdAmt == null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) effectiveSafetyOrdAmt) == z3) {
                    str19 = "--";
                } else {
                    java.lang.String strFmtBotValueBySymbol$default2 = effectiveSafetyOrdAmt == null ? C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, effectiveSafetyOrdAmt, RoundingMode.UP, false, quoteDig9, false, null, null, null, null, null, 2024, null) : null;
                    str19 = strFmtBotValueBySymbol$default2 + " " + this.KWHzl;
                }
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), str19, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            } else {
                if (suggestedInstrument$default == null || (instFamily9 = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily9 = "";
                }
                IdxConfig idxConfigAkhnZx2 = abstractC54531xLwOLrzqt9.AkhnZx(instFamily9);
                if (idxConfigAkhnZx2 != null) {
                    quoteDig9 = idxConfigAkhnZx2.getQuoteDig();
                }
                if (effectiveSafetyOrdAmt == null) {
                    if (effectiveSafetyOrdAmt == null) {
                    }
                    str19 = strFmtBotValueBySymbol$default2 + " " + this.KWHzl;
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), str19, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                }
            }
        }
        if (z12) {
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.spnCvw), effectiveMaxSafetyOrds == null ? "" : effectiveMaxSafetyOrds, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        if (z14) {
            java.lang.String strAYXKKw10 = C33070mpX.AYXKKw(C55688xof.Application.OHqIaq);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(effectiveReserveFunds, bool)) {
                strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.accesstrackPipAnimationHintViewpositionInWindow);
            } else {
                strAYXKKw7 = C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintView2);
            }
            arrayList.add(new TacticsInsideItemData(strAYXKKw10, strAYXKKw7, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            if (Intrinsics.EZpvd(effectiveReserveFunds, bool)) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt4 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt4 == null || (abstractC54531xLwOLrzqt8 = interfaceC54581xNrOLrzqt4.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig8 = null;
                    spotDcaEditParam13 = this.EZpvd;
                    if (spotDcaEditParam13 == null && (strGEmmrt6 = spotDcaEditParam13.gEmmrt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt6) == z3) {
                        str18 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam31 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default3 = (spotDcaEditParam31 != null || (strGEmmrt5 = spotDcaEditParam31.gEmmrt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strGEmmrt5, RoundingMode.UP, false, quoteDig8, false, null, null, null, null, null, 2024, null);
                        str18 = strFmtBotValueBySymbol$default3 + " " + this.KWHzl;
                    }
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str18 != null ? "--" : str18, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily8 = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily8 = "";
                    }
                    IdxConfig idxConfigAkhnZx3 = abstractC54531xLwOLrzqt8.AkhnZx(instFamily8);
                    if (idxConfigAkhnZx3 != null) {
                        quoteDig8 = idxConfigAkhnZx3.getQuoteDig();
                    }
                    spotDcaEditParam13 = this.EZpvd;
                    if (spotDcaEditParam13 == null) {
                        SpotDcaEditParam spotDcaEditParam312 = this.EZpvd;
                        if (spotDcaEditParam312 != null) {
                            str18 = strFmtBotValueBySymbol$default3 + " " + this.KWHzl;
                            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str18 != null ? "--" : str18, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                        }
                    }
                }
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt5 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt5 == null || (abstractC54531xLwOLrzqt7 = interfaceC54581xNrOLrzqt5.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig7 = null;
                    spotDcaEditParam11 = this.EZpvd;
                    if (spotDcaEditParam11 == null && (strGEmmrt4 = spotDcaEditParam11.gEmmrt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt4) == z3) {
                        str16 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam32 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default4 = (spotDcaEditParam32 != null || (strGEmmrt3 = spotDcaEditParam32.gEmmrt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strGEmmrt3, RoundingMode.UP, false, quoteDig7, false, null, null, null, null, null, 2024, null);
                        str16 = strFmtBotValueBySymbol$default4 + " " + this.KWHzl;
                    }
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str16 != null ? "--" : str16, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                    spotDcaEditParam12 = this.EZpvd;
                    if (spotDcaEditParam12 == null && (strDjBIcL2 = spotDcaEditParam12.djBIcL()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDjBIcL2) == z3) {
                        str17 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam33 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default5 = (spotDcaEditParam33 != null || (strDjBIcL = spotDcaEditParam33.djBIcL()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strDjBIcL, RoundingMode.UP, false, quoteDig7, false, null, null, null, null, null, 2024, null);
                        str17 = strFmtBotValueBySymbol$default5 + " " + this.KWHzl;
                    }
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIdCUTEI), str17 != null ? "--" : str17, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily7 = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily7 = "";
                    }
                    IdxConfig idxConfigAkhnZx4 = abstractC54531xLwOLrzqt7.AkhnZx(instFamily7);
                    if (idxConfigAkhnZx4 != null) {
                        quoteDig7 = idxConfigAkhnZx4.getQuoteDig();
                    }
                    spotDcaEditParam11 = this.EZpvd;
                    if (spotDcaEditParam11 == null) {
                        SpotDcaEditParam spotDcaEditParam322 = this.EZpvd;
                        if (spotDcaEditParam322 != null) {
                            str16 = strFmtBotValueBySymbol$default4 + " " + this.KWHzl;
                            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str16 != null ? "--" : str16, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                            spotDcaEditParam12 = this.EZpvd;
                            if (spotDcaEditParam12 == null) {
                                SpotDcaEditParam spotDcaEditParam332 = this.EZpvd;
                                if (spotDcaEditParam332 != null) {
                                    str17 = strFmtBotValueBySymbol$default5 + " " + this.KWHzl;
                                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIdCUTEI), str17 != null ? "--" : str17, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (z13) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt6 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt6 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt6.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig = null;
                    spotDcaEditParam = this.EZpvd;
                    if (spotDcaEditParam == null && (strGEmmrt2 = spotDcaEditParam.gEmmrt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt2) == z3) {
                        str = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam34 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default6 = (spotDcaEditParam34 != null || (strGEmmrt = spotDcaEditParam34.gEmmrt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strGEmmrt, RoundingMode.UP, false, quoteDig, false, null, null, null, null, null, 2024, null);
                        str = strFmtBotValueBySymbol$default6 + " " + this.KWHzl;
                    }
                    arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str != null ? "--" : str, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    IdxConfig idxConfigAkhnZx5 = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
                    if (idxConfigAkhnZx5 != null) {
                        quoteDig = idxConfigAkhnZx5.getQuoteDig();
                    }
                    spotDcaEditParam = this.EZpvd;
                    if (spotDcaEditParam == null) {
                        SpotDcaEditParam spotDcaEditParam342 = this.EZpvd;
                        if (spotDcaEditParam342 != null) {
                            str = strFmtBotValueBySymbol$default6 + " " + this.KWHzl;
                            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str != null ? "--" : str, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
                        }
                    }
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z16) {
            SpotDcaEditParam spotDcaEditParam35 = this.EZpvd;
            GridStartTriggerType gridStartTriggerTypeAEQbTJ4 = (spotDcaEditParam35 == null || (spotDcaAdvancedParamsAhwBna3 = spotDcaEditParam35.AhwBna()) == null) ? null : spotDcaAdvancedParamsAhwBna3.AEQbTJ();
            if (gridStartTriggerTypeAEQbTJ4 != null && StateListAnimator.KWHzl[gridStartTriggerTypeAEQbTJ4.ordinal()] == z3) {
                SpotDcaEditParam spotDcaEditParam36 = this.EZpvd;
                DcaTriggerParam dcaTriggerParam4 = (spotDcaEditParam36 == null || (spotDcaAdvancedParamsAhwBna = spotDcaEditParam36.AhwBna()) == null || (listAYXKKw2 = spotDcaAdvancedParamsAhwBna.AYXKKw()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw2);
                java.lang.String str22 = TriggerCond.Companion.KWHzl(dcaTriggerParam4 != null ? dcaTriggerParam4.getTriggerCond() : null) + (dcaTriggerParam4 != null ? dcaTriggerParam4.getThold() : null);
                int i5 = C55688xof.Application.multiple;
                str2 = "";
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                if (dcaTriggerParam4 == null || (timePeriod2 = dcaTriggerParam4.getTimePeriod()) == null) {
                    timePeriod2 = str2;
                }
                pairArr[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod2);
                TimeFrame.Application application = TimeFrame.Companion;
                if (dcaTriggerParam4 == null || (timeframe2 = dcaTriggerParam4.getTimeframe()) == null) {
                    timeframe2 = str2;
                }
                pairArr[1] = C56390yDp.OLrzqt("RSIFactor2", application.copydefault(timeframe2));
                pairArr[2] = C56390yDp.OLrzqt("RSIFactor3", str22);
                strCopydefault3 = C33069mpW.copydefault(i5, C56424yEw.gEmmrt(pairArr));
            } else {
                str2 = "";
                SpotDcaEditParam spotDcaEditParam37 = this.EZpvd;
                strCopydefault3 = (spotDcaEditParam37 == null || (spotDcaAdvancedParamsAhwBna2 = spotDcaEditParam37.AhwBna()) == null || (gridStartTriggerTypeAEQbTJ2 = spotDcaAdvancedParamsAhwBna2.AEQbTJ()) == null) ? null : C33070mpX.AYXKKw(gridStartTriggerTypeAEQbTJ2.getDesc());
                if (strCopydefault3 == null) {
                    str15 = str2;
                }
                arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), str15, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            }
            str15 = strCopydefault3;
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), str15, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        } else {
            str2 = "";
        }
        if (z2) {
            java.lang.String strOLrzqt10 = spotDcaAdvancedParamsAEQbTJ.OLrzqt();
            if (strOLrzqt10 == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt10)) {
                xMR xmr = xMR.copydefault;
                java.lang.String strOLrzqt11 = spotDcaAdvancedParamsAEQbTJ.OLrzqt();
                if (strOLrzqt11 == null) {
                    strOLrzqt11 = str2;
                }
                i3 = 0;
                str13 = xMR.formatDownToFixed$default(xmr, strOLrzqt11, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
            } else {
                str13 = "--";
                i3 = 0;
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.call), KWHzl(str13, C33129mqd.OLrzqt(effectiveMaxSafetyOrds, java.lang.Integer.valueOf(i3)) || C33129mqd.OLrzqt((java.lang.Object) effectiveMaxSafetyOrds, (java.lang.Object) 1)), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
            java.lang.String strAhwBna2 = spotDcaAdvancedParamsAEQbTJ.AhwBna();
            if (strAhwBna2 == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna2)) {
                xMR xmr2 = xMR.copydefault;
                java.lang.String strAhwBna3 = spotDcaAdvancedParamsAEQbTJ.AhwBna();
                if (strAhwBna3 == null) {
                    strAhwBna3 = str2;
                }
                i4 = 0;
                str14 = xMR.formatDownToFixed$default(xmr2, strAhwBna3, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
            } else {
                str14 = "--";
                i4 = 0;
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.fdOvFl), KWHzl(str14, C33129mqd.OLrzqt(effectiveMaxSafetyOrds, java.lang.Integer.valueOf(i4)) || C33129mqd.OLrzqt((java.lang.Object) effectiveMaxSafetyOrds, (java.lang.Object) 1)), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        if (z17) {
            if (C33129mqd.AEQbTJ(spotDcaAdvancedParamsAEQbTJ.EZpvd(), "0")) {
                java.lang.String strEZpvd2 = spotDcaAdvancedParamsAEQbTJ.EZpvd();
                strAYXKKw6 = strEZpvd2 != null ? xMR.formatPercent$default(xMR.copydefault, strEZpvd2, 0, 2, RoundingMode.DOWN, 2, null) : null;
            } else {
                strAYXKKw6 = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            }
            arrayList.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.run), strAYXKKw6 == null ? "--" : strAYXKKw6, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.DCUTEIddSDPG)), null, null, null, null, null, null, 130036, null));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.ParceledListSliceAdapterApi21), null, null, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0, 0, C52761wXj.LoaderManager.fjfviF, null, null, null, null, null, null, null, null, null, 130934, null));
        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.iZzfmt), null, null, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), 0, 0, 0, C52761wXj.LoaderManager.AYXKKw, null, null, null, null, null, null, null, "bot_inside_one", null, 98166, null));
        if (z8) {
            SpotDcaEditParam spotDcaEditParam38 = this.EZpvd;
            if (spotDcaEditParam38 == null || (strAYXKKw5 = spotDcaEditParam38.AYXKKw()) == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw5)) {
                SpotDcaEditParam spotDcaEditParam39 = this.EZpvd;
                if (spotDcaEditParam39 == null || (strAYXKKw4 = spotDcaEditParam39.AYXKKw()) == null) {
                    percent$default2 = null;
                } else {
                    xMR xmr3 = xMR.copydefault;
                    percent$default2 = xMR.formatPercent$default(xmr3, xMR.formatHundredQuot$default(xmr3, strAYXKKw4, 0, false, null, 14, null), 0, 2, RoundingMode.DOWN, 2, null);
                }
            } else {
                percent$default2 = "--";
            }
            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.zblBkD), percent$default2 == null ? str2 : percent$default2, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z9) {
            SpotDcaEditParam spotDcaEditParam40 = this.EZpvd;
            if (spotDcaEditParam40 == null || (strFetchVPNInfo2 = spotDcaEditParam40.fetchVPNInfo()) == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo2)) {
                SpotDcaEditParam spotDcaEditParam41 = this.EZpvd;
                if (spotDcaEditParam41 == null || (strFetchVPNInfo = spotDcaEditParam41.fetchVPNInfo()) == null) {
                    percent$default = null;
                } else {
                    xMR xmr4 = xMR.copydefault;
                    percent$default = xMR.formatPercent$default(xmr4, xMR.formatHundredQuot$default(xmr4, strFetchVPNInfo, 0, false, null, 14, null), 0, 2, RoundingMode.DOWN, 2, null);
                }
            } else {
                percent$default = "--";
            }
            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DGOPHZ), percent$default == null ? str2 : percent$default, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z10) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt7 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt7 == null || (abstractC54531xLwOLrzqt6 = interfaceC54581xNrOLrzqt7.OLrzqt(tacticsData.getInstType())) == null) {
                quoteDig6 = null;
                spotDcaEditParam10 = this.EZpvd;
                if (spotDcaEditParam10 == null && (strKWHzl2 = spotDcaEditParam10.KWHzl()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl2)) {
                    str12 = "--";
                } else {
                    SpotDcaEditParam spotDcaEditParam42 = this.EZpvd;
                    java.lang.String strFmtBotValueBySymbol$default7 = (spotDcaEditParam42 != null || (strKWHzl = spotDcaEditParam42.KWHzl()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strKWHzl, RoundingMode.UP, false, quoteDig6, false, null, null, null, null, null, 2024, null);
                    str12 = strFmtBotValueBySymbol$default7 + " " + this.KWHzl;
                }
                arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), str12, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            } else {
                if (suggestedInstrument$default == null || (instFamily6 = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily6 = str2;
                }
                IdxConfig idxConfigAkhnZx6 = abstractC54531xLwOLrzqt6.AkhnZx(instFamily6);
                if (idxConfigAkhnZx6 != null) {
                    quoteDig6 = idxConfigAkhnZx6.getQuoteDig();
                }
                spotDcaEditParam10 = this.EZpvd;
                if (spotDcaEditParam10 == null) {
                    SpotDcaEditParam spotDcaEditParam422 = this.EZpvd;
                    if (spotDcaEditParam422 != null) {
                        str12 = strFmtBotValueBySymbol$default7 + " " + this.KWHzl;
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.Dmq), str12, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                    }
                }
            }
        }
        if (z11) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt8 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt8 == null || (abstractC54531xLwOLrzqt5 = interfaceC54581xNrOLrzqt8.OLrzqt(tacticsData.getInstType())) == null) {
                quoteDig5 = null;
                spotDcaEditParam9 = this.EZpvd;
                if (spotDcaEditParam9 == null && (strIsConnected2 = spotDcaEditParam9.isConnected()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strIsConnected2)) {
                    str11 = "--";
                } else {
                    SpotDcaEditParam spotDcaEditParam43 = this.EZpvd;
                    java.lang.String strFmtBotValueBySymbol$default8 = (spotDcaEditParam43 != null || (strIsConnected = spotDcaEditParam43.isConnected()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strIsConnected, RoundingMode.UP, false, quoteDig5, false, null, null, null, null, null, 2024, null);
                    str11 = strFmtBotValueBySymbol$default8 + " " + this.KWHzl;
                }
                arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), str11, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            } else {
                if (suggestedInstrument$default == null || (instFamily5 = suggestedInstrument$default.getInstFamily()) == null) {
                    instFamily5 = str2;
                }
                IdxConfig idxConfigAkhnZx7 = abstractC54531xLwOLrzqt5.AkhnZx(instFamily5);
                if (idxConfigAkhnZx7 != null) {
                    quoteDig5 = idxConfigAkhnZx7.getQuoteDig();
                }
                spotDcaEditParam9 = this.EZpvd;
                if (spotDcaEditParam9 == null) {
                    SpotDcaEditParam spotDcaEditParam432 = this.EZpvd;
                    if (spotDcaEditParam432 != null) {
                        str11 = strFmtBotValueBySymbol$default8 + " " + this.KWHzl;
                        arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIddSDPG), str11, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                    }
                }
            }
        }
        if (z12) {
            java.lang.String strAYXKKw11 = C33070mpX.AYXKKw(C55688xof.Application.spnCvw);
            SpotDcaEditParam spotDcaEditParam44 = this.EZpvd;
            arrayList4.add(new TacticsInsideItemData(strAYXKKw11, (spotDcaEditParam44 == null || (strValueOf3 = spotDcaEditParam44.valueOf()) == null) ? str2 : strValueOf3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z14) {
            java.lang.String strAYXKKw12 = C33070mpX.AYXKKw(C55688xof.Application.OHqIaq);
            SpotDcaEditParam spotDcaEditParam45 = this.EZpvd;
            if (spotDcaEditParam45 != null && spotDcaEditParam45.values()) {
                strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.accesstrackPipAnimationHintViewpositionInWindow);
            } else {
                strAYXKKw3 = C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKttrackPipAnimationHintView2);
            }
            arrayList4.add(new TacticsInsideItemData(strAYXKKw12, strAYXKKw3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            SpotDcaEditParam spotDcaEditParam46 = this.EZpvd;
            if (spotDcaEditParam46 != null && spotDcaEditParam46.values()) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt9 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt9 == null || (abstractC54531xLwOLrzqt4 = interfaceC54581xNrOLrzqt9.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig4 = null;
                    spotDcaEditParam8 = this.EZpvd;
                    if (spotDcaEditParam8 == null && (strOLrzqt8 = spotDcaEditParam8.OLrzqt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt8)) {
                        str10 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam47 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default9 = (spotDcaEditParam47 != null || (strOLrzqt7 = spotDcaEditParam47.OLrzqt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strOLrzqt7, RoundingMode.UP, false, quoteDig4, false, null, null, null, null, null, 2024, null);
                        str10 = strFmtBotValueBySymbol$default9 + " " + this.KWHzl;
                    }
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str10 != null ? "--" : str10, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily4 = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily4 = str2;
                    }
                    IdxConfig idxConfigAkhnZx8 = abstractC54531xLwOLrzqt4.AkhnZx(instFamily4);
                    if (idxConfigAkhnZx8 != null) {
                        quoteDig4 = idxConfigAkhnZx8.getQuoteDig();
                    }
                    spotDcaEditParam8 = this.EZpvd;
                    if (spotDcaEditParam8 == null) {
                        SpotDcaEditParam spotDcaEditParam472 = this.EZpvd;
                        if (spotDcaEditParam472 != null) {
                            str10 = strFmtBotValueBySymbol$default9 + " " + this.KWHzl;
                            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str10 != null ? "--" : str10, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                        }
                    }
                }
            } else {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt10 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt10 == null || (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt10.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig3 = null;
                    spotDcaEditParam6 = this.EZpvd;
                    if (spotDcaEditParam6 == null && (strOLrzqt6 = spotDcaEditParam6.OLrzqt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt6)) {
                        str8 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam48 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default10 = (spotDcaEditParam48 != null || (strOLrzqt5 = spotDcaEditParam48.OLrzqt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strOLrzqt5, RoundingMode.UP, false, quoteDig3, false, null, null, null, null, null, 2024, null);
                        str8 = strFmtBotValueBySymbol$default10 + " " + this.KWHzl;
                    }
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str8 != null ? "--" : str8, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                    spotDcaEditParam7 = this.EZpvd;
                    if (spotDcaEditParam7 == null && (strCopydefault2 = spotDcaEditParam7.copydefault()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2)) {
                        str9 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam49 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default11 = (spotDcaEditParam49 != null || (strCopydefault = spotDcaEditParam49.copydefault()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strCopydefault, RoundingMode.UP, false, quoteDig3, false, null, null, null, null, null, 2024, null);
                        str9 = strFmtBotValueBySymbol$default11 + " " + this.KWHzl;
                    }
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIdCUTEI), str9 != null ? "--" : str9, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily3 = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily3 = str2;
                    }
                    IdxConfig idxConfigAkhnZx9 = abstractC54531xLwOLrzqt3.AkhnZx(instFamily3);
                    if (idxConfigAkhnZx9 != null) {
                        quoteDig3 = idxConfigAkhnZx9.getQuoteDig();
                    }
                    spotDcaEditParam6 = this.EZpvd;
                    if (spotDcaEditParam6 == null) {
                        SpotDcaEditParam spotDcaEditParam482 = this.EZpvd;
                        if (spotDcaEditParam482 != null) {
                            str8 = strFmtBotValueBySymbol$default10 + " " + this.KWHzl;
                            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str8 != null ? "--" : str8, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                            spotDcaEditParam7 = this.EZpvd;
                            if (spotDcaEditParam7 == null) {
                                SpotDcaEditParam spotDcaEditParam492 = this.EZpvd;
                                if (spotDcaEditParam492 != null) {
                                    str9 = strFmtBotValueBySymbol$default11 + " " + this.KWHzl;
                                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.DCUTEIdCUTEI), str9 != null ? "--" : str9, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (z13) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt11 = c54589xNz.OLrzqt();
                if (interfaceC54581xNrOLrzqt11 == null || (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt11.OLrzqt(tacticsData.getInstType())) == null) {
                    quoteDig2 = null;
                    spotDcaEditParam2 = this.EZpvd;
                    if (spotDcaEditParam2 == null && (strOLrzqt2 = spotDcaEditParam2.OLrzqt()) != null && StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2)) {
                        str3 = "--";
                    } else {
                        SpotDcaEditParam spotDcaEditParam50 = this.EZpvd;
                        java.lang.String strFmtBotValueBySymbol$default12 = (spotDcaEditParam50 != null || (strOLrzqt = spotDcaEditParam50.OLrzqt()) == null) ? null : C56033xvF.fmtBotValueBySymbol$default(this.KWHzl, strOLrzqt, RoundingMode.UP, false, quoteDig2, false, null, null, null, null, null, 2024, null);
                        str3 = strFmtBotValueBySymbol$default12 + " " + this.KWHzl;
                    }
                    arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str3 != null ? "--" : str3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                } else {
                    if (suggestedInstrument$default == null || (instFamily2 = suggestedInstrument$default.getInstFamily()) == null) {
                        instFamily2 = str2;
                    }
                    IdxConfig idxConfigAkhnZx10 = abstractC54531xLwOLrzqt2.AkhnZx(instFamily2);
                    if (idxConfigAkhnZx10 != null) {
                        quoteDig2 = idxConfigAkhnZx10.getQuoteDig();
                    }
                    spotDcaEditParam2 = this.EZpvd;
                    if (spotDcaEditParam2 == null) {
                        SpotDcaEditParam spotDcaEditParam502 = this.EZpvd;
                        if (spotDcaEditParam502 != null) {
                            str3 = strFmtBotValueBySymbol$default12 + " " + this.KWHzl;
                            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QDqgQU), str3 != null ? "--" : str3, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                        }
                    }
                }
            }
            Unit unit2 = Unit.INSTANCE;
        }
        if (z16) {
            SpotDcaEditParam spotDcaEditParam51 = this.EZpvd;
            GridStartTriggerType gridStartTriggerTypeAEQbTJ5 = (spotDcaEditParam51 == null || (spotDcaAdvancedParamsDbNXlk9 = spotDcaEditParam51.DbNXlk()) == null) ? null : spotDcaAdvancedParamsDbNXlk9.AEQbTJ();
            if (gridStartTriggerTypeAEQbTJ5 != null && StateListAnimator.KWHzl[gridStartTriggerTypeAEQbTJ5.ordinal()] == 1) {
                SpotDcaEditParam spotDcaEditParam52 = this.EZpvd;
                DcaTriggerParam dcaTriggerParam5 = (spotDcaEditParam52 == null || (spotDcaAdvancedParamsDbNXlk8 = spotDcaEditParam52.DbNXlk()) == null || (listAYXKKw = spotDcaAdvancedParamsDbNXlk8.AYXKKw()) == null) ? null : (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(listAYXKKw);
                java.lang.String str23 = TriggerCond.Companion.KWHzl(dcaTriggerParam5 != null ? dcaTriggerParam5.getTriggerCond() : null) + (dcaTriggerParam5 != null ? dcaTriggerParam5.getThold() : null);
                int i6 = C55688xof.Application.multiple;
                kotlin.Pair[] pairArr2 = new kotlin.Pair[3];
                if (dcaTriggerParam5 == null || (timePeriod = dcaTriggerParam5.getTimePeriod()) == null) {
                    timePeriod = str2;
                }
                pairArr2[0] = C56390yDp.OLrzqt("RSIFactor1", timePeriod);
                TimeFrame.Application application2 = TimeFrame.Companion;
                if (dcaTriggerParam5 == null || (timeframe = dcaTriggerParam5.getTimeframe()) == null) {
                    timeframe = str2;
                }
                pairArr2[1] = C56390yDp.OLrzqt("RSIFactor2", application2.copydefault(timeframe));
                pairArr2[2] = C56390yDp.OLrzqt("RSIFactor3", str23);
                strAYXKKw2 = C33069mpW.copydefault(i6, C56424yEw.gEmmrt(pairArr2));
            } else {
                SpotDcaEditParam spotDcaEditParam53 = this.EZpvd;
                strAYXKKw2 = (spotDcaEditParam53 == null || (spotDcaAdvancedParamsDbNXlk7 = spotDcaEditParam53.DbNXlk()) == null || (gridStartTriggerTypeAEQbTJ = spotDcaAdvancedParamsDbNXlk7.AEQbTJ()) == null) ? null : C33070mpX.AYXKKw(gridStartTriggerTypeAEQbTJ.getDesc());
                if (strAYXKKw2 == null) {
                    str7 = str2;
                }
                arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), str7, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            }
            str7 = strAYXKKw2;
            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.QXDzTk), str7, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        if (z2) {
            SpotDcaEditParam spotDcaEditParam54 = this.EZpvd;
            if (spotDcaEditParam54 == null || (spotDcaAdvancedParamsDbNXlk6 = spotDcaEditParam54.DbNXlk()) == null || (strOLrzqt4 = spotDcaAdvancedParamsDbNXlk6.OLrzqt()) == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt4)) {
                xMR xmr5 = xMR.copydefault;
                SpotDcaEditParam spotDcaEditParam55 = this.EZpvd;
                if (spotDcaEditParam55 == null || (spotDcaAdvancedParamsDbNXlk3 = spotDcaEditParam55.DbNXlk()) == null || (strOLrzqt3 = spotDcaAdvancedParamsDbNXlk3.OLrzqt()) == null) {
                    strOLrzqt3 = str2;
                }
                str5 = xMR.formatDownToFixed$default(xmr5, strOLrzqt3, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
            } else {
                str5 = "--";
            }
            java.lang.String strAYXKKw13 = C33070mpX.AYXKKw(C55688xof.Application.call);
            SpotDcaEditParam spotDcaEditParam56 = this.EZpvd;
            if (spotDcaEditParam56 != null) {
                strValueOf = spotDcaEditParam56.valueOf();
                i = 0;
            } else {
                i = 0;
                strValueOf = null;
            }
            if (C33129mqd.OLrzqt(strValueOf, java.lang.Integer.valueOf(i))) {
                z4 = true;
                arrayList4.add(new TacticsInsideItemData(strAYXKKw13, KWHzl(str5, z4), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                spotDcaEditParam3 = this.EZpvd;
                if (spotDcaEditParam3 != null || (spotDcaAdvancedParamsDbNXlk5 = spotDcaEditParam3.DbNXlk()) == null || (strAhwBna = spotDcaAdvancedParamsDbNXlk5.AhwBna()) == null || !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAhwBna)) {
                    xMR xmr6 = xMR.copydefault;
                    spotDcaEditParam4 = this.EZpvd;
                    if (spotDcaEditParam4 != null || (spotDcaAdvancedParamsDbNXlk4 = spotDcaEditParam4.DbNXlk()) == null || (strAhwBna = spotDcaAdvancedParamsDbNXlk4.AhwBna()) == null) {
                        java.lang.String strAhwBna4 = str2;
                    }
                    str4 = null;
                    str6 = xMR.formatDownToFixed$default(xmr6, strAhwBna4, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                } else {
                    str6 = "--";
                    str4 = null;
                }
                java.lang.String strAYXKKw14 = C33070mpX.AYXKKw(C55688xof.Application.fdOvFl);
                spotDcaEditParam5 = this.EZpvd;
                if (C33129mqd.OLrzqt((java.lang.Object) (spotDcaEditParam5 == null ? spotDcaEditParam5.valueOf() : str4), (java.lang.Object) 0)) {
                    SpotDcaEditParam spotDcaEditParam57 = this.EZpvd;
                    z5 = true;
                    if (!C33129mqd.OLrzqt((java.lang.Object) (spotDcaEditParam57 != null ? spotDcaEditParam57.valueOf() : str4), (java.lang.Object) 1)) {
                        z5 = false;
                    }
                } else {
                    z5 = true;
                }
                arrayList4.add(new TacticsInsideItemData(strAYXKKw14, KWHzl(str6, z5), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
            } else {
                SpotDcaEditParam spotDcaEditParam58 = this.EZpvd;
                if (spotDcaEditParam58 != null) {
                    strValueOf2 = spotDcaEditParam58.valueOf();
                    i2 = 1;
                } else {
                    i2 = 1;
                    strValueOf2 = null;
                }
                if (!C33129mqd.OLrzqt(strValueOf2, java.lang.Integer.valueOf(i2))) {
                    z4 = false;
                }
                arrayList4.add(new TacticsInsideItemData(strAYXKKw13, KWHzl(str5, z4), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                spotDcaEditParam3 = this.EZpvd;
                if (spotDcaEditParam3 != null) {
                    xMR xmr62 = xMR.copydefault;
                    spotDcaEditParam4 = this.EZpvd;
                    if (spotDcaEditParam4 != null) {
                        java.lang.String strAhwBna42 = str2;
                        str4 = null;
                        str6 = xMR.formatDownToFixed$default(xmr62, strAhwBna42, 0, 2, null) + C33070mpX.AYXKKw(C55688xof.Application.startIntentSenderForResult);
                        java.lang.String strAYXKKw142 = C33070mpX.AYXKKw(C55688xof.Application.fdOvFl);
                        spotDcaEditParam5 = this.EZpvd;
                        if (C33129mqd.OLrzqt((java.lang.Object) (spotDcaEditParam5 == null ? spotDcaEditParam5.valueOf() : str4), (java.lang.Object) 0)) {
                        }
                        arrayList4.add(new TacticsInsideItemData(strAYXKKw142, KWHzl(str6, z5), null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
                    }
                }
            }
        } else {
            str4 = null;
        }
        if (z17) {
            SpotDcaEditParam spotDcaEditParam59 = this.EZpvd;
            if (C33129mqd.AEQbTJ((spotDcaEditParam59 == null || (spotDcaAdvancedParamsDbNXlk2 = spotDcaEditParam59.DbNXlk()) == null) ? str4 : spotDcaAdvancedParamsDbNXlk2.EZpvd(), "0")) {
                SpotDcaEditParam spotDcaEditParam60 = this.EZpvd;
                strAYXKKw = (spotDcaEditParam60 == null || (spotDcaAdvancedParamsDbNXlk = spotDcaEditParam60.DbNXlk()) == null || (strEZpvd = spotDcaAdvancedParamsDbNXlk.EZpvd()) == null) ? str4 : xMR.formatPercent$default(xMR.copydefault, strEZpvd, 0, 2, RoundingMode.DOWN, 2, null);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.StyleableRes);
            }
            arrayList4.add(new TacticsInsideItemData(C33070mpX.AYXKKw(C55688xof.Application.run), strAYXKKw == null ? "--" : strAYXKKw, null, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), 0, 0, 0, 0, null, null, java.lang.Integer.valueOf(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), null, null, null, null, null, null, 130036, null));
        }
        return new C53393wke(arrayList, arrayList4, EZpvd(this.KWHzl));
    }

    public final java.lang.String KWHzl(java.lang.String str, boolean z) {
        return z ? C33070mpX.AYXKKw(C55688xof.Application.getResultContract) : str;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        SpotDcaEditParam spotDcaEditParam = this.EZpvd;
        if (C33129mqd.AEQbTJ(spotDcaEditParam != null ? spotDcaEditParam.AEQbTJ() : null, "0")) {
            int i = C48033uCm.Fragment.xxhdY;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            SpotDcaEditParam spotDcaEditParam2 = this.EZpvd;
            pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(spotDcaEditParam2 != null ? spotDcaEditParam2.AEQbTJ() : null));
            pairArr[1] = C56390yDp.OLrzqt("ccy", str);
            return C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        int i2 = C48033uCm.Fragment.Dmq;
        kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
        SpotDcaEditParam spotDcaEditParam3 = this.EZpvd;
        pairArr2[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, C33129mqd.gEmmrt(spotDcaEditParam3 != null ? spotDcaEditParam3.AEQbTJ() : null));
        pairArr2[1] = C56390yDp.OLrzqt("ccy", str);
        return C33069mpW.copydefault(i2, C56424yEw.gEmmrt(pairArr2));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpotDcaAdvancedParams AEQbTJ(DcaOrderReq dcaOrderReq) {
        GridStartTriggerType gridStartTriggerType;
        BotRangeConfig slPct;
        java.lang.String slPct2;
        java.lang.String str;
        java.lang.String str2;
        BotRangeConfig volMult;
        java.lang.String volMult2;
        java.lang.String str3;
        BotRangeConfig pxStepsMult;
        java.lang.String pxStepsMult2;
        DcaTriggerParam dcaTriggerParamCopydefault;
        java.util.List<DcaTriggerParam> triggerParams;
        java.lang.Object next;
        BotRangeConfig rsiOversoldThold;
        java.util.List<DcaTriggerParam> triggerParams2;
        DcaTriggerParam dcaTriggerParam;
        java.lang.String triggerStrategy = (dcaOrderReq == null || (triggerParams2 = dcaOrderReq.getTriggerParams()) == null || (dcaTriggerParam = (DcaTriggerParam) CollectionsKt___CollectionsKt.firstOrNull(triggerParams2)) == null) ? null : dcaTriggerParam.getTriggerStrategy();
        if (triggerStrategy == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) triggerStrategy)) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        } else {
            GridStartTriggerType[] gridStartTriggerTypeArrValues = GridStartTriggerType.values();
            int length = gridStartTriggerTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    gridStartTriggerType = null;
                    break;
                }
                gridStartTriggerType = gridStartTriggerTypeArrValues[i];
                if (Intrinsics.EZpvd((java.lang.Object) gridStartTriggerType.getMode(), (java.lang.Object) triggerStrategy)) {
                    break;
                }
                i++;
            }
        }
        if (gridStartTriggerType == null) {
            gridStartTriggerType = GridStartTriggerType.INSTANT;
        }
        GridStartTriggerType gridStartTriggerType2 = gridStartTriggerType;
        if (C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getSlPct() : null, 0)) {
            if (dcaOrderReq != null) {
                slPct2 = dcaOrderReq.getSlPct();
                str = slPct2;
            }
            str = null;
        } else {
            StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
            if (strategyConfigInfo != null && (slPct = strategyConfigInfo.getSlPct()) != null) {
                slPct2 = slPct.getDefault();
                str = slPct2;
            }
            str = null;
        }
        if (!C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getVolMult() : null, 0)) {
            StrategyConfigInfo strategyConfigInfo2 = this.AEQbTJ;
            str2 = (strategyConfigInfo2 == null || (volMult = strategyConfigInfo2.getVolMult()) == null || (volMult2 = volMult.getDefault()) == null) ? "1" : volMult2;
        } else if (dcaOrderReq != null) {
            volMult2 = dcaOrderReq.getVolMult();
        } else {
            str2 = null;
        }
        if (!C33129mqd.AEQbTJ(dcaOrderReq != null ? dcaOrderReq.getPxStepsMult() : null, 0)) {
            StrategyConfigInfo strategyConfigInfo3 = this.AEQbTJ;
            str3 = (strategyConfigInfo3 == null || (pxStepsMult = strategyConfigInfo3.getPxStepsMult()) == null || (pxStepsMult2 = pxStepsMult.getDefault()) == null) ? "1" : pxStepsMult2;
        } else if (dcaOrderReq != null) {
            pxStepsMult2 = dcaOrderReq.getPxStepsMult();
        } else {
            str3 = null;
        }
        if (dcaOrderReq == null || (triggerParams = dcaOrderReq.getTriggerParams()) == null) {
            dcaTriggerParamCopydefault = copydefault();
        } else {
            java.util.Iterator<T> it = triggerParams.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                DcaTriggerParam dcaTriggerParam2 = (DcaTriggerParam) next;
                if (Intrinsics.EZpvd((java.lang.Object) (dcaTriggerParam2 != null ? dcaTriggerParam2.getTriggerStrategy() : null), (java.lang.Object) GridStartTriggerType.RSI_14.getMode())) {
                    break;
                }
            }
            dcaTriggerParamCopydefault = (DcaTriggerParam) next;
            if (dcaTriggerParamCopydefault != null) {
                StrategyConfigInfo strategyConfigInfo4 = this.AEQbTJ;
                dcaTriggerParamCopydefault.setTholdWarning((strategyConfigInfo4 == null || (rsiOversoldThold = strategyConfigInfo4.getRsiOversoldThold()) == null) ? null : rsiOversoldThold.getWarning());
                StrategyConfigInfo strategyConfigInfo5 = this.AEQbTJ;
                dcaTriggerParamCopydefault.setKlinePeriod(strategyConfigInfo5 != null ? strategyConfigInfo5.getKlinePeriod() : null);
            }
        }
        return new SpotDcaAdvancedParams(gridStartTriggerType2, str, str2, str3, C56402yEa.EZpvd(dcaTriggerParamCopydefault), dcaOrderReq != null ? java.lang.Boolean.valueOf(dcaOrderReq.isToManual()) : null, null, 64, null);
    }

    public final DcaTriggerParam copydefault() {
        BotRangeConfig rsiOversoldThold;
        BotRangeConfig rsiOversoldThold2;
        java.lang.String mode = GridStartTriggerType.RSI_14.getMode();
        java.lang.String mode2 = TriggerCond.CROSS_DOWN.getMode();
        StrategyConfigInfo strategyConfigInfo = this.AEQbTJ;
        java.lang.String str = (strategyConfigInfo == null || (rsiOversoldThold2 = strategyConfigInfo.getRsiOversoldThold()) == null) ? null : rsiOversoldThold2.getDefault();
        StrategyConfigInfo strategyConfigInfo2 = this.AEQbTJ;
        java.lang.String warning = (strategyConfigInfo2 == null || (rsiOversoldThold = strategyConfigInfo2.getRsiOversoldThold()) == null) ? null : rsiOversoldThold.getWarning();
        StrategyConfigInfo strategyConfigInfo3 = this.AEQbTJ;
        java.lang.String defaultKlineTimeframe = strategyConfigInfo3 != null ? strategyConfigInfo3.getDefaultKlineTimeframe() : null;
        StrategyConfigInfo strategyConfigInfo4 = this.AEQbTJ;
        return new DcaTriggerParam(TtmlNode.START, mode, mode2, (java.lang.String) null, str, warning, "14", defaultKlineTimeframe, (java.lang.String) null, strategyConfigInfo4 != null ? strategyConfigInfo4.getKlinePeriod() : null, 264, (DefaultConstructorMarker) null);
    }
}

package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.assets.api.model.ValuationCurrency;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource.IFuturesRankingDataSource;
import com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo;
import com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import com.okinc.market.common.bean.PayloadPeriod;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jLi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25922jLi extends AbstractC49400uno<Triple<? extends FuturesAnalysisRankingPnlType, ? extends FuturesAnalysisRankingPeriod, ? extends java.lang.String>, java.util.List<? extends C25937jLx>> {
    public final InterfaceC8218ayb EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C25920jLg OLrzqt;
    public final InterfaceC54577xNn copydefault;
    private static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.jLi$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[FuturesAnalysisRankingPnlType.values().length];
            try {
                iArr[FuturesAnalysisRankingPnlType.LONG_PNL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[FuturesAnalysisRankingPnlType.SHORT_PNL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[FuturesAnalysisRankingPnlType.NET_PNL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public C25922jLi(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn, @NotNull InterfaceC8218ayb interfaceC8218ayb, @NotNull C25920jLg c25920jLg) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC8218ayb, "");
        Intrinsics.checkNotNullParameter(c25920jLg, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = interfaceC54577xNn;
        this.EZpvd = interfaceC8218ayb;
        this.OLrzqt = c25920jLg;
    }

    /* JADX INFO: renamed from: o.jLi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jLi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r14v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r6v12, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0306 A[EDGE_INSN: B:112:0x0306->B:83:0x0306 BREAK  A[LOOP:2: B:74:0x02d3->B:82:0x0300], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x033d  */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r3v6, types: [T, java.math.BigDecimal] */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<? extends FuturesAnalysisRankingPnlType, ? extends FuturesAnalysisRankingPeriod, java.lang.String> triple, @NotNull Continuation<? super java.util.List<C25937jLx>> continuation) throws java.lang.Throwable {
        GetRankingListUseCase$onExecute$1 getRankingListUseCase$onExecute$1;
        FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlTypeComponent1;
        FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriodComponent2;
        C25922jLi c25922jLi;
        ValuationCurrency valuationCurrency;
        java.util.List<RankingItemPo> list;
        FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType;
        FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod;
        ValuationCurrency valuationCurrency2;
        Ref.ObjectRef objectRef;
        C25922jLi c25922jLi2;
        java.lang.Object objM7386unboximpl;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        C25922jLi c25922jLi3;
        java.util.Iterator it;
        java.util.List listAhwBna;
        java.util.List listHDKMBd;
        java.util.List list2;
        java.util.List listAhwBna2;
        java.util.List listEZpvd;
        java.util.List listAhwBna3;
        java.util.List listEZpvd2;
        C25937jLx c25937jLxOLrzqt;
        java.lang.String longPnl;
        if (continuation instanceof GetRankingListUseCase$onExecute$1) {
            getRankingListUseCase$onExecute$1 = (GetRankingListUseCase$onExecute$1) continuation;
            int i = getRankingListUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRankingListUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getRankingListUseCase$onExecute$1 = new GetRankingListUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getRankingListUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getRankingListUseCase$onExecute$1.label;
        int i3 = 3;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            ValuationCurrency value = this.EZpvd.OLrzqt().getValue();
            futuresAnalysisRankingPnlTypeComponent1 = triple.component1();
            futuresAnalysisRankingPeriodComponent2 = triple.component2();
            java.lang.String strComponent3 = triple.component3();
            C25920jLg c25920jLg = this.OLrzqt;
            IFuturesRankingDataSource.PayloadPnlType payload = futuresAnalysisRankingPnlTypeComponent1.getPayload();
            PayloadPeriod payload2 = futuresAnalysisRankingPeriodComponent2.getPayload();
            java.lang.String unit = value.getUnit();
            getRankingListUseCase$onExecute$1.L$0 = this;
            getRankingListUseCase$onExecute$1.L$1 = value;
            getRankingListUseCase$onExecute$1.L$2 = futuresAnalysisRankingPnlTypeComponent1;
            getRankingListUseCase$onExecute$1.L$3 = futuresAnalysisRankingPeriodComponent2;
            getRankingListUseCase$onExecute$1.label = 1;
            java.lang.Object objOLrzqt = c25920jLg.OLrzqt(payload, payload2, unit, strComponent3, getRankingListUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c25922jLi = this;
            valuationCurrency = value;
            objEZpvd = objOLrzqt;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    objectRef = (Ref.ObjectRef) getRankingListUseCase$onExecute$1.L$5;
                    list = (java.util.List) getRankingListUseCase$onExecute$1.L$4;
                    futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) getRankingListUseCase$onExecute$1.L$3;
                    futuresAnalysisRankingPnlType = (FuturesAnalysisRankingPnlType) getRankingListUseCase$onExecute$1.L$2;
                    valuationCurrency2 = (ValuationCurrency) getRankingListUseCase$onExecute$1.L$1;
                    c25922jLi2 = (C25922jLi) getRankingListUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    objM7386unboximpl = ((Result) objEZpvd).m7386unboximpl();
                    Result.m7376boximpl(objM7386unboximpl);
                    interfaceC54577xNn = c25922jLi2.copydefault;
                    if (interfaceC54577xNn != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                        getRankingListUseCase$onExecute$1.L$0 = c25922jLi2;
                        getRankingListUseCase$onExecute$1.L$1 = valuationCurrency2;
                        getRankingListUseCase$onExecute$1.L$2 = futuresAnalysisRankingPnlType;
                        getRankingListUseCase$onExecute$1.L$3 = futuresAnalysisRankingPeriod;
                        getRankingListUseCase$onExecute$1.L$4 = list;
                        getRankingListUseCase$onExecute$1.L$5 = objectRef;
                        getRankingListUseCase$onExecute$1.label = 3;
                        objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SWAP", getRankingListUseCase$onExecute$1);
                        if (objEZpvd == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    interfaceC54577xNn2 = c25922jLi2.copydefault;
                    if (interfaceC54577xNn2 != null) {
                        getRankingListUseCase$onExecute$1.L$0 = c25922jLi2;
                        getRankingListUseCase$onExecute$1.L$1 = valuationCurrency2;
                        getRankingListUseCase$onExecute$1.L$2 = futuresAnalysisRankingPnlType;
                        getRankingListUseCase$onExecute$1.L$3 = futuresAnalysisRankingPeriod;
                        getRankingListUseCase$onExecute$1.L$4 = list;
                        getRankingListUseCase$onExecute$1.L$5 = objectRef;
                        getRankingListUseCase$onExecute$1.label = 4;
                        objEZpvd = interfaceC54581xNrOLrzqt2.EZpvd("FUTURES", getRankingListUseCase$onExecute$1);
                        if (objEZpvd != objCopydefault) {
                        }
                    }
                    java.util.ArrayList<C25937jLx> arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    while (r4.hasNext()) {
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                    while (r1.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                        ((java.util.List) arrayList).add(next);
                    }
                    java.util.List list3 = (java.util.List) linkedHashMap.get(C56443yFo.KWHzl(true));
                    listAhwBna = null;
                    if (list3 == null) {
                    }
                    if (listHDKMBd == null) {
                    }
                    list2 = (java.util.List) linkedHashMap.get(C56443yFo.KWHzl(false));
                    if (list2 != null) {
                    }
                    if (listAhwBna == null) {
                    }
                    return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listHDKMBd, (java.lang.Iterable) listAhwBna);
                }
                if (i2 == 3) {
                    objectRef = (Ref.ObjectRef) getRankingListUseCase$onExecute$1.L$5;
                    list = (java.util.List) getRankingListUseCase$onExecute$1.L$4;
                    futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) getRankingListUseCase$onExecute$1.L$3;
                    futuresAnalysisRankingPnlType = (FuturesAnalysisRankingPnlType) getRankingListUseCase$onExecute$1.L$2;
                    valuationCurrency2 = (ValuationCurrency) getRankingListUseCase$onExecute$1.L$1;
                    c25922jLi2 = (C25922jLi) getRankingListUseCase$onExecute$1.L$0;
                    C56391yDq.AEQbTJ(objEZpvd);
                    interfaceC54577xNn2 = c25922jLi2.copydefault;
                    if (interfaceC54577xNn2 != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) != null) {
                        getRankingListUseCase$onExecute$1.L$0 = c25922jLi2;
                        getRankingListUseCase$onExecute$1.L$1 = valuationCurrency2;
                        getRankingListUseCase$onExecute$1.L$2 = futuresAnalysisRankingPnlType;
                        getRankingListUseCase$onExecute$1.L$3 = futuresAnalysisRankingPeriod;
                        getRankingListUseCase$onExecute$1.L$4 = list;
                        getRankingListUseCase$onExecute$1.L$5 = objectRef;
                        getRankingListUseCase$onExecute$1.label = 4;
                        objEZpvd = interfaceC54581xNrOLrzqt2.EZpvd("FUTURES", getRankingListUseCase$onExecute$1);
                        if (objEZpvd != objCopydefault) {
                            return objCopydefault;
                        }
                        c25922jLi3 = c25922jLi2;
                        c25922jLi2 = c25922jLi3;
                    }
                    java.util.ArrayList<C25937jLx> arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    while (r4.hasNext()) {
                    }
                    java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
                    while (r1.hasNext()) {
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    it = arrayList22.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                        ((java.util.List) arrayList).add(next);
                    }
                    java.util.List list32 = (java.util.List) linkedHashMap2.get(C56443yFo.KWHzl(true));
                    listAhwBna = null;
                    if (list32 == null) {
                    }
                    if (listHDKMBd == null) {
                    }
                    list2 = (java.util.List) linkedHashMap2.get(C56443yFo.KWHzl(false));
                    if (list2 != null) {
                        listAhwBna = C56405yEd.hDKMBd(listEZpvd);
                    }
                    if (listAhwBna == null) {
                    }
                    return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listHDKMBd, (java.lang.Iterable) listAhwBna);
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef = (Ref.ObjectRef) getRankingListUseCase$onExecute$1.L$5;
                list = (java.util.List) getRankingListUseCase$onExecute$1.L$4;
                futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) getRankingListUseCase$onExecute$1.L$3;
                futuresAnalysisRankingPnlType = (FuturesAnalysisRankingPnlType) getRankingListUseCase$onExecute$1.L$2;
                valuationCurrency2 = (ValuationCurrency) getRankingListUseCase$onExecute$1.L$1;
                c25922jLi3 = (C25922jLi) getRankingListUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c25922jLi2 = c25922jLi3;
                java.util.ArrayList<C25937jLx> arrayList32 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (RankingItemPo rankingItemPo : list) {
                    kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = c25922jLi2.copydefault(rankingItemPo);
                    java.lang.String strComponent1 = pairCopydefault.component1();
                    java.lang.String strComponent2 = pairCopydefault.component2();
                    int i4 = StateListAnimator.KWHzl[futuresAnalysisRankingPnlType.ordinal()];
                    if (i4 == 1) {
                        longPnl = rankingItemPo.getLongPnl();
                    } else if (i4 == 2) {
                        longPnl = rankingItemPo.getShortPnl();
                    } else {
                        if (i4 != i3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        longPnl = rankingItemPo.getNetPnl();
                    }
                    java.lang.String strOLrzqt = C27977kKi.OLrzqt(longPnl, valuationCurrency2.getUnit(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 2) != 0 ? "" : valuationCurrency2.getSymbol(), (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 4) != 0 ? false : true, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 8) == 0 ? false : false, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 32) == 0 ? null : "", (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 64) != 0, (TypedValues.PositionType.TYPE_PERCENT_HEIGHT & 128) != 0 ? 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0206: INVOKE (r17v4 'strOLrzqt' java.lang.String) = 
                          (r10v7 'longPnl' java.lang.String)
                          (wrap:java.lang.String:0x01ea: INVOKE (r7v11 'valuationCurrency2' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getUnit():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:61))
                          (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (wrap:java.lang.String:0x01ee: INVOKE (r7v11 'valuationCurrency2' com.okinc.assets.api.model.ValuationCurrency) VIRTUAL call: com.okinc.assets.api.model.ValuationCurrency.getSymbol():java.lang.String A[MD:():java.lang.String (m), WRAPPED]))
                          (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (4 int) A[WRAPPED]) != (0 int)) ? false : true)
                          (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (8 int) A[WRAPPED]) == (0 int)) ? false : false)
                          (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (null java.lang.String))
                          (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (32 int) A[WRAPPED]) == (0 int)) ? (null java.lang.String) : (""))
                          (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (64 int) A[WRAPPED]) != (0 int)) ? true : false)
                          (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x002d: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0033: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:34) call: o.kKj.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function2))
                          (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0039: ARITH (wrap:int:SGET  A[WRAPPED] androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_HEIGHT int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:35) call: o.kKn.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                         STATIC call: o.kKi.OLrzqt(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):java.lang.String A[DECLARE_VAR, MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function2<? super java.math.BigDecimal, ? super o.pTy, java.lang.String>, kotlin.jvm.functions.Function1<? super java.lang.Integer, o.pTy>):java.lang.String (m)] (LINE:26) in method: o.jLi.copydefault(kotlin.Triple<? extends com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType, ? extends com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod, java.lang.String>, kotlin.coroutines.Continuation<? super java.util.List<o.jLx>>):java.lang.Object, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:207)
                        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.kKj, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 47 more
                        */
                    /*
                        this = this;
                        r0 = r29
                        r1 = r31
                        boolean r2 = r1 instanceof com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1
                        if (r2 == 0) goto L17
                        r2 = r1
                        com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1 r2 = (com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1) r2
                        int r3 = r2.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r5 = r3 & r4
                        if (r5 == 0) goto L17
                        int r3 = r3 + r4
                        r2.label = r3
                        goto L1c
                    L17:
                        com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1 r2 = new com.okinc.business.market.features.analysis.futures.sub.ranking.domain.usecase.GetRankingListUseCase$onExecute$1
                        r2.<init>(r0, r1)
                    L1c:
                        java.lang.Object r1 = r2.result
                        java.lang.Object r9 = o.C56437yFi.OLrzqt()
                        int r3 = r2.label
                        r10 = 4
                        r11 = 3
                        r12 = 2
                        r13 = 1
                        if (r3 == 0) goto Laf
                        if (r3 == r13) goto L97
                        if (r3 == r12) goto L74
                        if (r3 == r11) goto L57
                        if (r3 != r10) goto L4f
                        java.lang.Object r3 = r2.L$5
                        kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                        java.lang.Object r4 = r2.L$4
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Object r5 = r2.L$3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod r5 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod) r5
                        java.lang.Object r6 = r2.L$2
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType r6 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType) r6
                        java.lang.Object r7 = r2.L$1
                        com.okinc.assets.api.model.ValuationCurrency r7 = (com.okinc.assets.api.model.ValuationCurrency) r7
                        java.lang.Object r2 = r2.L$0
                        o.jLi r2 = (o.C25922jLi) r2
                        o.C56391yDq.AEQbTJ(r1)
                        goto L197
                    L4f:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L57:
                        java.lang.Object r3 = r2.L$5
                        kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                        java.lang.Object r4 = r2.L$4
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Object r5 = r2.L$3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod r5 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod) r5
                        java.lang.Object r6 = r2.L$2
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType r6 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType) r6
                        java.lang.Object r7 = r2.L$1
                        com.okinc.assets.api.model.ValuationCurrency r7 = (com.okinc.assets.api.model.ValuationCurrency) r7
                        java.lang.Object r8 = r2.L$0
                        o.jLi r8 = (o.C25922jLi) r8
                        o.C56391yDq.AEQbTJ(r1)
                        goto L173
                    L74:
                        java.lang.Object r3 = r2.L$5
                        kotlin.jvm.internal.Ref$ObjectRef r3 = (kotlin.jvm.internal.Ref.ObjectRef) r3
                        java.lang.Object r4 = r2.L$4
                        java.util.List r4 = (java.util.List) r4
                        java.lang.Object r5 = r2.L$3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod r5 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod) r5
                        java.lang.Object r6 = r2.L$2
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType r6 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType) r6
                        java.lang.Object r7 = r2.L$1
                        com.okinc.assets.api.model.ValuationCurrency r7 = (com.okinc.assets.api.model.ValuationCurrency) r7
                        java.lang.Object r8 = r2.L$0
                        o.jLi r8 = (o.C25922jLi) r8
                        o.C56391yDq.AEQbTJ(r1)
                        kotlin.Result r1 = (kotlin.Result) r1
                        java.lang.Object r1 = r1.m7386unboximpl()
                        goto L13f
                    L97:
                        java.lang.Object r3 = r2.L$3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod r3 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod) r3
                        java.lang.Object r4 = r2.L$2
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType r4 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType) r4
                        java.lang.Object r5 = r2.L$1
                        com.okinc.assets.api.model.ValuationCurrency r5 = (com.okinc.assets.api.model.ValuationCurrency) r5
                        java.lang.Object r6 = r2.L$0
                        o.jLi r6 = (o.C25922jLi) r6
                        o.C56391yDq.AEQbTJ(r1)
                        r15 = r3
                        r14 = r4
                        r8 = r5
                        r7 = r6
                        goto Lf6
                    Laf:
                        o.C56391yDq.AEQbTJ(r1)
                        o.ayb r1 = r0.EZpvd
                        kotlinx.coroutines.flow.StateFlow r1 = r1.OLrzqt()
                        java.lang.Object r1 = r1.getValue()
                        com.okinc.assets.api.model.ValuationCurrency r1 = (com.okinc.assets.api.model.ValuationCurrency) r1
                        java.lang.Object r3 = r30.component1()
                        r14 = r3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType r14 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType) r14
                        java.lang.Object r3 = r30.component2()
                        r15 = r3
                        com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod r15 = (com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod) r15
                        java.lang.Object r3 = r30.component3()
                        r7 = r3
                        java.lang.String r7 = (java.lang.String) r7
                        o.jLg r3 = r0.OLrzqt
                        com.okinc.business.market.features.analysis.futures.sub.ranking.data.datasource.IFuturesRankingDataSource$PayloadPnlType r4 = r14.getPayload()
                        com.okinc.market.common.bean.PayloadPeriod r5 = r15.getPayload()
                        java.lang.String r6 = r1.getUnit()
                        r2.L$0 = r0
                        r2.L$1 = r1
                        r2.L$2 = r14
                        r2.L$3 = r15
                        r2.label = r13
                        r8 = r2
                        java.lang.Object r3 = r3.OLrzqt(r4, r5, r6, r7, r8)
                        if (r3 != r9) goto Lf3
                        return r9
                    Lf3:
                        r7 = r0
                        r8 = r1
                        r1 = r3
                    Lf6:
                        java.util.List r1 = (java.util.List) r1
                        if (r1 != 0) goto Lfe
                        java.util.List r1 = kotlin.collections.CollectionsKt.EZpvd()
                    Lfe:
                        kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                        r6.<init>()
                        java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
                        r6.element = r3
                        o.xNn r3 = r7.copydefault
                        if (r3 == 0) goto L143
                        o.xNE r5 = new o.xNE
                        r5.<init>()
                        r2.L$0 = r7
                        r2.L$1 = r8
                        r2.L$2 = r14
                        r2.L$3 = r15
                        r2.L$4 = r1
                        r2.L$5 = r6
                        r2.label = r12
                        r4 = 0
                        r16 = 1
                        r17 = 0
                        r18 = r6
                        r6 = r2
                        r19 = r7
                        r7 = r16
                        r16 = r8
                        r8 = r17
                        java.lang.Object r3 = o.InterfaceC54577xNn.ActionBar.m8790ensureInitialize0E7RQCE$default(r3, r4, r5, r6, r7, r8)
                        if (r3 != r9) goto L135
                        return r9
                    L135:
                        r4 = r1
                        r1 = r3
                        r6 = r14
                        r5 = r15
                        r7 = r16
                        r3 = r18
                        r8 = r19
                    L13f:
                        kotlin.Result.m7376boximpl(r1)
                        goto L152
                    L143:
                        r18 = r6
                        r19 = r7
                        r16 = r8
                        r4 = r1
                        r6 = r14
                        r5 = r15
                        r7 = r16
                        r3 = r18
                        r8 = r19
                    L152:
                        o.xNn r1 = r8.copydefault
                        if (r1 == 0) goto L175
                        o.xNr r1 = r1.OLrzqt()
                        if (r1 == 0) goto L175
                        r2.L$0 = r8
                        r2.L$1 = r7
                        r2.L$2 = r6
                        r2.L$3 = r5
                        r2.L$4 = r4
                        r2.L$5 = r3
                        r2.label = r11
                        java.lang.String r14 = "SWAP"
                        java.lang.Object r1 = r1.EZpvd(r14, r2)
                        if (r1 != r9) goto L173
                        return r9
                    L173:
                        o.xLw r1 = (o.AbstractC54531xLw) r1
                    L175:
                        o.xNn r1 = r8.copydefault
                        if (r1 == 0) goto L19a
                        o.xNr r1 = r1.OLrzqt()
                        if (r1 == 0) goto L19a
                        r2.L$0 = r8
                        r2.L$1 = r7
                        r2.L$2 = r6
                        r2.L$3 = r5
                        r2.L$4 = r4
                        r2.L$5 = r3
                        r2.label = r10
                        java.lang.String r10 = "FUTURES"
                        java.lang.Object r1 = r1.EZpvd(r10, r2)
                        if (r1 != r9) goto L196
                        return r9
                    L196:
                        r2 = r8
                    L197:
                        o.xLw r1 = (o.AbstractC54531xLw) r1
                        r8 = r2
                    L19a:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r2 = 10
                        int r9 = kotlin.collections.CollectionsKt.copydefault(r4, r2)
                        r1.<init>(r9)
                        java.util.Iterator r4 = r4.iterator()
                    L1a9:
                        boolean r9 = r4.hasNext()
                        if (r9 == 0) goto L238
                        java.lang.Object r9 = r4.next()
                        com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo r9 = (com.okinc.business.market.features.analysis.futures.sub.ranking.data.model.RankingItemPo) r9
                        kotlin.Pair r10 = r8.copydefault(r9)
                        java.lang.Object r14 = r10.component1()
                        r15 = r14
                        java.lang.String r15 = (java.lang.String) r15
                        java.lang.Object r10 = r10.component2()
                        r16 = r10
                        java.lang.String r16 = (java.lang.String) r16
                        int[] r10 = o.C25922jLi.StateListAnimator.KWHzl
                        int r14 = r6.ordinal()
                        r10 = r10[r14]
                        if (r10 == r13) goto L1e6
                        if (r10 == r12) goto L1e1
                        if (r10 != r11) goto L1db
                        java.lang.String r10 = r9.getNetPnl()
                        goto L1ea
                    L1db:
                        kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                        r1.<init>()
                        throw r1
                    L1e1:
                        java.lang.String r10 = r9.getShortPnl()
                        goto L1ea
                    L1e6:
                        java.lang.String r10 = r9.getLongPnl()
                    L1ea:
                        java.lang.String r18 = r7.getUnit()
                        java.lang.String r19 = r7.getSymbol()
                        r20 = 1
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 0
                        r25 = 0
                        r26 = 0
                        r27 = 504(0x1f8, float:7.06E-43)
                        r28 = 0
                        r17 = r10
                        java.lang.String r17 = o.C27977kKi.formatValue$default(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
                        java.math.BigDecimal r10 = o.C33129mqd.EZpvd(r10)
                        T r14 = r3.element
                        java.math.BigDecimal r14 = (java.math.BigDecimal) r14
                        java.math.BigDecimal r11 = r10.abs()
                        java.math.BigDecimal r11 = r14.max(r11)
                        r3.element = r11
                        com.okinc.market.ext.UpDownColor$StateListAnimator r11 = com.okinc.market.ext.UpDownColor.Companion
                        com.okinc.market.ext.UpDownColor r19 = r11.AEQbTJ(r10)
                        o.jLx r11 = new o.jLx
                        r20 = 0
                        r14 = r11
                        r18 = r10
                        r21 = r6
                        r22 = r5
                        r23 = r9
                        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
                        r1.add(r11)
                        r11 = 3
                        goto L1a9
                    L238:
                        java.util.ArrayList r4 = new java.util.ArrayList
                        int r2 = kotlin.collections.CollectionsKt.copydefault(r1, r2)
                        r4.<init>(r2)
                        java.util.Iterator r1 = r1.iterator()
                    L245:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L2ca
                        java.lang.Object r2 = r1.next()
                        r14 = r2
                        o.jLx r14 = (o.C25937jLx) r14
                        T r2 = r3.element
                        java.math.BigDecimal r2 = (java.math.BigDecimal) r2
                        java.math.BigDecimal r5 = java.math.BigDecimal.ZERO
                        int r2 = r2.compareTo(r5)
                        if (r2 > 0) goto L278
                        r15 = 0
                        r16 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 479(0x1df, float:6.71E-43)
                        r25 = 0
                        o.jLx r2 = o.C25937jLx.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                        goto L2c5
                    L278:
                        java.math.BigDecimal r2 = r14.valueOf()
                        java.math.BigDecimal r2 = r2.abs()
                        java.lang.String r5 = ""
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                        T r6 = r3.element
                        java.math.BigDecimal r6 = (java.math.BigDecimal) r6
                        java.math.BigDecimal r6 = r6.abs()
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
                        java.math.RoundingMode r7 = java.math.RoundingMode.HALF_EVEN
                        java.math.BigDecimal r2 = r2.divide(r6, r7)
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                        r6 = 100
                        long r6 = (long) r6
                        java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r6)
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
                        java.math.BigDecimal r2 = r2.multiply(r6)
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
                        r15 = 0
                        r16 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        int r20 = r2.intValue()
                        r21 = 0
                        r22 = 0
                        r23 = 0
                        r24 = 479(0x1df, float:6.71E-43)
                        r25 = 0
                        o.jLx r2 = o.C25937jLx.copy$default(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    L2c5:
                        r4.add(r2)
                        goto L245
                    L2ca:
                        java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                        r1.<init>()
                        java.util.Iterator r2 = r4.iterator()
                    L2d3:
                        boolean r3 = r2.hasNext()
                        r4 = 0
                        if (r3 == 0) goto L306
                        java.lang.Object r3 = r2.next()
                        r5 = r3
                        o.jLx r5 = (o.C25937jLx) r5
                        java.math.BigDecimal r5 = r5.valueOf()
                        java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
                        int r5 = r5.compareTo(r6)
                        if (r5 < 0) goto L2ee
                        r4 = r13
                    L2ee:
                        java.lang.Boolean r4 = o.C56443yFo.KWHzl(r4)
                        java.lang.Object r5 = r1.get(r4)
                        if (r5 != 0) goto L300
                        java.util.ArrayList r5 = new java.util.ArrayList
                        r5.<init>()
                        r1.put(r4, r5)
                    L300:
                        java.util.List r5 = (java.util.List) r5
                        r5.add(r3)
                        goto L2d3
                    L306:
                        java.lang.Boolean r2 = o.C56443yFo.KWHzl(r13)
                        java.lang.Object r2 = r1.get(r2)
                        java.util.List r2 = (java.util.List) r2
                        r3 = 5
                        r5 = 0
                        if (r2 == 0) goto L32a
                        java.util.List r2 = kotlin.collections.CollectionsKt.AEQbTJ(r2, r3)
                        if (r2 == 0) goto L32a
                        o.jLi$ActionBar r6 = new o.jLi$ActionBar
                        r6.<init>()
                        java.util.List r2 = kotlin.collections.CollectionsKt.AEQbTJ(r2, r6)
                        if (r2 == 0) goto L32a
                        java.util.List r2 = kotlin.collections.CollectionsKt.copydefault(r2)
                        goto L32b
                    L32a:
                        r2 = r5
                    L32b:
                        if (r2 != 0) goto L331
                        java.util.List r2 = kotlin.collections.CollectionsKt.EZpvd()
                    L331:
                        java.lang.Boolean r4 = o.C56443yFo.KWHzl(r4)
                        java.lang.Object r1 = r1.get(r4)
                        java.util.List r1 = (java.util.List) r1
                        if (r1 == 0) goto L352
                        java.util.List r1 = kotlin.collections.CollectionsKt.AEQbTJ(r1, r3)
                        if (r1 == 0) goto L352
                        o.jLi$TaskDescription r3 = new o.jLi$TaskDescription
                        r3.<init>()
                        java.util.List r1 = kotlin.collections.CollectionsKt.AEQbTJ(r1, r3)
                        if (r1 == 0) goto L352
                        java.util.List r5 = kotlin.collections.CollectionsKt.copydefault(r1)
                    L352:
                        if (r5 != 0) goto L358
                        java.util.List r5 = kotlin.collections.CollectionsKt.EZpvd()
                    L358:
                        java.util.List r1 = kotlin.collections.CollectionsKt.AEQbTJ(r2, r5)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.C25922jLi.KWHzl(kotlin.Triple, kotlin.coroutines.Continuation):java.lang.Object");
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(RankingItemPo rankingItemPo) {
                    java.lang.String strValueOf;
                    java.lang.String instName;
                    java.lang.String strCopydefault;
                    java.lang.String str = rankingItemPo.getBizType() != 3 ? "SWAP" : "FUTURES";
                    InterfaceC54577xNn interfaceC54577xNn = this.copydefault;
                    InterfaceC54581xNr interfaceC54581xNrOLrzqt = interfaceC54577xNn != null ? interfaceC54577xNn.OLrzqt() : null;
                    BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str, rankingItemPo.getInstName(), null, null, 12, null) : null;
                    java.lang.String tradeSymbol = suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null;
                    if (interfaceC54581xNrOLrzqt == null) {
                        strValueOf = "";
                    } else {
                        if (tradeSymbol == null) {
                            tradeSymbol = "";
                        }
                        strValueOf = interfaceC54581xNrOLrzqt.valueOf(tradeSymbol);
                        if (strValueOf == null) {
                        }
                    }
                    if (suggestedInstrument$default == null || (strCopydefault = C40384qTw.copydefault(suggestedInstrument$default)) == null) {
                        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "FUTURES") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SWAP")) {
                            instName = C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, rankingItemPo.getInstName(), str, false, false, false, 24, null);
                        } else {
                            instName = rankingItemPo.getInstName();
                        }
                        strCopydefault = instName;
                    }
                    return C56390yDp.OLrzqt(strValueOf, strCopydefault);
                }

                /* JADX INFO: renamed from: o.jLi$ActionBar */
                public static final class ActionBar<T> implements java.util.Comparator {
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return yET.KWHzl(((C25937jLx) t).valueOf(), ((C25937jLx) t2).valueOf());
                    }
                }

                /* JADX INFO: renamed from: o.jLi$TaskDescription */
                public static final class TaskDescription<T> implements java.util.Comparator {
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return yET.KWHzl(((C25937jLx) t).valueOf(), ((C25937jLx) t2).valueOf());
                    }
                }
            }

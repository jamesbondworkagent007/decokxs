package com.okinc.trade.manager.common.position;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.rxutils.RxBus;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.biz.subscribe.TpslAllInfo;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.unify_trade.trade.utils.TradeAbTestManager;
import io.reactivex.BackpressureStrategy;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC54531xLw;
import o.AbstractC55747xpl;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C54582xNs;
import o.C54589xNz;
import o.C56392yDr;
import o.C56403yEb;
import o.C56444yFp;
import o.C58266yxz;
import o.InterfaceC54581xNr;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58217yxC;
import o.InterfaceC58225yxK;
import o.InterfaceC58227yxM;
import o.pUU;
import o.xOE;
import o.xOJ;
import o.xOW;
import o.xUR;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TradePositionManager {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C54582xNs AEQbTJ;
    public AbstractC55747xpl EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final CoroutineScope copydefault;
    public final InterfaceC56387yDm djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54582xNs AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC58217yxC interfaceC58217yxC) {
        this.KWHzl = interfaceC58217yxC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC58217yxC OLrzqt() {
        return this.KWHzl;
    }

    public TradePositionManager(@NotNull C54582xNs c54582xNs) {
        Intrinsics.checkNotNullParameter(c54582xNs, "");
        this.AEQbTJ = c54582xNs;
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.uox
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TradePositionManager.copydefault(this.EZpvd);
            }
        });
        this.copydefault = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.trade.manager.common.position.TradePositionManager.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("TradePositionManager", str);
        }
    }

    public static final xOE copydefault(TradePositionManager tradePositionManager) {
        return new xOE(tradePositionManager.AEQbTJ);
    }

    public final xOE KWHzl() {
        return (xOE) this.djBIcL.getValue();
    }

    public final AbstractC58185ywX<Triple<Boolean, List<PositionItem>, String>> OLrzqt(final String str, final String str2, @NotNull final String str3, final boolean z, final String str4, final boolean z2, @NotNull final String str5) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Companion.AEQbTJ("getPositions instId:" + str + ",uly:" + str2 + ",instType:" + str3 + ",isFromPositionPage:" + z + ",registeredSourceFlag:" + str4 + ",needDisConnBackground:" + z2 + ",fromTag:" + str5);
        if (TradeAbTestManager.copydefault.AEQbTJ()) {
            return KWHzl().copydefault(str, str2, str3, z, str4, z2, str5);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return xUR.KWHzl(new InterfaceC58187ywZ() { // from class: o.uov
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TradePositionManager.KWHzl(objectRef, str3, str2, str, z2, z, this, str4, str5, interfaceC58184ywW);
            }
        });
    }

    public static final class Activity extends AbstractC55747xpl {
        public final boolean AEQbTJ;
        public final /* synthetic */ String EZpvd;
        public final /* synthetic */ TradePositionManager KWHzl;
        public final /* synthetic */ String OLrzqt;
        public final /* synthetic */ InterfaceC58184ywW<Triple<Boolean, List<PositionItem>, String>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC55745xpj
        public boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(boolean z, String str, String str2, String str3, boolean z2, TradePositionManager tradePositionManager, InterfaceC58184ywW<Triple<Boolean, List<PositionItem>, String>> interfaceC58184ywW, String str4, String str5, String str6) {
            super(str, str2, str3, str6, z2);
            this.KWHzl = tradePositionManager;
            this.copydefault = interfaceC58184ywW;
            this.OLrzqt = str4;
            this.EZpvd = str5;
            this.AEQbTJ = z;
        }

        @Override // o.AbstractC55747xpl
        public void EZpvd(final List<TradePositionData> list, final String str, final List<TradeUserPositionInfo> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TradePositionManager.Companion.AEQbTJ("onResult origin:" + str);
            if (Intrinsics.EZpvd((Object) str, (Object) "http")) {
                EZpvd("pageAppear", list);
                RxBus.KWHzl("POSITION_LIST_INIT");
            }
            InterfaceC58217yxC interfaceC58217yxCOLrzqt = this.KWHzl.OLrzqt();
            if (interfaceC58217yxCOLrzqt != null) {
                interfaceC58217yxCOLrzqt.dispose();
            }
            TradePositionManager tradePositionManager = this.KWHzl;
            AbstractC58185ywX abstractC58185ywXCopydefault = tradePositionManager.copydefault(list).copydefault(C58266yxz.OLrzqt());
            final InterfaceC58184ywW<Triple<Boolean, List<PositionItem>, String>> interfaceC58184ywW = this.copydefault;
            final Function1 function1 = new Function1() { // from class: o.uoD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TradePositionManager.Activity.KWHzl(interfaceC58184ywW, list, list2, str, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.uoC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TradePositionManager.Activity.OLrzqt(function1, obj);
                }
            };
            final InterfaceC58184ywW<Triple<Boolean, List<PositionItem>, String>> interfaceC58184ywW2 = this.copydefault;
            final Function1 function12 = new Function1() { // from class: o.uoA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return TradePositionManager.Activity.KWHzl(interfaceC58184ywW2, str, (java.lang.Throwable) obj);
                }
            };
            tradePositionManager.AEQbTJ(abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.uoB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    TradePositionManager.Activity.EZpvd(function12, obj);
                }
            }));
        }

        public static final void OLrzqt(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(InterfaceC58184ywW interfaceC58184ywW, List list, List list2, String str, List list3) {
            TradePositionManager.Companion.AEQbTJ("onNext");
            interfaceC58184ywW.onNext(new Triple(Boolean.TRUE, xOJ.AEQbTJ.EZpvd((List<TradePositionData>) list, (List<TradeUserPositionInfo>) list2), str));
            return Unit.INSTANCE;
        }

        public static final void EZpvd(Function1 function1, Object obj) {
            function1.invoke(obj);
        }

        public static final Unit KWHzl(InterfaceC58184ywW interfaceC58184ywW, String str, Throwable th) {
            TradePositionManager.Companion.AEQbTJ("onError :" + th.getMessage());
            interfaceC58184ywW.onNext(new Triple(Boolean.FALSE, new ArrayList(), str));
            return Unit.INSTANCE;
        }

        @Override // o.AbstractC55747xpl
        public void KWHzl(String str, Exception exc) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(exc, "");
            TradePositionManager.Companion.AEQbTJ("onError origin: String, exp: Exception :" + exc.getMessage());
            InterfaceC58217yxC interfaceC58217yxCOLrzqt = this.KWHzl.OLrzqt();
            if (interfaceC58217yxCOLrzqt != null) {
                interfaceC58217yxCOLrzqt.dispose();
            }
            this.copydefault.onNext(new Triple<>(Boolean.FALSE, new ArrayList(), str));
        }

        @Override // o.AbstractC55747xpl
        public String EZpvd() {
            return this.OLrzqt + "_" + this.EZpvd;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: o.xNr */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.ArrayList, java.util.List] */
    public static final void KWHzl(final Ref.ObjectRef objectRef, String str, String str2, String str3, boolean z, boolean z2, final TradePositionManager tradePositionManager, String str4, String str5, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ActionBar actionBar = Companion;
        actionBar.AEQbTJ("subscribeOnUI");
        ?? Copydefault = yDY.copydefault(new Activity(z2, str, str2, str3, z, tradePositionManager, interfaceC58184ywW, str4, str5, C33129mqd.gEmmrt(Long.valueOf(System.currentTimeMillis()))));
        objectRef.element = Copydefault;
        if (Copydefault != 0) {
            Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(Copydefault);
            tradePositionManager.EZpvd = objFirstOrNull instanceof AbstractC55747xpl ? (AbstractC55747xpl) objFirstOrNull : null;
            actionBar.AEQbTJ("loadSourceObserver");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != 0) {
                interfaceC54581xNrOLrzqt.copydefault((ArrayList<Object>) Copydefault);
            }
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.uou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                TradePositionManager.AEQbTJ(this.EZpvd, objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(TradePositionManager tradePositionManager, Ref.ObjectRef objectRef) {
        tradePositionManager.EZpvd = null;
        InterfaceC58217yxC interfaceC58217yxC = tradePositionManager.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        ArrayList<Object> arrayList = (ArrayList) objectRef.element;
        if (arrayList != null) {
            Companion.AEQbTJ("unBindSourceObserver");
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.AEQbTJ(arrayList);
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xLw.isInitFun$default(o.xLw, boolean, int, java.lang.Object):boolean */
    public final ArrayList<AbstractC54531xLw> copydefault() {
        ArrayList<AbstractC54531xLw> arrayListAuCTel = this.AEQbTJ.AuCTel();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListAuCTel) {
            if (!AbstractC54531xLw.isInitFun$default((AbstractC54531xLw) obj, false, 1, null)) {
                arrayList.add(obj);
            }
        }
        return new ArrayList<>(arrayList);
    }

    public final AbstractC58185ywX<List<TradePositionData>> copydefault(final List<TradePositionData> list) {
        Companion.AEQbTJ("checkInstrument");
        AbstractC58185ywX<List<TradePositionData>> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.uoy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TradePositionManager.AEQbTJ(list, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void AEQbTJ(List list, TradePositionManager tradePositionManager, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Companion.AEQbTJ("checkInstrument start");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String instType = ((TradePositionData) obj).getInstType();
            Object arrayList = linkedHashMap.get(instType);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(instType, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList<AbstractC54531xLw> arrayListCopydefault = tradePositionManager.copydefault();
        ArrayList<AbstractC54531xLw> arrayList2 = new ArrayList();
        for (Object obj2 : arrayListCopydefault) {
            AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj2;
            if (setKeySet != null && setKeySet.contains(abstractC54531xLw.AYXKKw())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            Companion.AEQbTJ("needUnBizSet.isNullOrEmpty()");
            interfaceC58184ywW.onNext(list);
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(arrayList2.size());
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        for (AbstractC54531xLw abstractC54531xLw2 : arrayList2) {
            Companion.AEQbTJ("scope.launch");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new TradePositionManager$checkInstrument$1$1$1(tradePositionManager, abstractC54531xLw2, atomicInteger, interfaceC58184ywW, list, CoroutineScope, null), 3, null);
        }
    }

    public final AbstractC58185ywX<OpenInterestData> OLrzqt(@NotNull final OpenInterestData openInterestData) {
        Intrinsics.checkNotNullParameter(openInterestData, "");
        if (TradeAbTestManager.copydefault.AEQbTJ()) {
            return KWHzl().KWHzl(openInterestData);
        }
        AbstractC58185ywX<OpenInterestData> abstractC58185ywXCopydefault = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.uow
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                TradePositionManager.copydefault(openInterestData, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXCopydefault, "");
        return abstractC58185ywXCopydefault;
    }

    public static final void copydefault(OpenInterestData openInterestData, TradePositionManager tradePositionManager, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        String instType = openInterestData.getInstType();
        ArrayList<AbstractC54531xLw> arrayListCopydefault = tradePositionManager.copydefault();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListCopydefault, 10));
        Iterator<T> it = arrayListCopydefault.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC54531xLw) it.next()).AYXKKw());
        }
        if (!arrayList.contains(instType)) {
            interfaceC58184ywW.onNext(openInterestData);
            return;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        atomicInteger.incrementAndGet();
        BuildersKt__Builders_commonKt.launch$default(tradePositionManager.copydefault, null, null, new TradePositionManager$checkInfoInstrument$1$1(tradePositionManager, instType, atomicInteger, interfaceC58184ywW, openInterestData, null), 3, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MarginModeType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MarginModeType[] $VALUES;
        public static final MarginModeType CROSSED = new MarginModeType("CROSSED", 0);
        public static final MarginModeType ISOLATED = new MarginModeType("ISOLATED", 1);
        public static final MarginModeType CASH = new MarginModeType("CASH", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MarginModeType[] $values() {
            return new MarginModeType[]{CROSSED, ISOLATED, CASH};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MarginModeType> getEntries() {
            return $ENTRIES;
        }

        private MarginModeType(String str, int i) {
        }

        static {
            MarginModeType[] marginModeTypeArr$values = $values();
            $VALUES = marginModeTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(marginModeTypeArr$values);
        }

        public static MarginModeType valueOf(String str) {
            return (MarginModeType) Enum.valueOf(MarginModeType.class, str);
        }

        public static MarginModeType[] values() {
            return (MarginModeType[]) $VALUES.clone();
        }
    }

    public static class PositionItem implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<PositionItem> CREATOR = new Creator();
        private boolean isAuthAccount;
        private boolean isCurrentAccount;
        private boolean isMainAccount;
        private String posId = "";
        private String adl = "";
        private String availPos = "";
        private String avgPx = "";
        private String ccy = "";
        private String cTime = "";
        private String tradeId = "";
        private String imr = "";
        private String instId = "";
        private String instType = "";
        private String interest = "";
        private String lever = "";
        private String liabCcy = "";
        private String liab = "";
        private String liqPx = "";
        private String margin = "";
        private MarginModeType marginMode = MarginModeType.CROSSED;
        private String mgnRatio = "";
        private String mmr = "";
        private String optVal = "";
        private String posDirection = "";
        private String posSide = "";
        private String pos = "";
        private String posCcy = "";
        private String upl = "";
        private String uplRatio = "";
        private String uplLastPx = "";
        private String uplRatioLastPx = "";
        private String last = "";
        private String uTime = "";
        private String accountName = "";
        private String notionalUsd = "";
        private String usdPx = "";
        private String markPx = "";
        private String baseBalance = "";
        private String quoteBalance = "";
        private String algoId = "";
        private String spotInUseAmt = "";
        private String spotInUseCcy = "";
        private List<TpslAllInfo> closeOrderAlgo = yDY.AhwBna();
        private String baseBorrowed = "";
        private String baseInterest = "";
        private String quoteBorrowed = "";
        private String quoteInterest = "";
        private String pendingCloseOrdLiabVal = "";
        private String bizRefId = "";
        private String bizRefType = "";
        private String riskUnitCcy = "";
        private String instFamily = "";
        private String uly = "";
        private String realizedPnl = "";
        private String pnl = "";
        private String fee = "";
        private String fundingFee = "";
        private String liqPenalty = "";
        private String bestSlTriggerPx = "";
        private String bestTpTriggerPx = "";
        private String posRelationAlgoOrdCount = "";
        private String bePx = "";
        private String nonSettleAvgPx = "";
        private String settledPnl = "";
        private String hedgedPos = "";
        private String deltaBS = "";
        private String deltaPA = "";
        private String thetaBS = "";
        private String thetaPA = "";
        private String sharedMarginNum = "";

        public static final class Creator implements Parcelable.Creator<PositionItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return new PositionItem();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionItem[] newArray(int i) {
                return new PositionItem[i];
            }
        }

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[MarginModeType.values().length];
                try {
                    iArr[MarginModeType.CROSSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MarginModeType.ISOLATED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                copydefault = iArr;
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAccountName() {
            return this.accountName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAdl() {
            return this.adl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAlgoId() {
            return this.algoId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvailPos() {
            return this.availPos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAvgPx() {
            return this.avgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseBalance() {
            return this.baseBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseBorrowed() {
            return this.baseBorrowed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBaseInterest() {
            return this.baseInterest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBePx() {
            return this.bePx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBestSlTriggerPx() {
            return this.bestSlTriggerPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBestTpTriggerPx() {
            return this.bestTpTriggerPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getBizRefId() {
            return this.bizRefId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getBizRefType() {
            return this.bizRefType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCTime() {
            return this.cTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getCcy() {
            return this.ccy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<TpslAllInfo> getCloseOrderAlgo() {
            return this.closeOrderAlgo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeltaBS() {
            return this.deltaBS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDeltaPA() {
            return this.deltaPA;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getFee() {
            return this.fee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getFundingFee() {
            return this.fundingFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHedgedPos() {
            return this.hedgedPos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImr() {
            return this.imr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getInstFamily() {
            return this.instFamily;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getInstId() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getInstType() {
            return this.instType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInterest() {
            return this.interest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLast() {
            return this.last;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getLever() {
            return this.lever;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLiab() {
            return this.liab;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLiabCcy() {
            return this.liabCcy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getLiqPenalty() {
            return this.liqPenalty;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLiqPx() {
            return this.liqPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMargin() {
            return this.margin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public MarginModeType getMarginMode() {
            return this.marginMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMarkPx() {
            return this.markPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMgnRatio() {
            return this.mgnRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getMmr() {
            return this.mmr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonSettleAvgPx() {
            return this.nonSettleAvgPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNotionalUsd() {
            return this.notionalUsd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getOptVal() {
            return this.optVal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPendingCloseOrdLiabVal() {
            return this.pendingCloseOrdLiabVal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnl() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPos() {
            return this.pos;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPosCcy() {
            return this.posCcy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPosDirection() {
            return this.posDirection;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPosId() {
            return this.posId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPosRelationAlgoOrdCount() {
            return this.posRelationAlgoOrdCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPosSide() {
            return this.posSide;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getPositionSortValue() {
            return this.notionalUsd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteBalance() {
            return this.quoteBalance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteBorrowed() {
            return this.quoteBorrowed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getQuoteInterest() {
            return this.quoteInterest;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getRealizedPnl() {
            return this.realizedPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRiskUnitCcy() {
            return this.riskUnitCcy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSettledPnl() {
            return this.settledPnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSharedMarginNum() {
            return this.sharedMarginNum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotInUseAmt() {
            return this.spotInUseAmt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpotInUseCcy() {
            return this.spotInUseCcy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getThetaBS() {
            return this.thetaBS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getThetaPA() {
            return this.thetaPA;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTradeId() {
            return this.tradeId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getUTime() {
            return this.uTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String getUly() {
            return this.uly;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUpl() {
            return this.upl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUplLastPx() {
            return this.uplLastPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUplRatio() {
            return this.uplRatio;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUplRatioLastPx() {
            return this.uplRatioLastPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsdPx() {
            return this.usdPx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isAuthAccount() {
            return this.isAuthAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isCurrentAccount() {
            return this.isCurrentAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isMainAccount() {
            return this.isMainAccount;
        }

        public final boolean isQuickMarginPosition() {
            return false;
        }

        public final boolean isQuickMarginRepayShow() {
            return false;
        }

        public final boolean isShowLever(boolean z) {
            return z;
        }

        public boolean isSupportPNLRate() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAccountName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.accountName = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAdl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.adl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAlgoId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.algoId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAuthAccount(boolean z) {
            this.isAuthAccount = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAvailPos(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.availPos = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAvgPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.avgPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseBalance(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseBalance = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseBorrowed(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseBorrowed = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBaseInterest(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.baseInterest = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBePx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bePx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBestSlTriggerPx(String str) {
            this.bestSlTriggerPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBestTpTriggerPx(String str) {
            this.bestTpTriggerPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setBizRefId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bizRefId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setBizRefType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.bizRefType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCTime(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.cTime = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setCcy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.ccy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCloseOrderAlgo(@NotNull List<TpslAllInfo> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.closeOrderAlgo = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrentAccount(boolean z) {
            this.isCurrentAccount = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDeltaBS(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.deltaBS = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDeltaPA(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.deltaPA = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setFee(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fee = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setFundingFee(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.fundingFee = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHedgedPos(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.hedgedPos = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setImr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.imr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setInstFamily(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.instFamily = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setInstId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.instId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setInstType(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.instType = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setInterest(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.interest = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLast(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.last = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setLever(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.lever = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLiab(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.liab = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLiabCcy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.liabCcy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setLiqPenalty(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.liqPenalty = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setLiqPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.liqPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMainAccount(boolean z) {
            this.isMainAccount = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMargin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.margin = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setMarginMode(@NotNull MarginModeType marginModeType) {
            Intrinsics.checkNotNullParameter(marginModeType, "");
            this.marginMode = marginModeType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarkPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.markPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMgnRatio(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.mgnRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMmr(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.mmr = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNonSettleAvgPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.nonSettleAvgPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setNotionalUsd(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.notionalUsd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setOptVal(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.optVal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPendingCloseOrdLiabVal(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pendingCloseOrdLiabVal = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPnl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pnl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPos(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pos = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPosCcy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.posCcy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPosDirection(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.posDirection = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setPosId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.posId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPosRelationAlgoOrdCount(String str) {
            this.posRelationAlgoOrdCount = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setPosSide(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.posSide = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteBalance(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteBalance = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteBorrowed(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteBorrowed = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setQuoteInterest(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.quoteInterest = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setRealizedPnl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.realizedPnl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRiskUnitCcy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.riskUnitCcy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSettledPnl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.settledPnl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSharedMarginNum(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.sharedMarginNum = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSpotInUseAmt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.spotInUseAmt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSpotInUseCcy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.spotInUseCcy = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setThetaBS(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.thetaBS = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setThetaPA(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.thetaPA = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTradeId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.tradeId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setUTime(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uTime = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void setUly(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uly = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUpl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.upl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUplLastPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uplLastPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUplRatio(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uplRatio = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUplRatioLastPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.uplRatioLastPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setUsdPx(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.usdPx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean shouldShowLeverEdit() {
            return this.isCurrentAccount;
        }

        public final boolean showShare(boolean z) {
            return z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final String getPositionsSide() {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getInstType(), getInstId(), null, null, 12, null) : null;
            if (Intrinsics.EZpvd((Object) getInstType(), (Object) "MARGIN")) {
                if (!Intrinsics.EZpvd((Object) this.posCcy, (Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null))) {
                    if (this.posCcy.length() == 0) {
                        return "";
                    }
                    return "netSell";
                }
                return "netBuy";
            }
            if (!Intrinsics.EZpvd((Object) getPosSide(), (Object) "net")) {
                return getPosSide();
            }
            if (C33129mqd.AEQbTJ(this.pos) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                if (C33129mqd.AEQbTJ(this.pos) == AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
            }
            return "netBuy";
        }

        public String getPositionSortName() {
            return getInstId();
        }

        public BigDecimal getPositionSortPLRate() {
            return C33129mqd.EZpvd(getPnlPriceRatio());
        }

        public String getItemIdentifier() {
            return getInstId() + "_" + getInstType() + "_" + getPosSide() + "_" + getMarginMode();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        
            if (r2.equals("short") == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r2.equals("long") == false) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007d A[ORIG_RETURN, RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getSide() {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getInstType(), getInstId(), null, null, 12, null) : null;
            String posSide = getPosSide();
            int iHashCode = posSide.hashCode();
            if (iHashCode != 108957) {
                if (iHashCode != 3327612) {
                    if (iHashCode == 109413500) {
                    }
                }
                return getPosSide();
            }
            if (posSide.equals("net")) {
                if (Intrinsics.EZpvd((Object) getInstType(), (Object) "MARGIN")) {
                    return Intrinsics.EZpvd((Object) this.posCcy, (Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getTradeSymbol() : null)) ? "buy" : "sell";
                }
                if (C33129mqd.AEQbTJ(this.pos) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                }
            }
            return getPosSide();
        }

        public final boolean isShowMargin() {
            return getMarginMode() == MarginModeType.ISOLATED && !(Intrinsics.EZpvd((Object) getSide(), (Object) "buy") && Intrinsics.EZpvd((Object) getInstType(), (Object) "OPTION"));
        }

        public final String getMarginModel() {
            int i = StateListAnimator.copydefault[getMarginMode().ordinal()];
            return i != 1 ? i != 2 ? "" : "isolated" : "cross";
        }

        public final String getPnlPrice() {
            xOW newProxyInstance;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            boolean zEZpvd = Intrinsics.EZpvd((Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AubY()), (Object) "1");
            pUU.KWHzl("PnlPriceType", "getPnlPrice() isSelectedLastPrice:" + zEZpvd);
            return (!zEZpvd || Intrinsics.EZpvd((Object) getInstType(), (Object) "OPTION")) ? this.upl : this.uplLastPx;
        }

        public final String getPnlPriceRatio() {
            xOW newProxyInstance;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            boolean zEZpvd = Intrinsics.EZpvd((Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AubY()), (Object) "1");
            pUU.KWHzl("PnlPriceType", "getPnlPriceRatio() isSelectedLastPrice:" + zEZpvd);
            return (!zEZpvd || Intrinsics.EZpvd((Object) getInstType(), (Object) "OPTION")) ? this.uplRatio : this.uplRatioLastPx;
        }

        public final boolean isPnlSelectedLastPrice() {
            xOW newProxyInstance;
            if (Intrinsics.EZpvd((Object) getInstType(), (Object) "OPTION")) {
                return false;
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            return Intrinsics.EZpvd((Object) ((interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null) ? null : newProxyInstance.AubY()), (Object) "1");
        }

        public final String getLiabAbs() {
            return C33129mqd.copydefault((Object) this.liab, (Object) 0) ? this.liab : C33129mqd.subS$default("0", this.liab, null, null, null, 14, null);
        }

        public final boolean isPositive() {
            BizInstrument suggestedInstrument$default;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, getInstType(), getInstId(), null, null, 12, null)) == null) {
                return false;
            }
            return suggestedInstrument$default.isPositiveContract();
        }

        public String toString() {
            return "PositionItem(posId=" + getPosId() + ", instId=" + getInstId() + ", instType=" + getInstType() + ", pos=" + this.pos + ", posSide=" + getPosSide() + ", lever=" + getLever() + ", availPos=" + this.availPos + ", avgPx=" + this.avgPx + "liqPx=" + this.liqPx + ", margin=" + this.margin + ", marginMode=" + getMarginMode() + ", tradeId=" + this.tradeId + ", markPx=" + this.markPx + ", notionalUsd=" + this.notionalUsd + ")";
        }
    }
}

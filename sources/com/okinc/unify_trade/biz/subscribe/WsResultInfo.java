package com.okinc.unify_trade.biz.subscribe;

import com.okinc.tradeapi.bean.IndexTickersData;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.AbstractC55658xoB;
import o.AbstractC55668xoL;
import o.AbstractC55670xoN;
import o.AbstractC55671xoO;
import o.AbstractC55674xoR;
import o.AbstractC55676xoT;
import o.AbstractC55678xoV;
import o.AbstractC55681xoY;
import o.AbstractC55682xoZ;
import o.AbstractC55710xpA;
import o.AbstractC55711xpB;
import o.AbstractC55712xpC;
import o.AbstractC55737xpb;
import o.AbstractC55744xpi;
import o.AbstractC55751xpp;
import o.AbstractC55755xpt;
import o.C33129mqd;
import o.C54585xNv;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WsResultInfo {
    public static final int $stable = 8;
    private volatile boolean isUpdate;
    private String originName;
    private String message = "";
    private final CopyOnWriteArrayList<AbstractC55755xpt<?>> callbacks = new CopyOnWriteArrayList<>();
    private final ConcurrentHashMap<String, TickersData> mResultMap = new ConcurrentHashMap<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyOnWriteArrayList<AbstractC55755xpt<?>> getCallbacks() {
        return this.callbacks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUpdate() {
        return this.isUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.originName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdate(boolean z) {
        this.isUpdate = z;
    }

    public final void parseOptionTicker(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        List<TickersData> listCopydefault = TickersData.Companion.copydefault(str);
        if (listCopydefault != null) {
            for (TickersData tickersData : listCopydefault) {
                this.mResultMap.put(tickersData.getInstId(), tickersData);
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Boolean $isSingle;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Boolean bool, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$isSingle = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WsResultInfo.this.new AnonymousClass1(this.$isSingle, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [57=15] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            MarketBooksData marketBooksData;
            Object objCopydefault = C56442yFn.copydefault();
            switch (this.label) {
                case 0:
                    C56391yDq.AEQbTJ(obj);
                    String str = WsResultInfo.this.originName;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2034176189:
                                if (str.equals("multi_ticker_listener")) {
                                    TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main = Dispatchers.getMain();
                                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(tickersDataOLrzqt, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 5;
                                    if (BuildersKt.withContext(main, anonymousClass5, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -1808939205:
                                if (str.equals("OptionMarkPriceListener")) {
                                    List<MarkPriceData> listCopydefault = MarkPriceData.Companion.copydefault(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                                    AnonymousClass15 anonymousClass15 = new AnonymousClass15(listCopydefault, WsResultInfo.this, null);
                                    this.label = 14;
                                    if (BuildersKt.withContext(main2, anonymousClass15, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -1256710559:
                                if (str.equals("EstimatedPriceListener")) {
                                    List<EstimatedPriceData> listCopydefault2 = EstimatedPriceData.Companion.copydefault(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main3 = Dispatchers.getMain();
                                    AnonymousClass10 anonymousClass10 = new AnonymousClass10(listCopydefault2, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 9;
                                    if (BuildersKt.withContext(main3, anonymousClass10, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -1011734910:
                                if (str.equals("MarketBooksListener")) {
                                    List<MarketBooksData> listCopydefault3 = MarketBooksData.Companion.copydefault(WsResultInfo.this.getMessage());
                                    BizDepthData bizDepthDataConvertToBizDepthData = (listCopydefault3 == null || (marketBooksData = (MarketBooksData) CollectionsKt___CollectionsKt.firstOrNull(listCopydefault3)) == null) ? null : marketBooksData.convertToBizDepthData();
                                    MainCoroutineDispatcher main4 = Dispatchers.getMain();
                                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(bizDepthDataConvertToBizDepthData, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 3;
                                    if (BuildersKt.withContext(main4, anonymousClass3, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -832361621:
                                if (str.equals("IndexTickersListener")) {
                                    IndexTickersData indexTickersDataCopydefault = IndexTickersData.Companion.copydefault(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main5 = Dispatchers.getMain();
                                    AnonymousClass14 anonymousClass14 = new AnonymousClass14(indexTickersDataCopydefault, WsResultInfo.this, null);
                                    this.label = 13;
                                    if (BuildersKt.withContext(main5, anonymousClass14, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -416543837:
                                if (str.equals("OptionTradeListener")) {
                                    List<OpenInterestData> listEZpvd = OpenInterestData.Companion.EZpvd(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main6 = Dispatchers.getMain();
                                    AnonymousClass16 anonymousClass16 = new AnonymousClass16(listEZpvd, WsResultInfo.this, null);
                                    this.label = 15;
                                    if (BuildersKt.withContext(main6, anonymousClass16, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -165153945:
                                if (str.equals("OptSummaryListener")) {
                                    List<OptSummaryData> listAEQbTJ = OptSummaryData.Companion.AEQbTJ(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main7 = Dispatchers.getMain();
                                    AnonymousClass12 anonymousClass12 = new AnonymousClass12(listAEQbTJ, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 11;
                                    if (BuildersKt.withContext(main7, anonymousClass12, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case -83473112:
                                if (str.equals("OptionTickersListener")) {
                                    LinkedList linkedList = new LinkedList();
                                    Iterator it = WsResultInfo.this.mResultMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        linkedList.add(((Map.Entry) it.next()).getValue());
                                    }
                                    MainCoroutineDispatcher main8 = Dispatchers.getMain();
                                    AnonymousClass7 anonymousClass7 = new AnonymousClass7(linkedList, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 6;
                                    if (BuildersKt.withContext(main8, anonymousClass7, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 49105218:
                                if (str.equals("LimitPriceListener")) {
                                    LimitPriceData limitPriceDataOLrzqt = LimitPriceData.Companion.OLrzqt(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main9 = Dispatchers.getMain();
                                    AnonymousClass11 anonymousClass11 = new AnonymousClass11(limitPriceDataOLrzqt, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 10;
                                    if (BuildersKt.withContext(main9, anonymousClass11, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 161881693:
                                if (str.equals("TickersListener")) {
                                    List<TickersData> listKWHzl = TickersData.Companion.KWHzl(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main10 = Dispatchers.getMain();
                                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(listKWHzl, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 2;
                                    if (BuildersKt.withContext(main10, anonymousClass2, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 182645320:
                                if (str.equals("cup_ticker_listener")) {
                                    TickersData tickersDataOLrzqt2 = TickersData.Companion.OLrzqt(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main11 = Dispatchers.getMain();
                                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(tickersDataOLrzqt2, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 4;
                                    if (BuildersKt.withContext(main11, anonymousClass4, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 506126641:
                                if (str.equals("FundingRateListener")) {
                                    FundingRateData fundingRateDataAEQbTJ = FundingRateData.Companion.AEQbTJ(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main12 = Dispatchers.getMain();
                                    AnonymousClass13 anonymousClass13 = new AnonymousClass13(fundingRateDataAEQbTJ, WsResultInfo.this, null);
                                    this.label = 12;
                                    if (BuildersKt.withContext(main12, anonymousClass13, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 1518904856:
                                if (str.equals("TradeListener")) {
                                    List<BizTradeData> listOLrzqt = BizTradeData.Companion.OLrzqt(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main13 = Dispatchers.getMain();
                                    AnonymousClass8 anonymousClass8 = new AnonymousClass8(listOLrzqt, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 7;
                                    if (BuildersKt.withContext(main13, anonymousClass8, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 2022035592:
                                if (str.equals("OpenInterestListener")) {
                                    OpenInterestData openInterestDataCopydefault = OpenInterestData.Companion.copydefault(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main14 = Dispatchers.getMain();
                                    C06811 c06811 = new C06811(openInterestDataCopydefault, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 1;
                                    if (BuildersKt.withContext(main14, c06811, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                            case 2048794416:
                                if (str.equals("MarkPriceListener")) {
                                    MarkPriceData markPriceDataKWHzl = MarkPriceData.Companion.KWHzl(WsResultInfo.this.getMessage());
                                    MainCoroutineDispatcher main15 = Dispatchers.getMain();
                                    AnonymousClass9 anonymousClass9 = new AnonymousClass9(markPriceDataKWHzl, this.$isSingle, WsResultInfo.this, null);
                                    this.label = 8;
                                    if (BuildersKt.withContext(main15, anonymousClass9, this) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    C56391yDq.AEQbTJ(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C06811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ OpenInterestData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06811(OpenInterestData openInterestData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super C06811> continuation) {
                super(2, continuation);
                this.$data = openInterestData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06811(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    OpenInterestData openInterestData = this.$data;
                    if (openInterestData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55682xoZ) abstractC55755xpt, openInterestData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55682xoZ) next, openInterestData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<TickersData> $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(List<TickersData> list, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$data = list;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<TickersData> list = this.$data;
                    if (list != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55737xpb) abstractC55755xpt, list, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55737xpb) next, list, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ BizDepthData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BizDepthData bizDepthData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$data = bizDepthData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    BizDepthData bizDepthData = this.$data;
                    if (bizDepthData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55674xoR) abstractC55755xpt, bizDepthData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55674xoR) next, bizDepthData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TickersData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TickersData tickersData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$data = tickersData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    TickersData tickersData = this.$data;
                    if (tickersData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55744xpi) abstractC55755xpt, tickersData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55744xpi) next, tickersData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TickersData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(TickersData tickersData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.$data = tickersData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass5(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    TickersData tickersData = this.$data;
                    if (tickersData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55658xoB) abstractC55755xpt, tickersData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55658xoB) next, tickersData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Boolean $isSingle;
            final /* synthetic */ LinkedList<TickersData> $list;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(LinkedList<TickersData> linkedList, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass7> continuation) {
                super(2, continuation);
                this.$list = linkedList;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass7(this.$list, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LinkedList<TickersData> linkedList = this.$list;
                    Boolean bool = this.$isSingle;
                    WsResultInfo wsResultInfo = this.this$0;
                    if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                        AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                        Intrinsics.copydefault(abstractC55755xpt, "");
                        AbstractC55755xpt.onResult$default((AbstractC55737xpb) abstractC55755xpt, linkedList, null, 2, null);
                    } else {
                        Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            if (next instanceof AbstractC55710xpA) {
                                AbstractC55755xpt.onResult$default(next, linkedList, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Boolean $isSingle;
            final /* synthetic */ List<BizTradeData> $list;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(List<BizTradeData> list, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass8> continuation) {
                super(2, continuation);
                this.$list = list;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass8(this.$list, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<BizTradeData> list = this.$list;
                    if (list != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55751xpp) abstractC55755xpt, list, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55751xpp) next, list, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ MarkPriceData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(MarkPriceData markPriceData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass9> continuation) {
                super(2, continuation);
                this.$data = markPriceData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass9(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    MarkPriceData markPriceData = this.$data;
                    if (markPriceData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55676xoT) abstractC55755xpt, markPriceData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55676xoT) next, markPriceData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Boolean $isSingle;
            final /* synthetic */ List<EstimatedPriceData> $list;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(List<EstimatedPriceData> list, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass10> continuation) {
                super(2, continuation);
                this.$list = list;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass10(this.$list, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<EstimatedPriceData> list = this.$list;
                    if (list != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55668xoL) abstractC55755xpt, list, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55668xoL) next, list, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LimitPriceData $data;
            final /* synthetic */ Boolean $isSingle;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(LimitPriceData limitPriceData, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass11> continuation) {
                super(2, continuation);
                this.$data = limitPriceData;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass11(this.$data, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    LimitPriceData limitPriceData = this.$data;
                    if (limitPriceData != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55678xoV) abstractC55755xpt, limitPriceData, null, 2, null);
                        } else {
                            Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                            Intrinsics.checkNotNullExpressionValue(it, "");
                            while (it.hasNext()) {
                                AbstractC55755xpt<?> next = it.next();
                                Intrinsics.copydefault(next, "");
                                AbstractC55755xpt.onResult$default((AbstractC55678xoV) next, limitPriceData, null, 2, null);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$12, reason: invalid class name */
        public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Boolean $isSingle;
            final /* synthetic */ List<OptSummaryData> $list;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass12(List<OptSummaryData> list, Boolean bool, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass12> continuation) {
                super(2, continuation);
                this.$list = list;
                this.$isSingle = bool;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass12(this.$list, this.$isSingle, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<OptSummaryData> list = this.$list;
                    if (list != null) {
                        Boolean bool = this.$isSingle;
                        WsResultInfo wsResultInfo = this.this$0;
                        if (Intrinsics.EZpvd(bool, C56443yFo.KWHzl(true)) && C33129mqd.KWHzl((Collection) wsResultInfo.getCallbacks())) {
                            AbstractC55755xpt<?> abstractC55755xpt = wsResultInfo.getCallbacks().get(wsResultInfo.getCallbacks().size() - 1);
                            Intrinsics.copydefault(abstractC55755xpt, "");
                            AbstractC55755xpt.onResult$default((AbstractC55681xoY) abstractC55755xpt, list, null, 2, null);
                        }
                        Iterator<AbstractC55755xpt<?>> it = wsResultInfo.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            Intrinsics.copydefault(next, "");
                            AbstractC55755xpt.onResult$default((AbstractC55681xoY) next, list, null, 2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$13, reason: invalid class name */
        public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FundingRateData $data;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass13(FundingRateData fundingRateData, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass13> continuation) {
                super(2, continuation);
                this.$data = fundingRateData;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass13(this.$data, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    FundingRateData fundingRateData = this.$data;
                    if (fundingRateData != null) {
                        Iterator<AbstractC55755xpt<?>> it = this.this$0.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            Intrinsics.copydefault(next, "");
                            AbstractC55755xpt.onResult$default((AbstractC55670xoN) next, fundingRateData, null, 2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$14, reason: invalid class name */
        public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ IndexTickersData $data;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass14(IndexTickersData indexTickersData, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass14> continuation) {
                super(2, continuation);
                this.$data = indexTickersData;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass14(this.$data, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    IndexTickersData indexTickersData = this.$data;
                    if (indexTickersData != null) {
                        Iterator<AbstractC55755xpt<?>> it = this.this$0.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            Intrinsics.copydefault(next, "");
                            AbstractC55755xpt.onResult$default((AbstractC55671xoO) next, indexTickersData, null, 2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$15, reason: invalid class name */
        public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<MarkPriceData> $data;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass15(List<MarkPriceData> list, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass15> continuation) {
                super(2, continuation);
                this.$data = list;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass15(this.$data, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<MarkPriceData> list = this.$data;
                    if (list != null) {
                        Iterator<AbstractC55755xpt<?>> it = this.this$0.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            Intrinsics.copydefault(next, "");
                            AbstractC55755xpt.onResult$default((AbstractC55712xpC) next, list, null, 2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.unify_trade.biz.subscribe.WsResultInfo$sendMessage$1$16, reason: invalid class name */
        public static final class AnonymousClass16 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<OpenInterestData> $data;
            int label;
            final /* synthetic */ WsResultInfo this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass16(List<OpenInterestData> list, WsResultInfo wsResultInfo, Continuation<? super AnonymousClass16> continuation) {
                super(2, continuation);
                this.$data = list;
                this.this$0 = wsResultInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass16(this.$data, this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<OpenInterestData> list = this.$data;
                    if (list != null) {
                        Iterator<AbstractC55755xpt<?>> it = this.this$0.getCallbacks().iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            AbstractC55755xpt<?> next = it.next();
                            Intrinsics.copydefault(next, "");
                            AbstractC55755xpt.onResult$default((AbstractC55711xpB) next, list, null, 2, null);
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static /* synthetic */ void sendMessage$default(WsResultInfo wsResultInfo, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = Boolean.FALSE;
        }
        wsResultInfo.sendMessage(bool);
    }

    public final void sendMessage(Boolean bool) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, C54585xNv.KWHzl.gEmmrt(), null, new AnonymousClass1(bool, null), 2, null);
    }

    public final void refreshTicker(List<TickersData> list) {
        if (list != null) {
            Iterator<AbstractC55755xpt<?>> it = this.callbacks.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (it.hasNext()) {
                AbstractC55755xpt<?> next = it.next();
                Intrinsics.copydefault(next, "");
                AbstractC55755xpt.onResult$default((AbstractC55737xpb) next, list, null, 2, null);
            }
        }
    }

    public final boolean removeDataCallback(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof AbstractC55755xpt) {
            Iterator<AbstractC55755xpt<?>> it = this.callbacks.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (Intrinsics.EZpvd((Object) it.next().AhwBna(), (Object) ((AbstractC55755xpt) obj).AhwBna())) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                this.callbacks.remove(i);
            }
        }
        return this.callbacks.size() == 0;
    }

    public final void clearCallback() {
        while (this.callbacks.size() != 0) {
            this.callbacks.remove(0);
        }
    }
}

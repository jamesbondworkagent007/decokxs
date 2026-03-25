package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LifecycleOwner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.manager.TradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1;
import com.okinc.manager.TradeKLineManager$subMarketFormulaKline$2;
import com.okinc.market.common.service.KlineBizMarketService;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.IndexTickersData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.api.subscribe.orders.BizAllOrderReq;
import com.okinc.unify_trade.api.subscribe.orders.TradeAllOrderApi;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.AccountBalanceData;
import com.okinc.unify_trade.biz.subscribe.BizKLineData;
import com.okinc.unify_trade.biz.subscribe.BizTradeAggregatedData;
import com.okinc.unify_trade.biz.subscribe.BizTradeData;
import com.okinc.unify_trade.biz.subscribe.EstimatedPriceData;
import com.okinc.unify_trade.biz.subscribe.MarkPriceData;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.biz.subscribe.OptSummaryData;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import io.reactivex.BackpressureStrategy;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C38358pVv;
import o.xKK;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pVv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38358pVv extends AbstractC54517xLi {
    public xBJ AEQbTJ;
    public InterfaceC58217yxC EZpvd;
    public InterfaceC58217yxC KWHzl;
    public C37962pHd OLrzqt = C37962pHd.Companion.EZpvd();
    public C54289xCx copydefault;

    /* JADX INFO: renamed from: o.pVv$ActionBar */
    public static final class ActionBar {
        public xMJ.Application AYXKKw;
        public xMJ.TaskDescription EZpvd;
        public OptSummaryData KWHzl;
        public xMJ.StateListAnimator copydefault;
        public java.lang.String OLrzqt = "";
        public java.lang.String AEQbTJ = "";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final xMJ.Application AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OptSummaryData EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(OptSummaryData optSummaryData) {
            this.KWHzl = optSummaryData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(xMJ.Application application) {
            this.AYXKKw = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(xMJ.TaskDescription taskDescription) {
            this.EZpvd = taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final xMJ.TaskDescription KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final xMJ.StateListAnimator OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(xMJ.StateListAnimator stateListAnimator) {
            this.copydefault = stateListAnimator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    @Override // o.AbstractC54517xLi
    public void copydefault(Function1<? super java.lang.Boolean, Unit> function1) {
    }

    /* JADX INFO: renamed from: o.pVv$FragmentManager */
    public static final class FragmentManager implements Flow<kotlin.Pair<? extends java.util.ArrayList<java.lang.Boolean>, ? extends java.util.List<? extends oLY>>> {
        public final /* synthetic */ C38358pVv EZpvd;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.pVv$FragmentManager$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ C38358pVv EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, C38358pVv c38358pVv) {
                this.copydefault = flowCollector;
                this.EZpvd = c38358pVv;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                TradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1 tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1;
                java.lang.Object objM7377constructorimpl;
                kotlin.Pair pairOLrzqt;
                if (continuation instanceof TradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1) {
                    tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1 = (TradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1) continuation;
                    int i = tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1 = new TradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List<BizKLineData> list = (java.util.List) obj;
                    if (list.isEmpty()) {
                        pairOLrzqt = C56390yDp.OLrzqt(yDY.copydefault(C56443yFo.KWHzl(true), C56443yFo.KWHzl(false)), yDY.AhwBna());
                    } else {
                        try {
                            Result.Application application = Result.Companion;
                            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                            for (BizKLineData bizKLineData : list) {
                                if (C33129mqd.OLrzqt(C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(bizKLineData.getC())), "0")) {
                                    pUU.copydefault("ChartView", "subMarketFormulaKline 数据转换发生异常");
                                }
                                arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));
                            }
                            objM7377constructorimpl = Result.m7377constructorimpl(C56390yDp.OLrzqt(yDY.copydefault(C56443yFo.KWHzl(true), C56443yFo.KWHzl(true)), C56405yEd.hDKMBd(arrayList)));
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                            objM7377constructorimpl = C56390yDp.OLrzqt(yDY.copydefault(C56443yFo.KWHzl(true), C56443yFo.KWHzl(false)), yDY.AhwBna());
                        }
                        pairOLrzqt = (kotlin.Pair) objM7377constructorimpl;
                    }
                    tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, tradeKLineManager$subMarketFormulaKline$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public FragmentManager(Flow flow, C38358pVv c38358pVv) {
            this.copydefault = flow;
            this.EZpvd = c38358pVv;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super kotlin.Pair<? extends java.util.ArrayList<java.lang.Boolean>, ? extends java.util.List<? extends oLY>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static /* synthetic */ AbstractC58185ywX subKline$default(C38358pVv c38358pVv, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return c38358pVv.KWHzl(str, str2, str3, z);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.AEQbTJ(str, str3, str2, z, booleanRef, booleanRef2, interfaceC58184ywW);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, InterfaceC58184ywW interfaceC58184ywW) {
        final java.util.ArrayList<java.lang.Object> arrayListCopydefault;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -1109595108) {
            if (iHashCode != 313565562) {
                if (iHashCode == 363605869 && str.equals("TYPE_INDEX_KLINE")) {
                    arrayListCopydefault = yDY.copydefault(new Dialog(str2, str3, z, interfaceC58184ywW, booleanRef, booleanRef2, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
                } else {
                    arrayListCopydefault = new java.util.ArrayList<>();
                }
            } else if (str.equals("TYPE_KLINE")) {
                arrayListCopydefault = yDY.copydefault(new LoaderManager(str2, str3, z, interfaceC58184ywW, booleanRef, booleanRef2, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
            }
        } else if (str.equals("TYPE_MARK_PRICE_KLINE")) {
            arrayListCopydefault = yDY.copydefault(new PendingIntent(str2, str3, z, interfaceC58184ywW, booleanRef, booleanRef2, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.EZpvd(arrayListCopydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$LoaderManager */
    public static final class LoaderManager extends AbstractC55677xoU {
        public final /* synthetic */ InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> AEQbTJ;
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(java.lang.String str, java.lang.String str2, boolean z, InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, java.lang.String str3) {
            super(str, str2, str3, z);
            this.AEQbTJ = interfaceC58184ywW;
            this.KWHzl = booleanRef;
            this.EZpvd = booleanRef2;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<BizKLineData> list, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW = this.AEQbTJ;
            java.lang.Boolean[] boolArr = new java.lang.Boolean[2];
            boolArr[0] = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http"));
            boolArr[1] = java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(boolArr);
            Ref.BooleanRef booleanRef = this.KWHzl;
            Ref.BooleanRef booleanRef2 = this.EZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizKLineData bizKLineData : list) {
                if (C33129mqd.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getC())), "0") && !booleanRef.element) {
                    booleanRef.element = true;
                    pUU.copydefault("ChartView", "subKline 数据转换发生异常");
                }
                if (!booleanRef2.element && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http") && C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getO())), "0")) {
                    booleanRef2.element = true;
                    pUU.copydefault("ChartView", "subKline 数据推送成功-->" + bizKLineData.getTs());
                }
                arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), C33129mqd.AEQbTJ(bizKLineData.getVolCcy()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVolCcyQuote())));
            }
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(arrayListCopydefault, arrayList));
        }
    }

    /* JADX INFO: renamed from: o.pVv$Dialog */
    public static final class Dialog extends AbstractC55673xoQ {
        public final /* synthetic */ Ref.BooleanRef AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> EZpvd;
        public final /* synthetic */ Ref.BooleanRef OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(java.lang.String str, java.lang.String str2, boolean z, InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, java.lang.String str3) {
            super(str, str2, str3, z);
            this.EZpvd = interfaceC58184ywW;
            this.AEQbTJ = booleanRef;
            this.OLrzqt = booleanRef2;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<BizKLineData> list, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW = this.EZpvd;
            java.lang.Boolean[] boolArr = new java.lang.Boolean[2];
            boolArr[0] = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http"));
            boolArr[1] = java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(boolArr);
            Ref.BooleanRef booleanRef = this.AEQbTJ;
            Ref.BooleanRef booleanRef2 = this.OLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizKLineData bizKLineData : list) {
                if (C33129mqd.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getC())), "0") && !booleanRef.element) {
                    booleanRef.element = true;
                    pUU.copydefault("ChartView", "subKline 数据转换发生异常");
                }
                if (!booleanRef2.element && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http") && C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getO())), "0")) {
                    booleanRef2.element = true;
                    pUU.copydefault("ChartView", "subKline 数据推送成功-->" + bizKLineData.getTs());
                }
                arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVolCcyQuote())));
            }
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(arrayListCopydefault, arrayList));
        }
    }

    /* JADX INFO: renamed from: o.pVv$PendingIntent */
    public static final class PendingIntent extends AbstractC55675xoS {
        public final /* synthetic */ InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ Ref.BooleanRef OLrzqt;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String, java.lang.Boolean] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void AEQbTJ(java.util.List<? extends BizKLineData> list, java.lang.String str, java.lang.Boolean bool) {
            AEQbTJ2((java.util.List<BizKLineData>) list, str, bool);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(java.lang.String str, java.lang.String str2, boolean z, InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, java.lang.String str3) {
            super(str, str2, str3, z);
            this.EZpvd = interfaceC58184ywW;
            this.KWHzl = booleanRef;
            this.OLrzqt = booleanRef2;
        }

        /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
        public void AEQbTJ2(java.util.List<BizKLineData> list, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58184ywW<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> interfaceC58184ywW = this.EZpvd;
            java.lang.Boolean[] boolArr = new java.lang.Boolean[2];
            boolArr[0] = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http"));
            boolArr[1] = java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : true);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(boolArr);
            Ref.BooleanRef booleanRef = this.KWHzl;
            Ref.BooleanRef booleanRef2 = this.OLrzqt;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizKLineData bizKLineData : list) {
                if (C33129mqd.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getC())), "0") && !booleanRef.element) {
                    booleanRef.element = true;
                    pUU.copydefault("ChartView", "subKline 数据转换发生异常");
                }
                if (!booleanRef2.element && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http") && C33129mqd.AhwBna(java.lang.Double.valueOf(C33129mqd.AEQbTJ(bizKLineData.getO())), "0")) {
                    booleanRef2.element = true;
                    pUU.copydefault("ChartView", "subKline 数据推送成功-->" + bizKLineData.getTs());
                }
                arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVolCcyQuote())));
            }
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(arrayListCopydefault, arrayList));
        }
    }

    public static final void EZpvd(java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        pUU.copydefault("subKline------>Cancell");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public final AbstractC58185ywX<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> KWHzl(@NotNull final LifecycleOwner lifecycleOwner, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.KWHzl(str, lifecycleOwner, interfaceC58184ywW);
            }
        });
    }

    public static final void KWHzl(java.lang.String str, LifecycleOwner lifecycleOwner, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        KlineBizMarketService klineBizMarketService = (KlineBizMarketService) C43417ror.OLrzqt(C56524yIo.AEQbTJ(KlineBizMarketService.class));
        java.lang.String upperCase = o.TaskDescription.AEQbTJ(str).copydefault().toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        C33024moe.subscribeOnIO$default(C58156yvv.EZpvd(klineBizMarketService.getMarketCapTrend(upperCase), lifecycleOwner), new Function1() { // from class: o.pVW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38358pVv.KWHzl(interfaceC58184ywW, (java.lang.Throwable) obj);
            }
        }, (Function0) null, new Function1() { // from class: o.pVV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38358pVv.copydefault(interfaceC58184ywW, (ResponseData) obj);
            }
        }, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        java.util.List listAhwBna;
        Intrinsics.checkNotNullParameter(responseData, "");
        java.util.List<java.util.List> list = (java.util.List) responseData.getData();
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (java.util.List list2 : list) {
                arrayList.add(new oLY(C33129mqd.valueOf(CollectionsKt___CollectionsKt.firstOrNull(list2)), AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, C33129mqd.AEQbTJ(CollectionsKt___CollectionsKt.wlaJM(list2)), AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE));
            }
            listAhwBna = C56405yEd.hDKMBd(arrayList);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        }
        java.lang.Boolean[] boolArr = new java.lang.Boolean[2];
        boolArr[0] = java.lang.Boolean.TRUE;
        boolArr[1] = java.lang.Boolean.valueOf(responseData.getCode() == 0);
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(yDY.copydefault(boolArr), listAhwBna));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InterfaceC58184ywW interfaceC58184ywW, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        interfaceC58184ywW.onNext(C56390yDp.OLrzqt(yDY.copydefault(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE), yDY.AhwBna()));
        return Unit.INSTANCE;
    }

    public final Flow<kotlin.Pair<java.util.List<java.lang.Boolean>, java.util.List<oLY>>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        pUU.KWHzl("subMarketFormulaKline", "calcExpression: " + str + ", instIdArray: " + str2 + ", bar: " + str3);
        pUU.KWHzl("subMarketFormulaKline", "WebSocket 请求已取消");
        pUU.KWHzl("subMarketFormulaKline", "WebSocket 重新创建");
        return FlowKt.m7441catch(new FragmentManager(this.OLrzqt.AYXKKw("/ws/v5/market-custom/combine-candles?calcExpression=" + str + "&instIdArray=" + str2 + "&bar=" + str3 + "&brokerId=" + (pFP.isUserInDemoTrading$default(pFP.OLrzqt, null, 1, null) ? "9999" : "0")), this), new TradeKLineManager$subMarketFormulaKline$2(null));
    }

    public final AbstractC58185ywX<java.util.List<xOA>> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.AhwBna(str, interfaceC58184ywW);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    public static final void AhwBna(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C56131xwy c56131xwyFetchVPNInfo;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) == null) {
            return;
        }
        c56131xwyFetchVPNInfo.KWHzl(str, "100", new Configuration(objectRef, interfaceC58184ywW, str));
    }

    /* JADX INFO: renamed from: o.pVv$Configuration */
    public static final class Configuration implements InterfaceC55701xos<java.util.List<? extends BizTradeData>> {
        public final /* synthetic */ Ref.ObjectRef<java.util.ArrayList<java.lang.Object>> EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<java.util.List<xOA>> OLrzqt;

        public Configuration(Ref.ObjectRef<java.util.ArrayList<java.lang.Object>> objectRef, InterfaceC58184ywW<java.util.List<xOA>> interfaceC58184ywW, java.lang.String str) {
            this.EZpvd = objectRef;
            this.OLrzqt = interfaceC58184ywW;
            this.KWHzl = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends BizTradeData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<BizTradeData>) list, exc);
        }

        /* JADX INFO: renamed from: o.pVv$Configuration$TaskDescription */
        public static final class TaskDescription extends AbstractC55739xpd {
            public final /* synthetic */ InterfaceC58184ywW<java.util.List<xOA>> OLrzqt;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(java.lang.String str, InterfaceC58184ywW<java.util.List<xOA>> interfaceC58184ywW, java.lang.String str2) {
                super(str, str2);
                this.OLrzqt = interfaceC58184ywW;
            }

            /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
            @Override // o.AbstractC55755xpt
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public void EZpvd(java.util.List<BizTradeAggregatedData> list, java.lang.String str) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(str, "");
                InterfaceC58184ywW<java.util.List<xOA>> interfaceC58184ywW = this.OLrzqt;
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (BizTradeAggregatedData bizTradeAggregatedData : list) {
                    xOA xoa = new xOA();
                    xoa.EZpvd(bizTradeAggregatedData.getPx());
                    xoa.copydefault(bizTradeAggregatedData.getSide());
                    xoa.KWHzl(bizTradeAggregatedData.getTs());
                    xoa.OLrzqt(bizTradeAggregatedData.getSz());
                    arrayList.add(xoa);
                }
                interfaceC58184ywW.onNext(arrayList);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void AEQbTJ(Ref.ObjectRef objectRef) {
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
                return;
            }
            interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) objectRef.element);
        }

        /* JADX WARN: Type inference failed for: r4v10, types: [T, java.util.ArrayList] */
        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<BizTradeData> list, java.lang.Exception exc) {
            InterfaceC54577xNn interfaceC54577xNn;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt;
            if (z) {
                if (list != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (BizTradeData bizTradeData : list) {
                        xOA xoa = new xOA();
                        xoa.EZpvd(bizTradeData.getPx());
                        xoa.copydefault(bizTradeData.getSide());
                        xoa.KWHzl(bizTradeData.getTs());
                        xoa.OLrzqt(bizTradeData.getSz());
                        arrayList.add(xoa);
                    }
                    this.OLrzqt.onNext(arrayList);
                }
                this.EZpvd.element = yDY.copydefault(new TaskDescription(this.KWHzl, this.OLrzqt, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
            }
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
                interfaceC54581xNrOLrzqt.copydefault(this.EZpvd.element);
            }
            InterfaceC58184ywW<java.util.List<xOA>> interfaceC58184ywW = this.OLrzqt;
            final Ref.ObjectRef<java.util.ArrayList<java.lang.Object>> objectRef = this.EZpvd;
            interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58225yxK
                public final void cancel() {
                    C38358pVv.Configuration.AEQbTJ(objectRef);
                }
            });
        }
    }

    public final AbstractC58185ywX<AccountBalanceData> copydefault(final java.lang.String str) {
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.AEQbTJ(str, interfaceC58184ywW);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$Fragment */
    public static final class Fragment extends AbstractC55657xoA {
        public final /* synthetic */ InterfaceC58184ywW<AccountBalanceData> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(java.lang.String str, InterfaceC58184ywW<AccountBalanceData> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(AccountBalanceData accountBalanceData, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(accountBalanceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58184ywW<AccountBalanceData> interfaceC58184ywW = this.EZpvd;
            if (Intrinsics.EZpvd(bool, java.lang.Boolean.FALSE)) {
                return;
            }
            interfaceC58184ywW.onNext(accountBalanceData);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.ArrayList] */
    public static final void AEQbTJ(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        objectRef.element = yDY.copydefault(new Fragment(str, interfaceC58184ywW, java.lang.String.valueOf(java.lang.System.currentTimeMillis())));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) objectRef.element);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.copydefault(objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(Ref.ObjectRef objectRef) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) objectRef.element);
    }

    public final AbstractC58185ywX<Triple<java.lang.Boolean, java.util.List<TradePositionData>, java.util.List<TradeUserPositionInfo>>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.EZpvd(str, str2, interfaceC58184ywW);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$ColorStateList */
    public static final class ColorStateList extends AbstractC55747xpl {
        public final /* synthetic */ InterfaceC58184ywW<Triple<java.lang.Boolean, java.util.List<TradePositionData>, java.util.List<TradeUserPositionInfo>>> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorStateList(java.lang.String str, java.lang.String str2, InterfaceC58184ywW<Triple<java.lang.Boolean, java.util.List<TradePositionData>, java.util.List<TradeUserPositionInfo>>> interfaceC58184ywW, java.lang.String str3) {
            super(str, null, str2, str3, false, 16, null);
            this.AEQbTJ = interfaceC58184ywW;
        }

        @Override // o.AbstractC55747xpl
        public void EZpvd(java.util.List<TradePositionData> list, java.lang.String str, java.util.List<TradeUserPositionInfo> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.onNext(new Triple<>(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")), list, list2));
        }

        @Override // o.AbstractC55747xpl
        public void KWHzl(java.lang.String str, java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(exc, "");
            this.AEQbTJ.onNext(new Triple<>(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")), new java.util.ArrayList(), null));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.util.ArrayList] */
    public static final void EZpvd(java.lang.String str, java.lang.String str2, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new java.util.ArrayList();
        objectRef.element = yDY.copydefault(new ColorStateList(str, str2, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) objectRef.element);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.gEmmrt(objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void gEmmrt(Ref.ObjectRef objectRef) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) objectRef.element);
    }

    /* JADX INFO: renamed from: o.pVv$TaskStackBuilder */
    public static final class TaskStackBuilder extends AbstractC55723xpN {
        public final /* synthetic */ InterfaceC58184ywW<java.util.List<TradeAllOrderApi>> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskStackBuilder(BizAllOrderReq bizAllOrderReq, InterfaceC58184ywW<java.util.List<TradeAllOrderApi>> interfaceC58184ywW) {
            super(bizAllOrderReq, null, 2, null);
            this.KWHzl = interfaceC58184ywW;
        }

        @Override // o.AbstractC55723xpN
        public void OLrzqt(java.lang.String str, java.util.List<? extends TradeAllOrderApi> list, InterfaceC55705xow interfaceC55705xow, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(interfaceC55705xow, "");
            this.KWHzl.onNext(list);
        }

        @Override // o.AbstractC55723xpN
        public void KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.onNext(new java.util.ArrayList());
        }
    }

    public final AbstractC58185ywX<java.util.List<TradeAllOrderApi>> EZpvd(@NotNull final BizAllOrderReq bizAllOrderReq, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(bizAllOrderReq, "");
        Intrinsics.checkNotNullParameter(str, "");
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.AEQbTJ(bizAllOrderReq, interfaceC58184ywW);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.util.ArrayList] */
    public static final void AEQbTJ(BizAllOrderReq bizAllOrderReq, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = yDY.copydefault(new TaskStackBuilder(bizAllOrderReq, interfaceC58184ywW));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) objectRef.element);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.OLrzqt(objectRef);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(Ref.ObjectRef objectRef) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) objectRef.element);
    }

    public final AbstractC58185ywX<C37936pGe> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, final boolean z) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        final BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str3)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str2);
        final java.lang.String tradeSymbol = bizInstrumentValueOf != null ? bizInstrumentValueOf.getTradeSymbol() : null;
        final java.lang.String quoteSymbol = bizInstrumentValueOf != null ? bizInstrumentValueOf.getQuoteSymbol() : null;
        final java.lang.String underlying = bizInstrumentValueOf != null ? bizInstrumentValueOf.getUnderlying() : null;
        AbstractC58185ywX<C37936pGe> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pVA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.AEQbTJ(str, str3, underlying, tradeSymbol, z, bizInstrumentValueOf, str2, quoteSymbol, this, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, BizInstrument bizInstrument, java.lang.String str5, java.lang.String str6, final C38358pVv c38358pVv, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C37936pGe c37936pGe = new C37936pGe();
        final java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        arrayList.add(new IntentFilter(str5, c37936pGe, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") || pFS.KWHzl.AEQbTJ(str5)) {
            arrayList.add(new ServiceConnection(str5, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        }
        arrayList.add(new AssetManager(c37936pGe, c38358pVv, interfaceC58184ywW, str4 == null ? "" : str4, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        arrayList.add(new PackageManager(c37936pGe, c38358pVv, interfaceC58184ywW, str6 == null ? "" : str6, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(new ApplicationInfo(str5, c37936pGe, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new SharedPreferences(str5, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_KLINE")) {
            if (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "MARGIN")) {
                arrayList = arrayListCopydefault;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) != null) {
                c56131xwyFetchVPNInfo.EZpvd(null, str3, new Intent(c37936pGe, c38358pVv, interfaceC58184ywW));
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = new DialogInterface(c37936pGe, c38358pVv, interfaceC58184ywW, str3 == null ? "" : str3, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            objArr[1] = new ContentResolver(c37936pGe, c38358pVv, interfaceC58184ywW, str4 == null ? "" : str4, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            objArr[2] = new ContextWrapper(str5, c37936pGe, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
            arrayList = yDY.copydefault(objArr);
        } else {
            arrayList = yDY.copydefault(new Context(str5, c37936pGe, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new IntentSender(str5, c37936pGe, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_KLINE") && !Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "OPTION") && z && bizInstrument != null) {
            getLastPrice$default(c38358pVv, bizInstrument, c37936pGe, null, interfaceC58184ywW, null, 20, null);
            getMarkPriceListener$default(c38358pVv, bizInstrument, c37936pGe, null, interfaceC58184ywW, null, 20, null);
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "MARGIN")) {
                c38358pVv.copydefault(bizInstrument, c37936pGe, (InterfaceC58184ywW<C37936pGe>) interfaceC58184ywW);
            }
        }
        InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM2 != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt2.copydefault(arrayList);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.KWHzl(this.AEQbTJ, arrayList);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$IntentFilter */
    public static final class IntentFilter extends AbstractC55737xpb {
        public final /* synthetic */ C38358pVv AEQbTJ;
        public final /* synthetic */ C37936pGe EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntentFilter(java.lang.String str, C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.EZpvd = c37936pGe;
            this.AEQbTJ = c38358pVv;
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.EZpvd;
            C38358pVv c38358pVv = this.AEQbTJ;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.KWHzl;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(c38358pVv.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$ServiceConnection */
    public static final class ServiceConnection extends AbstractC55676xoT {
        public final /* synthetic */ C37936pGe KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceConnection(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.KWHzl = c37936pGe;
            this.copydefault = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.copydefault(xMJ.KWHzl.AEQbTJ(markPriceData));
            this.copydefault.onNext(this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.pVv$AssetManager */
    public static final class AssetManager extends AbstractC55744xpi {
        public final /* synthetic */ C37936pGe AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> EZpvd;
        public final /* synthetic */ C38358pVv copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssetManager(C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
            this.AEQbTJ = c37936pGe;
            this.copydefault = c38358pVv;
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.AEQbTJ(this.copydefault.AEQbTJ(tickersData));
            this.EZpvd.onNext(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.pVv$PackageManager */
    public static final class PackageManager extends AbstractC55744xpi {
        public final /* synthetic */ C37936pGe EZpvd;
        public final /* synthetic */ C38358pVv KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PackageManager(C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
            this.EZpvd = c37936pGe;
            this.KWHzl = c38358pVv;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.KWHzl(this.KWHzl.AEQbTJ(tickersData));
            this.OLrzqt.onNext(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.pVv$ApplicationInfo */
    public static final class ApplicationInfo extends AbstractC55737xpb {
        public final /* synthetic */ C37936pGe AEQbTJ;
        public final /* synthetic */ C38358pVv KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ApplicationInfo(java.lang.String str, C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.AEQbTJ = c37936pGe;
            this.KWHzl = c38358pVv;
            this.copydefault = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.AEQbTJ;
            C38358pVv c38358pVv = this.KWHzl;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.copydefault;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(c38358pVv.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$SharedPreferences */
    public static final class SharedPreferences extends AbstractC55676xoT {
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> EZpvd;
        public final /* synthetic */ C37936pGe KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedPreferences(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.KWHzl = c37936pGe;
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl.copydefault(xMJ.KWHzl.AEQbTJ(markPriceData));
            this.EZpvd.onNext(this.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.pVv$Intent */
    public static final class Intent implements InterfaceC55701xos<java.util.List<? extends IndexTickersData>> {
        public final /* synthetic */ C37936pGe AEQbTJ;
        public final /* synthetic */ C38358pVv OLrzqt;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> copydefault;

        public Intent(C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW) {
            this.AEQbTJ = c37936pGe;
            this.OLrzqt = c38358pVv;
            this.copydefault = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<IndexTickersData> list, java.lang.Exception exc) {
            IndexTickersData indexTickersData;
            if (!z || list == null || (indexTickersData = (IndexTickersData) CollectionsKt___CollectionsKt.AuCTelauCTel(list)) == null) {
                return;
            }
            C37936pGe c37936pGe = this.AEQbTJ;
            C38358pVv c38358pVv = this.OLrzqt;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.copydefault;
            c37936pGe.EZpvd(c38358pVv.OLrzqt(indexTickersData));
            interfaceC58184ywW.onNext(c37936pGe);
        }
    }

    /* JADX INFO: renamed from: o.pVv$DialogInterface */
    public static final class DialogInterface extends AbstractC55671xoO {
        public final /* synthetic */ C38358pVv AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> KWHzl;
        public final /* synthetic */ C37936pGe copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DialogInterface(C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2);
            this.copydefault = c37936pGe;
            this.AEQbTJ = c38358pVv;
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.EZpvd(this.AEQbTJ.OLrzqt(indexTickersData));
            this.KWHzl.onNext(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.pVv$ContentResolver */
    public static final class ContentResolver extends AbstractC55744xpi {
        public final /* synthetic */ C37936pGe EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;
        public final /* synthetic */ C38358pVv copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentResolver(C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str, java.lang.String str2) {
            super(str, str2, false, null, 12, null);
            this.EZpvd = c37936pGe;
            this.copydefault = c38358pVv;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(TickersData tickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(tickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.AEQbTJ(this.copydefault.AEQbTJ(tickersData));
            this.OLrzqt.onNext(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.pVv$ContextWrapper */
    public static final class ContextWrapper extends AbstractC55737xpb {
        public final /* synthetic */ C38358pVv AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> EZpvd;
        public final /* synthetic */ C37936pGe OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContextWrapper(java.lang.String str, C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.OLrzqt = c37936pGe;
            this.AEQbTJ = c38358pVv;
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.OLrzqt;
            C38358pVv c38358pVv = this.AEQbTJ;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.EZpvd;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(c38358pVv.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$Context */
    public static final class Context extends AbstractC55737xpb {
        public final /* synthetic */ C37936pGe EZpvd;
        public final /* synthetic */ C38358pVv KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Context(java.lang.String str, C37936pGe c37936pGe, C38358pVv c38358pVv, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.EZpvd = c37936pGe;
            this.KWHzl = c38358pVv;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.String] */
        @Override // o.AbstractC55755xpt
        public /* bridge */ /* synthetic */ void EZpvd(java.util.List<? extends TickersData> list, java.lang.String str) {
            EZpvd2((java.util.List<TickersData>) list, str);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            C37936pGe c37936pGe = this.EZpvd;
            C38358pVv c38358pVv = this.KWHzl;
            InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.OLrzqt;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                c37936pGe.copydefault(c38358pVv.AEQbTJ((TickersData) it.next()));
                interfaceC58184ywW.onNext(c37936pGe);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$IntentSender */
    public static final class IntentSender extends AbstractC55676xoT {
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> KWHzl;
        public final /* synthetic */ C37936pGe OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntentSender(java.lang.String str, C37936pGe c37936pGe, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.OLrzqt = c37936pGe;
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt.copydefault(xMJ.KWHzl.AEQbTJ(markPriceData));
            this.KWHzl.onNext(this.OLrzqt);
        }
    }

    public static final void KWHzl(C38358pVv c38358pVv, java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC58217yxC interfaceC58217yxC = c38358pVv.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        xBJ xbj = c38358pVv.AEQbTJ;
        if (xbj != null) {
            xbj.AYXKKw();
        }
        C54289xCx c54289xCx = c38358pVv.copydefault;
        if (c54289xCx != null) {
            c54289xCx.AYXKKw();
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public final AbstractC58185ywX<ActionBar> KWHzl(@NotNull final java.lang.String str, @NotNull java.lang.String str2, @NotNull final java.lang.String str3) {
        java.lang.String instFamily;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        final BizInstrument bizInstrumentValueOf = (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) == null) ? null : abstractC54531xLwOLrzqt.valueOf(str);
        final java.lang.String str4 = (bizInstrumentValueOf == null || (instFamily = bizInstrumentValueOf.getInstFamily()) == null) ? "" : instFamily;
        AbstractC58185ywX<ActionBar> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.copydefault(str3, bizInstrumentValueOf, str, this, str4, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void copydefault(java.lang.String str, BizInstrument bizInstrument, java.lang.String str2, final C38358pVv c38358pVv, java.lang.String str3, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        ActionBar actionBar = new ActionBar();
        final java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(new SharedElementCallback(str2, actionBar, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new AssistContent(str2, actionBar, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new ClipData(str2, actionBar, interfaceC58184ywW, "OPTION", C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new BroadcastReceiver(str2, actionBar, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new ComponentCallbacks2(str2, bizInstrument, interfaceC58184ywW, actionBar, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))), new ComponentName(str3, actionBar, c38358pVv, interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_MARK_PRICE_KLINE") && bizInstrument != null) {
            getLastPrice$default(c38358pVv, bizInstrument, null, actionBar, null, interfaceC58184ywW, 10, null);
            getMarkPriceListener$default(c38358pVv, bizInstrument, null, actionBar, null, interfaceC58184ywW, 10, null);
            c38358pVv.EZpvd(bizInstrument, actionBar, (InterfaceC58184ywW<ActionBar>) interfaceC58184ywW);
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.OLrzqt(this.OLrzqt, arrayListCopydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$SharedElementCallback */
    public static final class SharedElementCallback extends AbstractC55676xoT {
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> KWHzl;
        public final /* synthetic */ ActionBar copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SharedElementCallback(java.lang.String str, ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.copydefault = actionBar;
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault.OLrzqt(xMJ.KWHzl.AEQbTJ(markPriceData));
            this.KWHzl.onNext(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.pVv$AssistContent */
    public static final class AssistContent extends AbstractC55737xpb {
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> AEQbTJ;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ C38358pVv KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AssistContent(java.lang.String str, ActionBar actionBar, C38358pVv c38358pVv, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, false, 4, null);
            this.OLrzqt = str;
            this.EZpvd = actionBar;
            this.KWHzl = c38358pVv;
            this.AEQbTJ = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String str2 = this.OLrzqt;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((TickersData) next).getInstId(), (java.lang.Object) str2)) {
                        break;
                    }
                }
            }
            TickersData tickersData = (TickersData) next;
            if (tickersData != null) {
                ActionBar actionBar = this.EZpvd;
                C38358pVv c38358pVv = this.KWHzl;
                InterfaceC58184ywW<ActionBar> interfaceC58184ywW = this.AEQbTJ;
                actionBar.EZpvd(c38358pVv.AEQbTJ(tickersData));
                interfaceC58184ywW.onNext(actionBar);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$ClipData */
    public static final class ClipData extends AbstractC55668xoL {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClipData(java.lang.String str, ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2, java.lang.String str3) {
            super(str2, null, str3, str, 2, null);
            this.AEQbTJ = str;
            this.EZpvd = actionBar;
            this.copydefault = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<EstimatedPriceData> list, java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String str2 = this.AEQbTJ;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((EstimatedPriceData) next).getInstId(), (java.lang.Object) str2)) {
                        break;
                    }
                }
            }
            EstimatedPriceData estimatedPriceData = (EstimatedPriceData) next;
            if (estimatedPriceData != null) {
                ActionBar actionBar = this.EZpvd;
                InterfaceC58184ywW<ActionBar> interfaceC58184ywW = this.copydefault;
                actionBar.copydefault(estimatedPriceData.getSettlePx());
                interfaceC58184ywW.onNext(actionBar);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$BroadcastReceiver */
    public static final class BroadcastReceiver extends AbstractC55681xoY {
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> AEQbTJ;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BroadcastReceiver(java.lang.String str, ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2) {
            super(null, str2, str);
            this.copydefault = str;
            this.EZpvd = actionBar;
            this.AEQbTJ = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<OptSummaryData> list, java.lang.String str) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String str2 = this.copydefault;
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((OptSummaryData) next).getInstId(), (java.lang.Object) str2)) {
                        break;
                    }
                }
            }
            OptSummaryData optSummaryData = (OptSummaryData) next;
            if (optSummaryData != null) {
                ActionBar actionBar = this.EZpvd;
                InterfaceC58184ywW<ActionBar> interfaceC58184ywW = this.AEQbTJ;
                actionBar.EZpvd(optSummaryData);
                interfaceC58184ywW.onNext(actionBar);
            }
        }
    }

    /* JADX INFO: renamed from: o.pVv$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 extends AbstractC55682xoZ {
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> AEQbTJ;
        public final /* synthetic */ BizInstrument EZpvd;
        public final /* synthetic */ ActionBar copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentCallbacks2(java.lang.String str, BizInstrument bizInstrument, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, ActionBar actionBar, java.lang.String str2) {
            super(str, str2);
            this.EZpvd = bizInstrument;
            this.AEQbTJ = interfaceC58184ywW;
            this.copydefault = actionBar;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(OpenInterestData openInterestData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(openInterestData, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (this.EZpvd != null) {
                this.copydefault.EZpvd(openInterestData.getOi());
            }
            this.AEQbTJ.onNext(this.copydefault);
        }
    }

    /* JADX INFO: renamed from: o.pVv$ComponentName */
    public static final class ComponentName extends AbstractC55671xoO {
        public final /* synthetic */ ActionBar AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> OLrzqt;
        public final /* synthetic */ C38358pVv copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentName(java.lang.String str, ActionBar actionBar, C38358pVv c38358pVv, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.AEQbTJ = actionBar;
            this.copydefault = c38358pVv;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void EZpvd(IndexTickersData indexTickersData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(indexTickersData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.EZpvd(this.copydefault.OLrzqt(indexTickersData));
            this.OLrzqt.onNext(this.AEQbTJ);
        }
    }

    public static final void OLrzqt(C38358pVv c38358pVv, java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC58217yxC interfaceC58217yxC = c38358pVv.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        xBJ xbj = c38358pVv.AEQbTJ;
        if (xbj != null) {
            xbj.AYXKKw();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = c38358pVv.EZpvd;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.pVv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getLastPrice$default(C38358pVv c38358pVv, BizInstrument bizInstrument, C37936pGe c37936pGe, ActionBar actionBar, InterfaceC58184ywW interfaceC58184ywW, InterfaceC58184ywW interfaceC58184ywW2, int i, java.lang.Object obj) {
        c38358pVv.EZpvd(bizInstrument, (i & 2) != 0 ? null : c37936pGe, (i & 4) != 0 ? null : actionBar, (i & 8) != 0 ? null : interfaceC58184ywW, (i & 16) != 0 ? null : interfaceC58184ywW2);
    }

    public final void EZpvd(BizInstrument bizInstrument, C37936pGe c37936pGe, ActionBar actionBar, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, InterfaceC58184ywW<ActionBar> interfaceC58184ywW2) {
        C56131xwy c56131xwyFetchVPNInfo;
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        this.KWHzl = (interfaceC54581xNrOLrzqt == null || (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) == null) ? null : c56131xwyFetchVPNInfo.AEQbTJ(bizInstrument.getInstId(), new Application(bizInstrument, this, c37936pGe, actionBar, interfaceC58184ywW, interfaceC58184ywW2));
    }

    /* JADX INFO: renamed from: o.pVv$Application */
    public static final class Application implements InterfaceC55701xos<TickersData> {
        public final /* synthetic */ InterfaceC58184ywW<C37936pGe> AEQbTJ;
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ C37936pGe KWHzl;
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> OLrzqt;
        public final /* synthetic */ BizInstrument copydefault;
        public final /* synthetic */ C38358pVv gEmmrt;

        public Application(BizInstrument bizInstrument, C38358pVv c38358pVv, C37936pGe c37936pGe, ActionBar actionBar, InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, InterfaceC58184ywW<ActionBar> interfaceC58184ywW2) {
            this.copydefault = bizInstrument;
            this.gEmmrt = c38358pVv;
            this.KWHzl = c37936pGe;
            this.EZpvd = actionBar;
            this.AEQbTJ = interfaceC58184ywW;
            this.OLrzqt = interfaceC58184ywW2;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, TickersData tickersData, java.lang.Exception exc) {
            if (z && tickersData != null && Intrinsics.EZpvd((java.lang.Object) tickersData.getInstId(), (java.lang.Object) this.copydefault.getInstId())) {
                xMJ.Application applicationAEQbTJ = this.gEmmrt.AEQbTJ(tickersData);
                C37936pGe c37936pGe = this.KWHzl;
                if (c37936pGe != null) {
                    InterfaceC58184ywW<C37936pGe> interfaceC58184ywW = this.AEQbTJ;
                    c37936pGe.copydefault(applicationAEQbTJ);
                    if (interfaceC58184ywW != null) {
                        interfaceC58184ywW.onNext(c37936pGe);
                    }
                }
                ActionBar actionBar = this.EZpvd;
                if (actionBar != null) {
                    InterfaceC58184ywW<ActionBar> interfaceC58184ywW2 = this.OLrzqt;
                    actionBar.EZpvd(applicationAEQbTJ);
                    if (interfaceC58184ywW2 != null) {
                        interfaceC58184ywW2.onNext(actionBar);
                    }
                }
            }
        }
    }

    public final void EZpvd(BizInstrument bizInstrument, ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW) {
        C56131xwy c56131xwyFetchVPNInfo;
        java.lang.String underlying = bizInstrument.getUnderlying();
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        InterfaceC58217yxC interfaceC58217yxCEZpvd = null;
        if (interfaceC54581xNrOLrzqt != null && (c56131xwyFetchVPNInfo = interfaceC54581xNrOLrzqt.fetchVPNInfo()) != null) {
            interfaceC58217yxCEZpvd = c56131xwyFetchVPNInfo.EZpvd(null, underlying, new Activity(actionBar, interfaceC58184ywW));
        }
        this.EZpvd = interfaceC58217yxCEZpvd;
    }

    /* JADX INFO: renamed from: o.pVv$Activity */
    public static final class Activity implements InterfaceC55701xos<java.util.List<? extends IndexTickersData>> {
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> EZpvd;
        public final /* synthetic */ ActionBar copydefault;

        public Activity(ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW) {
            this.copydefault = actionBar;
            this.EZpvd = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends IndexTickersData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<IndexTickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<IndexTickersData> list, java.lang.Exception exc) {
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                IndexTickersData indexTickersData = list != null ? list.get(0) : null;
                if (indexTickersData != null) {
                    C38358pVv c38358pVv = C38358pVv.this;
                    ActionBar actionBar = this.copydefault;
                    InterfaceC58184ywW<ActionBar> interfaceC58184ywW = this.EZpvd;
                    actionBar.EZpvd(c38358pVv.OLrzqt(indexTickersData));
                    interfaceC58184ywW.onNext(actionBar);
                }
            }
        }
    }

    public final void copydefault(final BizInstrument bizInstrument, final C37936pGe c37936pGe, final InterfaceC58184ywW<C37936pGe> interfaceC58184ywW) {
        TickerCupReq tickerCupReq = new TickerCupReq(yDY.AhwBna(bizInstrument.getTradeSymbol(), bizInstrument.getQuoteSymbol()));
        C54289xCx c54289xCx = new C54289xCx();
        c54289xCx.OLrzqt(tickerCupReq);
        c54289xCx.KWHzl(new Function1() { // from class: o.pVH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38358pVv.copydefault(bizInstrument, this, c37936pGe, interfaceC58184ywW, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(c54289xCx, 0L, 1, null);
        this.copydefault = c54289xCx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.pVv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMarkPriceListener$default(C38358pVv c38358pVv, BizInstrument bizInstrument, C37936pGe c37936pGe, ActionBar actionBar, InterfaceC58184ywW interfaceC58184ywW, InterfaceC58184ywW interfaceC58184ywW2, int i, java.lang.Object obj) {
        c38358pVv.OLrzqt(bizInstrument, (i & 2) != 0 ? null : c37936pGe, (i & 4) != 0 ? null : actionBar, (InterfaceC58184ywW<C37936pGe>) ((i & 8) != 0 ? null : interfaceC58184ywW), (InterfaceC58184ywW<ActionBar>) ((i & 16) != 0 ? null : interfaceC58184ywW2));
    }

    public final void OLrzqt(final BizInstrument bizInstrument, final C37936pGe c37936pGe, final ActionBar actionBar, final InterfaceC58184ywW<C37936pGe> interfaceC58184ywW, final InterfaceC58184ywW<ActionBar> interfaceC58184ywW2) {
        java.lang.String instType = Intrinsics.EZpvd((java.lang.Object) bizInstrument.getInstType(), (java.lang.Object) "SPOT") ? "MARGIN" : bizInstrument.getInstType();
        xBJ xbj = new xBJ();
        xbj.copydefault(instType);
        xbj.EZpvd((java.lang.String) null);
        xbj.OLrzqt(bizInstrument.getInstId());
        xbj.KWHzl(new Function1() { // from class: o.pVu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38358pVv.KWHzl(bizInstrument, c37936pGe, actionBar, interfaceC58184ywW, interfaceC58184ywW2, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xbj, 0L, 1, null);
        this.AEQbTJ = xbj;
    }

    public final AbstractC58185ywX<ActionBar> AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<ActionBar> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pVD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.KWHzl(str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void KWHzl(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(new VoiceInteractor(str, new ActionBar(), interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.pVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                C38358pVv.djBIcL(arrayListCopydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$VoiceInteractor */
    public static final class VoiceInteractor extends AbstractC55676xoT {
        public final /* synthetic */ ActionBar EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<ActionBar> OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceInteractor(java.lang.String str, ActionBar actionBar, InterfaceC58184ywW<ActionBar> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2);
            this.EZpvd = actionBar;
            this.OLrzqt = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        public void EZpvd(MarkPriceData markPriceData, java.lang.String str) {
            Intrinsics.checkNotNullParameter(markPriceData, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd.OLrzqt(xMJ.KWHzl.AEQbTJ(markPriceData));
            this.OLrzqt.onNext(this.EZpvd);
        }
    }

    public static final void djBIcL(java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    /* JADX INFO: renamed from: o.pVv$TaskDescription */
    public static final class TaskDescription implements InterfaceC58229yxO<kotlin.Pair<? extends java.util.List<? extends java.lang.Boolean>, ? extends java.util.List<? extends oLY>>, kotlin.Pair<? extends java.util.List<? extends java.lang.Boolean>, ? extends java.lang.String>> {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;

        public TaskDescription(@NotNull java.lang.String str, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Method merged with bridge method: apply(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.InterfaceC58229yxO
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public kotlin.Pair<java.util.List<java.lang.Boolean>, java.lang.String> apply(@NotNull kotlin.Pair<? extends java.util.List<java.lang.Boolean>, ? extends java.util.List<? extends oLY>> pair) {
            java.lang.Object obj;
            Intrinsics.checkNotNullParameter(pair, "");
            java.util.List<? extends oLY> second = pair.getSecond();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(second, 10));
            for (oLY oly : second) {
                if (oly.valueOf <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    obj = Unit.INSTANCE;
                } else {
                    JsonObject jsonObject = new JsonObject();
                    InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
                    if (interfaceC46557tYt != null && interfaceC46557tYt.EZpvd() == 2 && this.AEQbTJ >= 1440) {
                        jsonObject.addProperty(CrashHianalyticsData.TIME, java.lang.Long.valueOf(oly.EZpvd + ((long) 28800000)));
                    } else {
                        jsonObject.addProperty(CrashHianalyticsData.TIME, java.lang.Long.valueOf(oly.EZpvd));
                    }
                    jsonObject.addProperty("open", java.lang.Double.valueOf(oly.valueOf));
                    jsonObject.addProperty(EopTrackEvent.CLOSE, java.lang.Double.valueOf(oly.KWHzl));
                    jsonObject.addProperty("high", java.lang.Double.valueOf(oly.copydefault));
                    jsonObject.addProperty("low", java.lang.Double.valueOf(oly.OLrzqt));
                    if (Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) "MARGIN")) {
                        jsonObject.addProperty("volume", java.lang.Double.valueOf(oly.djBIcL));
                    } else {
                        jsonObject.addProperty("volume", java.lang.Double.valueOf(oly.AhwBna));
                    }
                    obj = jsonObject;
                }
                arrayList.add(obj);
            }
            return C56390yDp.OLrzqt(pair.getFirst(), new Gson().toJson(arrayList));
        }
    }

    public final AbstractC58185ywX<StateListAnimator> gEmmrt(@NotNull final java.util.ArrayList<java.lang.String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        return OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.KWHzl(arrayList, arrayList2, interfaceC58184ywW);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.pVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C38358pVv.AhwBna(arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$ComponentCallbacks */
    public static final class ComponentCallbacks extends AbstractC55737xpb {
        public final /* synthetic */ InterfaceC58184ywW<StateListAnimator> AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComponentCallbacks(java.lang.String str, InterfaceC58184ywW<StateListAnimator> interfaceC58184ywW, java.lang.String str2) {
            super(str, str2, true);
            this.AEQbTJ = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.onNext(new StateListAnimator(list, str));
        }
    }

    public static final void AhwBna(java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public final AbstractC58185ywX<java.util.Map<java.lang.String, java.util.List<oLY>>> AEQbTJ(@NotNull final java.util.ArrayList<java.lang.String> arrayList, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        final java.util.ArrayList arrayList2 = new java.util.ArrayList();
        AbstractC58185ywX abstractC58185ywXCopydefault = OLrzqt(new InterfaceC58187ywZ() { // from class: o.pVF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C38358pVv.copydefault(arrayList, arrayList2, str, interfaceC58184ywW);
            }
        }).copydefault(200L, java.util.concurrent.TimeUnit.MILLISECONDS);
        final Function1 function1 = new Function1() { // from class: o.pVJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C38358pVv.OLrzqt((java.util.List) obj));
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58239yxY() { // from class: o.pVI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58239yxY
            public final boolean test(java.lang.Object obj) {
                return C38358pVv.AEQbTJ(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.pVM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C38358pVv.AEQbTJ((java.util.List) obj);
            }
        };
        return abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58229yxO() { // from class: o.pVL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C38358pVv.OLrzqt(function12, obj);
            }
        }).copydefault(new InterfaceC58222yxH() { // from class: o.pVK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C38358pVv.valueOf(arrayList2);
            }
        });
    }

    /* JADX INFO: renamed from: o.pVv$PictureInPictureParams */
    public static final class PictureInPictureParams extends AbstractC55677xoU {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<kotlin.Pair<java.lang.String, java.util.List<oLY>>> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PictureInPictureParams(java.lang.String str, java.lang.String str2, InterfaceC58184ywW<kotlin.Pair<java.lang.String, java.util.List<oLY>>> interfaceC58184ywW, java.lang.String str3) {
            super(str, str2, str3, false);
            this.EZpvd = str2;
            this.KWHzl = interfaceC58184ywW;
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Boolean;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<BizKLineData> list, java.lang.String str, java.lang.Boolean bool) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            InterfaceC58184ywW<kotlin.Pair<java.lang.String, java.util.List<oLY>>> interfaceC58184ywW = this.KWHzl;
            java.lang.String str2 = this.EZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (BizKLineData bizKLineData : list) {
                arrayList.add(new oLY(C33129mqd.valueOf(bizKLineData.getTs()), C33129mqd.AEQbTJ(bizKLineData.getO()), C33129mqd.AEQbTJ(bizKLineData.getH()), C33129mqd.AEQbTJ(bizKLineData.getL()), C33129mqd.AEQbTJ(bizKLineData.getC()), C33129mqd.AEQbTJ(bizKLineData.getVolCcy()), C33129mqd.AEQbTJ(bizKLineData.getVol()), C33129mqd.AEQbTJ(bizKLineData.getVolCcyQuote())));
            }
            interfaceC58184ywW.onNext(C56390yDp.OLrzqt(str2, arrayList));
        }
    }

    public static final boolean AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return !list.isEmpty();
    }

    public static final java.util.Map AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C56424yEw.copydefault(list);
    }

    public static final java.util.Map OLrzqt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.Map) function1.invoke(obj);
    }

    public static final void valueOf(java.util.ArrayList arrayList) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
    }

    public final xMJ.TaskDescription OLrzqt(@NotNull IndexTickersData indexTickersData) {
        Intrinsics.checkNotNullParameter(indexTickersData, "");
        xMJ.TaskDescription taskDescription = new xMJ.TaskDescription();
        taskDescription.copydefault(indexTickersData.getIdxPx());
        taskDescription.OLrzqt(indexTickersData.getHigh24h());
        taskDescription.KWHzl(indexTickersData.getLow24h());
        taskDescription.EZpvd(indexTickersData.getOpen24h());
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8()) : null;
        taskDescription.djBIcL(strOLrzqt != null ? strOLrzqt : "");
        taskDescription.AEQbTJ(C37925pFu.KWHzl.KWHzl(indexTickersData.getIdxPx(), indexTickersData.getOpen24h(), indexTickersData.getSodUtc0(), indexTickersData.getSodUtc8()).getSecond());
        return taskDescription;
    }

    public final xMJ.Application AEQbTJ(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        xMJ.Application application = new xMJ.Application();
        application.AhwBna(tickersData.getLast());
        application.KWHzl(tickersData.getLastSz());
        application.djBIcL(tickersData.getOpen24h());
        application.AkhnZx(tickersData.getSodUtc0());
        application.values(tickersData.getSodUtc8());
        InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
        java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()) : null;
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        application.isConnected(strOLrzqt);
        application.AYXKKw(tickersData.getHigh24h());
        application.valueOf(tickersData.getLow24h());
        application.DbNXlk(tickersData.getVolCcy24h());
        application.fetchVPNInfo(tickersData.getVol24h());
        java.lang.String askPx = tickersData.getAskPx();
        if (askPx == null) {
            askPx = "";
        }
        application.OLrzqt(askPx);
        java.lang.String bidPx = tickersData.getBidPx();
        application.AEQbTJ(bidPx != null ? bidPx : "");
        application.EZpvd(C37925pFu.KWHzl.KWHzl(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()).getSecond());
        return application;
    }

    /* JADX INFO: renamed from: o.pVv$StateListAnimator */
    public static final class StateListAnimator {
        public final java.util.List<TickersData> KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TickersData> OLrzqt() {
            return this.KWHzl;
        }

        public StateListAnimator(@NotNull java.util.List<TickersData> list, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = list;
            this.copydefault = str;
        }
    }

    public static final Unit copydefault(BizInstrument bizInstrument, C38358pVv c38358pVv, C37936pGe c37936pGe, InterfaceC58184ywW interfaceC58184ywW, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            for (TickersData tickersData : (java.lang.Iterable) data) {
                if (Intrinsics.EZpvd((java.lang.Object) tickersData.getCcy(), (java.lang.Object) bizInstrument.getTradeSymbol())) {
                    c37936pGe.AEQbTJ(c38358pVv.AEQbTJ(tickersData));
                    interfaceC58184ywW.onNext(c37936pGe);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(BizInstrument bizInstrument, C37936pGe c37936pGe, ActionBar actionBar, InterfaceC58184ywW interfaceC58184ywW, InterfaceC58184ywW interfaceC58184ywW2, ResponseData responseData) {
        java.util.List list;
        MarkPriceData markPriceData;
        MarkPriceData markPriceData2;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            java.util.List list2 = (java.util.List) responseData.getData();
            if (Intrinsics.EZpvd((java.lang.Object) ((list2 == null || (markPriceData2 = (MarkPriceData) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) == null) ? null : markPriceData2.getInstId()), (java.lang.Object) bizInstrument.getInstId()) && (list = (java.util.List) responseData.getData()) != null && (markPriceData = (MarkPriceData) CollectionsKt___CollectionsKt.AkhnZx(list, 0)) != null) {
                xMJ.StateListAnimator stateListAnimatorAEQbTJ = xMJ.KWHzl.AEQbTJ(markPriceData);
                if (c37936pGe != null) {
                    c37936pGe.copydefault(stateListAnimatorAEQbTJ);
                    if (interfaceC58184ywW != null) {
                        interfaceC58184ywW.onNext(c37936pGe);
                    }
                }
                if (actionBar != null) {
                    actionBar.OLrzqt(stateListAnimatorAEQbTJ);
                    if (interfaceC58184ywW2 != null) {
                        interfaceC58184ywW2.onNext(actionBar);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new ComponentCallbacks((java.lang.String) it.next(), interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        }
        arrayList2.addAll(arrayList3);
        if (arrayList2.size() <= 0 || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) arrayList2);
    }

    public static final void copydefault(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new PictureInPictureParams(str, (java.lang.String) it.next(), interfaceC58184ywW, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        }
        arrayList2.addAll(arrayList3);
        if (arrayList2.size() <= 0 || (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault((java.util.ArrayList<java.lang.Object>) arrayList2);
    }
}

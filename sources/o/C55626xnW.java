package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTicker$1;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTicker$2;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTicker$3;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTickerForInstIds$1;
import com.okinc.unify_trade.ITradeMarketExtKt$createInstListTickerForInstIds$3;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xnW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55626xnW {
    public static final java.lang.String OLrzqt(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(tickersData, "");
        return AEQbTJ(interfaceC54581xNr, tickersData.getLast());
    }

    public static final java.lang.String AEQbTJ(@NotNull InterfaceC54581xNr interfaceC54581xNr, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(interfaceC54581xNr, "");
        Intrinsics.checkNotNullParameter(str, "");
        C54536xML c54536xMLAYXKKw = interfaceC54581xNr.KWHzl().AYXKKw(str);
        c54536xMLAYXKKw.values();
        return C54536xML.toSafeString$default(c54536xMLAYXKKw.AkhnZx().isConnected().djBIcL(), false, 1, null);
    }

    /* JADX INFO: renamed from: o.xnW$Activity */
    public static final class Activity implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.xnW$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ITradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1 iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1;
                java.util.List listAhwBna;
                if (continuation instanceof ITradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1) {
                    iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1 = (ITradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1) continuation;
                    int i = iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1 = new ITradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                    if (tickersDataOLrzqt == null || (listAhwBna = C56402yEa.EZpvd(tickersDataOLrzqt)) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listAhwBna, iTradeMarketExtKt$createInstListTicker$$inlined$map$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.xnW$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.xnW$Application$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1 iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1;
                java.util.List listAhwBna;
                if (continuation instanceof ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1) {
                    iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1 = (ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1) continuation;
                    int i = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1 = new ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                    if (tickersDataOLrzqt == null || (listAhwBna = C56402yEa.EZpvd(tickersDataOLrzqt)) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(listAhwBna, iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$2$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.xnW$StateListAnimator */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator implements Flow<java.util.List<? extends TickersData>> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.xnW$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1 iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1;
                java.util.List listAhwBna;
                if (continuation instanceof ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1) {
                    iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1 = (ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1) continuation;
                    int i = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1 = new ITradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(((OKIncomingData) obj).getPayload().toString());
                    if (tickersDataOLrzqt == null || (listAhwBna = C56402yEa.EZpvd(tickersDataOLrzqt)) == null) {
                        listAhwBna = yDY.AhwBna();
                    }
                    iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listAhwBna, iTradeMarketExtKt$createInstListTickerForInstIds$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends TickersData>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlin.Pair getPriceRiceLimit$default(TickersData tickersData, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(tickersData, z);
    }

    public static final kotlin.Pair<java.lang.Double, java.lang.String> copydefault(@NotNull TickersData tickersData, boolean z) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        return C55692xoj.KWHzl.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8(), z);
    }

    /* JADX INFO: renamed from: o.xnW$Dialog */
    public static final class Dialog implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ java.util.List<java.lang.String> EZpvd;
        public final /* synthetic */ CancellableContinuation<java.util.List<TickersData>> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(CancellableContinuation<? super java.util.List<TickersData>> cancellableContinuation, java.util.List<java.lang.String> list) {
            this.copydefault = cancellableContinuation;
            this.EZpvd = list;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (this.copydefault.isActive() && z && C33129mqd.KWHzl((java.util.Collection) list)) {
                CancellableContinuation<java.util.List<TickersData>> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(list);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                return;
            }
            CancellableContinuation<java.util.List<TickersData>> cancellableContinuation2 = this.copydefault;
            Result.Application application2 = Result.Companion;
            if (exc == null) {
                exc = new java.lang.IllegalStateException("get cup ticker error " + this.EZpvd);
            }
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }

    /* JADX INFO: renamed from: o.xnW$FragmentManager */
    public static final class FragmentManager implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(InterfaceC58217yxC interfaceC58217yxC) {
            this.copydefault = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            KWHzl(th);
            return Unit.INSTANCE;
        }

        public final void KWHzl(java.lang.Throwable th) {
            this.copydefault.dispose();
        }
    }

    /* JADX INFO: renamed from: o.xnW$PictureInPictureParams */
    public static final class PictureInPictureParams implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ java.util.List<java.lang.String> KWHzl;
        public final /* synthetic */ CancellableContinuation<java.util.List<TickersData>> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public PictureInPictureParams(CancellableContinuation<? super java.util.List<TickersData>> cancellableContinuation, java.util.List<java.lang.String> list) {
            this.copydefault = cancellableContinuation;
            this.KWHzl = list;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (this.copydefault.isActive() && z && C33129mqd.KWHzl((java.util.Collection) list)) {
                CancellableContinuation<java.util.List<TickersData>> cancellableContinuation = this.copydefault;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(list);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                return;
            }
            CancellableContinuation<java.util.List<TickersData>> cancellableContinuation2 = this.copydefault;
            Result.Application application2 = Result.Companion;
            if (exc == null) {
                exc = new java.lang.IllegalStateException("get cup ticker error " + this.KWHzl);
            }
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }

    /* JADX INFO: renamed from: o.xnW$PendingIntent */
    public static final class PendingIntent implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(InterfaceC58217yxC interfaceC58217yxC) {
            this.EZpvd = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.Throwable th) {
            this.EZpvd.dispose();
        }
    }

    /* JADX INFO: renamed from: o.xnW$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ CancellableContinuation<java.util.List<TickersData>> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super java.util.List<TickersData>> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (this.OLrzqt.isActive() && z && C33129mqd.KWHzl((java.util.Collection) list)) {
                CancellableContinuation<java.util.List<TickersData>> cancellableContinuation = this.OLrzqt;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(list);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                return;
            }
            CancellableContinuation<java.util.List<TickersData>> cancellableContinuation2 = this.OLrzqt;
            Result.Application application2 = Result.Companion;
            if (exc == null) {
                exc = new java.lang.IllegalStateException("get cup ticker error");
            }
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }

    /* JADX INFO: renamed from: o.xnW$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(InterfaceC58217yxC interfaceC58217yxC) {
            this.copydefault = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            EZpvd(th);
            return Unit.INSTANCE;
        }

        public final void EZpvd(java.lang.Throwable th) {
            this.copydefault.dispose();
        }
    }

    /* JADX INFO: renamed from: o.xnW$LoaderManager */
    public static final class LoaderManager implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ CancellableContinuation<java.util.List<TickersData>> EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.util.List<com.okinc.unify_trade.biz.subscribe.TickersData>> */
        /* JADX WARN: Multi-variable type inference failed */
        public LoaderManager(CancellableContinuation<? super java.util.List<TickersData>> cancellableContinuation, java.lang.String str) {
            this.EZpvd = cancellableContinuation;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (this.EZpvd.isActive() && z && C33129mqd.KWHzl((java.util.Collection) list)) {
                CancellableContinuation<java.util.List<TickersData>> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                Intrinsics.copydefault(list);
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(list));
                return;
            }
            CancellableContinuation<java.util.List<TickersData>> cancellableContinuation2 = this.EZpvd;
            Result.Application application2 = Result.Companion;
            if (exc == null) {
                exc = new java.lang.IllegalStateException("get  ticker error " + this.OLrzqt);
            }
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
        }
    }

    /* JADX INFO: renamed from: o.xnW$Fragment */
    public static final class Fragment implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(InterfaceC58217yxC interfaceC58217yxC) {
            this.copydefault = interfaceC58217yxC;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            AEQbTJ(th);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(java.lang.Throwable th) {
            this.copydefault.dispose();
        }
    }

    public static final Flow<java.util.List<TickersData>> AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flowOn(new StateListAnimator(FlowKt.callbackFlow(new ITradeMarketExtKt$createInstListTickerForInstIds$1(list, null))), Dispatchers.getDefault());
    }

    public static final Flow<java.util.List<TickersData>> copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("MARKET_TICKER", "createInstListTicker() called with: ccy = " + list + ", channelId = " + str);
        return FlowKt.flowOn(new Activity(FlowKt.onStart(FlowKt.onCompletion(FlowKt.callbackFlow(new ITradeMarketExtKt$createInstListTicker$1(str, list, null)), new ITradeMarketExtKt$createInstListTicker$2(str, null)), new ITradeMarketExtKt$createInstListTicker$3(str, null))), Dispatchers.getDefault());
    }

    public static final Flow<java.util.List<TickersData>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("MARKET_TICKER", "createInstListTicker() called with: channelId = " + str + ", instType = " + str2);
        return FlowKt.flowOn(new Application(FlowKt.callbackFlow(new ITradeMarketExtKt$createInstListTickerForInstIds$3(str, str2, null))), Dispatchers.getDefault());
    }

    public static final java.lang.Object EZpvd(@NotNull InterfaceC55702xot interfaceC55702xot, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new FragmentManager(interfaceC55702xot.copydefault(new TickerCupReq(list), new Dialog(cancellableContinuationImpl, list))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final java.lang.Object copydefault(@NotNull InterfaceC55702xot interfaceC55702xot, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.List<TickersData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new PendingIntent(interfaceC55702xot.copydefault(new TickerInstReq(list), new PictureInPictureParams(cancellableContinuationImpl, list))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final java.lang.Object AEQbTJ(@NotNull InterfaceC55702xot interfaceC55702xot, @NotNull Continuation<? super java.util.List<TickersData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new TaskDescription(interfaceC55702xot.KWHzl(new ActionBar(cancellableContinuationImpl))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    public static final java.lang.Object EZpvd(@NotNull InterfaceC55702xot interfaceC55702xot, @NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<TickersData>> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Fragment(interfaceC55702xot.copydefault(str, null, new LoaderManager(cancellableContinuationImpl, str))));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}

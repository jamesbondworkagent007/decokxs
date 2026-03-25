package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.WatchListSubscribeByDexUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40486qXq extends AbstractC49400uno<java.lang.String, Flow<? extends TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus>>> {
    public final qWQ KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((java.lang.String) obj, (Continuation<? super Flow<TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus>>>) continuation);
    }

    @yCM
    public C40486qXq(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = qwq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super Flow<TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus>>> continuation) throws java.lang.Throwable {
        WatchListSubscribeByDexUseCase$onExecute$1 watchListSubscribeByDexUseCase$onExecute$1;
        if (continuation instanceof WatchListSubscribeByDexUseCase$onExecute$1) {
            watchListSubscribeByDexUseCase$onExecute$1 = (WatchListSubscribeByDexUseCase$onExecute$1) continuation;
            int i = watchListSubscribeByDexUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListSubscribeByDexUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListSubscribeByDexUseCase$onExecute$1 = new WatchListSubscribeByDexUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = watchListSubscribeByDexUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListSubscribeByDexUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            qWQ qwq = this.KWHzl;
            java.lang.String strKWHzl = C55686xod.KWHzl();
            if (str == null) {
                str = "DEX";
            }
            watchListSubscribeByDexUseCase$onExecute$1.label = 1;
            objKWHzl = qwq.KWHzl(strKWHzl, str, watchListSubscribeByDexUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return FlowKt.merge(new TaskDescription((Flow) objKWHzl), FlowKt.flowOf((java.lang.Object) null));
    }

    /* JADX INFO: renamed from: o.qXq$TaskDescription */
    public static final class TaskDescription implements Flow<TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.qXq$TaskDescription$1, reason: invalid class name */
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
                WatchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1 watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof WatchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1) {
                    watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1 = (WatchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1 = new WatchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    TwoKeyMap twoKeyMap = new TwoKeyMap();
                    C41389qpr.copydefault((java.util.List) obj, new Activity(twoKeyMap));
                    watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(twoKeyMap, watchListSubscribeByDexUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qXq$Activity */
    public static final class Activity implements Function1<MarketUserFavorite, Unit> {
        public final /* synthetic */ TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(TwoKeyMap<java.lang.String, java.lang.String, InterfaceC41655qus> twoKeyMap) {
            this.EZpvd = twoKeyMap;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(MarketUserFavorite marketUserFavorite) {
            KWHzl(marketUserFavorite);
            return Unit.INSTANCE;
        }

        public final void KWHzl(MarketUserFavorite marketUserFavorite) {
            Intrinsics.checkNotNullParameter(marketUserFavorite, "");
            if (Intrinsics.EZpvd((java.lang.Object) marketUserFavorite.getInstType(), (java.lang.Object) "CEDEFI")) {
                InterfaceC41655qus interfaceC41655qusCopydefault = qWI.copydefault(marketUserFavorite);
                this.EZpvd.putValue(interfaceC41655qusCopydefault, interfaceC41655qusCopydefault);
            }
        }
    }
}

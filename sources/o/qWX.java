package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.HaveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.HaveWatchListSubscribeUseCase$onExecute$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class qWX extends AbstractC49400uno<Unit, Flow<? extends java.lang.Boolean>> {
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;
    public final qWQ OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public qWX(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = qwq;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Flow<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        HaveWatchListSubscribeUseCase$onExecute$1 haveWatchListSubscribeUseCase$onExecute$1;
        if (continuation instanceof HaveWatchListSubscribeUseCase$onExecute$1) {
            haveWatchListSubscribeUseCase$onExecute$1 = (HaveWatchListSubscribeUseCase$onExecute$1) continuation;
            int i = haveWatchListSubscribeUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                haveWatchListSubscribeUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                haveWatchListSubscribeUseCase$onExecute$1 = new HaveWatchListSubscribeUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = haveWatchListSubscribeUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = haveWatchListSubscribeUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            qWQ qwq = this.OLrzqt;
            java.lang.String strKWHzl = C55686xod.KWHzl();
            haveWatchListSubscribeUseCase$onExecute$1.label = 1;
            objKWHzl = qwq.KWHzl(strKWHzl, "ALL", haveWatchListSubscribeUseCase$onExecute$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return new TaskDescription((Flow) objKWHzl);
    }

    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.qWX$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HaveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1;
                java.lang.Object objM7377constructorimpl;
                boolean z;
                if (continuation instanceof HaveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) {
                    haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = (HaveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1 = new HaveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    java.util.List<MarketUserFavorite> list = (java.util.List) obj;
                    try {
                        Result.Application application = Result.Companion;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            for (MarketUserFavorite marketUserFavorite : list) {
                                if (!Intrinsics.EZpvd((java.lang.Object) marketUserFavorite.getInstType(), (java.lang.Object) "CEDEFI") && qWJ.KWHzl(qWJ.EZpvd(marketUserFavorite)) == null) {
                                }
                                z = true;
                            }
                        }
                        z = false;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.KWHzl(z));
                    } catch (java.lang.Throwable th) {
                        Result.Application application2 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    }
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(true);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = boolKWHzl;
                    }
                    haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objM7377constructorimpl, haveWatchListSubscribeUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}

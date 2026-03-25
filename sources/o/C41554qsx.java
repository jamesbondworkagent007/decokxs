package o;

import com.okinc.market.quotation.domain.options.PreloadOptionsUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qsx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41554qsx extends AbstractC49400uno<InterfaceC41647quk, Unit> {
    public final CoroutineDispatcher EZpvd;
    public final C41551qsu KWHzl;
    public final C41553qsw OLrzqt;
    public final C41439qqo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C41554qsx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C41551qsu c41551qsu, @NotNull C41553qsw c41553qsw) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41551qsu, "");
        Intrinsics.checkNotNullParameter(c41553qsw, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c41439qqo;
        this.KWHzl = c41551qsu;
        this.OLrzqt = c41553qsw;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC41647quk interfaceC41647quk, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadOptionsUseCase$onExecute$1 preloadOptionsUseCase$onExecute$1;
        C41554qsx c41554qsx;
        if (continuation instanceof PreloadOptionsUseCase$onExecute$1) {
            preloadOptionsUseCase$onExecute$1 = (PreloadOptionsUseCase$onExecute$1) continuation;
            int i = preloadOptionsUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadOptionsUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadOptionsUseCase$onExecute$1 = new PreloadOptionsUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = preloadOptionsUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preloadOptionsUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            Intrinsics.checkNotNullExpressionValue(runtime, "");
            if (C41359qpN.OLrzqt(runtime, 0.6666667f)) {
                C41434qqj.KWHzl.KWHzl("PreloadOptionsUseCase", "System memory is below threshold, starting preload.");
                C41551qsu c41551qsu = this.KWHzl;
                preloadOptionsUseCase$onExecute$1.L$0 = this;
                preloadOptionsUseCase$onExecute$1.label = 1;
                objEZpvd = c41551qsu.EZpvd(interfaceC41647quk, preloadOptionsUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41554qsx = this;
            } else {
                C41434qqj.w$default(C41434qqj.KWHzl, "PreloadOptionsUseCase", "System memory is above threshold, skipping preload.", null, 4, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41554qsx = (C41554qsx) preloadOptionsUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c41554qsx.copydefault.OLrzqt((java.util.Map<java.lang.String, TickersData>) objEZpvd);
                return Unit.INSTANCE;
            }
            c41554qsx = (C41554qsx) preloadOptionsUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List listQOLQEE = C56403yEb.QOLQEE(C56403yEb.QOLQEE(C41389qpr.EZpvd(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(((java.util.Map) objEZpvd).values()), new Function1() { // from class: o.qsz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C41554qsx.KWHzl((java.util.Map) obj);
            }
        })));
        C41553qsw c41553qsw = c41554qsx.OLrzqt;
        preloadOptionsUseCase$onExecute$1.L$0 = c41554qsx;
        preloadOptionsUseCase$onExecute$1.label = 2;
        objEZpvd = c41553qsw.copydefault(listQOLQEE, preloadOptionsUseCase$onExecute$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        c41554qsx.copydefault.OLrzqt((java.util.Map<java.lang.String, TickersData>) objEZpvd);
        return Unit.INSTANCE;
    }

    public static final java.util.List KWHzl(java.util.Map map) {
        Intrinsics.checkNotNullParameter(map, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(map.values());
    }
}

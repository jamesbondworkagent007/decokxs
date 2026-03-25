package o;

import com.okinc.business.market.features.coindetail_liquidity.domain.LiquidityChange;
import com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityChangeRepo$load$1;
import com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPU {
    public final C27672jzc EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC27595jyE OLrzqt;
    public final jPR copydefault;

    public jPU(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C27672jzc c27672jzc, @NotNull jPR jpr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27672jzc, "");
        Intrinsics.checkNotNullParameter(jpr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC27595jyE;
        this.EZpvd = c27672jzc;
        this.copydefault = jpr;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, boolean z, @NotNull TokenFilter tokenFilter, @NotNull Continuation<? super Result<? extends kotlin.Pair<? extends java.util.List<LiquidityChange>, java.lang.Boolean>>> continuation) {
        LiquidityChangeRepo$load$1 liquidityChangeRepo$load$1;
        if (continuation instanceof LiquidityChangeRepo$load$1) {
            liquidityChangeRepo$load$1 = (LiquidityChangeRepo$load$1) continuation;
            int i = liquidityChangeRepo$load$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityChangeRepo$load$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityChangeRepo$load$1 = new LiquidityChangeRepo$load$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityChangeRepo$load$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityChangeRepo$load$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1 liquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1 = new LiquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1(null, this, tokenFilter, str, z);
            liquidityChangeRepo$load$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityChangeRepo$loadBWLJW6A$$inlined$dexRunCatching$1, liquidityChangeRepo$load$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final Flow<LiquidityChange> OLrzqt(@NotNull TokenFilter tokenFilter) {
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        this.EZpvd.KWHzl("default_trade", "dex-market-pool-history", C56402yEa.EZpvd(new C23174htJ("dex-market-pool-history", null, null, this.copydefault.copydefault(tokenFilter), 6, null)));
        return new TaskDescription(this.EZpvd.EZpvd(), this);
    }

    public static final class TaskDescription implements Flow<LiquidityChange> {
        public final /* synthetic */ jPU AEQbTJ;
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.jPU$TaskDescription$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ jPU AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, jPU jpu) {
                this.copydefault = flowCollector;
                this.AEQbTJ = jpu;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                LiquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1 liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof LiquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1) {
                    liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1 = (LiquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1) continuation;
                    int i = liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1 = new LiquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    LiquidityChange liquidityChangeCopydefault = this.AEQbTJ.copydefault.copydefault((java.lang.String) obj);
                    if (liquidityChangeCopydefault != null) {
                        liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(liquidityChangeCopydefault, liquidityChangeRepo$subscribeWs$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        public TaskDescription(Flow flow, jPU jpu) {
            this.KWHzl = flow;
            this.AEQbTJ = jpu;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super LiquidityChange> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<Unit>> continuation) {
        try {
            Result.Application application = Result.Companion;
            this.EZpvd.AEQbTJ("default_trade", "dex-market-pool-history");
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }
}

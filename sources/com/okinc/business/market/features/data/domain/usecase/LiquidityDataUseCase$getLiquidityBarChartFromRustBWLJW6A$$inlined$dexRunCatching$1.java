package com.okinc.business.market.features.data.domain.usecase;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AAL;
import o.C2159ABa;
import o.C2161ABc;
import o.C2164ABf;
import o.C2234ADx;
import o.C33077mpe;
import o.C56391yDq;
import o.C56442yFn;
import o.jQC;
import o.jQN;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromRust-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jQC>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $periodType$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jQN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, jQN jqn, String str2, String str3) {
        super(2, continuation);
        this.$periodType$inlined = str;
        this.this$0 = jqn;
        this.$chainId$inlined = str2;
        this.$tokenAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$periodType$inlined, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jQC>> continuation) {
        return ((LiquidityDataUseCase$getLiquidityBarChartFromRustBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[Catch: all -> 0x00d4, CancellationException -> 0x00eb, TryCatch #2 {CancellationException -> 0x00eb, all -> 0x00d4, blocks: (B:6:0x000f, B:18:0x0074, B:20:0x007a, B:21:0x0084, B:23:0x008b, B:25:0x0091, B:27:0x0097, B:30:0x009e, B:31:0x00a2, B:33:0x00a8, B:38:0x00bc, B:39:0x00c5, B:43:0x00cb, B:11:0x0024, B:13:0x002a, B:14:0x0033), top: B:51:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        Object objM7386unboximpl;
        C2159ABa c2159ABaOLrzqt;
        List<C2161ABc> listKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                String str2 = this.$periodType$inlined;
                if (str2 != null) {
                    this.this$0.KWHzl.AEQbTJ(str2);
                }
                String strKWHzl = this.this$0.KWHzl.KWHzl(this.$periodType$inlined);
                C2234ADx liquidityChart = AAL.getLiquidityChart(this.$chainId$inlined, this.$tokenAddress$inlined, strKWHzl);
                C33077mpe c33077mpe = new C33077mpe(new LiquidityDataUseCase$getLiquidityBarChartFromRust$2$data$1$1(liquidityChart), new LiquidityDataUseCase$getLiquidityBarChartFromRust$2$data$1$2(liquidityChart), new LiquidityDataUseCase$getLiquidityBarChartFromRust$2$data$1$3(liquidityChart), new LiquidityDataUseCase$getLiquidityBarChartFromRust$2$data$1$4(liquidityChart), this.this$0.EZpvd);
                this.L$0 = strKWHzl;
                this.label = 1;
                Object objAEQbTJ = c33077mpe.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = strKWHzl;
                objM7386unboximpl = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                pUU.KWHzl("LiquidityDataUseCase", "Rust call success");
            }
            C56391yDq.AEQbTJ(objM7386unboximpl);
            C2164ABf c2164ABf = (C2164ABf) objM7386unboximpl;
            if (str == null || (c2159ABaOLrzqt = c2164ABf.OLrzqt()) == null || (listKWHzl = c2159ABaOLrzqt.KWHzl()) == null || listKWHzl.isEmpty()) {
                z = false;
                if (!z) {
                    this.this$0.KWHzl.EZpvd();
                }
                jQN jqn = this.this$0;
                if (z) {
                    str = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(jqn.KWHzl(c2164ABf, str));
            } else {
                Iterator<T> it = listKWHzl.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((C2161ABc) it.next()).OLrzqt(), (Object) str)) {
                        break;
                    }
                }
                z = false;
                if (!z) {
                }
                jQN jqn2 = this.this$0;
                if (z) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(jqn2.KWHzl(c2164ABf, str));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

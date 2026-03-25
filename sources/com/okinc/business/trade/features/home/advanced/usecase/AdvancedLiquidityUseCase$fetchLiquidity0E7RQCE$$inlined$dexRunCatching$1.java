package com.okinc.business.trade.features.home.advanced.usecase;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C24695iig;
import o.C28163kRf;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC22646hjL;
import o.InterfaceC58227yxM;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedLiquidityUseCase$fetchLiquidity-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $source$inlined;
    int label;
    final /* synthetic */ C28163kRf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, C28163kRf c28163kRf, String str, String str2) {
        super(2, continuation);
        this.this$0 = c28163kRf;
        this.$source$inlined = str;
        this.$chainId$inlined = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1(continuation, this.this$0, this.$source$inlined, this.$chainId$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return ((AdvancedLiquidityUseCase$fetchLiquidity0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        try {
            Result.Application application = Result.Companion;
            InterfaceC22646hjL interfaceC22646hjLEZpvd = this.this$0.EZpvd(this.$source$inlined);
            String str = (String) CollectionsKt___CollectionsKt.RcXXUw(interfaceC22646hjLEZpvd.KWHzl().keySet());
            String str2 = this.$chainId$inlined;
            String strCopydefault = C24695iig.copydefault(str2, str2);
            if (!Intrinsics.EZpvd((Object) str, (Object) strCopydefault) || interfaceC22646hjLEZpvd.EZpvd()) {
                interfaceC22646hjLEZpvd.AEQbTJ();
                this.this$0.copydefault.copydefault(this.$chainId$inlined).AEQbTJ(new InterfaceC58227yxM(new C28163kRf.Activity(interfaceC22646hjLEZpvd, strCopydefault, this.this$0, this.$source$inlined)) { // from class: o.kRf.StateListAnimator
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public StateListAnimator(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj2) {
                        this.AEQbTJ.invoke(obj2);
                    }
                }, new InterfaceC58227yxM(new C28163kRf.TaskDescription(interfaceC22646hjLEZpvd)) { // from class: o.kRf.StateListAnimator
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public StateListAnimator(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.AEQbTJ = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final /* synthetic */ void accept(java.lang.Object obj2) {
                        this.AEQbTJ.invoke(obj2);
                    }
                });
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
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

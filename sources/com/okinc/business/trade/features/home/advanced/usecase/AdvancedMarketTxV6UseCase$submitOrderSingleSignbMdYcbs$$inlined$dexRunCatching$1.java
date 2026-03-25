package com.okinc.business.trade.features.home.advanced.usecase;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C28180kRw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58229yxO;
import o.InterfaceC9740bbL;
import o.kRB;
import o.kRB.ActionBar;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketTxV6UseCase$submitOrderSingleSign-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ boolean $isOpenMev$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ V6BaseQuoteResponse $quote$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    final /* synthetic */ V6CalldataResponseData $transactionData$inlined;
    int label;
    final /* synthetic */ kRB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, kRB krb, V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, boolean z, String str, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription) {
        super(2, continuation);
        this.this$0 = krb;
        this.$quote$inlined = v6BaseQuoteResponse;
        this.$transactionData$inlined = v6CalldataResponseData;
        this.$isOpenMev$inlined = z;
        this.$chainId$inlined = str;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z2;
        this.$loadingCallback$inlined = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1(continuation, this.this$0, this.$quote$inlined, this.$transactionData$inlined, this.$isOpenMev$inlined, this.$chainId$inlined, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((AdvancedMarketTxV6UseCase$submitOrderSingleSignbMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                kRB krb = this.this$0;
                V6BaseQuoteResponse v6BaseQuoteResponse = this.$quote$inlined;
                V6CalldataResponseData v6CalldataResponseData = this.$transactionData$inlined;
                boolean z = this.$isOpenMev$inlined;
                C28180kRw c28180kRwCopydefault = krb.copydefault();
                String str = this.$chainId$inlined;
                AbstractC58185ywX abstractC58185ywXAEQbTJ = krb.KWHzl(v6BaseQuoteResponse, v6CalldataResponseData, z, new kRB.Activity(c28180kRwCopydefault, str, this.this$0, this.$transactionData$inlined, str)).KWHzl(new InterfaceC58229yxO(this.this$0.new ActionBar(this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined)) { // from class: o.kRB.Application
                    public final /* synthetic */ Function1 EZpvd;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public Application(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.EZpvd = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                        return this.EZpvd.invoke(obj2);
                    }
                }).AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO(kRB.TaskDescription.OLrzqt) { // from class: o.kRB.Application
                    public final /* synthetic */ Function1 EZpvd;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public Application(Function1 function1) {
                        Intrinsics.checkNotNullParameter(function1, "");
                        this.EZpvd = function1;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                        return this.EZpvd.invoke(obj2);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
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

package com.okinc.business.trade.features.home.meme.usecase.transaction.v6;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC28328kXi;
import o.AbstractC28328kXi.ActionBar;
import o.AbstractC58185ywX;
import o.C28327kXh;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC58229yxO;
import o.InterfaceC9734bbF;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6MarketTxV6UseCase$buildAndSubmitTransaction-tZkwj4A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ FragmentActivity $activity$inlined;
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ V6BaseQuoteResponse $data$inlined;
    final /* synthetic */ boolean $isOpenMev$inlined;
    final /* synthetic */ InterfaceC9740bbL.TaskDescription $loadingCallback$inlined;
    final /* synthetic */ String $selectedDefiPlatformId$inlined;
    final /* synthetic */ boolean $silentSignWhenAvailable$inlined;
    final /* synthetic */ V6CalldataResponseData $transactionData$inlined;
    int label;
    final /* synthetic */ AbstractC28328kXi this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1(Continuation continuation, AbstractC28328kXi abstractC28328kXi, V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, String str, boolean z, String str2, FragmentActivity fragmentActivity, boolean z2, InterfaceC9740bbL.TaskDescription taskDescription) {
        super(2, continuation);
        this.this$0 = abstractC28328kXi;
        this.$data$inlined = v6BaseQuoteResponse;
        this.$transactionData$inlined = v6CalldataResponseData;
        this.$selectedDefiPlatformId$inlined = str;
        this.$isOpenMev$inlined = z;
        this.$chainId$inlined = str2;
        this.$activity$inlined = fragmentActivity;
        this.$silentSignWhenAvailable$inlined = z2;
        this.$loadingCallback$inlined = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1(continuation, this.this$0, this.$data$inlined, this.$transactionData$inlined, this.$selectedDefiPlatformId$inlined, this.$isOpenMev$inlined, this.$chainId$inlined, this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return ((MemeV6MarketTxV6UseCase$buildAndSubmitTransactiontZkwj4A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                AbstractC28328kXi abstractC28328kXi = this.this$0;
                V6BaseQuoteResponse v6BaseQuoteResponse = this.$data$inlined;
                V6CalldataResponseData v6CalldataResponseData = this.$transactionData$inlined;
                String str = this.$selectedDefiPlatformId$inlined;
                boolean z = this.$isOpenMev$inlined;
                C28327kXh c28327kXhCopydefault = abstractC28328kXi.copydefault();
                String str2 = this.$chainId$inlined;
                AbstractC58185ywX<Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXCopydefault = abstractC28328kXi.copydefault(v6BaseQuoteResponse, v6CalldataResponseData, str, z, new AbstractC28328kXi.Application(c28327kXhCopydefault, str2, this.this$0, this.$transactionData$inlined, str2));
                final AbstractC28328kXi.ActionBar actionBar = this.this$0.new ActionBar(this.$activity$inlined, this.$silentSignWhenAvailable$inlined, this.$loadingCallback$inlined);
                AbstractC58185ywX<R> abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO(actionBar) { // from class: o.kXi.TaskDescription
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public TaskDescription(final Function1 actionBar2) {
                        Intrinsics.checkNotNullParameter(actionBar2, "");
                        this.AEQbTJ = actionBar2;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                        return this.AEQbTJ.invoke(obj2);
                    }
                });
                final AbstractC28328kXi.Activity activity = AbstractC28328kXi.Activity.EZpvd;
                AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ((InterfaceC58229yxO<? super R, ? extends R>) new InterfaceC58229yxO(activity) { // from class: o.kXi.TaskDescription
                    public final /* synthetic */ Function1 AEQbTJ;

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    public TaskDescription(final Function1 activity2) {
                        Intrinsics.checkNotNullParameter(activity2, "");
                        this.AEQbTJ = activity2;
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj2) {
                        return this.AEQbTJ.invoke(obj2);
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

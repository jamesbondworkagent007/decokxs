package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C28189kSe;
import o.C32979mnm;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28223kTl;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$validateTokens$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ ValidateTokensRequest $request;
    final /* synthetic */ String $uniqueId;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$validateTokens$1(MemeModeTransactionViewModel memeModeTransactionViewModel, ValidateTokensRequest validateTokensRequest, String str, String str2, Continuation<? super MemeModeTransactionViewModel$validateTokens$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$request = validateTokensRequest;
        this.$chainId = str;
        this.$uniqueId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$validateTokens$1(this.this$0, this.$request, this.$chainId, this.$uniqueId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$validateTokens$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28189kSe c28189kSe = this.this$0.QbewEr;
            ValidateTokensRequest validateTokensRequest = this.$request;
            this.label = 1;
            objCopydefault = c28189kSe.copydefault(validateTokensRequest, this);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        String str = this.$chainId;
        MemeModeTransactionViewModel memeModeTransactionViewModel = this.this$0;
        String str2 = this.$uniqueId;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) ((Pair) objCopydefault).component2();
            if (!Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getChainId(), (Object) str)) {
                String string = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.IResultReceiver2_Parcel);
                Intrinsics.checkNotNullExpressionValue(string, "");
                memeModeTransactionViewModel.EZpvd(new InterfaceC28223kTl.Activity(string));
            } else if (Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getUniqueId(), (Object) str2)) {
                memeModeTransactionViewModel.EZpvd(new InterfaceC28223kTl.StateListAnimator(dexMultiTokenInfoBean));
            } else {
                String string2 = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.ResultReceiver);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                memeModeTransactionViewModel.EZpvd(new InterfaceC28223kTl.Activity(string2));
            }
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            String message = thM7380exceptionOrNullimpl.getMessage();
            memeModeTransactionViewModel2.EZpvd(new InterfaceC28223kTl.Activity(message != null ? message : ""));
        }
        return Unit.INSTANCE;
    }
}

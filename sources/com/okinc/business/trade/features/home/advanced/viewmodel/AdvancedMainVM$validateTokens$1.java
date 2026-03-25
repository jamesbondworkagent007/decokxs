package com.okinc.business.trade.features.home.advanced.viewmodel;

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
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C23274hvD;
import o.C28189kSe;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28223kTl;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainVM$validateTokens$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ ValidateTokensRequest $request;
    final /* synthetic */ String $uniqueId;
    int label;
    final /* synthetic */ AdvancedMainVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainVM$validateTokens$1(AdvancedMainVM advancedMainVM, ValidateTokensRequest validateTokensRequest, String str, String str2, Continuation<? super AdvancedMainVM$validateTokens$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainVM;
        this.$request = validateTokensRequest;
        this.$chainId = str;
        this.$uniqueId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainVM$validateTokens$1(this.this$0, this.$request, this.$chainId, this.$uniqueId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainVM$validateTokens$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28189kSe c28189kSe = this.this$0.getNewProxyInstance;
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
        AdvancedMainVM advancedMainVM = this.this$0;
        String str2 = this.$uniqueId;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            DexMultiTokenInfoBean dexMultiTokenInfoBean = (DexMultiTokenInfoBean) ((Pair) objCopydefault).component2();
            if (!Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getChainId(), (Object) str)) {
                advancedMainVM.KWHzl.setValue(new InterfaceC28223kTl.Activity(C33070mpX.AYXKKw(C23274hvD.Fragment.IResultReceiver2_Parcel)));
            } else if (Intrinsics.EZpvd((Object) dexMultiTokenInfoBean.getUniqueId(), (Object) str2)) {
                advancedMainVM.KWHzl.setValue(new InterfaceC28223kTl.StateListAnimator(dexMultiTokenInfoBean));
            } else {
                advancedMainVM.KWHzl.setValue(new InterfaceC28223kTl.Activity(C33070mpX.AYXKKw(C23274hvD.Fragment.ResultReceiver)));
            }
        }
        AdvancedMainVM advancedMainVM2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objCopydefault);
        if (thM7380exceptionOrNullimpl != null) {
            MutableStateFlow mutableStateFlow = advancedMainVM2.KWHzl;
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            mutableStateFlow.setValue(new InterfaceC28223kTl.Activity(message));
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.trade.features.home.meme.viewmodel.transaction;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.meme.viewmodel.transaction.MemeModeTransactionViewModel$searchTokenPair$1;
import com.okinc.business.trade.features.home.ui.uistate.SearchMemeUiState;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C31256lqb;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeModeTransactionViewModel$searchTokenPair$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $currencyTokenAddress;
    final /* synthetic */ String $inputContent;
    int label;
    final /* synthetic */ MemeModeTransactionViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeModeTransactionViewModel$searchTokenPair$1(MemeModeTransactionViewModel memeModeTransactionViewModel, String str, String str2, String str3, Continuation<? super MemeModeTransactionViewModel$searchTokenPair$1> continuation) {
        super(2, continuation);
        this.this$0 = memeModeTransactionViewModel;
        this.$chainId = str;
        this.$inputContent = str2;
        this.$currencyTokenAddress = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeModeTransactionViewModel$searchTokenPair$1(this.this$0, this.$chainId, this.$inputContent, this.$currencyTokenAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeModeTransactionViewModel$searchTokenPair$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        String strAYXKKw;
        Throwable origin;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.values().setValue(new SearchMemeUiState(true, null, null, null, false, null, 62, null));
            final MemeModeTransactionViewModel memeModeTransactionViewModel = this.this$0;
            final String str = this.$chainId;
            String str2 = this.$inputContent;
            String strAEQbTJ = C31256lqb.AEQbTJ(this.$currencyTokenAddress, (Function0<String>) new Function0() { // from class: o.kXU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return MemeModeTransactionViewModel$searchTokenPair$1.invokeSuspend$lambda$0(memeModeTransactionViewModel, str);
                }
            });
            this.label = 1;
            objKWHzl = memeModeTransactionViewModel.KWHzl(str, str2, strAEQbTJ, (Continuation<? super Result<Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean>>>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            Pair pair = (Pair) objKWHzl;
            memeModeTransactionViewModel2.values().postValue(new SearchMemeUiState(false, (DexMultiTokenInfoBean) pair.getFirst(), null, (DexMultiTokenInfoBean) pair.getSecond(), false, null, 53, null));
        }
        MemeModeTransactionViewModel memeModeTransactionViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
        if (thM7380exceptionOrNullimpl != null) {
            if (!(thM7380exceptionOrNullimpl instanceof OKServerException) || (origin = ((OKServerException) thM7380exceptionOrNullimpl).getOrigin()) == null || (strAYXKKw = origin.getMessage()) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaDescriptionCompatBuilder);
            }
            memeModeTransactionViewModel3.values().postValue(new SearchMemeUiState(false, null, null, null, true, strAYXKKw, 15, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$0(MemeModeTransactionViewModel memeModeTransactionViewModel, String str) {
        return memeModeTransactionViewModel.RJOkX.AEQbTJ(str);
    }
}

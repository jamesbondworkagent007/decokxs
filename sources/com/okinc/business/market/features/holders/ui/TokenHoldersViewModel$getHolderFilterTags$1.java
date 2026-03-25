package com.okinc.business.market.features.holders.ui;

import com.okinc.business.market.features.filter_tag.domain.FilterTagType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.jVY;
import o.jYF;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenHoldersViewModel$getHolderFilterTags$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ TokenHoldersViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenHoldersViewModel$getHolderFilterTags$1(TokenHoldersViewModel tokenHoldersViewModel, String str, String str2, Continuation<? super TokenHoldersViewModel$getHolderFilterTags$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenHoldersViewModel;
        this.$tokenContractAddress = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenHoldersViewModel$getHolderFilterTags$1(this.this$0, this.$tokenContractAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenHoldersViewModel$getHolderFilterTags$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jVY jvy = this.this$0.djBIcL;
            FilterTagType filterTagType = FilterTagType.HOLDER;
            String str = this.$tokenContractAddress;
            String str2 = this.$chainId;
            this.label = 1;
            objCopydefault = jvy.copydefault(filterTagType, str, str2, this);
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
        TokenHoldersViewModel tokenHoldersViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
            tokenHoldersViewModel.KWHzl.setValue(new jYF.StateListAnimator((List) objCopydefault));
        }
        TokenHoldersViewModel tokenHoldersViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objCopydefault) != null) {
            tokenHoldersViewModel2.KWHzl.setValue(jYF.ActionBar.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.biz.net.bean.WalletSearchResp;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C18914frR;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends WalletSearchResp>, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $needSearch;
    final /* synthetic */ String $searchKeyword;
    int label;
    final /* synthetic */ TokenSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1(boolean z, TokenSearchResultViewModel tokenSearchResultViewModel, String str, Continuation<? super TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1> continuation) {
        super(2, continuation);
        this.$needSearch = z;
        this.this$0 = tokenSearchResultViewModel;
        this.$searchKeyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1(this.$needSearch, this.this$0, this.$searchKeyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<? extends WalletSearchResp>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends List<WalletSearchResp>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends List<WalletSearchResp>, OKServerException>> continuation) {
        return ((TokenSearchResultViewModel$getSearchResult$1$1$searchCompletionDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$needSearch && this.this$0.copydefault(this.$searchKeyword)) {
                C18914frR c18914frR = this.this$0.isConnected;
                String str = this.$searchKeyword;
                this.label = 1;
                obj = c18914frR.copydefault(str, 3, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                return new AbstractC43419rot.StateListAnimator(null);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return (AbstractC43419rot) obj;
    }
}

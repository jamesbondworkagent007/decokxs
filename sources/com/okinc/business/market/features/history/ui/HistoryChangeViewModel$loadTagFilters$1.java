package com.okinc.business.market.features.history.ui;

import com.okinc.business.market.features.filter_tag.domain.FilterTagType;
import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28586kda;
import o.C56391yDq;
import o.C56442yFn;
import o.jVY;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeViewModel$loadTagFilters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenAddress;
    int label;
    final /* synthetic */ HistoryChangeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryChangeViewModel$loadTagFilters$1(HistoryChangeViewModel historyChangeViewModel, String str, String str2, Continuation<? super HistoryChangeViewModel$loadTagFilters$1> continuation) {
        super(2, continuation);
        this.this$0 = historyChangeViewModel;
        this.$tokenAddress = str;
        this.$chainId = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HistoryChangeViewModel$loadTagFilters$1(this.this$0, this.$tokenAddress, this.$chainId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HistoryChangeViewModel$loadTagFilters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28586kda c28586kda = this.this$0.fARcdN;
            this.label = 1;
            objOLrzqt = c28586kda.OLrzqt(this);
            if (objOLrzqt == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                HistoryChangeViewModel historyChangeViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objCopydefault)) {
                    historyChangeViewModel.EZpvd.setValue((List) objCopydefault);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = null;
        }
        DexUserIdentity dexUserIdentity = (DexUserIdentity) objOLrzqt;
        if (dexUserIdentity != null) {
            this.this$0.gEmmrt = dexUserIdentity.EZpvd();
        }
        jVY jvy = this.this$0.AkhnZx;
        FilterTagType filterTagType = FilterTagType.HISTORY;
        String str = this.$tokenAddress;
        String str2 = this.$chainId;
        this.label = 2;
        objCopydefault = jvy.copydefault(filterTagType, str, str2, this);
        if (objCopydefault == objCopydefault2) {
            return objCopydefault2;
        }
        HistoryChangeViewModel historyChangeViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objCopydefault)) {
        }
        return Unit.INSTANCE;
    }
}

package com.okinc.business.defi.wallet.mine.walletbind.utils;

import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusRequestBody;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.CheckWalletBindStatusResponse;
import com.okinc.business.defi.wallet.mine.walletbind.datasource.WalletBindApiService;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends CheckWalletBindStatusResponse>>, Object> {
    final /* synthetic */ List<String> $accountIds;
    final /* synthetic */ WalletBindApiService $walletBindApiService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1(WalletBindApiService walletBindApiService, List<String> list, Continuation<? super IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1> continuation) {
        super(2, continuation);
        this.$walletBindApiService = walletBindApiService;
        this.$accountIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1(this.$walletBindApiService, this.$accountIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends CheckWalletBindStatusResponse>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<CheckWalletBindStatusResponse>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<CheckWalletBindStatusResponse>> continuation) {
        return ((IndependentWalletBindCeFiUtils$getBoundWalletsFromBE$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                WalletBindApiService walletBindApiService = this.$walletBindApiService;
                List<String> list = this.$accountIds;
                Result.Application application = Result.Companion;
                CheckWalletBindStatusRequestBody checkWalletBindStatusRequestBody = new CheckWalletBindStatusRequestBody(list);
                this.label = 1;
                obj = WalletBindApiService.TaskDescription.checkWalletBindStatus$default(walletBindApiService, checkWalletBindStatusRequestBody, null, this, 2, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((CheckWalletBindStatusResponse) ((ResponseData) obj).getData());
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

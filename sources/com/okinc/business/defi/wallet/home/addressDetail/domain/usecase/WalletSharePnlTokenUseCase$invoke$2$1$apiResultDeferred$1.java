package com.okinc.business.defi.wallet.home.addressDetail.domain.usecase;

import com.okinc.business.defi.biz.net.bean.WalletPnlShareInfoResponse;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C15839eXe;
import o.C56391yDq;
import o.C56442yFn;
import o.eWV;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends WalletPnlShareInfoResponse, ? extends OKServerException>>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ C15839eXe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1(C15839eXe c15839eXe, String str, String str2, String str3, String str4, Continuation<? super WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = c15839eXe;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$accountId = str3;
        this.$walletAddress = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$accountId, this.$walletAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends WalletPnlShareInfoResponse, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<WalletPnlShareInfoResponse, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<WalletPnlShareInfoResponse, OKServerException>> continuation) {
        return ((WalletSharePnlTokenUseCase$invoke$2$1$apiResultDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            eWV ewv = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$accountId;
            String str4 = this.$walletAddress;
            this.label = 1;
            obj = ewv.KWHzl(str, str2, str3, str4, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}

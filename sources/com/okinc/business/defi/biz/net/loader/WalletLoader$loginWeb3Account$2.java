package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.biz.net.bean.Web3LoginReq;
import com.okinc.business.defi.biz.net.bean.Web3LoginResp;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C43401rob;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC13915dbb;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$loginWeb3Account$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Web3LoginResp, ? extends OKServerException>>, Object> {
    final /* synthetic */ Web3LoginReq $req;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C13934dbu this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$loginWeb3Account$2(C13934dbu c13934dbu, Web3LoginReq web3LoginReq, Continuation<? super WalletLoader$loginWeb3Account$2> continuation) {
        super(2, continuation);
        this.this$0 = c13934dbu;
        this.$req = web3LoginReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletLoader$loginWeb3Account$2 walletLoader$loginWeb3Account$2 = new WalletLoader$loginWeb3Account$2(this.this$0, this.$req, continuation);
        walletLoader$loginWeb3Account$2.L$0 = obj;
        return walletLoader$loginWeb3Account$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Web3LoginResp, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<Web3LoginResp, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<Web3LoginResp, OKServerException>> continuation) {
        return ((WalletLoader$loginWeb3Account$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C13934dbu c13934dbu = this.this$0;
                Web3LoginReq web3LoginReq = this.$req;
                InterfaceC13915dbb interfaceC13915dbbEZpvd = c13934dbu.EZpvd();
                this.label = 1;
                obj = interfaceC13915dbbEZpvd.AEQbTJ(web3LoginReq, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                return new AbstractC43419rot.StateListAnimator(data);
            }
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
            return new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            return new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
    }
}

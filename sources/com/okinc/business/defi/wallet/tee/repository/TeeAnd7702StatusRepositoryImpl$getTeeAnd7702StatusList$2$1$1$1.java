package com.okinc.business.defi.wallet.tee.repository;

import com.okinc.business.defi.biz.net.bean.TeeAnd7702WalletStatusResp;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.fVG;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends TeeAnd7702WalletStatusResp, ? extends OKServerException>>, Object> {
    final /* synthetic */ List<TeeAndEip7702Item> $it;
    int label;
    final /* synthetic */ fVG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1(fVG fvg, List<TeeAndEip7702Item> list, Continuation<? super TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = fvg;
        this.$it = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends TeeAnd7702WalletStatusResp, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>> continuation) {
        return ((TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.this$0.OLrzqt;
            List<TeeAndEip7702Item> list = this.$it;
            this.label = 1;
            obj = c13934dbu.copydefault(list, true, (Continuation<? super AbstractC43419rot<TeeAnd7702WalletStatusResp, OKServerException>>) this);
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

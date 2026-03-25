package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.use_case;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C56391yDq;
import o.C56442yFn;
import o.iDL;
import o.iEC;
import o.iZI;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTokenModelAssetDetailUseCaseImpl$invoke$2 extends SuspendLambda implements Function1<Continuation<? super iEC>, Object> {
    final /* synthetic */ String $accountIdParam;
    final /* synthetic */ List<DashboardTokenDetailReq> $investmentInfos;
    int label;
    final /* synthetic */ iZI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeFiTokenModelAssetDetailUseCaseImpl$invoke$2(iZI izi, String str, List<DashboardTokenDetailReq> list, Continuation<? super DeFiTokenModelAssetDetailUseCaseImpl$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = izi;
        this.$accountIdParam = str;
        this.$investmentInfos = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DeFiTokenModelAssetDetailUseCaseImpl$invoke$2(this.this$0, this.$accountIdParam, this.$investmentInfos, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super iEC> continuation) {
        return ((DeFiTokenModelAssetDetailUseCaseImpl$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            iDL idl = this.this$0.OLrzqt;
            String string = this.$accountIdParam.toString();
            List<DashboardTokenDetailReq> list = this.$investmentInfos;
            this.label = 1;
            objKWHzl = idl.KWHzl(string, list, this);
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
        C56391yDq.AEQbTJ(objKWHzl);
        return objKWHzl;
    }
}

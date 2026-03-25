package com.okinc.business.invest_biz.ui.claim;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.ui.claim.Web3RewardsClaimHandler$invoke$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58185ywX;
import o.AbstractC58260yxt;
import o.C25523iyN;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23966iPy;
import o.InterfaceC25530iyU;
import o.InterfaceC9738bbJ;
import o.InterfaceC9854bdT;
import o.iFG;
import o.iPB;

/* JADX INFO: loaded from: classes6.dex */
public final class Web3RewardsClaimHandler$invoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<InterfaceC25530iyU, Unit> $callback;
    final /* synthetic */ C25523iyN $claimRequestParams;
    final /* synthetic */ AppCompatActivity $host;
    final /* synthetic */ AppCompatActivity $hostRef;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ iPB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.iyU, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Web3RewardsClaimHandler$invoke$1(iPB ipb, C25523iyN c25523iyN, Function1<? super InterfaceC25530iyU, Unit> function1, AppCompatActivity appCompatActivity, AppCompatActivity appCompatActivity2, Continuation<? super Web3RewardsClaimHandler$invoke$1> continuation) {
        super(2, continuation);
        this.this$0 = ipb;
        this.$claimRequestParams = c25523iyN;
        this.$callback = function1;
        this.$hostRef = appCompatActivity;
        this.$host = appCompatActivity2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Web3RewardsClaimHandler$invoke$1(this.this$0, this.$claimRequestParams, this.$callback, this.$hostRef, this.$host, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Web3RewardsClaimHandler$invoke$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:8:0x0027, B:30:0x00b0, B:32:0x00b8, B:35:0x00ee, B:37:0x00f4, B:39:0x00f8, B:40:0x00f9, B:41:0x0106, B:33:0x00e0, B:34:0x00ed, B:13:0x003b, B:24:0x0085, B:26:0x0095, B:20:0x0072), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:8:0x0027, B:30:0x00b0, B:32:0x00b8, B:35:0x00ee, B:37:0x00f4, B:39:0x00f8, B:40:0x00f9, B:41:0x0106, B:33:0x00e0, B:34:0x00ed, B:13:0x003b, B:24:0x0085, B:26:0x0095, B:20:0x0072), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:8:0x0027, B:30:0x00b0, B:32:0x00b8, B:35:0x00ee, B:37:0x00f4, B:39:0x00f8, B:40:0x00f9, B:41:0x0106, B:33:0x00e0, B:34:0x00ed, B:13:0x003b, B:24:0x0085, B:26:0x0095, B:20:0x0072), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4 A[Catch: all -> 0x0107, TryCatch #0 {all -> 0x0107, blocks: (B:8:0x0027, B:30:0x00b0, B:32:0x00b8, B:35:0x00ee, B:37:0x00f4, B:39:0x00f8, B:40:0x00f9, B:41:0x0106, B:33:0x00e0, B:34:0x00ed, B:13:0x003b, B:24:0x0085, B:26:0x0095, B:20:0x0072), top: B:46:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        final InvestTxModel investTxModel;
        Object objM7386unboximpl;
        final iPB ipb;
        final Function1<InterfaceC25530iyU, Unit> function1;
        Object obj2;
        final AppCompatActivity appCompatActivity;
        InvestCallDataResult investCallDataResult;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            this.$callback.invoke(this.this$0.copydefault(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.this$0.KWHzl.gEmmrt().KWHzl();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    investCallDataResult = (InvestCallDataResult) this.L$5;
                    AppCompatActivity appCompatActivity2 = (AppCompatActivity) this.L$4;
                    Function1<InterfaceC25530iyU, Unit> function12 = (Function1) this.L$3;
                    ipb = (iPB) this.L$2;
                    Object obj3 = this.L$1;
                    investTxModel = (InvestTxModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    function1 = function12;
                    obj2 = obj3;
                    appCompatActivity = appCompatActivity2;
                    if (((Boolean) obj).booleanValue()) {
                        throw new OKServerException(5, null, null, null, 14, null);
                    }
                    function1.invoke(InterfaceC25530iyU.TaskDescription.copydefault);
                    InterfaceC9854bdT.Application.startContractTx$default(ipb.KWHzl, appCompatActivity, iFG.Companion.AEQbTJ(investCallDataResult.EZpvd(), investTxModel), new Function1() { // from class: o.iPE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return Web3RewardsClaimHandler$invoke$1.invokeSuspend$lambda$2$lambda$0(function1, ipb, (android.os.Bundle) obj4);
                        }
                    }, new Function1() { // from class: o.iPH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj4) {
                            return Web3RewardsClaimHandler$invoke$1.invokeSuspend$lambda$2$lambda$1(ipb, investTxModel, appCompatActivity, (NewCallbackBean) obj4);
                        }
                    }, null, 16, null);
                    objM7386unboximpl = obj2;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                    if (thM7380exceptionOrNullimpl != null) {
                        if (thM7380exceptionOrNullimpl instanceof OKServerException) {
                            throw thM7380exceptionOrNullimpl;
                        }
                        throw new OKServerException(2, null, null, null, 14, null);
                    }
                    return Unit.INSTANCE;
                }
                InvestTxModel investTxModel2 = (InvestTxModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                investTxModel = investTxModel2;
                ipb = this.this$0;
                AppCompatActivity appCompatActivity3 = this.$hostRef;
                C25523iyN c25523iyN = this.$claimRequestParams;
                function1 = this.$callback;
                AppCompatActivity appCompatActivity4 = this.$host;
                if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                    InvestCallDataResult investCallDataResult2 = (InvestCallDataResult) objM7386unboximpl;
                    this.L$0 = investTxModel;
                    this.L$1 = objM7386unboximpl;
                    this.L$2 = ipb;
                    this.L$3 = function1;
                    this.L$4 = appCompatActivity4;
                    this.L$5 = investCallDataResult2;
                    this.label = 3;
                    obj = ipb.copydefault(appCompatActivity3, c25523iyN, investCallDataResult2, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM7386unboximpl;
                    appCompatActivity = appCompatActivity4;
                    investCallDataResult = investCallDataResult2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC9738bbJ interfaceC9738bbJ = (InterfaceC9738bbJ) obj;
        iPB ipb2 = this.this$0;
        C25523iyN c25523iyN2 = this.$claimRequestParams;
        Intrinsics.copydefault(interfaceC9738bbJ);
        InvestTxModel investTxModelOLrzqt = ipb2.OLrzqt(c25523iyN2, interfaceC9738bbJ);
        InterfaceC23966iPy interfaceC23966iPy = this.this$0.EZpvd;
        this.L$0 = investTxModelOLrzqt;
        this.label = 2;
        Object objKWHzl = interfaceC23966iPy.KWHzl(investTxModelOLrzqt, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        investTxModel = investTxModelOLrzqt;
        objM7386unboximpl = objKWHzl;
        ipb = this.this$0;
        AppCompatActivity appCompatActivity32 = this.$hostRef;
        C25523iyN c25523iyN3 = this.$claimRequestParams;
        function1 = this.$callback;
        AppCompatActivity appCompatActivity42 = this.$host;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$0(Function1 function1, iPB ipb, Bundle bundle) {
        function1.invoke(ipb.OLrzqt(bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC58185ywX invokeSuspend$lambda$2$lambda$1(iPB ipb, InvestTxModel investTxModel, AppCompatActivity appCompatActivity, NewCallbackBean newCallbackBean) {
        return ipb.AEQbTJ(newCallbackBean, investTxModel, appCompatActivity);
    }
}

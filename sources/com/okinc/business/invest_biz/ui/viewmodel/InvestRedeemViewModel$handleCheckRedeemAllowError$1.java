package com.okinc.business.invest_biz.ui.viewmodel;

import com.okinc.business.invest_biz.data.bean.DisplayText;
import com.okinc.network.okg.response.OKServerException;
import face.security.device.api.FaceSecCode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C24177iXt;
import o.C25493ixk;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24173iXp;
import o.iCP;
import o.iXD;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRedeemViewModel$handleCheckRedeemAllowError$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $code;
    final /* synthetic */ String $errorMessage;
    int label;
    final /* synthetic */ InvestRedeemViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestRedeemViewModel$handleCheckRedeemAllowError$1(int i, InvestRedeemViewModel investRedeemViewModel, String str, Continuation<? super InvestRedeemViewModel$handleCheckRedeemAllowError$1> continuation) {
        super(2, continuation);
        this.$code = i;
        this.this$0 = investRedeemViewModel;
        this.$errorMessage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestRedeemViewModel$handleCheckRedeemAllowError$1(this.$code, this.this$0, this.$errorMessage, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestRedeemViewModel$handleCheckRedeemAllowError$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        iXD.TaskDescription taskDescription;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            int i2 = this.$code;
            if (i2 == 10003) {
                MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
                C24177iXt c24177iXtKWHzl = iCP.KWHzl();
                InterfaceC24173iXp.Activity activity = new InterfaceC24173iXp.Activity(c24177iXtKWHzl.copydefault((247 & 1) != 0 ? c24177iXtKWHzl.copydefault : DisplayText.Companion.fromStringResource$default(DisplayText.Companion, C25493ixk.FragmentManager.v, null, 2, null), (247 & 2) != 0 ? c24177iXtKWHzl.valueOf : null, (247 & 4) != 0 ? c24177iXtKWHzl.djBIcL : 0, (247 & 8) != 0 ? c24177iXtKWHzl.OLrzqt : false, (247 & 16) != 0 ? c24177iXtKWHzl.EZpvd : false, (247 & 32) != 0 ? c24177iXtKWHzl.AEQbTJ : null, (247 & 64) != 0 ? c24177iXtKWHzl.AYXKKw : 0, (247 & 128) != 0 ? c24177iXtKWHzl.KWHzl : 0), null, null, 0, 14, null);
                this.label = 1;
                if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow = this.this$0.copydefault;
                taskDescription = new iXD.TaskDescription(new OKServerException(FaceSecCode.SC_UNKNOWN_ERROR, C33070mpX.AYXKKw(C25493ixk.FragmentManager.Dfm), null, null, 12, null), null, 2, null);
                this.label = 2;
                if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                }
            } else if (i2 != 10006) {
                this.this$0.KWHzl(this.$errorMessage);
            } else {
                this.this$0.iwGUEr = true;
                InvestRedeemViewModel.getReceiveInfoAndCheckState$default(this.this$0, false, 1, null);
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            mutableSharedFlow = this.this$0.copydefault;
            taskDescription = new iXD.TaskDescription(new OKServerException(FaceSecCode.SC_UNKNOWN_ERROR, C33070mpX.AYXKKw(C25493ixk.FragmentManager.Dfm), null, null, 12, null), null, 2, null);
            this.label = 2;
            if (mutableSharedFlow.emit(taskDescription, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

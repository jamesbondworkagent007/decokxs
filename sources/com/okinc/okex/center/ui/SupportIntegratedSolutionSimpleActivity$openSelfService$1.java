package com.okinc.okex.center.ui;

import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C45397soy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportIntegratedSolutionSimpleActivity$openSelfService$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelfServiceToolBean $serviceData;
    int label;
    final /* synthetic */ SupportIntegratedSolutionSimpleActivity this$0;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelfServiceScenario.values().length];
            try {
                iArr[SelfServiceScenario.P2P_REORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfServiceScenario.WITHDRAW_ASSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportIntegratedSolutionSimpleActivity$openSelfService$1(SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity, SelfServiceToolBean selfServiceToolBean, Continuation<? super SupportIntegratedSolutionSimpleActivity$openSelfService$1> continuation) {
        super(2, continuation);
        this.this$0 = supportIntegratedSolutionSimpleActivity;
        this.$serviceData = selfServiceToolBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportIntegratedSolutionSimpleActivity$openSelfService$1(this.this$0, this.$serviceData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportIntegratedSolutionSimpleActivity$openSelfService$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object id;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45397soy c45397soyFJNWhG = this.this$0.fJNWhG();
            SupportIntegratedSolutionSimpleActivity supportIntegratedSolutionSimpleActivity = this.this$0;
            SelfServiceToolBean selfServiceToolBean = this.$serviceData;
            int i2 = StateListAnimator.copydefault[selfServiceToolBean.getScenario().ordinal()];
            if (i2 != 1) {
                id = i2 != 2 ? null : this.this$0.hDKMBd().fIwbmz();
                this.label = 1;
                if (c45397soyFJNWhG.KWHzl(supportIntegratedSolutionSimpleActivity, selfServiceToolBean, id, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                TransactionDisplayModel transactionDisplayModelUzCIH = this.this$0.hDKMBd().uzCIH();
                if (transactionDisplayModelUzCIH != null) {
                    id = transactionDisplayModelUzCIH.getId();
                }
                this.label = 1;
                if (c45397soyFJNWhG.KWHzl(supportIntegratedSolutionSimpleActivity, selfServiceToolBean, id, this) == objCopydefault) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

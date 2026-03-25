package com.okinc.tradingbot.impl.order.strategy.dialog;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.order.strategy.dialog.EditStrategyNameViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C43401rob;
import o.C43422row;
import o.C51011vev;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC50055vAf;
import o.pUU;

/* JADX INFO: loaded from: classes11.dex */
public final class EditStrategyNameViewModel$auditStrategyName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isNameEdited;
    final /* synthetic */ String $strategyName;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EditStrategyNameViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditStrategyNameViewModel$auditStrategyName$1(EditStrategyNameViewModel editStrategyNameViewModel, String str, boolean z, Continuation<? super EditStrategyNameViewModel$auditStrategyName$1> continuation) {
        super(2, continuation);
        this.this$0 = editStrategyNameViewModel;
        this.$strategyName = str;
        this.$isNameEdited = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EditStrategyNameViewModel$auditStrategyName$1 editStrategyNameViewModel$auditStrategyName$1 = new EditStrategyNameViewModel$auditStrategyName$1(this.this$0, this.$strategyName, this.$isNameEdited, continuation);
        editStrategyNameViewModel$auditStrategyName$1.L$0 = obj;
        return editStrategyNameViewModel$auditStrategyName$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditStrategyNameViewModel$auditStrategyName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot actionBar;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd(EditStrategyNameViewModel.TaskDescription.ActionBar.copydefault);
                EditStrategyNameViewModel editStrategyNameViewModel = this.this$0;
                String str = this.$strategyName;
                InterfaceC50055vAf interfaceC50055vAf = editStrategyNameViewModel.AEQbTJ;
                C51011vev c51011vev = new C51011vev(str);
                this.label = 1;
                obj = interfaceC50055vAf.EZpvd(c51011vev, this);
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
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        EditStrategyNameViewModel editStrategyNameViewModel2 = this.this$0;
        String str2 = this.$strategyName;
        boolean z = this.$isNameEdited;
        if (actionBar instanceof AbstractC43419rot.StateListAnimator) {
            ((AbstractC43419rot.StateListAnimator) actionBar).KWHzl();
            editStrategyNameViewModel2.EZpvd(new EditStrategyNameViewModel.TaskDescription.Activity(str2, z));
        }
        EditStrategyNameViewModel editStrategyNameViewModel3 = this.this$0;
        if (actionBar instanceof AbstractC43419rot.ActionBar) {
            String message = ((OKServerException) ((AbstractC43419rot.ActionBar) actionBar).KWHzl()).getMessage();
            if (message == null) {
                message = "";
            }
            editStrategyNameViewModel3.EZpvd(new EditStrategyNameViewModel.TaskDescription.StateListAnimator(message));
        }
        return Unit.INSTANCE;
    }
}

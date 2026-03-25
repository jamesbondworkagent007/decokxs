package com.okinc.business.defi.wallet.tee.disable.viewmodel;

import com.okinc.business.defi.wallet.tee.activate.model.ActivateTeeModel;
import com.okinc.business.defi.wallet.tee.common.model.TeeCommand;
import com.okinc.business.defi.wallet.tee.common.model.TeeType;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC12782ctV;
import o.C17869fVh;
import o.C56391yDq;
import o.C56442yFn;
import o.fVJ;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeDisableViewModel$disableTee$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $password;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TeeDisableViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeeDisableViewModel$disableTee$1(TeeDisableViewModel teeDisableViewModel, String str, Continuation<? super TeeDisableViewModel$disableTee$1> continuation) {
        super(2, continuation);
        this.this$0 = teeDisableViewModel;
        this.$password = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TeeDisableViewModel$disableTee$1(this.this$0, this.$password, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TeeDisableViewModel$disableTee$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableSharedFlow mutableSharedFlow;
        Object objM7386unboximpl;
        AbstractC12782ctV abstractC12782ctV;
        Object objM7377constructorimpl;
        MutableSharedFlow mutableSharedFlow2;
        Result resultM7376boximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.this$0.gEmmrt.getValue();
            if (abstractC12782ctV2 == null) {
                return Unit.INSTANCE;
            }
            MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
            C17869fVh c17869fVh = this.this$0.copydefault;
            String str = this.$password;
            ActivateTeeModel activateTeeModel = new ActivateTeeModel(yDY.AhwBna(), System.currentTimeMillis(), 0L, false, TeeType.PRIVATE_TEE, TeeCommand.REMOVE_TEE);
            this.L$0 = abstractC12782ctV2;
            this.L$1 = mutableSharedFlow3;
            this.label = 1;
            Object objEZpvd = c17869fVh.EZpvd(str, activateTeeModel, abstractC12782ctV2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            mutableSharedFlow = mutableSharedFlow3;
            objM7386unboximpl = objEZpvd;
            abstractC12782ctV = abstractC12782ctV2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                mutableSharedFlow2 = (MutableSharedFlow) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow = mutableSharedFlow2;
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                resultM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            MutableSharedFlow mutableSharedFlow4 = (MutableSharedFlow) this.L$1;
            abstractC12782ctV = (AbstractC12782ctV) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            mutableSharedFlow = mutableSharedFlow4;
        }
        TeeDisableViewModel teeDisableViewModel = this.this$0;
        if (!Result.m7384isSuccessimpl(objM7386unboximpl)) {
            objM7377constructorimpl = Result.m7377constructorimpl(objM7386unboximpl);
            resultM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
            }
            return Unit.INSTANCE;
        }
        Result.Application application = Result.Companion;
        if (((Boolean) objM7386unboximpl).booleanValue()) {
            fVJ fvj = teeDisableViewModel.AYXKKw;
            String strDbNXlk = abstractC12782ctV.DbNXlk();
            String strEjfBZ = abstractC12782ctV.ejfBZ();
            this.L$0 = mutableSharedFlow;
            this.L$1 = null;
            this.label = 2;
            if (fvj.AEQbTJ(strDbNXlk, strEjfBZ, false, false, this) == objCopydefault) {
                return objCopydefault;
            }
            mutableSharedFlow2 = mutableSharedFlow;
            mutableSharedFlow = mutableSharedFlow2;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        resultM7376boximpl = Result.m7376boximpl(objM7377constructorimpl);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (mutableSharedFlow.emit(resultM7376boximpl, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}

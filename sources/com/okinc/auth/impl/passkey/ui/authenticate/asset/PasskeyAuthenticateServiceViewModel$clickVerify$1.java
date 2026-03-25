package com.okinc.auth.impl.passkey.ui.authenticate.asset;

import com.okinc.auth.api.passkey.PasskeyState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5990aGr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5922aFc;
import o.C5941aFv;
import o.C5973aGa;
import o.C5978aGf;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyAuthenticateServiceViewModel$clickVerify$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ PasskeyAuthenticateServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyAuthenticateServiceViewModel$clickVerify$1(PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModel, Continuation<? super PasskeyAuthenticateServiceViewModel$clickVerify$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyAuthenticateServiceViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyAuthenticateServiceViewModel$clickVerify$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyAuthenticateServiceViewModel$clickVerify$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC5990aGr abstractC5990aGr;
        AbstractC5990aGr abstractC5990aGr2;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                MutableSharedFlow mutableSharedFlow3 = this.this$0.KWHzl;
                Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                this.label = 1;
                if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModel = this.this$0;
                this.label = 2;
                obj = passkeyAuthenticateServiceViewModel.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                if (((Boolean) obj).booleanValue()) {
                    MutableSharedFlow mutableSharedFlow4 = this.this$0.gEmmrt;
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                    this.label = 3;
                    if (mutableSharedFlow4.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5941aFv c5941aFv = this.this$0.AhwBna;
                    this.label = 4;
                    obj = c5941aFv.copydefault(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        C5978aGf c5978aGf = this.this$0.ejfBZ;
                        this.label = 5;
                        obj = c5978aGf.KWHzl(this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC5990aGr = (AbstractC5990aGr) obj;
                        abstractC5990aGr2 = abstractC5990aGr;
                        mutableSharedFlow = this.this$0.gEmmrt;
                        boolKWHzl = C56443yFo.KWHzl(false);
                        this.L$0 = abstractC5990aGr2;
                        this.label = 7;
                        if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableSharedFlow2 = this.this$0.valueOf;
                        this.L$0 = null;
                        this.label = 8;
                        if (mutableSharedFlow2.emit(abstractC5990aGr2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    C5973aGa c5973aGa = this.this$0.fARcdN;
                    this.label = 6;
                    obj = c5973aGa.copydefault(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC5990aGr = (AbstractC5990aGr) obj;
                    abstractC5990aGr2 = abstractC5990aGr;
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC5990aGr2;
                    this.label = 7;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                    }
                    mutableSharedFlow2 = this.this$0.valueOf;
                    this.L$0 = null;
                    this.label = 8;
                    if (mutableSharedFlow2.emit(abstractC5990aGr2, this) == objCopydefault) {
                    }
                    return Unit.INSTANCE;
                }
                C5922aFc.log$default(C5922aFc.KWHzl, "[AUTHENTICATE]", null, "PasskeyAuthenticateServiceViewModel incompatible or not registered", 2, null);
                MutableSharedFlow mutableSharedFlow5 = this.this$0.OLrzqt;
                PasskeyState.DeviceNotCompatible deviceNotCompatible = PasskeyState.DeviceNotCompatible.INSTANCE;
                this.label = 9;
                if (mutableSharedFlow5.emit(deviceNotCompatible, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                PasskeyAuthenticateServiceViewModel passkeyAuthenticateServiceViewModel2 = this.this$0;
                this.label = 2;
                obj = passkeyAuthenticateServiceViewModel2.OLrzqt(this);
                if (obj == objCopydefault) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                C5941aFv c5941aFv2 = this.this$0.AhwBna;
                this.label = 4;
                obj = c5941aFv2.copydefault(this);
                if (obj == objCopydefault) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 4:
                C56391yDq.AEQbTJ(obj);
                if (((Boolean) obj).booleanValue()) {
                }
                break;
            case 5:
                C56391yDq.AEQbTJ(obj);
                abstractC5990aGr = (AbstractC5990aGr) obj;
                abstractC5990aGr2 = abstractC5990aGr;
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5990aGr2;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow2 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow2.emit(abstractC5990aGr2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                abstractC5990aGr = (AbstractC5990aGr) obj;
                abstractC5990aGr2 = abstractC5990aGr;
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5990aGr2;
                this.label = 7;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow2 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow2.emit(abstractC5990aGr2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                abstractC5990aGr2 = (AbstractC5990aGr) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = this.this$0.valueOf;
                this.L$0 = null;
                this.label = 8;
                if (mutableSharedFlow2.emit(abstractC5990aGr2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
            case 9:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

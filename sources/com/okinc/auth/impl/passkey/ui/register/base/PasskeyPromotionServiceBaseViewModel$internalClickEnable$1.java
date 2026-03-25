package com.okinc.auth.impl.passkey.ui.register.base;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.passkey.ui.register.base.PasskeyPromotionServiceBaseViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC5991aGs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5910aFQ;
import o.C5922aFc;
import o.C6268aMD;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceBaseViewModel$internalClickEnable$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C6268aMD $fragment;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel.Request $request;
    Object L$0;
    int label;
    final /* synthetic */ PasskeyPromotionServiceBaseViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceBaseViewModel$internalClickEnable$1(PasskeyPromotionServiceBaseViewModel.Request request, PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel, C6268aMD c6268aMD, Continuation<? super PasskeyPromotionServiceBaseViewModel$internalClickEnable$1> continuation) {
        super(2, continuation);
        this.$request = request;
        this.this$0 = passkeyPromotionServiceBaseViewModel;
        this.$fragment = c6268aMD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceBaseViewModel$internalClickEnable$1(this.$request, this.this$0, this.$fragment, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceBaseViewModel$internalClickEnable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [256=4] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PasskeyVersionState passkeyVersionState;
        AbstractC5991aGs abstractC5991aGs;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        MutableSharedFlow mutableSharedFlow2;
        MutableSharedFlow mutableSharedFlow3;
        MutableSharedFlow mutableSharedFlow4;
        Boolean boolKWHzl2;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                if (this.$request.OLrzqt().length() == 0 && this.$request.KWHzl().length() == 0) {
                    this.this$0.fJNWhG();
                    return Unit.INSTANCE;
                }
                this.this$0.isConnected.setValue(this.$request);
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel = this.this$0;
                this.label = 1;
                obj = PasskeyPromotionServiceBaseViewModel.getOrSetupPasskeyVersion$default(passkeyPromotionServiceBaseViewModel, false, this, 1, null);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                passkeyVersionState = (PasskeyVersionState) obj;
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE)) {
                    MutableSharedFlow mutableSharedFlow5 = this.this$0.gEmmrt;
                    Boolean boolKWHzl3 = C56443yFo.KWHzl(true);
                    this.label = 2;
                    if (mutableSharedFlow5.emit(boolKWHzl3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel2 = this.this$0;
                    PasskeyPromotionServiceBaseViewModel.Request request = this.$request;
                    this.label = 3;
                    obj = passkeyPromotionServiceBaseViewModel2.OLrzqt(request, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    abstractC5991aGs = (AbstractC5991aGs) obj;
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.L$0 = abstractC5991aGs;
                    this.label = 4;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    mutableSharedFlow2 = this.this$0.AuCTel;
                    this.L$0 = null;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(abstractC5991aGs, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido1v2Compatible.INSTANCE)) {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "passkey version state: " + passkeyVersionState, 2, null);
                    MutableSharedFlow mutableSharedFlow6 = this.this$0.uzCIH;
                    String string = passkeyVersionState.toString();
                    this.label = 10;
                    if (mutableSharedFlow6.emit(string, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                MutableSharedFlow mutableSharedFlow7 = this.this$0.gEmmrt;
                Boolean boolKWHzl4 = C56443yFo.KWHzl(true);
                this.label = 6;
                if (mutableSharedFlow7.emit(boolKWHzl4, this) == objCopydefault) {
                    return objCopydefault;
                }
                C5910aFQ c5910aFQ = this.this$0.zuBGHE;
                String strOLrzqt = this.$request.OLrzqt();
                String strKWHzl = this.$request.KWHzl();
                C6268aMD c6268aMD = this.$fragment;
                this.label = 7;
                obj = c5910aFQ.copydefault(strOLrzqt, strKWHzl, c6268aMD, 2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.label = 8;
                if (mutableSharedFlow3.emit((C5910aFQ.Application) obj, this) == objCopydefault) {
                    return objCopydefault;
                }
                mutableSharedFlow4 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.label = 9;
                if (mutableSharedFlow4.emit(boolKWHzl2, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                passkeyVersionState = (PasskeyVersionState) obj;
                if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE)) {
                }
                break;
            case 2:
                C56391yDq.AEQbTJ(obj);
                PasskeyPromotionServiceBaseViewModel passkeyPromotionServiceBaseViewModel22 = this.this$0;
                PasskeyPromotionServiceBaseViewModel.Request request2 = this.$request;
                this.label = 3;
                obj = passkeyPromotionServiceBaseViewModel22.OLrzqt(request2, this);
                if (obj == objCopydefault) {
                }
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow2 = this.this$0.AuCTel;
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow2.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                abstractC5991aGs = (AbstractC5991aGs) obj;
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.L$0 = abstractC5991aGs;
                this.label = 4;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                mutableSharedFlow2 = this.this$0.AuCTel;
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow2.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                abstractC5991aGs = (AbstractC5991aGs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow2 = this.this$0.AuCTel;
                this.L$0 = null;
                this.label = 5;
                if (mutableSharedFlow2.emit(abstractC5991aGs, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
            case 9:
            case 10:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                C5910aFQ c5910aFQ2 = this.this$0.zuBGHE;
                String strOLrzqt2 = this.$request.OLrzqt();
                String strKWHzl2 = this.$request.KWHzl();
                C6268aMD c6268aMD2 = this.$fragment;
                this.label = 7;
                obj = c5910aFQ2.copydefault(strOLrzqt2, strKWHzl2, c6268aMD2, 2, this);
                if (obj == objCopydefault) {
                }
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.label = 8;
                if (mutableSharedFlow3.emit((C5910aFQ.Application) obj, this) == objCopydefault) {
                }
                mutableSharedFlow4 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.label = 9;
                if (mutableSharedFlow4.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow3 = this.this$0.fIwbmz;
                this.label = 8;
                if (mutableSharedFlow3.emit((C5910aFQ.Application) obj, this) == objCopydefault) {
                }
                mutableSharedFlow4 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.label = 9;
                if (mutableSharedFlow4.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 8:
                C56391yDq.AEQbTJ(obj);
                mutableSharedFlow4 = this.this$0.gEmmrt;
                boolKWHzl2 = C56443yFo.KWHzl(false);
                this.label = 9;
                if (mutableSharedFlow4.emit(boolKWHzl2, this) == objCopydefault) {
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

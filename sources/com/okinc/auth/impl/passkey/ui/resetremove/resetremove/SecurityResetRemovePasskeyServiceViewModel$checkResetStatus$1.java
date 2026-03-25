package com.okinc.auth.impl.passkey.ui.resetremove.resetremove;

import com.okinc.auth.api.passkey.PasskeyResetRemoveType;
import com.okinc.auth.impl.passkey.model.PasskeyResetStatusResponse;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5916aFW;
import o.C5922aFc;

/* JADX INFO: loaded from: classes3.dex */
public final class SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PasskeyResetRemoveType $argResetRemoveType;
    Object L$0;
    int label;
    final /* synthetic */ SecurityResetRemovePasskeyServiceViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1(SecurityResetRemovePasskeyServiceViewModel securityResetRemovePasskeyServiceViewModel, PasskeyResetRemoveType passkeyResetRemoveType, Continuation<? super SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = securityResetRemovePasskeyServiceViewModel;
        this.$argResetRemoveType = passkeyResetRemoveType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1(this.this$0, this.$argResetRemoveType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SecurityResetRemovePasskeyServiceViewModel$checkResetStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object obj2;
        String str;
        MutableSharedFlow mutableSharedFlow;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl.setValue(this.$argResetRemoveType);
            this.this$0.djBIcL.setValue(C56443yFo.KWHzl(true));
            C5916aFW c5916aFW = this.this$0.isConnected;
            Unit unit = Unit.INSTANCE;
            this.label = 1;
            objKWHzl = c5916aFW.KWHzl(unit, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                SecurityResetRemovePasskeyServiceViewModel securityResetRemovePasskeyServiceViewModel = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, SecurityResetRemovePasskeyServiceViewModel.Companion.copydefault() + " reset status exception: " + thM7380exceptionOrNullimpl.getMessage(), 2, null);
                    MutableSharedFlow mutableSharedFlow2 = securityResetRemovePasskeyServiceViewModel.AEQbTJ;
                    String message = thM7380exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    this.L$0 = obj2;
                    this.label = 5;
                    if (mutableSharedFlow2.emit(message, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        obj2 = objKWHzl;
        this.this$0.djBIcL.setValue(C56443yFo.KWHzl(false));
        SecurityResetRemovePasskeyServiceViewModel securityResetRemovePasskeyServiceViewModel2 = this.this$0;
        PasskeyResetRemoveType passkeyResetRemoveType = this.$argResetRemoveType;
        if (Result.m7384isSuccessimpl(obj2)) {
            PasskeyResetStatusResponse passkeyResetStatusResponse = (PasskeyResetStatusResponse) obj2;
            C5922aFc.log$default(C5922aFc.KWHzl, "[RESET/REMOVE]", null, SecurityResetRemovePasskeyServiceViewModel.Companion.copydefault() + " reset status blockType: " + passkeyResetStatusResponse.AEQbTJ(), 2, null);
            String strAEQbTJ = passkeyResetStatusResponse.AEQbTJ();
            if (strAEQbTJ == null) {
                str = "blockType " + passkeyResetStatusResponse.AEQbTJ() + " not recognised";
                mutableSharedFlow = securityResetRemovePasskeyServiceViewModel2.AEQbTJ;
                this.L$0 = obj2;
                this.label = 4;
                if (mutableSharedFlow.emit(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                int iHashCode = strAEQbTJ.hashCode();
                if (iHashCode == -1024706405) {
                    if (!strAEQbTJ.equals("FACE_VERIFY")) {
                    }
                } else {
                    if (iHashCode != 2402104) {
                        if (iHashCode == 194382600 && strAEQbTJ.equals("DOC_UPLOAD")) {
                            MutableSharedFlow mutableSharedFlow3 = securityResetRemovePasskeyServiceViewModel2.valueOf;
                            Unit unit2 = Unit.INSTANCE;
                            this.L$0 = obj2;
                            this.label = 3;
                            if (mutableSharedFlow3.emit(unit2, this) == objCopydefault) {
                                return objCopydefault;
                            }
                        }
                    } else if (strAEQbTJ.equals("NONE")) {
                        MutableSharedFlow mutableSharedFlow4 = securityResetRemovePasskeyServiceViewModel2.gEmmrt;
                        this.L$0 = obj2;
                        this.label = 2;
                        if (mutableSharedFlow4.emit(passkeyResetRemoveType, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    str = "blockType " + passkeyResetStatusResponse.AEQbTJ() + " not recognised";
                    mutableSharedFlow = securityResetRemovePasskeyServiceViewModel2.AEQbTJ;
                    this.L$0 = obj2;
                    this.label = 4;
                    if (mutableSharedFlow.emit(str, this) == objCopydefault) {
                    }
                }
            }
            return Unit.INSTANCE;
        }
        SecurityResetRemovePasskeyServiceViewModel securityResetRemovePasskeyServiceViewModel3 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}

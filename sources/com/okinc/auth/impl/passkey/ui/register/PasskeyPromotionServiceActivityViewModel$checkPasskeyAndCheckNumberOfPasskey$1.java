package com.okinc.auth.impl.passkey.ui.register;

import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.okuser.data.UserInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C57599ylU;
import o.C5922aFc;
import o.InterfaceC8108awX;
import o.InterfaceC8196ayF;

/* JADX INFO: loaded from: classes3.dex */
public final class PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final /* synthetic */ PasskeyPromotionServiceActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1(PasskeyPromotionServiceActivityViewModel passkeyPromotionServiceActivityViewModel, Continuation<? super PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1> continuation) {
        super(2, continuation);
        this.this$0 = passkeyPromotionServiceActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PasskeyPromotionServiceActivityViewModel$checkPasskeyAndCheckNumberOfPasskey$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        MutableSharedFlow mutableSharedFlow;
        Boolean boolKWHzl;
        PasskeyScenario passkeyScenarioAuCTel;
        MutableSharedFlow mutableSharedFlow2;
        Unit unit;
        UserInfo userInfo;
        Object objCopydefault = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "checkPasskeyAndCheckNumberOfPasskey: " + this.this$0.AuCTel(), 2, null);
                if (!this.this$0.fIwbmz()) {
                    MutableSharedFlow mutableSharedFlow3 = this.this$0.gEmmrt;
                    Boolean boolKWHzl2 = C56443yFo.KWHzl(true);
                    this.label = 1;
                    if (mutableSharedFlow3.emit(boolKWHzl2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    InterfaceC8196ayF interfaceC8196ayF = this.this$0.DbNXlk;
                    PasskeyScenario passkeyScenarioAuCTel2 = this.this$0.AuCTel();
                    boolean zEZpvd = this.this$0.EZpvd();
                    this.label = 2;
                    obj = interfaceC8196ayF.copydefault(passkeyScenarioAuCTel2, zEZpvd, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    mutableSharedFlow = this.this$0.gEmmrt;
                    boolKWHzl = C56443yFo.KWHzl(false);
                    this.Z$0 = zBooleanValue;
                    this.label = 3;
                    if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "isCompatible: " + zBooleanValue, 2, null);
                    if (!zBooleanValue) {
                        C57599ylU.KWHzl("Passkey is incompatible on current device");
                        MutableSharedFlow mutableSharedFlow4 = this.this$0.EZpvd;
                        Unit unit2 = Unit.INSTANCE;
                        this.label = 4;
                        if (mutableSharedFlow4.emit(unit2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                }
                passkeyScenarioAuCTel = this.this$0.AuCTel();
                if (!Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Pay.EZpvd)) {
                    if (passkeyScenarioAuCTel instanceof PasskeyScenario.CedefiWallet) {
                        MutableSharedFlow mutableSharedFlow5 = this.this$0.valueOf;
                        Unit unit3 = Unit.INSTANCE;
                        this.label = 5;
                        if (mutableSharedFlow5.emit(unit3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (!(passkeyScenarioAuCTel instanceof PasskeyScenario.Asset) && !Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Account.AEQbTJ)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        InterfaceC8108awX interfaceC8108awX = (InterfaceC8108awX) C43251rlk.OLrzqt(InterfaceC8108awX.class);
                        if (interfaceC8108awX != null) {
                            this.label = 6;
                            obj = interfaceC8108awX.AEQbTJ(true, this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            userInfo = (UserInfo) obj;
                            if (userInfo == null && (userInfo.getFidoReady() || userInfo.getFido1Ready())) {
                                MutableSharedFlow mutableSharedFlow6 = this.this$0.valueOf;
                                Unit unit4 = Unit.INSTANCE;
                                this.label = 7;
                                if (mutableSharedFlow6.emit(unit4, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                        mutableSharedFlow2 = this.this$0.isConnected;
                        unit = Unit.INSTANCE;
                        this.label = 8;
                        if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                InterfaceC8196ayF interfaceC8196ayF2 = this.this$0.DbNXlk;
                PasskeyScenario passkeyScenarioAuCTel22 = this.this$0.AuCTel();
                boolean zEZpvd2 = this.this$0.EZpvd();
                this.label = 2;
                obj = interfaceC8196ayF2.copydefault(passkeyScenarioAuCTel22, zEZpvd2, this);
                if (obj == objCopydefault) {
                }
                zBooleanValue = ((Boolean) obj).booleanValue();
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.Z$0 = zBooleanValue;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "isCompatible: " + zBooleanValue, 2, null);
                if (!zBooleanValue) {
                }
                passkeyScenarioAuCTel = this.this$0.AuCTel();
                if (!Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Pay.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 2:
                C56391yDq.AEQbTJ(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                mutableSharedFlow = this.this$0.gEmmrt;
                boolKWHzl = C56443yFo.KWHzl(false);
                this.Z$0 = zBooleanValue;
                this.label = 3;
                if (mutableSharedFlow.emit(boolKWHzl, this) == objCopydefault) {
                }
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "isCompatible: " + zBooleanValue, 2, null);
                if (!zBooleanValue) {
                }
                passkeyScenarioAuCTel = this.this$0.AuCTel();
                if (!Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Pay.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 3:
                zBooleanValue = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                C5922aFc.log$default(C5922aFc.KWHzl, "[REGISTER]", null, "isCompatible: " + zBooleanValue, 2, null);
                if (!zBooleanValue) {
                }
                passkeyScenarioAuCTel = this.this$0.AuCTel();
                if (!Intrinsics.EZpvd(passkeyScenarioAuCTel, PasskeyScenario.Pay.EZpvd)) {
                }
                return Unit.INSTANCE;
            case 4:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 5:
            case 7:
            case 8:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                userInfo = (UserInfo) obj;
                if (userInfo == null) {
                    mutableSharedFlow2 = this.this$0.isConnected;
                    unit = Unit.INSTANCE;
                    this.label = 8;
                    if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                    }
                } else {
                    mutableSharedFlow2 = this.this$0.isConnected;
                    unit = Unit.INSTANCE;
                    this.label = 8;
                    if (mutableSharedFlow2.emit(unit, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

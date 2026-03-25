package com.okinc.auth.impl.passkey.service;

import com.okinc.auth.api.passkey.PasskeyFido1State;
import com.okinc.auth.api.passkey.PasskeyScenario;
import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.okuser.data.UserInfo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C5937aFr;
import o.C5938aFs;
import o.C5939aFt;
import o.C5941aFv;
import o.C5958aGL;
import o.InterfaceC8108awX;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PasskeyVersionState>, Object> {
    final /* synthetic */ boolean $enableFido1;
    final /* synthetic */ PasskeyScenario $scenario;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    final /* synthetic */ C5958aGL this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2(PasskeyScenario passkeyScenario, boolean z, C5958aGL c5958aGL, Continuation<? super AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2> continuation) {
        super(2, continuation);
        this.$scenario = passkeyScenario;
        this.$enableFido1 = z;
        this.this$0 = c5958aGL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2(this.$scenario, this.$enableFido1, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PasskeyVersionState> continuation) {
        return ((AuthPasskeyServiceImpl$checkPasskeyCompatibleForPasskeyVersionState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:9:0x0019, B:56:0x0126, B:58:0x012a, B:60:0x0130, B:61:0x0133, B:34:0x00d6, B:37:0x00e1, B:40:0x00e7, B:41:0x00ea, B:44:0x00f3, B:46:0x00f6, B:48:0x00fa, B:50:0x0104, B:53:0x010e, B:64:0x0137, B:67:0x0141, B:68:0x0144, B:71:0x014e, B:73:0x0152, B:79:0x015f, B:80:0x0164), top: B:83:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:9:0x0019, B:56:0x0126, B:58:0x012a, B:60:0x0130, B:61:0x0133, B:34:0x00d6, B:37:0x00e1, B:40:0x00e7, B:41:0x00ea, B:44:0x00f3, B:46:0x00f6, B:48:0x00fa, B:50:0x0104, B:53:0x010e, B:64:0x0137, B:67:0x0141, B:68:0x0144, B:71:0x014e, B:73:0x0152, B:79:0x015f, B:80:0x0164), top: B:83:0x000d }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Object objCopydefault;
        PasskeyVersionState passkeyVersionState;
        PasskeyVersionState passkeyVersionState2;
        Object objEZpvd;
        PasskeyFido1State.AndroidVersionIncompatible androidVersionIncompatible;
        PasskeyScenario passkeyScenario;
        UserInfo userInfo;
        Object obj2;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("AuthPasskeyServiceImpl", "checkPasskeyCompatibleForPasskeyVersionState: scenario: " + this.$scenario + " enableFido1: " + this.$enableFido1);
                C5941aFv c5941aFv = this.this$0.OLrzqt;
                this.label = 1;
                obj = c5941aFv.copydefault(this);
                if (obj == objCopydefault2) {
                    return objCopydefault2;
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
            } else if (i == 2) {
                zBooleanValue = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                PasskeyVersionState passkeyVersionState3 = (PasskeyVersionState) obj;
                C5937aFr c5937aFr = this.this$0.AYXKKw;
                this.L$0 = passkeyVersionState3;
                this.Z$0 = zBooleanValue;
                this.label = 3;
                objCopydefault = c5937aFr.copydefault(this);
                if (objCopydefault != objCopydefault2) {
                    return objCopydefault2;
                }
                passkeyVersionState = passkeyVersionState3;
                obj = objCopydefault;
                passkeyVersionState2 = (PasskeyVersionState) obj;
                PasskeyFido1State.AndroidVersionIncompatible androidVersionIncompatible2 = PasskeyFido1State.AndroidVersionIncompatible.INSTANCE;
                C5939aFt c5939aFt = this.this$0.AhwBna;
                this.L$0 = passkeyVersionState;
                this.L$1 = passkeyVersionState2;
                this.L$2 = androidVersionIncompatible2;
                this.Z$0 = zBooleanValue;
                this.label = 4;
                objEZpvd = c5939aFt.EZpvd(this);
                if (objEZpvd != objCopydefault2) {
                }
            } else {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        userInfo = (UserInfo) obj;
                        if (userInfo == null && userInfo.getFidoReady()) {
                            obj2 = PasskeyVersionState.Fido2Compatible.INSTANCE;
                        } else {
                            obj2 = PasskeyVersionState.DeviceIncompatible.INSTANCE;
                        }
                        return obj2;
                    }
                    zBooleanValue = this.Z$0;
                    androidVersionIncompatible = (PasskeyFido1State.AndroidVersionIncompatible) this.L$2;
                    passkeyVersionState2 = (PasskeyVersionState) this.L$1;
                    passkeyVersionState = (PasskeyVersionState) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    PasskeyVersionState passkeyVersionState4 = androidVersionIncompatible.toPasskeyVersionState((PasskeyFido1State) obj);
                    passkeyScenario = this.$scenario;
                    if (!Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Pay.EZpvd)) {
                        return passkeyVersionState;
                    }
                    if (passkeyScenario instanceof PasskeyScenario.CedefiWallet) {
                        if (zBooleanValue) {
                            return PasskeyVersionState.Fido2Compatible.INSTANCE;
                        }
                        PasskeyVersionState.Fido2Compatible fido2Compatible = PasskeyVersionState.Fido2Compatible.INSTANCE;
                        return Intrinsics.EZpvd(passkeyVersionState, fido2Compatible) ? fido2Compatible : PasskeyVersionState.DeviceIncompatible.INSTANCE;
                    }
                    if (passkeyScenario instanceof PasskeyScenario.Asset) {
                        if (!((PasskeyScenario.Asset) this.$scenario).KWHzl()) {
                            return passkeyVersionState;
                        }
                        if (!Intrinsics.EZpvd(passkeyVersionState, PasskeyVersionState.Fido2Compatible.INSTANCE) && !zBooleanValue) {
                            return passkeyVersionState;
                        }
                        InterfaceC8108awX interfaceC8108awX = (InterfaceC8108awX) C43251rlk.copydefault(InterfaceC8108awX.class);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        obj = interfaceC8108awX.AEQbTJ(true, this);
                        if (obj == objCopydefault2) {
                            return objCopydefault2;
                        }
                        userInfo = (UserInfo) obj;
                        if (userInfo == null) {
                            obj2 = PasskeyVersionState.DeviceIncompatible.INSTANCE;
                        }
                        return obj2;
                    }
                    if (!Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Account.AEQbTJ)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (zBooleanValue) {
                        return PasskeyVersionState.Fido2Compatible.INSTANCE;
                    }
                    PasskeyVersionState.Fido2Compatible fido2Compatible2 = PasskeyVersionState.Fido2Compatible.INSTANCE;
                    return Intrinsics.EZpvd(passkeyVersionState, fido2Compatible2) ? fido2Compatible2 : this.$enableFido1 ? Intrinsics.EZpvd(passkeyVersionState2, PasskeyVersionState.Fido1v2Compatible.INSTANCE) ? passkeyVersionState2 : passkeyVersionState4 : passkeyVersionState;
                }
                zBooleanValue = this.Z$0;
                PasskeyVersionState passkeyVersionState5 = (PasskeyVersionState) this.L$0;
                C56391yDq.AEQbTJ(obj);
                passkeyVersionState = passkeyVersionState5;
                passkeyVersionState2 = (PasskeyVersionState) obj;
                PasskeyFido1State.AndroidVersionIncompatible androidVersionIncompatible22 = PasskeyFido1State.AndroidVersionIncompatible.INSTANCE;
                C5939aFt c5939aFt2 = this.this$0.AhwBna;
                this.L$0 = passkeyVersionState;
                this.L$1 = passkeyVersionState2;
                this.L$2 = androidVersionIncompatible22;
                this.Z$0 = zBooleanValue;
                this.label = 4;
                objEZpvd = c5939aFt2.EZpvd(this);
                if (objEZpvd != objCopydefault2) {
                    return objCopydefault2;
                }
                androidVersionIncompatible = androidVersionIncompatible22;
                obj = objEZpvd;
                PasskeyVersionState passkeyVersionState42 = androidVersionIncompatible.toPasskeyVersionState((PasskeyFido1State) obj);
                passkeyScenario = this.$scenario;
                if (!Intrinsics.EZpvd(passkeyScenario, PasskeyScenario.Pay.EZpvd)) {
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            C5938aFs c5938aFs = this.this$0.valueOf;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            obj = c5938aFs.KWHzl(this);
            if (obj == objCopydefault2) {
                return objCopydefault2;
            }
            PasskeyVersionState passkeyVersionState32 = (PasskeyVersionState) obj;
            C5937aFr c5937aFr2 = this.this$0.AYXKKw;
            this.L$0 = passkeyVersionState32;
            this.Z$0 = zBooleanValue;
            this.label = 3;
            objCopydefault = c5937aFr2.copydefault(this);
            if (objCopydefault != objCopydefault2) {
            }
        } catch (Exception e) {
            pUU.copydefault("AuthPasskeyServiceImpl", "checkPasskeyCompatibleForPasskeyVersionState error: " + e.getMessage());
            return PasskeyVersionState.DeviceIncompatible.INSTANCE;
        }
    }
}

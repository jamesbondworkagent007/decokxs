package com.okinc.auth.impl.passkey.domain;

import com.okinc.auth.api.passkey.PasskeyVersionState;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C5903aFJ;
import o.C5904aFK;
import o.C5908aFO;
import o.C5938aFs;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckFido2UseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PasskeyVersionState>, Object> {
    int label;
    final /* synthetic */ C5938aFs this$0;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyDebugTool.PasskeyVersionStatus.values().length];
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_FIDO1_V1_V2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyVersionStatus.DEBUG_ONLY_INCOMPATIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckFido2UseCase$invoke$2(C5938aFs c5938aFs, Continuation<? super CheckFido2UseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5938aFs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckFido2UseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PasskeyVersionState> continuation) {
        return ((CheckFido2UseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad A[ADDED_TO_REGION] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C5908aFO c5908aFO = this.this$0.KWHzl;
            this.label = 1;
            obj = c5908aFO.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    obj2 = ((Boolean) obj).booleanValue() ? PasskeyVersionState.DeviceIncompatible.INSTANCE : PasskeyVersionState.Fido2Compatible.INSTANCE;
                    pUU.KWHzl("CheckFido2UseCase", "fido2State: " + obj2);
                    i = StateListAnimator.OLrzqt[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
                    if (i != 1 && i != 2) {
                        if (i == 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = PasskeyVersionState.DeviceIncompatible.INSTANCE;
                    }
                    pUU.KWHzl("CheckFido2UseCase", "finalState: " + obj2);
                    return obj2;
                }
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj2 = PasskeyVersionState.Fido2ChinaIp.INSTANCE;
                } else if (this.this$0.EZpvd.AEQbTJ()) {
                    C5903aFJ c5903aFJ = this.this$0.copydefault;
                    this.label = 3;
                    obj = c5903aFJ.AEQbTJ(this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    if (((Boolean) obj).booleanValue()) {
                    }
                } else {
                    obj2 = PasskeyVersionState.Fido2ScreenLockDisabled.INSTANCE;
                }
                pUU.KWHzl("CheckFido2UseCase", "fido2State: " + obj2);
                i = StateListAnimator.OLrzqt[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
                if (i != 1) {
                    if (i == 3) {
                    }
                    obj2 = PasskeyVersionState.DeviceIncompatible.INSTANCE;
                }
                pUU.KWHzl("CheckFido2UseCase", "finalState: " + obj2);
                return obj2;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            C5904aFK c5904aFK = this.this$0.AEQbTJ;
            this.label = 2;
            obj = c5904aFK.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
            pUU.KWHzl("CheckFido2UseCase", "fido2State: " + obj2);
            i = StateListAnimator.OLrzqt[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
            if (i != 1) {
            }
            pUU.KWHzl("CheckFido2UseCase", "finalState: " + obj2);
            return obj2;
        }
        obj2 = PasskeyVersionState.DeviceIncompatible.INSTANCE;
        pUU.KWHzl("CheckFido2UseCase", "fido2State: " + obj2);
        i = StateListAnimator.OLrzqt[PasskeyDebugTool.EZpvd.KWHzl().ordinal()];
        if (i != 1) {
        }
        pUU.KWHzl("CheckFido2UseCase", "finalState: " + obj2);
        return obj2;
    }
}

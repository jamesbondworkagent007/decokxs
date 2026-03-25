package com.okinc.auth.impl.passkey.domain;

import android.os.Build;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.auth.impl.debugtool.passkey.PasskeyDebugTool;
import com.okinc.auth.impl.featureflag.FeatureFlag;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43246rlf;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C5904aFK;
import o.C5941aFv;
import o.C5943aFx;
import o.C59449zhJ;
import o.pUU;

/* JADX INFO: loaded from: classes3.dex */
public final class CheckCredentialManagerUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    boolean Z$3;
    boolean Z$4;
    int label;
    final /* synthetic */ C5941aFv this$0;

    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PasskeyDebugTool.PasskeyDebugSdk.values().length];
            try {
                iArr[PasskeyDebugTool.PasskeyDebugSdk.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_FIDO2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PasskeyDebugTool.PasskeyDebugSdk.DEBUG_ONLY_FORCE_CRED_MAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckCredentialManagerUseCase$invoke$2(C5941aFv c5941aFv, Continuation<? super CheckCredentialManagerUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c5941aFv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheckCredentialManagerUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((CheckCredentialManagerUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0172 A[Catch: Exception -> 0x019f, TryCatch #0 {Exception -> 0x019f, blocks: (B:7:0x0015, B:55:0x016a, B:57:0x0172, B:62:0x0182, B:64:0x018c, B:12:0x002c, B:46:0x0144, B:48:0x014c, B:51:0x0155, B:68:0x0195, B:70:0x019a, B:15:0x0037, B:20:0x004c, B:22:0x0051, B:23:0x0056, B:24:0x0057, B:26:0x005c, B:30:0x0065, B:32:0x007b, B:34:0x0080, B:38:0x0091, B:40:0x00a7, B:42:0x00ac), top: B:75:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zCopydefault;
        boolean zGEmmrt;
        boolean zGEmmrt2;
        boolean zCopydefault2;
        boolean z;
        boolean z2;
        boolean z3;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                int i2 = ActionBar.copydefault[PasskeyDebugTool.EZpvd.AEQbTJ().ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C56443yFo.KWHzl(false);
                    }
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return C56443yFo.KWHzl(true);
                }
                boolean z4 = Build.VERSION.SDK_INT >= 34;
                pUU.KWHzl("GetCredentialManagerFlowUseCase", "Android>=14: " + z4);
                if (!z4) {
                    return C56443yFo.KWHzl(false);
                }
                boolean z5 = C43246rlf.OLrzqt.valueOf().getSystemService("credential") != null;
                pUU.KWHzl("GetCredentialManagerFlowUseCase", "hasCredentialService: " + z5);
                if (z5) {
                    zCopydefault = this.this$0.copydefault.copydefault(FeatureFlag.CREDENTIAL_MANAGER_XIAOMI, false);
                    zGEmmrt = C59449zhJ.gEmmrt(this.this$0.copydefault(), MTPushConstants.Manufacturer.XIAOMI, true);
                    pUU.KWHzl("GetCredentialManagerFlowUseCase", "isXiaomi:" + zGEmmrt + " isXiaomiABTestOn:" + zCopydefault);
                    boolean zCopydefault3 = this.this$0.copydefault.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO, true);
                    zGEmmrt2 = C59449zhJ.gEmmrt(this.this$0.copydefault(), MTPushConstants.Manufacturer.OPPO, true);
                    zCopydefault2 = this.this$0.copydefault.copydefault(FeatureFlag.CREDENTIAL_MANAGER_OPPO_OVERSEA, true);
                    pUU.KWHzl("GetCredentialManagerFlowUseCase", "isOppo:" + zGEmmrt2 + " isOppoABTestOn:" + zCopydefault3 + " isOppoOverseaABTestOn:" + zCopydefault2);
                    C5904aFK c5904aFK = this.this$0.EZpvd;
                    this.Z$0 = zCopydefault;
                    this.Z$1 = zGEmmrt;
                    this.Z$2 = zCopydefault3;
                    this.Z$3 = zGEmmrt2;
                    this.Z$4 = zCopydefault2;
                    this.label = 1;
                    Object objKWHzl = c5904aFK.KWHzl(this);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                    z = zCopydefault3;
                    obj = objKWHzl;
                } else {
                    return C56443yFo.KWHzl(false);
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = this.Z$1;
                    z3 = this.Z$0;
                    C56391yDq.AEQbTJ(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        pUU.KWHzl("GetCredentialManagerFlowUseCase", "Xiaomi ABTest on and compatible");
                        return C56443yFo.KWHzl(true);
                    }
                    z = z3;
                    zGEmmrt2 = z2;
                    if (!z && zGEmmrt2) {
                        pUU.KWHzl("GetCredentialManagerFlowUseCase", "Oppo ABTest on and compatible");
                        return C56443yFo.KWHzl(true);
                    }
                    return C56443yFo.KWHzl(false);
                }
                boolean z6 = this.Z$4;
                boolean z7 = this.Z$3;
                z = this.Z$2;
                zGEmmrt = this.Z$1;
                zCopydefault = this.Z$0;
                C56391yDq.AEQbTJ(obj);
                zCopydefault2 = z6;
                zGEmmrt2 = z7;
            }
            if (!((Boolean) obj).booleanValue()) {
                if (zCopydefault2 && zGEmmrt2) {
                    return C56443yFo.KWHzl(true);
                }
                return C56443yFo.KWHzl(false);
            }
            pUU.KWHzl("GetCredentialManagerFlowUseCase", "China IP detected on");
            if (zCopydefault && zGEmmrt) {
                C5943aFx c5943aFx = this.this$0.KWHzl;
                this.Z$0 = z;
                this.Z$1 = zGEmmrt2;
                this.label = 2;
                obj = c5943aFx.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                z2 = zGEmmrt2;
                z3 = z;
                if (!((Boolean) obj).booleanValue()) {
                }
            }
            if (!z) {
            }
            return C56443yFo.KWHzl(false);
        } catch (Exception e) {
            pUU.copydefault("GetCredentialManagerFlowUseCase", "e: " + e.getMessage());
            return C56443yFo.KWHzl(false);
        }
    }
}

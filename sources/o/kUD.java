package o;

import com.okinc.business.trade.features.home.domain.model.BridgeForceUpdateState;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$fallbackToNative$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$invoke$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$invoke$2$1$1;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$invoke$2$1$2;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$invoke$2$1$3;
import com.okinc.business.trade.features.home.domain.usecase.bridgeplatformcheck.RustBridgePlatformCheckUseCase$invoke$2$1$4;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kUD implements kUC {
    public final kYD copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    @yCM
    public kUD(@NotNull kYD kyd) {
        Intrinsics.checkNotNullParameter(kyd, "");
        this.copydefault = kyd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kUD.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kUC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super BridgeForceUpdateState> continuation) throws java.lang.Throwable {
        RustBridgePlatformCheckUseCase$invoke$1 rustBridgePlatformCheckUseCase$invoke$1;
        kUD kud;
        java.lang.Object objAEQbTJ;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof RustBridgePlatformCheckUseCase$invoke$1) {
            rustBridgePlatformCheckUseCase$invoke$1 = (RustBridgePlatformCheckUseCase$invoke$1) continuation;
            int i = rustBridgePlatformCheckUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgePlatformCheckUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgePlatformCheckUseCase$invoke$1 = new RustBridgePlatformCheckUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = rustBridgePlatformCheckUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgePlatformCheckUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            try {
                Result.Application application = Result.Companion;
                ACF acfBridgePlatformCheck = AAL.bridgePlatformCheck();
                C33077mpe c33077mpe = new C33077mpe(new RustBridgePlatformCheckUseCase$invoke$2$1$1(acfBridgePlatformCheck), new RustBridgePlatformCheckUseCase$invoke$2$1$2(acfBridgePlatformCheck), new RustBridgePlatformCheckUseCase$invoke$2$1$3(acfBridgePlatformCheck), new RustBridgePlatformCheckUseCase$invoke$2$1$4(acfBridgePlatformCheck), null, 16, null);
                rustBridgePlatformCheckUseCase$invoke$1.L$0 = this;
                rustBridgePlatformCheckUseCase$invoke$1.label = 1;
                objAEQbTJ = c33077mpe.AEQbTJ(rustBridgePlatformCheckUseCase$invoke$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                kud = this;
            } catch (java.lang.Throwable th) {
                th = th;
                kud = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return (BridgeForceUpdateState) objEZpvd;
            }
            kud = (kUD) rustBridgePlatformCheckUseCase$invoke$1.L$0;
            try {
                C56391yDq.AEQbTJ(objEZpvd);
                objAEQbTJ = ((Result) objEZpvd).m7386unboximpl();
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        objM7377constructorimpl = Result.m7377constructorimpl((C4135AzD) objAEQbTJ);
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            C4135AzD c4135AzD = (C4135AzD) objM7377constructorimpl;
            pUU.KWHzl("RustBridgePlatformCheck", "bridgePlatformCheck success: bridgeForceUpgrade=" + c4135AzD.KWHzl());
            return new BridgeForceUpdateState(c4135AzD.KWHzl());
        }
        pUU.AEQbTJ("RustBridgePlatformCheck", "bridgePlatformCheck failed, fallback to native", thM7380exceptionOrNullimpl);
        rustBridgePlatformCheckUseCase$invoke$1.L$0 = null;
        rustBridgePlatformCheckUseCase$invoke$1.label = 2;
        objEZpvd = kud.EZpvd(rustBridgePlatformCheckUseCase$invoke$1);
        if (objEZpvd == objCopydefault) {
            return objCopydefault;
        }
        return (BridgeForceUpdateState) objEZpvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super BridgeForceUpdateState> continuation) throws java.lang.Throwable {
        RustBridgePlatformCheckUseCase$fallbackToNative$1 rustBridgePlatformCheckUseCase$fallbackToNative$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof RustBridgePlatformCheckUseCase$fallbackToNative$1) {
            rustBridgePlatformCheckUseCase$fallbackToNative$1 = (RustBridgePlatformCheckUseCase$fallbackToNative$1) continuation;
            int i = rustBridgePlatformCheckUseCase$fallbackToNative$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rustBridgePlatformCheckUseCase$fallbackToNative$1.label = i - Integer.MIN_VALUE;
            } else {
                rustBridgePlatformCheckUseCase$fallbackToNative$1 = new RustBridgePlatformCheckUseCase$fallbackToNative$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = rustBridgePlatformCheckUseCase$fallbackToNative$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rustBridgePlatformCheckUseCase$fallbackToNative$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAEQbTJ);
                Result.Application application = Result.Companion;
                kYD kyd = this.copydefault;
                rustBridgePlatformCheckUseCase$fallbackToNative$1.label = 1;
                objAEQbTJ = kyd.AEQbTJ(rustBridgePlatformCheckUseCase$fallbackToNative$1);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((BridgeForceUpdateState) ((AbstractC43419rot) objAEQbTJ).copydefault());
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            BridgeForceUpdateState bridgeForceUpdateState = (BridgeForceUpdateState) objM7377constructorimpl;
            pUU.KWHzl("RustBridgePlatformCheck", "fallbackToNative success: bridgeForceUpgrade=" + (bridgeForceUpdateState != null ? C56443yFo.KWHzl(bridgeForceUpdateState.getBridgeForceUpgrade()) : null));
            return bridgeForceUpdateState == null ? new BridgeForceUpdateState(false, 1, null) : bridgeForceUpdateState;
        }
        pUU.AEQbTJ("RustBridgePlatformCheck", "fallbackToNative also failed", thM7380exceptionOrNullimpl);
        return new BridgeForceUpdateState(false, 1, null);
    }
}

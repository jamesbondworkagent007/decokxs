package o;

import com.okinc.business.defi.wallet.hardware.onekey.OneKeyConnectEvent;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedUseCase$checkWalletAdded$1;
import com.okinc.business.defi.wallet.hardware.onekey.checkdevicestatus.CheckWalletNotAddedUseCase$checkWalletAdded$2;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eIc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15432eIc {
    public final C15436eIg EZpvd;
    public final C15438eIi KWHzl;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C15432eIc(@NotNull C15438eIi c15438eIi, @NotNull C15436eIg c15436eIg) {
        Intrinsics.checkNotNullParameter(c15438eIi, "");
        Intrinsics.checkNotNullParameter(c15436eIg, "");
        this.KWHzl = c15438eIi;
        this.EZpvd = c15436eIg;
    }

    /* JADX INFO: renamed from: o.eIc$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eIc.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super OneKeyConnectEvent> continuation) throws java.lang.Throwable {
        CheckWalletNotAddedUseCase$checkWalletAdded$1 checkWalletNotAddedUseCase$checkWalletAdded$1;
        if (continuation instanceof CheckWalletNotAddedUseCase$checkWalletAdded$1) {
            checkWalletNotAddedUseCase$checkWalletAdded$1 = (CheckWalletNotAddedUseCase$checkWalletAdded$1) continuation;
            int i = checkWalletNotAddedUseCase$checkWalletAdded$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkWalletNotAddedUseCase$checkWalletAdded$1.label = i - Integer.MIN_VALUE;
            } else {
                checkWalletNotAddedUseCase$checkWalletAdded$1 = new CheckWalletNotAddedUseCase$checkWalletAdded$1(this, continuation);
            }
        }
        java.lang.Object objSupervisorScope = checkWalletNotAddedUseCase$checkWalletAdded$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = checkWalletNotAddedUseCase$checkWalletAdded$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objSupervisorScope);
                if (str == null) {
                    pUU.copydefault("CheckWalletNotAddedUseCase", "checkWalletAdded: connectId is null");
                    return OneKeyConnectEvent.ShowNotification.GeneralError;
                }
                CheckWalletNotAddedUseCase$checkWalletAdded$2 checkWalletNotAddedUseCase$checkWalletAdded$2 = new CheckWalletNotAddedUseCase$checkWalletAdded$2(this, str, null);
                checkWalletNotAddedUseCase$checkWalletAdded$1.label = 1;
                objSupervisorScope = SupervisorKt.supervisorScope(checkWalletNotAddedUseCase$checkWalletAdded$2, checkWalletNotAddedUseCase$checkWalletAdded$1);
                if (objSupervisorScope == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objSupervisorScope);
            }
            return (OneKeyConnectEvent) objSupervisorScope;
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            pUU.AEQbTJ("CheckWalletNotAddedUseCase", "checkWalletAdded: error", th);
            return C15406eHd.EZpvd(th);
        }
    }
}

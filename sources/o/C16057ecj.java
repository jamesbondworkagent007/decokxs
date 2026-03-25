package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.defi.wallet.common.scan.DefiWalletScanTCHelper$validateCanConnect$1;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.C12827cuN;
import o.C16058eck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16057ecj {
    public final C12827cuN KWHzl;
    public final C16058eck OLrzqt;
    public final MutableLiveData<ValidateCanConnectResult> copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C16057ecj() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ValidateCanConnectResult> AEQbTJ() {
        return this.copydefault;
    }

    public C16057ecj(@NotNull C12827cuN c12827cuN, @NotNull C16058eck c16058eck) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c16058eck, "");
        this.KWHzl = c12827cuN;
        this.OLrzqt = c16058eck;
        this.copydefault = new MutableLiveData<>();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0008: INVOKE 
  (wrap:o.cuN$Application:0x0006: SGET  A[WRAPPED] (LINE:12) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:12)) : (r3v0 o.cuN))
  (wrap:o.eck:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eck:0x0012: INVOKE 
  (wrap:o.eck$Activity:0x0010: SGET  A[WRAPPED] (LINE:13) o.eck.Companion o.eck$Activity)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.eck.Activity.getInstance$default(o.eck$Activity, android.content.Context, int, java.lang.Object):o.eck A[MD:(o.eck$Activity, android.content.Context, int, java.lang.Object):o.eck (m), WRAPPED] (LINE:13)) : (r4v0 o.eck))
 A[MD:(o.cuN, o.eck):void (m)] (LINE:11) call: o.ecj.<init>(o.cuN, o.eck):void type: THIS */
    public /* synthetic */ C16057ecj(C12827cuN c12827cuN, C16058eck c16058eck, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN, (i & 2) != 0 ? C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null) : c16058eck);
    }

    /* JADX INFO: renamed from: o.ecj$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ecj.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DefiWalletScanTCHelper$validateCanConnect$1 defiWalletScanTCHelper$validateCanConnect$1;
        C16057ecj c16057ecj;
        java.lang.Object objM7377constructorimpl;
        MutableLiveData mutableLiveData;
        if (continuation instanceof DefiWalletScanTCHelper$validateCanConnect$1) {
            defiWalletScanTCHelper$validateCanConnect$1 = (DefiWalletScanTCHelper$validateCanConnect$1) continuation;
            int i = defiWalletScanTCHelper$validateCanConnect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiWalletScanTCHelper$validateCanConnect$1.label = i - Integer.MIN_VALUE;
            } else {
                defiWalletScanTCHelper$validateCanConnect$1 = new DefiWalletScanTCHelper$validateCanConnect$1(this, continuation);
            }
        }
        DefiWalletScanTCHelper$validateCanConnect$1 defiWalletScanTCHelper$validateCanConnect$12 = defiWalletScanTCHelper$validateCanConnect$1;
        java.lang.Object objAwait = defiWalletScanTCHelper$validateCanConnect$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defiWalletScanTCHelper$validateCanConnect$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                try {
                    Result.Application application = Result.Companion;
                    AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = this.KWHzl.copydefault(false);
                    defiWalletScanTCHelper$validateCanConnect$12.L$0 = this;
                    defiWalletScanTCHelper$validateCanConnect$12.L$1 = str;
                    defiWalletScanTCHelper$validateCanConnect$12.label = 1;
                    objAwait = RxAwaitKt.await(abstractC58260yxtCopydefault, defiWalletScanTCHelper$validateCanConnect$12);
                    if (objAwait == objCopydefault) {
                        return objCopydefault;
                    }
                    c16057ecj = this;
                } catch (java.lang.Throwable th) {
                    th = th;
                    c16057ecj = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableLiveData = (MutableLiveData) defiWalletScanTCHelper$validateCanConnect$12.L$0;
                    C56391yDq.AEQbTJ(objAwait);
                    mutableLiveData.setValue(objAwait);
                    return Unit.INSTANCE;
                }
                str = (java.lang.String) defiWalletScanTCHelper$validateCanConnect$12.L$1;
                c16057ecj = (C16057ecj) defiWalletScanTCHelper$validateCanConnect$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objAwait);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
            java.lang.String str2 = str;
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("DefiWalletScanTCHelper", "validateCanConnect(" + str2 + ")", thM7380exceptionOrNullimpl);
                c16057ecj.copydefault.setValue(new ValidateCanConnectResult(ValidateCanConnectResult.ErrorType.NOT_SUPPORTED, null, 2, null));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
            if (abstractC12782ctV == null) {
                return Unit.INSTANCE;
            }
            MutableLiveData<ValidateCanConnectResult> mutableLiveData2 = c16057ecj.copydefault;
            C16058eck c16058eck = c16057ecj.OLrzqt;
            defiWalletScanTCHelper$validateCanConnect$12.L$0 = mutableLiveData2;
            defiWalletScanTCHelper$validateCanConnect$12.L$1 = null;
            defiWalletScanTCHelper$validateCanConnect$12.label = 2;
            java.lang.Object objValidateConnectRequest$default = C16058eck.validateConnectRequest$default(c16058eck, str2, abstractC12782ctV, (java.lang.String) null, defiWalletScanTCHelper$validateCanConnect$12, 4, (java.lang.Object) null);
            if (objValidateConnectRequest$default == objCopydefault) {
                return objCopydefault;
            }
            objAwait = objValidateConnectRequest$default;
            mutableLiveData = mutableLiveData2;
            mutableLiveData.setValue(objAwait);
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }
}

package o;

import com.okinc.business.defi.biz.core.asset.walletmanagement.GetAllRootWalletAtWalletManagementUseCase$invoke$1;
import com.okinc.business.defi.biz.core.asset.walletmanagement.GetAllRootWalletAtWalletManagementUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10546bqW {
    public final C12827cuN EZpvd;
    public final java.lang.String OLrzqt;
    public final C10542bqS copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10546bqW() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C10546bqW(@NotNull C10542bqS c10542bqS, @NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c10542bqS, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.copydefault = c10542bqS;
        this.EZpvd = c12827cuN;
        this.OLrzqt = "WalletManagementUseCase";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:o.bqS:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bqS:0x001b: CONSTRUCTOR 
  (wrap:o.bqQ:0x000e: CONSTRUCTOR 
  (null o.dbu)
  (null com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker)
  (null o.bdR)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.dbu, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.bdR, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:22) call: o.bqQ.<init>(o.dbu, com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker, o.bdR, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
  (wrap:o.bqO:0x0013: CONSTRUCTOR 
  (null o.cSN)
  (1 int)
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
 A[MD:(o.cSN, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:23) call: o.bqO.<init>(o.cSN, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR)
 A[MD:(o.bqQ, o.bqO):void (m), WRAPPED] (LINE:21) call: o.bqS.<init>(o.bqQ, o.bqO):void type: CONSTRUCTOR) : (r9v0 o.bqS))
  (wrap:o.cuN:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.cuN:0x0022: INVOKE 
  (wrap:o.cuN$Application:0x0020: SGET  A[WRAPPED] (LINE:25) o.cuN.Companion o.cuN$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.cuN.Application.getInstance$default(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN A[MD:(o.cuN$Application, android.content.Context, int, java.lang.Object):o.cuN (m), WRAPPED] (LINE:25)) : (r10v0 o.cuN))
 A[MD:(o.bqS, o.cuN):void (m)] (LINE:20) call: o.bqW.<init>(o.bqS, o.cuN):void type: THIS */
    public /* synthetic */ C10546bqW(C10542bqS c10542bqS, C12827cuN c12827cuN, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C10542bqS(new C10540bqQ(null, null, null, 7, null), new C10538bqO(null, 1, 0 == true ? 1 : 0)) : c10542bqS, (i & 2) != 0 ? C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null) : c12827cuN);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super java.util.List<? extends AbstractC12784ctX>> continuation) throws java.lang.Throwable {
        GetAllRootWalletAtWalletManagementUseCase$invoke$1 getAllRootWalletAtWalletManagementUseCase$invoke$1;
        if (continuation instanceof GetAllRootWalletAtWalletManagementUseCase$invoke$1) {
            getAllRootWalletAtWalletManagementUseCase$invoke$1 = (GetAllRootWalletAtWalletManagementUseCase$invoke$1) continuation;
            int i = getAllRootWalletAtWalletManagementUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAllRootWalletAtWalletManagementUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAllRootWalletAtWalletManagementUseCase$invoke$1 = new GetAllRootWalletAtWalletManagementUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getAllRootWalletAtWalletManagementUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAllRootWalletAtWalletManagementUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            GetAllRootWalletAtWalletManagementUseCase$invoke$2 getAllRootWalletAtWalletManagementUseCase$invoke$2 = new GetAllRootWalletAtWalletManagementUseCase$invoke$2(this, z, null);
            getAllRootWalletAtWalletManagementUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, getAllRootWalletAtWalletManagementUseCase$invoke$2, getAllRootWalletAtWalletManagementUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        Intrinsics.checkNotNullExpressionValue(objWithContext, "");
        return objWithContext;
    }
}

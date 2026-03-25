package o;

import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.eip7702.domain.usecase.GetEIP7702WalletStatusUseCase$invoke$1;
import com.okinc.business.defi.wallet.eip7702.domain.usecase.GetEIP7702WalletStatusUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.C15275eCh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15274eCg {
    public final C15275eCh EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15274eCg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C15274eCg(@NotNull C15275eCh c15275eCh) {
        Intrinsics.checkNotNullParameter(c15275eCh, "");
        this.EZpvd = c15275eCh;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.eCh:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCh:0x0007: INVOKE 
  (wrap:o.eCh$Application:0x0004: SGET  A[WRAPPED] (LINE:9) o.eCh.Companion o.eCh$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.eCh.Application.getInstance$default(o.eCh$Application, android.content.Context, int, java.lang.Object):o.eCh A[MD:(o.eCh$Application, android.content.Context, int, java.lang.Object):o.eCh (m), WRAPPED] (LINE:9)) : (r1v0 o.eCh))
 A[MD:(o.eCh):void (m)] (LINE:8) call: o.eCg.<init>(o.eCh):void type: THIS */
    public /* synthetic */ C15274eCg(C15275eCh c15275eCh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15275eCh.Application.getInstance$default(C15275eCh.Companion, null, 1, null) : c15275eCh);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, ? extends EIP7702WalletStatus>>> continuation) {
        GetEIP7702WalletStatusUseCase$invoke$1 getEIP7702WalletStatusUseCase$invoke$1;
        if (continuation instanceof GetEIP7702WalletStatusUseCase$invoke$1) {
            getEIP7702WalletStatusUseCase$invoke$1 = (GetEIP7702WalletStatusUseCase$invoke$1) continuation;
            int i = getEIP7702WalletStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getEIP7702WalletStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getEIP7702WalletStatusUseCase$invoke$1 = new GetEIP7702WalletStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getEIP7702WalletStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getEIP7702WalletStatusUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            GetEIP7702WalletStatusUseCase$invoke$2 getEIP7702WalletStatusUseCase$invoke$2 = new GetEIP7702WalletStatusUseCase$invoke$2(this, list, z, null);
            getEIP7702WalletStatusUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(io2, getEIP7702WalletStatusUseCase$invoke$2, getEIP7702WalletStatusUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}

package o;

import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.wallet.eip7702.domain.usecase.GetEIP7702ChainStatusUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C15275eCh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15272eCe {
    public final C15275eCh copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C15272eCe() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C15272eCe(@NotNull C15275eCh c15275eCh) {
        Intrinsics.checkNotNullParameter(c15275eCh, "");
        this.copydefault = c15275eCh;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.eCh:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCh:0x0007: INVOKE 
  (wrap:o.eCh$Application:0x0004: SGET  A[WRAPPED] (LINE:7) o.eCh.Companion o.eCh$Application)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.eCh.Application.getInstance$default(o.eCh$Application, android.content.Context, int, java.lang.Object):o.eCh A[MD:(o.eCh$Application, android.content.Context, int, java.lang.Object):o.eCh (m), WRAPPED] (LINE:7)) : (r1v0 o.eCh))
 A[MD:(o.eCh):void (m)] (LINE:6) call: o.eCe.<init>(o.eCh):void type: THIS */
    public /* synthetic */ C15272eCe(C15275eCh c15275eCh, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C15275eCh.Application.getInstance$default(C15275eCh.Companion, null, 1, null) : c15275eCh);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super Result<EIP7702ChainStatusResp>> continuation) {
        GetEIP7702ChainStatusUseCase$invoke$1 getEIP7702ChainStatusUseCase$invoke$1;
        if (continuation instanceof GetEIP7702ChainStatusUseCase$invoke$1) {
            getEIP7702ChainStatusUseCase$invoke$1 = (GetEIP7702ChainStatusUseCase$invoke$1) continuation;
            int i = getEIP7702ChainStatusUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getEIP7702ChainStatusUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getEIP7702ChainStatusUseCase$invoke$1 = new GetEIP7702ChainStatusUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getEIP7702ChainStatusUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getEIP7702ChainStatusUseCase$invoke$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C15275eCh c15275eCh = this.copydefault;
        getEIP7702ChainStatusUseCase$invoke$1.label = 1;
        java.lang.Object objCopydefault2 = c15275eCh.copydefault(str, getEIP7702ChainStatusUseCase$invoke$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}

package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.wallet.mine.backup.viewModel.WalletPrivateKeysViewModel$getDataList$2;
import com.okinc.web3.security.model.PrivateKeyInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fpQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18807fpQ extends ViewModel {
    public final C8301bAD copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18807fpQ() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (wrap:o.bAD:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.bAD:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:19) call: o.bAD.<init>():void type: CONSTRUCTOR) : (r1v0 o.bAD))
 A[MD:(o.bAD):void (m)] (LINE:18) call: o.fpQ.<init>(o.bAD):void type: THIS */
    public /* synthetic */ C18807fpQ(C8301bAD c8301bAD, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8301bAD() : c8301bAD);
    }

    public C18807fpQ(@NotNull C8301bAD c8301bAD) {
        Intrinsics.checkNotNullParameter(c8301bAD, "");
        this.copydefault = c8301bAD;
    }

    public final java.lang.Object EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.lang.String str, @NotNull Continuation<? super java.util.ArrayList<PrivateKeyInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WalletPrivateKeysViewModel$getDataList$2(abstractC12782ctV, str, this, null), continuation);
    }
}

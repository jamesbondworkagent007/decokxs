package o;

import androidx.lifecycle.ViewModel;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.metricsmonitor.EncryptionMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC18445fiY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18304ffq extends ViewModel {
    public final InterfaceC18445fiY EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18304ffq() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.fiY:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiY:0x0007: INVOKE 
  (wrap:o.fiY$StateListAnimator:0x0004: SGET  A[WRAPPED] (LINE:9) o.fiY.Companion o.fiY$StateListAnimator)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.fiY.StateListAnimator.getInstance$default(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY A[MD:(o.fiY$StateListAnimator, android.content.Context, int, java.lang.Object):o.fiY (m), WRAPPED] (LINE:9)) : (r1v0 o.fiY))
 A[MD:(o.fiY):void (m)] (LINE:8) call: o.ffq.<init>(o.fiY):void type: THIS */
    public /* synthetic */ C18304ffq(InterfaceC18445fiY interfaceC18445fiY, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? InterfaceC18445fiY.StateListAnimator.getInstance$default(InterfaceC18445fiY.Companion, null, 1, null) : interfaceC18445fiY);
    }

    public C18304ffq(@NotNull InterfaceC18445fiY interfaceC18445fiY) {
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        this.EZpvd = interfaceC18445fiY;
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.KWHzl(str);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, WalletType walletType, java.lang.String str2, boolean z, boolean z2) {
        EncryptionMethod encryptionMethod;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC18445fiY interfaceC18445fiY = this.EZpvd;
        if (z) {
            encryptionMethod = EncryptionMethod.PASSWORD;
        } else {
            encryptionMethod = EncryptionMethod.BIOMETRIC;
        }
        interfaceC18445fiY.copydefault(str, walletType, str2, encryptionMethod, z2);
    }

    public final void copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.EZpvd(str, j);
    }
}

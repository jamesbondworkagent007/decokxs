package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.business.defi.biz.impl.OKWWalletHomeQrCodeHandler$handle$1$1;
import com.okinc.core.util.ScannerActivity;
import com.okinc.core.util.qrcode.decode.ScanType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cXt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11694cXt extends AbstractC43215rlA implements InterfaceC33530myG {
    public final C15733eTg copydefault = new C15733eTg();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return true;
    }

    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.WALLET_HOME;
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3)) {
            ScannerActivity scannerActivity = context instanceof ScannerActivity ? (ScannerActivity) context : null;
            if (scannerActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(scannerActivity), null, null, new OKWWalletHomeQrCodeHandler$handle$1$1(this, scannerActivity, str, null), 3, null);
            }
        }
    }
}

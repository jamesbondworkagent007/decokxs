package o;

import com.okinc.core.util.qrcode.decode.ScanType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oBU extends AbstractC43215rlA implements InterfaceC33530myG {
    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.IM;
    }

    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return oBK.KWHzl.KWHzl(str);
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        pUU.EZpvd("IMQrCodeExtension", "handle \nqrCode: " + str);
        if (((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).AEQbTJ() && ((InterfaceC31257lqc) C43251rlk.copydefault(InterfaceC31257lqc.class)).KWHzl()) {
            return;
        }
        oBK.KWHzl.EZpvd(context, str);
    }
}

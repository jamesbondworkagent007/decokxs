package o;

import com.okinc.core.util.qrcode.decode.ScanType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cXv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11696cXv extends AbstractC43215rlA implements InterfaceC33530myG {
    public final Regex EZpvd = new Regex("[a-zA-Z\\d\\s]+");

    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.WALLET_IMPORT;
    }

    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.matches(str);
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).copydefault(3);
    }
}

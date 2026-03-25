package o;

import com.okinc.core.util.qrcode.decode.ScanType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wqC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53683wqC extends AbstractC43215rlA implements InterfaceC33530myG {
    @Override // o.InterfaceC33530myG
    public ScanType KWHzl() {
        return ScanType.TRADING_BOT;
    }

    @Override // o.InterfaceC33530myG
    public boolean copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C56029xvB.KWHzl.AEQbTJ(str);
    }

    @Override // o.InterfaceC33530myG
    public void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        C56029xvB.KWHzl.AEQbTJ(context, str);
    }
}

package o;

import com.okinc.okuser.data.User;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGM {
    public final oGI AEQbTJ;
    public final InterfaceC47278tmy KWHzl;

    @yCM
    public oGM(@yCL(AEQbTJ = "IMUserManager") @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull oGI ogi) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(ogi, "");
        this.KWHzl = interfaceC47278tmy;
        this.AEQbTJ = ogi;
    }

    public final java.lang.String AEQbTJ() {
        java.lang.String uid;
        if (!this.AEQbTJ.KWHzl()) {
            return sFM.copydefault.copydefault();
        }
        User userOLrzqt = this.KWHzl.OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "" : uid;
    }
}

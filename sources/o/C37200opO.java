package o;

import com.okinc.im.imui.privacy.SecurityType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C37200opO {
    public java.lang.String AEQbTJ;
    public SecurityType OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecurityType KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    public C37200opO(@NotNull SecurityType securityType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(securityType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = securityType;
        this.AEQbTJ = str;
    }
}

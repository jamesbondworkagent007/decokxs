package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jwD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27488jwD {
    public static final C27488jwD copydefault = new C27488jwD();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return z ? str : str2;
    }

    private C27488jwD() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9851bdQ interfaceC9851bdQ = (InterfaceC9851bdQ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9851bdQ.class));
        if (interfaceC9851bdQ != null) {
            z = interfaceC9851bdQ.fetchVPNInfo();
        }
        return EZpvd(str, z, "*****");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9851bdQ interfaceC9851bdQ = (InterfaceC9851bdQ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9851bdQ.class));
        if (interfaceC9851bdQ != null) {
            z = interfaceC9851bdQ.fetchVPNInfo();
        }
        return EZpvd(str, z, "***");
    }

    public static /* synthetic */ java.lang.String hideOrShowAsset$default(C27488jwD c27488jwD, java.lang.String str, boolean z, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "*****";
        }
        return c27488jwD.EZpvd(str, z, str2);
    }
}

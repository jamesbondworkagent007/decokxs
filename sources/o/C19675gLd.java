package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gLd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19675gLd {
    public static InterfaceC19674gLc AEQbTJ;
    public static InterfaceC19677gLf EZpvd;
    public static final C19675gLd OLrzqt = new C19675gLd();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc) {
        Intrinsics.checkNotNullParameter(interfaceC19677gLf, "");
        EZpvd = interfaceC19677gLf;
        AEQbTJ = interfaceC19674gLc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return EZpvd != null;
    }

    private C19675gLd() {
    }

    public static /* synthetic */ void registerHandler$default(C19675gLd c19675gLd, InterfaceC19677gLf interfaceC19677gLf, InterfaceC19674gLc interfaceC19674gLc, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            interfaceC19674gLc = null;
        }
        c19675gLd.OLrzqt(interfaceC19677gLf, interfaceC19674gLc);
    }

    public final void EZpvd(@NotNull android.content.Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function02, "");
        InterfaceC19677gLf interfaceC19677gLf = EZpvd;
        if (interfaceC19677gLf != null) {
            interfaceC19677gLf.OLrzqt(context, function0, function02);
        } else {
            function0.invoke();
        }
    }

    public final boolean KWHzl() {
        InterfaceC19674gLc interfaceC19674gLc = AEQbTJ;
        if (interfaceC19674gLc != null) {
            return interfaceC19674gLc.KWHzl();
        }
        return false;
    }
}

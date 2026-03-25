package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tgs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46954tgs implements InterfaceC46951tgp {
    public static InterfaceC46947tgl copydefault;
    public static final C46954tgs OLrzqt = new C46954tgs();
    public static final ConcurrentHashMap<java.lang.String, InterfaceC46949tgn> AEQbTJ = new ConcurrentHashMap<>();
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC46947tgl AEQbTJ() {
        return copydefault;
    }

    private C46954tgs() {
    }

    @Override // o.InterfaceC46951tgp
    public void EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC46949tgn interfaceC46949tgn) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC46949tgn, "");
        AEQbTJ.put(str, interfaceC46949tgn);
    }

    @Override // o.InterfaceC46951tgp
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AEQbTJ.remove(str);
    }

    public final InterfaceC46949tgn copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ.get(str);
    }
}

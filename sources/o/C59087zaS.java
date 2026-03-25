package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59087zaS {
    public final yWQ AEQbTJ;
    public final yWW AYXKKw;
    public final yWX AhwBna;
    public final C59149zbb EZpvd;
    public final C59083zaO KWHzl;
    public final InterfaceC59145zbX OLrzqt;
    public final InterfaceC56665yNu copydefault;
    public final yWS djBIcL;
    public final C59165zbr valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59145zbX AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59165zbr AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59083zaO EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC56665yNu KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59149zbb OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWS copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWX djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWW gEmmrt() {
        return this.AYXKKw;
    }

    public C59087zaS(@NotNull C59083zaO c59083zaO, @NotNull yWS yws, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yWW yww, @NotNull yWX ywx, @NotNull yWQ ywq, InterfaceC59145zbX interfaceC59145zbX, C59165zbr c59165zbr, @NotNull java.util.List<ProtoBuf.TypeParameter> list) {
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(c59083zaO, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = c59083zaO;
        this.djBIcL = yws;
        this.copydefault = interfaceC56665yNu;
        this.AYXKKw = yww;
        this.AhwBna = ywx;
        this.AEQbTJ = ywq;
        this.OLrzqt = interfaceC59145zbX;
        this.valueOf = new C59165zbr(this, c59165zbr, list, "Deserializer for \"" + interfaceC56665yNu.bR_() + '\"', (interfaceC59145zbX == null || (strGEmmrt = interfaceC59145zbX.gEmmrt()) == null) ? "[container not found]" : strGEmmrt);
        this.EZpvd = new C59149zbb(this);
    }

    public final InterfaceC59187zcM valueOf() {
        return this.KWHzl.ejfBZ();
    }

    public static /* synthetic */ C59087zaS childContext$default(C59087zaS c59087zaS, InterfaceC56665yNu interfaceC56665yNu, java.util.List list, yWS yws, yWW yww, yWX ywx, yWQ ywq, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            yws = c59087zaS.djBIcL;
        }
        yWS yws2 = yws;
        if ((i & 8) != 0) {
            yww = c59087zaS.AYXKKw;
        }
        yWW yww2 = yww;
        if ((i & 16) != 0) {
            ywx = c59087zaS.AhwBna;
        }
        yWX ywx2 = ywx;
        if ((i & 32) != 0) {
            ywq = c59087zaS.AEQbTJ;
        }
        return c59087zaS.OLrzqt(interfaceC56665yNu, list, yws2, yww2, ywx2, ywq);
    }

    public final C59087zaS OLrzqt(@NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull java.util.List<ProtoBuf.TypeParameter> list, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWX ywx, @NotNull yWQ ywq) {
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        return new C59087zaS(this.KWHzl, yws, interfaceC56665yNu, yww, yWV.KWHzl(ywq) ? ywx : this.AhwBna, ywq, this.OLrzqt, this.valueOf, list);
    }
}

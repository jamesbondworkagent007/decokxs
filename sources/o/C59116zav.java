package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zav, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59116zav extends AbstractC59117zaw implements InterfaceC59119zay {
    public final C56935yXu OLrzqt;
    public final InterfaceC56658yNn copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59119zay
    public C56935yXu EZpvd() {
        return this.OLrzqt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59116zav(@NotNull InterfaceC56658yNn interfaceC56658yNn, @NotNull AbstractC59233zdF abstractC59233zdF, C56935yXu c56935yXu, InterfaceC59070zaB interfaceC59070zaB) {
        super(abstractC59233zdF, interfaceC59070zaB);
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.copydefault = interfaceC56658yNn;
        this.OLrzqt = c56935yXu;
    }

    public java.lang.String toString() {
        return OLrzqt() + ": Ctx { " + this.copydefault + " }";
    }
}

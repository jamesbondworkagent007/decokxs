package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59114zat extends AbstractC59117zaw implements InterfaceC59119zay {
    public final C56935yXu EZpvd;
    public final InterfaceC56657yNm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59119zay
    public C56935yXu EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC56657yNm KWHzl() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59114zat(@NotNull InterfaceC56657yNm interfaceC56657yNm, @NotNull AbstractC59233zdF abstractC59233zdF, C56935yXu c56935yXu, InterfaceC59070zaB interfaceC59070zaB) {
        super(abstractC59233zdF, interfaceC59070zaB);
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.copydefault = interfaceC56657yNm;
        this.EZpvd = c56935yXu;
    }

    public java.lang.String toString() {
        return "Cxt { " + KWHzl() + " }";
    }
}

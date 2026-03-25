package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yPE extends AbstractC56709yPk implements yNW {
    public final java.lang.String EZpvd;
    public final C56933yXs copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNW
    public final C56933yXs KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56711yPm
    public java.lang.String toString() {
        return this.EZpvd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yPE(@NotNull yNP ynp, @NotNull C56933yXs c56933yXs) {
        super(ynp, yOL.KWHzl.OLrzqt(), c56933yXs.gEmmrt(), InterfaceC56686yOo.copydefault);
        Intrinsics.checkNotNullParameter(ynp, "");
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        this.copydefault = c56933yXs;
        this.EZpvd = "package " + c56933yXs + " of " + ynp;
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
        return interfaceC56667yNw.EZpvd(this, d);
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yNu; */
    @Override // o.AbstractC56709yPk, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public yNP AuCTel() {
        InterfaceC56665yNu interfaceC56665yNuAuCTel = super.AuCTel();
        Intrinsics.copydefault(interfaceC56665yNuAuCTel, "");
        return (yNP) interfaceC56665yNuAuCTel;
    }

    @Override // o.AbstractC56709yPk, o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        return interfaceC56686yOo;
    }
}

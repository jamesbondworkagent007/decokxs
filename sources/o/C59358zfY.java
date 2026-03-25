package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59353zfT;
import o.yMC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59358zfY implements InterfaceC59353zfT {
    public static final C59358zfY copydefault = new C59358zfY();
    public static final java.lang.String EZpvd = "second parameter must be of type KProperty<*> or its supertype";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59353zfT
    public java.lang.String copydefault() {
        return EZpvd;
    }

    private C59358zfY() {
    }

    @Override // o.InterfaceC59353zfT
    public java.lang.String KWHzl(@NotNull yNG yng) {
        return InterfaceC59353zfT.Activity.EZpvd(this, yng);
    }

    @Override // o.InterfaceC59353zfT
    public boolean EZpvd(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        InterfaceC56695yOx interfaceC56695yOx = yng.fetchVPNInfo().get(1);
        yMC.TaskDescription taskDescription = yMC.OLrzqt;
        Intrinsics.copydefault(interfaceC56695yOx);
        AbstractC59233zdF abstractC59233zdFEZpvd = taskDescription.EZpvd(yZE.AhwBna(interfaceC56695yOx));
        if (abstractC59233zdFEZpvd == null) {
            return false;
        }
        AbstractC59233zdF abstractC59233zdFUzCIH = interfaceC56695yOx.uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return C59336zfC.copydefault(abstractC59233zdFEZpvd, C59336zfC.DbNXlk(abstractC59233zdFUzCIH));
    }
}

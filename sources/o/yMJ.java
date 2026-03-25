package o;

import kotlin.jvm.internal.Intrinsics;
import o.yMM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yMJ extends AbstractC59095zaa {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yMJ(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull yMI ymi) {
        super(interfaceC59187zcM, ymi);
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(ymi, "");
    }

    @Override // o.AbstractC59095zaa
    public java.util.List<yNG> copydefault() {
        InterfaceC56658yNn interfaceC56658yNnDjBIcL = djBIcL();
        Intrinsics.copydefault(interfaceC56658yNnDjBIcL, "");
        yMM ymmValues = ((yMI) interfaceC56658yNnDjBIcL).values();
        return Intrinsics.EZpvd(ymmValues, yMM.TaskDescription.copydefault) ? C56402yEa.EZpvd(yMF.EZpvd.AEQbTJ((yMI) djBIcL(), false)) : Intrinsics.EZpvd(ymmValues, yMM.Activity.copydefault) ? C56402yEa.EZpvd(yMF.EZpvd.AEQbTJ((yMI) djBIcL(), true)) : yDY.AhwBna();
    }
}

package o;

import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46666tbV {
    public static final int AEQbTJ(@NotNull java.lang.String str, boolean z) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = z ? "SWAP" : "FUTURES";
        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(str2)) != null) {
            BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str);
            java.lang.Integer numValueOf = bizInstrumentValueOf != null ? java.lang.Integer.valueOf(C33129mqd.AhwBna(abstractC54531xLwOLrzqt.fIwbmz(bizInstrumentValueOf.getInstFamily()))) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 2;
    }
}

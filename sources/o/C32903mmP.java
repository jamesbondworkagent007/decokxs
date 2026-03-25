package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32904mmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32903mmP implements InterfaceC32904mmQ {
    @Override // o.InterfaceC32904mmQ
    public void AEQbTJ(@NotNull InterfaceC32904mmQ.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C32900mmM c32900mmMKWHzl = stateListAnimator.KWHzl();
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = c32900mmMKWHzl.KWHzl();
        EventParamsList eventParamsListAEQbTJ = c32900mmMKWHzl.AEQbTJ();
        InterfaceC32874mln interfaceC32874mlnOLrzqt = stateListAnimator.OLrzqt();
        if (mapKWHzl != null) {
            interfaceC32874mlnOLrzqt.copydefault(c32900mmMKWHzl.OLrzqt(), mapKWHzl);
        } else if (eventParamsListAEQbTJ != null) {
            interfaceC32874mlnOLrzqt.copydefault(c32900mmMKWHzl.OLrzqt(), eventParamsListAEQbTJ);
        } else {
            interfaceC32874mlnOLrzqt.onEvent(c32900mmMKWHzl.OLrzqt());
        }
    }
}

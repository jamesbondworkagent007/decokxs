package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC32904mmQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32937mmx implements InterfaceC32904mmQ, InterfaceC32889mmB {
    public InterfaceC32938mmy AEQbTJ;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mmA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32937mmx.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32889mmB
    public void AEQbTJ(@NotNull InterfaceC32938mmy interfaceC32938mmy) {
        Intrinsics.checkNotNullParameter(interfaceC32938mmy, "");
        this.AEQbTJ = interfaceC32938mmy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC32889mmB
    public void KWHzl() {
        this.AEQbTJ = null;
    }

    public final TrackChannel[] OLrzqt() {
        return (TrackChannel[]) this.KWHzl.getValue();
    }

    public static final TrackChannel[] EZpvd() {
        return new TrackChannel[]{TrackChannel.OKStatistics};
    }

    @Override // o.InterfaceC32904mmQ
    public void AEQbTJ(@NotNull InterfaceC32904mmQ.StateListAnimator stateListAnimator) {
        InterfaceC32938mmy interfaceC32938mmy;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        TrackChannel trackChannelFJNWhG = stateListAnimator.OLrzqt().fJNWhG();
        java.lang.String strOLrzqt = stateListAnimator.KWHzl().OLrzqt();
        java.util.Map<java.lang.String, java.lang.String> mapKWHzl = stateListAnimator.KWHzl().KWHzl();
        if (mapKWHzl == null) {
            EventParamsList eventParamsListAEQbTJ = stateListAnimator.KWHzl().AEQbTJ();
            mapKWHzl = eventParamsListAEQbTJ != null ? C32867mlg.KWHzl.AEQbTJ(eventParamsListAEQbTJ) : null;
            if (mapKWHzl == null) {
                mapKWHzl = C56424yEw.KWHzl();
            }
        }
        if (yDV.valueOf(OLrzqt(), trackChannelFJNWhG) && (interfaceC32938mmy = this.AEQbTJ) != null) {
            interfaceC32938mmy.copydefault(trackChannelFJNWhG.name(), "", strOLrzqt, mapKWHzl);
        }
        stateListAnimator.AEQbTJ(stateListAnimator.KWHzl());
    }
}

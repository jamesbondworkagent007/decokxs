package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.vzn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52116vzn {
    public static final C52116vzn EZpvd = new C52116vzn();
    public static final java.lang.String OLrzqt = "PlaceOrder_Full_BotPage_View";
    public static final java.lang.String copydefault = "PlaceOrder_Full_BotHistoryPage_View";

    private C52116vzn() {
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        java.lang.String str = OLrzqt;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vzm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52116vzn.copydefault((EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AEQbTJ() {
        java.lang.String str = copydefault;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ(str, (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.vzp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52116vzn.EZpvd((EventParamsList) obj);
            }
        });
    }
}

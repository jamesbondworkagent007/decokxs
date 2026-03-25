package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bdM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC9847bdM extends InterfaceC43217rlC {
    void AEQbTJ(@NotNull java.lang.String str, @NotNull TrackChannel[] trackChannelArr, Function1<? super EventParamsList, Unit> function1, boolean z);

    /* JADX INFO: renamed from: o.bdM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bdM */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void event$default(InterfaceC9847bdM interfaceC9847bdM, java.lang.String str, TrackChannel[] trackChannelArr, Function1 function1, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: event");
            }
            if ((i & 4) != 0) {
                function1 = null;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            interfaceC9847bdM.AEQbTJ(str, trackChannelArr, function1, z);
        }
    }
}

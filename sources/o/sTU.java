package o;

import com.okinc.oklive.app.data.LiveStreamStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class sTU extends C44442sPz<LiveStreamStatus> {
    public sTU() {
        super("status", LiveStreamStatus.values(), new Function1() { // from class: o.sTW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sTU.AEQbTJ((LiveStreamStatus) obj));
            }
        }, new Function1() { // from class: o.sTY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sTU.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int AEQbTJ(LiveStreamStatus liveStreamStatus) {
        Intrinsics.checkNotNullParameter(liveStreamStatus, "");
        return liveStreamStatus.getCode();
    }

    public static final LiveStreamStatus KWHzl(int i) {
        return LiveStreamStatus.Companion.OLrzqt(i);
    }
}

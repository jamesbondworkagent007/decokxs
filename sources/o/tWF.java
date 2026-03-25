package o;

import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C54401xHa;

/* JADX INFO: loaded from: classes16.dex */
public final class tWF {
    public static final Activity Companion = new Activity(null);

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tWF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C57567ykp copydefault() {
            return C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, C43292rmY.OLrzqt.zuBGHE() + "/ws/v5/iprivate", true, true, false, false, OKWsDoh.V5, 16, null);
        }
    }
}

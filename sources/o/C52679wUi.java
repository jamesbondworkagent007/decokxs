package o;

import com.okinc.websocket.connection.OKWsDoh;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C54401xHa;

/* JADX INFO: renamed from: o.wUi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52679wUi {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.wUi$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wUi.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C57567ykp getTradingBotV5Connection$default(ActionBar actionBar, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return actionBar.EZpvd(z, z2);
        }

        public final C57567ykp EZpvd(boolean z, boolean z2) {
            return C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, "", z, false, z2, false, OKWsDoh.V5, 20, null);
        }
    }
}

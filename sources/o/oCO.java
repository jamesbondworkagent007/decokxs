package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final sMW EZpvd;

    @yCM
    public oCO(@NotNull sMW smw) {
        Intrinsics.checkNotNullParameter(smw, "");
        this.EZpvd = smw;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl() {
        pUU.KWHzl("ClearCurrentConversationCacheUseCase", "Clear current conversation cache for notification");
        this.EZpvd.AEQbTJ();
    }
}

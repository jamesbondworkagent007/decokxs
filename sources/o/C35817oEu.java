package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35817oEu {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final C36441oay copydefault;

    @yCM
    public C35817oEu(@NotNull C36441oay c36441oay) {
        Intrinsics.checkNotNullParameter(c36441oay, "");
        this.copydefault = c36441oay;
    }

    /* JADX INFO: renamed from: o.oEu$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEu.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void AEQbTJ(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        pUU.KWHzl("PreSendMessageUseCase", "[" + oKMessage.getTargetId() + "] dispatching pre-send event");
        this.copydefault.KWHzl(oKMessage);
    }
}

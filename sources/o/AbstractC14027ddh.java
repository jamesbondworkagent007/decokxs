package o;

import com.okinc.wallet.hardware.api.ledger.model.LedgerError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ddh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14027ddh {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ddh.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC14027ddh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14027ddh() {
    }

    /* JADX INFO: renamed from: o.ddh$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ddh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.ddh$Activity */
    public static final class Activity extends AbstractC14027ddh {
        public final InterfaceC57036yao copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC57036yao AEQbTJ() {
            return this.copydefault;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InterfaceC57036yao interfaceC57036yao) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC57036yao, "");
            this.copydefault = interfaceC57036yao;
        }
    }

    /* JADX INFO: renamed from: o.ddh$ActionBar */
    public static final class ActionBar extends AbstractC14027ddh {
        public final int KWHzl;
        public final LedgerError copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LedgerError OLrzqt() {
            return this.copydefault;
        }

        public ActionBar(int i, LedgerError ledgerError) {
            super(null);
            this.KWHzl = i;
            this.copydefault = ledgerError;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59353zfT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59427zgo implements InterfaceC59353zfT {
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.zgo.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59427zgo(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59353zfT
    public java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.zgo$ActionBar */
    public static final class ActionBar extends AbstractC59427zgo {
        public static final ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
            super("must have no value parameters", null);
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return yng.fetchVPNInfo().isEmpty();
        }
    }

    public AbstractC59427zgo(java.lang.String str) {
        this.KWHzl = str;
    }

    @Override // o.InterfaceC59353zfT
    public java.lang.String KWHzl(@NotNull yNG yng) {
        return InterfaceC59353zfT.Activity.EZpvd(this, yng);
    }

    /* JADX INFO: renamed from: o.zgo$Application */
    public static final class Application extends AbstractC59427zgo {
        public static final Application EZpvd = new Application();

        private Application() {
            super("must have a single value parameter", null);
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return yng.fetchVPNInfo().size() == 1;
        }
    }

    /* JADX INFO: renamed from: o.zgo$TaskDescription */
    public static final class TaskDescription extends AbstractC59427zgo {
        public final int AEQbTJ;

        public TaskDescription(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? com.ibm.icu.text.DateFormat.SECOND : "");
            super(sb.toString(), null);
            this.AEQbTJ = i;
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return yng.fetchVPNInfo().size() >= this.AEQbTJ;
        }
    }

    /* JADX INFO: renamed from: o.zgo$Activity */
    public static final class Activity extends AbstractC59427zgo {
        public final int copydefault;

        public Activity(int i) {
            super("must have exactly " + i + " value parameters", null);
            this.copydefault = i;
        }

        @Override // o.InterfaceC59353zfT
        public boolean EZpvd(@NotNull yNG yng) {
            Intrinsics.checkNotNullParameter(yng, "");
            return yng.fetchVPNInfo().size() == this.copydefault;
        }
    }
}

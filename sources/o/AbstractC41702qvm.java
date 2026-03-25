package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC41702qvm implements InterfaceC40518qYv {
    public final java.lang.String KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 java.lang.String) A[MD:(int, java.lang.String):void (m)] call: o.qvm.<init>(int, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC41702qvm(int i, java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public AbstractC41702qvm(@androidx.annotation.StringRes int i, java.lang.String str) {
        this.copydefault = i;
        this.KWHzl = str;
    }

    /* JADX INFO: renamed from: o.qvm$TaskDescription */
    public static final class TaskDescription extends AbstractC41702qvm {
        public final Function0<androidx.fragment.app.Fragment> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qvm$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = taskDescription.OLrzqt;
            }
            return taskDescription.EZpvd(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new TaskDescription(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SpotSubPage(onCreateFragment=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(@NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            super(qZH.PendingIntent.hUfVAv, "SPOT", null);
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = function0;
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return this.OLrzqt.invoke();
        }
    }

    /* JADX INFO: renamed from: o.qvm$Application */
    public static final class Application extends AbstractC41702qvm {
        public final Function0<androidx.fragment.app.Fragment> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qvm$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                function0 = application.AEQbTJ;
            }
            return application.KWHzl(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new Application(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FuturesSubPage(onCreateFragment=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            super(qZH.PendingIntent.DQnQnb, "FUTURES", null);
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ = function0;
        }

        @Override // o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return this.AEQbTJ.invoke();
        }
    }

    @Override // o.InterfaceC40518qYv
    public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return Intrinsics.EZpvd(this, interfaceC40518qYv);
    }

    @Override // o.InterfaceC40518qYv
    public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
        Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
        return Intrinsics.EZpvd(this, interfaceC40518qYv);
    }
}

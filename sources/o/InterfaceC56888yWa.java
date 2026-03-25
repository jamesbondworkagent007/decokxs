package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yWa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC56888yWa extends InterfaceC59150zbc {
    Application EZpvd(@NotNull yTT ytt, @NotNull C56921yXg c56921yXg);

    Application copydefault(@NotNull C56929yXo c56929yXo, @NotNull C56921yXg c56921yXg);

    /* JADX INFO: renamed from: o.yWa$Application */
    public static abstract class Application {

        /* JADX INFO: renamed from: o.yWa$Application$StateListAnimator */
        public static final class StateListAnimator extends Application {
            public final byte[] EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final byte[] copydefault() {
                return this.EZpvd;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yWa.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final InterfaceC56893yWf AEQbTJ() {
            TaskDescription taskDescription = this instanceof TaskDescription ? (TaskDescription) this : null;
            if (taskDescription != null) {
                return taskDescription.copydefault();
            }
            return null;
        }

        /* JADX INFO: renamed from: o.yWa$Application$TaskDescription */
        public static final class TaskDescription extends Application {
            public final InterfaceC56893yWf EZpvd;
            public final byte[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC56893yWf copydefault() {
                return this.EZpvd;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull InterfaceC56893yWf interfaceC56893yWf, byte[] bArr) {
                super(null);
                Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
                this.EZpvd = interfaceC56893yWf;
                this.OLrzqt = bArr;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.yWf)
  (wrap:byte[]:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null byte[]) : (r2v0 byte[]))
 A[MD:(o.yWf, byte[]):void (m)] (LINE:32) call: o.yWa.Application.TaskDescription.<init>(o.yWf, byte[]):void type: THIS */
            public /* synthetic */ TaskDescription(InterfaceC56893yWf interfaceC56893yWf, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(interfaceC56893yWf, (i & 2) != 0 ? null : bArr);
            }
        }
    }
}

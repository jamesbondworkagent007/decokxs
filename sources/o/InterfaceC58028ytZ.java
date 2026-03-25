package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC58028ytZ extends InterfaceC60096zvd<StateListAnimator> {

    /* JADX INFO: renamed from: o.ytZ$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.ytZ$StateListAnimator$Activity */
        public static final class Activity extends StateListAnimator {
            public static final Activity EZpvd = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.ytZ$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static abstract class AbstractC1012StateListAnimator extends StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytZ.StateListAnimator.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ AbstractC1012StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC1012StateListAnimator() {
                super(null);
            }

            /* JADX INFO: renamed from: o.ytZ$StateListAnimator$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
            public static final class C1013StateListAnimator extends AbstractC1012StateListAnimator {
                public final C58088yug copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public C1013StateListAnimator() {
                    this(null, 1, 0 == true ? 1 : 0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public static /* synthetic */ C1013StateListAnimator copy$default(C1013StateListAnimator c1013StateListAnimator, C58088yug c58088yug, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        c58088yug = c1013StateListAnimator.copydefault;
                    }
                    return c1013StateListAnimator.KWHzl(c58088yug);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C58088yug AEQbTJ() {
                    return this.copydefault;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final C1013StateListAnimator KWHzl(@NotNull C58088yug c58088yug) {
                    Intrinsics.checkNotNullParameter(c58088yug, "");
                    return new C1013StateListAnimator(c58088yug);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public boolean equals(java.lang.Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1013StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((C1013StateListAnimator) obj).copydefault);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public int hashCode() {
                    return this.copydefault.hashCode();
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public java.lang.String toString() {
                    return "WithReason(shutdownReason=" + this.copydefault + ')';
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:o.yug:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yug:0x0004: SGET  A[WRAPPED] (LINE:36) o.yug.copydefault o.yug) : (r1v0 o.yug))
 A[MD:(o.yug):void (m)] (LINE:35) call: o.ytZ.StateListAnimator.StateListAnimator.StateListAnimator.<init>(o.yug):void type: THIS */
                public /* synthetic */ C1013StateListAnimator(C58088yug c58088yug, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? C58088yug.copydefault : c58088yug);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1013StateListAnimator(@NotNull C58088yug c58088yug) {
                    super(null);
                    Intrinsics.checkNotNullParameter(c58088yug, "");
                    this.copydefault = c58088yug;
                }
            }

            /* JADX INFO: renamed from: o.ytZ$StateListAnimator$StateListAnimator$TaskDescription */
            public static final class TaskDescription extends AbstractC1012StateListAnimator {
                public static final TaskDescription EZpvd = new TaskDescription();

                private TaskDescription() {
                    super(null);
                }
            }
        }

        /* JADX INFO: renamed from: o.ytZ$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }
}

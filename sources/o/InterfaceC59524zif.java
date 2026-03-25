package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import o.InterfaceC59458zhS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zif, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59524zif {
    public static final Activity copydefault = Activity.copydefault;

    TimeMark KWHzl();

    /* JADX INFO: renamed from: o.zif$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC59523zie {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
        }

        @Override // o.InterfaceC59524zif
        public /* synthetic */ TimeMark KWHzl() {
            return Application.copydefault(EZpvd());
        }

        public long EZpvd() {
            return C59521zic.OLrzqt.OLrzqt();
        }

        public java.lang.String toString() {
            return C59521zic.OLrzqt.toString();
        }

        /* JADX INFO: renamed from: o.zif$StateListAnimator$Application */
        public static final class Application implements InterfaceC59458zhS {
            public final long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static int EZpvd(long j) {
                return java.lang.Long.hashCode(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static boolean KWHzl(long j, java.lang.Object obj) {
                return (obj instanceof Application) && j == ((Application) obj).AEQbTJ();
            }

            public static long OLrzqt(long j) {
                return j;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static final /* synthetic */ Application copydefault(long j) {
                return new Application(j);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static java.lang.String valueOf(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final /* synthetic */ long AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                return KWHzl(this.OLrzqt, obj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return EZpvd(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return valueOf(this.OLrzqt);
            }

            /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public int compareTo(@NotNull InterfaceC59458zhS interfaceC59458zhS) {
                return InterfaceC59458zhS.TaskDescription.copydefault(this, interfaceC59458zhS);
            }

            @Override // kotlin.time.TimeMark
            public /* synthetic */ TimeMark KWHzl(long j) {
                return copydefault(AhwBna(j));
            }

            /* JADX DEBUG: Marked for inline */
            /* JADX DEBUG: Method not inlined, still used in: [o.zif.StateListAnimator.Application.copydefault(long):o.zif$StateListAnimator$Application] */
            public /* synthetic */ Application(long j) {
                this.OLrzqt = j;
            }

            public static long AEQbTJ(long j) {
                return C59521zic.OLrzqt.copydefault(j);
            }

            @Override // kotlin.time.TimeMark
            public long copydefault() {
                return AEQbTJ(this.OLrzqt);
            }

            public static long EZpvd(long j, long j2) {
                return C59521zic.OLrzqt.KWHzl(j, j2);
            }

            public long AhwBna(long j) {
                return EZpvd(this.OLrzqt, j);
            }

            @Override // o.InterfaceC59458zhS
            public long KWHzl(@NotNull InterfaceC59458zhS interfaceC59458zhS) {
                Intrinsics.checkNotNullParameter(interfaceC59458zhS, "");
                return EZpvd(this.OLrzqt, interfaceC59458zhS);
            }

            public static long EZpvd(long j, @NotNull InterfaceC59458zhS interfaceC59458zhS) {
                Intrinsics.checkNotNullParameter(interfaceC59458zhS, "");
                if (!(interfaceC59458zhS instanceof Application)) {
                    throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((java.lang.Object) valueOf(j)) + " and " + interfaceC59458zhS);
                }
                return AEQbTJ(j, ((Application) interfaceC59458zhS).AEQbTJ());
            }

            public static final long AEQbTJ(long j, long j2) {
                return C59521zic.OLrzqt.EZpvd(j, j2);
            }
        }
    }

    /* JADX INFO: renamed from: o.zif$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity copydefault = new Activity();

        private Activity() {
        }
    }
}

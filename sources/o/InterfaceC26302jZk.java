package o;

import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC26302jZk {
    void AEQbTJ(@NotNull Activity activity);

    void OLrzqt(@NotNull HolderDetailModel holderDetailModel);

    void copydefault(@NotNull java.util.List<TagWrapper> list);

    /* JADX INFO: renamed from: o.jZk$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jZk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.jZk$Activity$Dialog */
        public static final class Dialog extends Activity {
            public static final Dialog AEQbTJ = new Dialog();

            private Dialog() {
                super(null);
            }
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.jZk$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.jZk$Activity$ActionBar */
        public static final class ActionBar extends Activity {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.jZk$Activity$PendingIntent */
        public static final class PendingIntent extends Activity {
            public static final PendingIntent OLrzqt = new PendingIntent();

            private PendingIntent() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.jZk$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                return stateListAnimator.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "BubbleMap(link=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        /* JADX INFO: renamed from: o.jZk$Activity$Activity, reason: collision with other inner class name */
        public static final class C0864Activity extends Activity {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0864Activity copy$default(C0864Activity c0864Activity, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = c0864Activity.AEQbTJ;
                }
                return c0864Activity.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0864Activity OLrzqt(boolean z) {
                return new C0864Activity(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0864Activity) && this.AEQbTJ == ((C0864Activity) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "CurrencySwitch(isChecked=" + this.AEQbTJ + ")";
            }

            public C0864Activity(boolean z) {
                super(null);
                this.AEQbTJ = z;
            }
        }

        /* JADX INFO: renamed from: o.jZk$Activity$Application */
        public static final class Application extends Activity {
            public static final Application KWHzl = new Application();

            private Application() {
                super(null);
            }
        }
    }
}

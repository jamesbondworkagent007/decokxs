package o;

import com.google.gson.Gson;
import com.okinc.mln.miniapp.AppJson;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43022rhT {
    public static final Application Companion = Application.AEQbTJ;

    C43045rhq AEQbTJ(@NotNull StateListAnimator stateListAnimator);

    AppJson EZpvd();

    java.util.Set<java.lang.String> KWHzl();

    java.lang.String OLrzqt();

    java.lang.String copydefault();

    void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3);

    /* JADX INFO: renamed from: o.rhT$Activity */
    public static final class Activity {
        public static /* synthetic */ C43045rhq getResourceLoader$default(InterfaceC43022rhT interfaceC43022rhT, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getResourceLoader");
            }
            if ((i & 1) != 0) {
                stateListAnimator = StateListAnimator.Application.EZpvd;
            }
            return interfaceC43022rhT.AEQbTJ(stateListAnimator);
        }
    }

    /* JADX INFO: renamed from: o.rhT$StateListAnimator */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rhT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.rhT$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription OLrzqt = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        private StateListAnimator() {
        }

        /* JADX INFO: renamed from: o.rhT$StateListAnimator$Activity */
        public static final class Activity extends StateListAnimator {
            public static final Activity EZpvd = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.rhT$StateListAnimator$Application */
        public static final class Application extends StateListAnimator {
            public static final Application EZpvd = new Application();

            private Application() {
                super(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.rhT$Application */
    public static final class Application {
        public static final /* synthetic */ Application AEQbTJ = new Application();

        private Application() {
        }

        public final AppJson EZpvd(@NotNull C43045rhq c43045rhq) {
            Intrinsics.checkNotNullParameter(c43045rhq, "");
            try {
                return (AppJson) new Gson().fromJson(c43045rhq.OLrzqt("app.json"), AppJson.class);
            } catch (java.lang.Exception e) {
                C7870arw.KWHzl(e, "[MiniApp]", "fail to read app.json from " + c43045rhq.AEQbTJ("app.json", true));
                return null;
            }
        }
    }
}

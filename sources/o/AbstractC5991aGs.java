package o;

import androidx.credentials.CreatePublicKeyCredentialRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC5991aGs {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGs.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC5991aGs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.aGs$LoaderManager */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class LoaderManager extends AbstractC5991aGs {
        public final android.app.PendingIntent KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.app.PendingIntent EZpvd() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull android.app.PendingIntent pendingIntent) {
            super(null);
            Intrinsics.checkNotNullParameter(pendingIntent, "");
            this.KWHzl = pendingIntent;
        }
    }

    private AbstractC5991aGs() {
    }

    /* JADX INFO: renamed from: o.aGs$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class TaskDescription extends AbstractC5991aGs {
        public final CreatePublicKeyCredentialRequest OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CreatePublicKeyCredentialRequest EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest) {
            super(null);
            Intrinsics.checkNotNullParameter(createPublicKeyCredentialRequest, "");
            this.OLrzqt = createPublicKeyCredentialRequest;
        }
    }

    /* JADX INFO: renamed from: o.aGs$FragmentManager */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class FragmentManager extends AbstractC5991aGs {
        public static final FragmentManager EZpvd = new FragmentManager();

        private FragmentManager() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aGs$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class ActionBar extends AbstractC5991aGs {
        public final java.lang.String KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.aGs$StateListAnimator */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class StateListAnimator extends AbstractC5991aGs {
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    /* JADX INFO: renamed from: o.aGs$PendingIntent */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class PendingIntent extends AbstractC5991aGs {
        public static final PendingIntent KWHzl = new PendingIntent();

        private PendingIntent() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aGs$Activity */
    /* JADX INFO: loaded from: classes17.dex */
    public static final class Activity extends AbstractC5991aGs {
        public static final Activity EZpvd = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.aGs$Application */
    public static final class Application extends AbstractC5991aGs {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        public Application(java.lang.String str) {
            super(null);
            this.KWHzl = str;
        }
    }
}

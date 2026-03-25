package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TaskStackListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TaskStackListener {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final WallpaperInfo AEQbTJ;
    public final java.lang.String EZpvd;
    public final RestoreSession KWHzl;
    public final UiModeManager copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TaskStackListener$Application) A[MD:(o.TaskStackListener$Application):void (m)] call: o.TaskStackListener.<init>(o.TaskStackListener$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TaskStackListener(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RestoreSession AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UiModeManager EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WallpaperInfo KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public TaskStackListener(Application application) {
        this.KWHzl = application.copydefault();
        this.copydefault = application.EZpvd();
        this.AEQbTJ = application.OLrzqt();
        this.EZpvd = application.AEQbTJ();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TaskStackListener.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SetUserPoolMfaConfigRequest(");
        sb.append("mfaConfiguration=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("smsMfaConfiguration=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("softwareTokenMfaConfiguration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RestoreSession restoreSession = this.KWHzl;
        int iHashCode = restoreSession != null ? restoreSession.hashCode() : 0;
        UiModeManager uiModeManager = this.copydefault;
        int iHashCode2 = uiModeManager != null ? uiModeManager.hashCode() : 0;
        WallpaperInfo wallpaperInfo = this.AEQbTJ;
        int iHashCode3 = wallpaperInfo != null ? wallpaperInfo.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TaskStackListener.class != obj.getClass()) {
            return false;
        }
        TaskStackListener taskStackListener = (TaskStackListener) obj;
        return Intrinsics.EZpvd(this.KWHzl, taskStackListener.KWHzl) && Intrinsics.EZpvd(this.copydefault, taskStackListener.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, taskStackListener.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskStackListener.EZpvd);
    }

    public static /* synthetic */ TaskStackListener copy$default(TaskStackListener taskStackListener, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SetUserPoolMfaConfigRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TaskStackListener.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TaskStackListener.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(taskStackListener);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public UiModeManager AEQbTJ;
        public RestoreSession EZpvd;
        public java.lang.String KWHzl;
        public WallpaperInfo copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UiModeManager EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WallpaperInfo OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RestoreSession copydefault() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull TaskStackListener taskStackListener) {
            this();
            Intrinsics.checkNotNullParameter(taskStackListener, "");
            this.EZpvd = taskStackListener.AEQbTJ();
            this.AEQbTJ = taskStackListener.EZpvd();
            this.copydefault = taskStackListener.KWHzl();
            this.KWHzl = taskStackListener.OLrzqt();
        }

        public final TaskStackListener KWHzl() {
            return new TaskStackListener(this, null);
        }
    }
}

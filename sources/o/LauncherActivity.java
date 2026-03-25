package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.KeyguardManager;
import o.LauncherActivity;
import o.SystemService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class LauncherActivity {
    public static final ActionBar KWHzl = new ActionBar(null);
    public final AnimatorListenerAdapter AEQbTJ;
    public final SystemService EZpvd;
    public final KeyguardManager copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LauncherActivity$Activity) A[MD:(o.LauncherActivity$Activity):void (m)] call: o.LauncherActivity.<init>(o.LauncherActivity$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LauncherActivity(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KeyguardManager AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemService EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnimatorListenerAdapter OLrzqt() {
        return this.AEQbTJ;
    }

    public LauncherActivity(Activity activity) {
        this.AEQbTJ = activity.EZpvd();
        SystemService systemServiceCopydefault = activity.copydefault();
        if (systemServiceCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for eventSource".toString());
        }
        this.EZpvd = systemServiceCopydefault;
        KeyguardManager keyguardManagerKWHzl = activity.KWHzl();
        if (keyguardManagerKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for logLevel".toString());
        }
        this.copydefault = keyguardManagerKWHzl;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LauncherActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogConfigurationType(");
        sb.append("cloudWatchLogsConfiguration=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("eventSource=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("logLevel=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnimatorListenerAdapter animatorListenerAdapter = this.AEQbTJ;
        return ((((animatorListenerAdapter != null ? animatorListenerAdapter.hashCode() : 0) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LauncherActivity.class != obj.getClass()) {
            return false;
        }
        LauncherActivity launcherActivity = (LauncherActivity) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, launcherActivity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, launcherActivity.EZpvd) && Intrinsics.EZpvd(this.copydefault, launcherActivity.copydefault);
    }

    public static /* synthetic */ LauncherActivity copy$default(LauncherActivity launcherActivity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.LogConfigurationType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LauncherActivity.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LauncherActivity.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(launcherActivity);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public SystemService AEQbTJ;
        public AnimatorListenerAdapter EZpvd;
        public KeyguardManager KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(KeyguardManager keyguardManager) {
            this.KWHzl = keyguardManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnimatorListenerAdapter EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KeyguardManager KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AnimatorListenerAdapter animatorListenerAdapter) {
            this.EZpvd = animatorListenerAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SystemService systemService) {
            this.AEQbTJ = systemService;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SystemService copydefault() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull LauncherActivity launcherActivity) {
            this();
            Intrinsics.checkNotNullParameter(launcherActivity, "");
            this.EZpvd = launcherActivity.OLrzqt();
            this.AEQbTJ = launcherActivity.EZpvd();
            this.KWHzl = launcherActivity.AEQbTJ();
        }

        public final LauncherActivity OLrzqt() {
            return new LauncherActivity(this, null);
        }

        public final Activity AEQbTJ() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new SystemService.StateListAnimator("no value provided");
            }
            if (this.KWHzl == null) {
                this.KWHzl = new KeyguardManager.ActionBar("no value provided");
            }
            return this;
        }
    }
}

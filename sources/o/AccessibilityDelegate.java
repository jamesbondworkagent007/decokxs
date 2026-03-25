package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AccessibilityDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityDelegate {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.Boolean KWHzl;
    public final java.lang.Boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AccessibilityDelegate$Activity) A[MD:(o.AccessibilityDelegate$Activity):void (m)] call: o.AccessibilityDelegate.<init>(o.AccessibilityDelegate$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccessibilityDelegate(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public AccessibilityDelegate(Activity activity) {
        this.AEQbTJ = activity.OLrzqt();
        this.EZpvd = activity.AEQbTJ();
        java.lang.Boolean boolEZpvd = activity.EZpvd();
        if (boolEZpvd == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.KWHzl = boolEZpvd;
        java.lang.Boolean boolKWHzl = activity.KWHzl();
        if (boolKWHzl == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.copydefault = boolKWHzl;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AccessibilityDelegate.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityDelegate)) {
            return false;
        }
        AccessibilityDelegate accessibilityDelegate = (AccessibilityDelegate) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) accessibilityDelegate.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) accessibilityDelegate.EZpvd) && Intrinsics.EZpvd(this.KWHzl, accessibilityDelegate.KWHzl) && Intrinsics.EZpvd(this.copydefault, accessibilityDelegate.copydefault);
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.KWHzl;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SsoOidcEndpointParameters(");
        sb.append("endpoint=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.copydefault + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.AccessibilityDelegate */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccessibilityDelegate copy$default(AccessibilityDelegate accessibilityDelegate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.endpoints.SsoOidcEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AccessibilityDelegate.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AccessibilityDelegate.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        return accessibilityDelegate.OLrzqt(function1);
    }

    public final AccessibilityDelegate OLrzqt(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity();
        activity.AEQbTJ(this.AEQbTJ);
        activity.EZpvd(this.EZpvd);
        activity.KWHzl(this.KWHzl);
        activity.AEQbTJ(this.copydefault);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.Boolean OLrzqt;
        public java.lang.Boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Boolean bool) {
            this.copydefault = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Boolean bool) {
            this.OLrzqt = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        public Activity() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.OLrzqt = bool;
            this.copydefault = bool;
        }

        public final AccessibilityDelegate copydefault() {
            return new AccessibilityDelegate(this, null);
        }
    }
}

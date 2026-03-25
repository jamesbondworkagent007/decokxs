package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IntToLongFunction;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IntToLongFunction {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.Boolean AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.Boolean copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IntToLongFunction$Activity) A[MD:(o.IntToLongFunction$Activity):void (m)] call: o.IntToLongFunction.<init>(o.IntToLongFunction$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IntToLongFunction(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Boolean copydefault() {
        return this.copydefault;
    }

    public IntToLongFunction(Activity activity) {
        this.KWHzl = activity.copydefault();
        this.OLrzqt = activity.EZpvd();
        java.lang.Boolean boolKWHzl = activity.KWHzl();
        if (boolKWHzl == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useDualStack is required".toString());
        }
        this.AEQbTJ = boolKWHzl;
        java.lang.Boolean boolAEQbTJ = activity.AEQbTJ();
        if (boolAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("endpoint provider parameter #useFips is required".toString());
        }
        this.copydefault = boolAEQbTJ;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IntToLongFunction.TaskDescription.<init>():void type: THIS */
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
        if (!(obj instanceof IntToLongFunction)) {
            return false;
        }
        IntToLongFunction intToLongFunction = (IntToLongFunction) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) intToLongFunction.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) intToLongFunction.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, intToLongFunction.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, intToLongFunction.copydefault);
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Boolean bool = this.AEQbTJ;
        int iHashCode3 = bool != null ? bool.hashCode() : 0;
        java.lang.Boolean bool2 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CognitoIdentityProviderEndpointParameters(");
        sb.append("endpoint=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("region=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("useDualStack=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("useFips=" + this.copydefault + ')');
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.IntToLongFunction */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntToLongFunction copy$default(IntToLongFunction intToLongFunction, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.endpoints.CognitoIdentityProviderEndpointParameters$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IntToLongFunction.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IntToLongFunction.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        return intToLongFunction.KWHzl(function1);
    }

    public final IntToLongFunction KWHzl(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity();
        activity.OLrzqt(this.KWHzl);
        activity.EZpvd(this.OLrzqt);
        activity.copydefault(this.AEQbTJ);
        activity.EZpvd(this.copydefault);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.Boolean AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.Boolean OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Boolean bool) {
            this.OLrzqt = bool;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Boolean bool) {
            this.AEQbTJ = bool;
        }

        public Activity() {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.AEQbTJ = bool;
            this.OLrzqt = bool;
        }

        public final IntToLongFunction OLrzqt() {
            return new IntToLongFunction(this, null);
        }
    }
}

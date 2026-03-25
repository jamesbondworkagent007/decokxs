package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NoSuchMethodError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class NoSuchMethodError {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<java.lang.String> EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NoSuchMethodError$Activity) A[MD:(o.NoSuchMethodError$Activity):void (m)] call: o.NoSuchMethodError.<init>(o.NoSuchMethodError$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NoSuchMethodError(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public NoSuchMethodError(Activity activity) {
        this.EZpvd = activity.EZpvd();
        this.copydefault = activity.AEQbTJ();
        this.AEQbTJ = activity.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NoSuchMethodError.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LookupDeveloperIdentityResponse(");
        sb.append("developerUserIdentifierList=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("identityId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<java.lang.String> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NoSuchMethodError.class != obj.getClass()) {
            return false;
        }
        NoSuchMethodError noSuchMethodError = (NoSuchMethodError) obj;
        return Intrinsics.EZpvd(this.EZpvd, noSuchMethodError.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) noSuchMethodError.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) noSuchMethodError.AEQbTJ);
    }

    public static /* synthetic */ NoSuchMethodError copy$default(NoSuchMethodError noSuchMethodError, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.LookupDeveloperIdentityResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NoSuchMethodError.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NoSuchMethodError.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(noSuchMethodError);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull NoSuchMethodError noSuchMethodError) {
            this();
            Intrinsics.checkNotNullParameter(noSuchMethodError, "");
            this.KWHzl = noSuchMethodError.AEQbTJ();
            this.AEQbTJ = noSuchMethodError.OLrzqt();
            this.OLrzqt = noSuchMethodError.copydefault();
        }

        public final NoSuchMethodError OLrzqt() {
            return new NoSuchMethodError(this, null);
        }
    }
}

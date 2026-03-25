package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ExemptionMechanismException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ExemptionMechanismException {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final java.lang.String EZpvd;
    public final PackageInstallObserver KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ExemptionMechanismException$Activity) A[MD:(o.ExemptionMechanismException$Activity):void (m)] call: o.ExemptionMechanismException.<init>(o.ExemptionMechanismException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExemptionMechanismException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PackageInstallObserver copydefault() {
        return this.KWHzl;
    }

    public ExemptionMechanismException(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.EZpvd = activity.OLrzqt();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ExemptionMechanismException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminDisableProviderForUserRequest(");
        sb.append("user=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
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
        PackageInstallObserver packageInstallObserver = this.KWHzl;
        int iHashCode = packageInstallObserver != null ? packageInstallObserver.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExemptionMechanismException.class != obj.getClass()) {
            return false;
        }
        ExemptionMechanismException exemptionMechanismException = (ExemptionMechanismException) obj;
        return Intrinsics.EZpvd(this.KWHzl, exemptionMechanismException.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) exemptionMechanismException.EZpvd);
    }

    public static /* synthetic */ ExemptionMechanismException copy$default(ExemptionMechanismException exemptionMechanismException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminDisableProviderForUserRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExemptionMechanismException.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ExemptionMechanismException.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(exemptionMechanismException);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public PackageInstallObserver OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PackageInstallObserver KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ExemptionMechanismException exemptionMechanismException) {
            this();
            Intrinsics.checkNotNullParameter(exemptionMechanismException, "");
            this.OLrzqt = exemptionMechanismException.copydefault();
            this.AEQbTJ = exemptionMechanismException.KWHzl();
        }

        public final ExemptionMechanismException EZpvd() {
            return new ExemptionMechanismException(this, null);
        }
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.FingerprintGestureController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FingerprintGestureController {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.String AEQbTJ;
    public final TestApi EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FingerprintGestureController$Activity) A[MD:(o.FingerprintGestureController$Activity):void (m)] call: o.FingerprintGestureController.<init>(o.FingerprintGestureController$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FingerprintGestureController(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TestApi copydefault() {
        return this.EZpvd;
    }

    public FingerprintGestureController(Activity activity) {
        this.copydefault = activity.copydefault();
        this.EZpvd = activity.KWHzl();
        this.KWHzl = activity.EZpvd();
        this.AEQbTJ = activity.AEQbTJ();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FingerprintGestureController.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminUpdateAuthEventFeedbackRequest(");
        sb.append("eventId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("feedbackValue=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        TestApi testApi = this.EZpvd;
        int iHashCode2 = testApi != null ? testApi.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || FingerprintGestureController.class != obj.getClass()) {
            return false;
        }
        FingerprintGestureController fingerprintGestureController = (FingerprintGestureController) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fingerprintGestureController.copydefault) && Intrinsics.EZpvd(this.EZpvd, fingerprintGestureController.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fingerprintGestureController.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fingerprintGestureController.AEQbTJ);
    }

    public static /* synthetic */ FingerprintGestureController copy$default(FingerprintGestureController fingerprintGestureController, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminUpdateAuthEventFeedbackRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FingerprintGestureController.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FingerprintGestureController.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(fingerprintGestureController);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.lang.String EZpvd;
        public TestApi KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TestApi KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull FingerprintGestureController fingerprintGestureController) {
            this();
            Intrinsics.checkNotNullParameter(fingerprintGestureController, "");
            this.OLrzqt = fingerprintGestureController.AEQbTJ();
            this.KWHzl = fingerprintGestureController.copydefault();
            this.copydefault = fingerprintGestureController.EZpvd();
            this.EZpvd = fingerprintGestureController.OLrzqt();
        }

        public final FingerprintGestureController OLrzqt() {
            return new FingerprintGestureController(this, null);
        }
    }
}

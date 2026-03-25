package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.PointFEvaluator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PointFEvaluator {
    public static final ActionBar AEQbTJ = new ActionBar(null);
    public final AuthenticationRequiredException copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PointFEvaluator$Application) A[MD:(o.PointFEvaluator$Application):void (m)] call: o.PointFEvaluator.<init>(o.PointFEvaluator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PointFEvaluator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthenticationRequiredException KWHzl() {
        return this.copydefault;
    }

    public PointFEvaluator(Application application) {
        this.copydefault = application.AEQbTJ();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PointFEvaluator.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIdentityProviderResponse(");
        sb.append("identityProvider=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AuthenticationRequiredException authenticationRequiredException = this.copydefault;
        if (authenticationRequiredException != null) {
            return authenticationRequiredException.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PointFEvaluator.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((PointFEvaluator) obj).copydefault);
    }

    public static /* synthetic */ PointFEvaluator copy$default(PointFEvaluator pointFEvaluator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateIdentityProviderResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PointFEvaluator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PointFEvaluator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(pointFEvaluator);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public AuthenticationRequiredException copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationRequiredException AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AuthenticationRequiredException authenticationRequiredException) {
            this.copydefault = authenticationRequiredException;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull PointFEvaluator pointFEvaluator) {
            this();
            Intrinsics.checkNotNullParameter(pointFEvaluator, "");
            this.copydefault = pointFEvaluator.KWHzl();
        }

        public final PointFEvaluator EZpvd() {
            return new PointFEvaluator(this, null);
        }
    }
}

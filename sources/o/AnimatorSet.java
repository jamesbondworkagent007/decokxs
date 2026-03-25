package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AnimatorSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class AnimatorSet {
    public static final Activity AEQbTJ = new Activity(null);
    public final OperationCanceledException KWHzl;
    public final ChooseTypeAndAccountActivity OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.AnimatorSet$Application) A[MD:(o.AnimatorSet$Application):void (m)] call: o.AnimatorSet.<init>(o.AnimatorSet$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AnimatorSet(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChooseTypeAndAccountActivity AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OperationCanceledException EZpvd() {
        return this.KWHzl;
    }

    public AnimatorSet(Application application) {
        this.KWHzl = application.EZpvd();
        this.OLrzqt = application.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.AnimatorSet.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChallengeResponseType(");
        sb.append("challengeName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("challengeResponse=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        OperationCanceledException operationCanceledException = this.KWHzl;
        int iHashCode = operationCanceledException != null ? operationCanceledException.hashCode() : 0;
        ChooseTypeAndAccountActivity chooseTypeAndAccountActivity = this.OLrzqt;
        return (iHashCode * 31) + (chooseTypeAndAccountActivity != null ? chooseTypeAndAccountActivity.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnimatorSet.class != obj.getClass()) {
            return false;
        }
        AnimatorSet animatorSet = (AnimatorSet) obj;
        return Intrinsics.EZpvd(this.KWHzl, animatorSet.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, animatorSet.OLrzqt);
    }

    public static /* synthetic */ AnimatorSet copy$default(AnimatorSet animatorSet, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ChallengeResponseType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimatorSet.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimatorSet.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(animatorSet);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public OperationCanceledException OLrzqt;
        public ChooseTypeAndAccountActivity copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChooseTypeAndAccountActivity AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ChooseTypeAndAccountActivity chooseTypeAndAccountActivity) {
            this.copydefault = chooseTypeAndAccountActivity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OperationCanceledException EZpvd() {
            return this.OLrzqt;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(OperationCanceledException operationCanceledException) {
            this.OLrzqt = operationCanceledException;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AnimatorSet animatorSet) {
            this();
            Intrinsics.checkNotNullParameter(animatorSet, "");
            this.OLrzqt = animatorSet.EZpvd();
            this.copydefault = animatorSet.AEQbTJ();
        }

        public final AnimatorSet KWHzl() {
            return new AnimatorSet(this, null);
        }
    }
}

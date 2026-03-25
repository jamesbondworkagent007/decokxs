package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.UserIdInt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UserIdInt {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final AnimatorInflater AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UserIdInt$Application) A[MD:(o.UserIdInt$Application):void (m)] call: o.UserIdInt.<init>(o.UserIdInt$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UserIdInt(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnimatorInflater AEQbTJ() {
        return this.AEQbTJ;
    }

    public UserIdInt(Application application) {
        this.AEQbTJ = application.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UserIdInt.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ForgotPasswordResponse(");
        sb.append("codeDeliveryDetails=" + this.AEQbTJ);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnimatorInflater animatorInflater = this.AEQbTJ;
        if (animatorInflater != null) {
            return animatorInflater.hashCode();
        }
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && UserIdInt.class == obj.getClass() && Intrinsics.EZpvd(this.AEQbTJ, ((UserIdInt) obj).AEQbTJ);
    }

    public static /* synthetic */ UserIdInt copy$default(UserIdInt userIdInt, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ForgotPasswordResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UserIdInt.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserIdInt.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(userIdInt);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        public AnimatorInflater KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnimatorInflater AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AnimatorInflater animatorInflater) {
            this.KWHzl = animatorInflater;
        }

        public final Application copydefault() {
            return this;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull UserIdInt userIdInt) {
            this();
            Intrinsics.checkNotNullParameter(userIdInt, "");
            this.KWHzl = userIdInt.AEQbTJ();
        }

        public final UserIdInt KWHzl() {
            return new UserIdInt(this, null);
        }
    }
}

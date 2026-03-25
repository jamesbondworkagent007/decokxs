package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.UserSwitchObserver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UserSwitchObserver {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public final boolean EZpvd;
    public final AnimatorInflater KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UserSwitchObserver$Application) A[MD:(o.UserSwitchObserver$Application):void (m)] call: o.UserSwitchObserver.<init>(o.UserSwitchObserver$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UserSwitchObserver(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AnimatorInflater copydefault() {
        return this.KWHzl;
    }

    public UserSwitchObserver(Application application) {
        this.KWHzl = application.KWHzl();
        this.EZpvd = application.AEQbTJ();
        java.lang.String strOLrzqt = application.OLrzqt();
        if (strOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for userSub".toString());
        }
        this.copydefault = strOLrzqt;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UserSwitchObserver.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SignUpResponse(");
        sb.append("codeDeliveryDetails=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("userConfirmed=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userSub=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AnimatorInflater animatorInflater = this.KWHzl;
        return ((((animatorInflater != null ? animatorInflater.hashCode() : 0) * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UserSwitchObserver.class != obj.getClass()) {
            return false;
        }
        UserSwitchObserver userSwitchObserver = (UserSwitchObserver) obj;
        return Intrinsics.EZpvd(this.KWHzl, userSwitchObserver.KWHzl) && this.EZpvd == userSwitchObserver.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) userSwitchObserver.copydefault);
    }

    public static /* synthetic */ UserSwitchObserver copy$default(UserSwitchObserver userSwitchObserver, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.SignUpResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UserSwitchObserver.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UserSwitchObserver.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(userSwitchObserver);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        public boolean EZpvd;
        public java.lang.String OLrzqt;
        public AnimatorInflater copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(boolean z) {
            this.EZpvd = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AnimatorInflater KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault() {
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AnimatorInflater animatorInflater) {
            this.copydefault = animatorInflater;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull UserSwitchObserver userSwitchObserver) {
            this();
            Intrinsics.checkNotNullParameter(userSwitchObserver, "");
            this.copydefault = userSwitchObserver.copydefault();
            this.EZpvd = userSwitchObserver.AEQbTJ();
            this.OLrzqt = userSwitchObserver.KWHzl();
        }

        public final UserSwitchObserver EZpvd() {
            return new UserSwitchObserver(this, null);
        }
    }
}

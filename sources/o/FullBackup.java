package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerFuture;
import o.FullBackup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class FullBackup {
    public static final Activity KWHzl = new Activity(null);
    public final AccountManagerFuture copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.FullBackup$Application) A[MD:(o.FullBackup$Application):void (m)] call: o.FullBackup.<init>(o.FullBackup$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FullBackup(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountManagerFuture EZpvd() {
        return this.copydefault;
    }

    public FullBackup(Application application) {
        AccountManagerFuture accountManagerFutureAEQbTJ = application.AEQbTJ();
        if (accountManagerFutureAEQbTJ == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for advancedSecurityMode".toString());
        }
        this.copydefault = accountManagerFutureAEQbTJ;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FullBackup.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UserPoolAddOnsType(");
        sb.append("advancedSecurityMode=" + this.copydefault);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        return this.copydefault.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && FullBackup.class == obj.getClass() && Intrinsics.EZpvd(this.copydefault, ((FullBackup) obj).copydefault);
    }

    public static /* synthetic */ FullBackup copy$default(FullBackup fullBackup, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolAddOnsType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull FullBackup.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FullBackup.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(fullBackup);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public AccountManagerFuture AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AccountManagerFuture AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AccountManagerFuture accountManagerFuture) {
            this.AEQbTJ = accountManagerFuture;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull FullBackup fullBackup) {
            this();
            Intrinsics.checkNotNullParameter(fullBackup, "");
            this.AEQbTJ = fullBackup.EZpvd();
        }

        public final FullBackup copydefault() {
            return new FullBackup(this, null);
        }

        public final Application KWHzl() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new AccountManagerFuture.TaskDescription("no value provided");
            }
            return this;
        }
    }
}

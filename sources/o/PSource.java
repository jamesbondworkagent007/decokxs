package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PSource {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PSource$Application) A[MD:(o.PSource$Application):void (m)] call: o.PSource.<init>(o.PSource$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PSource(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    public PSource(Application application) {
        this.OLrzqt = application.AEQbTJ();
        this.EZpvd = application.copydefault();
        this.copydefault = application.EZpvd();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PSource.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminRemoveUserFromGroupRequest(");
        sb.append("groupName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PSource.class != obj.getClass()) {
            return false;
        }
        PSource pSource = (PSource) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) pSource.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) pSource.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) pSource.copydefault);
    }

    public static /* synthetic */ PSource copy$default(PSource pSource, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminRemoveUserFromGroupRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PSource.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PSource.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(pSource);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull PSource pSource) {
            this();
            Intrinsics.checkNotNullParameter(pSource, "");
            this.OLrzqt = pSource.EZpvd();
            this.KWHzl = pSource.OLrzqt();
            this.EZpvd = pSource.KWHzl();
        }

        public final PSource KWHzl() {
            return new PSource(this, null);
        }
    }
}

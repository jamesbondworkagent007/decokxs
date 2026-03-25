package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InheritableThreadLocal;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class InheritableThreadLocal {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
    public final java.lang.Long AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.InheritableThreadLocal$Application) A[MD:(o.InheritableThreadLocal$Application):void (m)] call: o.InheritableThreadLocal.<init>(o.InheritableThreadLocal$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InheritableThreadLocal(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public InheritableThreadLocal(Application application) {
        this.KWHzl = application.OLrzqt();
        this.EZpvd = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
        this.copydefault = application.KWHzl();
        this.AhwBna = application.djBIcL();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.InheritableThreadLocal.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetOpenIdTokenForDeveloperIdentityRequest(");
        sb.append("identityId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("identityPoolId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("logins=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("principalTags=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tokenDuration=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.AEQbTJ;
        int iHashCode3 = map != null ? map.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.copydefault;
        int iHashCode4 = map2 != null ? map2.hashCode() : 0;
        java.lang.Long l = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (l != null ? l.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InheritableThreadLocal.class != obj.getClass()) {
            return false;
        }
        InheritableThreadLocal inheritableThreadLocal = (InheritableThreadLocal) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) inheritableThreadLocal.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) inheritableThreadLocal.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, inheritableThreadLocal.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, inheritableThreadLocal.copydefault) && Intrinsics.EZpvd(this.AhwBna, inheritableThreadLocal.AhwBna);
    }

    public static /* synthetic */ InheritableThreadLocal copy$default(InheritableThreadLocal inheritableThreadLocal, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull InheritableThreadLocal.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InheritableThreadLocal.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(inheritableThreadLocal);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public java.lang.String EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> KWHzl;
        public java.lang.Long OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long djBIcL() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InheritableThreadLocal inheritableThreadLocal) {
            this();
            Intrinsics.checkNotNullParameter(inheritableThreadLocal, "");
            this.copydefault = inheritableThreadLocal.EZpvd();
            this.EZpvd = inheritableThreadLocal.copydefault();
            this.KWHzl = inheritableThreadLocal.OLrzqt();
            this.AEQbTJ = inheritableThreadLocal.KWHzl();
            this.OLrzqt = inheritableThreadLocal.AEQbTJ();
        }

        public final InheritableThreadLocal EZpvd() {
            return new InheritableThreadLocal(this, null);
        }
    }
}

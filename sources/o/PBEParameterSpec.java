package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PBEParameterSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class PBEParameterSpec {
    public static final ActionBar copydefault = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String KWHzl;
    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PBEParameterSpec$Application) A[MD:(o.PBEParameterSpec$Application):void (m)] call: o.PBEParameterSpec.<init>(o.PBEParameterSpec$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PBEParameterSpec(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.OLrzqt;
    }

    public PBEParameterSpec(Application application) {
        this.OLrzqt = application.EZpvd();
        this.AEQbTJ = application.OLrzqt();
        this.KWHzl = application.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PBEParameterSpec.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdminResetUserPasswordRequest(");
        sb.append("clientMetadata=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("userPoolId=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.Map<java.lang.String, java.lang.String> map = this.OLrzqt;
        int iHashCode = map != null ? map.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PBEParameterSpec.class != obj.getClass()) {
            return false;
        }
        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) obj;
        return Intrinsics.EZpvd(this.OLrzqt, pBEParameterSpec.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) pBEParameterSpec.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) pBEParameterSpec.KWHzl);
    }

    public static /* synthetic */ PBEParameterSpec copy$default(PBEParameterSpec pBEParameterSpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AdminResetUserPasswordRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PBEParameterSpec.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PBEParameterSpec.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(pBEParameterSpec);
        function1.invoke(application);
        return application.AEQbTJ();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String EZpvd;
        public java.util.Map<java.lang.String, java.lang.String> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull PBEParameterSpec pBEParameterSpec) {
            this();
            Intrinsics.checkNotNullParameter(pBEParameterSpec, "");
            this.copydefault = pBEParameterSpec.copydefault();
            this.EZpvd = pBEParameterSpec.EZpvd();
            this.AEQbTJ = pBEParameterSpec.AEQbTJ();
        }

        public final PBEParameterSpec AEQbTJ() {
            return new PBEParameterSpec(this, null);
        }
    }
}

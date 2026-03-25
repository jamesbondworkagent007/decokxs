package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36093oP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36093oP {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final C37291or AhwBna;
    public final C35634nz EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final C37344os gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.oP$Application) A[MD:(o.oP$Application):void (m)] call: o.oP.<init>(o.oP$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36093oP(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35634nz EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37291or OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37344os valueOf() {
        return this.gEmmrt;
    }

    public C36093oP(Application application) {
        this.OLrzqt = application.EZpvd();
        this.EZpvd = application.KWHzl();
        this.AEQbTJ = application.copydefault();
        this.KWHzl = application.AEQbTJ();
        this.AhwBna = application.AhwBna();
        this.gEmmrt = application.AYXKKw();
    }

    /* JADX INFO: renamed from: o.oP$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartLendingAnalysisRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentLocation=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("outputConfig=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C35634nz c35634nz = this.EZpvd;
        int iHashCode2 = c35634nz != null ? c35634nz.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        C37291or c37291or = this.AhwBna;
        int iHashCode5 = c37291or != null ? c37291or.hashCode() : 0;
        C37344os c37344os = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c37344os != null ? c37344os.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36093oP.class != obj.getClass()) {
            return false;
        }
        C36093oP c36093oP = (C36093oP) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36093oP.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c36093oP.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c36093oP.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c36093oP.KWHzl) && Intrinsics.EZpvd(this.AhwBna, c36093oP.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, c36093oP.gEmmrt);
    }

    public static /* synthetic */ C36093oP copy$default(C36093oP c36093oP, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.StartLendingAnalysisRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36093oP.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36093oP.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c36093oP);
        function1.invoke(application);
        return application.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oP$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public C37291or EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C35634nz copydefault;
        public C37344os gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37344os AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37291or AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35634nz KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C36093oP c36093oP) {
            this();
            Intrinsics.checkNotNullParameter(c36093oP, "");
            this.OLrzqt = c36093oP.copydefault();
            this.copydefault = c36093oP.EZpvd();
            this.AEQbTJ = c36093oP.KWHzl();
            this.KWHzl = c36093oP.AEQbTJ();
            this.EZpvd = c36093oP.OLrzqt();
            this.gEmmrt = c36093oP.valueOf();
        }

        public final C36093oP OLrzqt() {
            return new C36093oP(this, null);
        }
    }
}

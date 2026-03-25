package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46564tZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46564tZ {
    public static final Activity OLrzqt = new Activity(null);
    public final C48882ue AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final C46803te copydefault;
    public final java.util.List<java.lang.String> djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tZ$Application) A[MD:(o.tZ$Application):void (m)] call: o.tZ.<init>(o.tZ$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46564tZ(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46803te EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public C46564tZ(Application application) {
        this.copydefault = application.OLrzqt();
        this.AEQbTJ = application.AEQbTJ();
        this.EZpvd = application.EZpvd();
        this.KWHzl = application.copydefault();
        this.djBIcL = application.djBIcL();
    }

    /* JADX INFO: renamed from: o.tZ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tZ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TranslateDocumentRequest(");
        sb.append("document=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyNames=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C46803te c46803te = this.copydefault;
        int iHashCode = c46803te != null ? c46803te.hashCode() : 0;
        C48882ue c48882ue = this.AEQbTJ;
        int iHashCode2 = c48882ue != null ? c48882ue.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.djBIcL;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46564tZ.class != obj.getClass()) {
            return false;
        }
        C46564tZ c46564tZ = (C46564tZ) obj;
        return Intrinsics.EZpvd(this.copydefault, c46564tZ.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c46564tZ.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c46564tZ.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46564tZ.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c46564tZ.djBIcL);
    }

    public static /* synthetic */ C46564tZ copy$default(C46564tZ c46564tZ, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TranslateDocumentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46564tZ.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46564tZ.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(c46564tZ);
        function1.invoke(application);
        return application.KWHzl();
    }

    /* JADX INFO: renamed from: o.tZ$Application */
    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> EZpvd;
        public C48882ue KWHzl;
        public C46803te OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46803te OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> djBIcL() {
            return this.EZpvd;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C46564tZ c46564tZ) {
            this();
            Intrinsics.checkNotNullParameter(c46564tZ, "");
            this.OLrzqt = c46564tZ.EZpvd();
            this.KWHzl = c46564tZ.AEQbTJ();
            this.AEQbTJ = c46564tZ.copydefault();
            this.copydefault = c46564tZ.KWHzl();
            this.EZpvd = c46564tZ.OLrzqt();
        }

        public final C46564tZ KWHzl() {
            return new C46564tZ(this, null);
        }
    }
}

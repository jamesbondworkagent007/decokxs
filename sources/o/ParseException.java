package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ParseException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParseException {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<SqliteObjectLeakedViolation> AYXKKw;
    public final java.lang.String AhwBna;
    public final ResultReceiver EZpvd;
    public final java.lang.Integer KWHzl;
    public final RouteInfo OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ParseException$Application) A[MD:(o.ParseException$Application):void (m)] call: o.ParseException.<init>(o.ParseException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ParseException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResultReceiver AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RouteInfo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<SqliteObjectLeakedViolation> copydefault() {
        return this.AYXKKw;
    }

    public ParseException(Application application) {
        this.OLrzqt = application.EZpvd();
        this.EZpvd = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
        this.KWHzl = application.AhwBna();
        this.AYXKKw = application.gEmmrt();
        this.AhwBna = application.AYXKKw();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ParseException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Block(");
        sb.append("blockType=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("geometry=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("page=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("relationships=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("text=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        RouteInfo routeInfo = this.OLrzqt;
        int iHashCode = routeInfo != null ? routeInfo.hashCode() : 0;
        ResultReceiver resultReceiver = this.EZpvd;
        int iHashCode2 = resultReceiver != null ? resultReceiver.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.List<SqliteObjectLeakedViolation> list = this.AYXKKw;
        int iHashCode4 = list != null ? list.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParseException.class != obj.getClass()) {
            return false;
        }
        ParseException parseException = (ParseException) obj;
        return Intrinsics.EZpvd(this.OLrzqt, parseException.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, parseException.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) parseException.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, parseException.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, parseException.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) parseException.AhwBna);
    }

    public static /* synthetic */ ParseException copy$default(ParseException parseException, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.Block$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ParseException.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ParseException.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(parseException);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public RouteInfo AEQbTJ;
        public java.lang.String EZpvd;
        public ResultReceiver KWHzl;
        public java.lang.Integer OLrzqt;
        public java.util.List<SqliteObjectLeakedViolation> copydefault;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResultReceiver AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RouteInfo EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ResultReceiver resultReceiver) {
            this.KWHzl = resultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(RouteInfo routeInfo) {
            this.AEQbTJ = routeInfo;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<SqliteObjectLeakedViolation> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<SqliteObjectLeakedViolation> gEmmrt() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ParseException parseException) {
            this();
            Intrinsics.checkNotNullParameter(parseException, "");
            this.AEQbTJ = parseException.EZpvd();
            this.KWHzl = parseException.AEQbTJ();
            this.EZpvd = parseException.KWHzl();
            this.OLrzqt = parseException.OLrzqt();
            this.copydefault = parseException.copydefault();
            this.gEmmrt = parseException.AYXKKw();
        }

        public final ParseException KWHzl() {
            return new ParseException(this, null);
        }
    }
}

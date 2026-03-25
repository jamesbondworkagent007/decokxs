package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DatePickerCalendarDelegate;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DatePickerCalendarDelegate {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String EZpvd;
    public final TableRow OLrzqt;
    public final java.lang.Float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DatePickerCalendarDelegate$Application) A[MD:(o.DatePickerCalendarDelegate$Application):void (m)] call: o.DatePickerCalendarDelegate.<init>(o.DatePickerCalendarDelegate$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DatePickerCalendarDelegate(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TableRow OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public DatePickerCalendarDelegate(Application application) {
        this.copydefault = application.KWHzl();
        this.OLrzqt = application.copydefault();
        this.EZpvd = application.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DatePickerCalendarDelegate.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomLabel(");
        sb.append("confidence=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("geometry=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("name=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.copydefault;
        int iHashCode = f != null ? f.hashCode() : 0;
        TableRow tableRow = this.OLrzqt;
        int iHashCode2 = tableRow != null ? tableRow.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatePickerCalendarDelegate.class != obj.getClass()) {
            return false;
        }
        DatePickerCalendarDelegate datePickerCalendarDelegate = (DatePickerCalendarDelegate) obj;
        return Intrinsics.copydefault(this.copydefault, datePickerCalendarDelegate.copydefault) && Intrinsics.EZpvd(this.OLrzqt, datePickerCalendarDelegate.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) datePickerCalendarDelegate.EZpvd);
    }

    public static /* synthetic */ DatePickerCalendarDelegate copy$default(DatePickerCalendarDelegate datePickerCalendarDelegate, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CustomLabel$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DatePickerCalendarDelegate.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DatePickerCalendarDelegate.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(datePickerCalendarDelegate);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.lang.String EZpvd;
        public TableRow KWHzl;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(TableRow tableRow) {
            this.KWHzl = tableRow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TableRow copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.copydefault = f;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DatePickerCalendarDelegate datePickerCalendarDelegate) {
            this();
            Intrinsics.checkNotNullParameter(datePickerCalendarDelegate, "");
            this.copydefault = datePickerCalendarDelegate.EZpvd();
            this.KWHzl = datePickerCalendarDelegate.OLrzqt();
            this.EZpvd = datePickerCalendarDelegate.copydefault();
        }

        public final DatePickerCalendarDelegate EZpvd() {
            return new DatePickerCalendarDelegate(this, null);
        }
    }
}

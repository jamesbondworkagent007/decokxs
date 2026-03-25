package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DatePickerDialog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class DatePickerDialog {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.Integer KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DatePickerDialog$Application) A[MD:(o.DatePickerDialog$Application):void (m)] call: o.DatePickerDialog.<init>(o.DatePickerDialog$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DatePickerDialog(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    public DatePickerDialog(Application application) {
        this.OLrzqt = application.copydefault();
        this.KWHzl = application.AEQbTJ();
        this.AEQbTJ = application.OLrzqt();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DatePickerDialog.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DatePickerDialog copydefault(@NotNull Function1<? super Application, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = new Application();
            function1.invoke(application);
            return application.EZpvd();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListDevicesRequest(");
        sb.append("accessToken=*** Sensitive Data Redacted ***,");
        sb.append("limit=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("paginationToken=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AEQbTJ;
        return (((iHashCode * 31) + iIntValue) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DatePickerDialog.class != obj.getClass()) {
            return false;
        }
        DatePickerDialog datePickerDialog = (DatePickerDialog) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) datePickerDialog.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, datePickerDialog.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) datePickerDialog.AEQbTJ);
    }

    public static /* synthetic */ DatePickerDialog copy$default(DatePickerDialog datePickerDialog, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.ListDevicesRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DatePickerDialog.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DatePickerDialog.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(datePickerDialog);
        function1.invoke(application);
        return application.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Application {
        public java.lang.Integer AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DatePickerDialog datePickerDialog) {
            this();
            Intrinsics.checkNotNullParameter(datePickerDialog, "");
            this.OLrzqt = datePickerDialog.OLrzqt();
            this.AEQbTJ = datePickerDialog.KWHzl();
            this.EZpvd = datePickerDialog.AEQbTJ();
        }

        public final DatePickerDialog EZpvd() {
            return new DatePickerDialog(this, null);
        }
    }
}

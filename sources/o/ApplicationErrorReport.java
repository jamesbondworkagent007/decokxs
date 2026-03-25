package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ApplicationErrorReport;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ApplicationErrorReport {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.util.List<ListFragment> AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.util.List<ChooseAccountActivity> copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ApplicationErrorReport$Activity) A[MD:(o.ApplicationErrorReport$Activity):void (m)] call: o.ApplicationErrorReport.<init>(o.ApplicationErrorReport$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ApplicationErrorReport(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ChooseAccountActivity> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ListFragment> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public ApplicationErrorReport(Activity activity) {
        this.AEQbTJ = activity.AEQbTJ();
        this.EZpvd = activity.OLrzqt();
        java.util.List<ChooseAccountActivity> listKWHzl = activity.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for userAttributes".toString());
        }
        this.copydefault = listKWHzl;
        this.KWHzl = activity.valueOf();
        java.lang.String strAhwBna = activity.AhwBna();
        if (strAhwBna == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for username".toString());
        }
        this.AhwBna = strAhwBna;
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ApplicationErrorReport.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetUserResponse(");
        sb.append("mfaOptions=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("preferredMfaSetting=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("userAttributes=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("userMfaSettingList=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("username=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<ListFragment> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iHashCode3 = this.copydefault.hashCode();
        java.util.List<java.lang.String> list2 = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.AhwBna.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApplicationErrorReport.class != obj.getClass()) {
            return false;
        }
        ApplicationErrorReport applicationErrorReport = (ApplicationErrorReport) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, applicationErrorReport.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) applicationErrorReport.EZpvd) && Intrinsics.EZpvd(this.copydefault, applicationErrorReport.copydefault) && Intrinsics.EZpvd(this.KWHzl, applicationErrorReport.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) applicationErrorReport.AhwBna);
    }

    public static /* synthetic */ ApplicationErrorReport copy$default(ApplicationErrorReport applicationErrorReport, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.GetUserResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ApplicationErrorReport.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ApplicationErrorReport.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(applicationErrorReport);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    /* JADX INFO: loaded from: classes20.dex */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> EZpvd;
        public java.util.List<ChooseAccountActivity> KWHzl;
        public java.util.List<ListFragment> OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ListFragment> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ChooseAccountActivity> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ChooseAccountActivity> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<ListFragment> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> valueOf() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ApplicationErrorReport applicationErrorReport) {
            this();
            Intrinsics.checkNotNullParameter(applicationErrorReport, "");
            this.OLrzqt = applicationErrorReport.EZpvd();
            this.AEQbTJ = applicationErrorReport.copydefault();
            this.KWHzl = applicationErrorReport.AEQbTJ();
            this.EZpvd = applicationErrorReport.OLrzqt();
            this.copydefault = applicationErrorReport.KWHzl();
        }

        public final ApplicationErrorReport EZpvd() {
            return new ApplicationErrorReport(this, null);
        }

        public final Activity copydefault() {
            if (this.KWHzl == null) {
                this.KWHzl = yDY.AhwBna();
            }
            if (this.copydefault == null) {
                this.copydefault = "";
            }
            return this;
        }
    }
}

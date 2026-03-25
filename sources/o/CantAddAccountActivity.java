package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CantAddAccountActivity;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class CantAddAccountActivity {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final StyleableRes AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.util.List<AnimatorSet> EZpvd;
    public final SuppressLint KWHzl;
    public final C5173Hn copydefault;
    public final SystemApi djBIcL;
    public final StyleRes gEmmrt;
    public final StringRes valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CantAddAccountActivity$Activity) A[MD:(o.CantAddAccountActivity$Activity):void (m)] call: o.CantAddAccountActivity.<init>(o.CantAddAccountActivity$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CantAddAccountActivity(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuppressLint AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringRes AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StyleableRes EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AnimatorSet> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StyleRes djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemApi valueOf() {
        return this.djBIcL;
    }

    public CantAddAccountActivity(Activity activity) {
        this.EZpvd = activity.KWHzl();
        this.copydefault = activity.AEQbTJ();
        this.KWHzl = activity.copydefault();
        this.AEQbTJ = activity.AYXKKw();
        this.AYXKKw = activity.gEmmrt();
        this.gEmmrt = activity.AhwBna();
        this.valueOf = activity.djBIcL();
        this.djBIcL = activity.valueOf();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CantAddAccountActivity.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuthEventType(");
        sb.append("challengeResponses=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("creationDate=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("eventContextData=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("eventFeedback=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("eventId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("eventResponse=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("eventRisk=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("eventType=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<AnimatorSet> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        SuppressLint suppressLint = this.KWHzl;
        int iHashCode3 = suppressLint != null ? suppressLint.hashCode() : 0;
        StyleableRes styleableRes = this.AEQbTJ;
        int iHashCode4 = styleableRes != null ? styleableRes.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        StyleRes styleRes = this.gEmmrt;
        int iHashCode6 = styleRes != null ? styleRes.hashCode() : 0;
        StringRes stringRes = this.valueOf;
        int iHashCode7 = stringRes != null ? stringRes.hashCode() : 0;
        SystemApi systemApi = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (systemApi != null ? systemApi.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CantAddAccountActivity.class != obj.getClass()) {
            return false;
        }
        CantAddAccountActivity cantAddAccountActivity = (CantAddAccountActivity) obj;
        return Intrinsics.EZpvd(this.EZpvd, cantAddAccountActivity.EZpvd) && Intrinsics.EZpvd(this.copydefault, cantAddAccountActivity.copydefault) && Intrinsics.EZpvd(this.KWHzl, cantAddAccountActivity.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, cantAddAccountActivity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) cantAddAccountActivity.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, cantAddAccountActivity.gEmmrt) && Intrinsics.EZpvd(this.valueOf, cantAddAccountActivity.valueOf) && Intrinsics.EZpvd(this.djBIcL, cantAddAccountActivity.djBIcL);
    }

    public static /* synthetic */ CantAddAccountActivity copy$default(CantAddAccountActivity cantAddAccountActivity, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.AuthEventType$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CantAddAccountActivity.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CantAddAccountActivity.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(cantAddAccountActivity);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    public static final class Activity {
        public java.util.List<AnimatorSet> AEQbTJ;
        public StringRes AYXKKw;
        public StyleableRes EZpvd;
        public C5173Hn KWHzl;
        public SuppressLint OLrzqt;
        public java.lang.String copydefault;
        public StyleRes djBIcL;
        public SystemApi gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(SuppressLint suppressLint) {
            this.OLrzqt = suppressLint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StyleableRes AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StyleRes AhwBna() {
            return this.djBIcL;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StringRes stringRes) {
            this.AYXKKw = stringRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StyleableRes styleableRes) {
            this.EZpvd = styleableRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<AnimatorSet> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StyleRes styleRes) {
            this.djBIcL = styleRes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(SystemApi systemApi) {
            this.gEmmrt = systemApi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<AnimatorSet> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SuppressLint copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringRes djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SystemApi valueOf() {
            return this.gEmmrt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CantAddAccountActivity cantAddAccountActivity) {
            this();
            Intrinsics.checkNotNullParameter(cantAddAccountActivity, "");
            this.AEQbTJ = cantAddAccountActivity.OLrzqt();
            this.KWHzl = cantAddAccountActivity.copydefault();
            this.OLrzqt = cantAddAccountActivity.AEQbTJ();
            this.EZpvd = cantAddAccountActivity.EZpvd();
            this.copydefault = cantAddAccountActivity.KWHzl();
            this.djBIcL = cantAddAccountActivity.djBIcL();
            this.AYXKKw = cantAddAccountActivity.AYXKKw();
            this.gEmmrt = cantAddAccountActivity.valueOf();
        }

        public final CantAddAccountActivity OLrzqt() {
            return new CantAddAccountActivity(this, null);
        }
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CheckedTextView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CheckedTextView {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final C9304bT AYXKKw;
    public final C9092bP AhwBna;
    public final C8986bN KWHzl;
    public final C9145bQ OLrzqt;
    public final java.lang.String copydefault;
    public final C8933bM djBIcL;
    public final java.lang.String gEmmrt;
    public final java.util.List<C6158aK> valueOf;
    public final java.util.Map<java.lang.String, java.lang.String> values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CheckedTextView$Activity) A[MD:(o.CheckedTextView$Activity):void (m)] call: o.CheckedTextView.<init>(o.CheckedTextView$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CheckedTextView(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8933bM AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9145bQ EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8986bN KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9092bP OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9304bT gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C6158aK> valueOf() {
        return this.valueOf;
    }

    public CheckedTextView(Activity activity) {
        this.OLrzqt = activity.AEQbTJ();
        this.KWHzl = activity.OLrzqt();
        this.copydefault = activity.EZpvd();
        this.AEQbTJ = activity.copydefault();
        this.AhwBna = activity.AhwBna();
        this.djBIcL = activity.djBIcL();
        this.valueOf = activity.valueOf();
        this.gEmmrt = activity.gEmmrt();
        this.AYXKKw = activity.AYXKKw();
        this.values = activity.fetchVPNInfo();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CheckedTextView.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateStreamProcessorRequest(");
        sb.append("dataSharingPreference=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("input=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("output=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("regionsOfInterest=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("roleArn=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C9145bQ c9145bQ = this.OLrzqt;
        int iHashCode = c9145bQ != null ? c9145bQ.hashCode() : 0;
        C8986bN c8986bN = this.KWHzl;
        int iHashCode2 = c8986bN != null ? c8986bN.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        C9092bP c9092bP = this.AhwBna;
        int iHashCode5 = c9092bP != null ? c9092bP.hashCode() : 0;
        C8933bM c8933bM = this.djBIcL;
        int iHashCode6 = c8933bM != null ? c8933bM.hashCode() : 0;
        java.util.List<C6158aK> list = this.valueOf;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        C9304bT c9304bT = this.AYXKKw;
        int iHashCode9 = c9304bT != null ? c9304bT.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.values;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CheckedTextView.class != obj.getClass()) {
            return false;
        }
        CheckedTextView checkedTextView = (CheckedTextView) obj;
        return Intrinsics.EZpvd(this.OLrzqt, checkedTextView.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, checkedTextView.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) checkedTextView.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) checkedTextView.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, checkedTextView.AhwBna) && Intrinsics.EZpvd(this.djBIcL, checkedTextView.djBIcL) && Intrinsics.EZpvd(this.valueOf, checkedTextView.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) checkedTextView.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, checkedTextView.AYXKKw) && Intrinsics.EZpvd(this.values, checkedTextView.values);
    }

    public static /* synthetic */ CheckedTextView copy$default(CheckedTextView checkedTextView, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateStreamProcessorRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CheckedTextView.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CheckedTextView.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(checkedTextView);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public C8986bN AEQbTJ;
        public java.util.Map<java.lang.String, java.lang.String> AYXKKw;
        public C8933bM AhwBna;
        public C9092bP EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public C9145bQ copydefault;
        public C9304bT djBIcL;
        public java.lang.String gEmmrt;
        public java.util.List<C6158aK> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9145bQ AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9304bT AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9092bP AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8986bN OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8933bM djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> fetchVPNInfo() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C6158aK> valueOf() {
            return this.valueOf;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull CheckedTextView checkedTextView) {
            this();
            Intrinsics.checkNotNullParameter(checkedTextView, "");
            this.copydefault = checkedTextView.EZpvd();
            this.AEQbTJ = checkedTextView.KWHzl();
            this.KWHzl = checkedTextView.AEQbTJ();
            this.OLrzqt = checkedTextView.copydefault();
            this.EZpvd = checkedTextView.OLrzqt();
            this.AhwBna = checkedTextView.AYXKKw();
            this.valueOf = checkedTextView.valueOf();
            this.gEmmrt = checkedTextView.AhwBna();
            this.djBIcL = checkedTextView.gEmmrt();
            this.AYXKKw = checkedTextView.djBIcL();
        }

        public final CheckedTextView KWHzl() {
            return new CheckedTextView(this, null);
        }
    }
}

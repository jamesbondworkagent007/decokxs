package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TextSwitcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TextSwitcher {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final AbsSpinner EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TextSwitcher$Activity) A[MD:(o.TextSwitcher$Activity):void (m)] call: o.TextSwitcher.<init>(o.TextSwitcher$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextSwitcher(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbsSpinner OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.OLrzqt;
    }

    public TextSwitcher(Activity activity) {
        this.copydefault = activity.EZpvd();
        this.OLrzqt = activity.OLrzqt();
        this.KWHzl = activity.copydefault();
        this.EZpvd = activity.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TextSwitcher.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetCelebrityRecognitionRequest(");
        sb.append("jobId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sortBy=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        AbsSpinner absSpinner = this.EZpvd;
        return (((((iHashCode * 31) + iIntValue) * 31) + iHashCode2) * 31) + (absSpinner != null ? absSpinner.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextSwitcher.class != obj.getClass()) {
            return false;
        }
        TextSwitcher textSwitcher = (TextSwitcher) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) textSwitcher.copydefault) && Intrinsics.EZpvd(this.OLrzqt, textSwitcher.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) textSwitcher.KWHzl) && Intrinsics.EZpvd(this.EZpvd, textSwitcher.EZpvd);
    }

    public static /* synthetic */ TextSwitcher copy$default(TextSwitcher textSwitcher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetCelebrityRecognitionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextSwitcher.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextSwitcher.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(textSwitcher);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.lang.Integer AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public AbsSpinner copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbsSpinner AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull TextSwitcher textSwitcher) {
            this();
            Intrinsics.checkNotNullParameter(textSwitcher, "");
            this.KWHzl = textSwitcher.KWHzl();
            this.AEQbTJ = textSwitcher.copydefault();
            this.OLrzqt = textSwitcher.EZpvd();
            this.copydefault = textSwitcher.OLrzqt();
        }

        public final TextSwitcher KWHzl() {
            return new TextSwitcher(this, null);
        }
    }
}

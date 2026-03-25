package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewMethodCalledOnWrongThreadViolation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewMethodCalledOnWrongThreadViolation {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.Float AEQbTJ;
    public final java.lang.Float EZpvd;
    public final java.lang.Float OLrzqt;
    public final java.lang.Float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewMethodCalledOnWrongThreadViolation$Activity) A[MD:(o.WebViewMethodCalledOnWrongThreadViolation$Activity):void (m)] call: o.WebViewMethodCalledOnWrongThreadViolation.<init>(o.WebViewMethodCalledOnWrongThreadViolation$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewMethodCalledOnWrongThreadViolation(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.AEQbTJ;
    }

    public WebViewMethodCalledOnWrongThreadViolation(Activity activity) {
        this.OLrzqt = activity.OLrzqt();
        this.AEQbTJ = activity.KWHzl();
        this.EZpvd = activity.EZpvd();
        this.copydefault = activity.valueOf();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewMethodCalledOnWrongThreadViolation.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SentimentScore(");
        sb.append("mixed=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("negative=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("neutral=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("positive=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Float f = this.OLrzqt;
        int iHashCode = f != null ? f.hashCode() : 0;
        java.lang.Float f2 = this.AEQbTJ;
        int iHashCode2 = f2 != null ? f2.hashCode() : 0;
        java.lang.Float f3 = this.EZpvd;
        int iHashCode3 = f3 != null ? f3.hashCode() : 0;
        java.lang.Float f4 = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (f4 != null ? f4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewMethodCalledOnWrongThreadViolation.class != obj.getClass()) {
            return false;
        }
        WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation = (WebViewMethodCalledOnWrongThreadViolation) obj;
        return Intrinsics.copydefault(this.OLrzqt, webViewMethodCalledOnWrongThreadViolation.OLrzqt) && Intrinsics.copydefault(this.AEQbTJ, webViewMethodCalledOnWrongThreadViolation.AEQbTJ) && Intrinsics.copydefault(this.EZpvd, webViewMethodCalledOnWrongThreadViolation.EZpvd) && Intrinsics.copydefault(this.copydefault, webViewMethodCalledOnWrongThreadViolation.copydefault);
    }

    public static /* synthetic */ WebViewMethodCalledOnWrongThreadViolation copy$default(WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.SentimentScore$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewMethodCalledOnWrongThreadViolation.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewMethodCalledOnWrongThreadViolation.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(webViewMethodCalledOnWrongThreadViolation);
        function1.invoke(activity);
        return activity.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.lang.Float AEQbTJ;
        public java.lang.Float KWHzl;
        public java.lang.Float OLrzqt;
        public java.lang.Float copydefault;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.OLrzqt = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float valueOf() {
            return this.KWHzl;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull WebViewMethodCalledOnWrongThreadViolation webViewMethodCalledOnWrongThreadViolation) {
            this();
            Intrinsics.checkNotNullParameter(webViewMethodCalledOnWrongThreadViolation, "");
            this.copydefault = webViewMethodCalledOnWrongThreadViolation.EZpvd();
            this.AEQbTJ = webViewMethodCalledOnWrongThreadViolation.copydefault();
            this.OLrzqt = webViewMethodCalledOnWrongThreadViolation.AEQbTJ();
            this.KWHzl = webViewMethodCalledOnWrongThreadViolation.OLrzqt();
        }

        public final WebViewMethodCalledOnWrongThreadViolation copydefault() {
            return new WebViewMethodCalledOnWrongThreadViolation(this, null);
        }
    }
}

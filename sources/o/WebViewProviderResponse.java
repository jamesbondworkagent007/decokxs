package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewProviderResponse;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WebViewProviderResponse {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.Float AEQbTJ;
    public final java.util.List<java.lang.String> AYXKKw;
    public final java.lang.String AhwBna;
    public final SmartSelectSprite EZpvd;
    public final WebViewZygote KWHzl;
    public final java.lang.String copydefault;
    public final C44009s djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewProviderResponse$TaskDescription) A[MD:(o.WebViewProviderResponse$TaskDescription):void (m)] call: o.WebViewProviderResponse.<init>(o.WebViewProviderResponse$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewProviderResponse(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44009s OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartSelectSprite copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public WebViewProviderResponse(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.AEQbTJ();
        this.AEQbTJ = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.copydefault();
        this.copydefault = taskDescription.AYXKKw();
        this.djBIcL = taskDescription.djBIcL();
        this.AhwBna = taskDescription.gEmmrt();
        this.AYXKKw = taskDescription.AhwBna();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewProviderResponse.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CelebrityDetail(");
        sb.append("boundingBox=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("face=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("knownGender=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("urls=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.KWHzl;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        java.lang.Float f = this.AEQbTJ;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        SmartSelectSprite smartSelectSprite = this.EZpvd;
        int iHashCode3 = smartSelectSprite != null ? smartSelectSprite.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        C44009s c44009s = this.djBIcL;
        int iHashCode5 = c44009s != null ? c44009s.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode6 = str2 != null ? str2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewProviderResponse.class != obj.getClass()) {
            return false;
        }
        WebViewProviderResponse webViewProviderResponse = (WebViewProviderResponse) obj;
        return Intrinsics.EZpvd(this.KWHzl, webViewProviderResponse.KWHzl) && Intrinsics.copydefault(this.AEQbTJ, webViewProviderResponse.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, webViewProviderResponse.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) webViewProviderResponse.copydefault) && Intrinsics.EZpvd(this.djBIcL, webViewProviderResponse.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) webViewProviderResponse.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, webViewProviderResponse.AYXKKw);
    }

    public static /* synthetic */ WebViewProviderResponse copy$default(WebViewProviderResponse webViewProviderResponse, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CelebrityDetail$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewProviderResponse.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewProviderResponse.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(webViewProviderResponse);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.util.List<java.lang.String> AYXKKw;
        public java.lang.String AhwBna;
        public C44009s EZpvd;
        public WebViewZygote KWHzl;
        public SmartSelectSprite OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.AYXKKw = list;
        }

        public final TaskDescription KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(WebViewZygote webViewZygote) {
            this.KWHzl = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(SmartSelectSprite smartSelectSprite) {
            this.OLrzqt = smartSelectSprite;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C44009s c44009s) {
            this.EZpvd = c44009s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SmartSelectSprite copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C44009s djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull WebViewProviderResponse webViewProviderResponse) {
            this();
            Intrinsics.checkNotNullParameter(webViewProviderResponse, "");
            this.KWHzl = webViewProviderResponse.AEQbTJ();
            this.copydefault = webViewProviderResponse.KWHzl();
            this.OLrzqt = webViewProviderResponse.copydefault();
            this.AEQbTJ = webViewProviderResponse.EZpvd();
            this.EZpvd = webViewProviderResponse.OLrzqt();
            this.AhwBna = webViewProviderResponse.valueOf();
            this.AYXKKw = webViewProviderResponse.djBIcL();
        }

        public final WebViewProviderResponse EZpvd() {
            return new WebViewProviderResponse(this, null);
        }
    }
}

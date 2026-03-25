package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TextViewMetrics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TextViewMetrics {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.util.List<WebViewProviderInfo> KWHzl;
    public final AbstractC11162cE OLrzqt;
    public final C11135cD djBIcL;
    public final java.lang.String gEmmrt;
    public final C11108cC valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TextViewMetrics$ActionBar) A[MD:(o.TextViewMetrics$ActionBar):void (m)] call: o.TextViewMetrics.<init>(o.TextViewMetrics$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TextViewMetrics(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11162cE AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WebViewProviderInfo> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11135cD djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    public TextViewMetrics(ActionBar actionBar) {
        this.KWHzl = actionBar.EZpvd();
        this.EZpvd = actionBar.OLrzqt();
        this.OLrzqt = actionBar.copydefault();
        this.AEQbTJ = actionBar.valueOf();
        this.gEmmrt = actionBar.AhwBna();
        this.AhwBna = actionBar.gEmmrt();
        this.valueOf = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TextViewMetrics.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetCelebrityRecognitionResponse(");
        sb.append("celebrities=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("video=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("videoMetadata=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<WebViewProviderInfo> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        AbstractC11162cE abstractC11162cE = this.OLrzqt;
        int iHashCode3 = abstractC11162cE != null ? abstractC11162cE.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        C11108cC c11108cC = this.valueOf;
        int iHashCode7 = c11108cC != null ? c11108cC.hashCode() : 0;
        C11135cD c11135cD = this.djBIcL;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (c11135cD != null ? c11135cD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextViewMetrics.class != obj.getClass()) {
            return false;
        }
        TextViewMetrics textViewMetrics = (TextViewMetrics) obj;
        return Intrinsics.EZpvd(this.KWHzl, textViewMetrics.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) textViewMetrics.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, textViewMetrics.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) textViewMetrics.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) textViewMetrics.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) textViewMetrics.AhwBna) && Intrinsics.EZpvd(this.valueOf, textViewMetrics.valueOf) && Intrinsics.EZpvd(this.djBIcL, textViewMetrics.djBIcL);
    }

    public static /* synthetic */ TextViewMetrics copy$default(TextViewMetrics textViewMetrics, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetCelebrityRecognitionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TextViewMetrics.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TextViewMetrics.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(textViewMetrics);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public java.util.List<WebViewProviderInfo> AEQbTJ;
        public C11135cD AhwBna;
        public java.lang.String EZpvd;
        public AbstractC11162cE KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public C11108cC valueOf;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11135cD AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<WebViewProviderInfo> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C11135cD c11135cD) {
            this.AhwBna = c11135cD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<WebViewProviderInfo> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C11108cC c11108cC) {
            this.valueOf = c11108cC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC11162cE abstractC11162cE) {
            this.KWHzl = abstractC11162cE;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11162cE copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull TextViewMetrics textViewMetrics) {
            this();
            Intrinsics.checkNotNullParameter(textViewMetrics, "");
            this.AEQbTJ = textViewMetrics.OLrzqt();
            this.EZpvd = textViewMetrics.copydefault();
            this.KWHzl = textViewMetrics.AEQbTJ();
            this.copydefault = textViewMetrics.EZpvd();
            this.OLrzqt = textViewMetrics.KWHzl();
            this.djBIcL = textViewMetrics.gEmmrt();
            this.valueOf = textViewMetrics.AhwBna();
            this.AhwBna = textViewMetrics.djBIcL();
        }

        public final TextViewMetrics KWHzl() {
            return new TextViewMetrics(this, null);
        }
    }
}

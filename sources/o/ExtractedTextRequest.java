package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ExtractedTextRequest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractedTextRequest {
    public static final Application OLrzqt = new Application(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AhwBna;
    public final OnEditorActionListener EZpvd;
    public final TextView KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ExtractedTextRequest$Activity) A[MD:(o.ExtractedTextRequest$Activity):void (m)] call: o.ExtractedTextRequest.<init>(o.ExtractedTextRequest$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExtractedTextRequest(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextView OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnEditorActionListener copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    public ExtractedTextRequest(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.copydefault = activity.EZpvd();
        this.EZpvd = activity.OLrzqt();
        this.AEQbTJ = activity.valueOf();
        this.AhwBna = activity.gEmmrt();
        this.djBIcL = activity.AYXKKw();
        this.valueOf = activity.AhwBna();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ExtractedTextRequest.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AssumeRoleWithWebIdentityResponse(");
        sb.append("assumedRoleUser=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("audience=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("credentials=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("packedPolicySize=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("provider=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("sourceIdentity=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("subjectFromWebIdentityToken=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        TextView textView = this.KWHzl;
        int iHashCode = textView != null ? textView.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        OnEditorActionListener onEditorActionListener = this.EZpvd;
        int iHashCode3 = onEditorActionListener != null ? onEditorActionListener.hashCode() : 0;
        java.lang.Integer num = this.AEQbTJ;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iIntValue) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExtractedTextRequest.class != obj.getClass()) {
            return false;
        }
        ExtractedTextRequest extractedTextRequest = (ExtractedTextRequest) obj;
        return Intrinsics.EZpvd(this.KWHzl, extractedTextRequest.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) extractedTextRequest.copydefault) && Intrinsics.EZpvd(this.EZpvd, extractedTextRequest.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, extractedTextRequest.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) extractedTextRequest.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) extractedTextRequest.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) extractedTextRequest.valueOf);
    }

    public static /* synthetic */ ExtractedTextRequest copy$default(ExtractedTextRequest extractedTextRequest, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.AssumeRoleWithWebIdentityResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExtractedTextRequest.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ExtractedTextRequest.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(extractedTextRequest);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public OnEditorActionListener AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String EZpvd;
        public TextView KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.Integer copydefault;
        public java.lang.String gEmmrt;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextView KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnEditorActionListener OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(OnEditorActionListener onEditorActionListener) {
            this.AEQbTJ = onEditorActionListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(TextView textView) {
            this.KWHzl = textView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.copydefault;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull ExtractedTextRequest extractedTextRequest) {
            this();
            Intrinsics.checkNotNullParameter(extractedTextRequest, "");
            this.KWHzl = extractedTextRequest.OLrzqt();
            this.EZpvd = extractedTextRequest.EZpvd();
            this.AEQbTJ = extractedTextRequest.copydefault();
            this.copydefault = extractedTextRequest.KWHzl();
            this.OLrzqt = extractedTextRequest.AEQbTJ();
            this.AYXKKw = extractedTextRequest.djBIcL();
            this.gEmmrt = extractedTextRequest.AhwBna();
        }

        public final ExtractedTextRequest copydefault() {
            return new ExtractedTextRequest(this, null);
        }
    }
}

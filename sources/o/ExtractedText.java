package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ExtractedText;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractedText {
    public static final Activity AEQbTJ = new Activity(null);
    public final OnEditorActionListener EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final TextView copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ExtractedText$StateListAnimator) A[MD:(o.ExtractedText$StateListAnimator):void (m)] call: o.ExtractedText.<init>(o.ExtractedText$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ExtractedText(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TextView AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnEditorActionListener OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public ExtractedText(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.EZpvd();
        this.KWHzl = stateListAnimator.AhwBna();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ExtractedText.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AssumeRoleResponse(");
        sb.append("assumedRoleUser=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("credentials=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("packedPolicySize=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("sourceIdentity=");
        sb2.append(this.KWHzl);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        TextView textView = this.copydefault;
        int iHashCode = textView != null ? textView.hashCode() : 0;
        OnEditorActionListener onEditorActionListener = this.EZpvd;
        int iHashCode2 = onEditorActionListener != null ? onEditorActionListener.hashCode() : 0;
        java.lang.Integer num = this.OLrzqt;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ExtractedText.class != obj.getClass()) {
            return false;
        }
        ExtractedText extractedText = (ExtractedText) obj;
        return Intrinsics.EZpvd(this.copydefault, extractedText.copydefault) && Intrinsics.EZpvd(this.EZpvd, extractedText.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, extractedText.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) extractedText.KWHzl);
    }

    public static /* synthetic */ ExtractedText copy$default(ExtractedText extractedText, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.sts.model.AssumeRoleResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ExtractedText.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ExtractedText.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(extractedText);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public OnEditorActionListener AEQbTJ;
        public TextView EZpvd;
        public java.lang.String OLrzqt;
        public java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TextView AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(OnEditorActionListener onEditorActionListener) {
            this.AEQbTJ = onEditorActionListener;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(TextView textView) {
            this.EZpvd = textView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OnEditorActionListener OLrzqt() {
            return this.AEQbTJ;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ExtractedText extractedText) {
            this();
            Intrinsics.checkNotNullParameter(extractedText, "");
            this.EZpvd = extractedText.AEQbTJ();
            this.AEQbTJ = extractedText.OLrzqt();
            this.copydefault = extractedText.EZpvd();
            this.OLrzqt = extractedText.copydefault();
        }

        public final ExtractedText copydefault() {
            return new ExtractedText(this, null);
        }
    }
}

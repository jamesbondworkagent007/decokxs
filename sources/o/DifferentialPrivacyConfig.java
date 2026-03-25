package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DifferentialPrivacyConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DifferentialPrivacyConfig {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.Float AEQbTJ;
    public final CustomPrinterIconCallback AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.Integer EZpvd;
    public final DiskInfo KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.Float djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DifferentialPrivacyConfig$ActionBar) A[MD:(o.DifferentialPrivacyConfig$ActionBar):void (m)] call: o.DifferentialPrivacyConfig.<init>(o.DifferentialPrivacyConfig$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DifferentialPrivacyConfig(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DiskInfo OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomPrinterIconCallback djBIcL() {
        return this.AYXKKw;
    }

    public DifferentialPrivacyConfig(ActionBar actionBar) {
        this.EZpvd = actionBar.EZpvd();
        this.OLrzqt = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.copydefault();
        this.KWHzl = actionBar.valueOf();
        this.djBIcL = actionBar.AYXKKw();
        this.AhwBna = actionBar.AhwBna();
        this.AYXKKw = actionBar.gEmmrt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DifferentialPrivacyConfig.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetedSentimentMention(");
        sb.append("beginOffset=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endOffset=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("groupScore=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("mentionSentiment=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("score=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.OLrzqt;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Float f = this.AEQbTJ;
        int iHashCode = f != null ? f.hashCode() : 0;
        DiskInfo diskInfo = this.KWHzl;
        int iHashCode2 = diskInfo != null ? diskInfo.hashCode() : 0;
        java.lang.Float f2 = this.djBIcL;
        int iHashCode3 = f2 != null ? f2.hashCode() : 0;
        java.lang.String str = this.AhwBna;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        CustomPrinterIconCallback customPrinterIconCallback = this.AYXKKw;
        return (((((((((((iIntValue * 31) + iIntValue2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (customPrinterIconCallback != null ? customPrinterIconCallback.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DifferentialPrivacyConfig.class != obj.getClass()) {
            return false;
        }
        DifferentialPrivacyConfig differentialPrivacyConfig = (DifferentialPrivacyConfig) obj;
        return Intrinsics.EZpvd(this.EZpvd, differentialPrivacyConfig.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, differentialPrivacyConfig.OLrzqt) && Intrinsics.copydefault(this.AEQbTJ, differentialPrivacyConfig.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, differentialPrivacyConfig.KWHzl) && Intrinsics.copydefault(this.djBIcL, differentialPrivacyConfig.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) differentialPrivacyConfig.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, differentialPrivacyConfig.AYXKKw);
    }

    public static /* synthetic */ DifferentialPrivacyConfig copy$default(DifferentialPrivacyConfig differentialPrivacyConfig, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TargetedSentimentMention$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DifferentialPrivacyConfig.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DifferentialPrivacyConfig.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(differentialPrivacyConfig);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public java.lang.Integer AEQbTJ;
        public CustomPrinterIconCallback AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.Integer EZpvd;
        public java.lang.Float KWHzl;
        public DiskInfo OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.copydefault = f;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(DiskInfo diskInfo) {
            this.OLrzqt = diskInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(CustomPrinterIconCallback customPrinterIconCallback) {
            this.AYXKKw = customPrinterIconCallback;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomPrinterIconCallback gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DiskInfo valueOf() {
            return this.OLrzqt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull DifferentialPrivacyConfig differentialPrivacyConfig) {
            this();
            Intrinsics.checkNotNullParameter(differentialPrivacyConfig, "");
            this.AEQbTJ = differentialPrivacyConfig.AEQbTJ();
            this.EZpvd = differentialPrivacyConfig.EZpvd();
            this.KWHzl = differentialPrivacyConfig.KWHzl();
            this.OLrzqt = differentialPrivacyConfig.OLrzqt();
            this.copydefault = differentialPrivacyConfig.copydefault();
            this.AhwBna = differentialPrivacyConfig.AhwBna();
            this.AYXKKw = differentialPrivacyConfig.djBIcL();
        }

        public final DifferentialPrivacyConfig AEQbTJ() {
            return new DifferentialPrivacyConfig(this, null);
        }
    }
}

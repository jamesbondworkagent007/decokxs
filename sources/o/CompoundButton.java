package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CompoundButton;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CompoundButton {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final DatePickerController AEQbTJ;
    public final java.util.Map<java.lang.String, java.lang.String> AYXKKw;
    public final C11808cb AhwBna;
    public final C7609an EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;
    public final C12126ch valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CompoundButton$StateListAnimator) A[MD:(o.CompoundButton$StateListAnimator):void (m)] call: o.CompoundButton.<init>(o.CompoundButton$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CompoundButton(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7609an AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DatePickerController OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12126ch gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11808cb valueOf() {
        return this.AhwBna;
    }

    public CompoundButton(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.KWHzl();
        this.EZpvd = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.OLrzqt();
        this.AYXKKw = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.AYXKKw();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.valueOf();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CompoundButton.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateProjectVersionRequest(");
        sb.append("featureConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("projectArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("testingData=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("trainingData=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("versionDescription=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("versionName=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        DatePickerController datePickerController = this.AEQbTJ;
        int iHashCode = datePickerController != null ? datePickerController.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        C7609an c7609an = this.EZpvd;
        int iHashCode3 = c7609an != null ? c7609an.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.AYXKKw;
        int iHashCode5 = map != null ? map.hashCode() : 0;
        C11808cb c11808cb = this.AhwBna;
        int iHashCode6 = c11808cb != null ? c11808cb.hashCode() : 0;
        C12126ch c12126ch = this.valueOf;
        int iHashCode7 = c12126ch != null ? c12126ch.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CompoundButton.class != obj.getClass()) {
            return false;
        }
        CompoundButton compoundButton = (CompoundButton) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, compoundButton.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) compoundButton.KWHzl) && Intrinsics.EZpvd(this.EZpvd, compoundButton.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) compoundButton.copydefault) && Intrinsics.EZpvd(this.AYXKKw, compoundButton.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, compoundButton.AhwBna) && Intrinsics.EZpvd(this.valueOf, compoundButton.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) compoundButton.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) compoundButton.djBIcL);
    }

    public static /* synthetic */ CompoundButton copy$default(CompoundButton compoundButton, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.CreateProjectVersionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CompoundButton.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CompoundButton.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(compoundButton);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    public static final class StateListAnimator {
        public java.util.Map<java.lang.String, java.lang.String> AEQbTJ;
        public C12126ch AYXKKw;
        public C11808cb AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public C7609an OLrzqt;
        public DatePickerController copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DatePickerController AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C12126ch AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> AhwBna() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7609an EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11808cb gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.djBIcL;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull CompoundButton compoundButton) {
            this();
            Intrinsics.checkNotNullParameter(compoundButton, "");
            this.copydefault = compoundButton.OLrzqt();
            this.KWHzl = compoundButton.KWHzl();
            this.OLrzqt = compoundButton.AEQbTJ();
            this.EZpvd = compoundButton.EZpvd();
            this.AEQbTJ = compoundButton.copydefault();
            this.AhwBna = compoundButton.valueOf();
            this.AYXKKw = compoundButton.gEmmrt();
            this.gEmmrt = compoundButton.djBIcL();
            this.djBIcL = compoundButton.AYXKKw();
        }

        public final CompoundButton copydefault() {
            return new CompoundButton(this, null);
        }
    }
}

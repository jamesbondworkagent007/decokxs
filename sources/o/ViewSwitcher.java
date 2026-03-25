package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ViewSwitcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ViewSwitcher {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final AbstractC11162cE AEQbTJ;
    public final java.util.List<C56292y> AYXKKw;
    public final java.lang.String AhwBna;
    public final C11135cD DbNXlk;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final ViewFlipper copydefault;
    public final C11108cC djBIcL;
    public final java.lang.String gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ViewSwitcher$StateListAnimator) A[MD:(o.ViewSwitcher$StateListAnimator):void (m)] call: o.ViewSwitcher.<init>(o.ViewSwitcher$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ViewSwitcher(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC11162cE AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11135cD AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewFlipper OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C56292y> djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public ViewSwitcher(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.AEQbTJ();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.EZpvd();
        this.OLrzqt = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.AYXKKw();
        this.AYXKKw = stateListAnimator.valueOf();
        this.gEmmrt = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.AkhnZx();
        this.DbNXlk = stateListAnimator.fetchVPNInfo();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ViewSwitcher.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLabelDetectionResponse(");
        sb.append("getRequestMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("labelModelVersion=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("labels=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("video=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("videoMetadata=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ViewFlipper viewFlipper = this.copydefault;
        int iHashCode = viewFlipper != null ? viewFlipper.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        AbstractC11162cE abstractC11162cE = this.AEQbTJ;
        int iHashCode3 = abstractC11162cE != null ? abstractC11162cE.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C56292y> list = this.AYXKKw;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        int iHashCode9 = c11108cC != null ? c11108cC.hashCode() : 0;
        C11135cD c11135cD = this.DbNXlk;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (c11135cD != null ? c11135cD.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ViewSwitcher.class != obj.getClass()) {
            return false;
        }
        ViewSwitcher viewSwitcher = (ViewSwitcher) obj;
        return Intrinsics.EZpvd(this.copydefault, viewSwitcher.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) viewSwitcher.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, viewSwitcher.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) viewSwitcher.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) viewSwitcher.valueOf) && Intrinsics.EZpvd(this.AYXKKw, viewSwitcher.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) viewSwitcher.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) viewSwitcher.AhwBna) && Intrinsics.EZpvd(this.djBIcL, viewSwitcher.djBIcL) && Intrinsics.EZpvd(this.DbNXlk, viewSwitcher.DbNXlk);
    }

    public static /* synthetic */ ViewSwitcher copy$default(ViewSwitcher viewSwitcher, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetLabelDetectionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ViewSwitcher.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewSwitcher.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(viewSwitcher);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        public AbstractC11162cE AEQbTJ;
        public C11108cC AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public ViewFlipper KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<C56292y> djBIcL;
        public java.lang.String gEmmrt;
        public C11135cD valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ViewFlipper AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C11108cC c11108cC) {
            this.AYXKKw = c11108cC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC AkhnZx() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC11162cE EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC11162cE abstractC11162cE) {
            this.AEQbTJ = abstractC11162cE;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ViewFlipper viewFlipper) {
            this.KWHzl = viewFlipper;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C11135cD c11135cD) {
            this.valueOf = c11135cD;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C56292y> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11135cD fetchVPNInfo() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C56292y> valueOf() {
            return this.djBIcL;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ViewSwitcher viewSwitcher) {
            this();
            Intrinsics.checkNotNullParameter(viewSwitcher, "");
            this.KWHzl = viewSwitcher.OLrzqt();
            this.OLrzqt = viewSwitcher.KWHzl();
            this.AEQbTJ = viewSwitcher.AEQbTJ();
            this.EZpvd = viewSwitcher.EZpvd();
            this.copydefault = viewSwitcher.copydefault();
            this.djBIcL = viewSwitcher.djBIcL();
            this.gEmmrt = viewSwitcher.gEmmrt();
            this.AhwBna = viewSwitcher.valueOf();
            this.AYXKKw = viewSwitcher.AhwBna();
            this.valueOf = viewSwitcher.AYXKKw();
        }

        public final ViewSwitcher copydefault() {
            return new ViewSwitcher(this, null);
        }
    }
}

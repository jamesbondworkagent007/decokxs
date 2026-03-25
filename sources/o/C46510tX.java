package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46510tX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46510tX {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<java.lang.String> AkhnZx;
    public final java.lang.Integer DbNXlk;
    public final AbstractC46750td EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final C46697tc djBIcL;
    public final java.lang.Integer fetchVPNInfo;
    public final C5173Hn gEmmrt;
    public final java.lang.String isConnected;
    public final AbstractC46375tS valueOf;
    public final java.lang.Integer values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tX$StateListAnimator) A[MD:(o.tX$StateListAnimator):void (m)] call: o.tX.<init>(o.tX$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46510tX(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46750td EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46697tc copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46375tS djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> values() {
        return this.AkhnZx;
    }

    public C46510tX(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.EZpvd = stateListAnimator.AhwBna();
        this.djBIcL = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.valueOf();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.AYXKKw = stateListAnimator.AYXKKw();
        this.AhwBna = stateListAnimator.values();
        this.values = stateListAnimator.AkhnZx();
        this.fetchVPNInfo = stateListAnimator.DbNXlk();
        this.isConnected = stateListAnimator.fetchVPNInfo();
        this.AkhnZx = stateListAnimator.isConnected();
        this.DbNXlk = stateListAnimator.ejfBZ();
    }

    /* JADX INFO: renamed from: o.tX$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TerminologyProperties(");
        sb.append("arn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("createdAt=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("directionality=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("encryptionKey=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("format=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("lastUpdatedAt=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("sizeBytes=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("skippedTermCount=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCodes=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("termCount=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        AbstractC46750td abstractC46750td = this.EZpvd;
        int iHashCode4 = abstractC46750td != null ? abstractC46750td.hashCode() : 0;
        C46697tc c46697tc = this.djBIcL;
        int iHashCode5 = c46697tc != null ? c46697tc.hashCode() : 0;
        AbstractC46375tS abstractC46375tS = this.valueOf;
        int iHashCode6 = abstractC46375tS != null ? abstractC46375tS.hashCode() : 0;
        C5173Hn c5173Hn2 = this.gEmmrt;
        int iHashCode7 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode8 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode9 = str4 != null ? str4.hashCode() : 0;
        java.lang.Integer num = this.values;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.fetchVPNInfo;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.String str5 = this.isConnected;
        int iHashCode10 = str5 != null ? str5.hashCode() : 0;
        java.util.List<java.lang.String> list = this.AkhnZx;
        int iHashCode11 = list != null ? list.hashCode() : 0;
        java.lang.Integer num3 = this.DbNXlk;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iIntValue) * 31) + iIntValue2) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (num3 != null ? num3.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46510tX.class != obj.getClass()) {
            return false;
        }
        C46510tX c46510tX = (C46510tX) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46510tX.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c46510tX.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46510tX.copydefault) && Intrinsics.EZpvd(this.EZpvd, c46510tX.EZpvd) && Intrinsics.EZpvd(this.djBIcL, c46510tX.djBIcL) && Intrinsics.EZpvd(this.valueOf, c46510tX.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c46510tX.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46510tX.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46510tX.AhwBna) && Intrinsics.EZpvd(this.values, c46510tX.values) && Intrinsics.EZpvd(this.fetchVPNInfo, c46510tX.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) c46510tX.isConnected) && Intrinsics.EZpvd(this.AkhnZx, c46510tX.AkhnZx) && Intrinsics.EZpvd(this.DbNXlk, c46510tX.DbNXlk);
    }

    public static /* synthetic */ C46510tX copy$default(C46510tX c46510tX, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TerminologyProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46510tX.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46510tX.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c46510tX);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    /* JADX INFO: renamed from: o.tX$StateListAnimator */
    public static final class StateListAnimator {
        public C5173Hn AEQbTJ;
        public C5173Hn AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public java.lang.String EZpvd;
        public AbstractC46750td KWHzl;
        public C46697tc OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.lang.Integer fetchVPNInfo;
        public java.lang.Integer gEmmrt;
        public java.util.List<java.lang.String> isConnected;
        public AbstractC46375tS valueOf;
        public java.lang.Integer values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46750td AhwBna() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AkhnZx() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.values = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AkhnZx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.isConnected = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C46697tc c46697tc) {
            this.OLrzqt = c46697tc;
        }

        public final StateListAnimator KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.gEmmrt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC46375tS abstractC46375tS) {
            this.valueOf = abstractC46375tS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC46750td abstractC46750td) {
            this.KWHzl = abstractC46750td;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.fetchVPNInfo = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.AYXKKw = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer ejfBZ() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46697tc gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46375tS valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.AhwBna;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46510tX c46510tX) {
            this();
            Intrinsics.checkNotNullParameter(c46510tX, "");
            this.copydefault = c46510tX.OLrzqt();
            this.AEQbTJ = c46510tX.KWHzl();
            this.EZpvd = c46510tX.AEQbTJ();
            this.KWHzl = c46510tX.EZpvd();
            this.OLrzqt = c46510tX.copydefault();
            this.valueOf = c46510tX.djBIcL();
            this.AYXKKw = c46510tX.valueOf();
            this.djBIcL = c46510tX.AhwBna();
            this.AhwBna = c46510tX.gEmmrt();
            this.gEmmrt = c46510tX.AYXKKw();
            this.values = c46510tX.fetchVPNInfo();
            this.AkhnZx = c46510tX.AkhnZx();
            this.isConnected = c46510tX.values();
            this.fetchVPNInfo = c46510tX.DbNXlk();
        }

        public final C46510tX OLrzqt() {
            return new C46510tX(this, null);
        }
    }
}

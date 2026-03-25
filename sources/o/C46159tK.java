package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46159tK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46159tK {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final C5173Hn AYXKKw;
    public final java.lang.Long AhwBna;
    public final java.lang.Long AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.String DbNXlk;
    public final C46697tc EZpvd;
    public final java.lang.String OLrzqt;
    public final C5173Hn copydefault;
    public final java.lang.Long djBIcL;
    public final java.util.List<java.lang.String> fIwbmz;
    public final AbstractC46078tH fJNWhG;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.Long gEmmrt;
    public final AbstractC46078tH isConnected;
    public final C5173Hn valueOf;
    public final C45943tC values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tK$StateListAnimator) A[MD:(o.tK$StateListAnimator):void (m)] call: o.tK.<init>(o.tK$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46159tK(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46078tH AuCTel() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46697tc copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45943tC fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC46078tH gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long values() {
        return this.AkhnZx;
    }

    public C46159tK(StateListAnimator stateListAnimator) {
        this.OLrzqt = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.EZpvd();
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.EZpvd = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.gEmmrt();
        this.gEmmrt = stateListAnimator.AhwBna();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.valueOf = stateListAnimator.valueOf();
        this.AYXKKw = stateListAnimator.values();
        this.isConnected = stateListAnimator.isConnected();
        this.DbNXlk = stateListAnimator.DbNXlk();
        this.fetchVPNInfo = stateListAnimator.AkhnZx();
        this.values = stateListAnimator.fetchVPNInfo();
        this.AkhnZx = stateListAnimator.fIwbmz();
        this.AuCTel = stateListAnimator.ejfBZ();
        this.fJNWhG = stateListAnimator.fARcdN();
        this.fIwbmz = stateListAnimator.AuCTel();
    }

    /* JADX INFO: renamed from: o.tK$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tK.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ParallelDataProperties(");
        sb.append("arn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("createdAt=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("encryptionKey=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("failedRecordCount=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("importedDataSize=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("importedRecordCount=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("lastUpdatedAt=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("latestUpdateAttemptAt=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("latestUpdateAttemptStatus=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("parallelDataConfig=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("skippedRecordCount=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.fJNWhG + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("targetLanguageCodes=");
        sb2.append(this.fIwbmz);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.copydefault;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C46697tc c46697tc = this.EZpvd;
        int iHashCode4 = c46697tc != null ? c46697tc.hashCode() : 0;
        java.lang.Long l = this.djBIcL;
        int iHashCode5 = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.gEmmrt;
        int iHashCode6 = l2 != null ? l2.hashCode() : 0;
        java.lang.Long l3 = this.AhwBna;
        int iHashCode7 = l3 != null ? l3.hashCode() : 0;
        C5173Hn c5173Hn2 = this.valueOf;
        int iHashCode8 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        C5173Hn c5173Hn3 = this.AYXKKw;
        int iHashCode9 = c5173Hn3 != null ? c5173Hn3.hashCode() : 0;
        AbstractC46078tH abstractC46078tH = this.isConnected;
        int iHashCode10 = abstractC46078tH != null ? abstractC46078tH.hashCode() : 0;
        java.lang.String str3 = this.DbNXlk;
        int iHashCode11 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.fetchVPNInfo;
        int iHashCode12 = str4 != null ? str4.hashCode() : 0;
        C45943tC c45943tC = this.values;
        int iHashCode13 = c45943tC != null ? c45943tC.hashCode() : 0;
        java.lang.Long l4 = this.AkhnZx;
        int iHashCode14 = l4 != null ? l4.hashCode() : 0;
        java.lang.String str5 = this.AuCTel;
        int iHashCode15 = str5 != null ? str5.hashCode() : 0;
        AbstractC46078tH abstractC46078tH2 = this.fJNWhG;
        int iHashCode16 = abstractC46078tH2 != null ? abstractC46078tH2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.fIwbmz;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46159tK.class != obj.getClass()) {
            return false;
        }
        C46159tK c46159tK = (C46159tK) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46159tK.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c46159tK.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46159tK.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, c46159tK.EZpvd) && Intrinsics.EZpvd(this.djBIcL, c46159tK.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c46159tK.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, c46159tK.AhwBna) && Intrinsics.EZpvd(this.valueOf, c46159tK.valueOf) && Intrinsics.EZpvd(this.AYXKKw, c46159tK.AYXKKw) && Intrinsics.EZpvd(this.isConnected, c46159tK.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) c46159tK.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c46159tK.fetchVPNInfo) && Intrinsics.EZpvd(this.values, c46159tK.values) && Intrinsics.EZpvd(this.AkhnZx, c46159tK.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c46159tK.AuCTel) && Intrinsics.EZpvd(this.fJNWhG, c46159tK.fJNWhG) && Intrinsics.EZpvd(this.fIwbmz, c46159tK.fIwbmz);
    }

    public static /* synthetic */ C46159tK copy$default(C46159tK c46159tK, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ParallelDataProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46159tK.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46159tK.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c46159tK);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.tK$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public C5173Hn AYXKKw;
        public C5173Hn AhwBna;
        public java.lang.String AkhnZx;
        public java.util.List<java.lang.String> AuCTel;
        public java.lang.Long DbNXlk;
        public java.lang.Long EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public C46697tc copydefault;
        public java.lang.Long djBIcL;
        public AbstractC46078tH fIwbmz;
        public java.lang.String fetchVPNInfo;
        public AbstractC46078tH gEmmrt;
        public java.lang.String isConnected;
        public java.lang.Long valueOf;
        public C45943tC values;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.fetchVPNInfo = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.AhwBna = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC46078tH abstractC46078tH) {
            this.fIwbmz = abstractC46078tH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C46697tc c46697tc) {
            this.copydefault = c46697tc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AuCTel() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Long l) {
            this.DbNXlk = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AkhnZx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Long l) {
            this.djBIcL = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C45943tC c45943tC) {
            this.values = c45943tC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC46078tH abstractC46078tH) {
            this.gEmmrt = abstractC46078tH;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.valueOf = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.AuCTel = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.AYXKKw = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46697tc djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String ejfBZ() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46078tH fARcdN() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long fIwbmz() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45943tC fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC46078tH isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn values() {
            return this.AYXKKw;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C46159tK c46159tK) {
            this();
            Intrinsics.checkNotNullParameter(c46159tK, "");
            this.AEQbTJ = c46159tK.EZpvd();
            this.OLrzqt = c46159tK.KWHzl();
            this.KWHzl = c46159tK.OLrzqt();
            this.copydefault = c46159tK.copydefault();
            this.EZpvd = c46159tK.AEQbTJ();
            this.djBIcL = c46159tK.AhwBna();
            this.valueOf = c46159tK.valueOf();
            this.AhwBna = c46159tK.djBIcL();
            this.AYXKKw = c46159tK.AYXKKw();
            this.gEmmrt = c46159tK.gEmmrt();
            this.fetchVPNInfo = c46159tK.AkhnZx();
            this.AkhnZx = c46159tK.DbNXlk();
            this.values = c46159tK.fetchVPNInfo();
            this.DbNXlk = c46159tK.values();
            this.isConnected = c46159tK.isConnected();
            this.fIwbmz = c46159tK.AuCTel();
            this.AuCTel = c46159tK.ejfBZ();
        }

        public final C46159tK copydefault() {
            return new C46159tK(this, null);
        }
    }
}

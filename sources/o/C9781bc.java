package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C9781bc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C9781bc {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.Long AhwBna;
    public final AbstractC9728bb AkhnZx;
    public final java.lang.Long EZpvd;
    public final java.lang.Long OLrzqt;
    public final java.lang.Long copydefault;
    public final long djBIcL;
    public final C9622bZ fetchVPNInfo;
    public final C10046bh gEmmrt;
    public final java.lang.String valueOf;
    public final long values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bc$StateListAnimator) A[MD:(o.bc$StateListAnimator):void (m)] call: o.bc.<init>(o.bc$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C9781bc(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9622bZ DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10046bh gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC9728bb isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long valueOf() {
        return this.values;
    }

    public C9781bc(StateListAnimator stateListAnimator) {
        this.copydefault = stateListAnimator.copydefault();
        this.EZpvd = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.KWHzl();
        this.OLrzqt = stateListAnimator.valueOf();
        this.AYXKKw = stateListAnimator.djBIcL();
        this.djBIcL = stateListAnimator.AhwBna();
        this.gEmmrt = stateListAnimator.AYXKKw();
        this.AhwBna = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.DbNXlk();
        this.values = stateListAnimator.values();
        this.fetchVPNInfo = stateListAnimator.isConnected();
        this.AkhnZx = stateListAnimator.fetchVPNInfo();
    }

    /* JADX INFO: renamed from: o.bc$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bc.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SegmentDetection(");
        sb.append("durationFrames=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("durationMillis=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("durationSmpte=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("endFrameNumber=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("endTimecodeSmpte=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("endTimestampMillis=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("shotSegment=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("startFrameNumber=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("startTimecodeSmpte=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("startTimestampMillis=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("technicalCueSegment=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Long l = this.copydefault;
        int iHashCode = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.EZpvd;
        int iHashCode2 = l2 != null ? l2.hashCode() : 0;
        java.lang.String str = this.AEQbTJ;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.Long l3 = this.OLrzqt;
        int iHashCode4 = l3 != null ? l3.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        int iHashCode6 = java.lang.Long.hashCode(this.djBIcL);
        C10046bh c10046bh = this.gEmmrt;
        int iHashCode7 = c10046bh != null ? c10046bh.hashCode() : 0;
        java.lang.Long l4 = this.AhwBna;
        int iHashCode8 = l4 != null ? l4.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode9 = str3 != null ? str3.hashCode() : 0;
        int iHashCode10 = java.lang.Long.hashCode(this.values);
        C9622bZ c9622bZ = this.fetchVPNInfo;
        int iHashCode11 = c9622bZ != null ? c9622bZ.hashCode() : 0;
        AbstractC9728bb abstractC9728bb = this.AkhnZx;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (abstractC9728bb != null ? abstractC9728bb.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9781bc.class != obj.getClass()) {
            return false;
        }
        C9781bc c9781bc = (C9781bc) obj;
        return Intrinsics.EZpvd(this.copydefault, c9781bc.copydefault) && Intrinsics.EZpvd(this.EZpvd, c9781bc.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c9781bc.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c9781bc.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c9781bc.AYXKKw) && this.djBIcL == c9781bc.djBIcL && Intrinsics.EZpvd(this.gEmmrt, c9781bc.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, c9781bc.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c9781bc.valueOf) && this.values == c9781bc.values && Intrinsics.EZpvd(this.fetchVPNInfo, c9781bc.fetchVPNInfo) && Intrinsics.EZpvd(this.AkhnZx, c9781bc.AkhnZx);
    }

    public static /* synthetic */ C9781bc copy$default(C9781bc c9781bc, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.SegmentDetection$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C9781bc.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C9781bc.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c9781bc);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    /* JADX INFO: renamed from: o.bc$StateListAnimator */
    public static final class StateListAnimator {
        public java.lang.Long AEQbTJ;
        public long AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.Long EZpvd;
        public java.lang.Long KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public C10046bh djBIcL;
        public java.lang.Long gEmmrt;
        public C9622bZ isConnected;
        public long valueOf;
        public AbstractC9728bb values;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Long l) {
            this.KWHzl = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C10046bh c10046bh) {
            this.djBIcL = c10046bh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10046bh AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C9622bZ c9622bZ) {
            this.isConnected = c9622bZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(long j) {
            this.valueOf = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Long l) {
            this.gEmmrt = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC9728bb abstractC9728bb) {
            this.values = abstractC9728bb;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(long j) {
            this.AYXKKw = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Long l) {
            this.AEQbTJ = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC9728bb fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9622bZ isConnected() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long valueOf() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long values() {
            return this.valueOf;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C9781bc c9781bc) {
            this();
            Intrinsics.checkNotNullParameter(c9781bc, "");
            this.KWHzl = c9781bc.KWHzl();
            this.AEQbTJ = c9781bc.copydefault();
            this.OLrzqt = c9781bc.AEQbTJ();
            this.EZpvd = c9781bc.OLrzqt();
            this.copydefault = c9781bc.EZpvd();
            this.AYXKKw = c9781bc.AYXKKw();
            this.djBIcL = c9781bc.gEmmrt();
            this.gEmmrt = c9781bc.AhwBna();
            this.AhwBna = c9781bc.djBIcL();
            this.valueOf = c9781bc.valueOf();
            this.isConnected = c9781bc.DbNXlk();
            this.values = c9781bc.isConnected();
        }

        public final C9781bc EZpvd() {
            return new C9781bc(this, null);
        }
    }
}

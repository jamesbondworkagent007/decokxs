package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RaEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RaEvent {
    public static final Activity AEQbTJ = new Activity(null);
    public final java.lang.Long AYXKKw;
    public final C5173Hn AhwBna;
    public final NetworkMetrics DbNXlk;
    public final C5173Hn EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final ValidationProbeEvent gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RaEvent$StateListAnimator) A[MD:(o.RaEvent$StateListAnimator):void (m)] call: o.RaEvent.<init>(o.RaEvent$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RaEvent(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
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
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationProbeEvent copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkMetrics djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long valueOf() {
        return this.AYXKKw;
    }

    public RaEvent(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.copydefault();
        this.KWHzl = stateListAnimator.OLrzqt();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.copydefault = stateListAnimator.gEmmrt();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.valueOf = stateListAnimator.valueOf();
        this.AhwBna = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.AhwBna();
        this.AYXKKw = stateListAnimator.DbNXlk();
        this.DbNXlk = stateListAnimator.fetchVPNInfo();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RaEvent.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatasetProperties(");
        sb.append("creationTime=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("datasetArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("datasetName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("datasetS3Uri=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("datasetType=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("numberOfDocuments=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        ValidationProbeEvent validationProbeEvent = this.gEmmrt;
        int iHashCode5 = validationProbeEvent != null ? validationProbeEvent.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AhwBna;
        int iHashCode7 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        java.lang.Long l = this.AYXKKw;
        int iHashCode9 = l != null ? l.hashCode() : 0;
        NetworkMetrics networkMetrics = this.DbNXlk;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (networkMetrics != null ? networkMetrics.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RaEvent.class != obj.getClass()) {
            return false;
        }
        RaEvent raEvent = (RaEvent) obj;
        return Intrinsics.EZpvd(this.EZpvd, raEvent.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) raEvent.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) raEvent.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) raEvent.copydefault) && Intrinsics.EZpvd(this.gEmmrt, raEvent.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) raEvent.valueOf) && Intrinsics.EZpvd(this.AhwBna, raEvent.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) raEvent.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, raEvent.AYXKKw) && Intrinsics.EZpvd(this.DbNXlk, raEvent.DbNXlk);
    }

    public static /* synthetic */ RaEvent copy$default(RaEvent raEvent, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DatasetProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RaEvent.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RaEvent.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(raEvent);
        function1.invoke(stateListAnimator);
        return stateListAnimator.AEQbTJ();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public C5173Hn AYXKKw;
        public java.lang.String AhwBna;
        public ValidationProbeEvent EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public java.lang.String copydefault;
        public java.lang.Long djBIcL;
        public NetworkMetrics gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(NetworkMetrics networkMetrics) {
            this.gEmmrt = networkMetrics;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ValidationProbeEvent validationProbeEvent) {
            this.EZpvd = validationProbeEvent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long DbNXlk() {
            return this.djBIcL;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Long l) {
            this.djBIcL = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.AYXKKw = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValidationProbeEvent djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkMetrics fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull RaEvent raEvent) {
            this();
            Intrinsics.checkNotNullParameter(raEvent, "");
            this.OLrzqt = raEvent.OLrzqt();
            this.AEQbTJ = raEvent.KWHzl();
            this.copydefault = raEvent.AEQbTJ();
            this.KWHzl = raEvent.EZpvd();
            this.EZpvd = raEvent.copydefault();
            this.AhwBna = raEvent.gEmmrt();
            this.AYXKKw = raEvent.AYXKKw();
            this.valueOf = raEvent.AhwBna();
            this.djBIcL = raEvent.valueOf();
            this.gEmmrt = raEvent.djBIcL();
        }

        public final RaEvent AEQbTJ() {
            return new RaEvent(this, null);
        }
    }
}

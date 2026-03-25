package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C11000bz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C11000bz {
    public static final Activity EZpvd = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<AbstractC9728bb> AYXKKw;
    public final C7662ao KWHzl;
    public final java.lang.String OLrzqt;
    public final C10841bw copydefault;
    public final C11108cC djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bz$StateListAnimator) A[MD:(o.bz$StateListAnimator):void (m)] call: o.bz.<init>(o.bz$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C11000bz(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7662ao AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10841bw KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC9728bb> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11108cC djBIcL() {
        return this.djBIcL;
    }

    public C11000bz(StateListAnimator stateListAnimator) {
        this.AEQbTJ = stateListAnimator.OLrzqt();
        this.copydefault = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.KWHzl = stateListAnimator.EZpvd();
        this.AYXKKw = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.djBIcL();
    }

    /* JADX INFO: renamed from: o.bz$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bz.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartSegmentDetectionRequest(");
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("filters=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobTag=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("segmentTypes=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("video=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        C10841bw c10841bw = this.copydefault;
        int iHashCode2 = c10841bw != null ? c10841bw.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        C7662ao c7662ao = this.KWHzl;
        int iHashCode4 = c7662ao != null ? c7662ao.hashCode() : 0;
        java.util.List<AbstractC9728bb> list = this.AYXKKw;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        C11108cC c11108cC = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (c11108cC != null ? c11108cC.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11000bz.class != obj.getClass()) {
            return false;
        }
        C11000bz c11000bz = (C11000bz) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c11000bz.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c11000bz.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11000bz.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c11000bz.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, c11000bz.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, c11000bz.djBIcL);
    }

    public static /* synthetic */ C11000bz copy$default(C11000bz c11000bz, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.StartSegmentDetectionRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C11000bz.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C11000bz.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(c11000bz);
        function1.invoke(stateListAnimator);
        return stateListAnimator.copydefault();
    }

    /* JADX INFO: renamed from: o.bz$StateListAnimator */
    public static final class StateListAnimator {
        public java.util.List<? extends AbstractC9728bb> AEQbTJ;
        public java.lang.String EZpvd;
        public C7662ao KWHzl;
        public java.lang.String OLrzqt;
        public C10841bw copydefault;
        public C11108cC djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10841bw AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.bb>, java.util.List<o.bb> */
        public final java.util.List<AbstractC9728bb> AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7662ao EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11108cC djBIcL() {
            return this.djBIcL;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C11000bz c11000bz) {
            this();
            Intrinsics.checkNotNullParameter(c11000bz, "");
            this.OLrzqt = c11000bz.EZpvd();
            this.copydefault = c11000bz.KWHzl();
            this.EZpvd = c11000bz.copydefault();
            this.KWHzl = c11000bz.AEQbTJ();
            this.AEQbTJ = c11000bz.OLrzqt();
            this.djBIcL = c11000bz.djBIcL();
        }

        public final C11000bz copydefault() {
            return new C11000bz(this, null);
        }
    }
}

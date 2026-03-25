package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33981nN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33981nN {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C37344os AhwBna;
    public final C5173Hn KWHzl;
    public final C32249mV OLrzqt;
    public final java.lang.String copydefault;
    public final AbstractC32276mW djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.util.List<AbstractC33846nI> gEmmrt;
    public final java.util.List<C32222mU> valueOf;
    public final java.util.Map<java.lang.String, java.lang.String> values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nN$Activity) A[MD:(o.nN$Activity):void (m)] call: o.nN.<init>(o.nN$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33981nN(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.String> AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32249mV KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C32222mU> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37344os djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33846nI> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC32276mW valueOf() {
        return this.djBIcL;
    }

    public C33981nN(Activity activity) {
        this.copydefault = activity.OLrzqt();
        this.AEQbTJ = activity.AEQbTJ();
        this.KWHzl = activity.EZpvd();
        this.OLrzqt = activity.djBIcL();
        this.valueOf = activity.valueOf();
        this.gEmmrt = activity.gEmmrt();
        this.AYXKKw = activity.AhwBna();
        this.AhwBna = activity.AYXKKw();
        this.djBIcL = activity.fetchVPNInfo();
        this.fetchVPNInfo = activity.AkhnZx();
        this.values = activity.DbNXlk();
    }

    /* JADX INFO: renamed from: o.nN$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetAdapterVersionResponse(");
        sb.append("adapterId=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("adapterVersion=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("creationTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("datasetConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("evaluationMetrics=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("featureTypes=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C32249mV c32249mV = this.OLrzqt;
        int iHashCode4 = c32249mV != null ? c32249mV.hashCode() : 0;
        java.util.List<C32222mU> list = this.valueOf;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        java.util.List<AbstractC33846nI> list2 = this.gEmmrt;
        int iHashCode6 = list2 != null ? list2.hashCode() : 0;
        java.lang.String str3 = this.AYXKKw;
        int iHashCode7 = str3 != null ? str3.hashCode() : 0;
        C37344os c37344os = this.AhwBna;
        int iHashCode8 = c37344os != null ? c37344os.hashCode() : 0;
        AbstractC32276mW abstractC32276mW = this.djBIcL;
        int iHashCode9 = abstractC32276mW != null ? abstractC32276mW.hashCode() : 0;
        java.lang.String str4 = this.fetchVPNInfo;
        int iHashCode10 = str4 != null ? str4.hashCode() : 0;
        java.util.Map<java.lang.String, java.lang.String> map = this.values;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33981nN.class != obj.getClass()) {
            return false;
        }
        C33981nN c33981nN = (C33981nN) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c33981nN.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c33981nN.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c33981nN.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c33981nN.OLrzqt) && Intrinsics.EZpvd(this.valueOf, c33981nN.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c33981nN.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c33981nN.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, c33981nN.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c33981nN.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c33981nN.fetchVPNInfo) && Intrinsics.EZpvd(this.values, c33981nN.values);
    }

    public static /* synthetic */ C33981nN copy$default(C33981nN c33981nN, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetAdapterVersionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33981nN.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33981nN.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c33981nN);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.nN$Activity */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.util.Map<java.lang.String, java.lang.String> AkhnZx;
        public C32249mV EZpvd;
        public java.lang.String KWHzl;
        public java.util.List<C32222mU> OLrzqt;
        public C5173Hn copydefault;
        public C37344os djBIcL;
        public java.util.List<? extends AbstractC33846nI> gEmmrt;
        public AbstractC32276mW valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C37344os AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<? extends AbstractC33846nI> list) {
            this.gEmmrt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C32249mV c32249mV) {
            this.EZpvd = c32249mV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC32276mW abstractC32276mW) {
            this.valueOf = abstractC32276mW;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C37344os c37344os) {
            this.djBIcL = c37344os;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C32222mU> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.Map<java.lang.String, java.lang.String> map) {
            this.AkhnZx = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C32249mV djBIcL() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC32276mW fetchVPNInfo() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nI>, java.util.List<o.nI> */
        public final java.util.List<AbstractC33846nI> gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C32222mU> valueOf() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C33981nN c33981nN) {
            this();
            Intrinsics.checkNotNullParameter(c33981nN, "");
            this.KWHzl = c33981nN.AEQbTJ();
            this.AEQbTJ = c33981nN.copydefault();
            this.copydefault = c33981nN.EZpvd();
            this.EZpvd = c33981nN.KWHzl();
            this.OLrzqt = c33981nN.OLrzqt();
            this.gEmmrt = c33981nN.gEmmrt();
            this.AYXKKw = c33981nN.AhwBna();
            this.djBIcL = c33981nN.djBIcL();
            this.valueOf = c33981nN.valueOf();
            this.AhwBna = c33981nN.AYXKKw();
            this.AkhnZx = c33981nN.AkhnZx();
        }

        public final C33981nN KWHzl() {
            return new C33981nN(this, null);
        }
    }
}

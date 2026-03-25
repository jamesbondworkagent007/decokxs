package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC7005ab;
import o.C5173Hn;
import o.C7004aa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C7004aa {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final C7344ai DbNXlk;
    public final C7132ae KWHzl;
    public final C5173Hn OLrzqt;
    public final X copydefault;
    public final C7291ah djBIcL;
    public final AbstractC7005ab fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final C7185af isConnected;
    public final C7079ad valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aa$Activity) A[MD:(o.aa$Activity):void (m)] call: o.aa.<init>(o.aa$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C7004aa(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7291ah AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7079ad AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7005ab DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7132ae OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7185af valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7344ai values() {
        return this.DbNXlk;
    }

    public C7004aa(Activity activity) {
        this.AEQbTJ = activity.copydefault();
        C5173Hn c5173HnOLrzqt = activity.OLrzqt();
        if (c5173HnOLrzqt == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for creationTimestamp".toString());
        }
        this.OLrzqt = c5173HnOLrzqt;
        this.KWHzl = activity.AEQbTJ();
        this.copydefault = activity.AYXKKw();
        java.lang.String strAhwBna = activity.AhwBna();
        if (strAhwBna == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for jobId".toString());
        }
        this.gEmmrt = strAhwBna;
        this.AYXKKw = activity.djBIcL();
        this.AhwBna = activity.gEmmrt();
        this.valueOf = activity.valueOf();
        this.djBIcL = activity.isConnected();
        this.isConnected = activity.values();
        this.DbNXlk = activity.fetchVPNInfo();
        AbstractC7005ab abstractC7005abAkhnZx = activity.AkhnZx();
        if (abstractC7005abAkhnZx == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for status".toString());
        }
        this.fetchVPNInfo = abstractC7005abAkhnZx;
    }

    /* JADX INFO: renamed from: o.aa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MediaAnalysisJobDescription(");
        sb.append("completionTimestamp=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimestamp=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("failureDetails=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("input=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("manifestSummary=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("operationsConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("results=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.fetchVPNInfo);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.AEQbTJ;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        int iHashCode2 = this.OLrzqt.hashCode();
        C7132ae c7132ae = this.KWHzl;
        int iHashCode3 = c7132ae != null ? c7132ae.hashCode() : 0;
        X x = this.copydefault;
        int iHashCode4 = x != null ? x.hashCode() : 0;
        int iHashCode5 = this.gEmmrt.hashCode();
        java.lang.String str = this.AYXKKw;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AhwBna;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        C7079ad c7079ad = this.valueOf;
        int iHashCode8 = c7079ad != null ? c7079ad.hashCode() : 0;
        C7291ah c7291ah = this.djBIcL;
        int iHashCode9 = c7291ah != null ? c7291ah.hashCode() : 0;
        C7185af c7185af = this.isConnected;
        int iHashCode10 = c7185af != null ? c7185af.hashCode() : 0;
        C7344ai c7344ai = this.DbNXlk;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (c7344ai != null ? c7344ai.hashCode() : 0)) * 31) + this.fetchVPNInfo.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7004aa.class != obj.getClass()) {
            return false;
        }
        C7004aa c7004aa = (C7004aa) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c7004aa.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c7004aa.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c7004aa.KWHzl) && Intrinsics.EZpvd(this.copydefault, c7004aa.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c7004aa.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c7004aa.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c7004aa.AhwBna) && Intrinsics.EZpvd(this.valueOf, c7004aa.valueOf) && Intrinsics.EZpvd(this.djBIcL, c7004aa.djBIcL) && Intrinsics.EZpvd(this.isConnected, c7004aa.isConnected) && Intrinsics.EZpvd(this.DbNXlk, c7004aa.DbNXlk) && Intrinsics.EZpvd(this.fetchVPNInfo, c7004aa.fetchVPNInfo);
    }

    public static /* synthetic */ C7004aa copy$default(C7004aa c7004aa, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.MediaAnalysisJobDescription$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C7004aa.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C7004aa.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c7004aa);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    /* JADX INFO: renamed from: o.aa$Activity */
    public static final class Activity {
        public C5173Hn AEQbTJ;
        public C7185af AYXKKw;
        public C7079ad AhwBna;
        public C5173Hn EZpvd;
        public C7132ae KWHzl;
        public X OLrzqt;
        public java.lang.String copydefault;
        public C7291ah djBIcL;
        public java.lang.String gEmmrt;
        public AbstractC7005ab isConnected;
        public java.lang.String valueOf;
        public C7344ai values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7132ae AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(X x) {
            this.OLrzqt = x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C7079ad c7079ad) {
            this.AhwBna = c7079ad;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C7185af c7185af) {
            this.AYXKKw = c7185af;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final X AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7005ab AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C7291ah c7291ah) {
            this.djBIcL = c7291ah;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(AbstractC7005ab abstractC7005ab) {
            this.isConnected = abstractC7005ab;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C7132ae c7132ae) {
            this.KWHzl = c7132ae;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C7344ai c7344ai) {
            this.values = c7344ai;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7344ai fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7291ah isConnected() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7079ad valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7185af values() {
            return this.AYXKKw;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C7004aa c7004aa) {
            this();
            Intrinsics.checkNotNullParameter(c7004aa, "");
            this.EZpvd = c7004aa.EZpvd();
            this.AEQbTJ = c7004aa.AEQbTJ();
            this.KWHzl = c7004aa.OLrzqt();
            this.OLrzqt = c7004aa.copydefault();
            this.copydefault = c7004aa.KWHzl();
            this.valueOf = c7004aa.gEmmrt();
            this.gEmmrt = c7004aa.djBIcL();
            this.AhwBna = c7004aa.AhwBna();
            this.djBIcL = c7004aa.AYXKKw();
            this.AYXKKw = c7004aa.valueOf();
            this.values = c7004aa.values();
            this.isConnected = c7004aa.DbNXlk();
        }

        public final C7004aa KWHzl() {
            return new C7004aa(this, null);
        }

        public final Activity EZpvd() {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = C5173Hn.ActionBar.fromEpochSeconds$default(C5173Hn.AEQbTJ, 0L, 0, 2, null);
            }
            if (this.copydefault == null) {
                this.copydefault = "";
            }
            if (this.isConnected == null) {
                this.isConnected = new AbstractC7005ab.Dialog("no value provided");
            }
            return this;
        }
    }
}

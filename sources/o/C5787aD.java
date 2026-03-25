package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5787aD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5787aD {
    public static final Application EZpvd = new Application(null);
    public final java.lang.String AEQbTJ;
    public final DatePickerController AYXKKw;
    public final DatePickerSpinnerDelegate AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String AuCTel;
    public final java.lang.Integer DbNXlk;
    public final SimpleAdapter KWHzl;
    public final C5173Hn OLrzqt;
    public final java.lang.Long copydefault;
    public final java.lang.Integer djBIcL;
    public final C11914cd ejfBZ;
    public final C5173Hn fARcdN;
    public final C12285ck fIwbmz;
    public final java.lang.String fJNWhG;
    public final AbstractC5734aC fetchVPNInfo;
    public final C13131d gEmmrt;
    public final C7609an isConnected;
    public final java.lang.String valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.aD$Activity) A[MD:(o.aD$Activity):void (m)] call: o.aD.<init>(o.aD$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C5787aD(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7609an AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C12285ck AuCTel() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleAdapter KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DatePickerSpinnerDelegate copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13131d djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn fARcdN() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11914cd fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC5734aC fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String isConnected() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DatePickerController valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AkhnZx;
    }

    public C5787aD(Activity activity) {
        this.AEQbTJ = activity.KWHzl();
        this.copydefault = activity.OLrzqt();
        this.OLrzqt = activity.EZpvd();
        this.KWHzl = activity.AhwBna();
        this.AhwBna = activity.djBIcL();
        this.AYXKKw = activity.AYXKKw();
        this.valueOf = activity.gEmmrt();
        this.gEmmrt = activity.valueOf();
        this.djBIcL = activity.isConnected();
        this.DbNXlk = activity.fetchVPNInfo();
        this.isConnected = activity.values();
        this.values = activity.AkhnZx();
        this.AkhnZx = activity.DbNXlk();
        this.fetchVPNInfo = activity.ejfBZ();
        this.AuCTel = activity.fJNWhG();
        this.ejfBZ = activity.fARcdN();
        this.fIwbmz = activity.AuCTel();
        this.fARcdN = activity.fIwbmz();
        this.fJNWhG = activity.getNewProxyInstance();
    }

    /* JADX INFO: renamed from: o.aD$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aD.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProjectVersionDescription(");
        sb.append("baseModelVersion=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("billableTrainingTimeInSeconds=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimestamp=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("evaluationResult=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("feature=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("featureConfig=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("manifestSummary=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("maxInferenceUnits=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("minInferenceUnits=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("projectVersionArn=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("sourceProjectVersionArn=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AuCTel + AbstractJsonLexerKt.COMMA);
        sb.append("testingDataResult=" + this.ejfBZ + AbstractJsonLexerKt.COMMA);
        sb.append("trainingDataResult=" + this.fIwbmz + AbstractJsonLexerKt.COMMA);
        sb.append("trainingEndTimestamp=" + this.fARcdN + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("versionDescription=");
        sb2.append(this.fJNWhG);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.Long l = this.copydefault;
        int iHashCode2 = l != null ? l.hashCode() : 0;
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        SimpleAdapter simpleAdapter = this.KWHzl;
        int iHashCode4 = simpleAdapter != null ? simpleAdapter.hashCode() : 0;
        DatePickerSpinnerDelegate datePickerSpinnerDelegate = this.AhwBna;
        int iHashCode5 = datePickerSpinnerDelegate != null ? datePickerSpinnerDelegate.hashCode() : 0;
        DatePickerController datePickerController = this.AYXKKw;
        int iHashCode6 = datePickerController != null ? datePickerController.hashCode() : 0;
        java.lang.String str2 = this.valueOf;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        C13131d c13131d = this.gEmmrt;
        int iHashCode8 = c13131d != null ? c13131d.hashCode() : 0;
        java.lang.Integer num = this.djBIcL;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.DbNXlk;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        C7609an c7609an = this.isConnected;
        int iHashCode9 = c7609an != null ? c7609an.hashCode() : 0;
        java.lang.String str3 = this.values;
        int iHashCode10 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AkhnZx;
        int iHashCode11 = str4 != null ? str4.hashCode() : 0;
        AbstractC5734aC abstractC5734aC = this.fetchVPNInfo;
        int iHashCode12 = abstractC5734aC != null ? abstractC5734aC.hashCode() : 0;
        java.lang.String str5 = this.AuCTel;
        int iHashCode13 = str5 != null ? str5.hashCode() : 0;
        C11914cd c11914cd = this.ejfBZ;
        int iHashCode14 = c11914cd != null ? c11914cd.hashCode() : 0;
        C12285ck c12285ck = this.fIwbmz;
        int iHashCode15 = c12285ck != null ? c12285ck.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fARcdN;
        int iHashCode16 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.fJNWhG;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iIntValue) * 31) + iIntValue2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5787aD.class != obj.getClass()) {
            return false;
        }
        C5787aD c5787aD = (C5787aD) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c5787aD.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c5787aD.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c5787aD.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c5787aD.KWHzl) && Intrinsics.EZpvd(this.AhwBna, c5787aD.AhwBna) && Intrinsics.EZpvd(this.AYXKKw, c5787aD.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c5787aD.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c5787aD.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, c5787aD.djBIcL) && Intrinsics.EZpvd(this.DbNXlk, c5787aD.DbNXlk) && Intrinsics.EZpvd(this.isConnected, c5787aD.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c5787aD.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c5787aD.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, c5787aD.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AuCTel, (java.lang.Object) c5787aD.AuCTel) && Intrinsics.EZpvd(this.ejfBZ, c5787aD.ejfBZ) && Intrinsics.EZpvd(this.fIwbmz, c5787aD.fIwbmz) && Intrinsics.EZpvd(this.fARcdN, c5787aD.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.fJNWhG, (java.lang.Object) c5787aD.fJNWhG);
    }

    public static /* synthetic */ C5787aD copy$default(C5787aD c5787aD, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.ProjectVersionDescription$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C5787aD.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C5787aD.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c5787aD);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    /* JADX INFO: renamed from: o.aD$Activity */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public DatePickerController AYXKKw;
        public java.lang.Integer AhwBna;
        public C7609an AkhnZx;
        public java.lang.String AuCTel;
        public java.lang.String DbNXlk;
        public java.lang.Long EZpvd;
        public DatePickerSpinnerDelegate KWHzl;
        public C5173Hn OLrzqt;
        public SimpleAdapter copydefault;
        public C13131d djBIcL;
        public C5173Hn ejfBZ;
        public C12285ck fARcdN;
        public C11914cd fIwbmz;
        public AbstractC5734aC fetchVPNInfo;
        public java.lang.String gEmmrt;
        public java.lang.String isConnected;
        public java.lang.Integer valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.valueOf = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DatePickerController datePickerController) {
            this.AYXKKw = datePickerController;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.OLrzqt = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DatePickerController AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SimpleAdapter AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C12285ck AuCTel() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.AhwBna = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SimpleAdapter simpleAdapter) {
            this.copydefault = simpleAdapter;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C13131d c13131d) {
            this.djBIcL = c13131d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C5173Hn c5173Hn) {
            this.ejfBZ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Long l) {
            this.EZpvd = l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C12285ck c12285ck) {
            this.fARcdN = c12285ck;
        }

        public final Activity copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(DatePickerSpinnerDelegate datePickerSpinnerDelegate) {
            this.KWHzl = datePickerSpinnerDelegate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC5734aC abstractC5734aC) {
            this.fetchVPNInfo = abstractC5734aC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C7609an c7609an) {
            this.AkhnZx = c7609an;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C11914cd c11914cd) {
            this.fIwbmz = c11914cd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DatePickerSpinnerDelegate djBIcL() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.AuCTel = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC5734aC ejfBZ() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C11914cd fARcdN() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn fIwbmz() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String fJNWhG() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer fetchVPNInfo() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String getNewProxyInstance() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C13131d valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7609an values() {
            return this.AkhnZx;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C5787aD c5787aD) {
            this();
            Intrinsics.checkNotNullParameter(c5787aD, "");
            this.AEQbTJ = c5787aD.OLrzqt();
            this.EZpvd = c5787aD.EZpvd();
            this.OLrzqt = c5787aD.AEQbTJ();
            this.copydefault = c5787aD.KWHzl();
            this.KWHzl = c5787aD.copydefault();
            this.AYXKKw = c5787aD.valueOf();
            this.gEmmrt = c5787aD.AYXKKw();
            this.djBIcL = c5787aD.djBIcL();
            this.AhwBna = c5787aD.AhwBna();
            this.valueOf = c5787aD.gEmmrt();
            this.AkhnZx = c5787aD.AkhnZx();
            this.isConnected = c5787aD.DbNXlk();
            this.values = c5787aD.values();
            this.fetchVPNInfo = c5787aD.fetchVPNInfo();
            this.DbNXlk = c5787aD.isConnected();
            this.fIwbmz = c5787aD.fIwbmz();
            this.fARcdN = c5787aD.AuCTel();
            this.ejfBZ = c5787aD.fARcdN();
            this.AuCTel = c5787aD.fJNWhG();
        }

        public final C5787aD AEQbTJ() {
            return new C5787aD(this, null);
        }
    }
}

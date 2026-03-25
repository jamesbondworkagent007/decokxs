package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C46456tV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C46456tV {
    public static final StateListAnimator AEQbTJ = new StateListAnimator(null);
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<java.lang.String> AkhnZx;
    public final java.util.List<java.lang.String> DbNXlk;
    public final C47386tp EZpvd;
    public final C5173Hn KWHzl;
    public final C47280tn OLrzqt;
    public final java.lang.String copydefault;
    public final C45916tB djBIcL;
    public final java.util.List<java.lang.String> fIwbmz;
    public final C5173Hn fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final C48882ue isConnected;
    public final AbstractC47594tt valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tV$TaskDescription) A[MD:(o.tV$TaskDescription):void (m)] call: o.tV.<init>(o.tV$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C46456tV(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC47594tt AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47280tn EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47386tp copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> gEmmrt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45916tB valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48882ue values() {
        return this.isConnected;
    }

    public C46456tV(TaskDescription taskDescription) {
        this.copydefault = taskDescription.EZpvd();
        this.KWHzl = taskDescription.AEQbTJ();
        this.OLrzqt = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.djBIcL();
        this.AYXKKw = taskDescription.valueOf();
        this.gEmmrt = taskDescription.gEmmrt();
        this.valueOf = taskDescription.AhwBna();
        this.AhwBna = taskDescription.AYXKKw();
        this.djBIcL = taskDescription.values();
        this.AkhnZx = taskDescription.AkhnZx();
        this.isConnected = taskDescription.fetchVPNInfo();
        this.values = taskDescription.isConnected();
        this.fetchVPNInfo = taskDescription.DbNXlk();
        this.DbNXlk = taskDescription.fIwbmz();
        this.fIwbmz = taskDescription.fARcdN();
    }

    /* JADX INFO: renamed from: o.tV$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tV.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TextTranslationJobProperties(");
        sb.append("dataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobDetails=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("parallelDataNames=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("submittedTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("targetLanguageCodes=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyNames=");
        sb2.append(this.fIwbmz);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C47280tn c47280tn = this.OLrzqt;
        int iHashCode3 = c47280tn != null ? c47280tn.hashCode() : 0;
        C47386tp c47386tp = this.EZpvd;
        int iHashCode4 = c47386tp != null ? c47386tp.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.gEmmrt;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        AbstractC47594tt abstractC47594tt = this.valueOf;
        int iHashCode7 = abstractC47594tt != null ? abstractC47594tt.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        C45916tB c45916tB = this.djBIcL;
        int iHashCode9 = c45916tB != null ? c45916tB.hashCode() : 0;
        java.util.List<java.lang.String> list = this.AkhnZx;
        int iHashCode10 = list != null ? list.hashCode() : 0;
        C48882ue c48882ue = this.isConnected;
        int iHashCode11 = c48882ue != null ? c48882ue.hashCode() : 0;
        java.lang.String str5 = this.values;
        int iHashCode12 = str5 != null ? str5.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        int iHashCode13 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.util.List<java.lang.String> list2 = this.DbNXlk;
        int iHashCode14 = list2 != null ? list2.hashCode() : 0;
        java.util.List<java.lang.String> list3 = this.fIwbmz;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C46456tV.class != obj.getClass()) {
            return false;
        }
        C46456tV c46456tV = (C46456tV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c46456tV.copydefault) && Intrinsics.EZpvd(this.KWHzl, c46456tV.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c46456tV.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c46456tV.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c46456tV.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c46456tV.gEmmrt) && Intrinsics.EZpvd(this.valueOf, c46456tV.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c46456tV.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c46456tV.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, c46456tV.AkhnZx) && Intrinsics.EZpvd(this.isConnected, c46456tV.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) c46456tV.values) && Intrinsics.EZpvd(this.fetchVPNInfo, c46456tV.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, c46456tV.DbNXlk) && Intrinsics.EZpvd(this.fIwbmz, c46456tV.fIwbmz);
    }

    public static /* synthetic */ C46456tV copy$default(C46456tV c46456tV, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.TextTranslationJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C46456tV.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C46456tV.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c46456tV);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: renamed from: o.tV$TaskDescription */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public C45916tB AhwBna;
        public C48882ue AkhnZx;
        public java.util.List<java.lang.String> DbNXlk;
        public C5173Hn EZpvd;
        public C47280tn KWHzl;
        public java.lang.String OLrzqt;
        public C47386tp copydefault;
        public java.util.List<java.lang.String> djBIcL;
        public C5173Hn fetchVPNInfo;
        public AbstractC47594tt gEmmrt;
        public java.util.List<java.lang.String> isConnected;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<java.lang.String> list) {
            this.isConnected = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C48882ue c48882ue) {
            this.AkhnZx = c48882ue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC47594tt AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AkhnZx() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn DbNXlk() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.fetchVPNInfo = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<java.lang.String> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C47386tp c47386tp) {
            this.copydefault = c47386tp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC47594tt abstractC47594tt) {
            this.gEmmrt = abstractC47594tt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C47280tn OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<java.lang.String> list) {
            this.DbNXlk = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C47280tn c47280tn) {
            this.KWHzl = c47280tn;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C45916tB c45916tB) {
            this.AhwBna = c45916tB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C47386tp djBIcL() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> fARcdN() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> fIwbmz() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C48882ue fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C45916tB values() {
            return this.AhwBna;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C46456tV c46456tV) {
            this();
            Intrinsics.checkNotNullParameter(c46456tV, "");
            this.AEQbTJ = c46456tV.OLrzqt();
            this.EZpvd = c46456tV.KWHzl();
            this.KWHzl = c46456tV.EZpvd();
            this.copydefault = c46456tV.copydefault();
            this.OLrzqt = c46456tV.AEQbTJ();
            this.AYXKKw = c46456tV.djBIcL();
            this.gEmmrt = c46456tV.AYXKKw();
            this.valueOf = c46456tV.AhwBna();
            this.AhwBna = c46456tV.valueOf();
            this.djBIcL = c46456tV.gEmmrt();
            this.AkhnZx = c46456tV.values();
            this.values = c46456tV.fetchVPNInfo();
            this.fetchVPNInfo = c46456tV.AkhnZx();
            this.DbNXlk = c46456tV.isConnected();
            this.isConnected = c46456tV.DbNXlk();
        }

        public final C46456tV KWHzl() {
            return new C46456tV(this, null);
        }
    }
}

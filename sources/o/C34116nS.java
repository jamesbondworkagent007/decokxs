package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34116nS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34116nS {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final AbstractC36549od AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final java.util.List<C34735ni> KWHzl;
    public final java.lang.String OLrzqt;
    public final C33657nB copydefault;
    public final java.util.List<C36336oY> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nS$Activity) A[MD:(o.nS$Activity):void (m)] call: o.nS.<init>(o.nS$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34116nS(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34735ni> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36549od copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36336oY> djBIcL() {
        return this.gEmmrt;
    }

    public C34116nS(Activity activity) {
        this.KWHzl = activity.KWHzl();
        this.OLrzqt = activity.OLrzqt();
        this.copydefault = activity.copydefault();
        this.AEQbTJ = activity.AYXKKw();
        this.AYXKKw = activity.AhwBna();
        this.AhwBna = activity.djBIcL();
        this.gEmmrt = activity.valueOf();
    }

    /* JADX INFO: renamed from: o.nS$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nS.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetDocumentTextDetectionResponse(");
        sb.append("blocks=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("detectDocumentTextModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("warnings=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<C34735ni> list = this.KWHzl;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.copydefault;
        int iHashCode3 = c33657nB != null ? c33657nB.hashCode() : 0;
        AbstractC36549od abstractC36549od = this.AEQbTJ;
        int iHashCode4 = abstractC36549od != null ? abstractC36549od.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C36336oY> list2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34116nS.class != obj.getClass()) {
            return false;
        }
        C34116nS c34116nS = (C34116nS) obj;
        return Intrinsics.EZpvd(this.KWHzl, c34116nS.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34116nS.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c34116nS.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c34116nS.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c34116nS.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c34116nS.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, c34116nS.gEmmrt);
    }

    public static /* synthetic */ C34116nS copy$default(C34116nS c34116nS, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetDocumentTextDetectionResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34116nS.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34116nS.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(c34116nS);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    /* JADX INFO: renamed from: o.nS$Activity */
    public static final class Activity {
        public java.util.List<C34735ni> AEQbTJ;
        public AbstractC36549od EZpvd;
        public C33657nB KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<C36336oY> djBIcL;
        public java.lang.String gEmmrt;

        public final Activity AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C34735ni> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36549od AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C34735ni> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.util.List<C36336oY> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33657nB c33657nB) {
            this.KWHzl = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(AbstractC36549od abstractC36549od) {
            this.EZpvd = abstractC36549od;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36336oY> valueOf() {
            return this.djBIcL;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C34116nS c34116nS) {
            this();
            Intrinsics.checkNotNullParameter(c34116nS, "");
            this.AEQbTJ = c34116nS.OLrzqt();
            this.copydefault = c34116nS.KWHzl();
            this.KWHzl = c34116nS.EZpvd();
            this.EZpvd = c34116nS.copydefault();
            this.OLrzqt = c34116nS.AEQbTJ();
            this.gEmmrt = c34116nS.AhwBna();
            this.djBIcL = c34116nS.djBIcL();
        }

        public final C34116nS EZpvd() {
            return new C34116nS(this, null);
        }
    }
}

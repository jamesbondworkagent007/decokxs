package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34735ni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C34735ni {
    public static final Application EZpvd = new Application(null);
    public final java.lang.Integer AEQbTJ;
    public final C35688oA AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.Integer DbNXlk;
    public final java.lang.Integer KWHzl;
    public final AbstractC34788nj OLrzqt;
    public final java.lang.Float copydefault;
    public final java.lang.Integer djBIcL;
    public final AbstractC36174oS fIwbmz;
    public final java.util.List<C35823oF> fetchVPNInfo;
    public final C33954nM gEmmrt;
    public final java.lang.Integer isConnected;
    public final java.util.List<AbstractC33630nA> valueOf;
    public final AbstractC35715oB values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ni$TaskDescription) A[MD:(o.ni$TaskDescription):void (m)] call: o.ni.<init>(o.ni$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34735ni(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<AbstractC33630nA> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C35823oF> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AkhnZx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC35715oB DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC34788nj KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33954nM djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35688oA valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36174oS values() {
        return this.fIwbmz;
    }

    public C34735ni(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.copydefault();
        this.KWHzl = taskDescription.EZpvd();
        this.AEQbTJ = taskDescription.KWHzl();
        this.copydefault = taskDescription.AYXKKw();
        this.valueOf = taskDescription.djBIcL();
        this.gEmmrt = taskDescription.AhwBna();
        this.AhwBna = taskDescription.valueOf();
        this.djBIcL = taskDescription.gEmmrt();
        this.AYXKKw = taskDescription.DbNXlk();
        this.fetchVPNInfo = taskDescription.values();
        this.DbNXlk = taskDescription.fetchVPNInfo();
        this.isConnected = taskDescription.AkhnZx();
        this.values = taskDescription.isConnected();
        this.AkhnZx = taskDescription.AuCTel();
        this.fIwbmz = taskDescription.ejfBZ();
    }

    /* JADX INFO: renamed from: o.ni$Application */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ni.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Block(");
        sb.append("blockType=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("columnIndex=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("columnSpan=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("confidence=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("entityTypes=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("geometry=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("page=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("query=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("relationships=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("rowIndex=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        sb.append("rowSpan=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("selectionStatus=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("textType=");
        sb2.append(this.fIwbmz);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        AbstractC34788nj abstractC34788nj = this.OLrzqt;
        int iHashCode = abstractC34788nj != null ? abstractC34788nj.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.AEQbTJ;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Float f = this.copydefault;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.util.List<AbstractC33630nA> list = this.valueOf;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        C33954nM c33954nM = this.gEmmrt;
        int iHashCode4 = c33954nM != null ? c33954nM.hashCode() : 0;
        java.lang.String str = this.AhwBna;
        int iHashCode5 = str != null ? str.hashCode() : 0;
        java.lang.Integer num3 = this.djBIcL;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        C35688oA c35688oA = this.AYXKKw;
        int iHashCode6 = c35688oA != null ? c35688oA.hashCode() : 0;
        java.util.List<C35823oF> list2 = this.fetchVPNInfo;
        int iHashCode7 = list2 != null ? list2.hashCode() : 0;
        java.lang.Integer num4 = this.DbNXlk;
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        java.lang.Integer num5 = this.isConnected;
        int iIntValue5 = num5 != null ? num5.intValue() : 0;
        AbstractC35715oB abstractC35715oB = this.values;
        int iHashCode8 = abstractC35715oB != null ? abstractC35715oB.hashCode() : 0;
        java.lang.String str2 = this.AkhnZx;
        int iHashCode9 = str2 != null ? str2.hashCode() : 0;
        AbstractC36174oS abstractC36174oS = this.fIwbmz;
        return (((((((((((((((((((((((((((iHashCode * 31) + iIntValue) * 31) + iIntValue2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iIntValue3) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iIntValue4) * 31) + iIntValue5) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (abstractC36174oS != null ? abstractC36174oS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34735ni.class != obj.getClass()) {
            return false;
        }
        C34735ni c34735ni = (C34735ni) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c34735ni.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, c34735ni.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c34735ni.AEQbTJ) && Intrinsics.copydefault(this.copydefault, c34735ni.copydefault) && Intrinsics.EZpvd(this.valueOf, c34735ni.valueOf) && Intrinsics.EZpvd(this.gEmmrt, c34735ni.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c34735ni.AhwBna) && Intrinsics.EZpvd(this.djBIcL, c34735ni.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, c34735ni.AYXKKw) && Intrinsics.EZpvd(this.fetchVPNInfo, c34735ni.fetchVPNInfo) && Intrinsics.EZpvd(this.DbNXlk, c34735ni.DbNXlk) && Intrinsics.EZpvd(this.isConnected, c34735ni.isConnected) && Intrinsics.EZpvd(this.values, c34735ni.values) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c34735ni.AkhnZx) && Intrinsics.EZpvd(this.fIwbmz, c34735ni.fIwbmz);
    }

    public static /* synthetic */ C34735ni copy$default(C34735ni c34735ni, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.Block$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34735ni.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34735ni.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c34735ni);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.ni$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.Integer AEQbTJ;
        public java.util.List<C35823oF> AYXKKw;
        public C35688oA AhwBna;
        public AbstractC36174oS AkhnZx;
        public java.lang.String DbNXlk;
        public java.lang.Integer EZpvd;
        public AbstractC34788nj KWHzl;
        public java.util.List<? extends AbstractC33630nA> OLrzqt;
        public java.lang.Float copydefault;
        public C33954nM djBIcL;
        public java.lang.Integer fetchVPNInfo;
        public java.lang.Integer gEmmrt;
        public java.lang.Integer isConnected;
        public java.lang.String valueOf;
        public AbstractC35715oB values;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.Integer num) {
            this.gEmmrt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C35688oA c35688oA) {
            this.AhwBna = c35688oA;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33954nM AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C35688oA DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.isConnected = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(AbstractC36174oS abstractC36174oS) {
            this.AkhnZx = abstractC36174oS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.fetchVPNInfo = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<? extends AbstractC33630nA> list) {
            this.OLrzqt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC34788nj abstractC34788nj) {
            this.KWHzl = abstractC34788nj;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC35715oB abstractC35715oB) {
            this.values = abstractC35715oB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.Integer num) {
            this.AEQbTJ = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C35823oF> list) {
            this.AYXKKw = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC34788nj copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C33954nM c33954nM) {
            this.djBIcL = c33954nM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.nA>, java.util.List<o.nA> */
        public final java.util.List<AbstractC33630nA> djBIcL() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36174oS ejfBZ() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer fetchVPNInfo() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC35715oB isConnected() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C35823oF> values() {
            return this.AYXKKw;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C34735ni c34735ni) {
            this();
            Intrinsics.checkNotNullParameter(c34735ni, "");
            this.KWHzl = c34735ni.KWHzl();
            this.EZpvd = c34735ni.OLrzqt();
            this.AEQbTJ = c34735ni.copydefault();
            this.copydefault = c34735ni.EZpvd();
            this.OLrzqt = c34735ni.AEQbTJ();
            this.djBIcL = c34735ni.djBIcL();
            this.valueOf = c34735ni.AhwBna();
            this.gEmmrt = c34735ni.gEmmrt();
            this.AhwBna = c34735ni.valueOf();
            this.AYXKKw = c34735ni.AYXKKw();
            this.isConnected = c34735ni.isConnected();
            this.fetchVPNInfo = c34735ni.AkhnZx();
            this.values = c34735ni.DbNXlk();
            this.DbNXlk = c34735ni.fetchVPNInfo();
            this.AkhnZx = c34735ni.values();
        }

        public final C34735ni OLrzqt() {
            return new C34735ni(this, null);
        }
    }
}

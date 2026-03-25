package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.AbstractC7005ab;
import o.C5173Hn;
import o.ZoomButtonsController;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ZoomButtonsController {
    public static final TaskDescription copydefault = new TaskDescription(null);
    public final C5173Hn AEQbTJ;
    public final java.lang.String AYXKKw;
    public final C7079ad AhwBna;
    public final C5173Hn EZpvd;
    public final C7132ae KWHzl;
    public final X OLrzqt;
    public final java.lang.String djBIcL;
    public final C7344ai fetchVPNInfo;
    public final C7291ah gEmmrt;
    public final C7185af isConnected;
    public final java.lang.String valueOf;
    public final AbstractC7005ab values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ZoomButtonsController$ActionBar) A[MD:(o.ZoomButtonsController$ActionBar):void (m)] call: o.ZoomButtonsController.<init>(o.ZoomButtonsController$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ZoomButtonsController(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7185af AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7344ai AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7132ae EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7079ad djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C7291ah gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC7005ab values() {
        return this.values;
    }

    public ZoomButtonsController(ActionBar actionBar) {
        this.EZpvd = actionBar.EZpvd();
        C5173Hn c5173HnCopydefault = actionBar.copydefault();
        if (c5173HnCopydefault == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for creationTimestamp".toString());
        }
        this.AEQbTJ = c5173HnCopydefault;
        this.KWHzl = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.AYXKKw();
        java.lang.String strDjBIcL = actionBar.djBIcL();
        if (strDjBIcL == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for jobId".toString());
        }
        this.AYXKKw = strDjBIcL;
        this.djBIcL = actionBar.gEmmrt();
        this.valueOf = actionBar.valueOf();
        this.AhwBna = actionBar.AhwBna();
        this.gEmmrt = actionBar.DbNXlk();
        this.isConnected = actionBar.isConnected();
        this.fetchVPNInfo = actionBar.values();
        AbstractC7005ab abstractC7005abAkhnZx = actionBar.AkhnZx();
        if (abstractC7005abAkhnZx == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for status".toString());
        }
        this.values = abstractC7005abAkhnZx;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ZoomButtonsController.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetMediaAnalysisJobResponse(");
        sb.append("completionTimestamp=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("creationTimestamp=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("failureDetails=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("input=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("manifestSummary=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("operationsConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("outputConfig=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("results=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("status=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        int iHashCode2 = this.AEQbTJ.hashCode();
        C7132ae c7132ae = this.KWHzl;
        int iHashCode3 = c7132ae != null ? c7132ae.hashCode() : 0;
        X x = this.OLrzqt;
        int iHashCode4 = x != null ? x.hashCode() : 0;
        int iHashCode5 = this.AYXKKw.hashCode();
        java.lang.String str = this.djBIcL;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.valueOf;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        C7079ad c7079ad = this.AhwBna;
        int iHashCode8 = c7079ad != null ? c7079ad.hashCode() : 0;
        C7291ah c7291ah = this.gEmmrt;
        int iHashCode9 = c7291ah != null ? c7291ah.hashCode() : 0;
        C7185af c7185af = this.isConnected;
        int iHashCode10 = c7185af != null ? c7185af.hashCode() : 0;
        C7344ai c7344ai = this.fetchVPNInfo;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (c7344ai != null ? c7344ai.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ZoomButtonsController.class != obj.getClass()) {
            return false;
        }
        ZoomButtonsController zoomButtonsController = (ZoomButtonsController) obj;
        return Intrinsics.EZpvd(this.EZpvd, zoomButtonsController.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, zoomButtonsController.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, zoomButtonsController.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, zoomButtonsController.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) zoomButtonsController.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) zoomButtonsController.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) zoomButtonsController.valueOf) && Intrinsics.EZpvd(this.AhwBna, zoomButtonsController.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, zoomButtonsController.gEmmrt) && Intrinsics.EZpvd(this.isConnected, zoomButtonsController.isConnected) && Intrinsics.EZpvd(this.fetchVPNInfo, zoomButtonsController.fetchVPNInfo) && Intrinsics.EZpvd(this.values, zoomButtonsController.values);
    }

    public static /* synthetic */ ZoomButtonsController copy$default(ZoomButtonsController zoomButtonsController, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.GetMediaAnalysisJobResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ZoomButtonsController.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ZoomButtonsController.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(zoomButtonsController);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public C7185af AYXKKw;
        public java.lang.String AhwBna;
        public C7344ai AkhnZx;
        public X EZpvd;
        public C5173Hn KWHzl;
        public C7132ae OLrzqt;
        public C5173Hn copydefault;
        public C7291ah djBIcL;
        public java.lang.String gEmmrt;
        public AbstractC7005ab isConnected;
        public C7079ad valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7132ae AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC7005ab abstractC7005ab) {
            this.isConnected = abstractC7005ab;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final X AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7079ad AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC7005ab AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7291ah DbNXlk() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C7079ad c7079ad) {
            this.valueOf = c7079ad;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C7132ae c7132ae) {
            this.OLrzqt = c7132ae;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(X x) {
            this.EZpvd = x;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C7185af c7185af) {
            this.AYXKKw = c7185af;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C7344ai c7344ai) {
            this.AkhnZx = c7344ai;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.KWHzl = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C7291ah c7291ah) {
            this.djBIcL = c7291ah;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7185af isConnected() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C7344ai values() {
            return this.AkhnZx;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull ZoomButtonsController zoomButtonsController) {
            this();
            Intrinsics.checkNotNullParameter(zoomButtonsController, "");
            this.KWHzl = zoomButtonsController.AEQbTJ();
            this.copydefault = zoomButtonsController.KWHzl();
            this.OLrzqt = zoomButtonsController.EZpvd();
            this.EZpvd = zoomButtonsController.copydefault();
            this.AEQbTJ = zoomButtonsController.OLrzqt();
            this.gEmmrt = zoomButtonsController.AhwBna();
            this.AhwBna = zoomButtonsController.valueOf();
            this.valueOf = zoomButtonsController.djBIcL();
            this.djBIcL = zoomButtonsController.gEmmrt();
            this.AYXKKw = zoomButtonsController.AYXKKw();
            this.AkhnZx = zoomButtonsController.AkhnZx();
            this.isConnected = zoomButtonsController.values();
        }

        public final ZoomButtonsController KWHzl() {
            return new ZoomButtonsController(this, null);
        }

        public final ActionBar OLrzqt() {
            if (this.copydefault == null) {
                this.copydefault = C5173Hn.ActionBar.fromEpochSeconds$default(C5173Hn.AEQbTJ, 0L, 0, 2, null);
            }
            if (this.AEQbTJ == null) {
                this.AEQbTJ = "";
            }
            if (this.isConnected == null) {
                this.isConnected = new AbstractC7005ab.Dialog("no value provided");
            }
            return this;
        }
    }
}

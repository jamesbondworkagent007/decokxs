package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.MenuPopupWindow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class MenuPopupWindow {
    public static final Activity KWHzl = new Activity(null);
    public final C9145bQ AEQbTJ;
    public final C9092bP AYXKKw;
    public final C5173Hn AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final C5173Hn EZpvd;
    public final java.lang.String OLrzqt;
    public final C8986bN copydefault;
    public final C8933bM djBIcL;
    public final java.lang.String fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final AbstractC9410bV isConnected;
    public final java.util.List<C6158aK> valueOf;
    public final C9304bT values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.MenuPopupWindow$ActionBar) A[MD:(o.MenuPopupWindow$ActionBar):void (m)] call: o.MenuPopupWindow.<init>(o.MenuPopupWindow$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ MenuPopupWindow(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8986bN AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9092bP AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C6158aK> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9145bQ copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8933bM gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C9304bT isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC9410bV values() {
        return this.isConnected;
    }

    public MenuPopupWindow(ActionBar actionBar) {
        this.EZpvd = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.EZpvd();
        this.copydefault = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.valueOf();
        this.AhwBna = actionBar.AhwBna();
        this.gEmmrt = actionBar.gEmmrt();
        this.AYXKKw = actionBar.AYXKKw();
        this.djBIcL = actionBar.djBIcL();
        this.valueOf = actionBar.fetchVPNInfo();
        this.fetchVPNInfo = actionBar.DbNXlk();
        this.values = actionBar.values();
        this.isConnected = actionBar.AkhnZx();
        this.DbNXlk = actionBar.isConnected();
        this.AkhnZx = actionBar.AuCTel();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.MenuPopupWindow.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DescribeStreamProcessorResponse(");
        sb.append("creationTimestamp=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataSharingPreference=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("input=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("kmsKeyId=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("lastUpdateTimestamp=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("notificationChannel=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("output=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("regionsOfInterest=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("roleArn=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("settings=" + this.values + AbstractJsonLexerKt.COMMA);
        sb.append("status=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("streamProcessorArn=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C5173Hn c5173Hn = this.EZpvd;
        int iHashCode = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C9145bQ c9145bQ = this.AEQbTJ;
        int iHashCode2 = c9145bQ != null ? c9145bQ.hashCode() : 0;
        C8986bN c8986bN = this.copydefault;
        int iHashCode3 = c8986bN != null ? c8986bN.hashCode() : 0;
        java.lang.String str = this.OLrzqt;
        int iHashCode4 = str != null ? str.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AhwBna;
        int iHashCode5 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str2 = this.gEmmrt;
        int iHashCode6 = str2 != null ? str2.hashCode() : 0;
        C9092bP c9092bP = this.AYXKKw;
        int iHashCode7 = c9092bP != null ? c9092bP.hashCode() : 0;
        C8933bM c8933bM = this.djBIcL;
        int iHashCode8 = c8933bM != null ? c8933bM.hashCode() : 0;
        java.util.List<C6158aK> list = this.valueOf;
        int iHashCode9 = list != null ? list.hashCode() : 0;
        java.lang.String str3 = this.fetchVPNInfo;
        int iHashCode10 = str3 != null ? str3.hashCode() : 0;
        C9304bT c9304bT = this.values;
        int iHashCode11 = c9304bT != null ? c9304bT.hashCode() : 0;
        AbstractC9410bV abstractC9410bV = this.isConnected;
        int iHashCode12 = abstractC9410bV != null ? abstractC9410bV.hashCode() : 0;
        java.lang.String str4 = this.DbNXlk;
        int iHashCode13 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.AkhnZx;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MenuPopupWindow.class != obj.getClass()) {
            return false;
        }
        MenuPopupWindow menuPopupWindow = (MenuPopupWindow) obj;
        return Intrinsics.EZpvd(this.EZpvd, menuPopupWindow.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, menuPopupWindow.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, menuPopupWindow.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) menuPopupWindow.OLrzqt) && Intrinsics.EZpvd(this.AhwBna, menuPopupWindow.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) menuPopupWindow.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, menuPopupWindow.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, menuPopupWindow.djBIcL) && Intrinsics.EZpvd(this.valueOf, menuPopupWindow.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) menuPopupWindow.fetchVPNInfo) && Intrinsics.EZpvd(this.values, menuPopupWindow.values) && Intrinsics.EZpvd(this.isConnected, menuPopupWindow.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) menuPopupWindow.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) menuPopupWindow.AkhnZx);
    }

    public static /* synthetic */ MenuPopupWindow copy$default(MenuPopupWindow menuPopupWindow, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.DescribeStreamProcessorResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MenuPopupWindow.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MenuPopupWindow.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(menuPopupWindow);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String AkhnZx;
        public AbstractC9410bV DbNXlk;
        public C5173Hn EZpvd;
        public C9145bQ KWHzl;
        public C8986bN OLrzqt;
        public C5173Hn copydefault;
        public java.util.List<C6158aK> djBIcL;
        public C9304bT fetchVPNInfo;
        public C9092bP gEmmrt;
        public C8933bM valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8986bN AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9092bP AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AhwBna() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC9410bV AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AuCTel() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9145bQ EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C5173Hn c5173Hn) {
            this.EZpvd = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(C9145bQ c9145bQ) {
            this.KWHzl = c9145bQ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AkhnZx = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C6158aK> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C9092bP c9092bP) {
            this.gEmmrt = c9092bP;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C9304bT c9304bT) {
            this.fetchVPNInfo = c9304bT;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC9410bV abstractC9410bV) {
            this.DbNXlk = abstractC9410bV;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.copydefault = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C8986bN c8986bN) {
            this.OLrzqt = c8986bN;
        }

        public final ActionBar copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(C8933bM c8933bM) {
            this.valueOf = c8933bM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C8933bM djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C6158aK> fetchVPNInfo() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String isConnected() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C9304bT values() {
            return this.fetchVPNInfo;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull MenuPopupWindow menuPopupWindow) {
            this();
            Intrinsics.checkNotNullParameter(menuPopupWindow, "");
            this.copydefault = menuPopupWindow.EZpvd();
            this.KWHzl = menuPopupWindow.copydefault();
            this.OLrzqt = menuPopupWindow.AEQbTJ();
            this.AEQbTJ = menuPopupWindow.KWHzl();
            this.EZpvd = menuPopupWindow.OLrzqt();
            this.AYXKKw = menuPopupWindow.valueOf();
            this.gEmmrt = menuPopupWindow.AYXKKw();
            this.valueOf = menuPopupWindow.gEmmrt();
            this.djBIcL = menuPopupWindow.AhwBna();
            this.AhwBna = menuPopupWindow.djBIcL();
            this.fetchVPNInfo = menuPopupWindow.isConnected();
            this.DbNXlk = menuPopupWindow.values();
            this.AkhnZx = menuPopupWindow.fetchVPNInfo();
            this.values = menuPopupWindow.AkhnZx();
        }

        public final MenuPopupWindow KWHzl() {
            return new MenuPopupWindow(this, null);
        }
    }
}

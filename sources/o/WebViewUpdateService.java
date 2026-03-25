package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewUpdateService;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WebViewUpdateService {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String AYXKKw;
    public final C44009s EZpvd;
    public final ActionMenuView KWHzl;
    public final java.lang.Float OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<java.lang.String> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewUpdateService$ActionBar) A[MD:(o.WebViewUpdateService$ActionBar):void (m)] call: o.WebViewUpdateService.<init>(o.WebViewUpdateService$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewUpdateService(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionMenuView AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44009s OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> gEmmrt() {
        return this.gEmmrt;
    }

    public WebViewUpdateService(ActionBar actionBar) {
        this.KWHzl = actionBar.OLrzqt();
        this.copydefault = actionBar.KWHzl();
        this.EZpvd = actionBar.copydefault();
        this.OLrzqt = actionBar.gEmmrt();
        this.AYXKKw = actionBar.AYXKKw();
        this.gEmmrt = actionBar.AhwBna();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewUpdateService.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Celebrity(");
        sb.append("face=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("id=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("knownGender=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("matchConfidence=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("name=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("urls=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ActionMenuView actionMenuView = this.KWHzl;
        int iHashCode = actionMenuView != null ? actionMenuView.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        C44009s c44009s = this.EZpvd;
        int iHashCode3 = c44009s != null ? c44009s.hashCode() : 0;
        java.lang.Float f = this.OLrzqt;
        int iHashCode4 = f != null ? f.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.util.List<java.lang.String> list = this.gEmmrt;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewUpdateService.class != obj.getClass()) {
            return false;
        }
        WebViewUpdateService webViewUpdateService = (WebViewUpdateService) obj;
        return Intrinsics.EZpvd(this.KWHzl, webViewUpdateService.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) webViewUpdateService.copydefault) && Intrinsics.EZpvd(this.EZpvd, webViewUpdateService.EZpvd) && Intrinsics.copydefault(this.OLrzqt, webViewUpdateService.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) webViewUpdateService.AYXKKw) && Intrinsics.EZpvd(this.gEmmrt, webViewUpdateService.gEmmrt);
    }

    public static /* synthetic */ WebViewUpdateService copy$default(WebViewUpdateService webViewUpdateService, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.Celebrity$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewUpdateService.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewUpdateService.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(webViewUpdateService);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class ActionBar {
        public C44009s AEQbTJ;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public ActionMenuView OLrzqt;
        public java.lang.Float copydefault;
        public java.util.List<java.lang.String> djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<java.lang.String> list) {
            this.djBIcL = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C44009s c44009s) {
            this.AEQbTJ = c44009s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> AhwBna() {
            return this.djBIcL;
        }

        public final ActionBar EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionMenuView OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C44009s copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ActionMenuView actionMenuView) {
            this.OLrzqt = actionMenuView;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float gEmmrt() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull WebViewUpdateService webViewUpdateService) {
            this();
            Intrinsics.checkNotNullParameter(webViewUpdateService, "");
            this.OLrzqt = webViewUpdateService.AEQbTJ();
            this.EZpvd = webViewUpdateService.KWHzl();
            this.AEQbTJ = webViewUpdateService.OLrzqt();
            this.copydefault = webViewUpdateService.EZpvd();
            this.KWHzl = webViewUpdateService.copydefault();
            this.djBIcL = webViewUpdateService.gEmmrt();
        }

        public final WebViewUpdateService AEQbTJ() {
            return new WebViewUpdateService(this, null);
        }
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WebViewFragment;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WebViewFragment {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final WebViewZygote AEQbTJ;
    public final byte[] EZpvd;
    public final C6582aS OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WebViewFragment$ActionBar) A[MD:(o.WebViewFragment$ActionBar):void (m)] call: o.WebViewFragment.<init>(o.WebViewFragment$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WebViewFragment(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebViewZygote OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C6582aS copydefault() {
        return this.OLrzqt;
    }

    public WebViewFragment(ActionBar actionBar) {
        this.AEQbTJ = actionBar.OLrzqt();
        this.EZpvd = actionBar.AEQbTJ();
        this.OLrzqt = actionBar.EZpvd();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WebViewFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AuditImage(");
        sb.append("boundingBox=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("bytes=*** Sensitive Data Redacted ***,");
        sb.append("s3Object=" + this.OLrzqt);
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        WebViewZygote webViewZygote = this.AEQbTJ;
        int iHashCode = webViewZygote != null ? webViewZygote.hashCode() : 0;
        byte[] bArr = this.EZpvd;
        int iHashCode2 = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        C6582aS c6582aS = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (c6582aS != null ? c6582aS.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WebViewFragment.class != obj.getClass()) {
            return false;
        }
        WebViewFragment webViewFragment = (WebViewFragment) obj;
        if (!Intrinsics.EZpvd(this.AEQbTJ, webViewFragment.AEQbTJ)) {
            return false;
        }
        byte[] bArr = this.EZpvd;
        if (bArr != null) {
            byte[] bArr2 = webViewFragment.EZpvd;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (webViewFragment.EZpvd != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.OLrzqt, webViewFragment.OLrzqt);
    }

    public static /* synthetic */ WebViewFragment copy$default(WebViewFragment webViewFragment, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.AuditImage$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WebViewFragment.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WebViewFragment.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(webViewFragment);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public WebViewZygote KWHzl;
        public byte[] OLrzqt;
        public C6582aS copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(WebViewZygote webViewZygote) {
            this.KWHzl = webViewZygote;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C6582aS EZpvd() {
            return this.copydefault;
        }

        public final ActionBar KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C6582aS c6582aS) {
            this.copydefault = c6582aS;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WebViewZygote OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(byte[] bArr) {
            this.OLrzqt = bArr;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull WebViewFragment webViewFragment) {
            this();
            Intrinsics.checkNotNullParameter(webViewFragment, "");
            this.KWHzl = webViewFragment.OLrzqt();
            this.OLrzqt = webViewFragment.AEQbTJ();
            this.copydefault = webViewFragment.copydefault();
        }

        public final WebViewFragment copydefault() {
            return new WebViewFragment(this, null);
        }
    }
}

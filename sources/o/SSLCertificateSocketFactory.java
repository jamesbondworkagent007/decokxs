package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SSLCertificateSocketFactory;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SSLCertificateSocketFactory {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final byte[] AEQbTJ;
    public final HandlerThread EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SSLCertificateSocketFactory$ActionBar) A[MD:(o.SSLCertificateSocketFactory$ActionBar):void (m)] call: o.SSLCertificateSocketFactory.<init>(o.SSLCertificateSocketFactory$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SSLCertificateSocketFactory(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandlerThread AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.AEQbTJ;
    }

    public SSLCertificateSocketFactory(ActionBar actionBar) {
        this.AEQbTJ = actionBar.KWHzl();
        this.EZpvd = actionBar.OLrzqt();
        this.copydefault = actionBar.EZpvd();
        this.OLrzqt = actionBar.copydefault();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SSLCertificateSocketFactory.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClassifyDocumentRequest(");
        sb.append("bytes=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documentReaderConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endpointArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("text=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        byte[] bArr = this.AEQbTJ;
        int iHashCode = bArr != null ? java.util.Arrays.hashCode(bArr) : 0;
        HandlerThread handlerThread = this.EZpvd;
        int iHashCode2 = handlerThread != null ? handlerThread.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SSLCertificateSocketFactory.class != obj.getClass()) {
            return false;
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) obj;
        byte[] bArr = this.AEQbTJ;
        if (bArr != null) {
            byte[] bArr2 = sSLCertificateSocketFactory.AEQbTJ;
            if (bArr2 == null || !java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (sSLCertificateSocketFactory.AEQbTJ != null) {
            return false;
        }
        return Intrinsics.EZpvd(this.EZpvd, sSLCertificateSocketFactory.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) sSLCertificateSocketFactory.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) sSLCertificateSocketFactory.OLrzqt);
    }

    public static /* synthetic */ SSLCertificateSocketFactory copy$default(SSLCertificateSocketFactory sSLCertificateSocketFactory, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ClassifyDocumentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SSLCertificateSocketFactory.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SSLCertificateSocketFactory.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(sSLCertificateSocketFactory);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public HandlerThread KWHzl;
        public byte[] OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final byte[] KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HandlerThread OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull SSLCertificateSocketFactory sSLCertificateSocketFactory) {
            this();
            Intrinsics.checkNotNullParameter(sSLCertificateSocketFactory, "");
            this.OLrzqt = sSLCertificateSocketFactory.copydefault();
            this.KWHzl = sSLCertificateSocketFactory.AEQbTJ();
            this.AEQbTJ = sSLCertificateSocketFactory.OLrzqt();
            this.copydefault = sSLCertificateSocketFactory.KWHzl();
        }

        public final SSLCertificateSocketFactory AEQbTJ() {
            return new SSLCertificateSocketFactory(this, null);
        }
    }
}

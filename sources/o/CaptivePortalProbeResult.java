package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CaptivePortalProbeResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CaptivePortalProbeResult {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final ContactsContract AkhnZx;
    public final ParcelUuid EZpvd;
    public final SynchronousResultReceiver KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final java.util.List<PrinterDiscoverySession> gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CaptivePortalProbeResult$Application) A[MD:(o.CaptivePortalProbeResult$Application):void (m)] call: o.CaptivePortalProbeResult.<init>(o.CaptivePortalProbeResult$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CaptivePortalProbeResult(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ParcelUuid copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public CaptivePortalProbeResult(Application application) {
        this.AEQbTJ = application.copydefault();
        this.OLrzqt = application.OLrzqt();
        this.EZpvd = application.AEQbTJ();
        this.KWHzl = application.EZpvd();
        this.djBIcL = application.gEmmrt();
        this.AYXKKw = application.valueOf();
        this.valueOf = application.djBIcL();
        this.gEmmrt = application.AhwBna();
        this.AhwBna = application.AYXKKw();
        this.isConnected = application.AkhnZx();
        this.AkhnZx = application.fetchVPNInfo();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CaptivePortalProbeResult.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateEntityRecognizerRequest(");
        sb.append("clientRequestToken=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("modelKmsKeyId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("modelPolicy=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("recognizerName=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("versionName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.isConnected + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.AkhnZx);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ParcelUuid parcelUuid = this.EZpvd;
        int iHashCode3 = parcelUuid != null ? parcelUuid.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.KWHzl;
        int iHashCode4 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.gEmmrt;
        int iHashCode8 = list != null ? list.hashCode() : 0;
        java.lang.String str6 = this.AhwBna;
        int iHashCode9 = str6 != null ? str6.hashCode() : 0;
        java.lang.String str7 = this.isConnected;
        int iHashCode10 = str7 != null ? str7.hashCode() : 0;
        ContactsContract contactsContract = this.AkhnZx;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CaptivePortalProbeResult.class != obj.getClass()) {
            return false;
        }
        CaptivePortalProbeResult captivePortalProbeResult = (CaptivePortalProbeResult) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) captivePortalProbeResult.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) captivePortalProbeResult.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, captivePortalProbeResult.EZpvd) && Intrinsics.EZpvd(this.KWHzl, captivePortalProbeResult.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) captivePortalProbeResult.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) captivePortalProbeResult.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) captivePortalProbeResult.valueOf) && Intrinsics.EZpvd(this.gEmmrt, captivePortalProbeResult.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) captivePortalProbeResult.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) captivePortalProbeResult.isConnected) && Intrinsics.EZpvd(this.AkhnZx, captivePortalProbeResult.AkhnZx);
    }

    public static /* synthetic */ CaptivePortalProbeResult copy$default(CaptivePortalProbeResult captivePortalProbeResult, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.CreateEntityRecognizerRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CaptivePortalProbeResult.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CaptivePortalProbeResult.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(captivePortalProbeResult);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public SynchronousResultReceiver AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String AhwBna;
        public java.lang.String EZpvd;
        public ParcelUuid KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public java.lang.String gEmmrt;
        public java.util.List<PrinterDiscoverySession> valueOf;
        public ContactsContract values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ParcelUuid AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract fetchVPNInfo() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull CaptivePortalProbeResult captivePortalProbeResult) {
            this();
            Intrinsics.checkNotNullParameter(captivePortalProbeResult, "");
            this.OLrzqt = captivePortalProbeResult.AEQbTJ();
            this.EZpvd = captivePortalProbeResult.EZpvd();
            this.KWHzl = captivePortalProbeResult.copydefault();
            this.AEQbTJ = captivePortalProbeResult.KWHzl();
            this.copydefault = captivePortalProbeResult.OLrzqt();
            this.gEmmrt = captivePortalProbeResult.AYXKKw();
            this.AYXKKw = captivePortalProbeResult.valueOf();
            this.valueOf = captivePortalProbeResult.djBIcL();
            this.djBIcL = captivePortalProbeResult.AhwBna();
            this.AhwBna = captivePortalProbeResult.gEmmrt();
            this.values = captivePortalProbeResult.isConnected();
        }

        public final CaptivePortalProbeResult KWHzl() {
            return new CaptivePortalProbeResult(this, null);
        }
    }
}

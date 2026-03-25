package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CaptivePortalProbeSpec;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CaptivePortalProbeSpec {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final Debug AhwBna;
    public final java.lang.String AkhnZx;
    public final java.lang.String DbNXlk;
    public final java.lang.String KWHzl;
    public final DeviceIdleManager OLrzqt;
    public final java.lang.String copydefault;
    public final DropBoxManager djBIcL;
    public final java.util.List<PrinterDiscoverySession> fetchVPNInfo;
    public final SynchronousResultReceiver gEmmrt;
    public final java.lang.String valueOf;
    public final ContactsContract values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CaptivePortalProbeSpec$StateListAnimator) A[MD:(o.CaptivePortalProbeSpec$StateListAnimator):void (m)] call: o.CaptivePortalProbeSpec.<init>(o.CaptivePortalProbeSpec$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CaptivePortalProbeSpec(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Debug AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeviceIdleManager EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> djBIcL() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DropBoxManager gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.AkhnZx;
    }

    public CaptivePortalProbeSpec(StateListAnimator stateListAnimator) {
        this.KWHzl = stateListAnimator.OLrzqt();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.copydefault = stateListAnimator.copydefault();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.gEmmrt = stateListAnimator.AYXKKw();
        this.djBIcL = stateListAnimator.djBIcL();
        this.AYXKKw = stateListAnimator.gEmmrt();
        this.valueOf = stateListAnimator.valueOf();
        this.AhwBna = stateListAnimator.AhwBna();
        this.fetchVPNInfo = stateListAnimator.isConnected();
        this.AkhnZx = stateListAnimator.AkhnZx();
        this.DbNXlk = stateListAnimator.DbNXlk();
        this.values = stateListAnimator.values();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CaptivePortalProbeSpec.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDocumentClassifierRequest(");
        sb.append("clientRequestToken=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documentClassifierName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("mode=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("modelKmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("modelPolicy=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("versionName=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.DbNXlk + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.values);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        DeviceIdleManager deviceIdleManager = this.OLrzqt;
        int iHashCode4 = deviceIdleManager != null ? deviceIdleManager.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.gEmmrt;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        DropBoxManager dropBoxManager = this.djBIcL;
        int iHashCode6 = dropBoxManager != null ? dropBoxManager.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        Debug debug = this.AhwBna;
        int iHashCode9 = debug != null ? debug.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.fetchVPNInfo;
        int iHashCode10 = list != null ? list.hashCode() : 0;
        java.lang.String str6 = this.AkhnZx;
        int iHashCode11 = str6 != null ? str6.hashCode() : 0;
        java.lang.String str7 = this.DbNXlk;
        int iHashCode12 = str7 != null ? str7.hashCode() : 0;
        ContactsContract contactsContract = this.values;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CaptivePortalProbeSpec.class != obj.getClass()) {
            return false;
        }
        CaptivePortalProbeSpec captivePortalProbeSpec = (CaptivePortalProbeSpec) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) captivePortalProbeSpec.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) captivePortalProbeSpec.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) captivePortalProbeSpec.copydefault) && Intrinsics.EZpvd(this.OLrzqt, captivePortalProbeSpec.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, captivePortalProbeSpec.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, captivePortalProbeSpec.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) captivePortalProbeSpec.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) captivePortalProbeSpec.valueOf) && Intrinsics.EZpvd(this.AhwBna, captivePortalProbeSpec.AhwBna) && Intrinsics.EZpvd(this.fetchVPNInfo, captivePortalProbeSpec.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) captivePortalProbeSpec.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) captivePortalProbeSpec.DbNXlk) && Intrinsics.EZpvd(this.values, captivePortalProbeSpec.values);
    }

    public static /* synthetic */ CaptivePortalProbeSpec copy$default(CaptivePortalProbeSpec captivePortalProbeSpec, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.CreateDocumentClassifierRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CaptivePortalProbeSpec.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CaptivePortalProbeSpec.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(captivePortalProbeSpec);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public DeviceIdleManager AEQbTJ;
        public Debug AYXKKw;
        public java.lang.String AhwBna;
        public ContactsContract DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public SynchronousResultReceiver copydefault;
        public DropBoxManager djBIcL;
        public java.lang.String fetchVPNInfo;
        public java.util.List<PrinterDiscoverySession> gEmmrt;
        public java.lang.String valueOf;
        public java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Debug AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeviceIdleManager KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DropBoxManager djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> isConnected() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract values() {
            return this.DbNXlk;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull CaptivePortalProbeSpec captivePortalProbeSpec) {
            this();
            Intrinsics.checkNotNullParameter(captivePortalProbeSpec, "");
            this.OLrzqt = captivePortalProbeSpec.AEQbTJ();
            this.KWHzl = captivePortalProbeSpec.copydefault();
            this.EZpvd = captivePortalProbeSpec.OLrzqt();
            this.AEQbTJ = captivePortalProbeSpec.EZpvd();
            this.copydefault = captivePortalProbeSpec.KWHzl();
            this.djBIcL = captivePortalProbeSpec.gEmmrt();
            this.AhwBna = captivePortalProbeSpec.AhwBna();
            this.valueOf = captivePortalProbeSpec.valueOf();
            this.AYXKKw = captivePortalProbeSpec.AYXKKw();
            this.gEmmrt = captivePortalProbeSpec.djBIcL();
            this.fetchVPNInfo = captivePortalProbeSpec.values();
            this.values = captivePortalProbeSpec.DbNXlk();
            this.DbNXlk = captivePortalProbeSpec.AkhnZx();
        }

        public final CaptivePortalProbeSpec EZpvd() {
            return new CaptivePortalProbeSpec(this, null);
        }
    }
}

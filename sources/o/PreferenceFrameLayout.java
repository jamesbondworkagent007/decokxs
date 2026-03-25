package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PreferenceFrameLayout;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PreferenceFrameLayout {
    public static final Application KWHzl = new Application(null);
    public final ServiceManagerNative AEQbTJ;
    public final java.lang.String AYXKKw;
    public final StorageManagerInternal AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final SynchronousResultReceiver djBIcL;
    public final java.util.List<PrinterDiscoverySession> gEmmrt;
    public final ContactsContract valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PreferenceFrameLayout$StateListAnimator) A[MD:(o.PreferenceFrameLayout$StateListAnimator):void (m)] call: o.PreferenceFrameLayout.<init>(o.PreferenceFrameLayout$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PreferenceFrameLayout(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal valueOf() {
        return this.AhwBna;
    }

    public PreferenceFrameLayout(StateListAnimator stateListAnimator) {
        this.EZpvd = stateListAnimator.EZpvd();
        this.copydefault = stateListAnimator.copydefault();
        this.AEQbTJ = stateListAnimator.AEQbTJ();
        this.OLrzqt = stateListAnimator.KWHzl();
        this.djBIcL = stateListAnimator.gEmmrt();
        this.AhwBna = stateListAnimator.AhwBna();
        this.gEmmrt = stateListAnimator.djBIcL();
        this.AYXKKw = stateListAnimator.valueOf();
        this.valueOf = stateListAnimator.AYXKKw();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PreferenceFrameLayout.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTargetedSentimentDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AEQbTJ;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.OLrzqt;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.djBIcL;
        int iHashCode5 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.AhwBna;
        int iHashCode6 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.gEmmrt;
        int iHashCode7 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.AYXKKw;
        int iHashCode8 = str4 != null ? str4.hashCode() : 0;
        ContactsContract contactsContract = this.valueOf;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PreferenceFrameLayout.class != obj.getClass()) {
            return false;
        }
        PreferenceFrameLayout preferenceFrameLayout = (PreferenceFrameLayout) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) preferenceFrameLayout.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) preferenceFrameLayout.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, preferenceFrameLayout.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) preferenceFrameLayout.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, preferenceFrameLayout.djBIcL) && Intrinsics.EZpvd(this.AhwBna, preferenceFrameLayout.AhwBna) && Intrinsics.EZpvd(this.gEmmrt, preferenceFrameLayout.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) preferenceFrameLayout.AYXKKw) && Intrinsics.EZpvd(this.valueOf, preferenceFrameLayout.valueOf);
    }

    public static /* synthetic */ PreferenceFrameLayout copy$default(PreferenceFrameLayout preferenceFrameLayout, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartTargetedSentimentDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PreferenceFrameLayout.StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PreferenceFrameLayout.StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(preferenceFrameLayout);
        function1.invoke(stateListAnimator);
        return stateListAnimator.OLrzqt();
    }

    public static final class StateListAnimator {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AhwBna;
        public ServiceManagerNative EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public SynchronousResultReceiver copydefault;
        public ContactsContract djBIcL;
        public StorageManagerInternal gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver gEmmrt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.valueOf;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PreferenceFrameLayout preferenceFrameLayout) {
            this();
            Intrinsics.checkNotNullParameter(preferenceFrameLayout, "");
            this.KWHzl = preferenceFrameLayout.KWHzl();
            this.AEQbTJ = preferenceFrameLayout.OLrzqt();
            this.EZpvd = preferenceFrameLayout.EZpvd();
            this.OLrzqt = preferenceFrameLayout.AEQbTJ();
            this.copydefault = preferenceFrameLayout.copydefault();
            this.gEmmrt = preferenceFrameLayout.valueOf();
            this.AhwBna = preferenceFrameLayout.gEmmrt();
            this.valueOf = preferenceFrameLayout.djBIcL();
            this.djBIcL = preferenceFrameLayout.AYXKKw();
        }

        public final PreferenceFrameLayout OLrzqt() {
            return new PreferenceFrameLayout(this, null);
        }
    }
}

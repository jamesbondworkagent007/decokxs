package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.EditTextPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class EditTextPreference {
    public static final StateListAnimator KWHzl = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final ServiceManagerNative AYXKKw;
    public final java.lang.String AhwBna;
    public final ContactsContract AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<PrinterDiscoverySession> djBIcL;
    public final StorageManagerInternal gEmmrt;
    public final java.lang.String isConnected;
    public final SynchronousResultReceiver valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.EditTextPreference$ActionBar) A[MD:(o.EditTextPreference$ActionBar):void (m)] call: o.EditTextPreference.<init>(o.EditTextPreference$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EditTextPreference(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract values() {
        return this.AkhnZx;
    }

    public EditTextPreference(ActionBar actionBar) {
        this.EZpvd = actionBar.OLrzqt();
        this.OLrzqt = actionBar.KWHzl();
        this.copydefault = actionBar.copydefault();
        this.AEQbTJ = actionBar.EZpvd();
        this.AYXKKw = actionBar.AYXKKw();
        this.AhwBna = actionBar.AhwBna();
        this.valueOf = actionBar.valueOf();
        this.gEmmrt = actionBar.djBIcL();
        this.djBIcL = actionBar.gEmmrt();
        this.isConnected = actionBar.AkhnZx();
        this.AkhnZx = actionBar.DbNXlk();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.EditTextPreference.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartEntitiesDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("entityRecognizerArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
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
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AEQbTJ;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AYXKKw;
        int iHashCode5 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.valueOf;
        int iHashCode7 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.gEmmrt;
        int iHashCode8 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.djBIcL;
        int iHashCode9 = list != null ? list.hashCode() : 0;
        java.lang.String str6 = this.isConnected;
        int iHashCode10 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.AkhnZx;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EditTextPreference.class != obj.getClass()) {
            return false;
        }
        EditTextPreference editTextPreference = (EditTextPreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) editTextPreference.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) editTextPreference.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) editTextPreference.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) editTextPreference.AEQbTJ) && Intrinsics.EZpvd(this.AYXKKw, editTextPreference.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) editTextPreference.AhwBna) && Intrinsics.EZpvd(this.valueOf, editTextPreference.valueOf) && Intrinsics.EZpvd(this.gEmmrt, editTextPreference.gEmmrt) && Intrinsics.EZpvd(this.djBIcL, editTextPreference.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) editTextPreference.isConnected) && Intrinsics.EZpvd(this.AkhnZx, editTextPreference.AkhnZx);
    }

    public static /* synthetic */ EditTextPreference copy$default(EditTextPreference editTextPreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartEntitiesDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull EditTextPreference.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(EditTextPreference.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(editTextPreference);
        function1.invoke(actionBar);
        return actionBar.AEQbTJ();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public StorageManagerInternal AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public java.lang.String copydefault;
        public java.lang.String djBIcL;
        public SynchronousResultReceiver gEmmrt;
        public ContactsContract isConnected;
        public java.util.List<PrinterDiscoverySession> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver valueOf() {
            return this.gEmmrt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull EditTextPreference editTextPreference) {
            this();
            Intrinsics.checkNotNullParameter(editTextPreference, "");
            this.EZpvd = editTextPreference.OLrzqt();
            this.KWHzl = editTextPreference.EZpvd();
            this.AEQbTJ = editTextPreference.copydefault();
            this.copydefault = editTextPreference.KWHzl();
            this.OLrzqt = editTextPreference.AEQbTJ();
            this.djBIcL = editTextPreference.gEmmrt();
            this.gEmmrt = editTextPreference.djBIcL();
            this.AhwBna = editTextPreference.valueOf();
            this.valueOf = editTextPreference.AhwBna();
            this.AYXKKw = editTextPreference.AYXKKw();
            this.isConnected = editTextPreference.values();
        }

        public final EditTextPreference AEQbTJ() {
            return new EditTextPreference(this, null);
        }
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.CheckBoxPreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CheckBoxPreference {
    public static final StateListAnimator EZpvd = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final ContactsContract DbNXlk;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final StorageManagerInternal djBIcL;
    public final ServiceManagerNative gEmmrt;
    public final java.util.List<PrinterDiscoverySession> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.CheckBoxPreference$ActionBar) A[MD:(o.CheckBoxPreference$ActionBar):void (m)] call: o.CheckBoxPreference.<init>(o.CheckBoxPreference$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CheckBoxPreference(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
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
    public final ServiceManagerNative copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract valueOf() {
        return this.DbNXlk;
    }

    public CheckBoxPreference(ActionBar actionBar) {
        this.OLrzqt = actionBar.copydefault();
        this.AEQbTJ = actionBar.EZpvd();
        this.KWHzl = actionBar.AEQbTJ();
        this.copydefault = actionBar.OLrzqt();
        this.gEmmrt = actionBar.gEmmrt();
        this.AhwBna = actionBar.djBIcL();
        this.djBIcL = actionBar.AYXKKw();
        this.valueOf = actionBar.valueOf();
        this.AYXKKw = actionBar.AhwBna();
        this.DbNXlk = actionBar.isConnected();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.CheckBoxPreference.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartDocumentClassificationJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documentClassifierArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.DbNXlk);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.copydefault;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.gEmmrt;
        int iHashCode5 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str5 = this.AhwBna;
        int iHashCode6 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.djBIcL;
        int iHashCode7 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.valueOf;
        int iHashCode8 = list != null ? list.hashCode() : 0;
        java.lang.String str6 = this.AYXKKw;
        int iHashCode9 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.DbNXlk;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CheckBoxPreference.class != obj.getClass()) {
            return false;
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) checkBoxPreference.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) checkBoxPreference.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) checkBoxPreference.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) checkBoxPreference.copydefault) && Intrinsics.EZpvd(this.gEmmrt, checkBoxPreference.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) checkBoxPreference.AhwBna) && Intrinsics.EZpvd(this.djBIcL, checkBoxPreference.djBIcL) && Intrinsics.EZpvd(this.valueOf, checkBoxPreference.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) checkBoxPreference.AYXKKw) && Intrinsics.EZpvd(this.DbNXlk, checkBoxPreference.DbNXlk);
    }

    public static /* synthetic */ CheckBoxPreference copy$default(CheckBoxPreference checkBoxPreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartDocumentClassificationJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull CheckBoxPreference.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CheckBoxPreference.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(checkBoxPreference);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    public static final class ActionBar {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AYXKKw;
        public ContactsContract AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public java.lang.String copydefault;
        public StorageManagerInternal djBIcL;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative gEmmrt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract isConnected() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> valueOf() {
            return this.AYXKKw;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull CheckBoxPreference checkBoxPreference) {
            this();
            Intrinsics.checkNotNullParameter(checkBoxPreference, "");
            this.copydefault = checkBoxPreference.KWHzl();
            this.EZpvd = checkBoxPreference.EZpvd();
            this.KWHzl = checkBoxPreference.AEQbTJ();
            this.AEQbTJ = checkBoxPreference.OLrzqt();
            this.OLrzqt = checkBoxPreference.copydefault();
            this.valueOf = checkBoxPreference.AhwBna();
            this.djBIcL = checkBoxPreference.djBIcL();
            this.AYXKKw = checkBoxPreference.AYXKKw();
            this.gEmmrt = checkBoxPreference.gEmmrt();
            this.AhwBna = checkBoxPreference.valueOf();
        }

        public final CheckBoxPreference KWHzl() {
            return new CheckBoxPreference(this, null);
        }
    }
}

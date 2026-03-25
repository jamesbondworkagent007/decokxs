package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.RingtonePreference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RingtonePreference {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final ServiceManagerNative AEQbTJ;
    public final java.lang.Integer AYXKKw;
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String djBIcL;
    public final ContactsContract gEmmrt;
    public final StorageManagerInternal valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.RingtonePreference$Activity) A[MD:(o.RingtonePreference$Activity):void (m)] call: o.RingtonePreference.<init>(o.RingtonePreference$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ RingtonePreference(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
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
    public final ServiceManagerNative copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract valueOf() {
        return this.gEmmrt;
    }

    public RingtonePreference(Activity activity) {
        this.OLrzqt = activity.OLrzqt();
        this.KWHzl = activity.EZpvd();
        this.AEQbTJ = activity.AEQbTJ();
        this.EZpvd = activity.copydefault();
        this.AYXKKw = activity.AYXKKw();
        this.valueOf = activity.AhwBna();
        this.AhwBna = activity.valueOf();
        this.djBIcL = activity.djBIcL();
        this.gEmmrt = activity.gEmmrt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.RingtonePreference.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StartTopicsDetectionJobRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("numberOfTopics=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("tags=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("vpcConfig=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AEQbTJ;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str3 = this.EZpvd;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.Integer num = this.AYXKKw;
        int iIntValue = num != null ? num.intValue() : 0;
        StorageManagerInternal storageManagerInternal = this.valueOf;
        int iHashCode5 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        int iHashCode6 = list != null ? list.hashCode() : 0;
        java.lang.String str4 = this.djBIcL;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        ContactsContract contactsContract = this.gEmmrt;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iIntValue) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RingtonePreference.class != obj.getClass()) {
            return false;
        }
        RingtonePreference ringtonePreference = (RingtonePreference) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ringtonePreference.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ringtonePreference.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, ringtonePreference.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ringtonePreference.EZpvd) && Intrinsics.EZpvd(this.AYXKKw, ringtonePreference.AYXKKw) && Intrinsics.EZpvd(this.valueOf, ringtonePreference.valueOf) && Intrinsics.EZpvd(this.AhwBna, ringtonePreference.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) ringtonePreference.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, ringtonePreference.gEmmrt);
    }

    public static /* synthetic */ RingtonePreference copy$default(RingtonePreference ringtonePreference, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.StartTopicsDetectionJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull RingtonePreference.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(RingtonePreference.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(ringtonePreference);
        function1.invoke(activity);
        return activity.KWHzl();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AYXKKw;
        public ContactsContract AhwBna;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.String OLrzqt;
        public ServiceManagerNative copydefault;
        public java.lang.String djBIcL;
        public StorageManagerInternal gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> valueOf() {
            return this.AYXKKw;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull RingtonePreference ringtonePreference) {
            this();
            Intrinsics.checkNotNullParameter(ringtonePreference, "");
            this.AEQbTJ = ringtonePreference.EZpvd();
            this.OLrzqt = ringtonePreference.KWHzl();
            this.copydefault = ringtonePreference.copydefault();
            this.EZpvd = ringtonePreference.OLrzqt();
            this.KWHzl = ringtonePreference.AEQbTJ();
            this.gEmmrt = ringtonePreference.AhwBna();
            this.AYXKKw = ringtonePreference.djBIcL();
            this.djBIcL = ringtonePreference.gEmmrt();
            this.AhwBna = ringtonePreference.valueOf();
        }

        public final RingtonePreference KWHzl() {
            return new RingtonePreference(this, null);
        }
    }
}

package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.SimpleClock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class SimpleClock {
    public static final Activity copydefault = new Activity(null);
    public final ServiceManagerNative AEQbTJ;
    public final StatsDimensionsValue AYXKKw;
    public final SynchronousResultReceiver AhwBna;
    public final StorageManagerInternal AkhnZx;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final C5173Hn OLrzqt;
    public final java.lang.String djBIcL;
    public final C5173Hn fetchVPNInfo;
    public final java.lang.String gEmmrt;
    public final java.lang.String isConnected;
    public final java.lang.String valueOf;
    public final ContactsContract values;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.SimpleClock$Application) A[MD:(o.SimpleClock$Application):void (m)] call: o.SimpleClock.<init>(o.SimpleClock$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SimpleClock(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManagerInternal AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContactsContract AkhnZx() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceManagerNative OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn values() {
        return this.fetchVPNInfo;
    }

    public SimpleClock(Application application) {
        this.KWHzl = application.OLrzqt();
        this.OLrzqt = application.AEQbTJ();
        this.AEQbTJ = application.copydefault();
        this.EZpvd = application.valueOf();
        this.valueOf = application.gEmmrt();
        this.gEmmrt = application.AhwBna();
        this.AYXKKw = application.djBIcL();
        this.AhwBna = application.AYXKKw();
        this.djBIcL = application.DbNXlk();
        this.AkhnZx = application.fetchVPNInfo();
        this.fetchVPNInfo = application.isConnected();
        this.isConnected = application.values();
        this.values = application.AkhnZx();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.SimpleClock.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("KeyPhrasesDetectionJobProperties(");
        sb.append("dataAccessRoleArn=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("endTime=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobArn=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("jobId=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("languageCode=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        sb.append("outputDataConfig=" + this.AkhnZx + AbstractJsonLexerKt.COMMA);
        sb.append("submitTime=" + this.fetchVPNInfo + AbstractJsonLexerKt.COMMA);
        sb.append("volumeKmsKeyId=" + this.isConnected + AbstractJsonLexerKt.COMMA);
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
        C5173Hn c5173Hn = this.OLrzqt;
        int iHashCode2 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        ServiceManagerNative serviceManagerNative = this.AEQbTJ;
        int iHashCode3 = serviceManagerNative != null ? serviceManagerNative.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.gEmmrt;
        int iHashCode6 = str4 != null ? str4.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.AYXKKw;
        int iHashCode7 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        SynchronousResultReceiver synchronousResultReceiver = this.AhwBna;
        int iHashCode8 = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.lang.String str5 = this.djBIcL;
        int iHashCode9 = str5 != null ? str5.hashCode() : 0;
        StorageManagerInternal storageManagerInternal = this.AkhnZx;
        int iHashCode10 = storageManagerInternal != null ? storageManagerInternal.hashCode() : 0;
        C5173Hn c5173Hn2 = this.fetchVPNInfo;
        int iHashCode11 = c5173Hn2 != null ? c5173Hn2.hashCode() : 0;
        java.lang.String str6 = this.isConnected;
        int iHashCode12 = str6 != null ? str6.hashCode() : 0;
        ContactsContract contactsContract = this.values;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (contactsContract != null ? contactsContract.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleClock.class != obj.getClass()) {
            return false;
        }
        SimpleClock simpleClock = (SimpleClock) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) simpleClock.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, simpleClock.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, simpleClock.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) simpleClock.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) simpleClock.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) simpleClock.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, simpleClock.AYXKKw) && Intrinsics.EZpvd(this.AhwBna, simpleClock.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) simpleClock.djBIcL) && Intrinsics.EZpvd(this.AkhnZx, simpleClock.AkhnZx) && Intrinsics.EZpvd(this.fetchVPNInfo, simpleClock.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) simpleClock.isConnected) && Intrinsics.EZpvd(this.values, simpleClock.values);
    }

    public static /* synthetic */ SimpleClock copy$default(SimpleClock simpleClock, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.KeyPhrasesDetectionJobProperties$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull SimpleClock.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SimpleClock.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(simpleClock);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public C5173Hn AEQbTJ;
        public StatsDimensionsValue AYXKKw;
        public java.lang.String AhwBna;
        public C5173Hn DbNXlk;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public ServiceManagerNative OLrzqt;
        public java.lang.String copydefault;
        public SynchronousResultReceiver djBIcL;
        public StorageManagerInternal gEmmrt;
        public java.lang.String isConnected;
        public java.lang.String valueOf;
        public ContactsContract values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(C5173Hn c5173Hn) {
            this.DbNXlk = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ContactsContract AkhnZx() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String DbNXlk() {
            return this.valueOf;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(StatsDimensionsValue statsDimensionsValue) {
            this.AYXKKw = statsDimensionsValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SynchronousResultReceiver synchronousResultReceiver) {
            this.djBIcL = synchronousResultReceiver;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(StorageManagerInternal storageManagerInternal) {
            this.gEmmrt = storageManagerInternal;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(ContactsContract contactsContract) {
            this.values = contactsContract;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C5173Hn c5173Hn) {
            this.AEQbTJ = c5173Hn;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceManagerNative copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(ServiceManagerNative serviceManagerNative) {
            this.OLrzqt = serviceManagerNative;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void djBIcL(java.lang.String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManagerInternal fetchVPNInfo() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn isConnected() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String values() {
            return this.isConnected;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull SimpleClock simpleClock) {
            this();
            Intrinsics.checkNotNullParameter(simpleClock, "");
            this.copydefault = simpleClock.EZpvd();
            this.AEQbTJ = simpleClock.copydefault();
            this.OLrzqt = simpleClock.OLrzqt();
            this.KWHzl = simpleClock.AEQbTJ();
            this.EZpvd = simpleClock.KWHzl();
            this.AhwBna = simpleClock.AhwBna();
            this.AYXKKw = simpleClock.djBIcL();
            this.djBIcL = simpleClock.gEmmrt();
            this.valueOf = simpleClock.valueOf();
            this.gEmmrt = simpleClock.AYXKKw();
            this.DbNXlk = simpleClock.values();
            this.isConnected = simpleClock.DbNXlk();
            this.values = simpleClock.AkhnZx();
        }

        public final SimpleClock KWHzl() {
            return new SimpleClock(this, null);
        }
    }
}

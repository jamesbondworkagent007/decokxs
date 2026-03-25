package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.DeviceIdleManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DeviceIdleManager {
    public static final Activity copydefault = new Activity(null);
    public final java.util.List<NetworkConfig> AEQbTJ;
    public final java.lang.String AYXKKw;
    public final HandlerThread EZpvd;
    public final ConditionVariable KWHzl;
    public final ConfigUpdate OLrzqt;
    public final java.lang.String djBIcL;
    public final DeadObjectException gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.DeviceIdleManager$Application) A[MD:(o.DeviceIdleManager$Application):void (m)] call: o.DeviceIdleManager.<init>(o.DeviceIdleManager$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeviceIdleManager(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfigUpdate AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<NetworkConfig> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConditionVariable KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HandlerThread OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeadObjectException copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.valueOf;
    }

    public DeviceIdleManager(Application application) {
        this.AEQbTJ = application.OLrzqt();
        this.OLrzqt = application.KWHzl();
        this.EZpvd = application.AEQbTJ();
        this.KWHzl = application.valueOf();
        this.gEmmrt = application.AYXKKw();
        this.AYXKKw = application.gEmmrt();
        this.djBIcL = application.AhwBna();
        this.valueOf = application.djBIcL();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DeviceIdleManager.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DocumentClassifierInputDataConfig(");
        sb.append("augmentedManifests=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("dataFormat=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentReaderConfig=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("documentType=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("documents=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        sb.append("labelDelimiter=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("s3Uri=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("testS3Uri=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.util.List<NetworkConfig> list = this.AEQbTJ;
        int iHashCode = list != null ? list.hashCode() : 0;
        ConfigUpdate configUpdate = this.OLrzqt;
        int iHashCode2 = configUpdate != null ? configUpdate.hashCode() : 0;
        HandlerThread handlerThread = this.EZpvd;
        int iHashCode3 = handlerThread != null ? handlerThread.hashCode() : 0;
        ConditionVariable conditionVariable = this.KWHzl;
        int iHashCode4 = conditionVariable != null ? conditionVariable.hashCode() : 0;
        DeadObjectException deadObjectException = this.gEmmrt;
        int iHashCode5 = deadObjectException != null ? deadObjectException.hashCode() : 0;
        java.lang.String str = this.AYXKKw;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.djBIcL;
        int iHashCode7 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.valueOf;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DeviceIdleManager.class != obj.getClass()) {
            return false;
        }
        DeviceIdleManager deviceIdleManager = (DeviceIdleManager) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, deviceIdleManager.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, deviceIdleManager.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, deviceIdleManager.EZpvd) && Intrinsics.EZpvd(this.KWHzl, deviceIdleManager.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, deviceIdleManager.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) deviceIdleManager.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) deviceIdleManager.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) deviceIdleManager.valueOf);
    }

    public static /* synthetic */ DeviceIdleManager copy$default(DeviceIdleManager deviceIdleManager, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DocumentClassifierInputDataConfig$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull DeviceIdleManager.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DeviceIdleManager.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(deviceIdleManager);
        function1.invoke(application);
        return application.EZpvd();
    }

    public static final class Application {
        public java.util.List<NetworkConfig> AEQbTJ;
        public java.lang.String AhwBna;
        public ConfigUpdate EZpvd;
        public DeadObjectException KWHzl;
        public HandlerThread OLrzqt;
        public ConditionVariable copydefault;
        public java.lang.String gEmmrt;
        public java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HandlerThread AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.AhwBna = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(ConfigUpdate configUpdate) {
            this.EZpvd = configUpdate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(DeadObjectException deadObjectException) {
            this.KWHzl = deadObjectException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(HandlerThread handlerThread) {
            this.OLrzqt = handlerThread;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DeadObjectException AYXKKw() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConfigUpdate KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<NetworkConfig> list) {
            this.AEQbTJ = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(ConditionVariable conditionVariable) {
            this.copydefault = conditionVariable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<NetworkConfig> OLrzqt() {
            return this.AEQbTJ;
        }

        public final Application copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConditionVariable valueOf() {
            return this.copydefault;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DeviceIdleManager deviceIdleManager) {
            this();
            Intrinsics.checkNotNullParameter(deviceIdleManager, "");
            this.AEQbTJ = deviceIdleManager.EZpvd();
            this.EZpvd = deviceIdleManager.AEQbTJ();
            this.OLrzqt = deviceIdleManager.OLrzqt();
            this.copydefault = deviceIdleManager.KWHzl();
            this.KWHzl = deviceIdleManager.copydefault();
            this.gEmmrt = deviceIdleManager.AhwBna();
            this.valueOf = deviceIdleManager.AYXKKw();
            this.AhwBna = deviceIdleManager.valueOf();
        }

        public final DeviceIdleManager EZpvd() {
            return new DeviceIdleManager(this, null);
        }
    }
}

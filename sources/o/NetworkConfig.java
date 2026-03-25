package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.NetworkConfig;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class NetworkConfig {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.String EZpvd;
    public final java.util.List<java.lang.String> KWHzl;
    public final java.lang.String OLrzqt;
    public final NetworkKey copydefault;
    public final RuntimePermissionPresenterService djBIcL;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.NetworkConfig$Activity) A[MD:(o.NetworkConfig$Activity):void (m)] call: o.NetworkConfig.<init>(o.NetworkConfig$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkConfig(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RuntimePermissionPresenterService AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkKey EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    public NetworkConfig(Activity activity) {
        this.EZpvd = activity.OLrzqt();
        java.util.List<java.lang.String> listKWHzl = activity.KWHzl();
        if (listKWHzl == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for attributeNames".toString());
        }
        this.KWHzl = listKWHzl;
        this.copydefault = activity.copydefault();
        java.lang.String strValueOf = activity.valueOf();
        if (strValueOf == null) {
            throw new java.lang.IllegalArgumentException("A non-null value must be provided for s3Uri".toString());
        }
        this.OLrzqt = strValueOf;
        this.valueOf = activity.gEmmrt();
        this.djBIcL = activity.djBIcL();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkConfig.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AugmentedManifestsListItem(");
        sb.append("annotationDataS3Uri=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("attributeNames=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("documentType=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("s3Uri=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("sourceDocumentsS3Uri=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("split=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str != null ? str.hashCode() : 0;
        int iHashCode2 = this.KWHzl.hashCode();
        NetworkKey networkKey = this.copydefault;
        int iHashCode3 = networkKey != null ? networkKey.hashCode() : 0;
        int iHashCode4 = this.OLrzqt.hashCode();
        java.lang.String str2 = this.valueOf;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        RuntimePermissionPresenterService runtimePermissionPresenterService = this.djBIcL;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (runtimePermissionPresenterService != null ? runtimePermissionPresenterService.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkConfig.class != obj.getClass()) {
            return false;
        }
        NetworkConfig networkConfig = (NetworkConfig) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) networkConfig.EZpvd) && Intrinsics.EZpvd(this.KWHzl, networkConfig.KWHzl) && Intrinsics.EZpvd(this.copydefault, networkConfig.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) networkConfig.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) networkConfig.valueOf) && Intrinsics.EZpvd(this.djBIcL, networkConfig.djBIcL);
    }

    public static /* synthetic */ NetworkConfig copy$default(NetworkConfig networkConfig, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.AugmentedManifestsListItem$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull NetworkConfig.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NetworkConfig.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(networkConfig);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public RuntimePermissionPresenterService AhwBna;
        public java.util.List<java.lang.String> EZpvd;
        public NetworkKey KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<java.lang.String> list) {
            this.EZpvd = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(NetworkKey networkKey) {
            this.KWHzl = networkKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NetworkKey copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(RuntimePermissionPresenterService runtimePermissionPresenterService) {
            this.AhwBna = runtimePermissionPresenterService;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RuntimePermissionPresenterService djBIcL() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.OLrzqt;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull NetworkConfig networkConfig) {
            this();
            Intrinsics.checkNotNullParameter(networkConfig, "");
            this.copydefault = networkConfig.AEQbTJ();
            this.EZpvd = networkConfig.KWHzl();
            this.KWHzl = networkConfig.EZpvd();
            this.OLrzqt = networkConfig.copydefault();
            this.AEQbTJ = networkConfig.OLrzqt();
            this.AhwBna = networkConfig.AhwBna();
        }

        public final NetworkConfig EZpvd() {
            return new NetworkConfig(this, null);
        }

        public final Activity AEQbTJ() {
            if (this.EZpvd == null) {
                this.EZpvd = yDY.AhwBna();
            }
            if (this.OLrzqt == null) {
                this.OLrzqt = "";
            }
            return this;
        }
    }
}

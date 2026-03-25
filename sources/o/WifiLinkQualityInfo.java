package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.WifiLinkQualityInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class WifiLinkQualityInfo {
    public static final ActionBar OLrzqt = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<PrinterDiscoverySession> AYXKKw;
    public final java.lang.String AhwBna;
    public final java.lang.Integer EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.WifiLinkQualityInfo$Activity) A[MD:(o.WifiLinkQualityInfo$Activity):void (m)] call: o.WifiLinkQualityInfo.<init>(o.WifiLinkQualityInfo$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WifiLinkQualityInfo(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> gEmmrt() {
        return this.AYXKKw;
    }

    public WifiLinkQualityInfo(Activity activity) {
        this.copydefault = activity.EZpvd();
        this.AEQbTJ = activity.OLrzqt();
        this.EZpvd = activity.copydefault();
        this.KWHzl = activity.KWHzl();
        this.AhwBna = activity.gEmmrt();
        this.valueOf = activity.AhwBna();
        this.AYXKKw = activity.valueOf();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.WifiLinkQualityInfo.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateEndpointRequest(");
        sb.append("clientRequestToken=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("dataAccessRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("desiredInferenceUnits=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endpointName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("modelArn=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str3 = this.KWHzl;
        int iHashCode3 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.AhwBna;
        int iHashCode4 = str4 != null ? str4.hashCode() : 0;
        java.lang.String str5 = this.valueOf;
        int iHashCode5 = str5 != null ? str5.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AYXKKw;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iIntValue) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WifiLinkQualityInfo.class != obj.getClass()) {
            return false;
        }
        WifiLinkQualityInfo wifiLinkQualityInfo = (WifiLinkQualityInfo) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) wifiLinkQualityInfo.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) wifiLinkQualityInfo.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, wifiLinkQualityInfo.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) wifiLinkQualityInfo.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) wifiLinkQualityInfo.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) wifiLinkQualityInfo.valueOf) && Intrinsics.EZpvd(this.AYXKKw, wifiLinkQualityInfo.AYXKKw);
    }

    public static /* synthetic */ WifiLinkQualityInfo copy$default(WifiLinkQualityInfo wifiLinkQualityInfo, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.CreateEndpointRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WifiLinkQualityInfo.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WifiLinkQualityInfo.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(wifiLinkQualityInfo);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public java.lang.String AEQbTJ;
        public java.lang.String AYXKKw;
        public java.lang.String EZpvd;
        public java.lang.Integer KWHzl;
        public java.lang.String OLrzqt;
        public java.lang.String copydefault;
        public java.util.List<PrinterDiscoverySession> djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
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
        public final java.lang.Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> valueOf() {
            return this.djBIcL;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull WifiLinkQualityInfo wifiLinkQualityInfo) {
            this();
            Intrinsics.checkNotNullParameter(wifiLinkQualityInfo, "");
            this.OLrzqt = wifiLinkQualityInfo.KWHzl();
            this.copydefault = wifiLinkQualityInfo.OLrzqt();
            this.KWHzl = wifiLinkQualityInfo.copydefault();
            this.EZpvd = wifiLinkQualityInfo.EZpvd();
            this.AEQbTJ = wifiLinkQualityInfo.AEQbTJ();
            this.AYXKKw = wifiLinkQualityInfo.AYXKKw();
            this.djBIcL = wifiLinkQualityInfo.gEmmrt();
        }

        public final WifiLinkQualityInfo AEQbTJ() {
            return new WifiLinkQualityInfo(this, null);
        }
    }
}

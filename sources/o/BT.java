package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BT {
    public final GB<java.lang.Double> AEQbTJ;
    public final GB<java.lang.Double> AYXKKw;
    public final GB<java.lang.Double> AhwBna;
    public final GI DbNXlk;
    public final GG KWHzl;
    public final FZ OLrzqt;
    public final GB<java.lang.Double> djBIcL;
    public final GB<java.lang.Double> fetchVPNInfo;
    public final GB<java.lang.Double> gEmmrt;
    public final GB<java.lang.Double> isConnected;
    public final GI valueOf;
    public final GB<java.lang.Double> values;
    public static final ActionBar copydefault = new ActionBar(null);
    public static final BT EZpvd = new BT("NoOp", FZ.AYXKKw.OLrzqt());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GI AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FZ copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GI gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GB<java.lang.Double> values() {
        return this.isConnected;
    }

    public BT(@NotNull java.lang.String str, @NotNull FZ fz) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(fz, "");
        this.OLrzqt = fz;
        GG ggEZpvd = fz.EZpvd().EZpvd(str);
        this.KWHzl = ggEZpvd;
        this.values = ggEZpvd.AEQbTJ("smithy.client.call.duration", com.ibm.icu.text.DateFormat.SECOND, "Overall call duration including retries");
        this.valueOf = ggEZpvd.EZpvd("smithy.client.call.attempts", "{attempt}", "The number of attempts for an operation");
        this.DbNXlk = ggEZpvd.EZpvd("smithy.client.call.errors", "{error}", "The number of errors for an operation");
        this.gEmmrt = ggEZpvd.AEQbTJ("smithy.client.call.attempt_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to connect to complete an entire call attempt, including identity resolution, endpoint resolution, signing, sending the request, and receiving the HTTP status code and headers from the response for an operation");
        this.AhwBna = ggEZpvd.AEQbTJ("smithy.client.call.attempt_overhead_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to execute an attempt minus the time spent waiting for a response from the remote server");
        this.isConnected = ggEZpvd.AEQbTJ("smithy.client.call.serialization_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to serialize a request message body");
        this.AEQbTJ = ggEZpvd.AEQbTJ("smithy.client.call.deserialization_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to deserialize a response message body");
        this.AYXKKw = ggEZpvd.AEQbTJ("smithy.client.call.resolve_endpoint_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to resolve an endpoint for a request");
        this.djBIcL = ggEZpvd.AEQbTJ("smithy.client.call.auth.resolve_identity_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to resolve an identity for signing a request");
        this.fetchVPNInfo = ggEZpvd.AEQbTJ("smithy.client.call.auth.signing_duration", com.ibm.icu.text.DateFormat.SECOND, "The time it takes to sign a request");
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.BT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final BT EZpvd() {
            return BT.EZpvd;
        }
    }
}

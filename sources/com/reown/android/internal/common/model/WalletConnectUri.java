package com.reown.android.internal.common.model;

import com.reown.foundation.common.model.Topic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletConnectUri {
    public final Expiry expiry;
    public final String methods;
    public final RelayProtocolOptions relay;
    public final String symKey;
    public final Topic topic;
    public final String version;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.foundation.common.model.Topic)
  (r2v0 java.lang.String)
  (r3v0 com.reown.android.internal.common.model.RelayProtocolOptions)
  (r4v0 java.lang.String)
  (r5v0 com.reown.android.internal.common.model.Expiry)
  (r6v0 java.lang.String)
 A[MD:(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String):void (m)] call: com.reown.android.internal.common.model.WalletConnectUri.<init>(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, Expiry expiry, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, str, relayProtocolOptions, str2, expiry, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-lRgxgew$default, reason: not valid java name */
    public static /* synthetic */ WalletConnectUri m7253copylRgxgew$default(WalletConnectUri walletConnectUri, Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, Expiry expiry, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            topic = walletConnectUri.topic;
        }
        if ((i & 2) != 0) {
            str = walletConnectUri.symKey;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            relayProtocolOptions = walletConnectUri.relay;
        }
        RelayProtocolOptions relayProtocolOptions2 = relayProtocolOptions;
        if ((i & 8) != 0) {
            str2 = walletConnectUri.version;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            expiry = walletConnectUri.expiry;
        }
        Expiry expiry2 = expiry;
        if ((i & 32) != 0) {
            str3 = walletConnectUri.methods;
        }
        return walletConnectUri.m7255copylRgxgew(topic, str4, relayProtocolOptions2, str5, expiry2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: component2-C2wS6ak, reason: not valid java name */
    public final String m7254component2C2wS6ak() {
        return this.symKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelayProtocolOptions component3() {
        return this.relay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry component5() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-lRgxgew, reason: not valid java name */
    public final WalletConnectUri m7255copylRgxgew(@NotNull Topic topic, @NotNull String str, @NotNull RelayProtocolOptions relayProtocolOptions, @NotNull String str2, Expiry expiry, String str3) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WalletConnectUri(topic, str, relayProtocolOptions, str2, expiry, str3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletConnectUri)) {
            return false;
        }
        WalletConnectUri walletConnectUri = (WalletConnectUri) obj;
        return Intrinsics.EZpvd(this.topic, walletConnectUri.topic) && SymmetricKey.m7241equalsimpl0(this.symKey, walletConnectUri.symKey) && Intrinsics.EZpvd(this.relay, walletConnectUri.relay) && Intrinsics.EZpvd((Object) this.version, (Object) walletConnectUri.version) && Intrinsics.EZpvd(this.expiry, walletConnectUri.expiry) && Intrinsics.EZpvd((Object) this.methods, (Object) walletConnectUri.methods);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RelayProtocolOptions getRelay() {
        return this.relay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: getSymKey-C2wS6ak, reason: not valid java name */
    public final String m7256getSymKeyC2wS6ak() {
        return this.symKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topic.hashCode();
        int iM7243hashCodeimpl = SymmetricKey.m7243hashCodeimpl(this.symKey);
        int iHashCode2 = this.relay.hashCode();
        int iHashCode3 = this.version.hashCode();
        Expiry expiry = this.expiry;
        int iHashCode4 = expiry == null ? 0 : expiry.hashCode();
        String str = this.methods;
        return (((((((((iHashCode * 31) + iM7243hashCodeimpl) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletConnectUri(topic=" + this.topic + ", symKey=" + SymmetricKey.m7244toStringimpl(this.symKey) + ", relay=" + this.relay + ", version=" + this.version + ", expiry=" + this.expiry + ", methods=" + this.methods + ")";
    }

    public WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, Expiry expiry, String str3) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.topic = topic;
        this.symKey = str;
        this.relay = relayProtocolOptions;
        this.version = str2;
        this.expiry = expiry;
        this.methods = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 com.reown.foundation.common.model.Topic)
  (r11v0 java.lang.String)
  (r12v0 com.reown.android.internal.common.model.RelayProtocolOptions)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("2") : (r13v0 java.lang.String))
  (r14v0 com.reown.android.internal.common.model.Expiry)
  (r15v0 java.lang.String)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:7) call: com.reown.android.internal.common.model.WalletConnectUri.<init>(com.reown.foundation.common.model.Topic, java.lang.String, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker):void type: THIS */
    public /* synthetic */ WalletConnectUri(Topic topic, String str, RelayProtocolOptions relayProtocolOptions, String str2, Expiry expiry, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, str, relayProtocolOptions, (i & 8) != 0 ? "2" : str2, expiry, str3, null);
    }

    public final String toAbsoluteString() {
        return "wc:" + this.topic.getValue() + "@" + this.version + "?" + getQuery() + "&symKey=" + this.symKey;
    }

    public final String getQuery() {
        String str = "relay-protocol=" + this.relay.getProtocol();
        if (this.relay.getData() != null) {
            str = str + "&relay-data=" + this.relay.getData();
        }
        Expiry expiry = this.expiry;
        if (expiry != null) {
            str = str + "&expiryTimestamp=" + expiry.getSeconds();
        }
        String str2 = this.methods;
        if (str2 == null || str2.length() == 0) {
            return str;
        }
        return str + "&methods=" + this.methods;
    }
}

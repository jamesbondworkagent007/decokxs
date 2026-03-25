package com.reown.android.internal.common.model;

import com.reown.android.internal.common.model.type.Sequence;
import com.reown.android.pairing.model.Expiration;
import com.reown.foundation.common.model.Topic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class Pairing implements Sequence {
    public final Expiry expiry;
    public final boolean isProposalReceived;
    public final String methods;
    public final AppMetaData peerAppMetaData;
    public final String relayData;
    public final String relayProtocol;
    public final Topic topic;
    public final String uri;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 com.reown.foundation.common.model.Topic)
  (r2v0 com.reown.android.internal.common.model.RelayProtocolOptions)
  (r3v0 java.lang.String)
  (r4v0 com.reown.android.internal.common.model.Expiry)
  (r5v0 java.lang.String)
 A[MD:(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String):void (m)] call: com.reown.android.internal.common.model.Pairing.<init>(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.RelayProtocolOptions, java.lang.String, com.reown.android.internal.common.model.Expiry, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Pairing(Topic topic, RelayProtocolOptions relayProtocolOptions, String str, Expiry expiry, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, relayProtocolOptions, str, expiry, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Topic component1() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Expiry component2() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData component3() {
        return this.peerAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.relayProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.relayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isProposalReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pairing copy(@NotNull Topic topic, @NotNull Expiry expiry, AppMetaData appMetaData, @NotNull String str, String str2, @NotNull String str3, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new Pairing(topic, expiry, appMetaData, str, str2, str3, z, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pairing)) {
            return false;
        }
        Pairing pairing = (Pairing) obj;
        return Intrinsics.EZpvd(this.topic, pairing.topic) && Intrinsics.EZpvd(this.expiry, pairing.expiry) && Intrinsics.EZpvd(this.peerAppMetaData, pairing.peerAppMetaData) && Intrinsics.EZpvd((Object) this.relayProtocol, (Object) pairing.relayProtocol) && Intrinsics.EZpvd((Object) this.relayData, (Object) pairing.relayData) && Intrinsics.EZpvd((Object) this.uri, (Object) pairing.uri) && this.isProposalReceived == pairing.isProposalReceived && Intrinsics.EZpvd((Object) this.methods, (Object) pairing.methods);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.Sequence
    public Expiry getExpiry() {
        return this.expiry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethods() {
        return this.methods;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AppMetaData getPeerAppMetaData() {
        return this.peerAppMetaData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelayData() {
        return this.relayData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelayProtocol() {
        return this.relayProtocol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.internal.common.model.type.Sequence
    public Topic getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUri() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.topic.hashCode();
        int iHashCode2 = this.expiry.hashCode();
        AppMetaData appMetaData = this.peerAppMetaData;
        int iHashCode3 = appMetaData == null ? 0 : appMetaData.hashCode();
        int iHashCode4 = this.relayProtocol.hashCode();
        String str = this.relayData;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        int iHashCode6 = this.uri.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isProposalReceived);
        String str2 = this.methods;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isProposalReceived() {
        return this.isProposalReceived;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Pairing(topic=" + this.topic + ", expiry=" + this.expiry + ", peerAppMetaData=" + this.peerAppMetaData + ", relayProtocol=" + this.relayProtocol + ", relayData=" + this.relayData + ", uri=" + this.uri + ", isProposalReceived=" + this.isProposalReceived + ", methods=" + this.methods + ")";
    }

    public Pairing(@NotNull Topic topic, @NotNull Expiry expiry, AppMetaData appMetaData, @NotNull String str, String str2, @NotNull String str3, boolean z, String str4) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(expiry, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.topic = topic;
        this.expiry = expiry;
        this.peerAppMetaData = appMetaData;
        this.relayProtocol = str;
        this.relayData = str2;
        this.uri = str3;
        this.isProposalReceived = z;
        this.methods = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0024: CONSTRUCTOR 
  (r13v0 com.reown.foundation.common.model.Topic)
  (r14v0 com.reown.android.internal.common.model.Expiry)
  (wrap:com.reown.android.internal.common.model.AppMetaData:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.AppMetaData) : (r15v0 com.reown.android.internal.common.model.AppMetaData))
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
 A[MD:(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, com.reown.android.internal.common.model.AppMetaData, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:7) call: com.reown.android.internal.common.model.Pairing.<init>(com.reown.foundation.common.model.Topic, com.reown.android.internal.common.model.Expiry, com.reown.android.internal.common.model.AppMetaData, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ Pairing(Topic topic, Expiry expiry, AppMetaData appMetaData, String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(topic, expiry, (i & 4) != 0 ? null : appMetaData, str, str2, str3, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Pairing(Topic topic, RelayProtocolOptions relayProtocolOptions, String str, Expiry expiry, String str2) {
        this(topic, expiry, null, relayProtocolOptions.getProtocol(), relayProtocolOptions.getData(), new WalletConnectUri(topic, str, relayProtocolOptions, null, expiry, str2, 8, null).toAbsoluteString(), false, str2, 68, null);
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(relayProtocolOptions, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(expiry, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Pairing(@NotNull WalletConnectUri walletConnectUri) {
        Intrinsics.checkNotNullParameter(walletConnectUri, "");
        Topic topic = walletConnectUri.getTopic();
        Expiry expiry = walletConnectUri.getExpiry();
        this(topic, expiry == null ? new Expiry(Expiration.getPairingExpiry()) : expiry, null, walletConnectUri.getRelay().getProtocol(), walletConnectUri.getRelay().getData(), walletConnectUri.toAbsoluteString(), false, walletConnectUri.getMethods(), 68, null);
    }
}

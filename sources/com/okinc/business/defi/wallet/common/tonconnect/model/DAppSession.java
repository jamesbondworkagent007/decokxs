package com.okinc.business.defi.wallet.common.tonconnect.model;

import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.okinc.wallet.core.sign.ton.X25519KeyPair$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppSession {
    private final String clientId;
    private final X25519KeyPair keyPair;
    private final Long lastActiveTimestamp;
    private final DAppManifest manifest;
    private final TonNetwork network;
    private final String origin;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = X25519KeyPair.$stable;
    private static final KSerializer<Object>[] $childSerializers = {null, null, EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork", TonNetwork.values(), new String[]{"-239", "-3"}, new Annotation[][]{null, null}, null), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DAppSession copy$default(DAppSession dAppSession, String str, String str2, TonNetwork tonNetwork, X25519KeyPair x25519KeyPair, DAppManifest dAppManifest, String str3, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dAppSession.clientId;
        }
        if ((i & 2) != 0) {
            str2 = dAppSession.walletId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            tonNetwork = dAppSession.network;
        }
        TonNetwork tonNetwork2 = tonNetwork;
        if ((i & 8) != 0) {
            x25519KeyPair = dAppSession.keyPair;
        }
        X25519KeyPair x25519KeyPair2 = x25519KeyPair;
        if ((i & 16) != 0) {
            dAppManifest = dAppSession.manifest;
        }
        DAppManifest dAppManifest2 = dAppManifest;
        if ((i & 32) != 0) {
            str3 = dAppSession.origin;
        }
        String str5 = str3;
        if ((i & 64) != 0) {
            l = dAppSession.lastActiveTimestamp;
        }
        return dAppSession.copy(str, str4, tonNetwork2, x25519KeyPair2, dAppManifest2, str5, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonNetwork component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X25519KeyPair component4() {
        return this.keyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppManifest component5() {
        return this.manifest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.lastActiveTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppSession copy(@NotNull String str, @NotNull String str2, @NotNull TonNetwork tonNetwork, @NotNull X25519KeyPair x25519KeyPair, @NotNull DAppManifest dAppManifest, @NotNull String str3, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tonNetwork, "");
        Intrinsics.checkNotNullParameter(x25519KeyPair, "");
        Intrinsics.checkNotNullParameter(dAppManifest, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new DAppSession(str, str2, tonNetwork, x25519KeyPair, dAppManifest, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppSession)) {
            return false;
        }
        DAppSession dAppSession = (DAppSession) obj;
        return Intrinsics.EZpvd((Object) this.clientId, (Object) dAppSession.clientId) && Intrinsics.EZpvd((Object) this.walletId, (Object) dAppSession.walletId) && this.network == dAppSession.network && Intrinsics.EZpvd(this.keyPair, dAppSession.keyPair) && Intrinsics.EZpvd(this.manifest, dAppSession.manifest) && Intrinsics.EZpvd((Object) this.origin, (Object) dAppSession.origin) && Intrinsics.EZpvd(this.lastActiveTimestamp, dAppSession.lastActiveTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X25519KeyPair getKeyPair() {
        return this.keyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastActiveTimestamp() {
        return this.lastActiveTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppManifest getManifest() {
        return this.manifest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonNetwork getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.clientId.hashCode();
        int iHashCode2 = this.walletId.hashCode();
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = this.keyPair.hashCode();
        int iHashCode5 = this.manifest.hashCode();
        int iHashCode6 = this.origin.hashCode();
        Long l = this.lastActiveTimestamp;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (l == null ? 0 : l.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppSession(clientId=" + this.clientId + ", walletId=" + this.walletId + ", network=" + this.network + ", keyPair=" + this.keyPair + ", manifest=" + this.manifest + ", origin=" + this.origin + ", lastActiveTimestamp=" + this.lastActiveTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppSession> serializer() {
            return DAppSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppSession(int i, String str, String str2, TonNetwork tonNetwork, X25519KeyPair x25519KeyPair, DAppManifest dAppManifest, String str3, Long l, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, DAppSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientId = str;
        this.walletId = str2;
        this.network = tonNetwork;
        this.keyPair = x25519KeyPair;
        this.manifest = dAppManifest;
        if ((i & 32) == 0) {
            this.origin = "";
        } else {
            this.origin = str3;
        }
        if ((i & 64) == 0) {
            this.lastActiveTimestamp = null;
        } else {
            this.lastActiveTimestamp = l;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppSession dAppSession, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppSession.clientId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppSession.walletId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], dAppSession.network);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, dAppSession.keyPair);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, DAppManifest$$serializer.INSTANCE, dAppSession.manifest);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dAppSession.origin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dAppSession.origin);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && dAppSession.lastActiveTimestamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, dAppSession.lastActiveTimestamp);
    }

    public DAppSession(@NotNull String str, @NotNull String str2, @NotNull TonNetwork tonNetwork, @NotNull X25519KeyPair x25519KeyPair, @NotNull DAppManifest dAppManifest, @NotNull String str3, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tonNetwork, "");
        Intrinsics.checkNotNullParameter(x25519KeyPair, "");
        Intrinsics.checkNotNullParameter(dAppManifest, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.clientId = str;
        this.walletId = str2;
        this.network = tonNetwork;
        this.keyPair = x25519KeyPair;
        this.manifest = dAppManifest;
        this.origin = str3;
        this.lastActiveTimestamp = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork)
  (r13v0 com.okinc.wallet.core.sign.ton.X25519KeyPair)
  (r14v0 com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork, com.okinc.wallet.core.sign.ton.X25519KeyPair, com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest, java.lang.String, java.lang.Long):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.common.tonconnect.model.DAppSession.<init>(java.lang.String, java.lang.String, com.okinc.business.defi.wallet.common.tonconnect.model.TonNetwork, com.okinc.wallet.core.sign.ton.X25519KeyPair, com.okinc.business.defi.wallet.common.tonconnect.model.DAppManifest, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ DAppSession(String str, String str2, TonNetwork tonNetwork, X25519KeyPair x25519KeyPair, DAppManifest dAppManifest, String str3, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, tonNetwork, x25519KeyPair, dAppManifest, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : l);
    }
}

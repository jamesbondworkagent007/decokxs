package com.okinc.business.defi.wallet.common.okxconnect.model;

import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.okinc.wallet.core.sign.ton.X25519KeyPair$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DAppSession {
    private final String clientId;
    private final List<String> connectedCaipChains;
    private final DAppInfo dAppInfo;
    private final Boolean hasCosmosChainConnected;
    private final boolean isSupportSplitData;
    private final boolean isTonConnected;
    private final X25519KeyPair keyPair;
    private final Long lastActiveTimestamp;
    private final Integer protocalVersion;
    private final String redirect;
    private final long timestamp;
    private final String topic;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component10() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.protocalVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component12() {
        return this.lastActiveTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final X25519KeyPair component4() {
        return this.keyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo component5() {
        return this.dAppInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isTonConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.connectedCaipChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.hasCosmosChainConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppSession copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull X25519KeyPair x25519KeyPair, @NotNull DAppInfo dAppInfo, boolean z, @NotNull List<String> list, Boolean bool, @NotNull String str4, long j, Integer num, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(x25519KeyPair, "");
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DAppSession(str, str2, str3, x25519KeyPair, dAppInfo, z, list, bool, str4, j, num, l);
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
        return Intrinsics.EZpvd((Object) this.clientId, (Object) dAppSession.clientId) && Intrinsics.EZpvd((Object) this.topic, (Object) dAppSession.topic) && Intrinsics.EZpvd((Object) this.walletId, (Object) dAppSession.walletId) && Intrinsics.EZpvd(this.keyPair, dAppSession.keyPair) && Intrinsics.EZpvd(this.dAppInfo, dAppSession.dAppInfo) && this.isTonConnected == dAppSession.isTonConnected && Intrinsics.EZpvd(this.connectedCaipChains, dAppSession.connectedCaipChains) && Intrinsics.EZpvd(this.hasCosmosChainConnected, dAppSession.hasCosmosChainConnected) && Intrinsics.EZpvd((Object) this.redirect, (Object) dAppSession.redirect) && this.timestamp == dAppSession.timestamp && Intrinsics.EZpvd(this.protocalVersion, dAppSession.protocalVersion) && Intrinsics.EZpvd(this.lastActiveTimestamp, dAppSession.lastActiveTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getConnectedCaipChains() {
        return this.connectedCaipChains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppInfo getDAppInfo() {
        return this.dAppInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasCosmosChainConnected() {
        return this.hasCosmosChainConnected;
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
    public final Integer getProtocalVersion() {
        return this.protocalVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRedirect() {
        return this.redirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopic() {
        return this.topic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.clientId.hashCode();
        int iHashCode2 = this.topic.hashCode();
        int iHashCode3 = this.walletId.hashCode();
        int iHashCode4 = this.keyPair.hashCode();
        int iHashCode5 = this.dAppInfo.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isTonConnected);
        int iHashCode7 = this.connectedCaipChains.hashCode();
        Boolean bool = this.hasCosmosChainConnected;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        int iHashCode9 = this.redirect.hashCode();
        int iHashCode10 = Long.hashCode(this.timestamp);
        Integer num = this.protocalVersion;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        Long l = this.lastActiveTimestamp;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportSplitData() {
        return this.isSupportSplitData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTonConnected() {
        return this.isTonConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppSession(clientId=" + this.clientId + ", topic=" + this.topic + ", walletId=" + this.walletId + ", keyPair=" + this.keyPair + ", dAppInfo=" + this.dAppInfo + ", isTonConnected=" + this.isTonConnected + ", connectedCaipChains=" + this.connectedCaipChains + ", hasCosmosChainConnected=" + this.hasCosmosChainConnected + ", redirect=" + this.redirect + ", timestamp=" + this.timestamp + ", protocalVersion=" + this.protocalVersion + ", lastActiveTimestamp=" + this.lastActiveTimestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppSession> serializer() {
            return DAppSession$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DAppSession(int i, String str, String str2, String str3, X25519KeyPair x25519KeyPair, DAppInfo dAppInfo, boolean z, List list, Boolean bool, String str4, long j, Integer num, Long l, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        boolean zCopydefault;
        if (895 != (i & 895)) {
            PluginExceptionsKt.throwMissingFieldException(i, 895, DAppSession$$serializer.INSTANCE.getDescriptor());
        }
        this.clientId = str;
        this.topic = str2;
        this.walletId = str3;
        this.keyPair = x25519KeyPair;
        this.dAppInfo = dAppInfo;
        this.isTonConnected = z;
        this.connectedCaipChains = list;
        if ((i & 128) == 0) {
            this.hasCosmosChainConnected = null;
        } else {
            this.hasCosmosChainConnected = bool;
        }
        this.redirect = str4;
        this.timestamp = j;
        if ((i & 1024) == 0) {
            this.protocalVersion = null;
        } else {
            this.protocalVersion = num;
        }
        if ((i & 2048) == 0) {
            this.lastActiveTimestamp = null;
        } else {
            this.lastActiveTimestamp = l;
        }
        if ((i & 4096) == 0) {
            Integer num2 = this.protocalVersion;
            zCopydefault = num2 != null ? C33129mqd.copydefault((Object) num2, (Object) 2) : false;
        } else {
            zCopydefault = z2;
        }
        this.isSupportSplitData = zCopydefault;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DAppSession dAppSession, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dAppSession.clientId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppSession.topic);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppSession.walletId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, X25519KeyPair$$serializer.INSTANCE, dAppSession.keyPair);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, DAppInfo$$serializer.INSTANCE, dAppSession.dAppInfo);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 5, dAppSession.isTonConnected);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], dAppSession.connectedCaipChains);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dAppSession.hasCosmosChainConnected != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, dAppSession.hasCosmosChainConnected);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dAppSession.redirect);
        compositeEncoder.encodeLongElement(serialDescriptor, 9, dAppSession.timestamp);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dAppSession.protocalVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, dAppSession.protocalVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || dAppSession.lastActiveTimestamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, LongSerializer.INSTANCE, dAppSession.lastActiveTimestamp);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12)) {
            boolean z = dAppSession.isSupportSplitData;
            Integer num = dAppSession.protocalVersion;
            if (z == (num != null ? C33129mqd.copydefault((Object) num, (Object) 2) : false)) {
                return;
            }
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 12, dAppSession.isSupportSplitData);
    }

    public DAppSession(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull X25519KeyPair x25519KeyPair, @NotNull DAppInfo dAppInfo, boolean z, @NotNull List<String> list, Boolean bool, @NotNull String str4, long j, Integer num, Long l) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(x25519KeyPair, "");
        Intrinsics.checkNotNullParameter(dAppInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.clientId = str;
        this.topic = str2;
        this.walletId = str3;
        this.keyPair = x25519KeyPair;
        this.dAppInfo = dAppInfo;
        this.isTonConnected = z;
        this.connectedCaipChains = list;
        this.hasCosmosChainConnected = bool;
        this.redirect = str4;
        this.timestamp = j;
        this.protocalVersion = num;
        this.lastActiveTimestamp = l;
        this.isSupportSplitData = num != null ? C33129mqd.copydefault((Object) num, (Object) 2) : false;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 com.okinc.wallet.core.sign.ton.X25519KeyPair)
  (r22v0 com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo)
  (r23v0 boolean)
  (r24v0 java.util.List)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r25v0 java.lang.Boolean))
  (r26v0 java.lang.String)
  (r27v0 long)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r29v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.ton.X25519KeyPair, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, boolean, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.String, long, java.lang.Integer, java.lang.Long):void (m)] (LINE:11) call: com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.wallet.core.sign.ton.X25519KeyPair, com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo, boolean, java.util.List, java.lang.Boolean, java.lang.String, long, java.lang.Integer, java.lang.Long):void type: THIS */
    public /* synthetic */ DAppSession(String str, String str2, String str3, X25519KeyPair x25519KeyPair, DAppInfo dAppInfo, boolean z, List list, Boolean bool, String str4, long j, Integer num, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, x25519KeyPair, dAppInfo, z, list, (i & 128) != 0 ? null : bool, str4, j, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : l);
    }
}

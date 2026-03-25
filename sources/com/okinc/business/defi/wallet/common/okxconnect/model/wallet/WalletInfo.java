package com.okinc.business.defi.wallet.common.okxconnect.model.wallet;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import o.C32979mnm;
import o.C34703nhO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class WalletInfo {
    public static final int MAX_PROTOCOL_VER = 2;
    public static final int SPLIT_DATA_PROTOCOL_VERSION_FROM = 2;
    private final String appName;
    private final String appVersion;
    private final JsonObject features;
    private final int maxProtocolVersion;
    private final String platform;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WalletInfo() {
        this((String) null, (String) null, (String) null, 0, (JsonObject) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WalletInfo copy$default(WalletInfo walletInfo, String str, String str2, String str3, int i, JsonObject jsonObject, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = walletInfo.appName;
        }
        if ((i2 & 2) != 0) {
            str2 = walletInfo.appVersion;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = walletInfo.platform;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = walletInfo.maxProtocolVersion;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            jsonObject = walletInfo.features;
        }
        return walletInfo.copy(str, str4, str5, i3, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.maxProtocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component5() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new WalletInfo(str, str2, str3, i, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletInfo)) {
            return false;
        }
        WalletInfo walletInfo = (WalletInfo) obj;
        return Intrinsics.EZpvd((Object) this.appName, (Object) walletInfo.appName) && Intrinsics.EZpvd((Object) this.appVersion, (Object) walletInfo.appVersion) && Intrinsics.EZpvd((Object) this.platform, (Object) walletInfo.platform) && this.maxProtocolVersion == walletInfo.maxProtocolVersion && Intrinsics.EZpvd(this.features, walletInfo.features);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getFeatures() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMaxProtocolVersion() {
        return this.maxProtocolVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.appName.hashCode();
        int iHashCode2 = this.appVersion.hashCode();
        int iHashCode3 = this.platform.hashCode();
        int iHashCode4 = Integer.hashCode(this.maxProtocolVersion);
        JsonObject jsonObject = this.features;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletInfo(appName=" + this.appName + ", appVersion=" + this.appVersion + ", platform=" + this.platform + ", maxProtocolVersion=" + this.maxProtocolVersion + ", features=" + this.features + ")";
    }

    public /* synthetic */ WalletInfo(int i, String str, String str2, String str3, int i2, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        this.appName = (i & 1) == 0 ? C34703nhO.AEQbTJ() ? "OKX TR Wallet" : "OKX Wallet" : str;
        if ((i & 2) == 0) {
            this.appVersion = C32979mnm.EZpvd.EZpvd();
        } else {
            this.appVersion = str2;
        }
        if ((i & 4) == 0) {
            this.platform = "android";
        } else {
            this.platform = str3;
        }
        if ((i & 8) == 0) {
            this.maxProtocolVersion = 2;
        } else {
            this.maxProtocolVersion = i2;
        }
        if ((i & 16) == 0) {
            this.features = null;
        } else {
            this.features = jsonObject;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(WalletInfo walletInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, walletInfo.appName);
        } else {
            if (!Intrinsics.EZpvd((Object) walletInfo.appName, (Object) (C34703nhO.AEQbTJ() ? "OKX TR Wallet" : "OKX Wallet"))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) walletInfo.appVersion, (Object) C32979mnm.EZpvd.EZpvd())) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, walletInfo.appVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) walletInfo.platform, (Object) "android")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, walletInfo.platform);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || walletInfo.maxProtocolVersion != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, walletInfo.maxProtocolVersion);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && walletInfo.features == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, JsonObjectSerializer.INSTANCE, walletInfo.features);
    }

    public WalletInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.appName = str;
        this.appVersion = str2;
        this.platform = str3;
        this.maxProtocolVersion = i;
        this.features = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:?: TERNARY null = ((wrap:boolean:0x0004: INVOKE  STATIC call: o.nhO.AEQbTJ():boolean A[MD:():boolean (m), WRAPPED] (LINE:183)) != false) ? ("OKX TR Wallet") : ("OKX Wallet")) : (r4v0 java.lang.String))
  (wrap:java.lang.String:0x0019: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0015: INVOKE (wrap:o.mnm:0x0013: SGET  A[WRAPPED] (LINE:184) o.mnm.EZpvd o.mnm) VIRTUAL call: o.mnm.EZpvd():java.lang.String A[MD:():java.lang.String (m), WRAPPED] (LINE:184)) : (r5v0 java.lang.String))
  (wrap:java.lang.String:0x0020: TERNARY null = ((wrap:int:0x001a: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("android") : (r6v0 java.lang.String))
  (wrap:int:0x0026: TERNARY null = ((wrap:int:0x0021: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r7v0 int))
  (wrap:kotlinx.serialization.json.JsonObject:?: TERNARY null = ((wrap:int:0x0027: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r8v0 kotlinx.serialization.json.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlinx.serialization.json.JsonObject):void (m)] (LINE:182) call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlinx.serialization.json.JsonObject):void type: THIS */
    public /* synthetic */ WalletInfo(String str, String str2, String str3, int i, JsonObject jsonObject, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C34703nhO.AEQbTJ() ? "OKX TR Wallet" : "OKX Wallet" : str, (i2 & 2) != 0 ? C32979mnm.EZpvd.EZpvd() : str2, (i2 & 4) != 0 ? "android" : str3, (i2 & 8) != 0 ? 2 : i, (i2 & 16) != 0 ? null : jsonObject);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WalletInfo> serializer() {
            return WalletInfo$$serializer.INSTANCE;
        }
    }
}

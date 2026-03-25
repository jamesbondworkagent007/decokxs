package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SignInfo {
    private String address;
    private long coinId;
    private JsonObject info;
    private boolean supportPush;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignInfo() {
        this(0L, (String) null, (JsonObject) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignInfo copy$default(SignInfo signInfo, long j, String str, JsonObject jsonObject, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = signInfo.coinId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = signInfo.address;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            jsonObject = signInfo.info;
        }
        JsonObject jsonObject2 = jsonObject;
        if ((i & 8) != 0) {
            z = signInfo.supportPush;
        }
        return signInfo.copy(j2, str2, jsonObject2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject component3() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignInfo copy(long j, @NotNull String str, JsonObject jsonObject, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SignInfo(j, str, jsonObject, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignInfo)) {
            return false;
        }
        SignInfo signInfo = (SignInfo) obj;
        return this.coinId == signInfo.coinId && Intrinsics.EZpvd((Object) this.address, (Object) signInfo.address) && Intrinsics.EZpvd(this.info, signInfo.info) && this.supportPush == signInfo.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject getInfo() {
        return this.info;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportPush() {
        return this.supportPush;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.coinId);
        int iHashCode2 = this.address.hashCode();
        JsonObject jsonObject = this.info;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (jsonObject == null ? 0 : jsonObject.hashCode())) * 31) + Boolean.hashCode(this.supportPush);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInfo(JsonObject jsonObject) {
        this.info = jsonObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportPush(boolean z) {
        this.supportPush = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignInfo(coinId=" + this.coinId + ", address=" + this.address + ", info=" + this.info + ", supportPush=" + this.supportPush + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.SignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignInfo> serializer() {
            return SignInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignInfo(int i, long j, String str, JsonObject jsonObject, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.address = "";
        } else {
            this.address = str;
        }
        if ((i & 4) == 0) {
            this.info = null;
        } else {
            this.info = jsonObject;
        }
        if ((i & 8) == 0) {
            this.supportPush = false;
        } else {
            this.supportPush = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SignInfo signInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || signInfo.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, signInfo.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signInfo.address, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signInfo.address);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || signInfo.info != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, JsonObjectSerializer.INSTANCE, signInfo.info);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || signInfo.supportPush) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, signInfo.supportPush);
        }
    }

    public SignInfo(long j, @NotNull String str, JsonObject jsonObject, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinId = j;
        this.address = str;
        this.info = jsonObject;
        this.supportPush = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:java.lang.String:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:kotlinx.serialization.json.JsonObject:0x0013: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlinx.serialization.json.JsonObject) : (r10v0 kotlinx.serialization.json.JsonObject))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(long, java.lang.String, kotlinx.serialization.json.JsonObject, boolean):void (m)] (LINE:148) call: com.okinc.business.defi.biz.net.bean.SignInfo.<init>(long, java.lang.String, kotlinx.serialization.json.JsonObject, boolean):void type: THIS */
    public /* synthetic */ SignInfo(long j, String str, JsonObject jsonObject, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : jsonObject, (i & 8) != 0 ? false : z);
    }
}

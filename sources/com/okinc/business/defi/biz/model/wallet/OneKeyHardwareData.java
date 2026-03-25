package com.okinc.business.defi.biz.model.wallet;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class OneKeyHardwareData {
    private final List<OneKeyAccountInfo> accountInfo;
    private final String deviceId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(OneKeyAccountInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OneKeyHardwareData() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneKeyHardwareData copy$default(OneKeyHardwareData oneKeyHardwareData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneKeyHardwareData.deviceId;
        }
        if ((i & 2) != 0) {
            list = oneKeyHardwareData.accountInfo;
        }
        return oneKeyHardwareData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAccountInfo> component2() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OneKeyHardwareData copy(String str, List<OneKeyAccountInfo> list) {
        return new OneKeyHardwareData(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OneKeyHardwareData)) {
            return false;
        }
        OneKeyHardwareData oneKeyHardwareData = (OneKeyHardwareData) obj;
        return Intrinsics.EZpvd((Object) this.deviceId, (Object) oneKeyHardwareData.deviceId) && Intrinsics.EZpvd(this.accountInfo, oneKeyHardwareData.accountInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OneKeyAccountInfo> getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.deviceId;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<OneKeyAccountInfo> list = this.accountInfo;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OneKeyHardwareData(deviceId=" + this.deviceId + ", accountInfo=" + this.accountInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OneKeyHardwareData> serializer() {
            return OneKeyHardwareData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OneKeyHardwareData(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str;
        }
        if ((i & 2) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(OneKeyHardwareData oneKeyHardwareData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || oneKeyHardwareData.deviceId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, oneKeyHardwareData.deviceId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && oneKeyHardwareData.accountInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], oneKeyHardwareData.accountInfo);
    }

    public OneKeyHardwareData(String str, List<OneKeyAccountInfo> list) {
        this.deviceId = str;
        this.accountInfo = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.model.wallet.OneKeyAccountInfo>):void (m)] (LINE:8) call: com.okinc.business.defi.biz.model.wallet.OneKeyHardwareData.<init>(java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ OneKeyHardwareData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}

package com.okinc.business.market.features.scanner.surge.trending.data;

import com.okinc.business.market.common.constants.StringBooleanType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class RankInfoData {
    public static final int $stable = 0;
    public final StringBooleanType isDefault;
    public final String rankChannelName;
    public final String rankName;
    public final String rankType;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, StringBooleanType.Companion.serializer()};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankInfoData() {
        this((String) null, (String) null, (String) null, (StringBooleanType) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankInfoData copy$default(RankInfoData rankInfoData, String str, String str2, String str3, StringBooleanType stringBooleanType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankInfoData.rankType;
        }
        if ((i & 2) != 0) {
            str2 = rankInfoData.rankChannelName;
        }
        if ((i & 4) != 0) {
            str3 = rankInfoData.rankName;
        }
        if ((i & 8) != 0) {
            stringBooleanType = rankInfoData.isDefault;
        }
        return rankInfoData.OLrzqt(str, str2, str3, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.rankType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankInfoData OLrzqt(String str, String str2, String str3, StringBooleanType stringBooleanType) {
        return new RankInfoData(str, str2, str3, stringBooleanType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.rankName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType copydefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankInfoData)) {
            return false;
        }
        RankInfoData rankInfoData = (RankInfoData) obj;
        return Intrinsics.EZpvd((Object) this.rankType, (Object) rankInfoData.rankType) && Intrinsics.EZpvd((Object) this.rankChannelName, (Object) rankInfoData.rankChannelName) && Intrinsics.EZpvd((Object) this.rankName, (Object) rankInfoData.rankName) && this.isDefault == rankInfoData.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.rankType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.rankChannelName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.rankName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        StringBooleanType stringBooleanType = this.isDefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (stringBooleanType != null ? stringBooleanType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankInfoData(rankType=" + this.rankType + ", rankChannelName=" + this.rankChannelName + ", rankName=" + this.rankName + ", isDefault=" + this.isDefault + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.data.RankInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RankInfoData> serializer() {
            return RankInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RankInfoData(int i, String str, String str2, String str3, StringBooleanType stringBooleanType, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.rankType = null;
        } else {
            this.rankType = str;
        }
        if ((i & 2) == 0) {
            this.rankChannelName = null;
        } else {
            this.rankChannelName = str2;
        }
        if ((i & 4) == 0) {
            this.rankName = null;
        } else {
            this.rankName = str3;
        }
        if ((i & 8) == 0) {
            this.isDefault = null;
        } else {
            this.isDefault = stringBooleanType;
        }
    }

    public static final /* synthetic */ void AEQbTJ(RankInfoData rankInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rankInfoData.rankType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rankInfoData.rankType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rankInfoData.rankChannelName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rankInfoData.rankChannelName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rankInfoData.rankName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rankInfoData.rankName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && rankInfoData.isDefault == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], rankInfoData.isDefault);
    }

    public RankInfoData(String str, String str2, String str3, StringBooleanType stringBooleanType) {
        this.rankType = str;
        this.rankChannelName = str2;
        this.rankName = str3;
        this.isDefault = stringBooleanType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.StringBooleanType) : (r5v0 com.okinc.business.market.common.constants.StringBooleanType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType):void (m)] (LINE:34) call: com.okinc.business.market.features.scanner.surge.trending.data.RankInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType):void type: THIS */
    public /* synthetic */ RankInfoData(String str, String str2, String str3, StringBooleanType stringBooleanType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : stringBooleanType);
    }
}

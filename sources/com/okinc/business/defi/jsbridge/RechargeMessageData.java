package com.okinc.business.defi.jsbridge;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class RechargeMessageData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Boolean addCustomToken;
    private Integer addressType;
    private String bizSource;
    private List<String> blackList;
    private String chainId;
    private String scene;
    private String tip;
    private String tokenAddress;
    private List<String> whiteList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<RechargeMessageData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RechargeMessageData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeMessageData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RechargeMessageData(string, string2, string3, string4, numValueOf, string5, boolValueOf, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeMessageData[] newArray(int i) {
            return new RechargeMessageData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RechargeMessageData() {
        this((String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (List) null, (List) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.blackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.whiteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RechargeMessageData copy(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, List<String> list, List<String> list2) {
        return new RechargeMessageData(str, str2, str3, str4, num, str5, bool, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RechargeMessageData)) {
            return false;
        }
        RechargeMessageData rechargeMessageData = (RechargeMessageData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) rechargeMessageData.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) rechargeMessageData.tokenAddress) && Intrinsics.EZpvd((Object) this.scene, (Object) rechargeMessageData.scene) && Intrinsics.EZpvd((Object) this.tip, (Object) rechargeMessageData.tip) && Intrinsics.EZpvd(this.addressType, rechargeMessageData.addressType) && Intrinsics.EZpvd((Object) this.bizSource, (Object) rechargeMessageData.bizSource) && Intrinsics.EZpvd(this.addCustomToken, rechargeMessageData.addCustomToken) && Intrinsics.EZpvd(this.blackList, rechargeMessageData.blackList) && Intrinsics.EZpvd(this.whiteList, rechargeMessageData.whiteList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAddCustomToken() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizSource() {
        return this.bizSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getBlackList() {
        return this.blackList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScene() {
        return this.scene;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWhiteList() {
        return this.whiteList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.chainId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.scene;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tip;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Integer num = this.addressType;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str5 = this.bizSource;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.addCustomToken;
        int iHashCode7 = bool == null ? 0 : bool.hashCode();
        List<String> list = this.blackList;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.whiteList;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddCustomToken(Boolean bool) {
        this.addCustomToken = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(Integer num) {
        this.addressType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBizSource(String str) {
        this.bizSource = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackList(List<String> list) {
        this.blackList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(String str) {
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScene(String str) {
        this.scene = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTip(String str) {
        this.tip = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWhiteList(List<String> list) {
        this.whiteList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RechargeMessageData(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", scene=" + this.scene + ", tip=" + this.tip + ", addressType=" + this.addressType + ", bizSource=" + this.bizSource + ", addCustomToken=" + this.addCustomToken + ", blackList=" + this.blackList + ", whiteList=" + this.whiteList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.scene);
        parcel.writeString(this.tip);
        Integer num = this.addressType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.bizSource);
        Boolean bool = this.addCustomToken;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeStringList(this.blackList);
        parcel.writeStringList(this.whiteList);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.jsbridge.RechargeMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RechargeMessageData> serializer() {
            return RechargeMessageData$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer)};
    }

    public /* synthetic */ RechargeMessageData(int i, String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.scene = null;
        } else {
            this.scene = str3;
        }
        if ((i & 8) == 0) {
            this.tip = null;
        } else {
            this.tip = str4;
        }
        if ((i & 16) == 0) {
            this.addressType = -1;
        } else {
            this.addressType = num;
        }
        if ((i & 32) == 0) {
            this.bizSource = null;
        } else {
            this.bizSource = str5;
        }
        if ((i & 64) == 0) {
            this.addCustomToken = Boolean.FALSE;
        } else {
            this.addCustomToken = bool;
        }
        if ((i & 128) == 0) {
            this.blackList = null;
        } else {
            this.blackList = list;
        }
        if ((i & 256) == 0) {
            this.whiteList = null;
        } else {
            this.whiteList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RechargeMessageData rechargeMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || rechargeMessageData.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, rechargeMessageData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || rechargeMessageData.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, rechargeMessageData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || rechargeMessageData.scene != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, rechargeMessageData.scene);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rechargeMessageData.tip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rechargeMessageData.tip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || (num = rechargeMessageData.addressType) == null || num.intValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, rechargeMessageData.addressType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || rechargeMessageData.bizSource != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, rechargeMessageData.bizSource);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(rechargeMessageData.addCustomToken, Boolean.FALSE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, rechargeMessageData.addCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rechargeMessageData.blackList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], rechargeMessageData.blackList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && rechargeMessageData.whiteList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], rechargeMessageData.whiteList);
    }

    public RechargeMessageData(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, List<String> list, List<String> list2) {
        this.chainId = str;
        this.tokenAddress = str2;
        this.scene = str3;
        this.tip = str4;
        this.addressType = num;
        this.bizSource = str5;
        this.addCustomToken = bool;
        this.blackList = list;
        this.whiteList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0036: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r17v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003b: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0043: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.util.List<java.lang.String>, java.util.List<java.lang.String>):void (m)] (LINE:76) call: com.okinc.business.defi.jsbridge.RechargeMessageData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.Boolean, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ RechargeMessageData(String str, String str2, String str3, String str4, Integer num, String str5, Boolean bool, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? -1 : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? Boolean.FALSE : bool, (i & 128) != 0 ? null : list, (i & 256) == 0 ? list2 : null);
    }
}

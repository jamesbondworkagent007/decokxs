package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig$$serializer;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData;
import com.okinc.business.dex.trade.core.domain.model.common.V6CallData$$serializer;
import com.okinc.business.dexlogic.bean.JitoData;
import com.okinc.business.dexlogic.bean.JitoData$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6CalldataResponseData implements Parcelable {
    private final ApproveUnsignedData approveTxInfo;
    private final V6CallData callData;
    private final Boolean hasReferralCommission;
    private final JitoData jitoData;
    private final MevConfig mevConfig;
    private final String orderId;
    private final String unsignedTx;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<V6CalldataResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<V6CalldataResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6CalldataResponseData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            V6CallData v6CallDataCreateFromParcel = parcel.readInt() == 0 ? null : V6CallData.CREATOR.createFromParcel(parcel);
            MevConfig mevConfigCreateFromParcel = parcel.readInt() == 0 ? null : MevConfig.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new V6CalldataResponseData(string, v6CallDataCreateFromParcel, mevConfigCreateFromParcel, string2, boolValueOf, parcel.readInt() == 0 ? null : JitoData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApproveUnsignedData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6CalldataResponseData[] newArray(int i) {
            return new V6CalldataResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V6CalldataResponseData() {
        this((String) null, (V6CallData) null, (MevConfig) null, (String) null, (Boolean) null, (JitoData) null, (ApproveUnsignedData) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ V6CalldataResponseData copy$default(V6CalldataResponseData v6CalldataResponseData, String str, V6CallData v6CallData, MevConfig mevConfig, String str2, Boolean bool, JitoData jitoData, ApproveUnsignedData approveUnsignedData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = v6CalldataResponseData.orderId;
        }
        if ((i & 2) != 0) {
            v6CallData = v6CalldataResponseData.callData;
        }
        V6CallData v6CallData2 = v6CallData;
        if ((i & 4) != 0) {
            mevConfig = v6CalldataResponseData.mevConfig;
        }
        MevConfig mevConfig2 = mevConfig;
        if ((i & 8) != 0) {
            str2 = v6CalldataResponseData.unsignedTx;
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            bool = v6CalldataResponseData.hasReferralCommission;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            jitoData = v6CalldataResponseData.jitoData;
        }
        JitoData jitoData2 = jitoData;
        if ((i & 64) != 0) {
            approveUnsignedData = v6CalldataResponseData.approveTxInfo;
        }
        return v6CalldataResponseData.copy(str, v6CallData2, mevConfig2, str3, bool2, jitoData2, approveUnsignedData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CallData component2() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig component3() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoData component6() {
        return this.jitoData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveUnsignedData component7() {
        return this.approveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CalldataResponseData copy(String str, V6CallData v6CallData, MevConfig mevConfig, String str2, Boolean bool, JitoData jitoData, ApproveUnsignedData approveUnsignedData) {
        return new V6CalldataResponseData(str, v6CallData, mevConfig, str2, bool, jitoData, approveUnsignedData);
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
        if (!(obj instanceof V6CalldataResponseData)) {
            return false;
        }
        V6CalldataResponseData v6CalldataResponseData = (V6CalldataResponseData) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) v6CalldataResponseData.orderId) && Intrinsics.EZpvd(this.callData, v6CalldataResponseData.callData) && Intrinsics.EZpvd(this.mevConfig, v6CalldataResponseData.mevConfig) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) v6CalldataResponseData.unsignedTx) && Intrinsics.EZpvd(this.hasReferralCommission, v6CalldataResponseData.hasReferralCommission) && Intrinsics.EZpvd(this.jitoData, v6CalldataResponseData.jitoData) && Intrinsics.EZpvd(this.approveTxInfo, v6CalldataResponseData.approveTxInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveUnsignedData getApproveTxInfo() {
        return this.approveTxInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6CallData getCallData() {
        return this.callData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasReferralCommission() {
        return this.hasReferralCommission;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JitoData getJitoData() {
        return this.jitoData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevConfig getMevConfig() {
        return this.mevConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.orderId;
        int iHashCode = str == null ? 0 : str.hashCode();
        V6CallData v6CallData = this.callData;
        int iHashCode2 = v6CallData == null ? 0 : v6CallData.hashCode();
        MevConfig mevConfig = this.mevConfig;
        int iHashCode3 = mevConfig == null ? 0 : mevConfig.hashCode();
        String str2 = this.unsignedTx;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.hasReferralCommission;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        JitoData jitoData = this.jitoData;
        int iHashCode6 = jitoData == null ? 0 : jitoData.hashCode();
        ApproveUnsignedData approveUnsignedData = this.approveTxInfo;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (approveUnsignedData != null ? approveUnsignedData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6CalldataResponseData(orderId=" + this.orderId + ", callData=" + this.callData + ", mevConfig=" + this.mevConfig + ", unsignedTx=" + this.unsignedTx + ", hasReferralCommission=" + this.hasReferralCommission + ", jitoData=" + this.jitoData + ", approveTxInfo=" + this.approveTxInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        V6CallData v6CallData = this.callData;
        if (v6CallData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v6CallData.writeToParcel(parcel, i);
        }
        MevConfig mevConfig = this.mevConfig;
        if (mevConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.unsignedTx);
        Boolean bool = this.hasReferralCommission;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        JitoData jitoData = this.jitoData;
        if (jitoData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jitoData.writeToParcel(parcel, i);
        }
        ApproveUnsignedData approveUnsignedData = this.approveTxInfo;
        if (approveUnsignedData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            approveUnsignedData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6CalldataResponseData> serializer() {
            return V6CalldataResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6CalldataResponseData(int i, String str, V6CallData v6CallData, MevConfig mevConfig, String str2, Boolean bool, JitoData jitoData, ApproveUnsignedData approveUnsignedData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.orderId = null;
        } else {
            this.orderId = str;
        }
        if ((i & 2) == 0) {
            this.callData = null;
        } else {
            this.callData = v6CallData;
        }
        if ((i & 4) == 0) {
            this.mevConfig = null;
        } else {
            this.mevConfig = mevConfig;
        }
        if ((i & 8) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str2;
        }
        if ((i & 16) == 0) {
            this.hasReferralCommission = null;
        } else {
            this.hasReferralCommission = bool;
        }
        if ((i & 32) == 0) {
            this.jitoData = null;
        } else {
            this.jitoData = jitoData;
        }
        if ((i & 64) == 0) {
            this.approveTxInfo = null;
        } else {
            this.approveTxInfo = approveUnsignedData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6CalldataResponseData v6CalldataResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6CalldataResponseData.orderId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, v6CalldataResponseData.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6CalldataResponseData.callData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, V6CallData$$serializer.INSTANCE, v6CalldataResponseData.callData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || v6CalldataResponseData.mevConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, MevConfig$$serializer.INSTANCE, v6CalldataResponseData.mevConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || v6CalldataResponseData.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, v6CalldataResponseData.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || v6CalldataResponseData.hasReferralCommission != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, v6CalldataResponseData.hasReferralCommission);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || v6CalldataResponseData.jitoData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, JitoData$$serializer.INSTANCE, v6CalldataResponseData.jitoData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && v6CalldataResponseData.approveTxInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ApproveUnsignedData$$serializer.INSTANCE, v6CalldataResponseData.approveTxInfo);
    }

    public V6CalldataResponseData(String str, V6CallData v6CallData, MevConfig mevConfig, String str2, Boolean bool, JitoData jitoData, ApproveUnsignedData approveUnsignedData) {
        this.orderId = str;
        this.callData = v6CallData;
        this.mevConfig = mevConfig;
        this.unsignedTx = str2;
        this.hasReferralCommission = bool;
        this.jitoData = jitoData;
        this.approveTxInfo = approveUnsignedData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.V6CallData:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.V6CallData) : (r8v0 com.okinc.business.dex.trade.core.domain.model.common.V6CallData))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.MevConfig:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.MevConfig) : (r9v0 com.okinc.business.dex.trade.core.domain.model.common.MevConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r11v0 java.lang.Boolean))
  (wrap:com.okinc.business.dexlogic.bean.JitoData:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.JitoData) : (r12v0 com.okinc.business.dexlogic.bean.JitoData))
  (wrap:com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData) : (r13v0 com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData))
 A[MD:(java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.V6CallData, com.okinc.business.dex.trade.core.domain.model.common.MevConfig, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.JitoData, com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData):void (m)] (LINE:19) call: com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData.<init>(java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.V6CallData, com.okinc.business.dex.trade.core.domain.model.common.MevConfig, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.JitoData, com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData):void type: THIS */
    public /* synthetic */ V6CalldataResponseData(String str, V6CallData v6CallData, MevConfig mevConfig, String str2, Boolean bool, JitoData jitoData, ApproveUnsignedData approveUnsignedData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : v6CallData, (i & 4) != 0 ? null : mevConfig, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : jitoData, (i & 64) != 0 ? null : approveUnsignedData);
    }
}

package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.Transient;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class V6QuoteResponseData implements V6BaseQuoteResponse, Parcelable {
    private final CommonDexInfo commonDexInfo;
    private final List<DefiPlatformInfo> defiPlatformInfoList;
    private final NetworkFeeInfo networkFeeInfo;
    private String selectedDeFiPlatformId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<V6QuoteResponseData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DefiPlatformInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<V6QuoteResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteResponseData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            CommonDexInfo commonDexInfoCreateFromParcel = parcel.readInt() == 0 ? null : CommonDexInfo.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DefiPlatformInfo.CREATOR.createFromParcel(parcel));
                }
            }
            return new V6QuoteResponseData(commonDexInfoCreateFromParcel, arrayList, parcel.readInt() != 0 ? NetworkFeeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V6QuoteResponseData[] newArray(int i) {
            return new V6QuoteResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public V6QuoteResponseData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ V6QuoteResponseData copy$default(V6QuoteResponseData v6QuoteResponseData, CommonDexInfo commonDexInfo, List list, NetworkFeeInfo networkFeeInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            commonDexInfo = v6QuoteResponseData.commonDexInfo;
        }
        if ((i & 2) != 0) {
            list = v6QuoteResponseData.defiPlatformInfoList;
        }
        if ((i & 4) != 0) {
            networkFeeInfo = v6QuoteResponseData.networkFeeInfo;
        }
        if ((i & 8) != 0) {
            str = v6QuoteResponseData.selectedDeFiPlatformId;
        }
        return v6QuoteResponseData.copy(commonDexInfo, list, networkFeeInfo, str);
    }

    @Transient
    public static /* synthetic */ void getSelectedDeFiPlatformId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo component1() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DefiPlatformInfo> component2() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkFeeInfo component3() {
        return this.networkFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.selectedDeFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V6QuoteResponseData copy(CommonDexInfo commonDexInfo, List<DefiPlatformInfo> list, NetworkFeeInfo networkFeeInfo, String str) {
        return new V6QuoteResponseData(commonDexInfo, list, networkFeeInfo, str);
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
        if (!(obj instanceof V6QuoteResponseData)) {
            return false;
        }
        V6QuoteResponseData v6QuoteResponseData = (V6QuoteResponseData) obj;
        return Intrinsics.EZpvd(this.commonDexInfo, v6QuoteResponseData.commonDexInfo) && Intrinsics.EZpvd(this.defiPlatformInfoList, v6QuoteResponseData.defiPlatformInfoList) && Intrinsics.EZpvd(this.networkFeeInfo, v6QuoteResponseData.networkFeeInfo) && Intrinsics.EZpvd((Object) this.selectedDeFiPlatformId, (Object) v6QuoteResponseData.selectedDeFiPlatformId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public CommonDexInfo getCommonDexInfo() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public List<DefiPlatformInfo> getDefiPlatformInfoList() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public NetworkFeeInfo getNetworkFeeInfo() {
        return this.networkFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public String getSelectedDeFiPlatformId() {
        return this.selectedDeFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        CommonDexInfo commonDexInfo = this.commonDexInfo;
        int iHashCode = commonDexInfo == null ? 0 : commonDexInfo.hashCode();
        List<DefiPlatformInfo> list = this.defiPlatformInfoList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        NetworkFeeInfo networkFeeInfo = this.networkFeeInfo;
        int iHashCode3 = networkFeeInfo == null ? 0 : networkFeeInfo.hashCode();
        String str = this.selectedDeFiPlatformId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setSelectedDeFiPlatformId(String str) {
        this.selectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V6QuoteResponseData(commonDexInfo=" + this.commonDexInfo + ", defiPlatformInfoList=" + this.defiPlatformInfoList + ", networkFeeInfo=" + this.networkFeeInfo + ", selectedDeFiPlatformId=" + this.selectedDeFiPlatformId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        CommonDexInfo commonDexInfo = this.commonDexInfo;
        if (commonDexInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            commonDexInfo.writeToParcel(parcel, i);
        }
        List<DefiPlatformInfo> list = this.defiPlatformInfoList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DefiPlatformInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        NetworkFeeInfo networkFeeInfo = this.networkFeeInfo;
        if (networkFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            networkFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.selectedDeFiPlatformId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<V6QuoteResponseData> serializer() {
            return V6QuoteResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ V6QuoteResponseData(int i, CommonDexInfo commonDexInfo, List list, NetworkFeeInfo networkFeeInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.commonDexInfo = null;
        } else {
            this.commonDexInfo = commonDexInfo;
        }
        if ((i & 2) == 0) {
            this.defiPlatformInfoList = null;
        } else {
            this.defiPlatformInfoList = list;
        }
        if ((i & 4) == 0) {
            this.networkFeeInfo = null;
        } else {
            this.networkFeeInfo = networkFeeInfo;
        }
        this.selectedDeFiPlatformId = null;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(V6QuoteResponseData v6QuoteResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || v6QuoteResponseData.getCommonDexInfo() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, CommonDexInfo$$serializer.INSTANCE, v6QuoteResponseData.getCommonDexInfo());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || v6QuoteResponseData.getDefiPlatformInfoList() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], v6QuoteResponseData.getDefiPlatformInfoList());
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && v6QuoteResponseData.getNetworkFeeInfo() == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, NetworkFeeInfo$$serializer.INSTANCE, v6QuoteResponseData.getNetworkFeeInfo());
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public AutoSlippageInfo autoSlippageInfo() {
        return V6BaseQuoteResponse.Application.copydefault(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean deFiPlatformNotAvailableAnymore(@NotNull String str) {
        return V6BaseQuoteResponse.Application.KWHzl(this, str);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public DefiPlatformInfo getSelectedDeFiPlatform() {
        return V6BaseQuoteResponse.Application.AEQbTJ(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isAutoConfirmQuotaRemaining() {
        return V6BaseQuoteResponse.Application.OLrzqt(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isBlackAddressErrorCode() {
        return V6BaseQuoteResponse.Application.KWHzl(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isHoneypotErrorCode() {
        return V6BaseQuoteResponse.Application.EZpvd(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isOKXPlatform() {
        return V6BaseQuoteResponse.Application.AYXKKw(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isOkxDexNotAvailableAnymore() {
        return V6BaseQuoteResponse.Application.AhwBna(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isQuoteAmountNotEmpty() {
        return V6BaseQuoteResponse.Application.gEmmrt(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean isSingle() {
        return V6BaseQuoteResponse.Application.valueOf(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public String receiveAmount() {
        return V6BaseQuoteResponse.Application.djBIcL(this);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public boolean showValueDiffWarn() {
        return V6BaseQuoteResponse.Application.isConnected(this);
    }

    public V6QuoteResponseData(CommonDexInfo commonDexInfo, List<DefiPlatformInfo> list, NetworkFeeInfo networkFeeInfo, String str) {
        this.commonDexInfo = commonDexInfo;
        this.defiPlatformInfoList = list;
        this.networkFeeInfo = networkFeeInfo;
        this.selectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.dex.trade.core.domain.model.CommonDexInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.CommonDexInfo) : (r2v0 com.okinc.business.dex.trade.core.domain.model.CommonDexInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo) : (r4v0 com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(com.okinc.business.dex.trade.core.domain.model.CommonDexInfo, java.util.List<com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo>, com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData.<init>(com.okinc.business.dex.trade.core.domain.model.CommonDexInfo, java.util.List, com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo, java.lang.String):void type: THIS */
    public /* synthetic */ V6QuoteResponseData(CommonDexInfo commonDexInfo, List list, NetworkFeeInfo networkFeeInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : commonDexInfo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : networkFeeInfo, (i & 8) != 0 ? null : str);
    }

    @Override // com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse
    public void setLocalSelectedDeFiPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        setSelectedDeFiPlatformId(str);
    }
}

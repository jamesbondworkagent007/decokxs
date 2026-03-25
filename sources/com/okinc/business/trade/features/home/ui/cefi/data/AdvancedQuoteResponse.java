package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap$$serializer;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TraceData$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C31212lpk;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class AdvancedQuoteResponse implements Parcelable {
    private final AdvancedCommonDexInfo commonDexInfo;
    private final List<DeFiPlatformForSwap> defiPlatformInfoList;
    private final Integer errorCode;
    private final String errorMsg;
    private final String expirationTime;
    private final boolean hasError;
    private String localSelectedDeFiPlatformId;
    private final TraceData traceData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AdvancedQuoteResponse> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(DeFiPlatformForSwap$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<AdvancedQuoteResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            AdvancedCommonDexInfo advancedCommonDexInfoCreateFromParcel = AdvancedCommonDexInfo.CREATOR.createFromParcel(parcel);
            TraceData traceDataCreateFromParcel = parcel.readInt() == 0 ? null : TraceData.CREATOR.createFromParcel(parcel);
            boolean z = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DeFiPlatformForSwap.CREATOR.createFromParcel(parcel));
            }
            return new AdvancedQuoteResponse(advancedCommonDexInfoCreateFromParcel, traceDataCreateFromParcel, z, numValueOf, string, string2, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteResponse[] newArray(int i) {
            return new AdvancedQuoteResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedQuoteResponse() {
        this((AdvancedCommonDexInfo) null, (TraceData) null, false, (Integer) null, (String) null, (String) null, (List) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component8() {
        return this.localSelectedDeFiPlatformId;
    }

    @SerialName("cefiModeCommonDexInfo")
    public static /* synthetic */ void getCommonDexInfo$annotations() {
    }

    @SerialName("traceData")
    public static /* synthetic */ void getTraceData$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedCommonDexInfo component1() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component2() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> component7() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedQuoteResponse copy(@NotNull AdvancedCommonDexInfo advancedCommonDexInfo, TraceData traceData, boolean z, Integer num, String str, String str2, @NotNull List<DeFiPlatformForSwap> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(advancedCommonDexInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AdvancedQuoteResponse(advancedCommonDexInfo, traceData, z, num, str, str2, list, str3);
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
        if (!(obj instanceof AdvancedQuoteResponse)) {
            return false;
        }
        AdvancedQuoteResponse advancedQuoteResponse = (AdvancedQuoteResponse) obj;
        return Intrinsics.EZpvd(this.commonDexInfo, advancedQuoteResponse.commonDexInfo) && Intrinsics.EZpvd(this.traceData, advancedQuoteResponse.traceData) && this.hasError == advancedQuoteResponse.hasError && Intrinsics.EZpvd(this.errorCode, advancedQuoteResponse.errorCode) && Intrinsics.EZpvd((Object) this.errorMsg, (Object) advancedQuoteResponse.errorMsg) && Intrinsics.EZpvd((Object) this.expirationTime, (Object) advancedQuoteResponse.expirationTime) && Intrinsics.EZpvd(this.defiPlatformInfoList, advancedQuoteResponse.defiPlatformInfoList) && Intrinsics.EZpvd((Object) this.localSelectedDeFiPlatformId, (Object) advancedQuoteResponse.localSelectedDeFiPlatformId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedCommonDexInfo getCommonDexInfo() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> getDefiPlatformInfoList() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpirationTime() {
        return this.expirationTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.commonDexInfo.hashCode();
        TraceData traceData = this.traceData;
        int iHashCode2 = traceData == null ? 0 : traceData.hashCode();
        int iHashCode3 = Boolean.hashCode(this.hasError);
        Integer num = this.errorCode;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        String str = this.errorMsg;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.expirationTime;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.defiPlatformInfoList.hashCode()) * 31) + this.localSelectedDeFiPlatformId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalSelectedDeFiPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localSelectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedQuoteResponse(commonDexInfo=" + this.commonDexInfo + ", traceData=" + this.traceData + ", hasError=" + this.hasError + ", errorCode=" + this.errorCode + ", errorMsg=" + this.errorMsg + ", expirationTime=" + this.expirationTime + ", defiPlatformInfoList=" + this.defiPlatformInfoList + ", localSelectedDeFiPlatformId=" + this.localSelectedDeFiPlatformId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.commonDexInfo.writeToParcel(parcel, i);
        TraceData traceData = this.traceData;
        if (traceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            traceData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasError ? 1 : 0);
        Integer num = this.errorCode;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.errorMsg);
        parcel.writeString(this.expirationTime);
        List<DeFiPlatformForSwap> list = this.defiPlatformInfoList;
        parcel.writeInt(list.size());
        Iterator<DeFiPlatformForSwap> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.localSelectedDeFiPlatformId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AdvancedQuoteResponse> serializer() {
            return AdvancedQuoteResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AdvancedQuoteResponse(int i, AdvancedCommonDexInfo advancedCommonDexInfo, TraceData traceData, boolean z, Integer num, String str, String str2, List list, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.commonDexInfo = (i & 1) == 0 ? new AdvancedCommonDexInfo((String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (List) null, (NonMevPriorityFeeInfo) null, false, false, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null) : advancedCommonDexInfo;
        this.traceData = (i & 2) == 0 ? new TraceData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : traceData;
        this.hasError = (i & 4) == 0 ? false : z;
        if ((i & 8) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num;
        }
        if ((i & 16) == 0) {
            this.errorMsg = null;
        } else {
            this.errorMsg = str;
        }
        if ((i & 32) == 0) {
            this.expirationTime = null;
        } else {
            this.expirationTime = str2;
        }
        this.defiPlatformInfoList = (i & 64) == 0 ? yDY.AhwBna() : list;
        this.localSelectedDeFiPlatformId = (i & 128) == 0 ? "" : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [43=4] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(AdvancedQuoteResponse advancedQuoteResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, AdvancedCommonDexInfo$$serializer.INSTANCE, advancedQuoteResponse.commonDexInfo);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(advancedQuoteResponse.commonDexInfo, new AdvancedCommonDexInfo((String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, str, str, (List) null, (NonMevPriorityFeeInfo) null, false, false, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(advancedQuoteResponse.traceData, new TraceData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, TraceData$$serializer.INSTANCE, advancedQuoteResponse.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || advancedQuoteResponse.hasError) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, advancedQuoteResponse.hasError);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || advancedQuoteResponse.errorCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, advancedQuoteResponse.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || advancedQuoteResponse.errorMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, advancedQuoteResponse.errorMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || advancedQuoteResponse.expirationTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, advancedQuoteResponse.expirationTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(advancedQuoteResponse.defiPlatformInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], advancedQuoteResponse.defiPlatformInfoList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) advancedQuoteResponse.localSelectedDeFiPlatformId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, advancedQuoteResponse.localSelectedDeFiPlatformId);
    }

    public AdvancedQuoteResponse(@NotNull AdvancedCommonDexInfo advancedCommonDexInfo, TraceData traceData, boolean z, Integer num, String str, String str2, @NotNull List<DeFiPlatformForSwap> list, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(advancedCommonDexInfo, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.commonDexInfo = advancedCommonDexInfo;
        this.traceData = traceData;
        this.hasError = z;
        this.errorCode = num;
        this.errorMsg = str;
        this.expirationTime = str2;
        this.defiPlatformInfoList = list;
        this.localSelectedDeFiPlatformId = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008d: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo:?: TERNARY null = ((wrap:int:0x0002: ARITH (r37v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo:?: CAST (com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo) (null com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (8388607 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:48) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo.<init>(java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.lang.String, java.lang.String, java.util.List, com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r29v0 com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo))
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x0035: ARITH (r37v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:50) call: com.okinc.business.dexlogic.bean.TraceData.<init>(java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r30v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0047: ARITH (r37v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x004f: ARITH (r37v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r32v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r37v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0060: ARITH (r37v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r34v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0067: ARITH (r37v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:55)) : (r35v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r37v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
 A[MD:(com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo, com.okinc.business.dexlogic.bean.TraceData, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.util.List<com.okinc.business.dexlogic.bean.DeFiPlatformForSwap>, java.lang.String):void (m)] (LINE:46) call: com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse.<init>(com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo, com.okinc.business.dexlogic.bean.TraceData, boolean, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AdvancedQuoteResponse(AdvancedCommonDexInfo advancedCommonDexInfo, TraceData traceData, boolean z, Integer num, String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AdvancedCommonDexInfo((String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (String) null, (String) null, (List) null, (NonMevPriorityFeeInfo) null, false, false, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, 8388607, (DefaultConstructorMarker) null) : advancedCommonDexInfo, (i & 2) != 0 ? new TraceData((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null) : traceData, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? "" : str3);
    }

    public final boolean isBlackAddressErrorCode() {
        Integer num = this.errorCode;
        return num != null && C31212lpk.copydefault.EZpvd(num.intValue());
    }

    public final boolean isHoneypotErrorCode() {
        Integer num = this.errorCode;
        return num != null && C31212lpk.copydefault.OLrzqt(num.intValue());
    }

    public final boolean isDAppRedirectDueToInsufficientLiquidityErrorCode() {
        Integer num = this.errorCode;
        return num != null && C31212lpk.copydefault.KWHzl(num.intValue());
    }

    public final boolean isHoneypotWarningCode() {
        return C31212lpk.copydefault.OLrzqt(C33129mqd.AhwBna(this.commonDexInfo.getCode()));
    }

    public final DeFiPlatformForSwap getSelectedDeFiPlatform() {
        Object next;
        Iterator<T> it = this.defiPlatformInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (Object) this.localSelectedDeFiPlatformId)) {
                break;
            }
        }
        DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) next;
        return deFiPlatformForSwap == null ? (DeFiPlatformForSwap) CollectionsKt___CollectionsKt.firstOrNull(this.defiPlatformInfoList) : deFiPlatformForSwap;
    }

    public final boolean deFiPlatformNotAvailableAnymore(@NotNull String str) {
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<T> it = this.defiPlatformInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (Object) str)) {
                break;
            }
        }
        return next == null;
    }

    public final boolean isOkxDexNotAvailableAnymore() {
        Object next;
        Iterator<T> it = this.defiPlatformInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((DeFiPlatformForSwap) next).getDefiPlatformId(), (Object) "11")) {
                break;
            }
        }
        return next == null;
    }
}

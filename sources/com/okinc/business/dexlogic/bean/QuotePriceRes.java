package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo$$serializer;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexui.main.swap.setting.widget.NetWorkFeeShowType;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C22333hdQ;
import o.C22337hdU;
import o.C22380heK;
import o.C23271hvA;
import o.C23272hvB;
import o.C23311hvo;
import o.C23313hvq;
import o.C31212lpk;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class QuotePriceRes implements Parcelable {
    public static final String BRIDGE = "2";
    public static final String FROM_POOL = "fromPool";
    public static final String FROM_TOKEN = "1";
    public static final String MULTI = "1";
    public static final String NORMAL_TYPE = "1";
    public static final String SAFEMOON_TYPE = "2";
    public static final String SINGLE = "0";
    public static final String TO_POOL = "toPool";
    public static final String TO_TOKEN = "3";
    public static final String UNKNOWN = "";
    private final CommonDexInfo commonDexInfo;
    private final List<DeFiPlatformForSwap> defiPlatformInfoList;
    private boolean isReset;
    private final String isSupportDappTrade;
    private boolean localAAReservedQuote;
    private String localSelectedDeFiPlatformId;
    private String localVerifyDexUniqueKey;
    private final List<PathSelectionRouterItem> pathSelectionRouterList;
    private final SwapPriorityFeeInfo priorityFeeInfo;
    private boolean success;
    private final String swapType;
    private final TraceData traceData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuotePriceRes> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DeFiPlatformForSwap$$serializer.INSTANCE), new ArrayListSerializer(PathSelectionRouterItem$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null};

    public static final class Creator implements Parcelable.Creator<QuotePriceRes> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuotePriceRes createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(DeFiPlatformForSwap.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                arrayList = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList.add(PathSelectionRouterItem.CREATOR.createFromParcel(parcel));
                }
            }
            return new QuotePriceRes(arrayList2, arrayList, parcel.readString(), CommonDexInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : TraceData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SwapPriorityFeeInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuotePriceRes[] newArray(int i) {
            return new QuotePriceRes[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuotePriceRes() {
        this((List) null, (List) null, (String) null, (CommonDexInfo) null, false, false, false, (String) null, (TraceData) null, (SwapPriorityFeeInfo) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component11() {
        return this.localVerifyDexUniqueKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component12() {
        return this.localSelectedDeFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> component1() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapPriorityFeeInfo component10() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PathSelectionRouterItem> component2() {
        return this.pathSelectionRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo component4() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.localAAReservedQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component9() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceRes copy(@NotNull List<DeFiPlatformForSwap> list, List<PathSelectionRouterItem> list2, @NotNull String str, @NotNull CommonDexInfo commonDexInfo, boolean z, boolean z2, boolean z3, @NotNull String str2, TraceData traceData, SwapPriorityFeeInfo swapPriorityFeeInfo, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new QuotePriceRes(list, list2, str, commonDexInfo, z, z2, z3, str2, traceData, swapPriorityFeeInfo, str3, str4);
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
        if (!(obj instanceof QuotePriceRes)) {
            return false;
        }
        QuotePriceRes quotePriceRes = (QuotePriceRes) obj;
        return Intrinsics.EZpvd(this.defiPlatformInfoList, quotePriceRes.defiPlatformInfoList) && Intrinsics.EZpvd(this.pathSelectionRouterList, quotePriceRes.pathSelectionRouterList) && Intrinsics.EZpvd((Object) this.swapType, (Object) quotePriceRes.swapType) && Intrinsics.EZpvd(this.commonDexInfo, quotePriceRes.commonDexInfo) && this.success == quotePriceRes.success && this.isReset == quotePriceRes.isReset && this.localAAReservedQuote == quotePriceRes.localAAReservedQuote && Intrinsics.EZpvd((Object) this.isSupportDappTrade, (Object) quotePriceRes.isSupportDappTrade) && Intrinsics.EZpvd(this.traceData, quotePriceRes.traceData) && Intrinsics.EZpvd(this.priorityFeeInfo, quotePriceRes.priorityFeeInfo) && Intrinsics.EZpvd((Object) this.localVerifyDexUniqueKey, (Object) quotePriceRes.localVerifyDexUniqueKey) && Intrinsics.EZpvd((Object) this.localSelectedDeFiPlatformId, (Object) quotePriceRes.localSelectedDeFiPlatformId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CommonDexInfo getCommonDexInfo() {
        return this.commonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> getDefiPlatformInfoList() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalAAReservedQuote() {
        return this.localAAReservedQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PathSelectionRouterItem> getPathSelectionRouterList() {
        return this.pathSelectionRouterList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapPriorityFeeInfo getPriorityFeeInfo() {
        return this.priorityFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapType() {
        return this.swapType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.defiPlatformInfoList.hashCode();
        List<PathSelectionRouterItem> list = this.pathSelectionRouterList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.swapType.hashCode();
        int iHashCode4 = this.commonDexInfo.hashCode();
        int iHashCode5 = Boolean.hashCode(this.success);
        int iHashCode6 = Boolean.hashCode(this.isReset);
        int iHashCode7 = Boolean.hashCode(this.localAAReservedQuote);
        int iHashCode8 = this.isSupportDappTrade.hashCode();
        TraceData traceData = this.traceData;
        int iHashCode9 = traceData == null ? 0 : traceData.hashCode();
        SwapPriorityFeeInfo swapPriorityFeeInfo = this.priorityFeeInfo;
        int iHashCode10 = swapPriorityFeeInfo == null ? 0 : swapPriorityFeeInfo.hashCode();
        String str = this.localVerifyDexUniqueKey;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.localSelectedDeFiPlatformId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isReset() {
        return this.isReset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSupportDappTrade() {
        return this.isSupportDappTrade;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void resetVerifyDexUniqueKey() {
        this.localVerifyDexUniqueKey = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalAAReservedQuote(boolean z) {
        this.localAAReservedQuote = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalSelectedDeFiPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localSelectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReset(boolean z) {
        this.isReset = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSuccess(boolean z) {
        this.success = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuotePriceRes(defiPlatformInfoList=" + this.defiPlatformInfoList + ", pathSelectionRouterList=" + this.pathSelectionRouterList + ", swapType=" + this.swapType + ", commonDexInfo=" + this.commonDexInfo + ", success=" + this.success + ", isReset=" + this.isReset + ", localAAReservedQuote=" + this.localAAReservedQuote + ", isSupportDappTrade=" + this.isSupportDappTrade + ", traceData=" + this.traceData + ", priorityFeeInfo=" + this.priorityFeeInfo + ", localVerifyDexUniqueKey=" + this.localVerifyDexUniqueKey + ", localSelectedDeFiPlatformId=" + this.localSelectedDeFiPlatformId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DeFiPlatformForSwap> list = this.defiPlatformInfoList;
        parcel.writeInt(list.size());
        Iterator<DeFiPlatformForSwap> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<PathSelectionRouterItem> list2 = this.pathSelectionRouterList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<PathSelectionRouterItem> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.swapType);
        this.commonDexInfo.writeToParcel(parcel, i);
        parcel.writeInt(this.success ? 1 : 0);
        parcel.writeInt(this.isReset ? 1 : 0);
        parcel.writeInt(this.localAAReservedQuote ? 1 : 0);
        parcel.writeString(this.isSupportDappTrade);
        TraceData traceData = this.traceData;
        if (traceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            traceData.writeToParcel(parcel, i);
        }
        SwapPriorityFeeInfo swapPriorityFeeInfo = this.priorityFeeInfo;
        if (swapPriorityFeeInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            swapPriorityFeeInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.localVerifyDexUniqueKey);
        parcel.writeString(this.localSelectedDeFiPlatformId);
    }

    public /* synthetic */ QuotePriceRes(int i, List list, List list2, String str, CommonDexInfo commonDexInfo, boolean z, boolean z2, boolean z3, String str2, TraceData traceData, SwapPriorityFeeInfo swapPriorityFeeInfo, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.defiPlatformInfoList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.pathSelectionRouterList = null;
        } else {
            this.pathSelectionRouterList = list2;
        }
        if ((i & 4) == 0) {
            this.swapType = "";
        } else {
            this.swapType = str;
        }
        this.commonDexInfo = (i & 8) == 0 ? new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null) : commonDexInfo;
        if ((i & 16) == 0) {
            this.success = false;
        } else {
            this.success = z;
        }
        if ((i & 32) == 0) {
            this.isReset = false;
        } else {
            this.isReset = z2;
        }
        if ((i & 64) == 0) {
            this.localAAReservedQuote = false;
        } else {
            this.localAAReservedQuote = z3;
        }
        if ((i & 128) == 0) {
            this.isSupportDappTrade = "";
        } else {
            this.isSupportDappTrade = str2;
        }
        if ((i & 256) == 0) {
            this.traceData = null;
        } else {
            this.traceData = traceData;
        }
        if ((i & 512) == 0) {
            this.priorityFeeInfo = null;
        } else {
            this.priorityFeeInfo = swapPriorityFeeInfo;
        }
        if ((i & 1024) == 0) {
            this.localVerifyDexUniqueKey = null;
        } else {
            this.localVerifyDexUniqueKey = str3;
        }
        if ((i & 2048) == 0) {
            this.localSelectedDeFiPlatformId = "";
        } else {
            this.localSelectedDeFiPlatformId = str4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuotePriceRes quotePriceRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(quotePriceRes.defiPlatformInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], quotePriceRes.defiPlatformInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || quotePriceRes.pathSelectionRouterList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], quotePriceRes.pathSelectionRouterList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quotePriceRes.swapType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quotePriceRes.swapType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3)) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, CommonDexInfo$$serializer.INSTANCE, quotePriceRes.commonDexInfo);
        } else {
            String str = null;
            if (!Intrinsics.EZpvd(quotePriceRes.commonDexInfo, new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null))) {
            }
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || quotePriceRes.success) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, quotePriceRes.success);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || quotePriceRes.isReset) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, quotePriceRes.isReset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || quotePriceRes.localAAReservedQuote) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, quotePriceRes.localAAReservedQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) quotePriceRes.isSupportDappTrade, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, quotePriceRes.isSupportDappTrade);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || quotePriceRes.traceData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, TraceData$$serializer.INSTANCE, quotePriceRes.traceData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || quotePriceRes.priorityFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, SwapPriorityFeeInfo$$serializer.INSTANCE, quotePriceRes.priorityFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || quotePriceRes.localVerifyDexUniqueKey != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, quotePriceRes.localVerifyDexUniqueKey);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) quotePriceRes.localSelectedDeFiPlatformId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, quotePriceRes.localSelectedDeFiPlatformId);
    }

    public QuotePriceRes(@NotNull List<DeFiPlatformForSwap> list, List<PathSelectionRouterItem> list2, @NotNull String str, @NotNull CommonDexInfo commonDexInfo, boolean z, boolean z2, boolean z3, @NotNull String str2, TraceData traceData, SwapPriorityFeeInfo swapPriorityFeeInfo, String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(commonDexInfo, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.defiPlatformInfoList = list;
        this.pathSelectionRouterList = list2;
        this.swapType = str;
        this.commonDexInfo = commonDexInfo;
        this.success = z;
        this.isReset = z2;
        this.localAAReservedQuote = z3;
        this.isSupportDappTrade = str2;
        this.traceData = traceData;
        this.priorityFeeInfo = swapPriorityFeeInfo;
        this.localVerifyDexUniqueKey = str3;
        this.localSelectedDeFiPlatformId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00cb: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r60v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:381)) : (r48v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000d: ARITH (r60v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r49v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r60v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.CommonDexInfo:?: TERNARY null = ((wrap:int:0x0020: ARITH (r60v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean:?: CAST (com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean) (null com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean))
  (wrap:com.okinc.business.dexlogic.bean.DefiPlatformInfo:?: CAST (com.okinc.business.dexlogic.bean.DefiPlatformInfo) (null com.okinc.business.dexlogic.bean.DefiPlatformInfo))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (-1 int)
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:384) call: com.okinc.business.dexlogic.bean.CommonDexInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DefiPlatformInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r51v0 com.okinc.business.dexlogic.bean.CommonDexInfo))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0073: ARITH (r60v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r52v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007c: ARITH (r60v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r53v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0084: ARITH (r60v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r54v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008b: ARITH (r60v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.TraceData:?: TERNARY null = ((wrap:int:0x0093: ARITH (r60v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.TraceData) : (r56v0 com.okinc.business.dexlogic.bean.TraceData))
  (wrap:com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo:?: TERNARY null = ((wrap:int:0x009b: ARITH (r60v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo) : (r57v0 com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r60v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r58v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r60v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r59v0 java.lang.String) : (""))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.DeFiPlatformForSwap>, java.util.List<com.okinc.business.dexlogic.bean.PathSelectionRouterItem>, java.lang.String, com.okinc.business.dexlogic.bean.CommonDexInfo, boolean, boolean, boolean, java.lang.String, com.okinc.business.dexlogic.bean.TraceData, com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo, java.lang.String, java.lang.String):void (m)] (LINE:380) call: com.okinc.business.dexlogic.bean.QuotePriceRes.<init>(java.util.List, java.util.List, java.lang.String, com.okinc.business.dexlogic.bean.CommonDexInfo, boolean, boolean, boolean, java.lang.String, com.okinc.business.dexlogic.bean.TraceData, com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ QuotePriceRes(List list, List list2, String str, CommonDexInfo commonDexInfo, boolean z, boolean z2, boolean z3, String str2, TraceData traceData, SwapPriorityFeeInfo swapPriorityFeeInfo, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? new CommonDexInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiTokenInfoBean) null, (DexMultiTokenInfoBean) null, (DefiPlatformInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 15, (DefaultConstructorMarker) null) : commonDexInfo, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? z3 : false, (i & 128) != 0 ? "" : str2, (i & 256) != 0 ? null : traceData, (i & 512) != 0 ? null : swapPriorityFeeInfo, (i & 1024) == 0 ? str3 : null, (i & 2048) == 0 ? str4 : "");
    }

    public final boolean isAutoConfirmQuotaRemaining() {
        return this.commonDexInfo.getRemainingQuota().length() == 0 || C33129mqd.copydefault(this.commonDexInfo.getRemainingQuota(), this.commonDexInfo.getFromTokenAmount());
    }

    public final String getSlippageFixedMin(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (getSafeMoonToken()) {
            return C33129mqd.gEmmrt(Double.valueOf(Math.max(C33129mqd.AEQbTJ(str2), C33129mqd.AEQbTJ(str))));
        }
        return isSingle() ? str : str2;
    }

    public final String getFirstDefiPlatformInfo() {
        DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) CollectionsKt___CollectionsKt.firstOrNull(this.defiPlatformInfoList);
        String defiPlatformId = deFiPlatformForSwap != null ? deFiPlatformForSwap.getDefiPlatformId() : null;
        return defiPlatformId == null ? "" : defiPlatformId;
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

    public final String getPlatformId(boolean z) {
        DexQuoteBridgeVO bridge;
        String defiPlatformId = null;
        if (z) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                defiPlatformId = selectedDeFiPlatform.getDefiPlatformId();
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (bridge = selectRouterItem$default.getBridge()) != null) {
                defiPlatformId = bridge.getDefiPlatformId();
            }
        }
        return defiPlatformId == null ? getDeFiPlatformInfo().getId() : defiPlatformId;
    }

    public final boolean showValueDiffWarn() {
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getShowValueDiffWarn();
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null) {
                return selectRouterItem$default.showValueDiffWarn();
            }
        }
        return false;
    }

    public final String getValueDiffStr() {
        String diffPercent;
        String strCopydefault;
        String diffValue;
        String strCopydefault2;
        String diffPercent2;
        String strCopydefault3;
        String diffValue2;
        String strCopydefault4;
        String percent$default = null;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            String scientificCurrency$default = (selectedDeFiPlatform == null || (diffValue2 = selectedDeFiPlatform.getDiffValue()) == null || (strCopydefault4 = C23311hvo.copydefault(diffValue2)) == null) ? null : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strCopydefault4, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
            if (selectedDeFiPlatform != null && (diffPercent2 = selectedDeFiPlatform.getDiffPercent()) != null && (strCopydefault3 = C23311hvo.copydefault(diffPercent2)) != null) {
                percent$default = C23311hvo.formatPercent$default(strCopydefault3, false, 0, 0, null, null, 31, null);
            }
            return percent$default + " (≈" + scientificCurrency$default + ")";
        }
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        ValueDiffInfo valueDiffInfo = selectRouterItem$default != null ? selectRouterItem$default.getValueDiffInfo() : null;
        String scientificCurrency$default2 = (valueDiffInfo == null || (diffValue = valueDiffInfo.getDiffValue()) == null || (strCopydefault2 = C23311hvo.copydefault(diffValue)) == null) ? null : C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, strCopydefault2, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
        if (valueDiffInfo != null && (diffPercent = valueDiffInfo.getDiffPercent()) != null && (strCopydefault = C23311hvo.copydefault(diffPercent)) != null) {
            percent$default = C23311hvo.formatPercent$default(strCopydefault, false, 0, 0, null, null, 31, null);
        }
        return percent$default + " (≈" + scientificCurrency$default2 + ")";
    }

    public final ServiceFeeInfo getServiceFeeInfo() {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            return selectedDeFiPlatform.getServiceFeeInfo();
        }
        return null;
    }

    public final String getRefCode() {
        ServiceFeeInfo serviceFeeInfo = getServiceFeeInfo();
        String refCode = serviceFeeInfo != null ? serviceFeeInfo.getRefCode() : null;
        return refCode == null ? "" : refCode;
    }

    public final String getRefAddress() {
        ServiceFeeInfo serviceFeeInfo = getServiceFeeInfo();
        String referralCommissionAddress = serviceFeeInfo != null ? serviceFeeInfo.getReferralCommissionAddress() : null;
        return referralCommissionAddress == null ? "" : referralCommissionAddress;
    }

    public final String getPlatformName(boolean z) {
        DexQuoteBridgeVO bridge;
        String name;
        if (z) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            return (selectedDeFiPlatform == null || (name = selectedDeFiPlatform.getName()) == null) ? getDeFiPlatformInfo().getDefiPlatformName() : name;
        }
        if (isIntentBridge()) {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            String bridgeName = (selectRouterItem$default == null || (bridge = selectRouterItem$default.getBridge()) == null) ? null : bridge.getBridgeName();
            return bridgeName == null ? "" : bridgeName;
        }
        return getDeFiPlatformInfo().getDefiPlatformName();
    }

    public final String getPlatformLogo() {
        String logo;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return (selectedDeFiPlatform == null || (logo = selectedDeFiPlatform.getLogo()) == null) ? getDeFiPlatformInfo().getLogoUrl() : logo;
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

    public final boolean isOKXPlatform() {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return Intrinsics.EZpvd((Object) (selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null), (Object) "11");
    }

    public final boolean isHighPriceDifference() {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null) {
            return false;
        }
        return C23313hvq.EZpvd(selectedDeFiPlatform.getReducePercent(), selectedDeFiPlatform.getWarnPercent());
    }

    public final NetWorkFeeShowType getNetworkFeeShowType() {
        if (isPMM()) {
            return NetWorkFeeShowType.FREE_WITH_FEE_CROSSED;
        }
        return NetWorkFeeShowType.NOT_FREE;
    }

    public final boolean dAppRedirectDueToInsufficientLiquidity() {
        return Intrinsics.EZpvd((Object) this.isSupportDappTrade, (Object) "1");
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuotePriceRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<QuotePriceRes> serializer() {
            return QuotePriceRes$$serializer.INSTANCE;
        }
    }

    public final boolean checkNeedApprove() {
        if (isSingle()) {
            return Intrinsics.EZpvd((Object) this.commonDexInfo.getNeedApprove(), (Object) "1");
        }
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return Intrinsics.EZpvd((Object) (selectRouterItem$default != null ? selectRouterItem$default.getNeedApprove() : null), (Object) "1");
    }

    public final boolean lackLiquid() {
        return receiveAmount().length() == 0;
    }

    public final boolean isQuoteAmountNotEmpty() {
        return C33129mqd.OLrzqt((CharSequence) receiveAmount());
    }

    public final String receiveAmount() {
        String receiveAmount;
        String receiveAmount2;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && (receiveAmount2 = selectedDeFiPlatform.getReceiveAmount()) != null) {
                return receiveAmount2;
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (receiveAmount = selectRouterItem$default.getReceiveAmount()) != null) {
                return receiveAmount;
            }
        }
        return "";
    }

    public static /* synthetic */ PathSelectionRouterItem getSelectRouterItem$default(QuotePriceRes quotePriceRes, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return quotePriceRes.getSelectRouterItem(str);
    }

    public final PathSelectionRouterItem getSelectRouterItem(String str) {
        Object next;
        Object obj = null;
        if (str != null) {
            List<PathSelectionRouterItem> list = this.pathSelectionRouterList;
            if (list == null) {
                return null;
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                DexQuoteBridgeVO bridge = ((PathSelectionRouterItem) next2).getBridge();
                if (Intrinsics.EZpvd((Object) (bridge != null ? bridge.getBridgeId() : null), (Object) str)) {
                    obj = next2;
                    break;
                }
            }
            return (PathSelectionRouterItem) obj;
        }
        List<PathSelectionRouterItem> list2 = this.pathSelectionRouterList;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((PathSelectionRouterItem) next).getLocalSelected()) {
                    break;
                }
            }
            PathSelectionRouterItem pathSelectionRouterItem = (PathSelectionRouterItem) next;
            if (pathSelectionRouterItem != null) {
                return pathSelectionRouterItem;
            }
        }
        List<PathSelectionRouterItem> list3 = this.pathSelectionRouterList;
        if (list3 != null) {
            return (PathSelectionRouterItem) CollectionsKt___CollectionsKt.firstOrNull(list3);
        }
        return null;
    }

    public final String getSefiPlatformId() {
        DexQuoteBridgeVO bridge;
        String defiPlatformId = null;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null && (bridge = selectRouterItem$default.getBridge()) != null) {
            defiPlatformId = bridge.getDefiPlatformId();
        }
        return defiPlatformId == null ? "" : defiPlatformId;
    }

    public final String getFromTokenAmount(boolean z) {
        String receiveAmount;
        if (this.localAAReservedQuote || !z) {
            return this.commonDexInfo.getFromTokenAmount();
        }
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return (selectedDeFiPlatform == null || (receiveAmount = selectedDeFiPlatform.getReceiveAmount()) == null) ? "" : receiveAmount;
    }

    public final boolean isCheckForwardAmountError(String str) {
        return C23313hvq.AhwBna(str, this.commonDexInfo.getFromTokenAmount());
    }

    public final boolean isCheckReverseAmountError(String str) {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return C23313hvq.AhwBna(str, selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getPriceDiffAmount() {
        ValueDiffInfo valueDiffInfo;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            diffPercent = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDiffPercent() : null;
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (valueDiffInfo = selectRouterItem$default.getValueDiffInfo()) != null) {
                diffPercent = valueDiffInfo.getDiffPercent();
            }
        }
    }

    public final String getPriceDiffAmountShow() {
        String priceDiffAmount = getPriceDiffAmount();
        if (C23313hvq.OLrzqt(priceDiffAmount, "-0.001") & C23313hvq.KWHzl(priceDiffAmount, "0.001")) {
            priceDiffAmount = null;
        }
        String str = priceDiffAmount;
        if (str == null || str.length() == 0) {
            return "";
        }
        return "(" + C23311hvo.formatPercentWithSymbol$default(str, false, 0, 0, null, null, 31, null) + ")";
    }

    public final String getNewFromTokenPrice() {
        return this.commonDexInfo.getFromTokenPrice();
    }

    public final boolean showEthCrossRiskHint() {
        PathSelectionRouterItem selectRouterItem$default;
        return !isSingle() && Intrinsics.EZpvd((Object) toToken().getChainId(), (Object) "1") && (selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null)) != null && selectRouterItem$default.isToSwapValueDiffHint();
    }

    public final String getMiniReceiveNumber() {
        return C23271hvA.getShowData$default(C23271hvA.copydefault, minimumReceived(), false, RoundingMode.DOWN, true, false, 16, null);
    }

    public final boolean isWarning() {
        String priceDiffAmount = getPriceDiffAmount();
        return C23313hvq.valueOf(priceDiffAmount, Double.valueOf(-0.1d)) || C23313hvq.EZpvd(priceDiffAmount, "0.001");
    }

    public final boolean isValueDiffWarningForSingleChain() {
        String priceDiffAmount = getPriceDiffAmount();
        return C23313hvq.EZpvd(priceDiffAmount, Double.valueOf(-0.1d)) && C23313hvq.valueOf(priceDiffAmount, Double.valueOf(0.1d));
    }

    public final boolean isPMM() {
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            return selectedDeFiPlatform != null && selectedDeFiPlatform.isPMM();
        }
        return isIntentBridge();
    }

    public final boolean isIntentBridge() {
        DexQuoteBridgeVO bridge;
        Integer numValueOf = null;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null && (bridge = selectRouterItem$default.getBridge()) != null) {
            numValueOf = Integer.valueOf(bridge.getBridgeType());
        }
        return C23313hvq.copydefault(numValueOf, 3);
    }

    public final String getRouteType() {
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList;
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList2;
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList3;
        DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo;
        String str = this.swapType;
        if (Intrinsics.EZpvd((Object) str, (Object) "0")) {
            return "0";
        }
        if (Intrinsics.EZpvd((Object) str, (Object) "1")) {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (smartRoutingMenuVoList2 = selectRouterItem$default.getSmartRoutingMenuVoList()) != null && smartRoutingMenuVoList2.size() == 1) {
                PathSelectionRouterItem selectRouterItem$default2 = getSelectRouterItem$default(this, null, 1, null);
                if (Intrinsics.EZpvd((Object) ((selectRouterItem$default2 == null || (smartRoutingMenuVoList3 = selectRouterItem$default2.getSmartRoutingMenuVoList()) == null || (dexSwapSmartRoutingMenuVo = smartRoutingMenuVoList3.get(0)) == null) ? null : dexSwapSmartRoutingMenuVo.getSmartRoutingMenuType()), (Object) "2")) {
                    return "2";
                }
            }
            PathSelectionRouterItem selectRouterItem$default3 = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default3 != null && (smartRoutingMenuVoList = selectRouterItem$default3.getSmartRoutingMenuVoList()) != null && smartRoutingMenuVoList.size() > 1) {
                return "1";
            }
        }
        return "";
    }

    public final boolean isBridge() {
        return Intrinsics.EZpvd((Object) getRouteType(), (Object) "2");
    }

    public final boolean isSingle() {
        return Intrinsics.EZpvd((Object) getRouteType(), (Object) "0");
    }

    public final boolean isCross() {
        return Intrinsics.EZpvd((Object) getRouteType(), (Object) "1");
    }

    public final boolean isCrossSwap() {
        return Intrinsics.EZpvd((Object) this.swapType, (Object) "1");
    }

    public final boolean isCrossChain() {
        return !Intrinsics.EZpvd((Object) fromToken().getChainId(), (Object) toToken().getChainId());
    }

    public final boolean isQuotesSafeMoonSlipError(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.commonDexInfo.getSafeMoonToken() && C23313hvq.OLrzqt(autoSlippage(), getSlippageLimit(str, z));
    }

    public final DexAutoSlippageInfoParam autoSlippageInfo() {
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getAutoSlippageInfo();
            }
            return null;
        }
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getAutoSlippageInfo();
        }
        return null;
    }

    public final String autoSlippage() {
        String autoTotalSlippage;
        String autoSlippage;
        if (isSingle()) {
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = autoSlippageInfo();
            if (dexAutoSlippageInfoParamAutoSlippageInfo != null && (autoSlippage = dexAutoSlippageInfoParamAutoSlippageInfo.getAutoSlippage()) != null) {
                return autoSlippage;
            }
        } else {
            DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo2 = autoSlippageInfo();
            if (dexAutoSlippageInfoParamAutoSlippageInfo2 != null && (autoTotalSlippage = dexAutoSlippageInfoParamAutoSlippageInfo2.getAutoTotalSlippage()) != null) {
                return autoTotalSlippage;
            }
        }
        return "";
    }

    public final boolean isSlipValueGt50(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23313hvq.OLrzqt(autoSlippage(), getSlippageLimit(str, z));
    }

    public final String getSlippageLimit(@NotNull String str, boolean z) {
        Object next;
        String maxValue;
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = isSingle() ? "1" : "2";
        Iterator<T> it = C22380heK.OLrzqt.copydefault(str).EZpvd(z).AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((Object) ((SlippageConfigVo) next).getConfigId(), (Object) str2)) {
                break;
            }
        }
        SlippageConfigVo slippageConfigVo = (SlippageConfigVo) next;
        return (slippageConfigVo == null || (maxValue = slippageConfigVo.getMaxValue()) == null) ? SlippageConfigVo.MAX_SLIP : maxValue;
    }

    public final C22333hdQ getEstimateBridgeFeeAmount() {
        String showDataWithPrefix$default;
        String showDataWithPrefix$default2;
        String chainName;
        DexQuoteBridgeVO bridge;
        DexQuoteBridgeVO bridge2;
        DexQuoteBridgeVO bridge3;
        DexQuoteBridgeVO bridge4;
        DexQuoteBridgeVO bridge5;
        DexMultiTokenInfoBean crossFromToken;
        String chainName2;
        DexQuoteBridgeVO bridge6;
        String estimateClaimFeeAmountUsd;
        DexQuoteBridgeVO bridge7;
        DexQuoteBridgeVO bridge8;
        String estimateBridgeFeeAmountUsd;
        DexQuoteBridgeVO bridge9;
        String estimateClaimFeeAmount = null;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        String estimateBridgeFeeAmountUsd2 = (selectRouterItem$default == null || (bridge9 = selectRouterItem$default.getBridge()) == null) ? null : bridge9.getEstimateBridgeFeeAmountUsd();
        if (estimateBridgeFeeAmountUsd2 == null || estimateBridgeFeeAmountUsd2.length() == 0) {
            showDataWithPrefix$default = "--";
        } else {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            PathSelectionRouterItem selectRouterItem$default2 = getSelectRouterItem$default(this, null, 1, null);
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(c23272hvB, (selectRouterItem$default2 == null || (bridge8 = selectRouterItem$default2.getBridge()) == null || (estimateBridgeFeeAmountUsd = bridge8.getEstimateBridgeFeeAmountUsd()) == null) ? "" : estimateBridgeFeeAmountUsd, false, false, RoundingMode.DOWN, false, 22, null);
        }
        PathSelectionRouterItem selectRouterItem$default3 = getSelectRouterItem$default(this, null, 1, null);
        String estimateClaimFeeAmountUsd2 = (selectRouterItem$default3 == null || (bridge7 = selectRouterItem$default3.getBridge()) == null) ? null : bridge7.getEstimateClaimFeeAmountUsd();
        if (estimateClaimFeeAmountUsd2 == null || estimateClaimFeeAmountUsd2.length() == 0) {
            showDataWithPrefix$default2 = "--";
        } else {
            C23272hvB c23272hvB2 = C23272hvB.KWHzl;
            PathSelectionRouterItem selectRouterItem$default4 = getSelectRouterItem$default(this, null, 1, null);
            showDataWithPrefix$default2 = C23272hvB.getShowDataWithPrefix$default(c23272hvB2, (selectRouterItem$default4 == null || (bridge6 = selectRouterItem$default4.getBridge()) == null || (estimateClaimFeeAmountUsd = bridge6.getEstimateClaimFeeAmountUsd()) == null) ? "" : estimateClaimFeeAmountUsd, false, false, RoundingMode.DOWN, false, 22, null);
        }
        PathSelectionRouterItem selectRouterItem$default5 = getSelectRouterItem$default(this, null, 1, null);
        String str = (selectRouterItem$default5 == null || (bridge5 = selectRouterItem$default5.getBridge()) == null || (crossFromToken = bridge5.getCrossFromToken()) == null || (chainName2 = crossFromToken.getChainName()) == null) ? "--" : chainName2;
        C23271hvA c23271hvA = C23271hvA.copydefault;
        PathSelectionRouterItem selectRouterItem$default6 = getSelectRouterItem$default(this, null, 1, null);
        String estimateBridgeFeeAmount = (selectRouterItem$default6 == null || (bridge4 = selectRouterItem$default6.getBridge()) == null) ? null : bridge4.getEstimateBridgeFeeAmount();
        String str2 = estimateBridgeFeeAmount == null ? "" : estimateBridgeFeeAmount;
        RoundingMode roundingMode = RoundingMode.DOWN;
        String showData$default = C23271hvA.getShowData$default(c23271hvA, str2, false, roundingMode, false, false, 26, null);
        PathSelectionRouterItem selectRouterItem$default7 = getSelectRouterItem$default(this, null, 1, null);
        String estimateBridgeFeeAmount2 = (selectRouterItem$default7 == null || (bridge3 = selectRouterItem$default7.getBridge()) == null) ? null : bridge3.getEstimateBridgeFeeAmount();
        String showDataWithSymbol$default = C23271hvA.getShowDataWithSymbol$default(c23271hvA, estimateBridgeFeeAmount2 == null ? "" : estimateBridgeFeeAmount2, this.commonDexInfo.getFromNativeTokenSymbol(), false, roundingMode, false, false, 52, null);
        String fromNativeTokenSymbol = this.commonDexInfo.getFromNativeTokenSymbol();
        PathSelectionRouterItem selectRouterItem$default8 = getSelectRouterItem$default(this, null, 1, null);
        String estimateClaimFeeAmount2 = (selectRouterItem$default8 == null || (bridge2 = selectRouterItem$default8.getBridge()) == null) ? null : bridge2.getEstimateClaimFeeAmount();
        String showData$default2 = C23271hvA.getShowData$default(c23271hvA, estimateClaimFeeAmount2 == null ? "" : estimateClaimFeeAmount2, false, roundingMode, false, false, 26, null);
        PathSelectionRouterItem selectRouterItem$default9 = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default9 != null && (bridge = selectRouterItem$default9.getBridge()) != null) {
            estimateClaimFeeAmount = bridge.getEstimateClaimFeeAmount();
        }
        String showDataWithSymbol$default2 = C23271hvA.getShowDataWithSymbol$default(c23271hvA, estimateClaimFeeAmount == null ? "" : estimateClaimFeeAmount, this.commonDexInfo.getToNativeTokenSymbol(), false, roundingMode, false, false, 52, null);
        DexMultiTokenInfoBean toToken = this.commonDexInfo.getToToken();
        return new C22333hdQ(str, showDataWithPrefix$default, showData$default, showDataWithSymbol$default, showDataWithSymbol$default2, showData$default2, showDataWithPrefix$default2, fromNativeTokenSymbol, (toToken == null || (chainName = toToken.getChainName()) == null) ? "--" : chainName);
    }

    public final C22337hdU getEstimateGasFeeAmount(boolean z) {
        String showDataWithPrefix$default;
        Pair pair;
        String estimateGasFeeAmount;
        String estimateGasFeeAmount2;
        String estimateGasFeeAmountUsd;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        String estimateGasFeeAmountUsd2 = selectRouterItem$default != null ? selectRouterItem$default.getEstimateGasFeeAmountUsd() : null;
        String str = "";
        if (estimateGasFeeAmountUsd2 == null || estimateGasFeeAmountUsd2.length() == 0) {
            showDataWithPrefix$default = "--";
        } else {
            C23272hvB c23272hvB = C23272hvB.KWHzl;
            PathSelectionRouterItem selectRouterItem$default2 = getSelectRouterItem$default(this, null, 1, null);
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(c23272hvB, (selectRouterItem$default2 == null || (estimateGasFeeAmountUsd = selectRouterItem$default2.getEstimateGasFeeAmountUsd()) == null) ? "" : estimateGasFeeAmountUsd, false, false, RoundingMode.DOWN, false, 22, null);
        }
        PathSelectionRouterItem selectRouterItem$default3 = getSelectRouterItem$default(this, null, 1, null);
        String estimateGasFeeAmount3 = selectRouterItem$default3 != null ? selectRouterItem$default3.getEstimateGasFeeAmount() : null;
        if (estimateGasFeeAmount3 == null || estimateGasFeeAmount3.length() == 0) {
            pair = new Pair("--", "--");
        } else if (z) {
            PathSelectionRouterItem selectRouterItem$default4 = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default4 == null || (estimateGasFeeAmount = selectRouterItem$default4.getEstimateGasFeeAmount()) == null) {
                estimateGasFeeAmount = "";
            }
            PathSelectionRouterItem selectRouterItem$default5 = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default5 != null && (estimateGasFeeAmount2 = selectRouterItem$default5.getEstimateGasFeeAmount()) != null) {
                str = estimateGasFeeAmount2;
            }
            pair = new Pair(estimateGasFeeAmount, str);
        } else {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            PathSelectionRouterItem selectRouterItem$default6 = getSelectRouterItem$default(this, null, 1, null);
            String estimateGasFeeAmount4 = selectRouterItem$default6 != null ? selectRouterItem$default6.getEstimateGasFeeAmount() : null;
            String str2 = estimateGasFeeAmount4 == null ? "" : estimateGasFeeAmount4;
            RoundingMode roundingMode = RoundingMode.DOWN;
            String showData$default = C23271hvA.getShowData$default(c23271hvA, str2, false, roundingMode, false, false, 26, null);
            PathSelectionRouterItem selectRouterItem$default7 = getSelectRouterItem$default(this, null, 1, null);
            String estimateGasFeeAmount5 = selectRouterItem$default7 != null ? selectRouterItem$default7.getEstimateGasFeeAmount() : null;
            pair = new Pair(showData$default, C23271hvA.getShowDataWithSymbol$default(c23271hvA, estimateGasFeeAmount5 == null ? "" : estimateGasFeeAmount5, this.commonDexInfo.getFromNativeTokenSymbol(), false, roundingMode, false, false, 52, null));
        }
        return new C22337hdU(showDataWithPrefix$default, (String) pair.component1(), (String) pair.component2(), this.commonDexInfo.getFromNativeTokenSymbol());
    }

    public final void updateBridgeApproveInfo(@NotNull String str, @NotNull String str2, boolean z, @NotNull ApproveStatus approveStatus) {
        List<PathSelectionRouterItem> list;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(approveStatus, "");
        if (str.length() == 0 || (list = this.pathSelectionRouterList) == null) {
            return;
        }
        for (PathSelectionRouterItem pathSelectionRouterItem : list) {
            DexQuoteBridgeVO bridge = pathSelectionRouterItem.getBridge();
            if (Intrinsics.EZpvd((Object) (bridge != null ? bridge.getDefiPlatformId() : null), (Object) str)) {
                DeFiPlatformTokenApprovalInfo dexMultiTokenAllowanceOut = pathSelectionRouterItem.getBridge().getDexMultiTokenAllowanceOut();
                pathSelectionRouterItem.getBridge().setDexMultiTokenAllowanceOut(dexMultiTokenAllowanceOut != null ? DeFiPlatformTokenApprovalInfo.copy$default(dexMultiTokenAllowanceOut, null, null, null, str2, approveStatus.getType(), z, null, 71, null) : null);
            }
        }
    }

    public final boolean isShowFluctuateTips(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) this.commonDexInfo.getTokenType(), (Object) "1") && isLessThanAutoSlip(str) && !isBridge();
    }

    public final boolean isShowFluctuateTipsColor() {
        return Intrinsics.EZpvd((Object) this.commonDexInfo.getTokenType(), (Object) "1") && (this.commonDexInfo.isFromTokenFluctuationThanThreshold() || this.commonDexInfo.isToTokenFluctuationThanThreshold()) && !isBridge();
    }

    public final boolean isLessThanAutoSlip(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C23313hvq.valueOf(str, autoSlippage());
    }

    public final DexQuoteBridgeVO bridge() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getBridge();
        }
        return null;
    }

    public final String bridgeFeeUsd() {
        String bridgeFeeUsd;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (bridgeFeeUsd = selectRouterItem$default.getBridgeFeeUsd()) == null) ? "" : bridgeFeeUsd;
    }

    public final String crossChainFee() {
        String crossChainFee;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (crossChainFee = selectRouterItem$default.getCrossChainFee()) == null) ? "" : crossChainFee;
    }

    public final String toSwapFee() {
        String toSwapFee;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (toSwapFee = selectRouterItem$default.getToSwapFee()) == null) ? "" : toSwapFee;
    }

    public final String toSwapFeeUsd() {
        String toSwapFeeUsd;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (toSwapFeeUsd = selectRouterItem$default.getToSwapFeeUsd()) == null) ? "" : toSwapFeeUsd;
    }

    public final String estimatedTime() {
        PathSelectionRouterItem selectRouterItem$default;
        String estimatedTime;
        return (isSingle() || (selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null)) == null || (estimatedTime = selectRouterItem$default.getEstimatedTime()) == null) ? "" : estimatedTime;
    }

    public final String networkFeeOfNativeToken() {
        String networkFeeOfNativeToken;
        String quoteNetWorkFeeOfMoney;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && (quoteNetWorkFeeOfMoney = selectedDeFiPlatform.getQuoteNetWorkFeeOfMoney()) != null) {
                return quoteNetWorkFeeOfMoney;
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (networkFeeOfNativeToken = selectRouterItem$default.getNetworkFeeOfNativeToken()) != null) {
                return networkFeeOfNativeToken;
            }
        }
        return "";
    }

    public final String minimumReceived() {
        String minimumReceived;
        String minimumReceived2;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && (minimumReceived2 = selectedDeFiPlatform.getMinimumReceived()) != null) {
                return minimumReceived2;
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (minimumReceived = selectRouterItem$default.getMinimumReceived()) != null) {
                return minimumReceived;
            }
        }
        return "0";
    }

    public final String getTokenType() {
        return this.commonDexInfo.getTokenType();
    }

    public final DefiPlatformInfo getDeFiPlatformInfo() {
        return this.commonDexInfo.getDeFiPlatformInfo();
    }

    public final boolean getSafeMoonToken() {
        return this.commonDexInfo.getSafeMoonToken();
    }

    public final boolean isHoneypotErrorCode() {
        return C31212lpk.copydefault.OLrzqt(C33129mqd.AhwBna(this.commonDexInfo.getCode()));
    }

    public final boolean isLeverage() {
        DexMultiTokenInfoBean toToken;
        DexMultiTokenInfoBean fromToken = this.commonDexInfo.getFromToken();
        return (fromToken != null && fromToken.isLeverage()) || ((toToken = this.commonDexInfo.getToToken()) != null && toToken.isLeverage());
    }

    public final boolean isRiskToken() {
        return isLeverage();
    }

    private final boolean isFromOrToTokenFluctuationThanThreshold() {
        return this.commonDexInfo.isFromOrToTokenFluctuationThanThreshold();
    }

    public final boolean isSlipPageFluctuationThreshold() {
        return this.commonDexInfo.isSlipPageFluctuationThreshold(autoSlippage());
    }

    private final boolean isSlipPageLteFluctuationThreshold() {
        return this.commonDexInfo.isSlipPageLteFluctuationThreshold(autoSlippage());
    }

    public final boolean isFluctuationThanThresholdDesc() {
        return isFromOrToTokenFluctuationThanThreshold() && isSlipPageLteFluctuationThreshold();
    }

    public final boolean isRateFluctuationThresholdDesc() {
        return this.commonDexInfo.isRateFluctuationThresholdDesc(autoSlippage());
    }

    public final boolean isSlipPageFluctuationThresholdDesc() {
        return this.commonDexInfo.isSlipPageFluctuationThresholdDesc(autoSlippage());
    }

    public final String getFluctuationThanThresholdDesc() {
        return this.commonDexInfo.getFluctuationThanThresholdDesc(fromToken().getTokenSymbol(), toToken().getTokenSymbol());
    }

    public final String getRateFluctuationThresholdDesc() {
        return this.commonDexInfo.getRateFluctuationThresholdDesc(fromToken().getTokenSymbol(), toToken().getTokenSymbol());
    }

    public final String getSlipPageFluctuationThresholdDesc() {
        return this.commonDexInfo.getSlipPageFluctuationThresholdDesc(fromToken().getTokenSymbol(), toToken().getTokenSymbol());
    }

    public final DexMultiTokenInfoBean fromToken() {
        DexMultiTokenInfoBean fromToken = this.commonDexInfo.getFromToken();
        return fromToken == null ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : fromToken;
    }

    public final DexMultiTokenInfoBean toToken() {
        DexMultiTokenInfoBean toToken = this.commonDexInfo.getToToken();
        return toToken == null ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : toToken;
    }

    public final String quoteNetWorkFeeOfMoney() {
        String quoteNetWorkFeeOfMoney;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return (selectedDeFiPlatform == null || (quoteNetWorkFeeOfMoney = selectedDeFiPlatform.getQuoteNetWorkFeeOfMoney()) == null) ? "" : quoteNetWorkFeeOfMoney;
    }

    public final String fromSwapFeeUsd() {
        String fromSwapFeeUsd;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (fromSwapFeeUsd = selectRouterItem$default.getFromSwapFeeUsd()) == null) ? "" : fromSwapFeeUsd;
    }

    public final String payAmount() {
        return this.commonDexInfo.getFromTokenAmount();
    }

    public final String toTokenPrice() {
        String toTokenPrice;
        String toTokenPrice2;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && (toTokenPrice2 = selectedDeFiPlatform.getToTokenPrice()) != null) {
                return toTokenPrice2;
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (toTokenPrice = selectRouterItem$default.getToTokenPrice()) != null) {
                return toTokenPrice;
            }
        }
        return "";
    }

    public final String inputToTokenPrice() {
        String toTokenPrice;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return (selectedDeFiPlatform == null || (toTokenPrice = selectedDeFiPlatform.getToTokenPrice()) == null) ? "" : toTokenPrice;
    }

    public final String inputToTokenAmount() {
        String receiveAmount;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        return (selectedDeFiPlatform == null || (receiveAmount = selectedDeFiPlatform.getReceiveAmount()) == null) ? "" : receiveAmount;
    }

    public final String routerLabel() {
        String routerLabel;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        return (selectRouterItem$default == null || (routerLabel = selectRouterItem$default.getRouterLabel()) == null) ? "" : routerLabel;
    }

    public final String estimateGasFee() {
        String estimateGasFee;
        String estimateGasFee2;
        if (isSingle()) {
            DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null && (estimateGasFee2 = selectedDeFiPlatform.getEstimateGasFee()) != null) {
                return estimateGasFee2;
            }
        } else {
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (estimateGasFee = selectRouterItem$default.getEstimateGasFee()) != null) {
                return estimateGasFee;
            }
        }
        return "";
    }

    public final ArrayList<DexRouterList> dexRouterList() {
        List<DexRouterList> dexRouterList;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null || (dexRouterList = selectedDeFiPlatform.getDexRouterList()) == null) {
            return null;
        }
        return new ArrayList<>(dexRouterList);
    }

    public final ArrayList<DexRouterList> originDexRouterList() {
        List<DexRouterList> dexRouterList;
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null || (dexRouterList = selectedDeFiPlatform.getDexRouterList()) == null) {
            return null;
        }
        return new ArrayList<>(dexRouterList);
    }

    public final ArrayList<DexRouterList> originFromDexRouterList() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getOriginFromDexRouterList();
        }
        return null;
    }

    public final ArrayList<DexRouterList> fromDexRouterList() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getFromDexRouterList();
        }
        return null;
    }

    public final ArrayList<DexRouterList> toDexRouterToList() {
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null) {
            return selectRouterItem$default.getToDexRouterToList();
        }
        return null;
    }

    public final boolean crossChainAndOnlyBridge() {
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList;
        ArrayList<DexSwapSmartRoutingMenuVo> smartRoutingMenuVoList2;
        DexSwapSmartRoutingMenuVo dexSwapSmartRoutingMenuVo;
        if (Intrinsics.EZpvd((Object) this.swapType, (Object) "1")) {
            String smartRoutingMenuType = null;
            PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
            if (selectRouterItem$default != null && (smartRoutingMenuVoList = selectRouterItem$default.getSmartRoutingMenuVoList()) != null && smartRoutingMenuVoList.size() == 1) {
                PathSelectionRouterItem selectRouterItem$default2 = getSelectRouterItem$default(this, null, 1, null);
                if (selectRouterItem$default2 != null && (smartRoutingMenuVoList2 = selectRouterItem$default2.getSmartRoutingMenuVoList()) != null && (dexSwapSmartRoutingMenuVo = (DexSwapSmartRoutingMenuVo) CollectionsKt___CollectionsKt.firstOrNull(smartRoutingMenuVoList2)) != null) {
                    smartRoutingMenuType = dexSwapSmartRoutingMenuVo.getSmartRoutingMenuType();
                }
                if (Intrinsics.EZpvd((Object) smartRoutingMenuType, (Object) "2")) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean claimSignatureRequired() {
        DexQuoteBridgeVO bridge;
        String strIsNeedClaim = null;
        PathSelectionRouterItem selectRouterItem$default = getSelectRouterItem$default(this, null, 1, null);
        if (selectRouterItem$default != null && (bridge = selectRouterItem$default.getBridge()) != null) {
            strIsNeedClaim = bridge.isNeedClaim();
        }
        return Intrinsics.EZpvd((Object) strIsNeedClaim, (Object) "1");
    }

    public final boolean findFixedDeFiPlatformId(@NotNull String str) {
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
}

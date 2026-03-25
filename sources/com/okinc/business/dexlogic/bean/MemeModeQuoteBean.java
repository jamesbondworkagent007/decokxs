package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C23313hvq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MemeModeQuoteBean implements Parcelable {
    private final List<DeFiPlatformForSwap> defiPlatformInfoList;
    private String localSelectedDeFiPlatformId;
    private final MemeModeCommonDexInfo memeModeCommonDexInfo;
    private final TraceData traceData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeModeQuoteBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(DeFiPlatformForSwap$$serializer.INSTANCE), null, null, null};

    public static final class Creator implements Parcelable.Creator<MemeModeQuoteBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeQuoteBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DeFiPlatformForSwap.CREATOR.createFromParcel(parcel));
            }
            return new MemeModeQuoteBean(arrayList, MemeModeCommonDexInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : TraceData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeModeQuoteBean[] newArray(int i) {
            return new MemeModeQuoteBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component4() {
        return this.localSelectedDeFiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.MemeModeQuoteBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeModeQuoteBean copy$default(MemeModeQuoteBean memeModeQuoteBean, List list, MemeModeCommonDexInfo memeModeCommonDexInfo, TraceData traceData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = memeModeQuoteBean.defiPlatformInfoList;
        }
        if ((i & 2) != 0) {
            memeModeCommonDexInfo = memeModeQuoteBean.memeModeCommonDexInfo;
        }
        if ((i & 4) != 0) {
            traceData = memeModeQuoteBean.traceData;
        }
        if ((i & 8) != 0) {
            str = memeModeQuoteBean.localSelectedDeFiPlatformId;
        }
        return memeModeQuoteBean.copy(list, memeModeCommonDexInfo, traceData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> component1() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeCommonDexInfo component2() {
        return this.memeModeCommonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData component3() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeQuoteBean copy(@NotNull List<DeFiPlatformForSwap> list, @NotNull MemeModeCommonDexInfo memeModeCommonDexInfo, TraceData traceData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(memeModeCommonDexInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new MemeModeQuoteBean(list, memeModeCommonDexInfo, traceData, str);
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
        if (!(obj instanceof MemeModeQuoteBean)) {
            return false;
        }
        MemeModeQuoteBean memeModeQuoteBean = (MemeModeQuoteBean) obj;
        return Intrinsics.EZpvd(this.defiPlatformInfoList, memeModeQuoteBean.defiPlatformInfoList) && Intrinsics.EZpvd(this.memeModeCommonDexInfo, memeModeQuoteBean.memeModeCommonDexInfo) && Intrinsics.EZpvd(this.traceData, memeModeQuoteBean.traceData) && Intrinsics.EZpvd((Object) this.localSelectedDeFiPlatformId, (Object) memeModeQuoteBean.localSelectedDeFiPlatformId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeFiPlatformForSwap> getDefiPlatformInfoList() {
        return this.defiPlatformInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeModeCommonDexInfo getMemeModeCommonDexInfo() {
        return this.memeModeCommonDexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TraceData getTraceData() {
        return this.traceData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.defiPlatformInfoList.hashCode();
        int iHashCode2 = this.memeModeCommonDexInfo.hashCode();
        TraceData traceData = this.traceData;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (traceData == null ? 0 : traceData.hashCode())) * 31) + this.localSelectedDeFiPlatformId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLocalSelectedDeFiPlatformId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.localSelectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeModeQuoteBean(defiPlatformInfoList=" + this.defiPlatformInfoList + ", memeModeCommonDexInfo=" + this.memeModeCommonDexInfo + ", traceData=" + this.traceData + ", localSelectedDeFiPlatformId=" + this.localSelectedDeFiPlatformId + ")";
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
        this.memeModeCommonDexInfo.writeToParcel(parcel, i);
        TraceData traceData = this.traceData;
        if (traceData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            traceData.writeToParcel(parcel, i);
        }
        parcel.writeString(this.localSelectedDeFiPlatformId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeModeQuoteBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeModeQuoteBean> serializer() {
            return MemeModeQuoteBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeModeQuoteBean(int i, List list, MemeModeCommonDexInfo memeModeCommonDexInfo, TraceData traceData, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, MemeModeQuoteBean$$serializer.INSTANCE.getDescriptor());
        }
        this.defiPlatformInfoList = (i & 1) == 0 ? yDY.AhwBna() : list;
        this.memeModeCommonDexInfo = memeModeCommonDexInfo;
        this.traceData = traceData;
        if ((i & 8) == 0) {
            this.localSelectedDeFiPlatformId = "";
        } else {
            this.localSelectedDeFiPlatformId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeModeQuoteBean memeModeQuoteBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(memeModeQuoteBean.defiPlatformInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], memeModeQuoteBean.defiPlatformInfoList);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, MemeModeCommonDexInfo$$serializer.INSTANCE, memeModeQuoteBean.memeModeCommonDexInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, TraceData$$serializer.INSTANCE, memeModeQuoteBean.traceData);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) memeModeQuoteBean.localSelectedDeFiPlatformId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, memeModeQuoteBean.localSelectedDeFiPlatformId);
    }

    public MemeModeQuoteBean(@NotNull List<DeFiPlatformForSwap> list, @NotNull MemeModeCommonDexInfo memeModeCommonDexInfo, TraceData traceData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(memeModeCommonDexInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.defiPlatformInfoList = list;
        this.memeModeCommonDexInfo = memeModeCommonDexInfo;
        this.traceData = traceData;
        this.localSelectedDeFiPlatformId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:24)) : (r1v0 java.util.List))
  (r2v0 com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo)
  (r3v0 com.okinc.business.dexlogic.bean.TraceData)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.dexlogic.bean.DeFiPlatformForSwap>, com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo, com.okinc.business.dexlogic.bean.TraceData, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.dexlogic.bean.MemeModeQuoteBean.<init>(java.util.List, com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo, com.okinc.business.dexlogic.bean.TraceData, java.lang.String):void type: THIS */
    public /* synthetic */ MemeModeQuoteBean(List list, MemeModeCommonDexInfo memeModeCommonDexInfo, TraceData traceData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, memeModeCommonDexInfo, traceData, (i & 8) != 0 ? "" : str);
    }

    public final boolean showValueDiffWarn() {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        if (selectedDeFiPlatform != null) {
            return selectedDeFiPlatform.getShowValueDiffWarn();
        }
        return false;
    }

    public final Pair<Boolean, DexMultiTokenInfoBean> isSafeMoonToken() {
        return this.memeModeCommonDexInfo.isSafeMoonToken();
    }

    private final String getSellSolUsdPrice() {
        DeFiPlatformForSwap selectedDeFiPlatform = getSelectedDeFiPlatform();
        String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
        if (receiveAmount == null || receiveAmount.length() == 0) {
            return "";
        }
        DeFiPlatformForSwap selectedDeFiPlatform2 = getSelectedDeFiPlatform();
        if (C23313hvq.copydefault(selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getReceiveAmount() : null, 0)) {
            return "";
        }
        DeFiPlatformForSwap selectedDeFiPlatform3 = getSelectedDeFiPlatform();
        String toTokenPrice = selectedDeFiPlatform3 != null ? selectedDeFiPlatform3.getToTokenPrice() : null;
        if (toTokenPrice == null || toTokenPrice.length() == 0) {
            return "";
        }
        DeFiPlatformForSwap selectedDeFiPlatform4 = getSelectedDeFiPlatform();
        Intrinsics.copydefault(selectedDeFiPlatform4);
        String toTokenPrice2 = selectedDeFiPlatform4.getToTokenPrice();
        Intrinsics.copydefault((Object) toTokenPrice2);
        DeFiPlatformForSwap selectedDeFiPlatform5 = getSelectedDeFiPlatform();
        Intrinsics.copydefault(selectedDeFiPlatform5);
        String receiveAmount2 = selectedDeFiPlatform5.getReceiveAmount();
        Intrinsics.copydefault((Object) receiveAmount2);
        return C23313hvq.divCheckS$default(toTokenPrice2, receiveAmount2, null, null, null, 14, null);
    }

    private final String getBuyUsdPrice() {
        return (this.memeModeCommonDexInfo.getFromTokenPrice().length() == 0 || this.memeModeCommonDexInfo.getFromTokenAmount().length() == 0 || C23313hvq.copydefault(this.memeModeCommonDexInfo.getFromTokenAmount(), 0)) ? "" : C23313hvq.divCheckS$default(this.memeModeCommonDexInfo.getFromTokenPrice(), this.memeModeCommonDexInfo.getFromTokenAmount(), null, null, null, 14, null);
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

package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class DappBTCUTXOAllInfo implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private Integer analysisStatus;
    private List<DappBTCXRCAssetChange> assetChange;
    private Long chainIndex;
    private String exploreUrl;
    private String gasFee;
    private List<DappBTCUTXOInfo> inputInfo;
    private Boolean isShowFee;
    private List<DappBTCUTXOInfo> outputInfo;
    private String usdGasFee;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<DappBTCUTXOAllInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DappBTCUTXOAllInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOAllInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList3 = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DappBTCUTXOInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(DappBTCUTXOInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList3 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList3.add(DappBTCXRCAssetChange.CREATOR.createFromParcel(parcel));
                }
            }
            return new DappBTCUTXOAllInfo(lValueOf, string, string2, boolValueOf, numValueOf, string3, arrayList, arrayList2, arrayList3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DappBTCUTXOAllInfo[] newArray(int i) {
            return new DappBTCUTXOAllInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DappBTCUTXOAllInfo() {
        this((Long) null, (String) null, (String) null, (Boolean) null, (Integer) null, (String) null, (List) null, (List) null, (List) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.isShowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.analysisStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOInfo> component7() {
        return this.inputInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOInfo> component8() {
        return this.outputInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCXRCAssetChange> component9() {
        return this.assetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DappBTCUTXOAllInfo copy(Long l, String str, String str2, Boolean bool, Integer num, String str3, List<DappBTCUTXOInfo> list, List<DappBTCUTXOInfo> list2, List<DappBTCXRCAssetChange> list3) {
        return new DappBTCUTXOAllInfo(l, str, str2, bool, num, str3, list, list2, list3);
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
        if (!(obj instanceof DappBTCUTXOAllInfo)) {
            return false;
        }
        DappBTCUTXOAllInfo dappBTCUTXOAllInfo = (DappBTCUTXOAllInfo) obj;
        return Intrinsics.EZpvd(this.chainIndex, dappBTCUTXOAllInfo.chainIndex) && Intrinsics.EZpvd((Object) this.gasFee, (Object) dappBTCUTXOAllInfo.gasFee) && Intrinsics.EZpvd((Object) this.usdGasFee, (Object) dappBTCUTXOAllInfo.usdGasFee) && Intrinsics.EZpvd(this.isShowFee, dappBTCUTXOAllInfo.isShowFee) && Intrinsics.EZpvd(this.analysisStatus, dappBTCUTXOAllInfo.analysisStatus) && Intrinsics.EZpvd((Object) this.exploreUrl, (Object) dappBTCUTXOAllInfo.exploreUrl) && Intrinsics.EZpvd(this.inputInfo, dappBTCUTXOAllInfo.inputInfo) && Intrinsics.EZpvd(this.outputInfo, dappBTCUTXOAllInfo.outputInfo) && Intrinsics.EZpvd(this.assetChange, dappBTCUTXOAllInfo.assetChange);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getAnalysisStatus() {
        return this.analysisStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCXRCAssetChange> getAssetChange() {
        return this.assetChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExploreUrl() {
        return this.exploreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasFee() {
        return this.gasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOInfo> getInputInfo() {
        return this.inputInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappBTCUTXOInfo> getOutputInfo() {
        return this.outputInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdGasFee() {
        return this.usdGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainIndex;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.gasFee;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.usdGasFee;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isShowFee;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Integer num = this.analysisStatus;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        String str3 = this.exploreUrl;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        List<DappBTCUTXOInfo> list = this.inputInfo;
        int iHashCode7 = list == null ? 0 : list.hashCode();
        List<DappBTCUTXOInfo> list2 = this.outputInfo;
        int iHashCode8 = list2 == null ? 0 : list2.hashCode();
        List<DappBTCXRCAssetChange> list3 = this.assetChange;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isShowFee() {
        return this.isShowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnalysisStatus(Integer num) {
        this.analysisStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetChange(List<DappBTCXRCAssetChange> list) {
        this.assetChange = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(Long l) {
        this.chainIndex = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExploreUrl(String str) {
        this.exploreUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasFee(String str) {
        this.gasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputInfo(List<DappBTCUTXOInfo> list) {
        this.inputInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOutputInfo(List<DappBTCUTXOInfo> list) {
        this.outputInfo = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowFee(Boolean bool) {
        this.isShowFee = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdGasFee(String str) {
        this.usdGasFee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DappBTCUTXOAllInfo(chainIndex=" + this.chainIndex + ", gasFee=" + this.gasFee + ", usdGasFee=" + this.usdGasFee + ", isShowFee=" + this.isShowFee + ", analysisStatus=" + this.analysisStatus + ", exploreUrl=" + this.exploreUrl + ", inputInfo=" + this.inputInfo + ", outputInfo=" + this.outputInfo + ", assetChange=" + this.assetChange + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.gasFee);
        parcel.writeString(this.usdGasFee);
        Boolean bool = this.isShowFee;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.analysisStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.exploreUrl);
        List<DappBTCUTXOInfo> list = this.inputInfo;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DappBTCUTXOInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<DappBTCUTXOInfo> list2 = this.outputInfo;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<DappBTCUTXOInfo> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        List<DappBTCXRCAssetChange> list3 = this.assetChange;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list3.size());
        Iterator<DappBTCXRCAssetChange> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DappBTCUTXOAllInfo> serializer() {
            return DappBTCUTXOAllInfo$$serializer.INSTANCE;
        }
    }

    static {
        DappBTCUTXOInfo$$serializer dappBTCUTXOInfo$$serializer = DappBTCUTXOInfo$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(dappBTCUTXOInfo$$serializer), new ArrayListSerializer(dappBTCUTXOInfo$$serializer), new ArrayListSerializer(DappBTCXRCAssetChange$$serializer.INSTANCE)};
    }

    public /* synthetic */ DappBTCUTXOAllInfo(int i, Long l, String str, String str2, Boolean bool, Integer num, String str3, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = l;
        }
        if ((i & 2) == 0) {
            this.gasFee = null;
        } else {
            this.gasFee = str;
        }
        if ((i & 4) == 0) {
            this.usdGasFee = null;
        } else {
            this.usdGasFee = str2;
        }
        if ((i & 8) == 0) {
            this.isShowFee = null;
        } else {
            this.isShowFee = bool;
        }
        if ((i & 16) == 0) {
            this.analysisStatus = null;
        } else {
            this.analysisStatus = num;
        }
        if ((i & 32) == 0) {
            this.exploreUrl = null;
        } else {
            this.exploreUrl = str3;
        }
        if ((i & 64) == 0) {
            this.inputInfo = null;
        } else {
            this.inputInfo = list;
        }
        if ((i & 128) == 0) {
            this.outputInfo = null;
        } else {
            this.outputInfo = list2;
        }
        if ((i & 256) == 0) {
            this.assetChange = null;
        } else {
            this.assetChange = list3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(DappBTCUTXOAllInfo dappBTCUTXOAllInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dappBTCUTXOAllInfo.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, dappBTCUTXOAllInfo.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || dappBTCUTXOAllInfo.gasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dappBTCUTXOAllInfo.gasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || dappBTCUTXOAllInfo.usdGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, dappBTCUTXOAllInfo.usdGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dappBTCUTXOAllInfo.isShowFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, dappBTCUTXOAllInfo.isShowFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || dappBTCUTXOAllInfo.analysisStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, dappBTCUTXOAllInfo.analysisStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || dappBTCUTXOAllInfo.exploreUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, dappBTCUTXOAllInfo.exploreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dappBTCUTXOAllInfo.inputInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], dappBTCUTXOAllInfo.inputInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dappBTCUTXOAllInfo.outputInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], dappBTCUTXOAllInfo.outputInfo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && dappBTCUTXOAllInfo.assetChange == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], dappBTCUTXOAllInfo.assetChange);
    }

    public DappBTCUTXOAllInfo(Long l, String str, String str2, Boolean bool, Integer num, String str3, List<DappBTCUTXOInfo> list, List<DappBTCUTXOInfo> list2, List<DappBTCXRCAssetChange> list3) {
        this.chainIndex = l;
        this.gasFee = str;
        this.usdGasFee = str2;
        this.isShowFee = bool;
        this.analysisStatus = num;
        this.exploreUrl = str3;
        this.inputInfo = list;
        this.outputInfo = list2;
        this.assetChange = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r14v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.util.List<com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo>, java.util.List<com.okinc.business.defi.biz.net.bean.DappBTCUTXOInfo>, java.util.List<com.okinc.business.defi.biz.net.bean.DappBTCXRCAssetChange>):void (m)] (LINE:1592) call: com.okinc.business.defi.biz.net.bean.DappBTCUTXOAllInfo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ DappBTCUTXOAllInfo(Long l, String str, String str2, Boolean bool, Integer num, String str3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2, (i & 256) == 0 ? list3 : null);
    }
}

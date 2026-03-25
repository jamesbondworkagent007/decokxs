package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestOrderDetailsInfoVo implements Parcelable {
    private final Long chainId;
    private final String costTime;
    private final String explorerUrl;
    private final List<InvestTxInfo> investTxData;
    private final List<List<InvestLineInfo>> lineInfos;
    private final Integer orderStatus;
    private final Integer orderType;
    private final InvestTipInfoVo topBannerTip;
    private final InvestViewInWallet viewInWallet;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestOrderDetailsInfoVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(InvestOrderDetailsInfoVo$InvestTxInfo$$serializer.INSTANCE), new ArrayListSerializer(new ArrayListSerializer(InvestOrderDetailsInfoVo$InvestLineInfo$$serializer.INSTANCE)), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<InvestOrderDetailsInfoVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderDetailsInfoVo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(InvestTxInfo.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    int i5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i5);
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList3.add(InvestLineInfo.CREATOR.createFromParcel(parcel));
                    }
                    arrayList2.add(arrayList3);
                }
            }
            return new InvestOrderDetailsInfoVo(lValueOf, string, string2, arrayList, arrayList2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : InvestViewInWallet.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestTipInfoVo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestOrderDetailsInfoVo[] newArray(int i) {
            return new InvestOrderDetailsInfoVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestOrderDetailsInfoVo() {
        this((Long) null, (String) null, (String) null, (List) null, (List) null, (Integer) null, (Integer) null, (InvestViewInWallet) null, (InvestTipInfoVo) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    @SerialName("topBannerTip")
    public static /* synthetic */ void getTopBannerTip$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxInfo> component4() {
        return this.investTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<InvestLineInfo>> component5() {
        return this.lineInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestViewInWallet component8() {
        return this.viewInWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo component9() {
        return this.topBannerTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestOrderDetailsInfoVo copy(Long l, String str, String str2, List<InvestTxInfo> list, List<? extends List<InvestLineInfo>> list2, Integer num, Integer num2, InvestViewInWallet investViewInWallet, InvestTipInfoVo investTipInfoVo) {
        return new InvestOrderDetailsInfoVo(l, str, str2, list, list2, num, num2, investViewInWallet, investTipInfoVo);
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
        if (!(obj instanceof InvestOrderDetailsInfoVo)) {
            return false;
        }
        InvestOrderDetailsInfoVo investOrderDetailsInfoVo = (InvestOrderDetailsInfoVo) obj;
        return Intrinsics.EZpvd(this.chainId, investOrderDetailsInfoVo.chainId) && Intrinsics.EZpvd((Object) this.costTime, (Object) investOrderDetailsInfoVo.costTime) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) investOrderDetailsInfoVo.explorerUrl) && Intrinsics.EZpvd(this.investTxData, investOrderDetailsInfoVo.investTxData) && Intrinsics.EZpvd(this.lineInfos, investOrderDetailsInfoVo.lineInfos) && Intrinsics.EZpvd(this.orderStatus, investOrderDetailsInfoVo.orderStatus) && Intrinsics.EZpvd(this.orderType, investOrderDetailsInfoVo.orderType) && Intrinsics.EZpvd(this.viewInWallet, investOrderDetailsInfoVo.viewInWallet) && Intrinsics.EZpvd(this.topBannerTip, investOrderDetailsInfoVo.topBannerTip);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostTime() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTxInfo> getInvestTxData() {
        return this.investTxData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<InvestLineInfo>> getLineInfos() {
        return this.lineInfos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTipInfoVo getTopBannerTip() {
        return this.topBannerTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestViewInWallet getViewInWallet() {
        return this.viewInWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.costTime;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.explorerUrl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<InvestTxInfo> list = this.investTxData;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<List<InvestLineInfo>> list2 = this.lineInfos;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        Integer num = this.orderStatus;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.orderType;
        int iHashCode7 = num2 == null ? 0 : num2.hashCode();
        InvestViewInWallet investViewInWallet = this.viewInWallet;
        int iHashCode8 = investViewInWallet == null ? 0 : investViewInWallet.hashCode();
        InvestTipInfoVo investTipInfoVo = this.topBannerTip;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (investTipInfoVo != null ? investTipInfoVo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestOrderDetailsInfoVo(chainId=" + this.chainId + ", costTime=" + this.costTime + ", explorerUrl=" + this.explorerUrl + ", investTxData=" + this.investTxData + ", lineInfos=" + this.lineInfos + ", orderStatus=" + this.orderStatus + ", orderType=" + this.orderType + ", viewInWallet=" + this.viewInWallet + ", topBannerTip=" + this.topBannerTip + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.costTime);
        parcel.writeString(this.explorerUrl);
        List<InvestTxInfo> list = this.investTxData;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestTxInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<List<InvestLineInfo>> list2 = this.lineInfos;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (List<InvestLineInfo> list3 : list2) {
                parcel.writeInt(list3.size());
                Iterator<InvestLineInfo> it2 = list3.iterator();
                while (it2.hasNext()) {
                    it2.next().writeToParcel(parcel, i);
                }
            }
        }
        Integer num = this.orderStatus;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.orderType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        InvestViewInWallet investViewInWallet = this.viewInWallet;
        if (investViewInWallet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investViewInWallet.writeToParcel(parcel, i);
        }
        InvestTipInfoVo investTipInfoVo = this.topBannerTip;
        if (investTipInfoVo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investTipInfoVo.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestOrderDetailsInfoVo> serializer() {
            return InvestOrderDetailsInfoVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestOrderDetailsInfoVo(int i, Long l, String str, String str2, List list, List list2, Integer num, Integer num2, InvestViewInWallet investViewInWallet, InvestTipInfoVo investTipInfoVo, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.costTime = null;
        } else {
            this.costTime = str;
        }
        if ((i & 4) == 0) {
            this.explorerUrl = null;
        } else {
            this.explorerUrl = str2;
        }
        if ((i & 8) == 0) {
            this.investTxData = null;
        } else {
            this.investTxData = list;
        }
        if ((i & 16) == 0) {
            this.lineInfos = null;
        } else {
            this.lineInfos = list2;
        }
        if ((i & 32) == 0) {
            this.orderStatus = null;
        } else {
            this.orderStatus = num;
        }
        if ((i & 64) == 0) {
            this.orderType = null;
        } else {
            this.orderType = num2;
        }
        if ((i & 128) == 0) {
            this.viewInWallet = null;
        } else {
            this.viewInWallet = investViewInWallet;
        }
        if ((i & 256) == 0) {
            this.topBannerTip = null;
        } else {
            this.topBannerTip = investTipInfoVo;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestOrderDetailsInfoVo investOrderDetailsInfoVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investOrderDetailsInfoVo.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investOrderDetailsInfoVo.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investOrderDetailsInfoVo.costTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investOrderDetailsInfoVo.costTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investOrderDetailsInfoVo.explorerUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investOrderDetailsInfoVo.explorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investOrderDetailsInfoVo.investTxData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investOrderDetailsInfoVo.investTxData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investOrderDetailsInfoVo.lineInfos != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], investOrderDetailsInfoVo.lineInfos);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investOrderDetailsInfoVo.orderStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, investOrderDetailsInfoVo.orderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investOrderDetailsInfoVo.orderType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, investOrderDetailsInfoVo.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investOrderDetailsInfoVo.viewInWallet != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, InvestOrderDetailsInfoVo$InvestViewInWallet$$serializer.INSTANCE, investOrderDetailsInfoVo.viewInWallet);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && investOrderDetailsInfoVo.topBannerTip == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, InvestTipInfoVo$$serializer.INSTANCE, investOrderDetailsInfoVo.topBannerTip);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestLineInfo>> */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestOrderDetailsInfoVo(Long l, String str, String str2, List<InvestTxInfo> list, List<? extends List<InvestLineInfo>> list2, Integer num, Integer num2, InvestViewInWallet investViewInWallet, InvestTipInfoVo investTipInfoVo) {
        this.chainId = l;
        this.costTime = str;
        this.explorerUrl = str2;
        this.investTxData = list;
        this.lineInfos = list2;
        this.orderStatus = num;
        this.orderType = num2;
        this.viewInWallet = investViewInWallet;
        this.topBannerTip = investTipInfoVo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r17v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestViewInWallet:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestViewInWallet) : (r18v0 com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestViewInWallet))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) : (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestTxInfo>, java.util.List<? extends java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestLineInfo>>, java.lang.Integer, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestViewInWallet, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void (m)] (LINE:14) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.<init>(java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Integer, java.lang.Integer, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestViewInWallet, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo):void type: THIS */
    public /* synthetic */ InvestOrderDetailsInfoVo(Long l, String str, String str2, List list, List list2, Integer num, Integer num2, InvestViewInWallet investViewInWallet, InvestTipInfoVo investTipInfoVo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : investViewInWallet, (i & 256) == 0 ? investTipInfoVo : null);
    }

    @Serializable
    public static final class InvestTxInfo implements Parcelable {
        private final List<InvestCoinInfo> investTokenInfo;
        private final InvestmentInfo investmentInfo;
        private final InvestCoinInfo rightCoinInfo;
        private final String title;
        private final String titleTip;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestTxInfo> CREATOR = new Creator();
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE), null, null, null, null};

        public static final class Creator implements Parcelable.Creator<InvestTxInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestTxInfo createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(InvestCoinInfo.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new InvestTxInfo(arrayList, parcel.readInt() == 0 ? null : InvestmentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestCoinInfo.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestTxInfo[] newArray(int i) {
                return new InvestTxInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestTxInfo() {
            this((List) null, (InvestmentInfo) null, (InvestCoinInfo) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestTxInfo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvestTxInfo copy$default(InvestTxInfo investTxInfo, List list, InvestmentInfo investmentInfo, InvestCoinInfo investCoinInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = investTxInfo.investTokenInfo;
            }
            if ((i & 2) != 0) {
                investmentInfo = investTxInfo.investmentInfo;
            }
            InvestmentInfo investmentInfo2 = investmentInfo;
            if ((i & 4) != 0) {
                investCoinInfo = investTxInfo.rightCoinInfo;
            }
            InvestCoinInfo investCoinInfo2 = investCoinInfo;
            if ((i & 8) != 0) {
                str = investTxInfo.title;
            }
            String str3 = str;
            if ((i & 16) != 0) {
                str2 = investTxInfo.titleTip;
            }
            return investTxInfo.copy(list, investmentInfo2, investCoinInfo2, str3, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestCoinInfo> component1() {
            return this.investTokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentInfo component2() {
            return this.investmentInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestCoinInfo component3() {
            return this.rightCoinInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.titleTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTxInfo copy(List<InvestCoinInfo> list, InvestmentInfo investmentInfo, InvestCoinInfo investCoinInfo, String str, String str2) {
            return new InvestTxInfo(list, investmentInfo, investCoinInfo, str, str2);
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
            if (!(obj instanceof InvestTxInfo)) {
                return false;
            }
            InvestTxInfo investTxInfo = (InvestTxInfo) obj;
            return Intrinsics.EZpvd(this.investTokenInfo, investTxInfo.investTokenInfo) && Intrinsics.EZpvd(this.investmentInfo, investTxInfo.investmentInfo) && Intrinsics.EZpvd(this.rightCoinInfo, investTxInfo.rightCoinInfo) && Intrinsics.EZpvd((Object) this.title, (Object) investTxInfo.title) && Intrinsics.EZpvd((Object) this.titleTip, (Object) investTxInfo.titleTip);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestCoinInfo> getInvestTokenInfo() {
            return this.investTokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentInfo getInvestmentInfo() {
            return this.investmentInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestCoinInfo getRightCoinInfo() {
            return this.rightCoinInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitleTip() {
            return this.titleTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<InvestCoinInfo> list = this.investTokenInfo;
            int iHashCode = list == null ? 0 : list.hashCode();
            InvestmentInfo investmentInfo = this.investmentInfo;
            int iHashCode2 = investmentInfo == null ? 0 : investmentInfo.hashCode();
            InvestCoinInfo investCoinInfo = this.rightCoinInfo;
            int iHashCode3 = investCoinInfo == null ? 0 : investCoinInfo.hashCode();
            String str = this.title;
            int iHashCode4 = str == null ? 0 : str.hashCode();
            String str2 = this.titleTip;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestTxInfo(investTokenInfo=" + this.investTokenInfo + ", investmentInfo=" + this.investmentInfo + ", rightCoinInfo=" + this.rightCoinInfo + ", title=" + this.title + ", titleTip=" + this.titleTip + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<InvestCoinInfo> list = this.investTokenInfo;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<InvestCoinInfo> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, i);
                }
            }
            InvestmentInfo investmentInfo = this.investmentInfo;
            if (investmentInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                investmentInfo.writeToParcel(parcel, i);
            }
            InvestCoinInfo investCoinInfo = this.rightCoinInfo;
            if (investCoinInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                investCoinInfo.writeToParcel(parcel, i);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.titleTip);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestTxInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestTxInfo> serializer() {
                return InvestOrderDetailsInfoVo$InvestTxInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InvestTxInfo(int i, List list, InvestmentInfo investmentInfo, InvestCoinInfo investCoinInfo, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.investTokenInfo = null;
            } else {
                this.investTokenInfo = list;
            }
            if ((i & 2) == 0) {
                this.investmentInfo = null;
            } else {
                this.investmentInfo = investmentInfo;
            }
            if ((i & 4) == 0) {
                this.rightCoinInfo = null;
            } else {
                this.rightCoinInfo = investCoinInfo;
            }
            if ((i & 8) == 0) {
                this.title = null;
            } else {
                this.title = str;
            }
            if ((i & 16) == 0) {
                this.titleTip = null;
            } else {
                this.titleTip = str2;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTxInfo investTxInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTxInfo.investTokenInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], investTxInfo.investTokenInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTxInfo.investmentInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestOrderDetailsInfoVo$InvestmentInfo$$serializer.INSTANCE, investTxInfo.investmentInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investTxInfo.rightCoinInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE, investTxInfo.rightCoinInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investTxInfo.title != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investTxInfo.title);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && investTxInfo.titleTip == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investTxInfo.titleTip);
        }

        public InvestTxInfo(List<InvestCoinInfo> list, InvestmentInfo investmentInfo, InvestCoinInfo investCoinInfo, String str, String str2) {
            this.investTokenInfo = list;
            this.investmentInfo = investmentInfo;
            this.rightCoinInfo = investCoinInfo;
            this.title = str;
            this.titleTip = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestmentInfo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestmentInfo) : (r6v0 com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestmentInfo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo) : (r7v0 com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo>, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestmentInfo, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestTxInfo.<init>(java.util.List, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestmentInfo, com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo$InvestCoinInfo, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ InvestTxInfo(List list, InvestmentInfo investmentInfo, InvestCoinInfo investCoinInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : investmentInfo, (i & 4) != 0 ? null : investCoinInfo, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
        }
    }

    @Serializable
    public static final class InvestCoinInfo implements Parcelable {
        public static final int $stable = 0;
        public static final int DIRECTION_NEGATIVE = 2;
        public static final int DIRECTION_POSITIVE = 1;
        private final String amount;
        private final Integer direction;
        private final String tokenLogo;
        private final String tokenSymbol;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<InvestCoinInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<InvestCoinInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestCoinInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvestCoinInfo(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestCoinInfo[] newArray(int i) {
                return new InvestCoinInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestCoinInfo() {
            this((String) null, (Integer) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestCoinInfo copy$default(InvestCoinInfo investCoinInfo, String str, Integer num, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investCoinInfo.amount;
            }
            if ((i & 2) != 0) {
                num = investCoinInfo.direction;
            }
            if ((i & 4) != 0) {
                str2 = investCoinInfo.tokenLogo;
            }
            if ((i & 8) != 0) {
                str3 = investCoinInfo.tokenSymbol;
            }
            return investCoinInfo.copy(str, num, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component2() {
            return this.direction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestCoinInfo copy(String str, Integer num, String str2, String str3) {
            return new InvestCoinInfo(str, num, str2, str3);
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
            if (!(obj instanceof InvestCoinInfo)) {
                return false;
            }
            InvestCoinInfo investCoinInfo = (InvestCoinInfo) obj;
            return Intrinsics.EZpvd((Object) this.amount, (Object) investCoinInfo.amount) && Intrinsics.EZpvd(this.direction, investCoinInfo.direction) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investCoinInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investCoinInfo.tokenSymbol);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAmount() {
            return this.amount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getDirection() {
            return this.direction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenLogo() {
            return this.tokenLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTokenSymbol() {
            return this.tokenSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.amount;
            int iHashCode = str == null ? 0 : str.hashCode();
            Integer num = this.direction;
            int iHashCode2 = num == null ? 0 : num.hashCode();
            String str2 = this.tokenLogo;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.tokenSymbol;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestCoinInfo(amount=" + this.amount + ", direction=" + this.direction + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.amount);
            Integer num = this.direction;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
            parcel.writeString(this.tokenLogo);
            parcel.writeString(this.tokenSymbol);
        }

        public /* synthetic */ InvestCoinInfo(int i, String str, Integer num, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.amount = null;
            } else {
                this.amount = str;
            }
            if ((i & 2) == 0) {
                this.direction = null;
            } else {
                this.direction = num;
            }
            if ((i & 4) == 0) {
                this.tokenLogo = null;
            } else {
                this.tokenLogo = str2;
            }
            if ((i & 8) == 0) {
                this.tokenSymbol = null;
            } else {
                this.tokenSymbol = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestCoinInfo investCoinInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investCoinInfo.amount != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investCoinInfo.amount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investCoinInfo.direction != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, investCoinInfo.direction);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investCoinInfo.tokenLogo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investCoinInfo.tokenLogo);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investCoinInfo.tokenSymbol == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investCoinInfo.tokenSymbol);
        }

        public InvestCoinInfo(String str, Integer num, String str2, String str3) {
            this.amount = str;
            this.direction = num;
            this.tokenLogo = str2;
            this.tokenSymbol = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void (m)] (LINE:42) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestCoinInfo.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ InvestCoinInfo(String str, Integer num, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestCoinInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InvestCoinInfo> serializer() {
                return InvestOrderDetailsInfoVo$InvestCoinInfo$$serializer.INSTANCE;
            }
        }
    }

    @Serializable
    public static final class InvestmentInfo implements Parcelable {
        private final Long aggregateId;
        private final InvestLogo investLogo;
        private final Integer investmentCategory;
        private final String investmentClassify;
        private final Long investmentId;
        private final String investmentName;
        private final String platformName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<InvestmentInfo> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<InvestmentInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvestmentInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : InvestLogo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestmentInfo[] newArray(int i) {
                return new InvestmentInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestmentInfo() {
            this((Long) null, (InvestLogo) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestmentInfo copy$default(InvestmentInfo investmentInfo, Long l, InvestLogo investLogo, Integer num, Long l2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                l = investmentInfo.aggregateId;
            }
            if ((i & 2) != 0) {
                investLogo = investmentInfo.investLogo;
            }
            InvestLogo investLogo2 = investLogo;
            if ((i & 4) != 0) {
                num = investmentInfo.investmentCategory;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                l2 = investmentInfo.investmentId;
            }
            Long l3 = l2;
            if ((i & 16) != 0) {
                str = investmentInfo.investmentName;
            }
            String str4 = str;
            if ((i & 32) != 0) {
                str2 = investmentInfo.platformName;
            }
            String str5 = str2;
            if ((i & 64) != 0) {
                str3 = investmentInfo.investmentClassify;
            }
            return investmentInfo.copy(l, investLogo2, num2, l3, str4, str5, str3);
        }

        @SerialName("aggregateId")
        public static /* synthetic */ void getAggregateId$annotations() {
        }

        @SerialName("investLogo")
        public static /* synthetic */ void getInvestLogo$annotations() {
        }

        @SerialName("investmentCategory")
        public static /* synthetic */ void getInvestmentCategory$annotations() {
        }

        @SerialName("investmentClassify")
        public static /* synthetic */ void getInvestmentClassify$annotations() {
        }

        @SerialName("investmentId")
        public static /* synthetic */ void getInvestmentId$annotations() {
        }

        @SerialName("investmentName")
        public static /* synthetic */ void getInvestmentName$annotations() {
        }

        @SerialName("platformName")
        public static /* synthetic */ void getPlatformName$annotations() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.aggregateId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestLogo component2() {
            return this.investLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component3() {
            return this.investmentCategory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component4() {
            return this.investmentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.investmentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.platformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.investmentClassify;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestmentInfo copy(Long l, InvestLogo investLogo, Integer num, Long l2, String str, String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            return new InvestmentInfo(l, investLogo, num, l2, str, str2, str3);
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
            if (!(obj instanceof InvestmentInfo)) {
                return false;
            }
            InvestmentInfo investmentInfo = (InvestmentInfo) obj;
            return Intrinsics.EZpvd(this.aggregateId, investmentInfo.aggregateId) && Intrinsics.EZpvd(this.investLogo, investmentInfo.investLogo) && Intrinsics.EZpvd(this.investmentCategory, investmentInfo.investmentCategory) && Intrinsics.EZpvd(this.investmentId, investmentInfo.investmentId) && Intrinsics.EZpvd((Object) this.investmentName, (Object) investmentInfo.investmentName) && Intrinsics.EZpvd((Object) this.platformName, (Object) investmentInfo.platformName) && Intrinsics.EZpvd((Object) this.investmentClassify, (Object) investmentInfo.investmentClassify);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getAggregateId() {
            return this.aggregateId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestLogo getInvestLogo() {
            return this.investLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getInvestmentCategory() {
            return this.investmentCategory;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInvestmentClassify() {
            return this.investmentClassify;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getInvestmentId() {
            return this.investmentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInvestmentName() {
            return this.investmentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPlatformName() {
            return this.platformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.aggregateId;
            int iHashCode = l == null ? 0 : l.hashCode();
            InvestLogo investLogo = this.investLogo;
            int iHashCode2 = investLogo == null ? 0 : investLogo.hashCode();
            Integer num = this.investmentCategory;
            int iHashCode3 = num == null ? 0 : num.hashCode();
            Long l2 = this.investmentId;
            int iHashCode4 = l2 == null ? 0 : l2.hashCode();
            String str = this.investmentName;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.platformName;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.investmentClassify.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestmentInfo(aggregateId=" + this.aggregateId + ", investLogo=" + this.investLogo + ", investmentCategory=" + this.investmentCategory + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", platformName=" + this.platformName + ", investmentClassify=" + this.investmentClassify + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long l = this.aggregateId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            InvestLogo investLogo = this.investLogo;
            if (investLogo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                investLogo.writeToParcel(parcel, i);
            }
            Integer num = this.investmentCategory;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            Long l2 = this.investmentId;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            parcel.writeString(this.investmentName);
            parcel.writeString(this.platformName);
            parcel.writeString(this.investmentClassify);
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestmentInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestmentInfo> serializer() {
                return InvestOrderDetailsInfoVo$InvestmentInfo$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InvestmentInfo(int i, Long l, InvestLogo investLogo, Integer num, Long l2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.aggregateId = null;
            } else {
                this.aggregateId = l;
            }
            if ((i & 2) == 0) {
                this.investLogo = null;
            } else {
                this.investLogo = investLogo;
            }
            if ((i & 4) == 0) {
                this.investmentCategory = null;
            } else {
                this.investmentCategory = num;
            }
            if ((i & 8) == 0) {
                this.investmentId = null;
            } else {
                this.investmentId = l2;
            }
            if ((i & 16) == 0) {
                this.investmentName = null;
            } else {
                this.investmentName = str;
            }
            if ((i & 32) == 0) {
                this.platformName = null;
            } else {
                this.platformName = str2;
            }
            if ((i & 64) == 0) {
                this.investmentClassify = "";
            } else {
                this.investmentClassify = str3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestmentInfo investmentInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investmentInfo.aggregateId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investmentInfo.aggregateId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investmentInfo.investLogo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InvestLogo$$serializer.INSTANCE, investmentInfo.investLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investmentInfo.investmentCategory != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, investmentInfo.investmentCategory);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investmentInfo.investmentId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, investmentInfo.investmentId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investmentInfo.investmentName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investmentInfo.investmentName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investmentInfo.platformName != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investmentInfo.platformName);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) investmentInfo.investmentClassify, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investmentInfo.investmentClassify);
        }

        public InvestmentInfo(Long l, InvestLogo investLogo, Integer num, Long l2, String str, String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            this.aggregateId = l;
            this.investLogo = investLogo;
            this.investmentCategory = num;
            this.investmentId = l2;
            this.investmentName = str;
            this.platformName = str2;
            this.investmentClassify = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestLogo:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestLogo) : (r7v0 com.okinc.business.invest_biz.data.bean.InvestLogo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r8v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r9v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.Long, com.okinc.business.invest_biz.data.bean.InvestLogo, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:61) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestmentInfo.<init>(java.lang.Long, com.okinc.business.invest_biz.data.bean.InvestLogo, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ InvestmentInfo(Long l, InvestLogo investLogo, Integer num, Long l2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : investLogo, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : str, (i & 32) == 0 ? str2 : null, (i & 64) != 0 ? "" : str3);
        }
    }

    @Serializable
    public static final class InvestLineInfo implements Parcelable {
        public static final int $stable = 0;
        private final String copyText;
        private final String jumpUrl;
        private final String key;
        private final String keyTip;
        private final String logo;
        private final String value;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<InvestLineInfo> CREATOR = new Creator();
        private static final InvestLineInfo EMPTY = new InvestLineInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);

        public static final class Creator implements Parcelable.Creator<InvestLineInfo> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestLineInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new InvestLineInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestLineInfo[] newArray(int i) {
                return new InvestLineInfo[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestLineInfo() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestLineInfo copy$default(InvestLineInfo investLineInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = investLineInfo.copyText;
            }
            if ((i & 2) != 0) {
                str2 = investLineInfo.jumpUrl;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = investLineInfo.key;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = investLineInfo.keyTip;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = investLineInfo.logo;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = investLineInfo.value;
            }
            return investLineInfo.copy(str, str7, str8, str9, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.copyText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.jumpUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.keyTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestLineInfo copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new InvestLineInfo(str, str2, str3, str4, str5, str6);
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
            if (!(obj instanceof InvestLineInfo)) {
                return false;
            }
            InvestLineInfo investLineInfo = (InvestLineInfo) obj;
            return Intrinsics.EZpvd((Object) this.copyText, (Object) investLineInfo.copyText) && Intrinsics.EZpvd((Object) this.jumpUrl, (Object) investLineInfo.jumpUrl) && Intrinsics.EZpvd((Object) this.key, (Object) investLineInfo.key) && Intrinsics.EZpvd((Object) this.keyTip, (Object) investLineInfo.keyTip) && Intrinsics.EZpvd((Object) this.logo, (Object) investLineInfo.logo) && Intrinsics.EZpvd((Object) this.value, (Object) investLineInfo.value);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCopyText() {
            return this.copyText;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getJumpUrl() {
            return this.jumpUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKey() {
            return this.key;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKeyTip() {
            return this.keyTip;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLogo() {
            return this.logo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copyText;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.jumpUrl;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.key;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.keyTip;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.logo;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.value;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestLineInfo(copyText=" + this.copyText + ", jumpUrl=" + this.jumpUrl + ", key=" + this.key + ", keyTip=" + this.keyTip + ", logo=" + this.logo + ", value=" + this.value + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copyText);
            parcel.writeString(this.jumpUrl);
            parcel.writeString(this.key);
            parcel.writeString(this.keyTip);
            parcel.writeString(this.logo);
            parcel.writeString(this.value);
        }

        public /* synthetic */ InvestLineInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.copyText = null;
            } else {
                this.copyText = str;
            }
            if ((i & 2) == 0) {
                this.jumpUrl = null;
            } else {
                this.jumpUrl = str2;
            }
            if ((i & 4) == 0) {
                this.key = null;
            } else {
                this.key = str3;
            }
            if ((i & 8) == 0) {
                this.keyTip = null;
            } else {
                this.keyTip = str4;
            }
            if ((i & 16) == 0) {
                this.logo = null;
            } else {
                this.logo = str5;
            }
            if ((i & 32) == 0) {
                this.value = null;
            } else {
                this.value = str6;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestLineInfo investLineInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investLineInfo.copyText != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investLineInfo.copyText);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investLineInfo.jumpUrl != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investLineInfo.jumpUrl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investLineInfo.key != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investLineInfo.key);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investLineInfo.keyTip != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investLineInfo.keyTip);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investLineInfo.logo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investLineInfo.logo);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && investLineInfo.value == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investLineInfo.value);
        }

        public InvestLineInfo(String str, String str2, String str3, String str4, String str5, String str6) {
            this.copyText = str;
            this.jumpUrl = str2;
            this.key = str3;
            this.keyTip = str4;
            this.logo = str5;
            this.value = str6;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:81) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestLineInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ InvestLineInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestLineInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<InvestLineInfo> serializer() {
                return InvestOrderDetailsInfoVo$InvestLineInfo$$serializer.INSTANCE;
            }

            public final boolean EZpvd(@NotNull InvestLineInfo investLineInfo) {
                Intrinsics.checkNotNullParameter(investLineInfo, "");
                return Intrinsics.EZpvd(investLineInfo, InvestLineInfo.EMPTY);
            }
        }
    }

    @Serializable
    public static final class InvestViewInWallet implements Parcelable {
        public static final int $stable = 0;
        private final Long analysisPlatformId;
        private final Long chainId;
        private final Boolean isShow;
        private final Long platformId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<InvestViewInWallet> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<InvestViewInWallet> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestViewInWallet createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Intrinsics.checkNotNullParameter(parcel, "");
                Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new InvestViewInWallet(lValueOf, lValueOf2, boolValueOf, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InvestViewInWallet[] newArray(int i) {
                return new InvestViewInWallet[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestViewInWallet() {
            this((Long) null, (Long) null, (Boolean) null, (Long) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ InvestViewInWallet copy$default(InvestViewInWallet investViewInWallet, Long l, Long l2, Boolean bool, Long l3, int i, Object obj) {
            if ((i & 1) != 0) {
                l = investViewInWallet.analysisPlatformId;
            }
            if ((i & 2) != 0) {
                l2 = investViewInWallet.chainId;
            }
            if ((i & 4) != 0) {
                bool = investViewInWallet.isShow;
            }
            if ((i & 8) != 0) {
                l3 = investViewInWallet.platformId;
            }
            return investViewInWallet.copy(l, l2, bool, l3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component2() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component3() {
            return this.isShow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component4() {
            return this.platformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestViewInWallet copy(Long l, Long l2, Boolean bool, Long l3) {
            return new InvestViewInWallet(l, l2, bool, l3);
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
            if (!(obj instanceof InvestViewInWallet)) {
                return false;
            }
            InvestViewInWallet investViewInWallet = (InvestViewInWallet) obj;
            return Intrinsics.EZpvd(this.analysisPlatformId, investViewInWallet.analysisPlatformId) && Intrinsics.EZpvd(this.chainId, investViewInWallet.chainId) && Intrinsics.EZpvd(this.isShow, investViewInWallet.isShow) && Intrinsics.EZpvd(this.platformId, investViewInWallet.platformId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getAnalysisPlatformId() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getPlatformId() {
            return this.platformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.analysisPlatformId;
            int iHashCode = l == null ? 0 : l.hashCode();
            Long l2 = this.chainId;
            int iHashCode2 = l2 == null ? 0 : l2.hashCode();
            Boolean bool = this.isShow;
            int iHashCode3 = bool == null ? 0 : bool.hashCode();
            Long l3 = this.platformId;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l3 != null ? l3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isShow() {
            return this.isShow;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestViewInWallet(analysisPlatformId=" + this.analysisPlatformId + ", chainId=" + this.chainId + ", isShow=" + this.isShow + ", platformId=" + this.platformId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long l = this.analysisPlatformId;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Long l2 = this.chainId;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l2.longValue());
            }
            Boolean bool = this.isShow;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Long l3 = this.platformId;
            if (l3 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l3.longValue());
            }
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestViewInWallet.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestViewInWallet> serializer() {
                return InvestOrderDetailsInfoVo$InvestViewInWallet$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InvestViewInWallet(int i, Long l, Long l2, Boolean bool, Long l3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.analysisPlatformId = null;
            } else {
                this.analysisPlatformId = l;
            }
            if ((i & 2) == 0) {
                this.chainId = null;
            } else {
                this.chainId = l2;
            }
            if ((i & 4) == 0) {
                this.isShow = null;
            } else {
                this.isShow = bool;
            }
            if ((i & 8) == 0) {
                this.platformId = null;
            } else {
                this.platformId = l3;
            }
        }

        public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestViewInWallet investViewInWallet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investViewInWallet.analysisPlatformId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investViewInWallet.analysisPlatformId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investViewInWallet.chainId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investViewInWallet.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investViewInWallet.isShow != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, investViewInWallet.isShow);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investViewInWallet.platformId == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, investViewInWallet.platformId);
        }

        public InvestViewInWallet(Long l, Long l2, Boolean bool, Long l3) {
            this.analysisPlatformId = l;
            this.chainId = l2;
            this.isShow = bool;
            this.platformId = l3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long):void (m)] (LINE:98) call: com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo.InvestViewInWallet.<init>(java.lang.Long, java.lang.Long, java.lang.Boolean, java.lang.Long):void type: THIS */
        public /* synthetic */ InvestViewInWallet(Long l, Long l2, Boolean bool, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : l3);
        }
    }
}

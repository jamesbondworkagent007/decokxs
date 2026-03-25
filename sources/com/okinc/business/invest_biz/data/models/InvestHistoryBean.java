package com.okinc.business.invest_biz.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class InvestHistoryBean implements Parcelable {
    private final long blockTime;
    private final String browserUrl;
    private final long chainId;
    private final String costTime;
    private final long createTime;
    private String date;
    private final List<InvestTokenWithAmount> investInfo;
    private boolean isShowDate;
    private final String network;
    private final String orderId;
    private final int orderStatus;
    private final int orderType;
    private final int orderVoStatus;
    private String time;
    private final List<InvestSimpleToken> tokenInfo;
    private final String totalValue;
    private final String txHash;
    private final String txId;
    private final String uopHash;
    private final long updateTime;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestHistoryBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(InvestTokenWithAmount$$serializer.INSTANCE), null, null, null, null, null, new ArrayListSerializer(InvestSimpleToken$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InvestHistoryBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHistoryBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            long j = parcel.readLong();
            String string2 = parcel.readString();
            long j2 = parcel.readLong();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestTokenWithAmount.CREATOR.createFromParcel(parcel));
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            int i7 = 0;
            while (i7 != i6) {
                arrayList2.add(InvestSimpleToken.CREATOR.createFromParcel(parcel));
                i7++;
                i6 = i6;
            }
            return new InvestHistoryBean(string, j, string2, j2, arrayList, string3, string4, i3, i4, i5, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestHistoryBean[] newArray(int i) {
            return new InvestHistoryBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestHistoryBean() {
        this((String) null, 0L, (String) null, 0L, (List) null, (String) null, (String) null, 0, 0, 0, (List) null, (String) null, (String) null, (String) null, 0L, 0L, (String) null, (String) null, false, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.orderVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> component11() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component15() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component16() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.isShowDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> component5() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestHistoryBean copy(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull List<InvestTokenWithAmount> list, @NotNull String str3, @NotNull String str4, int i, int i2, int i3, @NotNull List<InvestSimpleToken> list2, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j3, long j4, @NotNull String str8, @NotNull String str9, boolean z, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new InvestHistoryBean(str, j, str2, j2, list, str3, str4, i, i2, i3, list2, str5, str6, str7, j3, j4, str8, str9, z, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getBlockTime() {
        return this.blockTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrowserUrl() {
        return this.browserUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCostTime() {
        return this.costTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDate() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> getInvestInfo() {
        return this.investInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderStatus() {
        return this.orderStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderVoStatus() {
        return this.orderVoStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestSimpleToken> getTokenInfo() {
        return this.tokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValue() {
        return this.totalValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxId() {
        return this.txId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowDate() {
        return this.isShowDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.date = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowDate(boolean z) {
        this.isShowDate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.time = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestHistoryBean(browserUrl=" + this.browserUrl + ", blockTime=" + this.blockTime + ", costTime=" + this.costTime + ", createTime=" + this.createTime + ", investInfo=" + this.investInfo + ", network=" + this.network + ", orderId=" + this.orderId + ", orderStatus=" + this.orderStatus + ", orderType=" + this.orderType + ", orderVoStatus=" + this.orderVoStatus + ", tokenInfo=" + this.tokenInfo + ", totalValue=" + this.totalValue + ", txHash=" + this.txHash + ", txId=" + this.txId + ", updateTime=" + this.updateTime + ", chainId=" + this.chainId + ", date=" + this.date + ", time=" + this.time + ", isShowDate=" + this.isShowDate + ", uopHash=" + this.uopHash + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.browserUrl);
        parcel.writeLong(this.blockTime);
        parcel.writeString(this.costTime);
        parcel.writeLong(this.createTime);
        List<InvestTokenWithAmount> list = this.investInfo;
        parcel.writeInt(list.size());
        Iterator<InvestTokenWithAmount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.network);
        parcel.writeString(this.orderId);
        parcel.writeInt(this.orderStatus);
        parcel.writeInt(this.orderType);
        parcel.writeInt(this.orderVoStatus);
        List<InvestSimpleToken> list2 = this.tokenInfo;
        parcel.writeInt(list2.size());
        Iterator<InvestSimpleToken> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.totalValue);
        parcel.writeString(this.txHash);
        parcel.writeString(this.txId);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.date);
        parcel.writeString(this.time);
        parcel.writeInt(this.isShowDate ? 1 : 0);
        parcel.writeString(this.uopHash);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InvestHistoryBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestHistoryBean> serializer() {
            return InvestHistoryBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestHistoryBean(int i, String str, long j, String str2, long j2, List list, String str3, String str4, int i2, int i3, int i4, List list2, String str5, String str6, String str7, long j3, long j4, String str8, String str9, boolean z, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.browserUrl = "";
        } else {
            this.browserUrl = str;
        }
        if ((i & 2) == 0) {
            this.blockTime = 0L;
        } else {
            this.blockTime = j;
        }
        if ((i & 4) == 0) {
            this.costTime = "";
        } else {
            this.costTime = str2;
        }
        if ((i & 8) == 0) {
            this.createTime = 0L;
        } else {
            this.createTime = j2;
        }
        this.investInfo = (i & 16) == 0 ? yDY.AhwBna() : list;
        if ((i & 32) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 64) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str4;
        }
        if ((i & 128) == 0) {
            this.orderStatus = 0;
        } else {
            this.orderStatus = i2;
        }
        if ((i & 256) == 0) {
            this.orderType = 0;
        } else {
            this.orderType = i3;
        }
        if ((i & 512) == 0) {
            this.orderVoStatus = 0;
        } else {
            this.orderVoStatus = i4;
        }
        this.tokenInfo = (i & 1024) == 0 ? yDY.AhwBna() : list2;
        if ((i & 2048) == 0) {
            this.totalValue = "";
        } else {
            this.totalValue = str5;
        }
        if ((i & 4096) == 0) {
            this.txHash = "";
        } else {
            this.txHash = str6;
        }
        if ((i & 8192) == 0) {
            this.txId = "";
        } else {
            this.txId = str7;
        }
        if ((i & 16384) == 0) {
            this.updateTime = 0L;
        } else {
            this.updateTime = j3;
        }
        this.chainId = (32768 & i) != 0 ? j4 : 0L;
        if ((65536 & i) == 0) {
            this.date = "";
        } else {
            this.date = str8;
        }
        if ((131072 & i) == 0) {
            this.time = "";
        } else {
            this.time = str9;
        }
        this.isShowDate = (262144 & i) == 0 ? true : z;
        this.uopHash = (i & 524288) == 0 ? null : str10;
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestHistoryBean investHistoryBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investHistoryBean.browserUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investHistoryBean.browserUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investHistoryBean.blockTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 1, investHistoryBean.blockTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investHistoryBean.costTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investHistoryBean.costTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investHistoryBean.createTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, investHistoryBean.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(investHistoryBean.investInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], investHistoryBean.investInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investHistoryBean.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investHistoryBean.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investHistoryBean.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investHistoryBean.orderId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investHistoryBean.orderStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, investHistoryBean.orderStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || investHistoryBean.orderType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, investHistoryBean.orderType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || investHistoryBean.orderVoStatus != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, investHistoryBean.orderVoStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(investHistoryBean.tokenInfo, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], investHistoryBean.tokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) investHistoryBean.totalValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, investHistoryBean.totalValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) investHistoryBean.txHash, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, investHistoryBean.txHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investHistoryBean.txId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investHistoryBean.txId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || investHistoryBean.updateTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 14, investHistoryBean.updateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investHistoryBean.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 15, investHistoryBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) investHistoryBean.date, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, investHistoryBean.date);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) investHistoryBean.time, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, investHistoryBean.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !investHistoryBean.isShowDate) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, investHistoryBean.isShowDate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && investHistoryBean.uopHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, investHistoryBean.uopHash);
    }

    public InvestHistoryBean(@NotNull String str, long j, @NotNull String str2, long j2, @NotNull List<InvestTokenWithAmount> list, @NotNull String str3, @NotNull String str4, int i, int i2, int i3, @NotNull List<InvestSimpleToken> list2, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j3, long j4, @NotNull String str8, @NotNull String str9, boolean z, String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.browserUrl = str;
        this.blockTime = j;
        this.costTime = str2;
        this.createTime = j2;
        this.investInfo = list;
        this.network = str3;
        this.orderId = str4;
        this.orderStatus = i;
        this.orderType = i2;
        this.orderVoStatus = i3;
        this.tokenInfo = list2;
        this.totalValue = str5;
        this.txHash = str6;
        this.txId = str7;
        this.updateTime = j3;
        this.chainId = j4;
        this.date = str8;
        this.time = str9;
        this.isShowDate = z;
        this.uopHash = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ec: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r50v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r50v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r27v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r50v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001d: ARITH (r50v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r30v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r50v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r32v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r50v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r50v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0041: ARITH (r50v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004a: ARITH (r50v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r50v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r37v0 int) : (0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r50v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r50v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:0x0077: TERNARY null = ((wrap:int:0x006e: ARITH (r50v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:0x0082: TERNARY null = ((wrap:int:0x0079: ARITH (r50v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0084: ARITH (r50v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r42v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0090: ARITH (32768 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r44v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009a: ARITH (65536 int) & (r50v0 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r50v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00af: ARITH (r50v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? true : (r48v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ba: ARITH (r50v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, long, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.String, int, int, int, java.util.List<com.okinc.business.invest_biz.data.models.InvestSimpleToken>, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.invest_biz.data.models.InvestHistoryBean.<init>(java.lang.String, long, java.lang.String, long, java.util.List, java.lang.String, java.lang.String, int, int, int, java.util.List, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ InvestHistoryBean(String str, long j, String str2, long j2, List list, String str3, String str4, int i, int i2, int i3, List list2, String str5, String str6, String str7, long j3, long j4, String str8, String str9, boolean z, String str10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0L : j, (i4 & 4) != 0 ? "" : str2, (i4 & 8) != 0 ? 0L : j2, (i4 & 16) != 0 ? yDY.AhwBna() : list, (i4 & 32) != 0 ? "" : str3, (i4 & 64) != 0 ? "" : str4, (i4 & 128) != 0 ? 0 : i, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) == 0 ? i3 : 0, (i4 & 1024) != 0 ? yDY.AhwBna() : list2, (i4 & 2048) != 0 ? "" : str5, (i4 & 4096) != 0 ? "" : str6, (i4 & 8192) != 0 ? "" : str7, (i4 & 16384) != 0 ? 0L : j3, (32768 & i4) != 0 ? 0L : j4, (65536 & i4) != 0 ? "" : str8, (i4 & 131072) != 0 ? "" : str9, (i4 & 262144) != 0 ? true : z, (i4 & 524288) != 0 ? null : str10);
    }

    public boolean equals(Object obj) {
        return obj instanceof InvestHistoryBean ? Intrinsics.EZpvd((Object) this.orderId, (Object) ((InvestHistoryBean) obj).orderId) : super.equals(obj);
    }

    public int hashCode() {
        String str = this.orderId;
        long j = this.blockTime;
        return Objects.hash(str, Long.valueOf(j), this.txHash, this.txId, this.uopHash);
    }
}

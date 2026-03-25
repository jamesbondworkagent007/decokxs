package com.okinc.business.invest_biz.data.bean.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo;
import com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HomeOrderParam implements Parcelable {
    private static final Integer ORDER_TYPE_ALL = null;
    private final Long chainId;
    private final Integer orderType;
    private final int pageNum;
    private final int pageSize;
    private final List<InvestWalletAddressInfo> walletAddressInfoList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeOrderParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestWalletAddressInfo$$serializer.INSTANCE), null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<HomeOrderParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeOrderParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestWalletAddressInfo.CREATOR.createFromParcel(parcel));
            }
            return new HomeOrderParam(lValueOf, numValueOf, arrayList, parcel.readInt(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeOrderParam[] newArray(int i) {
            return new HomeOrderParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.invest_biz.data.bean.request.HomeOrderParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeOrderParam copy$default(HomeOrderParam homeOrderParam, Long l, Integer num, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            l = homeOrderParam.chainId;
        }
        if ((i3 & 2) != 0) {
            num = homeOrderParam.orderType;
        }
        Integer num2 = num;
        if ((i3 & 4) != 0) {
            list = homeOrderParam.walletAddressInfoList;
        }
        List list2 = list;
        if ((i3 & 8) != 0) {
            i = homeOrderParam.pageSize;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = homeOrderParam.pageNum;
        }
        return homeOrderParam.copy(l, num2, list2, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> component3() {
        return this.walletAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeOrderParam copy(Long l, Integer num, @NotNull List<InvestWalletAddressInfo> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeOrderParam(l, num, list, i, i2);
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
        if (!(obj instanceof HomeOrderParam)) {
            return false;
        }
        HomeOrderParam homeOrderParam = (HomeOrderParam) obj;
        return Intrinsics.EZpvd(this.chainId, homeOrderParam.chainId) && Intrinsics.EZpvd(this.orderType, homeOrderParam.orderType) && Intrinsics.EZpvd(this.walletAddressInfoList, homeOrderParam.walletAddressInfoList) && this.pageSize == homeOrderParam.pageSize && this.pageNum == homeOrderParam.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> getWalletAddressInfoList() {
        return this.walletAddressInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Integer num = this.orderType;
        return (((((((iHashCode * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.walletAddressInfoList.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.pageNum);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeOrderParam(chainId=" + this.chainId + ", orderType=" + this.orderType + ", walletAddressInfoList=" + this.walletAddressInfoList + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + ")";
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
        Integer num = this.orderType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        List<InvestWalletAddressInfo> list = this.walletAddressInfoList;
        parcel.writeInt(list.size());
        Iterator<InvestWalletAddressInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.pageNum);
    }

    public /* synthetic */ HomeOrderParam(int i, Long l, Integer num, List list, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4, HomeOrderParam$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = (i & 1) == 0 ? null : l;
        if ((i & 2) == 0) {
            this.orderType = ORDER_TYPE_ALL;
        } else {
            this.orderType = num;
        }
        this.walletAddressInfoList = list;
        if ((i & 8) == 0) {
            this.pageSize = 10;
        } else {
            this.pageSize = i2;
        }
        if ((i & 16) == 0) {
            this.pageNum = 1;
        } else {
            this.pageNum = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(HomeOrderParam homeOrderParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || homeOrderParam.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, homeOrderParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(homeOrderParam.orderType, ORDER_TYPE_ALL)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, homeOrderParam.orderType);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], homeOrderParam.walletAddressInfoList);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || homeOrderParam.pageSize != 10) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, homeOrderParam.pageSize);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && homeOrderParam.pageNum == 1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 4, homeOrderParam.pageNum);
    }

    public HomeOrderParam(Long l, Integer num, @NotNull List<InvestWalletAddressInfo> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = l;
        this.orderType = num;
        this.walletAddressInfoList = list;
        this.pageSize = i;
        this.pageNum = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:java.lang.Long:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.Integer:0x000c: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Integer:0x000a: SGET  A[WRAPPED] com.okinc.business.invest_biz.data.bean.request.HomeOrderParam.ORDER_TYPE_ALL java.lang.Integer) : (r8v0 java.lang.Integer))
  (r9v0 java.util.List)
  (wrap:int:0x0013: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (10 int) : (r10v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0014: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r11v0 int))
 A[MD:(java.lang.Long, java.lang.Integer, java.util.List<com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo>, int, int):void (m)] (LINE:37) call: com.okinc.business.invest_biz.data.bean.request.HomeOrderParam.<init>(java.lang.Long, java.lang.Integer, java.util.List, int, int):void type: THIS */
    public /* synthetic */ HomeOrderParam(Long l, Integer num, List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : l, (i3 & 2) != 0 ? ORDER_TYPE_ALL : num, list, (i3 & 8) != 0 ? 10 : i, (i3 & 16) != 0 ? 1 : i2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.HomeOrderParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HomeOrderParam> serializer() {
            return HomeOrderParam$$serializer.INSTANCE;
        }
    }
}

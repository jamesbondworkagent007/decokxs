package com.okinc.business.invest_biz.data.bean.request;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestMyInvestmentNewParam implements Parcelable {
    private final String brc20PoolId;
    private final Long farmInvestmentId;
    private final Long investmentId;
    private final List<InvestWalletIdInfo> walletIdList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestMyInvestmentNewParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(InvestWalletIdInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestMyInvestmentNewParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMyInvestmentNewParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(InvestWalletIdInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new InvestMyInvestmentNewParam(lValueOf, lValueOf2, string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestMyInvestmentNewParam[] newArray(int i) {
            return new InvestMyInvestmentNewParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestMyInvestmentNewParam() {
        this((Long) null, (Long) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.InvestMyInvestmentNewParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestMyInvestmentNewParam copy$default(InvestMyInvestmentNewParam investMyInvestmentNewParam, Long l, Long l2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = investMyInvestmentNewParam.farmInvestmentId;
        }
        if ((i & 2) != 0) {
            l2 = investMyInvestmentNewParam.investmentId;
        }
        if ((i & 4) != 0) {
            str = investMyInvestmentNewParam.brc20PoolId;
        }
        if ((i & 8) != 0) {
            list = investMyInvestmentNewParam.walletIdList;
        }
        return investMyInvestmentNewParam.copy(l, l2, str, list);
    }

    @SerialName("poolId")
    public static /* synthetic */ void getBrc20PoolId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.farmInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.brc20PoolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletIdInfo> component4() {
        return this.walletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestMyInvestmentNewParam copy(Long l, Long l2, String str, List<InvestWalletIdInfo> list) {
        return new InvestMyInvestmentNewParam(l, l2, str, list);
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
        if (!(obj instanceof InvestMyInvestmentNewParam)) {
            return false;
        }
        InvestMyInvestmentNewParam investMyInvestmentNewParam = (InvestMyInvestmentNewParam) obj;
        return Intrinsics.EZpvd(this.farmInvestmentId, investMyInvestmentNewParam.farmInvestmentId) && Intrinsics.EZpvd(this.investmentId, investMyInvestmentNewParam.investmentId) && Intrinsics.EZpvd((Object) this.brc20PoolId, (Object) investMyInvestmentNewParam.brc20PoolId) && Intrinsics.EZpvd(this.walletIdList, investMyInvestmentNewParam.walletIdList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBrc20PoolId() {
        return this.brc20PoolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFarmInvestmentId() {
        return this.farmInvestmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletIdInfo> getWalletIdList() {
        return this.walletIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.farmInvestmentId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.investmentId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.brc20PoolId;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<InvestWalletIdInfo> list = this.walletIdList;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestMyInvestmentNewParam(farmInvestmentId=" + this.farmInvestmentId + ", investmentId=" + this.investmentId + ", brc20PoolId=" + this.brc20PoolId + ", walletIdList=" + this.walletIdList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.farmInvestmentId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.investmentId;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeString(this.brc20PoolId);
        List<InvestWalletIdInfo> list = this.walletIdList;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<InvestWalletIdInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestMyInvestmentNewParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestMyInvestmentNewParam> serializer() {
            return InvestMyInvestmentNewParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestMyInvestmentNewParam(int i, Long l, Long l2, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.farmInvestmentId = null;
        } else {
            this.farmInvestmentId = l;
        }
        if ((i & 2) == 0) {
            this.investmentId = null;
        } else {
            this.investmentId = l2;
        }
        if ((i & 4) == 0) {
            this.brc20PoolId = null;
        } else {
            this.brc20PoolId = str;
        }
        if ((i & 8) == 0) {
            this.walletIdList = null;
        } else {
            this.walletIdList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestMyInvestmentNewParam investMyInvestmentNewParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investMyInvestmentNewParam.farmInvestmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investMyInvestmentNewParam.farmInvestmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investMyInvestmentNewParam.investmentId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, investMyInvestmentNewParam.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investMyInvestmentNewParam.brc20PoolId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investMyInvestmentNewParam.brc20PoolId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && investMyInvestmentNewParam.walletIdList == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], investMyInvestmentNewParam.walletIdList);
    }

    public InvestMyInvestmentNewParam(Long l, Long l2, String str, List<InvestWalletIdInfo> list) {
        this.farmInvestmentId = l;
        this.investmentId = l2;
        this.brc20PoolId = str;
        this.walletIdList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.request.InvestWalletIdInfo>):void (m)] (LINE:15) call: com.okinc.business.invest_biz.data.bean.request.InvestMyInvestmentNewParam.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestMyInvestmentNewParam(Long l, Long l2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }
}

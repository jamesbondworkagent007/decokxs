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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestProductDetailParam implements Parcelable {
    private final int investmentCategory;
    private final long investmentId;
    private final List<InvestWalletAddressInfo> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestProductDetailParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(InvestWalletAddressInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestProductDetailParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestProductDetailParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(InvestWalletAddressInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestProductDetailParam(j, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestProductDetailParam[] newArray(int i) {
            return new InvestProductDetailParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestProductDetailParam() {
        this(0L, 0, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestProductDetailParam copy$default(InvestProductDetailParam investProductDetailParam, long j, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = investProductDetailParam.investmentId;
        }
        if ((i2 & 2) != 0) {
            i = investProductDetailParam.investmentCategory;
        }
        if ((i2 & 4) != 0) {
            list = investProductDetailParam.walletAddressList;
        }
        return investProductDetailParam.copy(j, i, list);
    }

    @SerialName("investmentCategory")
    public static /* synthetic */ void getInvestmentCategory$annotations() {
    }

    @SerialName("investmentId")
    public static /* synthetic */ void getInvestmentId$annotations() {
    }

    @SerialName("walletAddressList")
    public static /* synthetic */ void getWalletAddressList$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> component3() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestProductDetailParam copy(long j, int i, @NotNull List<InvestWalletAddressInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestProductDetailParam(j, i, list);
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
        if (!(obj instanceof InvestProductDetailParam)) {
            return false;
        }
        InvestProductDetailParam investProductDetailParam = (InvestProductDetailParam) obj;
        return this.investmentId == investProductDetailParam.investmentId && this.investmentCategory == investProductDetailParam.investmentCategory && Intrinsics.EZpvd(this.walletAddressList, investProductDetailParam.walletAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInvestmentCategory() {
        return this.investmentCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getInvestmentId() {
        return this.investmentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.investmentId) * 31) + Integer.hashCode(this.investmentCategory)) * 31) + this.walletAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestProductDetailParam(investmentId=" + this.investmentId + ", investmentCategory=" + this.investmentCategory + ", walletAddressList=" + this.walletAddressList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.investmentId);
        parcel.writeInt(this.investmentCategory);
        List<InvestWalletAddressInfo> list = this.walletAddressList;
        parcel.writeInt(list.size());
        Iterator<InvestWalletAddressInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestProductDetailParam> serializer() {
            return InvestProductDetailParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestProductDetailParam(int i, long j, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.investmentId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.investmentCategory = 0;
        } else {
            this.investmentCategory = i2;
        }
        if ((i & 4) == 0) {
            this.walletAddressList = yDY.AhwBna();
        } else {
            this.walletAddressList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestProductDetailParam investProductDetailParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investProductDetailParam.investmentId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investProductDetailParam.investmentId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investProductDetailParam.investmentCategory != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, investProductDetailParam.investmentCategory);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(investProductDetailParam.walletAddressList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investProductDetailParam.walletAddressList);
    }

    public InvestProductDetailParam(long j, int i, @NotNull List<InvestWalletAddressInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.investmentId = j;
        this.investmentCategory = i;
        this.walletAddressList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r4v0 java.util.List))
 A[MD:(long, int, java.util.List<com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo>):void (m)] (LINE:25) call: com.okinc.business.invest_biz.data.bean.request.InvestProductDetailParam.<init>(long, int, java.util.List):void type: THIS */
    public /* synthetic */ InvestProductDetailParam(long j, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? yDY.AhwBna() : list);
    }
}

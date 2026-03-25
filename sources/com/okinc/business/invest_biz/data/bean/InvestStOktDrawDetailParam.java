package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestStOktDrawDetailParam implements Parcelable {
    private final List<InvestWalletAddressInfo> walletAddressList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestStOktDrawDetailParam> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(InvestWalletAddressInfo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestStOktDrawDetailParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestStOktDrawDetailParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(InvestWalletAddressInfo.CREATOR.createFromParcel(parcel));
            }
            return new InvestStOktDrawDetailParam(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestStOktDrawDetailParam[] newArray(int i) {
            return new InvestStOktDrawDetailParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestStOktDrawDetailParam() {
        this((List) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailParam */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InvestStOktDrawDetailParam copy$default(InvestStOktDrawDetailParam investStOktDrawDetailParam, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investStOktDrawDetailParam.walletAddressList;
        }
        return investStOktDrawDetailParam.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> component1() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestStOktDrawDetailParam copy(@NotNull List<InvestWalletAddressInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestStOktDrawDetailParam(list);
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
        return (obj instanceof InvestStOktDrawDetailParam) && Intrinsics.EZpvd(this.walletAddressList, ((InvestStOktDrawDetailParam) obj).walletAddressList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestWalletAddressInfo> getWalletAddressList() {
        return this.walletAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.walletAddressList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestStOktDrawDetailParam(walletAddressList=" + this.walletAddressList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestStOktDrawDetailParam> serializer() {
            return InvestStOktDrawDetailParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestStOktDrawDetailParam(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletAddressList = yDY.AhwBna();
        } else {
            this.walletAddressList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestStOktDrawDetailParam investStOktDrawDetailParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd(investStOktDrawDetailParam.walletAddressList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], investStOktDrawDetailParam.walletAddressList);
    }

    public InvestStOktDrawDetailParam(@NotNull List<InvestWalletAddressInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddressList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:296)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.invest_biz.data.bean.InvestWalletAddressInfo>):void (m)] (LINE:295) call: com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailParam.<init>(java.util.List):void type: THIS */
    public /* synthetic */ InvestStOktDrawDetailParam(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}

package com.okinc.crcore.coreapi.net.responsebean.bsc;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SupportCurrenciesResponseBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<FiatResponseBean> depositSupportCurrencies;
    private final List<FiatResponseBean> withdrawSupportCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportCurrenciesResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SupportCurrenciesResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrenciesResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FiatResponseBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(FiatResponseBean.CREATOR.createFromParcel(parcel));
            }
            return new SupportCurrenciesResponseBean(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrenciesResponseBean[] newArray(int i) {
            return new SupportCurrenciesResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrenciesResponseBean() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrenciesResponseBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCurrenciesResponseBean copy$default(SupportCurrenciesResponseBean supportCurrenciesResponseBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportCurrenciesResponseBean.depositSupportCurrencies;
        }
        if ((i & 2) != 0) {
            list2 = supportCurrenciesResponseBean.withdrawSupportCurrencies;
        }
        return supportCurrenciesResponseBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatResponseBean> component1() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatResponseBean> component2() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrenciesResponseBean copy(@NotNull List<FiatResponseBean> list, @NotNull List<FiatResponseBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SupportCurrenciesResponseBean(list, list2);
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
        if (!(obj instanceof SupportCurrenciesResponseBean)) {
            return false;
        }
        SupportCurrenciesResponseBean supportCurrenciesResponseBean = (SupportCurrenciesResponseBean) obj;
        return Intrinsics.EZpvd(this.depositSupportCurrencies, supportCurrenciesResponseBean.depositSupportCurrencies) && Intrinsics.EZpvd(this.withdrawSupportCurrencies, supportCurrenciesResponseBean.withdrawSupportCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatResponseBean> getDepositSupportCurrencies() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatResponseBean> getWithdrawSupportCurrencies() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.depositSupportCurrencies.hashCode() * 31) + this.withdrawSupportCurrencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCurrenciesResponseBean(depositSupportCurrencies=" + this.depositSupportCurrencies + ", withdrawSupportCurrencies=" + this.withdrawSupportCurrencies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FiatResponseBean> list = this.depositSupportCurrencies;
        parcel.writeInt(list.size());
        Iterator<FiatResponseBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<FiatResponseBean> list2 = this.withdrawSupportCurrencies;
        parcel.writeInt(list2.size());
        Iterator<FiatResponseBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrenciesResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportCurrenciesResponseBean> serializer() {
            return SupportCurrenciesResponseBean$$serializer.INSTANCE;
        }
    }

    static {
        FiatResponseBean$$serializer fiatResponseBean$$serializer = FiatResponseBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(fiatResponseBean$$serializer), new ArrayListSerializer(fiatResponseBean$$serializer)};
    }

    public /* synthetic */ SupportCurrenciesResponseBean(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.depositSupportCurrencies = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.withdrawSupportCurrencies = yDY.AhwBna();
        } else {
            this.withdrawSupportCurrencies = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SupportCurrenciesResponseBean supportCurrenciesResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(supportCurrenciesResponseBean.depositSupportCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportCurrenciesResponseBean.depositSupportCurrencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(supportCurrenciesResponseBean.withdrawSupportCurrencies, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], supportCurrenciesResponseBean.withdrawSupportCurrencies);
    }

    public SupportCurrenciesResponseBean(@NotNull List<FiatResponseBean> list, @NotNull List<FiatResponseBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.depositSupportCurrencies = list;
        this.withdrawSupportCurrencies = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.FiatResponseBean>, java.util.List<com.okinc.crcore.coreapi.net.responsebean.bsc.FiatResponseBean>):void (m)] (LINE:14) call: com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrenciesResponseBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SupportCurrenciesResponseBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }
}

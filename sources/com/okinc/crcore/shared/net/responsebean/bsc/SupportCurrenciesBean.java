package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.FiatResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.SupportCurrenciesResponseBean;
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
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SupportCurrenciesBean implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<FiatBean> depositSupportCurrencies;
    private final List<FiatBean> withdrawSupportCurrencies;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportCurrenciesBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SupportCurrenciesBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrenciesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FiatBean.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(FiatBean.CREATOR.createFromParcel(parcel));
            }
            return new SupportCurrenciesBean(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrenciesBean[] newArray(int i) {
            return new SupportCurrenciesBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrenciesBean() {
        this((List) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.bsc.SupportCurrenciesBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportCurrenciesBean copy$default(SupportCurrenciesBean supportCurrenciesBean, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = supportCurrenciesBean.depositSupportCurrencies;
        }
        if ((i & 2) != 0) {
            list2 = supportCurrenciesBean.withdrawSupportCurrencies;
        }
        return supportCurrenciesBean.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatBean> component1() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatBean> component2() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportCurrenciesBean copy(@NotNull List<FiatBean> list, @NotNull List<FiatBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SupportCurrenciesBean(list, list2);
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
        if (!(obj instanceof SupportCurrenciesBean)) {
            return false;
        }
        SupportCurrenciesBean supportCurrenciesBean = (SupportCurrenciesBean) obj;
        return Intrinsics.EZpvd(this.depositSupportCurrencies, supportCurrenciesBean.depositSupportCurrencies) && Intrinsics.EZpvd(this.withdrawSupportCurrencies, supportCurrenciesBean.withdrawSupportCurrencies);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatBean> getDepositSupportCurrencies() {
        return this.depositSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FiatBean> getWithdrawSupportCurrencies() {
        return this.withdrawSupportCurrencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.depositSupportCurrencies.hashCode() * 31) + this.withdrawSupportCurrencies.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportCurrenciesBean(depositSupportCurrencies=" + this.depositSupportCurrencies + ", withdrawSupportCurrencies=" + this.withdrawSupportCurrencies + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FiatBean> list = this.depositSupportCurrencies;
        parcel.writeInt(list.size());
        Iterator<FiatBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<FiatBean> list2 = this.withdrawSupportCurrencies;
        parcel.writeInt(list2.size());
        Iterator<FiatBean> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SupportCurrenciesBean(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        this.depositSupportCurrencies = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.withdrawSupportCurrencies = yDY.AhwBna();
        } else {
            this.withdrawSupportCurrencies = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(SupportCurrenciesBean supportCurrenciesBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(supportCurrenciesBean.depositSupportCurrencies, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], supportCurrenciesBean.depositSupportCurrencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(supportCurrenciesBean.withdrawSupportCurrencies, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], supportCurrenciesBean.withdrawSupportCurrencies);
    }

    public SupportCurrenciesBean(@NotNull List<FiatBean> list, @NotNull List<FiatBean> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.depositSupportCurrencies = list;
        this.withdrawSupportCurrencies = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.FiatBean>, java.util.List<com.okinc.crcore.shared.net.responsebean.bsc.FiatBean>):void (m)] (LINE:15) call: com.okinc.crcore.shared.net.responsebean.bsc.SupportCurrenciesBean.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SupportCurrenciesBean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.SupportCurrenciesBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SupportCurrenciesBean> serializer() {
            return SupportCurrenciesBean$$serializer.INSTANCE;
        }

        public final SupportCurrenciesBean OLrzqt(@NotNull SupportCurrenciesResponseBean supportCurrenciesResponseBean) {
            Intrinsics.checkNotNullParameter(supportCurrenciesResponseBean, "");
            List<FiatResponseBean> depositSupportCurrencies = supportCurrenciesResponseBean.getDepositSupportCurrencies();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(depositSupportCurrencies, 10));
            Iterator<T> it = depositSupportCurrencies.iterator();
            while (it.hasNext()) {
                arrayList.add(FiatBean.Companion.AEQbTJ((FiatResponseBean) it.next()));
            }
            List<FiatResponseBean> withdrawSupportCurrencies = supportCurrenciesResponseBean.getWithdrawSupportCurrencies();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(withdrawSupportCurrencies, 10));
            Iterator<T> it2 = withdrawSupportCurrencies.iterator();
            while (it2.hasNext()) {
                arrayList2.add(FiatBean.Companion.AEQbTJ((FiatResponseBean) it2.next()));
            }
            return new SupportCurrenciesBean(arrayList, arrayList2);
        }
    }

    static {
        FiatBean$$serializer fiatBean$$serializer = FiatBean$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(fiatBean$$serializer), new ArrayListSerializer(fiatBean$$serializer)};
    }
}

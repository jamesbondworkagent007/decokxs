package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MemeCurrencyBean implements Parcelable {
    private final List<String> currencyDefaultBuyAmountList;
    private final DexMultiTokenInfoBean currencyTokenInfo;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MemeCurrencyBean> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<MemeCurrencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeCurrencyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeCurrencyBean(DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeCurrencyBean[] newArray(int i) {
            return new MemeCurrencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.MemeCurrencyBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeCurrencyBean copy$default(MemeCurrencyBean memeCurrencyBean, DexMultiTokenInfoBean dexMultiTokenInfoBean, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = memeCurrencyBean.currencyTokenInfo;
        }
        if ((i & 2) != 0) {
            list = memeCurrencyBean.currencyDefaultBuyAmountList;
        }
        return memeCurrencyBean.copy(dexMultiTokenInfoBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean component1() {
        return this.currencyTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.currencyDefaultBuyAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeCurrencyBean copy(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new MemeCurrencyBean(dexMultiTokenInfoBean, list);
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
        if (!(obj instanceof MemeCurrencyBean)) {
            return false;
        }
        MemeCurrencyBean memeCurrencyBean = (MemeCurrencyBean) obj;
        return Intrinsics.EZpvd(this.currencyTokenInfo, memeCurrencyBean.currencyTokenInfo) && Intrinsics.EZpvd(this.currencyDefaultBuyAmountList, memeCurrencyBean.currencyDefaultBuyAmountList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCurrencyDefaultBuyAmountList() {
        return this.currencyDefaultBuyAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean getCurrencyTokenInfo() {
        return this.currencyTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.currencyTokenInfo.hashCode() * 31) + this.currencyDefaultBuyAmountList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeCurrencyBean(currencyTokenInfo=" + this.currencyTokenInfo + ", currencyDefaultBuyAmountList=" + this.currencyDefaultBuyAmountList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.currencyTokenInfo.writeToParcel(parcel, i);
        parcel.writeStringList(this.currencyDefaultBuyAmountList);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MemeCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MemeCurrencyBean> serializer() {
            return MemeCurrencyBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MemeCurrencyBean(int i, DexMultiTokenInfoBean dexMultiTokenInfoBean, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MemeCurrencyBean$$serializer.INSTANCE.getDescriptor());
        }
        this.currencyTokenInfo = dexMultiTokenInfoBean;
        if ((i & 2) == 0) {
            this.currencyDefaultBuyAmountList = yDY.AhwBna();
        } else {
            this.currencyDefaultBuyAmountList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MemeCurrencyBean memeCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, DexMultiTokenInfoBean$$serializer.INSTANCE, memeCurrencyBean.currencyTokenInfo);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(memeCurrencyBean.currencyDefaultBuyAmountList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], memeCurrencyBean.currencyDefaultBuyAmountList);
    }

    public MemeCurrencyBean(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currencyTokenInfo = dexMultiTokenInfoBean;
        this.currencyDefaultBuyAmountList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r2v0 java.util.List))
 A[MD:(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.List<java.lang.String>):void (m)] (LINE:17) call: com.okinc.business.dexlogic.bean.MemeCurrencyBean.<init>(com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, java.util.List):void type: THIS */
    public /* synthetic */ MemeCurrencyBean(DexMultiTokenInfoBean dexMultiTokenInfoBean, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dexMultiTokenInfoBean, (i & 2) != 0 ? yDY.AhwBna() : list);
    }
}

package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class SimpleConfigBeanItem implements Parcelable {
    private final int chainId;
    private final List<DexMultiTokenInfoBean> tokenList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleConfigBeanItem> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(DexMultiTokenInfoBean$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<SimpleConfigBeanItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleConfigBeanItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel));
            }
            return new SimpleConfigBeanItem(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleConfigBeanItem[] newArray(int i) {
            return new SimpleConfigBeanItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleConfigBeanItem() {
        this(0, (List) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.bean.SimpleConfigBeanItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleConfigBeanItem copy$default(SimpleConfigBeanItem simpleConfigBeanItem, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simpleConfigBeanItem.chainId;
        }
        if ((i2 & 2) != 0) {
            list = simpleConfigBeanItem.tokenList;
        }
        return simpleConfigBeanItem.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> component2() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleConfigBeanItem copy(int i, @NotNull List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SimpleConfigBeanItem(i, list);
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
        if (!(obj instanceof SimpleConfigBeanItem)) {
            return false;
        }
        SimpleConfigBeanItem simpleConfigBeanItem = (SimpleConfigBeanItem) obj;
        return this.chainId == simpleConfigBeanItem.chainId && Intrinsics.EZpvd(this.tokenList, simpleConfigBeanItem.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexMultiTokenInfoBean> getTokenList() {
        return this.tokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.chainId) * 31) + this.tokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleConfigBeanItem(chainId=" + this.chainId + ", tokenList=" + this.tokenList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chainId);
        List<DexMultiTokenInfoBean> list = this.tokenList;
        parcel.writeInt(list.size());
        Iterator<DexMultiTokenInfoBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.SimpleConfigBeanItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SimpleConfigBeanItem> serializer() {
            return SimpleConfigBeanItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleConfigBeanItem(int i, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SimpleConfigBeanItem simpleConfigBeanItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || simpleConfigBeanItem.chainId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, simpleConfigBeanItem.chainId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(simpleConfigBeanItem.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], simpleConfigBeanItem.tokenList);
    }

    public SimpleConfigBeanItem(int i, @NotNull List<DexMultiTokenInfoBean> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = i;
        this.tokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0009: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:20)) : (r2v0 java.util.List))
 A[MD:(int, java.util.List<com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean>):void (m)] (LINE:18) call: com.okinc.business.dexlogic.bean.SimpleConfigBeanItem.<init>(int, java.util.List):void type: THIS */
    public /* synthetic */ SimpleConfigBeanItem(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? yDY.AhwBna() : list);
    }
}

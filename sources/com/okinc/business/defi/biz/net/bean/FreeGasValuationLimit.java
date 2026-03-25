package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class FreeGasValuationLimit implements Parcelable {
    private Long chainId;
    private String gas;
    private List<Integer> notSupportSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FreeGasValuationLimit> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<FreeGasValuationLimit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeGasValuationLimit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new FreeGasValuationLimit(lValueOf, string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FreeGasValuationLimit[] newArray(int i) {
            return new FreeGasValuationLimit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FreeGasValuationLimit() {
        this((Long) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.FreeGasValuationLimit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreeGasValuationLimit copy$default(FreeGasValuationLimit freeGasValuationLimit, Long l, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = freeGasValuationLimit.chainId;
        }
        if ((i & 2) != 0) {
            str = freeGasValuationLimit.gas;
        }
        if ((i & 4) != 0) {
            list = freeGasValuationLimit.notSupportSource;
        }
        return freeGasValuationLimit.copy(l, str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.notSupportSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FreeGasValuationLimit copy(Long l, String str, List<Integer> list) {
        return new FreeGasValuationLimit(l, str, list);
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
        if (!(obj instanceof FreeGasValuationLimit)) {
            return false;
        }
        FreeGasValuationLimit freeGasValuationLimit = (FreeGasValuationLimit) obj;
        return Intrinsics.EZpvd(this.chainId, freeGasValuationLimit.chainId) && Intrinsics.EZpvd((Object) this.gas, (Object) freeGasValuationLimit.gas) && Intrinsics.EZpvd(this.notSupportSource, freeGasValuationLimit.notSupportSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGas() {
        return this.gas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getNotSupportSource() {
        return this.notSupportSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.gas;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        List<Integer> list = this.notSupportSource;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(Long l) {
        this.chainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGas(String str) {
        this.gas = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNotSupportSource(List<Integer> list) {
        this.notSupportSource = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FreeGasValuationLimit(chainId=" + this.chainId + ", gas=" + this.gas + ", notSupportSource=" + this.notSupportSource + ")";
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
        parcel.writeString(this.gas);
        List<Integer> list = this.notSupportSource;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.FreeGasValuationLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FreeGasValuationLimit> serializer() {
            return FreeGasValuationLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreeGasValuationLimit(int i, Long l, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? -1L : l;
        if ((i & 2) == 0) {
            this.gas = "";
        } else {
            this.gas = str;
        }
        if ((i & 4) == 0) {
            this.notSupportSource = null;
        } else {
            this.notSupportSource = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(FreeGasValuationLimit freeGasValuationLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l = freeGasValuationLimit.chainId) == null || l.longValue() != -1) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, freeGasValuationLimit.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) freeGasValuationLimit.gas, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, freeGasValuationLimit.gas);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && freeGasValuationLimit.notSupportSource == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], freeGasValuationLimit.notSupportSource);
    }

    public FreeGasValuationLimit(Long l, String str, List<Integer> list) {
        this.chainId = l;
        this.gas = str;
        this.notSupportSource = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r3v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.String, java.util.List<java.lang.Integer>):void (m)] (LINE:410) call: com.okinc.business.defi.biz.net.bean.FreeGasValuationLimit.<init>(java.lang.Long, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ FreeGasValuationLimit(Long l, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : list);
    }
}

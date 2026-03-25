package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class UnitDisplayVo implements Parcelable {
    private final boolean coinToggleCcy;
    private final Map<String, MarginPerCcyVo> marginPerCcy;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnitDisplayVo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, MarginPerCcyVo$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<UnitDisplayVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnitDisplayVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), MarginPerCcyVo.CREATOR.createFromParcel(parcel));
            }
            return new UnitDisplayVo(z, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnitDisplayVo[] newArray(int i) {
            return new UnitDisplayVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnitDisplayVo() {
        this(false, (Map) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.UnitDisplayVo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnitDisplayVo copy$default(UnitDisplayVo unitDisplayVo, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = unitDisplayVo.coinToggleCcy;
        }
        if ((i & 2) != 0) {
            map = unitDisplayVo.marginPerCcy;
        }
        return unitDisplayVo.copy(z, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.coinToggleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, MarginPerCcyVo> component2() {
        return this.marginPerCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnitDisplayVo copy(boolean z, @NotNull Map<String, MarginPerCcyVo> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new UnitDisplayVo(z, map);
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
        if (!(obj instanceof UnitDisplayVo)) {
            return false;
        }
        UnitDisplayVo unitDisplayVo = (UnitDisplayVo) obj;
        return this.coinToggleCcy == unitDisplayVo.coinToggleCcy && Intrinsics.EZpvd(this.marginPerCcy, unitDisplayVo.marginPerCcy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCoinToggleCcy() {
        return this.coinToggleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, MarginPerCcyVo> getMarginPerCcy() {
        return this.marginPerCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Boolean.hashCode(this.coinToggleCcy) * 31) + this.marginPerCcy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnitDisplayVo(coinToggleCcy=" + this.coinToggleCcy + ", marginPerCcy=" + this.marginPerCcy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.coinToggleCcy ? 1 : 0);
        Map<String, MarginPerCcyVo> map = this.marginPerCcy;
        parcel.writeInt(map.size());
        for (Map.Entry<String, MarginPerCcyVo> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.UnitDisplayVo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnitDisplayVo> serializer() {
            return UnitDisplayVo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnitDisplayVo(int i, boolean z, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinToggleCcy = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.marginPerCcy = C56424yEw.KWHzl();
        } else {
            this.marginPerCcy = map;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(UnitDisplayVo unitDisplayVo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || unitDisplayVo.coinToggleCcy) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, unitDisplayVo.coinToggleCcy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd(unitDisplayVo.marginPerCcy, C56424yEw.KWHzl())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], unitDisplayVo.marginPerCcy);
    }

    public UnitDisplayVo(boolean z, @NotNull Map<String, MarginPerCcyVo> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.coinToggleCcy = z;
        this.marginPerCcy = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0009: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:165)) : (r2v0 java.util.Map))
 A[MD:(boolean, java.util.Map<java.lang.String, com.okinc.unify_trade.biz.MarginPerCcyVo>):void (m)] (LINE:163) call: com.okinc.unify_trade.biz.UnitDisplayVo.<init>(boolean, java.util.Map):void type: THIS */
    public /* synthetic */ UnitDisplayVo(boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C56424yEw.KWHzl() : map);
    }
}

package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56524yIo;
import o.InterfaceC56551yJo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotAmtData implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private ConcurrentHashMap<String, Integer> coinsMap;
    private ConcurrentHashMap<String, Integer> countMap;
    private ConcurrentHashMap<String, Integer> pinCountMap;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotAmtData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BotAmtData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAmtData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                concurrentHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            int i3 = parcel.readInt();
            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                concurrentHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            int i5 = parcel.readInt();
            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                concurrentHashMap3.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new BotAmtData(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotAmtData[] newArray(int i) {
            return new BotAmtData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotAmtData() {
        this((ConcurrentHashMap) null, (ConcurrentHashMap) null, (ConcurrentHashMap) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotAmtData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotAmtData copy$default(BotAmtData botAmtData, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = botAmtData.countMap;
        }
        if ((i & 2) != 0) {
            concurrentHashMap2 = botAmtData.pinCountMap;
        }
        if ((i & 4) != 0) {
            concurrentHashMap3 = botAmtData.coinsMap;
        }
        return botAmtData.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public static /* synthetic */ void getCoinsMap$annotations() {
    }

    public static /* synthetic */ void getCountMap$annotations() {
    }

    public static /* synthetic */ void getPinCountMap$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> component1() {
        return this.countMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> component2() {
        return this.pinCountMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> component3() {
        return this.coinsMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAmtData copy(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull ConcurrentHashMap<String, Integer> concurrentHashMap2, @NotNull ConcurrentHashMap<String, Integer> concurrentHashMap3) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        Intrinsics.checkNotNullParameter(concurrentHashMap2, "");
        Intrinsics.checkNotNullParameter(concurrentHashMap3, "");
        return new BotAmtData(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
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
        if (!(obj instanceof BotAmtData)) {
            return false;
        }
        BotAmtData botAmtData = (BotAmtData) obj;
        return Intrinsics.EZpvd(this.countMap, botAmtData.countMap) && Intrinsics.EZpvd(this.pinCountMap, botAmtData.pinCountMap) && Intrinsics.EZpvd(this.coinsMap, botAmtData.coinsMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> getCoinsMap() {
        return this.coinsMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> getCountMap() {
        return this.countMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<String, Integer> getPinCountMap() {
        return this.pinCountMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.countMap.hashCode() * 31) + this.pinCountMap.hashCode()) * 31) + this.coinsMap.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinsMap(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        this.coinsMap = concurrentHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountMap(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        this.countMap = concurrentHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPinCountMap(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        this.pinCountMap = concurrentHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAmtData(countMap=" + this.countMap + ", pinCountMap=" + this.pinCountMap + ", coinsMap=" + this.coinsMap + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.countMap;
        parcel.writeInt(concurrentHashMap.size());
        for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.pinCountMap;
        parcel.writeInt(concurrentHashMap2.size());
        for (Map.Entry<String, Integer> entry2 : concurrentHashMap2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeInt(entry2.getValue().intValue());
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap3 = this.coinsMap;
        parcel.writeInt(concurrentHashMap3.size());
        for (Map.Entry<String, Integer> entry3 : concurrentHashMap3.entrySet()) {
            parcel.writeString(entry3.getKey());
            parcel.writeInt(entry3.getValue().intValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotAmtData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotAmtData> serializer() {
            return BotAmtData$$serializer.INSTANCE;
        }
    }

    static {
        InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(ConcurrentHashMap.class);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ContextualSerializer(interfaceC56551yJoAEQbTJ, null, new KSerializer[]{stringSerializer, intSerializer}), new ContextualSerializer(C56524yIo.AEQbTJ(ConcurrentHashMap.class), null, new KSerializer[]{stringSerializer, intSerializer}), new ContextualSerializer(C56524yIo.AEQbTJ(ConcurrentHashMap.class), null, new KSerializer[]{stringSerializer, intSerializer})};
    }

    public /* synthetic */ BotAmtData(int i, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, SerializationConstructorMarker serializationConstructorMarker) {
        this.countMap = (i & 1) == 0 ? new ConcurrentHashMap() : concurrentHashMap;
        if ((i & 2) == 0) {
            this.pinCountMap = new ConcurrentHashMap<>();
        } else {
            this.pinCountMap = concurrentHashMap2;
        }
        if ((i & 4) == 0) {
            this.coinsMap = new ConcurrentHashMap<>();
        } else {
            this.coinsMap = concurrentHashMap3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [975=4] */
    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotAmtData botAmtData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(botAmtData.countMap, new ConcurrentHashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], botAmtData.countMap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(botAmtData.pinCountMap, new ConcurrentHashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], botAmtData.pinCountMap);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd(botAmtData.coinsMap, new ConcurrentHashMap())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], botAmtData.coinsMap);
    }

    public BotAmtData(@NotNull ConcurrentHashMap<String, Integer> concurrentHashMap, @NotNull ConcurrentHashMap<String, Integer> concurrentHashMap2, @NotNull ConcurrentHashMap<String, Integer> concurrentHashMap3) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "");
        Intrinsics.checkNotNullParameter(concurrentHashMap2, "");
        Intrinsics.checkNotNullParameter(concurrentHashMap3, "");
        this.countMap = concurrentHashMap;
        this.pinCountMap = concurrentHashMap2;
        this.coinsMap = concurrentHashMap3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001b: CONSTRUCTOR 
  (wrap:java.util.concurrent.ConcurrentHashMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.ConcurrentHashMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:979) call: java.util.concurrent.ConcurrentHashMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.concurrent.ConcurrentHashMap))
  (wrap:java.util.concurrent.ConcurrentHashMap:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.ConcurrentHashMap:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:980) call: java.util.concurrent.ConcurrentHashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.concurrent.ConcurrentHashMap))
  (wrap:java.util.concurrent.ConcurrentHashMap:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.concurrent.ConcurrentHashMap:0x0018: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:981) call: java.util.concurrent.ConcurrentHashMap.<init>():void type: CONSTRUCTOR) : (r3v0 java.util.concurrent.ConcurrentHashMap))
 A[MD:(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer>):void (m)] (LINE:978) call: com.okinc.unify_trade.biz.BotAmtData.<init>(java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap, java.util.concurrent.ConcurrentHashMap):void type: THIS */
    public /* synthetic */ BotAmtData(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap, (i & 2) != 0 ? new ConcurrentHashMap() : concurrentHashMap2, (i & 4) != 0 ? new ConcurrentHashMap() : concurrentHashMap3);
    }

    public final int getTotalPinCount() {
        int iIntValue = 0;
        for (Integer num : this.pinCountMap.values()) {
            Intrinsics.checkNotNullExpressionValue(num, "");
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    public final int getTotalAmt() {
        int iIntValue = 0;
        for (Integer num : this.countMap.values()) {
            Intrinsics.checkNotNullExpressionValue(num, "");
            iIntValue += num.intValue();
        }
        return iIntValue;
    }

    public final int getAmtFor(String str) {
        Integer num = this.countMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean hasBot() {
        return getTotalAmt() > 0;
    }
}

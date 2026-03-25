package com.okinc.business.trade.features.home.ui.meme.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class FeeConfig implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<FeeOption> feeOptions;
    private final List<FeeOption> limitOrderFeeOptions;
    private final String limitOrderMax;
    private final String limitOrderMin;
    private final String max;
    private final String min;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FeeConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FeeConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FeeOption.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(FeeOption.CREATOR.createFromParcel(parcel));
            }
            return new FeeConfig(arrayList, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeeConfig[] newArray(int i) {
            return new FeeConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FeeConfig() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.trade.features.home.ui.meme.data.FeeConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeeConfig copy$default(FeeConfig feeConfig, List list, List list2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feeConfig.feeOptions;
        }
        if ((i & 2) != 0) {
            list2 = feeConfig.limitOrderFeeOptions;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = feeConfig.max;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = feeConfig.min;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = feeConfig.limitOrderMax;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = feeConfig.limitOrderMin;
        }
        return feeConfig.copy(list, list3, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FeeOption> component1() {
        return this.feeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FeeOption> component2() {
        return this.limitOrderFeeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.limitOrderMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.limitOrderMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FeeConfig copy(@NotNull List<FeeOption> list, @NotNull List<FeeOption> list2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new FeeConfig(list, list2, str, str2, str3, str4);
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
        if (!(obj instanceof FeeConfig)) {
            return false;
        }
        FeeConfig feeConfig = (FeeConfig) obj;
        return Intrinsics.EZpvd(this.feeOptions, feeConfig.feeOptions) && Intrinsics.EZpvd(this.limitOrderFeeOptions, feeConfig.limitOrderFeeOptions) && Intrinsics.EZpvd((Object) this.max, (Object) feeConfig.max) && Intrinsics.EZpvd((Object) this.min, (Object) feeConfig.min) && Intrinsics.EZpvd((Object) this.limitOrderMax, (Object) feeConfig.limitOrderMax) && Intrinsics.EZpvd((Object) this.limitOrderMin, (Object) feeConfig.limitOrderMin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FeeOption> getFeeOptions() {
        return this.feeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FeeOption> getLimitOrderFeeOptions() {
        return this.limitOrderFeeOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderMax() {
        return this.limitOrderMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderMin() {
        return this.limitOrderMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMax() {
        return this.max;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMin() {
        return this.min;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.feeOptions.hashCode() * 31) + this.limitOrderFeeOptions.hashCode()) * 31) + this.max.hashCode()) * 31) + this.min.hashCode()) * 31) + this.limitOrderMax.hashCode()) * 31) + this.limitOrderMin.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FeeConfig(feeOptions=" + this.feeOptions + ", limitOrderFeeOptions=" + this.limitOrderFeeOptions + ", max=" + this.max + ", min=" + this.min + ", limitOrderMax=" + this.limitOrderMax + ", limitOrderMin=" + this.limitOrderMin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<FeeOption> list = this.feeOptions;
        parcel.writeInt(list.size());
        Iterator<FeeOption> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<FeeOption> list2 = this.limitOrderFeeOptions;
        parcel.writeInt(list2.size());
        Iterator<FeeOption> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.max);
        parcel.writeString(this.min);
        parcel.writeString(this.limitOrderMax);
        parcel.writeString(this.limitOrderMin);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.meme.data.FeeConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FeeConfig> serializer() {
            return FeeConfig$$serializer.INSTANCE;
        }
    }

    static {
        FeeOption$$serializer feeOption$$serializer = FeeOption$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(feeOption$$serializer), new ArrayListSerializer(feeOption$$serializer), null, null, null, null};
    }

    public /* synthetic */ FeeConfig(int i, List list, List list2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        this.feeOptions = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.limitOrderFeeOptions = yDY.AhwBna();
        } else {
            this.limitOrderFeeOptions = list2;
        }
        if ((i & 4) == 0) {
            this.max = "";
        } else {
            this.max = str;
        }
        if ((i & 8) == 0) {
            this.min = "";
        } else {
            this.min = str2;
        }
        if ((i & 16) == 0) {
            this.limitOrderMax = "";
        } else {
            this.limitOrderMax = str3;
        }
        if ((i & 32) == 0) {
            this.limitOrderMin = "";
        } else {
            this.limitOrderMin = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(FeeConfig feeConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(feeConfig.feeOptions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], feeConfig.feeOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(feeConfig.limitOrderFeeOptions, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], feeConfig.limitOrderFeeOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) feeConfig.max, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, feeConfig.max);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) feeConfig.min, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, feeConfig.min);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) feeConfig.limitOrderMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, feeConfig.limitOrderMax);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) feeConfig.limitOrderMin, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, feeConfig.limitOrderMin);
    }

    public FeeConfig(@NotNull List<FeeOption> list, @NotNull List<FeeOption> list2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.feeOptions = list;
        this.limitOrderFeeOptions = list2;
        this.max = str;
        this.min = str2;
        this.limitOrderMax = str3;
        this.limitOrderMin = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:74)) : (r5v0 java.util.List))
  (wrap:java.util.List:0x0010: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:75)) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
 A[MD:(java.util.List<com.okinc.business.trade.features.home.ui.meme.data.FeeOption>, java.util.List<com.okinc.business.trade.features.home.ui.meme.data.FeeOption>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:73) call: com.okinc.business.trade.features.home.ui.meme.data.FeeConfig.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FeeConfig(List list, List list2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}

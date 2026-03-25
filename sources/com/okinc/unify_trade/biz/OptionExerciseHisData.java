package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class OptionExerciseHisData implements Parcelable {
    private final List<DeliveryExerciseHisData> details;
    private final String indexPx;
    private final String instFamily;
    private final String time;
    private final String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OptionExerciseHisData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(DeliveryExerciseHisData$$serializer.INSTANCE)};

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<OptionExerciseHisData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionExerciseHisData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DeliveryExerciseHisData.CREATOR.createFromParcel(parcel));
            }
            return new OptionExerciseHisData(string, string2, string3, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionExerciseHisData[] newArray(int i) {
            return new OptionExerciseHisData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.OptionExerciseHisData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionExerciseHisData copy$default(OptionExerciseHisData optionExerciseHisData, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionExerciseHisData.time;
        }
        if ((i & 2) != 0) {
            str2 = optionExerciseHisData.uly;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = optionExerciseHisData.instFamily;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = optionExerciseHisData.indexPx;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = optionExerciseHisData.details;
        }
        return optionExerciseHisData.copy(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.indexPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeliveryExerciseHisData> component5() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionExerciseHisData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<DeliveryExerciseHisData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new OptionExerciseHisData(str, str2, str3, str4, list);
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
        if (!(obj instanceof OptionExerciseHisData)) {
            return false;
        }
        OptionExerciseHisData optionExerciseHisData = (OptionExerciseHisData) obj;
        return Intrinsics.EZpvd((Object) this.time, (Object) optionExerciseHisData.time) && Intrinsics.EZpvd((Object) this.uly, (Object) optionExerciseHisData.uly) && Intrinsics.EZpvd((Object) this.instFamily, (Object) optionExerciseHisData.instFamily) && Intrinsics.EZpvd((Object) this.indexPx, (Object) optionExerciseHisData.indexPx) && Intrinsics.EZpvd(this.details, optionExerciseHisData.details);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DeliveryExerciseHisData> getDetails() {
        return this.details;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndexPx() {
        return this.indexPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.time.hashCode() * 31) + this.uly.hashCode()) * 31) + this.instFamily.hashCode()) * 31) + this.indexPx.hashCode()) * 31) + this.details.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OptionExerciseHisData(time=" + this.time + ", uly=" + this.uly + ", instFamily=" + this.instFamily + ", indexPx=" + this.indexPx + ", details=" + this.details + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.time);
        parcel.writeString(this.uly);
        parcel.writeString(this.instFamily);
        parcel.writeString(this.indexPx);
        List<DeliveryExerciseHisData> list = this.details;
        parcel.writeInt(list.size());
        Iterator<DeliveryExerciseHisData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionExerciseHisData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionExerciseHisData> serializer() {
            return OptionExerciseHisData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OptionExerciseHisData(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16, OptionExerciseHisData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.time = "";
        } else {
            this.time = str;
        }
        if ((i & 2) == 0) {
            this.uly = "";
        } else {
            this.uly = str2;
        }
        if ((i & 4) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str3;
        }
        if ((i & 8) == 0) {
            this.indexPx = "";
        } else {
            this.indexPx = str4;
        }
        this.details = list;
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionExerciseHisData optionExerciseHisData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) optionExerciseHisData.time, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, optionExerciseHisData.time);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) optionExerciseHisData.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, optionExerciseHisData.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) optionExerciseHisData.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, optionExerciseHisData.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) optionExerciseHisData.indexPx, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, optionExerciseHisData.indexPx);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], optionExerciseHisData.details);
    }

    public OptionExerciseHisData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<DeliveryExerciseHisData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.time = str;
        this.uly = str2;
        this.instFamily = str3;
        this.indexPx = str4;
        this.details = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.util.List)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.DeliveryExerciseHisData>):void (m)] (LINE:187) call: com.okinc.unify_trade.biz.OptionExerciseHisData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ OptionExerciseHisData(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, list);
    }
}

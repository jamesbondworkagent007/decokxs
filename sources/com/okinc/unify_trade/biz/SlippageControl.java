package com.okinc.unify_trade.biz;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class SlippageControl implements Parcelable {
    private static final KSerializer<Object>[] $childSerializers;
    private final String askSlippage;
    private final String bidSlippage;
    private final List<String> closeSlippageOptions;
    private final String maxSlippage;
    private final String minSlippage;
    private final List<String> openSlippageOptions;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SlippageControl> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SlippageControl> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageControl createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SlippageControl(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageControl[] newArray(int i) {
            return new SlippageControl[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SlippageControl() {
        this((List) null, (List) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.SlippageControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SlippageControl copy$default(SlippageControl slippageControl, List list, List list2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = slippageControl.openSlippageOptions;
        }
        if ((i & 2) != 0) {
            list2 = slippageControl.closeSlippageOptions;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            str = slippageControl.minSlippage;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = slippageControl.maxSlippage;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = slippageControl.askSlippage;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = slippageControl.bidSlippage;
        }
        return slippageControl.copy(list, list3, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.openSlippageOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.closeSlippageOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.minSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.askSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.bidSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageControl copy(List<String> list, List<String> list2, String str, String str2, String str3, String str4) {
        return new SlippageControl(list, list2, str, str2, str3, str4);
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
        if (!(obj instanceof SlippageControl)) {
            return false;
        }
        SlippageControl slippageControl = (SlippageControl) obj;
        return Intrinsics.EZpvd(this.openSlippageOptions, slippageControl.openSlippageOptions) && Intrinsics.EZpvd(this.closeSlippageOptions, slippageControl.closeSlippageOptions) && Intrinsics.EZpvd((Object) this.minSlippage, (Object) slippageControl.minSlippage) && Intrinsics.EZpvd((Object) this.maxSlippage, (Object) slippageControl.maxSlippage) && Intrinsics.EZpvd((Object) this.askSlippage, (Object) slippageControl.askSlippage) && Intrinsics.EZpvd((Object) this.bidSlippage, (Object) slippageControl.bidSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskSlippage() {
        return this.askSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidSlippage() {
        return this.bidSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCloseSlippageOptions() {
        return this.closeSlippageOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippage() {
        return this.maxSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSlippage() {
        return this.minSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOpenSlippageOptions() {
        return this.openSlippageOptions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.openSlippageOptions;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<String> list2 = this.closeSlippageOptions;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        String str = this.minSlippage;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.maxSlippage;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.askSlippage;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bidSlippage;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageControl(openSlippageOptions=" + this.openSlippageOptions + ", closeSlippageOptions=" + this.closeSlippageOptions + ", minSlippage=" + this.minSlippage + ", maxSlippage=" + this.maxSlippage + ", askSlippage=" + this.askSlippage + ", bidSlippage=" + this.bidSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.openSlippageOptions);
        parcel.writeStringList(this.closeSlippageOptions);
        parcel.writeString(this.minSlippage);
        parcel.writeString(this.maxSlippage);
        parcel.writeString(this.askSlippage);
        parcel.writeString(this.bidSlippage);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SlippageControl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SlippageControl> serializer() {
            return SlippageControl$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), null, null, null, null};
    }

    public /* synthetic */ SlippageControl(int i, List list, List list2, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.openSlippageOptions = null;
        } else {
            this.openSlippageOptions = list;
        }
        if ((i & 2) == 0) {
            this.closeSlippageOptions = null;
        } else {
            this.closeSlippageOptions = list2;
        }
        if ((i & 4) == 0) {
            this.minSlippage = "";
        } else {
            this.minSlippage = str;
        }
        if ((i & 8) == 0) {
            this.maxSlippage = "";
        } else {
            this.maxSlippage = str2;
        }
        if ((i & 16) == 0) {
            this.askSlippage = "";
        } else {
            this.askSlippage = str3;
        }
        if ((i & 32) == 0) {
            this.bidSlippage = "";
        } else {
            this.bidSlippage = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SlippageControl slippageControl, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || slippageControl.openSlippageOptions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], slippageControl.openSlippageOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || slippageControl.closeSlippageOptions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], slippageControl.closeSlippageOptions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) slippageControl.minSlippage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, slippageControl.minSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) slippageControl.maxSlippage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, slippageControl.maxSlippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) slippageControl.askSlippage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, slippageControl.askSlippage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) slippageControl.bidSlippage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, slippageControl.bidSlippage);
    }

    public SlippageControl(List<String> list, List<String> list2, String str, String str2, String str3, String str4) {
        this.openSlippageOptions = list;
        this.closeSlippageOptions = list2;
        this.minSlippage = str;
        this.maxSlippage = str2;
        this.askSlippage = str3;
        this.bidSlippage = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r5v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.util.List) : (null java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:2190) call: com.okinc.unify_trade.biz.SlippageControl.<init>(java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SlippageControl(List list, List list2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) == 0 ? list2 : null, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }
}

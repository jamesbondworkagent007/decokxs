package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.FromToken$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestAACallData implements Parcelable {
    private final String data;
    private final String from;
    private List<FromToken> fromToken;
    private final boolean isErc20Approval;
    private final String minErc20ApprovalAmount;
    private final String to;
    private String type;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InvestAACallData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(FromToken$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<InvestAACallData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestAACallData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(InvestAACallData.class.getClassLoader()));
            }
            return new InvestAACallData(string, string2, string3, string4, string5, z, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestAACallData[] newArray(int i) {
            return new InvestAACallData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestAACallData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isErc20Approval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.minErc20ApprovalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FromToken> component8() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestAACallData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new InvestAACallData(str, str2, str3, str4, str5, z, str6, list);
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
        if (!(obj instanceof InvestAACallData)) {
            return false;
        }
        InvestAACallData investAACallData = (InvestAACallData) obj;
        return Intrinsics.EZpvd((Object) this.from, (Object) investAACallData.from) && Intrinsics.EZpvd((Object) this.to, (Object) investAACallData.to) && Intrinsics.EZpvd((Object) this.data, (Object) investAACallData.data) && Intrinsics.EZpvd((Object) this.value, (Object) investAACallData.value) && Intrinsics.EZpvd((Object) this.type, (Object) investAACallData.type) && this.isErc20Approval == investAACallData.isErc20Approval && Intrinsics.EZpvd((Object) this.minErc20ApprovalAmount, (Object) investAACallData.minErc20ApprovalAmount) && Intrinsics.EZpvd(this.fromToken, investAACallData.fromToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FromToken> getFromToken() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinErc20ApprovalAmount() {
        return this.minErc20ApprovalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.from.hashCode() * 31) + this.to.hashCode()) * 31) + this.data.hashCode()) * 31) + this.value.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.isErc20Approval)) * 31) + this.minErc20ApprovalAmount.hashCode()) * 31) + this.fromToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isErc20Approval() {
        return this.isErc20Approval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromToken(@NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fromToken = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestAACallData(from=" + this.from + ", to=" + this.to + ", data=" + this.data + ", value=" + this.value + ", type=" + this.type + ", isErc20Approval=" + this.isErc20Approval + ", minErc20ApprovalAmount=" + this.minErc20ApprovalAmount + ", fromToken=" + this.fromToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.from);
        parcel.writeString(this.to);
        parcel.writeString(this.data);
        parcel.writeString(this.value);
        parcel.writeString(this.type);
        parcel.writeInt(this.isErc20Approval ? 1 : 0);
        parcel.writeString(this.minErc20ApprovalAmount);
        List<FromToken> list = this.fromToken;
        parcel.writeInt(list.size());
        Iterator<FromToken> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestAACallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestAACallData> serializer() {
            return InvestAACallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestAACallData(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.from = "";
        } else {
            this.from = str;
        }
        if ((i & 2) == 0) {
            this.to = "";
        } else {
            this.to = str2;
        }
        if ((i & 4) == 0) {
            this.data = "";
        } else {
            this.data = str3;
        }
        if ((i & 8) == 0) {
            this.value = "";
        } else {
            this.value = str4;
        }
        if ((i & 16) == 0) {
            this.type = "";
        } else {
            this.type = str5;
        }
        if ((i & 32) == 0) {
            this.isErc20Approval = false;
        } else {
            this.isErc20Approval = z;
        }
        if ((i & 64) == 0) {
            this.minErc20ApprovalAmount = "";
        } else {
            this.minErc20ApprovalAmount = str6;
        }
        if ((i & 128) == 0) {
            this.fromToken = yDY.AhwBna();
        } else {
            this.fromToken = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestAACallData investAACallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) investAACallData.from, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, investAACallData.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) investAACallData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, investAACallData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investAACallData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investAACallData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investAACallData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investAACallData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investAACallData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investAACallData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investAACallData.isErc20Approval) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investAACallData.isErc20Approval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investAACallData.minErc20ApprovalAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investAACallData.minErc20ApprovalAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(investAACallData.fromToken, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], investAACallData.fromToken);
    }

    public InvestAACallData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z, @NotNull String str6, @NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.from = str;
        this.to = str2;
        this.data = str3;
        this.value = str4;
        this.type = str5;
        this.isErc20Approval = z;
        this.minErc20ApprovalAmount = str6;
        this.fromToken = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r15v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:696)) : (r17v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.business.defi.api.bean.FromToken>):void (m)] (LINE:688) call: com.okinc.business.invest_biz.data.bean.InvestAACallData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ InvestAACallData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? yDY.AhwBna() : list);
    }
}

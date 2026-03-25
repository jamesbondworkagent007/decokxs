package com.okinc.business.defi.api.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class AASubSignData implements Parcelable {
    private String data;
    private List<FromToken> fromToken;
    private boolean isErc20Approval;
    private String minErc20ApprovalAmount;
    private String to;
    private String value;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AASubSignData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(FromToken$$serializer.INSTANCE)};

    public static final class Creator implements Parcelable.Creator<AASubSignData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AASubSignData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(FromToken.CREATOR.createFromParcel(parcel));
            }
            return new AASubSignData(string, string2, string3, z, string4, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AASubSignData[] newArray(int i) {
            return new AASubSignData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AASubSignData() {
        this((String) null, (String) null, (String) null, false, (String) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.defi.api.bean.AASubSignData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AASubSignData copy$default(AASubSignData aASubSignData, String str, String str2, String str3, boolean z, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aASubSignData.to;
        }
        if ((i & 2) != 0) {
            str2 = aASubSignData.value;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = aASubSignData.data;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = aASubSignData.isErc20Approval;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = aASubSignData.minErc20ApprovalAmount;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            list = aASubSignData.fromToken;
        }
        return aASubSignData.copy(str, str5, str6, z2, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isErc20Approval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.minErc20ApprovalAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FromToken> component6() {
        return this.fromToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AASubSignData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, String str4, @NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AASubSignData(str, str2, str3, z, str4, list);
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
        if (!(obj instanceof AASubSignData)) {
            return false;
        }
        AASubSignData aASubSignData = (AASubSignData) obj;
        return Intrinsics.EZpvd((Object) this.to, (Object) aASubSignData.to) && Intrinsics.EZpvd((Object) this.value, (Object) aASubSignData.value) && Intrinsics.EZpvd((Object) this.data, (Object) aASubSignData.data) && this.isErc20Approval == aASubSignData.isErc20Approval && Intrinsics.EZpvd((Object) this.minErc20ApprovalAmount, (Object) aASubSignData.minErc20ApprovalAmount) && Intrinsics.EZpvd(this.fromToken, aASubSignData.fromToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getData() {
        return this.data;
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
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.to.hashCode();
        int iHashCode2 = this.value.hashCode();
        int iHashCode3 = this.data.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isErc20Approval);
        String str = this.minErc20ApprovalAmount;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.fromToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isErc20Approval() {
        return this.isErc20Approval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.data = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErc20Approval(boolean z) {
        this.isErc20Approval = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromToken(@NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.fromToken = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinErc20ApprovalAmount(String str) {
        this.minErc20ApprovalAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.value = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AASubSignData(to=" + this.to + ", value=" + this.value + ", data=" + this.data + ", isErc20Approval=" + this.isErc20Approval + ", minErc20ApprovalAmount=" + this.minErc20ApprovalAmount + ", fromToken=" + this.fromToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.to);
        parcel.writeString(this.value);
        parcel.writeString(this.data);
        parcel.writeInt(this.isErc20Approval ? 1 : 0);
        parcel.writeString(this.minErc20ApprovalAmount);
        List<FromToken> list = this.fromToken;
        parcel.writeInt(list.size());
        Iterator<FromToken> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.AASubSignData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AASubSignData> serializer() {
            return AASubSignData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AASubSignData(int i, String str, String str2, String str3, boolean z, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.to = "";
        } else {
            this.to = str;
        }
        if ((i & 2) == 0) {
            this.value = "";
        } else {
            this.value = str2;
        }
        if ((i & 4) == 0) {
            this.data = "";
        } else {
            this.data = str3;
        }
        if ((i & 8) == 0) {
            this.isErc20Approval = false;
        } else {
            this.isErc20Approval = z;
        }
        if ((i & 16) == 0) {
            this.minErc20ApprovalAmount = null;
        } else {
            this.minErc20ApprovalAmount = str4;
        }
        if ((i & 32) == 0) {
            this.fromToken = yDY.AhwBna();
        } else {
            this.fromToken = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(AASubSignData aASubSignData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) aASubSignData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, aASubSignData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) aASubSignData.value, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, aASubSignData.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) aASubSignData.data, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, aASubSignData.data);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || aASubSignData.isErc20Approval) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, aASubSignData.isErc20Approval);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || aASubSignData.minErc20ApprovalAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, aASubSignData.minErc20ApprovalAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(aASubSignData.fromToken, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], aASubSignData.fromToken);
    }

    public AASubSignData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, String str4, @NotNull List<FromToken> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.to = str;
        this.value = str2;
        this.data = str3;
        this.isErc20Approval = z;
        this.minErc20ApprovalAmount = str4;
        this.fromToken = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:boolean:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:java.lang.String:0x0021: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0026: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:269)) : (r10v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List<com.okinc.business.defi.api.bean.FromToken>):void (m)] (LINE:257) call: com.okinc.business.defi.api.bean.AASubSignData.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ AASubSignData(String str, String str2, String str3, boolean z, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? yDY.AhwBna() : list);
    }
}

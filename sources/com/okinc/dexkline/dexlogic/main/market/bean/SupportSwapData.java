package com.okinc.dexkline.dexlogic.main.market.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class SupportSwapData implements Parcelable {
    public static final int $stable = 0;
    private final String supportCefiMode;
    private final String supportLimitOrder;
    private final String supportMemeMode;
    private final String supportSingleChainSwap;
    private final String supportSwap;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SupportSwapData> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SupportSwapData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportSwapData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SupportSwapData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportSwapData[] newArray(int i) {
            return new SupportSwapData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportSwapData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SupportSwapData copy$default(SupportSwapData supportSwapData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportSwapData.supportSwap;
        }
        if ((i & 2) != 0) {
            str2 = supportSwapData.supportSingleChainSwap;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = supportSwapData.supportLimitOrder;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = supportSwapData.supportMemeMode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = supportSwapData.supportCefiMode;
        }
        return supportSwapData.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.supportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.supportSingleChainSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.supportLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.supportCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SupportSwapData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new SupportSwapData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof SupportSwapData)) {
            return false;
        }
        SupportSwapData supportSwapData = (SupportSwapData) obj;
        return Intrinsics.EZpvd((Object) this.supportSwap, (Object) supportSwapData.supportSwap) && Intrinsics.EZpvd((Object) this.supportSingleChainSwap, (Object) supportSwapData.supportSingleChainSwap) && Intrinsics.EZpvd((Object) this.supportLimitOrder, (Object) supportSwapData.supportLimitOrder) && Intrinsics.EZpvd((Object) this.supportMemeMode, (Object) supportSwapData.supportMemeMode) && Intrinsics.EZpvd((Object) this.supportCefiMode, (Object) supportSwapData.supportCefiMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportCefiMode() {
        return this.supportCefiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportLimitOrder() {
        return this.supportLimitOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportMemeMode() {
        return this.supportMemeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportSingleChainSwap() {
        return this.supportSingleChainSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSupportSwap() {
        return this.supportSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.supportSwap.hashCode() * 31) + this.supportSingleChainSwap.hashCode()) * 31) + this.supportLimitOrder.hashCode()) * 31) + this.supportMemeMode.hashCode()) * 31) + this.supportCefiMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SupportSwapData(supportSwap=" + this.supportSwap + ", supportSingleChainSwap=" + this.supportSingleChainSwap + ", supportLimitOrder=" + this.supportLimitOrder + ", supportMemeMode=" + this.supportMemeMode + ", supportCefiMode=" + this.supportCefiMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.supportSwap);
        parcel.writeString(this.supportSingleChainSwap);
        parcel.writeString(this.supportLimitOrder);
        parcel.writeString(this.supportMemeMode);
        parcel.writeString(this.supportCefiMode);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SupportSwapData> serializer() {
            return SupportSwapData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SupportSwapData(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.supportSwap = "1";
        } else {
            this.supportSwap = str;
        }
        if ((i & 2) == 0) {
            this.supportSingleChainSwap = "";
        } else {
            this.supportSingleChainSwap = str2;
        }
        if ((i & 4) == 0) {
            this.supportLimitOrder = "1";
        } else {
            this.supportLimitOrder = str3;
        }
        if ((i & 8) == 0) {
            this.supportMemeMode = "";
        } else {
            this.supportMemeMode = str4;
        }
        if ((i & 16) == 0) {
            this.supportCefiMode = "";
        } else {
            this.supportCefiMode = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(SupportSwapData supportSwapData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) supportSwapData.supportSwap, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, supportSwapData.supportSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) supportSwapData.supportSingleChainSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, supportSwapData.supportSingleChainSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) supportSwapData.supportLimitOrder, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, supportSwapData.supportLimitOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) supportSwapData.supportMemeMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, supportSwapData.supportMemeMode);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) supportSwapData.supportCefiMode, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, supportSwapData.supportCefiMode);
    }

    public SupportSwapData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.supportSwap = str;
        this.supportSingleChainSwap = str2;
        this.supportLimitOrder = str3;
        this.supportMemeMode = str4;
        this.supportCefiMode = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("1") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r10v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : ("1"))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:245) call: com.okinc.dexkline.dexlogic.main.market.bean.SupportSwapData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SupportSwapData(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "1" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "1", (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}

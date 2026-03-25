package com.okinc.business.market.features.position.ui;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class PositionDetailsParam implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final boolean headerComponentMode;
    private final boolean isNativeToken;
    private final boolean isSupportMemeOrder;
    private final String source;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PositionDetailsParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PositionDetailsParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionDetailsParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PositionDetailsParam(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PositionDetailsParam[] newArray(int i) {
            return new PositionDetailsParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PositionDetailsParam() {
        this((String) null, (String) null, false, (String) null, (String) null, false, (String) null, false, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isSupportMemeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.headerComponentMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PositionDetailsParam copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, boolean z2, @NotNull String str5, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PositionDetailsParam(str, str2, z, str3, str4, z2, str5, z3);
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
        if (!(obj instanceof PositionDetailsParam)) {
            return false;
        }
        PositionDetailsParam positionDetailsParam = (PositionDetailsParam) obj;
        return Intrinsics.EZpvd((Object) this.tokenAddress, (Object) positionDetailsParam.tokenAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) positionDetailsParam.chainId) && this.isNativeToken == positionDetailsParam.isNativeToken && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) positionDetailsParam.tokenSymbol) && Intrinsics.EZpvd((Object) this.source, (Object) positionDetailsParam.source) && this.isSupportMemeOrder == positionDetailsParam.isSupportMemeOrder && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) positionDetailsParam.tokenLogo) && this.headerComponentMode == positionDetailsParam.headerComponentMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHeaderComponentMode() {
        return this.headerComponentMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.tokenAddress.hashCode() * 31) + this.chainId.hashCode()) * 31) + Boolean.hashCode(this.isNativeToken)) * 31) + this.tokenSymbol.hashCode()) * 31) + this.source.hashCode()) * 31) + Boolean.hashCode(this.isSupportMemeOrder)) * 31) + this.tokenLogo.hashCode()) * 31) + Boolean.hashCode(this.headerComponentMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportMemeOrder() {
        return this.isSupportMemeOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PositionDetailsParam(tokenAddress=" + this.tokenAddress + ", chainId=" + this.chainId + ", isNativeToken=" + this.isNativeToken + ", tokenSymbol=" + this.tokenSymbol + ", source=" + this.source + ", isSupportMemeOrder=" + this.isSupportMemeOrder + ", tokenLogo=" + this.tokenLogo + ", headerComponentMode=" + this.headerComponentMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.chainId);
        parcel.writeInt(this.isNativeToken ? 1 : 0);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.source);
        parcel.writeInt(this.isSupportMemeOrder ? 1 : 0);
        parcel.writeString(this.tokenLogo);
        parcel.writeInt(this.headerComponentMode ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.position.ui.PositionDetailsParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PositionDetailsParam> serializer() {
            return PositionDetailsParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PositionDetailsParam(int i, String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.isNativeToken = false;
        } else {
            this.isNativeToken = z;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 16) == 0) {
            this.source = "";
        } else {
            this.source = str4;
        }
        if ((i & 32) == 0) {
            this.isSupportMemeOrder = false;
        } else {
            this.isSupportMemeOrder = z2;
        }
        if ((i & 64) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str5;
        }
        if ((i & 128) == 0) {
            this.headerComponentMode = false;
        } else {
            this.headerComponentMode = z3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PositionDetailsParam positionDetailsParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) positionDetailsParam.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, positionDetailsParam.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) positionDetailsParam.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, positionDetailsParam.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || positionDetailsParam.isNativeToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 2, positionDetailsParam.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) positionDetailsParam.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, positionDetailsParam.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) positionDetailsParam.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, positionDetailsParam.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || positionDetailsParam.isSupportMemeOrder) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 5, positionDetailsParam.isSupportMemeOrder);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) positionDetailsParam.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, positionDetailsParam.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || positionDetailsParam.headerComponentMode) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, positionDetailsParam.headerComponentMode);
        }
    }

    public PositionDetailsParam(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, boolean z2, @NotNull String str5, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tokenAddress = str;
        this.chainId = str2;
        this.isNativeToken = z;
        this.tokenSymbol = str3;
        this.source = str4;
        this.isSupportMemeOrder = z2;
        this.tokenLogo = str5;
        this.headerComponentMode = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0037: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.business.market.features.position.ui.PositionDetailsParam.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ PositionDetailsParam(String str, String str2, boolean z, String str3, String str4, boolean z2, String str5, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? false : z2, (i & 64) == 0 ? str5 : "", (i & 128) == 0 ? z3 : false);
    }
}

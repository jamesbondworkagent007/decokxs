package com.okinc.business.dex.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class LimitParam implements Parcelable {
    private final EditLimitOrderData editOrderData;
    private final String fromAmount;
    private String fromChainId;
    private String fromTokenContractAddress;
    private final boolean isGenericNavigation;
    private String toChainId;
    private String toTokenContractAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LimitParam> CREATOR = new Creator();
    private static final LimitParam DEFAULT = new LimitParam("", "", "", "", (String) null, (EditLimitOrderData) null, false, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
    private static final LimitParam GENERIC_NAVIGATION = new LimitParam("", "", "", "", (String) null, (EditLimitOrderData) null, true, 48, (DefaultConstructorMarker) null);

    public static final class Creator implements Parcelable.Creator<LimitParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EditLimitOrderData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitParam[] newArray(int i) {
            return new LimitParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitParam copy$default(LimitParam limitParam, String str, String str2, String str3, String str4, String str5, EditLimitOrderData editLimitOrderData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitParam.fromChainId;
        }
        if ((i & 2) != 0) {
            str2 = limitParam.fromTokenContractAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = limitParam.toChainId;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = limitParam.toTokenContractAddress;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = limitParam.fromAmount;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            editLimitOrderData = limitParam.editOrderData;
        }
        EditLimitOrderData editLimitOrderData2 = editLimitOrderData;
        if ((i & 64) != 0) {
            z = limitParam.isGenericNavigation;
        }
        return limitParam.copy(str, str6, str7, str8, str9, editLimitOrderData2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditLimitOrderData component6() {
        return this.editOrderData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isGenericNavigation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitParam copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, EditLimitOrderData editLimitOrderData, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new LimitParam(str, str2, str3, str4, str5, editLimitOrderData, z);
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
        if (!(obj instanceof LimitParam)) {
            return false;
        }
        LimitParam limitParam = (LimitParam) obj;
        return Intrinsics.EZpvd((Object) this.fromChainId, (Object) limitParam.fromChainId) && Intrinsics.EZpvd((Object) this.fromTokenContractAddress, (Object) limitParam.fromTokenContractAddress) && Intrinsics.EZpvd((Object) this.toChainId, (Object) limitParam.toChainId) && Intrinsics.EZpvd((Object) this.toTokenContractAddress, (Object) limitParam.toTokenContractAddress) && Intrinsics.EZpvd((Object) this.fromAmount, (Object) limitParam.fromAmount) && Intrinsics.EZpvd(this.editOrderData, limitParam.editOrderData) && this.isGenericNavigation == limitParam.isGenericNavigation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditLimitOrderData getEditOrderData() {
        return this.editOrderData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAmount() {
        return this.fromAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromChainId() {
        return this.fromChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenContractAddress() {
        return this.fromTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenContractAddress() {
        return this.toTokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fromChainId.hashCode();
        int iHashCode2 = this.fromTokenContractAddress.hashCode();
        int iHashCode3 = this.toChainId.hashCode();
        int iHashCode4 = this.toTokenContractAddress.hashCode();
        int iHashCode5 = this.fromAmount.hashCode();
        EditLimitOrderData editLimitOrderData = this.editOrderData;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (editLimitOrderData == null ? 0 : editLimitOrderData.hashCode())) * 31) + Boolean.hashCode(this.isGenericNavigation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isGenericNavigation() {
        return this.isGenericNavigation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitParam(fromChainId=" + this.fromChainId + ", fromTokenContractAddress=" + this.fromTokenContractAddress + ", toChainId=" + this.toChainId + ", toTokenContractAddress=" + this.toTokenContractAddress + ", fromAmount=" + this.fromAmount + ", editOrderData=" + this.editOrderData + ", isGenericNavigation=" + this.isGenericNavigation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromChainId);
        parcel.writeString(this.fromTokenContractAddress);
        parcel.writeString(this.toChainId);
        parcel.writeString(this.toTokenContractAddress);
        parcel.writeString(this.fromAmount);
        EditLimitOrderData editLimitOrderData = this.editOrderData;
        if (editLimitOrderData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            editLimitOrderData.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isGenericNavigation ? 1 : 0);
    }

    public /* synthetic */ LimitParam(int i, String str, String str2, String str3, String str4, String str5, EditLimitOrderData editLimitOrderData, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, LimitParam$$serializer.INSTANCE.getDescriptor());
        }
        this.fromChainId = str;
        this.fromTokenContractAddress = str2;
        this.toChainId = str3;
        this.toTokenContractAddress = str4;
        if ((i & 16) == 0) {
            this.fromAmount = "";
        } else {
            this.fromAmount = str5;
        }
        if ((i & 32) == 0) {
            this.editOrderData = null;
        } else {
            this.editOrderData = editLimitOrderData;
        }
        if ((i & 64) == 0) {
            this.isGenericNavigation = false;
        } else {
            this.isGenericNavigation = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_api(LimitParam limitParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, limitParam.fromChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, limitParam.fromTokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, limitParam.toChainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, limitParam.toTokenContractAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) limitParam.fromAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, limitParam.fromAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || limitParam.editOrderData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, EditLimitOrderData$$serializer.INSTANCE, limitParam.editOrderData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || limitParam.isGenericNavigation) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, limitParam.isGenericNavigation);
        }
    }

    public LimitParam(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, EditLimitOrderData editLimitOrderData, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.fromChainId = str;
        this.fromTokenContractAddress = str2;
        this.toChainId = str3;
        this.toTokenContractAddress = str4;
        this.fromAmount = str5;
        this.editOrderData = editLimitOrderData;
        this.isGenericNavigation = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.business.dex.api.bean.EditLimitOrderData:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.EditLimitOrderData) : (r15v0 com.okinc.business.dex.api.bean.EditLimitOrderData))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.EditLimitOrderData, boolean):void (m)] (LINE:295) call: com.okinc.business.dex.api.bean.LimitParam.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.api.bean.EditLimitOrderData, boolean):void type: THIS */
    public /* synthetic */ LimitParam(String str, String str2, String str3, String str4, String str5, EditLimitOrderData editLimitOrderData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : editLimitOrderData, (i & 64) != 0 ? false : z);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.api.bean.LimitParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LimitParam> serializer() {
            return LimitParam$$serializer.INSTANCE;
        }

        public final LimitParam AEQbTJ() {
            return LimitParam.DEFAULT;
        }

        public final LimitParam EZpvd() {
            return LimitParam.GENERIC_NAVIGATION;
        }
    }
}

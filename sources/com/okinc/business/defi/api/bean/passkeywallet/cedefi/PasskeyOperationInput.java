package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PasskeyOperationInput implements Parcelable {
    public static final int $stable = 0;
    private final String chainIndex;
    private final boolean enableExternal;
    private final PasskeyOperationSourceSubType passkeyOperationSourceSubType;
    private final PasskeyOperationSourceType passkeyOperationSourceType;
    private final PasskeyOperationType passkeyOperationType;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PasskeyOperationInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType", PasskeyOperationSourceType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType", PasskeyOperationSourceSubType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType", PasskeyOperationType.values()), null, null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyOperationInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyOperationInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyOperationInput(PasskeyOperationSourceType.valueOf(parcel.readString()), PasskeyOperationSourceSubType.valueOf(parcel.readString()), PasskeyOperationType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyOperationInput[] newArray(int i) {
            return new PasskeyOperationInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyOperationInput copy$default(PasskeyOperationInput passkeyOperationInput, PasskeyOperationSourceType passkeyOperationSourceType, PasskeyOperationSourceSubType passkeyOperationSourceSubType, PasskeyOperationType passkeyOperationType, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyOperationSourceType = passkeyOperationInput.passkeyOperationSourceType;
        }
        if ((i & 2) != 0) {
            passkeyOperationSourceSubType = passkeyOperationInput.passkeyOperationSourceSubType;
        }
        PasskeyOperationSourceSubType passkeyOperationSourceSubType2 = passkeyOperationSourceSubType;
        if ((i & 4) != 0) {
            passkeyOperationType = passkeyOperationInput.passkeyOperationType;
        }
        PasskeyOperationType passkeyOperationType2 = passkeyOperationType;
        if ((i & 8) != 0) {
            z = passkeyOperationInput.enableExternal;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str = passkeyOperationInput.chainIndex;
        }
        return passkeyOperationInput.copy(passkeyOperationSourceType, passkeyOperationSourceSubType2, passkeyOperationType2, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationSourceType component1() {
        return this.passkeyOperationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationSourceSubType component2() {
        return this.passkeyOperationSourceSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationType component3() {
        return this.passkeyOperationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationInput copy(@NotNull PasskeyOperationSourceType passkeyOperationSourceType, @NotNull PasskeyOperationSourceSubType passkeyOperationSourceSubType, @NotNull PasskeyOperationType passkeyOperationType, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(passkeyOperationSourceType, "");
        Intrinsics.checkNotNullParameter(passkeyOperationSourceSubType, "");
        Intrinsics.checkNotNullParameter(passkeyOperationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyOperationInput(passkeyOperationSourceType, passkeyOperationSourceSubType, passkeyOperationType, z, str);
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
        if (!(obj instanceof PasskeyOperationInput)) {
            return false;
        }
        PasskeyOperationInput passkeyOperationInput = (PasskeyOperationInput) obj;
        return this.passkeyOperationSourceType == passkeyOperationInput.passkeyOperationSourceType && this.passkeyOperationSourceSubType == passkeyOperationInput.passkeyOperationSourceSubType && this.passkeyOperationType == passkeyOperationInput.passkeyOperationType && this.enableExternal == passkeyOperationInput.enableExternal && Intrinsics.EZpvd((Object) this.chainIndex, (Object) passkeyOperationInput.chainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableExternal() {
        return this.enableExternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationSourceSubType getPasskeyOperationSourceSubType() {
        return this.passkeyOperationSourceSubType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationSourceType getPasskeyOperationSourceType() {
        return this.passkeyOperationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyOperationType getPasskeyOperationType() {
        return this.passkeyOperationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.passkeyOperationSourceType.hashCode() * 31) + this.passkeyOperationSourceSubType.hashCode()) * 31) + this.passkeyOperationType.hashCode()) * 31) + Boolean.hashCode(this.enableExternal)) * 31) + this.chainIndex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyOperationInput(passkeyOperationSourceType=" + this.passkeyOperationSourceType + ", passkeyOperationSourceSubType=" + this.passkeyOperationSourceSubType + ", passkeyOperationType=" + this.passkeyOperationType + ", enableExternal=" + this.enableExternal + ", chainIndex=" + this.chainIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.passkeyOperationSourceType.name());
        parcel.writeString(this.passkeyOperationSourceSubType.name());
        parcel.writeString(this.passkeyOperationType.name());
        parcel.writeInt(this.enableExternal ? 1 : 0);
        parcel.writeString(this.chainIndex);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyOperationInput> serializer() {
            return PasskeyOperationInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyOperationInput(int i, PasskeyOperationSourceType passkeyOperationSourceType, PasskeyOperationSourceSubType passkeyOperationSourceSubType, PasskeyOperationType passkeyOperationType, boolean z, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PasskeyOperationInput$$serializer.INSTANCE.getDescriptor());
        }
        this.passkeyOperationSourceType = passkeyOperationSourceType;
        this.passkeyOperationSourceSubType = passkeyOperationSourceSubType;
        if ((i & 4) == 0) {
            this.passkeyOperationType = PasskeyOperationType.LINK_PASSKEY;
        } else {
            this.passkeyOperationType = passkeyOperationType;
        }
        if ((i & 8) == 0) {
            this.enableExternal = true;
        } else {
            this.enableExternal = z;
        }
        if ((i & 16) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(PasskeyOperationInput passkeyOperationInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], passkeyOperationInput.passkeyOperationSourceType);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], passkeyOperationInput.passkeyOperationSourceSubType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || passkeyOperationInput.passkeyOperationType != PasskeyOperationType.LINK_PASSKEY) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], passkeyOperationInput.passkeyOperationType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !passkeyOperationInput.enableExternal) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, passkeyOperationInput.enableExternal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) passkeyOperationInput.chainIndex, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, passkeyOperationInput.chainIndex);
    }

    public PasskeyOperationInput(@NotNull PasskeyOperationSourceType passkeyOperationSourceType, @NotNull PasskeyOperationSourceSubType passkeyOperationSourceSubType, @NotNull PasskeyOperationType passkeyOperationType, boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(passkeyOperationSourceType, "");
        Intrinsics.checkNotNullParameter(passkeyOperationSourceSubType, "");
        Intrinsics.checkNotNullParameter(passkeyOperationType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.passkeyOperationSourceType = passkeyOperationSourceType;
        this.passkeyOperationSourceSubType = passkeyOperationSourceSubType;
        this.passkeyOperationType = passkeyOperationType;
        this.enableExternal = z;
        this.chainIndex = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType)
  (r8v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType)
  (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType:0x0004: SGET  A[WRAPPED] (LINE:184) com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType.LINK_PASSKEY com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType) : (r9v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType))
  (wrap:boolean:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType, boolean, java.lang.String):void (m)] (LINE:181) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationInput.<init>(com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationSourceSubType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyOperationType, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ PasskeyOperationInput(PasskeyOperationSourceType passkeyOperationSourceType, PasskeyOperationSourceSubType passkeyOperationSourceSubType, PasskeyOperationType passkeyOperationType, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyOperationSourceType, passkeyOperationSourceSubType, (i & 4) != 0 ? PasskeyOperationType.LINK_PASSKEY : passkeyOperationType, (i & 8) != 0 ? true : z, (i & 16) != 0 ? "" : str);
    }
}

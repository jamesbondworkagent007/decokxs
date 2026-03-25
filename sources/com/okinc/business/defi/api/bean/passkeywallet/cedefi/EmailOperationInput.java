package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EmailOperationInput implements Parcelable {
    private final BindEmailData bindEmailData;
    private final String chainIndex;
    private final EmailOperationSourceType emailOperationSourceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EmailOperationInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType", EmailOperationSourceType.values()), null, null};

    public static final class Creator implements Parcelable.Creator<EmailOperationInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailOperationInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EmailOperationInput(EmailOperationSourceType.valueOf(parcel.readString()), BindEmailData.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EmailOperationInput[] newArray(int i) {
            return new EmailOperationInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EmailOperationInput() {
        this((EmailOperationSourceType) null, (BindEmailData) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EmailOperationInput copy$default(EmailOperationInput emailOperationInput, EmailOperationSourceType emailOperationSourceType, BindEmailData bindEmailData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            emailOperationSourceType = emailOperationInput.emailOperationSourceType;
        }
        if ((i & 2) != 0) {
            bindEmailData = emailOperationInput.bindEmailData;
        }
        if ((i & 4) != 0) {
            str = emailOperationInput.chainIndex;
        }
        return emailOperationInput.copy(emailOperationSourceType, bindEmailData, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailOperationSourceType component1() {
        return this.emailOperationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindEmailData component2() {
        return this.bindEmailData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailOperationInput copy(@NotNull EmailOperationSourceType emailOperationSourceType, @NotNull BindEmailData bindEmailData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(emailOperationSourceType, "");
        Intrinsics.checkNotNullParameter(bindEmailData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EmailOperationInput(emailOperationSourceType, bindEmailData, str);
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
        if (!(obj instanceof EmailOperationInput)) {
            return false;
        }
        EmailOperationInput emailOperationInput = (EmailOperationInput) obj;
        return this.emailOperationSourceType == emailOperationInput.emailOperationSourceType && Intrinsics.EZpvd(this.bindEmailData, emailOperationInput.bindEmailData) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) emailOperationInput.chainIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindEmailData getBindEmailData() {
        return this.bindEmailData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EmailOperationSourceType getEmailOperationSourceType() {
        return this.emailOperationSourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.emailOperationSourceType.hashCode() * 31) + this.bindEmailData.hashCode()) * 31) + this.chainIndex.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EmailOperationInput(emailOperationSourceType=" + this.emailOperationSourceType + ", bindEmailData=" + this.bindEmailData + ", chainIndex=" + this.chainIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.emailOperationSourceType.name());
        this.bindEmailData.writeToParcel(parcel, i);
        parcel.writeString(this.chainIndex);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EmailOperationInput> serializer() {
            return EmailOperationInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmailOperationInput(int i, EmailOperationSourceType emailOperationSourceType, BindEmailData bindEmailData, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.emailOperationSourceType = (i & 1) == 0 ? EmailOperationSourceType.FROM_SIGN_TRANSACTION : emailOperationSourceType;
        if ((i & 2) == 0) {
            this.bindEmailData = new BindEmailData((String) null, false, (List) null, false, 15, (DefaultConstructorMarker) null);
        } else {
            this.bindEmailData = bindEmailData;
        }
        if ((i & 4) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(EmailOperationInput emailOperationInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || emailOperationInput.emailOperationSourceType != EmailOperationSourceType.FROM_SIGN_TRANSACTION) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], emailOperationInput.emailOperationSourceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(emailOperationInput.bindEmailData, new BindEmailData((String) null, false, (List) null, false, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, BindEmailData$$serializer.INSTANCE, emailOperationInput.bindEmailData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) emailOperationInput.chainIndex, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, emailOperationInput.chainIndex);
    }

    public EmailOperationInput(@NotNull EmailOperationSourceType emailOperationSourceType, @NotNull BindEmailData bindEmailData, @NotNull String str) {
        Intrinsics.checkNotNullParameter(emailOperationSourceType, "");
        Intrinsics.checkNotNullParameter(bindEmailData, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.emailOperationSourceType = emailOperationSourceType;
        this.bindEmailData = bindEmailData;
        this.chainIndex = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001d: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType:0x0004: SGET  A[WRAPPED] (LINE:258) com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType.FROM_SIGN_TRANSACTION com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType) : (r8v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType))
  (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData:0x0014: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  false
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:259) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData.<init>(java.lang.String, boolean, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData, java.lang.String):void (m)] (LINE:257) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationInput.<init>(com.okinc.business.defi.api.bean.passkeywallet.cedefi.EmailOperationSourceType, com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData, java.lang.String):void type: THIS */
    public /* synthetic */ EmailOperationInput(EmailOperationSourceType emailOperationSourceType, BindEmailData bindEmailData, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmailOperationSourceType.FROM_SIGN_TRANSACTION : emailOperationSourceType, (i & 2) != 0 ? new BindEmailData((String) null, false, (List) null, false, 15, (DefaultConstructorMarker) null) : bindEmailData, (i & 4) != 0 ? "" : str);
    }
}

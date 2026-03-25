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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class BindEmailData implements Parcelable {
    private final String email;
    private final List<String> emailSuffixList;
    private final boolean isValidEmail;
    private final boolean noEmail;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BindEmailData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BindEmailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindEmailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BindEmailData(parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindEmailData[] newArray(int i) {
            return new BindEmailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BindEmailData() {
        this((String) null, false, (List) null, false, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindEmailData copy$default(BindEmailData bindEmailData, String str, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bindEmailData.email;
        }
        if ((i & 2) != 0) {
            z = bindEmailData.isValidEmail;
        }
        if ((i & 4) != 0) {
            list = bindEmailData.emailSuffixList;
        }
        if ((i & 8) != 0) {
            z2 = bindEmailData.noEmail;
        }
        return bindEmailData.copy(str, z, list, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.emailSuffixList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindEmailData copy(@NotNull String str, boolean z, @NotNull List<String> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BindEmailData(str, z, list, z2);
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
        if (!(obj instanceof BindEmailData)) {
            return false;
        }
        BindEmailData bindEmailData = (BindEmailData) obj;
        return Intrinsics.EZpvd((Object) this.email, (Object) bindEmailData.email) && this.isValidEmail == bindEmailData.isValidEmail && Intrinsics.EZpvd(this.emailSuffixList, bindEmailData.emailSuffixList) && this.noEmail == bindEmailData.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEmail() {
        return this.email;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getEmailSuffixList() {
        return this.emailSuffixList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNoEmail() {
        return this.noEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.email.hashCode() * 31) + Boolean.hashCode(this.isValidEmail)) * 31) + this.emailSuffixList.hashCode()) * 31) + Boolean.hashCode(this.noEmail);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isValidEmail() {
        return this.isValidEmail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindEmailData(email=" + this.email + ", isValidEmail=" + this.isValidEmail + ", emailSuffixList=" + this.emailSuffixList + ", noEmail=" + this.noEmail + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.email);
        parcel.writeInt(this.isValidEmail ? 1 : 0);
        parcel.writeStringList(this.emailSuffixList);
        parcel.writeInt(this.noEmail ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BindEmailData> serializer() {
            return BindEmailData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BindEmailData(int i, String str, boolean z, List list, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
        this.email = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.isValidEmail = true;
        } else {
            this.isValidEmail = z;
        }
        if ((i & 4) == 0) {
            this.emailSuffixList = yDY.AhwBna();
        } else {
            this.emailSuffixList = list;
        }
        if ((i & 8) == 0) {
            this.noEmail = false;
        } else {
            this.noEmail = z2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BindEmailData bindEmailData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bindEmailData.email, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bindEmailData.email);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !bindEmailData.isValidEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, bindEmailData.isValidEmail);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(bindEmailData.emailSuffixList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], bindEmailData.emailSuffixList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || bindEmailData.noEmail) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 3, bindEmailData.noEmail);
        }
    }

    public BindEmailData(@NotNull String str, boolean z, @NotNull List<String> list, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.email = str;
        this.isValidEmail = z;
        this.emailSuffixList = list;
        this.noEmail = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:195)) : (r3v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0013: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, boolean, java.util.List<java.lang.String>, boolean):void (m)] (LINE:192) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.BindEmailData.<init>(java.lang.String, boolean, java.util.List, boolean):void type: THIS */
    public /* synthetic */ BindEmailData(String str, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? yDY.AhwBna() : list, (i & 8) != 0 ? false : z2);
    }
}

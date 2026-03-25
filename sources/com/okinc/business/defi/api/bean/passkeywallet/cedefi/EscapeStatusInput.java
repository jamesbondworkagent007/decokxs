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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class EscapeStatusInput implements Parcelable {
    private String accountId;
    private ProjectSource projectSource;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeStatusInput> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource", ProjectSource.values()), null};

    public static final class Creator implements Parcelable.Creator<EscapeStatusInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeStatusInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeStatusInput(ProjectSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeStatusInput[] newArray(int i) {
            return new EscapeStatusInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeStatusInput copy$default(EscapeStatusInput escapeStatusInput, ProjectSource projectSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            projectSource = escapeStatusInput.projectSource;
        }
        if ((i & 2) != 0) {
            str = escapeStatusInput.accountId;
        }
        return escapeStatusInput.copy(projectSource, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectSource component1() {
        return this.projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeStatusInput copy(@NotNull ProjectSource projectSource, String str) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        return new EscapeStatusInput(projectSource, str);
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
        if (!(obj instanceof EscapeStatusInput)) {
            return false;
        }
        EscapeStatusInput escapeStatusInput = (EscapeStatusInput) obj;
        return this.projectSource == escapeStatusInput.projectSource && Intrinsics.EZpvd((Object) this.accountId, (Object) escapeStatusInput.accountId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectSource getProjectSource() {
        return this.projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.projectSource.hashCode();
        String str = this.accountId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectSource(@NotNull ProjectSource projectSource) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        this.projectSource = projectSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeStatusInput(projectSource=" + this.projectSource + ", accountId=" + this.accountId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.projectSource.name());
        parcel.writeString(this.accountId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeStatusInput> serializer() {
            return EscapeStatusInput$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeStatusInput(int i, ProjectSource projectSource, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EscapeStatusInput$$serializer.INSTANCE.getDescriptor());
        }
        this.projectSource = projectSource;
        if ((i & 2) == 0) {
            this.accountId = null;
        } else {
            this.accountId = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(EscapeStatusInput escapeStatusInput, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], escapeStatusInput.projectSource);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && escapeStatusInput.accountId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, escapeStatusInput.accountId);
    }

    public EscapeStatusInput(@NotNull ProjectSource projectSource, String str) {
        Intrinsics.checkNotNullParameter(projectSource, "");
        this.projectSource = projectSource;
        this.accountId = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource, java.lang.String):void (m)] (LINE:299) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeStatusInput.<init>(com.okinc.business.defi.api.bean.passkeywallet.cedefi.ProjectSource, java.lang.String):void type: THIS */
    public /* synthetic */ EscapeStatusInput(ProjectSource projectSource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(projectSource, (i & 2) != 0 ? null : str);
    }
}

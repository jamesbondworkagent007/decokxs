package com.okinc.planet_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class DefiFeedParams implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final String contractAddress;
    private final String defaultTab;
    private final boolean needKeyStories;
    private final String token;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DefiFeedParams> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DefiFeedParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiFeedParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DefiFeedParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DefiFeedParams[] newArray(int i) {
            return new DefiFeedParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DefiFeedParams copy$default(DefiFeedParams defiFeedParams, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = defiFeedParams.token;
        }
        if ((i & 2) != 0) {
            str2 = defiFeedParams.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = defiFeedParams.contractAddress;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = defiFeedParams.defaultTab;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = defiFeedParams.needKeyStories;
        }
        return defiFeedParams.copy(str, str5, str6, str7, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.defaultTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.needKeyStories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiFeedParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DefiFeedParams(str, str2, str3, str4, z);
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
        if (!(obj instanceof DefiFeedParams)) {
            return false;
        }
        DefiFeedParams defiFeedParams = (DefiFeedParams) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) defiFeedParams.token) && Intrinsics.EZpvd((Object) this.chainId, (Object) defiFeedParams.chainId) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) defiFeedParams.contractAddress) && Intrinsics.EZpvd((Object) this.defaultTab, (Object) defiFeedParams.defaultTab) && this.needKeyStories == defiFeedParams.needKeyStories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefaultTab() {
        return this.defaultTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedKeyStories() {
        return this.needKeyStories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.token.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.contractAddress.hashCode()) * 31) + this.defaultTab.hashCode()) * 31) + Boolean.hashCode(this.needKeyStories);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DefiFeedParams(token=" + this.token + ", chainId=" + this.chainId + ", contractAddress=" + this.contractAddress + ", defaultTab=" + this.defaultTab + ", needKeyStories=" + this.needKeyStories + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.token);
        parcel.writeString(this.chainId);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.defaultTab);
        parcel.writeInt(this.needKeyStories ? 1 : 0);
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet_api.model.DefiFeedParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DefiFeedParams> serializer() {
            return DefiFeedParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DefiFeedParams(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DefiFeedParams$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.chainId = str2;
        this.contractAddress = str3;
        if ((i & 8) == 0) {
            this.defaultTab = "insights";
        } else {
            this.defaultTab = str4;
        }
        if ((i & 16) == 0) {
            this.needKeyStories = false;
        } else {
            this.needKeyStories = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_api(DefiFeedParams defiFeedParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, defiFeedParams.token);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, defiFeedParams.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, defiFeedParams.contractAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) defiFeedParams.defaultTab, (Object) "insights")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, defiFeedParams.defaultTab);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || defiFeedParams.needKeyStories) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 4, defiFeedParams.needKeyStories);
        }
    }

    public DefiFeedParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.token = str;
        this.chainId = str2;
        this.contractAddress = str3;
        this.defaultTab = str4;
        this.needKeyStories = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("insights") : (r10v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:11) call: com.okinc.planet_api.model.DefiFeedParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DefiFeedParams(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "insights" : str4, (i & 16) != 0 ? false : z);
    }
}

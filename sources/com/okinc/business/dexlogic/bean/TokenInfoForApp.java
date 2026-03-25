package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TokenInfoForApp implements Parcelable {
    public static final int $stable = 0;
    private final boolean displayToken;
    private final String isSpecialSafeMoonToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TokenInfoForApp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenInfoForApp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoForApp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenInfoForApp(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoForApp[] newArray(int i) {
            return new TokenInfoForApp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfoForApp() {
        this((String) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenInfoForApp copy$default(TokenInfoForApp tokenInfoForApp, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenInfoForApp.isSpecialSafeMoonToken;
        }
        if ((i & 2) != 0) {
            z = tokenInfoForApp.displayToken;
        }
        return tokenInfoForApp.copy(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.isSpecialSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.displayToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoForApp copy(String str, boolean z) {
        return new TokenInfoForApp(str, z);
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
        if (!(obj instanceof TokenInfoForApp)) {
            return false;
        }
        TokenInfoForApp tokenInfoForApp = (TokenInfoForApp) obj;
        return Intrinsics.EZpvd((Object) this.isSpecialSafeMoonToken, (Object) tokenInfoForApp.isSpecialSafeMoonToken) && this.displayToken == tokenInfoForApp.displayToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDisplayToken() {
        return this.displayToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.isSpecialSafeMoonToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.displayToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isSpecialSafeMoonToken() {
        return this.isSpecialSafeMoonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfoForApp(isSpecialSafeMoonToken=" + this.isSpecialSafeMoonToken + ", displayToken=" + this.displayToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.isSpecialSafeMoonToken);
        parcel.writeInt(this.displayToken ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.TokenInfoForApp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInfoForApp> serializer() {
            return TokenInfoForApp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInfoForApp(int i, String str, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.isSpecialSafeMoonToken = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.displayToken = false;
        } else {
            this.displayToken = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(TokenInfoForApp tokenInfoForApp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || tokenInfoForApp.isSpecialSafeMoonToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, tokenInfoForApp.isSpecialSafeMoonToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || tokenInfoForApp.displayToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, tokenInfoForApp.displayToken);
        }
    }

    public TokenInfoForApp(String str, boolean z) {
        this.isSpecialSafeMoonToken = str;
        this.displayToken = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(java.lang.String, boolean):void (m)] (LINE:299) call: com.okinc.business.dexlogic.bean.TokenInfoForApp.<init>(java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TokenInfoForApp(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }
}

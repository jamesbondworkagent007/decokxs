package com.okinc.business.defi.wallet.mine.walletbind.datasource;

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

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class BindCeFiDeeplinkParams implements Parcelable {
    public static final int $stable = 0;
    private final String chainIndex;
    private final Intention intention;
    private final String nonce;
    private final String sourceAppPackageName;
    private final String verifyToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BindCeFiDeeplinkParams> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.business.defi.wallet.mine.walletbind.datasource.Intention", Intention.values()), null, null, null, null};

    public static final class Creator implements Parcelable.Creator<BindCeFiDeeplinkParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindCeFiDeeplinkParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BindCeFiDeeplinkParams(Intention.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindCeFiDeeplinkParams[] newArray(int i) {
            return new BindCeFiDeeplinkParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BindCeFiDeeplinkParams copy$default(BindCeFiDeeplinkParams bindCeFiDeeplinkParams, Intention intention, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            intention = bindCeFiDeeplinkParams.intention;
        }
        if ((i & 2) != 0) {
            str = bindCeFiDeeplinkParams.nonce;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = bindCeFiDeeplinkParams.sourceAppPackageName;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = bindCeFiDeeplinkParams.chainIndex;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = bindCeFiDeeplinkParams.verifyToken;
        }
        return bindCeFiDeeplinkParams.copy(intention, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Intention component1() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sourceAppPackageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.verifyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindCeFiDeeplinkParams copy(@NotNull Intention intention, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(intention, "");
        return new BindCeFiDeeplinkParams(intention, str, str2, str3, str4);
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
        if (!(obj instanceof BindCeFiDeeplinkParams)) {
            return false;
        }
        BindCeFiDeeplinkParams bindCeFiDeeplinkParams = (BindCeFiDeeplinkParams) obj;
        return this.intention == bindCeFiDeeplinkParams.intention && Intrinsics.EZpvd((Object) this.nonce, (Object) bindCeFiDeeplinkParams.nonce) && Intrinsics.EZpvd((Object) this.sourceAppPackageName, (Object) bindCeFiDeeplinkParams.sourceAppPackageName) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) bindCeFiDeeplinkParams.chainIndex) && Intrinsics.EZpvd((Object) this.verifyToken, (Object) bindCeFiDeeplinkParams.verifyToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Intention getIntention() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceAppPackageName() {
        return this.sourceAppPackageName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerifyToken() {
        return this.verifyToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.intention.hashCode();
        String str = this.nonce;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.sourceAppPackageName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.chainIndex;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.verifyToken;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindCeFiDeeplinkParams(intention=" + this.intention + ", nonce=" + this.nonce + ", sourceAppPackageName=" + this.sourceAppPackageName + ", chainIndex=" + this.chainIndex + ", verifyToken=" + this.verifyToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.intention.writeToParcel(parcel, i);
        parcel.writeString(this.nonce);
        parcel.writeString(this.sourceAppPackageName);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.verifyToken);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.BindCeFiDeeplinkParams.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BindCeFiDeeplinkParams> serializer() {
            return BindCeFiDeeplinkParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BindCeFiDeeplinkParams(int i, Intention intention, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, BindCeFiDeeplinkParams$$serializer.INSTANCE.getDescriptor());
        }
        this.intention = intention;
        this.nonce = str;
        this.sourceAppPackageName = str2;
        this.chainIndex = str3;
        this.verifyToken = str4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BindCeFiDeeplinkParams bindCeFiDeeplinkParams, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, $childSerializers[0], bindCeFiDeeplinkParams.intention);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, bindCeFiDeeplinkParams.nonce);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, bindCeFiDeeplinkParams.sourceAppPackageName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, bindCeFiDeeplinkParams.chainIndex);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, bindCeFiDeeplinkParams.verifyToken);
    }

    public BindCeFiDeeplinkParams(@NotNull Intention intention, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(intention, "");
        this.intention = intention;
        this.nonce = str;
        this.sourceAppPackageName = str2;
        this.chainIndex = str3;
        this.verifyToken = str4;
    }
}

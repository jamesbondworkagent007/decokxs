package com.okinc.business.defi.wallet.mine.walletbind.datasource;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class GetBindingTokenResponseBody implements Parcelable {
    public static final int $stable = 0;
    private final String bindingToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GetBindingTokenResponseBody> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GetBindingTokenResponseBody> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetBindingTokenResponseBody createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetBindingTokenResponseBody(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetBindingTokenResponseBody[] newArray(int i) {
            return new GetBindingTokenResponseBody[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GetBindingTokenResponseBody() {
        this((String) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetBindingTokenResponseBody copy$default(GetBindingTokenResponseBody getBindingTokenResponseBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getBindingTokenResponseBody.bindingToken;
        }
        return getBindingTokenResponseBody.copy(str);
    }

    @SerialName("bindingToken")
    public static /* synthetic */ void getBindingToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.bindingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetBindingTokenResponseBody copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GetBindingTokenResponseBody(str);
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
        return (obj instanceof GetBindingTokenResponseBody) && Intrinsics.EZpvd((Object) this.bindingToken, (Object) ((GetBindingTokenResponseBody) obj).bindingToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBindingToken() {
        return this.bindingToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.bindingToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetBindingTokenResponseBody(bindingToken=" + this.bindingToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.bindingToken);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetBindingTokenResponseBody> serializer() {
            return GetBindingTokenResponseBody$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetBindingTokenResponseBody(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bindingToken = "";
        } else {
            this.bindingToken = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(GetBindingTokenResponseBody getBindingTokenResponseBody, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && Intrinsics.EZpvd((Object) getBindingTokenResponseBody.bindingToken, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getBindingTokenResponseBody.bindingToken);
    }

    public GetBindingTokenResponseBody(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.bindingToken = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:61) call: com.okinc.business.defi.wallet.mine.walletbind.datasource.GetBindingTokenResponseBody.<init>(java.lang.String):void type: THIS */
    public /* synthetic */ GetBindingTokenResponseBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}

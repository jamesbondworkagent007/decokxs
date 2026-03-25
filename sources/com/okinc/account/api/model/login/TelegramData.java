package com.okinc.account.api.model.login;

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

/* JADX INFO: loaded from: classes22.dex */
@Serializable
public final class TelegramData implements Parcelable {
    public static final int $stable = 0;
    private final String telegramMsg;
    private final String thirdToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TelegramData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TelegramData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TelegramData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TelegramData(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TelegramData[] newArray(int i) {
            return new TelegramData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TelegramData() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TelegramData copy$default(TelegramData telegramData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = telegramData.telegramMsg;
        }
        if ((i & 2) != 0) {
            str2 = telegramData.thirdToken;
        }
        return telegramData.copy(str, str2);
    }

    @SerialName("telegramMsg")
    public static /* synthetic */ void getTelegramMsg$annotations() {
    }

    @SerialName("thirdToken")
    public static /* synthetic */ void getThirdToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.telegramMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.thirdToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TelegramData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TelegramData(str, str2);
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
        if (!(obj instanceof TelegramData)) {
            return false;
        }
        TelegramData telegramData = (TelegramData) obj;
        return Intrinsics.EZpvd((Object) this.telegramMsg, (Object) telegramData.telegramMsg) && Intrinsics.EZpvd((Object) this.thirdToken, (Object) telegramData.thirdToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTelegramMsg() {
        return this.telegramMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getThirdToken() {
        return this.thirdToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.telegramMsg.hashCode() * 31) + this.thirdToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TelegramData(telegramMsg=" + this.telegramMsg + ", thirdToken=" + this.thirdToken + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.telegramMsg);
        parcel.writeString(this.thirdToken);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.login.TelegramData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TelegramData> serializer() {
            return TelegramData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TelegramData(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.telegramMsg = "";
        } else {
            this.telegramMsg = str;
        }
        if ((i & 2) == 0) {
            this.thirdToken = "";
        } else {
            this.thirdToken = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAccount_account_api(TelegramData telegramData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) telegramData.telegramMsg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, telegramData.telegramMsg);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) telegramData.thirdToken, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, telegramData.thirdToken);
    }

    public TelegramData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.telegramMsg = str;
        this.thirdToken = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:80) call: com.okinc.account.api.model.login.TelegramData.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TelegramData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}

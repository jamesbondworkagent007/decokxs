package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.api.client.http.HttpMethods;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public interface BindWalletDeeplinkMetadata {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Intention implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Intention[] $VALUES;
        public static final Parcelable.Creator<Intention> CREATOR;
        public static final Companion Companion;
        private final String value;
        public static final Intention EXCHANGE_MANAGEMENT = new Intention("EXCHANGE_MANAGEMENT", 0, "exchange_management");
        public static final Intention EXCHANGE_WITHDRAW = new Intention("EXCHANGE_WITHDRAW", 1, "exchange_withdraw");
        public static final Intention WALLET_MANAGEMENT = new Intention("WALLET_MANAGEMENT", 2, "wallet_management");
        public static final Intention WALLET_WITHDRAW = new Intention("WALLET_WITHDRAW", 3, "wallet_withdraw");
        public static final Intention WALLET_GENERAL = new Intention("WALLET_GENERAL", 4, "wallet_general");

        public static final class Creator implements Parcelable.Creator<Intention> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Intention createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Intention.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Intention[] newArray(int i) {
                return new Intention[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Intention[] $values() {
            return new Intention[]{EXCHANGE_MANAGEMENT, EXCHANGE_WITHDRAW, WALLET_MANAGEMENT, WALLET_WITHDRAW, WALLET_GENERAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Intention> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private Intention(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Intention[] intentionArr$values = $values();
            $VALUES = intentionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(intentionArr$values);
            Companion = new Companion(null);
            CREATOR = new Creator();
        }

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.wallet.BindWalletDeeplinkMetadata.Intention.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Intention from(String str) {
                Intention next;
                Iterator<Intention> it = Intention.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                        break;
                    }
                }
                return next;
            }
        }

        public static Intention valueOf(String str) {
            return (Intention) Enum.valueOf(Intention.class, str);
        }

        public static Intention[] values() {
            return (Intention[]) $VALUES.clone();
        }
    }

    public static final class VerifyAppParam implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<VerifyAppParam> CREATOR = new Creator();
        private final String packageName;
        private final String verifyAppToken;

        public static final class Creator implements Parcelable.Creator<VerifyAppParam> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyAppParam createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new VerifyAppParam(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifyAppParam[] newArray(int i) {
                return new VerifyAppParam[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ VerifyAppParam copy$default(VerifyAppParam verifyAppParam, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifyAppParam.packageName;
            }
            if ((i & 2) != 0) {
                str2 = verifyAppParam.verifyAppToken;
            }
            return verifyAppParam.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.packageName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.verifyAppToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VerifyAppParam copy(String str, String str2) {
            return new VerifyAppParam(str, str2);
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
            if (!(obj instanceof VerifyAppParam)) {
                return false;
            }
            VerifyAppParam verifyAppParam = (VerifyAppParam) obj;
            return Intrinsics.EZpvd((Object) this.packageName, (Object) verifyAppParam.packageName) && Intrinsics.EZpvd((Object) this.verifyAppToken, (Object) verifyAppParam.verifyAppToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPackageName() {
            return this.packageName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVerifyAppToken() {
            return this.verifyAppToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.packageName;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.verifyAppToken;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "VerifyAppParam(packageName=" + this.packageName + ", verifyAppToken=" + this.verifyAppToken + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.packageName);
            parcel.writeString(this.verifyAppToken);
        }

        public VerifyAppParam(String str, String str2) {
            this.packageName = str;
            this.verifyAppToken = str2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Result implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Result[] $VALUES;
        public static final Parcelable.Creator<Result> CREATOR;
        private final String value;
        public static final Result SUCCESS = new Result("SUCCESS", 0, "success");
        public static final Result RETRY = new Result("RETRY", 1, "retry");
        public static final Result CANCEL = new Result("CANCEL", 2, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);

        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Result.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Result[] $values() {
            return new Result[]{SUCCESS, RETRY, CANCEL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Result> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private Result(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            Result[] resultArr$values = $values();
            $VALUES = resultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(resultArr$values);
            CREATOR = new Creator();
        }

        public static Result valueOf(String str) {
            return (Result) Enum.valueOf(Result.class, str);
        }

        public static Result[] values() {
            return (Result[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Entry implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Entry[] $VALUES;
        public static final Parcelable.Creator<Entry> CREATOR;
        public static final Entry CONFIRM = new Entry("CONFIRM", 0);
        public static final Entry CONNECT = new Entry(HttpMethods.CONNECT, 1);
        public static final Entry GUIDANCE = new Entry("GUIDANCE", 2);

        public static final class Creator implements Parcelable.Creator<Entry> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Entry createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return Entry.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Entry[] newArray(int i) {
                return new Entry[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Entry[] $values() {
            return new Entry[]{CONFIRM, CONNECT, GUIDANCE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Entry> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private Entry(String str, int i) {
        }

        static {
            Entry[] entryArr$values = $values();
            $VALUES = entryArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(entryArr$values);
            CREATOR = new Creator();
        }

        public static Entry valueOf(String str) {
            return (Entry) Enum.valueOf(Entry.class, str);
        }

        public static Entry[] values() {
            return (Entry[]) $VALUES.clone();
        }
    }

    public interface Data extends Parcelable {

        public static final class Token implements Data {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Token> CREATOR = new Creator();
            private final String value;

            public static final class Creator implements Parcelable.Creator<Token> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Token createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Token(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Token[] newArray(int i) {
                    return new Token[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Token copy$default(Token token, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = token.value;
                }
                return token.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Token copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Token(str);
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
                return (obj instanceof Token) && Intrinsics.EZpvd((Object) this.value, (Object) ((Token) obj).value);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.value.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Token(value=" + this.value + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.value);
            }

            public Token(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.value = str;
            }
        }

        public static final class Encrypted implements Data {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Encrypted> CREATOR = new Creator();
            private final String value;

            public static final class Creator implements Parcelable.Creator<Encrypted> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Encrypted createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Encrypted(parcel.readString());
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Encrypted[] newArray(int i) {
                    return new Encrypted[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Encrypted copy$default(Encrypted encrypted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = encrypted.value;
                }
                return encrypted.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Encrypted copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Encrypted(str);
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
                return (obj instanceof Encrypted) && Intrinsics.EZpvd((Object) this.value, (Object) ((Encrypted) obj).value);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getValue() {
                return this.value;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.value.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Encrypted(value=" + this.value + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.value);
            }

            public Encrypted(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.value = str;
            }
        }
    }

    public static final class Details implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Details> CREATOR = new Creator();
        private final Integer addressType;
        private final Long chainIndex;
        private final String nonce;
        private final String signature;
        private final WalletAccount walletAccount;

        public static final class Creator implements Parcelable.Creator<Details> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Details createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Details(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), WalletAccount.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Details[] newArray(int i) {
                return new Details[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Details copy$default(Details details, String str, String str2, Long l, Integer num, WalletAccount walletAccount, int i, Object obj) {
            if ((i & 1) != 0) {
                str = details.nonce;
            }
            if ((i & 2) != 0) {
                str2 = details.signature;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                l = details.chainIndex;
            }
            Long l2 = l;
            if ((i & 8) != 0) {
                num = details.addressType;
            }
            Integer num2 = num;
            if ((i & 16) != 0) {
                walletAccount = details.walletAccount;
            }
            return details.copy(str, str3, l2, num2, walletAccount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component4() {
            return this.addressType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletAccount component5() {
            return this.walletAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Details copy(String str, String str2, Long l, Integer num, @NotNull WalletAccount walletAccount) {
            Intrinsics.checkNotNullParameter(walletAccount, "");
            return new Details(str, str2, l, num, walletAccount);
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
            if (!(obj instanceof Details)) {
                return false;
            }
            Details details = (Details) obj;
            return Intrinsics.EZpvd((Object) this.nonce, (Object) details.nonce) && Intrinsics.EZpvd((Object) this.signature, (Object) details.signature) && Intrinsics.EZpvd(this.chainIndex, details.chainIndex) && Intrinsics.EZpvd(this.addressType, details.addressType) && Intrinsics.EZpvd(this.walletAccount, details.walletAccount);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getAddressType() {
            return this.addressType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainIndex() {
            return this.chainIndex;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getNonce() {
            return this.nonce;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSignature() {
            return this.signature;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WalletAccount getWalletAccount() {
            return this.walletAccount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.nonce;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.signature;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Long l = this.chainIndex;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            Integer num = this.addressType;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.walletAccount.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Details(nonce=" + this.nonce + ", signature=" + this.signature + ", chainIndex=" + this.chainIndex + ", addressType=" + this.addressType + ", walletAccount=" + this.walletAccount + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.nonce);
            parcel.writeString(this.signature);
            Long l = this.chainIndex;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            Integer num = this.addressType;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            this.walletAccount.writeToParcel(parcel, i);
        }

        public Details(String str, String str2, Long l, Integer num, @NotNull WalletAccount walletAccount) {
            Intrinsics.checkNotNullParameter(walletAccount, "");
            this.nonce = str;
            this.signature = str2;
            this.chainIndex = l;
            this.addressType = num;
            this.walletAccount = walletAccount;
        }
    }
}

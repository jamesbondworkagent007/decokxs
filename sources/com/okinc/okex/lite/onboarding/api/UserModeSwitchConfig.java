package com.okinc.okex.lite.onboarding.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class UserModeSwitchConfig implements Parcelable {
    private TradingModeSwitchRemoteBean liteTradingMode;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UserModeSwitchConfig> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.okinc.okex.lite.onboarding.api.TradingModeSwitchRemoteBean", TradingModeSwitchRemoteBean.values())};

    public static final class Creator implements Parcelable.Creator<UserModeSwitchConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserModeSwitchConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UserModeSwitchConfig(TradingModeSwitchRemoteBean.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserModeSwitchConfig[] newArray(int i) {
            return new UserModeSwitchConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserModeSwitchConfig copy$default(UserModeSwitchConfig userModeSwitchConfig, TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean, int i, Object obj) {
        if ((i & 1) != 0) {
            tradingModeSwitchRemoteBean = userModeSwitchConfig.liteTradingMode;
        }
        return userModeSwitchConfig.copy(tradingModeSwitchRemoteBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeSwitchRemoteBean component1() {
        return this.liteTradingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserModeSwitchConfig copy(@NotNull TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean) {
        Intrinsics.checkNotNullParameter(tradingModeSwitchRemoteBean, "");
        return new UserModeSwitchConfig(tradingModeSwitchRemoteBean);
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
        return (obj instanceof UserModeSwitchConfig) && this.liteTradingMode == ((UserModeSwitchConfig) obj).liteTradingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradingModeSwitchRemoteBean getLiteTradingMode() {
        return this.liteTradingMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.liteTradingMode.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiteTradingMode(@NotNull TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean) {
        Intrinsics.checkNotNullParameter(tradingModeSwitchRemoteBean, "");
        this.liteTradingMode = tradingModeSwitchRemoteBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserModeSwitchConfig(liteTradingMode=" + this.liteTradingMode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.liteTradingMode.name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.onboarding.api.UserModeSwitchConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserModeSwitchConfig> serializer() {
            return UserModeSwitchConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserModeSwitchConfig(int i, TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UserModeSwitchConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.liteTradingMode = tradingModeSwitchRemoteBean;
    }

    public UserModeSwitchConfig(@NotNull TradingModeSwitchRemoteBean tradingModeSwitchRemoteBean) {
        Intrinsics.checkNotNullParameter(tradingModeSwitchRemoteBean, "");
        this.liteTradingMode = tradingModeSwitchRemoteBean;
    }
}

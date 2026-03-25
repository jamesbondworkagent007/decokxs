package com.okinc.unify_trade.dex.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class OKTDexCacheConfig implements Parcelable {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.dex.biz.OKTDexCacheConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ OKTDexCacheConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OKTDexCacheConfig() {
    }

    public static final class DefaultDexCacheConfig extends OKTDexCacheConfig {
        public static final DefaultDexCacheConfig KWHzl = new DefaultDexCacheConfig();
        public static final Parcelable.Creator<DefaultDexCacheConfig> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DefaultDexCacheConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DefaultDexCacheConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return DefaultDexCacheConfig.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DefaultDexCacheConfig[] newArray(int i) {
                return new DefaultDexCacheConfig[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private DefaultDexCacheConfig() {
            super(null);
        }
    }

    public static final class CustomArgsDexCacheConfig extends OKTDexCacheConfig {
        public static final Parcelable.Creator<CustomArgsDexCacheConfig> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<CustomArgsDexCacheConfig> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomArgsDexCacheConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CustomArgsDexCacheConfig(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomArgsDexCacheConfig[] newArray(int i) {
                return new CustomArgsDexCacheConfig[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CustomArgsDexCacheConfig copy$default(CustomArgsDexCacheConfig customArgsDexCacheConfig, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customArgsDexCacheConfig.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = customArgsDexCacheConfig.AEQbTJ;
            }
            return customArgsDexCacheConfig.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomArgsDexCacheConfig EZpvd(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new CustomArgsDexCacheConfig(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
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
            if (!(obj instanceof CustomArgsDexCacheConfig)) {
                return false;
            }
            CustomArgsDexCacheConfig customArgsDexCacheConfig = (CustomArgsDexCacheConfig) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) customArgsDexCacheConfig.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) customArgsDexCacheConfig.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CustomArgsDexCacheConfig(chainId=" + this.OLrzqt + ", tokenCA=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomArgsDexCacheConfig(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }
    }
}

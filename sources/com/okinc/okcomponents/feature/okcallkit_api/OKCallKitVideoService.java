package com.okinc.okcomponents.feature.okcallkit_api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface OKCallKitVideoService extends InterfaceC43217rlC {

    public static abstract class TranslationMode {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.okcallkit_api.OKCallKitVideoService.TranslationMode.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TranslationMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TranslationMode() {
        }

        public static final class Disabled extends TranslationMode implements Parcelable {
            public static final Disabled AEQbTJ = new Disabled();
            public static final Parcelable.Creator<Disabled> CREATOR = new Creator();

            public static final class Creator implements Parcelable.Creator<Disabled> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    parcel.readInt();
                    return Disabled.AEQbTJ;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disabled[] newArray(int i) {
                    return new Disabled[i];
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

            private Disabled() {
                super(null);
            }
        }

        public static final class Enabled extends TranslationMode implements Parcelable {
            public static final Parcelable.Creator<Enabled> CREATOR = new Creator();
            public final TranslationLanguage EZpvd;
            public final TranslationLanguage copydefault;

            public static final class Creator implements Parcelable.Creator<Enabled> {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "");
                    return new Enabled(TranslationLanguage.valueOf(parcel.readString()), TranslationLanguage.valueOf(parcel.readString()));
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i) {
                    return new Enabled[i];
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Enabled copy$default(Enabled enabled, TranslationLanguage translationLanguage, TranslationLanguage translationLanguage2, int i, Object obj) {
                if ((i & 1) != 0) {
                    translationLanguage = enabled.EZpvd;
                }
                if ((i & 2) != 0) {
                    translationLanguage2 = enabled.copydefault;
                }
                return enabled.KWHzl(translationLanguage, translationLanguage2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Enabled KWHzl(@NotNull TranslationLanguage translationLanguage, @NotNull TranslationLanguage translationLanguage2) {
                Intrinsics.checkNotNullParameter(translationLanguage, "");
                Intrinsics.checkNotNullParameter(translationLanguage2, "");
                return new Enabled(translationLanguage, translationLanguage2);
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
                if (!(obj instanceof Enabled)) {
                    return false;
                }
                Enabled enabled = (Enabled) obj;
                return this.EZpvd == enabled.EZpvd && this.copydefault == enabled.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.EZpvd.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Enabled(translateFrom=" + this.EZpvd + ", translateTo=" + this.copydefault + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.os.Parcelable
            public final void writeToParcel(@NotNull Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.writeString(this.EZpvd.name());
                parcel.writeString(this.copydefault.name());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Enabled(@NotNull TranslationLanguage translationLanguage, @NotNull TranslationLanguage translationLanguage2) {
                super(null);
                Intrinsics.checkNotNullParameter(translationLanguage, "");
                Intrinsics.checkNotNullParameter(translationLanguage2, "");
                this.EZpvd = translationLanguage;
                this.copydefault = translationLanguage2;
            }
        }
    }
}

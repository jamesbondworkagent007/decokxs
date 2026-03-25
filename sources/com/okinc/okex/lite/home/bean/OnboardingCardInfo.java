package com.okinc.okex.lite.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OnboardingCardInfo implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("darkIcon")
    private final String darkIcon;

    @SerializedName("label")
    private final String label;

    @SerializedName("lightIcon")
    private final String lightIcon;

    @SerializedName("name")
    private final String name;

    @SerializedName("subtitle")
    private final String subtitle;

    @SerializedName("title")
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OnboardingCardInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OnboardingCardInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingCardInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnboardingCardInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingCardInfo[] newArray(int i) {
            return new OnboardingCardInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnboardingCardInfo copy$default(OnboardingCardInfo onboardingCardInfo, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingCardInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = onboardingCardInfo.subtitle;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onboardingCardInfo.title;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onboardingCardInfo.label;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onboardingCardInfo.darkIcon;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onboardingCardInfo.lightIcon;
        }
        return onboardingCardInfo.KWHzl(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingCardInfo KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OnboardingCardInfo(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof OnboardingCardInfo)) {
            return false;
        }
        OnboardingCardInfo onboardingCardInfo = (OnboardingCardInfo) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) onboardingCardInfo.name) && Intrinsics.EZpvd((Object) this.subtitle, (Object) onboardingCardInfo.subtitle) && Intrinsics.EZpvd((Object) this.title, (Object) onboardingCardInfo.title) && Intrinsics.EZpvd((Object) this.label, (Object) onboardingCardInfo.label) && Intrinsics.EZpvd((Object) this.darkIcon, (Object) onboardingCardInfo.darkIcon) && Intrinsics.EZpvd((Object) this.lightIcon, (Object) onboardingCardInfo.lightIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.title.hashCode()) * 31) + this.label.hashCode()) * 31) + this.darkIcon.hashCode()) * 31) + this.lightIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingCardInfo(name=" + this.name + ", subtitle=" + this.subtitle + ", title=" + this.title + ", label=" + this.label + ", darkIcon=" + this.darkIcon + ", lightIcon=" + this.lightIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.title);
        parcel.writeString(this.label);
        parcel.writeString(this.darkIcon);
        parcel.writeString(this.lightIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingCardInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingCardInfo> serializer() {
            return OnboardingCardInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingCardInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, OnboardingCardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.name = str;
        this.subtitle = str2;
        this.title = str3;
        this.label = str4;
        this.darkIcon = str5;
        this.lightIcon = str6;
    }

    public static final /* synthetic */ void AEQbTJ(OnboardingCardInfo onboardingCardInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingCardInfo.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onboardingCardInfo.subtitle);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onboardingCardInfo.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, onboardingCardInfo.label);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onboardingCardInfo.darkIcon);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, onboardingCardInfo.lightIcon);
    }

    public OnboardingCardInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.subtitle = str2;
        this.title = str3;
        this.label = str4;
        this.darkIcon = str5;
        this.lightIcon = str6;
    }
}

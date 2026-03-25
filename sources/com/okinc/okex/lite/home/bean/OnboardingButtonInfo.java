package com.okinc.okex.lite.home.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
public final class OnboardingButtonInfo implements Parcelable {
    public static final int $stable = 0;

    @SerializedName("actionType")
    private final int actionType;

    @SerializedName("href")
    private final String href;

    @SerializedName(TtmlNode.TAG_STYLE)
    private final String style;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackingEvent")
    private final String trackingEvent;

    @SerializedName("trackingName")
    private final String trackingName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<OnboardingButtonInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OnboardingButtonInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingButtonInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OnboardingButtonInfo(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OnboardingButtonInfo[] newArray(int i) {
            return new OnboardingButtonInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnboardingButtonInfo copy$default(OnboardingButtonInfo onboardingButtonInfo, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = onboardingButtonInfo.title;
        }
        if ((i2 & 2) != 0) {
            i = onboardingButtonInfo.actionType;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = onboardingButtonInfo.href;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = onboardingButtonInfo.trackingName;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = onboardingButtonInfo.style;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = onboardingButtonInfo.trackingEvent;
        }
        return onboardingButtonInfo.copydefault(str, i3, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return this.actionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.trackingEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnboardingButtonInfo copydefault(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OnboardingButtonInfo(str, i, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.trackingName;
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
        if (!(obj instanceof OnboardingButtonInfo)) {
            return false;
        }
        OnboardingButtonInfo onboardingButtonInfo = (OnboardingButtonInfo) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) onboardingButtonInfo.title) && this.actionType == onboardingButtonInfo.actionType && Intrinsics.EZpvd((Object) this.href, (Object) onboardingButtonInfo.href) && Intrinsics.EZpvd((Object) this.trackingName, (Object) onboardingButtonInfo.trackingName) && Intrinsics.EZpvd((Object) this.style, (Object) onboardingButtonInfo.style) && Intrinsics.EZpvd((Object) this.trackingEvent, (Object) onboardingButtonInfo.trackingEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + Integer.hashCode(this.actionType)) * 31) + this.href.hashCode()) * 31) + this.trackingName.hashCode()) * 31) + this.style.hashCode()) * 31) + this.trackingEvent.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnboardingButtonInfo(title=" + this.title + ", actionType=" + this.actionType + ", href=" + this.href + ", trackingName=" + this.trackingName + ", style=" + this.style + ", trackingEvent=" + this.trackingEvent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeInt(this.actionType);
        parcel.writeString(this.href);
        parcel.writeString(this.trackingName);
        parcel.writeString(this.style);
        parcel.writeString(this.trackingEvent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.OnboardingButtonInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnboardingButtonInfo> serializer() {
            return OnboardingButtonInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingButtonInfo(int i, String str, int i2, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, OnboardingButtonInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.actionType = i2;
        this.href = str2;
        this.trackingName = str3;
        this.style = str4;
        this.trackingEvent = str5;
    }

    public static final /* synthetic */ void KWHzl(OnboardingButtonInfo onboardingButtonInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onboardingButtonInfo.title);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, onboardingButtonInfo.actionType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onboardingButtonInfo.href);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, onboardingButtonInfo.trackingName);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, onboardingButtonInfo.style);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, onboardingButtonInfo.trackingEvent);
    }

    public OnboardingButtonInfo(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.title = str;
        this.actionType = i;
        this.href = str2;
        this.trackingName = str3;
        this.style = str4;
        this.trackingEvent = str5;
    }
}

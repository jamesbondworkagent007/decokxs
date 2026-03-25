package com.okinc.okex.lite.home.bean;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class RewardBottomSheet {

    @SerializedName("button")
    private final OnboardingButton button;

    @SerializedName("darkImage")
    private final String darkImage;

    @SerializedName("id")
    private final String id;

    @SerializedName("lightImage")
    private final String lightImage;

    @SerializedName("rewardText")
    private final String rewardText;

    @SerializedName("rewardTitle")
    private final String rewardTitle;

    @SerializedName("text")
    private final String text;

    @SerializedName("title")
    private final String title;

    @SerializedName("trackings")
    private final List<TrackingEvent> trackings;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, new ArrayListSerializer(TrackingEvent$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardBottomSheet KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull OnboardingButton onboardingButton, @NotNull List<TrackingEvent> list, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(onboardingButton, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new RewardBottomSheet(str, str2, str3, str4, str5, onboardingButton, list, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardBottomSheet)) {
            return false;
        }
        RewardBottomSheet rewardBottomSheet = (RewardBottomSheet) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) rewardBottomSheet.id) && Intrinsics.EZpvd((Object) this.title, (Object) rewardBottomSheet.title) && Intrinsics.EZpvd((Object) this.text, (Object) rewardBottomSheet.text) && Intrinsics.EZpvd((Object) this.rewardTitle, (Object) rewardBottomSheet.rewardTitle) && Intrinsics.EZpvd((Object) this.rewardText, (Object) rewardBottomSheet.rewardText) && Intrinsics.EZpvd(this.button, rewardBottomSheet.button) && Intrinsics.EZpvd(this.trackings, rewardBottomSheet.trackings) && Intrinsics.EZpvd((Object) this.lightImage, (Object) rewardBottomSheet.lightImage) && Intrinsics.EZpvd((Object) this.darkImage, (Object) rewardBottomSheet.darkImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.text.hashCode();
        String str = this.rewardTitle;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.rewardText;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        int iHashCode6 = this.button.hashCode();
        int iHashCode7 = this.trackings.hashCode();
        String str3 = this.lightImage;
        int iHashCode8 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.darkImage;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RewardBottomSheet(id=" + this.id + ", title=" + this.title + ", text=" + this.text + ", rewardTitle=" + this.rewardTitle + ", rewardText=" + this.rewardText + ", button=" + this.button + ", trackings=" + this.trackings + ", lightImage=" + this.lightImage + ", darkImage=" + this.darkImage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.home.bean.RewardBottomSheet.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RewardBottomSheet> serializer() {
            return RewardBottomSheet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardBottomSheet(int i, String str, String str2, String str3, String str4, String str5, OnboardingButton onboardingButton, List list, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (103 != (i & 103)) {
            PluginExceptionsKt.throwMissingFieldException(i, 103, RewardBottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.text = str3;
        if ((i & 8) == 0) {
            this.rewardTitle = null;
        } else {
            this.rewardTitle = str4;
        }
        if ((i & 16) == 0) {
            this.rewardText = null;
        } else {
            this.rewardText = str5;
        }
        this.button = onboardingButton;
        this.trackings = list;
        if ((i & 128) == 0) {
            this.lightImage = null;
        } else {
            this.lightImage = str6;
        }
        if ((i & 256) == 0) {
            this.darkImage = null;
        } else {
            this.darkImage = str7;
        }
    }

    public static final /* synthetic */ void OLrzqt(RewardBottomSheet rewardBottomSheet, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, rewardBottomSheet.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, rewardBottomSheet.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, rewardBottomSheet.text);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rewardBottomSheet.rewardTitle != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, rewardBottomSheet.rewardTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || rewardBottomSheet.rewardText != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, rewardBottomSheet.rewardText);
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, OnboardingButton$$serializer.INSTANCE, rewardBottomSheet.button);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], rewardBottomSheet.trackings);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rewardBottomSheet.lightImage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, rewardBottomSheet.lightImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && rewardBottomSheet.darkImage == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, rewardBottomSheet.darkImage);
    }

    public RewardBottomSheet(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull OnboardingButton onboardingButton, @NotNull List<TrackingEvent> list, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(onboardingButton, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.title = str2;
        this.text = str3;
        this.rewardTitle = str4;
        this.rewardText = str5;
        this.button = onboardingButton;
        this.trackings = list;
        this.lightImage = str6;
        this.darkImage = str7;
    }
}

package com.okinc.business.invest_biz.data.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class LearnCardItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final BackgroundImage backgroundImage;
    public final String cardTitle;
    public final String copyWriting;
    public final BackgroundImage popUpBackgroundImage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LearnCardItem() {
        this((String) null, (String) null, (BackgroundImage) null, (BackgroundImage) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LearnCardItem copy$default(LearnCardItem learnCardItem, String str, String str2, BackgroundImage backgroundImage, BackgroundImage backgroundImage2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = learnCardItem.cardTitle;
        }
        if ((i & 2) != 0) {
            str2 = learnCardItem.copyWriting;
        }
        if ((i & 4) != 0) {
            backgroundImage = learnCardItem.backgroundImage;
        }
        if ((i & 8) != 0) {
            backgroundImage2 = learnCardItem.popUpBackgroundImage;
        }
        return learnCardItem.AEQbTJ(str, str2, backgroundImage, backgroundImage2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LearnCardItem AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull BackgroundImage backgroundImage, @NotNull BackgroundImage backgroundImage2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(backgroundImage2, "");
        return new LearnCardItem(str, str2, backgroundImage, backgroundImage2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copyWriting;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage KWHzl() {
        return this.popUpBackgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BackgroundImage OLrzqt() {
        return this.backgroundImage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.cardTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnCardItem)) {
            return false;
        }
        LearnCardItem learnCardItem = (LearnCardItem) obj;
        return Intrinsics.EZpvd((Object) this.cardTitle, (Object) learnCardItem.cardTitle) && Intrinsics.EZpvd((Object) this.copyWriting, (Object) learnCardItem.copyWriting) && Intrinsics.EZpvd(this.backgroundImage, learnCardItem.backgroundImage) && Intrinsics.EZpvd(this.popUpBackgroundImage, learnCardItem.popUpBackgroundImage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.cardTitle.hashCode() * 31) + this.copyWriting.hashCode()) * 31) + this.backgroundImage.hashCode()) * 31) + this.popUpBackgroundImage.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LearnCardItem(cardTitle=" + this.cardTitle + ", copyWriting=" + this.copyWriting + ", backgroundImage=" + this.backgroundImage + ", popUpBackgroundImage=" + this.popUpBackgroundImage + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.LearnCardItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LearnCardItem> serializer() {
            return LearnCardItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LearnCardItem(int i, String str, String str2, BackgroundImage backgroundImage, BackgroundImage backgroundImage2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cardTitle = "";
        } else {
            this.cardTitle = str;
        }
        if ((i & 2) == 0) {
            this.copyWriting = "";
        } else {
            this.copyWriting = str2;
        }
        int i2 = 3;
        String str3 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if ((i & 4) == 0) {
            this.backgroundImage = new BackgroundImage(str3, (String) (b5 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b4 == true ? 1 : 0));
        } else {
            this.backgroundImage = backgroundImage;
        }
        if ((i & 8) == 0) {
            this.popUpBackgroundImage = new BackgroundImage((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i2, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            this.popUpBackgroundImage = backgroundImage2;
        }
    }

    public static final /* synthetic */ void KWHzl(LearnCardItem learnCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) learnCardItem.cardTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, learnCardItem.cardTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) learnCardItem.copyWriting, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, learnCardItem.copyWriting);
        }
        int i = 3;
        String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(learnCardItem.backgroundImage, new BackgroundImage(str, (String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BackgroundImage$$serializer.INSTANCE, learnCardItem.backgroundImage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(learnCardItem.popUpBackgroundImage, new BackgroundImage((String) (b3 == true ? 1 : 0), (String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0)))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, BackgroundImage$$serializer.INSTANCE, learnCardItem.popUpBackgroundImage);
    }

    public LearnCardItem(@NotNull String str, @NotNull String str2, @NotNull BackgroundImage backgroundImage, @NotNull BackgroundImage backgroundImage2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(backgroundImage, "");
        Intrinsics.checkNotNullParameter(backgroundImage2, "");
        this.cardTitle = str;
        this.copyWriting = str2;
        this.backgroundImage = backgroundImage;
        this.popUpBackgroundImage = backgroundImage2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LearnCardItem(String str, String str2, BackgroundImage backgroundImage, BackgroundImage backgroundImage2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 3;
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new BackgroundImage((String) null, (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : backgroundImage, (i & 8) != 0 ? new BackgroundImage((String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), i2, (DefaultConstructorMarker) (0 == true ? 1 : 0)) : backgroundImage2);
    }
}

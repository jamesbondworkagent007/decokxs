package com.okinc.okex.lite.hero.data.model;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class HeroContent {
    public final String contentImageDay;
    public final String contentImageDayRemote;
    public final String contentImageNight;
    public final String contentImageNightRemote;
    public final List<HeroCta> cta;
    public final String description;
    public final boolean hasAnimation;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(HeroCta$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroContent AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull List<HeroCta> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HeroContent(str, str2, str3, str4, z, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.contentImageDayRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.contentImageDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.contentImageNightRemote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.contentImageNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HeroCta> djBIcL() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroContent)) {
            return false;
        }
        HeroContent heroContent = (HeroContent) obj;
        return Intrinsics.EZpvd((Object) this.contentImageDay, (Object) heroContent.contentImageDay) && Intrinsics.EZpvd((Object) this.contentImageDayRemote, (Object) heroContent.contentImageDayRemote) && Intrinsics.EZpvd((Object) this.contentImageNight, (Object) heroContent.contentImageNight) && Intrinsics.EZpvd((Object) this.contentImageNightRemote, (Object) heroContent.contentImageNightRemote) && this.hasAnimation == heroContent.hasAnimation && Intrinsics.EZpvd((Object) this.title, (Object) heroContent.title) && Intrinsics.EZpvd((Object) this.description, (Object) heroContent.description) && Intrinsics.EZpvd(this.cta, heroContent.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.hasAnimation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.contentImageDay.hashCode() * 31) + this.contentImageDayRemote.hashCode()) * 31) + this.contentImageNight.hashCode()) * 31) + this.contentImageNightRemote.hashCode()) * 31) + Boolean.hashCode(this.hasAnimation)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.cta.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroContent(contentImageDay=" + this.contentImageDay + ", contentImageDayRemote=" + this.contentImageDayRemote + ", contentImageNight=" + this.contentImageNight + ", contentImageNightRemote=" + this.contentImageNightRemote + ", hasAnimation=" + this.hasAnimation + ", title=" + this.title + ", description=" + this.description + ", cta=" + this.cta + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroContent> serializer() {
            return HeroContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroContent(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, HeroContent$$serializer.INSTANCE.getDescriptor());
        }
        this.contentImageDay = str;
        this.contentImageDayRemote = str2;
        this.contentImageNight = str3;
        this.contentImageNightRemote = str4;
        this.hasAnimation = z;
        this.title = str5;
        this.description = str6;
        this.cta = list;
    }

    public static final /* synthetic */ void KWHzl(HeroContent heroContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, heroContent.contentImageDay);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, heroContent.contentImageDayRemote);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, heroContent.contentImageNight);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, heroContent.contentImageNightRemote);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, heroContent.hasAnimation);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, heroContent.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, heroContent.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], heroContent.cta);
    }

    public HeroContent(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, @NotNull String str5, @NotNull String str6, @NotNull List<HeroCta> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.contentImageDay = str;
        this.contentImageDayRemote = str2;
        this.contentImageNight = str3;
        this.contentImageNightRemote = str4;
        this.hasAnimation = z;
        this.title = str5;
        this.description = str6;
        this.cta = list;
    }
}

package com.okinc.okex.lite.hero.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class HeroSection {
    public final HeroContent contentModel;
    public final boolean isActive;
    public final HeroTabBarItem tabBarItemModel;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeroSection copy$default(HeroSection heroSection, boolean z, HeroContent heroContent, HeroTabBarItem heroTabBarItem, int i, Object obj) {
        if ((i & 1) != 0) {
            z = heroSection.isActive;
        }
        if ((i & 2) != 0) {
            heroContent = heroSection.contentModel;
        }
        if ((i & 4) != 0) {
            heroTabBarItem = heroSection.tabBarItemModel;
        }
        return heroSection.KWHzl(z, heroContent, heroTabBarItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroTabBarItem AEQbTJ() {
        return this.tabBarItemModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroContent KWHzl() {
        return this.contentModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroSection KWHzl(boolean z, @NotNull HeroContent heroContent, @NotNull HeroTabBarItem heroTabBarItem) {
        Intrinsics.checkNotNullParameter(heroContent, "");
        Intrinsics.checkNotNullParameter(heroTabBarItem, "");
        return new HeroSection(z, heroContent, heroTabBarItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroSection)) {
            return false;
        }
        HeroSection heroSection = (HeroSection) obj;
        return this.isActive == heroSection.isActive && Intrinsics.EZpvd(this.contentModel, heroSection.contentModel) && Intrinsics.EZpvd(this.tabBarItemModel, heroSection.tabBarItemModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.isActive) * 31) + this.contentModel.hashCode()) * 31) + this.tabBarItemModel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroSection(isActive=" + this.isActive + ", contentModel=" + this.contentModel + ", tabBarItemModel=" + this.tabBarItemModel + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroSection> serializer() {
            return HeroSection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroSection(int i, boolean z, HeroContent heroContent, HeroTabBarItem heroTabBarItem, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, HeroSection$$serializer.INSTANCE.getDescriptor());
        }
        this.isActive = z;
        this.contentModel = heroContent;
        this.tabBarItemModel = heroTabBarItem;
    }

    public static final /* synthetic */ void OLrzqt(HeroSection heroSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, heroSection.isActive);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, HeroContent$$serializer.INSTANCE, heroSection.contentModel);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, HeroTabBarItem$$serializer.INSTANCE, heroSection.tabBarItemModel);
    }

    public HeroSection(boolean z, @NotNull HeroContent heroContent, @NotNull HeroTabBarItem heroTabBarItem) {
        Intrinsics.checkNotNullParameter(heroContent, "");
        Intrinsics.checkNotNullParameter(heroTabBarItem, "");
        this.isActive = z;
        this.contentModel = heroContent;
        this.tabBarItemModel = heroTabBarItem;
    }
}

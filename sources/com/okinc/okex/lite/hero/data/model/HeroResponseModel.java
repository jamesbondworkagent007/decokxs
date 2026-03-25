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
public final class HeroResponseModel {
    public final ContentModel content;
    public final boolean isActive;
    public final TabBarItemModel tabBarItem;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HeroResponseModel copy$default(HeroResponseModel heroResponseModel, boolean z, ContentModel contentModel, TabBarItemModel tabBarItemModel, int i, Object obj) {
        if ((i & 1) != 0) {
            z = heroResponseModel.isActive;
        }
        if ((i & 2) != 0) {
            contentModel = heroResponseModel.content;
        }
        if ((i & 4) != 0) {
            tabBarItemModel = heroResponseModel.tabBarItem;
        }
        return heroResponseModel.copydefault(z, contentModel, tabBarItemModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabBarItemModel EZpvd() {
        return this.tabBarItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentModel KWHzl() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.isActive;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeroResponseModel copydefault(boolean z, @NotNull ContentModel contentModel, @NotNull TabBarItemModel tabBarItemModel) {
        Intrinsics.checkNotNullParameter(contentModel, "");
        Intrinsics.checkNotNullParameter(tabBarItemModel, "");
        return new HeroResponseModel(z, contentModel, tabBarItemModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroResponseModel)) {
            return false;
        }
        HeroResponseModel heroResponseModel = (HeroResponseModel) obj;
        return this.isActive == heroResponseModel.isActive && Intrinsics.EZpvd(this.content, heroResponseModel.content) && Intrinsics.EZpvd(this.tabBarItem, heroResponseModel.tabBarItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.isActive) * 31) + this.content.hashCode()) * 31) + this.tabBarItem.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HeroResponseModel(isActive=" + this.isActive + ", content=" + this.content + ", tabBarItem=" + this.tabBarItem + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.HeroResponseModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HeroResponseModel> serializer() {
            return HeroResponseModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HeroResponseModel(int i, boolean z, ContentModel contentModel, TabBarItemModel tabBarItemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, HeroResponseModel$$serializer.INSTANCE.getDescriptor());
        }
        this.isActive = z;
        this.content = contentModel;
        this.tabBarItem = tabBarItemModel;
    }

    public static final /* synthetic */ void AEQbTJ(HeroResponseModel heroResponseModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeBooleanElement(serialDescriptor, 0, heroResponseModel.isActive);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, ContentModel$$serializer.INSTANCE, heroResponseModel.content);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, TabBarItemModel$$serializer.INSTANCE, heroResponseModel.tabBarItem);
    }

    public HeroResponseModel(boolean z, @NotNull ContentModel contentModel, @NotNull TabBarItemModel tabBarItemModel) {
        Intrinsics.checkNotNullParameter(contentModel, "");
        Intrinsics.checkNotNullParameter(tabBarItemModel, "");
        this.isActive = z;
        this.content = contentModel;
        this.tabBarItem = tabBarItemModel;
    }
}

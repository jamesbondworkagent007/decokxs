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
public final class ContentModel {
    public final String contentImageDay;
    public final String contentImageNight;
    public final List<CtaModel> cta;
    public final String description;
    public final boolean hasAnimation;
    public final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(CtaModel$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okex.lite.hero.data.model.ContentModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ContentModel copy$default(ContentModel contentModel, String str, String str2, boolean z, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentModel.contentImageDay;
        }
        if ((i & 2) != 0) {
            str2 = contentModel.contentImageNight;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = contentModel.hasAnimation;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = contentModel.title;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = contentModel.description;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            list = contentModel.cta;
        }
        return contentModel.KWHzl(str, str5, z2, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentModel KWHzl(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull List<CtaModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ContentModel(str, str2, z, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CtaModel> KWHzl() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.contentImageNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.contentImageDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentModel)) {
            return false;
        }
        ContentModel contentModel = (ContentModel) obj;
        return Intrinsics.EZpvd((Object) this.contentImageDay, (Object) contentModel.contentImageDay) && Intrinsics.EZpvd((Object) this.contentImageNight, (Object) contentModel.contentImageNight) && this.hasAnimation == contentModel.hasAnimation && Intrinsics.EZpvd((Object) this.title, (Object) contentModel.title) && Intrinsics.EZpvd((Object) this.description, (Object) contentModel.description) && Intrinsics.EZpvd(this.cta, contentModel.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.contentImageDay.hashCode() * 31) + this.contentImageNight.hashCode()) * 31) + Boolean.hashCode(this.hasAnimation)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.cta.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContentModel(contentImageDay=" + this.contentImageDay + ", contentImageNight=" + this.contentImageNight + ", hasAnimation=" + this.hasAnimation + ", title=" + this.title + ", description=" + this.description + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.hasAnimation;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.lite.hero.data.model.ContentModel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContentModel> serializer() {
            return ContentModel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContentModel(int i, String str, String str2, boolean z, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, ContentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.contentImageDay = str;
        this.contentImageNight = str2;
        this.hasAnimation = z;
        this.title = str3;
        this.description = str4;
        this.cta = list;
    }

    public static final /* synthetic */ void KWHzl(ContentModel contentModel, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, contentModel.contentImageDay);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, contentModel.contentImageNight);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, contentModel.hasAnimation);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, contentModel.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, contentModel.description);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], contentModel.cta);
    }

    public ContentModel(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4, @NotNull List<CtaModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.contentImageDay = str;
        this.contentImageNight = str2;
        this.hasAnimation = z;
        this.title = str3;
        this.description = str4;
        this.cta = list;
    }
}

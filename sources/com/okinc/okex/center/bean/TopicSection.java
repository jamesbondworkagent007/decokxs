package com.okinc.okex.center.bean;

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

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class TopicSection {
    private final String description;
    private final String iconBright;
    private final String iconDark;
    private final String id;
    private final List<TopicSection> list;
    private final String slug;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.okex.center.bean.TopicSection */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopicSection copy$default(TopicSection topicSection, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topicSection.id;
        }
        if ((i & 2) != 0) {
            str2 = topicSection.slug;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = topicSection.title;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = topicSection.description;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = topicSection.iconDark;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = topicSection.iconBright;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = topicSection.list;
        }
        return topicSection.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicSection> component7() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopicSection copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TopicSection> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TopicSection(str, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopicSection)) {
            return false;
        }
        TopicSection topicSection = (TopicSection) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) topicSection.id) && Intrinsics.EZpvd((Object) this.slug, (Object) topicSection.slug) && Intrinsics.EZpvd((Object) this.title, (Object) topicSection.title) && Intrinsics.EZpvd((Object) this.description, (Object) topicSection.description) && Intrinsics.EZpvd((Object) this.iconDark, (Object) topicSection.iconDark) && Intrinsics.EZpvd((Object) this.iconBright, (Object) topicSection.iconBright) && Intrinsics.EZpvd(this.list, topicSection.list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconBright() {
        return this.iconBright;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconDark() {
        return this.iconDark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopicSection> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlug() {
        return this.slug;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.slug.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.iconDark.hashCode()) * 31) + this.iconBright.hashCode()) * 31) + this.list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopicSection(id=" + this.id + ", slug=" + this.slug + ", title=" + this.title + ", description=" + this.description + ", iconDark=" + this.iconDark + ", iconBright=" + this.iconBright + ", list=" + this.list + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.center.bean.TopicSection.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TopicSection> serializer() {
            return TopicSection$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TopicSection(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, TopicSection$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.slug = str2;
        this.title = str3;
        this.description = str4;
        this.iconDark = str5;
        this.iconBright = str6;
        this.list = list;
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(TopicSection topicSection, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, topicSection.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, topicSection.slug);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, topicSection.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, topicSection.description);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, topicSection.iconDark);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, topicSection.iconBright);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 6, new ArrayListSerializer(TopicSection$$serializer.INSTANCE), topicSection.list);
    }

    public TopicSection(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<TopicSection> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.slug = str2;
        this.title = str3;
        this.description = str4;
        this.iconDark = str5;
        this.iconBright = str6;
        this.list = list;
    }
}

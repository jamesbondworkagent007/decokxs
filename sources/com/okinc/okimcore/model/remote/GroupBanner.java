package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class GroupBanner {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String content;
    private final String createTime;
    private final String ctaLink;
    private final long id;
    private final String title;
    private final String updateTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ctaLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupBanner copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GroupBanner(j, str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupBanner)) {
            return false;
        }
        GroupBanner groupBanner = (GroupBanner) obj;
        return this.id == groupBanner.id && Intrinsics.EZpvd((Object) this.title, (Object) groupBanner.title) && Intrinsics.EZpvd((Object) this.content, (Object) groupBanner.content) && Intrinsics.EZpvd((Object) this.ctaLink, (Object) groupBanner.ctaLink) && Intrinsics.EZpvd((Object) this.createTime, (Object) groupBanner.createTime) && Intrinsics.EZpvd((Object) this.updateTime, (Object) groupBanner.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtaLink() {
        return this.ctaLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + this.ctaLink.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupBanner(id=" + this.id + ", title=" + this.title + ", content=" + this.content + ", ctaLink=" + this.ctaLink + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupBanner.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupBanner> serializer() {
            return GroupBanner$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupBanner(int i, long j, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, GroupBanner$$serializer.INSTANCE.getDescriptor());
        }
        this.id = j;
        this.title = str;
        this.content = str2;
        this.ctaLink = str3;
        this.createTime = str4;
        this.updateTime = str5;
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupBanner groupBanner, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, groupBanner.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, groupBanner.title);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, groupBanner.content);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, groupBanner.ctaLink);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, groupBanner.createTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, groupBanner.updateTime);
    }

    public GroupBanner(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.id = j;
        this.title = str;
        this.content = str2;
        this.ctaLink = str3;
        this.createTime = str4;
        this.updateTime = str5;
    }
}

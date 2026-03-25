package com.okinc.planet.domain.remote.dto;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PublishResponse {
    public ActivityCardResponse activityCard;
    public final PublishAuthor author;
    public String channelId;
    public String content;
    public final String contentId;
    public final int formatType;
    public final List<PublishImageItem> imageList;
    public final List<PluginInfo> pluginInfo;
    public final String publishTime;
    public final TagList tagList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(PublishImageItem$$serializer.INSTANCE), null, null, new ArrayListSerializer(PluginInfo$$serializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.contentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCardResponse EZpvd() {
        return this.activityCard;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ActivityCardResponse activityCardResponse) {
        this.activityCard = activityCardResponse;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublishResponse copydefault(@NotNull String str, @NotNull PublishAuthor publishAuthor, int i, @NotNull String str2, List<PublishImageItem> list, TagList tagList, ActivityCardResponse activityCardResponse, List<PluginInfo> list2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publishAuthor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new PublishResponse(str, publishAuthor, i, str2, list, tagList, activityCardResponse, list2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.channelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishResponse)) {
            return false;
        }
        PublishResponse publishResponse = (PublishResponse) obj;
        return Intrinsics.EZpvd((Object) this.contentId, (Object) publishResponse.contentId) && Intrinsics.EZpvd(this.author, publishResponse.author) && this.formatType == publishResponse.formatType && Intrinsics.EZpvd((Object) this.publishTime, (Object) publishResponse.publishTime) && Intrinsics.EZpvd(this.imageList, publishResponse.imageList) && Intrinsics.EZpvd(this.tagList, publishResponse.tagList) && Intrinsics.EZpvd(this.activityCard, publishResponse.activityCard) && Intrinsics.EZpvd(this.pluginInfo, publishResponse.pluginInfo) && Intrinsics.EZpvd((Object) this.content, (Object) publishResponse.content) && Intrinsics.EZpvd((Object) this.channelId, (Object) publishResponse.channelId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contentId.hashCode();
        int iHashCode2 = this.author.hashCode();
        int iHashCode3 = Integer.hashCode(this.formatType);
        int iHashCode4 = this.publishTime.hashCode();
        List<PublishImageItem> list = this.imageList;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        TagList tagList = this.tagList;
        int iHashCode6 = tagList == null ? 0 : tagList.hashCode();
        ActivityCardResponse activityCardResponse = this.activityCard;
        int iHashCode7 = activityCardResponse == null ? 0 : activityCardResponse.hashCode();
        List<PluginInfo> list2 = this.pluginInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (list2 != null ? list2.hashCode() : 0)) * 31) + this.content.hashCode()) * 31) + this.channelId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublishResponse(contentId=" + this.contentId + ", author=" + this.author + ", formatType=" + this.formatType + ", publishTime=" + this.publishTime + ", imageList=" + this.imageList + ", tagList=" + this.tagList + ", activityCard=" + this.activityCard + ", pluginInfo=" + this.pluginInfo + ", content=" + this.content + ", channelId=" + this.channelId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PublishResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublishResponse> serializer() {
            return PublishResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublishResponse(int i, String str, PublishAuthor publishAuthor, int i2, String str2, List list, TagList tagList, ActivityCardResponse activityCardResponse, List list2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, PublishResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.contentId = str;
        this.author = publishAuthor;
        this.formatType = i2;
        this.publishTime = str2;
        if ((i & 16) == 0) {
            this.imageList = null;
        } else {
            this.imageList = list;
        }
        if ((i & 32) == 0) {
            this.tagList = null;
        } else {
            this.tagList = tagList;
        }
        if ((i & 64) == 0) {
            this.activityCard = null;
        } else {
            this.activityCard = activityCardResponse;
        }
        if ((i & 128) == 0) {
            this.pluginInfo = null;
        } else {
            this.pluginInfo = list2;
        }
        if ((i & 256) == 0) {
            this.content = "";
        } else {
            this.content = str3;
        }
        if ((i & 512) == 0) {
            this.channelId = "";
        } else {
            this.channelId = str4;
        }
    }

    public static final /* synthetic */ void copydefault(PublishResponse publishResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, publishResponse.contentId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, PublishAuthor$$serializer.INSTANCE, publishResponse.author);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, publishResponse.formatType);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, publishResponse.publishTime);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || publishResponse.imageList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], publishResponse.imageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || publishResponse.tagList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, TagList$$serializer.INSTANCE, publishResponse.tagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || publishResponse.activityCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ActivityCardResponse$$serializer.INSTANCE, publishResponse.activityCard);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || publishResponse.pluginInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], publishResponse.pluginInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) publishResponse.content, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, publishResponse.content);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) && Intrinsics.EZpvd((Object) publishResponse.channelId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, publishResponse.channelId);
    }

    public PublishResponse(@NotNull String str, @NotNull PublishAuthor publishAuthor, int i, @NotNull String str2, List<PublishImageItem> list, TagList tagList, ActivityCardResponse activityCardResponse, List<PluginInfo> list2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(publishAuthor, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.contentId = str;
        this.author = publishAuthor;
        this.formatType = i;
        this.publishTime = str2;
        this.imageList = list;
        this.tagList = tagList;
        this.activityCard = activityCardResponse;
        this.pluginInfo = list2;
        this.content = str3;
        this.channelId = str4;
    }
}

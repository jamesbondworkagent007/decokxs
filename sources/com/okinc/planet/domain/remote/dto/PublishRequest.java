package com.okinc.planet.domain.remote.dto;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class PublishRequest {
    public static final KSerializer<Object>[] $childSerializers;
    public final ActivityCardPublish activityCard;
    public final Map<String, String> channelData;
    public final String channelId;
    public final String content;
    public final ContentTags contentTags;
    public final String draftId;
    public final String group;
    public final List<PublishImageItem> imageList;
    public final List<PluginData> pluginList;
    public final String publishId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublishRequest AEQbTJ(@NotNull String str, String str2, @NotNull String str3, @NotNull List<PublishImageItem> list, @NotNull List<PluginData> list2, @NotNull ContentTags contentTags, ActivityCardPublish activityCardPublish, @NotNull String str4, Map<String, String> map, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(contentTags, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new PublishRequest(str, str2, str3, list, list2, contentTags, activityCardPublish, str4, map, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishRequest)) {
            return false;
        }
        PublishRequest publishRequest = (PublishRequest) obj;
        return Intrinsics.EZpvd((Object) this.publishId, (Object) publishRequest.publishId) && Intrinsics.EZpvd((Object) this.draftId, (Object) publishRequest.draftId) && Intrinsics.EZpvd((Object) this.content, (Object) publishRequest.content) && Intrinsics.EZpvd(this.imageList, publishRequest.imageList) && Intrinsics.EZpvd(this.pluginList, publishRequest.pluginList) && Intrinsics.EZpvd(this.contentTags, publishRequest.contentTags) && Intrinsics.EZpvd(this.activityCard, publishRequest.activityCard) && Intrinsics.EZpvd((Object) this.channelId, (Object) publishRequest.channelId) && Intrinsics.EZpvd(this.channelData, publishRequest.channelData) && Intrinsics.EZpvd((Object) this.group, (Object) publishRequest.group);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.publishId.hashCode();
        String str = this.draftId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.content.hashCode();
        int iHashCode4 = this.imageList.hashCode();
        int iHashCode5 = this.pluginList.hashCode();
        int iHashCode6 = this.contentTags.hashCode();
        ActivityCardPublish activityCardPublish = this.activityCard;
        int iHashCode7 = activityCardPublish == null ? 0 : activityCardPublish.hashCode();
        int iHashCode8 = this.channelId.hashCode();
        Map<String, String> map = this.channelData;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (map != null ? map.hashCode() : 0)) * 31) + this.group.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublishRequest(publishId=" + this.publishId + ", draftId=" + this.draftId + ", content=" + this.content + ", imageList=" + this.imageList + ", pluginList=" + this.pluginList + ", contentTags=" + this.contentTags + ", activityCard=" + this.activityCard + ", channelId=" + this.channelId + ", channelData=" + this.channelData + ", group=" + this.group + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PublishRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublishRequest> serializer() {
            return PublishRequest$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(PublishImageItem$$serializer.INSTANCE), new ArrayListSerializer(PluginData$$serializer.INSTANCE), null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), null};
    }

    public /* synthetic */ PublishRequest(int i, String str, String str2, String str3, List list, List list2, ContentTags contentTags, ActivityCardPublish activityCardPublish, String str4, Map map, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (645 != (i & 645)) {
            PluginExceptionsKt.throwMissingFieldException(i, 645, PublishRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.publishId = str;
        List list3 = null;
        byte b = 0;
        byte b2 = 0;
        if ((i & 2) == 0) {
            this.draftId = null;
        } else {
            this.draftId = str2;
        }
        this.content = str3;
        if ((i & 8) == 0) {
            this.imageList = yDY.AhwBna();
        } else {
            this.imageList = list;
        }
        if ((i & 16) == 0) {
            this.pluginList = yDY.AhwBna();
        } else {
            this.pluginList = list2;
        }
        if ((i & 32) == 0) {
            this.contentTags = new ContentTags(list3, (List) (b2 == true ? 1 : 0), 3, (DefaultConstructorMarker) (b == true ? 1 : 0));
        } else {
            this.contentTags = contentTags;
        }
        if ((i & 64) == 0) {
            this.activityCard = null;
        } else {
            this.activityCard = activityCardPublish;
        }
        this.channelId = str4;
        if ((i & 256) == 0) {
            this.channelData = null;
        } else {
            this.channelData = map;
        }
        this.group = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [10=4] */
    public static final /* synthetic */ void OLrzqt(PublishRequest publishRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, publishRequest.publishId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || publishRequest.draftId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, publishRequest.draftId);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, publishRequest.content);
        int i = 3;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(publishRequest.imageList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], publishRequest.imageList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(publishRequest.pluginList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], publishRequest.pluginList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(publishRequest.contentTags, new ContentTags((List) null, (List) (0 == true ? 1 : 0), i, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, ContentTags$$serializer.INSTANCE, publishRequest.contentTags);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || publishRequest.activityCard != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ActivityCardPublish$$serializer.INSTANCE, publishRequest.activityCard);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, publishRequest.channelId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || publishRequest.channelData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr[8], publishRequest.channelData);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 9, publishRequest.group);
    }

    public PublishRequest(@NotNull String str, String str2, @NotNull String str3, @NotNull List<PublishImageItem> list, @NotNull List<PluginData> list2, @NotNull ContentTags contentTags, ActivityCardPublish activityCardPublish, @NotNull String str4, Map<String, String> map, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(contentTags, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.publishId = str;
        this.draftId = str2;
        this.content = str3;
        this.imageList = list;
        this.pluginList = list2;
        this.contentTags = contentTags;
        this.activityCard = activityCardPublish;
        this.channelId = str4;
        this.channelData = map;
        this.group = str5;
    }
}

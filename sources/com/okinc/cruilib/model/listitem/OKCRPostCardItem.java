package com.okinc.cruilib.model.listitem;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem;
import com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OKCRPostCardItem extends OKCRListItem {
    public final String authorId;
    public final String authorNickname;
    public final String authorPortrait;
    public final String content;
    public final int formatType;
    public final String id;
    public final long publishTime;
    public final String raw;
    public OKCRTokenPairItem token;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCRPostCardItem EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, OKCRTokenPairItem oKCRTokenPairItem, long j, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OKCRPostCardItem(str, str2, str3, str4, str5, i, oKCRTokenPairItem, j, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKCRPostCardItem)) {
            return false;
        }
        OKCRPostCardItem oKCRPostCardItem = (OKCRPostCardItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) oKCRPostCardItem.id) && Intrinsics.EZpvd((Object) this.authorId, (Object) oKCRPostCardItem.authorId) && Intrinsics.EZpvd((Object) this.authorPortrait, (Object) oKCRPostCardItem.authorPortrait) && Intrinsics.EZpvd((Object) this.authorNickname, (Object) oKCRPostCardItem.authorNickname) && Intrinsics.EZpvd((Object) this.content, (Object) oKCRPostCardItem.content) && this.formatType == oKCRPostCardItem.formatType && Intrinsics.EZpvd(this.token, oKCRPostCardItem.token) && this.publishTime == oKCRPostCardItem.publishTime && Intrinsics.EZpvd((Object) this.raw, (Object) oKCRPostCardItem.raw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.authorId.hashCode();
        int iHashCode3 = this.authorPortrait.hashCode();
        int iHashCode4 = this.authorNickname.hashCode();
        int iHashCode5 = this.content.hashCode();
        int iHashCode6 = Integer.hashCode(this.formatType);
        OKCRTokenPairItem oKCRTokenPairItem = this.token;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (oKCRTokenPairItem == null ? 0 : oKCRTokenPairItem.hashCode())) * 31) + Long.hashCode(this.publishTime)) * 31) + this.raw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKCRPostCardItem(id=" + this.id + ", authorId=" + this.authorId + ", authorPortrait=" + this.authorPortrait + ", authorNickname=" + this.authorNickname + ", content=" + this.content + ", formatType=" + this.formatType + ", token=" + this.token + ", publishTime=" + this.publishTime + ", raw=" + this.raw + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.cruilib.model.listitem.OKCRPostCardItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKCRPostCardItem> serializer() {
            return OKCRPostCardItem$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OKCRPostCardItem(int i, String str, String str2, String str3, String str4, String str5, int i2, OKCRTokenPairItem oKCRTokenPairItem, long j, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, OKCRPostCardItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.authorId = str2;
        this.authorPortrait = str3;
        this.authorNickname = str4;
        this.content = str5;
        this.formatType = i2;
        this.token = oKCRTokenPairItem;
        this.publishTime = j;
        this.raw = str6;
    }

    public static final /* synthetic */ void copydefault(OKCRPostCardItem oKCRPostCardItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        OKCRListItem.write$Self(oKCRPostCardItem, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oKCRPostCardItem.getId());
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oKCRPostCardItem.authorId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oKCRPostCardItem.authorPortrait);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, oKCRPostCardItem.authorNickname);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, oKCRPostCardItem.content);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, oKCRPostCardItem.formatType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, OKCRTokenPairItem$$serializer.INSTANCE, oKCRPostCardItem.token);
        compositeEncoder.encodeLongElement(serialDescriptor, 7, oKCRPostCardItem.publishTime);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, oKCRPostCardItem.raw);
    }

    public OKCRPostCardItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, OKCRTokenPairItem oKCRTokenPairItem, long j, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.id = str;
        this.authorId = str2;
        this.authorPortrait = str3;
        this.authorNickname = str4;
        this.content = str5;
        this.formatType = i;
        this.token = oKCRTokenPairItem;
        this.publishTime = j;
        this.raw = str6;
    }
}

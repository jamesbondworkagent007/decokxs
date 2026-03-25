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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class PublishAuthor {
    public final String authorId;
    public final List<String> badgeList;
    public final String nickName;
    public final String portrait;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.domain.remote.dto.PublishAuthor */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PublishAuthor copy$default(PublishAuthor publishAuthor, String str, List list, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishAuthor.authorId;
        }
        if ((i & 2) != 0) {
            list = publishAuthor.badgeList;
        }
        if ((i & 4) != 0) {
            str2 = publishAuthor.nickName;
        }
        if ((i & 8) != 0) {
            str3 = publishAuthor.portrait;
        }
        return publishAuthor.copydefault(str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublishAuthor copydefault(@NotNull String str, List<String> list, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new PublishAuthor(str, list, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishAuthor)) {
            return false;
        }
        PublishAuthor publishAuthor = (PublishAuthor) obj;
        return Intrinsics.EZpvd((Object) this.authorId, (Object) publishAuthor.authorId) && Intrinsics.EZpvd(this.badgeList, publishAuthor.badgeList) && Intrinsics.EZpvd((Object) this.nickName, (Object) publishAuthor.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) publishAuthor.portrait);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.authorId.hashCode();
        List<String> list = this.badgeList;
        return (((((iHashCode * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.nickName.hashCode()) * 31) + this.portrait.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PublishAuthor(authorId=" + this.authorId + ", badgeList=" + this.badgeList + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.remote.dto.PublishAuthor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PublishAuthor> serializer() {
            return PublishAuthor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PublishAuthor(int i, String str, List list, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i, 13, PublishAuthor$$serializer.INSTANCE.getDescriptor());
        }
        this.authorId = str;
        if ((i & 2) == 0) {
            this.badgeList = null;
        } else {
            this.badgeList = list;
        }
        this.nickName = str2;
        this.portrait = str3;
    }

    public static final /* synthetic */ void copydefault(PublishAuthor publishAuthor, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, publishAuthor.authorId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || publishAuthor.badgeList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], publishAuthor.badgeList);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, publishAuthor.nickName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, publishAuthor.portrait);
    }

    public PublishAuthor(@NotNull String str, List<String> list, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.authorId = str;
        this.badgeList = list;
        this.nickName = str2;
        this.portrait = str3;
    }
}

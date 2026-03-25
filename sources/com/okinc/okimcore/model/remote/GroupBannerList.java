package com.okinc.okimcore.model.remote;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class GroupBannerList {
    private final List<GroupBanner> banners;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(GroupBanner$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.GroupBannerList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupBannerList copy$default(GroupBannerList groupBannerList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupBannerList.banners;
        }
        return groupBannerList.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupBanner> component1() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupBannerList copy(@NotNull List<GroupBanner> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new GroupBannerList(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GroupBannerList) && Intrinsics.EZpvd(this.banners, ((GroupBannerList) obj).banners);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GroupBanner> getBanners() {
        return this.banners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.banners.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupBannerList(banners=" + this.banners + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupBannerList.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupBannerList> serializer() {
            return GroupBannerList$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupBannerList(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GroupBannerList$$serializer.INSTANCE.getDescriptor());
        }
        this.banners = list;
    }

    public GroupBannerList(@NotNull List<GroupBanner> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.banners = list;
    }
}

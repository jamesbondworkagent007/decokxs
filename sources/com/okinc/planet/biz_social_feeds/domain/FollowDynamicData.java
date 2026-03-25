package com.okinc.planet.biz_social_feeds.domain;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FollowDynamicData {
    public final String followFlag;
    public final List<FollowInnerData> followTimelineList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(FollowInnerData$$serializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FollowDynamicData() {
        this((List) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.planet.biz_social_feeds.domain.FollowDynamicData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FollowDynamicData copy$default(FollowDynamicData followDynamicData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = followDynamicData.followTimelineList;
        }
        if ((i & 2) != 0) {
            str = followDynamicData.followFlag;
        }
        return followDynamicData.EZpvd(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.followFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FollowDynamicData EZpvd(@NotNull List<FollowInnerData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new FollowDynamicData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<FollowInnerData> OLrzqt() {
        return this.followTimelineList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowDynamicData)) {
            return false;
        }
        FollowDynamicData followDynamicData = (FollowDynamicData) obj;
        return Intrinsics.EZpvd(this.followTimelineList, followDynamicData.followTimelineList) && Intrinsics.EZpvd((Object) this.followFlag, (Object) followDynamicData.followFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.followTimelineList.hashCode() * 31) + this.followFlag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FollowDynamicData(followTimelineList=" + this.followTimelineList + ", followFlag=" + this.followFlag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_social_feeds.domain.FollowDynamicData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FollowDynamicData> serializer() {
            return FollowDynamicData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FollowDynamicData(int i, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.followTimelineList = (i & 1) == 0 ? new ArrayList() : list;
        if ((i & 2) == 0) {
            this.followFlag = "";
        } else {
            this.followFlag = str;
        }
    }

    public static final /* synthetic */ void copydefault(FollowDynamicData followDynamicData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(followDynamicData.followTimelineList, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], followDynamicData.followTimelineList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) followDynamicData.followFlag, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, followDynamicData.followFlag);
    }

    public FollowDynamicData(@NotNull List<FollowInnerData> list, @NotNull String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.followTimelineList = list;
        this.followFlag = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:7) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.planet.biz_social_feeds.domain.FollowInnerData>, java.lang.String):void (m)] (LINE:6) call: com.okinc.planet.biz_social_feeds.domain.FollowDynamicData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ FollowDynamicData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str);
    }
}

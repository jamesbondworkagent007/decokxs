package com.okinc.business.market.features.address_tracker_sa.ui.tracker.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerAddressSourceResponse {
    public final List<Integer> chains;
    public final List<TrackerAddressGroup> groups;
    public final Map<String, List<TrackerAddressLabel>> labels;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(TrackerAddressGroup$$serializer.INSTANCE), new LinkedHashMapSerializer(StringSerializer.INSTANCE, new ArrayListSerializer(TrackerAddressLabel$$serializer.INSTANCE))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackerAddressSourceResponse copy$default(TrackerAddressSourceResponse trackerAddressSourceResponse, List list, List list2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trackerAddressSourceResponse.chains;
        }
        if ((i & 2) != 0) {
            list2 = trackerAddressSourceResponse.groups;
        }
        if ((i & 4) != 0) {
            map = trackerAddressSourceResponse.labels;
        }
        return trackerAddressSourceResponse.EZpvd((List<Integer>) list, (List<TrackerAddressGroup>) list2, (Map<String, ? extends List<TrackerAddressLabel>>) map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrackerAddressGroup> AEQbTJ() {
        return this.groups;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerAddressSourceResponse EZpvd(@NotNull List<Integer> list, @NotNull List<TrackerAddressGroup> list2, @NotNull Map<String, ? extends List<TrackerAddressLabel>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new TrackerAddressSourceResponse(list, list2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> KWHzl() {
        return this.chains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<TrackerAddressLabel>> copydefault() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerAddressSourceResponse)) {
            return false;
        }
        TrackerAddressSourceResponse trackerAddressSourceResponse = (TrackerAddressSourceResponse) obj;
        return Intrinsics.EZpvd(this.chains, trackerAddressSourceResponse.chains) && Intrinsics.EZpvd(this.groups, trackerAddressSourceResponse.groups) && Intrinsics.EZpvd(this.labels, trackerAddressSourceResponse.labels);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.chains.hashCode() * 31) + this.groups.hashCode()) * 31) + this.labels.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerAddressSourceResponse(chains=" + this.chains + ", groups=" + this.groups + ", labels=" + this.labels + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressSourceResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrackerAddressSourceResponse> serializer() {
            return TrackerAddressSourceResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrackerAddressSourceResponse(int i, List list, List list2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TrackerAddressSourceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.chains = list;
        this.groups = list2;
        this.labels = map;
    }

    public static final /* synthetic */ void EZpvd(TrackerAddressSourceResponse trackerAddressSourceResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], trackerAddressSourceResponse.chains);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], trackerAddressSourceResponse.groups);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], trackerAddressSourceResponse.labels);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<java.lang.String, ? extends java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.tracker.model.TrackerAddressLabel>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerAddressSourceResponse(@NotNull List<Integer> list, @NotNull List<TrackerAddressGroup> list2, @NotNull Map<String, ? extends List<TrackerAddressLabel>> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.chains = list;
        this.groups = list2;
        this.labels = map;
    }
}

package com.okinc.okimcore.model.remote;

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

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SyncRelationsRequest {
    private final List<SyncRelation> phoneList;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(SyncRelationsRequest$SyncRelation$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.remote.SyncRelationsRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncRelationsRequest copy$default(SyncRelationsRequest syncRelationsRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = syncRelationsRequest.phoneList;
        }
        return syncRelationsRequest.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SyncRelation> component1() {
        return this.phoneList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SyncRelationsRequest copy(@NotNull List<SyncRelation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SyncRelationsRequest(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SyncRelationsRequest) && Intrinsics.EZpvd(this.phoneList, ((SyncRelationsRequest) obj).phoneList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SyncRelation> getPhoneList() {
        return this.phoneList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.phoneList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SyncRelationsRequest(phoneList=" + this.phoneList + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SyncRelationsRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SyncRelationsRequest> serializer() {
            return SyncRelationsRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SyncRelationsRequest(int i, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SyncRelationsRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.phoneList = list;
    }

    public SyncRelationsRequest(@NotNull List<SyncRelation> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.phoneList = list;
    }

    @Serializable
    public static final class SyncRelation {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String areaCode;
        private final String phoneHash;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SyncRelation copy$default(SyncRelation syncRelation, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = syncRelation.areaCode;
            }
            if ((i & 2) != 0) {
                str2 = syncRelation.phoneHash;
            }
            return syncRelation.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.phoneHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SyncRelation copy(String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            return new SyncRelation(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SyncRelation)) {
                return false;
            }
            SyncRelation syncRelation = (SyncRelation) obj;
            return Intrinsics.EZpvd((Object) this.areaCode, (Object) syncRelation.areaCode) && Intrinsics.EZpvd((Object) this.phoneHash, (Object) syncRelation.phoneHash);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAreaCode() {
            return this.areaCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPhoneHash() {
            return this.phoneHash;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.areaCode;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.phoneHash.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SyncRelation(areaCode=" + this.areaCode + ", phoneHash=" + this.phoneHash + ")";
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SyncRelationsRequest.SyncRelation.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SyncRelation> serializer() {
                return SyncRelationsRequest$SyncRelation$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SyncRelation(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, SyncRelationsRequest$SyncRelation$$serializer.INSTANCE.getDescriptor());
            }
            this.areaCode = str;
            this.phoneHash = str2;
        }

        public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SyncRelation syncRelation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, syncRelation.areaCode);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, syncRelation.phoneHash);
        }

        public SyncRelation(String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str2, "");
            this.areaCode = str;
            this.phoneHash = str2;
        }
    }
}

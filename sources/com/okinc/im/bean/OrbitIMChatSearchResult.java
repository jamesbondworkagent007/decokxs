package com.okinc.im.bean;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56524yIo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class OrbitIMChatSearchResult {
    private final List<SearchResultData> contactAndConversationResults;
    private final List<SearchResultData> groupResults;
    private final String keyword;
    private final List<SearchResultData> messageResults;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(new PolymorphicSerializer(C56524yIo.AEQbTJ(SearchResultData.class), new Annotation[0])), new ArrayListSerializer(new PolymorphicSerializer(C56524yIo.AEQbTJ(SearchResultData.class), new Annotation[0])), new ArrayListSerializer(new PolymorphicSerializer(C56524yIo.AEQbTJ(SearchResultData.class), new Annotation[0]))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.bean.OrbitIMChatSearchResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrbitIMChatSearchResult copy$default(OrbitIMChatSearchResult orbitIMChatSearchResult, String str, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orbitIMChatSearchResult.keyword;
        }
        if ((i & 2) != 0) {
            list = orbitIMChatSearchResult.contactAndConversationResults;
        }
        if ((i & 4) != 0) {
            list2 = orbitIMChatSearchResult.groupResults;
        }
        if ((i & 8) != 0) {
            list3 = orbitIMChatSearchResult.messageResults;
        }
        return orbitIMChatSearchResult.copy(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> component2() {
        return this.contactAndConversationResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> component3() {
        return this.groupResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> component4() {
        return this.messageResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrbitIMChatSearchResult copy(@NotNull String str, @NotNull List<? extends SearchResultData> list, @NotNull List<? extends SearchResultData> list2, @NotNull List<? extends SearchResultData> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new OrbitIMChatSearchResult(str, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrbitIMChatSearchResult)) {
            return false;
        }
        OrbitIMChatSearchResult orbitIMChatSearchResult = (OrbitIMChatSearchResult) obj;
        return Intrinsics.EZpvd((Object) this.keyword, (Object) orbitIMChatSearchResult.keyword) && Intrinsics.EZpvd(this.contactAndConversationResults, orbitIMChatSearchResult.contactAndConversationResults) && Intrinsics.EZpvd(this.groupResults, orbitIMChatSearchResult.groupResults) && Intrinsics.EZpvd(this.messageResults, orbitIMChatSearchResult.messageResults);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> getContactAndConversationResults() {
        return this.contactAndConversationResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> getGroupResults() {
        return this.groupResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKeyword() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchResultData> getMessageResults() {
        return this.messageResults;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.keyword.hashCode() * 31) + this.contactAndConversationResults.hashCode()) * 31) + this.groupResults.hashCode()) * 31) + this.messageResults.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrbitIMChatSearchResult(keyword=" + this.keyword + ", contactAndConversationResults=" + this.contactAndConversationResults + ", groupResults=" + this.groupResults + ", messageResults=" + this.messageResults + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.bean.OrbitIMChatSearchResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrbitIMChatSearchResult> serializer() {
            return OrbitIMChatSearchResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrbitIMChatSearchResult(int i, String str, List list, List list2, List list3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, OrbitIMChatSearchResult$$serializer.INSTANCE.getDescriptor());
        }
        this.keyword = str;
        this.contactAndConversationResults = list;
        this.groupResults = list2;
        this.messageResults = list3;
    }

    public static final /* synthetic */ void write$Self$OKIM_okim_api(OrbitIMChatSearchResult orbitIMChatSearchResult, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, orbitIMChatSearchResult.keyword);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], orbitIMChatSearchResult.contactAndConversationResults);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], orbitIMChatSearchResult.groupResults);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], orbitIMChatSearchResult.messageResults);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.okinc.im.bean.SearchResultData> */
    /* JADX WARN: Multi-variable type inference failed */
    public OrbitIMChatSearchResult(@NotNull String str, @NotNull List<? extends SearchResultData> list, @NotNull List<? extends SearchResultData> list2, @NotNull List<? extends SearchResultData> list3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.keyword = str;
        this.contactAndConversationResults = list;
        this.groupResults = list2;
        this.messageResults = list3;
    }
}

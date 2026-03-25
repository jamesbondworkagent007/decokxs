package com.okinc.okex.search.bean;

import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.center.bean.SelfServiceTools$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SearchIntentResponse {
    private final SearchArticleResponse articles;
    private final SearchIntentEntry intentEntry;
    private final SelfServiceTools selfServiceTools;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchIntentResponse() {
        this((SearchIntentEntry) null, (SearchArticleResponse) null, (SelfServiceTools) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchIntentResponse copy$default(SearchIntentResponse searchIntentResponse, SearchIntentEntry searchIntentEntry, SearchArticleResponse searchArticleResponse, SelfServiceTools selfServiceTools, int i, Object obj) {
        if ((i & 1) != 0) {
            searchIntentEntry = searchIntentResponse.intentEntry;
        }
        if ((i & 2) != 0) {
            searchArticleResponse = searchIntentResponse.articles;
        }
        if ((i & 4) != 0) {
            selfServiceTools = searchIntentResponse.selfServiceTools;
        }
        return searchIntentResponse.copy(searchIntentEntry, searchArticleResponse, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchIntentEntry component1() {
        return this.intentEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchArticleResponse component2() {
        return this.articles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools component3() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchIntentResponse copy(SearchIntentEntry searchIntentEntry, SearchArticleResponse searchArticleResponse, SelfServiceTools selfServiceTools) {
        return new SearchIntentResponse(searchIntentEntry, searchArticleResponse, selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntentResponse)) {
            return false;
        }
        SearchIntentResponse searchIntentResponse = (SearchIntentResponse) obj;
        return Intrinsics.EZpvd(this.intentEntry, searchIntentResponse.intentEntry) && Intrinsics.EZpvd(this.articles, searchIntentResponse.articles) && Intrinsics.EZpvd(this.selfServiceTools, searchIntentResponse.selfServiceTools);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchArticleResponse getArticles() {
        return this.articles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchIntentEntry getIntentEntry() {
        return this.intentEntry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SelfServiceTools getSelfServiceTools() {
        return this.selfServiceTools;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SearchIntentEntry searchIntentEntry = this.intentEntry;
        int iHashCode = searchIntentEntry == null ? 0 : searchIntentEntry.hashCode();
        SearchArticleResponse searchArticleResponse = this.articles;
        int iHashCode2 = searchArticleResponse == null ? 0 : searchArticleResponse.hashCode();
        SelfServiceTools selfServiceTools = this.selfServiceTools;
        return (((iHashCode * 31) + iHashCode2) * 31) + (selfServiceTools != null ? selfServiceTools.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchIntentResponse(intentEntry=" + this.intentEntry + ", articles=" + this.articles + ", selfServiceTools=" + this.selfServiceTools + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.search.bean.SearchIntentResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SearchIntentResponse> serializer() {
            return SearchIntentResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SearchIntentResponse(int i, SearchIntentEntry searchIntentEntry, SearchArticleResponse searchArticleResponse, SelfServiceTools selfServiceTools, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.intentEntry = null;
        } else {
            this.intentEntry = searchIntentEntry;
        }
        if ((i & 2) == 0) {
            this.articles = null;
        } else {
            this.articles = searchArticleResponse;
        }
        if ((i & 4) == 0) {
            this.selfServiceTools = null;
        } else {
            this.selfServiceTools = selfServiceTools;
        }
    }

    public static final /* synthetic */ void write$Self$OKSupport_support_impl(SearchIntentResponse searchIntentResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || searchIntentResponse.intentEntry != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, SearchIntentEntry$$serializer.INSTANCE, searchIntentResponse.intentEntry);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || searchIntentResponse.articles != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, SearchArticleResponse$$serializer.INSTANCE, searchIntentResponse.articles);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && searchIntentResponse.selfServiceTools == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, SelfServiceTools$$serializer.INSTANCE, searchIntentResponse.selfServiceTools);
    }

    public SearchIntentResponse(SearchIntentEntry searchIntentEntry, SearchArticleResponse searchArticleResponse, SelfServiceTools selfServiceTools) {
        this.intentEntry = searchIntentEntry;
        this.articles = searchArticleResponse;
        this.selfServiceTools = selfServiceTools;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.okex.search.bean.SearchIntentEntry:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.search.bean.SearchIntentEntry) : (r2v0 com.okinc.okex.search.bean.SearchIntentEntry))
  (wrap:com.okinc.okex.search.bean.SearchArticleResponse:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.search.bean.SearchArticleResponse) : (r3v0 com.okinc.okex.search.bean.SearchArticleResponse))
  (wrap:com.okinc.okex.center.bean.SelfServiceTools:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okex.center.bean.SelfServiceTools) : (r4v0 com.okinc.okex.center.bean.SelfServiceTools))
 A[MD:(com.okinc.okex.search.bean.SearchIntentEntry, com.okinc.okex.search.bean.SearchArticleResponse, com.okinc.okex.center.bean.SelfServiceTools):void (m)] (LINE:9) call: com.okinc.okex.search.bean.SearchIntentResponse.<init>(com.okinc.okex.search.bean.SearchIntentEntry, com.okinc.okex.search.bean.SearchArticleResponse, com.okinc.okex.center.bean.SelfServiceTools):void type: THIS */
    public /* synthetic */ SearchIntentResponse(SearchIntentEntry searchIntentEntry, SearchArticleResponse searchArticleResponse, SelfServiceTools selfServiceTools, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchIntentEntry, (i & 2) != 0 ? null : searchArticleResponse, (i & 4) != 0 ? null : selfServiceTools);
    }
}

package com.okinc.business.defi.wallet.mine.search.data.model;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.errorprone.annotations.Keep;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@SerialName(RequestParameters.SUBRESOURCE_WEBSITE)
@Keep
@Serializable
public final class WebsiteSearchHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long timestamp;
    public final String title;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WebsiteSearchHistory copy$default(WebsiteSearchHistory websiteSearchHistory, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = websiteSearchHistory.url;
        }
        if ((i & 2) != 0) {
            str2 = websiteSearchHistory.title;
        }
        if ((i & 4) != 0) {
            j = websiteSearchHistory.timestamp;
        }
        return websiteSearchHistory.AEQbTJ(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WebsiteSearchHistory AEQbTJ(@NotNull String str, String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new WebsiteSearchHistory(str, str2, j);
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String AYXKKw() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public long AhwBna() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String EZpvd() {
        return this.url;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String KWHzl() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebsiteSearchHistory)) {
            return false;
        }
        WebsiteSearchHistory websiteSearchHistory = (WebsiteSearchHistory) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) websiteSearchHistory.url) && Intrinsics.EZpvd((Object) this.title, (Object) websiteSearchHistory.title) && this.timestamp == websiteSearchHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.url.hashCode();
        String str = this.title;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WebsiteSearchHistory(url=" + this.url + ", title=" + this.title + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.WebsiteSearchHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WebsiteSearchHistory> serializer() {
            return WebsiteSearchHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebsiteSearchHistory(int i, String str, String str2, long j, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, WebsiteSearchHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.url = str;
        if ((i & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j;
        }
    }

    public static final /* synthetic */ void OLrzqt(WebsiteSearchHistory websiteSearchHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(websiteSearchHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeStringElement(serialDescriptor, 0, websiteSearchHistory.url);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || websiteSearchHistory.title != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, websiteSearchHistory.title);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && websiteSearchHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 2, websiteSearchHistory.AhwBna());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsiteSearchHistory(@NotNull String str, String str2, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
        this.title = str2;
        this.timestamp = j;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "website_" + this.url;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.WEBSITE;
    }
}

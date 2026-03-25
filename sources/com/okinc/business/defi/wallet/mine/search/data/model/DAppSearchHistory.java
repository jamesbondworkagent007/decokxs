package com.okinc.business.defi.wallet.mine.search.data.model;

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
@SerialName("dapp")
@Keep
@Serializable
public final class DAppSearchHistory extends SearchHistoryItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final long dappId;
    public final String iconUrl;
    public final String name;
    public final long timestamp;
    public final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String AYXKKw() {
        return this.iconUrl;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String KWHzl() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.dappId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DAppSearchHistory copydefault(long j, @NotNull String str, @NotNull String str2, String str3, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DAppSearchHistory(j, str, str2, str3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAppSearchHistory)) {
            return false;
        }
        DAppSearchHistory dAppSearchHistory = (DAppSearchHistory) obj;
        return this.dappId == dAppSearchHistory.dappId && Intrinsics.EZpvd((Object) this.name, (Object) dAppSearchHistory.name) && Intrinsics.EZpvd((Object) this.url, (Object) dAppSearchHistory.url) && Intrinsics.EZpvd((Object) this.iconUrl, (Object) dAppSearchHistory.iconUrl) && this.timestamp == dAppSearchHistory.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.dappId);
        int iHashCode2 = this.name.hashCode();
        int iHashCode3 = this.url.hashCode();
        String str = this.iconUrl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DAppSearchHistory(dappId=" + this.dappId + ", name=" + this.name + ", url=" + this.url + ", iconUrl=" + this.iconUrl + ", timestamp=" + this.timestamp + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DAppSearchHistory> serializer() {
            return DAppSearchHistory$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DAppSearchHistory(int i, long j, String str, String str2, String str3, long j2, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, DAppSearchHistory$$serializer.INSTANCE.getDescriptor());
        }
        this.dappId = j;
        this.name = str;
        this.url = str2;
        if ((i & 8) == 0) {
            this.iconUrl = null;
        } else {
            this.iconUrl = str3;
        }
        if ((i & 16) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(DAppSearchHistory dAppSearchHistory, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        SearchHistoryItem.copydefault(dAppSearchHistory, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeLongElement(serialDescriptor, 0, dAppSearchHistory.dappId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dAppSearchHistory.name);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dAppSearchHistory.url);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dAppSearchHistory.iconUrl != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dAppSearchHistory.iconUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && dAppSearchHistory.AhwBna() == System.currentTimeMillis()) {
            return;
        }
        compositeEncoder.encodeLongElement(serialDescriptor, 4, dAppSearchHistory.AhwBna());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r10v0 long)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:18)) : (r15v0 long))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:13) call: com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory.<init>(long, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ DAppSearchHistory(long j, String str, String str2, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? System.currentTimeMillis() : j2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppSearchHistory(long j, @NotNull String str, @NotNull String str2, String str3, long j2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.dappId = j;
        this.name = str;
        this.url = str2;
        this.iconUrl = str3;
        this.timestamp = j2;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public String valueOf() {
        return "dapp_" + this.dappId;
    }

    @Override // com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem
    public SearchType gEmmrt() {
        return SearchType.DAPP;
    }
}

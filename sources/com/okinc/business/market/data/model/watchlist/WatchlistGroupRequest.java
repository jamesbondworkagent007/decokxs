package com.okinc.business.market.data.model.watchlist;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class WatchlistGroupRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String accountId;
    public final Integer groupId;
    public final String groupName;
    public final String walletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchlistGroupRequest() {
        this((String) null, (String) null, (String) null, (Integer) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ WatchlistGroupRequest copy$default(WatchlistGroupRequest watchlistGroupRequest, String str, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchlistGroupRequest.accountId;
        }
        if ((i & 2) != 0) {
            str2 = watchlistGroupRequest.walletAddress;
        }
        if ((i & 4) != 0) {
            str3 = watchlistGroupRequest.groupName;
        }
        if ((i & 8) != 0) {
            num = watchlistGroupRequest.groupId;
        }
        return watchlistGroupRequest.OLrzqt(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WatchlistGroupRequest OLrzqt(@NotNull String str, @NotNull String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new WatchlistGroupRequest(str, str2, str3, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WatchlistGroupRequest)) {
            return false;
        }
        WatchlistGroupRequest watchlistGroupRequest = (WatchlistGroupRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) watchlistGroupRequest.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) watchlistGroupRequest.walletAddress) && Intrinsics.EZpvd((Object) this.groupName, (Object) watchlistGroupRequest.groupName) && Intrinsics.EZpvd(this.groupId, watchlistGroupRequest.groupId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = this.walletAddress.hashCode();
        String str = this.groupName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Integer num = this.groupId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WatchlistGroupRequest(accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ", groupName=" + this.groupName + ", groupId=" + this.groupId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.WatchlistGroupRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<WatchlistGroupRequest> serializer() {
            return WatchlistGroupRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WatchlistGroupRequest(int i, String str, String str2, String str3, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.accountId = "";
        } else {
            this.accountId = str;
        }
        if ((i & 2) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str2;
        }
        if ((i & 4) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str3;
        }
        if ((i & 8) == 0) {
            this.groupId = null;
        } else {
            this.groupId = num;
        }
    }

    public static final /* synthetic */ void copydefault(WatchlistGroupRequest watchlistGroupRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) watchlistGroupRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, watchlistGroupRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) watchlistGroupRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, watchlistGroupRequest.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || watchlistGroupRequest.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, watchlistGroupRequest.groupName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && watchlistGroupRequest.groupId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, watchlistGroupRequest.groupId);
    }

    public WatchlistGroupRequest(@NotNull String str, @NotNull String str2, String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.accountId = str;
        this.walletAddress = str2;
        this.groupName = str3;
        this.groupId = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0012: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:7) call: com.okinc.business.market.data.model.watchlist.WatchlistGroupRequest.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ WatchlistGroupRequest(String str, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num);
    }
}

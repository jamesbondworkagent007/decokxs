package com.okinc.business.market.data.model.watchlist;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class FavoriteTokensSortRequest {
    public final String accountId;
    public final int groupId;
    public final List<FavoriteTokenData> tokenList;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(FavoriteTokenData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteTokensSortRequest() {
        this((String) null, (String) null, 0, (List) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteTokensSortRequest copy$default(FavoriteTokensSortRequest favoriteTokensSortRequest, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = favoriteTokensSortRequest.accountId;
        }
        if ((i2 & 2) != 0) {
            str2 = favoriteTokensSortRequest.walletAddress;
        }
        if ((i2 & 4) != 0) {
            i = favoriteTokensSortRequest.groupId;
        }
        if ((i2 & 8) != 0) {
            list = favoriteTokensSortRequest.tokenList;
        }
        return favoriteTokensSortRequest.OLrzqt(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteTokensSortRequest OLrzqt(@NotNull String str, @NotNull String str2, int i, @NotNull List<FavoriteTokenData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new FavoriteTokensSortRequest(str, str2, i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteTokensSortRequest)) {
            return false;
        }
        FavoriteTokensSortRequest favoriteTokensSortRequest = (FavoriteTokensSortRequest) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) favoriteTokensSortRequest.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) favoriteTokensSortRequest.walletAddress) && this.groupId == favoriteTokensSortRequest.groupId && Intrinsics.EZpvd(this.tokenList, favoriteTokensSortRequest.tokenList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.accountId.hashCode() * 31) + this.walletAddress.hashCode()) * 31) + Integer.hashCode(this.groupId)) * 31) + this.tokenList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteTokensSortRequest(accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ", groupId=" + this.groupId + ", tokenList=" + this.tokenList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteTokensSortRequest> serializer() {
            return FavoriteTokensSortRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteTokensSortRequest(int i, String str, String str2, int i2, List list, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.groupId = -1;
        } else {
            this.groupId = i2;
        }
        if ((i & 8) == 0) {
            this.tokenList = yDY.AhwBna();
        } else {
            this.tokenList = list;
        }
    }

    public static final /* synthetic */ void EZpvd(FavoriteTokensSortRequest favoriteTokensSortRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) favoriteTokensSortRequest.accountId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, favoriteTokensSortRequest.accountId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) favoriteTokensSortRequest.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, favoriteTokensSortRequest.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || favoriteTokensSortRequest.groupId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, favoriteTokensSortRequest.groupId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd(favoriteTokensSortRequest.tokenList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], favoriteTokensSortRequest.tokenList);
    }

    public FavoriteTokensSortRequest(@NotNull String str, @NotNull String str2, int i, @NotNull List<FavoriteTokenData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.walletAddress = str2;
        this.groupId = i;
        this.tokenList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<com.okinc.business.market.data.model.watchlist.FavoriteTokenData>):void (m)] (LINE:7) call: com.okinc.business.market.data.model.watchlist.FavoriteTokensSortRequest.<init>(java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ FavoriteTokensSortRequest(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? yDY.AhwBna() : list);
    }
}

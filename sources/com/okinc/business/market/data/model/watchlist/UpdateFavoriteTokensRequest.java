package com.okinc.business.market.data.model.watchlist;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UpdateFavoriteTokensRequest {
    public final String accountId;
    public final FavoriteAction actionStatus;
    public final List<Integer> groupIds;
    public final List<FavoriteTokenData> tokens;
    public final String userUniqueId;
    public final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {FavoriteAction.Companion.serializer(), null, null, null, new ArrayListSerializer(FavoriteTokenData$$serializer.INSTANCE), new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateFavoriteTokensRequest copy$default(UpdateFavoriteTokensRequest updateFavoriteTokensRequest, FavoriteAction favoriteAction, String str, String str2, String str3, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            favoriteAction = updateFavoriteTokensRequest.actionStatus;
        }
        if ((i & 2) != 0) {
            str = updateFavoriteTokensRequest.accountId;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = updateFavoriteTokensRequest.walletAddress;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = updateFavoriteTokensRequest.userUniqueId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = updateFavoriteTokensRequest.tokens;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = updateFavoriteTokensRequest.groupIds;
        }
        return updateFavoriteTokensRequest.KWHzl(favoriteAction, str4, str5, str6, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateFavoriteTokensRequest KWHzl(@NotNull FavoriteAction favoriteAction, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<FavoriteTokenData> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(favoriteAction, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new UpdateFavoriteTokensRequest(favoriteAction, str, str2, str3, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateFavoriteTokensRequest)) {
            return false;
        }
        UpdateFavoriteTokensRequest updateFavoriteTokensRequest = (UpdateFavoriteTokensRequest) obj;
        return this.actionStatus == updateFavoriteTokensRequest.actionStatus && Intrinsics.EZpvd((Object) this.accountId, (Object) updateFavoriteTokensRequest.accountId) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) updateFavoriteTokensRequest.walletAddress) && Intrinsics.EZpvd((Object) this.userUniqueId, (Object) updateFavoriteTokensRequest.userUniqueId) && Intrinsics.EZpvd(this.tokens, updateFavoriteTokensRequest.tokens) && Intrinsics.EZpvd(this.groupIds, updateFavoriteTokensRequest.groupIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.actionStatus.hashCode();
        int iHashCode2 = this.accountId.hashCode();
        int iHashCode3 = this.walletAddress.hashCode();
        int iHashCode4 = this.userUniqueId.hashCode();
        int iHashCode5 = this.tokens.hashCode();
        List<Integer> list = this.groupIds;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list == null ? 0 : list.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateFavoriteTokensRequest(actionStatus=" + this.actionStatus + ", accountId=" + this.accountId + ", walletAddress=" + this.walletAddress + ", userUniqueId=" + this.userUniqueId + ", tokens=" + this.tokens + ", groupIds=" + this.groupIds + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UpdateFavoriteTokensRequest> serializer() {
            return UpdateFavoriteTokensRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UpdateFavoriteTokensRequest(int i, FavoriteAction favoriteAction, String str, String str2, String str3, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, UpdateFavoriteTokensRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.actionStatus = favoriteAction;
        this.accountId = str;
        this.walletAddress = str2;
        this.userUniqueId = str3;
        this.tokens = list;
        if ((i & 32) == 0) {
            this.groupIds = null;
        } else {
            this.groupIds = list2;
        }
    }

    public static final /* synthetic */ void KWHzl(UpdateFavoriteTokensRequest updateFavoriteTokensRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], updateFavoriteTokensRequest.actionStatus);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, updateFavoriteTokensRequest.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, updateFavoriteTokensRequest.walletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, updateFavoriteTokensRequest.userUniqueId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], updateFavoriteTokensRequest.tokens);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && updateFavoriteTokensRequest.groupIds == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], updateFavoriteTokensRequest.groupIds);
    }

    public UpdateFavoriteTokensRequest(@NotNull FavoriteAction favoriteAction, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<FavoriteTokenData> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(favoriteAction, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.actionStatus = favoriteAction;
        this.accountId = str;
        this.walletAddress = str2;
        this.userUniqueId = str3;
        this.tokens = list;
        this.groupIds = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 com.okinc.business.market.data.model.watchlist.FavoriteAction)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
 A[MD:(com.okinc.business.market.data.model.watchlist.FavoriteAction, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.watchlist.FavoriteTokenData>, java.util.List<java.lang.Integer>):void (m)] (LINE:17) call: com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest.<init>(com.okinc.business.market.data.model.watchlist.FavoriteAction, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ UpdateFavoriteTokensRequest(FavoriteAction favoriteAction, String str, String str2, String str3, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(favoriteAction, str, str2, str3, list, (i & 32) != 0 ? null : list2);
    }
}

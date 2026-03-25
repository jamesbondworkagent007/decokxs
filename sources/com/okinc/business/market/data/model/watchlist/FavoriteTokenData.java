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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class FavoriteTokenData {
    public final String chainId;
    public final String collectionId;
    public final List<Integer> groupIds;
    public final String tokenContractAddress;
    public final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FavoriteTokenData() {
        this((String) null, (String) null, (String) null, (List) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.data.model.watchlist.FavoriteTokenData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FavoriteTokenData copy$default(FavoriteTokenData favoriteTokenData, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoriteTokenData.tokenContractAddress;
        }
        if ((i & 2) != 0) {
            str2 = favoriteTokenData.chainId;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = favoriteTokenData.tokenSymbol;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            list = favoriteTokenData.groupIds;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            str4 = favoriteTokenData.collectionId;
        }
        return favoriteTokenData.copydefault(str, str5, str6, list2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FavoriteTokenData copydefault(@NotNull String str, @NotNull String str2, String str3, List<Integer> list, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FavoriteTokenData(str, str2, str3, list, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteTokenData)) {
            return false;
        }
        FavoriteTokenData favoriteTokenData = (FavoriteTokenData) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) favoriteTokenData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) favoriteTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) favoriteTokenData.tokenSymbol) && Intrinsics.EZpvd(this.groupIds, favoriteTokenData.groupIds) && Intrinsics.EZpvd((Object) this.collectionId, (Object) favoriteTokenData.collectionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenContractAddress.hashCode();
        int iHashCode2 = this.chainId.hashCode();
        String str = this.tokenSymbol;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        List<Integer> list = this.groupIds;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        String str2 = this.collectionId;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FavoriteTokenData(tokenContractAddress=" + this.tokenContractAddress + ", chainId=" + this.chainId + ", tokenSymbol=" + this.tokenSymbol + ", groupIds=" + this.groupIds + ", collectionId=" + this.collectionId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.watchlist.FavoriteTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FavoriteTokenData> serializer() {
            return FavoriteTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FavoriteTokenData(int i, String str, String str2, String str3, List list, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.groupIds = null;
        } else {
            this.groupIds = list;
        }
        if ((i & 16) == 0) {
            this.collectionId = null;
        } else {
            this.collectionId = str4;
        }
    }

    public static final /* synthetic */ void copydefault(FavoriteTokenData favoriteTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) favoriteTokenData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, favoriteTokenData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) favoriteTokenData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, favoriteTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) favoriteTokenData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, favoriteTokenData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || favoriteTokenData.groupIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], favoriteTokenData.groupIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && favoriteTokenData.collectionId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, favoriteTokenData.collectionId);
    }

    public FavoriteTokenData(@NotNull String str, @NotNull String str2, String str3, List<Integer> list, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tokenContractAddress = str;
        this.chainId = str2;
        this.tokenSymbol = str3;
        this.groupIds = list;
        this.collectionId = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String):void (m)] (LINE:33) call: com.okinc.business.market.data.model.watchlist.FavoriteTokenData.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ FavoriteTokenData(String str, String str2, String str3, List list, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4);
    }
}

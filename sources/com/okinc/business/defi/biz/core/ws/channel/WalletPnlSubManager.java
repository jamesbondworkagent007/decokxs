package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C11205cFp;
import o.C56402yEa;
import o.C56403yEb;
import o.IP;
import o.xZF;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletPnlSubManager extends WalletWSBaseArgsChannel<StateListAnimator, SubResponse> {
    public final IP<SubResponse.PnlPushData> OLrzqt;

    public WalletPnlSubManager() {
        super("dex-market-pnl-latest-pub", false, 500L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
        this.OLrzqt = new IP<>();
    }

    public static /* synthetic */ SubResponse.PnlPushData getPnl$default(WalletPnlSubManager walletPnlSubManager, String str, long j, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return walletPnlSubManager.KWHzl(str, j, str2);
    }

    public final SubResponse.PnlPushData KWHzl(@NotNull String str, long j, String str2) {
        SubResponse.PnlPushData next;
        Long chainId;
        Intrinsics.checkNotNullParameter(str, "");
        Iterator<SubResponse.PnlPushData> it = this.OLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SubResponse.PnlPushData pnlPushData = next;
            if (Intrinsics.EZpvd((Object) pnlPushData.getWalletAddress(), (Object) str) && (chainId = pnlPushData.getChainId()) != null && chainId.longValue() == j && Intrinsics.EZpvd((Object) pnlPushData.getTokenContractAddress(), (Object) str2)) {
                break;
            }
        }
        return next;
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        HashMap map = new HashMap();
        Iterator it = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription()).iterator();
        while (it.hasNext()) {
            List<SubResponse.PnlPushData> pnlPushList = ((SubResponse) it.next()).getPnlPushList();
            if (pnlPushList != null) {
                for (SubResponse.PnlPushData pnlPushData : pnlPushList) {
                    map.put(pnlPushData.getUniqueId(), pnlPushData);
                }
            }
        }
        Collection collectionValues = map.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
        this.OLrzqt.addAll(listAxsJAYsNCnLh);
        xZF.notifySubListener$default(this, C56402yEa.EZpvd(new SubResponse(listAxsJAYsNCnLh, 0L, 2, (DefaultConstructorMarker) null)), null, 2, null);
        return true;
    }

    @Override // o.xZF
    public void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        super.OLrzqt(str);
        this.OLrzqt.clear();
    }

    public static final class StateListAnimator extends WalletWSBaseArgsChannel.StateListAnimator {
        public final String AEQbTJ;

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String KWHzl() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String copydefault() {
            return this.AEQbTJ;
        }

        public StateListAnimator(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    @Serializable
    public static final class SubResponse extends WalletWSBaseArgsChannel.TaskDescription {
        private final List<PnlPushData> pnlPushList;
        private final long time;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(WalletPnlSubManager$SubResponse$PnlPushData$$serializer.INSTANCE), null};

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((List) null, 0L, 3, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager$SubResponse */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, List list, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                list = subResponse.pnlPushList;
            }
            if ((i & 2) != 0) {
                j = subResponse.time;
            }
            return subResponse.copy(list, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PnlPushData> component1() {
            return this.pnlPushList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.time;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(List<PnlPushData> list, long j) {
            return new SubResponse(list, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubResponse)) {
                return false;
            }
            SubResponse subResponse = (SubResponse) obj;
            return Intrinsics.EZpvd(this.pnlPushList, subResponse.pnlPushList) && this.time == subResponse.time;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PnlPushData> getPnlPushList() {
            return this.pnlPushList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getTime() {
            return this.time;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<PnlPushData> list = this.pnlPushList;
            return ((list == null ? 0 : list.hashCode()) * 31) + Long.hashCode(this.time);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(pnlPushList=" + this.pnlPushList + ", time=" + this.time + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletPnlSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, List list, long j, SerializationConstructorMarker serializationConstructorMarker) {
            this.pnlPushList = (i & 1) == 0 ? null : list;
            if ((i & 2) == 0) {
                this.time = System.currentTimeMillis();
            } else {
                this.time = j;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.pnlPushList != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], subResponse.pnlPushList);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && subResponse.time == System.currentTimeMillis()) {
                return;
            }
            compositeEncoder.encodeLongElement(serialDescriptor, 1, subResponse.time);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:long:0x0009: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:95)) : (r2v0 long))
 A[MD:(java.util.List<com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager$SubResponse$PnlPushData>, long):void (m)] (LINE:93) call: com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager.SubResponse.<init>(java.util.List, long):void type: THIS */
        public /* synthetic */ SubResponse(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? System.currentTimeMillis() : j);
        }

        public SubResponse(List<PnlPushData> list, long j) {
            this.pnlPushList = list;
            this.time = j;
        }

        @Override // o.xZF.ActionBar
        public String getMAddress() {
            PnlPushData pnlPushData;
            List<PnlPushData> list = this.pnlPushList;
            if (list == null || (pnlPushData = (PnlPushData) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) {
                return null;
            }
            return pnlPushData.getWalletAddress();
        }

        @Serializable
        public static final class PnlPushData {
            public static final int $stable = 0;
            public static final Companion Companion = new Companion(null);
            private final Long chainId;
            private final String holdAvgPrice;
            private final String spotBalance;
            private final String tokenContractAddress;
            private final String walletAddress;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public PnlPushData() {
                this((Long) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ PnlPushData copy$default(PnlPushData pnlPushData, Long l, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = pnlPushData.chainId;
                }
                if ((i & 2) != 0) {
                    str = pnlPushData.tokenContractAddress;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = pnlPushData.walletAddress;
                }
                String str6 = str2;
                if ((i & 8) != 0) {
                    str3 = pnlPushData.spotBalance;
                }
                String str7 = str3;
                if ((i & 16) != 0) {
                    str4 = pnlPushData.holdAvgPrice;
                }
                return pnlPushData.copy(l, str5, str6, str7, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long component1() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.tokenContractAddress;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.walletAddress;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.spotBalance;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component5() {
                return this.holdAvgPrice;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PnlPushData copy(Long l, String str, String str2, String str3, String str4) {
                return new PnlPushData(l, str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PnlPushData)) {
                    return false;
                }
                PnlPushData pnlPushData = (PnlPushData) obj;
                return Intrinsics.EZpvd(this.chainId, pnlPushData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) pnlPushData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) pnlPushData.walletAddress) && Intrinsics.EZpvd((Object) this.spotBalance, (Object) pnlPushData.spotBalance) && Intrinsics.EZpvd((Object) this.holdAvgPrice, (Object) pnlPushData.holdAvgPrice);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Long getChainId() {
                return this.chainId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getHoldAvgPrice() {
                return this.holdAvgPrice;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSpotBalance() {
                return this.spotBalance;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getTokenContractAddress() {
                return this.tokenContractAddress;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getWalletAddress() {
                return this.walletAddress;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Long l = this.chainId;
                int iHashCode = l == null ? 0 : l.hashCode();
                String str = this.tokenContractAddress;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                String str2 = this.walletAddress;
                int iHashCode3 = str2 == null ? 0 : str2.hashCode();
                String str3 = this.spotBalance;
                int iHashCode4 = str3 == null ? 0 : str3.hashCode();
                String str4 = this.holdAvgPrice;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "PnlPushData(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", walletAddress=" + this.walletAddress + ", spotBalance=" + this.spotBalance + ", holdAvgPrice=" + this.holdAvgPrice + ")";
            }

            public static final class Companion {
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                private Companion() {
                }

                /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager.SubResponse.PnlPushData.Companion.<init>():void type: THIS */
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<PnlPushData> serializer() {
                    return WalletPnlSubManager$SubResponse$PnlPushData$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ PnlPushData(int i, Long l, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.chainId = null;
                } else {
                    this.chainId = l;
                }
                if ((i & 2) == 0) {
                    this.tokenContractAddress = null;
                } else {
                    this.tokenContractAddress = str;
                }
                if ((i & 4) == 0) {
                    this.walletAddress = null;
                } else {
                    this.walletAddress = str2;
                }
                if ((i & 8) == 0) {
                    this.spotBalance = null;
                } else {
                    this.spotBalance = str3;
                }
                if ((i & 16) == 0) {
                    this.holdAvgPrice = null;
                } else {
                    this.holdAvgPrice = str4;
                }
            }

            public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PnlPushData pnlPushData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || pnlPushData.chainId != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, pnlPushData.chainId);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || pnlPushData.tokenContractAddress != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, pnlPushData.tokenContractAddress);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || pnlPushData.walletAddress != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, pnlPushData.walletAddress);
                }
                if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || pnlPushData.spotBalance != null) {
                    compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, pnlPushData.spotBalance);
                }
                if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && pnlPushData.holdAvgPrice == null) {
                    return;
                }
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, pnlPushData.holdAvgPrice);
            }

            public PnlPushData(Long l, String str, String str2, String str3, String str4) {
                this.chainId = l;
                this.tokenContractAddress = str;
                this.walletAddress = str2;
                this.spotBalance = str3;
                this.holdAvgPrice = str4;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:108) call: com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager.SubResponse.PnlPushData.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
            public /* synthetic */ PnlPushData(Long l, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
            }

            public final String getUniqueId() {
                return this.chainId + "-" + this.tokenContractAddress;
            }
        }

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.TaskDescription
        public String getMSubArgsUniqueId() {
            PnlPushData pnlPushData;
            String walletAddress;
            List<PnlPushData> list = this.pnlPushList;
            return (list == null || (pnlPushData = (PnlPushData) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (walletAddress = pnlPushData.getWalletAddress()) == null) ? "" : walletAddress;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            List<PnlPushData> list = this.pnlPushList;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PnlPushData) it.next()).getUniqueId());
                }
                String string = arrayList.toString();
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Long.valueOf(((SubResponse) t).getTime()), Long.valueOf(((SubResponse) t2).getTime()));
        }
    }
}

package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.business.defi.biz.core.ws.channel.WalletLimitOrderAssetSubManager;
import com.okinc.business.defi.biz.model.ChainAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C11205cFp;
import o.C12827cuN;
import o.C58266yxz;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.xZF;
import o.yBP;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLimitOrderAssetSubManager extends xZF<SubResponse> {
    public WalletLimitOrderAssetSubManager() {
        super("dex-strategy-balance", true, false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    @Override // o.xZF
    public boolean OLrzqt(@NotNull final List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(false).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.cGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletLimitOrderAssetSubManager.copydefault(list, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.cGs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return WalletLimitOrderAssetSubManager.KWHzl(function1, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.cGw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletLimitOrderAssetSubManager.EZpvd(this.copydefault, (java.util.ArrayList) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletLimitOrderAssetSubManager.copydefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return WalletLimitOrderAssetSubManager.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cGv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                WalletLimitOrderAssetSubManager.valueOf(function13, obj);
            }
        });
        return true;
    }

    public static final ArrayList KWHzl(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (ArrayList) function1.invoke(obj);
    }

    public static final ArrayList copydefault(List list, AbstractC12782ctV abstractC12782ctV) {
        Object next;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        ArrayList<ChainAddress> arrayListIsConnected = abstractC12782ctV.isConnected();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SubResponse subResponse = (SubResponse) it.next();
            Iterator<T> it2 = arrayListIsConnected.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((Object) ((ChainAddress) next).getAddress(), (Object) subResponse.getMAddress())) {
                    break;
                }
            }
            if (next != null) {
                arrayList.add(subResponse);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(WalletLimitOrderAssetSubManager walletLimitOrderAssetSubManager, ArrayList arrayList) {
        Intrinsics.copydefault(arrayList);
        xZF.notifySubListener$default(walletLimitOrderAssetSubManager, arrayList, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(WalletLimitOrderAssetSubManager walletLimitOrderAssetSubManager, Throwable th) {
        xZF.notifySubListener$default(walletLimitOrderAssetSubManager, yDY.AhwBna(), null, 2, null);
        return Unit.INSTANCE;
    }

    @Serializable
    public static final class SubResponse extends xZF.ActionBar {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String address;
        private final Long chainId;
        private final String chainName;
        private final String coinAmount;
        private final Long coinId;
        private final String currencyAmount;
        private final Integer decimalNum;
        private final Boolean hasPercent;
        private final Boolean hasPrice;
        private final String imageUrl;
        private final String price;
        private final String priceChangePercent24h;
        private final String symbol;
        private final String userAddress;
        private final Integer vDecimalNum;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, (String) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (Boolean) null, (String) null, (Boolean) null, (String) null, 32767, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.userAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component10() {
            return this.decimalNum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer component11() {
            return this.vDecimalNum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component12() {
            return this.hasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component13() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component14() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component15() {
            return this.priceChangePercent24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component3() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component4() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component9() {
            return this.currencyAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Boolean bool, String str8, Boolean bool2, String str9) {
            return new SubResponse(str, str2, l, l2, str3, str4, str5, str6, str7, num, num2, bool, str8, bool2, str9);
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
            return Intrinsics.EZpvd((Object) this.userAddress, (Object) subResponse.userAddress) && Intrinsics.EZpvd((Object) this.address, (Object) subResponse.address) && Intrinsics.EZpvd(this.coinId, subResponse.coinId) && Intrinsics.EZpvd(this.chainId, subResponse.chainId) && Intrinsics.EZpvd((Object) this.symbol, (Object) subResponse.symbol) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) subResponse.imageUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) subResponse.chainName) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) subResponse.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) subResponse.currencyAmount) && Intrinsics.EZpvd(this.decimalNum, subResponse.decimalNum) && Intrinsics.EZpvd(this.vDecimalNum, subResponse.vDecimalNum) && Intrinsics.EZpvd(this.hasPrice, subResponse.hasPrice) && Intrinsics.EZpvd((Object) this.price, (Object) subResponse.price) && Intrinsics.EZpvd(this.hasPercent, subResponse.hasPercent) && Intrinsics.EZpvd((Object) this.priceChangePercent24h, (Object) subResponse.priceChangePercent24h);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getChainId() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChainName() {
            return this.chainName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinAmount() {
            return this.coinAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurrencyAmount() {
            return this.currencyAmount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getDecimalNum() {
            return this.decimalNum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getHasPercent() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getHasPrice() {
            return this.hasPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return this.userAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPrice() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriceChangePercent24h() {
            return this.priceChangePercent24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSymbol() {
            return this.symbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUserAddress() {
            return this.userAddress;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer getVDecimalNum() {
            return this.vDecimalNum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.userAddress;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.address;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            Long l = this.coinId;
            int iHashCode3 = l == null ? 0 : l.hashCode();
            Long l2 = this.chainId;
            int iHashCode4 = l2 == null ? 0 : l2.hashCode();
            String str3 = this.symbol;
            int iHashCode5 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.imageUrl;
            int iHashCode6 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.chainName;
            int iHashCode7 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.coinAmount;
            int iHashCode8 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.currencyAmount;
            int iHashCode9 = str7 == null ? 0 : str7.hashCode();
            Integer num = this.decimalNum;
            int iHashCode10 = num == null ? 0 : num.hashCode();
            Integer num2 = this.vDecimalNum;
            int iHashCode11 = num2 == null ? 0 : num2.hashCode();
            Boolean bool = this.hasPrice;
            int iHashCode12 = bool == null ? 0 : bool.hashCode();
            String str8 = this.price;
            int iHashCode13 = str8 == null ? 0 : str8.hashCode();
            Boolean bool2 = this.hasPercent;
            int iHashCode14 = bool2 == null ? 0 : bool2.hashCode();
            String str9 = this.priceChangePercent24h;
            return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str9 == null ? 0 : str9.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(userAddress=" + this.userAddress + ", address=" + this.address + ", coinId=" + this.coinId + ", chainId=" + this.chainId + ", symbol=" + this.symbol + ", imageUrl=" + this.imageUrl + ", chainName=" + this.chainName + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", decimalNum=" + this.decimalNum + ", vDecimalNum=" + this.vDecimalNum + ", hasPrice=" + this.hasPrice + ", price=" + this.price + ", hasPercent=" + this.hasPercent + ", priceChangePercent24h=" + this.priceChangePercent24h + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletLimitOrderAssetSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletLimitOrderAssetSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Boolean bool, String str8, Boolean bool2, String str9, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.userAddress = "";
            } else {
                this.userAddress = str;
            }
            if ((i & 2) == 0) {
                this.address = "";
            } else {
                this.address = str2;
            }
            this.coinId = (i & 4) == 0 ? 0L : l;
            this.chainId = (i & 8) == 0 ? 0L : l2;
            if ((i & 16) == 0) {
                this.symbol = "";
            } else {
                this.symbol = str3;
            }
            if ((i & 32) == 0) {
                this.imageUrl = "";
            } else {
                this.imageUrl = str4;
            }
            if ((i & 64) == 0) {
                this.chainName = "";
            } else {
                this.chainName = str5;
            }
            if ((i & 128) == 0) {
                this.coinAmount = "";
            } else {
                this.coinAmount = str6;
            }
            if ((i & 256) == 0) {
                this.currencyAmount = "";
            } else {
                this.currencyAmount = str7;
            }
            this.decimalNum = (i & 512) == 0 ? 0 : num;
            this.vDecimalNum = (i & 1024) == 0 ? 0 : num2;
            this.hasPrice = (i & 2048) == 0 ? Boolean.FALSE : bool;
            if ((i & 4096) == 0) {
                this.price = "";
            } else {
                this.price = str8;
            }
            this.hasPercent = (i & 8192) == 0 ? Boolean.FALSE : bool2;
            if ((i & 16384) == 0) {
                this.priceChangePercent24h = "";
            } else {
                this.priceChangePercent24h = str9;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            Integer num;
            Integer num2;
            Long l;
            Long l2;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) subResponse.userAddress, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.userAddress);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) subResponse.address, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, subResponse.address);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (l2 = subResponse.coinId) == null || l2.longValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (l = subResponse.chainId) == null || l.longValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, subResponse.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) subResponse.symbol, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subResponse.symbol);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) subResponse.imageUrl, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, subResponse.imageUrl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) subResponse.chainName, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, subResponse.chainName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) subResponse.coinAmount, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, subResponse.coinAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) subResponse.currencyAmount, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, subResponse.currencyAmount);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || (num2 = subResponse.decimalNum) == null || num2.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, subResponse.decimalNum);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || (num = subResponse.vDecimalNum) == null || num.intValue() != 0) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, subResponse.vDecimalNum);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(subResponse.hasPrice, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, subResponse.hasPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) subResponse.price, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, subResponse.price);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(subResponse.hasPercent, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, subResponse.hasPercent);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) && Intrinsics.EZpvd((Object) subResponse.priceChangePercent24h, (Object) "")) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, subResponse.priceChangePercent24h);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r32v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r32v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r32v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0021: ARITH (r32v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r32v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r32v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r32v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r32v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r32v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0054: ARITH (r32v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0060: ARITH (r32v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 java.lang.Integer))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x006b: ARITH (r32v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006f: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r28v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0074: ARITH (r32v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x007c: ARITH (r32v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0080: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r30v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0085: ARITH (r32v0 int) & (16384 int) A[WRAPPED]) == (0 int)) ? (r31v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:49) call: com.okinc.business.defi.biz.core.ws.channel.WalletLimitOrderAssetSubManager.SubResponse.<init>(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
        public /* synthetic */ SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Boolean bool, String str8, Boolean bool2, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : l, (i & 8) != 0 ? 0L : l2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? 0 : num, (i & 1024) != 0 ? 0 : num2, (i & 2048) != 0 ? Boolean.FALSE : bool, (i & 4096) != 0 ? "" : str8, (i & 8192) != 0 ? Boolean.FALSE : bool2, (i & 16384) == 0 ? str9 : "");
        }

        public SubResponse(String str, String str2, Long l, Long l2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2, Boolean bool, String str8, Boolean bool2, String str9) {
            this.userAddress = str;
            this.address = str2;
            this.coinId = l;
            this.chainId = l2;
            this.symbol = str3;
            this.imageUrl = str4;
            this.chainName = str5;
            this.coinAmount = str6;
            this.currencyAmount = str7;
            this.decimalNum = num;
            this.vDecimalNum = num2;
            this.hasPrice = bool;
            this.price = str8;
            this.hasPercent = bool2;
            this.priceChangePercent24h = str9;
        }

        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            return String.valueOf(this.coinId);
        }
    }
}

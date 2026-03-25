package com.okinc.business.defi.biz.core.ws.channel;

import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C11205cFp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletTickerSubManager extends WalletWSBaseArgsChannel<TaskDescription, SubResponse> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xZF
    public boolean OLrzqt(@NotNull List<SubResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return false;
    }

    public WalletTickerSubManager() {
        super("tickers", false, 0L, SubResponse.Companion.serializer(), C11205cFp.EZpvd.QOLQEE());
    }

    public static final class TaskDescription extends WalletWSBaseArgsChannel.StateListAnimator {
        public final String EZpvd;
        public final long OLrzqt;

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String OLrzqt() {
            return null;
        }

        public TaskDescription(long j, String str) {
            this.OLrzqt = j;
            this.EZpvd = str;
        }

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String copydefault() {
            return KWHzl();
        }

        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.StateListAnimator
        public String KWHzl() {
            String str = this.EZpvd;
            if (str == null || str.length() == 0) {
                return String.valueOf(this.OLrzqt);
            }
            return this.OLrzqt + "-" + this.EZpvd;
        }
    }

    @Serializable
    public static final class SubResponse extends WalletWSBaseArgsChannel.TaskDescription {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String coinId;
        private final Boolean hasPercent;
        private final String instId;
        private final String price;
        private final String priceChangePercent24h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SubResponse() {
            this((String) null, (Boolean) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubResponse copy$default(SubResponse subResponse, String str, Boolean bool, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subResponse.coinId;
            }
            if ((i & 2) != 0) {
                bool = subResponse.hasPercent;
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                str2 = subResponse.instId;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = subResponse.price;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                str4 = subResponse.priceChangePercent24h;
            }
            return subResponse.copy(str, bool2, str5, str6, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component2() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.instId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.price;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.priceChangePercent24h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubResponse copy(String str, Boolean bool, String str2, String str3, String str4) {
            return new SubResponse(str, bool, str2, str3, str4);
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
            return Intrinsics.EZpvd((Object) this.coinId, (Object) subResponse.coinId) && Intrinsics.EZpvd(this.hasPercent, subResponse.hasPercent) && Intrinsics.EZpvd((Object) this.instId, (Object) subResponse.instId) && Intrinsics.EZpvd((Object) this.price, (Object) subResponse.price) && Intrinsics.EZpvd((Object) this.priceChangePercent24h, (Object) subResponse.priceChangePercent24h);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCoinId() {
            return this.coinId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean getHasPercent() {
            return this.hasPercent;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getInstId() {
            return this.instId;
        }

        @Override // o.xZF.ActionBar
        public String getMAddress() {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.wallet.core.ws.WalletWSBaseArgsChannel.TaskDescription
        public String getMSubArgsUniqueId() {
            String str = this.instId;
            return str == null ? "" : str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.xZF.ActionBar
        public String getMUniqueId() {
            String str = this.instId;
            return str == null ? "" : str;
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
        public int hashCode() {
            String str = this.coinId;
            int iHashCode = str == null ? 0 : str.hashCode();
            Boolean bool = this.hasPercent;
            int iHashCode2 = bool == null ? 0 : bool.hashCode();
            String str2 = this.instId;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.price;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.priceChangePercent24h;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubResponse(coinId=" + this.coinId + ", hasPercent=" + this.hasPercent + ", instId=" + this.instId + ", price=" + this.price + ", priceChangePercent24h=" + this.priceChangePercent24h + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.ws.channel.WalletTickerSubManager.SubResponse.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SubResponse> serializer() {
                return WalletTickerSubManager$SubResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SubResponse(int i, String str, Boolean bool, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.coinId = null;
            } else {
                this.coinId = str;
            }
            if ((i & 2) == 0) {
                this.hasPercent = Boolean.FALSE;
            } else {
                this.hasPercent = bool;
            }
            if ((i & 4) == 0) {
                this.instId = null;
            } else {
                this.instId = str2;
            }
            if ((i & 8) == 0) {
                this.price = null;
            } else {
                this.price = str3;
            }
            if ((i & 16) == 0) {
                this.priceChangePercent24h = null;
            } else {
                this.priceChangePercent24h = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SubResponse subResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || subResponse.coinId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, subResponse.coinId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(subResponse.hasPercent, Boolean.FALSE)) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, subResponse.hasPercent);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || subResponse.instId != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, subResponse.instId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || subResponse.price != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, subResponse.price);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && subResponse.priceChangePercent24h == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, subResponse.priceChangePercent24h);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Boolean:0x000e: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000c: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r6v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.business.defi.biz.core.ws.channel.WalletTickerSubManager.SubResponse.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SubResponse(String str, Boolean bool, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }

        public SubResponse(String str, Boolean bool, String str2, String str3, String str4) {
            this.coinId = str;
            this.hasPercent = bool;
            this.instId = str2;
            this.price = str3;
            this.priceChangePercent24h = str4;
        }
    }
}

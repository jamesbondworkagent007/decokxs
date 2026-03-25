package com.okinc.buysell.view.cryptolist;

import androidx.camera.video.AudioStats;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import com.okinc.okpaymentapi.data.remote.model.experience.DexInfo;
import com.okinc.okpaymentapi.data.remote.model.management.EarnOption;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SearchHistoryItem extends CryptoListItem {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.view.cryptolist.SearchHistoryItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SearchHistoryItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract long getTimeStamp();

    private SearchHistoryItem() {
        super(null);
    }

    public static final class HistoryTokenItem extends SearchHistoryItem {
        public static final int $stable = 8;
        private final String cryptoId;
        private final String cryptoName;
        private CurrencyToken currencyToken;
        private String primary;
        private String secondary;
        private final long timeStamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryTokenItem copy$default(HistoryTokenItem historyTokenItem, String str, String str2, String str3, String str4, long j, CurrencyToken currencyToken, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyTokenItem.cryptoId;
            }
            if ((i & 2) != 0) {
                str2 = historyTokenItem.cryptoName;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = historyTokenItem.primary;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = historyTokenItem.secondary;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                j = historyTokenItem.timeStamp;
            }
            long j2 = j;
            if ((i & 32) != 0) {
                currencyToken = historyTokenItem.currencyToken;
            }
            return historyTokenItem.copy(str, str5, str6, str7, j2, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.cryptoId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component5() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken component6() {
            return this.currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryTokenItem copy(@NotNull String str, @NotNull String str2, String str3, String str4, long j, @NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            return new HistoryTokenItem(str, str2, str3, str4, j, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryTokenItem)) {
                return false;
            }
            HistoryTokenItem historyTokenItem = (HistoryTokenItem) obj;
            return Intrinsics.EZpvd((Object) this.cryptoId, (Object) historyTokenItem.cryptoId) && Intrinsics.EZpvd((Object) this.cryptoName, (Object) historyTokenItem.cryptoName) && Intrinsics.EZpvd((Object) this.primary, (Object) historyTokenItem.primary) && Intrinsics.EZpvd((Object) this.secondary, (Object) historyTokenItem.secondary) && this.timeStamp == historyTokenItem.timeStamp && Intrinsics.EZpvd(this.currencyToken, historyTokenItem.currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.cryptoId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken getCurrencyToken() {
            return this.currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.SearchHistoryItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.cryptoId.hashCode();
            int iHashCode2 = this.cryptoName.hashCode();
            String str = this.primary;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.secondary;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.currencyToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyToken(@NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(currencyToken, "");
            this.currencyToken = currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.primary = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.secondary = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryTokenItem(cryptoId=" + this.cryptoId + ", cryptoName=" + this.cryptoName + ", primary=" + this.primary + ", secondary=" + this.secondary + ", timeStamp=" + this.timeStamp + ", currencyToken=" + this.currencyToken + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r47v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r47v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r47v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r44v0 long))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken:?: TERNARY null = ((wrap:int:0x001b: ARITH (r47v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOption:?: CAST (com.okinc.okpaymentapi.data.remote.model.management.EarnOption) (null com.okinc.okpaymentapi.data.remote.model.management.EarnOption))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:kotlin.Pair:?: CAST (kotlin.Pair) (null kotlin.Pair))
  false
  false
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.DexInfo:?: CAST (com.okinc.okpaymentapi.data.remote.model.experience.DexInfo) (null com.okinc.okpaymentapi.data.remote.model.experience.DexInfo))
  (67108863 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List, java.lang.String, kotlin.Pair, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:136) call: com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken.<init>(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List, java.lang.String, kotlin.Pair, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken):void (m)] (LINE:130) call: com.okinc.buysell.view.cryptolist.SearchHistoryItem.HistoryTokenItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken):void type: THIS */
        public /* synthetic */ HistoryTokenItem(String str, String str2, String str3, String str4, long j, CurrencyToken currencyToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? new CurrencyToken((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (EarnOption) null, (List) null, (String) null, (Pair) null, false, false, (DexInfo) null, 67108863, (DefaultConstructorMarker) null) : currencyToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryTokenItem(@NotNull String str, @NotNull String str2, String str3, String str4, long j, @NotNull CurrencyToken currencyToken) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            this.cryptoId = str;
            this.cryptoName = str2;
            this.primary = str3;
            this.secondary = str4;
            this.timeStamp = j;
            this.currencyToken = currencyToken;
        }
    }

    public static final class HistoryDexItem extends SearchHistoryItem {
        public static final int $stable = 8;
        private final String cryptoId;
        private final String cryptoName;
        private CurrencyToken currencyToken;
        private String primary;
        private String secondary;
        private final long timeStamp;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HistoryDexItem copy$default(HistoryDexItem historyDexItem, String str, String str2, String str3, String str4, long j, CurrencyToken currencyToken, int i, Object obj) {
            if ((i & 1) != 0) {
                str = historyDexItem.cryptoId;
            }
            if ((i & 2) != 0) {
                str2 = historyDexItem.cryptoName;
            }
            String str5 = str2;
            if ((i & 4) != 0) {
                str3 = historyDexItem.primary;
            }
            String str6 = str3;
            if ((i & 8) != 0) {
                str4 = historyDexItem.secondary;
            }
            String str7 = str4;
            if ((i & 16) != 0) {
                j = historyDexItem.timeStamp;
            }
            long j2 = j;
            if ((i & 32) != 0) {
                currencyToken = historyDexItem.currencyToken;
            }
            return historyDexItem.copy(str, str5, str6, str7, j2, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.cryptoId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component5() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken component6() {
            return this.currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HistoryDexItem copy(@NotNull String str, @NotNull String str2, String str3, String str4, long j, @NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            return new HistoryDexItem(str, str2, str3, str4, j, currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HistoryDexItem)) {
                return false;
            }
            HistoryDexItem historyDexItem = (HistoryDexItem) obj;
            return Intrinsics.EZpvd((Object) this.cryptoId, (Object) historyDexItem.cryptoId) && Intrinsics.EZpvd((Object) this.cryptoName, (Object) historyDexItem.cryptoName) && Intrinsics.EZpvd((Object) this.primary, (Object) historyDexItem.primary) && Intrinsics.EZpvd((Object) this.secondary, (Object) historyDexItem.secondary) && this.timeStamp == historyDexItem.timeStamp && Intrinsics.EZpvd(this.currencyToken, historyDexItem.currencyToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.cryptoId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.cryptoName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken getCurrencyToken() {
            return this.currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.primary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.secondary;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.SearchHistoryItem
        public long getTimeStamp() {
            return this.timeStamp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.cryptoId.hashCode();
            int iHashCode2 = this.cryptoName.hashCode();
            String str = this.primary;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.secondary;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.currencyToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCurrencyToken(@NotNull CurrencyToken currencyToken) {
            Intrinsics.checkNotNullParameter(currencyToken, "");
            this.currencyToken = currencyToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.primary = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.secondary = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HistoryDexItem(cryptoId=" + this.cryptoId + ", cryptoName=" + this.cryptoName + ", primary=" + this.primary + ", secondary=" + this.secondary + ", timeStamp=" + this.timeStamp + ", currencyToken=" + this.currencyToken + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (r40v0 java.lang.String)
  (r41v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r47v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r47v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0011: ARITH (r47v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r44v0 long))
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken:?: TERNARY null = ((wrap:int:0x001b: ARITH (r47v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:double:SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.EarnOption:?: CAST (com.okinc.okpaymentapi.data.remote.model.management.EarnOption) (null com.okinc.okpaymentapi.data.remote.model.management.EarnOption))
  (wrap:java.util.List:?: CAST (java.util.List) (null java.util.List))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:kotlin.Pair:?: CAST (kotlin.Pair) (null kotlin.Pair))
  false
  false
  (wrap:com.okinc.okpaymentapi.data.remote.model.experience.DexInfo:?: CAST (com.okinc.okpaymentapi.data.remote.model.experience.DexInfo) (null com.okinc.okpaymentapi.data.remote.model.experience.DexInfo))
  (67108863 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List, java.lang.String, kotlin.Pair, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:146) call: com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken.<init>(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.EarnOption, java.util.List, java.lang.String, kotlin.Pair, boolean, boolean, com.okinc.okpaymentapi.data.remote.model.experience.DexInfo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken):void (m)] (LINE:140) call: com.okinc.buysell.view.cryptolist.SearchHistoryItem.HistoryDexItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken):void type: THIS */
        public /* synthetic */ HistoryDexItem(String str, String str2, String str3, String str4, long j, CurrencyToken currencyToken, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? new CurrencyToken((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (String) null, (EarnOption) null, (List) null, (String) null, (Pair) null, false, false, (DexInfo) null, 67108863, (DefaultConstructorMarker) null) : currencyToken);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HistoryDexItem(@NotNull String str, @NotNull String str2, String str3, String str4, long j, @NotNull CurrencyToken currencyToken) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            this.cryptoId = str;
            this.cryptoName = str2;
            this.primary = str3;
            this.secondary = str4;
            this.timeStamp = j;
            this.currencyToken = currencyToken;
        }
    }
}

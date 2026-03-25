package com.okinc.wallet.api;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.api.bean.DexTransferData;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.InterfaceC43217rlC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface WalletDexService extends InterfaceC43217rlC {
    AbstractC58185ywX<AAFreeGasInfo> AEQbTJ(@NotNull String str, @NotNull String str2);

    Fragment EZpvd(@NotNull String str, @NotNull ArrayList<Long> arrayList, long j, String str2);

    AbstractC58185ywX<ArrayList<SupportedMevNodeBean>> OLrzqt();

    AbstractC58185ywX<FeeInfo> copydefault(@NotNull String str, String str2, @NotNull String str3, @NotNull DexTransferData dexTransferData, Integer num, String str4);

    public static final class FeeInfo {
        public static final int $stable = 0;
        private final String feeCurrencyValue;
        private final String feeSymbol;
        private final String feeValue;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FeeInfo() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeCurrencyValue() {
            return this.feeCurrencyValue;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeSymbol() {
            return this.feeSymbol;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFeeValue() {
            return this.feeValue;
        }

        public FeeInfo(String str, String str2, String str3) {
            this.feeValue = str;
            this.feeSymbol = str2;
            this.feeCurrencyValue = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.wallet.api.WalletDexService.FeeInfo.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ FeeInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public static final class AAFreeGasInfo {
        public static final int $stable = 0;
        public static final int CODE_ACTIVITY_NOT_OPEN = 170003;
        public static final int CODE_EXCEED_MAX_FREE_QUOTA = 170006;
        public static final int CODE_EXCEED_MAX_TIMES_DAILY = 170004;
        public static final int CODE_NOT_SUPPORT = -1;
        public static final int CODE_SUPPORT = 0;
        public static final int CODE_VERSION_TOO_LOW = 170005;
        public static final StateListAnimator Companion = new StateListAnimator(null);
        private final int availableTimes;
        private final int errorCode;
        private final String limitGasValuation;
        private final int totalTimes;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AAFreeGasInfo() {
            this(null, 0, 0, 0, 15, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getAvailableTimes() {
            return this.availableTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getErrorCode() {
            return this.errorCode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getLimitGasValuation() {
            return this.limitGasValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTotalTimes() {
            return this.totalTimes;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isFreeGas() {
            return this.errorCode == 0;
        }

        public AAFreeGasInfo(@NotNull String str, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(str, "");
            this.limitGasValuation = str;
            this.totalTimes = i;
            this.availableTimes = i2;
            this.errorCode = i3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r5v0 int))
 A[MD:(java.lang.String, int, int, int):void (m)] (LINE:29) call: com.okinc.wallet.api.WalletDexService.AAFreeGasInfo.<init>(java.lang.String, int, int, int):void type: THIS */
        public /* synthetic */ AAFreeGasInfo(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? -1 : i3);
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.api.WalletDexService.AAFreeGasInfo.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }
    }

    public static final class SupportedMevNodeBean {
        public static final int $stable = 8;
        private List<Integer> chainIds;
        private String gas;
        private String name;
        private String priorityRate;
        private String supplier;
        private String vendorIcon;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SupportedMevNodeBean() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Integer> getChainIds() {
            return this.chainIds;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getGas() {
            return this.gas;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getName() {
            return this.name;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPriorityRate() {
            return this.priorityRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSupplier() {
            return this.supplier;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getVendorIcon() {
            return this.vendorIcon;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setChainIds(List<Integer> list) {
            this.chainIds = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setGas(String str) {
            this.gas = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setName(String str) {
            this.name = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPriorityRate(String str) {
            this.priorityRate = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setSupplier(String str) {
            this.supplier = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setVendorIcon(String str) {
            this.vendorIcon = str;
        }

        public SupportedMevNodeBean(String str, String str2, String str3, List<Integer> list, String str4, String str5) {
            this.name = str;
            this.gas = str2;
            this.supplier = str3;
            this.chainIds = list;
            this.priorityRate = str4;
            this.vendorIcon = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.Integer>, java.lang.String, java.lang.String):void (m)] (LINE:52) call: com.okinc.wallet.api.WalletDexService.SupportedMevNodeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ SupportedMevNodeBean(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
        }
    }

    public static final class Application {
        public static /* synthetic */ Fragment createWalletProfileAssetDetailFragment$default(WalletDexService walletDexService, String str, ArrayList arrayList, long j, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWalletProfileAssetDetailFragment");
            }
            if ((i & 8) != 0) {
                str2 = "3";
            }
            return walletDexService.EZpvd(str, arrayList, j, str2);
        }
    }
}

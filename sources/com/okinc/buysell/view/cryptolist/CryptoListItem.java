package com.okinc.buysell.view.cryptolist;

import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC47217tlq;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class CryptoListItem implements InterfaceC47217tlq {
    public static final int $stable = 8;
    private final String cefiId;
    private final boolean cexListing;
    private double dexRiskLevel;
    private double primarySimilarity;
    private double secondarySimilarity;
    private final String tokenContractAddress;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.view.cryptolist.CryptoListItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CryptoListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47217tlq
    public String getCefiId() {
        return this.cefiId;
    }

    public abstract String getCryptoId();

    public abstract String getCryptoName();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double getDexRiskLevel() {
        return this.dexRiskLevel;
    }

    @Override // o.InterfaceC47221tlu
    public abstract String getPrimary();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getPrimarySimilarity() {
        return this.primarySimilarity;
    }

    @Override // o.InterfaceC47221tlu
    public abstract String getSecondary();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public double getSecondarySimilarity() {
        return this.secondarySimilarity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47217tlq
    public String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setDexRiskLevel(double d) {
        this.dexRiskLevel = d;
    }

    public abstract void setPrimary(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setPrimarySimilarity(double d) {
        this.primarySimilarity = d;
    }

    public abstract void setSecondary(String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC47221tlu
    public void setSecondarySimilarity(double d) {
        this.secondarySimilarity = d;
    }

    private CryptoListItem() {
        this.dexRiskLevel = -1.0d;
    }

    @Override // o.InterfaceC47217tlq
    public Boolean getCexListing() {
        return Boolean.valueOf(this.cexListing);
    }

    public static final class BuyCryptoListItem extends CryptoListItem {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final boolean AhwBna;
        public String DbNXlk;
        public final String EZpvd;
        public final String KWHzl;
        public final CurrencyToken OLrzqt;
        public final String copydefault;
        public final PercentageChange djBIcL;
        public final String gEmmrt;
        public final String valueOf;
        public String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuyCryptoListItem AEQbTJ(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull PercentageChange percentageChange, String str8, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            return new BuyCryptoListItem(str, str2, str3, str4, currencyToken, str5, str6, str7, percentageChange, str8, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PercentageChange copydefault() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyCryptoListItem)) {
                return false;
            }
            BuyCryptoListItem buyCryptoListItem = (BuyCryptoListItem) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) buyCryptoListItem.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buyCryptoListItem.AEQbTJ) && Intrinsics.EZpvd((Object) this.values, (Object) buyCryptoListItem.values) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) buyCryptoListItem.DbNXlk) && Intrinsics.EZpvd(this.OLrzqt, buyCryptoListItem.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) buyCryptoListItem.gEmmrt) && Intrinsics.EZpvd((Object) this.valueOf, (Object) buyCryptoListItem.valueOf) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) buyCryptoListItem.AYXKKw) && this.djBIcL == buyCryptoListItem.djBIcL && Intrinsics.EZpvd((Object) this.EZpvd, (Object) buyCryptoListItem.EZpvd) && this.AhwBna == buyCryptoListItem.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47217tlq
        public String getCefiId() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            String str = this.values;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.DbNXlk;
            int iHashCode4 = str2 == null ? 0 : str2.hashCode();
            int iHashCode5 = this.OLrzqt.hashCode();
            int iHashCode6 = this.gEmmrt.hashCode();
            int iHashCode7 = this.valueOf.hashCode();
            int iHashCode8 = this.AYXKKw.hashCode();
            int iHashCode9 = this.djBIcL.hashCode();
            String str3 = this.EZpvd;
            return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.values = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BuyCryptoListItem(cryptoId=" + this.KWHzl + ", cryptoName=" + this.AEQbTJ + ", primary=" + this.values + ", secondary=" + this.DbNXlk + ", crypto=" + this.OLrzqt + ", iconUrl=" + this.gEmmrt + ", price=" + this.valueOf + ", percentage=" + this.AYXKKw + ", percentageChange=" + this.djBIcL + ", earnRate=" + this.EZpvd + ", isStableCoin=" + this.AhwBna + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyCryptoListItem(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull PercentageChange percentageChange, String str8, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.values = str3;
            this.DbNXlk = str4;
            this.OLrzqt = currencyToken;
            this.gEmmrt = str5;
            this.valueOf = str6;
            this.AYXKKw = str7;
            this.djBIcL = percentageChange;
            this.EZpvd = str8;
            this.AhwBna = z;
            this.copydefault = getCryptoId();
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PercentageChange {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ PercentageChange[] $VALUES;
            public static final PercentageChange UP = new PercentageChange("UP", 0);
            public static final PercentageChange DOWN = new PercentageChange("DOWN", 1);
            public static final PercentageChange NO_CHANGE = new PercentageChange("NO_CHANGE", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ PercentageChange[] $values() {
                return new PercentageChange[]{UP, DOWN, NO_CHANGE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<PercentageChange> getEntries() {
                return $ENTRIES;
            }

            private PercentageChange(String str, int i) {
            }

            static {
                PercentageChange[] percentageChangeArr$values = $values();
                $VALUES = percentageChangeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(percentageChangeArr$values);
            }

            public static PercentageChange valueOf(String str) {
                return (PercentageChange) Enum.valueOf(PercentageChange.class, str);
            }

            public static PercentageChange[] values() {
                return (PercentageChange[]) $VALUES.clone();
            }
        }
    }

    public static final class BuyDexListItem extends CryptoListItem {
        public final String AEQbTJ;
        public String AYXKKw;
        public String AhwBna;
        public String DbNXlk;
        public final boolean EZpvd;
        public final String KWHzl;
        public double OLrzqt;
        public final String copydefault;
        public PercentageChange djBIcL;
        public final String fetchVPNInfo;
        public final CurrencyToken gEmmrt;
        public String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BuyDexListItem KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull PercentageChange percentageChange) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            return new BuyDexListItem(str, str2, str3, str4, currencyToken, str5, str6, percentageChange);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PercentageChange OLrzqt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyDexListItem)) {
                return false;
            }
            BuyDexListItem buyDexListItem = (BuyDexListItem) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) buyDexListItem.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buyDexListItem.KWHzl) && Intrinsics.EZpvd((Object) this.valueOf, (Object) buyDexListItem.valueOf) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) buyDexListItem.DbNXlk) && Intrinsics.EZpvd(this.gEmmrt, buyDexListItem.gEmmrt) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) buyDexListItem.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) buyDexListItem.AYXKKw) && this.djBIcL == buyDexListItem.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47217tlq
        public String getCefiId() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public double getDexRiskLevel() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47217tlq
        public String getTokenContractAddress() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.KWHzl.hashCode();
            String str = this.valueOf;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.DbNXlk;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.gEmmrt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.djBIcL.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setDexRiskLevel(double d) {
            this.OLrzqt = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.DbNXlk = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BuyDexListItem(cryptoId=" + this.copydefault + ", cryptoName=" + this.KWHzl + ", primary=" + this.valueOf + ", secondary=" + this.DbNXlk + ", dexToken=" + this.gEmmrt + ", price=" + this.AhwBna + ", percentage=" + this.AYXKKw + ", percentageChange=" + this.djBIcL + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BuyDexListItem(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull PercentageChange percentageChange) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            this.copydefault = str;
            this.KWHzl = str2;
            this.valueOf = str3;
            this.DbNXlk = str4;
            this.gEmmrt = currencyToken;
            this.AhwBna = str5;
            this.AYXKKw = str6;
            this.djBIcL = percentageChange;
            this.OLrzqt = C33129mqd.AEQbTJ(currencyToken.getDexInfo().getRiskLevel());
            this.fetchVPNInfo = currencyToken.getDexInfo().getTokenAddress();
            this.EZpvd = currencyToken.getDexInfo().getCexListing();
            this.AEQbTJ = currencyToken.getDexInfo().getCefiId();
        }

        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47217tlq
        public Boolean getCexListing() {
            return Boolean.valueOf(this.EZpvd);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class PercentageChange {
            private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
            private static final /* synthetic */ PercentageChange[] $VALUES;
            public static final PercentageChange UP = new PercentageChange("UP", 0);
            public static final PercentageChange DOWN = new PercentageChange("DOWN", 1);
            public static final PercentageChange NO_CHANGE = new PercentageChange("NO_CHANGE", 2);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private static final /* synthetic */ PercentageChange[] $values() {
                return new PercentageChange[]{UP, DOWN, NO_CHANGE};
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static InterfaceC56445yFq<PercentageChange> getEntries() {
                return $ENTRIES;
            }

            private PercentageChange(String str, int i) {
            }

            static {
                PercentageChange[] percentageChangeArr$values = $values();
                $VALUES = percentageChangeArr$values;
                $ENTRIES = C56444yFp.AEQbTJ(percentageChangeArr$values);
            }

            public static PercentageChange valueOf(String str) {
                return (PercentageChange) Enum.valueOf(PercentageChange.class, str);
            }

            public static PercentageChange[] values() {
                return (PercentageChange[]) $VALUES.clone();
            }
        }
    }

    public static final class StateListAnimator extends CryptoListItem {
        public final String AEQbTJ;
        public final String EZpvd;
        public String KWHzl;
        public final String OLrzqt;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.OLrzqt;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = stateListAnimator.KWHzl;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = stateListAnimator.copydefault;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = stateListAnimator.EZpvd;
            }
            return stateListAnimator.KWHzl(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new StateListAnimator(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) stateListAnimator.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) stateListAnimator.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            String str = this.KWHzl;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FooterTextListItem(cryptoId=" + this.AEQbTJ + ", cryptoName=" + this.OLrzqt + ", primary=" + this.KWHzl + ", secondary=" + this.copydefault + ", title=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = str3;
            this.copydefault = str4;
            this.EZpvd = str5;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity extends CryptoListItem {
        public final String AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public String OLrzqt;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = activity.AEQbTJ;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = activity.OLrzqt;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = activity.copydefault;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = activity.KWHzl;
            }
            return activity.OLrzqt(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new Activity(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) activity.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) activity.AEQbTJ) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) activity.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) activity.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) activity.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            String str = this.OLrzqt;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.copydefault;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HeaderListItem(cryptoId=" + this.EZpvd + ", cryptoName=" + this.AEQbTJ + ", primary=" + this.OLrzqt + ", secondary=" + this.copydefault + ", title=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (r12v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:93) call: com.okinc.buysell.view.cryptolist.CryptoListItem.Activity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Activity(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, str5);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.EZpvd = str;
            this.AEQbTJ = str2;
            this.OLrzqt = str3;
            this.copydefault = str4;
            this.KWHzl = str5;
        }
    }

    public static final class ActionBar extends CryptoListItem {
        public final String AEQbTJ;
        public String AYXKKw;
        public final String EZpvd;
        public String KWHzl;
        public final String OLrzqt;
        public final CurrencyToken copydefault;
        public final String djBIcL;
        public final String gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new ActionBar(str, str2, str3, str4, currencyToken, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) actionBar.KWHzl) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) actionBar.AYXKKw) && Intrinsics.EZpvd(this.copydefault, actionBar.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) actionBar.djBIcL) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) actionBar.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            String str = this.KWHzl;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.AYXKKw;
            return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.gEmmrt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SellCryptoListItem(cryptoId=" + this.AEQbTJ + ", cryptoName=" + this.EZpvd + ", primary=" + this.KWHzl + ", secondary=" + this.AYXKKw + ", crypto=" + this.copydefault + ", iconUrl=" + this.OLrzqt + ", total=" + this.djBIcL + ", totalCrypto=" + this.gEmmrt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AEQbTJ = str;
            this.EZpvd = str2;
            this.KWHzl = str3;
            this.AYXKKw = str4;
            this.copydefault = currencyToken;
            this.OLrzqt = str5;
            this.djBIcL = str6;
            this.gEmmrt = str7;
        }
    }

    public static final class Application extends CryptoListItem {
        public final CurrencyToken AEQbTJ;
        public final String AhwBna;
        public String EZpvd;
        public final String KWHzl;
        public double OLrzqt;
        public final String copydefault;
        public String djBIcL;
        public final String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, String str, String str2, String str3, String str4, CurrencyToken currencyToken, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = application.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = application.copydefault;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = application.EZpvd;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = application.djBIcL;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                currencyToken = application.AEQbTJ;
            }
            CurrencyToken currencyToken2 = currencyToken;
            if ((i & 32) != 0) {
                str5 = application.AhwBna;
            }
            String str10 = str5;
            if ((i & 64) != 0) {
                str6 = application.valueOf;
            }
            return application.KWHzl(str, str7, str8, str9, currencyToken2, str10, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            return new Application(str, str2, str3, str4, currencyToken, str5, str6);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) application.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) application.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) application.valueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public double getDexRiskLevel() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47217tlq
        public String getTokenContractAddress() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            String str = this.EZpvd;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.djBIcL;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setDexRiskLevel(double d) {
            this.OLrzqt = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SellDexListItem(cryptoId=" + this.KWHzl + ", cryptoName=" + this.copydefault + ", primary=" + this.EZpvd + ", secondary=" + this.djBIcL + ", dexToken=" + this.AEQbTJ + ", total=" + this.AhwBna + ", totalCrypto=" + this.valueOf + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            this.KWHzl = str;
            this.copydefault = str2;
            this.EZpvd = str3;
            this.djBIcL = str4;
            this.AEQbTJ = currencyToken;
            this.AhwBna = str5;
            this.valueOf = str6;
            this.OLrzqt = C33129mqd.AEQbTJ(currencyToken.getDexInfo().getRiskLevel());
            this.gEmmrt = currencyToken.getDexInfo().getTokenAddress();
        }
    }
}

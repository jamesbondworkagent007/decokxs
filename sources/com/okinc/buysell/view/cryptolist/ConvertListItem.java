package com.okinc.buysell.view.cryptolist;

import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class ConvertListItem extends CryptoListItem {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.view.cryptolist.ConvertListItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ConvertListItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ConvertToCryptoListItem extends ConvertListItem {
        public final boolean AEQbTJ;
        public String AYXKKw;
        public final String AhwBna;
        public double AkhnZx;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final CurrencyToken copydefault;
        public final PercentageChange djBIcL;
        public double gEmmrt;
        public String isConnected;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ConvertToCryptoListItem AEQbTJ(@NotNull String str, @NotNull String str2, String str3, String str4, double d, double d2, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull PercentageChange percentageChange, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            return new ConvertToCryptoListItem(str, str2, str3, str4, d, d2, currencyToken, str5, str6, str7, percentageChange, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken OLrzqt() {
            return this.copydefault;
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
            if (!(obj instanceof ConvertToCryptoListItem)) {
                return false;
            }
            ConvertToCryptoListItem convertToCryptoListItem = (ConvertToCryptoListItem) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) convertToCryptoListItem.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) convertToCryptoListItem.OLrzqt) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) convertToCryptoListItem.AYXKKw) && Intrinsics.EZpvd((Object) this.isConnected, (Object) convertToCryptoListItem.isConnected) && Double.compare(this.gEmmrt, convertToCryptoListItem.gEmmrt) == 0 && Double.compare(this.AkhnZx, convertToCryptoListItem.AkhnZx) == 0 && Intrinsics.EZpvd(this.copydefault, convertToCryptoListItem.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) convertToCryptoListItem.KWHzl) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) convertToCryptoListItem.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) convertToCryptoListItem.valueOf) && this.djBIcL == convertToCryptoListItem.djBIcL && this.AEQbTJ == convertToCryptoListItem.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public double getPrimarySimilarity() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public double getSecondarySimilarity() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            String str = this.AYXKKw;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.isConnected;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.gEmmrt)) * 31) + Double.hashCode(this.AkhnZx)) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public void setPrimarySimilarity(double d) {
            this.gEmmrt = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.isConnected = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public void setSecondarySimilarity(double d) {
            this.AkhnZx = d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConvertToCryptoListItem(cryptoId=" + this.EZpvd + ", cryptoName=" + this.OLrzqt + ", primary=" + this.AYXKKw + ", secondary=" + this.isConnected + ", primarySimilarity=" + this.gEmmrt + ", secondarySimilarity=" + this.AkhnZx + ", crypto=" + this.copydefault + ", iconUrl=" + this.KWHzl + ", price=" + this.AhwBna + ", percentage=" + this.valueOf + ", percentageChange=" + this.djBIcL + ", isStableCoin=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (wrap:double:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r24v0 double))
  (wrap:double:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0.0d double) : (r26v0 double))
  (r28v0 com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 com.okinc.buysell.view.cryptolist.ConvertListItem$ConvertToCryptoListItem$PercentageChange)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.view.cryptolist.ConvertListItem$ConvertToCryptoListItem$PercentageChange, boolean):void (m)] (LINE:151) call: com.okinc.buysell.view.cryptolist.ConvertListItem.ConvertToCryptoListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, double, com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken, java.lang.String, java.lang.String, java.lang.String, com.okinc.buysell.view.cryptolist.ConvertListItem$ConvertToCryptoListItem$PercentageChange, boolean):void type: THIS */
        public /* synthetic */ ConvertToCryptoListItem(String str, String str2, String str3, String str4, double d, double d2, CurrencyToken currencyToken, String str5, String str6, String str7, PercentageChange percentageChange, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, (i & 16) != 0 ? 0.0d : d, (i & 32) != 0 ? 0.0d : d2, currencyToken, str5, str6, str7, percentageChange, (i & 2048) != 0 ? false : z);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConvertToCryptoListItem(@NotNull String str, @NotNull String str2, String str3, String str4, double d, double d2, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull PercentageChange percentageChange, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(percentageChange, "");
            this.EZpvd = str;
            this.OLrzqt = str2;
            this.AYXKKw = str3;
            this.isConnected = str4;
            this.gEmmrt = d;
            this.AkhnZx = d2;
            this.copydefault = currencyToken;
            this.KWHzl = str5;
            this.AhwBna = str6;
            this.valueOf = str7;
            this.djBIcL = percentageChange;
            this.AEQbTJ = z;
        }
    }

    private ConvertListItem() {
        super(null);
    }

    public static final class TaskDescription extends ConvertListItem {
        public String AEQbTJ;
        public String AYXKKw;
        public final String EZpvd;
        public final CurrencyToken KWHzl;
        public final String OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, String str, String str2, String str3, String str4, CurrencyToken currencyToken, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.OLrzqt;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = taskDescription.AEQbTJ;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = taskDescription.AYXKKw;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                currencyToken = taskDescription.KWHzl;
            }
            CurrencyToken currencyToken2 = currencyToken;
            if ((i & 32) != 0) {
                str5 = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(str, str6, str7, str8, currencyToken2, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            return new TaskDescription(str, str2, str3, str4, currencyToken, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) taskDescription.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) taskDescription.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            int iHashCode2 = this.OLrzqt.hashCode();
            String str = this.AEQbTJ;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.AYXKKw;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConvertToCashListItem(cryptoId=" + this.copydefault + ", cryptoName=" + this.OLrzqt + ", primary=" + this.AEQbTJ + ", secondary=" + this.AYXKKw + ", crypto=" + this.KWHzl + ", iconUrl=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            this.copydefault = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
            this.AYXKKw = str4;
            this.KWHzl = currencyToken;
            this.EZpvd = str5;
        }
    }

    public static final class Application extends ConvertListItem {
        public final String AEQbTJ;
        public final double AYXKKw;
        public final String AhwBna;
        public final String EZpvd;
        public final CurrencyToken KWHzl;
        public final String OLrzqt;
        public String copydefault;
        public final double djBIcL;
        public String gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double AEQbTJ() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d, double d2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new Application(str, str2, str3, str4, currencyToken, str5, str6, str7, d, d2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double KWHzl() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) application.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) application.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) application.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && Intrinsics.EZpvd((Object) this.valueOf, (Object) application.valueOf) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) application.AhwBna) && Double.compare(this.AYXKKw, application.AYXKKw) == 0 && Double.compare(this.djBIcL, application.djBIcL) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.OLrzqt.hashCode();
            int iHashCode2 = this.AEQbTJ.hashCode();
            String str = this.copydefault;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.gEmmrt;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + Double.hashCode(this.AYXKKw)) * 31) + Double.hashCode(this.djBIcL);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConvertFromCryptoListItem(cryptoId=" + this.OLrzqt + ", cryptoName=" + this.AEQbTJ + ", primary=" + this.copydefault + ", secondary=" + this.gEmmrt + ", crypto=" + this.KWHzl + ", iconUrl=" + this.EZpvd + ", total=" + this.valueOf + ", totalCrypto=" + this.AhwBna + ", rawAmount=" + this.AYXKKw + ", rawBalance=" + this.djBIcL + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d, double d2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.OLrzqt = str;
            this.AEQbTJ = str2;
            this.copydefault = str3;
            this.gEmmrt = str4;
            this.KWHzl = currencyToken;
            this.EZpvd = str5;
            this.valueOf = str6;
            this.AhwBna = str7;
            this.AYXKKw = d;
            this.djBIcL = d2;
        }
    }

    public static final class ActionBar extends ConvertListItem {
        public final String AEQbTJ;
        public final String AYXKKw;
        public final double AhwBna;
        public final String EZpvd;
        public final CurrencyToken KWHzl;
        public String OLrzqt;
        public final String copydefault;
        public String djBIcL;
        public final double gEmmrt;
        public final String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final double OLrzqt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d, double d2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new ActionBar(str, str2, str3, str4, currencyToken, str5, str6, str7, d, d2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyToken copydefault() {
            return this.KWHzl;
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
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) actionBar.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) actionBar.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) actionBar.djBIcL) && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) actionBar.EZpvd) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) actionBar.AYXKKw) && Intrinsics.EZpvd((Object) this.valueOf, (Object) actionBar.valueOf) && Double.compare(this.AhwBna, actionBar.AhwBna) == 0 && Double.compare(this.gEmmrt, actionBar.gEmmrt) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoId() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public String getCryptoName() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getPrimary() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem, o.InterfaceC47221tlu
        public String getSecondary() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            int iHashCode2 = this.copydefault.hashCode();
            String str = this.OLrzqt;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.djBIcL;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + Double.hashCode(this.AhwBna)) * 31) + Double.hashCode(this.gEmmrt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setPrimary(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.okinc.buysell.view.cryptolist.CryptoListItem
        public void setSecondary(String str) {
            this.djBIcL = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ConvertFromCashListItem(cryptoId=" + this.AEQbTJ + ", cryptoName=" + this.copydefault + ", primary=" + this.OLrzqt + ", secondary=" + this.djBIcL + ", crypto=" + this.KWHzl + ", iconUrl=" + this.EZpvd + ", total=" + this.AYXKKw + ", totalCrypto=" + this.valueOf + ", rawAmount=" + this.AhwBna + ", rawBalance=" + this.gEmmrt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull CurrencyToken currencyToken, @NotNull String str5, @NotNull String str6, @NotNull String str7, double d, double d2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(currencyToken, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AEQbTJ = str;
            this.copydefault = str2;
            this.OLrzqt = str3;
            this.djBIcL = str4;
            this.KWHzl = currencyToken;
            this.EZpvd = str5;
            this.AYXKKw = str6;
            this.valueOf = str7;
            this.AhwBna = d;
            this.gEmmrt = d2;
        }
    }
}

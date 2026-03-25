package com.okinc.tradelite.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ActivityTabConfig implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.service.ActivityTabConfig.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityTabConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ActivityTabConfig() {
    }

    public static final class OrdersTab extends ActivityTabConfig {
        public static final Parcelable.Creator<OrdersTab> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<OrdersTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrdersTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OrdersTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OrdersTab[] newArray(int i) {
                return new OrdersTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OrdersTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OrdersTab copy$default(OrdersTab ordersTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ordersTab.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = ordersTab.OLrzqt;
            }
            return ordersTab.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OrdersTab AEQbTJ(String str, String str2) {
            return new OrdersTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrdersTab)) {
                return false;
            }
            OrdersTab ordersTab = (OrdersTab) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) ordersTab.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ordersTab.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.OLrzqt;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OrdersTab(ccy=" + this.copydefault + ", ccyId=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.tradelite.service.ActivityTabConfig.OrdersTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ OrdersTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public OrdersTab(String str, String str2) {
            super(null);
            this.copydefault = str;
            this.OLrzqt = str2;
        }
    }

    public static final class PositionsTab extends ActivityTabConfig {
        public static final Parcelable.Creator<PositionsTab> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<PositionsTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionsTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PositionsTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PositionsTab[] newArray(int i) {
                return new PositionsTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PositionsTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PositionsTab copy$default(PositionsTab positionsTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = positionsTab.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = positionsTab.EZpvd;
            }
            return positionsTab.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PositionsTab AEQbTJ(String str, String str2) {
            return new PositionsTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PositionsTab)) {
                return false;
            }
            PositionsTab positionsTab = (PositionsTab) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) positionsTab.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) positionsTab.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PositionsTab(ccy=" + this.KWHzl + ", ccyId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:25) call: com.okinc.tradelite.service.ActivityTabConfig.PositionsTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ PositionsTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public PositionsTab(String str, String str2) {
            super(null);
            this.KWHzl = str;
            this.EZpvd = str2;
        }
    }

    public static final class TransactionTradesTab extends ActivityTabConfig {
        public static final Parcelable.Creator<TransactionTradesTab> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<TransactionTradesTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionTradesTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransactionTradesTab(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionTradesTab[] newArray(int i) {
                return new TransactionTradesTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TransactionTradesTab() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransactionTradesTab copy$default(TransactionTradesTab transactionTradesTab, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionTradesTab.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = transactionTradesTab.OLrzqt;
            }
            if ((i & 4) != 0) {
                str3 = transactionTradesTab.AEQbTJ;
            }
            return transactionTradesTab.copydefault(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionTradesTab copydefault(String str, String str2, String str3) {
            return new TransactionTradesTab(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionTradesTab)) {
                return false;
            }
            TransactionTradesTab transactionTradesTab = (TransactionTradesTab) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) transactionTradesTab.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) transactionTradesTab.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) transactionTradesTab.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.OLrzqt;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.AEQbTJ;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionTradesTab(ccy=" + this.KWHzl + ", ccyId=" + this.OLrzqt + ", activityType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.tradelite.service.ActivityTabConfig.TransactionTradesTab.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TransactionTradesTab(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        public TransactionTradesTab(String str, String str2, String str3) {
            super(null);
            this.KWHzl = str;
            this.OLrzqt = str2;
            this.AEQbTJ = str3;
        }
    }

    public static final class TransactionBuySellOthersTab extends ActivityTabConfig {
        public static final Parcelable.Creator<TransactionBuySellOthersTab> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String AhwBna;
        public final String EZpvd;
        public final String KWHzl;
        public final String OLrzqt;
        public final String copydefault;
        public final String gEmmrt;

        public static final class Creator implements Parcelable.Creator<TransactionBuySellOthersTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionBuySellOthersTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new TransactionBuySellOthersTab(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionBuySellOthersTab[] newArray(int i) {
                return new TransactionBuySellOthersTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TransactionBuySellOthersTab() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TransactionBuySellOthersTab copy$default(TransactionBuySellOthersTab transactionBuySellOthersTab, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionBuySellOthersTab.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = transactionBuySellOthersTab.KWHzl;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = transactionBuySellOthersTab.EZpvd;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = transactionBuySellOthersTab.AEQbTJ;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = transactionBuySellOthersTab.gEmmrt;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = transactionBuySellOthersTab.copydefault;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = transactionBuySellOthersTab.AhwBna;
            }
            return transactionBuySellOthersTab.OLrzqt(str, str8, str9, str10, str11, str12, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionBuySellOthersTab OLrzqt(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            return new TransactionBuySellOthersTab(str, str2, str3, str4, str5, str6, str7);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionBuySellOthersTab)) {
                return false;
            }
            TransactionBuySellOthersTab transactionBuySellOthersTab = (TransactionBuySellOthersTab) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) transactionBuySellOthersTab.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) transactionBuySellOthersTab.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) transactionBuySellOthersTab.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) transactionBuySellOthersTab.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) transactionBuySellOthersTab.gEmmrt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) transactionBuySellOthersTab.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) transactionBuySellOthersTab.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.EZpvd;
            int iHashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.AEQbTJ;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.gEmmrt;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.copydefault;
            int iHashCode6 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.AhwBna;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TransactionBuySellOthersTab(ccy=" + this.OLrzqt + ", ccyId=" + this.KWHzl + ", currencySource=" + this.EZpvd + ", chainIndex=" + this.AEQbTJ + ", tokenAddress=" + this.gEmmrt + ", activityType=" + this.copydefault + ", subtab=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.gEmmrt);
            parcel.writeString(this.copydefault);
            parcel.writeString(this.AhwBna);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:46) call: com.okinc.tradelite.service.ActivityTabConfig.TransactionBuySellOthersTab.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ TransactionBuySellOthersTab(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        public TransactionBuySellOthersTab(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.EZpvd = str3;
            this.AEQbTJ = str4;
            this.gEmmrt = str5;
            this.copydefault = str6;
            this.AhwBna = str7;
        }
    }

    public static final class BotsTab extends ActivityTabConfig {
        public static final Parcelable.Creator<BotsTab> CREATOR = new Creator();
        public final String AEQbTJ;
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<BotsTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotsTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new BotsTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BotsTab[] newArray(int i) {
                return new BotsTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BotsTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ BotsTab copy$default(BotsTab botsTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = botsTab.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str2 = botsTab.KWHzl;
            }
            return botsTab.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BotsTab EZpvd(String str, String str2) {
            return new BotsTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BotsTab)) {
                return false;
            }
            BotsTab botsTab = (BotsTab) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) botsTab.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) botsTab.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AEQbTJ;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BotsTab(ccy=" + this.AEQbTJ + ", ccyId=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:60) call: com.okinc.tradelite.service.ActivityTabConfig.BotsTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ BotsTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public BotsTab(String str, String str2) {
            super(null);
            this.AEQbTJ = str;
            this.KWHzl = str2;
        }
    }

    public static final class CopyTradingTab extends ActivityTabConfig {
        public static final Parcelable.Creator<CopyTradingTab> CREATOR = new Creator();
        public final String KWHzl;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<CopyTradingTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CopyTradingTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CopyTradingTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CopyTradingTab[] newArray(int i) {
                return new CopyTradingTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CopyTradingTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CopyTradingTab copy$default(CopyTradingTab copyTradingTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = copyTradingTab.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = copyTradingTab.KWHzl;
            }
            return copyTradingTab.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CopyTradingTab OLrzqt(String str, String str2) {
            return new CopyTradingTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CopyTradingTab)) {
                return false;
            }
            CopyTradingTab copyTradingTab = (CopyTradingTab) obj;
            return Intrinsics.EZpvd((Object) this.copydefault, (Object) copyTradingTab.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) copyTradingTab.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CopyTradingTab(ccy=" + this.copydefault + ", ccyId=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:69) call: com.okinc.tradelite.service.ActivityTabConfig.CopyTradingTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ CopyTradingTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public CopyTradingTab(String str, String str2) {
            super(null);
            this.copydefault = str;
            this.KWHzl = str2;
        }
    }

    public static final class LeadTradingTab extends ActivityTabConfig {
        public static final Parcelable.Creator<LeadTradingTab> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<LeadTradingTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LeadTradingTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new LeadTradingTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LeadTradingTab[] newArray(int i) {
                return new LeadTradingTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LeadTradingTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LeadTradingTab copy$default(LeadTradingTab leadTradingTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = leadTradingTab.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = leadTradingTab.EZpvd;
            }
            return leadTradingTab.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LeadTradingTab OLrzqt(String str, String str2) {
            return new LeadTradingTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadTradingTab)) {
                return false;
            }
            LeadTradingTab leadTradingTab = (LeadTradingTab) obj;
            return Intrinsics.EZpvd((Object) this.KWHzl, (Object) leadTradingTab.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) leadTradingTab.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.EZpvd;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LeadTradingTab(ccy=" + this.KWHzl + ", ccyId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:78) call: com.okinc.tradelite.service.ActivityTabConfig.LeadTradingTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ LeadTradingTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public LeadTradingTab(String str, String str2) {
            super(null);
            this.KWHzl = str;
            this.EZpvd = str2;
        }
    }

    public static final class RecurringBuyTab extends ActivityTabConfig {
        public static final Parcelable.Creator<RecurringBuyTab> CREATOR = new Creator();
        public final String EZpvd;
        public final String KWHzl;

        public static final class Creator implements Parcelable.Creator<RecurringBuyTab> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringBuyTab createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RecurringBuyTab(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RecurringBuyTab[] newArray(int i) {
                return new RecurringBuyTab[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RecurringBuyTab() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RecurringBuyTab copy$default(RecurringBuyTab recurringBuyTab, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = recurringBuyTab.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = recurringBuyTab.KWHzl;
            }
            return recurringBuyTab.AEQbTJ(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RecurringBuyTab AEQbTJ(String str, String str2) {
            return new RecurringBuyTab(str, str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RecurringBuyTab)) {
                return false;
            }
            RecurringBuyTab recurringBuyTab = (RecurringBuyTab) obj;
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) recurringBuyTab.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) recurringBuyTab.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.KWHzl;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RecurringBuyTab(ccy=" + this.EZpvd + ", ccyId=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
            parcel.writeString(this.KWHzl);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:87) call: com.okinc.tradelite.service.ActivityTabConfig.RecurringBuyTab.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ RecurringBuyTab(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public RecurringBuyTab(String str, String str2) {
            super(null);
            this.EZpvd = str;
            this.KWHzl = str2;
        }
    }
}

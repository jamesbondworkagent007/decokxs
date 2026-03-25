package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SupportCurrency implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SupportCurrency> CREATOR = new Creator();
    private String balance;
    private boolean canInvoiceDeposit;
    private boolean canWithdrawAddress;
    private boolean canWithdrawInternal;
    private String currency;
    private int currencyId;
    private String earnMaxAprStr;
    private String feeMin;
    private String fullName;
    private String icon;
    private boolean isCashCurrency;
    private boolean isCompatibleWithWeb3Wallet;
    private boolean isSelected;
    private List<ChainData> networks;
    private String subName;
    private String valuation;
    private String wdMin;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<SupportCurrency> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrency createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ChainData.CREATOR.createFromParcel(parcel));
            }
            return new SupportCurrency(i, string, string2, string3, z, string4, string5, z2, string6, string7, string8, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SupportCurrency[] newArray(int i) {
            return new SupportCurrency[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SupportCurrency() {
        this(0, null, null, null, false, null, null, false, null, null, null, null, false, false, false, false, null, 131071, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanInvoiceDeposit() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdrawAddress() {
        return this.canWithdrawAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCanWithdrawInternal() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnMaxAprStr() {
        return this.earnMaxAprStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeMin() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChainData> getNetworks() {
        return this.networks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubName() {
        return this.subName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWdMin() {
        return this.wdMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCashCurrency() {
        return this.isCashCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCompatibleWithWeb3Wallet() {
        return this.isCompatibleWithWeb3Wallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanInvoiceDeposit(boolean z) {
        this.canInvoiceDeposit = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdrawAddress(boolean z) {
        this.canWithdrawAddress = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdrawInternal(boolean z) {
        this.canWithdrawInternal = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashCurrency(boolean z) {
        this.isCashCurrency = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCompatibleWithWeb3Wallet(boolean z) {
        this.isCompatibleWithWeb3Wallet = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEarnMaxAprStr(String str) {
        this.earnMaxAprStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworks(@NotNull List<ChainData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.networks = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWdMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.wdMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.currency);
        parcel.writeString(this.fullName);
        parcel.writeString(this.icon);
        parcel.writeInt(this.canInvoiceDeposit ? 1 : 0);
        parcel.writeString(this.valuation);
        parcel.writeString(this.balance);
        parcel.writeInt(this.canWithdrawAddress ? 1 : 0);
        parcel.writeString(this.wdMin);
        parcel.writeString(this.feeMin);
        parcel.writeString(this.subName);
        List<ChainData> list = this.networks;
        parcel.writeInt(list.size());
        Iterator<ChainData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.canWithdrawInternal ? 1 : 0);
        parcel.writeInt(this.isCashCurrency ? 1 : 0);
        parcel.writeInt(this.isCompatibleWithWeb3Wallet ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.earnMaxAprStr);
    }

    public SupportCurrency(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull List<ChainData> list, boolean z3, boolean z4, boolean z5, boolean z6, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.currencyId = i;
        this.currency = str;
        this.fullName = str2;
        this.icon = str3;
        this.canInvoiceDeposit = z;
        this.valuation = str4;
        this.balance = str5;
        this.canWithdrawAddress = z2;
        this.wdMin = str6;
        this.feeMin = str7;
        this.subName = str8;
        this.networks = list;
        this.canWithdrawInternal = z3;
        this.isCashCurrency = z4;
        this.isCompatibleWithWeb3Wallet = z5;
        this.isSelected = z6;
        this.earnMaxAprStr = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b8: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r19v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003c: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005b: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r30v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0066: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006e: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0076: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0081: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008c: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r35v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.assets.backend.api.model.ChainData>, boolean, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.assets.backend.api.model.SupportCurrency.<init>(int, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ SupportCurrency(int i, String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, String str6, String str7, String str8, List list, boolean z3, boolean z4, boolean z5, boolean z6, String str9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? false : z2, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) == 0 ? str8 : "", (i2 & 2048) != 0 ? yDY.AhwBna() : list, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? true : z5, (i2 & 32768) != 0 ? false : z6, (i2 & 65536) != 0 ? null : str9);
    }

    public boolean equals(Object obj) {
        return (obj instanceof SupportCurrency) && Intrinsics.EZpvd((Object) this.currency, (Object) ((SupportCurrency) obj).currency);
    }
}

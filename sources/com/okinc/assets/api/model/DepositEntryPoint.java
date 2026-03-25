package com.okinc.assets.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public interface DepositEntryPoint extends Parcelable {

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SelectCryptoPage implements DepositEntryPoint {
        public static final SelectCryptoPage EZpvd = new SelectCryptoPage();
        public static final Parcelable.Creator<SelectCryptoPage> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<SelectCryptoPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectCryptoPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return SelectCryptoPage.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectCryptoPage[] newArray(int i) {
                return new SelectCryptoPage[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private SelectCryptoPage() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class BuyCoinPage implements DepositEntryPoint {
        public static final BuyCoinPage KWHzl = new BuyCoinPage();
        public static final Parcelable.Creator<BuyCoinPage> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes22.dex */
        public static final class Creator implements Parcelable.Creator<BuyCoinPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuyCoinPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return BuyCoinPage.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BuyCoinPage[] newArray(int i) {
                return new BuyCoinPage[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private BuyCoinPage() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DepositFiatPage implements DepositEntryPoint {
        public static final Parcelable.Creator<DepositFiatPage> CREATOR = new Creator();
        public final String AEQbTJ;

        /* JADX INFO: loaded from: classes22.dex */
        public static final class Creator implements Parcelable.Creator<DepositFiatPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositFiatPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DepositFiatPage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DepositFiatPage[] newArray(int i) {
                return new DepositFiatPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DepositFiatPage copy$default(DepositFiatPage depositFiatPage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = depositFiatPage.AEQbTJ;
            }
            return depositFiatPage.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DepositFiatPage KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new DepositFiatPage(str);
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
            return (obj instanceof DepositFiatPage) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((DepositFiatPage) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DepositFiatPage(currency=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
        }

        public DepositFiatPage(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SpecificCryptoPage implements DepositEntryPoint {
        public static final Parcelable.Creator<SpecificCryptoPage> CREATOR = new Creator();
        public final int EZpvd;

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Creator implements Parcelable.Creator<SpecificCryptoPage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecificCryptoPage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SpecificCryptoPage(parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SpecificCryptoPage[] newArray(int i) {
                return new SpecificCryptoPage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SpecificCryptoPage copy$default(SpecificCryptoPage specificCryptoPage, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = specificCryptoPage.EZpvd;
            }
            return specificCryptoPage.KWHzl(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SpecificCryptoPage KWHzl(int i) {
            return new SpecificCryptoPage(i);
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
            return (obj instanceof SpecificCryptoPage) && this.EZpvd == ((SpecificCryptoPage) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SpecificCryptoPage(currencyId=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.EZpvd);
        }

        public SpecificCryptoPage(int i) {
            this.EZpvd = i;
        }
    }

    public static final class SelectMethods implements DepositEntryPoint {
        public static final Parcelable.Creator<SelectMethods> CREATOR = new Creator();
        public final Boolean AEQbTJ;
        public final Transfer AhwBna;
        public final EarnRedeem EZpvd;
        public final P2P KWHzl;
        public final List<Option> OLrzqt;
        public final CurrencyModel copydefault;

        public static final class Creator implements Parcelable.Creator<SelectMethods> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethods createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "");
                P2P p2pCreateFromParcel = P2P.CREATOR.createFromParcel(parcel);
                Transfer transferCreateFromParcel = Transfer.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(Option.valueOf(parcel.readString()));
                    }
                }
                return new SelectMethods(p2pCreateFromParcel, transferCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : CurrencyModel.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() != 0 ? EarnRedeem.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectMethods[] newArray(int i) {
                return new SelectMethods[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SelectMethods() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.assets.api.model.DepositEntryPoint$SelectMethods */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelectMethods copy$default(SelectMethods selectMethods, P2P p2p, Transfer transfer, List list, CurrencyModel currencyModel, Boolean bool, EarnRedeem earnRedeem, int i, Object obj) {
            if ((i & 1) != 0) {
                p2p = selectMethods.KWHzl;
            }
            if ((i & 2) != 0) {
                transfer = selectMethods.AhwBna;
            }
            Transfer transfer2 = transfer;
            if ((i & 4) != 0) {
                list = selectMethods.OLrzqt;
            }
            List list2 = list;
            if ((i & 8) != 0) {
                currencyModel = selectMethods.copydefault;
            }
            CurrencyModel currencyModel2 = currencyModel;
            if ((i & 16) != 0) {
                bool = selectMethods.AEQbTJ;
            }
            Boolean bool2 = bool;
            if ((i & 32) != 0) {
                earnRedeem = selectMethods.EZpvd;
            }
            return selectMethods.copydefault(p2p, transfer2, list2, currencyModel2, bool2, earnRedeem);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SelectMethods copydefault(@NotNull P2P p2p, @NotNull Transfer transfer, List<? extends Option> list, CurrencyModel currencyModel, Boolean bool, EarnRedeem earnRedeem) {
            Intrinsics.checkNotNullParameter(p2p, "");
            Intrinsics.checkNotNullParameter(transfer, "");
            return new SelectMethods(p2p, transfer, list, currencyModel, bool, earnRedeem);
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
            if (!(obj instanceof SelectMethods)) {
                return false;
            }
            SelectMethods selectMethods = (SelectMethods) obj;
            return Intrinsics.EZpvd(this.KWHzl, selectMethods.KWHzl) && Intrinsics.EZpvd(this.AhwBna, selectMethods.AhwBna) && Intrinsics.EZpvd(this.OLrzqt, selectMethods.OLrzqt) && Intrinsics.EZpvd(this.copydefault, selectMethods.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, selectMethods.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, selectMethods.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.KWHzl.hashCode();
            int iHashCode2 = this.AhwBna.hashCode();
            List<Option> list = this.OLrzqt;
            int iHashCode3 = list == null ? 0 : list.hashCode();
            CurrencyModel currencyModel = this.copydefault;
            int iHashCode4 = currencyModel == null ? 0 : currencyModel.hashCode();
            Boolean bool = this.AEQbTJ;
            int iHashCode5 = bool == null ? 0 : bool.hashCode();
            EarnRedeem earnRedeem = this.EZpvd;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (earnRedeem != null ? earnRedeem.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SelectMethods(p2p=" + this.KWHzl + ", transfer=" + this.AhwBna + ", optionList=" + this.OLrzqt + ", currencyModel=" + this.copydefault + ", isInsufficientBalance=" + this.AEQbTJ + ", earnRedeemAccountInfo=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            this.KWHzl.writeToParcel(parcel, i);
            this.AhwBna.writeToParcel(parcel, i);
            List<Option> list = this.OLrzqt;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Option> it = list.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next().name());
                }
            }
            CurrencyModel currencyModel = this.copydefault;
            if (currencyModel == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                currencyModel.writeToParcel(parcel, i);
            }
            Boolean bool = this.AEQbTJ;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            EarnRedeem earnRedeem = this.EZpvd;
            if (earnRedeem == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                earnRedeem.writeToParcel(parcel, i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.assets.api.model.DepositEntryPoint$Option> */
        /* JADX WARN: Multi-variable type inference failed */
        public SelectMethods(@NotNull P2P p2p, @NotNull Transfer transfer, List<? extends Option> list, CurrencyModel currencyModel, Boolean bool, EarnRedeem earnRedeem) {
            Intrinsics.checkNotNullParameter(p2p, "");
            Intrinsics.checkNotNullParameter(transfer, "");
            this.KWHzl = p2p;
            this.AhwBna = transfer;
            this.OLrzqt = list;
            this.copydefault = currencyModel;
            this.AEQbTJ = bool;
            this.EZpvd = earnRedeem;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$P2P:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.assets.api.model.DepositEntryPoint$P2P:0x0007: CONSTRUCTOR true A[MD:(boolean):void (m), WRAPPED] (LINE:33) call: com.okinc.assets.api.model.DepositEntryPoint.P2P.<init>(boolean):void type: CONSTRUCTOR) : (r8v0 com.okinc.assets.api.model.DepositEntryPoint$P2P))
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$Transfer:0x0015: TERNARY null = ((wrap:int:0x000b: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.assets.api.model.DepositEntryPoint$Transfer:0x0012: CONSTRUCTOR false, false A[MD:(boolean, boolean):void (m), WRAPPED] (LINE:34) call: com.okinc.assets.api.model.DepositEntryPoint.Transfer.<init>(boolean, boolean):void type: CONSTRUCTOR) : (r9v0 com.okinc.assets.api.model.DepositEntryPoint$Transfer))
  (wrap:java.util.List:0x0026: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0022: INVOKE 
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$Option[]:0x001e: FILLED_NEW_ARRAY 
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$Option:0x001a: SGET  A[WRAPPED] (LINE:35) com.okinc.assets.api.model.DepositEntryPoint.Option.DepositCrypto com.okinc.assets.api.model.DepositEntryPoint$Option)
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$Option:0x001c: SGET  A[WRAPPED] com.okinc.assets.api.model.DepositEntryPoint.Option.DepositCash com.okinc.assets.api.model.DepositEntryPoint$Option)
 A[WRAPPED] (LINE:35) elemType: com.okinc.assets.api.model.DepositEntryPoint$Option)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:35)) : (r10v0 java.util.List))
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$CurrencyModel:?: TERNARY null = ((wrap:int:0x0027: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.api.model.DepositEntryPoint$CurrencyModel) : (r11v0 com.okinc.assets.api.model.DepositEntryPoint$CurrencyModel))
  (wrap:java.lang.Boolean:0x0035: TERNARY null = ((wrap:int:0x002f: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0033: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r12v0 java.lang.Boolean))
  (wrap:com.okinc.assets.api.model.DepositEntryPoint$EarnRedeem:?: TERNARY null = ((wrap:int:0x0036: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.api.model.DepositEntryPoint$EarnRedeem) : (r13v0 com.okinc.assets.api.model.DepositEntryPoint$EarnRedeem))
 A[MD:(com.okinc.assets.api.model.DepositEntryPoint$P2P, com.okinc.assets.api.model.DepositEntryPoint$Transfer, java.util.List<? extends com.okinc.assets.api.model.DepositEntryPoint$Option>, com.okinc.assets.api.model.DepositEntryPoint$CurrencyModel, java.lang.Boolean, com.okinc.assets.api.model.DepositEntryPoint$EarnRedeem):void (m)] (LINE:32) call: com.okinc.assets.api.model.DepositEntryPoint.SelectMethods.<init>(com.okinc.assets.api.model.DepositEntryPoint$P2P, com.okinc.assets.api.model.DepositEntryPoint$Transfer, java.util.List, com.okinc.assets.api.model.DepositEntryPoint$CurrencyModel, java.lang.Boolean, com.okinc.assets.api.model.DepositEntryPoint$EarnRedeem):void type: THIS */
        public /* synthetic */ SelectMethods(P2P p2p, Transfer transfer, List list, CurrencyModel currencyModel, Boolean bool, EarnRedeem earnRedeem, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new P2P(true) : p2p, (i & 2) != 0 ? new Transfer(false, false) : transfer, (i & 4) != 0 ? yDY.gEmmrt(Option.DepositCrypto, Option.DepositCash) : list, (i & 8) != 0 ? null : currencyModel, (i & 16) != 0 ? Boolean.FALSE : bool, (i & 32) != 0 ? null : earnRedeem);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PermissionCheck implements DepositEntryPoint {
        public static final PermissionCheck EZpvd = new PermissionCheck();
        public static final Parcelable.Creator<PermissionCheck> CREATOR = new Creator();

        /* JADX INFO: loaded from: classes22.dex */
        public static final class Creator implements Parcelable.Creator<PermissionCheck> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionCheck createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return PermissionCheck.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PermissionCheck[] newArray(int i) {
                return new PermissionCheck[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private PermissionCheck() {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class PostPermissionCheck implements DepositEntryPoint {
        public static final Parcelable.Creator<PostPermissionCheck> CREATOR = new Creator();
        public final Function0<Unit> AEQbTJ;

        /* JADX INFO: loaded from: classes22.dex */
        public static final class Creator implements Parcelable.Creator<PostPermissionCheck> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostPermissionCheck createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new PostPermissionCheck((Function0) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PostPermissionCheck[] newArray(int i) {
                return new PostPermissionCheck[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.api.model.DepositEntryPoint$PostPermissionCheck */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PostPermissionCheck copy$default(PostPermissionCheck postPermissionCheck, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = postPermissionCheck.AEQbTJ;
            }
            return postPermissionCheck.copydefault(function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PostPermissionCheck copydefault(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new PostPermissionCheck(function0);
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
            return (obj instanceof PostPermissionCheck) && Intrinsics.EZpvd(this.AEQbTJ, ((PostPermissionCheck) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PostPermissionCheck(onCompliant=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable((Serializable) this.AEQbTJ);
        }

        public PostPermissionCheck(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ = function0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Option {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Option[] $VALUES;
        public static final Option DepositCrypto = new Option("DepositCrypto", 0);
        public static final Option DepositCash = new Option("DepositCash", 1);
        public static final Option Transfer = new Option("Transfer", 2);
        public static final Option Convert = new Option("Convert", 3);
        public static final Option P2P = new Option(CustomMessageData.SERVICE_NAME_P2P, 4);
        public static final Option Buy = new Option("Buy", 5);
        public static final Option EarnRedeem = new Option("EarnRedeem", 6);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Option[] $values() {
            return new Option[]{DepositCrypto, DepositCash, Transfer, Convert, P2P, Buy, EarnRedeem};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Option> getEntries() {
            return $ENTRIES;
        }

        private Option(String str, int i) {
        }

        static {
            Option[] optionArr$values = $values();
            $VALUES = optionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(optionArr$values);
        }

        public static Option valueOf(String str) {
            return (Option) Enum.valueOf(Option.class, str);
        }

        public static Option[] values() {
            return (Option[]) $VALUES.clone();
        }
    }

    public static final class CurrencyModel implements Parcelable {
        public static final Parcelable.Creator<CurrencyModel> CREATOR = new Creator();
        public final String AEQbTJ;
        public final int OLrzqt;

        public static final class Creator implements Parcelable.Creator<CurrencyModel> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyModel createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CurrencyModel(parcel.readInt(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CurrencyModel[] newArray(int i) {
                return new CurrencyModel[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CurrencyModel copy$default(CurrencyModel currencyModel, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = currencyModel.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                str = currencyModel.AEQbTJ;
            }
            return currencyModel.copydefault(i, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CurrencyModel copydefault(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new CurrencyModel(i, str);
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
            if (!(obj instanceof CurrencyModel)) {
                return false;
            }
            CurrencyModel currencyModel = (CurrencyModel) obj;
            return this.OLrzqt == currencyModel.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) currencyModel.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CurrencyModel(currencyId=" + this.OLrzqt + ", currency=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
            parcel.writeString(this.AEQbTJ);
        }

        public CurrencyModel(int i, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = i;
            this.AEQbTJ = str;
        }
    }

    public static final class EarnRedeem implements Parcelable {
        public static final Parcelable.Creator<EarnRedeem> CREATOR = new Creator();
        public final Integer AEQbTJ;
        public final String EZpvd;
        public final int KWHzl;
        public final double copydefault;

        public static final class Creator implements Parcelable.Creator<EarnRedeem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnRedeem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new EarnRedeem(parcel.readInt(), parcel.readString(), parcel.readDouble(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EarnRedeem[] newArray(int i) {
                return new EarnRedeem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EarnRedeem copy$default(EarnRedeem earnRedeem, int i, String str, double d, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = earnRedeem.KWHzl;
            }
            if ((i2 & 2) != 0) {
                str = earnRedeem.EZpvd;
            }
            String str2 = str;
            if ((i2 & 4) != 0) {
                d = earnRedeem.copydefault;
            }
            double d2 = d;
            if ((i2 & 8) != 0) {
                num = earnRedeem.AEQbTJ;
            }
            return earnRedeem.EZpvd(i, str2, d2, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EarnRedeem EZpvd(int i, @NotNull String str, double d, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            return new EarnRedeem(i, str, d, num);
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
            if (!(obj instanceof EarnRedeem)) {
                return false;
            }
            EarnRedeem earnRedeem = (EarnRedeem) obj;
            return this.KWHzl == earnRedeem.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) earnRedeem.EZpvd) && Double.compare(this.copydefault, earnRedeem.copydefault) == 0 && Intrinsics.EZpvd(this.AEQbTJ, earnRedeem.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.KWHzl);
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = Double.hashCode(this.copydefault);
            Integer num = this.AEQbTJ;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EarnRedeem(redeemAccountType=" + this.KWHzl + ", source=" + this.EZpvd + ", minRedeemableBalance=" + this.copydefault + ", themeType=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.KWHzl);
            parcel.writeString(this.EZpvd);
            parcel.writeDouble(this.copydefault);
            Integer num = this.AEQbTJ;
            if (num == null) {
                iIntValue = 0;
            } else {
                parcel.writeInt(1);
                iIntValue = num.intValue();
            }
            parcel.writeInt(iIntValue);
        }

        public EarnRedeem(int i, @NotNull String str, double d, Integer num) {
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = i;
            this.EZpvd = str;
            this.copydefault = d;
            this.AEQbTJ = num;
        }
    }

    public static final class Transfer implements Parcelable {
        public static final Parcelable.Creator<Transfer> CREATOR = new Creator();
        public final boolean KWHzl;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<Transfer> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transfer createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Transfer(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Transfer[] newArray(int i) {
                return new Transfer[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Transfer copy$default(Transfer transfer, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = transfer.copydefault;
            }
            if ((i & 2) != 0) {
                z2 = transfer.KWHzl;
            }
            return transfer.AEQbTJ(z, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Transfer AEQbTJ(boolean z, boolean z2) {
            return new Transfer(z, z2);
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
            if (!(obj instanceof Transfer)) {
                return false;
            }
            Transfer transfer = (Transfer) obj;
            return this.copydefault == transfer.copydefault && this.KWHzl == transfer.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Boolean.hashCode(this.copydefault) * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Transfer(shouldNavigateBackOnSuccess=" + this.copydefault + ", showBalance=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.copydefault ? 1 : 0);
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public Transfer(boolean z, boolean z2) {
            this.copydefault = z;
            this.KWHzl = z2;
        }
    }

    public static final class P2P implements Parcelable {
        public static final Parcelable.Creator<P2P> CREATOR = new Creator();
        public final boolean KWHzl;

        public static final class Creator implements Parcelable.Creator<P2P> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final P2P createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new P2P(parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final P2P[] newArray(int i) {
                return new P2P[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ P2P copy$default(P2P p2p, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = p2p.KWHzl;
            }
            return p2p.copydefault(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final P2P copydefault(boolean z) {
            return new P2P(z);
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
            return (obj instanceof P2P) && this.KWHzl == ((P2P) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "P2P(show=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        public P2P(boolean z) {
            this.KWHzl = z;
        }
    }
}

package com.okinc.dexkline.market.features.position.ui.transaction_filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import com.okinc.dexkline.market.features.filter.ui.TypeOptionParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class TransactionFilterSheetParams implements Parcelable {
    public final TokenFilter AEQbTJ;
    public final String AYXKKw;
    public final String AhwBna;
    public final TokenFilter EZpvd;
    public final String OLrzqt;
    public final List<TypeOptionParams> gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<TransactionFilterSheetParams> CREATOR = new Creator();
    public static final TransactionFilterSheetParams KWHzl = new TransactionFilterSheetParams(null, null, new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, null, 16383, null), null, null, null, 59, null);

    public static final class Creator implements Parcelable.Creator<TransactionFilterSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionFilterSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TypeOptionParams.CREATOR.createFromParcel(parcel));
            }
            Parcelable.Creator<TokenFilter> creator = TokenFilter.CREATOR;
            return new TransactionFilterSheetParams(string, arrayList, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionFilterSheetParams[] newArray(int i) {
            return new TransactionFilterSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.dexkline.market.features.position.ui.transaction_filter.TransactionFilterSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionFilterSheetParams copy$default(TransactionFilterSheetParams transactionFilterSheetParams, String str, List list, TokenFilter tokenFilter, TokenFilter tokenFilter2, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionFilterSheetParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = transactionFilterSheetParams.gEmmrt;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            tokenFilter = transactionFilterSheetParams.AEQbTJ;
        }
        TokenFilter tokenFilter3 = tokenFilter;
        if ((i & 8) != 0) {
            tokenFilter2 = transactionFilterSheetParams.EZpvd;
        }
        TokenFilter tokenFilter4 = tokenFilter2;
        if ((i & 16) != 0) {
            str2 = transactionFilterSheetParams.AhwBna;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            str3 = transactionFilterSheetParams.AYXKKw;
        }
        return transactionFilterSheetParams.EZpvd(str, list2, tokenFilter3, tokenFilter4, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFilterSheetParams EZpvd(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TransactionFilterSheetParams(str, list, tokenFilter, tokenFilter2, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TypeOptionParams> OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof TransactionFilterSheetParams)) {
            return false;
        }
        TransactionFilterSheetParams transactionFilterSheetParams = (TransactionFilterSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) transactionFilterSheetParams.OLrzqt) && Intrinsics.EZpvd(this.gEmmrt, transactionFilterSheetParams.gEmmrt) && Intrinsics.EZpvd(this.AEQbTJ, transactionFilterSheetParams.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, transactionFilterSheetParams.EZpvd) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) transactionFilterSheetParams.AhwBna) && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) transactionFilterSheetParams.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = this.gEmmrt.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        TokenFilter tokenFilter = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tokenFilter == null ? 0 : tokenFilter.hashCode())) * 31) + this.AhwBna.hashCode()) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionFilterSheetParams(title=" + this.OLrzqt + ", typeOptions=" + this.gEmmrt + ", defaultFilter=" + this.AEQbTJ + ", presetFilter=" + this.EZpvd + ", trackName=" + this.AhwBna + ", tokenSymbol=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        List<TypeOptionParams> list = this.gEmmrt;
        parcel.writeInt(list.size());
        Iterator<TypeOptionParams> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.AEQbTJ.writeToParcel(parcel, i);
        TokenFilter tokenFilter = this.EZpvd;
        if (tokenFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenFilter.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.AYXKKw);
    }

    public TransactionFilterSheetParams(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt = str;
        this.gEmmrt = list;
        this.AEQbTJ = tokenFilter;
        this.EZpvd = tokenFilter2;
        this.AhwBna = str2;
        this.AYXKKw = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0011: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r11v0 java.util.List))
  (r12v0 com.okinc.dexkline.market.features.filter.domain.TokenFilter)
  (wrap:com.okinc.dexkline.market.features.filter.domain.TokenFilter:?: TERNARY null = ((wrap:int:0x0014: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.filter.domain.TokenFilter) : (r13v0 com.okinc.dexkline.market.features.filter.domain.TokenFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r16v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.dexkline.market.features.filter.ui.TypeOptionParams>, com.okinc.dexkline.market.features.filter.domain.TokenFilter, com.okinc.dexkline.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.dexkline.market.features.position.ui.transaction_filter.TransactionFilterSheetParams.<init>(java.lang.String, java.util.List, com.okinc.dexkline.market.features.filter.domain.TokenFilter, com.okinc.dexkline.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionFilterSheetParams(String str, List list, TokenFilter tokenFilter, TokenFilter tokenFilter2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, tokenFilter, (i & 8) != 0 ? null : tokenFilter2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.position.ui.transaction_filter.TransactionFilterSheetParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final TransactionFilterSheetParams copydefault() {
            return TransactionFilterSheetParams.KWHzl;
        }
    }
}

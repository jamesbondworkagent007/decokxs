package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CardAuthRequestList implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CardAuthRequestList> CREATOR = new Creator();
    private final List<CardAuthRequest> authRequestList;
    private final CardAuthResultCTAConfig ctaConfig;
    private final boolean isPasskeyOnly;

    public static final class Creator implements Parcelable.Creator<CardAuthRequestList> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthRequestList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(CardAuthRequestList.class.getClassLoader()));
            }
            return new CardAuthRequestList(arrayList, CardAuthResultCTAConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardAuthRequestList[] newArray(int i) {
            return new CardAuthRequestList[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.web3pay.api.model.CardAuthRequestList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardAuthRequestList copy$default(CardAuthRequestList cardAuthRequestList, List list, CardAuthResultCTAConfig cardAuthResultCTAConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardAuthRequestList.authRequestList;
        }
        if ((i & 2) != 0) {
            cardAuthResultCTAConfig = cardAuthRequestList.ctaConfig;
        }
        if ((i & 4) != 0) {
            z = cardAuthRequestList.isPasskeyOnly;
        }
        return cardAuthRequestList.copy(list, cardAuthResultCTAConfig, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardAuthRequest> component1() {
        return this.authRequestList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardAuthResultCTAConfig component2() {
        return this.ctaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isPasskeyOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardAuthRequestList copy(@NotNull List<? extends CardAuthRequest> list, @NotNull CardAuthResultCTAConfig cardAuthResultCTAConfig, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cardAuthResultCTAConfig, "");
        return new CardAuthRequestList(list, cardAuthResultCTAConfig, z);
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
        if (!(obj instanceof CardAuthRequestList)) {
            return false;
        }
        CardAuthRequestList cardAuthRequestList = (CardAuthRequestList) obj;
        return Intrinsics.EZpvd(this.authRequestList, cardAuthRequestList.authRequestList) && Intrinsics.EZpvd(this.ctaConfig, cardAuthRequestList.ctaConfig) && this.isPasskeyOnly == cardAuthRequestList.isPasskeyOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CardAuthRequest> getAuthRequestList() {
        return this.authRequestList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CardAuthResultCTAConfig getCtaConfig() {
        return this.ctaConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.authRequestList.hashCode() * 31) + this.ctaConfig.hashCode()) * 31) + Boolean.hashCode(this.isPasskeyOnly);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPasskeyOnly() {
        return this.isPasskeyOnly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CardAuthRequestList(authRequestList=" + this.authRequestList + ", ctaConfig=" + this.ctaConfig + ", isPasskeyOnly=" + this.isPasskeyOnly + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CardAuthRequest> list = this.authRequestList;
        parcel.writeInt(list.size());
        Iterator<CardAuthRequest> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        this.ctaConfig.writeToParcel(parcel, i);
        parcel.writeInt(this.isPasskeyOnly ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.web3pay.api.model.CardAuthRequest> */
    /* JADX WARN: Multi-variable type inference failed */
    public CardAuthRequestList(@NotNull List<? extends CardAuthRequest> list, @NotNull CardAuthResultCTAConfig cardAuthResultCTAConfig, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(cardAuthResultCTAConfig, "");
        this.authRequestList = list;
        this.ctaConfig = cardAuthResultCTAConfig;
        this.isPasskeyOnly = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r11v0 java.util.List)
  (wrap:com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig:0x0011: CONSTRUCTOR 
  false
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (127 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:47) call: com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r12v0 com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0014: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
 A[MD:(java.util.List<? extends com.okinc.business.web3pay.api.model.CardAuthRequest>, com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig, boolean):void (m)] (LINE:45) call: com.okinc.business.web3pay.api.model.CardAuthRequestList.<init>(java.util.List, com.okinc.business.web3pay.api.model.CardAuthResultCTAConfig, boolean):void type: THIS */
    public /* synthetic */ CardAuthRequestList(List list, CardAuthResultCTAConfig cardAuthResultCTAConfig, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new CardAuthResultCTAConfig(false, null, null, null, null, null, null, 127, null) : cardAuthResultCTAConfig, (i & 4) != 0 ? false : z);
    }
}

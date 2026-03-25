package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<TokenDetailBottomSheetParams> CREATOR = new Creator();
    public final TokenDetailCommonParams EZpvd;
    public final TokenDetailTabType KWHzl;
    public final List<TokenDetailTabData> copydefault;

    public static final class Creator implements Parcelable.Creator<TokenDetailBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TokenDetailCommonParams tokenDetailCommonParamsCreateFromParcel = TokenDetailCommonParams.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(TokenDetailBottomSheetParams.class.getClassLoader()));
            }
            return new TokenDetailBottomSheetParams(tokenDetailCommonParamsCreateFromParcel, arrayList, parcel.readInt() == 0 ? null : TokenDetailTabType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenDetailBottomSheetParams[] newArray(int i) {
            return new TokenDetailBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenDetailBottomSheetParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenDetailBottomSheetParams copy$default(TokenDetailBottomSheetParams tokenDetailBottomSheetParams, TokenDetailCommonParams tokenDetailCommonParams, List list, TokenDetailTabType tokenDetailTabType, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenDetailCommonParams = tokenDetailBottomSheetParams.EZpvd;
        }
        if ((i & 2) != 0) {
            list = tokenDetailBottomSheetParams.copydefault;
        }
        if ((i & 4) != 0) {
            tokenDetailTabType = tokenDetailBottomSheetParams.KWHzl;
        }
        return tokenDetailBottomSheetParams.copydefault(tokenDetailCommonParams, list, tokenDetailTabType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetailTabData> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetailBottomSheetParams copydefault(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull List<? extends TokenDetailTabData> list, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenDetailBottomSheetParams(tokenDetailCommonParams, list, tokenDetailTabType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenDetailCommonParams copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof TokenDetailBottomSheetParams)) {
            return false;
        }
        TokenDetailBottomSheetParams tokenDetailBottomSheetParams = (TokenDetailBottomSheetParams) obj;
        return Intrinsics.EZpvd(this.EZpvd, tokenDetailBottomSheetParams.EZpvd) && Intrinsics.EZpvd(this.copydefault, tokenDetailBottomSheetParams.copydefault) && this.KWHzl == tokenDetailBottomSheetParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        TokenDetailTabType tokenDetailTabType = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tokenDetailTabType == null ? 0 : tokenDetailTabType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenDetailBottomSheetParams(commonData=" + this.EZpvd + ", tabsData=" + this.copydefault + ", initialTab=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.EZpvd.writeToParcel(parcel, i);
        List<TokenDetailTabData> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<TokenDetailTabData> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
        TokenDetailTabType tokenDetailTabType = this.KWHzl;
        if (tokenDetailTabType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(tokenDetailTabType.name());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData> */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenDetailBottomSheetParams(@NotNull TokenDetailCommonParams tokenDetailCommonParams, @NotNull List<? extends TokenDetailTabData> list, TokenDetailTabType tokenDetailTabType) {
        Intrinsics.checkNotNullParameter(tokenDetailCommonParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = tokenDetailCommonParams;
        this.copydefault = list;
        this.KWHzl = tokenDetailTabType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  false
  false
  (null java.lang.String)
  (null java.lang.String)
  false
  (1023 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:106) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r15v0 com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0019: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:107)) : (r16v0 java.util.List))
  (wrap:com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType) : (r17v0 com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType))
 A[MD:(com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams, java.util.List<? extends com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabData>, com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType):void (m)] (LINE:105) call: com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailBottomSheetParams.<init>(com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailCommonParams, java.util.List, com.okinc.business.market.features.meme.token_detail_sheet.ui.TokenDetailTabType):void type: THIS */
    public /* synthetic */ TokenDetailBottomSheetParams(TokenDetailCommonParams tokenDetailCommonParams, List list, TokenDetailTabType tokenDetailTabType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TokenDetailCommonParams(null, null, null, null, null, false, false, null, null, false, 1023, null) : tokenDetailCommonParams, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? null : tokenDetailTabType);
    }

    public final TokenDetailTabType copydefault(int i) {
        TokenDetailTabData tokenDetailTabData = (TokenDetailTabData) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
        if (tokenDetailTabData != null) {
            return tokenDetailTabData.EZpvd();
        }
        return null;
    }

    public final int EZpvd() {
        if (this.KWHzl == null) {
            return 0;
        }
        Iterator<TokenDetailTabData> it = this.copydefault.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().EZpvd() == this.KWHzl) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return 0;
    }
}

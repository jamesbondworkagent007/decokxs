package com.okinc.business.market.features.watch_list_groups.ui.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenGroupSelectionParams implements Parcelable {
    public final GroupSelectionMode EZpvd;
    public final Integer KWHzl;
    public final List<HomeToken> copydefault;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<TokenGroupSelectionParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenGroupSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenGroupSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(HomeToken.CREATOR.createFromParcel(parcel));
            }
            return new TokenGroupSelectionParams(arrayList, GroupSelectionMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenGroupSelectionParams[] newArray(int i) {
            return new TokenGroupSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenGroupSelectionParams copy$default(TokenGroupSelectionParams tokenGroupSelectionParams, List list, GroupSelectionMode groupSelectionMode, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tokenGroupSelectionParams.copydefault;
        }
        if ((i & 2) != 0) {
            groupSelectionMode = tokenGroupSelectionParams.EZpvd;
        }
        if ((i & 4) != 0) {
            num = tokenGroupSelectionParams.KWHzl;
        }
        return tokenGroupSelectionParams.AEQbTJ(list, groupSelectionMode, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenGroupSelectionParams AEQbTJ(@NotNull List<HomeToken> list, @NotNull GroupSelectionMode groupSelectionMode, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(groupSelectionMode, "");
        return new TokenGroupSelectionParams(list, groupSelectionMode, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupSelectionMode KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeToken> OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof TokenGroupSelectionParams)) {
            return false;
        }
        TokenGroupSelectionParams tokenGroupSelectionParams = (TokenGroupSelectionParams) obj;
        return Intrinsics.EZpvd(this.copydefault, tokenGroupSelectionParams.copydefault) && this.EZpvd == tokenGroupSelectionParams.EZpvd && Intrinsics.EZpvd(this.KWHzl, tokenGroupSelectionParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        Integer num = this.KWHzl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenGroupSelectionParams(tokens=" + this.copydefault + ", type=" + this.EZpvd + ", currentGroupId=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        List<HomeToken> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<HomeToken> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.EZpvd.name());
        Integer num = this.KWHzl;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public TokenGroupSelectionParams(@NotNull List<HomeToken> list, @NotNull GroupSelectionMode groupSelectionMode, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(groupSelectionMode, "");
        this.copydefault = list;
        this.EZpvd = groupSelectionMode;
        this.KWHzl = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.util.List)
  (wrap:com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode:0x0004: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode.INDIVIDUAL com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode) : (r2v0 com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r3v0 java.lang.Integer))
 A[MD:(java.util.List<com.okinc.business.market.features.home_token_list.domain.HomeToken>, com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode, java.lang.Integer):void (m)] (LINE:13) call: com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams.<init>(java.util.List, com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode, java.lang.Integer):void type: THIS */
    public /* synthetic */ TokenGroupSelectionParams(List list, GroupSelectionMode groupSelectionMode, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? GroupSelectionMode.INDIVIDUAL : groupSelectionMode, (i & 4) != 0 ? null : num);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}

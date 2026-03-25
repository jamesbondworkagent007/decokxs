package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotCreateCardItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotCreateCardItem> CREATOR = new Creator();
    private final Integer bgTint;
    private final String botName;
    private final String botType;
    private final Integer iconRes;
    private final Integer ivTint;
    private final List<CategoryTag> tags;

    public static final class Creator implements Parcelable.Creator<BotCreateCardItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCreateCardItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(CategoryTag.CREATOR.createFromParcel(parcel));
                }
            }
            return new BotCreateCardItem(string, arrayList, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCreateCardItem[] newArray(int i) {
            return new BotCreateCardItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotCreateCardItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.unify_trade.biz.BotCreateCardItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotCreateCardItem copy$default(BotCreateCardItem botCreateCardItem, String str, List list, String str2, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botCreateCardItem.botType;
        }
        if ((i & 2) != 0) {
            list = botCreateCardItem.tags;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = botCreateCardItem.botName;
        }
        String str3 = str2;
        if ((i & 8) != 0) {
            num = botCreateCardItem.iconRes;
        }
        Integer num4 = num;
        if ((i & 16) != 0) {
            num2 = botCreateCardItem.bgTint;
        }
        Integer num5 = num2;
        if ((i & 32) != 0) {
            num3 = botCreateCardItem.ivTint;
        }
        return botCreateCardItem.copy(str, list2, str3, num4, num5, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> component2() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.bgTint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component6() {
        return this.ivTint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCreateCardItem copy(@NotNull String str, List<CategoryTag> list, @NotNull String str2, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BotCreateCardItem(str, list, str2, num, num2, num3);
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
        if (!(obj instanceof BotCreateCardItem)) {
            return false;
        }
        BotCreateCardItem botCreateCardItem = (BotCreateCardItem) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botCreateCardItem.botType) && Intrinsics.EZpvd(this.tags, botCreateCardItem.tags) && Intrinsics.EZpvd((Object) this.botName, (Object) botCreateCardItem.botName) && Intrinsics.EZpvd(this.iconRes, botCreateCardItem.iconRes) && Intrinsics.EZpvd(this.bgTint, botCreateCardItem.bgTint) && Intrinsics.EZpvd(this.ivTint, botCreateCardItem.ivTint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getBgTint() {
        return this.bgTint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotName() {
        return this.botName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotType() {
        return this.botType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIconRes() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getIvTint() {
        return this.ivTint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        List<CategoryTag> list = this.tags;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.botName.hashCode();
        Integer num = this.iconRes;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        Integer num2 = this.bgTint;
        int iHashCode5 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.ivTint;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotCreateCardItem(botType=" + this.botType + ", tags=" + this.tags + ", botName=" + this.botName + ", iconRes=" + this.iconRes + ", bgTint=" + this.bgTint + ", ivTint=" + this.ivTint + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.botType);
        List<CategoryTag> list = this.tags;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CategoryTag> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.botName);
        Integer num = this.iconRes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.bgTint;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.ivTint;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public BotCreateCardItem(@NotNull String str, List<CategoryTag> list, @NotNull String str2, Integer num, Integer num2, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.botType = str;
        this.tags = list;
        this.botName = str2;
        this.iconRes = num;
        this.bgTint = num2;
        this.ivTint = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r7v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r11v0 java.lang.Integer))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CategoryTag>, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer):void (m)] (LINE:1173) call: com.okinc.unify_trade.biz.BotCreateCardItem.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ BotCreateCardItem(String str, List list, String str2, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3);
    }
}

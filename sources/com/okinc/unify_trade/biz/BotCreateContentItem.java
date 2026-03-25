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
public final class BotCreateContentItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotCreateContentItem> CREATOR = new Creator();
    private final String botDesc;
    private final String botName;
    private final String botType;
    private final Integer iconRes;
    private final List<CategoryTag> tags;

    public static final class Creator implements Parcelable.Creator<BotCreateContentItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCreateContentItem createFromParcel(Parcel parcel) {
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
            return new BotCreateContentItem(string, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCreateContentItem[] newArray(int i) {
            return new BotCreateContentItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotCreateContentItem() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.BotCreateContentItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotCreateContentItem copy$default(BotCreateContentItem botCreateContentItem, String str, List list, String str2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botCreateContentItem.botType;
        }
        if ((i & 2) != 0) {
            list = botCreateContentItem.tags;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = botCreateContentItem.botName;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            str3 = botCreateContentItem.botDesc;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            num = botCreateContentItem.iconRes;
        }
        return botCreateContentItem.copy(str, list2, str4, str5, num);
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
    public final String component4() {
        return this.botDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.iconRes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCreateContentItem copy(@NotNull String str, List<CategoryTag> list, @NotNull String str2, @NotNull String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new BotCreateContentItem(str, list, str2, str3, num);
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
        if (!(obj instanceof BotCreateContentItem)) {
            return false;
        }
        BotCreateContentItem botCreateContentItem = (BotCreateContentItem) obj;
        return Intrinsics.EZpvd((Object) this.botType, (Object) botCreateContentItem.botType) && Intrinsics.EZpvd(this.tags, botCreateContentItem.tags) && Intrinsics.EZpvd((Object) this.botName, (Object) botCreateContentItem.botName) && Intrinsics.EZpvd((Object) this.botDesc, (Object) botCreateContentItem.botDesc) && Intrinsics.EZpvd(this.iconRes, botCreateContentItem.iconRes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBotDesc() {
        return this.botDesc;
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
    public final List<CategoryTag> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.botType.hashCode();
        List<CategoryTag> list = this.tags;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        int iHashCode3 = this.botName.hashCode();
        int iHashCode4 = this.botDesc.hashCode();
        Integer num = this.iconRes;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotCreateContentItem(botType=" + this.botType + ", tags=" + this.tags + ", botName=" + this.botName + ", botDesc=" + this.botDesc + ", iconRes=" + this.iconRes + ")";
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
        parcel.writeString(this.botDesc);
        Integer num = this.iconRes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public BotCreateContentItem(@NotNull String str, List<CategoryTag> list, @NotNull String str2, @NotNull String str3, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.botType = str;
        this.tags = list;
        this.botName = str2;
        this.botDesc = str3;
        this.iconRes = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CategoryTag>, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:1202) call: com.okinc.unify_trade.biz.BotCreateContentItem.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ BotCreateContentItem(String str, List list, String str2, String str3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? null : num);
    }
}

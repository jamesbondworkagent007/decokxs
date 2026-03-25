package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BotCategoryConfig implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BotCategoryConfig> CREATOR = new Creator();
    private final List<MpCategory> homepageCategory;
    private final List<OrderCategory> strategy;
    private final List<String> supportedFeatures;

    public static final class Creator implements Parcelable.Creator<BotCategoryConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCategoryConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(MpCategory.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(OrderCategory.CREATOR.createFromParcel(parcel));
            }
            return new BotCategoryConfig(arrayList, arrayList2, parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotCategoryConfig[] newArray(int i) {
            return new BotCategoryConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.biz.BotCategoryConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BotCategoryConfig copy$default(BotCategoryConfig botCategoryConfig, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = botCategoryConfig.homepageCategory;
        }
        if ((i & 2) != 0) {
            list2 = botCategoryConfig.strategy;
        }
        if ((i & 4) != 0) {
            list3 = botCategoryConfig.supportedFeatures;
        }
        return botCategoryConfig.copy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MpCategory> component1() {
        return this.homepageCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OrderCategory> component2() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.supportedFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotCategoryConfig copy(@NotNull List<MpCategory> list, @NotNull List<OrderCategory> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new BotCategoryConfig(list, list2, list3);
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
        if (!(obj instanceof BotCategoryConfig)) {
            return false;
        }
        BotCategoryConfig botCategoryConfig = (BotCategoryConfig) obj;
        return Intrinsics.EZpvd(this.homepageCategory, botCategoryConfig.homepageCategory) && Intrinsics.EZpvd(this.strategy, botCategoryConfig.strategy) && Intrinsics.EZpvd(this.supportedFeatures, botCategoryConfig.supportedFeatures);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MpCategory> getHomepageCategory() {
        return this.homepageCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<OrderCategory> getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSupportedFeatures() {
        return this.supportedFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.homepageCategory.hashCode() * 31) + this.strategy.hashCode()) * 31) + this.supportedFeatures.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotCategoryConfig(homepageCategory=" + this.homepageCategory + ", strategy=" + this.strategy + ", supportedFeatures=" + this.supportedFeatures + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<MpCategory> list = this.homepageCategory;
        parcel.writeInt(list.size());
        Iterator<MpCategory> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<OrderCategory> list2 = this.strategy;
        parcel.writeInt(list2.size());
        Iterator<OrderCategory> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.supportedFeatures);
    }

    public BotCategoryConfig(@NotNull List<MpCategory> list, @NotNull List<OrderCategory> list2, @NotNull List<String> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.homepageCategory = list;
        this.strategy = list2;
        this.supportedFeatures = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.util.List)
  (r2v0 java.util.List)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1045)) : (r3v0 java.util.List))
 A[MD:(java.util.List<com.okinc.unify_trade.biz.MpCategory>, java.util.List<com.okinc.unify_trade.biz.OrderCategory>, java.util.List<java.lang.String>):void (m)] (LINE:1042) call: com.okinc.unify_trade.biz.BotCategoryConfig.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ BotCategoryConfig(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}

package com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class AutoEarnStakingProfitHistoryOverView implements Parcelable {
    private final String autoEarnProfitUsdt;
    private final String baseTotalProfit;
    private final int currentPage;
    private final String earnType;
    private final List<AutoEarnStakingProfitHistory> list;
    private final int pageLength;
    private final String quoteTotalProfit;
    private final int total;
    private final List<AutoTypeProfit> totalEarn;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<AutoEarnStakingProfitHistoryOverView> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(AutoEarnStakingProfitHistory$$serializer.INSTANCE), null, null, new ArrayListSerializer(AutoTypeProfit$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<AutoEarnStakingProfitHistoryOverView> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingProfitHistoryOverView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(AutoEarnStakingProfitHistory.CREATOR.createFromParcel(parcel));
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i6 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i6);
            for (int i7 = 0; i7 != i6; i7++) {
                arrayList2.add(AutoTypeProfit.CREATOR.createFromParcel(parcel));
            }
            return new AutoEarnStakingProfitHistoryOverView(string, i, i2, i3, arrayList, string2, string3, arrayList2, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoEarnStakingProfitHistoryOverView[] newArray(int i) {
            return new AutoEarnStakingProfitHistoryOverView[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AutoEarnStakingProfitHistoryOverView() {
        this((String) null, 0, 0, 0, (List) null, (String) null, (String) null, (List) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingProfitHistory> component5() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoTypeProfit> component8() {
        return this.totalEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.autoEarnProfitUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AutoEarnStakingProfitHistoryOverView copy(@NotNull String str, int i, int i2, int i3, @NotNull List<AutoEarnStakingProfitHistory> list, @NotNull String str2, @NotNull String str3, @NotNull List<AutoTypeProfit> list2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AutoEarnStakingProfitHistoryOverView(str, i, i2, i3, list, str2, str3, list2, str4);
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
        if (!(obj instanceof AutoEarnStakingProfitHistoryOverView)) {
            return false;
        }
        AutoEarnStakingProfitHistoryOverView autoEarnStakingProfitHistoryOverView = (AutoEarnStakingProfitHistoryOverView) obj;
        return Intrinsics.EZpvd((Object) this.earnType, (Object) autoEarnStakingProfitHistoryOverView.earnType) && this.currentPage == autoEarnStakingProfitHistoryOverView.currentPage && this.pageLength == autoEarnStakingProfitHistoryOverView.pageLength && this.total == autoEarnStakingProfitHistoryOverView.total && Intrinsics.EZpvd(this.list, autoEarnStakingProfitHistoryOverView.list) && Intrinsics.EZpvd((Object) this.baseTotalProfit, (Object) autoEarnStakingProfitHistoryOverView.baseTotalProfit) && Intrinsics.EZpvd((Object) this.quoteTotalProfit, (Object) autoEarnStakingProfitHistoryOverView.quoteTotalProfit) && Intrinsics.EZpvd(this.totalEarn, autoEarnStakingProfitHistoryOverView.totalEarn) && Intrinsics.EZpvd((Object) this.autoEarnProfitUsdt, (Object) autoEarnStakingProfitHistoryOverView.autoEarnProfitUsdt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoEarnProfitUsdt() {
        return this.autoEarnProfitUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseTotalProfit() {
        return this.baseTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrentPage() {
        return this.currentPage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarnType() {
        return this.earnType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoEarnStakingProfitHistory> getList() {
        return this.list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPageLength() {
        return this.pageLength;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteTotalProfit() {
        return this.quoteTotalProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AutoTypeProfit> getTotalEarn() {
        return this.totalEarn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((this.earnType.hashCode() * 31) + Integer.hashCode(this.currentPage)) * 31) + Integer.hashCode(this.pageLength)) * 31) + Integer.hashCode(this.total)) * 31) + this.list.hashCode()) * 31) + this.baseTotalProfit.hashCode()) * 31) + this.quoteTotalProfit.hashCode()) * 31) + this.totalEarn.hashCode()) * 31) + this.autoEarnProfitUsdt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AutoEarnStakingProfitHistoryOverView(earnType=" + this.earnType + ", currentPage=" + this.currentPage + ", pageLength=" + this.pageLength + ", total=" + this.total + ", list=" + this.list + ", baseTotalProfit=" + this.baseTotalProfit + ", quoteTotalProfit=" + this.quoteTotalProfit + ", totalEarn=" + this.totalEarn + ", autoEarnProfitUsdt=" + this.autoEarnProfitUsdt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.earnType);
        parcel.writeInt(this.currentPage);
        parcel.writeInt(this.pageLength);
        parcel.writeInt(this.total);
        List<AutoEarnStakingProfitHistory> list = this.list;
        parcel.writeInt(list.size());
        Iterator<AutoEarnStakingProfitHistory> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.baseTotalProfit);
        parcel.writeString(this.quoteTotalProfit);
        List<AutoTypeProfit> list2 = this.totalEarn;
        parcel.writeInt(list2.size());
        Iterator<AutoTypeProfit> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.autoEarnProfitUsdt);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AutoEarnStakingProfitHistoryOverView> serializer() {
            return AutoEarnStakingProfitHistoryOverView$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AutoEarnStakingProfitHistoryOverView(int i, String str, int i2, int i3, int i4, List list, String str2, String str3, List list2, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.earnType = "";
        } else {
            this.earnType = str;
        }
        if ((i & 2) == 0) {
            this.currentPage = 0;
        } else {
            this.currentPage = i2;
        }
        if ((i & 4) == 0) {
            this.pageLength = 0;
        } else {
            this.pageLength = i3;
        }
        if ((i & 8) == 0) {
            this.total = 0;
        } else {
            this.total = i4;
        }
        if ((i & 16) == 0) {
            this.list = yDY.AhwBna();
        } else {
            this.list = list;
        }
        if ((i & 32) == 0) {
            this.baseTotalProfit = "";
        } else {
            this.baseTotalProfit = str2;
        }
        if ((i & 64) == 0) {
            this.quoteTotalProfit = "";
        } else {
            this.quoteTotalProfit = str3;
        }
        if ((i & 128) == 0) {
            this.totalEarn = yDY.AhwBna();
        } else {
            this.totalEarn = list2;
        }
        if ((i & 256) == 0) {
            this.autoEarnProfitUsdt = "";
        } else {
            this.autoEarnProfitUsdt = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradingBot_trading_bot_impl(AutoEarnStakingProfitHistoryOverView autoEarnStakingProfitHistoryOverView, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) autoEarnStakingProfitHistoryOverView.earnType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, autoEarnStakingProfitHistoryOverView.earnType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || autoEarnStakingProfitHistoryOverView.currentPage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, autoEarnStakingProfitHistoryOverView.currentPage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || autoEarnStakingProfitHistoryOverView.pageLength != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, autoEarnStakingProfitHistoryOverView.pageLength);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || autoEarnStakingProfitHistoryOverView.total != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, autoEarnStakingProfitHistoryOverView.total);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd(autoEarnStakingProfitHistoryOverView.list, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], autoEarnStakingProfitHistoryOverView.list);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) autoEarnStakingProfitHistoryOverView.baseTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, autoEarnStakingProfitHistoryOverView.baseTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) autoEarnStakingProfitHistoryOverView.quoteTotalProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, autoEarnStakingProfitHistoryOverView.quoteTotalProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd(autoEarnStakingProfitHistoryOverView.totalEarn, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], autoEarnStakingProfitHistoryOverView.totalEarn);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) autoEarnStakingProfitHistoryOverView.autoEarnProfitUsdt, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 8, autoEarnStakingProfitHistoryOverView.autoEarnProfitUsdt);
    }

    public AutoEarnStakingProfitHistoryOverView(@NotNull String str, int i, int i2, int i3, @NotNull List<AutoEarnStakingProfitHistory> list, @NotNull String str2, @NotNull String str3, @NotNull List<AutoTypeProfit> list2, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.earnType = str;
        this.currentPage = i;
        this.pageLength = i2;
        this.total = i3;
        this.list = list;
        this.baseTotalProfit = str2;
        this.quoteTotalProfit = str3;
        this.totalEarn = list2;
        this.autoEarnProfitUsdt = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r12v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r13v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r14v0 int) : (0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r15v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, int, int, int, java.util.List<com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistory>, java.lang.String, java.lang.String, java.util.List<com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoTypeProfit>, java.lang.String):void (m)] (LINE:27) call: com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingProfitHistoryOverView.<init>(java.lang.String, int, int, int, java.util.List, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ AutoEarnStakingProfitHistoryOverView(String str, int i, int i2, int i3, List list, String str2, String str3, List list2, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? yDY.AhwBna() : list, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? "" : str3, (i4 & 128) != 0 ? yDY.AhwBna() : list2, (i4 & 256) == 0 ? str4 : "");
    }
}

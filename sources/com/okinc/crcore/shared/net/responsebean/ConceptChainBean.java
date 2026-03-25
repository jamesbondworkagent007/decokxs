package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.ConceptChainResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.ConceptCoinResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ConceptChainBean implements Parcelable {
    private final String changePer24h;
    private final String code;
    private final List<ConceptCoinBean> coinList;
    private final String downNum;
    private final String holdTimeAvg;
    private final String hotIndex;
    private final String introduce;
    private final String marketCap;
    private final String name;
    private final String ratioBuy;
    private final String ratioSell;
    private final String upNum;
    private final String volatility;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConceptChainBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ConceptChainBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConceptChainBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            while (i2 != i) {
                arrayList.add(ConceptCoinBean.CREATOR.createFromParcel(parcel));
                i2++;
                i = i;
            }
            return new ConceptChainBean(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConceptChainBean[] newArray(int i) {
            return new ConceptChainBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConceptChainBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.volatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConceptCoinBean> component13() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.changePer24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.upNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.downNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.holdTimeAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConceptChainBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<ConceptCoinBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ConceptChainBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, list);
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
        if (!(obj instanceof ConceptChainBean)) {
            return false;
        }
        ConceptChainBean conceptChainBean = (ConceptChainBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) conceptChainBean.code) && Intrinsics.EZpvd((Object) this.introduce, (Object) conceptChainBean.introduce) && Intrinsics.EZpvd((Object) this.changePer24h, (Object) conceptChainBean.changePer24h) && Intrinsics.EZpvd((Object) this.upNum, (Object) conceptChainBean.upNum) && Intrinsics.EZpvd((Object) this.downNum, (Object) conceptChainBean.downNum) && Intrinsics.EZpvd((Object) this.hotIndex, (Object) conceptChainBean.hotIndex) && Intrinsics.EZpvd((Object) this.name, (Object) conceptChainBean.name) && Intrinsics.EZpvd((Object) this.marketCap, (Object) conceptChainBean.marketCap) && Intrinsics.EZpvd((Object) this.holdTimeAvg, (Object) conceptChainBean.holdTimeAvg) && Intrinsics.EZpvd((Object) this.volatility, (Object) conceptChainBean.volatility) && Intrinsics.EZpvd((Object) this.ratioBuy, (Object) conceptChainBean.ratioBuy) && Intrinsics.EZpvd((Object) this.ratioSell, (Object) conceptChainBean.ratioSell) && Intrinsics.EZpvd(this.coinList, conceptChainBean.coinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer24h() {
        return this.changePer24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ConceptCoinBean> getCoinList() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDownNum() {
        return this.downNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldTimeAvg() {
        return this.holdTimeAvg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHotIndex() {
        return this.hotIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioBuy() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioSell() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpNum() {
        return this.upNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolatility() {
        return this.volatility;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.code.hashCode() * 31) + this.introduce.hashCode()) * 31) + this.changePer24h.hashCode()) * 31) + this.upNum.hashCode()) * 31) + this.downNum.hashCode()) * 31) + this.hotIndex.hashCode()) * 31) + this.name.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.holdTimeAvg.hashCode()) * 31) + this.volatility.hashCode()) * 31) + this.ratioBuy.hashCode()) * 31) + this.ratioSell.hashCode()) * 31) + this.coinList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConceptChainBean(code=" + this.code + ", introduce=" + this.introduce + ", changePer24h=" + this.changePer24h + ", upNum=" + this.upNum + ", downNum=" + this.downNum + ", hotIndex=" + this.hotIndex + ", name=" + this.name + ", marketCap=" + this.marketCap + ", holdTimeAvg=" + this.holdTimeAvg + ", volatility=" + this.volatility + ", ratioBuy=" + this.ratioBuy + ", ratioSell=" + this.ratioSell + ", coinList=" + this.coinList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.introduce);
        parcel.writeString(this.changePer24h);
        parcel.writeString(this.upNum);
        parcel.writeString(this.downNum);
        parcel.writeString(this.hotIndex);
        parcel.writeString(this.name);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.holdTimeAvg);
        parcel.writeString(this.volatility);
        parcel.writeString(this.ratioBuy);
        parcel.writeString(this.ratioSell);
        List<ConceptCoinBean> list = this.coinList;
        parcel.writeInt(list.size());
        Iterator<ConceptCoinBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ConceptChainBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull List<ConceptCoinBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.code = str;
        this.introduce = str2;
        this.changePer24h = str3;
        this.upNum = str4;
        this.downNum = str5;
        this.hotIndex = str6;
        this.name = str7;
        this.marketCap = str8;
        this.holdTimeAvg = str9;
        this.volatility = str10;
        this.ratioBuy = str11;
        this.ratioSell = str12;
        this.coinList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0088: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r26v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r27v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.crcore.shared.net.responsebean.ConceptCoinBean>):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.ConceptChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ConceptChainBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "", (i & 4096) != 0 ? yDY.AhwBna() : list);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.ConceptChainBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<ConceptChainBean> OLrzqt(@NotNull List<ConceptChainResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            int i = 10;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ConceptChainResponseBean conceptChainResponseBean = (ConceptChainResponseBean) it.next();
                String code = conceptChainResponseBean.getCode();
                String introduce = conceptChainResponseBean.getIntroduce();
                String changePer24h = conceptChainResponseBean.getChangePer24h();
                String upNum = conceptChainResponseBean.getUpNum();
                String downNum = conceptChainResponseBean.getDownNum();
                String hotIndex = conceptChainResponseBean.getHotIndex();
                String name = conceptChainResponseBean.getName();
                String marketCap = conceptChainResponseBean.getMarketCap();
                String holdTimeAvg = conceptChainResponseBean.getHoldTimeAvg();
                String volatility = conceptChainResponseBean.getVolatility();
                String ratioBuy = conceptChainResponseBean.getRatioBuy();
                String ratioSell = conceptChainResponseBean.getRatioSell();
                ArrayList<ConceptCoinResponseBean> coinList = conceptChainResponseBean.getCoinList();
                Iterator it2 = it;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(coinList, i));
                Iterator<T> it3 = coinList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ConceptCoinBean.Companion.copydefault((ConceptCoinResponseBean) it3.next()));
                }
                arrayList.add(new ConceptChainBean(code, introduce, changePer24h, upNum, downNum, hotIndex, name, marketCap, holdTimeAvg, volatility, ratioBuy, ratioSell, arrayList2));
                it = it2;
                i = 10;
            }
            return arrayList;
        }
    }
}

package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.PairGainersLosersResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PairGainersLosersBean implements Parcelable {
    public static final int $stable = 0;
    private final String changePer;
    private final String displayId;
    private final String instId;
    private final String instType;
    private final String lastPrice;
    private final String quoteVolume24h;
    private final String volume24h;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final Parcelable.Creator<PairGainersLosersBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<PairGainersLosersBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairGainersLosersBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PairGainersLosersBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PairGainersLosersBean[] newArray(int i) {
            return new PairGainersLosersBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PairGainersLosersBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PairGainersLosersBean copy$default(PairGainersLosersBean pairGainersLosersBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pairGainersLosersBean.instId;
        }
        if ((i & 2) != 0) {
            str2 = pairGainersLosersBean.displayId;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = pairGainersLosersBean.instType;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = pairGainersLosersBean.changePer;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = pairGainersLosersBean.lastPrice;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = pairGainersLosersBean.volume24h;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = pairGainersLosersBean.quoteVolume24h;
        }
        return pairGainersLosersBean.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PairGainersLosersBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PairGainersLosersBean(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof PairGainersLosersBean)) {
            return false;
        }
        PairGainersLosersBean pairGainersLosersBean = (PairGainersLosersBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) pairGainersLosersBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) pairGainersLosersBean.displayId) && Intrinsics.EZpvd((Object) this.instType, (Object) pairGainersLosersBean.instType) && Intrinsics.EZpvd((Object) this.changePer, (Object) pairGainersLosersBean.changePer) && Intrinsics.EZpvd((Object) this.lastPrice, (Object) pairGainersLosersBean.lastPrice) && Intrinsics.EZpvd((Object) this.volume24h, (Object) pairGainersLosersBean.volume24h) && Intrinsics.EZpvd((Object) this.quoteVolume24h, (Object) pairGainersLosersBean.quoteVolume24h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangePer() {
        return this.changePer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastPrice() {
        return this.lastPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteVolume24h() {
        return this.quoteVolume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolume24h() {
        return this.volume24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.instType.hashCode()) * 31) + this.changePer.hashCode()) * 31) + this.lastPrice.hashCode()) * 31) + this.volume24h.hashCode()) * 31) + this.quoteVolume24h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PairGainersLosersBean(instId=" + this.instId + ", displayId=" + this.displayId + ", instType=" + this.instType + ", changePer=" + this.changePer + ", lastPrice=" + this.lastPrice + ", volume24h=" + this.volume24h + ", quoteVolume24h=" + this.quoteVolume24h + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.instType);
        parcel.writeString(this.changePer);
        parcel.writeString(this.lastPrice);
        parcel.writeString(this.volume24h);
        parcel.writeString(this.quoteVolume24h);
    }

    public PairGainersLosersBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.instId = str;
        this.displayId = str2;
        this.instType = str3;
        this.changePer = str4;
        this.lastPrice = str5;
        this.volume24h = str6;
        this.quoteVolume24h = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.PairGainersLosersBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PairGainersLosersBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.PairGainersLosersBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<Map<String, List<PairGainersLosersBean>>> copydefault(@NotNull List<? extends Map<String, ? extends List<PairGainersLosersResponseBean>>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Map map = (Map) it.next();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Iterable<PairGainersLosersResponseBean> iterable = (Iterable) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(iterable, 10));
                    for (PairGainersLosersResponseBean pairGainersLosersResponseBean : iterable) {
                        arrayList3.add(new PairGainersLosersBean(pairGainersLosersResponseBean.getInstId(), pairGainersLosersResponseBean.getDisplayId(), pairGainersLosersResponseBean.getInstType(), pairGainersLosersResponseBean.getChangePer(), pairGainersLosersResponseBean.getLastPrice(), pairGainersLosersResponseBean.getVolume24h(), pairGainersLosersResponseBean.getQuoteVolume24h()));
                    }
                    linkedHashMap.put(key, arrayList3);
                }
                arrayList2.add(Boolean.valueOf(arrayList.add(C56424yEw.values(linkedHashMap))));
            }
            return arrayList;
        }
    }
}

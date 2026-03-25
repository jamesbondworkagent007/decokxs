package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.TokenChartResponseBeans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class TokenChartBeans implements Parcelable {
    private final String coin;
    private final String fullName;
    private final List<List<String>> trend;
    private final String url;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenChartBeans> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<TokenChartBeans> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenChartBeans createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.createStringArrayList());
            }
            return new TokenChartBeans(string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenChartBeans[] newArray(int i) {
            return new TokenChartBeans[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenChartBeans() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.crcore.shared.net.responsebean.TokenChartBeans */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TokenChartBeans copy$default(TokenChartBeans tokenChartBeans, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenChartBeans.coin;
        }
        if ((i & 2) != 0) {
            str2 = tokenChartBeans.fullName;
        }
        if ((i & 4) != 0) {
            str3 = tokenChartBeans.url;
        }
        if ((i & 8) != 0) {
            list = tokenChartBeans.trend;
        }
        return tokenChartBeans.copy(str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component4() {
        return this.trend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenChartBeans copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TokenChartBeans(str, str2, str3, list);
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
        if (!(obj instanceof TokenChartBeans)) {
            return false;
        }
        TokenChartBeans tokenChartBeans = (TokenChartBeans) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) tokenChartBeans.coin) && Intrinsics.EZpvd((Object) this.fullName, (Object) tokenChartBeans.fullName) && Intrinsics.EZpvd((Object) this.url, (Object) tokenChartBeans.url) && Intrinsics.EZpvd(this.trend, tokenChartBeans.trend);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getTrend() {
        return this.trend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.coin.hashCode() * 31) + this.fullName.hashCode()) * 31) + this.url.hashCode()) * 31) + this.trend.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenChartBeans(coin=" + this.coin + ", fullName=" + this.fullName + ", url=" + this.url + ", trend=" + this.trend + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coin);
        parcel.writeString(this.fullName);
        parcel.writeString(this.url);
        List<List<String>> list = this.trend;
        parcel.writeInt(list.size());
        Iterator<List<String>> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeStringList(it.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TokenChartBeans(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.coin = str;
        this.fullName = str2;
        this.url = str3;
        this.trend = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.TokenChartBeans.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TokenChartBeans(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? yDY.AhwBna() : list);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.TokenChartBeans.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<TokenChartBeans> copydefault(@NotNull List<TokenChartResponseBeans> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TokenChartResponseBeans tokenChartResponseBeans : list) {
                arrayList.add(new TokenChartBeans(tokenChartResponseBeans.getCoin(), tokenChartResponseBeans.getFullName(), tokenChartResponseBeans.getUrl(), tokenChartResponseBeans.getTrend()));
            }
            return arrayList;
        }
    }
}

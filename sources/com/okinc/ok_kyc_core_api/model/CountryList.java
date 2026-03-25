package com.okinc.ok_kyc_core_api.model;

import com.okinc.ok_kyc_core_api.model.CountryBean;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class CountryList {
    public static final int $stable = 8;
    private final TreeMap<String, ArrayList<CountryBean.Country>> allCountries;
    private final List<CountryBean.Country> commonCountries;
    private final CountryBean.Country defaultCountry;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CountryList() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.ok_kyc_core_api.model.CountryList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CountryList copy$default(CountryList countryList, TreeMap treeMap, List list, CountryBean.Country country, int i, Object obj) {
        if ((i & 1) != 0) {
            treeMap = countryList.allCountries;
        }
        if ((i & 2) != 0) {
            list = countryList.commonCountries;
        }
        if ((i & 4) != 0) {
            country = countryList.defaultCountry;
        }
        return countryList.copy(treeMap, list, country);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TreeMap<String, ArrayList<CountryBean.Country>> component1() {
        return this.allCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CountryBean.Country> component2() {
        return this.commonCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountryBean.Country component3() {
        return this.defaultCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountryList copy(@NotNull TreeMap<String, ArrayList<CountryBean.Country>> treeMap, @NotNull List<CountryBean.Country> list, @NotNull CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(country, "");
        return new CountryList(treeMap, list, country);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CountryList)) {
            return false;
        }
        CountryList countryList = (CountryList) obj;
        return Intrinsics.EZpvd(this.allCountries, countryList.allCountries) && Intrinsics.EZpvd(this.commonCountries, countryList.commonCountries) && Intrinsics.EZpvd(this.defaultCountry, countryList.defaultCountry);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TreeMap<String, ArrayList<CountryBean.Country>> getAllCountries() {
        return this.allCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CountryBean.Country> getCommonCountries() {
        return this.commonCountries;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CountryBean.Country getDefaultCountry() {
        return this.defaultCountry;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.allCountries.hashCode() * 31) + this.commonCountries.hashCode()) * 31) + this.defaultCountry.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CountryList(allCountries=" + this.allCountries + ", commonCountries=" + this.commonCountries + ", defaultCountry=" + this.defaultCountry + ")";
    }

    public CountryList(@NotNull TreeMap<String, ArrayList<CountryBean.Country>> treeMap, @NotNull List<CountryBean.Country> list, @NotNull CountryBean.Country country) {
        Intrinsics.checkNotNullParameter(treeMap, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(country, "");
        this.allCountries = treeMap;
        this.commonCountries = list;
        this.defaultCountry = country;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (wrap:java.util.TreeMap:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.TreeMap:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:117) call: java.util.TreeMap.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.TreeMap))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:118)) : (r2v0 java.util.List))
  (wrap:com.okinc.ok_kyc_core_api.model.CountryBean$Country:?: TERNARY null = ((wrap:int:0x0011: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.ok_kyc_core_api.model.CountryBean$Country:0x0017: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:119) call: com.okinc.ok_kyc_core_api.model.CountryBean.Country.<init>():void type: CONSTRUCTOR) : (r3v0 com.okinc.ok_kyc_core_api.model.CountryBean$Country))
 A[MD:(java.util.TreeMap<java.lang.String, java.util.ArrayList<com.okinc.ok_kyc_core_api.model.CountryBean$Country>>, java.util.List<com.okinc.ok_kyc_core_api.model.CountryBean$Country>, com.okinc.ok_kyc_core_api.model.CountryBean$Country):void (m)] (LINE:116) call: com.okinc.ok_kyc_core_api.model.CountryList.<init>(java.util.TreeMap, java.util.List, com.okinc.ok_kyc_core_api.model.CountryBean$Country):void type: THIS */
    public /* synthetic */ CountryList(TreeMap treeMap, List list, CountryBean.Country country, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TreeMap() : treeMap, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? new CountryBean.Country() : country);
    }
}

package com.okinc.business.market.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class ModuleBoostHeaderData {
    public static final int $stable = 8;
    private final List<ModuleBoostTokenData> carouselTokens;
    private final String competitionDeeplink;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ModuleBoostHeaderData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.data.model.ModuleBoostHeaderData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleBoostHeaderData copy$default(ModuleBoostHeaderData moduleBoostHeaderData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = moduleBoostHeaderData.carouselTokens;
        }
        if ((i & 2) != 0) {
            str = moduleBoostHeaderData.competitionDeeplink;
        }
        return moduleBoostHeaderData.copy(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleBoostTokenData> component1() {
        return this.carouselTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.competitionDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ModuleBoostHeaderData copy(List<ModuleBoostTokenData> list, String str) {
        return new ModuleBoostHeaderData(list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModuleBoostHeaderData)) {
            return false;
        }
        ModuleBoostHeaderData moduleBoostHeaderData = (ModuleBoostHeaderData) obj;
        return Intrinsics.EZpvd(this.carouselTokens, moduleBoostHeaderData.carouselTokens) && Intrinsics.EZpvd((Object) this.competitionDeeplink, (Object) moduleBoostHeaderData.competitionDeeplink);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ModuleBoostTokenData> getCarouselTokens() {
        return this.carouselTokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCompetitionDeeplink() {
        return this.competitionDeeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<ModuleBoostTokenData> list = this.carouselTokens;
        int iHashCode = list == null ? 0 : list.hashCode();
        String str = this.competitionDeeplink;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ModuleBoostHeaderData(carouselTokens=" + this.carouselTokens + ", competitionDeeplink=" + this.competitionDeeplink + ")";
    }

    public ModuleBoostHeaderData(List<ModuleBoostTokenData> list, String str) {
        this.carouselTokens = list;
        this.competitionDeeplink = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.data.model.ModuleBoostTokenData>, java.lang.String):void (m)] (LINE:14) call: com.okinc.business.market.data.model.ModuleBoostHeaderData.<init>(java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ ModuleBoostHeaderData(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}

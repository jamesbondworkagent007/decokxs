package com.okinc.network.okg.cor;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class CORDomain {
    public static final int $stable = 0;
    private final String dexDomain;
    private final String httpDomain;
    private final String userSite;
    private final String v5Domain;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CORDomain copy$default(CORDomain cORDomain, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cORDomain.userSite;
        }
        if ((i & 2) != 0) {
            str2 = cORDomain.httpDomain;
        }
        if ((i & 4) != 0) {
            str3 = cORDomain.v5Domain;
        }
        if ((i & 8) != 0) {
            str4 = cORDomain.dexDomain;
        }
        return cORDomain.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.httpDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.v5Domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dexDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CORDomain copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new CORDomain(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CORDomain)) {
            return false;
        }
        CORDomain cORDomain = (CORDomain) obj;
        return Intrinsics.EZpvd((Object) this.userSite, (Object) cORDomain.userSite) && Intrinsics.EZpvd((Object) this.httpDomain, (Object) cORDomain.httpDomain) && Intrinsics.EZpvd((Object) this.v5Domain, (Object) cORDomain.v5Domain) && Intrinsics.EZpvd((Object) this.dexDomain, (Object) cORDomain.dexDomain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexDomain() {
        return this.dexDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHttpDomain() {
        return this.httpDomain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserSite() {
        return this.userSite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getV5Domain() {
        return this.v5Domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.userSite.hashCode() * 31) + this.httpDomain.hashCode()) * 31) + this.v5Domain.hashCode()) * 31) + this.dexDomain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CORDomain(userSite=" + this.userSite + ", httpDomain=" + this.httpDomain + ", v5Domain=" + this.v5Domain + ", dexDomain=" + this.dexDomain + ")";
    }

    public CORDomain(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.userSite = str;
        this.httpDomain = str2;
        this.v5Domain = str3;
        this.dexDomain = str4;
    }
}

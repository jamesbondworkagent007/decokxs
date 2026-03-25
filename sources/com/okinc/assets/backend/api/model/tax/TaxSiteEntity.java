package com.okinc.assets.backend.api.model.tax;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxSiteEntity {
    public static final int $stable = 0;
    private final String taxCenter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TaxSiteEntity copy$default(TaxSiteEntity taxSiteEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxSiteEntity.taxCenter;
        }
        return taxSiteEntity.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.taxCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxSiteEntity copy(String str) {
        return new TaxSiteEntity(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TaxSiteEntity) && Intrinsics.EZpvd((Object) this.taxCenter, (Object) ((TaxSiteEntity) obj).taxCenter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTaxCenter() {
        return this.taxCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.taxCenter;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxSiteEntity(taxCenter=" + this.taxCenter + ")";
    }

    public TaxSiteEntity(String str) {
        this.taxCenter = str;
    }
}

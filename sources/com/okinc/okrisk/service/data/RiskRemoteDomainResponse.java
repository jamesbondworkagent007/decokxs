package com.okinc.okrisk.service.data;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class RiskRemoteDomainResponse {
    public static final int $stable = 8;
    private final ArrayList<String> tmxUrls;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okrisk.service.data.RiskRemoteDomainResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RiskRemoteDomainResponse copy$default(RiskRemoteDomainResponse riskRemoteDomainResponse, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = riskRemoteDomainResponse.tmxUrls;
        }
        return riskRemoteDomainResponse.copy(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> component1() {
        return this.tmxUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskRemoteDomainResponse copy(ArrayList<String> arrayList) {
        return new RiskRemoteDomainResponse(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RiskRemoteDomainResponse) && Intrinsics.EZpvd(this.tmxUrls, ((RiskRemoteDomainResponse) obj).tmxUrls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTmxUrls() {
        return this.tmxUrls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<String> arrayList = this.tmxUrls;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskRemoteDomainResponse(tmxUrls=" + this.tmxUrls + ")";
    }

    public RiskRemoteDomainResponse(ArrayList<String> arrayList) {
        this.tmxUrls = arrayList;
    }
}

package com.okinc.business.trade.features.home.meme.usecase.transaction;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV6DeFiPlatformUseCase {
    @yCM
    public MemeV6DeFiPlatformUseCase() {
    }

    public static final class PlatformSelectionResult {
        public static final int $stable = 0;
        private final String selectedPlatformId;
        private final String selectedPlatformName;
        private final boolean shouldShowPlatformNotAvailable;
        private final String unavailablePlatformName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PlatformSelectionResult copy$default(PlatformSelectionResult platformSelectionResult, String str, String str2, boolean z, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = platformSelectionResult.selectedPlatformId;
            }
            if ((i & 2) != 0) {
                str2 = platformSelectionResult.selectedPlatformName;
            }
            if ((i & 4) != 0) {
                z = platformSelectionResult.shouldShowPlatformNotAvailable;
            }
            if ((i & 8) != 0) {
                str3 = platformSelectionResult.unavailablePlatformName;
            }
            return platformSelectionResult.copy(str, str2, z, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.selectedPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.selectedPlatformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component3() {
            return this.shouldShowPlatformNotAvailable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.unavailablePlatformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PlatformSelectionResult copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new PlatformSelectionResult(str, str2, z, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformSelectionResult)) {
                return false;
            }
            PlatformSelectionResult platformSelectionResult = (PlatformSelectionResult) obj;
            return Intrinsics.EZpvd((Object) this.selectedPlatformId, (Object) platformSelectionResult.selectedPlatformId) && Intrinsics.EZpvd((Object) this.selectedPlatformName, (Object) platformSelectionResult.selectedPlatformName) && this.shouldShowPlatformNotAvailable == platformSelectionResult.shouldShowPlatformNotAvailable && Intrinsics.EZpvd((Object) this.unavailablePlatformName, (Object) platformSelectionResult.unavailablePlatformName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSelectedPlatformId() {
            return this.selectedPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSelectedPlatformName() {
            return this.selectedPlatformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getShouldShowPlatformNotAvailable() {
            return this.shouldShowPlatformNotAvailable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUnavailablePlatformName() {
            return this.unavailablePlatformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.selectedPlatformId.hashCode() * 31) + this.selectedPlatformName.hashCode()) * 31) + Boolean.hashCode(this.shouldShowPlatformNotAvailable)) * 31) + this.unavailablePlatformName.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PlatformSelectionResult(selectedPlatformId=" + this.selectedPlatformId + ", selectedPlatformName=" + this.selectedPlatformName + ", shouldShowPlatformNotAvailable=" + this.shouldShowPlatformNotAvailable + ", unavailablePlatformName=" + this.unavailablePlatformName + ")";
        }

        public PlatformSelectionResult(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.selectedPlatformId = str;
            this.selectedPlatformName = str2;
            this.shouldShowPlatformNotAvailable = z;
            this.unavailablePlatformName = str3;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (r3v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:31) call: com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6DeFiPlatformUseCase.PlatformSelectionResult.<init>(java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
        public /* synthetic */ PlatformSelectionResult(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? "" : str3);
        }
    }

    public final PlatformSelectionResult KWHzl(V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull String str, @NotNull String str2) {
        List<DefiPlatformInfo> defiPlatformInfoList;
        DefiPlatformInfo defiPlatformInfo;
        String name;
        Object next;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (v6BaseQuoteResponse == null || (defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList()) == null || defiPlatformInfoList.isEmpty()) {
            return new PlatformSelectionResult("", "", false, null, 8, null);
        }
        List<DefiPlatformInfo> defiPlatformInfoList2 = v6BaseQuoteResponse.getDefiPlatformInfoList();
        if (defiPlatformInfoList2 != null) {
            Iterator<T> it = defiPlatformInfoList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (Object) str)) {
                    break;
                }
            }
            defiPlatformInfo = (DefiPlatformInfo) next;
        } else {
            defiPlatformInfo = null;
        }
        boolean z = defiPlatformInfo != null;
        boolean z2 = str.length() > 0 && !z;
        if (str.length() != 0 && z) {
            name = str2;
        } else {
            List<DefiPlatformInfo> defiPlatformInfoList3 = v6BaseQuoteResponse.getDefiPlatformInfoList();
            DefiPlatformInfo defiPlatformInfo2 = defiPlatformInfoList3 != null ? (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList3) : null;
            str = defiPlatformInfo2 != null ? defiPlatformInfo2.getDefiPlatformId() : null;
            if (str == null) {
                str = "";
            }
            name = defiPlatformInfo2 != null ? defiPlatformInfo2.getName() : null;
            if (name == null) {
                name = "";
            }
        }
        if (!z2) {
            str2 = "";
        }
        return new PlatformSelectionResult(str, name, z2, str2);
    }
}

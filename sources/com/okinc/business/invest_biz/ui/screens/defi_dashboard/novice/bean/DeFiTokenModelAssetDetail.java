package com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C24236iZy;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DeFiTokenModelAssetDetail {
    public final Function0<Unit> EZpvd;
    public final String KWHzl;
    public final List<C24236iZy> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.defi_dashboard.novice.bean.DeFiTokenModelAssetDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeFiTokenModelAssetDetail copy$default(DeFiTokenModelAssetDetail deFiTokenModelAssetDetail, List list, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deFiTokenModelAssetDetail.copydefault;
        }
        if ((i & 2) != 0) {
            str = deFiTokenModelAssetDetail.KWHzl;
        }
        if ((i & 4) != 0) {
            function0 = deFiTokenModelAssetDetail.EZpvd;
        }
        return deFiTokenModelAssetDetail.OLrzqt(list, str, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C24236iZy> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeFiTokenModelAssetDetail OLrzqt(@NotNull List<C24236iZy> list, String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DeFiTokenModelAssetDetail(list, str, function0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeFiTokenModelAssetDetail)) {
            return false;
        }
        DeFiTokenModelAssetDetail deFiTokenModelAssetDetail = (DeFiTokenModelAssetDetail) obj;
        return Intrinsics.EZpvd(this.copydefault, deFiTokenModelAssetDetail.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) deFiTokenModelAssetDetail.KWHzl) && Intrinsics.EZpvd(this.EZpvd, deFiTokenModelAssetDetail.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Function0<Unit> function0 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (function0 != null ? function0.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeFiTokenModelAssetDetail(primaryAssets=" + this.copydefault + ", buttonText=" + this.KWHzl + ", onButtonClick=" + this.EZpvd + ")";
    }

    public DeFiTokenModelAssetDetail(@NotNull List<C24236iZy> list, String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.KWHzl = str;
        this.EZpvd = function0;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class StyleType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ StyleType[] $VALUES;
        public static final StyleType BASIC = new StyleType("BASIC", 0);
        public static final StyleType POSITION = new StyleType("POSITION", 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ StyleType[] $values() {
            return new StyleType[]{BASIC, POSITION};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<StyleType> getEntries() {
            return $ENTRIES;
        }

        private StyleType(String str, int i) {
        }

        static {
            StyleType[] styleTypeArr$values = $values();
            $VALUES = styleTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(styleTypeArr$values);
        }

        public static StyleType valueOf(String str) {
            return (StyleType) Enum.valueOf(StyleType.class, str);
        }

        public static StyleType[] values() {
            return (StyleType[]) $VALUES.clone();
        }
    }
}

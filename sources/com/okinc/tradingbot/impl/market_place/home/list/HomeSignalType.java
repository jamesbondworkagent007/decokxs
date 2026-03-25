package com.okinc.tradingbot.impl.market_place.home.list;

import androidx.annotation.StringRes;
import com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56002xub;
import o.C56402yEa;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class HomeSignalType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ HomeSignalType[] $VALUES;
    public static final StateListAnimator Companion;
    private final int title;
    private String type;
    public static final HomeSignalType ALL = new HomeSignalType("ALL", 0, C55688xof.Application.aPFruk, "");
    public static final HomeSignalType MONTHLY_FEE = new HomeSignalType("MONTHLY_FEE", 1, C55688xof.Application.OFqMGB, "subscription");
    public static final HomeSignalType SHARE_PROFIT = new HomeSignalType("SHARE_PROFIT", 2, C55688xof.Application.ardYFU, "profit_sharing");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ HomeSignalType[] $values() {
        return new HomeSignalType[]{ALL, MONTHLY_FEE, SHARE_PROFIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<HomeSignalType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    private HomeSignalType(@StringRes String str, int i, int i2, String str2) {
        this.title = i2;
        this.type = str2;
    }

    static {
        HomeSignalType[] homeSignalTypeArr$values = $values();
        $VALUES = homeSignalTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(homeSignalTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.market_place.home.list.HomeSignalType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<HomeSignalType> AEQbTJ() {
            HomeSignalType[] homeSignalTypeArrValues = HomeSignalType.values();
            ArrayList arrayList = new ArrayList();
            for (HomeSignalType homeSignalType : homeSignalTypeArrValues) {
                if (homeSignalType != HomeSignalType.ALL && (homeSignalType != HomeSignalType.MONTHLY_FEE || C56002xub.KWHzl.AEQbTJ())) {
                    arrayList.add(homeSignalType);
                }
            }
            String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.vop
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return HomeSignalType.StateListAnimator.AEQbTJ((HomeSignalType) obj);
                }
            }, 30, null);
            HomeSignalType homeSignalType2 = HomeSignalType.ALL;
            homeSignalType2.setType(strJoinToString$default);
            return CollectionsKt___CollectionsKt.djBIcL((Collection) C56402yEa.EZpvd(homeSignalType2), (Iterable) arrayList);
        }

        public static final CharSequence AEQbTJ(HomeSignalType homeSignalType) {
            Intrinsics.checkNotNullParameter(homeSignalType, "");
            return homeSignalType.getType();
        }
    }

    public static HomeSignalType valueOf(String str) {
        return (HomeSignalType) Enum.valueOf(HomeSignalType.class, str);
    }

    public static HomeSignalType[] values() {
        return (HomeSignalType[]) $VALUES.clone();
    }
}

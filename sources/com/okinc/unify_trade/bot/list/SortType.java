package com.okinc.unify_trade.bot.list;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SortType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SortType[] $VALUES;
    public static final StateListAnimator Companion;
    private final String apiValue;
    public static final SortType CREATE_TIME = new SortType("CREATE_TIME", 0, "createTime");
    public static final SortType PNL_PERCENT = new SortType("PNL_PERCENT", 1, "pnlRatio");
    public static final SortType COIN_NAME = new SortType("COIN_NAME", 2, "currency");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SortType[] $values() {
        return new SortType[]{CREATE_TIME, PNL_PERCENT, COIN_NAME};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SortType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApiValue() {
        return this.apiValue;
    }

    private SortType(String str, int i, String str2) {
        this.apiValue = str2;
    }

    static {
        SortType[] sortTypeArr$values = $values();
        $VALUES = sortTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sortTypeArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.list.SortType.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final SortType EZpvd(@NotNull String str) {
            SortType next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<SortType> it = SortType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getApiValue(), (Object) str)) {
                    break;
                }
            }
            SortType sortType = next;
            return sortType == null ? SortType.CREATE_TIME : sortType;
        }
    }

    public static SortType valueOf(String str) {
        return (SortType) Enum.valueOf(SortType.class, str);
    }

    public static SortType[] values() {
        return (SortType[]) $VALUES.clone();
    }
}

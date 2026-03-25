package com.okinc.unify_trade.bot.config;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class SpotTpSlStopType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SpotTpSlStopType[] $VALUES;
    public static final TaskDescription Companion;
    private String title = "";
    private final String value;
    public static final SpotTpSlStopType CLOSURE_RETURN_USDT = new SpotTpSlStopType("CLOSURE_RETURN_USDT", 0, "5");
    public static final SpotTpSlStopType CLOSURE_RETURN_QUOTE = new SpotTpSlStopType("CLOSURE_RETURN_QUOTE", 1, "1");
    public static final SpotTpSlStopType CLOSURE_RETURN_BASE_QUOTE = new SpotTpSlStopType("CLOSURE_RETURN_BASE_QUOTE", 2, "2");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SpotTpSlStopType[] $values() {
        return new SpotTpSlStopType[]{CLOSURE_RETURN_USDT, CLOSURE_RETURN_QUOTE, CLOSURE_RETURN_BASE_QUOTE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SpotTpSlStopType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    private SpotTpSlStopType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        SpotTpSlStopType[] spotTpSlStopTypeArr$values = $values();
        $VALUES = spotTpSlStopTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(spotTpSlStopTypeArr$values);
        Companion = new TaskDescription(null);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.config.SpotTpSlStopType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final SpotTpSlStopType OLrzqt(String str) {
            SpotTpSlStopType next;
            Iterator<SpotTpSlStopType> it = SpotTpSlStopType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            return next;
        }
    }

    public static SpotTpSlStopType valueOf(String str) {
        return (SpotTpSlStopType) Enum.valueOf(SpotTpSlStopType.class, str);
    }

    public static SpotTpSlStopType[] values() {
        return (SpotTpSlStopType[]) $VALUES.clone();
    }
}

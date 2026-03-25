package com.okinc.tradingbot.impl.order.strategy.dcd.constant;

import android.os.Bundle;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import com.okinc.tradingbot.impl.order.strategy.botTradeContainer.BotTradeTabType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import o.C56444yFp;
import o.InterfaceC47982uAp;
import o.InterfaceC56445yFq;
import o.vLE;
import o.vLO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdCreateSegmentType implements InterfaceC47982uAp {
    public final Bundle OLrzqt;
    public final Segment copydefault;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Segment copydefault() {
        return this.copydefault;
    }

    public DcdCreateSegmentType(@NotNull Segment segment, Bundle bundle) {
        Intrinsics.checkNotNullParameter(segment, "");
        this.copydefault = segment;
        this.OLrzqt = bundle;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.order.strategy.dcd.constant.DcdCreateSegmentType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC47982uAp
    public Fragment getFragment(Object obj) {
        Fragment vlo;
        if (this.copydefault == Segment.AI) {
            vlo = new vLE();
        } else {
            vlo = new vLO();
        }
        Bundle arguments = vlo.getArguments();
        if (arguments != null) {
            arguments.putAll(this.OLrzqt);
        } else {
            arguments = this.OLrzqt;
        }
        vlo.setArguments(arguments);
        return vlo;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Segment {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Segment[] $VALUES;
        public static final Segment AI = new Segment("AI", 0, C55688xof.Application.setRatingType, "ai_mode", BotTradeTabType.E2E_AI_TAB);
        public static final Segment MANUAL = new Segment("MANUAL", 1, C55688xof.Application.valueType, "manual_mode", BotTradeTabType.E2E_MANUAL_TAB);
        private final String e2eKey;
        private final String eventName;
        private final int title;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Segment[] $values() {
            return new Segment[]{AI, MANUAL};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Segment> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getE2eKey() {
            return this.e2eKey;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEventName() {
            return this.eventName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitle() {
            return this.title;
        }

        private Segment(@StringRes String str, int i, int i2, String str2, String str3) {
            this.title = i2;
            this.eventName = str2;
            this.e2eKey = str3;
        }

        static {
            Segment[] segmentArr$values = $values();
            $VALUES = segmentArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(segmentArr$values);
        }

        public static Segment valueOf(String str) {
            return (Segment) Enum.valueOf(Segment.class, str);
        }

        public static Segment[] values() {
            return (Segment[]) $VALUES.clone();
        }
    }
}

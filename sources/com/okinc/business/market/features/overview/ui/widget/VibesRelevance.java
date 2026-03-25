package com.okinc.business.market.features.overview.ui.widget;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33129mqd;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class VibesRelevance {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VibesRelevance[] $VALUES;
    public static final Activity Companion;
    public static final VibesRelevance HIGH = new VibesRelevance(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 0);
    public static final VibesRelevance LIKELY = new VibesRelevance("LIKELY", 1);
    public static final VibesRelevance WEAK = new VibesRelevance("WEAK", 2);
    public static final VibesRelevance UNRELIABLE = new VibesRelevance("UNRELIABLE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VibesRelevance[] $values() {
        return new VibesRelevance[]{HIGH, LIKELY, WEAK, UNRELIABLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VibesRelevance> getEntries() {
        return $ENTRIES;
    }

    private VibesRelevance(String str, int i) {
    }

    static {
        VibesRelevance[] vibesRelevanceArr$values = $values();
        $VALUES = vibesRelevanceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(vibesRelevanceArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.overview.ui.widget.VibesRelevance.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final VibesRelevance OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (C33129mqd.copydefault(str, "1")) {
                return VibesRelevance.HIGH;
            }
            if (C33129mqd.copydefault(str, SlippageConfigVo.MAX_SLIP)) {
                return VibesRelevance.LIKELY;
            }
            if (C33129mqd.copydefault(str, "0.2")) {
                return VibesRelevance.WEAK;
            }
            return VibesRelevance.UNRELIABLE;
        }
    }

    public static VibesRelevance valueOf(String str) {
        return (VibesRelevance) Enum.valueOf(VibesRelevance.class, str);
    }

    public static VibesRelevance[] values() {
        return (VibesRelevance[]) $VALUES.clone();
    }
}

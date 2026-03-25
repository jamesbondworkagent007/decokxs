package com.okinc.tradeuilib.utils;

import android.view.View;
import com.okinc.components.track.ABTestManager;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C52812wZg;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.mAE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class E2EUtils {
    public static final E2EUtils OLrzqt = new E2EUtils();

    private E2EUtils() {
    }

    public final void AEQbTJ(@NotNull C52812wZg c52812wZg, @NotNull FeatureFlag featureFlag) {
        Intrinsics.checkNotNullParameter(c52812wZg, "");
        Intrinsics.checkNotNullParameter(featureFlag, "");
        if (Intrinsics.EZpvd((Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, featureFlag.getKey(), null, 2, null), (Object) DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            return;
        }
        c52812wZg.fARcdN();
    }

    public final void EZpvd(@NotNull mAE mae, @NotNull FeatureFlag featureFlag, @NotNull View view, @NotNull AnchorPopupWindow.Style style, @NotNull AnchorPopupWindow.HorizontalPosition horizontalPosition, boolean z) {
        Intrinsics.checkNotNullParameter(mae, "");
        Intrinsics.checkNotNullParameter(featureFlag, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(style, "");
        Intrinsics.checkNotNullParameter(horizontalPosition, "");
        if (Intrinsics.EZpvd((Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, featureFlag.getKey(), null, 2, null), (Object) DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            return;
        }
        mae.AEQbTJ(view, style, horizontalPosition, z);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FeatureFlag {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FeatureFlag[] $VALUES;
        private final String key;
        public static final FeatureFlag SocialCommon = new FeatureFlag("SocialCommon", 0, "e2e_disable_social_trading_coach_mark");
        public static final FeatureFlag BotCommon = new FeatureFlag("BotCommon", 1, "e2e_disable_trading_bot_coach_mark");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FeatureFlag[] $values() {
            return new FeatureFlag[]{SocialCommon, BotCommon};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FeatureFlag> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKey() {
            return this.key;
        }

        private FeatureFlag(String str, int i, String str2) {
            this.key = str2;
        }

        static {
            FeatureFlag[] featureFlagArr$values = $values();
            $VALUES = featureFlagArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(featureFlagArr$values);
        }

        public static FeatureFlag valueOf(String str) {
            return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
        }

        public static FeatureFlag[] values() {
            return (FeatureFlag[]) $VALUES.clone();
        }
    }
}

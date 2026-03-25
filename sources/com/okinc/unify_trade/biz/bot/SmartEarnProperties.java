package com.okinc.unify_trade.biz.bot;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SmartEarnProperties extends Parcelable {
    String getEarnMaxLimit();

    String getEarnMinLimit();

    String getEarnSupport();

    EarnType getEarnType();

    boolean getEnabled();

    boolean getHasParametersSet();

    public static final class StateListAnimator {
        public static boolean EZpvd(@NotNull SmartEarnProperties smartEarnProperties) {
            String earnMaxLimit;
            String earnMinLimit = smartEarnProperties.getEarnMinLimit();
            return (earnMinLimit == null || earnMinLimit.length() == 0 || (earnMaxLimit = smartEarnProperties.getEarnMaxLimit()) == null || earnMaxLimit.length() == 0 || smartEarnProperties.getEarnType() == null) ? false : true;
        }

        public static boolean KWHzl(@NotNull SmartEarnProperties smartEarnProperties) {
            return Intrinsics.EZpvd((Object) smartEarnProperties.getEarnSupport(), (Object) "1");
        }
    }
}

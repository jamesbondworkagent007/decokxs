package o;

import com.okinc.tradingbot.impl.common.model.TextColor;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52694wUx {
    public static /* synthetic */ uJQ toTextProperties$default(java.lang.String str, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return EZpvd(str, i, function1);
    }

    public static final uJQ EZpvd(@NotNull java.lang.String str, int i, @NotNull Function1<? super java.lang.String, java.lang.String> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (str.length() == 0) {
            return new uJQ(uLP.EZpvd("--", str), TextColor.Zero.OLrzqt, null);
        }
        kotlin.Pair<? extends java.lang.String, ? extends java.lang.String> pairEZpvd = uLP.EZpvd(function1.invoke(str), str);
        TextColor.ActionBar actionBar = TextColor.Companion;
        BigDecimal scale = C33129mqd.EZpvd(str).setScale(i, RoundingMode.UP);
        Intrinsics.checkNotNullExpressionValue(scale, "");
        return new uJQ(pairEZpvd, actionBar.OLrzqt(scale), null);
    }
}

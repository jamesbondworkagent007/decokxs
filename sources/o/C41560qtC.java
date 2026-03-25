package o;

import com.okinc.localization.util.format.DisplaySign;
import com.okinc.market.ext.UpDownColor;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.InterfaceC49405unt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C41560qtC implements InterfaceC49405unt<java.lang.Double, kotlin.Pair<? extends java.lang.String, ? extends UpDownColor>> {
    @Override // o.InterfaceC49376unQ
    public boolean EZpvd() {
        return false;
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> Output EZpvd(Input input, @NotNull Function1<? super Input, ? extends Output> function1) {
        return (Output) InterfaceC49405unt.Activity.OLrzqt(this, input, function1);
    }

    @Override // o.InterfaceC49376unQ
    public <Input, Output> java.lang.Object KWHzl(Input input, @NotNull Function2<? super Input, ? super Continuation<? super Output>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Output> continuation) {
        return InterfaceC49405unt.Activity.EZpvd(this, input, function2, continuation);
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.String, UpDownColor> copydefault(java.lang.Double d) {
        return (kotlin.Pair) InterfaceC49405unt.Activity.EZpvd(this, d);
    }

    @yCM
    public C41560qtC() {
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.InterfaceC49405unt
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public kotlin.Pair<java.lang.String, UpDownColor> AEQbTJ(java.lang.Double d) {
        kotlin.Pair<java.lang.String, UpDownColor> pairOLrzqt;
        return (d == null || (pairOLrzqt = OLrzqt(d.doubleValue())) == null) ? new kotlin.Pair<>(null, UpDownColor.NEUTRAL) : pairOLrzqt;
    }

    public final kotlin.Pair<java.lang.String, UpDownColor> OLrzqt(double d) {
        UpDownColor upDownColorOLrzqt;
        java.lang.String iCUPercent$default = pTB.formatICUPercent$default(C33129mqd.EZpvd(java.lang.Double.valueOf(d)), RoundingMode.HALF_UP, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 18, null);
        int iHashCode = iCUPercent$default.hashCode();
        if (iHashCode == 45747047 ? iCUPercent$default.equals("0.00%") : iHashCode == 1276800540 ? iCUPercent$default.equals("+0.00%") : iHashCode == 1334058842 && iCUPercent$default.equals("-0.00%")) {
            upDownColorOLrzqt = UpDownColor.NEUTRAL;
        } else {
            upDownColorOLrzqt = UpDownColor.Companion.OLrzqt(d);
        }
        return new kotlin.Pair<>(iCUPercent$default, upDownColorOLrzqt);
    }
}

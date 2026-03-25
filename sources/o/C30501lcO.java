package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30501lcO {
    public static final int KWHzl(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        if (advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.TakeProfit) {
            return C23274hvD.Fragment.fromBundle;
        }
        if (advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.StopLoss) {
            return C23274hvD.Fragment.getQueueItem;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final java.lang.String EZpvd(java.lang.String str) {
        return pTB.formatICUPercent$default(C23313hvq.KWHzl((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(0), DisplaySign.ALWAYS, null, null, 24, null);
    }

    public static final java.lang.String copydefault(java.lang.String str) {
        return pTB.formatICUPercent$default(C23313hvq.KWHzl((java.lang.Object) str), RoundingMode.DOWN, C38307pTy.Companion.EZpvd(0), null, null, null, 28, null);
    }

    public static final java.lang.String copydefault(@NotNull AdvancedAutoSellStrategy advancedAutoSellStrategy) {
        Intrinsics.checkNotNullParameter(advancedAutoSellStrategy, "");
        if (advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.TakeProfit) {
            AdvancedAutoSellStrategy.TakeProfit takeProfit = (AdvancedAutoSellStrategy.TakeProfit) advancedAutoSellStrategy;
            return EZpvd(takeProfit.AhwBna()) + " (" + copydefault(takeProfit.gEmmrt()) + ")";
        }
        if (!(advancedAutoSellStrategy instanceof AdvancedAutoSellStrategy.StopLoss)) {
            throw new NoWhenBranchMatchedException();
        }
        AdvancedAutoSellStrategy.StopLoss stopLoss = (AdvancedAutoSellStrategy.StopLoss) advancedAutoSellStrategy;
        return EZpvd(stopLoss.AhwBna()) + " (" + copydefault(stopLoss.gEmmrt()) + ")";
    }

    public static final java.lang.CharSequence EZpvd(AdvancedAutoSellStrategy.TakeProfit takeProfit) {
        Intrinsics.checkNotNullParameter(takeProfit, "");
        return copydefault((AdvancedAutoSellStrategy) takeProfit);
    }

    public static final java.lang.CharSequence EZpvd(AdvancedAutoSellStrategy.StopLoss stopLoss) {
        Intrinsics.checkNotNullParameter(stopLoss, "");
        return copydefault(stopLoss);
    }

    public static final java.lang.String copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AdvancedAutoSellStrategy.TakeProfit) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.lcT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C30501lcO.EZpvd((AdvancedAutoSellStrategy.TakeProfit) obj2);
            }
        }, 30, null);
    }

    public static final java.lang.String AEQbTJ(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (obj instanceof AdvancedAutoSellStrategy.StopLoss) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: o.lcR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C30501lcO.EZpvd((AdvancedAutoSellStrategy.StopLoss) obj2);
            }
        }, 30, null);
    }
}

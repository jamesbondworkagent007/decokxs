package com.okinc.tradingbot.impl.order.strategy.recurring.view;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker_HYR8e34$lambda$31$lambda$30$lambda$29$$inlined$itemsIndexed$default$1 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function2 $key;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyFrequencyStartTimeBottomSheetKt$WheelPicker_HYR8e34$lambda$31$lambda$30$lambda$29$$inlined$itemsIndexed$default$1(Function2 function2, List list) {
        super(1);
        this.$key = function2;
        this.$items = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(Integer.valueOf(i), this.$items.get(i));
    }
}

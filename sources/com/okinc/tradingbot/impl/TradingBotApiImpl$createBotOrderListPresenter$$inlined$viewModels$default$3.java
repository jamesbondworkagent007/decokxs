package com.okinc.tradingbot.impl;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes11.dex */
public final class TradingBotApiImpl$createBotOrderListPresenter$$inlined$viewModels$default$3 extends Lambda implements Function0<CreationExtras> {
    final /* synthetic */ Function0 $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingBotApiImpl$createBotOrderListPresenter$$inlined$viewModels$default$3(Function0 function0, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = function0;
        this.$this_viewModels = componentActivity;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CreationExtras invoke() {
        CreationExtras creationExtras;
        Function0 function0 = this.$extrasProducer;
        if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
            return creationExtras;
        }
        CreationExtras defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
        return defaultViewModelCreationExtras;
    }
}

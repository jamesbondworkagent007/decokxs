package com.okinc.business.dexlogic.main.swap.trade.input.helper;

import androidx.lifecycle.Observer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class IgnoreLastValueObserver<T> implements Observer<T> {
    public static final int $stable = 8;
    private final Function1<T, Unit> changeFn;
    private T currentValue;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public IgnoreLastValueObserver(@NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.changeFn = function1;
    }

    @Override // androidx.lifecycle.Observer
    public void onChanged(T t) {
        if (Intrinsics.EZpvd(this.currentValue, t)) {
            return;
        }
        this.currentValue = t;
        if (t != null) {
            this.changeFn.invoke(t);
        }
    }
}

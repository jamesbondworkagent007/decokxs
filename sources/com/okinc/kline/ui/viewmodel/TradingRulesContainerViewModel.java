package com.okinc.kline.ui.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.AbstractC49411unz;
import o.C37872pDv;
import o.C56442yFn;
import o.C56443yFo;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TradingRulesContainerViewModel extends AbstractC49411unz<C37872pDv> {
    @yCM
    public TradingRulesContainerViewModel() {
        super(new C37872pDv(false, 1, null));
    }

    public final Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) {
        Object objKWHzl = KWHzl(new MutablePropertyReference1Impl() { // from class: com.okinc.kline.ui.viewmodel.TradingRulesContainerViewModel$onDataLoaded$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return Boolean.valueOf(((C37872pDv) obj).KWHzl());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((C37872pDv) obj).OLrzqt(((Boolean) obj2).booleanValue());
            }
        }, C56443yFo.KWHzl(false), continuation);
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }
}

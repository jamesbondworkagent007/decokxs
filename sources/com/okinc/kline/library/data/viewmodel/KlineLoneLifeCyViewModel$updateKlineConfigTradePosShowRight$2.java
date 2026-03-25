package com.okinc.kline.library.data.viewmodel;

import com.okinc.kline.library.data.ChartViewOutSideConfig;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class KlineLoneLifeCyViewModel$updateKlineConfigTradePosShowRight$2 extends MutablePropertyReference1Impl {
    public static final KlineLoneLifeCyViewModel$updateKlineConfigTradePosShowRight$2 INSTANCE = new KlineLoneLifeCyViewModel$updateKlineConfigTradePosShowRight$2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineLoneLifeCyViewModel$updateKlineConfigTradePosShowRight$2() {
        super(ChartViewOutSideConfig.class, "mTradePosShowRight", "getMTradePosShowRight()Z", 0);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
    public Object get(Object obj) {
        return Boolean.valueOf(((ChartViewOutSideConfig) obj).getMTradePosShowRight());
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
    public void set(Object obj, Object obj2) {
        ((ChartViewOutSideConfig) obj).setMTradePosShowRight(((Boolean) obj2).booleanValue());
    }
}

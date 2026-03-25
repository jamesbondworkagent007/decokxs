package com.okinc.business.trade.features.home.ui.cefi.setting;

import com.okinc.business.dexlogic.bean.PresetRouteType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class AdvancedSolSettingFragment$initMevDisplay$1 extends FunctionReferenceImpl implements Function1<PresetRouteType, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvancedSolSettingFragment$initMevDisplay$1(Object obj) {
        super(1, obj, AdvancedSolSettingFragment.class, "onRouterModeTypeChanged", "onRouterModeTypeChanged(Lcom/okinc/business/dexlogic/bean/PresetRouteType;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PresetRouteType presetRouteType) {
        invoke2(presetRouteType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        ((AdvancedSolSettingFragment) this.receiver).KWHzl(presetRouteType);
    }
}

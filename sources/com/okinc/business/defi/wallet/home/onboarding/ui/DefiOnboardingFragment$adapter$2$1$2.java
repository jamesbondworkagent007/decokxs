package com.okinc.business.defi.wallet.home.onboarding.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C18141fcm;
import o.InterfaceC18127fcY;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class DefiOnboardingFragment$adapter$2$1$2 extends FunctionReferenceImpl implements Function1<InterfaceC18127fcY, Unit> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefiOnboardingFragment$adapter$2$1$2(Object obj) {
        super(1, obj, C18141fcm.class, "handleButtonClicks", "handleButtonClicks(Lcom/okinc/business/defi/wallet/home/onboarding/ui/binders/ButtonType;)V", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC18127fcY interfaceC18127fcY) {
        invoke2(interfaceC18127fcY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC18127fcY interfaceC18127fcY) {
        Intrinsics.checkNotNullParameter(interfaceC18127fcY, "");
        ((C18141fcm) this.receiver).AEQbTJ(interfaceC18127fcY);
    }
}

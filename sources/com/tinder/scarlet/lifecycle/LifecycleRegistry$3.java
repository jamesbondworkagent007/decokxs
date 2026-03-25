package com.tinder.scarlet.lifecycle;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C58072yuQ;
import o.InterfaceC58028ytZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class LifecycleRegistry$3 extends FunctionReferenceImpl implements Function2<InterfaceC58028ytZ.StateListAnimator, InterfaceC58028ytZ.StateListAnimator, Boolean> {
    public static final LifecycleRegistry$3 INSTANCE = new LifecycleRegistry$3();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LifecycleRegistry$3() {
        super(2, C58072yuQ.class, "isEquivalentTo", "isEquivalentTo(Lcom/tinder/scarlet/Lifecycle$State;Lcom/tinder/scarlet/Lifecycle$State;)Z", 1);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(@NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator, @NotNull InterfaceC58028ytZ.StateListAnimator stateListAnimator2) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(stateListAnimator2, "");
        return Boolean.valueOf(C58072yuQ.KWHzl(stateListAnimator, stateListAnimator2));
    }
}

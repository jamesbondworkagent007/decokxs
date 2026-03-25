package com.tinder.scarlet.internal.servicemethod;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58027ytY;
import o.AbstractC58096yuo;
import o.AbstractC58245yxe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class ServiceMethod$Receive$execute$stream$2 extends FunctionReferenceImpl implements Function1<AbstractC58027ytY, AbstractC58245yxe<? extends Object>> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ServiceMethod$Receive$execute$stream$2(Object obj) {
        super(1, obj, AbstractC58096yuo.class, "mapToData", "mapToData(Lcom/tinder/scarlet/Event;)Lio/reactivex/Maybe;", 0);
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final AbstractC58245yxe<? extends Object> invoke(@NotNull AbstractC58027ytY abstractC58027ytY) {
        Intrinsics.checkNotNullParameter(abstractC58027ytY, "");
        return ((AbstractC58096yuo) this.receiver).copydefault(abstractC58027ytY);
    }
}

package com.okinc.planet.ext;

import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes10.dex */
public final class FragmentExtKt$parentViewModels$$inlined$viewModels$default$1 extends Lambda implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ Function0 $ownerProducer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentExtKt$parentViewModels$$inlined$viewModels$default$1(Function0 function0) {
        super(0);
        this.$ownerProducer = function0;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStoreOwner invoke() {
        return (ViewModelStoreOwner) this.$ownerProducer.invoke();
    }
}

package dagger.hilt.android.lifecycle;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes24.dex */
public final class HiltViewModelExtensions$addCreationCallback$1$1 extends Lambda implements Function1<Object, ViewModel> {
    final /* synthetic */ Function1<VMF, ViewModel> $callback;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super VMF, ? extends androidx.lifecycle.ViewModel> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HiltViewModelExtensions$addCreationCallback$1$1(Function1<? super VMF, ? extends ViewModel> function1) {
        super(1);
        this.$callback = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final ViewModel invoke(Object obj) {
        return this.$callback.invoke((VMF) obj);
    }
}

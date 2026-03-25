package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C54914xa extends AbstractC5051Cv<InterfaceC52805wZ, InterfaceC52697wV> implements InterfaceC52805wZ {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54914xa(@NotNull InterfaceC52805wZ... interfaceC52805wZArr) {
        super((InterfaceC5045Cp[]) java.util.Arrays.copyOf(interfaceC52805wZArr, interfaceC52805wZArr.length));
        Intrinsics.checkNotNullParameter(interfaceC52805wZArr, "");
    }

    @Override // o.AbstractC5051Cv, o.InterfaceC5045Cp
    public java.lang.Object resolve(@NotNull InterfaceC57843yq interfaceC57843yq, @NotNull Continuation<? super InterfaceC52697wV> continuation) {
        return super.resolve(interfaceC57843yq, continuation);
    }
}

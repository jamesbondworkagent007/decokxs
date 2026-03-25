package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.C59973ztB;
import o.C60022zty;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class LifecycleViewModelScopeDelegate$1 extends Lambda implements Function1<C60022zty, C60060zuj> {
    final /* synthetic */ ComponentActivity $lifecycleOwner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleViewModelScopeDelegate$1(ComponentActivity componentActivity) {
        super(1);
        this.$lifecycleOwner = componentActivity;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final C60060zuj invoke(@NotNull C60022zty c60022zty) {
        Intrinsics.checkNotNullParameter(c60022zty, "");
        return C60022zty.createScope$default(c60022zty, C59973ztB.OLrzqt(this.$lifecycleOwner).EZpvd(), C59973ztB.OLrzqt(this.$lifecycleOwner), null, 4, null);
    }
}

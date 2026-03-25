package org.koin.core.component;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C59973ztB;
import o.C60060zuj;
import o.InterfaceC59974ztC;

/* JADX INFO: loaded from: classes24.dex */
public final class KoinScopeComponentKt$getOrCreateScope$1 extends Lambda implements Function0<C60060zuj> {

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ InterfaceC59974ztC $this_getOrCreateScope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public KoinScopeComponentKt$getOrCreateScope$1(InterfaceC59974ztC interfaceC59974ztC) {
        super(0);
        this.$this_getOrCreateScope = interfaceC59974ztC;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final C60060zuj invoke() {
        C60060zuj c60060zujEZpvd = C59973ztB.EZpvd(this.$this_getOrCreateScope);
        return c60060zujEZpvd == null ? C59973ztB.createScope$default(this.$this_getOrCreateScope, null, 1, null) : c60060zujEZpvd;
    }
}

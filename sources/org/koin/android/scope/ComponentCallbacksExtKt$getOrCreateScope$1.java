package org.koin.android.scope;

import android.content.ComponentCallbacks;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C59935zsQ;
import o.C60060zuj;

/* JADX INFO: loaded from: classes24.dex */
public final class ComponentCallbacksExtKt$getOrCreateScope$1 extends Lambda implements Function0<C60060zuj> {

    /* JADX INFO: Incorrect field signature: TT; */
    final /* synthetic */ ComponentCallbacks $this_getOrCreateScope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (TT;)V */
    public ComponentCallbacksExtKt$getOrCreateScope$1(ComponentCallbacks componentCallbacks) {
        super(0);
        this.$this_getOrCreateScope = componentCallbacks;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final C60060zuj invoke() {
        C60060zuj c60060zujCopydefault = C59935zsQ.copydefault(this.$this_getOrCreateScope);
        return c60060zujCopydefault == null ? C59935zsQ.createScope$default(this.$this_getOrCreateScope, null, 1, null) : c60060zujCopydefault;
    }
}

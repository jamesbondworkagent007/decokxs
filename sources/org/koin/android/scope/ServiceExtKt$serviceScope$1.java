package org.koin.android.scope;

import android.app.Service;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C59937zsS;
import o.C60060zuj;

/* JADX INFO: loaded from: classes24.dex */
public final class ServiceExtKt$serviceScope$1 extends Lambda implements Function0<C60060zuj> {
    final /* synthetic */ Service $this_serviceScope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceExtKt$serviceScope$1(Service service) {
        super(0);
        this.$this_serviceScope = service;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final C60060zuj invoke() {
        return C59937zsS.KWHzl(this.$this_serviceScope);
    }
}

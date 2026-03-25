package org.koin.androidx.scope;

import androidx.activity.ComponentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o.C60001ztd;
import o.C60060zuj;

/* JADX INFO: loaded from: classes24.dex */
public final class ComponentActivityExtKt$activityScope$1 extends Lambda implements Function0<C60060zuj> {
    final /* synthetic */ ComponentActivity $this_activityScope;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentActivityExtKt$activityScope$1(ComponentActivity componentActivity) {
        super(0);
        this.$this_activityScope = componentActivity;
    }

    /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function0
    public final C60060zuj invoke() {
        return C60001ztd.OLrzqt(this.$this_activityScope);
    }
}

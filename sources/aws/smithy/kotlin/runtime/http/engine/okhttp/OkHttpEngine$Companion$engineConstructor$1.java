package aws.smithy.kotlin.runtime.http.engine.okhttp;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.AS;
import o.AU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OkHttpEngine$Companion$engineConstructor$1 extends FunctionReferenceImpl implements Function1<Function1<? super AS.StateListAnimator, ? extends Unit>, AU> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OkHttpEngine$Companion$engineConstructor$1(Object obj) {
        super(1, obj, AU.TaskDescription.class, "invoke", "invoke(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/okhttp/OkHttpEngine;", 0);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ AU invoke(Function1<? super AS.StateListAnimator, ? extends Unit> function1) {
        return invoke2((Function1<? super AS.StateListAnimator, Unit>) function1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final AU invoke2(@NotNull Function1<? super AS.StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return ((AU.TaskDescription) this.receiver).KWHzl(function1);
    }
}

package aws.smithy.kotlin.runtime.http.engine;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import o.C3919Av;
import o.InterfaceC3709Ar;
import o.InterfaceC4078Ay;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class DefaultHttpEngine$engineConstructor$1 extends FunctionReferenceImpl implements Function1<Function1<? super InterfaceC4078Ay.ActionBar, ? extends Unit>, InterfaceC3709Ar> {
    public static final DefaultHttpEngine$engineConstructor$1 INSTANCE = new DefaultHttpEngine$engineConstructor$1();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DefaultHttpEngine$engineConstructor$1() {
        super(1, C3919Av.class, "DefaultHttpEngine", "DefaultHttpEngine(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/CloseableHttpClientEngine;", 1);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ InterfaceC3709Ar invoke(Function1<? super InterfaceC4078Ay.ActionBar, ? extends Unit> function1) {
        return invoke2((Function1<? super InterfaceC4078Ay.ActionBar, Unit>) function1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final InterfaceC3709Ar invoke2(Function1<? super InterfaceC4078Ay.ActionBar, Unit> function1) {
        return C3919Av.copydefault(function1);
    }
}

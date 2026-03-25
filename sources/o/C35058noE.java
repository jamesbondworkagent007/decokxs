package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35058noE extends C40512qYp {
    public C35058noE(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        register(C35069noP.class, new C35061noH());
        register(C27622jyf.class, new C27956kJo(new Function1() { // from class: o.noJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C35058noE.KWHzl(function0, (android.view.View) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KWHzl(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        function0.invoke();
        return Unit.INSTANCE;
    }
}

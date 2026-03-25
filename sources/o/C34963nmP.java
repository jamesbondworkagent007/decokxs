package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.nmP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34963nmP extends C40512qYp {
    public C34963nmP() {
        register(C34964nmQ.class, new C34956nmI());
        register(C27622jyf.class, new C27956kJo(new Function1() { // from class: o.nmN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34963nmP.AEQbTJ((android.view.View) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        sZQ szq = sZQ.EZpvd;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        szq.KWHzl(context);
        return Unit.INSTANCE;
    }
}

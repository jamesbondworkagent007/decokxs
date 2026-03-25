package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40590qan extends C40512qYp {
    public C40590qan() {
        register(C27622jyf.class, new kJB(new Function1() { // from class: o.qam
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40590qan.OLrzqt((android.view.View) obj);
            }
        }));
        register(C34964nmQ.class, new C40587qak());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OLrzqt(android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        sZQ szq = sZQ.EZpvd;
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        szq.KWHzl(context);
        return Unit.INSTANCE;
    }
}

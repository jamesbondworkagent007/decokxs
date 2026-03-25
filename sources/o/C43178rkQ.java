package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rkQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C43178rkQ {
    public static final C43178rkQ copydefault = new C43178rkQ();

    private C43178rkQ() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rkQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTextHtml$default(C43178rkQ c43178rkQ, android.widget.TextView textView, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        c43178rkQ.EZpvd(textView, str, function1);
    }

    public final void EZpvd(@NotNull final android.widget.TextView textView, @NotNull java.lang.String str, final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C55137xeK.Companion.KWHzl(str).OLrzqt(new InterfaceC55228xfw() { // from class: o.rkU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC55228xfw
            public final boolean OLrzqt(java.lang.String str2) {
                return C43178rkQ.KWHzl(function1, textView, str2);
            }
        }).EZpvd(textView);
    }

    public static final boolean KWHzl(Function1 function1, android.widget.TextView textView, java.lang.String str) {
        if (function1 == null) {
            if (textView.getContext() == null) {
                return true;
            }
            C43178rkQ c43178rkQ = copydefault;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Intrinsics.copydefault((java.lang.Object) str);
            c43178rkQ.EZpvd(context, str);
            return true;
        }
        Intrinsics.copydefault((java.lang.Object) str);
        function1.invoke(str);
        return true;
    }

    public final void EZpvd(android.content.Context context, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        map.put("url", str);
        ((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class)).KWHzl(context, "web", map, new Function1() { // from class: o.rkT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C43178rkQ.AEQbTJ((AbstractC43238rlX) obj);
            }
        });
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}

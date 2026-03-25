package o;

import com.okinc.business.rewards.okplatform.bean.RichTextRoot;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37987pIa extends AbstractC43215rlA implements kOI {
    @Override // o.kOI
    public void OLrzqt(@NotNull final java.lang.String str, @NotNull final Function1<? super RichTextRoot, Unit> function1, @NotNull final Function1<? super java.lang.Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.pHZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C37987pIa.EZpvd(str, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function13 = new Function1() { // from class: o.pHY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37987pIa.OLrzqt(function1, (RichTextRoot) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.pIb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37987pIa.KWHzl(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.pIc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37987pIa.OLrzqt(function12, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.pId
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C37987pIa.copydefault(function14, obj);
            }
        });
    }

    public static final void EZpvd(java.lang.String str, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        RichTextRoot richTextRootAEQbTJ = new pHV().AEQbTJ(str);
        if (richTextRootAEQbTJ != null) {
            interfaceC58184ywW.onNext(richTextRootAEQbTJ);
        } else {
            interfaceC58184ywW.onError(new java.lang.Throwable("RichTextRoot mustn't be null"));
        }
        interfaceC58184ywW.onComplete();
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, RichTextRoot richTextRoot) {
        Intrinsics.copydefault(richTextRoot);
        function1.invoke(richTextRoot);
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        function1.invoke(th);
        return Unit.INSTANCE;
    }
}

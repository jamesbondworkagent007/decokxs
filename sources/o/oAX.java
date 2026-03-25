package o;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.rxutils.RxBus;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class oAX {
    public final CopyOnWriteArrayList<InterfaceC35717oBb> copydefault = new CopyOnWriteArrayList<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super IMUserInfo> continuation);

    public oAX() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C35718oBc.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXKWHzl2 = C33024moe.KWHzl(abstractC58185ywXKWHzl);
        final Function1 function1 = new Function1() { // from class: o.oAV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oAX.OLrzqt(this.AEQbTJ, (C35718oBc) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.oBd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oAX.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.oBa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oAX.EZpvd((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.oAZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                oAX.EZpvd(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(oAX oax, C35718oBc c35718oBc) {
        oax.AEQbTJ(c35718oBc.EZpvd());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull InterfaceC35717oBb interfaceC35717oBb) {
        Intrinsics.checkNotNullParameter(interfaceC35717oBb, "");
        this.copydefault.add(interfaceC35717oBb);
    }

    public final void copydefault(@NotNull IMUserInfo iMUserInfo) {
        Intrinsics.checkNotNullParameter(iMUserInfo, "");
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (it.hasNext()) {
            ((InterfaceC35717oBb) it.next()).copydefault(iMUserInfo);
        }
    }
}

package o;

import java.lang.Throwable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ei, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5090Ei<T extends java.lang.Throwable> {
    public static final Application EZpvd = new Application(null);
    public final InterfaceC56551yJo<T> AEQbTJ;
    public final Function1<T, AbstractC5091Ej> OLrzqt;

    /* JADX INFO: renamed from: o.Ei$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ei.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T extends java.lang.Throwable, ? extends o.Ej> */
    /* JADX WARN: Multi-variable type inference failed */
    public C5090Ei(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull Function1<? super T, ? extends AbstractC5091Ej> function1) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = interfaceC56551yJo;
        this.OLrzqt = function1;
    }

    public final AbstractC5091Ej OLrzqt(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        java.lang.Throwable th2 = (java.lang.Throwable) C56552yJp.AEQbTJ(this.AEQbTJ, th);
        if (th2 != null) {
            return this.OLrzqt.invoke((T) th2);
        }
        return null;
    }
}

package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59381zfv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yOA<Type extends InterfaceC59381zfv> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yOA.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ yOA(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean AEQbTJ(@NotNull C56935yXu c56935yXu);

    private yOA() {
    }

    public final <Other extends InterfaceC59380zfu> yOA<Other> EZpvd(@NotNull Function1<? super Type, ? extends Other> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (this instanceof yNL) {
            yNL ynl = (yNL) this;
            return new yNL(ynl.OLrzqt(), function1.invoke(ynl.KWHzl()));
        }
        if (!(this instanceof yNR)) {
            throw new NoWhenBranchMatchedException();
        }
        java.util.List<kotlin.Pair<C56935yXu, Type>> listKWHzl = ((yNR) this).KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            kotlin.Pair pair = (kotlin.Pair) it.next();
            arrayList.add(C56390yDp.OLrzqt((C56935yXu) pair.component1(), function1.invoke((InterfaceC59381zfv) pair.component2())));
        }
        return new yNR(arrayList);
    }
}

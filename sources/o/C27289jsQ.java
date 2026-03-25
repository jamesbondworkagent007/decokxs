package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27286jsN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jsQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27289jsQ extends AbstractC27470jvm {
    public C27289jsQ(@NotNull InterfaceC27287jsO interfaceC27287jsO, @NotNull Function1<? super InterfaceC27286jsN.PendingIntent, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC27287jsO, "");
        Intrinsics.checkNotNullParameter(function1, "");
        register(C27326jtA.class, new C27366jto());
        register(C27374jtw.class, new C27365jtn());
        register(C27377jtz.class, new C27358jtg(interfaceC27287jsO));
        register(C27372jtu.class, new C27298jsZ(interfaceC27287jsO));
        register(C27367jtp.class, new C27352jta(interfaceC27287jsO));
        register(C27369jtr.class, new C27295jsW(function1));
        register(C27376jty.class, new C27361jtj());
        register(C27370jts.class, new C27356jte(interfaceC27287jsO));
        register(C27368jtq.class, new C27357jtf(interfaceC27287jsO));
        register(C27373jtv.class, new C27354jtc(interfaceC27287jsO));
    }
}

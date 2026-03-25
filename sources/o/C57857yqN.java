package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C57855yqL;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57857yqN implements InterfaceC57851yqH {
    public Function1<? super C57852yqI, Unit> EZpvd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0<C57855yqL>() { // from class: com.pandulapeter.beagle.logOkHttp.BeagleOkHttpLoggerImplementation$logger$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final C57855yqL invoke() {
            return new C57855yqL();
        }
    });

    public Interceptor copydefault() {
        return (Interceptor) this.KWHzl.getValue();
    }

    @Override // o.InterfaceC57851yqH
    public void KWHzl(boolean z, @NotNull java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.lang.Long l, long j, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Function1<? super C57852yqI, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            function1.invoke(new C57852yqI(str3, z, str, str2, list == null ? yDY.AhwBna() : list, l, j));
        }
    }
}

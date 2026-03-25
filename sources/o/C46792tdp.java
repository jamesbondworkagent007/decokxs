package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tdp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46792tdp {
    public static final ViewOnTouchListenerC46787tdk copydefault(@NotNull C46796tdt c46796tdt, @NotNull InterfaceC46789tdm interfaceC46789tdm, @NotNull Function1<? super java.lang.Integer, Unit> function1, @NotNull InterfaceC46794tdr interfaceC46794tdr, @NotNull Function0<java.lang.Boolean> function0) {
        Intrinsics.checkNotNullParameter(c46796tdt, "");
        Intrinsics.checkNotNullParameter(interfaceC46789tdm, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(interfaceC46794tdr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return new ViewOnTouchListenerC46787tdk(c46796tdt, interfaceC46789tdm, function1, interfaceC46794tdr, function0);
    }
}

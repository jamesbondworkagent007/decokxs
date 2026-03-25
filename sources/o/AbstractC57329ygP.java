package o;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ygP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC57329ygP implements InterfaceC43218rlD<C57333ygT, Unit> {
    public static final int $stable = 0;

    public abstract java.util.Set<java.lang.String> getSupportJSMethods();

    public abstract java.lang.String getSupportJSObjectUri();

    public abstract void performJSMethod(@NotNull com.okinc.jsbridge.Message message, @NotNull InterfaceC57336ygW interfaceC57336ygW);

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // o.InterfaceC43218rlD
    public /* bridge */ /* synthetic */ Unit handle(C57333ygT c57333ygT) {
        handle2(c57333ygT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: handle, reason: avoid collision after fix types in other method */
    public final void handle2(@NotNull C57333ygT c57333ygT) {
        Intrinsics.checkNotNullParameter(c57333ygT, "");
        performJSMethod(c57333ygT.OLrzqt(), c57333ygT.EZpvd());
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5077Dv {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.CG<? super Request, ? extends Response> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <Request, Response> CG<Request, Response> OLrzqt(@NotNull CG<? super Request, ? extends Response> cg, @NotNull InterfaceC5075Dt<Request, Response>... interfaceC5075DtArr) {
        Intrinsics.checkNotNullParameter(cg, "");
        Intrinsics.checkNotNullParameter(interfaceC5075DtArr, "");
        if (interfaceC5075DtArr.length == 0) {
            return cg;
        }
        java.util.List listValueOf = yDV.valueOf(interfaceC5075DtArr, 1);
        C5073Dr c5073Dr = new C5073Dr(cg, (InterfaceC5075Dt) yDV.AubY(interfaceC5075DtArr));
        if (!listValueOf.isEmpty()) {
            java.util.ListIterator listIterator = listValueOf.listIterator(listValueOf.size());
            while (listIterator.hasPrevious()) {
                c5073Dr = new C5073Dr(c5073Dr, (InterfaceC5075Dt) listIterator.previous());
            }
        }
        return c5073Dr;
    }
}

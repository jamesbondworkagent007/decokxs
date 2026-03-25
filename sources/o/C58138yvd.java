package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58138yvd<T> implements InterfaceC58090yui<T> {
    public final AbstractC58185ywX<T> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC60096zvd
    public void subscribe(InterfaceC60097zve<? super T> interfaceC60097zve) {
        this.EZpvd.subscribe(interfaceC60097zve);
    }

    public C58138yvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        this.EZpvd = abstractC58185ywX;
    }
}

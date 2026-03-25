package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8747bIZ extends AbstractC8727bIF<C8801bJa> {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bIY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8747bIZ.copydefault(this.KWHzl);
        }
    });

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Possible override for method o.bIF.OLrzqt()Lo/ywX; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C8801bJa fJNWhG() {
        return (C8801bJa) this.EZpvd.getValue();
    }

    public static final C8801bJa copydefault(C8747bIZ c8747bIZ) {
        return new C8801bJa(c8747bIZ, c8747bIZ);
    }

    @Override // o.AbstractC8727bIF
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54892xZe.KWHzl.KWHzl(str, str2);
    }
}

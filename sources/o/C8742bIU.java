package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8742bIU extends AbstractC8727bIF<C8743bIV> {
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.bIS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8742bIU.EZpvd(this.copydefault);
        }
    });

    /* JADX DEBUG: Method merged with bridge method: DXXBbs()Lo/bCW; */
    /* JADX DEBUG: Possible override for method o.bIF.OLrzqt()Lo/ywX; */
    @Override // o.AbstractC8564bFB
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C8743bIV DXXBbs() {
        return (C8743bIV) this.EZpvd.getValue();
    }

    public static final C8743bIV EZpvd(C8742bIU c8742bIU) {
        return new C8743bIV(c8742bIU, c8742bIU);
    }

    @Override // o.AbstractC8727bIF
    public java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54910xZw.OLrzqt(xYZ.KWHzl.AEQbTJ(C54910xZw.EZpvd(str), str2, true));
    }
}

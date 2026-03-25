package o;

import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bCZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8429bCZ extends AbstractC8422bCS {
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8429bCZ(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
        super(abstractC8564bFB);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        this.gEmmrt = "";
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        return C54862xYb.convertToBigIntegerString$default(this.gEmmrt, false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}

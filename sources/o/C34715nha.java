package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nha, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34715nha {
    public final java.lang.String EZpvd;
    public C34719nhe KWHzl;
    public final android.app.Activity copydefault;

    public C34715nha(@NotNull android.app.Activity activity, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = activity;
        this.EZpvd = str;
    }

    public final void AEQbTJ(@NotNull AbstractC34718nhd abstractC34718nhd) {
        Intrinsics.checkNotNullParameter(abstractC34718nhd, "");
        C34729nho.EZpvd(this.EZpvd, abstractC34718nhd, new Function1() { // from class: o.nhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C34715nha.OLrzqt(this.OLrzqt, (AbstractC34734nhv) obj);
            }
        });
    }

    public static final Unit OLrzqt(C34715nha c34715nha, AbstractC34734nhv abstractC34734nhv) {
        Intrinsics.checkNotNullParameter(abstractC34734nhv, "");
        C34719nhe c34719nhe = new C34719nhe(c34715nha.copydefault, c34715nha.EZpvd, abstractC34734nhv, 0L, 8, null);
        c34715nha.KWHzl = c34719nhe;
        c34719nhe.KWHzl();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(int i, int i2, android.content.Intent intent) {
        C34719nhe c34719nhe = this.KWHzl;
        if (c34719nhe != null) {
            c34719nhe.OLrzqt(i, i2, intent);
        }
    }

    public final void KWHzl() {
        C34719nhe c34719nhe = this.KWHzl;
        if (c34719nhe != null) {
            C34719nhe.cancel$default(c34719nhe, false, 1, null);
        }
    }
}

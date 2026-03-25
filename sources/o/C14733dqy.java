package o;

import android.graphics.Color;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C14140dfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14733dqy {
    public static final C14733dqy copydefault = new C14733dqy();

    private C14733dqy() {
    }

    public final java.lang.CharSequence KWHzl(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strAYXKKw = abstractC12782ctV != null ? abstractC12782ctV.AYXKKw() : null;
        return strAYXKKw == null ? "" : strAYXKKw;
    }

    public final java.lang.CharSequence AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strFJNWhG = abstractC12782ctV != null ? abstractC12782ctV.fJNWhG() : null;
        return strFJNWhG == null ? "" : strFJNWhG;
    }

    public static /* synthetic */ java.lang.CharSequence getDisplayRootWalletName$default(C14733dqy c14733dqy, AbstractC12784ctX abstractC12784ctX, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c14733dqy.OLrzqt(abstractC12784ctX, z);
    }

    public final java.lang.CharSequence OLrzqt(@NotNull AbstractC12784ctX abstractC12784ctX, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        if (z) {
            return C33061mpO.setupSpanStyles$default(abstractC12784ctX.AuCTel(), new java.lang.String[]{abstractC12784ctX.AuCTel()}, 0, null, false, new Function1() { // from class: o.dqz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14733dqy.OLrzqt((java.util.List) obj);
                }
            }, 14, null);
        }
        return abstractC12784ctX.AuCTel();
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(Color.parseColor(C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null).OLrzqt())));
        return Unit.INSTANCE;
    }
}

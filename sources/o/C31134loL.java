package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.loL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31134loL {
    public static final java.lang.CharSequence copydefault(@NotNull C28337kXr c28337kXr, @NotNull android.content.Context context) {
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(c28337kXr, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (c28337kXr.AEQbTJ().length() == 0) {
            return pTF.KWHzl.AEQbTJ(c28337kXr.EZpvd());
        }
        if (c28337kXr.copydefault()) {
            strEZpvd = c28337kXr.AEQbTJ();
            strAEQbTJ = c28337kXr.EZpvd();
            sb = new java.lang.StringBuilder();
        } else {
            strEZpvd = c28337kXr.EZpvd();
            strAEQbTJ = c28337kXr.AEQbTJ();
            sb = new java.lang.StringBuilder();
        }
        sb.append(strEZpvd);
        sb.append(" ");
        sb.append(strAEQbTJ);
        return C24324ibg.addSpanWithColor$default(C24324ibg.Companion.KWHzl(pTF.KWHzl.AEQbTJ(sb.toString())), c28337kXr.AEQbTJ(), ContextCompat.getColor(context, C52761wXj.Activity.QwvEab), 0, 4, null).AEQbTJ();
    }
}

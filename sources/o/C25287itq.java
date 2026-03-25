package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25287itq {
    public static final java.lang.CharSequence copydefault(@NotNull C23077hrS c23077hrS, @NotNull android.content.Context context) {
        java.lang.String strEZpvd;
        java.lang.String strCopydefault;
        java.lang.StringBuilder sb;
        Intrinsics.checkNotNullParameter(c23077hrS, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (c23077hrS.copydefault().length() == 0) {
            return pTF.KWHzl.AEQbTJ(c23077hrS.EZpvd());
        }
        if (c23077hrS.KWHzl()) {
            strEZpvd = c23077hrS.copydefault();
            strCopydefault = c23077hrS.EZpvd();
            sb = new java.lang.StringBuilder();
        } else {
            strEZpvd = c23077hrS.EZpvd();
            strCopydefault = c23077hrS.copydefault();
            sb = new java.lang.StringBuilder();
        }
        sb.append(strEZpvd);
        sb.append(" ");
        sb.append(strCopydefault);
        return C24324ibg.addSpanWithColor$default(C24324ibg.Companion.KWHzl(pTF.KWHzl.AEQbTJ(sb.toString())), c23077hrS.copydefault(), ContextCompat.getColor(context, C52761wXj.Activity.QwvEab), 0, 4, null).AEQbTJ();
    }
}

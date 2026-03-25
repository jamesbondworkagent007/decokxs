package o;

import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37661oxz {
    public final oGM KWHzl;
    public final oGC OLrzqt;

    @yCM
    public C37661oxz(@NotNull oGM ogm, @NotNull oGC ogc) {
        Intrinsics.checkNotNullParameter(ogm, "");
        Intrinsics.checkNotNullParameter(ogc, "");
        this.KWHzl = ogm;
        this.OLrzqt = ogc;
    }

    public final java.lang.Object AEQbTJ(@NotNull final java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        final java.lang.String strAEQbTJ = this.KWHzl.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        java.lang.Object objOLrzqt = this.OLrzqt.OLrzqt(new Function1() { // from class: o.oxA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C37661oxz.copydefault(strAEQbTJ, str, (SharedPreferences.Editor) obj);
            }
        }, continuation);
        return objOLrzqt == C56442yFn.copydefault() ? objOLrzqt : Unit.INSTANCE;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, SharedPreferences.Editor editor) {
        Intrinsics.checkNotNullParameter(editor, "");
        editor.putString(C37659oxx.AEQbTJ(str), str2);
        return Unit.INSTANCE;
    }
}

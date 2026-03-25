package o;

import androidx.core.content.ContextCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55133xeG {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean AEQbTJ(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return false;
    }

    public static /* synthetic */ void showHTML$default(android.widget.TextView textView, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: o.xeE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(C55133xeG.AEQbTJ((java.lang.String) obj2));
                }
            };
        }
        AEQbTJ(textView, str, function1);
    }

    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, final Function1<? super java.lang.String, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), C52761wXj.Activity.DCUTEIddSDPG));
        C55137xeK.Companion.KWHzl(str).OLrzqt(new InterfaceC55228xfw() { // from class: o.xeC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC55228xfw
            public final boolean OLrzqt(java.lang.String str2) {
                return C55133xeG.AEQbTJ(function1, str2);
            }
        }).EZpvd(textView);
    }

    public static final boolean AEQbTJ(Function1 function1, java.lang.String str) {
        if (function1 == null) {
            return false;
        }
        Intrinsics.copydefault((java.lang.Object) str);
        return ((java.lang.Boolean) function1.invoke(str)).booleanValue();
    }
}

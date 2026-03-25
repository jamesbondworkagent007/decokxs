package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.owE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37561owE {
    public static final C37561owE EZpvd = new C37561owE();

    private C37561owE() {
    }

    public final void copydefault(@NotNull C33933nLf c33933nLf, @NotNull C34282nYe c34282nYe) {
        Intrinsics.checkNotNullParameter(c33933nLf, "");
        Intrinsics.checkNotNullParameter(c34282nYe, "");
        c33933nLf.OLrzqt.setText(c34282nYe.AEQbTJ());
        android.widget.TextView textView = c33933nLf.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C37716ozA.updateTagViewWithTagInfo$default(textView, c34282nYe.djBIcL(), 0, null, false, false, false, 62, null);
        C37561owE c37561owE = EZpvd;
        nKW nkw = c33933nLf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(nkw, "");
        c37561owE.OLrzqt(nkw, c34282nYe);
    }

    public final void OLrzqt(nKW nkw, C34282nYe c34282nYe) {
        C35893oHp c35893oHp = nkw.copydefault;
        Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
        C35891oHn.AEQbTJ(c35893oHp, c34282nYe);
    }
}

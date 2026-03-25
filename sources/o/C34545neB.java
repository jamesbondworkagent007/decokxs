package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.neB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34545neB {
    public static final C34589net copydefault(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        oNK onkEZpvd = oNK.EZpvd(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onkEZpvd, "");
        return new C34589net(onkEZpvd);
    }

    public static final C34590neu AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(17);
        int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
        textView.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
        textView.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.DrNnAm));
        return new C34590neu(textView);
    }

    public static final C34592nex EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        oNS onsOLrzqt = oNS.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(onsOLrzqt, "");
        return new C34592nex(onsOLrzqt);
    }
}

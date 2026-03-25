package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kLT {
    public static final kLA AEQbTJ(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21465hAj c21465hAjOLrzqt = C21465hAj.OLrzqt(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21465hAjOLrzqt, "");
        return new kLA(c21465hAjOLrzqt);
    }

    public static final kLK OLrzqt(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        textView.setGravity(17);
        int iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
        textView.setPadding(iDp2px$default, iDp2px$default, iDp2px$default, iDp2px$default);
        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.OGitdB));
        return new kLK(textView);
    }

    public static final kLG EZpvd(@NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C21475hAt c21475hAtCopydefault = C21475hAt.copydefault(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21475hAtCopydefault, "");
        return new kLG(c21475hAtCopydefault);
    }
}

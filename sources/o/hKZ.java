package o;

import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hKZ {
    public static /* synthetic */ void showErrorNotice$default(hKZ hkz, ErrorNoticeView errorNoticeView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        hkz.AEQbTJ(errorNoticeView, str, str2);
    }

    public final void AEQbTJ(@NotNull ErrorNoticeView errorNoticeView, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ErrorNoticeView.setText$default(errorNoticeView, str2, str, ErrorNoticeView.Level.Error, null, null, null, 56, null);
        errorNoticeView.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.hKZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showErrorNoticeWithAction$default(hKZ hkz, ErrorNoticeView errorNoticeView, java.lang.String str, java.lang.String str2, java.lang.String str3, Function0 function0, int i, java.lang.Object obj) {
        java.lang.String str4 = (i & 4) != 0 ? "" : str2;
        java.lang.String str5 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            function0 = null;
        }
        hkz.EZpvd(errorNoticeView, str, str4, str5, function0);
    }

    public final void EZpvd(@NotNull ErrorNoticeView errorNoticeView, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (function0 != null) {
            ErrorNoticeView.setText$default(errorNoticeView, str2, str, ErrorNoticeView.Level.Error, null, str3, function0, 8, null);
        } else {
            ErrorNoticeView.setText$default(errorNoticeView, str2, str, ErrorNoticeView.Level.Error, null, null, null, 56, null);
        }
        errorNoticeView.setVisibility(0);
    }

    public static /* synthetic */ void showWarningNotice$default(hKZ hkz, ErrorNoticeView errorNoticeView, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        hkz.KWHzl(errorNoticeView, str, str2);
    }

    public final void KWHzl(@NotNull ErrorNoticeView errorNoticeView, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ErrorNoticeView.setText$default(errorNoticeView, str2, str, ErrorNoticeView.Level.Warning, null, null, null, 56, null);
        errorNoticeView.setVisibility(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.hKZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWarningNoticeWithAction$default(hKZ hkz, ErrorNoticeView errorNoticeView, java.lang.String str, Function0 function0, java.lang.String str2, Function0 function02, int i, java.lang.Object obj) {
        Function0 function03 = (i & 4) != 0 ? null : function0;
        if ((i & 8) != 0) {
            str2 = "";
        }
        hkz.OLrzqt(errorNoticeView, str, function03, str2, (i & 16) != 0 ? null : function02);
    }

    public final void OLrzqt(@NotNull ErrorNoticeView errorNoticeView, @NotNull java.lang.String str, Function0<Unit> function0, @NotNull java.lang.String str2, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(errorNoticeView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (function02 != null) {
            errorNoticeView.setText("", str, ErrorNoticeView.Level.Warning, function0, str2, function02);
        } else {
            ErrorNoticeView.setText$default(errorNoticeView, "", str, ErrorNoticeView.Level.Warning, function0, null, null, 48, null);
        }
        errorNoticeView.setVisibility(0);
    }
}

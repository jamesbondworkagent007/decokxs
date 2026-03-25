package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pTt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38302pTt {
    public static boolean OLrzqt;
    public static boolean copydefault;
    public static final C38302pTt KWHzl = new C38302pTt();
    public static final int AEQbTJ = 3;
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.pTt$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void EZpvd(@NotNull android.view.View view, java.lang.String str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return OLrzqt;
    }

    private C38302pTt() {
    }

    public static /* synthetic */ boolean isShowLanguageValue$default(C38302pTt c38302pTt, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return c38302pTt.OLrzqt(str);
    }

    public final boolean OLrzqt(java.lang.String str) {
        if (!copydefault || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "config_inputEventCompatProcessorOverrideClassName")) {
            return true;
        }
        return str != null && C59449zhJ.startsWith$default(str, "agc_", false, 2, null);
    }

    public static /* synthetic */ void findTouchTextView$default(C38302pTt c38302pTt, android.view.View view, int i, int i2, android.app.Activity activity, Activity activity2, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            activity2 = null;
        }
        c38302pTt.OLrzqt(view, i, i2, activity, activity2);
    }

    public static final boolean KWHzl(int i, int i2, android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[0];
        int i4 = iArr[1];
        return i3 <= i && i <= view.getWidth() + i3 && i4 <= i2 && i2 <= view.getHeight() + i4;
    }

    public final void OLrzqt(android.view.View view, int i, int i2, @NotNull android.app.Activity activity, Activity activity2) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (view != null && (view instanceof android.view.ViewGroup)) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = viewGroup.getChildAt(i3);
                if (childAt instanceof android.view.ViewGroup) {
                    OLrzqt(viewGroup.getChildAt(i3), i, i2, activity, activity2);
                } else if (childAt instanceof android.widget.EditText) {
                    if (KWHzl(i, i2, childAt)) {
                        java.lang.String string = ((android.widget.EditText) childAt).getHint().toString();
                        copydefault(string, activity);
                        if (activity2 != null) {
                            activity2.EZpvd(childAt, string);
                        }
                    }
                } else if ((childAt instanceof android.widget.TextView) && KWHzl(i, i2, childAt)) {
                    java.lang.String string2 = ((android.widget.TextView) childAt).getHint().toString();
                    copydefault(string2, activity);
                    if (activity2 != null) {
                        activity2.EZpvd(childAt, string2);
                    }
                }
            }
        }
    }

    public final void copydefault(java.lang.String str, android.app.Activity activity) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            java.lang.Object systemService = activity.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
        }
    }
}

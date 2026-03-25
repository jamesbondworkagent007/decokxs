package o;

import com.amplitude.common.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class JV {
    public static final JV OLrzqt = new JV();

    private JV() {
    }

    public static /* synthetic */ boolean isComposeAvailable$default(JV jv, Logger logger, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            logger = null;
        }
        return jv.copydefault(logger);
    }

    public final boolean copydefault(Logger logger) {
        C5240Kc c5240Kc = C5240Kc.EZpvd;
        return c5240Kc.OLrzqt("androidx.compose.ui.node.Owner", logger) && c5240Kc.OLrzqt("com.amplitude.android.internal.locators.ComposeViewTargetLocator", logger);
    }
}

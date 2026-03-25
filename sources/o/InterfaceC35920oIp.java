package o;

import android.graphics.Color;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC35920oIp {
    void copydefault(@NotNull androidx.fragment.app.Fragment fragment, @androidx.annotation.Dimension(unit = 0) int i, @androidx.annotation.ColorInt int i2);

    /* JADX INFO: renamed from: o.oIp$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity {
        public static /* synthetic */ void init$default(InterfaceC35920oIp interfaceC35920oIp, androidx.fragment.app.Fragment fragment, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i3 & 2) != 0) {
                i = 2;
            }
            if ((i3 & 4) != 0) {
                i2 = Color.parseColor("#66000000");
            }
            interfaceC35920oIp.copydefault(fragment, i, i2);
        }
    }
}

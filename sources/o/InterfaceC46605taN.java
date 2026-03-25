package o;

import com.okinc.unify_trade.biz.BizInstrument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.taN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46605taN {
    void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, C42652raU c42652raU);

    void copydefault(@NotNull android.view.View view, @NotNull BizInstrument bizInstrument, int i, boolean z);

    void copydefault(@NotNull android.view.View view, @NotNull InterfaceC41655qus interfaceC41655qus, int i, boolean z);

    /* JADX INFO: renamed from: o.taN$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class TaskDescription {
        public static /* synthetic */ void attachFavoritesOptContext$default(InterfaceC46605taN interfaceC46605taN, androidx.fragment.app.Fragment fragment, C42652raU c42652raU, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachFavoritesOptContext");
            }
            if ((i & 2) != 0) {
                c42652raU = null;
            }
            interfaceC46605taN.AEQbTJ(fragment, c42652raU);
        }

        public static /* synthetic */ void onLongClickInstrument$default(InterfaceC46605taN interfaceC46605taN, android.view.View view, BizInstrument bizInstrument, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLongClickInstrument");
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            interfaceC46605taN.copydefault(view, bizInstrument, i, z);
        }

        public static /* synthetic */ void onLongClickInstrument$default(InterfaceC46605taN interfaceC46605taN, android.view.View view, InterfaceC41655qus interfaceC41655qus, int i, boolean z, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onLongClickInstrument");
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            interfaceC46605taN.copydefault(view, interfaceC41655qus, i, z);
        }
    }
}

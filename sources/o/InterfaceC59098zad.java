package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59101zag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC59098zad extends InterfaceC59101zag {
    public static final Application hDKMBd = Application.KWHzl;

    @Override // o.InterfaceC59101zag
    java.util.Collection<? extends InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

    java.util.Set<C56935yXu> AEQbTJ();

    java.util.Set<C56935yXu> EZpvd();

    java.util.Set<C56935yXu> bP_();

    java.util.Collection<? extends InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv);

    /* JADX INFO: renamed from: o.zad$TaskDescription */
    public static final class TaskDescription {
        public static void KWHzl(@NotNull InterfaceC59098zad interfaceC59098zad, @NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            InterfaceC59101zag.Application.AEQbTJ(interfaceC59098zad, c56935yXu, yqv);
        }
    }

    /* JADX INFO: renamed from: o.zad$ActionBar */
    public static final class ActionBar extends AbstractC59100zaf {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }

        @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
        public java.util.Set<C56935yXu> AEQbTJ() {
            return yEE.copydefault();
        }

        @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
        public java.util.Set<C56935yXu> bP_() {
            return yEE.copydefault();
        }

        @Override // o.AbstractC59100zaf, o.InterfaceC59098zad
        public java.util.Set<C56935yXu> EZpvd() {
            return yEE.copydefault();
        }
    }

    /* JADX INFO: renamed from: o.zad$Application */
    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();
        public static final Function1<C56935yXu, java.lang.Boolean> OLrzqt = C59099zae.OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static final boolean OLrzqt(C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<C56935yXu, java.lang.Boolean> AEQbTJ() {
            return OLrzqt;
        }

        private Application() {
        }
    }
}

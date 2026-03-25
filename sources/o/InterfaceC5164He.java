package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5164He {
    public static final ActionBar copydefault = ActionBar.OLrzqt;

    C5166Hg AEQbTJ(@NotNull java.lang.String str);

    java.lang.String EZpvd(@NotNull java.lang.String str);

    java.lang.String OLrzqt();

    C5166Hg OLrzqt(@NotNull java.lang.String str);

    java.lang.String copydefault(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.He$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar OLrzqt = new ActionBar();
        public static final InterfaceC5164He copydefault = new C0804ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC5164He OLrzqt() {
            return copydefault;
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.He$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0804ActionBar implements InterfaceC5164He {
            public final java.lang.String KWHzl = "(no encoding)";

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5164He
            public java.lang.String EZpvd(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return str;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5164He
            public java.lang.String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5164He
            public java.lang.String copydefault(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return str;
            }

            @Override // o.InterfaceC5164He
            public C5166Hg AEQbTJ(@NotNull java.lang.String str) {
                return StateListAnimator.copydefault(this, str);
            }

            @Override // o.InterfaceC5164He
            public C5166Hg OLrzqt(@NotNull java.lang.String str) {
                return StateListAnimator.KWHzl(this, str);
            }
        }
    }

    /* JADX INFO: renamed from: o.He$StateListAnimator */
    public static final class StateListAnimator {
        public static C5166Hg copydefault(@NotNull InterfaceC5164He interfaceC5164He, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new C5166Hg(str, interfaceC5164He.EZpvd(str), interfaceC5164He);
        }

        public static C5166Hg KWHzl(@NotNull InterfaceC5164He interfaceC5164He, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new C5166Hg(interfaceC5164He.copydefault(str), str, interfaceC5164He);
        }
    }
}

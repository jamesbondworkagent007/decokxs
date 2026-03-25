package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.En, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC5095En {

    /* JADX INFO: renamed from: o.En$ActionBar */
    public interface ActionBar extends InterfaceC5100Es {
        boolean EZpvd();

        boolean copydefault();
    }

    /* JADX INFO: renamed from: o.En$Activity */
    public interface Activity extends InterfaceC5100Es {
        java.lang.String KWHzl();

        boolean OLrzqt();

        boolean copydefault();
    }

    Activity AEQbTJ(@NotNull C5101Et c5101Et);

    StateListAnimator EZpvd(@NotNull C5098Eq c5098Eq);

    ActionBar KWHzl(@NotNull C5101Et c5101Et);

    /* JADX INFO: renamed from: o.En$StateListAnimator */
    public interface StateListAnimator extends InterfaceC5100Es {
        public static final ActionBar OLrzqt = ActionBar.EZpvd;

        java.lang.Integer OLrzqt();

        void copydefault();

        /* JADX INFO: renamed from: o.En$StateListAnimator$ActionBar */
        public static final class ActionBar {
            public static final /* synthetic */ ActionBar EZpvd = new ActionBar();

            private ActionBar() {
            }
        }
    }
}

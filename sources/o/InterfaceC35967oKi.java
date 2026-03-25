package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oKi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC35967oKi {
    public static final ActionBar Companion = ActionBar.EZpvd;

    void AEQbTJ();

    android.view.View KWHzl();

    void setOnItemClickListener(@NotNull Function1<? super java.lang.Integer, Unit> function1);

    void setOnItemClickTypeListener(@NotNull Function1<? super java.lang.Integer, Unit> function1);

    void setOnLineHideListener(@NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void setShowShareIcon(boolean z);

    /* JADX INFO: renamed from: o.oKi$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar EZpvd = new ActionBar();

        private ActionBar() {
        }
    }
}

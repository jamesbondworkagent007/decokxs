package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import o.InterfaceC56482yH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC58536zG extends InterfaceC56482yH<Deferred<? extends java.lang.String>> {
    public static final ActionBar copydefault = ActionBar.copydefault;

    /* JADX INFO: renamed from: o.zG$TaskDescription */
    public static final class TaskDescription {
        public static Deferred<java.lang.String> AEQbTJ(@NotNull InterfaceC58536zG interfaceC58536zG, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (Deferred) InterfaceC56482yH.Application.KWHzl(interfaceC58536zG, str);
        }

        public static void copydefault(@NotNull InterfaceC58536zG interfaceC58536zG, @NotNull Function2<? super java.lang.String, ? super java.util.List<? extends Deferred<java.lang.String>>, Unit> function2) {
            Intrinsics.checkNotNullParameter(function2, "");
            InterfaceC56482yH.Application.OLrzqt(interfaceC58536zG, function2);
        }
    }

    /* JADX INFO: renamed from: o.zG$ActionBar */
    public static final class ActionBar {
        public static final /* synthetic */ ActionBar copydefault = new ActionBar();
        public static final InterfaceC58536zG AEQbTJ = C58644zK.KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC58536zG OLrzqt() {
            return AEQbTJ;
        }

        private ActionBar() {
        }
    }
}

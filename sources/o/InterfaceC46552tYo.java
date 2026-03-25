package o;

import com.okinc.localization.bean.LanguageItem;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tYo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC46552tYo extends InterfaceC43217rlC {
    void EZpvd(@NotNull android.content.Context context, boolean z, int i);

    void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager, boolean z, boolean z2);

    void KWHzl(@NotNull android.content.Context context, @NotNull LanguageItem.NameType nameType, Function0<Unit> function0, Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1);

    void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager);

    /* JADX INFO: renamed from: o.tYo$Application */
    public static final class Application {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.tYo */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void routeUpdateLanguage$default(InterfaceC46552tYo interfaceC46552tYo, android.content.Context context, LanguageItem.NameType nameType, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: routeUpdateLanguage");
            }
            if ((i & 2) != 0) {
                nameType = LanguageItem.NameType.CEFI;
            }
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                function1 = null;
            }
            interfaceC46552tYo.KWHzl(context, nameType, function0, function1);
        }
    }
}

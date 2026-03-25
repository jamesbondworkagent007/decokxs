package o;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.tradingbot.impl.aiBot.ui.backtest.StopBacktestDialog$performStopBacktest$1$1;
import com.okinc.tradingbot.impl.aiBot.ui.backtest.StopBacktestDialog$performStopBacktest$2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class uCZ {
    public static final uCZ copydefault = new uCZ();

    private uCZ() {
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ LifecycleOwner KWHzl;
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(CoroutineExceptionHandler.Key key, LifecycleOwner lifecycleOwner, Function1 function1) {
            super(key);
            this.KWHzl = lifecycleOwner;
            this.OLrzqt = function1;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.KWHzl), Dispatchers.getMain(), null, new StopBacktestDialog$performStopBacktest$1$1(th, this.OLrzqt, null), 2, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.uCZ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void show$default(uCZ ucz, android.content.Context context, LifecycleOwner lifecycleOwner, java.lang.String str, Function0 function0, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function1 = null;
        }
        ucz.copydefault(context, lifecycleOwner, str, function0, function1);
    }

    public final void copydefault(@NotNull final android.content.Context context, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final java.lang.String str, @NotNull final Function0<Unit> function0, final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QOLQEE));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.AubY));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI), new View.OnClickListener() { // from class: o.uCW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uCZ.copydefault(viewOnClickListenerC54939xaY, context, lifecycleOwner, str, function0, function1, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C48033uCm.Fragment.DjWNei), new View.OnClickListener() { // from class: o.uCV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                uCZ.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.content.Context context, LifecycleOwner lifecycleOwner, java.lang.String str, Function0 function0, Function1 function1, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        viewOnClickListenerC54939xaY.dismiss();
        copydefault.KWHzl(context, lifecycleOwner, str, function0, function1);
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(android.content.Context context, LifecycleOwner lifecycleOwner, java.lang.String str, Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1) {
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), Dispatchers.getIO().plus(new Activity(CoroutineExceptionHandler.Key, lifecycleOwner, function1)), null, new StopBacktestDialog$performStopBacktest$2(copydefault(context), str, function0, null), 2, null);
    }

    public final uCQ copydefault(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        return ((InterfaceC51009vet) C58114yvF.OLrzqt(applicationContext, InterfaceC51009vet.class)).zpGcln();
    }
}

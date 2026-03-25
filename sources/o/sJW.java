package o;

import com.okinc.okimcore.feature.message.MessageHiddenScheduler$schedule$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJW {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final C44484sRn AEQbTJ;
    public final InterfaceC44293sKl EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C44486sRp copydefault;

    public sJW(@NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44484sRn c44484sRn, @NotNull C44486sRp c44486sRp) {
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        this.EZpvd = interfaceC44293sKl;
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c44484sRn;
        this.copydefault = c44486sRp;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sJW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope;
        return (!set.isEmpty() && (objCoroutineScope = CoroutineScopeKt.coroutineScope(new MessageHiddenScheduler$schedule$2(this, str, set, null), continuation)) == C56442yFn.copydefault()) ? objCoroutineScope : Unit.INSTANCE;
    }
}

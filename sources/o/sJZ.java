package o;

import com.okinc.okimcore.feature.message.MessageUpdateScheduler$schedule$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJZ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;
    public final C44486sRp KWHzl;
    public final InterfaceC44293sKl OLrzqt;

    public sJZ(@NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C44486sRp c44486sRp) {
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        this.OLrzqt = interfaceC44293sKl;
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = c44486sRp;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sJZ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.Set<java.lang.String> set, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope;
        return (!set.isEmpty() && (objCoroutineScope = CoroutineScopeKt.coroutineScope(new MessageUpdateScheduler$schedule$2(this, str, set, null), continuation)) == C56442yFn.copydefault()) ? objCoroutineScope : Unit.INSTANCE;
    }
}

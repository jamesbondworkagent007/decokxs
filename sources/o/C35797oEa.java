package o;

import com.okinc.im.usecase.group.voicecall.GroupVoiceCallUseCase$ringGroupVoiceCall$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35797oEa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC44256sJb EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35797oEa(@NotNull InterfaceC44256sJb interfaceC44256sJb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44256sJb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC44256sJb;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oEa$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEa.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC44427sPk> continuation) {
        return BuildersKt.withContext(this.copydefault, new GroupVoiceCallUseCase$ringGroupVoiceCall$2(this, str, list, null), continuation);
    }
}

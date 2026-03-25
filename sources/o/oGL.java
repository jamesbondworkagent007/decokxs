package o;

import com.okinc.im.usecase.userinfo.GetCurrentUserInfoFromRemoteUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGL {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher EZpvd;
    public final oGQ KWHzl;
    public final InterfaceC44177sGd OLrzqt;

    @yCM
    public oGL(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull oGQ ogq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(ogq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC44177sGd;
        this.KWHzl = ogq;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGL.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static /* synthetic */ java.lang.Object execute$default(oGL ogl, boolean z, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ogl.copydefault(z, continuation);
    }

    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super com.okinc.okimcore.model.remote.UserInfo> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetCurrentUserInfoFromRemoteUseCase$execute$2(z, this, null), continuation);
    }
}

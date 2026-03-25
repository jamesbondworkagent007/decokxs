package o;

import com.okinc.im.usecase.relationinfo.GetRelationInfoFromRemoteUseCase$execute$2;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35859oGi {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC44177sGd copydefault;

    @yCM
    public C35859oGi(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC44177sGd;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.oGi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, java.lang.String str2, @NotNull Continuation<? super RelationInfo> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new GetRelationInfoFromRemoteUseCase$execute$2(str, this, str2, null), continuation);
    }
}

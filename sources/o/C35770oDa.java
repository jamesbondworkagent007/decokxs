package o;

import com.okinc.im.imui.messageV2.model.RecentlyEmojiList;
import com.okinc.im.usecase.emojilist.GetRecentlyEmojiListUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C35770oDa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final CoroutineDispatcher EZpvd;

    /* JADX INFO: renamed from: o.oDa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super RecentlyEmojiList> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetRecentlyEmojiListUseCase$execute$2(null), continuation);
    }
}

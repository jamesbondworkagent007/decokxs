package o;

import com.okinc.im.usecase.emoji.RecentEmojisUseCase$getStoredRecentEmojis$2;
import com.okinc.im.usecase.emoji.RecentEmojisUseCase$saveRecentEmoji$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35771oDb {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final android.content.Context KWHzl;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public C35771oDb(@NotNull android.content.Context context, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = context;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new RecentEmojisUseCase$getStoredRecentEmojis$2(this, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new RecentEmojisUseCase$saveRecentEmoji$2(this, str, null), continuation);
    }

    /* JADX INFO: renamed from: o.oDb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

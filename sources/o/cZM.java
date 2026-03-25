package o;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZM implements xWL {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC43216rlB
    public void init(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.InterfaceC43216rlB
    public boolean isInitialized() {
        return true;
    }

    @Override // o.xWL
    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super xWM> continuation) {
        C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMCopydefault == null) {
            return null;
        }
        C12623cqV c12623cqV = new C12623cqV();
        try {
            if (((java.lang.Boolean) ((kotlin.Pair) C12623cqV.loadWithCoinMeta$default(c12623cqV, c10854bwMCopydefault, c10854bwMCopydefault.KWHzl(), null, 4, null).gEmmrt().KWHzl()).getFirst()).booleanValue()) {
                return new TaskDescription(c12623cqV);
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final class TaskDescription implements xWM {
        public final /* synthetic */ C12623cqV copydefault;

        public TaskDescription(C12623cqV c12623cqV) {
            this.copydefault = c12623cqV;
        }

        @Override // o.xWM
        public java.lang.String KWHzl(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C12623cqV.feeCurrencyAmount$default(this.copydefault, str, false, false, false, 12, null);
        }
    }
}

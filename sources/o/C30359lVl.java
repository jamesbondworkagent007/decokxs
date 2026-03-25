package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C30359lVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30359lVl {
    public static final C30359lVl OLrzqt = new C30359lVl();

    private C30359lVl() {
    }

    /* JADX INFO: renamed from: o.lVl$TaskDescription */
    public static final class TaskDescription implements InterfaceC54816xWj {
        public final /* synthetic */ android.content.Context copydefault;

        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        public TaskDescription(android.content.Context context) {
            this.copydefault = context;
        }

        @Override // o.InterfaceC54816xWj
        public void EZpvd() {
            super.EZpvd();
            C30360lVm.KWHzl.KWHzl(this.copydefault, false, new Function1() { // from class: o.lVq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C30359lVl.TaskDescription.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            });
        }

        public static final Unit AEQbTJ(boolean z) {
            C43296rmc.AEQbTJ("CacheManager", "clearCache done, cleared: " + z);
            return Unit.INSTANCE;
        }
    }

    public final void EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C54819xWm.KWHzl().AEQbTJ(new TaskDescription(context));
    }
}

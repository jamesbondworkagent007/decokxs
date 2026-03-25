package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFR {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final InterfaceC44177sGd AEQbTJ;

    @yCM
    public oFR(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.AEQbTJ = interfaceC44177sGd;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFR.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) {
        return this.AEQbTJ.KWHzl(null, str, null, continuation);
    }
}

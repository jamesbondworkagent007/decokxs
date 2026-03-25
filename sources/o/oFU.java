package o;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFU {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public final InterfaceC44177sGd EZpvd;

    @yCM
    public oFU(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.EZpvd = interfaceC44177sGd;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFU.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) {
        return this.EZpvd.KWHzl(C56443yFo.KWHzl(j), null, null, continuation);
    }
}

package o;

import com.okinc.okimcore.model.remote.PhoneNumber;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFY {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final InterfaceC44177sGd KWHzl;

    @yCM
    public oFY(@NotNull InterfaceC44177sGd interfaceC44177sGd) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        this.KWHzl = interfaceC44177sGd;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFY.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.List<InHouseIMContactInfoEntity>> continuation) {
        return this.KWHzl.KWHzl(null, null, new PhoneNumber(str, str2), continuation);
    }
}

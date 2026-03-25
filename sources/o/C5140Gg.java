package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5140Gg extends AbstractC56429yFa implements CoroutineContext.Element, ThreadContextElement<InterfaceC5137Gd> {
    public static final ActionBar EZpvd = new ActionBar(null);
    public final FW KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FW OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5140Gg(@NotNull FW fw) {
        super(EZpvd);
        Intrinsics.checkNotNullParameter(fw, "");
        this.KWHzl = fw;
    }

    /* JADX INFO: renamed from: o.Gg$ActionBar */
    public static final class ActionBar implements CoroutineContext.TaskDescription<C5140Gg> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Gg.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: updateThreadContext(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object; */
    @Override // kotlinx.coroutines.ThreadContextElement
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC5137Gd updateThreadContext(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        return this.KWHzl.EZpvd();
    }

    /* JADX DEBUG: Method merged with bridge method: restoreThreadContext(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V */
    @Override // kotlinx.coroutines.ThreadContextElement
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void restoreThreadContext(@NotNull CoroutineContext coroutineContext, @NotNull InterfaceC5137Gd interfaceC5137Gd) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(interfaceC5137Gd, "");
        interfaceC5137Gd.close();
    }
}

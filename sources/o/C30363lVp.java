package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lVp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30363lVp extends C43265rly {
    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.EZpvd(lWe.class, C56392yDr.copydefault(new Function0() { // from class: o.lVn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30363lVp.OLrzqt();
            }
        }));
    }

    public static final lVX OLrzqt() {
        return new lVX(new C30371lVx(C30373lVz.copydefault), new lVC(lVD.Companion.KWHzl(), Dispatchers.getIO()), new lWs(), new lVV());
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        C7381aik.Companion.AEQbTJ(this, C56392yDr.copydefault(new Function0() { // from class: o.lVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30363lVp.AEQbTJ();
            }
        }));
    }

    public static final C30362lVo AEQbTJ() {
        return new C30362lVo();
    }
}

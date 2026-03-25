package o;

import com.okinc.okimcore.feature.group.event.GroupEventUseCaseImpl$notifyGroupRefresh$1;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class sIY implements sIX {
    public final CopyOnWriteArrayList<InterfaceC44260sJf> copydefault = new CopyOnWriteArrayList<>();

    @yCM
    public sIY() {
    }

    @Override // o.sIX
    public void KWHzl(@NotNull InterfaceC44260sJf interfaceC44260sJf) {
        Intrinsics.checkNotNullParameter(interfaceC44260sJf, "");
        this.copydefault.add(interfaceC44260sJf);
    }

    @Override // o.sIX
    public void copydefault(@NotNull InterfaceC44260sJf interfaceC44260sJf) {
        Intrinsics.checkNotNullParameter(interfaceC44260sJf, "");
        this.copydefault.remove(interfaceC44260sJf);
    }

    @Override // o.sIX
    public void copydefault(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(new Function1() { // from class: o.sJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sIY.copydefault(str, (InterfaceC44260sJf) obj);
            }
        });
    }

    public static final Unit copydefault(java.lang.String str, InterfaceC44260sJf interfaceC44260sJf) {
        Intrinsics.checkNotNullParameter(interfaceC44260sJf, "");
        interfaceC44260sJf.KWHzl(new C44451sQh(str));
        return Unit.INSTANCE;
    }

    @Override // o.sIX
    public void KWHzl(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        copydefault(new Function1() { // from class: o.sIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sIY.AEQbTJ(str, (InterfaceC44260sJf) obj);
            }
        });
    }

    public static final Unit AEQbTJ(java.lang.String str, InterfaceC44260sJf interfaceC44260sJf) {
        Intrinsics.checkNotNullParameter(interfaceC44260sJf, "");
        interfaceC44260sJf.KWHzl(new C44460sQq(str));
        return Unit.INSTANCE;
    }

    @Override // o.sIX
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(sDN.copydefault.AEQbTJ()), null, null, new GroupEventUseCaseImpl$notifyGroupRefresh$1(this, str, null), 3, null);
    }

    public final void copydefault(Function1<? super InterfaceC44260sJf, Unit> function1) {
        for (InterfaceC44260sJf interfaceC44260sJf : this.copydefault) {
            Intrinsics.copydefault(interfaceC44260sJf);
            function1.invoke(interfaceC44260sJf);
        }
    }
}

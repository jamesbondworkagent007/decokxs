package o;

import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC46523tXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46512tXb implements InterfaceC46523tXm {
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0<LinkedList<InterfaceC46523tXm>>() { // from class: com.okinc.pop.manager.CompositeStateChangeCallback$mCallbacks$2
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        public final LinkedList<InterfaceC46523tXm> invoke() {
            return new LinkedList<>();
        }
    });

    public final LinkedList<InterfaceC46523tXm> copydefault() {
        return (LinkedList) this.copydefault.getValue();
    }

    @Override // o.InterfaceC46523tXm
    public void EZpvd(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
        Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
        try {
            java.util.Iterator<InterfaceC46523tXm> it = copydefault().iterator();
            while (it.hasNext()) {
                it.next().EZpvd(interfaceC46518tXh);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // o.InterfaceC46523tXm
    public void AEQbTJ(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
        Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
        try {
            java.util.Iterator<InterfaceC46523tXm> it = copydefault().iterator();
            while (it.hasNext()) {
                it.next().AEQbTJ(interfaceC46518tXh);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}

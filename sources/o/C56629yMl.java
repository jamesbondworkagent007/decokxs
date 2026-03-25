package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C56929yXo;
import o.InterfaceC56893yWf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yMl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56629yMl {
    public static final C56929yXo AEQbTJ;
    public static final C56629yMl OLrzqt = new C56629yMl();
    public static final java.util.Set<C56929yXo> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56929yXo KWHzl() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<C56929yXo> copydefault() {
        return copydefault;
    }

    private C56629yMl() {
    }

    static {
        java.util.List listGEmmrt = yDY.gEmmrt(yRE.DbNXlk, yRE.AYXKKw, yRE.valueOf, yRE.iwGUEr, yRE.AuCTel, yRE.AEQbTJ);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C56929yXo.ActionBar actionBar = C56929yXo.AEQbTJ;
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(actionBar.KWHzl((C56933yXs) it.next()));
        }
        copydefault = linkedHashSet;
        C56929yXo.ActionBar actionBar2 = C56929yXo.AEQbTJ;
        C56933yXs c56933yXs = yRE.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(c56933yXs, "");
        AEQbTJ = actionBar2.KWHzl(c56933yXs);
    }

    /* JADX INFO: renamed from: o.yMl$Application */
    public static final class Application implements InterfaceC56893yWf.TaskDescription {
        public final /* synthetic */ Ref.BooleanRef copydefault;

        @Override // o.InterfaceC56893yWf.TaskDescription
        public void EZpvd() {
        }

        public Application(Ref.BooleanRef booleanRef) {
            this.copydefault = booleanRef;
        }

        @Override // o.InterfaceC56893yWf.TaskDescription
        public InterfaceC56893yWf.Application copydefault(C56929yXo c56929yXo, InterfaceC56686yOo interfaceC56686yOo) {
            Intrinsics.checkNotNullParameter(c56929yXo, "");
            Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
            if (!Intrinsics.EZpvd(c56929yXo, C56777yRy.copydefault.AEQbTJ())) {
                return null;
            }
            this.copydefault.element = true;
            return null;
        }
    }

    public final boolean OLrzqt(@NotNull InterfaceC56893yWf interfaceC56893yWf) {
        Intrinsics.checkNotNullParameter(interfaceC56893yWf, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        interfaceC56893yWf.KWHzl(new Application(booleanRef), (byte[]) null);
        return booleanRef.element;
    }
}

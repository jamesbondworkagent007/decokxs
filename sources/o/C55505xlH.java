package o;

import com.okinc.unify_find.data.RankTag;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xlH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55505xlH extends AbstractC55504xlG {
    public C55532xli copydefault = new C55532xli(this);

    public final InterfaceC58217yxC EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC55503xlF<java.util.ArrayList<RankTag>> interfaceC55503xlF) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(interfaceC55503xlF, "");
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        map.put("ccy", str);
        map.put("instId", str2);
        C55532xli c55532xli = this.copydefault;
        if (c55532xli != null) {
            return c55532xli.AEQbTJ(map, new StateListAnimator(interfaceC55503xlF));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.xlH$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends RankTag>> {
        public final /* synthetic */ InterfaceC55503xlF<java.util.ArrayList<RankTag>> AEQbTJ;

        public StateListAnimator(InterfaceC55503xlF<java.util.ArrayList<RankTag>> interfaceC55503xlF) {
            this.AEQbTJ = interfaceC55503xlF;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<RankTag> list, java.lang.Exception exc) {
            if (!z) {
                InterfaceC55503xlF<java.util.ArrayList<RankTag>> interfaceC55503xlF = this.AEQbTJ;
                if (interfaceC55503xlF != null) {
                    interfaceC55503xlF.OLrzqt();
                    return;
                }
                return;
            }
            if (this.AEQbTJ != null) {
                if (list != null && list.size() > 0) {
                    this.AEQbTJ.KWHzl((java.util.ArrayList) list);
                } else {
                    this.AEQbTJ.OLrzqt();
                }
            }
        }
    }
}

package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC57909yrM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ysu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57996ysu extends C57983ysh implements InterfaceC57912yrP {
    public static final C57996ysu AEQbTJ = new C57996ysu();
    public static final Activity EZpvd = new Activity(C57978ysc.Companion.AEQbTJ(), new InterfaceC57918yrV[]{C57985ysj.EZpvd(C57992ysq.AEQbTJ), C57993ysr.AEQbTJ, C57985ysj.EZpvd(C57995yst.EZpvd)});

    private C57996ysu() {
        super(false, 1, null);
    }

    /* JADX INFO: renamed from: o.ysu$Activity */
    public static final class Activity extends C57917yrU implements InterfaceC57909yrM {
        public Activity(Function1<? super java.util.Collection<? extends InterfaceC57914yrR>, java.lang.Boolean> function1, InterfaceC57918yrV[] interfaceC57918yrVArr) {
            super(function1, interfaceC57918yrVArr);
        }

        /* JADX DEBUG: Possible override for method o.yse.copydefault()V */
        @Override // o.InterfaceC57909yrM
        public boolean copydefault() {
            return InterfaceC57909yrM.ActionBar.AEQbTJ(this);
        }
    }

    @Override // o.C57983ysh, o.InterfaceC57914yrR
    public boolean AEQbTJ() {
        return EZpvd.AEQbTJ();
    }

    @Override // o.C57983ysh, o.InterfaceC57915yrS
    public void KWHzl(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
        Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
        EZpvd.KWHzl(interfaceC57916yrT);
    }

    @Override // o.C57983ysh, o.InterfaceC57915yrS
    public void AEQbTJ(@NotNull InterfaceC57916yrT interfaceC57916yrT) {
        Intrinsics.checkNotNullParameter(interfaceC57916yrT, "");
        EZpvd.AEQbTJ(interfaceC57916yrT);
    }
}

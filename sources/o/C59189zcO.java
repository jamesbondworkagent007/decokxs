package o;

import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59189zcO {
    public static final C59189zcO EZpvd = new C59189zcO();

    private C59189zcO() {
    }

    public final boolean EZpvd(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59381zfv interfaceC59381zfv2) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv2, "");
        return copydefault(typeCheckerState, interfaceC59381zfv, interfaceC59381zfv2);
    }

    public final boolean copydefault(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59381zfv interfaceC59381zfv2) {
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (C59188zcN.copydefault) {
            if (!interfaceC59384zfyOLrzqt.AYXKKw(interfaceC59381zfv) && !interfaceC59384zfyOLrzqt.DbNXlk(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv))) {
                typeCheckerState.EZpvd(interfaceC59381zfv);
            }
            if (!interfaceC59384zfyOLrzqt.AYXKKw(interfaceC59381zfv2)) {
                typeCheckerState.EZpvd(interfaceC59381zfv2);
            }
        }
        if (interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv2) || interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv) || interfaceC59384zfyOLrzqt.AkhnZx((InterfaceC59382zfw) interfaceC59381zfv)) {
            return true;
        }
        if ((interfaceC59381zfv instanceof InterfaceC59377zfr) && interfaceC59384zfyOLrzqt.AEQbTJ((InterfaceC59377zfr) interfaceC59381zfv)) {
            return true;
        }
        C59189zcO c59189zcO = EZpvd;
        if (c59189zcO.copydefault(typeCheckerState, interfaceC59381zfv, TypeCheckerState.ActionBar.Application.OLrzqt)) {
            return true;
        }
        if (interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv2) || c59189zcO.copydefault(typeCheckerState, interfaceC59381zfv2, TypeCheckerState.ActionBar.TaskDescription.EZpvd) || interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfv)) {
            return false;
        }
        return c59189zcO.KWHzl(typeCheckerState, interfaceC59381zfv, interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv2));
    }

    public final boolean copydefault(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull TypeCheckerState.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        Intrinsics.checkNotNullParameter(actionBar, "");
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if ((interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfv) && !interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv)) || interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfv)) {
            return true;
        }
        typeCheckerState.AEQbTJ();
        ArrayDeque<InterfaceC59381zfv> arrayDequeKWHzl = typeCheckerState.KWHzl();
        Intrinsics.copydefault(arrayDequeKWHzl);
        java.util.Set<InterfaceC59381zfv> setCopydefault = typeCheckerState.copydefault();
        Intrinsics.copydefault(setCopydefault);
        arrayDequeKWHzl.push(interfaceC59381zfv);
        while (!arrayDequeKWHzl.isEmpty()) {
            InterfaceC59381zfv interfaceC59381zfvPop = arrayDequeKWHzl.pop();
            Intrinsics.copydefault(interfaceC59381zfvPop);
            if (setCopydefault.add(interfaceC59381zfvPop)) {
                TypeCheckerState.ActionBar actionBar2 = interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfvPop) ? TypeCheckerState.ActionBar.StateListAnimator.EZpvd : actionBar;
                if (!(!Intrinsics.EZpvd(actionBar2, TypeCheckerState.ActionBar.StateListAnimator.EZpvd))) {
                    actionBar2 = null;
                }
                if (actionBar2 == null) {
                    continue;
                } else {
                    InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
                    java.util.Iterator<InterfaceC59382zfw> it = interfaceC59384zfyOLrzqt2.AuCTel(interfaceC59384zfyOLrzqt2.fetchVPNInfo(interfaceC59381zfvPop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC59381zfv interfaceC59381zfvOLrzqt = actionBar2.OLrzqt(typeCheckerState, it.next());
                        if ((interfaceC59384zfyOLrzqt.AEQbTJ(interfaceC59381zfvOLrzqt) && !interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfvOLrzqt)) || interfaceC59384zfyOLrzqt.copydefault(interfaceC59381zfvOLrzqt)) {
                            typeCheckerState.EZpvd();
                            return true;
                        }
                        arrayDequeKWHzl.add(interfaceC59381zfvOLrzqt);
                    }
                }
            }
        }
        typeCheckerState.EZpvd();
        return false;
    }

    public final boolean KWHzl(@NotNull TypeCheckerState typeCheckerState, @NotNull InterfaceC59381zfv interfaceC59381zfv, @NotNull InterfaceC59385zfz interfaceC59385zfz) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "");
        Intrinsics.checkNotNullParameter(interfaceC59381zfv, "");
        Intrinsics.checkNotNullParameter(interfaceC59385zfz, "");
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (EZpvd.AEQbTJ(typeCheckerState, interfaceC59381zfv, interfaceC59385zfz)) {
            return true;
        }
        typeCheckerState.AEQbTJ();
        ArrayDeque<InterfaceC59381zfv> arrayDequeKWHzl = typeCheckerState.KWHzl();
        Intrinsics.copydefault(arrayDequeKWHzl);
        java.util.Set<InterfaceC59381zfv> setCopydefault = typeCheckerState.copydefault();
        Intrinsics.copydefault(setCopydefault);
        arrayDequeKWHzl.push(interfaceC59381zfv);
        while (!arrayDequeKWHzl.isEmpty()) {
            InterfaceC59381zfv interfaceC59381zfvPop = arrayDequeKWHzl.pop();
            Intrinsics.copydefault(interfaceC59381zfvPop);
            if (setCopydefault.add(interfaceC59381zfvPop)) {
                TypeCheckerState.ActionBar actionBar = interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfvPop) ? TypeCheckerState.ActionBar.StateListAnimator.EZpvd : TypeCheckerState.ActionBar.Application.OLrzqt;
                if (!(!Intrinsics.EZpvd(actionBar, TypeCheckerState.ActionBar.StateListAnimator.EZpvd))) {
                    actionBar = null;
                }
                if (actionBar == null) {
                    continue;
                } else {
                    InterfaceC59384zfy interfaceC59384zfyOLrzqt2 = typeCheckerState.OLrzqt();
                    java.util.Iterator<InterfaceC59382zfw> it = interfaceC59384zfyOLrzqt2.AuCTel(interfaceC59384zfyOLrzqt2.fetchVPNInfo(interfaceC59381zfvPop)).iterator();
                    while (it.hasNext()) {
                        InterfaceC59381zfv interfaceC59381zfvOLrzqt = actionBar.OLrzqt(typeCheckerState, it.next());
                        if (EZpvd.AEQbTJ(typeCheckerState, interfaceC59381zfvOLrzqt, interfaceC59385zfz)) {
                            typeCheckerState.EZpvd();
                            return true;
                        }
                        arrayDequeKWHzl.add(interfaceC59381zfvOLrzqt);
                    }
                }
            }
        }
        typeCheckerState.EZpvd();
        return false;
    }

    public final boolean AEQbTJ(TypeCheckerState typeCheckerState, InterfaceC59381zfv interfaceC59381zfv, InterfaceC59385zfz interfaceC59385zfz) {
        InterfaceC59384zfy interfaceC59384zfyOLrzqt = typeCheckerState.OLrzqt();
        if (interfaceC59384zfyOLrzqt.AuCTel(interfaceC59381zfv)) {
            return true;
        }
        if (interfaceC59384zfyOLrzqt.values((InterfaceC59382zfw) interfaceC59381zfv)) {
            return false;
        }
        if (typeCheckerState.AYXKKw() && interfaceC59384zfyOLrzqt.valueOf(interfaceC59381zfv)) {
            return true;
        }
        return interfaceC59384zfyOLrzqt.copydefault(interfaceC59384zfyOLrzqt.fetchVPNInfo(interfaceC59381zfv), interfaceC59385zfz);
    }
}

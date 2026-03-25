package o;

import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.byG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10954byG {
    public static volatile InterfaceC58217yxC djBIcL;
    public static volatile boolean valueOf;
    public static final C10954byG EZpvd = new C10954byG();
    public static final java.lang.String OLrzqt = "CoinMeta-MetaManager";
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.byO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10954byG.copydefault();
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.byP
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C10954byG.KWHzl();
        }
    });
    public static final java.util.ArrayList<InterfaceC58184ywW<java.lang.Boolean>> AhwBna = new java.util.ArrayList<>();
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return valueOf;
    }

    private C10954byG() {
    }

    public final C10948byA valueOf() {
        return (C10948byA) copydefault.getValue();
    }

    public static final C10948byA copydefault() {
        return new C10948byA(null, 1, 0 == true ? 1 : 0);
    }

    public final C10862bwU AYXKKw() {
        return (C10862bwU) AEQbTJ.getValue();
    }

    public static final C10862bwU KWHzl() {
        return new C10862bwU(null, null, null, null, null, null, null, 127, null);
    }

    public final AbstractC58185ywX<java.lang.Boolean> djBIcL() {
        if (valueOf) {
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(java.lang.Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return abstractC58185ywXKWHzl;
        }
        return values();
    }

    public final AbstractC58185ywX<java.lang.Boolean> values() {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl;
        synchronized (this) {
            if (djBIcL == null) {
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = AYXKKw().AEQbTJ();
                final Function1 function1 = new Function1() { // from class: o.byE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10954byG.copydefault((InterfaceC60094zvb) obj);
                    }
                };
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = abstractC58185ywXAEQbTJ.EZpvd(new InterfaceC58227yxM() { // from class: o.byH
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C10954byG.KWHzl(function1, obj);
                    }
                }).OLrzqt(new InterfaceC58222yxH() { // from class: o.byD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58222yxH
                    public final void run() {
                        C10954byG.gEmmrt();
                    }
                });
                final Function1 function12 = new Function1() { // from class: o.byJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10954byG.OLrzqt((java.lang.Boolean) obj);
                    }
                };
                InterfaceC58227yxM<? super java.lang.Boolean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.byK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C10954byG.copydefault(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.byI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C10954byG.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                djBIcL = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.byM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C10954byG.valueOf(function13, obj);
                    }
                });
            }
            abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.byL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58187ywZ
                public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                    C10954byG.AEQbTJ(interfaceC58184ywW);
                }
            }, BackpressureStrategy.BUFFER);
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        }
        return abstractC58185ywXKWHzl;
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InterfaceC60094zvb interfaceC60094zvb) {
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Boolean bool) {
        valueOf = bool.booleanValue();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        valueOf = false;
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        AhwBna.add(interfaceC58184ywW);
    }

    public final void DbNXlk() {
        valueOf = false;
        InterfaceC58217yxC interfaceC58217yxC = djBIcL;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        djBIcL = null;
        AhwBna.clear();
        valueOf().AuCTelauCTel();
    }

    public static final void gEmmrt() {
        java.util.Iterator<T> it = AhwBna.iterator();
        while (it.hasNext()) {
            InterfaceC58184ywW interfaceC58184ywW = (InterfaceC58184ywW) it.next();
            interfaceC58184ywW.onNext(java.lang.Boolean.valueOf(valueOf));
            interfaceC58184ywW.onComplete();
        }
        AhwBna.clear();
        djBIcL = null;
    }
}

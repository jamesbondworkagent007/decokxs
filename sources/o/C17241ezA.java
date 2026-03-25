package o;

import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC17259ezS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ezA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17241ezA implements InterfaceC17288ezv {
    public final InterfaceC17258ezR AEQbTJ;

    public C17241ezA(@NotNull InterfaceC17258ezR interfaceC17258ezR) {
        Intrinsics.checkNotNullParameter(interfaceC17258ezR, "");
        this.AEQbTJ = interfaceC17258ezR;
    }

    @Override // o.InterfaceC17288ezv
    public AbstractC58177ywP copydefault() {
        return this.AEQbTJ.copydefault();
    }

    @Override // o.InterfaceC17288ezv
    public AbstractC58260yxt<C17289ezw> EZpvd(@NotNull java.lang.String str, @NotNull final WalletType walletType, @NotNull final java.lang.String str2, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtKWHzl = this.AEQbTJ.KWHzl(str, true);
        final Function1 function1 = new Function1() { // from class: o.ezM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17241ezA.AEQbTJ(walletType, str2, z, this, (AbstractC12782ctV) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtKWHzl.copydefault(new InterfaceC58229yxO() { // from class: o.ezL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17241ezA.AkhnZx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ezI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17241ezA.KWHzl(this.copydefault, (AbstractC17259ezS.Application) obj);
            }
        };
        AbstractC58260yxt<C17289ezw> abstractC58260yxtOLrzqt = abstractC58260yxtCopydefault.OLrzqt((InterfaceC58229yxO<? super R, ? extends InterfaceC58261yxu<? extends R>>) new InterfaceC58229yxO() { // from class: o.ezJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17241ezA.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final AbstractC17259ezS.Application AkhnZx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC17259ezS.Application) function1.invoke(obj);
    }

    public static final AbstractC17259ezS.Application AEQbTJ(WalletType walletType, java.lang.String str, boolean z, C17241ezA c17241ezA, AbstractC12782ctV abstractC12782ctV) {
        boolean zCopydefault;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null) {
            abstractC12782ctVKWHzl = z ? c17241ezA.AEQbTJ.KWHzl(abstractC12782ctV, abstractC12784ctXGwTjWJ) : null;
            zCopydefault = c17241ezA.AEQbTJ.copydefault(abstractC12784ctXGwTjWJ, abstractC12782ctV, abstractC12782ctVKWHzl);
        } else {
            zCopydefault = false;
        }
        return new AbstractC17259ezS.Application(walletType, abstractC12782ctV, abstractC12784ctXGwTjWJ, abstractC12782ctVKWHzl, zCopydefault, str);
    }

    public static final InterfaceC58261yxu DbNXlk(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(C17241ezA c17241ezA, AbstractC17259ezS.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return c17241ezA.copydefault(application);
    }

    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ezw> */
    /* JADX DEBUG: Type inference failed for r6v4. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ezw> */
    /* JADX DEBUG: Type inference failed for r6v5. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ezw> */
    /* JADX DEBUG: Type inference failed for r6v6. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ezw> */
    public final AbstractC58260yxt<C17289ezw> copydefault(final AbstractC17259ezS.Application application) {
        pUU.OLrzqt(">>>wallet deleteWalletDeleteData data.rootWallet:" + application.OLrzqt() + " - data:" + application);
        final AbstractC12782ctV abstractC12782ctVAhwBna = application.AhwBna();
        java.lang.String strDjBIcL = application.djBIcL();
        if (application.OLrzqt() == null) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtEZpvd = this.AEQbTJ.EZpvd(abstractC12782ctVAhwBna, strDjBIcL);
            final Function1 function1 = new Function1() { // from class: o.ezP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17241ezA.KWHzl(application, abstractC12782ctVAhwBna, (java.lang.Integer) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtEZpvd.copydefault(new InterfaceC58229yxO() { // from class: o.ezQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C17241ezA.values(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
            return abstractC58260yxtCopydefault;
        }
        if (application.copydefault() == null) {
            if (application.KWHzl()) {
                AbstractC58260yxt<java.lang.Integer> abstractC58260yxtEZpvd2 = this.AEQbTJ.EZpvd(abstractC12782ctVAhwBna, strDjBIcL);
                final Function1 function12 = new Function1() { // from class: o.ezN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C17241ezA.OLrzqt(application, abstractC12782ctVAhwBna, (java.lang.Integer) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtCopydefault2 = abstractC58260yxtEZpvd2.copydefault(new InterfaceC58229yxO() { // from class: o.ezO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return C17241ezA.fARcdN(function12, obj);
                    }
                });
                Intrinsics.copydefault(abstractC58260yxtCopydefault2);
                return abstractC58260yxtCopydefault2;
            }
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(application.OLrzqt(), strDjBIcL);
            final Function1 function13 = new Function1() { // from class: o.ezy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C17241ezA.AEQbTJ(application, (java.lang.Integer) obj);
                }
            };
            AbstractC58260yxt abstractC58260yxtCopydefault3 = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.ezC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C17241ezA.isConnected(function13, obj);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtCopydefault3);
            return abstractC58260yxtCopydefault3;
        }
        if (application.KWHzl()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtEZpvd3 = this.AEQbTJ.EZpvd(abstractC12782ctVAhwBna, strDjBIcL);
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtEZpvd4 = this.AEQbTJ.EZpvd(application.copydefault(), strDjBIcL);
            final Function2 function2 = new Function2() { // from class: o.ezG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C17241ezA.KWHzl(application, abstractC12782ctVAhwBna, (java.lang.Integer) obj, (java.lang.Integer) obj2);
                }
            };
            AbstractC58260yxt<C17289ezw> abstractC58260yxtOLrzqt2 = AbstractC58260yxt.OLrzqt(abstractC58260yxtEZpvd3, abstractC58260yxtEZpvd4, new InterfaceC58223yxI() { // from class: o.ezD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return C17241ezA.AEQbTJ(function2, obj, obj2);
                }
            });
            Intrinsics.copydefault(abstractC58260yxtOLrzqt2);
            return abstractC58260yxtOLrzqt2;
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt3 = this.AEQbTJ.OLrzqt(application.OLrzqt(), strDjBIcL);
        final Function1 function14 = new Function1() { // from class: o.ezF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17241ezA.EZpvd(application, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault4 = abstractC58260yxtOLrzqt3.copydefault(new InterfaceC58229yxO() { // from class: o.ezE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17241ezA.fetchVPNInfo(function14, obj);
            }
        });
        Intrinsics.copydefault(abstractC58260yxtCopydefault4);
        return abstractC58260yxtCopydefault4;
    }

    public static final C17289ezw KWHzl(AbstractC17259ezS.Application application, AbstractC12782ctV abstractC12782ctV, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new C17289ezw(application, false, C56402yEa.EZpvd(abstractC12782ctV.DbNXlk()));
    }

    public static final C17289ezw values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C17289ezw) function1.invoke(obj);
    }

    public static final C17289ezw OLrzqt(AbstractC17259ezS.Application application, AbstractC12782ctV abstractC12782ctV, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new C17289ezw(application, false, C56402yEa.EZpvd(abstractC12782ctV.DbNXlk()));
    }

    public static final C17289ezw fARcdN(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C17289ezw) function1.invoke(obj);
    }

    public static final C17289ezw AEQbTJ(AbstractC17259ezS.Application application, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new C17289ezw(application, true, null, 4, null);
    }

    public static final C17289ezw isConnected(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C17289ezw) function1.invoke(obj);
    }

    public static final C17289ezw AEQbTJ(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (C17289ezw) function2.invoke(obj, obj2);
    }

    public static final C17289ezw KWHzl(AbstractC17259ezS.Application application, AbstractC12782ctV abstractC12782ctV, java.lang.Integer num, java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(num2, "");
        return new C17289ezw(application, true, yDY.gEmmrt(abstractC12782ctV.DbNXlk(), application.copydefault().DbNXlk()));
    }

    public static final C17289ezw EZpvd(AbstractC17259ezS.Application application, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new C17289ezw(application, true, null, 4, null);
    }

    public static final C17289ezw fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C17289ezw) function1.invoke(obj);
    }

    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: o.yxt<R>, java.lang.Object, o.yxt<o.ezw> */
    @Override // o.InterfaceC17288ezv
    public AbstractC58260yxt<C17289ezw> AEQbTJ(@NotNull java.lang.String str, @NotNull final WalletType walletType, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtOLrzqt = this.AEQbTJ.OLrzqt(str);
        final Function1 function1 = new Function1() { // from class: o.ezH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17241ezA.KWHzl(walletType, str2, this, (AbstractC12784ctX) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.ezK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17241ezA.djBIcL(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt2, "");
        return abstractC58260yxtOLrzqt2;
    }

    public static final InterfaceC58261yxu djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu KWHzl(WalletType walletType, java.lang.String str, C17241ezA c17241ezA, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        final AbstractC17259ezS.StateListAnimator stateListAnimator = new AbstractC17259ezS.StateListAnimator(walletType, abstractC12784ctX, str);
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = c17241ezA.AEQbTJ.OLrzqt(abstractC12784ctX, str);
        final Function1 function1 = new Function1() { // from class: o.ezz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17241ezA.AEQbTJ(stateListAnimator, (java.lang.Integer) obj);
            }
        };
        return abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.ezB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C17241ezA.AhwBna(function1, obj);
            }
        });
    }

    public static final C17289ezw AEQbTJ(AbstractC17259ezS.StateListAnimator stateListAnimator, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return new C17289ezw(stateListAnimator, true, null, 4, null);
    }

    public static final C17289ezw AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (C17289ezw) function1.invoke(obj);
    }
}

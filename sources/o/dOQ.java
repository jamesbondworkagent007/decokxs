package o;

import com.okinc.business.defi.biz.constant.HardwareType;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.bean.EnterWalletMainBean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dOQ extends AbstractC57329ygP {

    /* JADX INFO: loaded from: classes14.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.AAWallet.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.HDWallet.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[WalletType.MPCWallet.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[WalletType.KeyWallet.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[WalletType.HardwareWallet.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC57329ygP
    public java.lang.String getSupportJSObjectUri() {
        return "window";
    }

    @Override // o.AbstractC57329ygP
    public void performJSMethod(@NotNull final com.okinc.jsbridge.Message message, @NotNull final InterfaceC57336ygW interfaceC57336ygW) {
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(interfaceC57336ygW, "");
        final android.content.Context contextAEQbTJ = interfaceC57336ygW.AEQbTJ();
        if (contextAEQbTJ instanceof AbstractActivityC33041mov) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function1 = new Function1() { // from class: o.dPi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.EZpvd(this.OLrzqt, contextAEQbTJ, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.ORxRYg(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dPn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.EZpvd(interfaceC57336ygW, message, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.QOLQEE(function12, obj);
                }
            });
            return;
        }
        interfaceC57336ygW.copydefault(message, "fail");
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(dOQ doq, android.content.Context context, AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.copydefault(abstractC12782ctV);
        doq.EZpvd(abstractC12782ctV, (AbstractActivityC33041mov) context);
        return Unit.INSTANCE;
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InterfaceC57336ygW interfaceC57336ygW, com.okinc.jsbridge.Message message, java.lang.Throwable th) {
        interfaceC57336ygW.copydefault(message, "fail");
        return Unit.INSTANCE;
    }

    public final void EZpvd(final AbstractC12782ctV abstractC12782ctV, final AbstractActivityC33041mov abstractActivityC33041mov) {
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        final long jFetchVPNInfo = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L;
        int i = ActionBar.EZpvd[abstractC12782ctV.QwvEab().ordinal()];
        if (i == 1) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(abstractC12782ctV.DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dPH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.djBIcL(abstractActivityC33041mov, this, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dOX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.DTwDnp(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dOW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.fIwbmz((java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.QKVWgx(function12, obj);
                }
            }));
            return;
        }
        if (i == 2) {
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(jFetchVPNInfo), abstractC12782ctV.QwvEab());
            final Function1 function13 = new Function1() { // from class: o.dPd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.EZpvd(abstractActivityC33041mov, this, abstractC12782ctV, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super java.util.List<AbstractC12782ctV>> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.dPf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.getNewProxyInstance(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.dPe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AkhnZx((java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.dPj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.hDKMBd(function14, obj);
                }
            }));
            return;
        }
        if (i == 3) {
            if (abstractC12782ctV.QSBOWP() == null) {
                return;
            }
            if (!abstractC12782ctV.zLjUOn()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.HJWChPdIKEqB, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            if (!abstractC12782ctV.Dmq()) {
                C55326xho.toast$default(C13754dXa.FragmentManager.performMenuItemShortcut, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl2 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(jFetchVPNInfo), abstractC12782ctV.QwvEab());
            final Function1 function15 = new Function1() { // from class: o.dPk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.copydefault(abstractActivityC33041mov, this, abstractC12782ctV, jFetchVPNInfo, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM<? super java.util.List<AbstractC12782ctV>> interfaceC58227yxM3 = new InterfaceC58227yxM() { // from class: o.dPh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.wlaJM(function15, obj);
                }
            };
            final Function1 function16 = new Function1() { // from class: o.dPI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.DbNXlk((java.lang.Throwable) obj);
                }
            };
            Intrinsics.copydefault(abstractC58260yxtKWHzl2.AEQbTJ(interfaceC58227yxM3, new InterfaceC58227yxM() { // from class: o.dPK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.AuCTelauCTel(function16, obj);
                }
            }));
            return;
        }
        if (i != 4) {
            if (i == 5) {
                if (abstractC12782ctV.sSMYrx()) {
                    AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl3 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(jFetchVPNInfo), abstractC12782ctV.QwvEab());
                    final Function1 function17 = new Function1() { // from class: o.dOR
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dOQ.AEQbTJ(abstractC12782ctV, abstractActivityC33041mov, jFetchVPNInfo, this, (java.util.List) obj);
                        }
                    };
                    InterfaceC58227yxM<? super java.util.List<AbstractC12782ctV>> interfaceC58227yxM4 = new InterfaceC58227yxM() { // from class: o.dPa
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dOQ.sSMYrx(function17, obj);
                        }
                    };
                    final Function1 function18 = new Function1() { // from class: o.dOZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return dOQ.fJNWhG((java.lang.Throwable) obj);
                        }
                    };
                    Intrinsics.copydefault(abstractC58260yxtKWHzl3.AEQbTJ(interfaceC58227yxM4, new InterfaceC58227yxM() { // from class: o.dOY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            dOQ.OcIXYQ(function18, obj);
                        }
                    }));
                    return;
                }
                C55326xho.toast$default(C13754dXa.FragmentManager.aChkwz, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
            C55326xho.toast$default(C13754dXa.FragmentManager.aChkwz, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        java.lang.String strEZpvd = abstractC12782ctV.EZpvd(jFetchVPNInfo);
        if (strEZpvd == null || strEZpvd.length() == 0 || !abstractC12782ctV.dUDNAs()) {
            C55326xho.toast$default(C13754dXa.FragmentManager.aChkwz, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            return;
        }
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl4 = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(strEZpvd, abstractC12782ctV.QwvEab());
        final Function1 function19 = new Function1() { // from class: o.dPN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dOQ.OLrzqt(abstractActivityC33041mov, this, abstractC12782ctV, jFetchVPNInfo, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<AbstractC12782ctV>> interfaceC58227yxM5 = new InterfaceC58227yxM() { // from class: o.dOS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dOQ.AwvSrB(function19, obj);
            }
        };
        final Function1 function110 = new Function1() { // from class: o.dOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dOQ.values((java.lang.Throwable) obj);
            }
        };
        Intrinsics.copydefault(abstractC58260yxtKWHzl4.AEQbTJ(interfaceC58227yxM5, new InterfaceC58227yxM() { // from class: o.dOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                dOQ.zuBGHE(function110, obj);
            }
        }));
    }

    public static final void DTwDnp(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit djBIcL(AbstractActivityC33041mov abstractActivityC33041mov, dOQ doq, java.lang.Integer num) {
        dZK.AEQbTJ.AEQbTJ(abstractActivityC33041mov, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        doq.EZpvd(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final void QKVWgx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fIwbmz(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, final dOQ doq, final AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dOT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AhwBna(abstractActivityC33041mov, doq, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.iwGUEr(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dPp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AhwBna((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.uzCIH(function12, obj);
                }
            });
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14469dlz(supportFragmentManager, abstractActivityC33041mov, null, null, new Function1() { // from class: o.dPG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.KWHzl(abstractActivityC33041mov, abstractC12782ctV, doq, (java.lang.String) obj);
                }
            }, null, null, null, 232, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(AbstractActivityC33041mov abstractActivityC33041mov, dOQ doq, java.lang.Integer num) {
        dZK.AEQbTJ.AEQbTJ(abstractActivityC33041mov, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        doq.EZpvd(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, final dOQ doq, java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        fNC fnc = fNC.OLrzqt;
        C14459dlp c14459dlp = new C14459dlp(abstractActivityC33041mov, false, 2, null);
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) != null) {
            fnc.copydefault(abstractActivityC33041mov, c14459dlp, strEZpvd, str, WalletType.HDWallet, new Function1() { // from class: o.dPo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.copydefault(this.OLrzqt, abstractC12782ctV, abstractActivityC33041mov, (AbstractC12782ctV) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(dOQ doq, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV2) {
        if (abstractC12782ctV2 != null) {
            doq.KWHzl(abstractC12782ctV, abstractActivityC33041mov);
        } else {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.OnBackPressedDispatcher2), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AkhnZx(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void wlaJM(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final AbstractActivityC33041mov abstractActivityC33041mov, final dOQ doq, final AbstractC12782ctV abstractC12782ctV, final long j, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dPw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AYXKKw(abstractActivityC33041mov, doq, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.getFieldNames(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dPz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.fetchVPNInfo((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.zLjUOn(function12, obj);
                }
            });
        } else {
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14469dlz(supportFragmentManager, abstractActivityC33041mov, null, null, new Function1() { // from class: o.dPD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.OLrzqt(abstractActivityC33041mov, abstractC12782ctV, j, doq, (java.lang.String) obj);
                }
            }, null, null, null, 232, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(AbstractActivityC33041mov abstractActivityC33041mov, dOQ doq, java.lang.Integer num) {
        dZK.AEQbTJ.AEQbTJ(abstractActivityC33041mov, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        doq.EZpvd(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void zLjUOn(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, long j, final dOQ doq, java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        fNC fnc = fNC.OLrzqt;
        C14459dlp c14459dlp = new C14459dlp(abstractActivityC33041mov, false, 2, null);
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
            strEZpvd = "";
        }
        fNC.createMpcSmartAccount$default(fnc, abstractActivityC33041mov, c14459dlp, strEZpvd, str, j, false, false, false, new Function1() { // from class: o.dPm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dOQ.gEmmrt(this.KWHzl, abstractC12782ctV, abstractActivityC33041mov, (AbstractC12782ctV) obj);
            }
        }, 224, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(dOQ doq, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV2) {
        if (abstractC12782ctV2 != null) {
            doq.KWHzl(abstractC12782ctV, abstractActivityC33041mov);
        } else {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.OnBackPressedDispatcher2), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit DbNXlk(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AwvSrB(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(final AbstractActivityC33041mov abstractActivityC33041mov, final dOQ doq, final AbstractC12782ctV abstractC12782ctV, final long j, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dPq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.valueOf(abstractActivityC33041mov, doq, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.zsXlph(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dPt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.isConnected((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.AubY(function12, obj);
                }
            });
        } else {
            C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
            final long jAEQbTJ = c10854bwMIsConnected != null ? c10854bwMIsConnected.AEQbTJ() : -1L;
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            new C14469dlz(supportFragmentManager, abstractActivityC33041mov, null, null, new Function1() { // from class: o.dPs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AEQbTJ(abstractActivityC33041mov, abstractC12782ctV, j, jAEQbTJ, doq, (java.lang.String) obj);
                }
            }, null, null, null, 232, null).EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(AbstractActivityC33041mov abstractActivityC33041mov, dOQ doq, java.lang.Integer num) {
        dZK.AEQbTJ.AEQbTJ(abstractActivityC33041mov, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        doq.EZpvd(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final void AubY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit isConnected(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(final AbstractActivityC33041mov abstractActivityC33041mov, final AbstractC12782ctV abstractC12782ctV, long j, long j2, final dOQ doq, java.lang.String str) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        fNC fnc = fNC.OLrzqt;
        androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
        C14459dlp c14459dlp = new C14459dlp(abstractActivityC33041mov, false, 2, null);
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) != null) {
            fnc.OLrzqt(supportFragmentManager, abstractActivityC33041mov, c14459dlp, strEZpvd, str, abstractC12782ctV.EZpvd(j), abstractC12782ctV.RlQdEF(), j, j2, WalletType.KeyWallet, new Function1() { // from class: o.dOM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.AYXKKw(this.KWHzl, abstractC12782ctV, abstractActivityC33041mov, (AbstractC12782ctV) obj);
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(dOQ doq, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV2) {
        if (abstractC12782ctV2 != null) {
            doq.KWHzl(abstractC12782ctV, abstractActivityC33041mov);
        } else {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.OnBackPressedDispatcher2), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void sSMYrx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(final AbstractC12782ctV abstractC12782ctV, final AbstractActivityC33041mov abstractActivityC33041mov, long j, final dOQ doq, java.util.List list) {
        C13854daT c13854daTFetchVPNInfo;
        java.lang.Object next;
        java.lang.Object next2;
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(((AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.dPE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.gEmmrt(abstractActivityC33041mov, doq, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM<? super java.lang.Integer> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dPA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.gHZMYf(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.dPC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.fARcdN((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dPB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    dOQ.AxsJAY(function12, obj);
                }
            });
        } else {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (c13854daTFetchVPNInfo = abstractC12784ctXGwTjWJ.fetchVPNInfo()) == null) {
                return Unit.INSTANCE;
            }
            java.util.Iterator<T> it = abstractC12782ctV.valueOf().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ChainAddress chainAddress = (ChainAddress) next;
                if (Intrinsics.EZpvd((java.lang.Object) abstractC12782ctV.EZpvd(j), (java.lang.Object) chainAddress.getAddress())) {
                    java.util.Iterator<T> it2 = C10954byG.EZpvd.valueOf().OLrzqt().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (chainAddress.getCoinId() == ((C10854bwM) next2).AhwBna()) {
                            break;
                        }
                    }
                    if (next2 != null) {
                        break;
                    }
                }
            }
            ChainAddress chainAddress2 = (ChainAddress) next;
            if (chainAddress2 == null) {
                return Unit.INSTANCE;
            }
            fNC fnc = fNC.OLrzqt;
            androidx.fragment.app.FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            C14459dlp c14459dlp = new C14459dlp(abstractActivityC33041mov, false, 2, null);
            java.lang.String strAkhnZx = abstractC12782ctV.AkhnZx();
            java.lang.String strEZpvd = abstractC12782ctV.EZpvd(j);
            java.lang.String strAYXKKw = c13854daTFetchVPNInfo.AYXKKw();
            java.lang.String strOLrzqt = c13854daTFetchVPNInfo.OLrzqt();
            HardwareType hardwareTypeKWHzl = c13854daTFetchVPNInfo.KWHzl();
            if (hardwareTypeKWHzl == null) {
                hardwareTypeKWHzl = HardwareType.LedgerNanoX;
            }
            fnc.OLrzqt(abstractActivityC33041mov, supportFragmentManager, c14459dlp, chainAddress2, strAkhnZx, strEZpvd, j, strAYXKKw, c13854daTFetchVPNInfo.AEQbTJ(), strOLrzqt, hardwareTypeKWHzl.ordinal(), new Function1() { // from class: o.dPJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return dOQ.djBIcL(this.OLrzqt, abstractC12782ctV, abstractActivityC33041mov, (AbstractC12782ctV) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void gHZMYf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit gEmmrt(AbstractActivityC33041mov abstractActivityC33041mov, dOQ doq, java.lang.Integer num) {
        dZK.AEQbTJ.AEQbTJ(abstractActivityC33041mov, new EnterWalletMainBean((java.lang.Boolean) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, false, false, (com.okinc.wallet.api.bean.ScanResult) null, 127, (DefaultConstructorMarker) null));
        doq.EZpvd(abstractActivityC33041mov);
        return Unit.INSTANCE;
    }

    public static final void AxsJAY(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fARcdN(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(dOQ doq, AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov, AbstractC12782ctV abstractC12782ctV2) {
        if (abstractC12782ctV2 != null) {
            doq.KWHzl(abstractC12782ctV, abstractActivityC33041mov);
        } else {
            C55326xho.toast$default(abstractActivityC33041mov.getString(C13754dXa.FragmentManager.OnBackPressedDispatcher2), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit fJNWhG(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void KWHzl(final AbstractC12782ctV abstractC12782ctV, AbstractActivityC33041mov abstractActivityC33041mov) {
        C32866mlf.onEvent$default("Web3WalletManagement_AccountSheet_SmartAccount_Click", (TrackChannel[]) null, new Function1() { // from class: o.dPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return dOQ.copydefault(abstractC12782ctV, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        EZpvd(abstractActivityC33041mov);
    }

    public static final Unit copydefault(AbstractC12782ctV abstractC12782ctV, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.add(new EventParam("wallet_type", fNC.OLrzqt.AEQbTJ(abstractC12782ctV.QwvEab()), true));
        eventParamsList.add(new EventParam("resource", "landing_page", true));
        return Unit.INSTANCE;
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov) {
        abstractActivityC33041mov.finish();
        abstractActivityC33041mov.overridePendingTransition(0, 0);
    }

    @Override // o.AbstractC57329ygP
    public java.util.Set<java.lang.String> getSupportJSMethods() {
        return yEE.AhwBna("createOrSwitchToAAWallet", "web3/wallet/js/createOrSwitchToAAWallet");
    }
}

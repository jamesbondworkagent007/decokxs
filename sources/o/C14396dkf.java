package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import com.google.gson.Gson;
import com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dkf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14396dkf extends C14367dkC {
    public final java.lang.String OLrzqt = "ok_backup_wallet";

    public final void EZpvd(@NotNull FragmentActivity fragmentActivity, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final Function1<? super C9697baV, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(fragmentActivity, new Function1() { // from class: o.dky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.AEQbTJ(this.copydefault, str, str2, str3, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit AEQbTJ(C14396dkf c14396dkf, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, boolean z) {
        if (z) {
            c14396dkf.OLrzqt(str, str2, str3, (Function1<? super C9697baV, Unit>) function1);
        } else {
            function1.invoke(new C9697baV(false, false, null, null, 12, null));
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC12784ctX fIwbmz(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12784ctX) function1.invoke(obj);
    }

    public final void OLrzqt(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final Function1<? super C9697baV, Unit> function1) {
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(str).OLrzqt(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.dkd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.AEQbTJ(str2, str3, this, (AbstractC12784ctX) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.dkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14396dkf.fIwbmz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        C11607cUn.OLrzqt(abstractC58260yxtCopydefault, (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dkw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.copydefault(str, function1, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.EZpvd(this.copydefault, str3, function1, (AbstractC12784ctX) obj);
            }
        });
    }

    public static final AbstractC12784ctX AEQbTJ(java.lang.String str, java.lang.String str2, C14396dkf c14396dkf, AbstractC12784ctX abstractC12784ctX) {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        C11573cTg.saveNewFile$default(C11573cTg.KWHzl, c14396dkf.OLrzqt, "", c14392dkb.KWHzl(c14396dkf.OLrzqt, 1, c14392dkb.copydefault(abstractC12784ctX, str, str2)), false, 8, null);
        return abstractC12784ctX;
    }

    public static final Unit copydefault(java.lang.String str, Function1 function1, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault("handleUploadNewWallet", "Google HDWallet uploadNewWallet error rootWalletId = " + str + " error message : " + th.getMessage());
        java.lang.String message = th.getMessage();
        java.lang.String str2 = message != null ? message : "";
        function1.invoke(new C9697baV(false, true, C11572cTf.copydefault.EZpvd(str2), str2));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C14396dkf c14396dkf, java.lang.String str, final Function1 function1, AbstractC12784ctX abstractC12784ctX) {
        final C9697baV c9697baV = new C9697baV(true, true, null, null, 12, null);
        java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (AbstractC12782ctV abstractC12782ctV : listKWHzl) {
            abstractC12782ctV.OLrzqt(true);
            arrayList.add(abstractC12782ctV.DCUTEIddSDPG());
        }
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C11607cUn.KWHzl(arrayList));
        final Function1 function12 = new Function1() { // from class: o.dkj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.AEQbTJ(function1, c9697baV, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dkm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.AuCTel(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.OLrzqt(function1, c9697baV, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dkq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.fARcdN(function13, obj);
            }
        });
        c14396dkf.AEQbTJ(str);
        return Unit.INSTANCE;
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, C9697baV c9697baV, java.util.List list) {
        function1.invoke(c9697baV);
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, C9697baV c9697baV, java.lang.Throwable th) {
        function1.invoke(c9697baV);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull FragmentActivity fragmentActivity, @NotNull final java.lang.String str, @NotNull final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        copydefault(fragmentActivity, new Function1() { // from class: o.dkl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.copydefault(this.AEQbTJ, str, function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(C14396dkf c14396dkf, java.lang.String str, Function1 function1, boolean z) {
        if (z) {
            c14396dkf.AEQbTJ(str, (Function1<? super java.lang.Boolean, Unit>) function1);
        } else {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC12784ctX gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (AbstractC12784ctX) function1.invoke(obj);
    }

    public final void AEQbTJ(final java.lang.String str, final Function1<? super java.lang.Boolean, Unit> function1) {
        AbstractC58260yxt<AbstractC12784ctX> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).djBIcL(str).OLrzqt(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.dkp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.KWHzl(this.OLrzqt, (AbstractC12784ctX) obj);
            }
        };
        AbstractC58260yxt<R> abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.dkr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14396dkf.gEmmrt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        C11607cUn.OLrzqt(abstractC58260yxtCopydefault, (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.dkn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.copydefault(function1, str, (java.lang.Throwable) obj);
            }
        }, new Function1() { // from class: o.dko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.OLrzqt(function1, (AbstractC12784ctX) obj);
            }
        });
    }

    public static final AbstractC12784ctX KWHzl(C14396dkf c14396dkf, AbstractC12784ctX abstractC12784ctX) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(abstractC12784ctX, "");
        C14392dkb c14392dkb = C14392dkb.AEQbTJ;
        java.util.List<HDWalletCloudBackupBean> listEZpvd = c14392dkb.EZpvd(c14396dkf.OLrzqt, 1, c14392dkb.copydefault(abstractC12784ctX, "", ""));
        if (!listEZpvd.isEmpty()) {
            java.lang.String json = new Gson().toJson(listEZpvd);
            C11573cTg c11573cTg = C11573cTg.KWHzl;
            java.lang.String str = c14396dkf.OLrzqt;
            Intrinsics.copydefault((java.lang.Object) json);
            C11573cTg.saveNewFile$default(c11573cTg, str, "", json, false, 8, null);
        } else {
            C11573cTg.KWHzl.KWHzl(c14396dkf.OLrzqt);
        }
        return abstractC12784ctX;
    }

    public static final Unit copydefault(Function1 function1, java.lang.String str, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        function1.invoke(java.lang.Boolean.FALSE);
        pUU.copydefault("handleDeleteWallet", "Google HDWallet deleteWallet error rootWalletId = " + str + " error message : " + th.getMessage());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final Function1 function1, AbstractC12784ctX abstractC12784ctX) {
        java.util.List<AbstractC12782ctV> listKWHzl = abstractC12784ctX.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        for (AbstractC12782ctV abstractC12782ctV : listKWHzl) {
            abstractC12782ctV.OLrzqt(false);
            arrayList.add(abstractC12782ctV.DCUTEIddSDPG());
        }
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(C11607cUn.KWHzl(arrayList));
        final Function1 function12 = new Function1() { // from class: o.dkG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.AEQbTJ(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dkF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.isConnected(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.dkD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dkE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.DbNXlk(function13, obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.util.List list) {
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final FragmentActivity fragmentActivity, @NotNull final Function1<? super java.util.List<HDWalletCloudBackupBean>, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (fragmentActivity == null) {
            EZpvd(fragmentActivity, function1);
        } else {
            copydefault(fragmentActivity, new Function1() { // from class: o.dkx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14396dkf.OLrzqt(this.copydefault, fragmentActivity, function1, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final Unit OLrzqt(C14396dkf c14396dkf, FragmentActivity fragmentActivity, Function1 function1, boolean z) {
        if (z) {
            c14396dkf.EZpvd(fragmentActivity, (Function1<? super java.util.List<HDWalletCloudBackupBean>, Unit>) function1);
        } else {
            function1.invoke(yDY.AhwBna());
        }
        return Unit.INSTANCE;
    }

    public static final java.util.List values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public final void EZpvd(FragmentActivity fragmentActivity, final Function1<? super java.util.List<HDWalletCloudBackupBean>, Unit> function1) {
        AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(0).OLrzqt(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.dku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtCopydefault = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.dks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C14396dkf.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        AbstractC58260yxt abstractC58260yxtValueOf = C11607cUn.valueOf(abstractC58260yxtCopydefault);
        if (fragmentActivity != null) {
            C58156yvv.AEQbTJ(abstractC58260yxtValueOf, fragmentActivity, Lifecycle.Event.ON_DESTROY);
        }
        final Function1 function13 = new Function1() { // from class: o.dkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.KWHzl(function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.dkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.AkhnZx(function13, obj);
            }
        };
        final Function1 function14 = new Function1() { // from class: o.dkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C14396dkf.OLrzqt(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtValueOf.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.dkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C14396dkf.fetchVPNInfo(function14, obj);
            }
        });
    }

    public static final java.util.List OLrzqt(C14396dkf c14396dkf, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return C14392dkb.AEQbTJ.copydefault(c14396dkf.OLrzqt, 1);
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.util.List list) {
        Intrinsics.copydefault(list);
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        pUU.copydefault("handleQueryWallets", "Google HDWallet queryWallets error. error message : " + th.getMessage());
        function1.invoke(yDY.AhwBna());
        return Unit.INSTANCE;
    }
}

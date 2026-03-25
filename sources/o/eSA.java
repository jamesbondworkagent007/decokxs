package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.mpc.MpcShare2Status;
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import com.okinc.business.defi.biz.net.bean.AccountStatus;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusRequestBody;
import com.okinc.business.defi.biz.net.bean.CheckMpcStatusResponse;
import com.okinc.business.defi.biz.net.bean.MpcStatus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eSA {
    public final C13934dbu EZpvd = new C13934dbu();

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eSA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshAllMpcWallet$default(eSA esa, LifecycleOwner lifecycleOwner, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        esa.KWHzl(lifecycleOwner, (Function1<? super java.lang.Boolean, Unit>) function1);
    }

    public final void KWHzl(@NotNull final LifecycleOwner lifecycleOwner, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        AbstractC58260yxt abstractC58260yxtKWHzl = C58156yvv.KWHzl(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(WalletType.MPCWallet), lifecycleOwner);
        final Function1 function12 = new Function1() { // from class: o.eSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eSA.EZpvd(this.OLrzqt, lifecycleOwner, function1, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eSA.DbNXlk(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.eSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eSA.AhwBna(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eSN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eSA.fetchVPNInfo(function13, obj);
            }
        });
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final eSA esa, LifecycleOwner lifecycleOwner, final Function1 function1, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            final java.util.HashMap map = new java.util.HashMap();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) it.next();
                if (abstractC12784ctX.isConnected() != null) {
                    MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
                    Intrinsics.copydefault(mpcWalletEncodeInfoIsConnected);
                    arrayList.add(new CheckMpcStatusRequestBody(mpcWalletEncodeInfoIsConnected.getMpcId()));
                    MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctX.isConnected();
                    Intrinsics.copydefault(mpcWalletEncodeInfoIsConnected2);
                    map.put(mpcWalletEncodeInfoIsConnected2.getMpcId(), abstractC12784ctX);
                }
            }
            C13934dbu c13934dbu = esa.EZpvd;
            Intrinsics.copydefault(list);
            java.lang.String strUSBtdM = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AubY(((AbstractC12784ctX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl())).USBtdM();
            java.lang.String strDbNXlk = ((AbstractC12782ctV) CollectionsKt___CollectionsKt.AubY(((AbstractC12784ctX) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).KWHzl())).DbNXlk();
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (hashSet.add(((CheckMpcStatusRequestBody) obj).getMpcId())) {
                    arrayList2.add(obj);
                }
            }
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(c13934dbu.EZpvd(strUSBtdM, strDbNXlk, arrayList2), lifecycleOwner), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function12 = new Function1() { // from class: o.eSC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eSA.copydefault(function1, map, esa, (java.util.List) obj2);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eSD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    eSA.isConnected(function12, obj2);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eSM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eSA.copydefault(function1, (java.lang.Throwable) obj2);
                }
            };
            abstractC58185ywXUnwrapResponseData$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eSK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj2) {
                    eSA.AkhnZx(function13, obj2);
                }
            });
        } else if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(final Function1 function1, java.util.HashMap map, eSA esa, java.util.List list) {
        java.util.ArrayList<AbstractC58260yxt<java.lang.Integer>> arrayList = new java.util.ArrayList<>();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) it.next();
            AbstractC12784ctX abstractC12784ctX = (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId());
            if (abstractC12784ctX != null) {
                C15691eRs.AEQbTJ.KWHzl().put(abstractC12784ctX.EZpvd(), checkMpcStatusResponse);
            }
            int mpcStatus = checkMpcStatusResponse.getMpcStatus();
            if (mpcStatus == MpcStatus.Escape.getValue()) {
                AbstractC12784ctX abstractC12784ctX2 = (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId());
                if (abstractC12784ctX2 != null) {
                    esa.AEQbTJ(abstractC12784ctX2, arrayList);
                }
            } else if (mpcStatus == MpcStatus.Refreshed.getValue() || mpcStatus == MpcStatus.BackupedFail.getValue()) {
                AbstractC12784ctX abstractC12784ctX3 = (AbstractC12784ctX) map.get(checkMpcStatusResponse.getMpcId());
                if (abstractC12784ctX3 != null) {
                    esa.OLrzqt(abstractC12784ctX3, arrayList);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC58260yxt abstractC58260yxtKWHzl = C11607cUn.KWHzl(arrayList);
            final Function1 function12 = new Function1() { // from class: o.eSS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eSA.copydefault(function1, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eSB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eSA.gEmmrt(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eSH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eSA.OLrzqt(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eSI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eSA.AhwBna(function13, obj);
                }
            });
        } else if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.util.List list) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, java.lang.Throwable th) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.lang.Throwable th) {
        C43296rmc.AEQbTJ("fcj", "error happen " + th);
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AhwBna(Function1 function1, java.lang.Throwable th) {
        C43296rmc.AEQbTJ("fcj", "error happen " + th);
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(AbstractC12784ctX abstractC12784ctX, java.util.ArrayList<AbstractC58260yxt<java.lang.Integer>> arrayList) {
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        if (mpcWalletEncodeInfoIsConnected != null) {
            mpcWalletEncodeInfoIsConnected.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl());
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctX.isConnected();
        arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, mpcWalletEncodeInfoIsConnected2 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoIsConnected2.getStatus()) : null, null, null, null, null, null, 125, null));
    }

    public final void AEQbTJ(AbstractC12784ctX abstractC12784ctX, java.util.ArrayList<AbstractC58260yxt<java.lang.Integer>> arrayList) {
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected = abstractC12784ctX.isConnected();
        if (mpcWalletEncodeInfoIsConnected != null) {
            mpcWalletEncodeInfoIsConnected.setEscape(1);
        }
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected2 = abstractC12784ctX.isConnected();
        if (mpcWalletEncodeInfoIsConnected2 != null) {
            mpcWalletEncodeInfoIsConnected2.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(abstractC12784ctX.KWHzl());
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected3 = abstractC12784ctX.isConnected();
        java.lang.Integer numValueOf = mpcWalletEncodeInfoIsConnected3 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoIsConnected3.getStatus()) : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoIsConnected4 = abstractC12784ctX.isConnected();
        arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, numValueOf, null, null, mpcWalletEncodeInfoIsConnected4 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoIsConnected4.isEscape()) : null, null, null, 109, null));
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> AEQbTJ(@NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull FragmentActivity fragmentActivity) {
        final MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP;
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        if ((abstractC12782ctV.ORxRYg() || abstractC12782ctV.AEQbTJ(WalletType.MPCWallet)) && (mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP()) != null) {
            AbstractC58185ywX abstractC58185ywXUnwrapResponseData$default = C43423rox.unwrapResponseData$default(C58156yvv.EZpvd(this.EZpvd.EZpvd(abstractC12782ctV.USBtdM(), abstractC12782ctV.DbNXlk(), C56402yEa.EZpvd(new CheckMpcStatusRequestBody(mpcWalletEncodeInfoQSBOWP.getMpcId()))), fragmentActivity), (Function1) null, 1, (java.lang.Object) null);
            final Function1 function1 = new Function1() { // from class: o.eSP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eSA.AEQbTJ(abstractC12782ctV, this, mpcWalletEncodeInfoQSBOWP, (java.util.List) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXKWHzl = abstractC58185ywXUnwrapResponseData$default.KWHzl(new InterfaceC58229yxO() { // from class: o.eST
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return eSA.values(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
            return C33527myD.KWHzl(abstractC58185ywXKWHzl);
        }
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(2, -1));
        Intrinsics.copydefault(abstractC58185ywXKWHzl2);
        return abstractC58185ywXKWHzl2;
    }

    public static final InterfaceC60096zvd values(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd AEQbTJ(AbstractC12782ctV abstractC12782ctV, eSA esa, MpcWalletEncodeInfo mpcWalletEncodeInfo, java.util.List list) {
        java.lang.String strEZpvd;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(list, "");
        CheckMpcStatusResponse checkMpcStatusResponse = (CheckMpcStatusResponse) CollectionsKt___CollectionsKt.firstOrNull(list);
        if (checkMpcStatusResponse == null) {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(2, -1));
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        java.util.HashMap<java.lang.String, CheckMpcStatusResponse> mapKWHzl = C15691eRs.AEQbTJ.KWHzl();
        AbstractC12784ctX abstractC12784ctXGwTjWJ = abstractC12782ctV.gwTjWJ();
        if (abstractC12784ctXGwTjWJ != null && (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) != null) {
            str = strEZpvd;
        }
        mapKWHzl.put(str, checkMpcStatusResponse);
        boolean zOLrzqt = esa.OLrzqt(mpcWalletEncodeInfo, dZP.OLrzqt.EZpvd(), abstractC12782ctV);
        int mpcStatus = checkMpcStatusResponse.getMpcStatus();
        if (mpcStatus == MpcStatus.Init.getValue() || mpcStatus == MpcStatus.WalletCreated.getValue() || mpcStatus == MpcStatus.Backuped.getValue()) {
            if (zOLrzqt) {
                AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, null, null, null, null, null, null, 127, null).bO_();
            }
            return esa.OLrzqt(checkMpcStatusResponse);
        }
        MpcStatus mpcStatus2 = MpcStatus.Escape;
        if (mpcStatus == mpcStatus2.getValue()) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP != null) {
                mpcWalletEncodeInfoQSBOWP.setEscape(1);
            }
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP2 != null) {
                mpcWalletEncodeInfoQSBOWP2.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
            }
            esa.copydefault(abstractC12782ctV);
            AbstractC58185ywX abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(0, java.lang.Integer.valueOf(mpcStatus2.getValue())));
            Intrinsics.copydefault(abstractC58185ywXKWHzl2);
            return abstractC58185ywXKWHzl2;
        }
        if (mpcStatus == MpcStatus.Refreshed.getValue()) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP3 != null) {
                mpcWalletEncodeInfoQSBOWP3.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
            }
            esa.copydefault(abstractC12782ctV);
            AbstractC58185ywX abstractC58185ywXKWHzl3 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(0, java.lang.Integer.valueOf(checkMpcStatusResponse.getMpcStatus())));
            Intrinsics.copydefault(abstractC58185ywXKWHzl3);
            return abstractC58185ywXKWHzl3;
        }
        if (mpcStatus == MpcStatus.BackupedFail.getValue()) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
            if (mpcWalletEncodeInfoQSBOWP4 != null) {
                mpcWalletEncodeInfoQSBOWP4.setStatus(MpcShare2Status.SHARE2_INVALID.getValue());
            }
            esa.copydefault(abstractC12782ctV);
            AbstractC58185ywX abstractC58185ywXKWHzl4 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(0, java.lang.Integer.valueOf(checkMpcStatusResponse.getMpcStatus())));
            Intrinsics.copydefault(abstractC58185ywXKWHzl4);
            return abstractC58185ywXKWHzl4;
        }
        AbstractC58185ywX abstractC58185ywXKWHzl5 = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(2, -1));
        Intrinsics.copydefault(abstractC58185ywXKWHzl5);
        return abstractC58185ywXKWHzl5;
    }

    public final boolean OLrzqt(MpcWalletEncodeInfo mpcWalletEncodeInfo, java.lang.String str, AbstractC12782ctV abstractC12782ctV) {
        boolean z = false;
        if (!Intrinsics.EZpvd((java.lang.Object) mpcWalletEncodeInfo.getUid(), (java.lang.Object) str)) {
            return false;
        }
        if (mpcWalletEncodeInfo.getDisplayAccountName().length() == 0 && !abstractC12782ctV.OuxcSI()) {
            mpcWalletEncodeInfo.setDisplayAccountName(abstractC12782ctV.AkhnZx());
            abstractC12782ctV.fARcdN(OLrzqt(abstractC12782ctV.QwvEab()));
            abstractC12782ctV.gEmmrt(true);
            z = true;
        }
        if (mpcWalletEncodeInfo.getDisplayAccountName().length() != 0) {
            java.lang.String accountName = mpcWalletEncodeInfo.getAccountName();
            dZP dzp = dZP.OLrzqt;
            if (Intrinsics.EZpvd((java.lang.Object) accountName, (java.lang.Object) dzp.OLrzqt()) && Intrinsics.EZpvd((java.lang.Object) mpcWalletEncodeInfo.getDisplayAccountName(), (java.lang.Object) dzp.AhwBna())) {
                return z;
            }
        }
        dZP dzp2 = dZP.OLrzqt;
        mpcWalletEncodeInfo.setAccountName(dzp2.OLrzqt());
        mpcWalletEncodeInfo.setDisplayAccountName(dzp2.AhwBna());
        return true;
    }

    public final void copydefault(final AbstractC12782ctV abstractC12782ctV) {
        C10854bwM c10854bwMIsConnected = C10954byG.EZpvd.valueOf().isConnected();
        AbstractC58260yxt<java.util.List<AbstractC12782ctV>> abstractC58260yxtKWHzl = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).KWHzl(abstractC12782ctV.EZpvd(c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : -1L), abstractC12782ctV.QwvEab());
        final Function1 function1 = new Function1() { // from class: o.eSL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eSA.OLrzqt(abstractC12782ctV, (java.util.List) obj);
            }
        };
        abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.eSR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eSA.AuCTel(function1, obj);
            }
        }).bO_();
    }

    public static final InterfaceC58261yxu AuCTel(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, null, null, null, null, null, null, 127, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC58260yxt abstractC58260yxtUpdateMpcWalletInfo$default = AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV, null, null, null, null, null, null, null, 127, null);
        AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) CollectionsKt___CollectionsKt.AuCTelauCTel(list);
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP = abstractC12782ctV2.QSBOWP();
        java.lang.String mpcId = mpcWalletEncodeInfoQSBOWP != null ? mpcWalletEncodeInfoQSBOWP.getMpcId() : null;
        MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP2 = abstractC12782ctV.QSBOWP();
        if (Intrinsics.EZpvd((java.lang.Object) mpcId, (java.lang.Object) (mpcWalletEncodeInfoQSBOWP2 != null ? mpcWalletEncodeInfoQSBOWP2.getMpcId() : null))) {
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP3 = abstractC12782ctV.QSBOWP();
            java.lang.Integer numValueOf = mpcWalletEncodeInfoQSBOWP3 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP3.getStatus()) : null;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP4 = abstractC12782ctV.QSBOWP();
            java.lang.Integer numValueOf2 = mpcWalletEncodeInfoQSBOWP4 != null ? java.lang.Integer.valueOf(mpcWalletEncodeInfoQSBOWP4.isEscape()) : null;
            MpcWalletEncodeInfo mpcWalletEncodeInfoQSBOWP5 = abstractC12782ctV.QSBOWP();
            arrayList.add(AbstractC12782ctV.updateMpcWalletInfo$default(abstractC12782ctV2, null, numValueOf, null, mpcWalletEncodeInfoQSBOWP5 != null ? mpcWalletEncodeInfoQSBOWP5.getDisplayAccountName() : null, numValueOf2, null, null, 101, null));
        }
        arrayList.add(abstractC58260yxtUpdateMpcWalletInfo$default);
        return C11607cUn.KWHzl(arrayList);
    }

    public static final Unit copydefault(int i, android.view.View view, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(viewOnClickListenerC54939xaY, "");
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.eSA */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void judgyDialog$default(eSA esa, int i, int i2, AbstractC12782ctV abstractC12782ctV, FragmentActivity fragmentActivity, int i3, yHO yho, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        int i5 = i3;
        if ((i4 & 32) != 0) {
            yho = new yHO() { // from class: o.eSQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return eSA.copydefault(((java.lang.Integer) obj2).intValue(), (android.view.View) obj3, (ViewOnClickListenerC54939xaY) obj4);
                }
            };
        }
        esa.KWHzl(i, i2, abstractC12782ctV, fragmentActivity, i5, yho);
    }

    public final void KWHzl(final int i, final int i2, @NotNull final AbstractC12782ctV abstractC12782ctV, @NotNull final FragmentActivity fragmentActivity, final int i3, @NotNull final yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(yho, "");
        fragmentActivity.runOnUiThread(new java.lang.Runnable() { // from class: o.eSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eSA.EZpvd(i, i2, this, fragmentActivity, i3, yho, abstractC12782ctV);
            }
        });
    }

    public static final void EZpvd(int i, int i2, eSA esa, FragmentActivity fragmentActivity, int i3, yHO yho, AbstractC12782ctV abstractC12782ctV) {
        if (i == 0) {
            if (i2 == MpcStatus.Escape.getValue()) {
                esa.AEQbTJ(fragmentActivity, i3, yho);
                return;
            } else if (i2 == MpcStatus.Refreshed.getValue()) {
                esa.KWHzl(fragmentActivity, abstractC12782ctV, i3, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
                return;
            } else {
                if (i2 == MpcStatus.BackupedFail.getValue()) {
                    esa.KWHzl(fragmentActivity, abstractC12782ctV, i3, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
                    return;
                }
                return;
            }
        }
        if (i2 != AccountStatus.Normal.getValue()) {
            if (i2 == AccountStatus.Delete.getValue()) {
                esa.EZpvd(fragmentActivity, i3, yho);
            } else if (i2 == AccountStatus.Frozen.getValue()) {
                esa.OLrzqt(fragmentActivity, i3, (yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit>) yho);
            }
        }
    }

    public final java.lang.String OLrzqt(WalletType walletType) {
        if (walletType == WalletType.AAWallet) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.RgaQzq) + " " + dZP.OLrzqt.djBIcL();
        }
        return dZP.OLrzqt.djBIcL();
    }

    public final AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> OLrzqt(CheckMpcStatusResponse checkMpcStatusResponse) {
        AbstractC58185ywX<kotlin.Pair<java.lang.Integer, java.lang.Integer>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(C56390yDp.OLrzqt(1, java.lang.Integer.valueOf(checkMpcStatusResponse.getAccountStatus())));
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public final void KWHzl(android.content.Context context, AbstractC12782ctV abstractC12782ctV, int i, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        eRI.OLrzqt.OLrzqt(context, abstractC12782ctV, i, yho);
    }

    public final void EZpvd(android.content.Context context, int i, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        eRI.OLrzqt.OLrzqt(context, i, yho);
    }

    public final void OLrzqt(android.content.Context context, int i, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        eRI.OLrzqt.AEQbTJ(context, i, yho);
    }

    public final void AEQbTJ(android.content.Context context, int i, yHO<? super java.lang.Integer, ? super android.view.View, ? super ViewOnClickListenerC54939xaY, Unit> yho) {
        eRI.OLrzqt.EZpvd(context, i, yho);
    }
}

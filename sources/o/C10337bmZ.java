package o;

import com.okinc.business.defi.biz.core.error.FingerprintLog;
import com.okinc.business.defi.biz.core.wallet.update.WalletUpdateWorker;
import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.mln.service.UDWalletCore;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C10822bvh;
import o.C12827cuN;
import o.C13062cyk;
import o.C15935eaT;
import o.C16058eck;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10337bmZ implements InterfaceC9739bbK {
    public static final C10337bmZ KWHzl = new C10337bmZ();
    public static final java.lang.String AEQbTJ = UDWalletCore.LUA_CLASS_NAME;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean OLrzqt(java.lang.Boolean bool, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.util.List OLrzqt(java.util.List list, java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(num, "");
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.Boolean copydefault(java.lang.Boolean bool, java.lang.Boolean bool2) {
        Intrinsics.checkNotNullParameter(bool, "");
        Intrinsics.checkNotNullParameter(bool2, "");
        return bool;
    }

    private C10337bmZ() {
    }

    public static final java.lang.Boolean KWHzl(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (java.lang.Boolean) function2.invoke(obj, obj2);
    }

    @Override // o.InterfaceC9739bbK
    public AbstractC58185ywX<java.lang.Boolean> AEQbTJ(final boolean z) {
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXDjBIcL = C10954byG.EZpvd.djBIcL();
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXOLrzqt = C10598brV.AEQbTJ.OLrzqt(true);
        final Function2 function2 = new Function2() { // from class: o.bmW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C10337bmZ.copydefault((java.lang.Boolean) obj, (java.lang.Boolean) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXEZpvd = AbstractC58185ywX.EZpvd(abstractC58185ywXDjBIcL, abstractC58185ywXOLrzqt, new InterfaceC58223yxI() { // from class: o.bmY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return C10337bmZ.KWHzl(function2, obj, obj2);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.bnc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10337bmZ.OLrzqt(z, (java.lang.Boolean) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXKWHzl = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.bne
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10337bmZ.gEmmrt(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final InterfaceC60096zvd gEmmrt(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.cyk.Application.getInstance$default(o.cyk$Application, android.content.Context, int, java.lang.Object):o.cyk */
    public static final InterfaceC60096zvd OLrzqt(boolean z, final java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(bool, "");
        if (z || !bool.booleanValue()) {
            return AbstractC58185ywX.KWHzl(bool);
        }
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXOLrzqt = C13062cyk.Application.getInstance$default(C13062cyk.Companion, null, 1, null).OLrzqt(false, true, "ensureInitialized", C13062cyk.LoaderManager.TaskDescription.OLrzqt);
        final Function1 function1 = new Function1() { // from class: o.bnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10337bmZ.OLrzqt(bool, (java.lang.Integer) obj);
            }
        };
        return abstractC58185ywXOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bng
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10337bmZ.valueOf(function1, obj);
            }
        });
    }

    public static final java.lang.Boolean valueOf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    @Override // o.InterfaceC9739bbK
    public boolean AEQbTJ(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(j);
        if (c10854bwMOLrzqt == null) {
            return false;
        }
        return new C13847daM(c10854bwMOLrzqt.fetchVPNInfo()).OLrzqt(str);
    }

    @Override // o.InterfaceC9739bbK
    public java.lang.String OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        C10854bwM c10854bwMOLrzqt = C10954byG.EZpvd.valueOf().copydefault(j);
        return xYW.AEQbTJ.OLrzqt(str, C11600cUg.copydefault(c10854bwMOLrzqt != null ? java.lang.Long.valueOf(c10854bwMOLrzqt.QKVWgx()) : null));
    }

    @Override // o.InterfaceC9739bbK
    public java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYW.AEQbTJ.AhwBna(str);
    }

    public final AbstractC58177ywP OLrzqt() {
        final WalletDatabase walletDatabaseOLrzqt = WalletDatabase.Companion.OLrzqt(C9678baC.Companion.AEQbTJ());
        AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 6, null);
        final Function1 function1 = new Function1() { // from class: o.bnj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10337bmZ.copydefault((java.util.List) obj);
            }
        };
        AbstractC58260yxt abstractC58260yxtOLrzqt = abstractC58260yxtFetchAllWallets$default.OLrzqt(new InterfaceC58229yxO() { // from class: o.bna
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10337bmZ.AYXKKw(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.bmX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10337bmZ.EZpvd(walletDatabaseOLrzqt, (java.util.List) obj);
            }
        };
        AbstractC58177ywP abstractC58177ywPEZpvd = abstractC58260yxtOLrzqt.AEQbTJ(new InterfaceC58229yxO() { // from class: o.bnd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C10337bmZ.AhwBna(function12, obj);
            }
        }).EZpvd(new InterfaceC58222yxH() { // from class: o.bnf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C10337bmZ.EZpvd();
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPEZpvd, "");
        return C11607cUn.AEQbTJ(abstractC58177ywPEZpvd);
    }

    public static final InterfaceC58261yxu AYXKKw(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(final java.util.List list) {
        java.lang.String strEZpvd;
        Intrinsics.checkNotNullParameter(list, "");
        C12827cuN instance$default = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            AbstractC12784ctX abstractC12784ctXGwTjWJ = ((AbstractC12782ctV) obj).gwTjWJ();
            if (abstractC12784ctXGwTjWJ == null || (strEZpvd = abstractC12784ctXGwTjWJ.EZpvd()) == null) {
                strEZpvd = "";
            }
            java.lang.Object arrayList = linkedHashMap.get(strEZpvd);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(strEZpvd, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtZLjUOn = instance$default.zLjUOn(CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.keySet()));
        final Function1 function1 = new Function1() { // from class: o.bni
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C10337bmZ.OLrzqt(list, (java.lang.Integer) obj2);
            }
        };
        return abstractC58260yxtZLjUOn.copydefault(new InterfaceC58229yxO() { // from class: o.bnh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj2) {
                return C10337bmZ.djBIcL(function1, obj2);
            }
        });
    }

    public static final java.util.List djBIcL(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final InterfaceC58180ywS AhwBna(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58180ywS) function1.invoke(obj);
    }

    public static final InterfaceC58180ywS EZpvd(final WalletDatabase walletDatabase, final java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58177ywP abstractC58177ywPKWHzl = AbstractC58177ywP.KWHzl(new InterfaceC58222yxH() { // from class: o.bnk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58222yxH
            public final void run() {
                C10337bmZ.AEQbTJ(walletDatabase, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58177ywPKWHzl, "");
        return C11607cUn.AEQbTJ(abstractC58177ywPKWHzl);
    }

    public static final void AEQbTJ(WalletDatabase walletDatabase, java.util.List list) {
        C10856bwO.EZpvd(AEQbTJ, new FingerprintLog("clearAllTables"));
        walletDatabase.clearAllTables();
        C10337bmZ c10337bmZ = KWHzl;
        Intrinsics.copydefault(list);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC12782ctV) it.next()).DbNXlk());
        }
        c10337bmZ.AEQbTJ(arrayList);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bvh.StateListAnimator.getInstance$default(o.bvh$StateListAnimator, android.content.Context, int, java.lang.Object):o.bvh */
    /* JADX DEBUG: Class process forced to load method for inline: o.eaT.ActionBar.getInstance$default(o.eaT$ActionBar, android.content.Context, int, java.lang.Object):o.eaT */
    public static final void EZpvd() {
        C8342bAs.Companion.EZpvd().EZpvd();
        C13912dbY.copydefault.copydefault(true);
        WalletUpdateWorker.Application.getInstance$default(WalletUpdateWorker.Companion, null, 1, null).OLrzqt();
        KWHzl.copydefault();
        C10598brV.AEQbTJ.fJNWhG();
        C10822bvh.StateListAnimator.getInstance$default(C10822bvh.Companion, null, 1, null).OLrzqt();
        C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).isConnected();
        C15689eRq.KWHzl.EZpvd();
        C11205cFp.EZpvd.OLrzqt(yDY.AhwBna());
        RxBus.AEQbTJ(new C9915beb());
        C13992dcz.AEQbTJ.KWHzl();
        WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).OLrzqt();
        C16058eck.removeDAppSessions$default(C16058eck.Activity.getInstance$default(C16058eck.Companion, null, 1, null), null, 1, null);
        C15935eaT.removeDAppSessions$default(C15935eaT.ActionBar.getInstance$default(C15935eaT.Companion, null, 1, null), null, 1, null);
        C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).AhwBna();
        C17948fYf.copydefault.OLrzqt(true);
    }

    public final void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        try {
            java.util.List<InterfaceC9776bbv> listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9776bbv.class));
            if (listKWHzl != null) {
                for (InterfaceC9776bbv interfaceC9776bbv : listKWHzl) {
                    pUU.copydefault("WalletCoreDelete", "delete allWallet WalletDeletionNotifierExtension = " + list.size());
                    interfaceC9776bbv.AEQbTJ(list);
                }
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("WalletCoreDelete", "error message = " + e.getMessage());
        }
    }

    public final void copydefault() {
        boolean zCopydefault = mNP.AEQbTJ.copydefault();
        pUU.KWHzl(AEQbTJ, "EnvironmentUtil.isE2EEnv() = " + zCopydefault);
        if (zCopydefault) {
            return;
        }
        C10954byG.EZpvd.DbNXlk();
    }
}

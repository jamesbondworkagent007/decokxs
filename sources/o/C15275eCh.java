package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.net.bean.EIP7702ChainStatusResp;
import com.okinc.business.defi.biz.net.bean.EIP7702WalletStatusResp;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.eip7702.data.repository.EIP7702Repository$fetchAndSaveWalletStatus$1;
import com.okinc.business.defi.wallet.eip7702.data.repository.EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1;
import com.okinc.business.defi.wallet.eip7702.data.repository.EIP7702Repository$getChainStatus$1;
import com.okinc.business.defi.wallet.eip7702.data.repository.EIP7702Repository$getWalletChainEIP7702Status$1;
import com.okinc.business.defi.wallet.eip7702.data.repository.EIP7702Repository$getWalletEIP7702Status$1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eCh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15275eCh {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final C10948byA AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final cPS OLrzqt;
    public final C13934dbu copydefault;

    /* JADX INFO: renamed from: o.eCh$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[EIP7702WalletStatus.values().length];
            try {
                iArr[EIP7702WalletStatus.UpgradedOKX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[EIP7702WalletStatus.UpgradedNonOKX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    public C15275eCh(@NotNull C13934dbu c13934dbu, @NotNull cPS cps, @NotNull C10948byA c10948byA, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(cps, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c13934dbu;
        this.OLrzqt = cps;
        this.AEQbTJ = c10948byA;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.eCh$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eCh.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C15275eCh getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.copydefault(context);
        }

        public final C15275eCh copydefault(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AhwBna();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106 A[Catch: all -> 0x012d, CancellationException -> 0x0139, LOOP:0: B:47:0x0100->B:49:0x0106, LOOP_END, TryCatch #2 {CancellationException -> 0x0139, all -> 0x012d, blocks: (B:14:0x0032, B:46:0x00e7, B:47:0x0100, B:49:0x0106, B:51:0x0128, B:19:0x0047, B:42:0x00d6, B:22:0x005b, B:33:0x00b8, B:35:0x00c0, B:37:0x00c7, B:25:0x0066, B:26:0x008b, B:28:0x0091, B:29:0x00a3), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, EIP7702WalletStatusResp>>> continuation) throws java.lang.Throwable {
        EIP7702Repository$getWalletEIP7702Status$1 eIP7702Repository$getWalletEIP7702Status$1;
        java.util.List<java.lang.String> list2;
        boolean z2;
        java.lang.Object objOLrzqt;
        C15275eCh c15275eCh;
        java.util.List<java.lang.String> list3;
        java.util.Map mapKWHzl;
        C15275eCh c15275eCh2;
        if (continuation instanceof EIP7702Repository$getWalletEIP7702Status$1) {
            eIP7702Repository$getWalletEIP7702Status$1 = (EIP7702Repository$getWalletEIP7702Status$1) continuation;
            int i = eIP7702Repository$getWalletEIP7702Status$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eIP7702Repository$getWalletEIP7702Status$1.label = i - Integer.MIN_VALUE;
            } else {
                eIP7702Repository$getWalletEIP7702Status$1 = new EIP7702Repository$getWalletEIP7702Status$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = eIP7702Repository$getWalletEIP7702Status$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = eIP7702Repository$getWalletEIP7702Status$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                Result.Application application = Result.Companion;
                cPS cps = this.OLrzqt;
                int iOrdinal = WalletType.HDWallet.ordinal();
                int iOrdinal2 = WalletType.KeyWallet.ordinal();
                java.util.List<C10854bwM> listDbNXlk = this.AEQbTJ.DbNXlk();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
                java.util.Iterator<T> it = listDbNXlk.iterator();
                while (it.hasNext()) {
                    arrayList.add(C56443yFo.KWHzl(((C10854bwM) it.next()).AEQbTJ()));
                }
                eIP7702Repository$getWalletEIP7702Status$1.L$0 = this;
                list2 = list;
                eIP7702Repository$getWalletEIP7702Status$1.L$1 = list2;
                z2 = z;
                eIP7702Repository$getWalletEIP7702Status$1.Z$0 = z2;
                eIP7702Repository$getWalletEIP7702Status$1.label = 1;
                objOLrzqt = cps.OLrzqt(list, iOrdinal, iOrdinal2, arrayList, eIP7702Repository$getWalletEIP7702Status$1);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                c15275eCh = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c15275eCh2 = (C15275eCh) eIP7702Repository$getWalletEIP7702Status$1.L$0;
                        C56391yDq.AEQbTJ(objCopydefault);
                        java.util.Map map = (java.util.Map) objCopydefault;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                        for (java.lang.Object obj : map.entrySet()) {
                            java.lang.Object key = ((Map.Entry) obj).getKey();
                            Map.Entry entry = (Map.Entry) obj;
                            linkedHashMap.put(key, c15275eCh2.KWHzl((java.lang.String) entry.getKey(), (java.util.List) entry.getValue()));
                        }
                        mapKWHzl = linkedHashMap;
                        return Result.m7377constructorimpl(mapKWHzl);
                    }
                    list3 = (java.util.List) eIP7702Repository$getWalletEIP7702Status$1.L$1;
                    c15275eCh = (C15275eCh) eIP7702Repository$getWalletEIP7702Status$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    ((Result) objCopydefault).m7386unboximpl();
                    list2 = list3;
                    cPS cps2 = c15275eCh.OLrzqt;
                    eIP7702Repository$getWalletEIP7702Status$1.L$0 = c15275eCh;
                    eIP7702Repository$getWalletEIP7702Status$1.L$1 = null;
                    eIP7702Repository$getWalletEIP7702Status$1.label = 3;
                    objCopydefault = cps2.copydefault(list2, eIP7702Repository$getWalletEIP7702Status$1);
                    if (objCopydefault != objCopydefault2) {
                        return objCopydefault2;
                    }
                    c15275eCh2 = c15275eCh;
                    java.util.Map map2 = (java.util.Map) objCopydefault;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(map2.size()));
                    while (r0.hasNext()) {
                    }
                    mapKWHzl = linkedHashMap2;
                    return Result.m7377constructorimpl(mapKWHzl);
                }
                boolean z3 = eIP7702Repository$getWalletEIP7702Status$1.Z$0;
                java.util.List<java.lang.String> list4 = (java.util.List) eIP7702Repository$getWalletEIP7702Status$1.L$1;
                C15275eCh c15275eCh3 = (C15275eCh) eIP7702Repository$getWalletEIP7702Status$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
                z2 = z3;
                objOLrzqt = objCopydefault;
                list2 = list4;
                c15275eCh = c15275eCh3;
            }
            if (((java.util.List) objOLrzqt).isEmpty()) {
                mapKWHzl = C56424yEw.KWHzl();
                return Result.m7377constructorimpl(mapKWHzl);
            }
            if (z2) {
                eIP7702Repository$getWalletEIP7702Status$1.L$0 = c15275eCh;
                eIP7702Repository$getWalletEIP7702Status$1.L$1 = list2;
                eIP7702Repository$getWalletEIP7702Status$1.label = 2;
                if (c15275eCh.copydefault(list2, eIP7702Repository$getWalletEIP7702Status$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                list3 = list2;
                list2 = list3;
            }
            cPS cps22 = c15275eCh.OLrzqt;
            eIP7702Repository$getWalletEIP7702Status$1.L$0 = c15275eCh;
            eIP7702Repository$getWalletEIP7702Status$1.L$1 = null;
            eIP7702Repository$getWalletEIP7702Status$1.label = 3;
            objCopydefault = cps22.copydefault(list2, eIP7702Repository$getWalletEIP7702Status$1);
            if (objCopydefault != objCopydefault2) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<? extends EIP7702WalletStatus>> continuation) throws java.lang.Throwable {
        EIP7702Repository$getWalletChainEIP7702Status$1 eIP7702Repository$getWalletChainEIP7702Status$1;
        EIP7702WalletStatus.Application application;
        if (continuation instanceof EIP7702Repository$getWalletChainEIP7702Status$1) {
            eIP7702Repository$getWalletChainEIP7702Status$1 = (EIP7702Repository$getWalletChainEIP7702Status$1) continuation;
            int i = eIP7702Repository$getWalletChainEIP7702Status$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eIP7702Repository$getWalletChainEIP7702Status$1.label = i - Integer.MIN_VALUE;
            } else {
                eIP7702Repository$getWalletChainEIP7702Status$1 = new EIP7702Repository$getWalletChainEIP7702Status$1(this, continuation);
            }
        }
        java.lang.Object obj = eIP7702Repository$getWalletChainEIP7702Status$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eIP7702Repository$getWalletChainEIP7702Status$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application2 = Result.Companion;
                EIP7702WalletStatus.Application application3 = EIP7702WalletStatus.Companion;
                cPS cps = this.OLrzqt;
                eIP7702Repository$getWalletChainEIP7702Status$1.L$0 = application3;
                eIP7702Repository$getWalletChainEIP7702Status$1.label = 1;
                java.lang.Object objEZpvd = cps.EZpvd(str, j, eIP7702Repository$getWalletChainEIP7702Status$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                obj = objEZpvd;
                application = application3;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                application = (EIP7702WalletStatus.Application) eIP7702Repository$getWalletChainEIP7702Status$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            C11449cOr c11449cOr = (C11449cOr) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) obj);
            return Result.m7377constructorimpl(application.KWHzl(c11449cOr != null ? C56443yFo.AEQbTJ(c11449cOr.OLrzqt()) : null));
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application4 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<java.lang.String> list, Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        EIP7702Repository$fetchAndSaveWalletStatus$1 eIP7702Repository$fetchAndSaveWalletStatus$1;
        C15275eCh c15275eCh;
        java.util.List<EIP7702WalletStatusResp> list2;
        if (continuation instanceof EIP7702Repository$fetchAndSaveWalletStatus$1) {
            eIP7702Repository$fetchAndSaveWalletStatus$1 = (EIP7702Repository$fetchAndSaveWalletStatus$1) continuation;
            int i = eIP7702Repository$fetchAndSaveWalletStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eIP7702Repository$fetchAndSaveWalletStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                eIP7702Repository$fetchAndSaveWalletStatus$1 = new EIP7702Repository$fetchAndSaveWalletStatus$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = eIP7702Repository$fetchAndSaveWalletStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eIP7702Repository$fetchAndSaveWalletStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                if (list.size() <= 50) {
                    C13934dbu c13934dbu = this.copydefault;
                    eIP7702Repository$fetchAndSaveWalletStatus$1.L$0 = this;
                    eIP7702Repository$fetchAndSaveWalletStatus$1.label = 1;
                    objWithContext = c13934dbu.EZpvd(list, eIP7702Repository$fetchAndSaveWalletStatus$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    c15275eCh = this;
                    list2 = (java.util.List) ((AbstractC43419rot) objWithContext).AEQbTJ();
                } else {
                    CoroutineDispatcher coroutineDispatcher = this.EZpvd;
                    EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1 eIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1 = new EIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1(list, this, null);
                    eIP7702Repository$fetchAndSaveWalletStatus$1.L$0 = this;
                    eIP7702Repository$fetchAndSaveWalletStatus$1.label = 2;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, eIP7702Repository$fetchAndSaveWalletStatus$2$responseList$1, eIP7702Repository$fetchAndSaveWalletStatus$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    c15275eCh = this;
                    list2 = (java.util.List) objWithContext;
                }
            } else if (i2 == 1) {
                c15275eCh = (C15275eCh) eIP7702Repository$fetchAndSaveWalletStatus$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                list2 = (java.util.List) ((AbstractC43419rot) objWithContext).AEQbTJ();
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                    return Result.m7377constructorimpl(Unit.INSTANCE);
                }
                c15275eCh = (C15275eCh) eIP7702Repository$fetchAndSaveWalletStatus$1.L$0;
                C56391yDq.AEQbTJ(objWithContext);
                list2 = (java.util.List) objWithContext;
            }
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            for (EIP7702WalletStatusResp eIP7702WalletStatusResp : list2) {
                for (EIP7702WalletStatusResp.ChainStatusItem chainStatusItem : eIP7702WalletStatusResp.getSupportChainList()) {
                    listOLrzqt.add(new C11449cOr(eIP7702WalletStatusResp.getWalletId(), chainStatusItem.getChainIndex(), chainStatusItem.getStatus()));
                }
            }
            java.util.List<C11449cOr> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
            if (!listFARcdN.isEmpty()) {
                cPS cps = c15275eCh.OLrzqt;
                eIP7702Repository$fetchAndSaveWalletStatus$1.L$0 = null;
                eIP7702Repository$fetchAndSaveWalletStatus$1.label = 3;
                if (cps.KWHzl(listFARcdN, eIP7702Repository$fetchAndSaveWalletStatus$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<EIP7702ChainStatusResp>> continuation) throws java.lang.Throwable {
        EIP7702Repository$getChainStatus$1 eIP7702Repository$getChainStatus$1;
        if (continuation instanceof EIP7702Repository$getChainStatus$1) {
            eIP7702Repository$getChainStatus$1 = (EIP7702Repository$getChainStatus$1) continuation;
            int i = eIP7702Repository$getChainStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eIP7702Repository$getChainStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                eIP7702Repository$getChainStatus$1 = new EIP7702Repository$getChainStatus$1(this, continuation);
            }
        }
        java.lang.Object objGEmmrt = eIP7702Repository$getChainStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = eIP7702Repository$getChainStatus$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objGEmmrt);
                Result.Application application = Result.Companion;
                C13934dbu c13934dbu = this.copydefault;
                eIP7702Repository$getChainStatus$1.label = 1;
                objGEmmrt = c13934dbu.gEmmrt(str, eIP7702Repository$getChainStatus$1);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objGEmmrt);
            }
            return Result.m7377constructorimpl((EIP7702ChainStatusResp) ((AbstractC43419rot) objGEmmrt).AEQbTJ());
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<C11449cOr> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) {
        return this.OLrzqt.KWHzl(list, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, int i, int i2, @NotNull java.util.List<java.lang.Long> list2, @NotNull Continuation<? super java.util.List<java.lang.String>> continuation) {
        return this.OLrzqt.OLrzqt(list, i, i2, list2, continuation);
    }

    public final EIP7702WalletStatusResp KWHzl(java.lang.String str, java.util.List<C11449cOr> list) {
        int status;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        boolean z = false;
        boolean z2 = false;
        for (C11449cOr c11449cOr : list) {
            int i = TaskDescription.AEQbTJ[EIP7702WalletStatus.Companion.KWHzl(java.lang.Integer.valueOf(c11449cOr.OLrzqt())).ordinal()];
            if (i == 1) {
                z2 = true;
            } else if (i == 2) {
                z = true;
            }
            arrayList.add(new EIP7702WalletStatusResp.ChainStatusItem(c11449cOr.EZpvd(), c11449cOr.OLrzqt()));
        }
        if (z) {
            status = EIP7702WalletStatus.UpgradedNonOKX.getStatus();
        } else if (z2) {
            status = EIP7702WalletStatus.UpgradedOKX.getStatus();
        } else {
            status = EIP7702WalletStatus.NeedUpgrade.getStatus();
        }
        return new EIP7702WalletStatusResp(str, status, arrayList);
    }
}

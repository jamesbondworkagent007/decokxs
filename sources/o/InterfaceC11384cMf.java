package o;

import com.okinc.business.defi.biz.database.wallet.bean.WalletViewForWalletManagement;
import com.okinc.business.defi.biz.database.wallet.dao.WalletDao$addChainAddresses$1;
import com.okinc.business.defi.biz.database.wallet.dao.WalletDao$updateWalletsAndDeleteCreateData$1;
import com.okinc.business.defi.biz.database.wallet.dao.WalletDao$updateWalletsAndDeleteSyncData$1;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletDefiEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletNftEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.net.bean.InternalChainAddressNew;
import com.okinc.business.defi.biz.net.bean.SyncWalletReqNew;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C13058cyg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cMf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11384cMf {
    int AEQbTJ(@NotNull java.lang.String str, int i);

    int AEQbTJ(@NotNull java.lang.String str, long j);

    int AEQbTJ(@NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2);

    java.lang.Object AEQbTJ(@NotNull java.lang.String str, int i, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object AEQbTJ(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, cSX>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.util.List<cSX>> continuation);

    java.util.List<cSX> AEQbTJ();

    java.util.List<EOSInfoEntity> AEQbTJ(@NotNull java.lang.String str);

    java.util.List<WalletEntity> AEQbTJ(@NotNull java.lang.String str, long j, int i, @NotNull java.lang.String str2);

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<WalletNftEntity> list);

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<ChainAddressSegWitEntity> list);

    java.util.List<WalletEntity> AYXKKw(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> AYXKKw(@NotNull java.util.List<WalletDefiEntity> list);

    C11571cTe AYXKKw();

    java.util.List<C11571cTe> AhwBna();

    java.util.List<HardwareInfoEntity> AhwBna(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> AhwBna(@NotNull java.util.List<WalletNftEntity> list);

    int AkhnZx();

    int AkhnZx(@NotNull java.lang.String str);

    int AkhnZx(@NotNull java.util.List<WalletRepairEntity> list);

    int AuCTel(@NotNull java.lang.String str);

    int DbNXlk(@NotNull java.lang.String str);

    boolean DbNXlk();

    int EZpvd(@NotNull RootWalletEntity rootWalletEntity);

    int EZpvd(@NotNull WalletEntity walletEntity);

    int EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    long EZpvd(@NotNull EOSInfoEntity eOSInfoEntity);

    long EZpvd(@NotNull WalletNftEntity walletNftEntity);

    java.lang.Object EZpvd(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressSegWitEntity>>> continuation);

    java.util.List<WalletEntity> EZpvd();

    java.util.List<C11571cTe> EZpvd(int i, int i2);

    java.util.List<MPCWalletEntity> EZpvd(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<ChainAddressSegWitEntity> list);

    java.util.List<java.lang.Long> EZpvd(@NotNull java.util.List<ChainAddressSegWitEntity> list);

    int KWHzl(@NotNull java.lang.String str, int i);

    int KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i);

    java.lang.Object KWHzl(@NotNull java.util.List<ChainAddressEntity> list, @NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<ChainAddressEntity> list, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.util.List<C11571cTe>> continuation);

    java.util.List<WalletEntity> KWHzl();

    java.util.List<WalletRepairEntity> KWHzl(int i, int i2);

    java.util.List<cSX> KWHzl(@NotNull java.lang.String str);

    java.util.List<ChainAddressSegWitEntity> KWHzl(@NotNull java.lang.String str, long j);

    java.util.List<WalletEntity> KWHzl(@NotNull java.util.List<java.lang.Integer> list);

    java.util.List<cSX> KWHzl(@NotNull java.util.List<java.lang.Integer> list, @NotNull java.lang.String str);

    int OLrzqt(@NotNull java.lang.String str, int i);

    int OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    long OLrzqt(@NotNull java.lang.String str, @NotNull EOSInfoEntity eOSInfoEntity);

    java.lang.Object OLrzqt(int i, @NotNull Continuation<? super java.util.List<WalletEntity>> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<SyncWalletReqNew> list2, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object OLrzqt(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<MPCWalletEntity>>> continuation);

    java.lang.Object OLrzqt(@NotNull Continuation<? super java.util.List<java.lang.String>> continuation);

    java.util.List<MPCWalletEntity> OLrzqt();

    java.util.List<MPCWalletEntity> OLrzqt(@NotNull java.lang.String str);

    java.util.List<WalletEntity> OLrzqt(@NotNull java.util.List<java.lang.String> list);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.List<ChainAddressEntity> list);

    int copydefault(@NotNull MPCWalletEntity mPCWalletEntity);

    int copydefault(@NotNull java.lang.String str);

    int copydefault(@NotNull java.lang.String str, int i);

    int copydefault(@NotNull java.lang.String str, long j);

    long copydefault(@NotNull RootWalletEntity rootWalletEntity);

    java.lang.Object copydefault(@NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<java.lang.String> list2, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super java.util.List<WalletEntity>> continuation);

    java.util.List<C11571cTe> copydefault();

    java.util.List<cSX> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i);

    java.util.List<java.lang.Long> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<WalletDefiEntity> list);

    java.util.List<cSX> copydefault(@NotNull java.util.List<java.lang.Integer> list);

    int djBIcL();

    int djBIcL(@NotNull java.util.List<java.lang.String> list);

    java.lang.Object djBIcL(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>> continuation);

    C11571cTe djBIcL(@NotNull java.lang.String str);

    int fARcdN(@NotNull java.lang.String str);

    int fIwbmz(@NotNull java.lang.String str);

    int fJNWhG(@NotNull java.lang.String str);

    java.util.List<WalletEntity> fetchVPNInfo(@NotNull java.lang.String str);

    int gEmmrt(@NotNull java.util.List<WalletEntity> list);

    WalletEntity gEmmrt(@NotNull java.lang.String str);

    java.lang.Object gEmmrt(@NotNull java.util.List<WalletEntity> list, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.util.List<C11571cTe> gEmmrt();

    int isConnected();

    int isConnected(@NotNull java.lang.String str);

    java.util.List<WalletViewForWalletManagement> valueOf();

    java.util.List<C11571cTe> valueOf(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> valueOf(@NotNull java.util.List<ChainAddressEntity> list);

    int values(@NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.cMf$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static C11571cTe KWHzl(@NotNull InterfaceC11384cMf interfaceC11384cMf) {
            java.util.List<C11571cTe> listGEmmrt = interfaceC11384cMf.gEmmrt();
            if (listGEmmrt.isEmpty()) {
                interfaceC11384cMf.fARcdN(((WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(interfaceC11384cMf.EZpvd())).getId());
                listGEmmrt = interfaceC11384cMf.gEmmrt();
            }
            return (C11571cTe) CollectionsKt___CollectionsKt.AuCTelauCTel(listGEmmrt);
        }

        public static int OLrzqt(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return interfaceC11384cMf.isConnected() + interfaceC11384cMf.fJNWhG(str);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.cyg.StateListAnimator.getInstance$default(o.cyg$StateListAnimator, android.content.Context, int, java.lang.Object):o.cyg */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object EZpvd(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.util.List<ChainAddressEntity> list, @NotNull java.lang.String str, @NotNull java.util.List<C11283cIm> list2, @NotNull Continuation<? super java.util.List<java.lang.Long>> continuation) throws java.lang.Throwable {
            WalletDao$addChainAddresses$1 walletDao$addChainAddresses$1;
            java.util.ArrayList arrayList;
            java.util.Collection collection;
            java.util.Collection collection2;
            if (continuation instanceof WalletDao$addChainAddresses$1) {
                walletDao$addChainAddresses$1 = (WalletDao$addChainAddresses$1) continuation;
                int i = walletDao$addChainAddresses$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    walletDao$addChainAddresses$1.label = i - Integer.MIN_VALUE;
                } else {
                    walletDao$addChainAddresses$1 = new WalletDao$addChainAddresses$1(continuation);
                }
            }
            java.lang.Object objCopydefault = walletDao$addChainAddresses$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i2 = walletDao$addChainAddresses$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                walletDao$addChainAddresses$1.L$0 = str;
                walletDao$addChainAddresses$1.L$1 = list2;
                walletDao$addChainAddresses$1.L$2 = arrayList2;
                walletDao$addChainAddresses$1.L$3 = arrayList2;
                walletDao$addChainAddresses$1.label = 1;
                java.lang.Object objKWHzl = interfaceC11384cMf.KWHzl(list, walletDao$addChainAddresses$1);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                arrayList = arrayList2;
                objCopydefault = objKWHzl;
                collection = arrayList;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection2 = (java.util.Collection) walletDao$addChainAddresses$1.L$1;
                    arrayList = (java.util.ArrayList) walletDao$addChainAddresses$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    C56406yEe.KWHzl(collection2, (java.lang.Iterable) objCopydefault);
                    return arrayList;
                }
                collection = (java.util.Collection) walletDao$addChainAddresses$1.L$3;
                arrayList = (java.util.ArrayList) walletDao$addChainAddresses$1.L$2;
                list2 = (java.util.List) walletDao$addChainAddresses$1.L$1;
                str = (java.lang.String) walletDao$addChainAddresses$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            C56406yEe.KWHzl(collection, (java.lang.Iterable) objCopydefault);
            C13058cyg instance$default = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
            java.util.List<C11283cIm> listAhwBna = yDY.AhwBna();
            walletDao$addChainAddresses$1.L$0 = arrayList;
            walletDao$addChainAddresses$1.L$1 = arrayList;
            walletDao$addChainAddresses$1.L$2 = null;
            walletDao$addChainAddresses$1.L$3 = null;
            walletDao$addChainAddresses$1.label = 2;
            objCopydefault = instance$default.copydefault(str, listAhwBna, list2, walletDao$addChainAddresses$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            collection2 = arrayList;
            C56406yEe.KWHzl(collection2, (java.lang.Iterable) objCopydefault);
            return arrayList;
        }

        public static void copydefault(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str, @NotNull java.util.List<ChainAddressEntity> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC11384cMf.DbNXlk(str);
            interfaceC11384cMf.valueOf(list);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0138 -> B:23:0x00a7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0161 -> B:46:0x0162). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object EZpvd(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<SyncWalletReqNew> list2, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
            WalletDao$updateWalletsAndDeleteSyncData$1 walletDao$updateWalletsAndDeleteSyncData$1;
            Ref.IntRef intRef;
            Ref.IntRef intRef2;
            java.lang.Object obj;
            int i;
            java.util.Iterator it;
            Ref.IntRef intRef3;
            java.util.Set linkedHashSet;
            SyncWalletReqNew syncWalletReqNew;
            int i2;
            Ref.IntRef intRef4;
            if (continuation instanceof WalletDao$updateWalletsAndDeleteSyncData$1) {
                walletDao$updateWalletsAndDeleteSyncData$1 = (WalletDao$updateWalletsAndDeleteSyncData$1) continuation;
                int i3 = walletDao$updateWalletsAndDeleteSyncData$1.label;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    walletDao$updateWalletsAndDeleteSyncData$1.label = i3 - Integer.MIN_VALUE;
                } else {
                    walletDao$updateWalletsAndDeleteSyncData$1 = new WalletDao$updateWalletsAndDeleteSyncData$1(continuation);
                }
            }
            java.lang.Object objKWHzl = walletDao$updateWalletsAndDeleteSyncData$1.result;
            java.lang.Object objCopydefault = C56442yFn.copydefault();
            int i4 = walletDao$updateWalletsAndDeleteSyncData$1.label;
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                intRef = new Ref.IntRef();
                int i5 = intRef.element;
                walletDao$updateWalletsAndDeleteSyncData$1.L$0 = list2;
                walletDao$updateWalletsAndDeleteSyncData$1.L$1 = intRef;
                walletDao$updateWalletsAndDeleteSyncData$1.L$2 = intRef;
                walletDao$updateWalletsAndDeleteSyncData$1.I$0 = i5;
                walletDao$updateWalletsAndDeleteSyncData$1.label = 1;
                java.lang.Object objGEmmrt = interfaceC11384cMf.gEmmrt(list, walletDao$updateWalletsAndDeleteSyncData$1);
                if (objGEmmrt == objCopydefault) {
                    return objCopydefault;
                }
                intRef2 = intRef;
                obj = objGEmmrt;
                i = i5;
            } else if (i4 == 1) {
                i = walletDao$updateWalletsAndDeleteSyncData$1.I$0;
                intRef2 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$2;
                Ref.IntRef intRef5 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$1;
                java.util.List<SyncWalletReqNew> list3 = (java.util.List) walletDao$updateWalletsAndDeleteSyncData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                intRef = intRef5;
                list2 = list3;
                obj = objKWHzl;
            } else if (i4 == 2) {
                i2 = walletDao$updateWalletsAndDeleteSyncData$1.I$0;
                intRef3 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$4;
                linkedHashSet = (java.util.Set) walletDao$updateWalletsAndDeleteSyncData$1.L$3;
                syncWalletReqNew = (SyncWalletReqNew) walletDao$updateWalletsAndDeleteSyncData$1.L$2;
                it = (java.util.Iterator) walletDao$updateWalletsAndDeleteSyncData$1.L$1;
                intRef4 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                intRef3.element = i2 + ((java.lang.Number) objKWHzl).intValue();
                intRef3 = intRef4;
                if (!linkedHashSet.isEmpty()) {
                }
                if (!it.hasNext()) {
                }
            } else {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = walletDao$updateWalletsAndDeleteSyncData$1.I$0;
                intRef3 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$2;
                java.util.Iterator it2 = (java.util.Iterator) walletDao$updateWalletsAndDeleteSyncData$1.L$1;
                Ref.IntRef intRef6 = (Ref.IntRef) walletDao$updateWalletsAndDeleteSyncData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                it = it2;
                intRef3.element = i6 + ((java.lang.Number) objKWHzl).intValue();
                intRef3 = intRef6;
                if (!it.hasNext()) {
                    syncWalletReqNew = (SyncWalletReqNew) it.next();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    java.util.Iterator<T> it3 = syncWalletReqNew.getUpdateAddresses().iterator();
                    while (it3.hasNext()) {
                        linkedHashSet2.addAll(((InternalChainAddressNew) it3.next()).getChainIndexList());
                    }
                    linkedHashSet = new LinkedHashSet();
                    java.util.Iterator<T> it4 = syncWalletReqNew.getAddAddresses().iterator();
                    while (it4.hasNext()) {
                        linkedHashSet.addAll(((InternalChainAddressNew) it4.next()).getChainIndexList());
                    }
                    if (!linkedHashSet2.isEmpty()) {
                        int i7 = intRef3.element;
                        C13058cyg instance$default = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
                        java.lang.String accountId = syncWalletReqNew.getAccountId();
                        java.util.List<java.lang.Long> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet2);
                        walletDao$updateWalletsAndDeleteSyncData$1.L$0 = intRef3;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$1 = it;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$2 = syncWalletReqNew;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$3 = linkedHashSet;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$4 = intRef3;
                        walletDao$updateWalletsAndDeleteSyncData$1.I$0 = i7;
                        walletDao$updateWalletsAndDeleteSyncData$1.label = 2;
                        java.lang.Object objKWHzl2 = instance$default.KWHzl(accountId, listAxsJAYsNCnLh, 3, walletDao$updateWalletsAndDeleteSyncData$1);
                        if (objKWHzl2 == objCopydefault) {
                            return objCopydefault;
                        }
                        intRef4 = intRef3;
                        objKWHzl = objKWHzl2;
                        i2 = i7;
                        intRef3.element = i2 + ((java.lang.Number) objKWHzl).intValue();
                        intRef3 = intRef4;
                    }
                    if (!linkedHashSet.isEmpty()) {
                        i6 = intRef3.element;
                        C13058cyg instance$default2 = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
                        java.lang.String accountId2 = syncWalletReqNew.getAccountId();
                        java.util.List<java.lang.Long> listAxsJAYsNCnLh2 = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashSet);
                        walletDao$updateWalletsAndDeleteSyncData$1.L$0 = intRef3;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$1 = it;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$2 = intRef3;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$3 = null;
                        walletDao$updateWalletsAndDeleteSyncData$1.L$4 = null;
                        walletDao$updateWalletsAndDeleteSyncData$1.I$0 = i6;
                        walletDao$updateWalletsAndDeleteSyncData$1.label = 3;
                        objKWHzl = instance$default2.KWHzl(accountId2, listAxsJAYsNCnLh2, 2, walletDao$updateWalletsAndDeleteSyncData$1);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        intRef6 = intRef3;
                        intRef3.element = i6 + ((java.lang.Number) objKWHzl).intValue();
                        intRef3 = intRef6;
                    }
                    if (!it.hasNext()) {
                        return C56443yFo.AEQbTJ(intRef3.element);
                    }
                }
            }
            intRef2.element = i + ((java.lang.Number) obj).intValue();
            it = list2.iterator();
            intRef3 = intRef;
            if (!it.hasNext()) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static java.lang.Object copydefault(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.util.List<WalletEntity> list, @NotNull java.util.List<java.lang.String> list2, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
            WalletDao$updateWalletsAndDeleteCreateData$1 walletDao$updateWalletsAndDeleteCreateData$1;
            int i;
            int iIntValue;
            if (continuation instanceof WalletDao$updateWalletsAndDeleteCreateData$1) {
                walletDao$updateWalletsAndDeleteCreateData$1 = (WalletDao$updateWalletsAndDeleteCreateData$1) continuation;
                int i2 = walletDao$updateWalletsAndDeleteCreateData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    walletDao$updateWalletsAndDeleteCreateData$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    walletDao$updateWalletsAndDeleteCreateData$1 = new WalletDao$updateWalletsAndDeleteCreateData$1(continuation);
                }
            }
            java.lang.Object objCopydefault = walletDao$updateWalletsAndDeleteCreateData$1.result;
            java.lang.Object objCopydefault2 = C56442yFn.copydefault();
            int i3 = walletDao$updateWalletsAndDeleteCreateData$1.label;
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                walletDao$updateWalletsAndDeleteCreateData$1.L$0 = list2;
                walletDao$updateWalletsAndDeleteCreateData$1.I$0 = 0;
                walletDao$updateWalletsAndDeleteCreateData$1.label = 1;
                java.lang.Object objGEmmrt = interfaceC11384cMf.gEmmrt(list, walletDao$updateWalletsAndDeleteCreateData$1);
                if (objGEmmrt == objCopydefault2) {
                    return objCopydefault2;
                }
                objCopydefault = objGEmmrt;
                i = 0;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iIntValue = walletDao$updateWalletsAndDeleteCreateData$1.I$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    return C56443yFo.AEQbTJ(iIntValue + ((java.lang.Number) objCopydefault).intValue());
                }
                i = walletDao$updateWalletsAndDeleteCreateData$1.I$0;
                list2 = (java.util.List) walletDao$updateWalletsAndDeleteCreateData$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            iIntValue = i + ((java.lang.Number) objCopydefault).intValue();
            C13058cyg instance$default = C13058cyg.StateListAnimator.getInstance$default(C13058cyg.Companion, null, 1, null);
            walletDao$updateWalletsAndDeleteCreateData$1.L$0 = null;
            walletDao$updateWalletsAndDeleteCreateData$1.I$0 = iIntValue;
            walletDao$updateWalletsAndDeleteCreateData$1.label = 2;
            objCopydefault = instance$default.copydefault(list2, walletDao$updateWalletsAndDeleteCreateData$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            return C56443yFo.AEQbTJ(iIntValue + ((java.lang.Number) objCopydefault).intValue());
        }

        public static java.util.List<java.lang.Long> AEQbTJ(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str, @NotNull java.util.List<WalletDefiEntity> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            try {
                return interfaceC11384cMf.isConnected(str) >= 0 ? interfaceC11384cMf.AYXKKw(list) : yDY.AhwBna(-1L);
            } catch (java.lang.Exception unused) {
                return yDY.AhwBna(-1L);
            }
        }

        public static java.util.List<java.lang.Long> KWHzl(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str, @NotNull java.util.List<WalletNftEntity> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            try {
                return interfaceC11384cMf.AuCTel(str) >= 0 ? interfaceC11384cMf.AhwBna(list) : yDY.AhwBna(-1L);
            } catch (java.lang.Exception unused) {
                return yDY.AhwBna(-1L);
            }
        }

        public static java.util.List<java.lang.Long> EZpvd(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str, @NotNull java.util.List<ChainAddressSegWitEntity> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            try {
                return interfaceC11384cMf.AkhnZx(str) >= 0 ? interfaceC11384cMf.EZpvd(list) : yDY.AhwBna(-1L);
            } catch (java.lang.Exception unused) {
                return yDY.AhwBna(-1L);
            }
        }

        public static long copydefault(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.lang.String str, @NotNull EOSInfoEntity eOSInfoEntity) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(eOSInfoEntity, "");
            try {
                if (interfaceC11384cMf.values(str) >= 0) {
                    return interfaceC11384cMf.EZpvd(eOSInfoEntity);
                }
            } catch (java.lang.Exception unused) {
            }
            return -1L;
        }

        public static int KWHzl(@NotNull InterfaceC11384cMf interfaceC11384cMf, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map, @NotNull java.util.HashMap<java.lang.String, java.lang.Integer> map2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (Map.Entry<java.lang.String, java.lang.Integer> entry : map.entrySet()) {
                arrayList.add(java.lang.Integer.valueOf(interfaceC11384cMf.copydefault(entry.getKey(), entry.getValue().intValue())));
            }
            int size = arrayList.size();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map2.size());
            for (Map.Entry<java.lang.String, java.lang.Integer> entry2 : map2.entrySet()) {
                arrayList2.add(java.lang.Integer.valueOf(interfaceC11384cMf.KWHzl(entry2.getKey(), entry2.getValue().intValue())));
            }
            return size + arrayList2.size();
        }
    }
}

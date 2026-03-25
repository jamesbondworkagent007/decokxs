package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.database.wallet.entity.PartTeeStatusInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.TeeStatusInfoEntity;
import com.okinc.business.defi.biz.net.bean.AddressVerifyStatus;
import com.okinc.business.defi.biz.net.bean.ChainStatusItem;
import com.okinc.business.defi.biz.net.bean.Eip7702StatusItem;
import com.okinc.business.defi.biz.net.bean.SingleEip7702Status;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatus;
import com.okinc.business.defi.biz.net.bean.SingleTeeStatusAndWarringInfo;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item;
import com.okinc.business.defi.biz.net.bean.TeeAndEip7702StatusItem;
import com.okinc.business.defi.biz.net.bean.TeeStatus;
import com.okinc.business.defi.biz.net.bean.UpdateStatus;
import com.okinc.business.defi.wallet.eip7702.data.model.EIP7702WalletStatus;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$4;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$setTeeModel$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$updateStatus$1;
import com.okinc.business.defi.wallet.tee.repository.TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.InterfaceC13426dKx;
import o.dTK;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes5.dex */
public final class fVG implements fVJ {
    public final C15275eCh AEQbTJ;
    public final java.util.Map<java.lang.String, SingleTeeStatusAndWarringInfo> EZpvd;
    public final C11498cQm KWHzl;
    public final C13934dbu OLrzqt;

    public final /* synthetic */ class StateListAnimator {
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

    @yCM
    public fVG(@NotNull C13934dbu c13934dbu, @NotNull C11498cQm c11498cQm, @NotNull C15275eCh c15275eCh) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c11498cQm, "");
        Intrinsics.checkNotNullParameter(c15275eCh, "");
        this.OLrzqt = c13934dbu;
        this.KWHzl = c11498cQm;
        this.AEQbTJ = c15275eCh;
        this.EZpvd = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, boolean z2, @NotNull Continuation<? super SingleTeeStatus> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1 teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1;
        java.lang.String str3;
        java.lang.String str4;
        boolean z3;
        java.lang.Object objCopydefault;
        fVG fvg;
        AbstractC43419rot abstractC43419rot;
        java.util.List<ChainStatusItem> listAhwBna;
        java.lang.String str5;
        AbstractC43419rot abstractC43419rot2;
        SingleTeeStatus singleTeeStatus;
        fVG fvg2;
        java.lang.String str6;
        TeeStatus teeStatus;
        boolean zIsVerify;
        java.lang.Boolean canUseSa2;
        SingleTeeStatus singleTeeStatus2;
        boolean z4;
        AbstractC43419rot abstractC43419rot3;
        java.lang.String str7;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1) {
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1 = (TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1 = new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1(this, continuation);
            }
        }
        TeeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1 teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$1;
        java.lang.Object obj = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.OLrzqt;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0 = this;
            str3 = str;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1 = str3;
            str4 = str2;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2 = str4;
            z3 = z2;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0 = z3;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.label = 1;
            objCopydefault = c13934dbu.copydefault(str, str2, z, z2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            fvg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z4 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0;
                    singleTeeStatus2 = (SingleTeeStatus) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2;
                    abstractC43419rot3 = (AbstractC43419rot) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1;
                    str7 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0;
                    C56391yDq.AEQbTJ(obj);
                    if (z4) {
                        C17925fXj.EZpvd.KWHzl(str7, singleTeeStatus2);
                    }
                    abstractC43419rot = abstractC43419rot3;
                    str3 = str7;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        C17925fXj.EZpvd.EZpvd(str3);
                    }
                    return abstractC43419rot.copydefault();
                }
                boolean z5 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0;
                SingleTeeStatus singleTeeStatus3 = (SingleTeeStatus) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$4;
                AbstractC43419rot abstractC43419rot4 = (AbstractC43419rot) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$3;
                java.lang.String str8 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2;
                java.lang.String str9 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1;
                fVG fvg3 = (fVG) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0;
                C56391yDq.AEQbTJ(obj);
                z3 = z5;
                singleTeeStatus = singleTeeStatus3;
                abstractC43419rot2 = abstractC43419rot4;
                str6 = str8;
                str5 = str9;
                fvg2 = fvg3;
                teeStatus = singleTeeStatus.getTeeStatus();
                AddressVerifyStatus addressVerifyStatus = singleTeeStatus.getAddressVerifyStatus();
                zIsVerify = addressVerifyStatus == null ? addressVerifyStatus.isVerify() : false;
                canUseSa2 = singleTeeStatus.getCanUseSa2();
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0 = str5;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1 = abstractC43419rot2;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2 = singleTeeStatus;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$3 = null;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$4 = null;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0 = z3;
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.label = 3;
                if (saveTeeStatusToCacheAndDB$default(fvg2, str5, str6, teeStatus, zIsVerify, false, canUseSa2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12, 16, null) != objCopydefault2) {
                    return objCopydefault2;
                }
                singleTeeStatus2 = singleTeeStatus;
                z4 = z3;
                abstractC43419rot3 = abstractC43419rot2;
                str7 = str5;
                if (z4) {
                }
                abstractC43419rot = abstractC43419rot3;
                str3 = str7;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return abstractC43419rot.copydefault();
            }
            boolean z6 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0;
            java.lang.String str10 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2;
            java.lang.String str11 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1;
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0;
            C56391yDq.AEQbTJ(obj);
            z3 = z6;
            str4 = str10;
            objCopydefault = obj;
            str3 = str11;
        }
        abstractC43419rot = (AbstractC43419rot) objCopydefault;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            SingleTeeStatus singleTeeStatus4 = (SingleTeeStatus) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            SingleEip7702Status eip7702Status = singleTeeStatus4.getEip7702Status();
            if (eip7702Status == null || (listAhwBna = eip7702Status.getChainAddressInfoList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0 = fvg;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1 = str3;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2 = str4;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$3 = abstractC43419rot;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$4 = singleTeeStatus4;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0 = z3;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.label = 2;
            if (fvg.KWHzl(str3, listAhwBna, teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12) == objCopydefault2) {
                return objCopydefault2;
            }
            str5 = str3;
            abstractC43419rot2 = abstractC43419rot;
            singleTeeStatus = singleTeeStatus4;
            fvg2 = fvg;
            str6 = str4;
            teeStatus = singleTeeStatus.getTeeStatus();
            AddressVerifyStatus addressVerifyStatus2 = singleTeeStatus.getAddressVerifyStatus();
            zIsVerify = addressVerifyStatus2 == null ? addressVerifyStatus2.isVerify() : false;
            canUseSa2 = singleTeeStatus.getCanUseSa2();
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$0 = str5;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$1 = abstractC43419rot2;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$2 = singleTeeStatus;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$3 = null;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.L$4 = null;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.Z$0 = z3;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12.label = 3;
            if (saveTeeStatusToCacheAndDB$default(fvg2, str5, str6, teeStatus, zIsVerify, false, canUseSa2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702Status$12, 16, null) != objCopydefault2) {
            }
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return abstractC43419rot.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.util.List<ChainStatusItem> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1 teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1) {
            teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1 = (TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1 = new TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objEZpvd);
                if (list == null || list.isEmpty()) {
                    return Unit.INSTANCE;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (ChainStatusItem chainStatusItem : list) {
                    arrayList.add(new C11449cOr(str, chainStatusItem.getChainIndex(), chainStatusItem.getStatus()));
                }
                Result.Application application = Result.Companion;
                C15275eCh c15275eCh = this.AEQbTJ;
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1.label = 1;
                objEZpvd = c15275eCh.EZpvd(arrayList, teeAnd7702StatusRepositoryImpl$save7702StatusToDB$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
            }
            Result.m7377constructorimpl((java.util.List) objEZpvd);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:67:0x002b */
    /* JADX DEBUG: Type inference failed for r2v12. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, o.fVG] */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.fVG] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.util.List<TeeAndEip7702Item> list, @NotNull Continuation<? super java.util.List<TeeAndEip7702StatusItem>> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1 teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1;
        java.lang.Object objM7377constructorimpl;
        ?? r4;
        java.util.List list2;
        ?? r5;
        fVG fvg;
        java.util.List<TeeAndEip7702Item> list3 = list;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1) {
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1 = (TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1 = new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r42 = teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            r4 = r42;
        }
        if (r42 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (list.isEmpty()) {
                return yDY.AhwBna();
            }
            C15275eCh c15275eCh = this.AEQbTJ;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TeeAndEip7702Item) it.next()).getAccountId());
            }
            int iOrdinal = WalletType.HDWallet.ordinal();
            int iOrdinal2 = WalletType.KeyWallet.ordinal();
            java.util.List<C10854bwM> listDbNXlk = C10954byG.EZpvd.valueOf().DbNXlk();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listDbNXlk, 10));
            java.util.Iterator it2 = listDbNXlk.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C56443yFo.KWHzl(((C10854bwM) it2.next()).AEQbTJ()));
            }
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0 = this;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1 = list3;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = 1;
            objOLrzqt = c15275eCh.OLrzqt(arrayList, iOrdinal, iOrdinal2, arrayList2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
        } else if (r42 == 1) {
            list3 = (java.util.List) teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1;
            fVG fvg2 = (fVG) teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            fvg = fvg2;
        } else if (r42 == 2) {
            fVG fvg3 = (fVG) teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            r42 = fvg3;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
            r4 = r42;
            ?? r52 = r4;
            if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
                list2 = (java.util.List) objM7377constructorimpl;
                if (!list2.isEmpty()) {
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0 = r52;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1 = objM7377constructorimpl;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$2 = list2;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = 3;
                    java.lang.Object objOLrzqt2 = r52.OLrzqt(list2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1);
                    r5 = r52;
                    if (objOLrzqt2 == objCopydefault) {
                        return objCopydefault;
                    }
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0 = objM7377constructorimpl;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1 = null;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$2 = null;
                    teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = 4;
                    if (r5.EZpvd(list2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1) == objCopydefault) {
                    }
                }
            }
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
        } else {
            if (r42 != 3) {
                if (r42 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objM7377constructorimpl = teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                return !Result.m7383isFailureimpl(objM7377constructorimpl) ? yDY.AhwBna() : objM7377constructorimpl;
            }
            java.util.List list4 = (java.util.List) teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$2;
            java.lang.Object obj = teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1;
            fVG fvg4 = (fVG) teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            list2 = list4;
            objM7377constructorimpl = obj;
            r5 = fvg4;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0 = objM7377constructorimpl;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1 = null;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$2 = null;
            teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = 4;
            if (r5.EZpvd(list2, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1) == objCopydefault) {
                return objCopydefault;
            }
            if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
            }
        }
        if (((java.util.List) objOLrzqt).isEmpty()) {
            return yDY.AhwBna();
        }
        Result.Application application2 = Result.Companion;
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1 teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1 = new TeeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1(list3, fvg, null);
        teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$0 = fvg;
        teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.L$1 = null;
        teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1.label = 2;
        objOLrzqt = BuildersKt.withContext(coroutineDispatcher, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$2$1, teeAnd7702StatusRepositoryImpl$getTeeAnd7702StatusList$1);
        r42 = fvg;
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) objOLrzqt);
        r4 = r42;
        ?? r522 = r4;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
        }
        if (!Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.util.List<TeeAndEip7702StatusItem> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$4 teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4;
        java.util.List listAhwBna;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$4) {
            teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4 = (TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$4) continuation;
            int i = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4 = new TeeAnd7702StatusRepositoryImpl$save7702StatusToDB$4(this, continuation);
            }
        }
        java.lang.Object objEZpvd = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (TeeAndEip7702StatusItem teeAndEip7702StatusItem : list) {
                if (teeAndEip7702StatusItem.getEip7702Status() == null) {
                    listAhwBna = yDY.AhwBna();
                } else {
                    java.util.List<Eip7702StatusItem> chainAddressInfoList = teeAndEip7702StatusItem.getEip7702Status().getChainAddressInfoList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(chainAddressInfoList, 10));
                    for (Eip7702StatusItem eip7702StatusItem : chainAddressInfoList) {
                        arrayList2.add(new C11449cOr(teeAndEip7702StatusItem.getAccountId(), eip7702StatusItem.getChainIndex(), eip7702StatusItem.getStatus()));
                    }
                    listAhwBna = arrayList2;
                }
                C56406yEe.KWHzl(arrayList, listAhwBna);
            }
            if (!arrayList.isEmpty()) {
                Result.Application application2 = Result.Companion;
                C15275eCh c15275eCh = this.AEQbTJ;
                teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4.label = 1;
                objEZpvd = c15275eCh.EZpvd(arrayList, teeAnd7702StatusRepositoryImpl$save7702StatusToDB$4);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        Result.m7377constructorimpl((java.util.List) objEZpvd);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b0 -> B:34:0x00b6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00bc -> B:36:0x00be). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.util.List<TeeAndEip7702StatusItem> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1 teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1;
        fVG fvg;
        java.util.Collection arrayList;
        java.util.Iterator it;
        fVG fvg2;
        TeeStatus teeStatus;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1) {
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1 = (TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.label = i - Integer.MIN_VALUE;
                fvg = this;
            } else {
                fvg = this;
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1 = new TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1(fvg, continuation);
            }
        }
        java.lang.Object obj = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            arrayList = new java.util.ArrayList();
            it = list.iterator();
            fvg2 = fvg;
            teeStatusInfoEntity = null;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            it = (java.util.Iterator) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$2;
            java.util.Collection collection = (java.util.Collection) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$1;
            fVG fvg3 = (fVG) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$0;
            C56391yDq.AEQbTJ(obj);
            fvg2 = fvg3;
            TeeStatusInfoEntity teeStatusInfoEntity = (TeeStatusInfoEntity) obj;
            arrayList = collection;
            if (teeStatusInfoEntity != null) {
                arrayList.add(teeStatusInfoEntity);
            }
            teeStatusInfoEntity = null;
            if (it.hasNext()) {
                TeeAndEip7702StatusItem teeAndEip7702StatusItem = (TeeAndEip7702StatusItem) it.next();
                java.lang.String teeId = teeAndEip7702StatusItem.getTeeId();
                if (teeId == null || teeId.length() == 0 || (teeStatus = teeAndEip7702StatusItem.getTeeStatus()) == null) {
                    fvg2 = fvg2;
                    if (teeStatusInfoEntity != null) {
                    }
                    teeStatusInfoEntity = null;
                    if (it.hasNext()) {
                    }
                } else {
                    java.lang.String accountId = teeAndEip7702StatusItem.getAccountId();
                    java.lang.String teeId2 = teeAndEip7702StatusItem.getTeeId();
                    AddressVerifyStatus addressVerifyStatus = teeAndEip7702StatusItem.getAddressVerifyStatus();
                    boolean zIsVerify = addressVerifyStatus != null ? addressVerifyStatus.isVerify() : false;
                    java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(teeAndEip7702StatusItem.getCanUseSa2());
                    teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$0 = fvg2;
                    teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$1 = arrayList;
                    teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$2 = it;
                    teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.label = 1;
                    fVG fvg4 = fvg2;
                    java.lang.Object objSaveTeeStatusToCache$default = saveTeeStatusToCache$default(fvg2, accountId, teeId2, teeStatus, zIsVerify, false, boolKWHzl, teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1, 16, null);
                    if (objSaveTeeStatusToCache$default == objCopydefault) {
                        return objCopydefault;
                    }
                    fvg3 = fvg4;
                    collection = arrayList;
                    obj = objSaveTeeStatusToCache$default;
                    fvg2 = fvg3;
                    TeeStatusInfoEntity teeStatusInfoEntity2 = (TeeStatusInfoEntity) obj;
                    arrayList = collection;
                    if (teeStatusInfoEntity2 != null) {
                    }
                    teeStatusInfoEntity2 = null;
                    if (it.hasNext()) {
                    }
                }
            } else {
                fVG fvg5 = fvg2;
                java.util.List<TeeStatusInfoEntity> list2 = (java.util.List) arrayList;
                if (!(!list2.isEmpty())) {
                    return Unit.INSTANCE;
                }
                C11498cQm c11498cQm = fvg5.KWHzl;
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$0 = null;
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$1 = null;
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.L$2 = null;
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1.label = 2;
                if (c11498cQm.OLrzqt(list2, teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // o.fVJ
    public SingleTeeStatusAndWarringInfo EZpvd(@NotNull java.lang.String str, @NotNull SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(singleTeeStatusAndWarringInfo, "");
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo2 = this.EZpvd.get(str);
        if (singleTeeStatusAndWarringInfo2 != null) {
            return singleTeeStatusAndWarringInfo2;
        }
        AEQbTJ(str, singleTeeStatusAndWarringInfo);
        return singleTeeStatusAndWarringInfo;
    }

    @Override // o.fVJ
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull SingleTeeStatus singleTeeStatus, @NotNull Continuation<? super java.lang.Long> continuation) {
        TeeStatus teeStatus = singleTeeStatus.getTeeStatus();
        AddressVerifyStatus addressVerifyStatus = singleTeeStatus.getAddressVerifyStatus();
        return saveTeeStatusToCacheAndDB$default(this, str, str2, teeStatus, addressVerifyStatus != null ? addressVerifyStatus.isVerify() : false, false, singleTeeStatus.getCanUseSa2(), continuation, 16, null);
    }

    public static /* synthetic */ java.lang.Object saveTeeStatusToCacheAndDB$default(fVG fvg, java.lang.String str, java.lang.String str2, TeeStatus teeStatus, boolean z, boolean z2, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        return fvg.OLrzqt(str, str2, teeStatus, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2, TeeStatus teeStatus, boolean z, boolean z2, java.lang.Boolean bool, Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2 teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2;
        fVG fvg;
        long jLongValue;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2) {
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2 = (TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2) continuation;
            int i = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2 = new TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2(this, continuation);
            }
        }
        TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2 teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$2;
        java.lang.Object objAEQbTJ = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.L$0 = this;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.label = 1;
            objAEQbTJ = AEQbTJ(str, str2, teeStatus, z, z2, bool, teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                jLongValue = ((java.lang.Number) objAEQbTJ).longValue();
                return C56443yFo.KWHzl(jLongValue);
            }
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        TeeStatusInfoEntity teeStatusInfoEntity = (TeeStatusInfoEntity) objAEQbTJ;
        if (teeStatusInfoEntity != null) {
            C11498cQm c11498cQm = fvg.KWHzl;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.L$0 = null;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22.label = 2;
            objAEQbTJ = c11498cQm.copydefault(teeStatusInfoEntity, teeAnd7702StatusRepositoryImpl$saveTeeStatusToCacheAndDB$22);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            jLongValue = ((java.lang.Number) objAEQbTJ).longValue();
            return C56443yFo.KWHzl(jLongValue);
        }
        jLongValue = -1;
        return C56443yFo.KWHzl(jLongValue);
    }

    public static /* synthetic */ java.lang.Object saveTeeStatusToCache$default(fVG fvg, java.lang.String str, java.lang.String str2, TeeStatus teeStatus, boolean z, boolean z2, java.lang.Boolean bool, Continuation continuation, int i, java.lang.Object obj) {
        return fvg.AEQbTJ(str, str2, teeStatus, z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? null : bool, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x03da A[PHI: r5
  0x03da: PHI (r5v5 java.lang.Boolean) = (r5v4 java.lang.Boolean), (r5v13 java.lang.Boolean) binds: [B:218:0x03c1, B:227:0x03d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull TeeStatus teeStatus, boolean z, boolean z2, java.lang.Boolean bool, @NotNull Continuation<? super TeeStatusInfoEntity> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1 teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1;
        boolean z3;
        TeeStatus teeStatus2;
        java.lang.Boolean bool2;
        fVG fvg;
        java.lang.String str3;
        boolean z4;
        long jCurrentTimeMillis;
        boolean zBooleanValue;
        int i;
        int iIntValue;
        SingleTeeStatus singleTeeStatus;
        TeeStatus teeStatus3;
        SingleTeeStatus singleTeeStatus2;
        TeeStatus teeStatus4;
        AddressVerifyStatus addressVerifyStatus;
        SingleTeeStatus singleTeeStatus3;
        SingleTeeStatus singleTeeStatus4;
        TeeStatus teeStatus5;
        SingleTeeStatus singleTeeStatus5;
        TeeStatus teeStatus6;
        SingleTeeStatus singleTeeStatus6;
        TeeStatus teeStatus7;
        SingleTeeStatus singleTeeStatus7;
        TeeStatus teeStatus8;
        int iOLrzqt;
        SingleTeeStatus singleTeeStatus8;
        TeeStatus teeStatus9;
        SingleTeeStatus singleTeeStatus9;
        TeeStatus teeStatus10;
        SingleTeeStatus singleTeeStatus10;
        TeeStatus teeStatus11;
        java.lang.String str4 = str;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1) {
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1 = (TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1) continuation;
            int i2 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.label = i2 - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1 = new TeeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1(this, continuation);
            }
        }
        java.lang.Object obj = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.label;
        java.lang.Integer upgradeStatus = null;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            if (str2.length() == 0) {
                return null;
            }
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$0 = this;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$1 = str4;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$2 = str2;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$3 = teeStatus;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$4 = bool;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.Z$0 = z;
            z3 = z2;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.Z$1 = z3;
            teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.label = 1;
            java.lang.Object objKWHzl = KWHzl(str4, str2, teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            teeStatus2 = teeStatus;
            obj = objKWHzl;
            bool2 = bool;
            fvg = this;
            str3 = str2;
            z4 = z;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.Z$1;
            z4 = teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.Z$0;
            bool2 = (java.lang.Boolean) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$4;
            TeeStatus teeStatus12 = (TeeStatus) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$3;
            java.lang.String str5 = (java.lang.String) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$2;
            java.lang.String str6 = (java.lang.String) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$1;
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$saveTeeStatusToCache$1.L$0;
            C56391yDq.AEQbTJ(obj);
            teeStatus2 = teeStatus12;
            str3 = str5;
            z3 = z5;
            str4 = str6;
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) obj;
        if (z3) {
            java.lang.Integer disableReason = teeStatus2.getDisableReason();
            if ((disableReason != null && disableReason.intValue() == 0) || teeStatus2.getDisableReason() == null) {
                if (teeStatus2.isActive()) {
                    iOLrzqt = dTK.Application.Companion.OLrzqt();
                } else if (teeStatus2.isCreated() && !teeStatus2.getUserDisable()) {
                    java.lang.Integer numAEQbTJ = (singleTeeStatusAndWarringInfo == null || (singleTeeStatus10 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus11 = singleTeeStatus10.getTeeStatus()) == null) ? null : C56443yFo.AEQbTJ(teeStatus11.getModel());
                    int iOLrzqt2 = dTK.Application.Companion.OLrzqt();
                    if (numAEQbTJ != null && numAEQbTJ.intValue() == iOLrzqt2) {
                        iOLrzqt = dTK.ActionBar.Companion.EZpvd();
                    } else {
                        dTK.ActionBar.Application application = dTK.ActionBar.Companion;
                        int iEZpvd = application.EZpvd();
                        if (numAEQbTJ != null && numAEQbTJ.intValue() == iEZpvd) {
                            iOLrzqt = application.EZpvd();
                        } else {
                            dTK.StateListAnimator.TaskDescription taskDescription = dTK.StateListAnimator.Companion;
                            int iEZpvd2 = taskDescription.EZpvd();
                            if (numAEQbTJ != null && numAEQbTJ.intValue() == iEZpvd2) {
                                iOLrzqt = taskDescription.EZpvd();
                            } else {
                                iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                            }
                        }
                    }
                } else {
                    iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                }
            } else {
                java.lang.Integer disableReason2 = teeStatus2.getDisableReason();
                if (disableReason2 != null && disableReason2.intValue() == 1) {
                    iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                } else if (disableReason2 != null && disableReason2.intValue() == 2) {
                    java.lang.Integer numAEQbTJ2 = (singleTeeStatusAndWarringInfo == null || (singleTeeStatus9 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus10 = singleTeeStatus9.getTeeStatus()) == null) ? null : C56443yFo.AEQbTJ(teeStatus10.getModel());
                    int iOLrzqt3 = dTK.Application.Companion.OLrzqt();
                    if (numAEQbTJ2 != null && numAEQbTJ2.intValue() == iOLrzqt3) {
                        iOLrzqt = dTK.ActionBar.Companion.EZpvd();
                    } else {
                        int iEZpvd3 = dTK.ActionBar.Companion.EZpvd();
                        if (numAEQbTJ2 == null || numAEQbTJ2.intValue() != iEZpvd3) {
                            int iEZpvd4 = dTK.StateListAnimator.Companion.EZpvd();
                            if (numAEQbTJ2 == null || numAEQbTJ2.intValue() != iEZpvd4) {
                                iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                            }
                        }
                    }
                } else if (disableReason2 != null && disableReason2.intValue() == 3) {
                    java.lang.Integer numAEQbTJ3 = (singleTeeStatusAndWarringInfo == null || (singleTeeStatus8 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus9 = singleTeeStatus8.getTeeStatus()) == null) ? null : C56443yFo.AEQbTJ(teeStatus9.getModel());
                    int iOLrzqt4 = dTK.Application.Companion.OLrzqt();
                    if (numAEQbTJ3 != null && numAEQbTJ3.intValue() == iOLrzqt4) {
                        iOLrzqt = dTK.StateListAnimator.Companion.EZpvd();
                    } else {
                        int iEZpvd5 = dTK.ActionBar.Companion.EZpvd();
                        if (numAEQbTJ3 == null || numAEQbTJ3.intValue() != iEZpvd5) {
                            int iEZpvd6 = dTK.StateListAnimator.Companion.EZpvd();
                            if (numAEQbTJ3 == null || numAEQbTJ3.intValue() != iEZpvd6) {
                                iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                            }
                        }
                    }
                } else {
                    iOLrzqt = dTK.Fragment.Companion.OLrzqt();
                }
            }
            teeStatus2.setModel(iOLrzqt);
            if (bool2 != null) {
                bool2.booleanValue();
                if (singleTeeStatusAndWarringInfo != null) {
                    singleTeeStatusAndWarringInfo.setCanUseSa2(bool2.booleanValue());
                }
            }
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).OcIXYQ().copydefault());
        if (str3.length() > 0) {
            if (Intrinsics.EZpvd((java.lang.Object) (abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null), (java.lang.Object) str4)) {
                dTI dti = (dTI) C43251rlk.copydefault(dTI.class);
                dTK.Activity activity = dTK.Companion;
                dti.copydefault(activity.copydefault(teeStatus2.getModel(), str4));
                pUU.EZpvd("TeeStatusRepositoryImpl", "saveTeeStatusToCache: emit account model , model=" + teeStatus2.getModel() + " cache model=" + ((singleTeeStatusAndWarringInfo == null || (singleTeeStatus7 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus8 = singleTeeStatus7.getTeeStatus()) == null) ? null : C56443yFo.AEQbTJ(teeStatus8.getModel())) + " isActive=" + ((singleTeeStatusAndWarringInfo == null || (singleTeeStatus6 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus7 = singleTeeStatus6.getTeeStatus()) == null) ? null : C56443yFo.KWHzl(teeStatus7.isActive())));
                if (singleTeeStatusAndWarringInfo != null && (singleTeeStatus5 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) != null && (teeStatus6 = singleTeeStatus5.getTeeStatus()) != null && teeStatus6.getModel() == dTK.Application.Companion.OLrzqt() && teeStatus2.getModel() == dTK.Fragment.Companion.OLrzqt()) {
                    ((dTI) C43251rlk.copydefault(dTI.class)).EZpvd(activity.copydefault(teeStatus2.getModel(), str4));
                } else if (singleTeeStatusAndWarringInfo != null && (singleTeeStatus4 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) != null && (teeStatus5 = singleTeeStatus4.getTeeStatus()) != null && teeStatus5.getModel() == dTK.Fragment.Companion.OLrzqt() && teeStatus2.getModel() == dTK.Application.Companion.OLrzqt()) {
                    ((dTI) C43251rlk.copydefault(dTI.class)).EZpvd(activity.copydefault(teeStatus2.getModel(), str4));
                }
            }
        }
        if (!Intrinsics.EZpvd((singleTeeStatusAndWarringInfo == null || (singleTeeStatus3 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null) ? null : singleTeeStatus3.getTeeStatus(), teeStatus2)) {
            fvg.copydefault(str4, teeStatus2);
        }
        if (singleTeeStatusAndWarringInfo != null && Intrinsics.EZpvd(singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus(), teeStatus2) && (addressVerifyStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus()) != null && addressVerifyStatus.isVerify() == z4 && z3 && bool2 != null && Intrinsics.EZpvd(C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCanUseSa2()), bool2)) {
            return null;
        }
        boolean zIsCreated = teeStatus2.isCreated();
        boolean zIsActive = teeStatus2.isActive();
        long expiredTimestamp = teeStatus2.getExpiredTimestamp();
        boolean userDisable = teeStatus2.getUserDisable();
        if ((singleTeeStatusAndWarringInfo != null ? C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCreateAt()) : null) == null || singleTeeStatusAndWarringInfo.getCreateAt() == 0) {
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = singleTeeStatusAndWarringInfo.getCreateAt();
        }
        long j = jCurrentTimeMillis;
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        int model = teeStatus2.getModel();
        int i4 = (!Intrinsics.EZpvd(bool2, C56443yFo.KWHzl(true)) && (singleTeeStatusAndWarringInfo == null || !singleTeeStatusAndWarringInfo.getCanUseSa2())) ? 0 : 1;
        java.lang.Boolean autoRenew = teeStatus2.getAutoRenew();
        if (autoRenew == null) {
            autoRenew = (singleTeeStatusAndWarringInfo == null || (singleTeeStatus2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus4 = singleTeeStatus2.getTeeStatus()) == null) ? null : teeStatus4.getAutoRenew();
            zBooleanValue = autoRenew != null ? autoRenew.booleanValue() : false;
        }
        int iOLrzqt5 = C11600cUg.OLrzqt(zBooleanValue);
        java.lang.Integer upgradeStatus2 = teeStatus2.getUpgradeStatus();
        if (upgradeStatus2 != null) {
            iIntValue = upgradeStatus2.intValue();
        } else {
            if (singleTeeStatusAndWarringInfo != null && (singleTeeStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) != null && (teeStatus3 = singleTeeStatus.getTeeStatus()) != null) {
                upgradeStatus = teeStatus3.getUpgradeStatus();
            }
            if (upgradeStatus == null) {
                i = 0;
                java.lang.String str7 = str4;
                java.lang.String str8 = str3;
                TeeStatusInfoEntity teeStatusInfoEntity = new TeeStatusInfoEntity(str7, str8, zIsCreated, zIsActive, expiredTimestamp, z4, false, userDisable, j, jCurrentTimeMillis2, model, i4, iOLrzqt5, i);
                fvg.AEQbTJ(str4, new SingleTeeStatusAndWarringInfo(new SingleTeeStatus(str7, str8, teeStatus2, new AddressVerifyStatus(z4), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), teeStatusInfoEntity.getHasShowExpiredAlert(), teeStatusInfoEntity.getCreateAt(), teeStatusInfoEntity.getUpdateAt(), C11600cUg.KWHzl(teeStatusInfoEntity.getCanUseSa2())));
                return teeStatusInfoEntity;
            }
            iIntValue = upgradeStatus.intValue();
        }
        i = iIntValue;
        java.lang.String str72 = str4;
        java.lang.String str82 = str3;
        TeeStatusInfoEntity teeStatusInfoEntity2 = new TeeStatusInfoEntity(str72, str82, zIsCreated, zIsActive, expiredTimestamp, z4, false, userDisable, j, jCurrentTimeMillis2, model, i4, iOLrzqt5, i);
        fvg.AEQbTJ(str4, new SingleTeeStatusAndWarringInfo(new SingleTeeStatus(str72, str82, teeStatus2, new AddressVerifyStatus(z4), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), teeStatusInfoEntity2.getHasShowExpiredAlert(), teeStatusInfoEntity2.getCreateAt(), teeStatusInfoEntity2.getUpdateAt(), C11600cUg.KWHzl(teeStatusInfoEntity2.getCanUseSa2())));
        return teeStatusInfoEntity2;
    }

    public final void AEQbTJ(java.lang.String str, SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo) {
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo2 = this.EZpvd.get(str);
        if (singleTeeStatusAndWarringInfo2 != null) {
            singleTeeStatusAndWarringInfo2.setSingleTeeStatus(singleTeeStatusAndWarringInfo.getSingleTeeStatus());
            singleTeeStatusAndWarringInfo2.setHasShowExpiredAlert(singleTeeStatusAndWarringInfo.getHasShowExpiredAlert());
            if (singleTeeStatusAndWarringInfo.getCreateAt() != 0) {
                singleTeeStatusAndWarringInfo2.setCreateAt(singleTeeStatusAndWarringInfo.getCreateAt());
            }
            if (singleTeeStatusAndWarringInfo.getUpdateAt() != 0) {
                singleTeeStatusAndWarringInfo2.setUpdateAt(singleTeeStatusAndWarringInfo.getUpdateAt());
            }
            singleTeeStatusAndWarringInfo2.setCanUseSa2(singleTeeStatusAndWarringInfo.getCanUseSa2());
            return;
        }
        this.EZpvd.put(str, singleTeeStatusAndWarringInfo);
    }

    public static /* synthetic */ java.lang.Object getTeeStatusFromCacheOrDB$default(fVG fvg, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return fvg.KWHzl(str, str2, (Continuation<? super SingleTeeStatusAndWarringInfo>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, Continuation<? super SingleTeeStatusAndWarringInfo> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1 teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1;
        fVG fvg;
        java.lang.String str3 = str;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1) {
            teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1 = (TeeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1 = new TeeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = this.EZpvd.get(str3);
            if (singleTeeStatusAndWarringInfo != null) {
                return singleTeeStatusAndWarringInfo;
            }
            C11498cQm c11498cQm = this.KWHzl;
            teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.L$0 = this;
            teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.L$1 = str3;
            teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.label = 1;
            objAEQbTJ = c11498cQm.AEQbTJ(str3, teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.L$1;
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$getTeeStatusFromCacheOrDB$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        TeeStatusInfoEntity teeStatusInfoEntity = (TeeStatusInfoEntity) objAEQbTJ;
        if (teeStatusInfoEntity == null) {
            return null;
        }
        java.lang.String str4 = str3;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo2 = new SingleTeeStatusAndWarringInfo(new SingleTeeStatus(str4, teeStatusInfoEntity.getTeeId(), new TeeStatus(teeStatusInfoEntity.isCreated(), teeStatusInfoEntity.isActive(), teeStatusInfoEntity.getExpiredTimestamp(), null, false, C56443yFo.KWHzl(C11600cUg.KWHzl(teeStatusInfoEntity.getAutoRenew())), C56443yFo.AEQbTJ(teeStatusInfoEntity.getUpgradeStatus()), null, teeStatusInfoEntity.getModel(), CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, null), new AddressVerifyStatus(teeStatusInfoEntity.isVerify()), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), teeStatusInfoEntity.getHasShowExpiredAlert(), teeStatusInfoEntity.getCreateAt(), teeStatusInfoEntity.getUpdateAt(), C11600cUg.KWHzl(teeStatusInfoEntity.getCanUseSa2()));
        fvg.AEQbTJ(str3, singleTeeStatusAndWarringInfo2);
        return singleTeeStatusAndWarringInfo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1 teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1) {
            teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1 = (TeeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1 = new TeeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C11498cQm c11498cQm = this.KWHzl;
            teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1.label = 1;
            objCopydefault = c11498cQm.copydefault(teeAnd7702StatusRepositoryImpl$getMaxExpiredTimestampAndCreatedTrue$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        TeeStatusInfoEntity teeStatusInfoEntity = (TeeStatusInfoEntity) objCopydefault;
        return C56443yFo.KWHzl(teeStatusInfoEntity != null ? teeStatusInfoEntity.getExpiredTimestamp() : 0L);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.biz.net.bean.TeeStatus.copy$default(com.okinc.business.defi.biz.net.bean.TeeStatus, boolean, boolean, long, java.lang.Integer, boolean, java.lang.Boolean, java.lang.Integer, java.lang.Integer, int, int, java.lang.Object):com.okinc.business.defi.biz.net.bean.TeeStatus */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, @NotNull Continuation<? super java.lang.Long> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1 teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1;
        fVG fvg;
        java.lang.String str3;
        long j2;
        java.lang.String str4 = str;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1) {
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1 = (TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1 = new TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1(this, continuation);
            }
        }
        TeeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1 teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12 = teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$1;
        java.lang.Object objKWHzl = teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$0 = this;
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$1 = str4;
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$2 = str2;
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.J$0 = j;
            teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.label = 1;
            objKWHzl = KWHzl(str4, str2, teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
            str3 = str2;
            j2 = j;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objKWHzl);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j3 = teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.J$0;
            java.lang.String str5 = (java.lang.String) teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$2;
            java.lang.String str6 = (java.lang.String) teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$1;
            fVG fvg2 = (fVG) teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            j2 = j3;
            str4 = str6;
            str3 = str5;
            fvg = fvg2;
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) objKWHzl;
        if (singleTeeStatusAndWarringInfo == null) {
            return C56443yFo.KWHzl(-1L);
        }
        TeeStatus teeStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus();
        TeeStatus teeStatusCopy = teeStatus.copy((TypedValues.PositionType.TYPE_PERCENT_Y & 1) != 0 ? teeStatus.isCreated : false, (TypedValues.PositionType.TYPE_PERCENT_Y & 2) != 0 ? teeStatus.isActive : false, (TypedValues.PositionType.TYPE_PERCENT_Y & 4) != 0 ? teeStatus.expiredTimestamp : j2, (TypedValues.PositionType.TYPE_PERCENT_Y & 8) != 0 ? teeStatus.extendExpirePeriodDay : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 16) != 0 ? teeStatus.userDisable : false, (TypedValues.PositionType.TYPE_PERCENT_Y & 32) != 0 ? teeStatus.autoRenew : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 64) != 0 ? teeStatus.upgradeStatus : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 128) != 0 ? teeStatus.disableReason : null, (TypedValues.PositionType.TYPE_PERCENT_Y & 256) != 0 ? teeStatus.model : 0);
        AddressVerifyStatus addressVerifyStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus();
        boolean zIsVerify = addressVerifyStatus != null ? addressVerifyStatus.isVerify() : false;
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCanUseSa2());
        teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$0 = null;
        teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$1 = null;
        teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.L$2 = null;
        teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12.label = 2;
        objKWHzl = saveTeeStatusToCacheAndDB$default(fvg, str4, str3, teeStatusCopy, zIsVerify, false, boolKWHzl, teeAnd7702StatusRepositoryImpl$updateTeeExpiredTimestamp$12, 16, null);
        return objKWHzl == objCopydefault ? objCopydefault : objKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1 teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1;
        fVG fvg;
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo;
        boolean z2;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1) {
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1 = (TeeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1 = new TeeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$0 = this;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$1 = str;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.Z$0 = z;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.label = 1;
            objKWHzl = KWHzl(str, str2, teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.Z$0;
                singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
                if (((java.lang.Number) objKWHzl).intValue() > 0) {
                    singleTeeStatusAndWarringInfo.setHasShowExpiredAlert(z2);
                }
                return Unit.INSTANCE;
            }
            z = teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.Z$0;
            str = (java.lang.String) teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$1;
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo2 = (SingleTeeStatusAndWarringInfo) objKWHzl;
        if (singleTeeStatusAndWarringInfo2 != null) {
            C11498cQm c11498cQm = fvg.KWHzl;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$0 = singleTeeStatusAndWarringInfo2;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.L$1 = null;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.Z$0 = z;
            teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1.label = 2;
            java.lang.Object objOLrzqt = c11498cQm.OLrzqt(str, z, teeAnd7702StatusRepositoryImpl$updateShowTeeWalletAlert$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            singleTeeStatusAndWarringInfo = singleTeeStatusAndWarringInfo2;
            objKWHzl = objOLrzqt;
            z2 = z;
            if (((java.lang.Number) objKWHzl).intValue() > 0) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017f A[PHI: r9 r10
  0x017f: PHI (r9v4 boolean) = (r9v3 boolean), (r9v3 boolean), (r9v10 boolean) binds: [B:35:0x0145, B:37:0x0157, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r10v3 boolean) = (r10v2 boolean), (r10v7 boolean), (r10v7 boolean) binds: [B:35:0x0145, B:37:0x0157, B:45:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0298 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [int] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull UpdateStatus updateStatus, @NotNull Continuation<? super java.lang.Integer> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$updateStatus$1 teeAnd7702StatusRepositoryImpl$updateStatus$1;
        UpdateStatus updateStatus2;
        java.lang.Object objKWHzl;
        java.lang.String str3;
        fVG fvg;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.String str4 = str;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$updateStatus$1) {
            teeAnd7702StatusRepositoryImpl$updateStatus$1 = (TeeAnd7702StatusRepositoryImpl$updateStatus$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$updateStatus$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$updateStatus$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$updateStatus$1 = new TeeAnd7702StatusRepositoryImpl$updateStatus$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = teeAnd7702StatusRepositoryImpl$updateStatus$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$updateStatus$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            teeAnd7702StatusRepositoryImpl$updateStatus$1.L$0 = this;
            teeAnd7702StatusRepositoryImpl$updateStatus$1.L$1 = str4;
            teeAnd7702StatusRepositoryImpl$updateStatus$1.L$2 = str2;
            updateStatus2 = updateStatus;
            teeAnd7702StatusRepositoryImpl$updateStatus$1.L$3 = updateStatus2;
            teeAnd7702StatusRepositoryImpl$updateStatus$1.label = 1;
            objKWHzl = KWHzl(str4, str2, teeAnd7702StatusRepositoryImpl$updateStatus$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str3 = str2;
            fvg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                return objOLrzqt;
            }
            UpdateStatus updateStatus3 = (UpdateStatus) teeAnd7702StatusRepositoryImpl$updateStatus$1.L$3;
            java.lang.String str5 = (java.lang.String) teeAnd7702StatusRepositoryImpl$updateStatus$1.L$2;
            java.lang.String str6 = (java.lang.String) teeAnd7702StatusRepositoryImpl$updateStatus$1.L$1;
            fVG fvg2 = (fVG) teeAnd7702StatusRepositoryImpl$updateStatus$1.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            str3 = str5;
            fvg = fvg2;
            updateStatus2 = updateStatus3;
            str4 = str6;
            objKWHzl = objOLrzqt;
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) objKWHzl;
        if (singleTeeStatusAndWarringInfo == null) {
            z = false;
            SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo2 = new SingleTeeStatusAndWarringInfo(new SingleTeeStatus(str4, str3, new TeeStatus(false, false, 0L, null, false, null, null, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null), new AddressVerifyStatus(false), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null), false, 0L, 0L, false, 12, 0 == true ? 1 : 0);
            fvg.AEQbTJ(str4, singleTeeStatusAndWarringInfo2);
            singleTeeStatusAndWarringInfo = singleTeeStatusAndWarringInfo2;
        } else {
            z = false;
        }
        boolean zIsCreated = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isCreated();
        boolean zIsActive = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isActive();
        boolean userDisable = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUserDisable();
        long expiredTimestamp = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getExpiredTimestamp();
        java.lang.Boolean autoRenew = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getAutoRenew();
        java.lang.Integer upgradeStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUpgradeStatus();
        AddressVerifyStatus addressVerifyStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus();
        boolean zIsVerify = addressVerifyStatus != null ? addressVerifyStatus.isVerify() : z;
        if (updateStatus2.isCreated() != null) {
            zIsCreated = updateStatus2.isCreated().booleanValue();
        }
        if (updateStatus2.isDisabledByUser() != null) {
            userDisable = updateStatus2.isDisabledByUser().booleanValue();
        }
        if (updateStatus2.isActive() != null) {
            zIsActive = updateStatus2.isActive().booleanValue();
            if (updateStatus2.isActive().booleanValue()) {
                boolean z5 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isCreated() ? zIsCreated : true;
                if (singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUserDisable()) {
                    z2 = z5;
                    z3 = zIsActive;
                    z4 = z;
                    if (updateStatus2.getExpiredTimestamp() != null) {
                    }
                    long j = expiredTimestamp;
                    if (updateStatus2.getAutoRenew() != null) {
                    }
                    java.lang.Boolean bool = autoRenew;
                    if (updateStatus2.getUpgradeStatus() != null) {
                    }
                    java.lang.Integer num = upgradeStatus;
                    if (updateStatus2.isVerify() != null) {
                    }
                    singleTeeStatusAndWarringInfo.setSingleTeeStatus(new SingleTeeStatus(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeId(), new TeeStatus(z2, z3, j, null, z4, bool, num, null, 0, 392, null), new AddressVerifyStatus(zIsVerify), null, null, C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCanUseSa2()), 48, null));
                    fvg.copydefault(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus());
                    C11498cQm c11498cQm = fvg.KWHzl;
                    boolean zIsCreated2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isCreated();
                    boolean zIsActive2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isActive();
                    long expiredTimestamp2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getExpiredTimestamp();
                    AddressVerifyStatus addressVerifyStatus2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus();
                    if (addressVerifyStatus2 != null) {
                    }
                    boolean hasShowExpiredAlert = singleTeeStatusAndWarringInfo.getHasShowExpiredAlert();
                    boolean userDisable2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUserDisable();
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    java.lang.Boolean autoRenew2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getAutoRenew();
                    int iOLrzqt = C11600cUg.OLrzqt(autoRenew2 != null ? autoRenew2.booleanValue() : z);
                    java.lang.Integer upgradeStatus2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUpgradeStatus();
                    PartTeeStatusInfoEntity partTeeStatusInfoEntity = new PartTeeStatusInfoEntity(str4, zIsCreated2, zIsActive2, expiredTimestamp2, zIsVerify, hasShowExpiredAlert, userDisable2, jCurrentTimeMillis, 0, iOLrzqt, upgradeStatus2 != null ? upgradeStatus2.intValue() : z, 256, null);
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$0 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$1 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$2 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$3 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.label = 2;
                    objOLrzqt = c11498cQm.OLrzqt(partTeeStatusInfoEntity, teeAnd7702StatusRepositoryImpl$updateStatus$1);
                    if (objOLrzqt == objCopydefault) {
                    }
                } else {
                    zIsCreated = z5;
                    z2 = zIsCreated;
                    z3 = zIsActive;
                    z4 = userDisable;
                    if (updateStatus2.getExpiredTimestamp() != null) {
                    }
                    long j2 = expiredTimestamp;
                    if (updateStatus2.getAutoRenew() != null) {
                    }
                    java.lang.Boolean bool2 = autoRenew;
                    if (updateStatus2.getUpgradeStatus() != null) {
                    }
                    java.lang.Integer num2 = upgradeStatus;
                    if (updateStatus2.isVerify() != null) {
                    }
                    singleTeeStatusAndWarringInfo.setSingleTeeStatus(new SingleTeeStatus(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeId(), new TeeStatus(z2, z3, j2, null, z4, bool2, num2, null, 0, 392, null), new AddressVerifyStatus(zIsVerify), null, null, C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCanUseSa2()), 48, null));
                    fvg.copydefault(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus());
                    C11498cQm c11498cQm2 = fvg.KWHzl;
                    boolean zIsCreated22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isCreated();
                    boolean zIsActive22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isActive();
                    long expiredTimestamp22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getExpiredTimestamp();
                    AddressVerifyStatus addressVerifyStatus22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus();
                    if (addressVerifyStatus22 != null) {
                    }
                    boolean hasShowExpiredAlert2 = singleTeeStatusAndWarringInfo.getHasShowExpiredAlert();
                    boolean userDisable22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUserDisable();
                    long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
                    java.lang.Boolean autoRenew22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getAutoRenew();
                    int iOLrzqt2 = C11600cUg.OLrzqt(autoRenew22 != null ? autoRenew22.booleanValue() : z);
                    java.lang.Integer upgradeStatus22 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUpgradeStatus();
                    PartTeeStatusInfoEntity partTeeStatusInfoEntity2 = new PartTeeStatusInfoEntity(str4, zIsCreated22, zIsActive22, expiredTimestamp22, zIsVerify, hasShowExpiredAlert2, userDisable22, jCurrentTimeMillis2, 0, iOLrzqt2, upgradeStatus22 != null ? upgradeStatus22.intValue() : z, 256, null);
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$0 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$1 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$2 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.L$3 = null;
                    teeAnd7702StatusRepositoryImpl$updateStatus$1.label = 2;
                    objOLrzqt = c11498cQm2.OLrzqt(partTeeStatusInfoEntity2, teeAnd7702StatusRepositoryImpl$updateStatus$1);
                    if (objOLrzqt == objCopydefault) {
                    }
                }
            } else {
                z2 = zIsCreated;
                z3 = zIsActive;
                z4 = userDisable;
                if (updateStatus2.getExpiredTimestamp() != null) {
                    expiredTimestamp = updateStatus2.getExpiredTimestamp().longValue();
                }
                long j22 = expiredTimestamp;
                if (updateStatus2.getAutoRenew() != null) {
                    autoRenew = updateStatus2.getAutoRenew();
                }
                java.lang.Boolean bool22 = autoRenew;
                if (updateStatus2.getUpgradeStatus() != null) {
                    upgradeStatus = updateStatus2.getUpgradeStatus();
                }
                java.lang.Integer num22 = upgradeStatus;
                if (updateStatus2.isVerify() != null) {
                    zIsVerify = updateStatus2.isVerify().booleanValue();
                }
                singleTeeStatusAndWarringInfo.setSingleTeeStatus(new SingleTeeStatus(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeId(), new TeeStatus(z2, z3, j22, null, z4, bool22, num22, null, 0, 392, null), new AddressVerifyStatus(zIsVerify), null, null, C56443yFo.KWHzl(singleTeeStatusAndWarringInfo.getCanUseSa2()), 48, null));
                fvg.copydefault(str4, singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus());
                C11498cQm c11498cQm22 = fvg.KWHzl;
                boolean zIsCreated222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isCreated();
                boolean zIsActive222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().isActive();
                long expiredTimestamp222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getExpiredTimestamp();
                AddressVerifyStatus addressVerifyStatus222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getAddressVerifyStatus();
                boolean zIsVerify2 = addressVerifyStatus222 != null ? addressVerifyStatus222.isVerify() : z;
                boolean hasShowExpiredAlert22 = singleTeeStatusAndWarringInfo.getHasShowExpiredAlert();
                boolean userDisable222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUserDisable();
                long jCurrentTimeMillis22 = java.lang.System.currentTimeMillis();
                java.lang.Boolean autoRenew222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getAutoRenew();
                int iOLrzqt22 = C11600cUg.OLrzqt(autoRenew222 != null ? autoRenew222.booleanValue() : z);
                java.lang.Integer upgradeStatus222 = singleTeeStatusAndWarringInfo.getSingleTeeStatus().getTeeStatus().getUpgradeStatus();
                PartTeeStatusInfoEntity partTeeStatusInfoEntity22 = new PartTeeStatusInfoEntity(str4, zIsCreated222, zIsActive222, expiredTimestamp222, zIsVerify2, hasShowExpiredAlert22, userDisable222, jCurrentTimeMillis22, 0, iOLrzqt22, upgradeStatus222 != null ? upgradeStatus222.intValue() : z, 256, null);
                teeAnd7702StatusRepositoryImpl$updateStatus$1.L$0 = null;
                teeAnd7702StatusRepositoryImpl$updateStatus$1.L$1 = null;
                teeAnd7702StatusRepositoryImpl$updateStatus$1.L$2 = null;
                teeAnd7702StatusRepositoryImpl$updateStatus$1.L$3 = null;
                teeAnd7702StatusRepositoryImpl$updateStatus$1.label = 2;
                objOLrzqt = c11498cQm22.OLrzqt(partTeeStatusInfoEntity22, teeAnd7702StatusRepositoryImpl$updateStatus$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return objOLrzqt;
    }

    public final void copydefault(java.lang.String str, TeeStatus teeStatus) {
        ((dTP) C43251rlk.copydefault(dTP.class)).OLrzqt(C17922fXg.AEQbTJ(teeStatus, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.fVJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull dTK dtk, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TeeAnd7702StatusRepositoryImpl$setTeeModel$1 teeAnd7702StatusRepositoryImpl$setTeeModel$1;
        java.lang.String str2;
        fVG fvg;
        dTK dtk2;
        java.lang.String teeId;
        TeeStatus teeStatus;
        SingleTeeStatus singleTeeStatus;
        AddressVerifyStatus addressVerifyStatus;
        SingleTeeStatus singleTeeStatus2;
        SingleTeeStatus singleTeeStatus3;
        SingleTeeStatus singleTeeStatus4;
        TeeStatus teeStatus2;
        if (continuation instanceof TeeAnd7702StatusRepositoryImpl$setTeeModel$1) {
            teeAnd7702StatusRepositoryImpl$setTeeModel$1 = (TeeAnd7702StatusRepositoryImpl$setTeeModel$1) continuation;
            int i = teeAnd7702StatusRepositoryImpl$setTeeModel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                teeAnd7702StatusRepositoryImpl$setTeeModel$1.label = i - Integer.MIN_VALUE;
            } else {
                teeAnd7702StatusRepositoryImpl$setTeeModel$1 = new TeeAnd7702StatusRepositoryImpl$setTeeModel$1(this, continuation);
            }
        }
        TeeAnd7702StatusRepositoryImpl$setTeeModel$1 teeAnd7702StatusRepositoryImpl$setTeeModel$12 = teeAnd7702StatusRepositoryImpl$setTeeModel$1;
        java.lang.Object teeStatusFromCacheOrDB$default = teeAnd7702StatusRepositoryImpl$setTeeModel$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = teeAnd7702StatusRepositoryImpl$setTeeModel$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(teeStatusFromCacheOrDB$default);
            teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$0 = this;
            str2 = str;
            teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$1 = str2;
            teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$2 = dtk;
            teeAnd7702StatusRepositoryImpl$setTeeModel$12.label = 1;
            teeStatusFromCacheOrDB$default = getTeeStatusFromCacheOrDB$default(this, str, null, teeAnd7702StatusRepositoryImpl$setTeeModel$12, 2, null);
            if (teeStatusFromCacheOrDB$default == objCopydefault) {
                return objCopydefault;
            }
            fvg = this;
            dtk2 = dtk;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(teeStatusFromCacheOrDB$default);
                return Unit.INSTANCE;
            }
            dtk2 = (dTK) teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$2;
            java.lang.String str3 = (java.lang.String) teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$1;
            fvg = (fVG) teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$0;
            C56391yDq.AEQbTJ(teeStatusFromCacheOrDB$default);
            str2 = str3;
        }
        SingleTeeStatusAndWarringInfo singleTeeStatusAndWarringInfo = (SingleTeeStatusAndWarringInfo) teeStatusFromCacheOrDB$default;
        if (singleTeeStatusAndWarringInfo != null && (singleTeeStatus4 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) != null && (teeStatus2 = singleTeeStatus4.getTeeStatus()) != null) {
            teeStatus2.setModel(dtk2.OLrzqt());
        }
        if (singleTeeStatusAndWarringInfo == null || (singleTeeStatus3 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeId = singleTeeStatus3.getTeeId()) == null) {
            teeId = "";
        }
        java.lang.String str4 = teeId;
        if (singleTeeStatusAndWarringInfo == null || (singleTeeStatus2 = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (teeStatus = singleTeeStatus2.getTeeStatus()) == null) {
            teeStatus = new TeeStatus(true, false, 0L, null, false, null, null, null, 0, TypedValues.PositionType.TYPE_PERCENT_HEIGHT, null);
        }
        TeeStatus teeStatus3 = teeStatus;
        boolean zIsVerify = (singleTeeStatusAndWarringInfo == null || (singleTeeStatus = singleTeeStatusAndWarringInfo.getSingleTeeStatus()) == null || (addressVerifyStatus = singleTeeStatus.getAddressVerifyStatus()) == null) ? false : addressVerifyStatus.isVerify();
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(singleTeeStatusAndWarringInfo != null ? singleTeeStatusAndWarringInfo.getCanUseSa2() : false);
        teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$0 = null;
        teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$1 = null;
        teeAnd7702StatusRepositoryImpl$setTeeModel$12.L$2 = null;
        teeAnd7702StatusRepositoryImpl$setTeeModel$12.label = 2;
        if (fvg.OLrzqt(str2, str4, teeStatus3, zIsVerify, false, boolKWHzl, teeAnd7702StatusRepositoryImpl$setTeeModel$12) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final int copydefault(java.util.List<Eip7702StatusItem> list) {
        java.util.Iterator<T> it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            int i = StateListAnimator.AEQbTJ[EIP7702WalletStatus.Companion.KWHzl(java.lang.Integer.valueOf(((Eip7702StatusItem) it.next()).getStatus())).ordinal()];
            if (i == 1) {
                z2 = true;
            } else if (i == 2) {
                z = true;
            }
        }
        if (z) {
            return EIP7702WalletStatus.UpgradedNonOKX.getStatus();
        }
        if (z2) {
            return EIP7702WalletStatus.UpgradedOKX.getStatus();
        }
        return EIP7702WalletStatus.NeedUpgrade.getStatus();
    }
}

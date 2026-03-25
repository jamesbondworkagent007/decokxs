package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dexlogic.bean.ApproveUnsignedData;
import com.okinc.business.dexlogic.bean.DeFiPlatformTokenApprovalInfo;
import com.okinc.business.trade.features.home.meme.repository.MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2;
import com.okinc.business.trade.features.home.meme.repository.MemeMarketApproveRepositoryImpl$getApproveInfoMapCache$1;
import com.okinc.business.trade.features.home.meme.repository.MemeMarketApproveRepositoryImpl$getApproveUnsignedData$2;
import com.okinc.business.trade.features.home.meme.repository.MemeMarketApproveRepositoryImpl$setApprovingState$1;
import com.okinc.network.okg.response.OKServerException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28290kVy implements InterfaceC28282kVq {
    public androidx.collection.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> KWHzl;
    public final InterfaceC23234huQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28282kVq
    public androidx.collection.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> EZpvd() {
        return this.KWHzl;
    }

    @yCM
    public C28290kVy(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.copydefault = interfaceC23234huQ;
        this.KWHzl = new androidx.collection.LruCache<>(15);
    }

    @Override // o.InterfaceC28282kVq
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeMarketApproveRepositoryImpl$getApproveAllowanceStatusForOKXPlatform$2(this, str2, str, str3, str4, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC28282kVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> continuation) throws java.lang.Throwable {
        MemeMarketApproveRepositoryImpl$getApproveInfoMapCache$1 memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1;
        C28290kVy c28290kVy;
        if (continuation instanceof MemeMarketApproveRepositoryImpl$getApproveInfoMapCache$1) {
            memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1 = (MemeMarketApproveRepositoryImpl$getApproveInfoMapCache$1) continuation;
            int i = memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1 = new MemeMarketApproveRepositoryImpl$getApproveInfoMapCache$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.L$0 = this;
            memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.label = 1;
            objEZpvd = EZpvd(str, str2, memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c28290kVy = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c28290kVy = (C28290kVy) memeMarketApproveRepositoryImpl$getApproveInfoMapCache$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return c28290kVy.KWHzl.get((java.lang.String) objEZpvd);
    }

    @Override // o.InterfaceC28282kVq
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<ApproveUnsignedData, OKServerException>> continuation) {
        return kAB.EZpvd(new MemeMarketApproveRepositoryImpl$getApproveUnsignedData$2(this, str, str2, str3, str5, str6, null), continuation);
    }

    @Override // o.InterfaceC28282kVq
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.String> continuation) {
        return str + "_" + str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // o.InterfaceC28282kVq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        MemeMarketApproveRepositoryImpl$setApprovingState$1 memeMarketApproveRepositoryImpl$setApprovingState$1;
        java.lang.String str5;
        C28290kVy c28290kVy;
        java.lang.String str6;
        androidx.collection.LruCache lruCache;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.util.Map map;
        java.lang.String str10;
        java.lang.String str11;
        C28290kVy c28290kVy2;
        java.lang.Object obj;
        if (continuation instanceof MemeMarketApproveRepositoryImpl$setApprovingState$1) {
            memeMarketApproveRepositoryImpl$setApprovingState$1 = (MemeMarketApproveRepositoryImpl$setApprovingState$1) continuation;
            int i = memeMarketApproveRepositoryImpl$setApprovingState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                memeMarketApproveRepositoryImpl$setApprovingState$1.label = i - Integer.MIN_VALUE;
            } else {
                memeMarketApproveRepositoryImpl$setApprovingState$1 = new MemeMarketApproveRepositoryImpl$setApprovingState$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = memeMarketApproveRepositoryImpl$setApprovingState$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = memeMarketApproveRepositoryImpl$setApprovingState$1.label;
        boolean z = true;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.String str12 = str2 == null ? "" : str2;
            androidx.collection.LruCache<java.lang.String, java.util.Map<java.lang.String, DeFiPlatformTokenApprovalInfo>> lruCache2 = this.KWHzl;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$0 = this;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$1 = str;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$2 = str2;
            str5 = str3;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$3 = str5;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$4 = str4;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$5 = str12;
            memeMarketApproveRepositoryImpl$setApprovingState$1.L$6 = lruCache2;
            memeMarketApproveRepositoryImpl$setApprovingState$1.label = 1;
            java.lang.Object objEZpvd2 = EZpvd(str, str12, memeMarketApproveRepositoryImpl$setApprovingState$1);
            if (objEZpvd2 == objCopydefault) {
                return objCopydefault;
            }
            c28290kVy = this;
            str6 = str;
            lruCache = lruCache2;
            str7 = str4;
            str8 = str2;
            str9 = str12;
            objEZpvd = objEZpvd2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (java.util.Map) memeMarketApproveRepositoryImpl$setApprovingState$1.L$3;
                str10 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$2;
                str11 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$1;
                c28290kVy2 = (C28290kVy) memeMarketApproveRepositoryImpl$setApprovingState$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                java.lang.String str13 = (java.lang.String) objEZpvd;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    java.lang.Object key = entry.getKey();
                    java.lang.String str14 = (java.lang.String) entry.getKey();
                    DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfoCopy$default = (DeFiPlatformTokenApprovalInfo) entry.getValue();
                    if (Intrinsics.EZpvd((java.lang.Object) str14, (java.lang.Object) str10)) {
                        obj = key;
                        deFiPlatformTokenApprovalInfoCopy$default = DeFiPlatformTokenApprovalInfo.copy$default(deFiPlatformTokenApprovalInfoCopy$default, null, null, null, null, str11, false, null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, null);
                    } else {
                        obj = key;
                    }
                    linkedHashMap.put(obj, deFiPlatformTokenApprovalInfoCopy$default);
                }
                c28290kVy2.KWHzl.put(str13, linkedHashMap);
                return C56443yFo.KWHzl(z);
            }
            lruCache = (androidx.collection.LruCache) memeMarketApproveRepositoryImpl$setApprovingState$1.L$6;
            str9 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$5;
            str7 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$4;
            str5 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$3;
            str8 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$2;
            str6 = (java.lang.String) memeMarketApproveRepositoryImpl$setApprovingState$1.L$1;
            c28290kVy = (C28290kVy) memeMarketApproveRepositoryImpl$setApprovingState$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        map = (java.util.Map) lruCache.get(objEZpvd);
        if (map != null) {
            DeFiPlatformTokenApprovalInfo deFiPlatformTokenApprovalInfo = (DeFiPlatformTokenApprovalInfo) map.get(str7);
            if (C23311hvo.copydefault(str6, deFiPlatformTokenApprovalInfo != null ? deFiPlatformTokenApprovalInfo.getTokenContractAddress() : null, str8)) {
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$0 = c28290kVy;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$1 = str5;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$2 = str7;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$3 = map;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$4 = null;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$5 = null;
                memeMarketApproveRepositoryImpl$setApprovingState$1.L$6 = null;
                memeMarketApproveRepositoryImpl$setApprovingState$1.label = 2;
                objEZpvd = c28290kVy.EZpvd(str6, str9, memeMarketApproveRepositoryImpl$setApprovingState$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                str10 = str7;
                str11 = str5;
                c28290kVy2 = c28290kVy;
                java.lang.String str132 = (java.lang.String) objEZpvd;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(map.size()));
                while (r1.hasNext()) {
                }
                c28290kVy2.KWHzl.put(str132, linkedHashMap2);
                return C56443yFo.KWHzl(z);
            }
        }
        z = false;
        return C56443yFo.KWHzl(z);
    }

    @Override // o.InterfaceC28282kVq
    public void AEQbTJ() {
        this.KWHzl.evictAll();
    }
}

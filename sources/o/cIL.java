package o;

import com.okinc.business.defi.biz.constant.CustomChainStatus;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cIL {
    java.util.List<CustomChainMetaEntity> AEQbTJ(long j);

    void AEQbTJ(long j, @NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.util.List<CustomChainCoinBalanceEntity> list);

    void AYXKKw(@NotNull java.util.List<CustomChainCoinBalanceEntity> list);

    void AhwBna(@NotNull java.util.List<CustomChainMetaEntity> list);

    void DbNXlk(@NotNull java.util.List<kotlin.Pair<java.lang.Long, java.lang.Long>> list);

    int EZpvd(long j, @NotNull java.lang.String str);

    long EZpvd(@NotNull CustomChainMetaStatusEntity customChainMetaStatusEntity);

    void EZpvd(long j, int i);

    void EZpvd(long j, long j2);

    void EZpvd(@NotNull java.util.List<java.lang.Long> list);

    int KWHzl(@NotNull java.lang.String str, long j);

    java.lang.Object KWHzl(@NotNull java.util.HashSet<java.lang.Long> hashSet, @NotNull Continuation<? super java.lang.Integer> continuation);

    java.util.List<cSW> KWHzl();

    java.util.List<java.lang.Long> KWHzl(@NotNull java.util.List<CustomChainAddressEntity> list);

    void KWHzl(long j, @NotNull java.lang.String str);

    void KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2);

    void KWHzl(@NotNull java.util.List<CustomChainMetaEntity> list, @NotNull java.util.List<CustomChainMetaStatusEntity> list2, @NotNull java.util.List<java.lang.Long> list3, @NotNull java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list4);

    long OLrzqt(@NotNull CustomChainWalletCoinEntity customChainWalletCoinEntity);

    java.util.List<CustomChainMetaStatusEntity> OLrzqt();

    java.util.List<CustomChainCoinMetaEntity> OLrzqt(long j);

    java.util.List<cSW> OLrzqt(java.lang.Long l, java.lang.String str);

    void OLrzqt(long j, @NotNull java.lang.String str);

    void OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, long j2);

    void OLrzqt(@NotNull CustomChainCoinMetaEntity customChainCoinMetaEntity);

    void OLrzqt(@NotNull java.util.List<CustomChainMetaEntity> list);

    java.util.List<CustomChainMetaEntity> copydefault();

    void copydefault(long j, @NotNull java.lang.String str);

    void copydefault(@NotNull CustomChainCoinMetaEntity customChainCoinMetaEntity);

    void copydefault(@NotNull CustomChainMetaEntity customChainMetaEntity);

    void copydefault(@NotNull java.lang.String str, long j);

    void copydefault(@NotNull java.util.List<java.lang.Long> list);

    void copydefault(@NotNull java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list, @NotNull CustomChainMetaEntity customChainMetaEntity);

    java.util.List<java.lang.Long> djBIcL(@NotNull java.util.List<CustomChainWalletCoinEntity> list);

    java.util.List<java.lang.Long> gEmmrt(@NotNull java.util.List<CustomChainMetaStatusEntity> list);

    void valueOf(@NotNull java.util.List<CustomChainCoinMetaEntity> list);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static void AEQbTJ(@NotNull cIL cil, @NotNull java.util.List<CustomChainMetaEntity> list, @NotNull java.util.List<CustomChainMetaStatusEntity> list2, @NotNull java.util.List<java.lang.Long> list3, @NotNull java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list4) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            cil.AhwBna(list);
            cil.copydefault(list3);
            cil.gEmmrt(list2);
            cil.EZpvd(list3);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                CustomChainCoinMetaEntity nativeToken = ((CustomChainMetaEntity) it.next()).getNativeToken();
                if (nativeToken != null) {
                    arrayList.add(nativeToken);
                    java.util.Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        Triple triple = (Triple) it2.next();
                        arrayList2.add(new CustomChainAddressEntity((java.lang.String) triple.getFirst(), nativeToken.getCoinId(), ((ChainAddressEntity) triple.getThird()).getAddress(), ((ChainAddressEntity) triple.getThird()).getPublicKey(), ((ChainAddressEntity) triple.getThird()).getDerivePath(), jCurrentTimeMillis));
                        it = it;
                        nativeToken = nativeToken;
                    }
                }
                it = it;
            }
            if (!arrayList.isEmpty()) {
                cil.valueOf(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                cil.KWHzl(arrayList2);
            }
        }

        public static void copydefault(@NotNull cIL cil, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            cil.OLrzqt(j, str, str3, str4, j2);
            cil.copydefault(str2, j);
            cil.EZpvd(j, CustomChainStatus.Edit.getValue());
        }

        public static void AEQbTJ(@NotNull cIL cil, long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            cil.EZpvd(j, str);
            cil.OLrzqt(j, str);
        }

        public static void EZpvd(@NotNull cIL cil, long j, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            cil.copydefault(j, str);
            if (cil.AEQbTJ(j).isEmpty()) {
                cil.EZpvd(j, CustomChainStatus.Delete.getValue());
            }
        }

        public static void AEQbTJ(@NotNull cIL cil, @NotNull CustomChainCoinMetaEntity customChainCoinMetaEntity) {
            Intrinsics.checkNotNullParameter(customChainCoinMetaEntity, "");
            cil.OLrzqt(customChainCoinMetaEntity);
            cil.EZpvd(customChainCoinMetaEntity.getChainId(), CustomChainStatus.Edit.getValue());
        }

        public static void OLrzqt(@NotNull cIL cil, @NotNull java.util.List<CustomChainCoinBalanceEntity> list) {
            CustomChainCoinMetaEntity customChainCoinMetaEntity;
            Intrinsics.checkNotNullParameter(list, "");
            cil.AYXKKw(list);
            for (CustomChainCoinBalanceEntity customChainCoinBalanceEntity : list) {
                if (C33129mqd.AEQbTJ(customChainCoinBalanceEntity.getAmount(), "0") && (customChainCoinMetaEntity = (CustomChainCoinMetaEntity) CollectionsKt___CollectionsKt.firstOrNull(cil.OLrzqt(customChainCoinBalanceEntity.getCoinId()))) != null) {
                    cil.EZpvd(customChainCoinMetaEntity.getChainId(), CustomChainStatus.Edit.getValue());
                }
            }
        }

        public static void KWHzl(@NotNull cIL cil, @NotNull java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list, @NotNull CustomChainMetaEntity customChainMetaEntity) {
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(customChainMetaEntity, "");
            cil.copydefault(customChainMetaEntity);
            cil.EZpvd(new CustomChainMetaStatusEntity(customChainMetaEntity.getChainId(), CustomChainStatus.Edit.getValue()));
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            CustomChainCoinMetaEntity nativeToken = customChainMetaEntity.getNativeToken();
            if (nativeToken != null) {
                cil.OLrzqt(nativeToken);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Triple triple = (Triple) it.next();
                    java.lang.String str = (java.lang.String) triple.getFirst();
                    ChainAddressEntity chainAddressEntity = (ChainAddressEntity) triple.getThird();
                    arrayList.add(new CustomChainAddressEntity(str, nativeToken.getCoinId(), chainAddressEntity.getAddress(), chainAddressEntity.getPublicKey(), chainAddressEntity.getDerivePath(), jCurrentTimeMillis));
                }
                cil.KWHzl(arrayList);
                java.util.Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((java.lang.Boolean) ((Triple) next).getSecond()).booleanValue()) {
                            break;
                        }
                    }
                }
                Triple triple2 = (Triple) next;
                if (triple2 != null) {
                    cil.OLrzqt(new CustomChainWalletCoinEntity((java.lang.String) triple2.getFirst(), nativeToken.getCoinId(), jCurrentTimeMillis));
                }
            }
        }

        public static void KWHzl(@NotNull cIL cil, @NotNull java.util.List<kotlin.Pair<java.lang.Long, java.lang.Long>> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.Pair pair = (kotlin.Pair) it.next();
                cil.EZpvd(((java.lang.Number) pair.component1()).longValue(), ((java.lang.Number) pair.component2()).longValue());
            }
        }
    }
}

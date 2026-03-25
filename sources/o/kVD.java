package o;

import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$getUserPresetConfig$2;
import com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetReset$1;
import com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetReset$legacyCall$1;
import com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetSave$1;
import com.okinc.business.trade.features.home.meme.repository.PresetUserConfigRepositoryImpl$presetSave$legacyCall$1;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.network.okg.response.OKServerException;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVD implements kVC {
    public final kVH AEQbTJ;
    public final InterfaceC23234huQ EZpvd;
    public final java.util.Map<java.lang.String, DexPresetResultVO> KWHzl;
    public final InterfaceC25414iwK OLrzqt;

    @yCM
    public kVD(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull InterfaceC25414iwK interfaceC25414iwK, @NotNull kVH kvh) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(interfaceC25414iwK, "");
        Intrinsics.checkNotNullParameter(kvh, "");
        this.EZpvd = interfaceC23234huQ;
        this.OLrzqt = interfaceC25414iwK;
        this.AEQbTJ = kvh;
        this.KWHzl = new LinkedHashMap();
    }

    @Override // o.kVC
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>> continuation) {
        return kAB.EZpvd(new PresetUserConfigRepositoryImpl$getUserPresetConfig$2(this, str, str2, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // o.kVC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<DexPresetResultVO, OKServerException>> continuation) throws java.lang.Throwable {
        PresetUserConfigRepositoryImpl$presetReset$1 presetUserConfigRepositoryImpl$presetReset$1;
        java.lang.String str4;
        java.lang.Object objM7386unboximpl;
        java.lang.String str5;
        kVD kvd;
        java.lang.String str6;
        Function1 function1;
        PresetUserConfigBean presetUserConfigBean;
        PresetUserConfigBean presetUserConfigBeanEZpvd;
        if (continuation instanceof PresetUserConfigRepositoryImpl$presetReset$1) {
            presetUserConfigRepositoryImpl$presetReset$1 = (PresetUserConfigRepositoryImpl$presetReset$1) continuation;
            int i = presetUserConfigRepositoryImpl$presetReset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetUserConfigRepositoryImpl$presetReset$1.label = i - Integer.MIN_VALUE;
            } else {
                presetUserConfigRepositoryImpl$presetReset$1 = new PresetUserConfigRepositoryImpl$presetReset$1(this, continuation);
            }
        }
        PresetUserConfigRepositoryImpl$presetReset$1 presetUserConfigRepositoryImpl$presetReset$12 = presetUserConfigRepositoryImpl$presetReset$1;
        java.lang.Object objInvoke = presetUserConfigRepositoryImpl$presetReset$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = presetUserConfigRepositoryImpl$presetReset$12.label;
        if (i2 != 0) {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objInvoke);
            }
            if (i2 == 2) {
                C56391yDq.AEQbTJ(objInvoke);
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    C56391yDq.AEQbTJ(objInvoke);
                }
                if (i2 == 5) {
                    C56391yDq.AEQbTJ(objInvoke);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function1 = (Function1) presetUserConfigRepositoryImpl$presetReset$12.L$4;
            str5 = (java.lang.String) presetUserConfigRepositoryImpl$presetReset$12.L$3;
            str4 = (java.lang.String) presetUserConfigRepositoryImpl$presetReset$12.L$2;
            str6 = (java.lang.String) presetUserConfigRepositoryImpl$presetReset$12.L$1;
            kvd = (kVD) presetUserConfigRepositoryImpl$presetReset$12.L$0;
            C56391yDq.AEQbTJ(objInvoke);
            objM7386unboximpl = ((Result) objInvoke).m7386unboximpl();
            if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
                pUU.valueOf("PresetUserConfigRepositoryImpl", "Rust failed, fallback to native");
                presetUserConfigRepositoryImpl$presetReset$12.L$0 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$1 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$2 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$3 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$4 = null;
                presetUserConfigRepositoryImpl$presetReset$12.label = 4;
                objInvoke = function1.invoke(presetUserConfigRepositoryImpl$presetReset$12);
                return objInvoke == objCopydefault ? objCopydefault : objInvoke;
            }
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            C2292AGd c2292AGd = (C2292AGd) objM7386unboximpl;
            if (c2292AGd == null) {
                presetUserConfigRepositoryImpl$presetReset$12.L$0 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$1 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$2 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$3 = null;
                presetUserConfigRepositoryImpl$presetReset$12.L$4 = null;
                presetUserConfigRepositoryImpl$presetReset$12.label = 5;
                objInvoke = function1.invoke(presetUserConfigRepositoryImpl$presetReset$12);
                return objInvoke == objCopydefault ? objCopydefault : objInvoke;
            }
            C2294AGf c2294AGf = (C2294AGf) CollectionsKt___CollectionsKt.firstOrNull(c2292AGd.AEQbTJ());
            if (c2294AGf != null && (presetUserConfigBeanEZpvd = kVF.EZpvd(c2294AGf)) != null) {
                kvd.EZpvd(str4, str6, str5, presetUserConfigBeanEZpvd);
            }
            DexPresetResultVO dexPresetResultVOOLrzqt = kvd.OLrzqt(str6, str5);
            if (dexPresetResultVOOLrzqt == null) {
                PresetUserConfigBean[] presetUserConfigBeanArr = new PresetUserConfigBean[1];
                C2294AGf c2294AGf2 = (C2294AGf) CollectionsKt___CollectionsKt.firstOrNull(c2292AGd.AEQbTJ());
                if (c2294AGf2 == null || (presetUserConfigBean = kVF.EZpvd(c2294AGf2)) == null) {
                    presetUserConfigBean = new PresetUserConfigBean((BuySellPreset) null, str6, 0, (java.lang.String) null, str4, (BuySellPreset) null, false, 109, (DefaultConstructorMarker) null);
                }
                presetUserConfigBeanArr[0] = presetUserConfigBean;
                dexPresetResultVOOLrzqt = new DexPresetResultVO(yDY.copydefault(presetUserConfigBeanArr), null, null, null, 0, false, false, false, null, false, false, 2046, null);
            }
            return new AbstractC43419rot.StateListAnimator(dexPresetResultVOOLrzqt);
        }
        C56391yDq.AEQbTJ(objInvoke);
        PresetUserConfigRepositoryImpl$presetReset$legacyCall$1 presetUserConfigRepositoryImpl$presetReset$legacyCall$1 = new PresetUserConfigRepositoryImpl$presetReset$legacyCall$1(this, str, str2, str3, null);
        if (!this.OLrzqt.AEQbTJ()) {
            presetUserConfigRepositoryImpl$presetReset$12.label = 1;
            objInvoke = presetUserConfigRepositoryImpl$presetReset$legacyCall$1.invoke(presetUserConfigRepositoryImpl$presetReset$12);
            return objInvoke == objCopydefault ? objCopydefault : objInvoke;
        }
        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(str2);
        if (fieldNames == null) {
            pUU.valueOf("PresetUserConfigRepositoryImpl", "presetTypeLong null, fallback to native");
            presetUserConfigRepositoryImpl$presetReset$12.label = 2;
            objInvoke = presetUserConfigRepositoryImpl$presetReset$legacyCall$1.invoke(presetUserConfigRepositoryImpl$presetReset$12);
            return objInvoke == objCopydefault ? objCopydefault : objInvoke;
        }
        kVH kvh = this.AEQbTJ;
        long jLongValue = fieldNames.longValue();
        presetUserConfigRepositoryImpl$presetReset$12.L$0 = this;
        presetUserConfigRepositoryImpl$presetReset$12.L$1 = str;
        presetUserConfigRepositoryImpl$presetReset$12.L$2 = str2;
        presetUserConfigRepositoryImpl$presetReset$12.L$3 = str3;
        presetUserConfigRepositoryImpl$presetReset$12.L$4 = presetUserConfigRepositoryImpl$presetReset$legacyCall$1;
        presetUserConfigRepositoryImpl$presetReset$12.label = 3;
        java.lang.Object objCopydefault2 = kvh.copydefault(str, jLongValue, presetUserConfigRepositoryImpl$presetReset$12);
        if (objCopydefault2 == objCopydefault) {
            return objCopydefault;
        }
        str4 = str2;
        objM7386unboximpl = objCopydefault2;
        str5 = str3;
        kvd = this;
        str6 = str;
        function1 = presetUserConfigRepositoryImpl$presetReset$legacyCall$1;
        if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
        }
    }

    @Override // o.kVC
    public DexPresetResultVO OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.KWHzl.get(copydefault(str, str2));
    }

    @Override // o.kVC
    public PresetUserConfigBean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        DexPresetResultVO dexPresetResultVOOLrzqt = OLrzqt(str, str3);
        java.lang.Object obj = null;
        if (dexPresetResultVOOLrzqt == null || (dexPresetResultVOList = dexPresetResultVOOLrzqt.getDexPresetResultVOList()) == null) {
            return null;
        }
        java.util.Iterator<T> it = dexPresetResultVOList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((PresetUserConfigBean) next).getPresetType(), (java.lang.Object) str2)) {
                obj = next;
                break;
            }
        }
        return (PresetUserConfigBean) obj;
    }

    @Override // o.kVC
    public BuySellPreset copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        java.lang.Object next;
        BuySellPreset sellPreset;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        DexPresetResultVO dexPresetResultVOOLrzqt = OLrzqt(str, str3);
        if (dexPresetResultVOOLrzqt == null || (dexPresetResultVOList = dexPresetResultVOOLrzqt.getDexPresetResultVOList()) == null) {
            return null;
        }
        java.util.Iterator<T> it = dexPresetResultVOList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((PresetUserConfigBean) next).getPresetType(), (java.lang.Object) str2)) {
                break;
            }
        }
        PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) next;
        if (presetUserConfigBean == null) {
            return null;
        }
        if (i == TransactionType.Buy.getType()) {
            sellPreset = presetUserConfigBean.getBuyPreset();
        } else {
            sellPreset = presetUserConfigBean.getSellPreset();
        }
        return sellPreset;
    }

    @Override // o.kVC
    public void copydefault() {
        this.KWHzl.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.kVC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull DexPresetResultVO dexPresetResultVO, @NotNull PresetUserParams presetUserParams, @NotNull Continuation<? super AbstractC43419rot<? extends java.lang.Object, OKServerException>> continuation) throws java.lang.Throwable {
        PresetUserConfigRepositoryImpl$presetSave$1 presetUserConfigRepositoryImpl$presetSave$1;
        Function1 presetUserConfigRepositoryImpl$presetSave$legacyCall$1;
        java.lang.Object objCopydefault;
        kVD kvd;
        if (continuation instanceof PresetUserConfigRepositoryImpl$presetSave$1) {
            presetUserConfigRepositoryImpl$presetSave$1 = (PresetUserConfigRepositoryImpl$presetSave$1) continuation;
            int i = presetUserConfigRepositoryImpl$presetSave$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                presetUserConfigRepositoryImpl$presetSave$1.label = i - Integer.MIN_VALUE;
            } else {
                presetUserConfigRepositoryImpl$presetSave$1 = new PresetUserConfigRepositoryImpl$presetSave$1(this, continuation);
            }
        }
        java.lang.Object objInvoke = presetUserConfigRepositoryImpl$presetSave$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = presetUserConfigRepositoryImpl$presetSave$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objInvoke);
            presetUserConfigRepositoryImpl$presetSave$legacyCall$1 = new PresetUserConfigRepositoryImpl$presetSave$legacyCall$1(this, presetUserParams, dexPresetResultVO, null);
            if (!this.OLrzqt.EZpvd()) {
                presetUserConfigRepositoryImpl$presetSave$1.label = 1;
                objInvoke = presetUserConfigRepositoryImpl$presetSave$legacyCall$1.invoke(presetUserConfigRepositoryImpl$presetSave$1);
                return objInvoke == objCopydefault2 ? objCopydefault2 : objInvoke;
            }
            C2297AGi c2297AGiCopydefault = kVF.copydefault(presetUserParams);
            kVH kvh = this.AEQbTJ;
            presetUserConfigRepositoryImpl$presetSave$1.L$0 = this;
            presetUserConfigRepositoryImpl$presetSave$1.L$1 = dexPresetResultVO;
            presetUserConfigRepositoryImpl$presetSave$1.L$2 = presetUserParams;
            presetUserConfigRepositoryImpl$presetSave$1.L$3 = presetUserConfigRepositoryImpl$presetSave$legacyCall$1;
            presetUserConfigRepositoryImpl$presetSave$1.label = 2;
            objCopydefault = kvh.copydefault(c2297AGiCopydefault, presetUserConfigRepositoryImpl$presetSave$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            kvd = this;
            if (!Result.m7383isFailureimpl(objCopydefault)) {
            }
        } else {
            if (i2 == 1) {
                C56391yDq.AEQbTJ(objInvoke);
            }
            if (i2 == 2) {
                Function1 function1 = (Function1) presetUserConfigRepositoryImpl$presetSave$1.L$3;
                presetUserParams = (PresetUserParams) presetUserConfigRepositoryImpl$presetSave$1.L$2;
                DexPresetResultVO dexPresetResultVO2 = (DexPresetResultVO) presetUserConfigRepositoryImpl$presetSave$1.L$1;
                kvd = (kVD) presetUserConfigRepositoryImpl$presetSave$1.L$0;
                C56391yDq.AEQbTJ(objInvoke);
                java.lang.Object objM7386unboximpl = ((Result) objInvoke).m7386unboximpl();
                presetUserConfigRepositoryImpl$presetSave$legacyCall$1 = function1;
                dexPresetResultVO = dexPresetResultVO2;
                objCopydefault = objM7386unboximpl;
                if (!Result.m7383isFailureimpl(objCopydefault)) {
                    pUU.valueOf("PresetUserConfigRepositoryImpl", "presetSave isFailure, fallback to native");
                    presetUserConfigRepositoryImpl$presetSave$1.L$0 = null;
                    presetUserConfigRepositoryImpl$presetSave$1.L$1 = null;
                    presetUserConfigRepositoryImpl$presetSave$1.L$2 = null;
                    presetUserConfigRepositoryImpl$presetSave$1.L$3 = null;
                    presetUserConfigRepositoryImpl$presetSave$1.label = 3;
                    objInvoke = presetUserConfigRepositoryImpl$presetSave$legacyCall$1.invoke(presetUserConfigRepositoryImpl$presetSave$1);
                    if (objInvoke == objCopydefault2) {
                        return objCopydefault2;
                    }
                } else {
                    kvd.KWHzl.put(kvd.copydefault(presetUserParams.getChainId(), presetUserParams.getUserWalletAddress()), dexPresetResultVO);
                    return new AbstractC43419rot.StateListAnimator(new java.lang.Object());
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objInvoke);
            }
        }
        return objInvoke;
    }

    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull PresetUserConfigBean presetUserConfigBean) {
        java.lang.Integer numValueOf;
        DexPresetResultVO dexPresetResultVO;
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
        DexPresetResultVO dexPresetResultVOOLrzqt = OLrzqt(str2, str3);
        if (dexPresetResultVOOLrzqt == null || (dexPresetResultVOList2 = dexPresetResultVOOLrzqt.getDexPresetResultVOList()) == null) {
            numValueOf = null;
        } else {
            java.util.Iterator<PresetUserConfigBean> it = dexPresetResultVOList2.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getPresetType(), (java.lang.Object) str)) {
                    break;
                } else {
                    i++;
                }
            }
            numValueOf = java.lang.Integer.valueOf(i);
        }
        if (numValueOf == null || numValueOf.intValue() == -1 || (dexPresetResultVO = this.KWHzl.get(copydefault(str2, str3))) == null || (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) == null) {
            return;
        }
        dexPresetResultVOList.set(numValueOf.intValue(), presetUserConfigBean);
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        return str + str2;
    }
}

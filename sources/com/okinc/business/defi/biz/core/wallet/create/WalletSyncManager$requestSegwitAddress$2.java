package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.WalletMustSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.net.bean.ResponseResult;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBean;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBeanBatchRes;
import com.okinc.business.defi.biz.net.bean.SegWitInfoBeanRes;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.bean.AddressType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C10954byG;
import o.C11600cUg;
import o.C13062cyk;
import o.C13934dbu;
import o.C33129mqd;
import o.C56391yDq;
import o.C56403yEb;
import o.C56406yEe;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.C8322bAY;
import o.cOG;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$requestSegwitAddress$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>>, Object> {
    final /* synthetic */ List<WalletEntity> $walletEntities;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ C13062cyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSyncManager$requestSegwitAddress$2(List<WalletEntity> list, C13062cyk c13062cyk, Continuation<? super WalletSyncManager$requestSegwitAddress$2> continuation) {
        super(2, continuation);
        this.$walletEntities = list;
        this.this$0 = c13062cyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$requestSegwitAddress$2 walletSyncManager$requestSegwitAddress$2 = new WalletSyncManager$requestSegwitAddress$2(this.$walletEntities, this.this$0, continuation);
        walletSyncManager$requestSegwitAddress$2.L$0 = obj;
        return walletSyncManager$requestSegwitAddress$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>> continuation) {
        return ((WalletSyncManager$requestSegwitAddress$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1142=4] */
    /* JADX DEBUG: Duplicate block (B:172:0x053f) to fix multi-entry loop: BACK_EDGE: B:172:0x053f -> B:173:0x0543 */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0543, code lost:
    
        r26 = r10;
     */
    /* JADX WARN: Path cross not found for [B:151:0x04e3, B:155:0x04ed], limit reached: 240 */
    /* JADX WARN: Path cross not found for [B:161:0x0500, B:165:0x050a], limit reached: 240 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0639 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0237 A[LOOP:7: B:51:0x0231->B:53:0x0237, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025a A[LOOP:8: B:55:0x0254->B:57:0x025a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0397  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:121:0x046d -> B:122:0x0473). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0524 -> B:170:0x052b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0527 -> B:170:0x052b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x03a9 -> B:98:0x03b6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object objCopydefault;
        CoroutineScope coroutineScope;
        List list;
        Map map;
        Iterator it;
        ArrayList arrayList2;
        C13062cyk.Activity activity;
        Object objAhwBna;
        List list2;
        List list3;
        AbstractC43419rot abstractC43419rot;
        String str;
        Continuation continuation;
        List list4;
        String str2;
        Collection data;
        List list5;
        List list6;
        List list7;
        C13062cyk c13062cyk;
        Iterator it2;
        Iterator it3;
        List list8;
        CoroutineScope coroutineScope2;
        List list9;
        String str3;
        long j;
        Object objOLrzqt;
        SegWitInfoBeanRes segWitInfoBeanRes;
        CoroutineScope coroutineScope3;
        List list10;
        List list11;
        int i;
        ChainAddressEntity chainAddressEntity;
        Iterator it4;
        Object next;
        ChainAddressSegWitEntity chainAddressSegWitEntity;
        String publicKey;
        String address;
        Object next2;
        CoroutineDispatcher io2;
        AnonymousClass7 anonymousClass7;
        List list12;
        List list13;
        CoroutineDispatcher io3;
        AnonymousClass9 anonymousClass9;
        int i2;
        List list14;
        String str4;
        Object objCopydefault2 = C56442yFn.copydefault();
        String str5 = "";
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                List<WalletEntity> list15 = this.$walletEntities;
                arrayList = new ArrayList();
                for (Object obj2 : list15) {
                    WalletEntity walletEntity = (WalletEntity) obj2;
                    if (walletEntity.getType() == WalletType.HDWallet.ordinal() && !C11600cUg.KWHzl(walletEntity.getFromCreate()) && !C13062cyk.Companion.AEQbTJ(walletEntity, WalletMustSyncOperation.HasRequestSegwit) && walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue()) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(this.$walletEntities, yDY.AhwBna()), 0, null, 6, null);
                }
                List listGEmmrt = CollectionsKt___CollectionsKt.gEmmrt((Iterable) this.$walletEntities, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList));
                Long[] lArr = new Long[2];
                C10954byG c10954byG = C10954byG.EZpvd;
                C10854bwM c10854bwMCopydefault = c10954byG.valueOf().copydefault();
                if (c10854bwMCopydefault == null) {
                    throw WalletImportError.Companion.OLrzqt("segwit btc coinId can't get", 1);
                }
                lArr[0] = C56443yFo.KWHzl(c10854bwMCopydefault.AhwBna());
                C10854bwM c10854bwMEjfBZ = c10954byG.valueOf().ejfBZ();
                if (c10854bwMEjfBZ == null) {
                    throw WalletImportError.Companion.OLrzqt("segwit ltc coinId can't get", 1);
                }
                lArr[1] = C56443yFo.KWHzl(c10854bwMEjfBZ.AhwBna());
                List<Long> listGEmmrt2 = yDY.gEmmrt(lArr);
                List<Integer> listGEmmrt3 = yDY.gEmmrt(C56443yFo.AEQbTJ(AddressType.P2SHType.getValue()), C56443yFo.AEQbTJ(AddressType.P2SHCommonType.getValue()));
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((WalletEntity) it5.next()).getId());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList, 10)), 16));
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((WalletEntity) obj3).getId(), obj3);
                }
                cOG cog = this.this$0.OLrzqt;
                this.L$0 = coroutineScope4;
                this.L$1 = arrayList;
                this.L$2 = listGEmmrt;
                this.L$3 = linkedHashMap;
                this.label = 1;
                objCopydefault = cog.copydefault(arrayList3, listGEmmrt2, listGEmmrt3, this);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                coroutineScope = coroutineScope4;
                list = listGEmmrt;
                map = linkedHashMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : ((Map) objCopydefault).entrySet()) {
                    if (((List) entry.getValue()).size() == 4) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList<ChainAddressSegWitEntity> arrayList4 = new ArrayList();
                it = linkedHashMap2.entrySet().iterator();
                while (it.hasNext()) {
                    C56406yEe.KWHzl(arrayList4, (Iterable) ((Map.Entry) it.next()).getValue());
                }
                arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                for (ChainAddressSegWitEntity chainAddressSegWitEntity2 : arrayList4) {
                    arrayList2.add(new SegWitInfoBean(chainAddressSegWitEntity2.getWalletId(), C56443yFo.KWHzl(chainAddressSegWitEntity2.getChainId()), chainAddressSegWitEntity2.getAddress(), C56443yFo.AEQbTJ(chainAddressSegWitEntity2.getAddressType())));
                }
                if (!arrayList2.isEmpty()) {
                    activity = new C13062cyk.Activity(arrayList, C56443yFo.AEQbTJ(0), "");
                    list13 = (List) activity.AEQbTJ();
                    int iIntValue = ((Number) activity.OLrzqt()).intValue();
                    String str6 = (String) activity.EZpvd();
                    io3 = Dispatchers.getIO();
                    anonymousClass9 = new AnonymousClass9(list, null);
                    this.L$0 = list;
                    this.L$1 = list13;
                    this.L$2 = str6;
                    this.L$3 = null;
                    this.I$0 = iIntValue;
                    this.label = 6;
                    if (BuildersKt.withContext(io3, anonymousClass9, this) != objCopydefault2) {
                    }
                } else {
                    C13934dbu c13934dbu = this.this$0.gEmmrt;
                    this.L$0 = coroutineScope;
                    this.L$1 = list;
                    this.L$2 = map;
                    this.L$3 = arrayList4;
                    this.label = 2;
                    objAhwBna = c13934dbu.AhwBna(arrayList2, this);
                    if (objAhwBna == objCopydefault2) {
                        return objCopydefault2;
                    }
                    list2 = list;
                    list3 = arrayList4;
                    abstractC43419rot = (AbstractC43419rot) objAhwBna;
                    if (abstractC43419rot.EZpvd()) {
                        AbstractC43419rot.ActionBar actionBar = abstractC43419rot instanceof AbstractC43419rot.ActionBar ? (AbstractC43419rot.ActionBar) abstractC43419rot : null;
                        activity = actionBar != null ? new C13062cyk.Activity(list2, C56443yFo.AEQbTJ(((OKServerException) actionBar.KWHzl()).getCode()), ((OKServerException) actionBar.KWHzl()).getMessage()) : new C13062cyk.Activity(list2, C56443yFo.AEQbTJ(0), "");
                        list = list2;
                        list13 = (List) activity.AEQbTJ();
                        int iIntValue2 = ((Number) activity.OLrzqt()).intValue();
                        String str62 = (String) activity.EZpvd();
                        io3 = Dispatchers.getIO();
                        anonymousClass9 = new AnonymousClass9(list, null);
                        this.L$0 = list;
                        this.L$1 = list13;
                        this.L$2 = str62;
                        this.L$3 = null;
                        this.I$0 = iIntValue2;
                        this.label = 6;
                        if (BuildersKt.withContext(io3, anonymousClass9, this) != objCopydefault2) {
                        }
                    } else {
                        Iterable iterable = (Iterable) abstractC43419rot.AEQbTJ();
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : iterable) {
                            ResponseResult<SegWitInfoBeanRes> responseResult = ((SegWitInfoBeanBatchRes) obj4).getResponseResult();
                            if (responseResult != null && responseResult.getCode() == 0) {
                                arrayList5.add(obj4);
                            }
                        }
                        ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList5, 10));
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add((WalletEntity) map.get(((SegWitInfoBeanBatchRes) it6.next()).getAccountId()));
                        }
                        List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(arrayList6);
                        Iterable iterable2 = (Iterable) abstractC43419rot.AEQbTJ();
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : iterable2) {
                            ResponseResult<SegWitInfoBeanRes> responseResult2 = ((SegWitInfoBeanBatchRes) obj5).getResponseResult();
                            if (responseResult2 != null && responseResult2.getCode() == 10002) {
                                arrayList7.add(obj5);
                            }
                        }
                        ArrayList arrayList8 = new ArrayList(C56403yEb.AYXKKw(arrayList7, 10));
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            arrayList8.add((WalletEntity) map.get(((SegWitInfoBeanBatchRes) it7.next()).getAccountId()));
                        }
                        BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new AnonymousClass1(this.this$0, CollectionsKt___CollectionsKt.QfsBiF(arrayList8), null), 3, null);
                        List arrayList9 = new ArrayList();
                        List arrayList10 = new ArrayList();
                        Iterable iterable3 = (Iterable) abstractC43419rot.AEQbTJ();
                        C13062cyk c13062cyk2 = this.this$0;
                        Iterator it8 = iterable3.iterator();
                        if (!it8.hasNext()) {
                            str = str5;
                            ArrayList arrayList11 = new ArrayList();
                            CoroutineScope coroutineScope5 = coroutineScope;
                            arrayList11.add(BuildersKt__Builders_commonKt.async$default(coroutineScope5, null, null, new AnonymousClass3(this.this$0, arrayList9, null), 3, null));
                            arrayList11.add(BuildersKt__Builders_commonKt.async$default(coroutineScope5, null, null, new AnonymousClass5(this.this$0, arrayList10, null), 3, null));
                            this.L$0 = list2;
                            this.L$1 = listQfsBiF;
                            continuation = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.label = 4;
                            if (AwaitKt.awaitAll(arrayList11, this) == objCopydefault2) {
                                return objCopydefault2;
                            }
                            list4 = listQfsBiF;
                            io2 = Dispatchers.getIO();
                            anonymousClass7 = new AnonymousClass7(list4, this.this$0, continuation);
                            this.L$0 = list2;
                            this.L$1 = list4;
                            this.label = 5;
                            if (BuildersKt.withContext(io2, anonymousClass7, this) != objCopydefault2) {
                                return objCopydefault2;
                            }
                            list12 = list2;
                            activity = new C13062cyk.Activity(list4, C56443yFo.AEQbTJ(0), str);
                            list = list12;
                            list13 = (List) activity.AEQbTJ();
                            int iIntValue22 = ((Number) activity.OLrzqt()).intValue();
                            String str622 = (String) activity.EZpvd();
                            io3 = Dispatchers.getIO();
                            anonymousClass9 = new AnonymousClass9(list, null);
                            this.L$0 = list;
                            this.L$1 = list13;
                            this.L$2 = str622;
                            this.L$3 = null;
                            this.I$0 = iIntValue22;
                            this.label = 6;
                            if (BuildersKt.withContext(io3, anonymousClass9, this) != objCopydefault2) {
                                return objCopydefault2;
                            }
                            i2 = iIntValue22;
                            list14 = list;
                            str4 = str622;
                            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) list14);
                            listFJNWhG.addAll(list13);
                            return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(listFJNWhG, list13), i2, str4);
                        }
                        ResponseResult<SegWitInfoBeanRes> responseResult3 = ((SegWitInfoBeanBatchRes) it8.next()).getResponseResult();
                        if (responseResult3 == null || (data = responseResult3.getData()) == null) {
                            str2 = str5;
                            str5 = str2;
                            if (!it8.hasNext()) {
                            }
                        } else {
                            list5 = arrayList9;
                            list6 = listQfsBiF;
                            list7 = arrayList10;
                            c13062cyk = c13062cyk2;
                            it2 = data.iterator();
                            it3 = it8;
                            list8 = list2;
                            coroutineScope2 = coroutineScope;
                            list9 = list3;
                            if (it2.hasNext()) {
                                SegWitInfoBeanRes segWitInfoBeanRes2 = (SegWitInfoBeanRes) it2.next();
                                Integer numKWHzl = segWitInfoBeanRes2.KWHzl();
                                AddressType addressType = AddressType.P2SHType;
                                int value = (numKWHzl != null && numKWHzl.intValue() == addressType.getValue()) ? AddressType.P2SHCommonType.getValue() : addressType.getValue();
                                String strCopydefault = segWitInfoBeanRes2.copydefault();
                                if (strCopydefault == null || !C33129mqd.OLrzqt((CharSequence) strCopydefault) || segWitInfoBeanRes2.AEQbTJ() == null) {
                                    str3 = str5;
                                } else {
                                    Long lAEQbTJ = segWitInfoBeanRes2.AEQbTJ();
                                    if (lAEQbTJ == null) {
                                        j = 0;
                                    } else {
                                        j = 0;
                                        if (lAEQbTJ.longValue() == 0) {
                                            str3 = str5;
                                        }
                                    }
                                    String strCopydefault2 = segWitInfoBeanRes2.copydefault();
                                    Intrinsics.copydefault((Object) strCopydefault2);
                                    Long lAEQbTJ2 = segWitInfoBeanRes2.AEQbTJ();
                                    Intrinsics.copydefault(lAEQbTJ2);
                                    list5.add(new ChainAddressSegWitEntity(strCopydefault2, lAEQbTJ2.longValue(), value, null, null, null, 56, null));
                                    cOG cog2 = c13062cyk.OLrzqt;
                                    String strCopydefault3 = segWitInfoBeanRes2.copydefault();
                                    Intrinsics.copydefault((Object) strCopydefault3);
                                    Long lAEQbTJ3 = segWitInfoBeanRes2.AEQbTJ();
                                    Intrinsics.copydefault(lAEQbTJ3);
                                    str3 = str5;
                                    long jLongValue = lAEQbTJ3.longValue();
                                    this.L$0 = coroutineScope2;
                                    this.L$1 = list8;
                                    this.L$2 = list9;
                                    this.L$3 = list6;
                                    this.L$4 = list5;
                                    this.L$5 = list7;
                                    this.L$6 = c13062cyk;
                                    this.L$7 = it3;
                                    this.L$8 = it2;
                                    this.L$9 = segWitInfoBeanRes2;
                                    this.I$0 = value;
                                    int i3 = value;
                                    this.label = 3;
                                    objOLrzqt = cog2.OLrzqt(strCopydefault3, jLongValue, this);
                                    if (objOLrzqt == objCopydefault2) {
                                        return objCopydefault2;
                                    }
                                    segWitInfoBeanRes = segWitInfoBeanRes2;
                                    coroutineScope3 = coroutineScope2;
                                    list10 = list9;
                                    list11 = list6;
                                    i = i3;
                                    chainAddressEntity = (ChainAddressEntity) CollectionsKt___CollectionsKt.firstOrNull((List) objOLrzqt);
                                    if (chainAddressEntity != null && chainAddressEntity.getAddressType() == i) {
                                        it4 = list10.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                next = null;
                                            } else {
                                                next = it4.next();
                                                if (Intrinsics.EZpvd((Object) ((ChainAddressSegWitEntity) next).getAddress(), (Object) segWitInfoBeanRes.EZpvd())) {
                                                }
                                            }
                                        }
                                        chainAddressSegWitEntity = (ChainAddressSegWitEntity) next;
                                        if (chainAddressSegWitEntity == null) {
                                            Iterator it9 = list10.iterator();
                                            while (true) {
                                                if (it9.hasNext()) {
                                                    next2 = it9.next();
                                                    if (Intrinsics.EZpvd((Object) ((ChainAddressSegWitEntity) next2).getWalletId(), (Object) segWitInfoBeanRes.copydefault())) {
                                                    }
                                                } else {
                                                    next2 = null;
                                                }
                                            }
                                            chainAddressSegWitEntity = (ChainAddressSegWitEntity) next2;
                                        }
                                        String strCopydefault4 = segWitInfoBeanRes.copydefault();
                                        list7.add(new ChainAddressEntity(strCopydefault4 != null ? str3 : strCopydefault4, chainAddressSegWitEntity == null ? chainAddressSegWitEntity.getChainId() : j, (chainAddressSegWitEntity != null || (address = chainAddressSegWitEntity.getAddress()) == null) ? str3 : address, chainAddressSegWitEntity == null ? chainAddressSegWitEntity.getAddressType() : AddressType.Legacy.getValue(), (chainAddressSegWitEntity != null || (publicKey = chainAddressSegWitEntity.getPublicKey()) == null) ? str3 : publicKey, null, null, null, 224, null));
                                    }
                                    list6 = list11;
                                    list9 = list10;
                                    coroutineScope2 = coroutineScope3;
                                }
                                str5 = str3;
                                if (it2.hasNext()) {
                                    str2 = str5;
                                    Unit unit = Unit.INSTANCE;
                                    listQfsBiF = list6;
                                    list3 = list9;
                                    coroutineScope = coroutineScope2;
                                    list2 = list8;
                                    it8 = it3;
                                    c13062cyk2 = c13062cyk;
                                    arrayList10 = list7;
                                    arrayList9 = list5;
                                    str5 = str2;
                                    if (!it8.hasNext()) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                Map map2 = (Map) this.L$3;
                List list16 = (List) this.L$2;
                arrayList = (List) this.L$1;
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope6;
                objCopydefault = obj;
                map = map2;
                list = list16;
                LinkedHashMap linkedHashMap22 = new LinkedHashMap();
                while (r5.hasNext()) {
                }
                ArrayList<ChainAddressSegWitEntity> arrayList42 = new ArrayList();
                it = linkedHashMap22.entrySet().iterator();
                while (it.hasNext()) {
                }
                arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList42, 10));
                while (r12.hasNext()) {
                }
                if (!arrayList2.isEmpty()) {
                }
                break;
            case 2:
                list3 = (List) this.L$3;
                map = (Map) this.L$2;
                List list17 = (List) this.L$1;
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                coroutineScope = coroutineScope7;
                list2 = list17;
                objAhwBna = obj;
                abstractC43419rot = (AbstractC43419rot) objAhwBna;
                if (abstractC43419rot.EZpvd()) {
                }
                break;
            case 3:
                int i4 = this.I$0;
                SegWitInfoBeanRes segWitInfoBeanRes3 = (SegWitInfoBeanRes) this.L$9;
                it2 = (Iterator) this.L$8;
                it3 = (Iterator) this.L$7;
                c13062cyk = (C13062cyk) this.L$6;
                list7 = (List) this.L$5;
                list5 = (List) this.L$4;
                List list18 = (List) this.L$3;
                List list19 = (List) this.L$2;
                list8 = (List) this.L$1;
                CoroutineScope coroutineScope8 = (CoroutineScope) this.L$0;
                C56391yDq.AEQbTJ(obj);
                segWitInfoBeanRes = segWitInfoBeanRes3;
                str3 = "";
                j = 0;
                coroutineScope3 = coroutineScope8;
                list10 = list19;
                list11 = list18;
                i = i4;
                objOLrzqt = obj;
                chainAddressEntity = (ChainAddressEntity) CollectionsKt___CollectionsKt.firstOrNull((List) objOLrzqt);
                if (chainAddressEntity != null) {
                    it4 = list10.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                        }
                    }
                    chainAddressSegWitEntity = (ChainAddressSegWitEntity) next;
                    if (chainAddressSegWitEntity == null) {
                    }
                    String strCopydefault42 = segWitInfoBeanRes.copydefault();
                    if (chainAddressSegWitEntity != null) {
                    }
                    if (chainAddressSegWitEntity != null) {
                    }
                    list7.add(new ChainAddressEntity(strCopydefault42 != null ? str3 : strCopydefault42, chainAddressSegWitEntity == null ? chainAddressSegWitEntity.getChainId() : j, (chainAddressSegWitEntity != null || (address = chainAddressSegWitEntity.getAddress()) == null) ? str3 : address, chainAddressSegWitEntity == null ? chainAddressSegWitEntity.getAddressType() : AddressType.Legacy.getValue(), (chainAddressSegWitEntity != null || (publicKey = chainAddressSegWitEntity.getPublicKey()) == null) ? str3 : publicKey, null, null, null, 224, null));
                }
                list6 = list11;
                list9 = list10;
                coroutineScope2 = coroutineScope3;
                str5 = str3;
                if (it2.hasNext()) {
                }
                break;
            case 4:
                list4 = (List) this.L$1;
                List list20 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list20;
                str = "";
                continuation = null;
                io2 = Dispatchers.getIO();
                anonymousClass7 = new AnonymousClass7(list4, this.this$0, continuation);
                this.L$0 = list2;
                this.L$1 = list4;
                this.label = 5;
                if (BuildersKt.withContext(io2, anonymousClass7, this) != objCopydefault2) {
                }
                break;
            case 5:
                list4 = (List) this.L$1;
                list12 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = "";
                activity = new C13062cyk.Activity(list4, C56443yFo.AEQbTJ(0), str);
                list = list12;
                list13 = (List) activity.AEQbTJ();
                int iIntValue222 = ((Number) activity.OLrzqt()).intValue();
                String str6222 = (String) activity.EZpvd();
                io3 = Dispatchers.getIO();
                anonymousClass9 = new AnonymousClass9(list, null);
                this.L$0 = list;
                this.L$1 = list13;
                this.L$2 = str6222;
                this.L$3 = null;
                this.I$0 = iIntValue222;
                this.label = 6;
                if (BuildersKt.withContext(io3, anonymousClass9, this) != objCopydefault2) {
                }
                break;
            case 6:
                i2 = this.I$0;
                str4 = (String) this.L$2;
                list13 = (List) this.L$1;
                list14 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) list14);
                listFJNWhG2.addAll(list13);
                return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(listFJNWhG2, list13), i2, str4);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WalletEntity> $shouldResetList;
        int label;
        final /* synthetic */ C13062cyk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C13062cyk c13062cyk, List<WalletEntity> list, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c13062cyk;
            this.$shouldResetList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$shouldResetList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C13062cyk c13062cyk = this.this$0;
                List<WalletEntity> list = this.$shouldResetList;
                this.label = 1;
                if (c13062cyk.copydefault((List<WalletEntity>) list, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        final /* synthetic */ List<ChainAddressSegWitEntity> $deleteList;
        int label;
        final /* synthetic */ C13062cyk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C13062cyk c13062cyk, List<ChainAddressSegWitEntity> list, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c13062cyk;
            this.$deleteList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$deleteList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                cOG cog = this.this$0.OLrzqt;
                List<ChainAddressSegWitEntity> list = this.$deleteList;
                this.label = 1;
                obj = cog.EZpvd(list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Long>>, Object> {
        final /* synthetic */ List<ChainAddressEntity> $insertOrReplaceList;
        int label;
        final /* synthetic */ C13062cyk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C13062cyk c13062cyk, List<ChainAddressEntity> list, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = c13062cyk;
            this.$insertOrReplaceList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, this.$insertOrReplaceList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Long>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Long>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Long>> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                cOG cog = this.this$0.OLrzqt;
                List<ChainAddressEntity> list = this.$insertOrReplaceList;
                this.label = 1;
                obj = cog.AEQbTJ(list, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2$7, reason: invalid class name */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WalletEntity> $successSyncList;
        int label;
        final /* synthetic */ C13062cyk this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(List<WalletEntity> list, C13062cyk c13062cyk, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.$successSyncList = list;
            this.this$0 = c13062cyk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.$successSyncList, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                for (WalletEntity walletEntity : this.$successSyncList) {
                    C8322bAY c8322bAY = C8322bAY.KWHzl;
                    c8322bAY.OLrzqt(walletEntity.getId());
                    c8322bAY.AEQbTJ(walletEntity.getId());
                }
                C13062cyk c13062cyk = this.this$0;
                List<WalletEntity> list = this.$successSyncList;
                WalletMustSyncOperation walletMustSyncOperation = WalletMustSyncOperation.HasRequestSegwit;
                this.label = 1;
                if (c13062cyk.OLrzqt((List<WalletEntity>) list, walletMustSyncOperation, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.core.wallet.create.WalletSyncManager$requestSegwitAddress$2$9, reason: invalid class name */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<WalletEntity> $notRequestList;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(List<WalletEntity> list, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.$notRequestList = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.$notRequestList, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                for (WalletEntity walletEntity : this.$notRequestList) {
                    C8322bAY c8322bAY = C8322bAY.KWHzl;
                    c8322bAY.OLrzqt(walletEntity.getId());
                    c8322bAY.AEQbTJ(walletEntity.getId());
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

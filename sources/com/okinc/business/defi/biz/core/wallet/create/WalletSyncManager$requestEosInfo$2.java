package com.okinc.business.defi.biz.core.wallet.create;

import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletMustSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncOperation;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.net.bean.EosAccountBatch;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyBatch;
import com.okinc.business.defi.biz.net.bean.EosAccountKeyRespBatch;
import com.okinc.business.defi.biz.net.bean.EosAccountKeysReq;
import com.okinc.business.defi.biz.net.bean.EosAccountRespBatch;
import com.okinc.business.defi.biz.net.bean.ResponseResult;
import com.okinc.business.defi.biz.net.bean.ResponseSingeResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import o.AbstractC43419rot;
import o.C10854bwM;
import o.C10954byG;
import o.C11283cIm;
import o.C11600cUg;
import o.C13058cyg;
import o.C13062cyk;
import o.C13934dbu;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletSyncManager$requestEosInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>>, Object> {
    final /* synthetic */ List<WalletEntity> $walletEntities;
    long J$0;
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
    public WalletSyncManager$requestEosInfo$2(List<WalletEntity> list, C13062cyk c13062cyk, Continuation<? super WalletSyncManager$requestEosInfo$2> continuation) {
        super(2, continuation);
        this.$walletEntities = list;
        this.this$0 = c13062cyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletSyncManager$requestEosInfo$2 walletSyncManager$requestEosInfo$2 = new WalletSyncManager$requestEosInfo$2(this.$walletEntities, this.this$0, continuation);
        walletSyncManager$requestEosInfo$2.L$0 = obj;
        return walletSyncManager$requestEosInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C13062cyk.StateListAnimator<C13062cyk.TaskDescription>> continuation) {
        return ((WalletSyncManager$requestEosInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [858=6] */
    /* JADX DEBUG: Duplicate block (B:330:0x09ee) to fix multi-entry loop: BACK_EDGE: B:330:0x09ee -> B:331:0x09ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:339:0x09ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:343:0x08bd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:359:0x05d7 */
    /* JADX DEBUG: Type inference failed for r1v31. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r1v43. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r24v11. Raw type applied. Possible types: java.util.List<T extends android.os.Parcelable>, java.util.List */
    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r8v5. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r9v14. Raw type applied. Possible types: T */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x09ef, code lost:
    
        r9 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:240:0x0766, B:242:0x076c], limit reached: 378 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x078a A[LOOP:2: B:244:0x0784->B:246:0x078a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0924 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x09f2  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0a24 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0302 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0428  */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    /* JADX WARN: Type inference failed for: r14v49 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v30, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38, types: [T] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v48, types: [com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v80, types: [com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v82, types: [com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r20v31 */
    /* JADX WARN: Type inference failed for: r20v32 */
    /* JADX WARN: Type inference failed for: r32v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r32v15 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v70, types: [o.cOG] */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v45, types: [com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r8v54 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v9, types: [o.dbu] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:328:0x09db -> B:329:0x09de). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List arrayList;
        Object objAwait;
        List list;
        Deferred deferred;
        List list2;
        HashMap map;
        List list3;
        List list4;
        Map map2;
        List list5;
        HashMap map3;
        Map map4;
        Object objAwait2;
        Iterator it;
        Iterator it2;
        Object obj2;
        ?? r10;
        List list6;
        ?? r14;
        ?? r13;
        List list7;
        List list8;
        List list9;
        List list10;
        ?? r12;
        List list11;
        String xpriv;
        String str;
        Object objKWHzl;
        Object obj3;
        HashMap map5;
        List list12;
        List list13;
        HashMap map6;
        List list14;
        HashMap map7;
        List list15;
        List list16;
        List list17;
        ?? r4;
        Map map8;
        Map map9;
        Iterator it3;
        Collection collection;
        AbstractC43419rot abstractC43419rot;
        ?? r102;
        HashMap map10;
        List list18;
        Object objAEQbTJ;
        HashMap map11;
        Iterator it4;
        HashMap map12;
        CharSequence charSequence;
        EosAccountKeyBatch eosAccountKeyBatch;
        ?? r5;
        ?? r20;
        Iterator it5;
        Object objAEQbTJ2;
        ?? r15;
        ?? r142;
        ?? r103;
        ?? r42;
        ?? r152;
        ?? r143;
        ?? r104;
        ?? r43;
        AbstractC43419rot abstractC43419rot2;
        Iterator it6;
        List list19;
        ?? r3;
        String account;
        List list20;
        List list21;
        List list22;
        List list23;
        ?? r144;
        ?? r132;
        AbstractC43419rot abstractC43419rot3;
        ?? r122;
        Object objCopydefault;
        ?? r52;
        Object obj4;
        List list24;
        C13062cyk c13062cyk;
        List list25;
        long j;
        List list26;
        ?? r8;
        Iterator it7;
        C13062cyk c13062cyk2;
        WalletMustSyncOperation walletMustSyncOperation;
        Object obj5;
        List list27;
        List list28;
        ChainAddressEntity chainAddressEntity;
        Object objCopydefault2 = C56442yFn.copydefault();
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List<WalletEntity> list29 = this.$walletEntities;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : list29) {
                    WalletEntity walletEntity = (WalletEntity) obj6;
                    if (walletEntity.getSyncStatus() >= WalletSyncStatus.HasCreate.getValue() && !C11600cUg.KWHzl(walletEntity.getFromCreate()) && !C13062cyk.Companion.AEQbTJ(walletEntity, WalletMustSyncOperation.HasRequestEosInfo)) {
                        arrayList2.add(obj6);
                    }
                }
                if (arrayList2.isEmpty()) {
                    return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(this.$walletEntities, yDY.AhwBna()), 0, "");
                }
                List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.gEmmrt((Iterable) this.$walletEntities, (Iterable) CollectionsKt___CollectionsKt.OqFWZa(arrayList2)));
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(arrayList2, 10)), 16));
                for (Object obj7 : arrayList2) {
                    linkedHashMap.put(((WalletEntity) obj7).getId(), obj7);
                }
                C10854bwM c10854bwMAhwBna = C10954byG.EZpvd.valueOf().AhwBna();
                long jAhwBna = c10854bwMAhwBna != null ? c10854bwMAhwBna.AhwBna() : 0L;
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(((WalletEntity) it8.next()).getId());
                }
                int size = arrayList3.size();
                ArrayList arrayList4 = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList4.add(C56443yFo.KWHzl(jAhwBna));
                }
                Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$requestEosInfo$2$addressDef$1(this.this$0, arrayList3, arrayList4, null), 3, null);
                Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new WalletSyncManager$requestEosInfo$2$eosInfoDef$1(this.this$0, arrayList3, null), 3, null);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                HashMap map13 = new HashMap();
                HashMap map14 = new HashMap();
                arrayList = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                this.L$0 = listFJNWhG;
                this.L$1 = linkedHashMap;
                this.L$2 = arrayList3;
                this.L$3 = deferredAsync$default2;
                this.L$4 = arrayList5;
                this.L$5 = arrayList6;
                this.L$6 = map13;
                this.L$7 = map14;
                this.L$8 = arrayList;
                this.L$9 = arrayList7;
                this.label = 1;
                objAwait = deferredAsync$default.await(this);
                if (objAwait == objCopydefault2) {
                    return objCopydefault2;
                }
                list = arrayList5;
                deferred = deferredAsync$default2;
                list2 = arrayList6;
                map = map13;
                list3 = listFJNWhG;
                list4 = arrayList7;
                map2 = linkedHashMap;
                list5 = arrayList3;
                map3 = map14;
                map4 = (Map) objAwait;
                this.L$0 = list3;
                this.L$1 = map2;
                this.L$2 = list5;
                this.L$3 = list;
                this.L$4 = list2;
                this.L$5 = map;
                this.L$6 = map3;
                this.L$7 = arrayList;
                this.L$8 = list4;
                this.L$9 = map4;
                this.label = 2;
                objAwait2 = deferred.await(this);
                if (objAwait2 == objCopydefault2) {
                    return objCopydefault2;
                }
                Map map15 = (Map) objAwait2;
                ArrayList arrayList8 = new ArrayList();
                it = list5.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it9 = it;
                    String str2 = (String) next;
                    Collection collection2 = (Collection) map4.get(str2);
                    boolean z = (collection2 == null || collection2.isEmpty() || (collection = (Collection) map15.get(str2)) == null || collection.isEmpty()) ? false : true;
                    if (!z && map2.get(str2) != null) {
                        Object obj8 = map2.get(str2);
                        Intrinsics.copydefault(obj8);
                        list3.add(obj8);
                    }
                    if (z) {
                        arrayList8.add(next);
                    }
                    it = it9;
                }
                it2 = arrayList8.iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    List list30 = (List) map4.get(str3);
                    List list31 = (List) map15.get(str3);
                    WalletEntity walletEntity2 = (WalletEntity) map2.get(str3);
                    if (C33129mqd.KWHzl((Collection) list30) && C33129mqd.KWHzl((Collection) list31) && walletEntity2 != null) {
                        Intrinsics.copydefault(list30);
                        ChainAddressEntity chainAddressEntity2 = (ChainAddressEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list30);
                        Intrinsics.copydefault(list31);
                        map8 = map15;
                        EOSInfoEntity eOSInfoEntity = (EOSInfoEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list31);
                        map9 = map4;
                        int type = walletEntity2.getType();
                        it3 = it2;
                        if (type == WalletType.HDWallet.ordinal() || type == WalletType.KeyWallet.ordinal()) {
                            if (C33129mqd.OLrzqt((CharSequence) eOSInfoEntity.getPubKey())) {
                                list.add(eOSInfoEntity);
                                map.put(walletEntity2.getId(), eOSInfoEntity);
                                map3.put(walletEntity2.getId(), chainAddressEntity2);
                                Unit unit = Unit.INSTANCE;
                            } else {
                                list3.add(walletEntity2);
                                Unit unit2 = Unit.INSTANCE;
                            }
                        } else if (type == WalletType.TrackingWallet.ordinal()) {
                            list2.add(chainAddressEntity2);
                            map.put(walletEntity2.getId(), eOSInfoEntity);
                            map3.put(walletEntity2.getId(), chainAddressEntity2);
                            Unit unit3 = Unit.INSTANCE;
                        } else {
                            C56443yFo.KWHzl(list3.add(walletEntity2));
                        }
                    } else {
                        map8 = map15;
                        map9 = map4;
                        it3 = it2;
                    }
                    map15 = map8;
                    map4 = map9;
                    it2 = it3;
                }
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                HashMap map16 = new HashMap();
                if (!list.isEmpty()) {
                    String walletId = ((EOSInfoEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list)).getWalletId();
                    WalletEntity walletEntity3 = (WalletEntity) map2.get(walletId);
                    if (walletEntity3 == null || (xpriv = walletEntity3.getXpriv()) == null) {
                        xpriv = "";
                        str = xpriv;
                    } else {
                        str = "";
                    }
                    ArrayList arrayList11 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    for (Iterator it10 = list.iterator(); it10.hasNext(); it10 = it10) {
                        EOSInfoEntity eOSInfoEntity2 = (EOSInfoEntity) it10.next();
                        arrayList11.add(new EosAccountKeysReq(eOSInfoEntity2.getWalletId(), eOSInfoEntity2.getPubKey()));
                    }
                    C13934dbu c13934dbu = this.this$0.gEmmrt;
                    this.L$0 = list3;
                    this.L$1 = map2;
                    this.L$2 = list2;
                    this.L$3 = map;
                    this.L$4 = map3;
                    this.L$5 = arrayList;
                    this.L$6 = list4;
                    this.L$7 = arrayList9;
                    this.L$8 = arrayList10;
                    this.L$9 = map16;
                    this.label = 3;
                    objKWHzl = c13934dbu.KWHzl(xpriv, walletId, arrayList11, this);
                    obj3 = objCopydefault2;
                    if (objKWHzl == obj3) {
                        return obj3;
                    }
                    map5 = map3;
                    list12 = list3;
                    list13 = arrayList;
                    map6 = map;
                    list14 = arrayList9;
                    map7 = map16;
                    List list32 = list2;
                    list15 = list4;
                    list16 = list32;
                    Map map17 = map2;
                    list17 = arrayList10;
                    r4 = map17;
                    abstractC43419rot = (AbstractC43419rot) objKWHzl;
                    if (abstractC43419rot.EZpvd()) {
                        obj2 = obj3;
                        r102 = str;
                        map10 = map6;
                    } else {
                        ArrayList arrayList12 = new ArrayList();
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        ?? r105 = str;
                        objectRef.element = r105;
                        Object obj9 = obj3;
                        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                        objectRef2.element = r105;
                        Iterator it11 = ((Iterable) abstractC43419rot.AEQbTJ()).iterator();
                        HashMap map18 = map6;
                        while (it11.hasNext()) {
                            EosAccountKeyRespBatch eosAccountKeyRespBatch = (EosAccountKeyRespBatch) it11.next();
                            ResponseResult<EosAccountKeyBatch> responseResult = eosAccountKeyRespBatch.getResponseResult();
                            if (responseResult.getCode() != 0 || responseResult.getData() == null) {
                                it4 = it11;
                                map12 = map18;
                                if (eosAccountKeyRespBatch.getResponseResult().getCode() != 10002) {
                                    Unit unit4 = Unit.INSTANCE;
                                } else {
                                    WalletEntity walletEntity4 = (WalletEntity) r4.get(eosAccountKeyRespBatch.getAccountId());
                                    if (walletEntity4 != null) {
                                        list13.add(walletEntity4);
                                        Unit unit42 = Unit.INSTANCE;
                                    }
                                }
                            } else {
                                List data = eosAccountKeyRespBatch.getResponseResult().getData();
                                String account2 = (data == null || (eosAccountKeyBatch = (EosAccountKeyBatch) CollectionsKt___CollectionsKt.firstOrNull(data)) == null) ? null : eosAccountKeyBatch.getAccount();
                                ?? r32 = account2 == null ? r105 : account2;
                                if (r32.length() == 0) {
                                    it4 = it11;
                                    ?? r1 = (EOSInfoEntity) map18.get(eosAccountKeyRespBatch.getAccountId());
                                    if (r1 != 0) {
                                        r1.setAccountName(r105);
                                        map12 = map18;
                                        r1.setState(EOSState.Unopened.ordinal());
                                        C56443yFo.KWHzl(list14.add(r1));
                                    } else {
                                        map12 = map18;
                                    }
                                    ?? r16 = (ChainAddressEntity) map5.get(eosAccountKeyRespBatch.getAccountId());
                                    if (r16 != 0) {
                                        r16.setAddress(r105);
                                        C56443yFo.KWHzl(list17.add(r16));
                                    }
                                    WalletEntity walletEntity5 = (WalletEntity) r4.get(eosAccountKeyRespBatch.getAccountId());
                                    if (walletEntity5 != null) {
                                        list15.add(walletEntity5);
                                        Unit unit5 = Unit.INSTANCE;
                                    }
                                } else {
                                    it4 = it11;
                                    ?? r17 = r32;
                                    map12 = map18;
                                    arrayList12.add(r17);
                                    String accountId = eosAccountKeyRespBatch.getAccountId();
                                    ?? r153 = accountId;
                                    if (accountId == null) {
                                        r153 = r105;
                                    }
                                    map7.put(r17, r153);
                                    CharSequence charSequence2 = (CharSequence) objectRef.element;
                                    if (charSequence2 == null || charSequence2.length() == 0 || (charSequence = (CharSequence) objectRef2.element) == null || charSequence.length() == 0) {
                                        String accountId2 = eosAccountKeyRespBatch.getAccountId();
                                        ?? r18 = accountId2;
                                        if (accountId2 == null) {
                                            r18 = r105;
                                        }
                                        objectRef.element = r18;
                                        WalletEntity walletEntity6 = (WalletEntity) r4.get(r18);
                                        if (walletEntity6 != null) {
                                            String xpriv2 = walletEntity6.getXpriv();
                                            ?? r19 = xpriv2;
                                            if (xpriv2 == null) {
                                                r19 = r105;
                                            }
                                            objectRef2.element = r19;
                                        }
                                    }
                                    Unit unit6 = Unit.INSTANCE;
                                }
                            }
                            map18 = map12;
                            it11 = it4;
                        }
                        HashMap map19 = map18;
                        if (!arrayList12.isEmpty()) {
                            C13934dbu c13934dbu2 = this.this$0.gEmmrt;
                            String str4 = (String) objectRef2.element;
                            String str5 = (String) objectRef.element;
                            this.L$0 = list12;
                            this.L$1 = r4;
                            this.L$2 = list16;
                            HashMap map20 = map19;
                            this.L$3 = map20;
                            this.L$4 = map5;
                            this.L$5 = list13;
                            this.L$6 = list15;
                            this.L$7 = list14;
                            this.L$8 = list17;
                            this.L$9 = map7;
                            HashMap map21 = map7;
                            this.label = 4;
                            objAEQbTJ = c13934dbu2.AEQbTJ(str4, str5, arrayList12, this);
                            obj2 = obj9;
                            if (objAEQbTJ == obj2) {
                                return obj2;
                            }
                            map11 = map21;
                            r43 = r4;
                            r104 = r105;
                            r143 = map5;
                            r152 = map20;
                            abstractC43419rot2 = (AbstractC43419rot) objAEQbTJ;
                            if (abstractC43419rot2.EZpvd()) {
                                Iterator it12 = ((Iterable) abstractC43419rot2.AEQbTJ()).iterator();
                                while (it12.hasNext()) {
                                    EosAccountRespBatch eosAccountRespBatch = (EosAccountRespBatch) it12.next();
                                    ResponseSingeResult<EosAccountBatch> responseResult2 = eosAccountRespBatch.getResponseResult();
                                    if (responseResult2.getCode() != 0 || responseResult2.getData() == null) {
                                        it6 = it12;
                                        list19 = list16;
                                        if (eosAccountRespBatch.getResponseResult().getCode() == 10002) {
                                            String str6 = (String) map11.get(eosAccountRespBatch.getAccount());
                                            ?? r110 = str6;
                                            if (str6 == null) {
                                                r110 = r104;
                                            }
                                            WalletEntity walletEntity7 = (WalletEntity) r43.get(r110);
                                            if (walletEntity7 != null) {
                                                list13.add(walletEntity7);
                                                Unit unit7 = Unit.INSTANCE;
                                            }
                                        } else {
                                            Unit unit72 = Unit.INSTANCE;
                                        }
                                    } else {
                                        String str7 = (String) map11.get(eosAccountRespBatch.getAccount());
                                        ?? r9 = str7;
                                        if (str7 == null) {
                                            r9 = r104;
                                        }
                                        it6 = it12;
                                        ?? r111 = (EOSInfoEntity) r152.get(r9);
                                        if (r111 != 0) {
                                            EosAccountBatch eosAccountBatch = (EosAccountBatch) eosAccountRespBatch.getResponseResult().getData();
                                            if (eosAccountBatch == null || (account = eosAccountBatch.getAccount()) == null) {
                                                list19 = list16;
                                                r3 = r104;
                                            } else {
                                                list19 = list16;
                                                r3 = account;
                                            }
                                            r111.setAccountName(r3);
                                            r111.setState(EOSState.Opened.ordinal());
                                            EosAccountBatch eosAccountBatch2 = (EosAccountBatch) eosAccountRespBatch.getResponseResult().getData();
                                            String activeKey = eosAccountBatch2 != null ? eosAccountBatch2.getActiveKey() : null;
                                            Intrinsics.copydefault((Object) activeKey);
                                            r111.setActiveKey(activeKey);
                                            EosAccountBatch eosAccountBatch3 = (EosAccountBatch) eosAccountRespBatch.getResponseResult().getData();
                                            String ownerKey = eosAccountBatch3 != null ? eosAccountBatch3.getOwnerKey() : null;
                                            Intrinsics.copydefault((Object) ownerKey);
                                            r111.setOwnerKey(ownerKey);
                                            C56443yFo.KWHzl(list14.add(r111));
                                        } else {
                                            list19 = list16;
                                        }
                                        ?? r112 = (ChainAddressEntity) r143.get(r9);
                                        if (r112 != 0) {
                                            EosAccountBatch eosAccountBatch4 = (EosAccountBatch) eosAccountRespBatch.getResponseResult().getData();
                                            if (eosAccountBatch4 != null) {
                                                String account3 = eosAccountBatch4.getAccount();
                                                ?? r33 = account3;
                                                if (account3 == null) {
                                                    r33 = r104;
                                                }
                                                r112.setAddress(r33);
                                                C56443yFo.KWHzl(list17.add(r112));
                                            }
                                        }
                                        WalletEntity walletEntity8 = (WalletEntity) r43.get(r9);
                                        if (walletEntity8 != null) {
                                            list15.add(walletEntity8);
                                            Unit unit8 = Unit.INSTANCE;
                                        }
                                    }
                                    it12 = it6;
                                    list16 = list19;
                                }
                            }
                            list6 = list15;
                            list18 = list16;
                            r42 = r43;
                            r103 = r104;
                            r142 = r143;
                            r15 = r152;
                            list10 = list17;
                            list9 = list14;
                            list7 = list18;
                            list8 = list13;
                            r12 = r142;
                            r13 = r15;
                            r14 = r42;
                            list11 = list12;
                            r10 = r103;
                            if (!list7.isEmpty()) {
                                String walletId2 = ((ChainAddressEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list7)).getWalletId();
                                WalletEntity walletEntity9 = (WalletEntity) r14.get(walletId2);
                                if (walletEntity9 != null) {
                                    String xpriv3 = walletEntity9.getXpriv();
                                    r5 = xpriv3;
                                    if (xpriv3 == null) {
                                    }
                                    ?? r82 = this.this$0.gEmmrt;
                                    r20 = r10;
                                    ArrayList arrayList13 = new ArrayList(C56403yEb.AYXKKw(list7, 10));
                                    it5 = list7.iterator();
                                    while (it5.hasNext()) {
                                        arrayList13.add(((ChainAddressEntity) it5.next()).getAddress());
                                    }
                                    this.L$0 = list11;
                                    this.L$1 = r14;
                                    this.L$2 = r13;
                                    this.L$3 = r12;
                                    this.L$4 = list8;
                                    this.L$5 = list6;
                                    this.L$6 = list9;
                                    this.L$7 = list10;
                                    this.L$8 = null;
                                    this.L$9 = null;
                                    this.label = 5;
                                    objAEQbTJ2 = r82.AEQbTJ(walletId2, r5, arrayList13, this);
                                    r12 = r12;
                                    r132 = r13;
                                    r144 = r14;
                                    if (objAEQbTJ2 == obj2) {
                                        return obj2;
                                    }
                                    abstractC43419rot3 = (AbstractC43419rot) objAEQbTJ2;
                                    if (abstractC43419rot3.EZpvd()) {
                                        for (EosAccountRespBatch eosAccountRespBatch2 : (Iterable) abstractC43419rot3.AEQbTJ()) {
                                            ResponseSingeResult<EosAccountBatch> responseResult3 = eosAccountRespBatch2.getResponseResult();
                                            if (responseResult3.getCode() != 0 || responseResult3.getData() == null) {
                                                if (eosAccountRespBatch2.getResponseResult().getCode() == 10002) {
                                                    WalletEntity walletEntity10 = (WalletEntity) r144.get(eosAccountRespBatch2.getAccountId());
                                                    if (walletEntity10 != null) {
                                                        list8.add(walletEntity10);
                                                    }
                                                }
                                                Unit unit9 = Unit.INSTANCE;
                                            } else {
                                                EOSInfoEntity eOSInfoEntity3 = (EOSInfoEntity) r132.get(eosAccountRespBatch2.getAccountId());
                                                if (eOSInfoEntity3 != null) {
                                                    EosAccountBatch eosAccountBatch5 = (EosAccountBatch) eosAccountRespBatch2.getResponseResult().getData();
                                                    String account4 = eosAccountBatch5 != null ? eosAccountBatch5.getAccount() : null;
                                                    Intrinsics.copydefault((Object) account4);
                                                    eOSInfoEntity3.setAccountName(account4);
                                                    eOSInfoEntity3.setState(EOSState.Opened.ordinal());
                                                    EosAccountBatch eosAccountBatch6 = (EosAccountBatch) eosAccountRespBatch2.getResponseResult().getData();
                                                    String ownerKey2 = eosAccountBatch6 != null ? eosAccountBatch6.getOwnerKey() : null;
                                                    Intrinsics.copydefault((Object) ownerKey2);
                                                    eOSInfoEntity3.setPubKey(ownerKey2);
                                                    EosAccountBatch eosAccountBatch7 = (EosAccountBatch) eosAccountRespBatch2.getResponseResult().getData();
                                                    String activeKey2 = eosAccountBatch7 != null ? eosAccountBatch7.getActiveKey() : null;
                                                    Intrinsics.copydefault((Object) activeKey2);
                                                    eOSInfoEntity3.setActiveKey(activeKey2);
                                                    EosAccountBatch eosAccountBatch8 = (EosAccountBatch) eosAccountRespBatch2.getResponseResult().getData();
                                                    String ownerKey3 = eosAccountBatch8 != null ? eosAccountBatch8.getOwnerKey() : null;
                                                    Intrinsics.copydefault((Object) ownerKey3);
                                                    eOSInfoEntity3.setOwnerKey(ownerKey3);
                                                    C56443yFo.KWHzl(list9.add(eOSInfoEntity3));
                                                }
                                                ?? r53 = (ChainAddressEntity) r12.get(eosAccountRespBatch2.getAccountId());
                                                if (r53 != 0) {
                                                    EosAccountBatch eosAccountBatch9 = (EosAccountBatch) eosAccountRespBatch2.getResponseResult().getData();
                                                    if (eosAccountBatch9 != null) {
                                                        String account5 = eosAccountBatch9.getAccount();
                                                        ?? r83 = account5;
                                                        if (account5 == null) {
                                                            r83 = r20;
                                                        }
                                                        r53.setAddress(r83);
                                                        C56443yFo.KWHzl(list10.add(r53));
                                                    }
                                                }
                                                WalletEntity walletEntity11 = (WalletEntity) r144.get(eosAccountRespBatch2.getAccountId());
                                                if (walletEntity11 != null) {
                                                    list6.add(walletEntity11);
                                                    Unit unit10 = Unit.INSTANCE;
                                                }
                                            }
                                        }
                                    }
                                }
                                r5 = r10;
                                ?? r822 = this.this$0.gEmmrt;
                                r20 = r10;
                                ArrayList arrayList132 = new ArrayList(C56403yEb.AYXKKw(list7, 10));
                                it5 = list7.iterator();
                                while (it5.hasNext()) {
                                }
                                this.L$0 = list11;
                                this.L$1 = r14;
                                this.L$2 = r13;
                                this.L$3 = r12;
                                this.L$4 = list8;
                                this.L$5 = list6;
                                this.L$6 = list9;
                                this.L$7 = list10;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.label = 5;
                                objAEQbTJ2 = r822.AEQbTJ(walletId2, r5, arrayList132, this);
                                r12 = r12;
                                r132 = r13;
                                r144 = r14;
                                if (objAEQbTJ2 == obj2) {
                                }
                                abstractC43419rot3 = (AbstractC43419rot) objAEQbTJ2;
                                if (abstractC43419rot3.EZpvd()) {
                                }
                            }
                            list20 = list9;
                            if (!list8.isEmpty()) {
                                C13062cyk c13062cyk3 = this.this$0;
                                this.L$0 = list11;
                                this.L$1 = r12;
                                this.L$2 = list6;
                                this.L$3 = list20;
                                this.L$4 = list10;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.label = 6;
                                if (c13062cyk3.copydefault((List<WalletEntity>) list8, (Continuation<? super Unit>) this) == obj2) {
                                    return obj2;
                                }
                            }
                            list21 = list11;
                            List list33 = list10;
                            list22 = list6;
                            list23 = list33;
                            r122 = r12;
                            if (!(!list20.isEmpty()) || (!list23.isEmpty())) {
                                ?? r34 = this.this$0.OLrzqt;
                                this.L$0 = list21;
                                this.L$1 = r122;
                                this.L$2 = list22;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = null;
                                this.L$6 = null;
                                this.L$7 = null;
                                this.L$8 = null;
                                this.L$9 = null;
                                this.label = 7;
                                objCopydefault = r34.copydefault(list20, list23, this);
                                if (objCopydefault == obj2) {
                                    return obj2;
                                }
                                r52 = r122;
                                if (((Number) objCopydefault).longValue() > 0) {
                                    C10854bwM c10854bwMAhwBna2 = C10954byG.EZpvd.valueOf().AhwBna();
                                    long jCopydefault = C11600cUg.copydefault(c10854bwMAhwBna2 != null ? C56443yFo.KWHzl(c10854bwMAhwBna2.fetchVPNInfo()) : null);
                                    C13062cyk c13062cyk4 = this.this$0;
                                    Iterator it13 = list22.iterator();
                                    List list34 = list21;
                                    c13062cyk = c13062cyk4;
                                    list25 = list22;
                                    j = jCopydefault;
                                    list26 = list34;
                                    r8 = r52;
                                    it7 = it13;
                                    if (!it7.hasNext()) {
                                        obj4 = obj2;
                                        List listFJNWhG2 = CollectionsKt___CollectionsKt.fJNWhG((Collection) list26);
                                        listFJNWhG2.addAll(list25);
                                        list22 = list25;
                                        list24 = listFJNWhG2;
                                        c13062cyk2 = this.this$0;
                                        walletMustSyncOperation = WalletMustSyncOperation.HasRequestEosInfo;
                                        this.L$0 = list22;
                                        this.L$1 = list24;
                                        this.L$2 = null;
                                        this.L$3 = null;
                                        this.L$4 = null;
                                        this.L$5 = null;
                                        this.L$6 = null;
                                        this.L$7 = null;
                                        this.L$8 = null;
                                        this.L$9 = null;
                                        this.label = 9;
                                        if (c13062cyk2.OLrzqt((List<WalletEntity>) list24, walletMustSyncOperation, (Continuation<? super Unit>) this) == obj4) {
                                            return obj4;
                                        }
                                        return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(list24, list22), 0, null, 4, null);
                                    }
                                    ChainAddressEntity chainAddressEntity3 = (ChainAddressEntity) r8.get(((WalletEntity) it7.next()).getId());
                                    if (chainAddressEntity3 == null || chainAddressEntity3.getAddress().length() == 0) {
                                        obj5 = obj2;
                                        obj2 = obj5;
                                        r8 = r8;
                                        if (!it7.hasNext()) {
                                        }
                                    } else {
                                        C13058cyg c13058cyg = c13062cyk.AkhnZx;
                                        String walletId3 = chainAddressEntity3.getWalletId();
                                        Object obj10 = obj2;
                                        List<C11283cIm> listEZpvd = C56402yEa.EZpvd(new C11283cIm(chainAddressEntity3.getAddressType(), j, "", null, null, 24, null));
                                        List<C11283cIm> listAhwBna = yDY.AhwBna();
                                        this.L$0 = list26;
                                        this.L$1 = r8;
                                        this.L$2 = list25;
                                        this.L$3 = c13062cyk;
                                        this.L$4 = it7;
                                        this.L$5 = chainAddressEntity3;
                                        this.L$6 = chainAddressEntity3;
                                        this.J$0 = j;
                                        this.label = 8;
                                        Object objCopydefault3 = c13058cyg.copydefault(walletId3, listEZpvd, listAhwBna, this);
                                        obj5 = obj10;
                                        if (objCopydefault3 == obj5) {
                                            return obj5;
                                        }
                                        list27 = list25;
                                        list28 = list26;
                                        chainAddressEntity = chainAddressEntity3;
                                        r8 = r8;
                                        c13062cyk.isConnected.OLrzqt(chainAddressEntity.getWalletId(), WalletSyncOperation.UpdateDefaultAddress);
                                        list26 = list28;
                                        list25 = list27;
                                        obj2 = obj5;
                                        r8 = r8;
                                        if (!it7.hasNext()) {
                                        }
                                    }
                                }
                            }
                            obj4 = obj2;
                            list24 = list21;
                            c13062cyk2 = this.this$0;
                            walletMustSyncOperation = WalletMustSyncOperation.HasRequestEosInfo;
                            this.L$0 = list22;
                            this.L$1 = list24;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.L$9 = null;
                            this.label = 9;
                            if (c13062cyk2.OLrzqt((List<WalletEntity>) list24, walletMustSyncOperation, (Continuation<? super Unit>) this) == obj4) {
                            }
                            return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(list24, list22), 0, null, 4, null);
                        }
                        map10 = map19;
                        obj2 = obj9;
                        r102 = r105;
                    }
                    list6 = list15;
                    list18 = list16;
                    r42 = r4;
                    r103 = r102;
                    r142 = map5;
                    r15 = map10;
                    list10 = list17;
                    list9 = list14;
                    list7 = list18;
                    list8 = list13;
                    r12 = r142;
                    r13 = r15;
                    r14 = r42;
                    list11 = list12;
                    r10 = r103;
                    if (!list7.isEmpty()) {
                    }
                    list20 = list9;
                    if (!list8.isEmpty()) {
                    }
                    list21 = list11;
                    List list332 = list10;
                    list22 = list6;
                    list23 = list332;
                    r122 = r12;
                    if (!(!list20.isEmpty())) {
                    }
                    ?? r342 = this.this$0.OLrzqt;
                    this.L$0 = list21;
                    this.L$1 = r122;
                    this.L$2 = list22;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.label = 7;
                    objCopydefault = r342.copydefault(list20, list23, this);
                    if (objCopydefault == obj2) {
                    }
                } else {
                    obj2 = objCopydefault2;
                    r10 = "";
                    list6 = list4;
                    r14 = map2;
                    r13 = map;
                    list7 = list2;
                    list8 = arrayList;
                    list9 = arrayList9;
                    list10 = arrayList10;
                    r12 = map3;
                    list11 = list3;
                    if (!list7.isEmpty()) {
                    }
                    list20 = list9;
                    if (!list8.isEmpty()) {
                    }
                    list21 = list11;
                    List list3322 = list10;
                    list22 = list6;
                    list23 = list3322;
                    r122 = r12;
                    if (!(!list20.isEmpty())) {
                    }
                    ?? r3422 = this.this$0.OLrzqt;
                    this.L$0 = list21;
                    this.L$1 = r122;
                    this.L$2 = list22;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.L$9 = null;
                    this.label = 7;
                    objCopydefault = r3422.copydefault(list20, list23, this);
                    if (objCopydefault == obj2) {
                    }
                }
                break;
            case 1:
                List list35 = (List) this.L$9;
                List list36 = (List) this.L$8;
                HashMap map22 = (HashMap) this.L$7;
                HashMap map23 = (HashMap) this.L$6;
                List list37 = (List) this.L$5;
                List list38 = (List) this.L$4;
                Deferred deferred2 = (Deferred) this.L$3;
                List list39 = (List) this.L$2;
                Map map24 = (Map) this.L$1;
                List list40 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map2 = map24;
                list5 = list39;
                list = list38;
                map = map23;
                map3 = map22;
                objAwait = obj;
                list4 = list35;
                deferred = deferred2;
                list2 = list37;
                list3 = list40;
                arrayList = list36;
                map4 = (Map) objAwait;
                this.L$0 = list3;
                this.L$1 = map2;
                this.L$2 = list5;
                this.L$3 = list;
                this.L$4 = list2;
                this.L$5 = map;
                this.L$6 = map3;
                this.L$7 = arrayList;
                this.L$8 = list4;
                this.L$9 = map4;
                this.label = 2;
                objAwait2 = deferred.await(this);
                if (objAwait2 == objCopydefault2) {
                }
                Map map152 = (Map) objAwait2;
                ArrayList arrayList82 = new ArrayList();
                it = list5.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList82.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList92 = new ArrayList();
                ArrayList arrayList102 = new ArrayList();
                HashMap map162 = new HashMap();
                if (!list.isEmpty()) {
                }
                break;
            case 2:
                Map map25 = (Map) this.L$9;
                list4 = (List) this.L$8;
                List list41 = (List) this.L$7;
                map3 = (HashMap) this.L$6;
                map = (HashMap) this.L$5;
                list2 = (List) this.L$4;
                list = (List) this.L$3;
                list5 = (List) this.L$2;
                Map map26 = (Map) this.L$1;
                list3 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                map2 = map26;
                arrayList = list41;
                map4 = map25;
                objAwait2 = obj;
                Map map1522 = (Map) objAwait2;
                ArrayList arrayList822 = new ArrayList();
                it = list5.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList822.iterator();
                while (it2.hasNext()) {
                }
                ArrayList arrayList922 = new ArrayList();
                ArrayList arrayList1022 = new ArrayList();
                HashMap map1622 = new HashMap();
                if (!list.isEmpty()) {
                }
                break;
            case 3:
                map7 = (HashMap) this.L$9;
                List list42 = (List) this.L$8;
                List list43 = (List) this.L$7;
                List list44 = (List) this.L$6;
                List list45 = (List) this.L$5;
                HashMap map27 = (HashMap) this.L$4;
                HashMap map28 = (HashMap) this.L$3;
                List list46 = (List) this.L$2;
                Map map29 = (Map) this.L$1;
                List list47 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                str = "";
                obj3 = objCopydefault2;
                objKWHzl = obj;
                list17 = list42;
                list16 = list46;
                list13 = list45;
                list14 = list43;
                r4 = map29;
                map5 = map27;
                list15 = list44;
                list12 = list47;
                map6 = map28;
                abstractC43419rot = (AbstractC43419rot) objKWHzl;
                if (abstractC43419rot.EZpvd()) {
                }
                list6 = list15;
                list18 = list16;
                r42 = r4;
                r103 = r102;
                r142 = map5;
                r15 = map10;
                list10 = list17;
                list9 = list14;
                list7 = list18;
                list8 = list13;
                r12 = r142;
                r13 = r15;
                r14 = r42;
                list11 = list12;
                r10 = r103;
                if (!list7.isEmpty()) {
                }
                list20 = list9;
                if (!list8.isEmpty()) {
                }
                list21 = list11;
                List list33222 = list10;
                list22 = list6;
                list23 = list33222;
                r122 = r12;
                if (!(!list20.isEmpty())) {
                }
                ?? r34222 = this.this$0.OLrzqt;
                this.L$0 = list21;
                this.L$1 = r122;
                this.L$2 = list22;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 7;
                objCopydefault = r34222.copydefault(list20, list23, this);
                if (objCopydefault == obj2) {
                }
                break;
            case 4:
                map11 = (HashMap) this.L$9;
                list17 = (List) this.L$8;
                list14 = (List) this.L$7;
                list15 = (List) this.L$6;
                list13 = (List) this.L$5;
                HashMap map30 = (HashMap) this.L$4;
                HashMap map31 = (HashMap) this.L$3;
                list16 = (List) this.L$2;
                Map map32 = (Map) this.L$1;
                list12 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = objCopydefault2;
                r104 = "";
                objAEQbTJ = obj;
                r43 = map32;
                r143 = map30;
                r152 = map31;
                abstractC43419rot2 = (AbstractC43419rot) objAEQbTJ;
                if (abstractC43419rot2.EZpvd()) {
                }
                list6 = list15;
                list18 = list16;
                r42 = r43;
                r103 = r104;
                r142 = r143;
                r15 = r152;
                list10 = list17;
                list9 = list14;
                list7 = list18;
                list8 = list13;
                r12 = r142;
                r13 = r15;
                r14 = r42;
                list11 = list12;
                r10 = r103;
                if (!list7.isEmpty()) {
                }
                list20 = list9;
                if (!list8.isEmpty()) {
                }
                list21 = list11;
                List list332222 = list10;
                list22 = list6;
                list23 = list332222;
                r122 = r12;
                if (!(!list20.isEmpty())) {
                }
                ?? r342222 = this.this$0.OLrzqt;
                this.L$0 = list21;
                this.L$1 = r122;
                this.L$2 = list22;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 7;
                objCopydefault = r342222.copydefault(list20, list23, this);
                if (objCopydefault == obj2) {
                }
                break;
            case 5:
                list10 = (List) this.L$7;
                list9 = (List) this.L$6;
                List list48 = (List) this.L$5;
                list8 = (List) this.L$4;
                HashMap map33 = (HashMap) this.L$3;
                HashMap map34 = (HashMap) this.L$2;
                Map map35 = (Map) this.L$1;
                list11 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = obj;
                r20 = "";
                obj2 = objCopydefault2;
                list6 = list48;
                r12 = map33;
                r132 = map34;
                r144 = map35;
                abstractC43419rot3 = (AbstractC43419rot) objAEQbTJ2;
                if (abstractC43419rot3.EZpvd()) {
                }
                list20 = list9;
                if (!list8.isEmpty()) {
                }
                list21 = list11;
                List list3322222 = list10;
                list22 = list6;
                list23 = list3322222;
                r122 = r12;
                if (!(!list20.isEmpty())) {
                }
                ?? r3422222 = this.this$0.OLrzqt;
                this.L$0 = list21;
                this.L$1 = r122;
                this.L$2 = list22;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 7;
                objCopydefault = r3422222.copydefault(list20, list23, this);
                if (objCopydefault == obj2) {
                }
                break;
            case 6:
                List list49 = (List) this.L$4;
                list20 = (List) this.L$3;
                List list50 = (List) this.L$2;
                HashMap map36 = (HashMap) this.L$1;
                List list51 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                r122 = map36;
                obj2 = objCopydefault2;
                list23 = list49;
                list22 = list50;
                list21 = list51;
                if (!(!list20.isEmpty())) {
                }
                ?? r34222222 = this.this$0.OLrzqt;
                this.L$0 = list21;
                this.L$1 = r122;
                this.L$2 = list22;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 7;
                objCopydefault = r34222222.copydefault(list20, list23, this);
                if (objCopydefault == obj2) {
                }
                break;
            case 7:
                list22 = (List) this.L$2;
                HashMap map37 = (HashMap) this.L$1;
                list21 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj2 = objCopydefault2;
                objCopydefault = obj;
                r52 = map37;
                if (((Number) objCopydefault).longValue() > 0) {
                }
                obj4 = obj2;
                list24 = list21;
                c13062cyk2 = this.this$0;
                walletMustSyncOperation = WalletMustSyncOperation.HasRequestEosInfo;
                this.L$0 = list22;
                this.L$1 = list24;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.label = 9;
                if (c13062cyk2.OLrzqt((List<WalletEntity>) list24, walletMustSyncOperation, (Continuation<? super Unit>) this) == obj4) {
                }
                return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(list24, list22), 0, null, 4, null);
            case 8:
                j = this.J$0;
                chainAddressEntity = (ChainAddressEntity) this.L$6;
                it7 = (Iterator) this.L$4;
                c13062cyk = (C13062cyk) this.L$3;
                list27 = (List) this.L$2;
                HashMap map38 = (HashMap) this.L$1;
                List list52 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                obj5 = objCopydefault2;
                list28 = list52;
                r8 = map38;
                c13062cyk.isConnected.OLrzqt(chainAddressEntity.getWalletId(), WalletSyncOperation.UpdateDefaultAddress);
                list26 = list28;
                list25 = list27;
                obj2 = obj5;
                r8 = r8;
                if (!it7.hasNext()) {
                }
                break;
            case 9:
                list24 = (List) this.L$1;
                list22 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                return new C13062cyk.StateListAnimator(new C13062cyk.TaskDescription(list24, list22), 0, null, 4, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

package com.okinc.business.market.features.home_token_list.domain;

import com.okinc.business.market.data.model.HomeTokenData;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25980jNm;
import o.C27783kDe;
import o.C28541kci;
import o.C28542kcj;
import o.C28547kco;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.C56443yFo;
import o.kKG;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_token_list.domain.GetHomeTokenListUseCase$getHomeTokenList-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends HomeToken>>>, Object> {
    final /* synthetic */ AdvancedFilter $filter$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C28542kcj this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1(Continuation continuation, AdvancedFilter advancedFilter, C28542kcj c28542kcj) {
        super(2, continuation);
        this.$filter$inlined = advancedFilter;
        this.this$0 = c28542kcj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1(continuation, this.$filter$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends HomeToken>>> continuation) {
        return ((GetHomeTokenListUseCase$getHomeTokenListgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127 A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132 A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0193 A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197 A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae A[Catch: all -> 0x0081, CancellationException -> 0x0084, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0238 A[Catch: all -> 0x0081, CancellationException -> 0x0084, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0084, all -> 0x0081, blocks: (B:7:0x002b, B:81:0x01ff, B:85:0x0207, B:67:0x01a8, B:69:0x01ae, B:73:0x01d4, B:77:0x01dc, B:86:0x0238, B:10:0x004c, B:13:0x0067, B:60:0x0188, B:63:0x018f, B:55:0x0169, B:57:0x016f, B:66:0x0197, B:65:0x0193, B:14:0x0074, B:54:0x015b, B:21:0x008b, B:51:0x0149, B:24:0x009b, B:42:0x0115, B:44:0x0127, B:45:0x012c, B:47:0x0132, B:48:0x0137, B:27:0x00a5, B:29:0x00ab, B:33:0x00c1, B:35:0x00e3, B:38:0x00eb, B:39:0x00ef, B:32:0x00bc), top: B:92:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0185 -> B:60:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01fc -> B:81:0x01ff). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Map<String, ? extends Object> linkedHashMap;
        Object objAEQbTJ;
        String str;
        String strCopydefault;
        C27783kDe c27783kDe;
        Object objOLrzqt;
        Collection arrayList;
        Iterator it;
        Collection arrayList2;
        Iterator it2;
        Object objCopydefault;
        HomeToken homeToken;
        Object objM7386unboximpl;
        HomeToken homeToken2;
        Collection collection;
        Iterator it3;
        Object objAEQbTJ2;
        Iterator it4;
        String str2;
        Object objCopydefault2 = C56442yFn.copydefault();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                Result.Application application2 = Result.Companion;
                AdvancedFilter advancedFilter = this.$filter$inlined;
                if (advancedFilter == null || (linkedHashMap = C56424yEw.isConnected(this.this$0.OLrzqt.KWHzl(advancedFilter))) == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                linkedHashMap.put("categoryType", C56443yFo.AEQbTJ(4));
                linkedHashMap.put("page", C56443yFo.AEQbTJ(1));
                linkedHashMap.put("pageSize", C56443yFo.AEQbTJ(200));
                AdvancedFilter advancedFilter2 = this.$filter$inlined;
                List<String> listAEQbTJ = advancedFilter2 != null ? advancedFilter2.AEQbTJ() : null;
                if (listAEQbTJ == null) {
                    listAEQbTJ = yDY.AhwBna();
                }
                linkedHashMap.put("chainId", CollectionsKt___CollectionsKt.joinToString$default(listAEQbTJ, ",", null, null, 0, null, null, 62, null));
                kKG kkg = this.this$0.gEmmrt;
                this.L$0 = linkedHashMap;
                this.label = 1;
                objAEQbTJ = kkg.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault2) {
                    return objCopydefault2;
                }
                str = (String) objAEQbTJ;
                strCopydefault = this.this$0.gEmmrt.copydefault();
                if (str.length() > 0) {
                    linkedHashMap.put("accountId", str);
                }
                if (strCopydefault.length() > 0) {
                    linkedHashMap.put("walletAddress", strCopydefault);
                }
                c27783kDe = this.this$0.KWHzl;
                this.L$0 = linkedHashMap;
                this.label = 2;
                if (c27783kDe.EZpvd(strCopydefault, str, this) == objCopydefault2) {
                    return objCopydefault2;
                }
                C28547kco c28547kco = this.this$0.AhwBna;
                this.L$0 = null;
                this.label = 3;
                objOLrzqt = c28547kco.OLrzqt(linkedHashMap, this);
                if (objOLrzqt == objCopydefault2) {
                    return objCopydefault2;
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList = new ArrayList();
                it = ((Iterable) objOLrzqt).iterator();
                if (!it.hasNext()) {
                    HomeTokenData homeTokenData = (HomeTokenData) it.next();
                    C28541kci c28541kci = this.this$0.valueOf;
                    this.L$0 = arrayList;
                    this.L$1 = it;
                    this.label = 4;
                    objCopydefault = c28541kci.copydefault(homeTokenData, this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    if (Result.m7383isFailureimpl(objCopydefault)) {
                        objCopydefault = null;
                    }
                    homeToken = (HomeToken) objCopydefault;
                    if (homeToken != null) {
                        arrayList.add(homeToken);
                    }
                    if (!it.hasNext()) {
                        List list = (List) arrayList;
                        arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                            homeToken2 = (HomeToken) it2.next();
                            C25980jNm c25980jNm = this.this$0.AEQbTJ;
                            String strOLrzqt = homeToken2.OLrzqt();
                            this.L$0 = arrayList2;
                            this.L$1 = it2;
                            this.L$2 = homeToken2;
                            this.L$3 = arrayList2;
                            this.L$4 = null;
                            this.label = 5;
                            objM7386unboximpl = c25980jNm.copydefault(strOLrzqt, this);
                            if (objM7386unboximpl == objCopydefault2) {
                                return objCopydefault2;
                            }
                            it3 = it2;
                            collection = arrayList2;
                            if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                                objM7386unboximpl = "";
                            }
                            String str3 = (String) objM7386unboximpl;
                            C25980jNm c25980jNm2 = this.this$0.AEQbTJ;
                            String strOLrzqt2 = homeToken2.OLrzqt();
                            this.L$0 = collection;
                            this.L$1 = it3;
                            this.L$2 = homeToken2;
                            this.L$3 = str3;
                            this.L$4 = arrayList2;
                            this.label = 6;
                            objAEQbTJ2 = c25980jNm2.AEQbTJ(strOLrzqt2, this);
                            if (objAEQbTJ2 != objCopydefault2) {
                                return objCopydefault2;
                            }
                            it4 = it3;
                            str2 = str3;
                            if (Result.m7380exceptionOrNullimpl(objAEQbTJ2) == null) {
                                objAEQbTJ2 = "";
                            }
                            arrayList2.add(homeToken2.EZpvd((1048541 & 1) != 0 ? homeToken2.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken2.KWHzl : (String) objAEQbTJ2, (1048541 & 4) != 0 ? homeToken2.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken2.fARcdN : null, (1048541 & 16) != 0 ? homeToken2.fIwbmz : null, (1048541 & 32) != 0 ? homeToken2.OLrzqt : str2, (1048541 & 64) != 0 ? homeToken2.AkhnZx : null, (1048541 & 128) != 0 ? homeToken2.EZpvd : null, (1048541 & 256) != 0 ? homeToken2.ejfBZ : null, (1048541 & 512) != 0 ? homeToken2.copydefault : null, (1048541 & 1024) != 0 ? homeToken2.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken2.AuCTel : null, (1048541 & 4096) != 0 ? homeToken2.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken2.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken2.djBIcL : null, (1048541 & 32768) != 0 ? homeToken2.AhwBna : null, (1048541 & 65536) != 0 ? homeToken2.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken2.values : null, (1048541 & 262144) != 0 ? homeToken2.valueOf : null, (1048541 & 524288) != 0 ? homeToken2.isConnected : null));
                            arrayList2 = collection;
                            it2 = it4;
                            if (it2.hasNext()) {
                                objM7377constructorimpl = Result.m7377constructorimpl((List) arrayList2);
                                return Result.m7376boximpl(objM7377constructorimpl);
                            }
                        }
                    }
                }
                break;
            case 1:
                linkedHashMap = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj;
                str = (String) objAEQbTJ;
                strCopydefault = this.this$0.gEmmrt.copydefault();
                if (str.length() > 0) {
                }
                if (strCopydefault.length() > 0) {
                }
                c27783kDe = this.this$0.KWHzl;
                this.L$0 = linkedHashMap;
                this.label = 2;
                if (c27783kDe.EZpvd(strCopydefault, str, this) == objCopydefault2) {
                }
                C28547kco c28547kco2 = this.this$0.AhwBna;
                this.L$0 = null;
                this.label = 3;
                objOLrzqt = c28547kco2.OLrzqt(linkedHashMap, this);
                if (objOLrzqt == objCopydefault2) {
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList = new ArrayList();
                it = ((Iterable) objOLrzqt).iterator();
                if (!it.hasNext()) {
                }
                break;
            case 2:
                linkedHashMap = (Map) this.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                C28547kco c28547kco22 = this.this$0.AhwBna;
                this.L$0 = null;
                this.label = 3;
                objOLrzqt = c28547kco22.OLrzqt(linkedHashMap, this);
                if (objOLrzqt == objCopydefault2) {
                }
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList = new ArrayList();
                it = ((Iterable) objOLrzqt).iterator();
                if (!it.hasNext()) {
                }
                break;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objOLrzqt);
                arrayList = new ArrayList();
                it = ((Iterable) objOLrzqt).iterator();
                if (!it.hasNext()) {
                }
                break;
            case 4:
                it = (Iterator) this.L$1;
                arrayList = (Collection) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objCopydefault = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objCopydefault)) {
                }
                homeToken = (HomeToken) objCopydefault;
                if (homeToken != null) {
                }
                if (!it.hasNext()) {
                }
                break;
            case 5:
                arrayList2 = (Collection) this.L$3;
                HomeToken homeToken3 = (HomeToken) this.L$2;
                Iterator it5 = (Iterator) this.L$1;
                Collection collection2 = (Collection) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                homeToken2 = homeToken3;
                collection = collection2;
                it3 = it5;
                if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) == null) {
                }
                String str32 = (String) objM7386unboximpl;
                C25980jNm c25980jNm22 = this.this$0.AEQbTJ;
                String strOLrzqt22 = homeToken2.OLrzqt();
                this.L$0 = collection;
                this.L$1 = it3;
                this.L$2 = homeToken2;
                this.L$3 = str32;
                this.L$4 = arrayList2;
                this.label = 6;
                objAEQbTJ2 = c25980jNm22.AEQbTJ(strOLrzqt22, this);
                if (objAEQbTJ2 != objCopydefault2) {
                }
                break;
            case 6:
                arrayList2 = (Collection) this.L$4;
                String str4 = (String) this.L$3;
                homeToken2 = (HomeToken) this.L$2;
                Iterator it6 = (Iterator) this.L$1;
                Collection collection3 = (Collection) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ2 = ((Result) obj).m7386unboximpl();
                str2 = str4;
                it4 = it6;
                collection = collection3;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ2) == null) {
                }
                arrayList2.add(homeToken2.EZpvd((1048541 & 1) != 0 ? homeToken2.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken2.KWHzl : (String) objAEQbTJ2, (1048541 & 4) != 0 ? homeToken2.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken2.fARcdN : null, (1048541 & 16) != 0 ? homeToken2.fIwbmz : null, (1048541 & 32) != 0 ? homeToken2.OLrzqt : str2, (1048541 & 64) != 0 ? homeToken2.AkhnZx : null, (1048541 & 128) != 0 ? homeToken2.EZpvd : null, (1048541 & 256) != 0 ? homeToken2.ejfBZ : null, (1048541 & 512) != 0 ? homeToken2.copydefault : null, (1048541 & 1024) != 0 ? homeToken2.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken2.AuCTel : null, (1048541 & 4096) != 0 ? homeToken2.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken2.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken2.djBIcL : null, (1048541 & 32768) != 0 ? homeToken2.AhwBna : null, (1048541 & 65536) != 0 ? homeToken2.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken2.values : null, (1048541 & 262144) != 0 ? homeToken2.valueOf : null, (1048541 & 524288) != 0 ? homeToken2.isConnected : null));
                arrayList2 = collection;
                it2 = it4;
                if (it2.hasNext()) {
                }
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

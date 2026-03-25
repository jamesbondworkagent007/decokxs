package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C25980jNm;
import o.C27625jyi;
import o.C28409kaI;
import o.C28422kaV;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.FilterFavoriteListUseCase$apply-0E7RQCE$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends HomeToken>>>, Object> {
    final /* synthetic */ HomeFavoriteListFilter $filter$inlined;
    final /* synthetic */ List $items$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C28409kaI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1(Continuation continuation, List list, HomeFavoriteListFilter homeFavoriteListFilter, C28409kaI c28409kaI) {
        super(2, continuation);
        this.$items$inlined = list;
        this.$filter$inlined = homeFavoriteListFilter;
        this.this$0 = c28409kaI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1(continuation, this.$items$inlined, this.$filter$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends HomeToken>>> continuation) {
        return ((FilterFavoriteListUseCase$apply0E7RQCE$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d A[Catch: all -> 0x010a, CancellationException -> 0x0121, TryCatch #2 {CancellationException -> 0x0121, all -> 0x010a, blocks: (B:6:0x001d, B:28:0x00c6, B:32:0x00cf, B:34:0x00fe, B:20:0x0087, B:22:0x008d, B:24:0x00a9, B:35:0x0103, B:11:0x0036, B:12:0x0043, B:14:0x0049, B:16:0x0062, B:18:0x0072, B:19:0x0076), top: B:43:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0103 A[Catch: all -> 0x010a, CancellationException -> 0x0121, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0121, all -> 0x010a, blocks: (B:6:0x001d, B:28:0x00c6, B:32:0x00cf, B:34:0x00fe, B:20:0x0087, B:22:0x008d, B:24:0x00a9, B:35:0x0103, B:11:0x0036, B:12:0x0043, B:14:0x0049, B:16:0x0062, B:18:0x0072, B:19:0x0076), top: B:43:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00c4 -> B:28:0x00c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00fc -> B:34:0x00fe). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Iterator it;
        Collection collection;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            List list = this.$items$inlined;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                C28422kaV c28422kaV = (C28422kaV) obj2;
                if (C27625jyi.copydefault.OLrzqt().contains(this.$filter$inlined.OLrzqt()) || Intrinsics.EZpvd((Object) c28422kaV.EZpvd(), (Object) this.$filter$inlined.OLrzqt())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            it = arrayList.iterator();
            collection = arrayList2;
            if (!it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HomeToken homeToken = (HomeToken) this.L$3;
            collection = (Collection) this.L$2;
            it = (Iterator) this.L$1;
            Collection collection2 = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objAEQbTJ = ((Result) obj).m7386unboximpl();
            HomeToken homeToken2 = homeToken;
            if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                objAEQbTJ = "";
            }
            HomeToken homeTokenEZpvd = homeToken2.EZpvd((1048541 & 1) != 0 ? homeToken2.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken2.KWHzl : (String) objAEQbTJ, (1048541 & 4) != 0 ? homeToken2.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken2.fARcdN : null, (1048541 & 16) != 0 ? homeToken2.fIwbmz : null, (1048541 & 32) != 0 ? homeToken2.OLrzqt : null, (1048541 & 64) != 0 ? homeToken2.AkhnZx : null, (1048541 & 128) != 0 ? homeToken2.EZpvd : null, (1048541 & 256) != 0 ? homeToken2.ejfBZ : null, (1048541 & 512) != 0 ? homeToken2.copydefault : null, (1048541 & 1024) != 0 ? homeToken2.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken2.AuCTel : null, (1048541 & 4096) != 0 ? homeToken2.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken2.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken2.djBIcL : null, (1048541 & 32768) != 0 ? homeToken2.AhwBna : null, (1048541 & 65536) != 0 ? homeToken2.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken2.values : null, (1048541 & 262144) != 0 ? homeToken2.valueOf : null, (1048541 & 524288) != 0 ? homeToken2.isConnected : null);
            collection.add(homeTokenEZpvd);
            collection = collection2;
            if (!it.hasNext()) {
                C28422kaV c28422kaV2 = (C28422kaV) it.next();
                HomeToken homeTokenCopydefault = this.this$0.copydefault(c28422kaV2, this.$filter$inlined.djBIcL());
                if (homeTokenCopydefault.EZpvd().length() == 0) {
                    C25980jNm c25980jNm = this.this$0.KWHzl;
                    String strEZpvd = c28422kaV2.EZpvd();
                    this.L$0 = collection;
                    this.L$1 = it;
                    this.L$2 = collection;
                    this.L$3 = homeTokenCopydefault;
                    this.label = 1;
                    objAEQbTJ = c25980jNm.AEQbTJ(strEZpvd, this);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    homeToken2 = homeTokenCopydefault;
                    collection2 = collection;
                    if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    }
                    HomeToken homeTokenEZpvd2 = homeToken2.EZpvd((1048541 & 1) != 0 ? homeToken2.AEQbTJ : null, (1048541 & 2) != 0 ? homeToken2.KWHzl : (String) objAEQbTJ, (1048541 & 4) != 0 ? homeToken2.fetchVPNInfo : null, (1048541 & 8) != 0 ? homeToken2.fARcdN : null, (1048541 & 16) != 0 ? homeToken2.fIwbmz : null, (1048541 & 32) != 0 ? homeToken2.OLrzqt : null, (1048541 & 64) != 0 ? homeToken2.AkhnZx : null, (1048541 & 128) != 0 ? homeToken2.EZpvd : null, (1048541 & 256) != 0 ? homeToken2.ejfBZ : null, (1048541 & 512) != 0 ? homeToken2.copydefault : null, (1048541 & 1024) != 0 ? homeToken2.DbNXlk : null, (1048541 & 2048) != 0 ? homeToken2.AuCTel : null, (1048541 & 4096) != 0 ? homeToken2.fJNWhG : null, (1048541 & 8192) != 0 ? homeToken2.gEmmrt : null, (1048541 & 16384) != 0 ? homeToken2.djBIcL : null, (1048541 & 32768) != 0 ? homeToken2.AhwBna : null, (1048541 & 65536) != 0 ? homeToken2.AYXKKw : false, (1048541 & 131072) != 0 ? homeToken2.values : null, (1048541 & 262144) != 0 ? homeToken2.valueOf : null, (1048541 & 524288) != 0 ? homeToken2.isConnected : null);
                    collection.add(homeTokenEZpvd2);
                    collection = collection2;
                    if (!it.hasNext()) {
                        objM7377constructorimpl = Result.m7377constructorimpl((List) collection);
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                } else {
                    homeTokenEZpvd2 = homeTokenCopydefault;
                    collection2 = collection;
                    collection.add(homeTokenEZpvd2);
                    collection = collection2;
                    if (!it.hasNext()) {
                    }
                }
            }
        }
    }
}

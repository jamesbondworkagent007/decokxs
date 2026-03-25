package com.okinc.dexkline.market.features.token_detail.domain;

import com.okinc.dexkline.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean;
import com.okinc.dexkline.market.common.constants.StringBooleanType;
import com.okinc.dexkline.market.data.model.CompactTagData;
import com.okinc.dexkline.market.data.model.TagExtraData;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import com.okinc.dexkline.market.features.token_detail.TokenDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C34541ndy;
import o.C34576neg;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59443zhD;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.token_detail.domain.MapTokenDetailUseCase$map-gIAlu-s$$inlined$dexRunCatching$2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TokenDetail>>, Object> {
    final /* synthetic */ MarketTxWsInfoItemBean $from$inlined;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ C34576neg this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2(Continuation continuation, MarketTxWsInfoItemBean marketTxWsInfoItemBean, C34576neg c34576neg) {
        super(2, continuation);
        this.$from$inlined = marketTxWsInfoItemBean;
        this.this$0 = c34576neg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TokenDetail>> continuation) {
        return ((MapTokenDetailUseCase$mapgIAlus$$inlined$dexRunCatching$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c A[Catch: all -> 0x027e, CancellationException -> 0x0295, TryCatch #2 {CancellationException -> 0x0295, all -> 0x027e, blocks: (B:7:0x0015, B:48:0x016b, B:52:0x0173, B:54:0x0177, B:57:0x0183, B:60:0x0191, B:63:0x01a5, B:61:0x0198, B:62:0x019f, B:12:0x0042, B:22:0x00e3, B:25:0x00ea, B:27:0x00ee, B:16:0x0096, B:18:0x009c, B:29:0x00f3, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:44:0x0135, B:38:0x0118, B:39:0x011c, B:41:0x0122, B:15:0x0057), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ee A[Catch: all -> 0x027e, CancellationException -> 0x0295, TryCatch #2 {CancellationException -> 0x0295, all -> 0x027e, blocks: (B:7:0x0015, B:48:0x016b, B:52:0x0173, B:54:0x0177, B:57:0x0183, B:60:0x0191, B:63:0x01a5, B:61:0x0198, B:62:0x019f, B:12:0x0042, B:22:0x00e3, B:25:0x00ea, B:27:0x00ee, B:16:0x0096, B:18:0x009c, B:29:0x00f3, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:44:0x0135, B:38:0x0118, B:39:0x011c, B:41:0x0122, B:15:0x0057), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[Catch: all -> 0x027e, CancellationException -> 0x0295, TryCatch #2 {CancellationException -> 0x0295, all -> 0x027e, blocks: (B:7:0x0015, B:48:0x016b, B:52:0x0173, B:54:0x0177, B:57:0x0183, B:60:0x0191, B:63:0x01a5, B:61:0x0198, B:62:0x019f, B:12:0x0042, B:22:0x00e3, B:25:0x00ea, B:27:0x00ee, B:16:0x0096, B:18:0x009c, B:29:0x00f3, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:44:0x0135, B:38:0x0118, B:39:0x011c, B:41:0x0122, B:15:0x0057), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0177 A[Catch: all -> 0x027e, CancellationException -> 0x0295, TryCatch #2 {CancellationException -> 0x0295, all -> 0x027e, blocks: (B:7:0x0015, B:48:0x016b, B:52:0x0173, B:54:0x0177, B:57:0x0183, B:60:0x0191, B:63:0x01a5, B:61:0x0198, B:62:0x019f, B:12:0x0042, B:22:0x00e3, B:25:0x00ea, B:27:0x00ee, B:16:0x0096, B:18:0x009c, B:29:0x00f3, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:44:0x0135, B:38:0x0118, B:39:0x011c, B:41:0x0122, B:15:0x0057), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[Catch: all -> 0x027e, CancellationException -> 0x0295, TryCatch #2 {CancellationException -> 0x0295, all -> 0x027e, blocks: (B:7:0x0015, B:48:0x016b, B:52:0x0173, B:54:0x0177, B:57:0x0183, B:60:0x0191, B:63:0x01a5, B:61:0x0198, B:62:0x019f, B:12:0x0042, B:22:0x00e3, B:25:0x00ea, B:27:0x00ee, B:16:0x0096, B:18:0x009c, B:29:0x00f3, B:31:0x0107, B:33:0x010d, B:35:0x0111, B:44:0x0135, B:38:0x0118, B:39:0x011c, B:41:0x0122, B:15:0x0057), top: B:71:0x000b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d9 -> B:22:0x00e3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Float f;
        Float f2;
        Integer num;
        Iterator it;
        Collection collection;
        Integer num2;
        List list;
        Object objKWHzl;
        List list2;
        TagWrapper tagWrapper;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Result.Application application2 = Result.Companion;
            Float fFIwbmz = C59443zhD.fIwbmz(this.$from$inlined.DbNXlk());
            Float fFIwbmz2 = C59443zhD.fIwbmz(this.$from$inlined.wlaJM());
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$from$inlined.zLjUOn());
            Integer intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(this.$from$inlined.values());
            List<CompactTagData> listIwGUEr = this.$from$inlined.iwGUEr();
            ArrayList arrayList = new ArrayList();
            f = fFIwbmz;
            f2 = fFIwbmz2;
            num = intOrNull;
            it = listIwGUEr.iterator();
            collection = arrayList;
            num2 = intOrNull2;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                if (Result.m7383isFailureimpl(objKWHzl)) {
                    obj2 = objKWHzl;
                }
                tagWrapper = (TagWrapper) obj2;
                if (tagWrapper != null) {
                    C56443yFo.KWHzl(list2.add(tagWrapper));
                }
                list = list2;
                int iEZpvd = this.this$0.copydefault.EZpvd();
                objM7377constructorimpl = Result.m7377constructorimpl(new TokenDetail(this.$from$inlined.OLrzqt(), iEZpvd != 1 ? iEZpvd != 2 ? this.$from$inlined.AEQbTJ() : this.$from$inlined.djBIcL() : this.$from$inlined.AhwBna(), this.$from$inlined.KWHzl(), this.$from$inlined.copydefault(), this.$from$inlined.AYXKKw(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.uzCIH(), this.$from$inlined.getFieldNames(), this.$from$inlined.hDKMBd(), this.$from$inlined.wlaJM(), this.$from$inlined.AxsJAY(), this.$from$inlined.sSMYrx(), this.$from$inlined.AwvSrB(), this.$from$inlined.gHZMYf(), this.$from$inlined.ORxRYg(), this.$from$inlined.DTwDnp(), this.$from$inlined.QKVWgx(), this.$from$inlined.QOLQEE(), this.$from$inlined.QVAiDq(), this.$from$inlined.QfsBiF(), this.$from$inlined.fARcdN(), this.$from$inlined.AuCTel(), this.$from$inlined.fJNWhG(), this.$from$inlined.getNewProxyInstance(), this.$from$inlined.zsXlph(), this.$from$inlined.AubY(), this.$from$inlined.zuBGHE(), this.$from$inlined.OcIXYQ(), this.$from$inlined.isConnected(), this.$from$inlined.ejfBZ(), this.$from$inlined.gEmmrt(), this.$from$inlined.fIwbmz(), this.$from$inlined.AuCTelauCTel(), list, this.$from$inlined.AkhnZx(), this.$from$inlined.valueOf()));
                return Result.m7376boximpl(objM7377constructorimpl);
            }
            Iterator it2 = (Iterator) this.L$5;
            Collection collection2 = (Collection) this.L$4;
            Integer num3 = (Integer) this.L$3;
            Integer num4 = (Integer) this.L$2;
            Float f3 = (Float) this.L$1;
            Float f4 = (Float) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objKWHzl2 = ((Result) obj).m7386unboximpl();
            it = it2;
            collection = collection2;
            f2 = f3;
            f = f4;
            num2 = num3;
            if (Result.m7383isFailureimpl(objKWHzl2)) {
                objKWHzl2 = null;
            }
            TagWrapper tagWrapper2 = (TagWrapper) objKWHzl2;
            if (tagWrapper2 != null) {
                collection.add(tagWrapper2);
            }
            num = num4;
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C34541ndy c34541ndy = this.this$0.EZpvd;
                this.L$0 = f;
                this.L$1 = f2;
                this.L$2 = num;
                this.L$3 = num2;
                this.L$4 = collection;
                this.L$5 = it;
                this.label = 1;
                Integer num5 = num2;
                Integer num6 = num;
                Float f5 = f2;
                Float f6 = f;
                Collection collection3 = collection;
                objKWHzl2 = c34541ndy.KWHzl(compactTagData, (30 & 2) != 0 ? null : f, (30 & 4) != 0 ? null : f2, (30 & 8) != 0 ? null : num, (30 & 16) != 0 ? null : num2, (30 & 32) != 0 ? null : null, this);
                if (objKWHzl2 == objCopydefault) {
                    return objCopydefault;
                }
                f2 = f5;
                collection = collection3;
                num2 = num5;
                num4 = num6;
                f = f6;
                if (Result.m7383isFailureimpl(objKWHzl2)) {
                }
                TagWrapper tagWrapper22 = (TagWrapper) objKWHzl2;
                if (tagWrapper22 != null) {
                }
                num = num4;
                if (it.hasNext()) {
                    Integer num7 = num2;
                    Integer num8 = num;
                    Float f7 = f2;
                    Float f8 = f;
                    List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG(collection);
                    if (num8 != null && num8.intValue() > 0) {
                        if (!(listFJNWhG instanceof Collection) || !listFJNWhG.isEmpty()) {
                            Iterator it3 = listFJNWhG.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.EZpvd((Object) ((TagWrapper) it3.next()).KWHzl(), (Object) "sniper")) {
                                }
                            }
                        }
                        CompactTagData compactTagData2 = new CompactTagData("sniper", (StringBooleanType) null, (TagExtraData) null, 6, (DefaultConstructorMarker) null);
                        C34541ndy c34541ndy2 = this.this$0.EZpvd;
                        this.L$0 = listFJNWhG;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.label = 2;
                        objKWHzl = c34541ndy2.KWHzl(compactTagData2, (30 & 2) != 0 ? null : f8, (30 & 4) != 0 ? null : f7, (30 & 8) != 0 ? null : num8, (30 & 16) != 0 ? null : num7, (30 & 32) != 0 ? null : null, this);
                        if (objKWHzl == objCopydefault) {
                            return objCopydefault;
                        }
                        list2 = listFJNWhG;
                        if (Result.m7383isFailureimpl(objKWHzl)) {
                        }
                        tagWrapper = (TagWrapper) obj2;
                        if (tagWrapper != null) {
                        }
                        list = list2;
                        int iEZpvd2 = this.this$0.copydefault.EZpvd();
                        objM7377constructorimpl = Result.m7377constructorimpl(new TokenDetail(this.$from$inlined.OLrzqt(), iEZpvd2 != 1 ? iEZpvd2 != 2 ? this.$from$inlined.AEQbTJ() : this.$from$inlined.djBIcL() : this.$from$inlined.AhwBna(), this.$from$inlined.KWHzl(), this.$from$inlined.copydefault(), this.$from$inlined.AYXKKw(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.uzCIH(), this.$from$inlined.getFieldNames(), this.$from$inlined.hDKMBd(), this.$from$inlined.wlaJM(), this.$from$inlined.AxsJAY(), this.$from$inlined.sSMYrx(), this.$from$inlined.AwvSrB(), this.$from$inlined.gHZMYf(), this.$from$inlined.ORxRYg(), this.$from$inlined.DTwDnp(), this.$from$inlined.QKVWgx(), this.$from$inlined.QOLQEE(), this.$from$inlined.QVAiDq(), this.$from$inlined.QfsBiF(), this.$from$inlined.fARcdN(), this.$from$inlined.AuCTel(), this.$from$inlined.fJNWhG(), this.$from$inlined.getNewProxyInstance(), this.$from$inlined.zsXlph(), this.$from$inlined.AubY(), this.$from$inlined.zuBGHE(), this.$from$inlined.OcIXYQ(), this.$from$inlined.isConnected(), this.$from$inlined.ejfBZ(), this.$from$inlined.gEmmrt(), this.$from$inlined.fIwbmz(), this.$from$inlined.AuCTelauCTel(), list, this.$from$inlined.AkhnZx(), this.$from$inlined.valueOf()));
                        return Result.m7376boximpl(objM7377constructorimpl);
                    }
                    list = listFJNWhG;
                    int iEZpvd22 = this.this$0.copydefault.EZpvd();
                    objM7377constructorimpl = Result.m7377constructorimpl(new TokenDetail(this.$from$inlined.OLrzqt(), iEZpvd22 != 1 ? iEZpvd22 != 2 ? this.$from$inlined.AEQbTJ() : this.$from$inlined.djBIcL() : this.$from$inlined.AhwBna(), this.$from$inlined.KWHzl(), this.$from$inlined.copydefault(), this.$from$inlined.AYXKKw(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.uzCIH(), this.$from$inlined.getFieldNames(), this.$from$inlined.hDKMBd(), this.$from$inlined.wlaJM(), this.$from$inlined.AxsJAY(), this.$from$inlined.sSMYrx(), this.$from$inlined.AwvSrB(), this.$from$inlined.gHZMYf(), this.$from$inlined.ORxRYg(), this.$from$inlined.DTwDnp(), this.$from$inlined.QKVWgx(), this.$from$inlined.QOLQEE(), this.$from$inlined.QVAiDq(), this.$from$inlined.QfsBiF(), this.$from$inlined.fARcdN(), this.$from$inlined.AuCTel(), this.$from$inlined.fJNWhG(), this.$from$inlined.getNewProxyInstance(), this.$from$inlined.zsXlph(), this.$from$inlined.AubY(), this.$from$inlined.zuBGHE(), this.$from$inlined.OcIXYQ(), this.$from$inlined.isConnected(), this.$from$inlined.ejfBZ(), this.$from$inlined.gEmmrt(), this.$from$inlined.fIwbmz(), this.$from$inlined.AuCTelauCTel(), list, this.$from$inlined.AkhnZx(), this.$from$inlined.valueOf()));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}

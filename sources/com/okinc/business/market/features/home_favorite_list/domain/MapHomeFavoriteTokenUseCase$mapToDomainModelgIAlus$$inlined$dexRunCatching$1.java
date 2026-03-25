package com.okinc.business.market.features.home_favorite_list.domain;

import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.HomeFavoriteTokenData;
import com.okinc.business.market.features.tag.domain.TagWrapper;
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
import kotlinx.coroutines.CoroutineScope;
import o.C28413kaM;
import o.C28422kaV;
import o.C29712kyn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_favorite_list.domain.MapHomeFavoriteTokenUseCase$mapToDomainModel-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends C28422kaV>>, Object> {
    final /* synthetic */ HomeFavoriteTokenData $from$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28413kaM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(Continuation continuation, HomeFavoriteTokenData homeFavoriteTokenData, C28413kaM c28413kaM) {
        super(2, continuation);
        this.$from$inlined = homeFavoriteTokenData;
        this.this$0 = c28413kaM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends C28422kaV>> continuation) {
        return ((MapHomeFavoriteTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x018e, CancellationException -> 0x01a5, TryCatch #2 {CancellationException -> 0x01a5, all -> 0x018e, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:27:0x0149, B:22:0x0076, B:11:0x002e), top: B:35:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x018e, CancellationException -> 0x01a5, TryCatch #2 {CancellationException -> 0x01a5, all -> 0x018e, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:27:0x0149, B:22:0x0076, B:11:0x002e), top: B:35:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: all -> 0x018e, CancellationException -> 0x01a5, TryCatch #2 {CancellationException -> 0x01a5, all -> 0x018e, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:27:0x0149, B:22:0x0076, B:11:0x002e), top: B:35:0x0009 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:17:0x006b). Please report as a decompilation issue!!! */
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
            List<CompactTagData> listIsConnected = this.$from$inlined.isConnected();
            ArrayList arrayList = new ArrayList();
            it = listIsConnected.iterator();
            collection = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) this.L$1;
            Collection collection2 = (Collection) this.L$0;
            C56391yDq.AEQbTJ(obj);
            Object objEZpvd = ((Result) obj).m7386unboximpl();
            it = it2;
            collection = collection2;
            if (Result.m7383isFailureimpl(objEZpvd)) {
                objEZpvd = null;
            }
            TagWrapper tagWrapper = (TagWrapper) objEZpvd;
            if (tagWrapper != null) {
                collection.add(tagWrapper);
            }
            if (it.hasNext()) {
                CompactTagData compactTagData = (CompactTagData) it.next();
                C29712kyn c29712kyn = this.this$0.EZpvd;
                this.L$0 = collection;
                this.L$1 = it;
                this.label = 1;
                objEZpvd = c29712kyn.EZpvd(compactTagData, (62 & 2) != 0 ? null : null, (62 & 4) != 0 ? null : null, (62 & 8) != 0 ? null : null, (62 & 16) != 0 ? null : null, (62 & 32) != 0 ? null : null, this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                if (Result.m7383isFailureimpl(objEZpvd)) {
                }
                TagWrapper tagWrapper2 = (TagWrapper) objEZpvd;
                if (tagWrapper2 != null) {
                }
                if (it.hasNext()) {
                    objM7377constructorimpl = Result.m7377constructorimpl(new C28422kaV(this.$from$inlined.AYXKKw(), this.$from$inlined.copydefault(), this.$from$inlined.fIwbmz(), this.$from$inlined.AEQbTJ(), this.$from$inlined.EZpvd(), this.$from$inlined.fJNWhG(), this.$from$inlined.fARcdN(), this.$from$inlined.AuCTel(), RiskControlLevel.Companion.copydefault(this.$from$inlined.ejfBZ()), this.$from$inlined.QOLQEE(), this.$from$inlined.QKVWgx(), this.$from$inlined.ORxRYg(), this.$from$inlined.OcIXYQ(), this.$from$inlined.valueOf(), this.$from$inlined.djBIcL(), this.$from$inlined.gEmmrt(), this.$from$inlined.OLrzqt(), this.$from$inlined.fetchVPNInfo(), this.$from$inlined.uzCIH(), this.$from$inlined.getNewProxyInstance(), this.$from$inlined.hDKMBd(), this.$from$inlined.iwGUEr(), this.$from$inlined.DTwDnp(), this.$from$inlined.AwvSrB(), this.$from$inlined.gHZMYf(), this.$from$inlined.AxsJAY(), this.$from$inlined.DbNXlk(), this.$from$inlined.values(), this.$from$inlined.AhwBna(), this.$from$inlined.QbewEr(), this.$from$inlined.QUSxYX() == StringBooleanType.TRUE, this.$from$inlined.AkhnZx(), this.$from$inlined.AubY(), this.$from$inlined.zLjUOn(), this.$from$inlined.AuCTelauCTel(), this.$from$inlined.getFieldNames(), this.$from$inlined.sSMYrx(), this.$from$inlined.wlaJM(), this.$from$inlined.zuBGHE(), this.$from$inlined.zsXlph(), this.$from$inlined.QfsBiF(), (List) collection));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}

package com.okinc.business.market.features.home_token_list.domain;

import com.okinc.business.market.common.constants.RiskControlLevel;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.HomeTokenData;
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
import o.C28541kci;
import o.C29712kyn;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.home_token_list.domain.MapHomeTokenUseCase$mapToDomainModel-gIAlu-s$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends HomeToken>>, Object> {
    final /* synthetic */ HomeTokenData $from$inlined;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C28541kci this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(Continuation continuation, HomeTokenData homeTokenData, C28541kci c28541kci) {
        super(2, continuation);
        this.$from$inlined = homeTokenData;
        this.this$0 = c28541kci;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1(continuation, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends HomeToken>> continuation) {
        return ((MapHomeTokenUseCase$mapToDomainModelgIAlus$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[Catch: all -> 0x010d, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, all -> 0x010d, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:22:0x0076, B:11:0x002e), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x010d, CancellationException -> 0x0124, TryCatch #2 {CancellationException -> 0x0124, all -> 0x010d, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:22:0x0076, B:11:0x002e), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a A[Catch: all -> 0x010d, CancellationException -> 0x0124, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0124, all -> 0x010d, blocks: (B:6:0x0015, B:17:0x006b, B:20:0x0072, B:12:0x0041, B:14:0x0047, B:23:0x007a, B:22:0x0076, B:11:0x002e), top: B:31:0x0009 }] */
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
            List<CompactTagData> listAhwBna = this.$from$inlined.AhwBna();
            ArrayList arrayList = new ArrayList();
            it = listAhwBna.iterator();
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
                C29712kyn c29712kyn = this.this$0.copydefault;
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
                    boolean zOLrzqt = this.this$0.AEQbTJ.OLrzqt(this.$from$inlined.KWHzl(), this.$from$inlined.isConnected());
                    String strKWHzl = this.$from$inlined.KWHzl();
                    String strIsConnected = this.$from$inlined.isConnected();
                    String strAkhnZx = this.$from$inlined.AkhnZx();
                    String strValues = this.$from$inlined.values();
                    String strAYXKKw = this.$from$inlined.AYXKKw();
                    String strAEQbTJ = this.$from$inlined.AEQbTJ();
                    String strFetchVPNInfo = this.$from$inlined.fetchVPNInfo();
                    String strEjfBZ = this.$from$inlined.ejfBZ();
                    String strFARcdN = this.$from$inlined.fARcdN();
                    String strFJNWhG = this.$from$inlined.fJNWhG();
                    String strAuCTel = this.$from$inlined.AuCTel();
                    String strGEmmrt = this.$from$inlined.gEmmrt();
                    String strDjBIcL = this.$from$inlined.djBIcL();
                    String strCopydefault = this.$from$inlined.copydefault();
                    String strEZpvd = this.$from$inlined.EZpvd();
                    objM7377constructorimpl = Result.m7377constructorimpl(new HomeToken(strKWHzl, null, strIsConnected, strAkhnZx, strValues, null, strAYXKKw, strAEQbTJ, strFetchVPNInfo, strEjfBZ, strFARcdN, strFJNWhG, strAuCTel, strGEmmrt, strDjBIcL, strCopydefault, zOLrzqt, RiskControlLevel.Companion.copydefault(this.$from$inlined.valueOf()), strEZpvd, (List) collection, 34, null));
                    return Result.m7376boximpl(objM7377constructorimpl);
                }
            }
        }
    }
}

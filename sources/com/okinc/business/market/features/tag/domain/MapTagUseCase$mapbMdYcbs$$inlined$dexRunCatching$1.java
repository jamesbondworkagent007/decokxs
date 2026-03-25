package com.okinc.business.market.features.tag.domain;

import com.okinc.business.market.common.constants.StringBooleanType;
import com.okinc.business.market.data.model.CompactTagData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C29712kyn;
import o.C29715kyq;
import o.C43023rhU;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.business.market.features.tag.domain.MapTagUseCase$map-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagWrapper>>, Object> {
    final /* synthetic */ Float $bundleHoldingRatio$inlined;
    final /* synthetic */ Float $devHoldingRatio$inlined;
    final /* synthetic */ CompactTagData $from$inlined;
    final /* synthetic */ Integer $sniperCount$inlined;
    final /* synthetic */ Float $sniperHoldingRatio$inlined;
    final /* synthetic */ Float $suspiciousHoldingRatio$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C29712kyn this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, Float f, Float f2, Integer num, Float f3, Float f4, CompactTagData compactTagData, C29712kyn c29712kyn) {
        super(2, continuation);
        this.$devHoldingRatio$inlined = f;
        this.$suspiciousHoldingRatio$inlined = f2;
        this.$sniperCount$inlined = num;
        this.$sniperHoldingRatio$inlined = f3;
        this.$bundleHoldingRatio$inlined = f4;
        this.$from$inlined = compactTagData;
        this.this$0 = c29712kyn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1(continuation, this.$devHoldingRatio$inlined, this.$suspiciousHoldingRatio$inlined, this.$sniperCount$inlined, this.$sniperHoldingRatio$inlined, this.$bundleHoldingRatio$inlined, this.$from$inlined, this.this$0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagWrapper>> continuation) {
        return ((MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        TagEventProperty tagEventProperty;
        CompactTag compactTag;
        Object objM7386unboximpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object obj2 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                TagLocalProperty tagLocalProperty = new TagLocalProperty(this.$devHoldingRatio$inlined, this.$suspiciousHoldingRatio$inlined, this.$sniperCount$inlined, this.$sniperHoldingRatio$inlined, null, null, this.$bundleHoldingRatio$inlined, 48, null);
                if (Intrinsics.EZpvd((Object) this.$from$inlined.copydefault(), (Object) "duringEvent") || Intrinsics.EZpvd((Object) this.$from$inlined.copydefault(), (Object) "launchpool")) {
                    tagEventProperty = new TagEventProperty(this.$from$inlined.AEQbTJ().AEQbTJ(), this.$from$inlined.AEQbTJ().AYXKKw() == StringBooleanType.TRUE ? C43023rhU.EZpvd(this.$from$inlined.AEQbTJ().copydefault()) : this.$from$inlined.AEQbTJ().copydefault());
                } else {
                    tagEventProperty = null;
                }
                CompactTag compactTagEZpvd = this.this$0.KWHzl.EZpvd(this.$from$inlined, tagLocalProperty, tagEventProperty);
                C29715kyq c29715kyq = this.this$0.AEQbTJ;
                String strCopydefault = this.$from$inlined.copydefault();
                this.L$0 = compactTagEZpvd;
                this.label = 1;
                Object objM8679getTagMeta0E7RQCE$default = C29715kyq.m8679getTagMeta0E7RQCE$default(c29715kyq, strCopydefault, false, this, 2, null);
                if (objM8679getTagMeta0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                compactTag = compactTagEZpvd;
                objM7386unboximpl = objM8679getTagMeta0E7RQCE$default;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                compactTag = (CompactTag) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
            }
            if (!Result.m7383isFailureimpl(objM7386unboximpl)) {
                obj2 = objM7386unboximpl;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(new TagWrapper(compactTag, (TagMeta) obj2));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

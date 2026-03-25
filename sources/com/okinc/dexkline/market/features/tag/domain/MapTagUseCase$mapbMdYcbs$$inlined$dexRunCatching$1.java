package com.okinc.dexkline.market.features.tag.domain;

import com.okinc.dexkline.market.common.constants.StringBooleanType;
import com.okinc.dexkline.market.data.model.CompactTagData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C34541ndy;
import o.C34542ndz;
import o.C43023rhU;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: renamed from: com.okinc.dexkline.market.features.tag.domain.MapTagUseCase$map-bMdYcbs$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagWrapper>>, Object> {
    final /* synthetic */ Float $bundleHoldingRatio$inlined;
    final /* synthetic */ Float $devHoldingRatio$inlined;
    final /* synthetic */ CompactTagData $from$inlined;
    final /* synthetic */ Integer $sniperCount$inlined;
    final /* synthetic */ Float $suspiciousHoldingRatio$inlined;
    final /* synthetic */ Integer $verifiedSniperCount$inlined;
    Object L$0;
    int label;
    final /* synthetic */ C34541ndy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1(Continuation continuation, Float f, Float f2, Integer num, Integer num2, Float f3, CompactTagData compactTagData, C34541ndy c34541ndy) {
        super(2, continuation);
        this.$devHoldingRatio$inlined = f;
        this.$suspiciousHoldingRatio$inlined = f2;
        this.$sniperCount$inlined = num;
        this.$verifiedSniperCount$inlined = num2;
        this.$bundleHoldingRatio$inlined = f3;
        this.$from$inlined = compactTagData;
        this.this$0 = c34541ndy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTagUseCase$mapbMdYcbs$$inlined$dexRunCatching$1(continuation, this.$devHoldingRatio$inlined, this.$suspiciousHoldingRatio$inlined, this.$sniperCount$inlined, this.$verifiedSniperCount$inlined, this.$bundleHoldingRatio$inlined, this.$from$inlined, this.this$0);
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
                TagLocalProperty tagLocalProperty = new TagLocalProperty(this.$devHoldingRatio$inlined, this.$suspiciousHoldingRatio$inlined, this.$sniperCount$inlined, this.$verifiedSniperCount$inlined, null, null, this.$bundleHoldingRatio$inlined, 48, null);
                if (Intrinsics.EZpvd((Object) this.$from$inlined.EZpvd(), (Object) "duringEvent")) {
                    tagEventProperty = new TagEventProperty(this.$from$inlined.copydefault().EZpvd(), this.$from$inlined.copydefault().AYXKKw() == StringBooleanType.TRUE ? C43023rhU.EZpvd(this.$from$inlined.copydefault().AEQbTJ()) : this.$from$inlined.copydefault().AEQbTJ());
                } else {
                    tagEventProperty = null;
                }
                CompactTag compactTagAEQbTJ = this.this$0.AEQbTJ.AEQbTJ(this.$from$inlined, tagLocalProperty, tagEventProperty);
                C34542ndz c34542ndz = this.this$0.copydefault;
                String strEZpvd = this.$from$inlined.EZpvd();
                this.L$0 = compactTagAEQbTJ;
                this.label = 1;
                Object objM8699getTagMeta0E7RQCE$default = C34542ndz.m8699getTagMeta0E7RQCE$default(c34542ndz, strEZpvd, false, this, 2, null);
                if (objM8699getTagMeta0E7RQCE$default == objCopydefault) {
                    return objCopydefault;
                }
                compactTag = compactTagAEQbTJ;
                objM7386unboximpl = objM8699getTagMeta0E7RQCE$default;
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
            pUU.AEQbTJ("cedefi", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}

package com.okinc.okex.deeplink;

import android.content.Context;
import android.content.Intent;
import com.okinc.okex.deeplink.SupportRatingDeeplinkHandler$handleDeeplink$1;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonObject;
import o.C44760scx;
import o.C44761scy;
import o.C56391yDq;
import o.C56442yFn;
import o.sxL;
import o.syS;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportRatingDeeplinkHandler$handleDeeplink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $businessId;
    final /* synthetic */ Context $context;
    final /* synthetic */ JsonObject $moduleAttributes;
    final /* synthetic */ String $ratingNotificationId;
    final /* synthetic */ String $rawModuleType;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRatingDeeplinkHandler$handleDeeplink$1(String str, String str2, String str3, JsonObject jsonObject, Context context, Continuation<? super SupportRatingDeeplinkHandler$handleDeeplink$1> continuation) {
        super(2, continuation);
        this.$rawModuleType = str;
        this.$ratingNotificationId = str2;
        this.$businessId = str3;
        this.$moduleAttributes = jsonObject;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportRatingDeeplinkHandler$handleDeeplink$1(this.$rawModuleType, this.$ratingNotificationId, this.$businessId, this.$moduleAttributes, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportRatingDeeplinkHandler$handleDeeplink$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Intent intent$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            syS sys = new syS(sxL.Companion.EZpvd());
            String str = this.$rawModuleType;
            String str2 = this.$ratingNotificationId;
            String str3 = this.$businessId;
            JsonObject jsonObject = this.$moduleAttributes;
            this.label = 1;
            obj = sys.EZpvd(str, str2, str3, jsonObject, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final RatingResult ratingResult = (RatingResult) obj;
        if (ratingResult instanceof RatingResult.Failure) {
            C44760scx.copydefault("Failed to get Rating Form", new Function1() { // from class: o.sre
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return SupportRatingDeeplinkHandler$handleDeeplink$1.invokeSuspend$lambda$0(ratingResult, (C44761scy) obj2);
                }
            });
        } else if (!(ratingResult instanceof RatingResult.NoRating) && ratingResult != null && (intent$default = RatingResult.toIntent$default(ratingResult, this.$context, null, null, 6, null)) != null) {
            this.$context.startActivity(intent$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(RatingResult ratingResult, C44761scy c44761scy) {
        c44761scy.KWHzl(((RatingResult.Failure) ratingResult).EZpvd());
        return Unit.INSTANCE;
    }
}

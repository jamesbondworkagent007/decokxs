package com.okinc.business.market.home.favorites;

import androidx.activity.result.ActivityResultCaller;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.okinc.unify_trade.biz.subscribe.SettingWatchList;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import o.C27831kEy;
import o.C33070mpX;
import o.C33134mqi;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pWK;
import o.qWN;
import o.qZH;

/* JADX INFO: loaded from: classes7.dex */
public final class RecommendCoinFragment$initView$4$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C27831kEy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendCoinFragment$initView$4$4(C27831kEy c27831kEy, Continuation<? super RecommendCoinFragment$initView$4$4> continuation) {
        super(2, continuation);
        this.this$0 = c27831kEy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendCoinFragment$initView$4$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecommendCoinFragment$initView$4$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String message;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                C27831kEy c27831kEy = this.this$0;
                Result.Application application = Result.Companion;
                qWN qwnAkhnZx = c27831kEy.AkhnZx();
                ArrayList<SettingWatchList> arrayListDbNXlk = c27831kEy.DbNXlk();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(arrayListDbNXlk, 10));
                for (SettingWatchList settingWatchList : arrayListDbNXlk) {
                    String instId = settingWatchList.getInstId();
                    String instType = settingWatchList.getInstType();
                    String alias = settingWatchList.getAlias();
                    String str = alias == null ? "" : alias;
                    String expTime = settingWatchList.getExpTime();
                    if (expTime == null) {
                        expTime = "";
                    }
                    arrayList.add(new WatchListData(str, expTime, instId, instType, (String) null, (String) null, (String) null, (String) null, PsExtractor.VIDEO_STREAM_MASK, (DefaultConstructorMarker) null));
                }
                this.label = 1;
                if (qwnAkhnZx.AEQbTJ(arrayList, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C27831kEy c27831kEy2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(qZH.PendingIntent.DTwDnp));
            ActivityResultCaller parentFragment = c27831kEy2.getParentFragment();
            pWK pwk = parentFragment instanceof pWK ? (pWK) parentFragment : null;
            if (pwk != null) {
                pwk.getFieldNames();
            }
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null && (message = thM7380exceptionOrNullimpl.getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (Object) null);
        }
        this.this$0.dismissLoading();
        return Unit.INSTANCE;
    }
}

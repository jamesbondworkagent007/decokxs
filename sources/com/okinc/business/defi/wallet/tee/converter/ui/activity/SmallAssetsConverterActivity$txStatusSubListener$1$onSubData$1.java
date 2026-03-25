package com.okinc.business.defi.wallet.tee.converter.ui.activity;

import android.app.Activity;
import com.okinc.business.defi.biz.core.ws.channel.SmallAssetsTxStatusSubManager;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC17837fUc;
import o.C10854bwM;
import o.C13754dXa;
import o.C16434ejp;
import o.C33069mpW;
import o.C33129mqd;
import o.C54870xYj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C9678baC;
import o.pTD;

/* JADX INFO: loaded from: classes18.dex */
public final class SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isOrderFailed;
    final /* synthetic */ SmallAssetsTxStatusSubManager.SubResponseData $item;
    int label;
    final /* synthetic */ ActivityC17837fUc this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1(ActivityC17837fUc activityC17837fUc, boolean z, SmallAssetsTxStatusSubManager.SubResponseData subResponseData, Continuation<? super SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC17837fUc;
        this.$isOrderFailed = z;
        this.$item = subResponseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1(this.this$0, this.$isOrderFailed, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SmallAssetsConverterActivity$txStatusSubListener$1$onSubData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strOLrzqt;
        C10854bwM c10854bwMDjBIcL;
        String strFJNWhG;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C16434ejp c16434ejp = this.this$0.valueOf;
            String str = "";
            if (c16434ejp == null) {
                Intrinsics.gEmmrt("");
                c16434ejp = null;
            }
            c16434ejp.KWHzl.setVisibility(8);
            this.this$0.djBIcL();
            if (this.$isOrderFailed) {
                ActivityC17837fUc activityC17837fUc = this.this$0;
                Activity activeActivity$default = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
                if (activeActivity$default == null) {
                    return Unit.INSTANCE;
                }
                String string = this.this$0.getString(C13754dXa.FragmentManager.onSkipToQueueItem);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ActivityC17837fUc.showNotification$default(activityC17837fUc, activeActivity$default, 5, string, this.this$0.getString(C13754dXa.FragmentManager.onSetRepeatMode), 0L, 16, null);
            } else {
                ActivityC17837fUc activityC17837fUc2 = this.this$0;
                Activity activeActivity$default2 = C9678baC.Activity.getActiveActivity$default(C9678baC.Companion, false, 1, null);
                if (activeActivity$default2 == null) {
                    return Unit.INSTANCE;
                }
                ActivityC17837fUc activityC17837fUc3 = this.this$0;
                int i = C13754dXa.Dialog.djBIcL;
                Integer successOrderCount = this.$item.getSuccessOrderCount();
                String strEZpvd = pTD.EZpvd(activityC17837fUc3, i, successOrderCount != null ? successOrderCount.intValue() : 0, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(this.$item.getSuccessOrderCount()))));
                ActivityC17837fUc activityC17837fUc4 = this.this$0;
                int i2 = C13754dXa.FragmentManager.onSetCaptioningEnabled;
                Pair[] pairArr = new Pair[2];
                String successNativeTokenAmount = this.$item.getSuccessNativeTokenAmount();
                if (successNativeTokenAmount != null) {
                    C10854bwM c10854bwMDjBIcL2 = this.this$0.AYXKKw().djBIcL();
                    strOLrzqt = C54870xYj.OLrzqt(successNativeTokenAmount, (249 & 1) != 0 ? 0 : 0, c10854bwMDjBIcL2 != null ? c10854bwMDjBIcL2.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                    if (strOLrzqt == null) {
                    }
                    pairArr[0] = C56390yDp.OLrzqt("amt", strOLrzqt);
                    c10854bwMDjBIcL = this.this$0.AYXKKw().djBIcL();
                    if (c10854bwMDjBIcL != null) {
                        str = strFJNWhG;
                    }
                    pairArr[1] = C56390yDp.OLrzqt("token", str);
                    ActivityC17837fUc.showNotification$default(activityC17837fUc2, activeActivity$default2, 2, strEZpvd, C33069mpW.KWHzl(activityC17837fUc4, i2, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)), 0L, 16, null);
                } else {
                    strOLrzqt = "";
                    pairArr[0] = C56390yDp.OLrzqt("amt", strOLrzqt);
                    c10854bwMDjBIcL = this.this$0.AYXKKw().djBIcL();
                    if (c10854bwMDjBIcL != null && (strFJNWhG = c10854bwMDjBIcL.fJNWhG()) != null) {
                        str = strFJNWhG;
                    }
                    pairArr[1] = C56390yDp.OLrzqt("token", str);
                    ActivityC17837fUc.showNotification$default(activityC17837fUc2, activeActivity$default2, 2, strEZpvd, C33069mpW.KWHzl(activityC17837fUc4, i2, (Map<String, ? extends Object>) C56424yEw.gEmmrt(pairArr)), 0L, 16, null);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

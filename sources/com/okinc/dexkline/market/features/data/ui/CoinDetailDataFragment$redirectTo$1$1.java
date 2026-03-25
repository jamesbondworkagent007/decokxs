package com.okinc.dexkline.market.features.data.ui;

import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.dexkline.market.features.data.domain.type.DataTabType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C33129mqd;
import o.C35964oKf;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.mXW;
import o.oNI;

/* JADX INFO: loaded from: classes15.dex */
public final class CoinDetailDataFragment$redirectTo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DataTabType $redirect;
    final /* synthetic */ oNI $this_apply;
    int label;
    final /* synthetic */ mXW this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DataTabType.values().length];
            try {
                iArr[DataTabType.HOLDERS_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataTabType.HOLDING_7D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataTabType.LIQUIDITY_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataTabType.POOL_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailDataFragment$redirectTo$1$1(DataTabType dataTabType, oNI oni, mXW mxw, Continuation<? super CoinDetailDataFragment$redirectTo$1$1> continuation) {
        super(2, continuation);
        this.$redirect = dataTabType;
        this.$this_apply = oni;
        this.this$0 = mxw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailDataFragment$redirectTo$1$1(this.$redirect, this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailDataFragment$redirectTo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        float y;
        float y2;
        int iDp2px$default;
        TextView textView;
        TextView textView2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        int i2 = ActionBar.EZpvd[this.$redirect.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                FragmentActivity activity = this.this$0.getActivity();
                y2 = this.$this_apply.OLrzqt.getY() + ((activity == null || (textView = (TextView) activity.findViewById(C35964oKf.StateListAnimator.MediaControllerCompatApi23TransportControls)) == null) ? C55298xhM.dp2pxFloat$default(232.0f, null, 1, null) : textView.getY());
                iDp2px$default = C55298xhM.dp2px$default(30.0f, null, 1, null);
            } else if (i2 == 3) {
                y = this.$this_apply.EZpvd.getY();
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                FragmentActivity activity2 = this.this$0.getActivity();
                y2 = this.$this_apply.EZpvd.getY() + ((activity2 == null || (textView2 = (TextView) activity2.findViewById(C35964oKf.StateListAnimator.ibnZAm)) == null) ? C55298xhM.dp2pxFloat$default(232.0f, null, 1, null) : textView2.getY());
                iDp2px$default = C55298xhM.dp2px$default(24.0f, null, 1, null);
            }
            y = iDp2px$default + y2;
        } else {
            y = this.$this_apply.OLrzqt.getY();
        }
        this.$this_apply.copydefault.smoothScrollTo(0, C33129mqd.AhwBna(C56443yFo.OLrzqt(y)));
        this.this$0.copydefault = null;
        return Unit.INSTANCE;
    }
}

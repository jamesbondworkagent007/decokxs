package com.okinc.business.defi.wallet.tee.disable.ui;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ActivityC17866fVe;
import o.C13754dXa;
import o.C16302ehP;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.gKV;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class DisableActivity$onCreate$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C16302ehP $binding;
    int label;
    final /* synthetic */ ActivityC17866fVe this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableActivity$onCreate$2(ActivityC17866fVe activityC17866fVe, C16302ehP c16302ehP, Continuation<? super DisableActivity$onCreate$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC17866fVe;
        this.$binding = c16302ehP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DisableActivity$onCreate$2(this.this$0, this.$binding, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DisableActivity$onCreate$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$onCreate$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ C16302ehP $binding;
        int label;
        final /* synthetic */ ActivityC17866fVe this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC17866fVe activityC17866fVe, C16302ehP c16302ehP, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC17866fVe;
            this.$binding = c16302ehP;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$binding, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow<gKV> flowAEQbTJ = this.this$0.KWHzl().AEQbTJ();
                final C16302ehP c16302ehP = this.$binding;
                final ActivityC17866fVe activityC17866fVe = this.this$0;
                FlowCollector<? super gKV> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity.onCreate.2.1.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                    public final Object emit(gKV gkv, Continuation<? super Unit> continuation) {
                        c16302ehP.values.setVisibility(0);
                        c16302ehP.EZpvd.setVisibility(0);
                        c16302ehP.copydefault.setVisibility(0);
                        activityC17866fVe.dismissLoadingWithLogo();
                        rVN.reportFullyDrawn$default((android.app.Activity) activityC17866fVe, true, (String) null, 2, (Object) null);
                        ActivityC17866fVe activityC17866fVe2 = activityC17866fVe;
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        Object[] objArr = {new ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), new Activity(activityC17866fVe2)};
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.ODWQjV));
                        for (int i2 = 0; i2 < 2; i2++) {
                            spannableStringBuilder.setSpan(objArr[i2], length, spannableStringBuilder.length(), 17);
                        }
                        SpannableString spannableStringValueOf = SpannableString.valueOf(new SpannedString(spannableStringBuilder));
                        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
                        Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt("learn", spannableStringValueOf));
                        if (gkv != null && gkv.getOrderNum() == 0 && gkv != null && gkv.getStrategyNum() == 0) {
                            c16302ehP.EZpvd.setText(C33069mpW.KWHzl(activityC17866fVe.getResources(), C13754dXa.FragmentManager.DdI, (Map<String, ? extends Spannable>) mapEZpvd));
                            c16302ehP.valueOf.setVisibility(8);
                            c16302ehP.djBIcL.setVisibility(8);
                            c16302ehP.copydefault.setText(activityC17866fVe.getString(C13754dXa.FragmentManager.OtRJxF));
                        } else {
                            c16302ehP.EZpvd.setText(C33069mpW.KWHzl(activityC17866fVe.getResources(), C13754dXa.FragmentManager.Srftgn, (Map<String, ? extends Spannable>) mapEZpvd));
                            if (gkv != null) {
                                int orderNum = gkv.getOrderNum();
                                C16302ehP c16302ehP2 = c16302ehP;
                                if (orderNum > 0) {
                                    c16302ehP2.valueOf.setVisibility(0);
                                    c16302ehP2.gEmmrt.setText(String.valueOf(orderNum));
                                } else {
                                    c16302ehP2.valueOf.setVisibility(8);
                                }
                            }
                            if (gkv != null) {
                                int strategyNum = gkv.getStrategyNum();
                                C16302ehP c16302ehP3 = c16302ehP;
                                if (strategyNum > 0) {
                                    c16302ehP3.djBIcL.setVisibility(0);
                                    c16302ehP3.AhwBna.setText(String.valueOf(strategyNum));
                                } else {
                                    c16302ehP3.djBIcL.setVisibility(8);
                                }
                            }
                            c16302ehP.copydefault.setText(activityC17866fVe.getString(C13754dXa.FragmentManager.OtZEmZ));
                            if (gkv != null && C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(gkv.getOrderNum()), C56443yFo.AEQbTJ(0)) && gkv != null && C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(gkv.getStrategyNum()), C56443yFo.AEQbTJ(0))) {
                                c16302ehP.AEQbTJ.setVisibility(0);
                            } else {
                                c16302ehP.AEQbTJ.setVisibility(8);
                            }
                        }
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tee.disable.ui.DisableActivity$onCreate$2$1$2$Activity */
                    public static final class Activity extends ClickableSpan {
                        public final /* synthetic */ ActivityC17866fVe OLrzqt;

                        public Activity(ActivityC17866fVe activityC17866fVe) {
                            this.OLrzqt = activityC17866fVe;
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View view) {
                            Intrinsics.checkNotNullParameter(view, "");
                            Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.SdSTJp)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString()));
                            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.OLrzqt, bundleBundleOf, null, 4, null);
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            Intrinsics.checkNotNullParameter(textPaint, "");
                            textPaint.setUnderlineText(false);
                        }
                    }
                };
                this.label = 1;
                if (flowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$binding, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}

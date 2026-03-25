package com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C23274hvD;
import o.C52761wXj;
import o.C52794wYp;
import o.C55298xhM;
import o.C56391yDq;
import o.C56442yFn;
import o.jFP;

/* JADX INFO: loaded from: classes18.dex */
public final class TrackerManageAddressGroupActivity$setupObservers$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ jFP this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerManageAddressGroupActivity$setupObservers$4(jFP jfp, Continuation<? super TrackerManageAddressGroupActivity$setupObservers$4> continuation) {
        super(2, continuation);
        this.this$0 = jfp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TrackerManageAddressGroupActivity$setupObservers$4(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackerManageAddressGroupActivity$setupObservers$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker_sa.ui.user_management.manage.TrackerManageAddressGroupActivity$setupObservers$4$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
        /* synthetic */ int I$0;
        int label;
        final /* synthetic */ jFP this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(jFP jfp, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jfp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.I$0 = ((Number) obj).intValue();
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(int i, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Integer num, Continuation<? super Unit> continuation) {
            return invoke(num.intValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                int i = this.I$0;
                if (i == 0) {
                    C52794wYp c52794wYp = this.this$0.djBIcL().EZpvd;
                    jFP jfp = this.this$0;
                    Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.UeEOUB);
                    if (drawable != null) {
                        DrawableCompat.setTintList(drawable, ColorStateList.valueOf(jfp.getColor(C52761wXj.Activity.htlTjW)));
                        Context context = c52794wYp.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        int iOLrzqt = C55298xhM.OLrzqt(16, context);
                        Context context2 = c52794wYp.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "");
                        drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(16, context2));
                    } else {
                        drawable = null;
                    }
                    Context context3 = c52794wYp.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    c52794wYp.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context3));
                    c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
                    c52794wYp.setText(jfp.getString(C23274hvD.Fragment.fqaWRL));
                } else if (i == 1) {
                    C52794wYp c52794wYp2 = this.this$0.djBIcL().EZpvd;
                    jFP jfp2 = this.this$0;
                    Drawable drawable2 = ContextCompat.getDrawable(c52794wYp2.getContext(), C52761wXj.TaskDescription.UeEOUB);
                    if (drawable2 != null) {
                        DrawableCompat.setTintList(drawable2, ColorStateList.valueOf(jfp2.getColor(C52761wXj.Activity.htlTjW)));
                        Context context4 = c52794wYp2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context4, "");
                        int iOLrzqt2 = C55298xhM.OLrzqt(16, context4);
                        Context context5 = c52794wYp2.getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "");
                        drawable2.setBounds(0, 0, iOLrzqt2, C55298xhM.OLrzqt(16, context5));
                    } else {
                        drawable2 = null;
                    }
                    Context context6 = c52794wYp2.getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    c52794wYp2.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context6));
                    c52794wYp2.setCompoundDrawablesRelative(drawable2, null, null, null);
                    c52794wYp2.setText(jfp2.getString(C23274hvD.Fragment.DLGVGj));
                } else if (i == 2) {
                    C52794wYp c52794wYp3 = this.this$0.djBIcL().EZpvd;
                    jFP jfp3 = this.this$0;
                    Drawable drawable3 = ContextCompat.getDrawable(c52794wYp3.getContext(), C52761wXj.TaskDescription.aKErDB);
                    if (drawable3 != null) {
                        DrawableCompat.setTintList(drawable3, ColorStateList.valueOf(jfp3.getColor(C52761wXj.Activity.htlTjW)));
                        Context context7 = c52794wYp3.getContext();
                        Intrinsics.checkNotNullExpressionValue(context7, "");
                        int iOLrzqt3 = C55298xhM.OLrzqt(16, context7);
                        Context context8 = c52794wYp3.getContext();
                        Intrinsics.checkNotNullExpressionValue(context8, "");
                        drawable3.setBounds(0, 0, iOLrzqt3, C55298xhM.OLrzqt(16, context8));
                    } else {
                        drawable3 = null;
                    }
                    Context context9 = c52794wYp3.getContext();
                    Intrinsics.checkNotNullExpressionValue(context9, "");
                    c52794wYp3.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context9));
                    c52794wYp3.setCompoundDrawablesRelative(drawable3, null, null, null);
                    c52794wYp3.setText(jfp3.getString(C23274hvD.Fragment.DKtBnz));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Integer> stateFlowAuCTel = this.this$0.AhwBna().AuCTel();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAuCTel, anonymousClass1, this) == objCopydefault) {
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

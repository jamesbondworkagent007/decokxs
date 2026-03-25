package com.okinc.core.ok_app.modeswitch.view;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.modeswitch.view.ModeSegmentView$createView$3$onTabSelected$1;
import com.okinc.okex.lite.home.bean.AppModeSwitchViewSource;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC33244msm;
import o.C32866mlf;
import o.C33123mqX;
import o.C33250mss;
import o.C33301mtq;
import o.C33405mvo;
import o.C33468mwy;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes8.dex */
public final class ModeSegmentView$createView$3$onTabSelected$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C33301mtq $binding;
    final /* synthetic */ Function2<AbstractC33244msm, AbstractC33244msm, Unit> $callback;
    final /* synthetic */ Context $context;
    final /* synthetic */ Pair<AbstractC33244msm, AbstractC33244msm> $modes;
    final /* synthetic */ AppModeSwitchViewSource $source;
    final /* synthetic */ TabLayout.Tab $tab;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C33468mwy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Pair<? extends o.msm, ? extends o.msm> */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: kotlin.jvm.functions.Function2<? super o.msm, ? super o.msm, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModeSegmentView$createView$3$onTabSelected$1(TabLayout.Tab tab, Pair<? extends AbstractC33244msm, ? extends AbstractC33244msm> pair, Context context, C33301mtq c33301mtq, C33468mwy c33468mwy, AppModeSwitchViewSource appModeSwitchViewSource, Function2<? super AbstractC33244msm, ? super AbstractC33244msm, Unit> function2, Continuation<? super ModeSegmentView$createView$3$onTabSelected$1> continuation) {
        super(2, continuation);
        this.$tab = tab;
        this.$modes = pair;
        this.$context = context;
        this.$binding = c33301mtq;
        this.this$0 = c33468mwy;
        this.$source = appModeSwitchViewSource;
        this.$callback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ModeSegmentView$createView$3$onTabSelected$1(this.$tab, this.$modes, this.$context, this.$binding, this.this$0, this.$source, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ModeSegmentView$createView$3$onTabSelected$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC33244msm value;
        final AbstractC33244msm abstractC33244msm;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C33123mqX.TaskDescription taskDescription = C33123mqX.Companion;
            value = taskDescription.KWHzl().AYXKKw().getValue();
            TabLayout.Tab tab = this.$tab;
            AbstractC33244msm second = (tab == null || tab.getId() != 0) ? this.$modes.getSecond() : this.$modes.getFirst();
            if (Intrinsics.EZpvd(value, second)) {
                return Unit.INSTANCE;
            }
            C33123mqX c33123mqXKWHzl = taskDescription.KWHzl();
            Context context = this.$context;
            this.L$0 = value;
            this.L$1 = second;
            this.label = 1;
            obj = C33123mqX.switchToMode$default(c33123mqXKWHzl, context, second, true, null, null, this, 24, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            abstractC33244msm = second;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC33244msm = (AbstractC33244msm) this.L$1;
            value = (AbstractC33244msm) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            this.$binding.KWHzl.setContentDescription(this.this$0.EZpvd(abstractC33244msm) + "_selected");
            if (C33123mqX.Companion.KWHzl().fARcdN()) {
                C33405mvo.KWHzl.AEQbTJ(C33250mss.EZpvd(value), C33250mss.EZpvd(abstractC33244msm), this.$source.name());
            } else {
                C32866mlf.onEvent$default("LiteHomepage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mwB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return ModeSegmentView$createView$3$onTabSelected$1.invokeSuspend$lambda$0(abstractC33244msm, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
            }
            this.$callback.invoke(value, abstractC33244msm);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(AbstractC33244msm abstractC33244msm, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "page", "top_nav", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, Intrinsics.EZpvd(abstractC33244msm, AbstractC33244msm.PendingIntent.KWHzl) ? "wallet" : "exchange", false, 4, null);
        return Unit.INSTANCE;
    }
}

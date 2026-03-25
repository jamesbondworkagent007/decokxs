package com.okinc.im.imui.impl;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.conversationlist.ConversationListFragment;
import com.okinc.im.imui.conversationlist.menu.home.HomeBroadcastMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeContactListMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeCreateAffiliateGroupMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMarkAllAsReadMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeMyQRCodeMenuItemPerformer;
import com.okinc.im.imui.conversationlist.menu.home.HomeSearchContactsMenuItemPerformer;
import com.okinc.okimcore.model.remote.UserInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C36439oaw;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC44177sGd;
import o.sDN;
import o.yDY;

/* JADX INFO: loaded from: classes23.dex */
public final class OKIMMessageListApiImpl$setUpMoreButton$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ View $btnView;
    final /* synthetic */ boolean $imEnabled;
    int label;
    final /* synthetic */ C36439oaw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMMessageListApiImpl$setUpMoreButton$1(Activity activity, boolean z, View view, C36439oaw c36439oaw, Continuation<? super OKIMMessageListApiImpl$setUpMoreButton$1> continuation) {
        super(2, continuation);
        this.$activity = activity;
        this.$imEnabled = z;
        this.$btnView = view;
        this.this$0 = c36439oaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKIMMessageListApiImpl$setUpMoreButton$1(this.$activity, this.$imEnabled, this.$btnView, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OKIMMessageListApiImpl$setUpMoreButton$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<List<? extends IMenuItemPerformer>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ InterfaceC44177sGd EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ boolean copydefault;

        /* JADX INFO: renamed from: com.okinc.im.imui.impl.OKIMMessageListApiImpl$setUpMoreButton$1$StateListAnimator$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ boolean EZpvd;
            public final /* synthetic */ boolean KWHzl;
            public final /* synthetic */ InterfaceC44177sGd OLrzqt;
            public final /* synthetic */ boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, boolean z, InterfaceC44177sGd interfaceC44177sGd, boolean z2, boolean z3) {
                this.AEQbTJ = flowCollector;
                this.KWHzl = z;
                this.OLrzqt = interfaceC44177sGd;
                this.copydefault = z2;
                this.EZpvd = z3;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                OKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                List list;
                List listAhwBna;
                AnonymousClass2<T> anonymousClass2;
                Boolean allowGenerateQrCode;
                Boolean allowSearchUuid;
                if (continuation instanceof OKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) {
                    oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = (OKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) continuation;
                    int i = oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1 = new OKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1(this, continuation);
                    }
                }
                Object currentUser$default = oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(currentUser$default);
                    flowCollector = this.AEQbTJ;
                    list = (List) obj;
                    if (!this.KWHzl) {
                        listAhwBna = yDY.AhwBna();
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0 = null;
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1 = null;
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2 = null;
                        oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 2;
                        if (flowCollector.emit(listAhwBna, oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                        return Unit.INSTANCE;
                    }
                    InterfaceC44177sGd interfaceC44177sGd = this.OLrzqt;
                    oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0 = this;
                    oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1 = flowCollector;
                    oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2 = list;
                    oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 1;
                    currentUser$default = InterfaceC44177sGd.Application.getCurrentUser$default(interfaceC44177sGd, false, oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1, 1, null);
                    if (currentUser$default == objCopydefault) {
                        return objCopydefault;
                    }
                    anonymousClass2 = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(currentUser$default);
                        return Unit.INSTANCE;
                    }
                    list = (List) oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2;
                    flowCollector = (FlowCollector) oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1;
                    anonymousClass2 = (AnonymousClass2) oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(currentUser$default);
                }
                UserInfo userInfo = (UserInfo) currentUser$default;
                boolean zIsEmpty = list.isEmpty();
                boolean zBooleanValue = (userInfo == null || (allowSearchUuid = userInfo.getAllowSearchUuid()) == null) ? false : allowSearchUuid.booleanValue();
                boolean zBooleanValue2 = (userInfo == null || (allowGenerateQrCode = userInfo.getAllowGenerateQrCode()) == null) ? false : allowGenerateQrCode.booleanValue();
                IMenuItemPerformer[] iMenuItemPerformerArr = new IMenuItemPerformer[6];
                iMenuItemPerformerArr[0] = anonymousClass2.copydefault ? new HomeCreateAffiliateGroupMenuItemPerformer() : null;
                iMenuItemPerformerArr[1] = anonymousClass2.EZpvd ? new HomeBroadcastMenuItemPerformer() : null;
                iMenuItemPerformerArr[2] = zIsEmpty ^ true ? new HomeContactListMenuItemPerformer() : null;
                iMenuItemPerformerArr[3] = zBooleanValue ? new HomeSearchContactsMenuItemPerformer() : null;
                iMenuItemPerformerArr[4] = zBooleanValue2 ? new HomeMyQRCodeMenuItemPerformer() : null;
                iMenuItemPerformerArr[5] = new HomeMarkAllAsReadMenuItemPerformer();
                listAhwBna = yDY.valueOf(iMenuItemPerformerArr);
                oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$0 = null;
                oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$1 = null;
                oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.L$2 = null;
                oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(listAhwBna, oKIMMessageListApiImpl$setUpMoreButton$1$invokeSuspend$lambda$1$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow, boolean z, InterfaceC44177sGd interfaceC44177sGd, boolean z2, boolean z3) {
            this.AEQbTJ = flow;
            this.KWHzl = z;
            this.EZpvd = interfaceC44177sGd;
            this.OLrzqt = z2;
            this.copydefault = z3;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super List<? extends IMenuItemPerformer>> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.KWHzl, this.EZpvd, this.OLrzqt, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        } else {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                Activity activity = this.$activity;
                boolean z = this.$imEnabled;
                View view = this.$btnView;
                C36439oaw c36439oaw = this.this$0;
                InterfaceC44177sGd interfaceC44177sGdAEQbTJ = interfaceC35180nqU.AEQbTJ().AEQbTJ();
                AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
                List<Fragment> fragments = appCompatActivity.getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : fragments) {
                    if (obj2 instanceof ConversationListFragment) {
                        arrayList.add(obj2);
                    }
                }
                ConversationListFragment conversationListFragment = (ConversationListFragment) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                boolean zAEQbTJ = conversationListFragment != null ? conversationListFragment.AEQbTJ() : false;
                List<Fragment> fragments2 = appCompatActivity.getSupportFragmentManager().getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments2, "");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : fragments2) {
                    if (obj3 instanceof ConversationListFragment) {
                        arrayList2.add(obj3);
                    }
                }
                ConversationListFragment conversationListFragment2 = (ConversationListFragment) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
                Flow flowFlowOn = FlowKt.flowOn(new StateListAnimator(interfaceC44177sGdAEQbTJ.OLrzqt(), z, interfaceC44177sGdAEQbTJ, zAEQbTJ, conversationListFragment2 != null ? conversationListFragment2.KWHzl() : false), sDN.copydefault.copydefault());
                OKIMMessageListApiImpl$setUpMoreButton$1$1$2 oKIMMessageListApiImpl$setUpMoreButton$1$1$2 = new OKIMMessageListApiImpl$setUpMoreButton$1$1$2(view, c36439oaw, activity, zAEQbTJ, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowOn, oKIMMessageListApiImpl$setUpMoreButton$1$1$2, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        return Unit.INSTANCE;
    }
}

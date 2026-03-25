package com.okinc.im.imui.impl;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer;
import com.okinc.im.imui.impl.OKIMMessageListApiImpl$setUpMoreButton$1$1$2;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33810nGr;
import o.C36439oaw;
import o.C56391yDq;
import o.C56442yFn;
import o.sDN;

/* JADX INFO: loaded from: classes23.dex */
public final class OKIMMessageListApiImpl$setUpMoreButton$1$1$2 extends SuspendLambda implements Function2<List<? extends IMenuItemPerformer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ boolean $allowCreateAffiliateGroup;
    final /* synthetic */ View $btnView;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36439oaw this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKIMMessageListApiImpl$setUpMoreButton$1$1$2(View view, C36439oaw c36439oaw, Activity activity, boolean z, Continuation<? super OKIMMessageListApiImpl$setUpMoreButton$1$1$2> continuation) {
        super(2, continuation);
        this.$btnView = view;
        this.this$0 = c36439oaw;
        this.$activity = activity;
        this.$allowCreateAffiliateGroup = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OKIMMessageListApiImpl$setUpMoreButton$1$1$2 oKIMMessageListApiImpl$setUpMoreButton$1$1$2 = new OKIMMessageListApiImpl$setUpMoreButton$1$1$2(this.$btnView, this.this$0, this.$activity, this.$allowCreateAffiliateGroup, continuation);
        oKIMMessageListApiImpl$setUpMoreButton$1$1$2.L$0 = obj;
        return oKIMMessageListApiImpl$setUpMoreButton$1$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends IMenuItemPerformer> list, Continuation<? super Unit> continuation) {
        return ((OKIMMessageListApiImpl$setUpMoreButton$1$1$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.impl.OKIMMessageListApiImpl$setUpMoreButton$1$1$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ boolean $allowCreateAffiliateGroup;
        final /* synthetic */ View $btnView;
        final /* synthetic */ List<IMenuItemPerformer> $menuList;
        int label;
        final /* synthetic */ C36439oaw this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends com.okinc.im.imui.conversation.message.menu.api.IMenuItemPerformer> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(List<? extends IMenuItemPerformer> list, View view, C36439oaw c36439oaw, Activity activity, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$menuList = list;
            this.$btnView = view;
            this.this$0 = c36439oaw;
            this.$activity = activity;
            this.$allowCreateAffiliateGroup = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$menuList, this.$btnView, this.this$0, this.$activity, this.$allowCreateAffiliateGroup, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.oaw.OLrzqt(o.oaw, android.app.Activity, android.view.View, boolean):void */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.$menuList.isEmpty()) {
                    this.$btnView.setVisibility(0);
                    View view = this.$btnView;
                    final Activity activity = this.$activity;
                    final C36439oaw c36439oaw = this.this$0;
                    final List<IMenuItemPerformer> list = this.$menuList;
                    view.setOnClickListener(new View.OnClickListener() { // from class: o.oat
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view2) {
                            OKIMMessageListApiImpl$setUpMoreButton$1$1$2.AnonymousClass1.invokeSuspend$lambda$1(activity, c36439oaw, list, view2);
                        }
                    });
                    this.this$0.AEQbTJ(this.$activity, this.$btnView, this.$allowCreateAffiliateGroup);
                } else {
                    this.$btnView.setVisibility(8);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(Activity activity, C36439oaw c36439oaw, List list, View view) {
            FragmentManager supportFragmentManager;
            AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
            if (appCompatActivity == null || (supportFragmentManager = appCompatActivity.getSupportFragmentManager()) == null) {
                return;
            }
            c36439oaw.AEQbTJ(true);
            C33810nGr.Companion.EZpvd(list).show(supportFragmentManager);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(list, this.$btnView, this.this$0, this.$activity, this.$allowCreateAffiliateGroup, null);
            this.label = 1;
            if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
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

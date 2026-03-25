package com.okinc.im.imui.messageV2.view.banner.bannerlist;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import com.okinc.okimcore.model.remote.GroupBanner;
import com.okinc.okimcore.model.remote.GroupBannerList;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43238rlX;
import o.C33884nJk;
import o.C36753ogs;
import o.C55296xhK;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C7773aqE;
import o.oGV;
import o.pUU;
import o.rVN;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class BannerListFragment$initView$1 extends SuspendLambda implements yHO<CoroutineScope, GroupBannerList, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C36753ogs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerListFragment$initView$1(C36753ogs c36753ogs, Continuation<? super BannerListFragment$initView$1> continuation) {
        super(3, continuation);
        this.this$0 = c36753ogs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, GroupBannerList groupBannerList, Continuation<? super Unit> continuation) {
        BannerListFragment$initView$1 bannerListFragment$initView$1 = new BannerListFragment$initView$1(this.this$0, continuation);
        bannerListFragment$initView$1.L$0 = groupBannerList;
        return bannerListFragment$initView$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LinearLayoutCompat linearLayoutCompat;
        List<GroupBanner> banners;
        LinearLayoutCompat linearLayoutCompat2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            GroupBannerList groupBannerList = (GroupBannerList) this.L$0;
            C33884nJk c33884nJk = this.this$0.AEQbTJ;
            if (c33884nJk != null && (linearLayoutCompat2 = c33884nJk.copydefault) != null) {
                linearLayoutCompat2.removeAllViews();
            }
            List<GroupBanner> banners2 = groupBannerList != null ? groupBannerList.getBanners() : null;
            if (banners2 == null) {
                banners2 = yDY.AhwBna();
            }
            int i = 0;
            for (GroupBanner groupBanner : banners2) {
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                OKAlertBanner oKAlertBanner = new OKAlertBanner(contextRequireContext, null, 0, 6, null);
                C7773aqE.StateListAnimator stateListAnimator = new C7773aqE.StateListAnimator(-1, -2);
                if (groupBannerList != null && (banners = groupBannerList.getBanners()) != null) {
                    C36753ogs c36753ogs = this.this$0;
                    if (i != banners.size() - 1) {
                        stateListAnimator.setMargins(0, 0, 0, c36753ogs.KWHzl(1));
                    }
                }
                oKAlertBanner.setLayoutParams(stateListAnimator);
                oKAlertBanner.setStyle(1);
                oKAlertBanner.setType(0);
                oKAlertBanner.setTitle(groupBanner.getTitle());
                oKAlertBanner.setMessage(groupBanner.getContent());
                oKAlertBanner.OLrzqt().setVisibility(true ^ (groupBanner.getCtaLink().length() == 0) ? 0 : 8);
                oKAlertBanner.setOnClickListener(new Activity(oKAlertBanner, 1000L, this.this$0, groupBanner));
                C33884nJk c33884nJk2 = this.this$0.AEQbTJ;
                if (c33884nJk2 != null && (linearLayoutCompat = c33884nJk2.copydefault) != null) {
                    linearLayoutCompat.addView(oKAlertBanner);
                }
                i++;
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class ActionBar implements Function1<AbstractC43238rlX, Unit> {
        public static final ActionBar copydefault = new ActionBar();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
            Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(AbstractC43238rlX abstractC43238rlX) {
            AEQbTJ(abstractC43238rlX);
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C36753ogs AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ GroupBanner KWHzl;
        public final /* synthetic */ View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(View view, long j, C36753ogs c36753ogs, GroupBanner groupBanner) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c36753ogs;
            this.KWHzl = groupBanner;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Context context = this.AEQbTJ.getContext();
                if (context == null) {
                    pUU.copydefault(this.AEQbTJ.getTAG(), "Context is null, cannot process banner deeplink");
                    C55326xho.OLrzqt("Context unavailable, cannot navigate");
                } else {
                    oGV.processDeeplink$default(oGV.EZpvd, context, this.KWHzl.getCtaLink(), null, null, ActionBar.copydefault, 12, null);
                }
            }
        }
    }
}

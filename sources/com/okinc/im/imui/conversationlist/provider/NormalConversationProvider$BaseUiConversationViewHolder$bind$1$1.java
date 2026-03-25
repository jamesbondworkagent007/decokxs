package com.okinc.im.imui.conversationlist.provider;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C33070mpX;
import o.C33820nHa;
import o.C35399nuc;
import o.C35891oHn;
import o.C35893oHp;
import o.C37683oyU;
import o.C37716ozA;
import o.C43251rlk;
import o.C44170sFx;
import o.C52761wXj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.nDD;
import o.nGE;
import o.nOL;
import o.oIV;
import o.sDN;
import o.sGF;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ nOL $this_run;
    final /* synthetic */ nGE $uiConversation;
    int label;
    final /* synthetic */ C33820nHa.Activity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1(nGE nge, nOL nol, C33820nHa.Activity activity, Continuation<? super NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1> continuation) {
        super(2, continuation);
        this.$uiConversation = nge;
        this.$this_run = nol;
        this.this$0 = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1(this.$uiConversation, this.$this_run, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        sGF sgfKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null && (sgfKWHzl = interfaceC35180nqU.KWHzl()) != null) {
                sgfKWHzl.EZpvd(this.$uiConversation.AEQbTJ());
            }
            if (this.$uiConversation.KWHzl() == null) {
                nGE nge = this.$uiConversation;
                this.label = 1;
                if (nge.EZpvd(this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        OfficialTagInfo officialTagInfoCopydefault = C37683oyU.copydefault(this.$uiConversation.AEQbTJ());
        List<ConversationIcon> conversationIcons = this.$uiConversation.AEQbTJ().getConversationIcons();
        boolean z = this.$uiConversation.AEQbTJ().getGroupType() == GroupTagType.PAID_GROUP;
        boolean zAEQbTJ = C44170sFx.AEQbTJ(this.$uiConversation.AEQbTJ());
        MainCoroutineDispatcher mainCoroutineDispatcherAEQbTJ = sDN.copydefault.AEQbTJ();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_run, this.$uiConversation, zAEQbTJ, this.this$0, officialTagInfoCopydefault, conversationIcons, z, null);
        this.label = 2;
        if (BuildersKt.withContext(mainCoroutineDispatcherAEQbTJ, anonymousClass1, this) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.conversationlist.provider.NormalConversationProvider$BaseUiConversationViewHolder$bind$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<ConversationIcon> $iconList;
        final /* synthetic */ boolean $isRmVipGroup;
        final /* synthetic */ OfficialTagInfo $officialTagInfo;
        final /* synthetic */ boolean $showPremiumIcon;
        final /* synthetic */ nOL $this_run;
        final /* synthetic */ nGE $uiConversation;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C33820nHa.Activity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(nOL nol, nGE nge, boolean z, C33820nHa.Activity activity, OfficialTagInfo officialTagInfo, List<ConversationIcon> list, boolean z2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_run = nol;
            this.$uiConversation = nge;
            this.$isRmVipGroup = z;
            this.this$0 = activity;
            this.$officialTagInfo = officialTagInfo;
            this.$iconList = list;
            this.$showPremiumIcon = z2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_run, this.$uiConversation, this.$isRmVipGroup, this.this$0, this.$officialTagInfo, this.$iconList, this.$showPremiumIcon, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int color;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C35893oHp c35893oHp = this.$this_run.AhwBna;
                Intrinsics.checkNotNullExpressionValue(c35893oHp, "");
                this.$this_run.isConnected.setText(this.$uiConversation.AEQbTJ().getConversationTitle());
                TextViewCompat.setTextAppearance(this.$this_run.isConnected, this.$isRmVipGroup ? C52761wXj.LoaderManager.zLjUOn : C52761wXj.LoaderManager.run);
                TextView textView = this.$this_run.isConnected;
                if (this.$isRmVipGroup) {
                    color = ContextCompat.getColor(this.this$0.EZpvd().getRoot().getContext(), C35399nuc.Application.djBIcL);
                } else {
                    color = ContextCompat.getColor(this.this$0.EZpvd().getRoot().getContext(), C35399nuc.Application.EZpvd);
                }
                textView.setTextColor(color);
                nGE nge = this.$uiConversation;
                try {
                    Result.Application application = Result.Companion;
                    C35891oHn.OLrzqt(c35893oHp, nge.AEQbTJ());
                    Result.m7377constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                boolean zIsNoDisturb = this.$uiConversation.AEQbTJ().isNoDisturb();
                ImageView imageView = this.$this_run.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(zIsNoDisturb ? 0 : 8);
                C33820nHa.Activity activity = this.this$0;
                activity.EZpvd(activity.EZpvd(), this.$uiConversation);
                if (this.$isRmVipGroup) {
                    TextView textView2 = this.$this_run.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(8);
                    ImageView imageView2 = this.$this_run.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    imageView2.setVisibility(0);
                } else {
                    TextView textView3 = this.$this_run.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    C37716ozA.updateTagViewWithTagInfo$default(textView3, this.$officialTagInfo, 8, null, false, false, false, 60, null);
                }
                oIV.setIcons$default(this.$this_run.DbNXlk, this.$iconList, this.$showPremiumIcon, false, false, 12, null);
                if (this.$uiConversation.AEQbTJ().getSentTime() != 0) {
                    nDD ndd = nDD.OLrzqt;
                    Context context = this.$this_run.getRoot().getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    this.$this_run.AYXKKw.setText(ndd.KWHzl(context, this.$uiConversation.AEQbTJ().getSentTime()));
                    this.$this_run.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                } else {
                    this.$this_run.AYXKKw.setText("");
                }
                int unreadMessageCount = this.$uiConversation.AEQbTJ().getUnreadMessageCount();
                if (unreadMessageCount > 0) {
                    TextView textView4 = this.$this_run.fARcdN;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setVisibility(0);
                    C33820nHa.Activity activity2 = this.this$0;
                    activity2.KWHzl(activity2.EZpvd(), zIsNoDisturb, unreadMessageCount);
                } else {
                    TextView textView5 = this.$this_run.fARcdN;
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setVisibility(8);
                    this.$this_run.AYXKKw.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
                C33820nHa.Activity activity3 = this.this$0;
                activity3.KWHzl(activity3.EZpvd(), this.$uiConversation);
                C33820nHa.Activity activity4 = this.this$0;
                activity4.copydefault(activity4.EZpvd(), this.$uiConversation);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

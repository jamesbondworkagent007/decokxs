package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.planet.domain.remote.dto.MineCommentBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47943tze extends AbstractC47866tyG<C47916tzD> {
    public final InterfaceC56387yDm gEmmrt;

    public C47943tze() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_notifications.ui.MineCommentsFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_notifications.ui.MineCommentsFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47916tzD.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.MineCommentsFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.MineCommentsFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_notifications.ui.MineCommentsFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/tzF; */
    /* JADX DEBUG: Possible override for method o.tyG.EZpvd()V */
    @Override // o.AbstractC47866tyG
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C47916tzD copydefault() {
        return (C47916tzD) this.gEmmrt.getValue();
    }

    @Override // o.AbstractC47866tyG
    public void OLrzqt(C55173xeu c55173xeu) {
        super.OLrzqt(c55173xeu);
        if (c55173xeu != null) {
            c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.htlTjW));
        }
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.QwvEab));
        }
    }

    @Override // o.AbstractC47866tyG
    public void EZpvd(C55173xeu c55173xeu) {
        super.EZpvd(c55173xeu);
        if (c55173xeu != null) {
            c55173xeu.setTitle(C33070mpX.AYXKKw(C47501trL.Fragment.fERRXa));
        }
        if (c55173xeu != null) {
            c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.fdOvFl));
        }
    }

    /* JADX INFO: renamed from: o.tze$ActionBar */
    public static final class ActionBar extends C47957tzs {
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [o.rms, java.lang.Object] */
        @Override // o.C47957tzs, o.AbstractC43310rmq
        public /* synthetic */ void onBindViewHolder(C43312rms c43312rms, MineCommentBean mineCommentBean) {
            onBindViewHolder((C43312rms<tMW>) c43312rms, mineCommentBean);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.C47957tzs, o.AbstractC43310rmq, o.AbstractC59533zio
        /* JADX INFO: renamed from: OLrzqt */
        public void onBindViewHolder(C43312rms<tMW> c43312rms, MineCommentBean mineCommentBean) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(mineCommentBean, "");
            super.onBindViewHolder(c43312rms, mineCommentBean);
            OLrzqt(c43312rms, C33129mqd.gEmmrt(mineCommentBean.getText()));
            java.lang.String repliedText = mineCommentBean.getRepliedText();
            if (repliedText == null) {
                repliedText = "";
            }
            AEQbTJ(c43312rms, repliedText);
            java.lang.String replyText = mineCommentBean.getReplyText();
            KWHzl(c43312rms, replyText != null ? replyText : "");
            EZpvd(c43312rms, C46388tSm.Companion.KWHzl().isConnected());
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new StateListAnimator(view, 1000L, C47943tze.this, mineCommentBean));
        }

        /* JADX INFO: renamed from: o.tze$ActionBar$Application */
        public static final class Application implements Function1<EventParamsList, Unit> {
            public static final Application OLrzqt = new Application();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.CONTENT_TYPE, "replies", false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.tze$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ C47943tze OLrzqt;
            public final /* synthetic */ MineCommentBean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, C47943tze c47943tze, MineCommentBean mineCommentBean) {
                this.AEQbTJ = view;
                this.KWHzl = j;
                this.OLrzqt = c47943tze;
                this.copydefault = mineCommentBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_MyActivities_List_Click", (TrackChannel[]) null, Application.OLrzqt, 1, (java.lang.Object) null);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.copydefault.getRelatedContentId(), this.copydefault.getRelatedCommentId(), this.copydefault.getReplyRootId());
                }
            }
        }
    }

    @Override // o.AbstractC47866tyG
    public void AEQbTJ(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.AEQbTJ(c59534zip);
        c59534zip.register(MineCommentBean.class, new ActionBar());
    }
}

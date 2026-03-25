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
import com.okinc.planet.domain.remote.dto.MineLikesBean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tzd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47942tzd extends AbstractC47866tyG<C47921tzI> {
    public final InterfaceC56387yDm gEmmrt;

    public C47942tzd() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.planet.biz_notifications.ui.MineLikesFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.planet.biz_notifications.ui.MineLikesFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C47921tzI.class), new Function0<ViewModelStore>() { // from class: com.okinc.planet.biz_notifications.ui.MineLikesFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.planet.biz_notifications.ui.MineLikesFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.planet.biz_notifications.ui.MineLikesFragment$special$$inlined$viewModels$default$5
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
    public C47921tzI copydefault() {
        return (C47921tzI) this.gEmmrt.getValue();
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

    /* JADX INFO: renamed from: o.tzd$ActionBar */
    public static final class ActionBar extends C47963tzy {
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.C47963tzy, o.AbstractC43310rmq
        /* JADX INFO: renamed from: copydefault */
        public void onBindViewHolder(C43312rms<tMX> c43312rms, MineLikesBean mineLikesBean) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(mineLikesBean, "");
            super.onBindViewHolder(c43312rms, mineLikesBean);
            KWHzl(c43312rms, C33129mqd.gEmmrt(mineLikesBean.getText()));
            java.lang.String content = mineLikesBean.getContent();
            OLrzqt(c43312rms, content != null ? content : "");
            EZpvd(c43312rms, C46388tSm.Companion.KWHzl().isConnected());
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new Activity(view, 1000L, C47942tzd.this, mineLikesBean));
        }

        /* JADX INFO: renamed from: o.tzd$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0973ActionBar implements Function1<EventParamsList, Unit> {
            public static final C0973ActionBar copydefault = new C0973ActionBar();

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                AEQbTJ(eventParamsList);
                return Unit.INSTANCE;
            }

            public final void AEQbTJ(EventParamsList eventParamsList) {
                Intrinsics.checkNotNullParameter(eventParamsList, "");
                EventParamsList.put$default(eventParamsList, FirebaseAnalytics.Param.CONTENT_TYPE, "likes", false, 4, null);
            }
        }

        /* JADX INFO: renamed from: o.tzd$ActionBar$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C47942tzd KWHzl;
            public final /* synthetic */ MineLikesBean OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C47942tzd c47942tzd, MineLikesBean mineLikesBean) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.KWHzl = c47942tzd;
                this.OLrzqt = mineLikesBean;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_MyActivities_List_Click", (TrackChannel[]) null, C0973ActionBar.copydefault, 1, (java.lang.Object) null);
                    C47945tzg c47945tzg = C47945tzg.OLrzqt;
                    android.content.Context contextRequireContext = this.KWHzl.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                    c47945tzg.AEQbTJ(contextRequireContext, this.OLrzqt.getRelatedContentId(), this.OLrzqt.getRelatedCommentId(), this.OLrzqt.getReplyRootId());
                }
            }
        }
    }

    @Override // o.AbstractC47866tyG
    public void AEQbTJ(@NotNull C59534zip c59534zip) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        super.AEQbTJ(c59534zip);
        c59534zip.register(MineLikesBean.class, new ActionBar());
    }
}

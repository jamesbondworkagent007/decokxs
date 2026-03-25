package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.account.api.service.UserInfoService;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatSettingViewComponentScene;
import com.okinc.im.imui.chatsettings.model.ChatSettingsResult;
import com.okinc.im.imui.privacy.CommonChatSettingsFragment$observeData$1;
import com.okinc.im.imui.privacy.CommonChatSettingsFragment$observeData$2;
import com.okinc.im.imui.privacy.SecurityType;
import com.okinc.im.imui.privacy.SettingType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.ActivityC35481nwF;
import o.ActivityC35539nxK;
import o.C35399nuc;
import o.C37189opD;
import o.C52761wXj;
import o.InterfaceC8101awQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37189opD extends AbstractC32996moC {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final C43316rmw AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final int EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public C33898nJy copydefault;
    public final java.util.ArrayList<java.lang.Object> djBIcL;

    /* JADX INFO: renamed from: o.opD$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChatSettingViewComponentScene.values().length];
            try {
                iArr[ChatSettingViewComponentScene.CHAT_SETTINGS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChatSettingViewComponentScene.ORBIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatSettingViewComponentScene.USER_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[SecurityType.values().length];
            try {
                iArr2[SecurityType.IM_CONTACT_DISCOVERY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[SecurityType.IM_GROUP_SEARCH_ADD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[SecurityType.IM_RECEIVE_INAPP_NOTIFICATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[SecurityType.IM_ALLOW_CHAT_VIA_PROFILE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[SettingType.values().length];
            try {
                iArr3[SettingType.BLOCK_LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr3[SettingType.AUTO_DOWNLOAD_MEDIA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            EZpvd = iArr3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.EZpvd;
    }

    public C37189opD() {
        Function0 function0 = new Function0() { // from class: o.opC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37189opD.AhwBna(this.copydefault);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.privacy.CommonChatSettingsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.privacy.CommonChatSettingsFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        final Function0 function03 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37203opR.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.privacy.CommonChatSettingsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.privacy.CommonChatSettingsFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
        this.AEQbTJ = new C43316rmw();
        this.djBIcL = new java.util.ArrayList<>();
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.opG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37189opD.KWHzl(this.AEQbTJ);
            }
        });
        this.EZpvd = C35399nuc.Dialog.AxsJAYsNCnLh;
    }

    /* JADX INFO: renamed from: o.opD$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37189opD OLrzqt(@NotNull ChatSettingViewComponentScene chatSettingViewComponentScene) {
            Intrinsics.checkNotNullParameter(chatSettingViewComponentScene, "");
            C37189opD c37189opD = new C37189opD();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("arg_entry", chatSettingViewComponentScene);
            c37189opD.setArguments(bundle);
            return c37189opD;
        }
    }

    public final C33898nJy copydefault() {
        C33898nJy c33898nJy = this.copydefault;
        Intrinsics.copydefault(c33898nJy);
        return c33898nJy;
    }

    /* JADX INFO: renamed from: o.opD$LoaderManager */
    public static final class LoaderManager implements ViewModelProvider.Factory {
        public LoaderManager() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU == null) {
                throw new java.lang.IllegalArgumentException("OKIMService not available".toString());
            }
            sHZ shzAEQbTJ = interfaceC35180nqU.AEQbTJ();
            android.content.Context applicationContext = C37189opD.this.requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            CoroutineDispatcher coroutineDispatcherInvokespecialDaTmkG = ((InterfaceC44149sFc) C58114yvF.OLrzqt(applicationContext, InterfaceC44149sFc.class)).invokespecialDaTmkG();
            C35767oCy c35767oCy = new C35767oCy(interfaceC35180nqU, coroutineDispatcherInvokespecialDaTmkG);
            C35765oCw c35765oCw = new C35765oCw(shzAEQbTJ.AEQbTJ(), interfaceC35180nqU.EZpvd(), coroutineDispatcherInvokespecialDaTmkG);
            InterfaceC8108awX interfaceC8108awX = (InterfaceC8108awX) C43248rlh.KWHzl.AEQbTJ(InterfaceC8108awX.class);
            android.content.Context applicationContext2 = C37189opD.this.requireContext().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
            return new C37203opR(c35767oCy, c35765oCw, interfaceC8108awX, ((InterfaceC47230tmC) C58114yvF.OLrzqt(applicationContext2, InterfaceC47230tmC.class)).fmB());
        }
    }

    public final C37203opR OLrzqt() {
        return (C37203opR) this.AhwBna.getValue();
    }

    public static final ViewModelProvider.Factory AhwBna(C37189opD c37189opD) {
        return c37189opD.new LoaderManager();
    }

    public final ChatSettingViewComponentScene KWHzl() {
        return (ChatSettingViewComponentScene) this.OLrzqt.getValue();
    }

    public static final ChatSettingViewComponentScene KWHzl(C37189opD c37189opD) {
        ChatSettingViewComponentScene chatSettingViewComponentScene;
        android.os.Bundle arguments = c37189opD.getArguments();
        return (arguments == null || (chatSettingViewComponentScene = (ChatSettingViewComponentScene) arguments.getParcelable("arg_entry")) == null) ? ChatSettingViewComponentScene.CHAT_SETTINGS : chatSettingViewComponentScene;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.copydefault = C33898nJy.AEQbTJ(layoutInflater, viewGroup, false);
        ConstraintLayout constraintLayoutEZpvd = copydefault().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
        return constraintLayoutEZpvd;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        EZpvd();
        djBIcL();
        valueOf();
        boolean zGEmmrt = gEmmrt();
        AhwBna();
        OLrzqt().copydefault(true, zGEmmrt);
    }

    public final void valueOf() {
        C52794wYp c52794wYp = copydefault().copydefault;
        Intrinsics.copydefault(c52794wYp);
        c52794wYp.setVisibility(sSI.copydefault.copydefault() ^ true ? 0 : 8);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(c52794wYp.getContext(), C52761wXj.TaskDescription.reset);
        if (drawable != null) {
            drawable.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
        }
        c52794wYp.setCompoundDrawablesRelative(drawable, null, null, null);
        c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.opD$PendingIntent */
    public static final class PendingIntent implements UserInfoService.ActionBar {
        public PendingIntent() {
        }
    }

    private final void AYXKKw() {
        RecyclerView recyclerView = copydefault().DbNXlk;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.opD$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C37189opD OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C37189opD c37189opD) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c37189opD;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.account.api.service.UserInfoService.Application.startEditProfileFlow$default(com.okinc.account.api.service.UserInfoService, androidx.fragment.app.FragmentActivity, com.okinc.account.api.model.usercenter.EditProfileScenario, com.okinc.account.api.service.UserInfoService$ActionBar, com.okinc.account.api.service.UserInfoService$Activity, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                UserInfoService userInfoService = (UserInfoService) C43248rlh.KWHzl.AEQbTJ(UserInfoService.class);
                FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                UserInfoService.Application.startEditProfileFlow$default(userInfoService, fragmentActivityRequireActivity, null, this.OLrzqt.new PendingIntent(), null, null, null, null, 122, null);
            }
        }
    }

    public final void EZpvd() {
        this.AEQbTJ.register(java.lang.String.class, new Application(C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ffGIBT), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.ODWQjV)));
        this.AEQbTJ.register(C37201opP.class, new Activity(C35399nuc.Dialog.aCSzUz, C35342ntX.gEmmrt));
        this.AEQbTJ.register(C37199opN.class, new StateListAnimator(C35399nuc.Dialog.YFmri, C35342ntX.AYXKKw));
    }

    /* JADX INFO: renamed from: o.opD$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application extends AbstractC59533zio<java.lang.String, RecyclerView.ViewHolder> {
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, java.lang.String str) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(str, "");
        }

        public Application(int i, int i2) {
            this.copydefault = i;
            this.EZpvd = i2;
        }

        @Override // o.AbstractC59533zio
        public RecyclerView.ViewHolder onCreateViewHolder(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View view = new android.view.View(viewGroup.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, C55298xhM.dp2px$default(0.5f, null, 1, null));
            int i = this.copydefault;
            int i2 = this.EZpvd;
            layoutParams.setMargins(i, i2, i, i2);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(C33070mpX.copydefault(C52761wXj.Activity.sZqaRl));
            return new Activity(view);
        }

        /* JADX INFO: renamed from: o.opD$Application$Activity */
        public static final class Activity extends RecyclerView.ViewHolder {
            public Activity(android.view.View view) {
                super(view);
            }
        }
    }

    /* JADX INFO: renamed from: o.opD$Activity */
    public static final class Activity extends C43318rmy<C37201opP, nOT> {
        public Activity(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<nOT> c43312rms, final C37201opP c37201opP) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c37201opP, "");
            super.onBindViewHolder((C43312rms) c43312rms, c37201opP);
            C55239xgG c55239xgG = (C55239xgG) c43312rms.itemView.findViewById(C35399nuc.StateListAnimator.onProviderDisabled);
            if (c55239xgG != null) {
                final C37189opD c37189opD = C37189opD.this;
                c55239xgG.setOnClickListener(new View.OnClickListener() { // from class: o.opL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C37189opD.Activity.EZpvd(c37189opD, c37201opP, view);
                    }
                });
            }
            android.widget.TextView textView = (android.widget.TextView) c43312rms.itemView.findViewById(C35399nuc.StateListAnimator.aHXSQp);
            if (textView != null) {
                textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) c37201opP.AEQbTJ()) ? 0 : 8);
            }
        }

        public static final void EZpvd(C37189opD c37189opD, C37201opP c37201opP, android.view.View view) {
            c37189opD.KWHzl(c37201opP.KWHzl(), !c37201opP.EZpvd());
        }
    }

    /* JADX INFO: renamed from: o.opD$StateListAnimator */
    public static final class StateListAnimator extends C43318rmy<C37199opN, AbstractC34038nPc> {
        public StateListAnimator(int i, int i2) {
            super(i, i2);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C43312rms<AbstractC34038nPc> c43312rms, final C37199opN c37199opN) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(c37199opN, "");
            super.onBindViewHolder((C43312rms) c43312rms, c37199opN);
            if (c37199opN.KWHzl()) {
                ((AbstractC34038nPc) c43312rms.OLrzqt()).KWHzl.setImageDrawable(C37189opD.this.AEQbTJ());
            }
            android.view.View view = c43312rms.itemView;
            final C37189opD c37189opD = C37189opD.this;
            view.setOnClickListener(new View.OnClickListener() { // from class: o.opI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C37189opD.StateListAnimator.OLrzqt(c37189opD, c37199opN, view2);
                }
            });
        }

        public static final void OLrzqt(C37189opD c37189opD, C37199opN c37199opN, android.view.View view) {
            c37189opD.KWHzl(c37199opN.OLrzqt());
        }
    }

    public final void djBIcL() {
        copydefault().AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.opF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37189opD.OLrzqt(this.copydefault, view);
            }
        });
        copydefault().AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.opH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C37189opD.copydefault(this.AEQbTJ, view);
            }
        });
    }

    public static final void OLrzqt(C37189opD c37189opD, android.view.View view) {
        c37189opD.OLrzqt().copydefault(false, c37189opD.gEmmrt());
    }

    public static final void copydefault(C37189opD c37189opD, android.view.View view) {
        c37189opD.OLrzqt().copydefault(false, c37189opD.gEmmrt());
    }

    public final boolean gEmmrt() {
        int i = ActionBar.AEQbTJ[KWHzl().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2 || i == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void AhwBna() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new CommonChatSettingsFragment$observeData$1(this, null), 3, null);
        if (gEmmrt()) {
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new CommonChatSettingsFragment$observeData$2(this, null), 3, null);
        }
    }

    public final void copydefault(boolean z) {
        ChatSettingViewComponentScene chatSettingViewComponentSceneKWHzl = KWHzl();
        ChatSettingViewComponentScene chatSettingViewComponentScene = ChatSettingViewComponentScene.ORBIT;
        if (chatSettingViewComponentSceneKWHzl == chatSettingViewComponentScene && z) {
            ConstraintLayout constraintLayout = copydefault().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            return;
        }
        if (KWHzl() == chatSettingViewComponentScene) {
            copydefault().AEQbTJ.getLayoutParams().height = -2;
        } else {
            copydefault().AEQbTJ.getLayoutParams().height = -1;
        }
        C55113xdn c55113xdn = copydefault().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(0);
        C55173xeu c55173xeu = copydefault().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C55173xeu c55173xeu2 = copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(8);
        android.widget.LinearLayout linearLayout = copydefault().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
    }

    public static /* synthetic */ void showError$default(C37189opD c37189opD, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c37189opD.copydefault(str);
    }

    public final void copydefault(java.lang.String str) {
        pUU.copydefault(getTAG(), "Load Setting and avator error " + str);
        C55113xdn c55113xdn = copydefault().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        android.widget.LinearLayout linearLayout = copydefault().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(8);
        if (KWHzl() == ChatSettingViewComponentScene.ORBIT) {
            ConstraintLayout constraintLayout = copydefault().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = copydefault().AEQbTJ.getLayoutParams();
            layoutParams.height = -2;
            copydefault().AEQbTJ.setLayoutParams(layoutParams);
            C55173xeu c55173xeu = copydefault().AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(0);
            C55173xeu c55173xeu2 = copydefault().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = copydefault().AEQbTJ.getLayoutParams();
        layoutParams2.height = -1;
        copydefault().AEQbTJ.setLayoutParams(layoutParams2);
        C55173xeu c55173xeu3 = copydefault().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
        c55173xeu3.setVisibility(0);
        C55173xeu c55173xeu4 = copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu4, "");
        c55173xeu4.setVisibility(8);
    }

    public final void KWHzl(ChatSettingsResult chatSettingsResult) {
        if (this.copydefault == null || !isAdded() || getView() == null) {
            return;
        }
        copydefault().AEQbTJ.setMinHeight(0);
        boolean zGEmmrt = gEmmrt();
        android.widget.LinearLayout linearLayout = copydefault().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(zGEmmrt ? 0 : 8);
        if (KWHzl() == ChatSettingViewComponentScene.ORBIT) {
            ViewGroup.LayoutParams layoutParams = copydefault().AEQbTJ.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.height = -2;
            copydefault().AEQbTJ.setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = copydefault().AEQbTJ.getLayoutParams();
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.height = -1;
            copydefault().AEQbTJ.setLayoutParams(layoutParams2);
        }
        ConstraintLayout constraintLayout = copydefault().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(0);
        C55113xdn c55113xdn = copydefault().valueOf;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(8);
        C55173xeu c55173xeu = copydefault().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C55173xeu c55173xeu2 = copydefault().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(8);
        android.widget.LinearLayout linearLayout2 = copydefault().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
        linearLayout2.setVisibility(0);
        AEQbTJ(chatSettingsResult);
    }

    public final void OLrzqt(C35501nwZ c35501nwZ) {
        InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43248rlh.KWHzl.AEQbTJ(InterfaceC8101awQ.class);
        android.widget.ImageView imageView = copydefault().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, imageView, false, null, 4, null);
        copydefault().djBIcL.setText(c35501nwZ.KWHzl());
        copydefault().AkhnZx.setText(c35501nwZ.OLrzqt().EZpvd());
        android.widget.TextView textView = copydefault().AkhnZx;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c35501nwZ.OLrzqt().EZpvd().length() > 0 ? 0 : 8);
    }

    public final void KWHzl(SecurityType securityType, final boolean z) {
        int i = ActionBar.copydefault[securityType.ordinal()];
        if (i == 1) {
            OLrzqt().AEQbTJ(1, z);
            return;
        }
        if (i == 2) {
            OLrzqt().AEQbTJ(3, z);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("app_okim_privacy_settings_allow_invite_join_group", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.opE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37189opD.AEQbTJ(z, (EventParamsList) obj);
                }
            });
        } else if (i == 3) {
            OLrzqt().AEQbTJ(4, z);
        } else {
            if (i != 4) {
                return;
            }
            OLrzqt().AEQbTJ(5, z);
        }
    }

    public static final Unit AEQbTJ(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("enable", java.lang.String.valueOf(z), true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(SettingType settingType) {
        int i = ActionBar.EZpvd[settingType.ordinal()];
        if (i == 1) {
            ActivityC35539nxK.StateListAnimator stateListAnimator = ActivityC35539nxK.Companion;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            startActivity(stateListAnimator.KWHzl(contextRequireContext));
            return;
        }
        if (i != 2) {
            return;
        }
        ActivityC35481nwF.TaskDescription taskDescription = ActivityC35481nwF.Companion;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        startActivity(taskDescription.AEQbTJ(contextRequireContext2));
    }

    public final void AEQbTJ(ChatSettingsResult chatSettingsResult) {
        java.lang.Object objM7377constructorimpl;
        this.djBIcL.clear();
        sSI ssi = sSI.copydefault;
        if (!ssi.copydefault()) {
            java.util.ArrayList<java.lang.Object> arrayList = this.djBIcL;
            SecurityType securityType = SecurityType.IM_GROUP_SEARCH_ADD;
            java.lang.String string = getString(C35399nuc.LoaderManager.IPostMessageServiceStubProxy);
            Intrinsics.checkNotNullExpressionValue(string, "");
            arrayList.add(new C37201opP(securityType, string, null, chatSettingsResult.copydefault(), 4, null));
            java.util.ArrayList<java.lang.Object> arrayList2 = this.djBIcL;
            SecurityType securityType2 = SecurityType.IM_CONTACT_DISCOVERY;
            java.lang.String string2 = getString(C35399nuc.LoaderManager.RjCdvpRjCdvp);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList2.add(new C37201opP(securityType2, string2, null, chatSettingsResult.EZpvd(), 4, null));
        }
        java.util.ArrayList<java.lang.Object> arrayList3 = this.djBIcL;
        SecurityType securityType3 = SecurityType.IM_RECEIVE_INAPP_NOTIFICATION;
        java.lang.String string3 = getString(C35399nuc.LoaderManager.getUriFromString);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        boolean zKWHzl = chatSettingsResult.KWHzl();
        java.lang.String string4 = getString(C35399nuc.LoaderManager.DRtzUu);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        arrayList3.add(new C37201opP(securityType3, string3, string4, zKWHzl));
        if (!ssi.copydefault() && chatSettingsResult.AEQbTJ() != null) {
            java.util.ArrayList<java.lang.Object> arrayList4 = this.djBIcL;
            SecurityType securityType4 = SecurityType.IM_ALLOW_CHAT_VIA_PROFILE;
            java.lang.String string5 = getString(C35399nuc.LoaderManager.ICustomTabsServiceDefault);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            arrayList4.add(new C37201opP(securityType4, string5, null, chatSettingsResult.AEQbTJ().booleanValue(), 4, null));
        }
        if (!ssi.copydefault()) {
            java.util.ArrayList<java.lang.Object> arrayList5 = this.djBIcL;
            SettingType settingType = SettingType.BLOCK_LIST;
            java.lang.String string6 = getString(C35399nuc.LoaderManager.IPostMessageServiceStub);
            Intrinsics.checkNotNullExpressionValue(string6, "");
            arrayList5.add(new C37199opN(settingType, string6, false, null, null, 28, null));
        }
        java.util.ArrayList<java.lang.Object> arrayList6 = this.djBIcL;
        SettingType settingType2 = SettingType.AUTO_DOWNLOAD_MEDIA;
        java.lang.String string7 = getString(C35399nuc.LoaderManager.iluEmO);
        Intrinsics.checkNotNullExpressionValue(string7, "");
        arrayList6.add(new C37199opN(settingType2, string7, false, null, null, 28, null));
        this.AEQbTJ.setItems(this.djBIcL);
        try {
            Result.Application application = Result.Companion;
            this.AEQbTJ.notifyDataSetChanged();
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ(getTAG(), "Error updating adapter: " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
        }
    }

    public final android.graphics.drawable.Drawable AEQbTJ() {
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI);
        if (drawableKWHzl == null) {
            return null;
        }
        DrawableCompat.setTint(drawableKWHzl, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        return drawableKWHzl;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }
}

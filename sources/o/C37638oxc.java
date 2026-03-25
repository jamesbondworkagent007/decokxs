package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.IMMessageShareModel;
import com.okinc.im.imui.share.model.ShareMessageError;
import com.okinc.im.imui.share.view.ShareMessageBottomSheet$observeViewModel$1;
import com.okinc.im.imui.share.view.ShareMessageBottomSheet$observeViewModel$2;
import com.okinc.im.imui.share.view.ShareMessageBottomSheet$onFooterCreated$1$1$1$1;
import com.okinc.im.imui.share.view.ShareMessageBottomSheet$submitShareMessage$1;
import com.okinc.okimcore.model.share.ShareResult;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35399nuc;
import o.C37643oxh;
import o.C37649oxn;
import o.sQV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oxc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37638oxc extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public wYF AhwBna;
    public nKX KWHzl;
    public final InterfaceC56387yDm valueOf;
    public final boolean EZpvd = true;
    public final boolean AEQbTJ = true;
    public final C37763ozv AYXKKw = new C37763ozv(new C37647oxl());
    public final C37763ozv copydefault = new C37763ozv(new C37644oxi());
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.oxf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C37638oxc.AhwBna(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean isFullScreen() {
        return this.EZpvd;
    }

    public C37638oxc() {
        Function0 function0 = new Function0() { // from class: o.oxg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C37638oxc.gEmmrt(this.OLrzqt);
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.im.imui.share.view.ShareMessageBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.im.imui.share.view.ShareMessageBottomSheet$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C37656oxu.class), new Function0<ViewModelStore>() { // from class: com.okinc.im.imui.share.view.ShareMessageBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.im.imui.share.view.ShareMessageBottomSheet$special$$inlined$viewModels$default$4
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
    }

    public final IMMessageShareModel AEQbTJ() {
        return (IMMessageShareModel) this.djBIcL.getValue();
    }

    public static final IMMessageShareModel AhwBna(C37638oxc c37638oxc) {
        android.os.Bundle arguments = c37638oxc.getArguments();
        IMMessageShareModel iMMessageShareModel = arguments != null ? (IMMessageShareModel) arguments.getParcelable("KEY_PARAM") : null;
        Intrinsics.copydefault(iMMessageShareModel);
        return iMMessageShareModel;
    }

    /* JADX INFO: renamed from: o.oxc$PendingIntent */
    public static final class PendingIntent implements ViewModelProvider.Factory {
        public PendingIntent() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(java.lang.Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            java.lang.Object objCopydefault = C58113yvE.copydefault(C37638oxc.this.requireContext().getApplicationContext(), InterfaceC37645oxj.class);
            Intrinsics.checkNotNullExpressionValue(objCopydefault, "");
            InterfaceC37645oxj interfaceC37645oxj = (InterfaceC37645oxj) objCopydefault;
            return new C37656oxu(interfaceC37645oxj.QVsKAR(), interfaceC37645oxj.OxVOHk(), interfaceC37645oxj.QCjLjM());
        }
    }

    public final C37656oxu copydefault() {
        return (C37656oxu) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.oxc$StateListAnimator */
    public static final class StateListAnimator implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public StateListAnimator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            C37638oxc.this.copydefault().KWHzl(C33129mqd.gEmmrt(editable));
        }
    }

    public static final ViewModelProvider.Factory gEmmrt(C37638oxc c37638oxc) {
        return c37638oxc.new PendingIntent();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        java.lang.String string = getString(C35399nuc.LoaderManager.UUsvzU);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.KWHzl = nKX.copydefault(getCustomLayoutInflater(), constraintLayout, true);
        djBIcL();
        gEmmrt();
        AhwBna();
        EZpvd();
    }

    private final void djBIcL() {
        nKX nkx = this.KWHzl;
        if (nkx == null) {
            Intrinsics.gEmmrt("");
            nkx = null;
        }
        nkx.KWHzl.KWHzl().addTextChangedListener(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.oxc$Activity */
    public static final class Activity implements C37649oxn.StateListAnimator {
        public Activity() {
        }

        @Override // o.C37649oxn.StateListAnimator
        public void OLrzqt(ShareTarget shareTarget) {
            Intrinsics.checkNotNullParameter(shareTarget, "");
            pUU.KWHzl("ShareMessageBottomSheet", "horizontal item click: " + shareTarget);
            C37638oxc.this.copydefault().OLrzqt(shareTarget, false);
        }
    }

    private final void gEmmrt() {
        C37763ozv c37763ozv = this.AYXKKw;
        C37649oxn c37649oxn = new C37649oxn();
        c37649oxn.copydefault(new Activity());
        c37763ozv.EZpvd(c37649oxn);
        nKX nkx = this.KWHzl;
        if (nkx == null) {
            Intrinsics.gEmmrt("");
            nkx = null;
        }
        RecyclerView recyclerView = nkx.OLrzqt;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        recyclerView.setAdapter(this.AYXKKw);
    }

    /* JADX INFO: renamed from: o.oxc$ActionBar */
    public static final class ActionBar implements C37643oxh.Activity {
        public ActionBar() {
        }

        @Override // o.C37643oxh.Activity
        public void OLrzqt(ShareTarget shareTarget, boolean z) {
            Intrinsics.checkNotNullParameter(shareTarget, "");
            C37638oxc.this.copydefault().OLrzqt(shareTarget, z);
            nKX nkx = C37638oxc.this.KWHzl;
            if (nkx == null) {
                Intrinsics.gEmmrt("");
                nkx = null;
            }
            nkx.KWHzl.KWHzl().setText("");
        }
    }

    private final void AhwBna() {
        C37763ozv c37763ozv = this.copydefault;
        C37643oxh c37643oxh = new C37643oxh();
        c37643oxh.OLrzqt(new ActionBar());
        c37763ozv.EZpvd(c37643oxh);
        nKX nkx = this.KWHzl;
        if (nkx == null) {
            Intrinsics.gEmmrt("");
            nkx = null;
        }
        RecyclerView recyclerView = nkx.valueOf;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        recyclerView.setAdapter(this.copydefault);
    }

    private final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareMessageBottomSheet$observeViewModel$1(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareMessageBottomSheet$observeViewModel$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.oxc$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C37638oxc OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C37638oxc c37638oxc) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = c37638oxc;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt();
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity != null) {
                    FragmentActivity activity2 = this.OLrzqt.getActivity();
                    AbstractActivityC33041mov abstractActivityC33041mov = activity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity2 : null;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.showLoading();
                    }
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new ShareMessageBottomSheet$onFooterCreated$1$1$1$1(this.OLrzqt, activity, null), 3, null);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl() {
        int itemCount = this.AYXKKw.getItemCount() - 1;
        if (itemCount != -1) {
            nKX nkx = this.KWHzl;
            if (nkx == null) {
                Intrinsics.gEmmrt("");
                nkx = null;
            }
            RecyclerView.LayoutManager layoutManager = nkx.OLrzqt.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(itemCount);
            }
        }
    }

    public final void OLrzqt(int i) {
        wYF wyf = this.AhwBna;
        if (wyf != null) {
            wyf.setPrimaryText(C33069mpW.copydefault(this, C35399nuc.LoaderManager.rsEnD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(i)))));
            C52794wYp c52794wYpCopydefault = wyf.copydefault();
            if (c52794wYpCopydefault != null) {
                c52794wYpCopydefault.setEnabled(i > 0);
            }
        }
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        this.AhwBna = wyf;
        OLrzqt(0);
    }

    public final void OLrzqt() {
        try {
            Result.Application application = Result.Companion;
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("IM_Share_Card_Send_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oxe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37638oxc.copydefault(this.OLrzqt, (EventParamsList) obj);
                }
            });
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    public static final Unit copydefault(C37638oxc c37638oxc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C33758nEt c33758nEt = C33758nEt.copydefault;
        IMMessageShareModel.CTAType ctaType = c37638oxc.AEQbTJ().getCtaType();
        eventParamsList.put("cta_name", c33758nEt.EZpvd(ctaType != null ? java.lang.Integer.valueOf(ctaType.getValue()) : null).EZpvd(), true);
        EventParamsList.put$default(eventParamsList, "bizline", c37638oxc.AEQbTJ().getBizName(), false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(FragmentActivity fragmentActivity, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ShareMessageBottomSheet$submitShareMessage$1 shareMessageBottomSheet$submitShareMessage$1;
        C37638oxc c37638oxc;
        FragmentActivity fragmentActivity2;
        java.util.Set<ShareTarget> set;
        if (continuation instanceof ShareMessageBottomSheet$submitShareMessage$1) {
            shareMessageBottomSheet$submitShareMessage$1 = (ShareMessageBottomSheet$submitShareMessage$1) continuation;
            int i = shareMessageBottomSheet$submitShareMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                shareMessageBottomSheet$submitShareMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                shareMessageBottomSheet$submitShareMessage$1 = new ShareMessageBottomSheet$submitShareMessage$1(this, continuation);
            }
        }
        java.lang.Object obj = shareMessageBottomSheet$submitShareMessage$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = shareMessageBottomSheet$submitShareMessage$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            java.util.Set<ShareTarget> value = copydefault().KWHzl().getValue();
            C37656oxu c37656oxuCopydefault = copydefault();
            IMMessageShareModel iMMessageShareModelAEQbTJ = AEQbTJ();
            shareMessageBottomSheet$submitShareMessage$1.L$0 = this;
            shareMessageBottomSheet$submitShareMessage$1.L$1 = fragmentActivity;
            shareMessageBottomSheet$submitShareMessage$1.L$2 = value;
            shareMessageBottomSheet$submitShareMessage$1.label = 1;
            java.lang.Object objKWHzl = c37656oxuCopydefault.KWHzl(value, iMMessageShareModelAEQbTJ, shareMessageBottomSheet$submitShareMessage$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            c37638oxc = this;
            fragmentActivity2 = fragmentActivity;
            set = value;
            obj = objKWHzl;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.Set<ShareTarget> set2 = (java.util.Set) shareMessageBottomSheet$submitShareMessage$1.L$2;
            FragmentActivity fragmentActivity3 = (FragmentActivity) shareMessageBottomSheet$submitShareMessage$1.L$1;
            C37638oxc c37638oxc2 = (C37638oxc) shareMessageBottomSheet$submitShareMessage$1.L$0;
            C56391yDq.AEQbTJ(obj);
            set = set2;
            c37638oxc = c37638oxc2;
            fragmentActivity2 = fragmentActivity3;
        }
        sQV sqv = (sQV) obj;
        FragmentActivity activity = c37638oxc.getActivity();
        AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
        if (abstractActivityC33041mov != null) {
            abstractActivityC33041mov.dismissLoading();
        }
        if (sqv instanceof sQV.Activity) {
            java.lang.String message = ((sQV.Activity) sqv).AEQbTJ().getMessage();
            if (message != null) {
                C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else {
            if (!(sqv instanceof sQV.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            sQV.Application application = (sQV.Application) sqv;
            java.util.List<ShareResult> listOLrzqt = application.OLrzqt();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listOLrzqt) {
                if (!((ShareResult) obj2).copydefault()) {
                    arrayList.add(obj2);
                }
            }
            java.util.List<ShareResult> listAEQbTJ = application.AEQbTJ();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listAEQbTJ) {
                if (!((ShareResult) obj3).copydefault()) {
                    arrayList2.add(obj3);
                }
            }
            boolean z = arrayList.size() + arrayList2.size() == application.OLrzqt().size() + application.AEQbTJ().size();
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                C55326xho.toastWithSuccessfulIcon$default(C35399nuc.LoaderManager.DLl, 0, 1, (java.lang.Object) null);
            } else {
                c37638oxc.OLrzqt(fragmentActivity2, z, set, arrayList, arrayList2);
            }
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(FragmentActivity fragmentActivity, boolean z, java.util.Set<ShareTarget> set, java.util.List<ShareResult> list, java.util.List<ShareResult> list2) {
        ShareMessageError shareMessageError;
        java.lang.Object next;
        java.lang.Object next2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                C37639oxd c37639oxdKWHzl = C37639oxd.Companion.KWHzl(z, arrayList);
                androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                c37639oxdKWHzl.show(supportFragmentManager);
                return;
            }
            ShareTarget shareTarget = (ShareTarget) it.next();
            java.util.Iterator<T> it2 = list.iterator();
            while (true) {
                shareMessageError = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((ShareResult) next).KWHzl(), (java.lang.Object) shareTarget.copydefault())) {
                        break;
                    }
                }
            }
            ShareResult shareResult = (ShareResult) next;
            if (shareResult != null) {
                java.lang.String strEZpvd = shareResult.EZpvd();
                shareMessageError = new ShareMessageError(shareTarget, strEZpvd != null ? strEZpvd : "");
            } else {
                java.util.Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    } else {
                        next2 = it3.next();
                        if (Intrinsics.EZpvd((java.lang.Object) ((ShareResult) next2).OLrzqt(), (java.lang.Object) shareTarget.OLrzqt())) {
                            break;
                        }
                    }
                }
                ShareResult shareResult2 = (ShareResult) next2;
                if (shareResult2 != null) {
                    java.lang.String strEZpvd2 = shareResult2.EZpvd();
                    shareMessageError = new ShareMessageError(shareTarget, strEZpvd2 != null ? strEZpvd2 : "");
                }
            }
            if (shareMessageError != null) {
                arrayList.add(shareMessageError);
            }
        }
    }

    /* JADX INFO: renamed from: o.oxc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oxc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C37638oxc AEQbTJ(@NotNull IMMessageShareModel iMMessageShareModel) {
            Intrinsics.checkNotNullParameter(iMMessageShareModel, "");
            C37638oxc c37638oxc = new C37638oxc();
            c37638oxc.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PARAM", iMMessageShareModel)));
            return c37638oxc;
        }
    }
}

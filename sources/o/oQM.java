package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo;
import com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$onViewCreated$2;
import com.okinc.kline.features.kline.bottom.marketevents.viewmodel.MarketEventExplainViewModel;
import java.util.Date;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oQM extends oQI {
    public static final Activity Companion = new Activity(null);
    public static final int valueOf = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public oOP djBIcL;

    public oQM() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$special$$inlined$viewModels$default$2
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketEventExplainViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.kline.features.kline.bottom.marketevents.ui.dialog.MarketEventsExplainedDialog$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.oQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oQM.KWHzl(this.copydefault);
            }
        });
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oQM.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final oQM copydefault(@NotNull MarketEventsVo.Content content) {
            Intrinsics.checkNotNullParameter(content, "");
            oQM oqm = new oQM();
            oqm.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("market_events_content", content)));
            return oqm;
        }
    }

    public final MarketEventExplainViewModel gEmmrt() {
        return (MarketEventExplainViewModel) this.AYXKKw.getValue();
    }

    /* JADX DEBUG: Possible override for method o.oQI.AEQbTJ()V */
    public final MarketEventsVo.Content AEQbTJ() {
        return (MarketEventsVo.Content) this.AhwBna.getValue();
    }

    public static final MarketEventsVo.Content KWHzl(oQM oqm) {
        android.os.Bundle arguments = oqm.getArguments();
        if (arguments != null) {
            return (MarketEventsVo.Content) BundleCompat.getParcelable(arguments, "market_events_content", MarketEventsVo.Content.class);
        }
        return null;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.djBIcL = oOP.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public final void copydefault(java.util.List<java.lang.String> list) {
        android.widget.TextView textView;
        java.util.List listAhwBna;
        oOP oop = this.djBIcL;
        if (oop != null) {
            if (C33129mqd.KWHzl((java.util.Collection) list)) {
                int size = list != null ? list.size() : 0;
                if (list != null && (listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 3)) != null) {
                    int i = 0;
                    for (java.lang.Object obj : listAhwBna) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        java.lang.String str = (java.lang.String) obj;
                        if (i == 0) {
                            android.widget.ImageView imageView = oop.EZpvd;
                            Intrinsics.checkNotNullExpressionValue(imageView, "");
                            java.lang.String strKWHzl = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                            C33054mpH.loadAvatar$default(imageView, strKWHzl == null ? "" : strKWHzl, null, null, 6, null);
                        } else if (i == 1) {
                            android.widget.ImageView imageView2 = oop.KWHzl;
                            Intrinsics.checkNotNullExpressionValue(imageView2, "");
                            java.lang.String strKWHzl2 = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                            C33054mpH.loadAvatar$default(imageView2, strKWHzl2 == null ? "" : strKWHzl2, null, null, 6, null);
                        } else if (i == 2) {
                            android.widget.ImageView imageView3 = oop.copydefault;
                            Intrinsics.checkNotNullExpressionValue(imageView3, "");
                            java.lang.String strKWHzl3 = C55297xhL.KWHzl(str, C55298xhM.dp2px$default(14.0f, null, 1, null), C55298xhM.dp2px$default(14.0f, null, 1, null));
                            C33054mpH.loadAvatar$default(imageView3, strKWHzl3 == null ? "" : strKWHzl3, null, null, 6, null);
                        }
                        i++;
                    }
                }
                android.widget.ImageView imageView4 = oop.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView4, "");
                imageView4.setVisibility(size >= 1 ? 0 : 8);
                android.widget.ImageView imageView5 = oop.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView5, "");
                imageView5.setVisibility(size >= 2 ? 0 : 8);
                android.widget.ImageView imageView6 = oop.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView6, "");
                imageView6.setVisibility(size >= 3 ? 0 : 8);
                oop.KWHzl.setElevation(0.1f);
                oop.EZpvd.setElevation(0.2f);
                oOP oop2 = this.djBIcL;
                if (oop2 != null && (textView = oop2.OLrzqt) != null) {
                    textView.setText(pTD.KWHzl(this, C35964oKf.LoaderManager.AEQbTJ, size, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(size)))));
                }
                android.widget.LinearLayout linearLayout = oop.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                return;
            }
            android.widget.LinearLayout linearLayout2 = oop.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        AppCompatTextView appCompatTextView3;
        android.widget.LinearLayout linearLayout;
        AppCompatTextView appCompatTextView4;
        AppCompatTextView appCompatTextView5;
        AppCompatTextView appCompatTextView6;
        AppCompatTextView appCompatTextView7;
        AppCompatTextView appCompatTextView8;
        AppCompatTextView appCompatTextView9;
        AppCompatTextView appCompatTextView10;
        AppCompatTextView appCompatTextView11;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        MarketEventsVo.Content contentAEQbTJ = AEQbTJ();
        if (contentAEQbTJ != null) {
            oOP oop = this.djBIcL;
            if (oop != null && (appCompatTextView11 = oop.AhwBna) != null) {
                appCompatTextView11.setText(pTA.formatSimpleDateTime$default(new Date(contentAEQbTJ.djBIcL().getTimeStamp()), null, 1, null));
            }
            oOP oop2 = this.djBIcL;
            if (oop2 != null && (appCompatTextView10 = oop2.valueOf) != null) {
                appCompatTextView10.setText(oQQ.copydefault(contentAEQbTJ));
            }
            oOP oop3 = this.djBIcL;
            if (oop3 != null && (appCompatTextView9 = oop3.gEmmrt) != null) {
                appCompatTextView9.setText(oQQ.OLrzqt(contentAEQbTJ));
            }
            oOP oop4 = this.djBIcL;
            if (oop4 != null && (appCompatTextView8 = oop4.gEmmrt) != null) {
                appCompatTextView8.setVisibility(C33129mqd.OLrzqt(oQQ.OLrzqt(contentAEQbTJ)) ? 0 : 8);
            }
            oOP oop5 = this.djBIcL;
            if (oop5 != null && (appCompatTextView7 = oop5.fetchVPNInfo) != null) {
                appCompatTextView7.setText(contentAEQbTJ.EZpvd());
            }
            oOP oop6 = this.djBIcL;
            if (oop6 != null && (appCompatTextView6 = oop6.AYXKKw) != null) {
                appCompatTextView6.setText(contentAEQbTJ.gEmmrt());
            }
            oOP oop7 = this.djBIcL;
            if (oop7 != null && (appCompatTextView5 = oop7.AYXKKw) != null) {
                appCompatTextView5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) contentAEQbTJ.gEmmrt()) ? 0 : 8);
            }
            oOP oop8 = this.djBIcL;
            if (oop8 != null && (appCompatTextView4 = oop8.fetchVPNInfo) != null) {
                appCompatTextView4.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) contentAEQbTJ.EZpvd()) ? 0 : 8);
            }
            oOP oop9 = this.djBIcL;
            if (oop9 != null && (linearLayout = oop9.AkhnZx) != null) {
                linearLayout.setVisibility((!C33129mqd.OLrzqt((java.lang.CharSequence) contentAEQbTJ.EZpvd()) || C33129mqd.KWHzl((java.util.Collection) contentAEQbTJ.OLrzqt())) ? 8 : 0);
            }
            oOP oop10 = this.djBIcL;
            if (oop10 != null && (appCompatTextView3 = oop10.isConnected) != null) {
                appCompatTextView3.setLinkTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            }
            java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C35964oKf.Fragment.fJk, C56423yEv.EZpvd(C56390yDp.OLrzqt("link", C33070mpX.AYXKKw(C35964oKf.Fragment.UeEOUB)))), new java.lang.String[]{C33070mpX.AYXKKw(C35964oKf.Fragment.UeEOUB)}, 0, null, false, new Function1() { // from class: o.oQL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return oQM.copydefault(this.copydefault, (java.util.List) obj);
                }
            }, 14, null);
            oOP oop11 = this.djBIcL;
            if (oop11 != null && (appCompatTextView2 = oop11.isConnected) != null) {
                appCompatTextView2.setText(charSequence);
            }
            oOP oop12 = this.djBIcL;
            if (oop12 != null && (appCompatTextView = oop12.isConnected) != null) {
                appCompatTextView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new MarketEventsExplainedDialog$onViewCreated$2(this, null), 3, null);
    }

    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public TaskDescription() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            oQM oqm = oQM.this;
            try {
                Result.Application application = Result.Companion;
                oQN oqnAEQbTJ = oQN.Companion.AEQbTJ();
                androidx.fragment.app.FragmentManager parentFragmentManager = oqm.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                oqnAEQbTJ.show(parentFragmentManager);
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    public static final Unit copydefault(oQM oqm, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(oqm.new TaskDescription());
        return Unit.INSTANCE;
    }
}

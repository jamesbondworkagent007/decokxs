package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.google.android.material.tabs.TabLayout;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ok_app.api.bean.TabBean;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$1;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$2;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$3;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$setupTabs$3;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1;
import com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$switchToLiteSubMode$1;
import com.okinc.p2p.api.OtcExtraKeys;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC33240msi;
import o.C33160mrH;
import o.C59462zhW;
import o.InterfaceC33171mrS;
import o.InterfaceC33233msb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33377mvM {
    public static final C33377mvM copydefault = new C33377mvM();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.mvL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33377mvM.copydefault();
        }
    });
    public static final int KWHzl = 8;

    private C33377mvM() {
    }

    public static final InterfaceC33233msb copydefault() {
        return (InterfaceC33233msb) C43251rlk.copydefault(InterfaceC33233msb.class);
    }

    public final InterfaceC33233msb EZpvd() {
        return (InterfaceC33233msb) EZpvd.getValue();
    }

    public final boolean OLrzqt() {
        boolean zEZpvd = C33431mwN.EZpvd.EZpvd();
        boolean zCopydefault = C33367mvC.copydefault();
        boolean zAEQbTJ = EZpvd().AEQbTJ();
        InterfaceC33233msb interfaceC33233msbEZpvd = EZpvd();
        AbstractC33240msi.LoaderManager loaderManager = AbstractC33240msi.LoaderManager.EZpvd;
        pUU.copydefault("LegacyAppModeSegmentView", "isLiteSubModeSwitcherEnabled: isLiteAvailable:" + zCopydefault + " and canSwitchLiteSubMode:" + zAEQbTJ + " and isSegmentViewAdaptableEnabled:" + zEZpvd + ", web3Enabled:" + interfaceC33233msbEZpvd.AEQbTJ(loaderManager));
        return C33367mvC.copydefault() && zEZpvd && !EZpvd().AEQbTJ(loaderManager) && EZpvd().AEQbTJ();
    }

    public final android.view.View copydefault(@NotNull android.content.Context context, @NotNull LifecycleOwner lifecycleOwner, @NotNull java.lang.String str, @NotNull Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function2, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        final C33301mtq c33301mtqEZpvd = C33301mtq.EZpvd(layoutInflaterFrom, null, false);
        Intrinsics.checkNotNullExpressionValue(c33301mtqEZpvd, "");
        C33367mvC.collectOnLifecycle$default(EZpvd().KWHzl(), lifecycleOwner, null, new LegacyAppModeSegmentView$createSegment$1(objectRef5, objectRef4, objectRef6, c33301mtqEZpvd, null), 2, null);
        StateFlow<java.lang.Integer> stateFlowIsConnected = ((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).isConnected();
        C59462zhW.Activity activity = C59462zhW.OLrzqt;
        C33367mvC.collectOnLifecycle$default(FlowKt.m7442debounceHG0u8IE(stateFlowIsConnected, C59519zia.AEQbTJ(900L, DurationUnit.MILLISECONDS)), lifecycleOwner, null, new LegacyAppModeSegmentView$createSegment$2(objectRef3, objectRef2, c33301mtqEZpvd, objectRef, null), 2, null);
        C33367mvC.KWHzl(lifecycleOwner, new LegacyAppModeSegmentView$createSegment$3(c33301mtqEZpvd, objectRef4, objectRef5, objectRef6, str, objectRef3, objectRef2, objectRef, lifecycleOwner, context, function2, null));
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$createSegment$4
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                super.onDestroy(lifecycleOwner2);
                c33301mtqEZpvd.copydefault.clearOnTabSelectedListeners();
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
        });
        ConstraintLayout root = c33301mtqEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: com.google.android.material.tabs.TabLayout$Tab */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: com.google.android.material.tabs.TabLayout$Tab */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: com.google.android.material.tabs.TabLayout$Tab */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: com.google.android.material.tabs.TabLayout$Tab */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: com.google.android.material.tabs.TabLayout$Tab */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: o.xgQ */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: o.xgQ */
    /* JADX DEBUG: Multi-variable search result rejected for r4v22, resolved type: o.xgQ */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: o.xgQ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    /* JADX WARN: Type inference failed for: r4v19, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
    /* JADX WARN: Type inference failed for: r9v8, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
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
    public static final void KWHzl(final C33301mtq c33301mtq, Ref.ObjectRef<TabLayout.Tab> objectRef, Ref.ObjectRef<TabLayout.Tab> objectRef2, Ref.ObjectRef<TabLayout.Tab> objectRef3, final java.lang.String str, final Ref.ObjectRef<TabLayout.Tab> objectRef4, final Ref.ObjectRef<TabLayout.Tab> objectRef5, Ref.ObjectRef<TabLayout.Tab> objectRef6, LifecycleOwner lifecycleOwner, android.content.Context context, Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
        TabLayout.Tab tab;
        ?? r0;
        TabLayout.Tab tab2;
        c33301mtq.copydefault.removeAllTabs();
        c33301mtq.copydefault.clearOnTabSelectedListeners();
        C33377mvM c33377mvM = copydefault;
        if (c33377mvM.OLrzqt()) {
            ?? NewTab = c33301mtq.copydefault.newTab();
            NewTab.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.AhwBna));
            C33165mrM c33165mrM = C33165mrM.EZpvd;
            NewTab.setId(C33379mvO.OLrzqt(c33165mrM));
            NewTab.setContentDescription("tradeSimpleModeOptionId");
            InterfaceC33233msb interfaceC33233msbEZpvd = c33377mvM.EZpvd();
            AbstractC33240msi.Activity activity = AbstractC33240msi.Activity.OLrzqt;
            if (interfaceC33233msbEZpvd.AEQbTJ(activity)) {
                c33301mtq.copydefault.addTab((TabLayout.Tab) NewTab, false);
            }
            ?? NewTab2 = c33301mtq.copydefault.newTab();
            NewTab2.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.KWHzl));
            NewTab2.setId(C33379mvO.copydefault(c33165mrM));
            NewTab2.setContentDescription("tradeAdvanceModeOptionId");
            InterfaceC33233msb interfaceC33233msbEZpvd2 = c33377mvM.EZpvd();
            AbstractC33240msi.ActionBar actionBar = AbstractC33240msi.ActionBar.EZpvd;
            if (interfaceC33233msbEZpvd2.AEQbTJ(actionBar)) {
                c33301mtq.copydefault.addTab((TabLayout.Tab) NewTab2, false);
            }
            ?? NewTab3 = c33301mtq.copydefault.newTab();
            NewTab3.setText(C33070mpX.AYXKKw(C33160mrH.TaskDescription.uzCIH));
            NewTab3.setId(C33379mvO.EZpvd(c33165mrM));
            NewTab3.setContentDescription("proPayModeOptionId");
            InterfaceC33233msb interfaceC33233msbEZpvd3 = c33377mvM.EZpvd();
            AbstractC33240msi.TaskDescription taskDescription = AbstractC33240msi.TaskDescription.OLrzqt;
            if (interfaceC33233msbEZpvd3.AEQbTJ(taskDescription)) {
                c33301mtq.copydefault.addTab((TabLayout.Tab) NewTab3, false);
            }
            objectRef.element = NewTab;
            objectRef2.element = NewTab2;
            objectRef3.element = NewTab3;
            AbstractC33240msi value = c33377mvM.EZpvd().KWHzl().getValue();
            if (Intrinsics.EZpvd(value, actionBar)) {
                tab2 = NewTab2;
            } else {
                tab2 = NewTab;
                if (!Intrinsics.EZpvd(value, activity)) {
                    tab2 = Intrinsics.EZpvd(value, taskDescription) ? NewTab3 : 0;
                }
            }
            if (tab2 != 0) {
                c33301mtq.copydefault.selectTab(tab2);
            }
        } else {
            InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
            if (interfaceC33171mrS != null) {
                interfaceC33171mrS.KWHzl(new Function1() { // from class: o.mvN
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C33377mvM.KWHzl(c33301mtq, objectRef5, objectRef4, str, (java.util.List) obj);
                    }
                });
            }
            C55249xgQ c55249xgQ = c33301mtq.copydefault;
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Web3Home")) {
                tab = objectRef4.element;
            } else {
                tab = objectRef5.element;
            }
            c55249xgQ.selectTab(tab);
            if (((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).isConnected().getValue().intValue() == 3) {
                r0 = objectRef4.element;
            } else {
                r0 = objectRef5.element;
            }
            c33301mtq.copydefault.selectTab(r0);
            objectRef6.element = r0;
        }
        C55249xgQ c55249xgQ2 = c33301mtq.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
        c33377mvM.copydefault(c55249xgQ2, lifecycleOwner, new LegacyAppModeSegmentView$createSegment$setupTabs$3(c33301mtq, context, null));
        c33301mtq.copydefault.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription(c33301mtq, lifecycleOwner, context, objectRef6, str, function2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: o.xgQ */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.google.android.material.tabs.TabLayout$Tab] */
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
    public static final Unit KWHzl(C33301mtq c33301mtq, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, java.lang.String str, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            TabBean tabBean = (TabBean) it.next();
            ?? NewTab = c33301mtq.copydefault.newTab();
            NewTab.setText(tabBean.getTabName());
            NewTab.setId(tabBean.getId());
            NewTab.setContentDescription(tabBean.getContentDescription());
            c33301mtq.copydefault.addTab(NewTab);
            int id = tabBean.getId();
            if (id == 0) {
                objectRef.element = NewTab;
            } else if (id == 1) {
                objectRef2.element = NewTab;
            }
        }
        if (C33366mvB.KWHzl.EZpvd() && !C33367mvC.djBIcL() && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "Web3Home")) {
            c33301mtq.copydefault.selectTab((TabLayout.Tab) objectRef.element);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.mvM$TaskDescription */
    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ Function2<java.lang.Integer, java.lang.Integer, Unit> AEQbTJ;
        public final /* synthetic */ C33301mtq EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ LifecycleOwner OLrzqt;
        public final /* synthetic */ Ref.ObjectRef<TabLayout.Tab> copydefault;
        public final /* synthetic */ java.lang.String valueOf;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(C33301mtq c33301mtq, LifecycleOwner lifecycleOwner, android.content.Context context, Ref.ObjectRef<TabLayout.Tab> objectRef, java.lang.String str, Function2<? super java.lang.Integer, ? super java.lang.Integer, Unit> function2) {
            this.EZpvd = c33301mtq;
            this.OLrzqt = lifecycleOwner;
            this.KWHzl = context;
            this.copydefault = objectRef;
            this.valueOf = str;
            this.AEQbTJ = function2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            ConstraintLayout root = this.EZpvd.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            if (root.getVisibility() == 0) {
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.OLrzqt), null, null, new LegacyAppModeSegmentView$createSegment$setupTabs$4$onTabSelected$1(tab, this.KWHzl, this.copydefault, this.valueOf, this.AEQbTJ, null), 3, null);
            }
        }
    }

    public final int copydefault(TabLayout.Tab tab) {
        java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getId()) : null;
        return (numValueOf != null && numValueOf.intValue() == 0) ? C33367mvC.copydefault() ? 2 : 1 : (numValueOf != null && numValueOf.intValue() == 1) ? 3 : 0;
    }

    public final java.lang.String AEQbTJ(TabLayout.Tab tab) {
        AbstractC33240msi abstractC33240msi;
        java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getId()) : null;
        C33165mrM c33165mrM = C33165mrM.EZpvd;
        int iOLrzqt = C33379mvO.OLrzqt(c33165mrM);
        if (numValueOf != null && numValueOf.intValue() == iOLrzqt) {
            abstractC33240msi = AbstractC33240msi.Activity.OLrzqt;
        } else {
            int iCopydefault = C33379mvO.copydefault(c33165mrM);
            if (numValueOf != null && numValueOf.intValue() == iCopydefault) {
                abstractC33240msi = AbstractC33240msi.ActionBar.EZpvd;
            } else {
                abstractC33240msi = (numValueOf != null && numValueOf.intValue() == C33379mvO.EZpvd(c33165mrM)) ? AbstractC33240msi.TaskDescription.OLrzqt : null;
            }
        }
        if (abstractC33240msi != null) {
            return abstractC33240msi.AEQbTJ();
        }
        return null;
    }

    public final boolean copydefault(android.content.Context context, java.lang.Integer num, final int i, java.lang.String str) {
        InterfaceC33171mrS interfaceC33171mrS = (InterfaceC33171mrS) C43251rlk.OLrzqt(InterfaceC33171mrS.class);
        if (interfaceC33171mrS == null) {
            return false;
        }
        if (num != null && num.intValue() == i) {
            return false;
        }
        boolean zSwitchToAppMode$default = InterfaceC33171mrS.Activity.switchToAppMode$default(interfaceC33171mrS, context, i, true, 0, null, null, 56, null);
        if (zSwitchToAppMode$default) {
            if (C33367mvC.copydefault()) {
                C32866mlf.onEvent$default("LiteHomepage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mvP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C33377mvM.EZpvd(i, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
            } else {
                C33405mvo.KWHzl.AEQbTJ(num != null ? C33250mss.EZpvd(num.intValue()) : null, C33250mss.EZpvd(i), str);
            }
        }
        return zSwitchToAppMode$default;
    }

    public static final Unit EZpvd(int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page", "top_nav", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, i == 3 ? "wallet" : "exchange", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, final java.lang.String str2, Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        LegacyAppModeSegmentView$switchToLiteSubMode$1 legacyAppModeSegmentView$switchToLiteSubMode$1;
        android.app.Activity activity;
        if (continuation instanceof LegacyAppModeSegmentView$switchToLiteSubMode$1) {
            legacyAppModeSegmentView$switchToLiteSubMode$1 = (LegacyAppModeSegmentView$switchToLiteSubMode$1) continuation;
            int i = legacyAppModeSegmentView$switchToLiteSubMode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                legacyAppModeSegmentView$switchToLiteSubMode$1.label = i - Integer.MIN_VALUE;
            } else {
                legacyAppModeSegmentView$switchToLiteSubMode$1 = new LegacyAppModeSegmentView$switchToLiteSubMode$1(this, continuation);
            }
        }
        LegacyAppModeSegmentView$switchToLiteSubMode$1 legacyAppModeSegmentView$switchToLiteSubMode$12 = legacyAppModeSegmentView$switchToLiteSubMode$1;
        java.lang.Object objSwitchLiteSubMode$default = legacyAppModeSegmentView$switchToLiteSubMode$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = legacyAppModeSegmentView$switchToLiteSubMode$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objSwitchLiteSubMode$default);
            if (str2 == null) {
                return C56443yFo.KWHzl(false);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) str2) && C33367mvC.copydefault()) {
                WeakReference weakReference = (WeakReference) CollectionsKt___CollectionsKt.wlaJM(C32979mnm.EZpvd.KWHzl());
                if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
                    return C56443yFo.KWHzl(false);
                }
                AbstractC33240msi abstractC33240msiKWHzl = AbstractC33240msi.Companion.KWHzl(str2);
                InterfaceC33233msb interfaceC33233msbEZpvd = EZpvd();
                legacyAppModeSegmentView$switchToLiteSubMode$12.L$0 = str2;
                legacyAppModeSegmentView$switchToLiteSubMode$12.label = 1;
                objSwitchLiteSubMode$default = InterfaceC33233msb.ActionBar.switchLiteSubMode$default(interfaceC33233msbEZpvd, abstractC33240msiKWHzl, activity, null, legacyAppModeSegmentView$switchToLiteSubMode$12, 4, null);
                if (objSwitchLiteSubMode$default == objCopydefault) {
                    return objCopydefault;
                }
            }
            return C56443yFo.KWHzl(false);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (java.lang.String) legacyAppModeSegmentView$switchToLiteSubMode$12.L$0;
        C56391yDq.AEQbTJ(objSwitchLiteSubMode$default);
        boolean zBooleanValue = ((java.lang.Boolean) objSwitchLiteSubMode$default).booleanValue();
        if (zBooleanValue) {
            C32866mlf.onEvent$default("LiteHomepage_AppMode_Navigator_Click", (TrackChannel[]) null, new Function1() { // from class: o.mvJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33377mvM.copydefault(str2, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return C56443yFo.KWHzl(zBooleanValue);
    }

    public static final Unit copydefault(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "page", "top_nav", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull final TabLayout tabLayout, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final Function2<? super java.lang.Integer, ? super Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(tabLayout, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function2, "");
        android.view.View childAt = tabLayout.getChildAt(0);
        final android.view.ViewGroup viewGroup = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (final int i = 0; i < childCount; i++) {
            android.view.View childAt2 = viewGroup.getChildAt(i);
            childAt2.setOnTouchListener(null);
            childAt2.setOnTouchListener(new View.OnTouchListener() { // from class: o.mvK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                    return C33377mvM.KWHzl(tabLayout, lifecycleOwner, i, function2, view, motionEvent);
                }
            });
        }
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.okinc.core.ok_app.modeswitch.liteSubMode.LegacyAppModeSegmentView$setTabSelectionInterceptor$2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner lifecycleOwner2) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "");
                super.onDestroy(lifecycleOwner2);
                int childCount2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    viewGroup.getChildAt(i2).setOnTouchListener(null);
                }
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
        });
    }

    public static final boolean KWHzl(TabLayout tabLayout, LifecycleOwner lifecycleOwner, int i, Function2 function2, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !tabLayout.isShown()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new LegacyAppModeSegmentView$setTabSelectionInterceptor$1$1(tabLayout, i, function2, view, null), 3, null);
        return true;
    }
}

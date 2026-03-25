package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.PointerIconCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputEditText;
import com.google.gson.Gson;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C23274hvD;
import o.C25655jBl;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25777jFz extends wXX implements InterfaceC25660jBq {
    public Function0<Unit> OLrzqt;
    public C23392hxP copydefault;
    public CommonGroupUiModel gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public java.util.List<CommonGroupUiModel> KWHzl = yDY.AhwBna();
    public java.lang.String AhwBna = "";
    public java.util.List<C25642jAz> EZpvd = yDY.AhwBna();
    public final Gson AYXKKw = new Gson();

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    /* JADX INFO: renamed from: o.jFz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jFz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C25777jFz KWHzl(@NotNull java.util.List<CommonGroupUiModel> list, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C25777jFz c25777jFz = new C25777jFz();
            c25777jFz.KWHzl = list;
            c25777jFz.OLrzqt = function0;
            return c25777jFz;
        }
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(false);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C23274hvD.Fragment.isReflectionWorking));
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.copydefault = C23392hxP.OLrzqt(getCustomLayoutInflater(), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        KWHzl();
    }

    private final void KWHzl() {
        OLrzqt(yDY.gEmmrt(new MarketChainBean("501", "Solana", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 0, (java.lang.String) null, false, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), new MarketChainBean("1", "EVM", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, 0, (java.lang.String) null, false, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null)), "501");
        OLrzqt();
        copydefault();
        AEQbTJ();
    }

    public final void OLrzqt() {
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP != null) {
            TextInputEditText textInputEditText = c23392hxP.copydefault;
            Intrinsics.checkNotNullExpressionValue(textInputEditText, "");
            C33606mzd.AEQbTJ(textInputEditText, new Function1() { // from class: o.jFw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C25777jFz.copydefault(this.OLrzqt, (java.lang.CharSequence) obj);
                }
            });
            android.widget.ImageView imageView = c23392hxP.KWHzl;
            imageView.setOnClickListener(new Application(imageView, 1000L, this));
        }
    }

    public static final Unit copydefault(C25777jFz c25777jFz, java.lang.CharSequence charSequence) {
        c25777jFz.djBIcL(java.lang.String.valueOf(charSequence));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna() {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.onNavigationEvent);
        viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.invokespecialhlXVux);
        viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.fBE, new View.OnClickListener() { // from class: o.jFy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25777jFz.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void djBIcL(java.lang.String str) {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        wYF wyf2;
        C52794wYp c52794wYpCopydefault2;
        wYF wyf3;
        C52794wYp c52794wYpCopydefault3;
        if (str.length() == 0) {
            KWHzl((java.lang.String) null);
            C23392hxP c23392hxP = this.copydefault;
            if (c23392hxP == null || (wyf3 = c23392hxP.OLrzqt) == null || (c52794wYpCopydefault3 = wyf3.copydefault()) == null) {
                return;
            }
            c52794wYpCopydefault3.setEnabled(false);
            return;
        }
        java.util.List<C25642jAz> listCopydefault = copydefault(str);
        this.EZpvd = listCopydefault;
        if (listCopydefault.isEmpty()) {
            KWHzl(C33070mpX.AYXKKw(C23274hvD.Fragment.OnBackPressedDispatcherOnBackPressedCancellable));
            C23392hxP c23392hxP2 = this.copydefault;
            if (c23392hxP2 == null || (wyf2 = c23392hxP2.OLrzqt) == null || (c52794wYpCopydefault2 = wyf2.copydefault()) == null) {
                return;
            }
            c52794wYpCopydefault2.setEnabled(false);
            return;
        }
        KWHzl((java.lang.String) null);
        C23392hxP c23392hxP3 = this.copydefault;
        if (c23392hxP3 == null || (wyf = c23392hxP3.OLrzqt) == null || (c52794wYpCopydefault = wyf.copydefault()) == null) {
            return;
        }
        c52794wYpCopydefault.setEnabled(this.gEmmrt != null);
    }

    public final void KWHzl(java.lang.String str) {
        C23392hxP c23392hxP;
        android.content.Context context = getContext();
        if (context == null || (c23392hxP = this.copydefault) == null) {
            return;
        }
        if (str == null) {
            c23392hxP.gEmmrt.setTextColor(C25382ivf.KWHzl(context, C23274hvD.StateListAnimator.AxsJAY));
            c23392hxP.gEmmrt.setText(getString(C23274hvD.Fragment.invokespecialgBtXYZ));
        } else {
            c23392hxP.gEmmrt.setTextColor(C25382ivf.KWHzl(context, C23274hvD.StateListAnimator.EZpvd));
            c23392hxP.gEmmrt.setText(str);
        }
    }

    /* JADX INFO: renamed from: o.jFz$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C25777jFz EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C25777jFz c25777jFz) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c25777jFz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                jBN.copydefault.KWHzl(DexTrackEventParameter.AddressManagementButtonName.BULK_IMPORT);
                CommonGroupUiModel commonGroupUiModel = this.EZpvd.gEmmrt;
                jEH jeh = null;
                java.lang.Integer numValueOf = commonGroupUiModel != null ? java.lang.Integer.valueOf(commonGroupUiModel.KWHzl()) : null;
                if (numValueOf == null || !(!this.EZpvd.EZpvd.isEmpty())) {
                    return;
                }
                ActivityResultCaller parentFragment = this.EZpvd.getParentFragment();
                jEH jeh2 = parentFragment instanceof jEH ? (jEH) parentFragment : null;
                if (jeh2 == null) {
                    KeyEventDispatcher.Component activity = this.EZpvd.getActivity();
                    if (activity instanceof jEH) {
                        jeh = (jEH) activity;
                    }
                } else {
                    jeh = jeh2;
                }
                if (jeh != null) {
                    jeh.AEQbTJ(numValueOf.intValue(), this.EZpvd.EZpvd);
                }
                this.EZpvd.dismissAllowingStateLoss();
                Function0 function0 = this.EZpvd.OLrzqt;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jFz$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C25777jFz EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25777jFz c25777jFz) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c25777jFz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.jFz$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C25777jFz AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C25777jFz c25777jFz) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c25777jFz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    public final java.util.List<C25642jAz> copydefault(java.lang.String str) {
        java.util.List<C25642jAz> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) EZpvd(str), (java.lang.Iterable) AEQbTJ(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C25642jAz c25642jAz : listDjBIcL) {
            linkedHashMap.put(c25642jAz.copydefault(), c25642jAz);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedHashMap.values());
    }

    public final java.util.List<C25642jAz> AEQbTJ(java.lang.String str) {
        java.lang.Object next;
        try {
            jFC[] jfcArr = (jFC[]) this.AYXKKw.fromJson(C59442zhC.fJNWhG(str), jFC[].class);
            Intrinsics.copydefault(jfcArr);
            java.util.List<jFC> listAwvSrB = yDV.AwvSrB(jfcArr);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAwvSrB, 10));
            for (jFC jfc : listAwvSrB) {
                java.lang.String strAEQbTJ = C33129mqd.OLrzqt((java.lang.CharSequence) jfc.AEQbTJ()) ? jfc.AEQbTJ() : jfc.EZpvd();
                java.lang.String str2 = "";
                if (strAEQbTJ == null) {
                    strAEQbTJ = "";
                }
                java.lang.String strOLrzqt = jfc.OLrzqt();
                if (strOLrzqt != null) {
                    str2 = strOLrzqt;
                }
                arrayList.add(new C25642jAz(strAEQbTJ, str2));
            }
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C25642jAz c25642jAz = (C25642jAz) next;
                if (!AEQbTJ(c25642jAz.copydefault(), c25642jAz.KWHzl())) {
                    break;
                }
            }
            return ((C25642jAz) next) == null ? arrayList : yDY.AhwBna();
        } catch (java.lang.Exception unused) {
            return yDY.AhwBna();
        }
    }

    public final java.util.List<C25642jAz> EZpvd(java.lang.String str) {
        java.lang.String strSubstring;
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{",", "\n"}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listSplit$default) {
            if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) obj).toString().length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str2 : arrayList) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str2, AbstractJsonLexerKt.COLON, 0, false, 6, (java.lang.Object) null);
            java.lang.String string = "";
            if (iIndexOf$default == -1) {
                strSubstring = str2;
            } else {
                strSubstring = str2.substring(0, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
            if (iIndexOf$default != -1) {
                java.lang.String strSubstring2 = str2.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) strSubstring2).toString();
            }
            if (!AEQbTJ(strSubstring, string)) {
                return yDY.AhwBna();
            }
            arrayList2.add(new C25642jAz(strSubstring, string));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
    }

    public final boolean OLrzqt(java.lang.String str) {
        return str.length() == 0 || str.codePointCount(0, str.length()) <= 30;
    }

    public final boolean AEQbTJ(java.lang.String str, java.lang.String str2) {
        if (this.AhwBna.length() == 0 || !OLrzqt(str2)) {
            return false;
        }
        java.util.List listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(C33129mqd.valueOf(this.AhwBna)));
        InterfaceC9739bbK interfaceC9739bbKAhwBna = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).AhwBna();
        java.util.Iterator it = listEZpvd.iterator();
        while (it.hasNext()) {
            if (interfaceC9739bbKAhwBna.AEQbTJ(str, ((java.lang.Number) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    public final void EZpvd() {
        C55018xby c55018xby;
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP == null || (c55018xby = c23392hxP.AYXKKw) == null) {
            return;
        }
        c55018xby.setFragmentManager(getChildFragmentManager());
        if (this.KWHzl.size() > 1) {
            c55018xby.setBottomSheet(C25655jBl.StateListAnimator.newInstance$default(C25655jBl.Companion, new TrackerGroupSelectionParams(GroupSelectionMode.INDIVIDUAL, this.KWHzl, null, null, false, false, 28, null), null, 2, null));
        } else {
            c55018xby.setBottomSheet(null);
            c55018xby.setState(3);
        }
    }

    private final void OLrzqt(java.util.List<MarketChainBean> list, java.lang.String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.AhwBna = str;
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP != null) {
            C28055kNf c28055kNf = c23392hxP.AhwBna;
            c28055kNf.setSpanCount(2);
            c28055kNf.setCallback(new TaskDescription());
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (MarketChainBean marketChainBean : list) {
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                android.text.style.TextAppearanceSpan textAppearanceSpan = new android.text.style.TextAppearanceSpan(c28055kNf.getContext(), C52761wXj.LoaderManager.zuBGHE);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((java.lang.CharSequence) marketChainBean.getChainName());
                spannableStringBuilder.setSpan(textAppearanceSpan, length, spannableStringBuilder.length(), 17);
                arrayList.add(new C28060kNk(marketChainBean.getChainId(), null, new android.text.SpannedString(spannableStringBuilder), false, 10, null));
            }
            c28055kNf.setData(arrayList, str);
        }
    }

    /* JADX INFO: renamed from: o.jFz$TaskDescription */
    public final /* synthetic */ class TaskDescription implements InterfaceC28053kNd, InterfaceC56514yIe {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof InterfaceC28053kNd) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, C25777jFz.this, C25777jFz.class, "onNetworkChange", "onNetworkChange(Ljava/lang/String;)V", 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // o.InterfaceC28053kNd
        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C25777jFz.this.AhwBna(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AhwBna(java.lang.String str) {
        this.AhwBna = str;
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP != null) {
            djBIcL(java.lang.String.valueOf(c23392hxP.copydefault.getText()));
        }
    }

    public final void AEQbTJ() {
        wYF wyf;
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP == null || (wyf = c23392hxP.OLrzqt) == null) {
            return;
        }
        wyf.setType(14);
        wyf.setOKDSSize(52);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Activity(c52794wYpAEQbTJ, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
    }

    private final void OLrzqt(java.util.List<java.lang.String> list) {
        android.content.Context context;
        java.lang.String strJoinToString$default;
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP == null || (context = getContext()) == null) {
            return;
        }
        if (list.isEmpty()) {
            strJoinToString$default = context.getString(C23274hvD.Fragment.unregisterOnBackInvokedCallback);
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null);
        }
        Intrinsics.copydefault((java.lang.Object) strJoinToString$default);
        C55001xbh c55001xbhAkhnZx = c23392hxP.AYXKKw.AkhnZx();
        if (c55001xbhAkhnZx != null) {
            c55001xbhAkhnZx.setText(strJoinToString$default);
        }
    }

    public final void copydefault() {
        java.lang.Object next;
        java.util.Iterator<T> it = this.KWHzl.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CommonGroupUiModel) next).copydefault()) {
                    break;
                }
            }
        }
        CommonGroupUiModel commonGroupUiModel = (CommonGroupUiModel) next;
        this.gEmmrt = commonGroupUiModel;
        if (commonGroupUiModel == null) {
            OLrzqt(yDY.AhwBna());
        } else if (commonGroupUiModel != null) {
            OLrzqt(C56402yEa.EZpvd(commonGroupUiModel.EZpvd()));
        }
        EZpvd();
    }

    @Override // o.InterfaceC25660jBq
    public void EZpvd(@NotNull InterfaceC25657jBn interfaceC25657jBn, @NotNull TrackerGroupSelectionParams trackerGroupSelectionParams, @NotNull java.util.List<CommonGroupUiModel> list) {
        java.lang.Object next;
        TextInputEditText textInputEditText;
        Intrinsics.checkNotNullParameter(interfaceC25657jBn, "");
        Intrinsics.checkNotNullParameter(trackerGroupSelectionParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((CommonGroupUiModel) next).copydefault()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.gEmmrt = (CommonGroupUiModel) next;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((CommonGroupUiModel) obj).copydefault()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CommonGroupUiModel) it2.next()).EZpvd());
        }
        OLrzqt(arrayList2);
        EZpvd();
        C23392hxP c23392hxP = this.copydefault;
        if (c23392hxP == null || (textInputEditText = c23392hxP.copydefault) == null) {
            return;
        }
        djBIcL(java.lang.String.valueOf(textInputEditText.getText()));
    }
}

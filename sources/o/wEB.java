package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalTotalOrdersPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wEB extends AbstractC49945uyC<uQB, SignalTotalOrdersPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final int KWHzl = C48033uCm.Activity.dLBcXg;
    public float copydefault = 0.97f;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wEF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wEB.ejfBZ();
        }
    });

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.AbstractC49945uyC
    public boolean AkhnZx() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wEB.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final wEB AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            wEB web = new wEB();
            web.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("bot_item_data", str)));
            return web;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw ejfBZ() {
        return new C43316rmw();
    }

    private final C43316rmw fARcdN() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        getFieldNames();
        iwGUEr();
        fJNWhG();
    }

    private final void fJNWhG() {
        java.lang.String string;
        SignalTotalOrdersPresenter signalTotalOrdersPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("bot_item_data")) == null) {
            string = "";
        }
        signalTotalOrdersPresenterOLrzqt.AEQbTJ(string);
        OLrzqt().AEQbTJ();
    }

    private final void AuCTel() {
        fARcdN().register(DetailsData.class, new wNL());
        fARcdN().register(C57637ymF.class, new C57634ymC(new Function0() { // from class: o.wEG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wEB.fIwbmz();
            }
        }));
        values().KWHzl.setAdapter(fARcdN());
        values().KWHzl.setLayoutManager(new LinearLayoutManager(getActivity()));
        values().gEmmrt.setNestedScrollingEnabled(false);
    }

    public static final Unit fIwbmz() {
        return Unit.INSTANCE;
    }

    private final void getFieldNames() {
        AppCompatTextView appCompatTextView = values().AYXKKw;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        values().gEmmrt.KWHzl(new InterfaceC57900yrD() { // from class: o.wEE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                wEB.OLrzqt(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void OLrzqt(wEB web, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        web.OLrzqt().KWHzl();
    }

    private final void iwGUEr() {
        TradeLiveData<java.util.ArrayList<DetailsData>> tradeLiveDataEZpvd = OLrzqt().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.wEC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEB.EZpvd(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        OLrzqt().OLrzqt().AkhnZx().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wED
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEB.copydefault(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.wEz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEB.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit EZpvd(wEB web, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        if (C33129mqd.valueOf(C33129mqd.addS$default(java.lang.Integer.valueOf(web.fARcdN().getItemCount()), java.lang.Integer.valueOf(arrayList.size()), null, null, null, 14, null), 0)) {
            web.AEQbTJ(yDY.AhwBna());
            return Unit.INSTANCE;
        }
        if (!arrayList.isEmpty()) {
            if (web.OLrzqt().copydefault()) {
                web.AEQbTJ(arrayList);
                web.values().KWHzl.scrollToPosition(0);
            } else {
                C33064mpR.KWHzl(web.fARcdN(), arrayList);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wEB web, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            if (web.OLrzqt().copydefault()) {
                C55113xdn.showLoading$default(web.values().AhwBna, 0L, 1, null);
            }
        } else {
            web.values().AhwBna.copydefault();
            C33546myW c33546myW = web.values().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.finishStatus$default(c33546myW, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final wEB web, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(web.fARcdN().getItemCount()), 0)) {
            java.lang.String message = exc.getMessage();
            pUU.copydefault("SignalBotTotalOrdersDialog", "can't load more cause by " + (message != null ? message : ""));
        } else {
            C33546myW c33546myW = web.values().gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            c33546myW.setVisibility(8);
            android.widget.FrameLayout frameLayout = web.values().copydefault;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(0);
            android.widget.FrameLayout frameLayout2 = web.values().copydefault;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            java.lang.String message2 = exc.getMessage();
            C6980aZc.AEQbTJ(web, frameLayout2, "", message2 == null ? "" : message2, (16 & 8) != 0 ? null : C33070mpX.AYXKKw(C48033uCm.Fragment.OHqIaq), (16 & 16) != 0 ? C52761wXj.TaskDescription.getSerial : 0, (16 & 32) != 0 ? null : new Function0() { // from class: o.wEI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wEB.KWHzl(this.EZpvd);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(wEB web) {
        C33546myW c33546myW = web.values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        c33546myW.setVisibility(0);
        android.widget.FrameLayout frameLayout = web.values().copydefault;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        frameLayout.setVisibility(8);
        web.OLrzqt().AEQbTJ();
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.util.List<DetailsData> list) {
        C43316rmw c43316rmwFARcdN = fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C57636ymE.refreshDataOrEmpty$default(c43316rmwFARcdN, (android.content.Context) fragmentActivityRequireActivity, (java.util.List) list, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0.0f, 8, (java.lang.Object) null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ wEB KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, wEB web) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = web;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.OLrzqt().AEQbTJ();
            }
        }
    }
}

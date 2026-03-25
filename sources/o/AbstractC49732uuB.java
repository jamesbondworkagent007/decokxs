package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.LeverIntervalData;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import com.okinc.widget.dialog.view.CenterLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32113mPz;
import o.C49511upt;
import o.C54520xLl;
import o.C55001xbh;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.xKK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uuB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC49732uuB extends AbstractC49393unh {
    public boolean AwvSrB;
    public AbstractC49569uqy DbNXlk;
    public C52794wYp OcIXYQ;
    public C52794wYp QKVWgx;
    public android.widget.TextView QOLQEE;
    public boolean fIwbmz;
    public android.view.View fJNWhG;
    public Function1<? super android.content.Context, Unit> getNewProxyInstance;
    public Function1<? super android.content.Context, Unit> hDKMBd;
    public android.widget.CheckBox values;
    public Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> wlaJM;
    public ViewOnClickListenerC54939xaY zuBGHE;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;
    public final int fetchVPNInfo = 6;
    public java.lang.String sSMYrx = "";
    public java.lang.String zLjUOn = "";
    public java.lang.String isConnected = "";
    public final double ORxRYg = 3.0d;
    public final InterfaceC56387yDm AuCTelauCTel = C56392yDr.copydefault(new Function0() { // from class: o.uuG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49732uuB.fetchVPNInfo(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.uuD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49732uuB.copydefault();
        }
    });
    public final java.util.ArrayList<C49777uuu> zsXlph = new java.util.ArrayList<>();
    public final RecyclerView.OnScrollListener gHZMYf = new Application();
    public final xBM DTwDnp = new xBM();
    public final C56169xxj AuCTel = new C56169xxj();
    public final xBF uzCIH = new xBF();
    public final uBH getFieldNames = new uBH(new Function0() { // from class: o.uuE
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49732uuB.isConnected(this.AEQbTJ);
        }
    });
    public final uBH AxsJAY = new uBH(new Function0() { // from class: o.uuJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC49732uuB.AuCTel(this.copydefault);
        }
    });
    public final android.os.Handler AubY = new android.os.Handler();
    public final java.lang.Runnable AkhnZx = new java.lang.Runnable() { // from class: o.uuH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC49732uuB.valueOf(this.copydefault);
        }
    };

    /* JADX INFO: renamed from: o.uuB$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public abstract void AEQbTJ(@NotNull java.lang.String str);

    public final void DbNXlk(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super android.content.Context, Unit> function1) {
        this.getNewProxyInstance = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull AbstractC49569uqy abstractC49569uqy) {
        Intrinsics.checkNotNullParameter(abstractC49569uqy, "");
        this.DbNXlk = abstractC49569uqy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(Function1<? super android.content.Context, Unit> function1) {
        this.hDKMBd = function1;
    }

    public abstract void copydefault(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        this.wlaJM = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function2<java.lang.Boolean, java.lang.String, kotlin.Unit> */
    public final Function2<java.lang.Boolean, java.lang.String, Unit> ejfBZ() {
        return this.wlaJM;
    }

    public boolean fARcdN() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double fIwbmz() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fetchVPNInfo() {
        return this.isConnected;
    }

    public final AbstractC49569uqy isConnected() {
        AbstractC49569uqy abstractC49569uqy = this.DbNXlk;
        if (abstractC49569uqy != null) {
            return abstractC49569uqy;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String fJNWhG() {
        return (java.lang.String) this.AuCTelauCTel.getValue();
    }

    public static final java.lang.String fetchVPNInfo(AbstractC49732uuB abstractC49732uuB) {
        return abstractC49732uuB.getString(C55688xof.Application.ActivityResultCallerKtExternalSyntheticLambda0);
    }

    /* JADX INFO: renamed from: o.uuB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uuB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c1, code lost:
        
            if (r14.equals("SPOT") != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        
            if (r14.equals("MARGIN") != false) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
        
            r0 = EZpvd(r13, r14, r15, r16, r18, r19, r24, r28, r29);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC49732uuB AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, @NotNull java.lang.String str7, TradePositionManager.PositionItem positionItem, @NotNull java.lang.String str8, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, java.lang.String str9, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, java.lang.Boolean bool4, boolean z, @NotNull Function1<? super android.content.Context, Unit> function1, @NotNull Function1<? super android.content.Context, Unit> function12) {
            AbstractC49732uuB abstractC49732uuBEZpvd;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            java.lang.Boolean bool5 = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(bool, bool5)) {
                abstractC49732uuBEZpvd = copydefault(str2, str3, str6, str7, function1);
            } else if (Intrinsics.EZpvd(bool2, bool5)) {
                abstractC49732uuBEZpvd = EZpvd(str, str2, str7, function1);
            } else if (Intrinsics.EZpvd(bool4, bool5)) {
                abstractC49732uuBEZpvd = AEQbTJ(str, str2, str7, str6, function1);
            } else {
                switch (str2.hashCode()) {
                    case -2027980370:
                        break;
                    case 2552066:
                        break;
                    case 2558355:
                        if (str2.equals("SWAP")) {
                            abstractC49732uuBEZpvd = AEQbTJ(str, str3, str5 != null ? str5 : "net", str7, str8, positionItem, bool3, str9, function1);
                            break;
                        }
                        throw new java.lang.IllegalArgumentException("unsupported instType：" + str2);
                    case 214415088:
                        if (str2.equals("FUTURES")) {
                            abstractC49732uuBEZpvd = AEQbTJ(str, str3, str5 != null ? str5 : "net", str7, str8, positionItem, bool3, function1);
                            break;
                        }
                        throw new java.lang.IllegalArgumentException("unsupported instType：" + str2);
                    default:
                        throw new java.lang.IllegalArgumentException("unsupported instType：" + str2);
                }
            }
            abstractC49732uuBEZpvd.copydefault(function2);
            abstractC49732uuBEZpvd.OLrzqt(function12);
            return abstractC49732uuBEZpvd;
        }

        public final AbstractC49732uuB AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, TradePositionManager.PositionItem positionItem, java.lang.Boolean bool, Function1<? super android.content.Context, Unit> function1) {
            C49828uvs c49828uvsAEQbTJ = C49828uvs.Companion.AEQbTJ(str, str2, str3, str5, positionItem, bool, function1);
            AEQbTJ(str4, c49828uvsAEQbTJ);
            return c49828uvsAEQbTJ;
        }

        public final AbstractC49732uuB AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, TradePositionManager.PositionItem positionItem, java.lang.Boolean bool, java.lang.String str6, Function1<? super android.content.Context, Unit> function1) {
            C49828uvs c49828uvsAEQbTJ = C49828uvs.Companion.AEQbTJ(str, str2, str3, str5, positionItem, bool, str6, function1);
            AEQbTJ(str4, c49828uvsAEQbTJ);
            return c49828uvsAEQbTJ;
        }

        public final AbstractC49732uuB EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.Boolean bool, boolean z, Function1<? super android.content.Context, Unit> function1) {
            C49841uwE c49841uwEEZpvd = C49841uwE.Companion.EZpvd(str, str2, str3, str4, str5, bool, z, function1);
            AEQbTJ(str6, c49841uwEEZpvd);
            return c49841uwEEZpvd;
        }

        public final AbstractC49732uuB copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1<? super android.content.Context, Unit> function1) {
            C49755uuY c49755uuYCopydefault = C49755uuY.Companion.copydefault(str, str2, str3, function1);
            AEQbTJ(str4, c49755uuYCopydefault);
            return c49755uuYCopydefault;
        }

        public final AbstractC49732uuB EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, Function1<? super android.content.Context, Unit> function1) {
            C49883uwu c49883uwuCopydefault = C49883uwu.Companion.copydefault(str, str2, function1);
            AEQbTJ(str3, c49883uwuCopydefault);
            return c49883uwuCopydefault;
        }

        public static /* synthetic */ AbstractC49732uuB newBorrowedCoinInstance$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                str4 = "";
            }
            return stateListAnimator.AEQbTJ(str, str2, str3, str4, function1);
        }

        public final AbstractC49732uuB AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, Function1<? super android.content.Context, Unit> function1) {
            C49472upG c49472upGCopydefault = C49472upG.Companion.copydefault(str, str2, str4, str3, function1);
            AEQbTJ(str3, c49472upGCopydefault);
            return c49472upGCopydefault;
        }

        public final void AEQbTJ(java.lang.String str, AbstractC49732uuB abstractC49732uuB) {
            android.os.Bundle arguments = abstractC49732uuB.getArguments();
            if (arguments == null) {
                arguments = new android.os.Bundle();
                abstractC49732uuB.setArguments(arguments);
            }
            arguments.putString("currentLeverage", str);
        }
    }

    public final C43316rmw values() {
        return (C43316rmw) this.iwGUEr.getValue();
    }

    public static final C43316rmw copydefault() {
        return new C43316rmw();
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        C54797xVr c54797xVr = C54797xVr.copydefault;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("currentLeverage")) == null) {
            string = "";
        }
        this.isConnected = C54797xVr.getCorrectShowLeverage$default(c54797xVr, string, false, null, false, 14, null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        wxq.KWHzl().setVisibility(0);
        wxq.setGravity(3);
        java.lang.String string = getString(C49511upt.Activity.gEmmrt);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.uuA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC49732uuB.AYXKKw(this.KWHzl, view);
            }
        });
    }

    public static final void AYXKKw(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        abstractC49732uuB.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        KWHzl((AbstractC49569uqy) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.EZpvd, constraintLayout, true));
    }

    /* JADX INFO: renamed from: o.uuB$Application */
    public static final class Application extends RecyclerView.OnScrollListener {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                RecyclerView.LayoutManager layoutManager = AbstractC49732uuB.this.isConnected().zuBGHE.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    AbstractC49732uuB.this.OLrzqt(linearLayoutManager, false);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xbh.ActionBar.copy$default(o.xbh$ActionBar, int, int, int, int, java.lang.Object):o.xbh$ActionBar */
    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL(this.isConnected);
        C55001xbh c55001xbh = isConnected().values;
        c55001xbh.setShowThousandsSeparator(true);
        c55001xbh.addTextChangedListener(this.getFieldNames);
        c55001xbh.addTextChangedListener(this.AxsJAY);
        c55001xbh.setModel(C55001xbh.ActionBar.copy$default(c55001xbh.DbNXlk(), 0, 0, 2, 3, null));
        copydefault(false);
        if (getActivity() != null) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getActivity()).inflate(C49511upt.StateListAnimator.gEmmrt, (android.view.ViewGroup) null);
            this.fJNWhG = viewInflate;
            this.QOLQEE = viewInflate != null ? (android.widget.TextView) viewInflate.findViewById(C49511upt.Application.DUUtXg) : null;
            android.view.View view2 = this.fJNWhG;
            this.values = view2 != null ? (android.widget.CheckBox) view2.findViewById(C49511upt.Application.ejfBZ) : null;
            android.view.View view3 = this.fJNWhG;
            this.QKVWgx = view3 != null ? (C52794wYp) view3.findViewById(C49511upt.Application.DGUQLIekVPG) : null;
            android.view.View view4 = this.fJNWhG;
            this.OcIXYQ = view4 != null ? (C52794wYp) view4.findViewById(C49511upt.Application.getPriority) : null;
            C52794wYp c52794wYp = this.QKVWgx;
            if (c52794wYp != null) {
                c52794wYp.setVisibility(8);
            }
            C52794wYp c52794wYp2 = this.OcIXYQ;
            if (c52794wYp2 != null) {
                c52794wYp2.setVisibility(8);
            }
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(getResources().getString(C49511upt.Activity.flVtFt));
            android.view.View view5 = this.fJNWhG;
            Intrinsics.copydefault(view5);
            ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, view5, 0, 2, null);
            this.zuBGHE = viewOnClickListenerC54939xaY;
            viewOnClickListenerC54939xaY.OLrzqt(C49511upt.Activity.getFieldNames, new View.OnClickListener() { // from class: o.uuy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    AbstractC49732uuB.gEmmrt(this.AEQbTJ, view6);
                }
            });
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = this.zuBGHE;
            if (viewOnClickListenerC54939xaY2 != null) {
                viewOnClickListenerC54939xaY2.EZpvd(C49511upt.Activity.iwGUEr, new View.OnClickListener() { // from class: o.uuz
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view6) {
                        AbstractC49732uuB.AhwBna(this.OLrzqt, view6);
                    }
                });
            }
            android.widget.CheckBox checkBox = this.values;
            if (checkBox != null) {
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.uuL
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                        AbstractC49732uuB.copydefault(compoundButton, z);
                    }
                });
            }
        }
        isConnected().gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.uuN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view6) {
                AbstractC49732uuB.values(this.copydefault, view6);
            }
        });
        android.content.Context context = getContext();
        if (context != null) {
            isConnected().zuBGHE.setLayoutManager(new CenterLayoutManager(context, 0, false));
            values().register(C49777uuu.class, new C49776uut(new Function2() { // from class: o.uuP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AbstractC49732uuB.KWHzl(this.KWHzl, (C49777uuu) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            }));
            isConnected().zuBGHE.setAdapter(values());
            isConnected().dNCPSb.setOnClickListener(new View.OnClickListener() { // from class: o.uuU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    AbstractC49732uuB.DbNXlk(this.copydefault, view6);
                }
            });
            if (this.zsXlph.size() > this.fetchVPNInfo) {
                isConnected().zuBGHE.addOnScrollListener(this.gHZMYf);
            } else {
                isConnected().dNCPSb.setVisibility(8);
                isConnected().zuBGHE.removeOnScrollListener(this.gHZMYf);
            }
            isConnected();
        }
        OKReminder oKReminder = isConnected().QbewEr;
        oKReminder.setStyle(2);
        oKReminder.setCloseIconVisibility(true);
        oKReminder.setOnCloseIconCallback(new Function0() { // from class: o.uuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC49732uuB.DbNXlk(this.EZpvd);
            }
        });
        oKReminder.setPrimaryAction(C33070mpX.AYXKKw(C49511upt.Activity.copydefault), new Function0() { // from class: o.uuT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC49732uuB.AkhnZx(this.AEQbTJ);
            }
        });
        isConnected().fIwbmz.setOnClickListener(new View.OnClickListener() { // from class: o.uuS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view6) {
                AbstractC49732uuB.isConnected(this.OLrzqt, view6);
            }
        });
        isConnected().AuCTel.setOnClickListener(new View.OnClickListener() { // from class: o.uuR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view6) {
                AbstractC49732uuB.AkhnZx(this.copydefault, view6);
            }
        });
        android.widget.TextView textView = isConnected().RJOkX;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(fARcdN() ? 0 : 8);
        hDKMBd();
        copydefault(false, "--");
    }

    public static final void gEmmrt(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        C32866mlf.onEvent$default("app_marginreset_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = abstractC49732uuB.zuBGHE;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xVr.getCorrectShowLeverage$default(o.xVr, java.lang.String, boolean, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public static final void AhwBna(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        abstractC49732uuB.AEQbTJ(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, abstractC49732uuB.isConnected, false, null, false, 14, null));
        abstractC49732uuB.EZpvd(C33129mqd.gEmmrt(abstractC49732uuB.isConnected), C33129mqd.gEmmrt(java.lang.Double.valueOf(abstractC49732uuB.ORxRYg)));
        Intrinsics.copydefault(view);
        C49402unq.copydefault(view, "set_leverage", C56424yEw.AYXKKw(C56390yDp.OLrzqt("currentLeverage", abstractC49732uuB.isConnected)), new java.lang.Class[0]);
        C32866mlf.onEvent$default("app_marginstill_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = abstractC49732uuB.zuBGHE;
        if (viewOnClickListenerC54939xaY != null) {
            viewOnClickListenerC54939xaY.dismiss();
        }
    }

    public static final void copydefault(android.widget.CompoundButton compoundButton, boolean z) {
        SPUtils.put("adjust_lever_risk_remind", java.lang.Boolean.valueOf(z));
    }

    public static final void values(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        abstractC49732uuB.valueOf();
    }

    public static final Unit KWHzl(AbstractC49732uuB abstractC49732uuB, C49777uuu c49777uuu, boolean z) {
        Intrinsics.checkNotNullParameter(c49777uuu, "");
        RecyclerView.LayoutManager layoutManager = abstractC49732uuB.isConnected().zuBGHE.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            abstractC49732uuB.OLrzqt(linearLayoutManager, true);
        }
        if (z) {
            abstractC49732uuB.isConnected().values.removeTextChangedListener(abstractC49732uuB.AxsJAY);
            abstractC49732uuB.OLrzqt(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, c49777uuu.AEQbTJ(), false, null, false, 14, null));
            abstractC49732uuB.isConnected().values.addTextChangedListener(abstractC49732uuB.AxsJAY);
            android.widget.TextView textView = abstractC49732uuB.isConnected().isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
        }
        abstractC49732uuB.isConnected().QbewEr.setVisibility(8);
        abstractC49732uuB.AhwBna("leverage_bar");
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        abstractC49732uuB.isConnected().zuBGHE.smoothScrollToPosition(abstractC49732uuB.zsXlph.size() - 1);
    }

    public static final Unit DbNXlk(AbstractC49732uuB abstractC49732uuB) {
        abstractC49732uuB.isConnected().QbewEr.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(AbstractC49732uuB abstractC49732uuB) {
        FragmentActivity activity = abstractC49732uuB.getActivity();
        if (activity != null) {
            Function1<? super android.content.Context, Unit> function1 = abstractC49732uuB.hDKMBd;
            if (function1 != null) {
                function1.invoke(activity);
            }
            C32866mlf.onEvent$default("MarginTradePage_ProMarginWarningSheet_Errorscreen_Click", (TrackChannel[]) null, new Function1() { // from class: o.uuM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC49732uuB.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "get_higher_leverage", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void isConnected(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        java.lang.String strSubS$default = C33129mqd.subS$default(abstractC49732uuB.isConnected().values.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        if (C33129mqd.gEmmrt(strSubS$default, abstractC49732uuB.sSMYrx)) {
            return;
        }
        abstractC49732uuB.isConnected().values.setPlainNumericText(strSubS$default);
        abstractC49732uuB.AhwBna("add_or_minus");
    }

    public static final void AkhnZx(AbstractC49732uuB abstractC49732uuB, android.view.View view) {
        java.lang.String strAddS$default = C33129mqd.addS$default(abstractC49732uuB.isConnected().values.isConnected(), 1, 2, java.lang.Boolean.FALSE, null, 8, null);
        if (C33129mqd.AEQbTJ(strAddS$default, abstractC49732uuB.zLjUOn)) {
            abstractC49732uuB.EZpvd();
        } else {
            abstractC49732uuB.isConnected().values.setPlainNumericText(strAddS$default);
            abstractC49732uuB.AhwBna("add_or_minus");
        }
    }

    private final void EZpvd() {
        if (this.fIwbmz) {
            isConnected().QbewEr.setVisibility(0);
        }
    }

    public final void copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Function1<? super android.content.Context, Unit> function1 = this.getNewProxyInstance;
        if (function1 != null) {
            function1.invoke(context);
        }
    }

    public void hDKMBd() {
        android.widget.TextView textView = isConnected().QVAiDq;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }

    public void OLrzqt(java.lang.Boolean bool) {
        android.widget.TextView textView = isConnected().QUSxYX;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((bool == null || !bool.booleanValue()) ? 8 : 0);
    }

    public static /* synthetic */ void refreshLeverage$default(AbstractC49732uuB abstractC49732uuB, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshLeverage");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        abstractC49732uuB.AYXKKw(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(java.lang.String str) {
        java.lang.String instFamily;
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                java.lang.String string = arguments.getString("instType", "");
                Intrinsics.checkNotNullExpressionValue(string, "");
                BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, string, arguments.getString("instId", ""), null, null, 12, null);
                instFamily = suggestedInstrument$default != null ? suggestedInstrument$default.getInstFamily() : null;
            }
            C56111xwe c56111xwe = new C56111xwe();
            c56111xwe.observe(this, new TaskDescription(new Function1() { // from class: o.uuF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC49732uuB.gEmmrt(this.OLrzqt, (java.util.List) obj);
                }
            }));
            xBF xbf = this.uzCIH;
            xbf.AEQbTJ(c56111xwe);
            java.lang.String string2 = arguments.getString("marginModel", "");
            xVE xve = xVE.copydefault;
            java.lang.String string3 = arguments.getString("instType", "");
            Intrinsics.checkNotNullExpressionValue(string3, "");
            java.lang.String strEZpvd = xve.EZpvd(string3);
            if (C54794xVo.copydefault.EZpvd() && Intrinsics.EZpvd((java.lang.Object) string2, (java.lang.Object) "cross") && (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "SPOT") || Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) "MARGIN"))) {
                xbf.KWHzl((java.lang.String) null);
                xbf.AEQbTJ((java.lang.String) null);
            } else {
                xbf.KWHzl(arguments.getString("instId", ""));
                xbf.AEQbTJ(instFamily);
            }
            xbf.EZpvd(strEZpvd);
            xbf.OLrzqt(string2);
            xbf.copydefault(str);
            xKK.Activity.execute$default(xbf, 0L, 1, null);
        }
    }

    public static final Unit gEmmrt(AbstractC49732uuB abstractC49732uuB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        LeverIntervalData leverIntervalData = C33129mqd.KWHzl((java.util.Collection) list) ? (LeverIntervalData) list.get(0) : null;
        if (leverIntervalData != null) {
            abstractC49732uuB.EZpvd("", leverIntervalData.getMinLevel(), leverIntervalData.getMaxLevel());
            abstractC49732uuB.fIwbmz = leverIntervalData.isBeyondMax() == 1;
            try {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) leverIntervalData.getPercents(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() != 1 || !Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                    for (java.lang.Object obj : listSplit$default) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        java.lang.String str = (java.lang.String) obj;
                        arrayList.add(new C49777uuu(str + "x", str, C33129mqd.OLrzqt(str, abstractC49732uuB.fetchVPNInfo()), i));
                        i++;
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                        abstractC49732uuB.OLrzqt(arrayList);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    public final void valueOf(java.lang.String str) {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            C56111xwe c56111xwe = new C56111xwe();
            c56111xwe.observe(this, new TaskDescription(new Function1() { // from class: o.uuO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC49732uuB.EZpvd(this.AEQbTJ, (java.util.List) obj);
                }
            }));
            xBF xbf = this.uzCIH;
            xbf.AEQbTJ(c56111xwe);
            xbf.KWHzl((java.lang.String) null);
            java.lang.String string = arguments.getString("instType", "");
            xVE xve = xVE.copydefault;
            Intrinsics.copydefault((java.lang.Object) string);
            xbf.EZpvd(xve.EZpvd(string));
            xbf.OLrzqt("cross");
            xbf.copydefault(str);
            xKK.Activity.execute$default(xbf, 0L, 1, null);
        }
    }

    public static final Unit EZpvd(AbstractC49732uuB abstractC49732uuB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        int i = 0;
        LeverIntervalData leverIntervalData = C33129mqd.KWHzl((java.util.Collection) list) ? (LeverIntervalData) list.get(0) : null;
        if (leverIntervalData != null) {
            abstractC49732uuB.EZpvd("", leverIntervalData.getMinLevel(), leverIntervalData.getMaxLevel());
            abstractC49732uuB.fIwbmz = leverIntervalData.isBeyondMax() == 1;
            try {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) leverIntervalData.getPercents(), new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
                if (listSplit$default.size() != 1 || !Intrinsics.EZpvd(listSplit$default.get(0), (java.lang.Object) "")) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSplit$default, 10));
                    for (java.lang.Object obj : listSplit$default) {
                        if (i < 0) {
                            yDY.AYXKKw();
                        }
                        java.lang.String str = (java.lang.String) obj;
                        arrayList.add(new C49777uuu(str + "x", str, C33129mqd.OLrzqt(str, abstractC49732uuB.fetchVPNInfo()), i));
                        i++;
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
                        abstractC49732uuB.OLrzqt(arrayList);
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(LinearLayoutManager linearLayoutManager, boolean z) {
        java.lang.Object next;
        linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != this.zsXlph.size() - 1 && this.zsXlph.size() > this.fetchVPNInfo) {
            isConnected().dNCPSb.setVisibility(0);
        } else {
            isConnected().dNCPSb.setVisibility(8);
        }
        if (z) {
            java.util.Iterator<T> it = this.zsXlph.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((C49777uuu) next).KWHzl()) {
                        break;
                    }
                }
            }
            C49777uuu c49777uuu = (C49777uuu) next;
            int iCopydefault = c49777uuu != null ? c49777uuu.copydefault() : -1;
            if (iCopydefault == -1) {
                return;
            }
            isConnected().zuBGHE.smoothScrollToPosition(iCopydefault);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit isConnected(final AbstractC49732uuB abstractC49732uuB) {
        java.lang.String strIsConnected = abstractC49732uuB.isConnected().values.isConnected();
        java.lang.String str = "";
        if (strIsConnected == null || strIsConnected.length() == 0 || C33129mqd.AEQbTJ(strIsConnected) == AudioStats.AUDIO_AMPLITUDE_NONE) {
            strIsConnected = "";
        }
        if (abstractC49732uuB.zLjUOn.length() > 0 && C33129mqd.AEQbTJ(strIsConnected, abstractC49732uuB.zLjUOn)) {
            abstractC49732uuB.isConnected().values.postDelayed(new java.lang.Runnable() { // from class: o.uuC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC49732uuB.values(this.EZpvd);
                }
            }, 50L);
            abstractC49732uuB.EZpvd();
            return Unit.INSTANCE;
        }
        if (!abstractC49732uuB.AwvSrB) {
            abstractC49732uuB.isConnected().QbewEr.setVisibility(8);
        }
        abstractC49732uuB.AwvSrB = false;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strIsConnected)));
        if (C33129mqd.AEQbTJ(strGEmmrt) != C33129mqd.AEQbTJ(abstractC49732uuB.isConnected)) {
            if (abstractC49732uuB.sSMYrx.length() != 0 || abstractC49732uuB.zLjUOn.length() != 0) {
                abstractC49732uuB.DbNXlk(strGEmmrt);
                if (C33129mqd.subD$default(strGEmmrt, abstractC49732uuB.sSMYrx, null, null, null, 14, null) >= AudioStats.AUDIO_AMPLITUDE_NONE && C33129mqd.subD$default(strGEmmrt, abstractC49732uuB.zLjUOn, null, null, null, 14, null) <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                    str = strGEmmrt;
                }
                abstractC49732uuB.isConnected = str;
                if (!abstractC49732uuB.fIwbmz) {
                    abstractC49732uuB.isConnected().AuCTel.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(abstractC49732uuB.isConnected, 1, null, null, null, 14, null), abstractC49732uuB.zLjUOn));
                }
                abstractC49732uuB.isConnected().fIwbmz.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(abstractC49732uuB.isConnected, 1, null, null, null, 14, null), abstractC49732uuB.sSMYrx));
                abstractC49732uuB.copydefault(abstractC49732uuB.isConnected);
            }
        }
        return Unit.INSTANCE;
    }

    public static final void values(AbstractC49732uuB abstractC49732uuB) {
        abstractC49732uuB.AwvSrB = true;
        abstractC49732uuB.OLrzqt(C33129mqd.formatS$default(abstractC49732uuB.zLjUOn, null, null, null, 7, null));
    }

    public static final Unit AuCTel(AbstractC49732uuB abstractC49732uuB) {
        abstractC49732uuB.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void valueOf(AbstractC49732uuB abstractC49732uuB) {
        RecyclerView.LayoutManager layoutManager = abstractC49732uuB.isConnected().zuBGHE.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            abstractC49732uuB.OLrzqt(linearLayoutManager, true);
        }
    }

    public final void OLrzqt(@NotNull java.util.List<C49777uuu> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.zsXlph.clear();
        this.zsXlph.addAll(list);
        if (this.zsXlph.size() > this.fetchVPNInfo) {
            isConnected().zuBGHE.addOnScrollListener(this.gHZMYf);
        } else {
            isConnected().zuBGHE.removeOnScrollListener(this.gHZMYf);
            isConnected().dNCPSb.setVisibility(8);
        }
        C33064mpR.OLrzqt(values(), (java.util.List<? extends java.lang.Object>) this.zsXlph);
        this.AubY.removeCallbacks(this.AkhnZx);
        this.AubY.postDelayed(this.AkhnZx, 100L);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        isConnected().values.removeTextChangedListener(this.getFieldNames);
        isConnected().zuBGHE.removeOnScrollListener(this.gHZMYf);
        isConnected().values.removeTextChangedListener(this.AxsJAY);
        this.AubY.removeCallbacks(this.AkhnZx);
        super.onDestroyView();
        this.DTwDnp.AYXKKw();
        this.uzCIH.AYXKKw();
        this.AuCTel.AYXKKw();
    }

    public final C55249xgQ AkhnZx() {
        C55249xgQ c55249xgQ = isConnected().djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        return c55249xgQ;
    }

    public final void AuCTel() {
        isConnected().AYXKKw.setVisibility(8);
        isConnected().djBIcL.setVisibility(8);
        isConnected().QfsBiF.setVisibility(8);
        isConnected().DbNXlk.setVisibility(8);
        isConnected().getNewProxyInstance.setVisibility(8);
        isConnected().getFieldNames.setVisibility(8);
        isConnected().fJNWhG.setVisibility(8);
        isConnected().KWHzl.setVisibility(8);
        isConnected().gHZMYf.setVisibility(8);
        isConnected().QUSxYX.setVisibility(8);
    }

    public final void gEmmrt(java.lang.String str) {
        isConnected().djBIcL.setVisibility(8);
        isConnected().zLjUOn.setVisibility(8);
        isConnected().fJNWhG.setVisibility(8);
        isConnected().AYXKKw.setVisibility(8);
        isConnected().getNewProxyInstance.setVisibility(8);
        isConnected().KWHzl.setVisibility(8);
        isConnected().gHZMYf.setVisibility(8);
        isConnected().sSMYrx.setVisibility(0);
    }

    public final void OLrzqt(boolean z) {
        isConnected().AYXKKw.setVisibility(8);
        isConnected().djBIcL.setVisibility(8);
        isConnected().QfsBiF.setVisibility(8);
        isConnected().KWHzl.setVisibility(8);
        isConnected().gHZMYf.setVisibility(8);
        isConnected().fJNWhG.setVisibility(z ? 0 : 8);
    }

    public static /* synthetic */ void justShowMarginView$default(AbstractC49732uuB abstractC49732uuB, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: justShowMarginView");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        abstractC49732uuB.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        isConnected().AYXKKw.setVisibility(z ? 0 : 8);
        ConstraintLayout constraintLayout = isConnected().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z2 ^ true ? 0 : 8);
        C55249xgQ c55249xgQ = isConnected().djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        c55249xgQ.setVisibility(z ? 0 : 8);
        C55249xgQ c55249xgQ2 = isConnected().djBIcL;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
        c55249xgQ2.setVisibility((!z || z2) ? 8 : 0);
        isConnected().QfsBiF.setVisibility(8);
        isConnected().zLjUOn.setVisibility(8);
        isConnected().fJNWhG.setVisibility(8);
        isConnected().getNewProxyInstance.setVisibility(8);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C33129mqd.AEQbTJ(str3) > AudioStats.AUDIO_AMPLITUDE_NONE && (!Intrinsics.EZpvd((java.lang.Object) this.sSMYrx, (java.lang.Object) str2) || !Intrinsics.EZpvd((java.lang.Object) this.zLjUOn, (java.lang.Object) str3))) {
            C54797xVr c54797xVr = C54797xVr.copydefault;
            this.sSMYrx = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str2, false, null, false, 14, null);
            this.zLjUOn = C54797xVr.getCorrectShowLeverage$default(c54797xVr, str3, false, null, false, 14, null);
        }
        isConnected().AuCTel.setEnabled(C33129mqd.valueOf(C33129mqd.addS$default(this.isConnected, 1, null, null, null, 14, null), str3));
        isConnected().fIwbmz.setEnabled(C33129mqd.copydefault(C33129mqd.subS$default(this.isConnected, 1, null, null, null, 14, null), str2));
        isConnected().QbewEr.setMessage(C33069mpW.copydefault(this, C49511upt.Activity.OLrzqt, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("maxLeverage", str3 + "x"))));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uwS.getLeverShow$default(o.uwS, java.lang.String, boolean, int, java.lang.Object):java.lang.String */
    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().AkhnZx.setText(C49855uwS.getLeverShow$default(C49855uwS.copydefault, str, false, 2, null));
        OLrzqt(str);
    }

    private final void OLrzqt(java.lang.String str) {
        isConnected().values.setPlainNumericText(str);
    }

    public final void isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().AkhnZx.setText(C49855uwS.getLeverShow$default(C49855uwS.copydefault, str, false, 2, null));
    }

    public final void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = isConnected().DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? 0 : 8);
        isConnected().DbNXlk.setText(str);
    }

    public final java.lang.String DbNXlk() {
        return C33129mqd.gEmmrt(isConnected().DbNXlk.getText());
    }

    public final void EZpvd(boolean z) {
        isConnected().values.setEnabled(z);
        copydefault(z);
    }

    public final void copydefault(boolean z) {
        isConnected().gEmmrt.setEnabled(z);
    }

    public static /* synthetic */ void setMaxAdditionalAmt$default(AbstractC49732uuB abstractC49732uuB, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMaxAdditionalAmt");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC49732uuB.AEQbTJ(charSequence, charSequence2, z);
    }

    public final void AEQbTJ(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        isConnected().AuCTelauCTel.setText(charSequence);
        isConnected().zsXlph.setText(charSequence2);
        if (z) {
            android.widget.TextView textView = isConnected().AuCTelauCTel;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(charSequence.length() > 0 ? 0 : 8);
            android.widget.TextView textView2 = isConnected().zsXlph;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(charSequence2.length() > 0 ? 0 : 8);
        }
    }

    public final void KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        if (charSequence2.length() == 0) {
            isConnected().fJNWhG.setVisibility(8);
            return;
        }
        isConnected().fJNWhG.setVisibility(0);
        isConnected().uzCIH.setText(charSequence2);
        isConnected().ejfBZ.setText(charSequence);
    }

    public static /* synthetic */ void setRequiredMarginContract$default(AbstractC49732uuB abstractC49732uuB, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRequiredMarginContract");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC49732uuB.KWHzl(charSequence, charSequence2, z);
    }

    public final void KWHzl(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2, boolean z) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        isConnected().getFieldNames.setText(charSequence2);
        isConnected().iwGUEr.setText(charSequence);
        if (z) {
            android.widget.TextView textView = isConnected().iwGUEr;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(charSequence.length() > 0 ? 0 : 8);
            android.widget.TextView textView2 = isConnected().getFieldNames;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(charSequence2.length() > 0 ? 0 : 8);
        }
    }

    public final void copydefault(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        isConnected().AxsJAY.setText(charSequence);
    }

    public final void EZpvd(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        isConnected().copydefault.setText(charSequence2);
        isConnected().OLrzqt.setText(charSequence);
    }

    public final void OLrzqt(@NotNull java.lang.CharSequence charSequence, @NotNull java.lang.CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(charSequence2, "");
        isConnected().ORxRYg.setText(charSequence2);
        isConnected().OcIXYQ.setText(charSequence);
    }

    public final void values(java.lang.String str) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            android.widget.TextView textView = isConnected().isConnected;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            isConnected().isConnected.setText(str);
        }
    }

    public final void KWHzl(int i) {
        isConnected().wlaJM.setVisibility(i);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String string;
        java.lang.String string2;
        C54520xLl c54520xLl = C54520xLl.KWHzl;
        android.os.Bundle arguments = getArguments();
        java.lang.String str3 = (arguments == null || (string2 = arguments.getString("instId", "")) == null) ? "" : string2;
        android.os.Bundle arguments2 = getArguments();
        c54520xLl.AEQbTJ(new C54520xLl.Activity("user", Web3SecurityTrackEvent.VALUE_INPUT, "adjust_leverage", str3, (arguments2 == null || (string = arguments2.getString("instType", "")) == null) ? "" : string, C56424yEw.gEmmrt(C56390yDp.OLrzqt("input_leverage", C33129mqd.gEmmrt(str)), C56390yDp.OLrzqt("risk_leverage", C33129mqd.gEmmrt(str2)))));
    }

    public void valueOf() {
        C49402unq.OLrzqt("confirm_button", C56424yEw.gEmmrt(C56390yDp.OLrzqt("currentLeverage", C33129mqd.gEmmrt(this.isConnected)), C56390yDp.OLrzqt("tooLargeLeverage", C33129mqd.gEmmrt(java.lang.Double.valueOf(this.ORxRYg)))));
        AhwBna(Web3SecurityTrackEvent.VALUE_CONFIRM);
        if (C33129mqd.AEQbTJ(this.isConnected, java.lang.Double.valueOf(this.ORxRYg)) && !SPUtils.getBoolean("adjust_lever_risk_remind", false)) {
            android.content.res.Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            java.lang.String strCopydefault = C33069mpW.copydefault(resources, C49511upt.Activity.OqFWZa, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, this.isConnected)));
            java.lang.String str = this.isConnected;
            android.widget.TextView textView = this.QOLQEE;
            if (textView != null) {
                textView.setText(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{str}, 0, null, false, new Function1() { // from class: o.uuI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return AbstractC49732uuB.OLrzqt(this.EZpvd, (java.util.List) obj);
                    }
                }, 14, null));
            }
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = this.zuBGHE;
            if (viewOnClickListenerC54939xaY != null) {
                viewOnClickListenerC54939xaY.show();
            }
            C32866mlf.onEvent$default("app_marginriskpop_show", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            return;
        }
        EZpvd(C33129mqd.gEmmrt(this.isConnected), C33129mqd.gEmmrt(java.lang.Double.valueOf(this.ORxRYg)));
        AEQbTJ(C54797xVr.getCorrectShowLeverage$default(C54797xVr.copydefault, this.isConnected, false, null, false, 14, null));
    }

    public static final Unit OLrzqt(AbstractC49732uuB abstractC49732uuB, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(abstractC49732uuB.getContext(), C32113mPz.Dialog.wlaJM));
        return Unit.INSTANCE;
    }

    public final void AhwBna(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C32866mlf.onEvent$default("PlaceOrder_PopUp_AdjustLeverage_Click", (TrackChannel[]) null, new Function1() { // from class: o.uuK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC49732uuB.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        C32866mlf.onEvent$default("PlaceOrder_PopUp_AdjustLeveragePage_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public final void copydefault(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().QOLQEE.setVisibility(z ? 0 : 8);
        isConnected().QKVWgx.setText(str);
    }

    public final void EZpvd(@NotNull android.widget.EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "");
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        editText.postDelayed(new java.lang.Runnable() { // from class: o.uuQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC49732uuB.djBIcL(this.EZpvd);
            }
        }, 300L);
    }

    public static final void djBIcL(AbstractC49732uuB abstractC49732uuB) {
        try {
            java.lang.Object systemService = abstractC49732uuB.requireContext().getSystemService("input_method");
            Intrinsics.copydefault(systemService, "");
            ((android.view.inputmethod.InputMethodManager) systemService).toggleSoftInput(1, 2);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private final void OLrzqt() {
        for (C49777uuu c49777uuu : this.zsXlph) {
            c49777uuu.KWHzl(C33129mqd.OLrzqt(c49777uuu.AEQbTJ(), this.isConnected));
        }
        values().notifyDataSetChanged();
        RecyclerView.LayoutManager layoutManager = isConnected().zuBGHE.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            OLrzqt(linearLayoutManager, true);
        }
        android.widget.TextView textView = isConnected().isConnected;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
    }
}

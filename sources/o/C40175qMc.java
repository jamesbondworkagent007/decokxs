package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DeriConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import o.C40175qMc;
import o.InterfaceC55704xov;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qMc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C40175qMc extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public android.view.View AEQbTJ;
    public boolean AYXKKw;
    public android.view.View AhwBna;
    public int AkhnZx;
    public C42665rah DbNXlk;
    public C55379xio KWHzl;
    public Function1<? super java.lang.String, Unit> OLrzqt;
    public C55379xio copydefault;
    public C55379xio djBIcL;
    public C55379xio gEmmrt;
    public java.lang.String isConnected;
    public Function1<? super java.lang.String, Unit> values;
    public java.util.List<android.view.View> valueOf = new java.util.ArrayList();
    public java.lang.String fetchVPNInfo = "bizNAv";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(Function1<? super java.lang.String, Unit> function1) {
        this.values = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> */
    public final Function1<java.lang.String, Unit> OLrzqt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42665rah copydefault() {
        return this.DbNXlk;
    }

    /* JADX INFO: renamed from: o.qMc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qMc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qMc$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C40175qMc newInstance$default(TaskDescription taskDescription, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                function1 = null;
            }
            return taskDescription.OLrzqt(str, function1);
        }

        public final C40175qMc OLrzqt(java.lang.String str, Function1<? super java.lang.String, Unit> function1) {
            C40175qMc c40175qMc = new C40175qMc();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, str);
            c40175qMc.setArguments(bundle);
            c40175qMc.KWHzl(function1);
            return c40175qMc;
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        C52794wYp c52794wYp;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        C42665rah c42665rahEZpvd = C42665rah.EZpvd(getCustomLayoutInflater(), constraintLayout, true);
        this.DbNXlk = c42665rahEZpvd;
        if (c42665rahEZpvd != null && (c52794wYp = c42665rahEZpvd.copydefault) != null) {
            c52794wYp.setEnabled(false);
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onCreateHeader(c52781wYc);
        c52781wYc.setType(9);
        java.lang.String string = getString(qZH.PendingIntent.geAOna);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c52781wYc.setTitle(string);
        c52781wYc.setDividerVisibility(true);
        android.widget.TextView textViewAEQbTJ = c52781wYc.AEQbTJ();
        if (textViewAEQbTJ != null) {
            textViewAEQbTJ.setTextSize(16.0f);
        }
        setHeightRatio(0.95f);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        qLZ qlz;
        C52794wYp c52794wYp;
        C33542myS c33542myS;
        C42665rah c42665rah;
        C33542myS c33542myS2;
        C33542myS c33542myS3;
        C33542myS c33542myS4;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        booleanRef2.element = true;
        this.valueOf.clear();
        android.view.LayoutInflater layoutInflater = getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "");
        this.AhwBna = layoutInflater.inflate(qZH.ActionBar.UeEOUB, (android.view.ViewGroup) null);
        this.AEQbTJ = layoutInflater.inflate(qZH.ActionBar.RcXXUw, (android.view.ViewGroup) null);
        android.view.View view2 = this.AhwBna;
        this.djBIcL = view2 != null ? (C55379xio) view2.findViewById(qZH.StateListAnimator.iUnTnt) : null;
        android.view.View view3 = this.AhwBna;
        this.gEmmrt = view3 != null ? (C55379xio) view3.findViewById(qZH.StateListAnimator.DDjfYY) : null;
        android.view.View view4 = this.AEQbTJ;
        this.KWHzl = view4 != null ? (C55379xio) view4.findViewById(qZH.StateListAnimator.DcMfJKfwDlxl) : null;
        android.view.View view5 = this.AEQbTJ;
        this.copydefault = view5 != null ? (C55379xio) view5.findViewById(qZH.StateListAnimator.DcMfJKsuEgdN) : null;
        KWHzl();
        C55379xio c55379xio = this.djBIcL;
        if (c55379xio != null) {
            c55379xio.setVisibility(0);
        }
        C55379xio c55379xio2 = this.gEmmrt;
        if (c55379xio2 != null) {
            c55379xio2.setVisibility(8);
        }
        C55379xio c55379xio3 = this.KWHzl;
        if (c55379xio3 != null) {
            c55379xio3.setVisibility(8);
        }
        C55379xio c55379xio4 = this.copydefault;
        if (c55379xio4 != null) {
            c55379xio4.setVisibility(0);
        }
        android.view.View view6 = this.AEQbTJ;
        if (view6 != null) {
            this.valueOf.add(view6);
        }
        android.view.View view7 = this.AhwBna;
        if (view7 != null) {
            this.valueOf.add(view7);
        }
        android.content.Context context = getContext();
        if (context != null) {
            java.util.List<android.view.View> list = this.valueOf;
            Intrinsics.copydefault(list, "");
            qlz = new qLZ(context, (java.util.ArrayList) list);
        } else {
            qlz = null;
        }
        C42665rah c42665rah2 = this.DbNXlk;
        if (c42665rah2 != null && (c33542myS4 = c42665rah2.valueOf) != null) {
            c33542myS4.setAdapter(qlz);
        }
        C42665rah c42665rah3 = this.DbNXlk;
        if (c42665rah3 != null && (c33542myS3 = c42665rah3.valueOf) != null) {
            android.content.Context context2 = getContext();
            java.lang.Integer numValueOf = context2 != null ? java.lang.Integer.valueOf(C55298xhM.copydefault(2.0f, context2)) : null;
            Intrinsics.copydefault(numValueOf);
            c33542myS3.setPageMargin(numValueOf.intValue());
        }
        if (qlz != null && (c42665rah = this.DbNXlk) != null && (c33542myS2 = c42665rah.valueOf) != null) {
            c33542myS2.setOffscreenPageLimit(qlz.getCount());
        }
        C42665rah c42665rah4 = this.DbNXlk;
        if (c42665rah4 != null && (c33542myS = c42665rah4.valueOf) != null) {
            c33542myS.addOnPageChangeListener(new StateListAnimator(booleanRef, booleanRef2));
        }
        OLrzqt(true);
        C42665rah c42665rah5 = this.DbNXlk;
        if (c42665rah5 == null || (c52794wYp = c42665rah5.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new View.OnClickListener() { // from class: o.qMd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view8) {
                C40175qMc.KWHzl(booleanRef, booleanRef2, this, view8);
            }
        });
    }

    /* JADX INFO: renamed from: o.qMc$StateListAnimator */
    public static final class StateListAnimator implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ Ref.BooleanRef EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public StateListAnimator(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
            this.EZpvd = booleanRef;
            this.KWHzl = booleanRef2;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            android.widget.ImageView imageView;
            android.widget.ImageView imageView2;
            android.widget.ImageView imageView3;
            android.widget.ImageView imageView4;
            if (i == 0) {
                C55379xio c55379xio = C40175qMc.this.djBIcL;
                if (c55379xio != null) {
                    c55379xio.setVisibility(0);
                }
                C55379xio c55379xio2 = C40175qMc.this.gEmmrt;
                if (c55379xio2 != null) {
                    c55379xio2.setVisibility(8);
                }
                C55379xio c55379xio3 = C40175qMc.this.KWHzl;
                if (c55379xio3 != null) {
                    c55379xio3.setVisibility(8);
                }
                C55379xio c55379xio4 = C40175qMc.this.copydefault;
                if (c55379xio4 != null) {
                    c55379xio4.setVisibility(0);
                }
                C42665rah c42665rahCopydefault = C40175qMc.this.copydefault();
                if (c42665rahCopydefault != null && (imageView2 = c42665rahCopydefault.AEQbTJ) != null) {
                    imageView2.setImageResource(qZH.Activity.OLrzqt);
                }
                C42665rah c42665rahCopydefault2 = C40175qMc.this.copydefault();
                if (c42665rahCopydefault2 != null && (imageView = c42665rahCopydefault2.KWHzl) != null) {
                    imageView.setImageResource(qZH.Activity.copydefault);
                }
                this.EZpvd.element = false;
                this.KWHzl.element = true;
                return;
            }
            if (i != 1) {
                return;
            }
            C55379xio c55379xio5 = C40175qMc.this.djBIcL;
            if (c55379xio5 != null) {
                c55379xio5.setVisibility(8);
            }
            C55379xio c55379xio6 = C40175qMc.this.gEmmrt;
            if (c55379xio6 != null) {
                c55379xio6.setVisibility(0);
            }
            C55379xio c55379xio7 = C40175qMc.this.KWHzl;
            if (c55379xio7 != null) {
                c55379xio7.setVisibility(0);
            }
            C55379xio c55379xio8 = C40175qMc.this.copydefault;
            if (c55379xio8 != null) {
                c55379xio8.setVisibility(8);
            }
            C42665rah c42665rahCopydefault3 = C40175qMc.this.copydefault();
            if (c42665rahCopydefault3 != null && (imageView4 = c42665rahCopydefault3.AEQbTJ) != null) {
                imageView4.setImageResource(qZH.Activity.copydefault);
            }
            C42665rah c42665rahCopydefault4 = C40175qMc.this.copydefault();
            if (c42665rahCopydefault4 != null && (imageView3 = c42665rahCopydefault4.KWHzl) != null) {
                imageView3.setImageResource(qZH.Activity.OLrzqt);
            }
            this.EZpvd.element = true;
            this.KWHzl.element = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, C40175qMc c40175qMc, android.view.View view) {
        java.lang.String str;
        C56087xwG c56087xwGZLjUOn;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (booleanRef.element) {
            str = "coinNav";
        } else {
            str = booleanRef2.element ? "bizNAv" : 0;
        }
        objectRef.element = str;
        C32866mlf.onEvent$default("NavGuidance_Sheet_Confirm_Click", (TrackChannel[]) null, new Function1() { // from class: o.qMh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40175qMc.copydefault(objectRef, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c56087xwGZLjUOn = interfaceC54581xNrOLrzqt.zLjUOn()) == null) {
            return;
        }
        c56087xwGZLjUOn.OLrzqt("derivativesNavConfig", (java.lang.String) objectRef.element, c40175qMc.new Application());
    }

    public static final Unit copydefault(Ref.ObjectRef objectRef, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        T t = objectRef.element;
        if (t != 0) {
            EventParamsList.put$default(eventParamsList, "nav_type", Intrinsics.EZpvd((java.lang.Object) t, (java.lang.Object) "coinNav") ? OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK : "biz", false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qMc$Application */
    public static final class Application implements InterfaceC55701xos<java.util.List<? extends DeriConfigData>> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* synthetic */ void EZpvd(boolean z, java.util.List<? extends DeriConfigData> list, java.lang.Exception exc) {
            copydefault(z, (java.util.List<DeriConfigData>) list, exc);
        }

        public void copydefault(boolean z, java.util.List<DeriConfigData> list, java.lang.Exception exc) {
            java.lang.String derivativesNavConfig;
            DeriConfigData deriConfigData;
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                C40175qMc.this.AYXKKw = true;
                C40175qMc c40175qMc = C40175qMc.this;
                if (list == null || (deriConfigData = list.get(0)) == null || (derivativesNavConfig = deriConfigData.getDerivativesNavConfig()) == null) {
                    derivativesNavConfig = "bizNAv";
                }
                c40175qMc.fetchVPNInfo = derivativesNavConfig;
                boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) C40175qMc.this.fetchVPNInfo, (java.lang.Object) "coinNav");
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final C40175qMc c40175qMc2 = C40175qMc.this;
                final int i = zEZpvd ? 1 : 0;
                C32866mlf.AEQbTJ("app_navigate_setting_page_choose_click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.qMe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C40175qMc.Application.copydefault(c40175qMc2, i, (EventParamsList) obj);
                    }
                });
                Function1<java.lang.String, Unit> function1OLrzqt = C40175qMc.this.OLrzqt();
                if (function1OLrzqt != null) {
                    function1OLrzqt.invoke(C40175qMc.this.fetchVPNInfo);
                }
                C40175qMc.this.dismiss();
            }
        }

        public static final Unit copydefault(C40175qMc c40175qMc, int i, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            eventParamsList.put("view", java.lang.String.valueOf(c40175qMc.AkhnZx), true);
            eventParamsList.put("choice", java.lang.String.valueOf(i), true);
            return Unit.INSTANCE;
        }
    }

    public final void KWHzl() {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        if (C33492mxV.OLrzqt()) {
            string = getString(qZH.PendingIntent.gbIfDn);
            string2 = getString(qZH.PendingIntent.gVEiQJ);
            string3 = getString(qZH.PendingIntent.HrFqwD);
            string4 = getString(qZH.PendingIntent.nriSR);
        } else {
            string = getString(qZH.PendingIntent.fMBJsc);
            string2 = getString(qZH.PendingIntent.sVvuFk);
            string3 = getString(qZH.PendingIntent.DpxfQh);
            string4 = getString(qZH.PendingIntent.sEAkxl);
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (C38303pTu.KWHzl(locale)) {
            C55379xio c55379xio = this.djBIcL;
            if (c55379xio != null) {
                C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.EZpvd(this).EZpvd(string3);
                C5448Sc c5448ScAhwBna = C5448Sc.AhwBna(qZH.Activity.wlaJM);
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c5335NtEZpvd.OLrzqt((RX<?>) c5448ScAhwBna.EZpvd(new C5417Qx(C55298xhM.copydefault(13.5f, contextRequireContext)))).EZpvd((android.widget.ImageView) c55379xio);
            }
            C55379xio c55379xio2 = this.KWHzl;
            if (c55379xio2 != null) {
                C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd2 = Glide.EZpvd(this).EZpvd(string4);
                C5448Sc c5448ScAhwBna2 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                c5335NtEZpvd2.OLrzqt((RX<?>) c5448ScAhwBna2.EZpvd(new C5417Qx(C55298xhM.copydefault(13.5f, contextRequireContext2)))).EZpvd((android.widget.ImageView) c55379xio2);
            }
            C55379xio c55379xio3 = this.gEmmrt;
            if (c55379xio3 != null) {
                C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd3 = Glide.EZpvd(this).EZpvd(string);
                C5448Sc c5448ScAhwBna3 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
                android.content.Context contextRequireContext3 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "");
                c5335NtEZpvd3.OLrzqt((RX<?>) c5448ScAhwBna3.EZpvd(new C5417Qx(C55298xhM.copydefault(10.5f, contextRequireContext3)))).copydefault(qZH.Activity.wlaJM).EZpvd((android.widget.ImageView) c55379xio3);
            }
            C55379xio c55379xio4 = this.copydefault;
            if (c55379xio4 != null) {
                C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd4 = Glide.EZpvd(this).EZpvd(string2);
                C5448Sc c5448ScAhwBna4 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
                android.content.Context contextRequireContext4 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext4, "");
                c5335NtEZpvd4.OLrzqt((RX<?>) c5448ScAhwBna4.EZpvd(new C5417Qx(C55298xhM.copydefault(10.5f, contextRequireContext4)))).copydefault(qZH.Activity.wlaJM).EZpvd((android.widget.ImageView) c55379xio4);
                return;
            }
            return;
        }
        C55379xio c55379xio5 = this.djBIcL;
        if (c55379xio5 != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd5 = Glide.EZpvd(this).EZpvd(string3);
            C5448Sc c5448ScAhwBna5 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
            android.content.Context contextRequireContext5 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext5, "");
            c5335NtEZpvd5.OLrzqt((RX<?>) c5448ScAhwBna5.EZpvd(new C5417Qx(C55298xhM.KWHzl(13.5f, contextRequireContext5)))).EZpvd((android.widget.ImageView) c55379xio5);
        }
        C55379xio c55379xio6 = this.KWHzl;
        if (c55379xio6 != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd6 = Glide.EZpvd(this).EZpvd(string4);
            C5448Sc c5448ScAhwBna6 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
            android.content.Context contextRequireContext6 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext6, "");
            c5335NtEZpvd6.OLrzqt((RX<?>) c5448ScAhwBna6.EZpvd(new C5417Qx(C55298xhM.copydefault(13.5f, contextRequireContext6)))).EZpvd((android.widget.ImageView) c55379xio6);
        }
        C55379xio c55379xio7 = this.gEmmrt;
        if (c55379xio7 != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd7 = Glide.EZpvd(this).EZpvd(string);
            C5448Sc c5448ScAhwBna7 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
            android.content.Context contextRequireContext7 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext7, "");
            c5335NtEZpvd7.OLrzqt((RX<?>) c5448ScAhwBna7.EZpvd(new C5417Qx(C55298xhM.copydefault(10.5f, contextRequireContext7)))).copydefault(qZH.Activity.wlaJM).EZpvd((android.widget.ImageView) c55379xio7);
        }
        C55379xio c55379xio8 = this.copydefault;
        if (c55379xio8 != null) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd8 = Glide.EZpvd(this).EZpvd(string2);
            C5448Sc c5448ScAhwBna8 = C5448Sc.AhwBna(qZH.Activity.wlaJM);
            android.content.Context contextRequireContext8 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext8, "");
            c5335NtEZpvd8.OLrzqt((RX<?>) c5448ScAhwBna8.EZpvd(new C5417Qx(C55298xhM.copydefault(10.5f, contextRequireContext8)))).copydefault(qZH.Activity.wlaJM).EZpvd((android.widget.ImageView) c55379xio8);
        }
    }

    public final void OLrzqt(boolean z) {
        C52794wYp c52794wYp;
        C42665rah c42665rah = this.DbNXlk;
        if (c42665rah == null || (c52794wYp = c42665rah.copydefault) == null) {
            return;
        }
        c52794wYp.setEnabled(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        android.os.Bundle arguments = getArguments();
        this.AkhnZx = C33129mqd.AhwBna(java.lang.Integer.valueOf(C33129mqd.AhwBna(arguments != null ? arguments.getString(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER) : null) + 1));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.AEQbTJ("app_navigate_setting_page_view", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.qMg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40175qMc.OLrzqt(this.AEQbTJ, (EventParamsList) obj);
            }
        });
        C32866mlf.onEvent$default("NavGuidance_Sheet_ModeSelection_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C40175qMc c40175qMc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("view", java.lang.String.valueOf(c40175qMc.AkhnZx), true);
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        C56087xwG c56087xwGZLjUOn;
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        if (this.AYXKKw) {
            Function1<? super java.lang.String, Unit> function1 = this.OLrzqt;
            if (function1 != null) {
                function1.invoke(this.fetchVPNInfo);
            }
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null && (c56087xwGZLjUOn = interfaceC54581xNrOLrzqt.zLjUOn()) != null) {
                InterfaceC55704xov.ActionBar.setNavType$default(c56087xwGZLjUOn, "appShowTimes", null, new ActionBar(), 2, null);
            }
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX INFO: renamed from: o.qMc$ActionBar */
    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends DeriConfigData>> {
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends DeriConfigData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<DeriConfigData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<DeriConfigData> list, java.lang.Exception exc) {
            DeriConfigData deriConfigData;
            if (z && C33129mqd.KWHzl((java.util.Collection) list)) {
                C40175qMc.this.isConnected = (list == null || (deriConfigData = list.get(0)) == null) ? null : deriConfigData.getShowConfigTimes();
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                TrackChannel[] trackChannelArr = (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
                final C40175qMc c40175qMc = C40175qMc.this;
                C32866mlf.AEQbTJ("app_navigate_setting_page_close_click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.qMf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C40175qMc.ActionBar.copydefault(c40175qMc, (EventParamsList) obj);
                    }
                });
            }
        }

        public static final Unit copydefault(C40175qMc c40175qMc, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            java.lang.String str = c40175qMc.isConnected;
            if (str == null) {
                str = "-";
            }
            eventParamsList.put("view", str, true);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }
}

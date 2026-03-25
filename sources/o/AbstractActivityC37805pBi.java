package o;

import android.os.Build;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.uilab.banner.OKAlertBanner;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.web.WebActivity;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.AbstractActivityC37805pBi;
import o.C35964oKf;
import o.C47244tmQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pBi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivityC37805pBi extends AbstractActivityC33041mov {
    public int AuCTel;
    public boolean DbNXlk;
    public RecyclerView ejfBZ;
    public C33609mzg fIwbmz;
    public android.widget.LinearLayout gEmmrt;
    public OKAlertBanner getNewProxyInstance;
    public C52794wYp isConnected;
    public OKReminder iwGUEr;
    public android.widget.LinearLayout valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.pBo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Float.valueOf(AbstractActivityC37805pBi.AhwBna(this.AEQbTJ));
        }
    });
    public final java.lang.String AYXKKw = "USER_REMINDER_PREFERENCE_YES";
    public java.lang.String values = "";
    public java.lang.String fJNWhG = "";
    public final C59534zip AhwBna = new C59534zip();
    public java.util.ArrayList<PriceWindowData.PriceWindowItem> fARcdN = new java.util.ArrayList<>();
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.pBm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractActivityC37805pBi.valueOf(this.EZpvd);
        }
    });
    public final ActionBar djBIcL = new ActionBar();
    public ItemTouchHelper getFieldNames = new ItemTouchHelper(new Application());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.values;
    }

    public abstract boolean DbNXlk();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59534zip OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull C52794wYp c52794wYp) {
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        this.isConnected = c52794wYp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<PriceWindowData.PriceWindowItem> gEmmrt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int valueOf() {
        return this.AuCTel;
    }

    public abstract void values();

    public final C52794wYp djBIcL() {
        C52794wYp c52794wYp = this.isConnected;
        if (c52794wYp != null) {
            return c52794wYp;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final float AEQbTJ() {
        return ((java.lang.Number) this.fetchVPNInfo.getValue()).floatValue();
    }

    public static final float AhwBna(AbstractActivityC37805pBi abstractActivityC37805pBi) {
        return C33052mpF.copydefault(32, (android.content.Context) abstractActivityC37805pBi);
    }

    /* JADX INFO: renamed from: o.pBi$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pBi.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayoutManager KWHzl() {
        return (LinearLayoutManager) this.AkhnZx.getValue();
    }

    public static final LinearLayoutManager valueOf(AbstractActivityC37805pBi abstractActivityC37805pBi) {
        return new LinearLayoutManager(abstractActivityC37805pBi, 1, false);
    }

    /* JADX INFO: renamed from: o.pBi$ActionBar */
    public static final class ActionBar extends RecyclerView.AdapterDataObserver {
        public ActionBar() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (i == 0) {
                int iFindFirstVisibleItemPosition = AbstractActivityC37805pBi.this.KWHzl().findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == 0) {
                    AbstractActivityC37805pBi.this.KWHzl().scrollToPosition(0);
                } else if (AbstractActivityC37805pBi.this.KWHzl().findLastVisibleItemPosition() < AbstractActivityC37805pBi.this.KWHzl().getItemCount() - 1) {
                    AbstractActivityC37805pBi.this.KWHzl().scrollToPosition(java.lang.Math.max(iFindFirstVisibleItemPosition, 0));
                }
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"))) {
            getDelegate().setLocalNightMode(2);
        } else if (!Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) && C33492mxV.OLrzqt()) {
            getDelegate().setLocalNightMode(2);
        } else {
            getDelegate().setLocalNightMode(1);
        }
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C35964oKf.Application.AhwBna);
        RecyclerView recyclerView = null;
        C32866mlf.onEvent$default("chart_in_pricewindow", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        this.AuCTel = getIntent().getIntExtra("type", 0);
        java.lang.String stringExtra = getIntent().getStringExtra("leverage");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.fJNWhG = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("contract");
        if (stringExtra2 != null) {
            this.values = stringExtra2;
        }
        AkhnZx();
        EZpvd();
        this.ejfBZ = (RecyclerView) findViewById(C35964oKf.StateListAnimator.arDRxL);
        this.iwGUEr = (OKReminder) findViewById(C35964oKf.StateListAnimator.onPostMessage);
        this.getNewProxyInstance = (OKAlertBanner) findViewById(C35964oKf.StateListAnimator.ITrustedWebActivityService);
        if (SPUtils.getBoolean(this.AYXKKw, true) && pFP.OLrzqt.OLrzqt()) {
            OKReminder oKReminder = this.iwGUEr;
            if (oKReminder == null) {
                Intrinsics.gEmmrt("");
                oKReminder = null;
            }
            oKReminder.setVisibility(0);
        } else {
            OKReminder oKReminder2 = this.iwGUEr;
            if (oKReminder2 == null) {
                Intrinsics.gEmmrt("");
                oKReminder2 = null;
            }
            oKReminder2.setVisibility(8);
        }
        final OKReminder oKReminder3 = this.iwGUEr;
        if (oKReminder3 == null) {
            Intrinsics.gEmmrt("");
            oKReminder3 = null;
        }
        oKReminder3.setMessage(oKReminder3.getResources().getString(C35964oKf.Fragment.fzHEvu));
        oKReminder3.setStyle(0);
        oKReminder3.setCloseIconVisibility(true);
        oKReminder3.setOnCloseIconCallback(new Function0() { // from class: o.pBp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC37805pBi.KWHzl(oKReminder3, this);
            }
        });
        oKReminder3.setPrimaryAction(getString(C35964oKf.Fragment.OqCbbx), new Function0() { // from class: o.pBn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractActivityC37805pBi.gEmmrt(this.OLrzqt);
            }
        });
        ItemTouchHelper itemTouchHelper = this.getFieldNames;
        RecyclerView recyclerView2 = this.ejfBZ;
        if (recyclerView2 == null) {
            Intrinsics.gEmmrt("");
            recyclerView2 = null;
        }
        itemTouchHelper.attachToRecyclerView(recyclerView2);
        RecyclerView recyclerView3 = this.ejfBZ;
        if (recyclerView3 == null) {
            Intrinsics.gEmmrt("");
            recyclerView3 = null;
        }
        recyclerView3.setLayoutManager(KWHzl());
        RecyclerView recyclerView4 = this.ejfBZ;
        if (recyclerView4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            recyclerView = recyclerView4;
        }
        recyclerView.setAdapter(this.AhwBna);
        this.AhwBna.registerAdapterDataObserver(this.djBIcL);
        this.AhwBna.setItems(this.fARcdN);
        this.AhwBna.notifyDataSetChanged();
        isConnected();
        fIwbmz();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.pBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractActivityC37805pBi.AkhnZx(this.AEQbTJ);
            }
        });
    }

    public static final Unit KWHzl(OKReminder oKReminder, AbstractActivityC37805pBi abstractActivityC37805pBi) {
        oKReminder.setVisibility(8);
        SPUtils.put(abstractActivityC37805pBi.AYXKKw, java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(AbstractActivityC37805pBi abstractActivityC37805pBi) {
        abstractActivityC37805pBi.fetchVPNInfo();
        C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37805pBi.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, "view_faq", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(AbstractActivityC37805pBi abstractActivityC37805pBi) {
        rVN.reportFullyDrawn$default((android.app.Activity) abstractActivityC37805pBi, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void isConnected() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) getString(C35964oKf.Fragment.FYtjSf));
        spannableStringBuilder.append((java.lang.CharSequence) " ");
        java.lang.String string = getString(C35964oKf.Fragment.FSMca);
        Intrinsics.checkNotNullExpressionValue(string, "");
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        spannableString.setSpan(new StateListAnimator(), 0, string.length(), 33);
        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        OKAlertBanner oKAlertBanner = this.getNewProxyInstance;
        OKAlertBanner oKAlertBanner2 = null;
        if (oKAlertBanner == null) {
            Intrinsics.gEmmrt("");
            oKAlertBanner = null;
        }
        oKAlertBanner.KWHzl().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        OKAlertBanner oKAlertBanner3 = this.getNewProxyInstance;
        if (oKAlertBanner3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            oKAlertBanner2 = oKAlertBanner3;
        }
        oKAlertBanner2.setMessage(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o.pBi$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public StateListAnimator() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            AbstractActivityC37805pBi.this.avoidHintColor(view);
            android.content.Intent intent = new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(android.net.Uri.parse("package:" + AbstractActivityC37805pBi.this.getPackageName()));
            AbstractActivityC37805pBi.this.startActivityForResult(intent, 1);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setFakeBoldText(true);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, android.content.Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            fIwbmz();
        }
    }

    public final void fIwbmz() {
        try {
            java.lang.Object systemService = getSystemService("power");
            Intrinsics.copydefault(systemService, "");
            OKAlertBanner oKAlertBanner = null;
            if (((android.os.PowerManager) systemService).isIgnoringBatteryOptimizations(getPackageName())) {
                OKAlertBanner oKAlertBanner2 = this.getNewProxyInstance;
                if (oKAlertBanner2 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    oKAlertBanner = oKAlertBanner2;
                }
                oKAlertBanner.setVisibility(8);
                return;
            }
            OKAlertBanner oKAlertBanner3 = this.getNewProxyInstance;
            if (oKAlertBanner3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                oKAlertBanner = oKAlertBanner3;
            }
            oKAlertBanner.setVisibility(0);
        } catch (java.lang.Exception e) {
            pUU.copydefault(java.lang.String.valueOf(e.getMessage()));
        }
    }

    public final void avoidHintColor(android.view.View view) {
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setHighlightColor(getColor(C47244tmQ.Application.copydefault));
        }
    }

    public final void fetchVPNInfo() {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, applicationContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C35964oKf.Fragment.QSusPL))), null, 4, null);
    }

    public final boolean AkhnZx() {
        android.view.View viewFindViewById = findViewById(C35964oKf.StateListAnimator.UfveVb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        ((C33537myN) viewFindViewById).setTitleTypeface("harmony_sans_bold.ttf");
        this.fARcdN = PriceWindowData.AEQbTJ.AEQbTJ();
        C33609mzg c33609mzg = (C33609mzg) findViewById(C35964oKf.StateListAnimator.m);
        this.fIwbmz = c33609mzg;
        java.lang.Object obj = null;
        if (c33609mzg == null) {
            Intrinsics.gEmmrt("");
            c33609mzg = null;
        }
        c33609mzg.setChecked(SPUtils.getBoolean("sp_price_floatwindow_enable", false));
        C33609mzg c33609mzg2 = this.fIwbmz;
        if (c33609mzg2 == null) {
            Intrinsics.gEmmrt("");
            c33609mzg2 = null;
        }
        c33609mzg2.setOnClickListener(new View.OnClickListener() { // from class: o.pBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37805pBi.OLrzqt(this.AEQbTJ, view);
            }
        });
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.IKQXqd);
        this.gEmmrt = linearLayout;
        if (linearLayout == null) {
            Intrinsics.gEmmrt("");
            linearLayout = null;
        }
        C33609mzg c33609mzg3 = this.fIwbmz;
        if (c33609mzg3 == null) {
            Intrinsics.gEmmrt("");
            c33609mzg3 = null;
        }
        linearLayout.setVisibility(c33609mzg3.isChecked() ? 0 : 8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) findViewById(C35964oKf.StateListAnimator.hPlhRW);
        this.valueOf = linearLayout2;
        if (linearLayout2 == null) {
            Intrinsics.gEmmrt("");
            linearLayout2 = null;
        }
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: o.pBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37805pBi.AYXKKw(this.KWHzl, view);
            }
        });
        this.ejfBZ = (RecyclerView) findViewById(C35964oKf.StateListAnimator.arDRxL);
        OLrzqt((C52794wYp) findViewById(C35964oKf.StateListAnimator.RcXXUw));
        if (!DbNXlk()) {
            djBIcL().setText(C33070mpX.AYXKKw(C35964oKf.Fragment.awiJhF));
        } else {
            djBIcL().setText(getString(C35964oKf.Fragment.fdt) + " " + pFI.AEQbTJ(this.AuCTel, this.values));
            java.util.Iterator<T> it = this.fARcdN.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((PriceWindowData.PriceWindowItem) next).getContract(), (java.lang.Object) this.values)) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                djBIcL().setEnabled(false);
            }
        }
        djBIcL().setOnClickListener(new View.OnClickListener() { // from class: o.pBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractActivityC37805pBi.djBIcL(this.KWHzl, view);
            }
        });
        this.AhwBna.notifyDataSetChanged();
        return true;
    }

    public static final void OLrzqt(AbstractActivityC37805pBi abstractActivityC37805pBi, android.view.View view) {
        C33609mzg c33609mzg = abstractActivityC37805pBi.fIwbmz;
        android.widget.LinearLayout linearLayout = null;
        if (c33609mzg == null) {
            Intrinsics.gEmmrt("");
            c33609mzg = null;
        }
        boolean zIsChecked = c33609mzg.isChecked();
        if (zIsChecked) {
            if (!zIsChecked) {
                throw new NoWhenBranchMatchedException();
            }
            C33609mzg c33609mzg2 = abstractActivityC37805pBi.fIwbmz;
            if (c33609mzg2 == null) {
                Intrinsics.gEmmrt("");
                c33609mzg2 = null;
            }
            c33609mzg2.setChecked(false);
            C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC37805pBi.KWHzl((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            SPUtils.put("sp_price_floatwindow_enable", java.lang.Boolean.FALSE);
            pBO.dxcTrN.gEmmrt();
            android.widget.LinearLayout linearLayout2 = abstractActivityC37805pBi.gEmmrt;
            if (linearLayout2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.setVisibility(8);
            return;
        }
        C33609mzg c33609mzg3 = abstractActivityC37805pBi.fIwbmz;
        if (c33609mzg3 == null) {
            Intrinsics.gEmmrt("");
            c33609mzg3 = null;
        }
        c33609mzg3.setChecked(true);
        SPUtils.put("sp_price_floatwindow_enable", java.lang.Boolean.TRUE);
        C32866mlf.onEvent$default("MobileWidget_FloatingWidget_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.pBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractActivityC37805pBi.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        pBO pbo = pBO.dxcTrN;
        java.lang.Integer num = SPUtils.getInt("chart_price_window_fix", 5);
        Intrinsics.checkNotNullExpressionValue(num, "");
        pbo.djBIcL(num.intValue());
        android.widget.LinearLayout linearLayout3 = abstractActivityC37805pBi.gEmmrt;
        if (linearLayout3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            linearLayout = linearLayout3;
        }
        linearLayout.setVisibility(0);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "toggle", DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "toggle", DebugKt.DEBUG_PROPERTY_VALUE_OFF, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(AbstractActivityC37805pBi abstractActivityC37805pBi, android.view.View view) {
        new pBW().show(abstractActivityC37805pBi.getSupportFragmentManager(), abstractActivityC37805pBi.getClass().getSimpleName());
    }

    public static final void djBIcL(AbstractActivityC37805pBi abstractActivityC37805pBi, android.view.View view) {
        abstractActivityC37805pBi.values();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C33609mzg c33609mzg = this.fIwbmz;
        if (c33609mzg == null) {
            Intrinsics.gEmmrt("");
            c33609mzg = null;
        }
        c33609mzg.setChecked(SPUtils.getBoolean("sp_price_floatwindow_enable", false));
    }

    private final void EZpvd() {
        this.AhwBna.register(PriceWindowData.PriceWindowItem.class, new TaskDescription());
    }

    /* JADX INFO: renamed from: o.pBi$Application */
    public static final class Application extends ItemTouchHelper.Callback {
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            Intrinsics.checkNotNullParameter(viewHolder, "");
        }

        public Application() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            Intrinsics.checkNotNullParameter(viewHolder2, "");
            Collections.swap(AbstractActivityC37805pBi.this.gEmmrt(), viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            AbstractActivityC37805pBi.this.OLrzqt().notifyItemMoved(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return false;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            java.lang.Object systemService = AbstractActivityC37805pBi.this.getSystemService("vibrator");
            Intrinsics.copydefault(systemService, "");
            android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                vibrator.vibrate(android.os.VibrationEffect.createOneShot(15L, -1));
            } else {
                vibrator.vibrate(15L);
            }
            if (i != 0) {
                AbstractActivityC37805pBi.this.OLrzqt(true);
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            Intrinsics.checkNotNullParameter(viewHolder, "");
            super.clearView(recyclerView, viewHolder);
            AbstractActivityC37805pBi.this.OLrzqt(false);
            PriceWindowData.AEQbTJ.OLrzqt(AbstractActivityC37805pBi.this.gEmmrt());
            pBO.dxcTrN.fIwbmz();
        }
    }

    public final void OLrzqt(boolean z) {
        this.DbNXlk = z;
        try {
            RecyclerView recyclerView = this.ejfBZ;
            if (recyclerView == null) {
                Intrinsics.gEmmrt("");
                recyclerView = null;
            }
            int childCount = recyclerView.getChildCount();
            if (childCount >= 0) {
                int i = 0;
                while (true) {
                    RecyclerView recyclerView2 = this.ejfBZ;
                    if (recyclerView2 == null) {
                        Intrinsics.gEmmrt("");
                        recyclerView2 = null;
                    }
                    KWHzl(recyclerView2.getChildAt(i), z);
                    if (i == childCount) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                return;
            }
            this.AhwBna.notifyDataSetChanged();
            pBO.dxcTrN.fIwbmz();
        } catch (java.lang.IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(android.view.View view, boolean z) {
        if (view != null) {
            view.setElevation(z ? AEQbTJ() : 0.0f);
        }
    }

    /* JADX INFO: renamed from: o.pBi$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public final class TaskDescription extends AbstractC59533zio<PriceWindowData.PriceWindowItem, Application> {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public TaskDescription() {
        }

        /* JADX INFO: renamed from: o.pBi$TaskDescription$Application */
        /* JADX INFO: loaded from: classes18.dex */
        public final class Application extends RecyclerView.ViewHolder {
            public final android.widget.ImageView AEQbTJ;
            public final /* synthetic */ TaskDescription EZpvd;
            public final android.widget.ImageView KWHzl;
            public final android.widget.ImageView OLrzqt;
            public final android.widget.LinearLayout copydefault;
            public final android.widget.TextView djBIcL;
            public final android.widget.TextView valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView AYXKKw() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.ImageView KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.LinearLayout OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final android.widget.TextView copydefault() {
                return this.djBIcL;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull TaskDescription taskDescription, android.view.View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "");
                this.EZpvd = taskDescription;
                android.view.View viewFindViewById = view.findViewById(C35964oKf.StateListAnimator.prepareFromMediaId);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                this.djBIcL = (android.widget.TextView) viewFindViewById;
                android.view.View viewFindViewById2 = view.findViewById(C35964oKf.StateListAnimator.ICustomTabsService);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                this.copydefault = (android.widget.LinearLayout) viewFindViewById2;
                android.view.View viewFindViewById3 = view.findViewById(C35964oKf.StateListAnimator.giSNqX);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                this.OLrzqt = (android.widget.ImageView) viewFindViewById3;
                android.view.View viewFindViewById4 = view.findViewById(C35964oKf.StateListAnimator.gasjUx);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                this.AEQbTJ = (android.widget.ImageView) viewFindViewById4;
                android.view.View viewFindViewById5 = view.findViewById(C35964oKf.StateListAnimator.dNCPSb);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
                this.KWHzl = (android.widget.ImageView) viewFindViewById5;
                android.view.View viewFindViewById6 = view.findViewById(C35964oKf.StateListAnimator.getQueue);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "");
                this.valueOf = (android.widget.TextView) viewFindViewById6;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
            Intrinsics.checkNotNullParameter(layoutInflater, "");
            Intrinsics.checkNotNullParameter(viewGroup, "");
            android.view.View viewInflate = layoutInflater.inflate(C35964oKf.Application.zuWLRA, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "");
            return new Application(this, viewInflate);
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        @Override // o.AbstractC59533zio
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NotNull final Application application, @NotNull final PriceWindowData.PriceWindowItem priceWindowItem) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(priceWindowItem, "");
            AbstractActivityC37805pBi abstractActivityC37805pBi = AbstractActivityC37805pBi.this;
            abstractActivityC37805pBi.KWHzl(application.itemView, abstractActivityC37805pBi.DbNXlk);
            android.widget.LinearLayout linearLayoutOLrzqt = application.OLrzqt();
            final AbstractActivityC37805pBi abstractActivityC37805pBi2 = AbstractActivityC37805pBi.this;
            linearLayoutOLrzqt.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pBv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return AbstractActivityC37805pBi.TaskDescription.EZpvd(abstractActivityC37805pBi2, application, view);
                }
            });
            android.widget.ImageView imageViewKWHzl = application.KWHzl();
            final AbstractActivityC37805pBi abstractActivityC37805pBi3 = AbstractActivityC37805pBi.this;
            imageViewKWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.pBw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC37805pBi.TaskDescription.copydefault(application, abstractActivityC37805pBi3, priceWindowItem, view);
                }
            });
            android.widget.ImageView imageViewAEQbTJ = application.AEQbTJ();
            final AbstractActivityC37805pBi abstractActivityC37805pBi4 = AbstractActivityC37805pBi.this;
            imageViewAEQbTJ.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.pBy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(android.view.View view) {
                    return AbstractActivityC37805pBi.TaskDescription.AEQbTJ(abstractActivityC37805pBi4, application, view);
                }
            });
            android.widget.ImageView imageViewEZpvd = application.EZpvd();
            final AbstractActivityC37805pBi abstractActivityC37805pBi5 = AbstractActivityC37805pBi.this;
            imageViewEZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.pBA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    AbstractActivityC37805pBi.TaskDescription.EZpvd(application, priceWindowItem, abstractActivityC37805pBi5, view);
                }
            });
            android.widget.TextView textViewCopydefault = application.copydefault();
            int klineType = priceWindowItem.getKlineType();
            java.lang.String displayId = priceWindowItem.getDisplayId();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
                displayId = null;
            }
            if (displayId == null) {
                displayId = priceWindowItem.getContract();
            }
            textViewCopydefault.setText(pFI.AEQbTJ(klineType, displayId));
            if (priceWindowItem.getKlineType() == 0) {
                application.AYXKKw().setVisibility(0);
                application.AYXKKw().setText(priceWindowItem.getLeverage() + "x");
                return;
            }
            application.AYXKKw().setVisibility(8);
        }

        public static final boolean EZpvd(AbstractActivityC37805pBi abstractActivityC37805pBi, Application application, android.view.View view) {
            abstractActivityC37805pBi.getFieldNames.startDrag(application);
            return true;
        }

        public static final void copydefault(Application application, AbstractActivityC37805pBi abstractActivityC37805pBi, PriceWindowData.PriceWindowItem priceWindowItem, android.view.View view) {
            if (application.getAdapterPosition() > 0) {
                abstractActivityC37805pBi.gEmmrt().remove(priceWindowItem);
                abstractActivityC37805pBi.gEmmrt().add(0, priceWindowItem);
                PriceWindowData.AEQbTJ.OLrzqt(abstractActivityC37805pBi.gEmmrt());
                abstractActivityC37805pBi.OLrzqt().notifyDataSetChanged();
                pBO.dxcTrN.fIwbmz();
            }
        }

        public static final boolean AEQbTJ(AbstractActivityC37805pBi abstractActivityC37805pBi, Application application, android.view.View view) {
            abstractActivityC37805pBi.getFieldNames.startDrag(application);
            return true;
        }

        public static final void EZpvd(Application application, final PriceWindowData.PriceWindowItem priceWindowItem, final AbstractActivityC37805pBi abstractActivityC37805pBi, android.view.View view) {
            android.content.Context context = application.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int i = C35964oKf.Fragment.DSiOMJ;
            int klineType = priceWindowItem.getKlineType();
            java.lang.String displayId = priceWindowItem.getDisplayId();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) displayId)) {
                displayId = null;
            }
            if (displayId == null) {
                displayId = priceWindowItem.getContract();
            }
            java.lang.String strKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", pFI.AEQbTJ(klineType, displayId))));
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DIIpTV);
            java.lang.CharSequence charSequence = C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.pBu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractActivityC37805pBi.TaskDescription.copydefault(abstractActivityC37805pBi, (java.util.List) obj);
                }
            }, 14, null);
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(abstractActivityC37805pBi);
            viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
            viewOnClickListenerC54939xaY.AEQbTJ(charSequence, new View.OnClickListener() { // from class: o.pBr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    AbstractActivityC37805pBi.TaskDescription.EZpvd(viewOnClickListenerC54939xaY, abstractActivityC37805pBi, priceWindowItem, view2);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C35964oKf.Fragment.DcqEDu), (View.OnClickListener) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
            viewOnClickListenerC54939xaY.show();
        }

        public static final Unit copydefault(AbstractActivityC37805pBi abstractActivityC37805pBi, java.util.List list) {
            Intrinsics.checkNotNullParameter(list, "");
            list.add(new android.text.style.TextAppearanceSpan(abstractActivityC37805pBi, C52761wXj.LoaderManager.getPostValueLengthLimit));
            return Unit.INSTANCE;
        }

        public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, AbstractActivityC37805pBi abstractActivityC37805pBi, PriceWindowData.PriceWindowItem priceWindowItem, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
            abstractActivityC37805pBi.KWHzl(priceWindowItem);
        }
    }

    public final void KWHzl(PriceWindowData.PriceWindowItem priceWindowItem) {
        java.lang.Object next;
        java.util.Iterator<PriceWindowData.PriceWindowItem> it = this.fARcdN.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            PriceWindowData.PriceWindowItem next2 = it.next();
            Intrinsics.checkNotNullExpressionValue(next2, "");
            PriceWindowData.PriceWindowItem priceWindowItem2 = next2;
            if (Intrinsics.EZpvd((java.lang.Object) priceWindowItem2.getContract(), (java.lang.Object) priceWindowItem.getContract()) && priceWindowItem2.getKlineType() == priceWindowItem.getKlineType()) {
                it.remove();
            }
        }
        if (DbNXlk()) {
            java.util.Iterator<T> it2 = this.fARcdN.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((PriceWindowData.PriceWindowItem) next).getContract(), (java.lang.Object) this.values)) {
                        break;
                    }
                }
            }
            if (next == null) {
                djBIcL().setEnabled(true);
            }
        }
        PriceWindowData.AEQbTJ.OLrzqt(this.fARcdN);
        this.AhwBna.notifyDataSetChanged();
        pBO.dxcTrN.fIwbmz();
    }

    @Override // o.AbstractActivityC33041mov
    public void addConfig() {
        boolean zIsBlackStatusBar = isBlackStatusBar();
        if (zIsBlackStatusBar) {
            zIsBlackStatusBar = !Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark"));
        }
        C33567myr.AEQbTJ(this, zIsBlackStatusBar);
        C33494mxX.copydefault.EZpvd(this, zIsBlackStatusBar);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.AhwBna.hasObservers()) {
            try {
                this.AhwBna.unregisterAdapterDataObserver(this.djBIcL);
            } catch (java.lang.Exception e) {
                android.util.Log.getStackTraceString(e);
            }
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

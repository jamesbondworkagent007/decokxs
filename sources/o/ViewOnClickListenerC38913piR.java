package o;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.coreapi.service.IMarketApiService;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.api.bean.NewCoinPushBean;
import com.okinc.kline.ui.NewCoinTimeCountActivity$getWsData$1;
import com.okinc.market.common.biz_spot.AnnounceDetail;
import com.okinc.tradeapi.framework.constant.TradeKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.piR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class ViewOnClickListenerC38913piR extends AbstractActivityC33041mov implements View.OnClickListener {
    public AbstractC36018oMf EZpvd;
    public boolean OLrzqt;
    public NewCoinPushBean copydefault;
    public InterfaceC58217yxC gEmmrt;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public MutableLiveData<AbstractC54531xLw> AYXKKw = new MutableLiveData<>();
    public final AbstractC54575xNl KWHzl = new StateListAnimator(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC54575xNl KWHzl() {
        return this.KWHzl;
    }

    /* JADX INFO: renamed from: o.piR$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.piR.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String timeStamp;
        C39837pzq c39837pzq;
        C39837pzq c39837pzq2;
        C39837pzq c39837pzq3;
        C39837pzq c39837pzq4;
        java.lang.String coinName;
        android.widget.TextView textView;
        java.lang.String coinName2;
        C39837pzq c39837pzq5;
        java.lang.String url;
        C57597ylS c57597ylS;
        android.widget.TextView title;
        C39837pzq c39837pzq6;
        java.lang.String coinName3;
        C39837pzq c39837pzq7;
        java.lang.String icon;
        C57597ylS c57597ylS2;
        android.widget.TextView title2;
        super.onCreate(bundle);
        this.EZpvd = (AbstractC36018oMf) DataBindingUtil.setContentView(this, C35964oKf.Application.gEmmrt);
        android.content.Intent intent = getIntent();
        if (intent != null) {
            this.copydefault = (NewCoinPushBean) intent.getParcelableExtra("item");
            AbstractC36018oMf abstractC36018oMf = this.EZpvd;
            if (abstractC36018oMf != null && (c57597ylS2 = abstractC36018oMf.KWHzl) != null && (title2 = c57597ylS2.getTitle()) != null) {
                NewCoinPushBean newCoinPushBean = this.copydefault;
                title2.setText(copydefault(newCoinPushBean != null ? newCoinPushBean.getCoinName() : null));
            }
            AbstractC36018oMf abstractC36018oMf2 = this.EZpvd;
            java.lang.String str = "";
            if (abstractC36018oMf2 != null && (c39837pzq7 = abstractC36018oMf2.gEmmrt) != null) {
                NewCoinPushBean newCoinPushBean2 = this.copydefault;
                if (newCoinPushBean2 == null || (icon = newCoinPushBean2.getIcon()) == null) {
                    icon = "";
                }
                c39837pzq7.setImg(icon);
            }
            AbstractC36018oMf abstractC36018oMf3 = this.EZpvd;
            if (abstractC36018oMf3 != null && (c39837pzq6 = abstractC36018oMf3.gEmmrt) != null) {
                NewCoinPushBean newCoinPushBean3 = this.copydefault;
                if (newCoinPushBean3 == null || (coinName3 = newCoinPushBean3.getCoinName()) == null) {
                    coinName3 = "";
                }
                c39837pzq6.setTitle(copydefault(coinName3));
            }
            AbstractC36018oMf abstractC36018oMf4 = this.EZpvd;
            if (abstractC36018oMf4 != null && (c57597ylS = abstractC36018oMf4.KWHzl) != null && (title = c57597ylS.getTitle()) != null) {
                title.setGravity(3);
            }
            AbstractC36018oMf abstractC36018oMf5 = this.EZpvd;
            if (abstractC36018oMf5 != null && (c39837pzq5 = abstractC36018oMf5.gEmmrt) != null) {
                NewCoinPushBean newCoinPushBean4 = this.copydefault;
                if (newCoinPushBean4 == null || (url = newCoinPushBean4.getUrl()) == null) {
                    url = "";
                }
                c39837pzq5.setClickSkill(url);
            }
            AbstractC36018oMf abstractC36018oMf6 = this.EZpvd;
            if (abstractC36018oMf6 != null && (textView = abstractC36018oMf6.copydefault) != null) {
                int i = C35964oKf.Fragment.UkCIYP;
                NewCoinPushBean newCoinPushBean5 = this.copydefault;
                if (newCoinPushBean5 != null && (coinName2 = newCoinPushBean5.getCoinName()) != null) {
                    str = coinName2;
                }
                textView.setText(C33069mpW.KWHzl(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", AEQbTJ(str)))));
            }
            showLoading();
            NewCoinPushBean newCoinPushBean6 = this.copydefault;
            if (newCoinPushBean6 != null && (coinName = newCoinPushBean6.getCoinName()) != null) {
                java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) coinName, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
                if (!listSplit$default.isEmpty()) {
                    pFU.AEQbTJ.OLrzqt(this, (java.lang.String) listSplit$default.get(0), new Function1() { // from class: o.piZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return ViewOnClickListenerC38913piR.EZpvd(this.AEQbTJ, (AnnounceDetail) obj);
                        }
                    });
                }
            }
            NewCoinPushBean newCoinPushBean7 = this.copydefault;
            if (newCoinPushBean7 == null || (timeStamp = newCoinPushBean7.getTimeStamp()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) timeStamp)) {
                return;
            }
            final long jValueOf = C33129mqd.valueOf(timeStamp);
            if (jValueOf > java.lang.System.currentTimeMillis()) {
                AbstractC36018oMf abstractC36018oMf7 = this.EZpvd;
                if (abstractC36018oMf7 != null && (c39837pzq4 = abstractC36018oMf7.gEmmrt) != null) {
                    C39837pzq.countdown$default(c39837pzq4, (jValueOf - java.lang.System.currentTimeMillis()) / ((long) 1000), null, 2, null);
                }
                AbstractC36018oMf abstractC36018oMf8 = this.EZpvd;
                if (abstractC36018oMf8 == null || (c39837pzq3 = abstractC36018oMf8.gEmmrt) == null) {
                    return;
                }
                c39837pzq3.setContent(C33070mpX.AYXKKw(C35964oKf.Fragment.fdazkH));
                return;
            }
            AbstractC36018oMf abstractC36018oMf9 = this.EZpvd;
            if (abstractC36018oMf9 != null && (c39837pzq2 = abstractC36018oMf9.gEmmrt) != null) {
                c39837pzq2.KWHzl(0L, new Function0() { // from class: o.pja
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return ViewOnClickListenerC38913piR.AYXKKw(this.AEQbTJ);
                    }
                });
            }
            AbstractC36018oMf abstractC36018oMf10 = this.EZpvd;
            if (abstractC36018oMf10 != null && (c39837pzq = abstractC36018oMf10.gEmmrt) != null) {
                c39837pzq.setRemindText(1);
            }
            C32869mli.onNewOKexEventWithParams$default("app_newlisting_countdown_show", null, new Function1() { // from class: o.piX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ViewOnClickListenerC38913piR.AEQbTJ(jValueOf, this, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(ViewOnClickListenerC38913piR viewOnClickListenerC38913piR, AnnounceDetail announceDetail) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        ConstraintLayout constraintLayout;
        java.lang.String introduce;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        ConstraintLayout constraintLayout2;
        viewOnClickListenerC38913piR.releaseLoading();
        if (announceDetail == null || (introduce = announceDetail.getIntroduce()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) introduce)) {
            AbstractC36018oMf abstractC36018oMf = viewOnClickListenerC38913piR.EZpvd;
            if (abstractC36018oMf != null && (constraintLayout = abstractC36018oMf.OLrzqt) != null) {
                constraintLayout.setVisibility(8);
            }
            AbstractC36018oMf abstractC36018oMf2 = viewOnClickListenerC38913piR.EZpvd;
            if (abstractC36018oMf2 != null && (textView2 = abstractC36018oMf2.AEQbTJ) != null) {
                textView2.setVisibility(8);
            }
            AbstractC36018oMf abstractC36018oMf3 = viewOnClickListenerC38913piR.EZpvd;
            if (abstractC36018oMf3 != null && (textView = abstractC36018oMf3.copydefault) != null) {
                textView.setVisibility(8);
            }
            rVN.reportFullyDrawn$default((android.app.Activity) viewOnClickListenerC38913piR, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        AbstractC36018oMf abstractC36018oMf4 = viewOnClickListenerC38913piR.EZpvd;
        if (abstractC36018oMf4 != null && (constraintLayout2 = abstractC36018oMf4.OLrzqt) != null) {
            constraintLayout2.setVisibility(0);
        }
        AbstractC36018oMf abstractC36018oMf5 = viewOnClickListenerC38913piR.EZpvd;
        if (abstractC36018oMf5 != null && (textView4 = abstractC36018oMf5.AEQbTJ) != null) {
            textView4.setVisibility(0);
        }
        AbstractC36018oMf abstractC36018oMf6 = viewOnClickListenerC38913piR.EZpvd;
        if (abstractC36018oMf6 != null && (textView3 = abstractC36018oMf6.copydefault) != null) {
            textView3.setVisibility(0);
        }
        viewOnClickListenerC38913piR.KWHzl(announceDetail.getIntroduce());
        rVN.reportFullyDrawn$default((android.app.Activity) viewOnClickListenerC38913piR, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ViewOnClickListenerC38913piR viewOnClickListenerC38913piR) {
        java.lang.String coinName;
        NewCoinPushBean newCoinPushBean = viewOnClickListenerC38913piR.copydefault;
        if (newCoinPushBean != null && (coinName = newCoinPushBean.getCoinName()) != null) {
            if (viewOnClickListenerC38913piR.EZpvd(coinName)) {
                viewOnClickListenerC38913piR.djBIcL(coinName);
                viewOnClickListenerC38913piR.finish();
            } else {
                viewOnClickListenerC38913piR.OLrzqt(coinName);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(long j, ViewOnClickListenerC38913piR viewOnClickListenerC38913piR, EventParamsList eventParamsList) {
        java.lang.String coinName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("countdown_hour", java.lang.String.valueOf((j / ((long) 1000)) / ((long) IMarketApiService.SIXTY_MINUTES)), false);
        NewCoinPushBean newCoinPushBean = viewOnClickListenerC38913piR.copydefault;
        if (newCoinPushBean != null && (coinName = newCoinPushBean.getCoinName()) != null) {
            str = coinName;
        }
        eventParamsList.put("trade_pair", str, false);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str) {
        android.widget.TextView textView;
        Intrinsics.checkNotNullParameter(str, "");
        copydefault();
        AbstractC36018oMf abstractC36018oMf = this.EZpvd;
        if (abstractC36018oMf == null || (textView = abstractC36018oMf.AEQbTJ) == null) {
            return;
        }
        textView.setText(str);
    }

    /* JADX INFO: renamed from: o.piR$StateListAnimator */
    public static final class StateListAnimator extends AbstractC54575xNl {
        public StateListAnimator(java.lang.String str) {
            super(str, "SPOT");
        }

        @Override // o.AbstractC54575xNl
        public void OLrzqt() {
            java.lang.String coinName;
            NewCoinPushBean newCoinPushBean = ViewOnClickListenerC38913piR.this.copydefault;
            if (newCoinPushBean == null || (coinName = newCoinPushBean.getCoinName()) == null) {
                return;
            }
            ViewOnClickListenerC38913piR viewOnClickListenerC38913piR = ViewOnClickListenerC38913piR.this;
            if (viewOnClickListenerC38913piR.EZpvd(coinName)) {
                viewOnClickListenerC38913piR.djBIcL(coinName);
                viewOnClickListenerC38913piR.finish();
            }
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new NewCoinTimeCountActivity$getWsData$1(this, null), 3, null);
    }

    public final void djBIcL(java.lang.String str) {
        MarketCoinInfo marketCoinInfo = new MarketCoinInfo(str, "SPOT", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) ActivityC38834pgs.class);
        intent.putExtra("market_detail_info", marketCoinInfo);
        startActivity(intent);
    }

    /* JADX INFO: renamed from: o.piR$Application */
    public static final class Application implements ViewTreeObserver.OnPreDrawListener {
        public Application() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            android.widget.TextView textView;
            AppCompatImageView appCompatImageView;
            android.widget.TextView textView2;
            android.widget.TextView textView3;
            AppCompatImageView appCompatImageView2;
            AppCompatImageView appCompatImageView3;
            android.widget.TextView textView4;
            android.widget.TextView textView5;
            android.widget.TextView textView6;
            android.widget.TextView textView7;
            android.widget.TextView textView8;
            android.view.ViewTreeObserver viewTreeObserver;
            AbstractC36018oMf abstractC36018oMf = ViewOnClickListenerC38913piR.this.EZpvd;
            if (abstractC36018oMf != null && (textView8 = abstractC36018oMf.AEQbTJ) != null && (viewTreeObserver = textView8.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            AbstractC36018oMf abstractC36018oMf2 = ViewOnClickListenerC38913piR.this.EZpvd;
            int lineCount = (abstractC36018oMf2 == null || (textView7 = abstractC36018oMf2.AEQbTJ) == null) ? 0 : textView7.getLineCount();
            AbstractC36018oMf abstractC36018oMf3 = ViewOnClickListenerC38913piR.this.EZpvd;
            ViewGroup.LayoutParams layoutParams = (abstractC36018oMf3 == null || (textView6 = abstractC36018oMf3.AEQbTJ) == null) ? null : textView6.getLayoutParams();
            Intrinsics.copydefault(layoutParams, "");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (lineCount <= 6) {
                AbstractC36018oMf abstractC36018oMf4 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf4 != null && (appCompatImageView = abstractC36018oMf4.EZpvd) != null) {
                    appCompatImageView.setVisibility(4);
                }
                AbstractC36018oMf abstractC36018oMf5 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf5 != null && (textView = abstractC36018oMf5.AYXKKw) != null) {
                    textView.setVisibility(4);
                }
                ViewOnClickListenerC38913piR.this.OLrzqt = false;
                layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, C33052mpF.EZpvd(16.0f, (android.content.Context) ViewOnClickListenerC38913piR.this), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            } else {
                layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                AbstractC36018oMf abstractC36018oMf6 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf6 != null && (textView5 = abstractC36018oMf6.AYXKKw) != null) {
                    textView5.setVisibility(0);
                }
                AbstractC36018oMf abstractC36018oMf7 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf7 != null && (textView4 = abstractC36018oMf7.AYXKKw) != null) {
                    textView4.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QVMIlxQVMIlx));
                }
                AbstractC36018oMf abstractC36018oMf8 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf8 != null && (appCompatImageView3 = abstractC36018oMf8.EZpvd) != null) {
                    appCompatImageView3.setVisibility(0);
                }
                AbstractC36018oMf abstractC36018oMf9 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf9 != null && (appCompatImageView2 = abstractC36018oMf9.EZpvd) != null) {
                    appCompatImageView2.setOnClickListener(ViewOnClickListenerC38913piR.this);
                }
                AbstractC36018oMf abstractC36018oMf10 = ViewOnClickListenerC38913piR.this.EZpvd;
                if (abstractC36018oMf10 != null && (textView3 = abstractC36018oMf10.AYXKKw) != null) {
                    textView3.setOnClickListener(ViewOnClickListenerC38913piR.this);
                }
            }
            ViewOnClickListenerC38913piR.this.OLrzqt = !r0.OLrzqt;
            ViewOnClickListenerC38913piR.this.EZpvd();
            AbstractC36018oMf abstractC36018oMf11 = ViewOnClickListenerC38913piR.this.EZpvd;
            if (abstractC36018oMf11 != null && (textView2 = abstractC36018oMf11.AEQbTJ) != null) {
                textView2.requestLayout();
            }
            return true;
        }
    }

    public final void copydefault() {
        android.view.View root;
        android.view.ViewTreeObserver viewTreeObserver;
        AbstractC36018oMf abstractC36018oMf = this.EZpvd;
        if (abstractC36018oMf == null || (root = abstractC36018oMf.getRoot()) == null || (viewTreeObserver = root.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnPreDrawListener(new Application());
    }

    public final void EZpvd() {
        android.widget.TextView textView;
        AppCompatImageView appCompatImageView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        AppCompatImageView appCompatImageView2;
        android.widget.TextView textView4;
        if (this.OLrzqt) {
            AbstractC36018oMf abstractC36018oMf = this.EZpvd;
            if (abstractC36018oMf != null && (textView4 = abstractC36018oMf.AYXKKw) != null) {
                textView4.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QVMIlxQVMIlx));
            }
            AbstractC36018oMf abstractC36018oMf2 = this.EZpvd;
            if (abstractC36018oMf2 != null && (appCompatImageView2 = abstractC36018oMf2.EZpvd) != null) {
                appCompatImageView2.setImageResource(C52761wXj.TaskDescription.DfrfUJ);
            }
            AbstractC36018oMf abstractC36018oMf3 = this.EZpvd;
            if (abstractC36018oMf3 != null && (textView3 = abstractC36018oMf3.AEQbTJ) != null) {
                textView3.setMaxLines(6);
            }
        } else {
            AbstractC36018oMf abstractC36018oMf4 = this.EZpvd;
            if (abstractC36018oMf4 != null && (textView2 = abstractC36018oMf4.AYXKKw) != null) {
                textView2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.QezThh));
            }
            AbstractC36018oMf abstractC36018oMf5 = this.EZpvd;
            if (abstractC36018oMf5 != null && (appCompatImageView = abstractC36018oMf5.EZpvd) != null) {
                appCompatImageView.setImageResource(C52761wXj.TaskDescription.ExKek);
            }
            AbstractC36018oMf abstractC36018oMf6 = this.EZpvd;
            if (abstractC36018oMf6 != null && (textView = abstractC36018oMf6.AEQbTJ) != null) {
                textView.setMaxLines(20);
            }
        }
        this.OLrzqt = !this.OLrzqt;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        AEQbTJ();
    }

    private final void AEQbTJ() {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C39837pzq c39837pzq;
        AbstractC36018oMf abstractC36018oMf = this.EZpvd;
        if (abstractC36018oMf != null && (c39837pzq = abstractC36018oMf.gEmmrt) != null) {
            c39837pzq.OLrzqt();
        }
        InterfaceC58217yxC interfaceC58217yxC = this.gEmmrt;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC54575xNl abstractC54575xNl = this.KWHzl;
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        if (interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) == null) {
            return;
        }
        interfaceC54581xNrOLrzqt.copydefault(abstractC54575xNl);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Integer numValueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        int i = C35964oKf.StateListAnimator.GiPPlLRPuVlr;
        if (numValueOf == null || numValueOf.intValue() != i) {
            int i2 = C35964oKf.StateListAnimator.AudioAttributesImplBaseParcelizer;
            if (numValueOf == null || numValueOf.intValue() != i2) {
                return;
            }
        }
        EZpvd();
        final java.lang.String str = this.OLrzqt ? "less:less" : "more:more";
        C32869mli.onNewOKexEventWithParams$default("app_newlisting_countdown_intro_more_click", null, new Function1() { // from class: o.piV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewOnClickListenerC38913piR.EZpvd(str, (EventParamsList) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("click_type", str, false);
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
        return ((interfaceC49425uoM == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault, oLT.fetchVPNInfo(), str, null, null, 12, null)) != null;
    }

    public static /* synthetic */ java.lang.String convertTitle$default(ViewOnClickListenerC38913piR viewOnClickListenerC38913piR, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return viewOnClickListenerC38913piR.copydefault(str);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) ? "" : StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) ? C59449zhJ.replace$default(str, "-", "/", false, 4, (java.lang.Object) null) : str;
    }

    public static /* synthetic */ java.lang.String convertCoinName$default(ViewOnClickListenerC38913piR viewOnClickListenerC38913piR, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return viewOnClickListenerC38913piR.AEQbTJ(str);
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return "";
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        return listSplit$default.isEmpty() ^ true ? (java.lang.String) listSplit$default.get(0) : str;
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

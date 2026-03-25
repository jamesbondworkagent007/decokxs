package o;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.MutableLiveData;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gOh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19760gOh extends C23404hxb {
    public ViewOnClickListenerC5326Nk AEQbTJ;
    public Calendar AhwBna;
    public final Calendar AkhnZx;
    public Calendar EZpvd;
    public final Calendar KWHzl;
    public wYF OLrzqt;
    public final Calendar copydefault;
    public Calendar djBIcL;
    public ViewOnClickListenerC5326Nk fetchVPNInfo;
    public Calendar valueOf;
    public C21561hDy values;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gOq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(AbstractC19760gOh.KWHzl(this.AEQbTJ));
        }
    });
    public boolean AYXKKw = true;

    public static final void AEQbTJ(android.view.View view) {
    }

    public static final void EZpvd(Date date, android.view.View view) {
    }

    public static final void KWHzl(android.view.View view) {
    }

    public static final void copydefault(Date date, android.view.View view) {
    }

    /* JADX DEBUG: Possible override for method o.hxb.EZpvd()V */
    public abstract Calendar EZpvd();

    public abstract gOJ KWHzl();

    public abstract void copydefault(Calendar calendar);

    public AbstractC19760gOh() {
        Calendar calendar = Calendar.getInstance();
        this.copydefault = calendar;
        java.lang.Object objClone = calendar.clone();
        Intrinsics.copydefault(objClone, "");
        Calendar calendar2 = (Calendar) objClone;
        calendar2.add(1, -100);
        this.AkhnZx = calendar2;
        java.lang.Object objClone2 = calendar.clone();
        Intrinsics.copydefault(objClone2, "");
        Calendar calendar3 = (Calendar) objClone2;
        calendar3.add(1, 100);
        this.KWHzl = calendar3;
        java.lang.Object objClone3 = calendar.clone();
        Intrinsics.copydefault(objClone3, "");
        Calendar calendar4 = (Calendar) objClone3;
        calendar4.add(5, 1);
        this.EZpvd = calendar4;
        java.lang.Object objClone4 = calendar.clone();
        Intrinsics.copydefault(objClone4, "");
        Calendar calendar5 = (Calendar) objClone4;
        calendar5.add(5, 1);
        this.valueOf = calendar5;
    }

    private final boolean OLrzqt() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public static final boolean KWHzl(AbstractC19760gOh abstractC19760gOh) {
        android.os.Bundle arguments = abstractC19760gOh.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("data");
        }
        return false;
    }

    public final void copydefault(int i) {
        C21561hDy c21561hDy;
        ConstraintLayout constraintLayout;
        if (i == 0 || (c21561hDy = this.values) == null || (constraintLayout = c21561hDy.djBIcL) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = i;
        }
        constraintLayout.setLayoutParams(layoutParams);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(8);
        wxq.EZpvd().setVisibility(0);
        C25352ivB.setOnDoubleCheckClickListener$default(wxq.EZpvd(), 0L, new Function1() { // from class: o.gOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19760gOh.valueOf(this.copydefault, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit valueOf(AbstractC19760gOh abstractC19760gOh, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        abstractC19760gOh.KWHzl().OLrzqt().postValue(java.lang.Boolean.TRUE);
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.values = C21561hDy.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        EZpvd(constraintLayout);
        AEQbTJ();
        copydefault();
        constraintLayout.post(new java.lang.Runnable() { // from class: o.gOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC19760gOh.AEQbTJ(this.KWHzl);
            }
        });
    }

    public static final void AEQbTJ(AbstractC19760gOh abstractC19760gOh) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) abstractC19760gOh, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void EZpvd(ConstraintLayout constraintLayout) {
        ViewCompat.setOnApplyWindowInsetsListener(constraintLayout, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.gOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return AbstractC19760gOh.EZpvd(view, windowInsetsCompat);
            }
        });
        constraintLayout.requestApplyInsets();
    }

    public static final WindowInsetsCompat EZpvd(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), insets.bottom);
        return windowInsetsCompat;
    }

    public final void AEQbTJ(wYF wyf) {
        this.OLrzqt = wyf;
        wyf.setType(6);
        wyf.setSecondaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.DHEdFZ));
        wyf.setPrimaryText(C33070mpX.AYXKKw(C23274hvD.Fragment.Srftgn));
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSSize(52);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setOKDSSize(52);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOKDSType(257);
        }
        C52794wYp c52794wYpCopydefault3 = wyf.copydefault();
        if (c52794wYpCopydefault3 != null) {
            c52794wYpCopydefault3.setContentDescription("web3_dex_copytrading_expire_custom_confirm");
        }
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.AEQbTJ(), 0L, new Function1() { // from class: o.gOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19760gOh.KWHzl(this.AEQbTJ, (android.view.View) obj);
            }
        }, 1, null);
        Calendar calendar = this.EZpvd;
        this.djBIcL = calendar;
        this.AhwBna = calendar;
        C25352ivB.setOnDoubleCheckClickListener$default(wyf.copydefault(), 0L, new Function1() { // from class: o.gOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC19760gOh.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(AbstractC19760gOh abstractC19760gOh, android.view.View view) {
        android.widget.FrameLayout frameLayout;
        android.widget.FrameLayout frameLayout2;
        C54984xbQ c54984xbQ;
        C54984xbQ c54984xbQ2;
        C54984xbQ c54984xbQ3;
        C54984xbQ c54984xbQ4;
        Intrinsics.checkNotNullParameter(view, "");
        Calendar calendar = abstractC19760gOh.valueOf;
        abstractC19760gOh.djBIcL = calendar;
        abstractC19760gOh.AhwBna = calendar;
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = abstractC19760gOh.fetchVPNInfo;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.AEQbTJ(calendar);
        }
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = abstractC19760gOh.AEQbTJ;
        if (viewOnClickListenerC5326Nk2 != null) {
            viewOnClickListenerC5326Nk2.AEQbTJ(abstractC19760gOh.valueOf);
        }
        abstractC19760gOh.AYXKKw = true;
        C21561hDy c21561hDy = abstractC19760gOh.values;
        if (c21561hDy != null && (c54984xbQ4 = c21561hDy.AkhnZx) != null) {
            Date time = abstractC19760gOh.valueOf.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            c54984xbQ4.setText(pTA.formatSimpleDate$default(time, null, 1, null));
        }
        C21561hDy c21561hDy2 = abstractC19760gOh.values;
        if (c21561hDy2 != null && (c54984xbQ3 = c21561hDy2.isConnected) != null) {
            Date time2 = abstractC19760gOh.valueOf.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            c54984xbQ3.setText(pTA.formatTime$default(time2, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
        }
        C21561hDy c21561hDy3 = abstractC19760gOh.values;
        if (c21561hDy3 != null && (c54984xbQ2 = c21561hDy3.AkhnZx) != null) {
            C54984xbQ.setSelectedStyle$default(c54984xbQ2, abstractC19760gOh.AYXKKw, 0, 2, null);
        }
        C21561hDy c21561hDy4 = abstractC19760gOh.values;
        if (c21561hDy4 != null && (c54984xbQ = c21561hDy4.isConnected) != null) {
            C54984xbQ.setSelectedStyle$default(c54984xbQ, true ^ abstractC19760gOh.AYXKKw, 0, 2, null);
        }
        C21561hDy c21561hDy5 = abstractC19760gOh.values;
        if (c21561hDy5 != null && (frameLayout2 = c21561hDy5.copydefault) != null) {
            frameLayout2.setVisibility(0);
        }
        C21561hDy c21561hDy6 = abstractC19760gOh.values;
        if (c21561hDy6 != null && (frameLayout = c21561hDy6.DbNXlk) != null) {
            frameLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC19760gOh abstractC19760gOh, android.view.View view) {
        Date time;
        java.lang.String str;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(view, "");
        abstractC19760gOh.copydefault(abstractC19760gOh.djBIcL);
        MutableLiveData<ExpireTimeData> mutableLiveDataKWHzl = abstractC19760gOh.KWHzl().KWHzl();
        Calendar calendar = abstractC19760gOh.djBIcL;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(calendar != null ? java.lang.Long.valueOf(calendar.getTimeInMillis()) : null);
        Calendar calendar2 = abstractC19760gOh.djBIcL;
        if (calendar2 != null && (time = calendar2.getTime()) != null && (str = pTA.format$default(time, OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null)) != null) {
            str2 = str;
        }
        mutableLiveDataKWHzl.postValue(new ExpireTimeData("custom", strGEmmrt, str2));
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        wYF wyf;
        Calendar calendarEZpvd = EZpvd();
        if (calendarEZpvd != null && !calendarEZpvd.getTime().before(this.copydefault.getTime())) {
            this.EZpvd = calendarEZpvd;
        }
        C21561hDy c21561hDy = this.values;
        if (c21561hDy != null && (wyf = c21561hDy.AEQbTJ) != null) {
            AEQbTJ(wyf);
        }
        final C21561hDy c21561hDy2 = this.values;
        if (c21561hDy2 != null) {
            android.widget.FrameLayout frameLayout = c21561hDy2.copydefault;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            KWHzl(frameLayout);
            android.widget.FrameLayout frameLayout2 = c21561hDy2.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
            OLrzqt(frameLayout2);
            C25352ivB.setOnDoubleCheckClickListener$default(c21561hDy2.AkhnZx, 0L, new Function1() { // from class: o.gOs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC19760gOh.OLrzqt(this.EZpvd, c21561hDy2, (android.view.View) obj);
                }
            }, 1, null);
            C25352ivB.setOnDoubleCheckClickListener$default(c21561hDy2.isConnected, 0L, new Function1() { // from class: o.gOr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AbstractC19760gOh.KWHzl(this.AEQbTJ, c21561hDy2, (android.view.View) obj);
                }
            }, 1, null);
        }
        if (OLrzqt()) {
            copydefault(C55298xhM.dpInt$default(411.0f, (android.content.Context) null, 1, (java.lang.Object) null));
        }
    }

    public static final Unit OLrzqt(AbstractC19760gOh abstractC19760gOh, C21561hDy c21561hDy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = abstractC19760gOh.AEQbTJ;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.AEQbTJ(abstractC19760gOh.djBIcL);
        }
        c21561hDy.copydefault.setVisibility(0);
        c21561hDy.DbNXlk.setVisibility(8);
        abstractC19760gOh.OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AbstractC19760gOh abstractC19760gOh, C21561hDy c21561hDy, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = abstractC19760gOh.fetchVPNInfo;
        if (viewOnClickListenerC5326Nk != null) {
            viewOnClickListenerC5326Nk.AEQbTJ(abstractC19760gOh.AhwBna);
        }
        c21561hDy.DbNXlk.setVisibility(0);
        c21561hDy.copydefault.setVisibility(8);
        abstractC19760gOh.OLrzqt(false);
        return Unit.INSTANCE;
    }

    private final void copydefault() {
        C21561hDy c21561hDy = this.values;
        if (c21561hDy != null) {
            C54984xbQ c54984xbQ = c21561hDy.AkhnZx;
            Date time = this.EZpvd.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            c54984xbQ.setText(pTA.formatSimpleDate$default(time, null, 1, null));
            C54984xbQ c54984xbQ2 = c21561hDy.isConnected;
            Date time2 = this.EZpvd.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "");
            c54984xbQ2.setText(pTA.formatTime$default(time2, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            c21561hDy.AkhnZx.setButtonGravity(TextAlign.LEFT);
            C54984xbQ.setSelectedStyle$default(c21561hDy.AkhnZx, true, 0, 2, null);
            c21561hDy.isConnected.setButtonGravity(TextAlign.LEFT);
        }
    }

    public final void KWHzl(android.widget.FrameLayout frameLayout) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = new MZ(frameLayout.getContext(), new InterfaceC5318Nc() { // from class: o.gOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view) {
                AbstractC19760gOh.EZpvd(date, view);
            }
        }).AEQbTJ(C23274hvD.Activity.DGGHxk, new MY() { // from class: o.gOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view) {
                AbstractC19760gOh.AEQbTJ(view);
            }
        }).KWHzl(new boolean[]{true, true, true, false, false, false}).EZpvd("", "", "", "", "", "").OLrzqt(false).EZpvd(C25382ivf.KWHzl(C52761wXj.Activity.fZc)).KWHzl(16).copydefault(this.EZpvd).copydefault(new InterfaceC5319Nd() { // from class: o.gOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                AbstractC19760gOh.copydefault(this.EZpvd, date);
            }
        }).copydefault(2.25f).KWHzl(this.AkhnZx, this.KWHzl).AEQbTJ(frameLayout).AEQbTJ(C25382ivf.KWHzl(C52761wXj.Activity.DeEinT)).AYXKKw(C25382ivf.KWHzl(C52761wXj.Activity.Qsauvs)).copydefault(9).OLrzqt(C25382ivf.KWHzl(C52761wXj.Activity.registerUser)).KWHzl(true).EZpvd();
        this.AEQbTJ = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd != null) {
            viewOnClickListenerC5326NkEZpvd.AEQbTJ(frameLayout, false);
        }
    }

    public static final void copydefault(AbstractC19760gOh abstractC19760gOh, Date date) {
        Intrinsics.copydefault(date);
        abstractC19760gOh.AEQbTJ(date);
    }

    public final void OLrzqt(android.widget.FrameLayout frameLayout) {
        ViewOnClickListenerC5326Nk viewOnClickListenerC5326NkEZpvd = new MZ(frameLayout.getContext(), new InterfaceC5318Nc() { // from class: o.gOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5318Nc
            public final void copydefault(Date date, android.view.View view) {
                AbstractC19760gOh.copydefault(date, view);
            }
        }).AEQbTJ(C23274hvD.Activity.DGGHxk, new MY() { // from class: o.gOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.MY
            public final void AEQbTJ(android.view.View view) {
                AbstractC19760gOh.KWHzl(view);
            }
        }).KWHzl(new boolean[]{false, false, false, true, true, false}).EZpvd("", "", "", "", "", "").EZpvd(C25382ivf.KWHzl(C52761wXj.Activity.fZc)).KWHzl(16).copydefault(this.EZpvd).copydefault(new InterfaceC5319Nd() { // from class: o.gOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC5319Nd
            public final void KWHzl(Date date) {
                AbstractC19760gOh.KWHzl(this.AEQbTJ, date);
            }
        }).copydefault(2.25f).KWHzl(this.AkhnZx, this.KWHzl).AEQbTJ(frameLayout).AEQbTJ(C25382ivf.KWHzl(C52761wXj.Activity.DeEinT)).AYXKKw(C25382ivf.KWHzl(C52761wXj.Activity.Qsauvs)).copydefault(9).OLrzqt(C25382ivf.KWHzl(C52761wXj.Activity.registerUser)).KWHzl(true).EZpvd();
        this.fetchVPNInfo = viewOnClickListenerC5326NkEZpvd;
        if (viewOnClickListenerC5326NkEZpvd != null) {
            viewOnClickListenerC5326NkEZpvd.AEQbTJ(frameLayout, false);
        }
    }

    public static final void KWHzl(AbstractC19760gOh abstractC19760gOh, Date date) {
        Intrinsics.copydefault(date);
        abstractC19760gOh.AEQbTJ(date);
    }

    public final void AEQbTJ(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "");
        C21561hDy c21561hDy = this.values;
        if (c21561hDy != null) {
            java.lang.String simpleDate$default = pTA.formatSimpleDate$default(date, null, 1, null);
            Date time = this.copydefault.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "");
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) simpleDate$default, (java.lang.Object) pTA.formatSimpleDate$default(time, null, 1, null));
            if (date.before(this.copydefault.getTime()) && (!zEZpvd)) {
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk = this.AEQbTJ;
                if (viewOnClickListenerC5326Nk != null) {
                    viewOnClickListenerC5326Nk.AEQbTJ(this.copydefault);
                }
                ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk2 = this.fetchVPNInfo;
                if (viewOnClickListenerC5326Nk2 != null) {
                    viewOnClickListenerC5326Nk2.AEQbTJ(this.copydefault);
                }
                C54984xbQ c54984xbQ = c21561hDy.AkhnZx;
                Date time2 = this.copydefault.getTime();
                Intrinsics.checkNotNullExpressionValue(time2, "");
                c54984xbQ.setText(pTA.formatSimpleDate$default(time2, null, 1, null));
                return;
            }
            if (this.AYXKKw) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                this.djBIcL = calendar;
                C54984xbQ c54984xbQ2 = c21561hDy.AkhnZx;
                Date time3 = calendar.getTime();
                c54984xbQ2.setText(time3 != null ? pTA.formatSimpleDate$default(time3, null, 1, null) : null);
                this.AhwBna = this.djBIcL;
            } else {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTime(date);
                this.AhwBna = calendar2;
                C54984xbQ c54984xbQ3 = c21561hDy.isConnected;
                Date time4 = calendar2.getTime();
                c54984xbQ3.setText(time4 != null ? pTA.formatTime$default(time4, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null) : null);
                this.djBIcL = this.AhwBna;
            }
            ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk3 = this.AEQbTJ;
            if (viewOnClickListenerC5326Nk3 != null) {
                viewOnClickListenerC5326Nk3.AEQbTJ(this.djBIcL);
            }
            ViewOnClickListenerC5326Nk viewOnClickListenerC5326Nk4 = this.fetchVPNInfo;
            if (viewOnClickListenerC5326Nk4 != null) {
                viewOnClickListenerC5326Nk4.AEQbTJ(this.djBIcL);
            }
        }
    }

    public final void OLrzqt(boolean z) {
        C21561hDy c21561hDy = this.values;
        if (c21561hDy != null) {
            this.AYXKKw = z;
            C54984xbQ.setSelectedStyle$default(c21561hDy.AkhnZx, z, 0, 2, null);
            C54984xbQ.setSelectedStyle$default(c21561hDy.isConnected, !z, 0, 2, null);
            Calendar calendar = this.djBIcL;
            if (calendar != null) {
                C54984xbQ c54984xbQ = c21561hDy.AkhnZx;
                Date time = calendar.getTime();
                Intrinsics.checkNotNullExpressionValue(time, "");
                c54984xbQ.setText(pTA.formatSimpleDate$default(time, null, 1, null));
            }
            Calendar calendar2 = this.AhwBna;
            if (calendar2 != null) {
                C54984xbQ c54984xbQ2 = c21561hDy.isConnected;
                Date time2 = calendar2.getTime();
                Intrinsics.checkNotNullExpressionValue(time2, "");
                c54984xbQ2.setText(pTA.formatTime$default(time2, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 14, null));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KWHzl().OLrzqt().postValue(java.lang.Boolean.TRUE);
    }
}

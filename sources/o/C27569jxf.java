package o;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewpager2.widget.ViewPager2;
import com.amplifyframework.core.model.ModelIdentifier;
import com.bumptech.glide.Glide;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestDetail;
import com.okinc.business.invest_biz.data.bean.InvestLogo;
import com.okinc.business.invest_biz.data.bean.InvestLogoBaseVo;
import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestPlatformLogo;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.business.invest_biz.data.bean.InvestStOktDrawDetailResponse;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken;
import com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo;
import com.okinc.business.invest_biz.data.bean.InvestmentNetworkLogo;
import com.okinc.business.invest_biz.data.bean.STOKTDrawDetailItemInfo;
import com.okinc.business.invest_biz.data.bean.STOKTDrawDetailRecordInfo;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.UnderlyingToken;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.ButtonAction;
import com.okinc.core.widget.tipswindow.AnchorPopupWindow;
import com.okinc.uilab.reminder.OKReminder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C25493ixk;
import o.C32113mPz;
import o.C52761wXj;
import o.C57406yhn;
import o.InterfaceC24178iXu;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.jxf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27569jxf {
    public static final C27569jxf OLrzqt = new C27569jxf();

    /* JADX INFO: renamed from: o.jxf$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ButtonAction.values().length];
            try {
                iArr[ButtonAction.COLLECT_FEES.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonAction.CLAIM_ALL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonAction.CLAIM.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonAction.ADD_LIQUIDITY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[ButtonType.values().length];
            try {
                iArr2[ButtonType.CLAIM_TYPE_NO_NEED_SHOW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonType.CLAIM_TYPE_DISABLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonType.CLAIM_TYPE_NEED_APPROVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonType.CLAIM_TYPE_ENABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            AEQbTJ = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return C52761wXj.TaskDescription.fERRXa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd() {
        return C52761wXj.TaskDescription.gdmIOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int EZpvd(int i) {
        return i != 0 ? i != 1 ? C25493ixk.FragmentManager.DGUQLIdZmdUa : C25493ixk.FragmentManager.getLabel : C25493ixk.FragmentManager.DGUQLIDGUQLI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return C52761wXj.TaskDescription.aHXSQp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault(int i) {
        return i == C25493ixk.FragmentManager.gmHjFq ? C57406yhn.Activity.QbewEr : i == C25493ixk.FragmentManager.gSBher ? C57406yhn.Activity.RJOkX : i == C25493ixk.FragmentManager.gUEfcq ? C57406yhn.Activity.QfsBiF : C57406yhn.Activity.QVAiDq;
    }

    private C27569jxf() {
    }

    public static /* synthetic */ void setCompoundDrawablesRelative$default(C27569jxf c27569jxf, android.widget.TextView textView, int i, int i2, boolean z, java.lang.Integer num, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            num = null;
        }
        java.lang.Integer num2 = num;
        if ((i4 & 32) != 0) {
            i3 = 0;
        }
        c27569jxf.copydefault(textView, i, i2, z, num2, i3);
    }

    public final void copydefault(@NotNull android.widget.TextView textView, int i, int i2, boolean z, java.lang.Integer num, int i3) {
        android.graphics.drawable.Drawable drawableKWHzl;
        Intrinsics.checkNotNullParameter(textView, "");
        if (z) {
            drawableKWHzl = C33070mpX.KWHzl(i);
            if (drawableKWHzl != null) {
                drawableKWHzl.setBounds(0, 0, i2, i2);
                if (num != null) {
                    DrawableCompat.setTint(drawableKWHzl, num.intValue());
                }
            }
        } else {
            drawableKWHzl = null;
        }
        textView.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
        textView.setCompoundDrawablePadding(i3);
    }

    public final float copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull android.graphics.Paint paint, int i, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(paint, "");
        paint.setTextSize(C55298xhM.gEmmrt(f, context));
        while (f > f2 && ((int) paint.measureText(str)) > i) {
            f -= f3;
            if (f <= f2) {
                return f2;
            }
            paint.setTextSize(C55298xhM.gEmmrt(f, context));
        }
        return f;
    }

    /* JADX INFO: renamed from: o.jxf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ InvestOrderDetailsInfoVo.InvestLineInfo AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.content.Context copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, android.content.Context context, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.copydefault = context;
            this.AEQbTJ = investLineInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(this.copydefault);
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ.getKeyTip());
                viewOnClickListenerC54939xaY.setCancelable(true);
                viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.svY, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ InvestOrderDetailsInfoVo.InvestLineInfo OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = investLineInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.view.View view2 = this.KWHzl;
                C27569jxf c27569jxf = C27569jxf.OLrzqt;
                android.content.Context context = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c27569jxf.copydefault(context, this.OLrzqt.getCopyText(), true);
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ InvestTipInfoVo AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ Function0 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, android.content.Context context, InvestTipInfoVo investTipInfoVo, Function0 function0) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = context;
            this.AEQbTJ = investTipInfoVo;
            this.copydefault = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C27496jwL.EZpvd.copydefault(this.OLrzqt, this.AEQbTJ.getPopUpData(), this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.content.Context AEQbTJ;
        public final /* synthetic */ InvestTipInfoVo EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, android.content.Context context, InvestTipInfoVo investTipInfoVo) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = context;
            this.EZpvd = investTipInfoVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C27508jwX.openUrl$default(C27508jwX.AEQbTJ, this.AEQbTJ, this.EZpvd.getRedirectData().getUrl(), false, 2, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.content.Context EZpvd;
        public final /* synthetic */ InvestTipInfoVo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, android.content.Context context, android.view.View view2, InvestTipInfoVo investTipInfoVo) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = context;
            this.AEQbTJ = view2;
            this.KWHzl = investTipInfoVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C27569jxf.OLrzqt.AEQbTJ(this.EZpvd, this.AEQbTJ, this.KWHzl.getHoverOnData().getContent());
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestOrderDetailsInfoVo.InvestLineInfo OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = investLineInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) throws java.io.UnsupportedEncodingException {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.widget.TextView textView = (android.widget.TextView) this.copydefault;
                C27508jwX c27508jwX = C27508jwX.AEQbTJ;
                android.content.Context context = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                c27508jwX.copydefault(context, this.OLrzqt.getJumpUrl(), true);
            }
        }
    }

    /* JADX INFO: renamed from: o.jxf$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ InvestTipInfoVo KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, Function1 function1, InvestTipInfoVo investTipInfoVo) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = function1;
            this.KWHzl = investTipInfoVo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1 function1 = this.copydefault;
                if (function1 != null) {
                    function1.invoke(this.KWHzl.getCustomRedirectData().getLocation());
                }
            }
        }
    }

    public final void EZpvd(@NotNull android.app.Activity activity, C27212jqt c27212jqt, java.util.List<InvestmentNetworkLogo> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (c27212jqt == null || list == null || list.isEmpty()) {
            if (c27212jqt != null) {
                c27212jqt.setVisibility(8);
                return;
            }
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(activity);
        c27212jqt.setVisibility(0);
        c27212jqt.removeAllViews();
        for (InvestmentNetworkLogo investmentNetworkLogo : list) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(C25493ixk.Activity.ULRxlR, (android.view.ViewGroup) c27212jqt, false);
            android.view.View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.FSMca);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            C27569jxf c27569jxf = OLrzqt;
            c27569jxf.KWHzl((android.widget.ImageView) viewFindViewById, investmentNetworkLogo.getLogo(), c27569jxf.AEQbTJ(), C52761wXj.Activity.fZc, 0.0f);
            c27212jqt.addView(viewInflate);
        }
    }

    public static /* synthetic */ void setSDAvatarLayout$default(C27569jxf c27569jxf, android.content.Context context, C27212jqt c27212jqt, InvestDetail investDetail, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C32113mPz.ActionBar.AuCTelauCTel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        c27569jxf.AEQbTJ(context, c27212jqt, investDetail, i3, f);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, C27212jqt c27212jqt, @NotNull InvestDetail investDetail, int i, float f) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investDetail, "");
        EZpvd(context, c27212jqt, new InvestPlatformLogo(investDetail.getMiddleLogoList(), investDetail.getBottomRightLogoList(), investDetail.getTopLeftLogoList(), investDetail.getTopRightLogoList()), i, f);
    }

    public static /* synthetic */ void setSDAvatarLayout$default(C27569jxf c27569jxf, android.content.Context context, C27212jqt c27212jqt, InvestPlatformLogo investPlatformLogo, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C32113mPz.ActionBar.AuCTelauCTel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        c27569jxf.EZpvd(context, c27212jqt, investPlatformLogo, i3, f);
    }

    public final void EZpvd(@NotNull android.content.Context context, C27212jqt c27212jqt, InvestPlatformLogo investPlatformLogo, int i, float f) {
        UnderlyingToken underlyingToken;
        UnderlyingToken underlyingToken2;
        UnderlyingToken underlyingToken3;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<UnderlyingToken> middleLogoList = investPlatformLogo != null ? investPlatformLogo.getMiddleLogoList() : null;
        if (c27212jqt == null || middleLogoList == null || middleLogoList.isEmpty()) {
            if (c27212jqt != null) {
                c27212jqt.setVisibility(8);
                return;
            }
            return;
        }
        c27212jqt.setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        c27212jqt.removeAllViews();
        int i2 = 0;
        for (java.lang.Object obj : middleLogoList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            UnderlyingToken underlyingToken4 = (UnderlyingToken) obj;
            if (C33129mqd.OLrzqt((java.lang.CharSequence) underlyingToken4.getTokenLogo())) {
                android.view.View viewInflate = layoutInflaterFrom.inflate(C25493ixk.Activity.DIIpTV, (android.view.ViewGroup) c27212jqt, false);
                android.view.View viewFindViewById = viewInflate.findViewById(C25493ixk.ActionBar.RWIpjU);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
                android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById;
                C27569jxf c27569jxf = OLrzqt;
                c27569jxf.KWHzl(imageView, underlyingToken4.getTokenLogo(), c27569jxf.OLrzqt(), i, f);
                if (i2 == 0 && C33129mqd.KWHzl((java.util.Collection) investPlatformLogo.getTopLeftLogoList())) {
                    android.view.View viewFindViewById2 = viewInflate.findViewById(C25493ixk.ActionBar.gdLjtZ);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
                    android.widget.ImageView imageView2 = (android.widget.ImageView) viewFindViewById2;
                    java.util.List<UnderlyingToken> topLeftLogoList = investPlatformLogo.getTopLeftLogoList();
                    c27569jxf.KWHzl(imageView2, (topLeftLogoList == null || (underlyingToken3 = (UnderlyingToken) CollectionsKt___CollectionsKt.firstOrNull(topLeftLogoList)) == null) ? null : underlyingToken3.getTokenLogo(), c27569jxf.EZpvd(), i, f);
                }
                if (i2 == middleLogoList.size() - 1) {
                    if (C33129mqd.KWHzl((java.util.Collection) investPlatformLogo.getBottomRightLogoList())) {
                        android.view.View viewFindViewById3 = viewInflate.findViewById(C25493ixk.ActionBar.compare);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
                        android.widget.ImageView imageView3 = (android.widget.ImageView) viewFindViewById3;
                        java.util.List<UnderlyingToken> bottomRightLogoList = investPlatformLogo.getBottomRightLogoList();
                        c27569jxf.KWHzl(imageView3, (bottomRightLogoList == null || (underlyingToken2 = (UnderlyingToken) CollectionsKt___CollectionsKt.firstOrNull(bottomRightLogoList)) == null) ? null : underlyingToken2.getTokenLogo(), c27569jxf.EZpvd(), i, f);
                    }
                    if (C33129mqd.KWHzl((java.util.Collection) investPlatformLogo.getTopRightLogoList())) {
                        android.view.View viewFindViewById4 = viewInflate.findViewById(C25493ixk.ActionBar.gqESXP);
                        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
                        android.widget.ImageView imageView4 = (android.widget.ImageView) viewFindViewById4;
                        java.util.List<UnderlyingToken> topRightLogoList = investPlatformLogo.getTopRightLogoList();
                        c27569jxf.KWHzl(imageView4, (topRightLogoList == null || (underlyingToken = (UnderlyingToken) CollectionsKt___CollectionsKt.firstOrNull(topRightLogoList)) == null) ? null : underlyingToken.getTokenLogo(), c27569jxf.OLrzqt(), i, f);
                    }
                }
                c27212jqt.addView(viewInflate);
            }
            i2++;
        }
    }

    public static /* synthetic */ void setSDAvatarLayout$default(C27569jxf c27569jxf, android.content.Context context, C27212jqt c27212jqt, InvestLogo investLogo, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = C32113mPz.ActionBar.AuCTelauCTel;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        c27569jxf.EZpvd(context, c27212jqt, investLogo, i3, f);
    }

    public final void EZpvd(@NotNull android.content.Context context, C27212jqt c27212jqt, InvestLogo investLogo, @androidx.annotation.ColorRes int i, float f) {
        java.util.List<InvestLogoBaseVo> topLeftLogoList;
        Intrinsics.checkNotNullParameter(context, "");
        java.util.List<InvestLogoBaseVo> middleLogoList = investLogo != null ? investLogo.getMiddleLogoList() : null;
        if (c27212jqt == null || middleLogoList == null || middleLogoList.isEmpty()) {
            if (c27212jqt != null) {
                c27212jqt.setVisibility(8);
                return;
            }
            return;
        }
        c27212jqt.setVisibility(0);
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        c27212jqt.removeAllViews();
        int i2 = 0;
        for (java.lang.Object obj : middleLogoList) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            InvestLogoBaseVo investLogoBaseVo = (InvestLogoBaseVo) obj;
            java.lang.String tokenLogo = investLogoBaseVo.getTokenLogo();
            if (tokenLogo != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tokenLogo)) {
                C23835iLb c23835iLbKWHzl = C23835iLb.KWHzl(layoutInflaterFrom, c27212jqt, false);
                Intrinsics.checkNotNullExpressionValue(c23835iLbKWHzl, "");
                android.widget.ImageView imageView = c23835iLbKWHzl.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                C27569jxf c27569jxf = OLrzqt;
                c27569jxf.KWHzl(imageView, investLogoBaseVo.getTokenLogo(), c27569jxf.OLrzqt(), i, f);
                if (i2 == 0 && (topLeftLogoList = investLogo.getTopLeftLogoList()) != null && !topLeftLogoList.isEmpty()) {
                    android.widget.ImageView imageView2 = c23835iLbKWHzl.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "");
                    InvestLogoBaseVo investLogoBaseVo2 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investLogo.getTopLeftLogoList());
                    c27569jxf.KWHzl(imageView2, investLogoBaseVo2 != null ? investLogoBaseVo2.getTokenLogo() : null, c27569jxf.EZpvd(), i, f);
                }
                if (i2 == yDY.AuCTel(middleLogoList)) {
                    java.util.List<InvestLogoBaseVo> bottomRightLogoList = investLogo.getBottomRightLogoList();
                    if (bottomRightLogoList != null && !bottomRightLogoList.isEmpty()) {
                        android.widget.ImageView imageView3 = c23835iLbKWHzl.AEQbTJ;
                        Intrinsics.checkNotNullExpressionValue(imageView3, "");
                        InvestLogoBaseVo investLogoBaseVo3 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investLogo.getBottomRightLogoList());
                        c27569jxf.KWHzl(imageView3, investLogoBaseVo3 != null ? investLogoBaseVo3.getTokenLogo() : null, c27569jxf.EZpvd(), i, f);
                    }
                    java.util.List<InvestLogoBaseVo> topRightLogoList = investLogo.getTopRightLogoList();
                    if (topRightLogoList != null && !topRightLogoList.isEmpty()) {
                        android.widget.ImageView imageView4 = c23835iLbKWHzl.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(imageView4, "");
                        InvestLogoBaseVo investLogoBaseVo4 = (InvestLogoBaseVo) CollectionsKt___CollectionsKt.firstOrNull(investLogo.getTopRightLogoList());
                        c27569jxf.KWHzl(imageView4, investLogoBaseVo4 != null ? investLogoBaseVo4.getTokenLogo() : null, c27569jxf.OLrzqt(), i, f);
                    }
                }
                ConstraintLayout constraintLayoutEZpvd = c23835iLbKWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
                c27212jqt.addView(constraintLayoutEZpvd);
            }
            i2++;
        }
    }

    public static /* synthetic */ void loadCircleWithBorder$default(C27569jxf c27569jxf, android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = c27569jxf.EZpvd();
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = C32113mPz.ActionBar.gHZMYf;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = 0.5f;
        }
        c27569jxf.KWHzl(imageView, str, i4, i5, f);
    }

    public final void KWHzl(@NotNull android.widget.ImageView imageView, java.lang.String str, int i, int i2, float f) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ;
        Intrinsics.checkNotNullParameter(imageView, "");
        imageView.setVisibility(0);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(imageView.getContext(), i);
        if (str == null || str.length() == 0) {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).AEQbTJ(drawable);
        } else {
            c5335NtAEQbTJ = Glide.KWHzl(imageView).EZpvd(str);
        }
        Intrinsics.copydefault(c5335NtAEQbTJ);
        if (f > 0.0f) {
            c5335NtAEQbTJ = (C5335Nt) c5335NtAEQbTJ.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, C33070mpX.copydefault(i2), false));
        }
        c5335NtAEQbTJ.OLrzqt((RX<?>) new C5448Sc().EZpvd(drawable).OLrzqt(drawable)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadCircleWithBorder$default(C27569jxf c27569jxf, android.content.Context context, java.lang.String str, int i, int i2, float f, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            i = c27569jxf.EZpvd();
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = C32113mPz.ActionBar.gHZMYf;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = 0.5f;
        }
        c27569jxf.EZpvd(context, str, i4, i5, f, (Function1<? super android.graphics.drawable.Drawable, Unit>) function1);
    }

    public final void EZpvd(android.content.Context context, java.lang.String str, int i, int i2, float f, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        C5335Nt<android.graphics.drawable.Drawable> c5335NtAEQbTJ;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        if (str == null || str.length() == 0) {
            c5335NtAEQbTJ = Glide.AEQbTJ(context).AEQbTJ(drawable);
        } else {
            c5335NtAEQbTJ = Glide.AEQbTJ(context).EZpvd(str);
        }
        Intrinsics.copydefault(c5335NtAEQbTJ);
        c5335NtAEQbTJ.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(context, f, C33070mpX.copydefault(i2), false)).OLrzqt((RX<?>) new C5448Sc().EZpvd(drawable).OLrzqt(drawable)).OLrzqt(new Dialog(function1, context, i));
    }

    /* JADX INFO: renamed from: o.jxf$Dialog */
    public static final class Dialog extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> OLrzqt;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(Function1<? super android.graphics.drawable.Drawable, Unit> function1, android.content.Context context, int i) {
            this.OLrzqt = function1;
            this.KWHzl = context;
            this.AEQbTJ = i;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.OLrzqt.invoke(drawable);
        }

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
            Function1<android.graphics.drawable.Drawable, Unit> function1 = this.OLrzqt;
            android.graphics.drawable.Drawable drawable2 = this.KWHzl.getDrawable(this.AEQbTJ);
            Intrinsics.copydefault(drawable2);
            function1.invoke(drawable2);
        }
    }

    public static /* synthetic */ void setInvestClaimButtonStatus$default(C27569jxf c27569jxf, C52794wYp c52794wYp, ButtonType buttonType, ButtonAction buttonAction, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            buttonAction = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        c27569jxf.AEQbTJ(c52794wYp, buttonType, buttonAction, str);
    }

    public final void AEQbTJ(@NotNull C52794wYp c52794wYp, @NotNull ButtonType buttonType, ButtonAction buttonAction, java.lang.String str) {
        int i;
        Intrinsics.checkNotNullParameter(c52794wYp, "");
        Intrinsics.checkNotNullParameter(buttonType, "");
        int i2 = ActionBar.AEQbTJ[buttonType.ordinal()];
        if (i2 == 1) {
            c52794wYp.setVisibility(8);
            return;
        }
        if (i2 == 2) {
            c52794wYp.setVisibility(0);
            c52794wYp.setEnabled(false);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
                c52794wYp.setText(str);
                return;
            } else {
                i = buttonAction != null ? ActionBar.copydefault[buttonAction.ordinal()] : -1;
                c52794wYp.setText(i != 1 ? i != 2 ? (i == 3 || i != 4) ? C25493ixk.FragmentManager.DztXDE : C25493ixk.FragmentManager.hlkKmr : C25493ixk.FragmentManager.OijiEz : C25493ixk.FragmentManager.DsL);
                return;
            }
        }
        if (i2 == 3) {
            c52794wYp.setVisibility(0);
            c52794wYp.setEnabled(true);
            c52794wYp.setText(C25493ixk.FragmentManager.DcMfJKDcMfJK);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c52794wYp.setVisibility(0);
            c52794wYp.setEnabled(true);
            i = buttonAction != null ? ActionBar.copydefault[buttonAction.ordinal()] : -1;
            c52794wYp.setText(i != 1 ? i != 2 ? (i == 3 || i != 4) ? C25493ixk.FragmentManager.DztXDE : C25493ixk.FragmentManager.hlkKmr : C25493ixk.FragmentManager.OijiEz : C25493ixk.FragmentManager.DsL);
        }
    }

    public final void EZpvd(@NotNull final android.content.Context context, @NotNull final InvestStOktDrawDetailResponse investStOktDrawDetailResponse, @NotNull final java.lang.String str, @NotNull final Function1<? super InvestUserRewardElementInfo, Unit> function1) {
        java.util.List<STOKTDrawDetailRecordInfo> stOktDrawRecords;
        java.lang.String strAEQbTJ;
        java.util.List<STOKTDrawDetailRecordInfo> stOktDrawRecords2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investStOktDrawDetailResponse, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C23816iKj c23816iKjAEQbTJ = C23816iKj.AEQbTJ(android.view.LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(c23816iKjAEQbTJ, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        if (investStOktDrawDetailResponse.getRewardElementInfo() != null && C33129mqd.AEQbTJ(investStOktDrawDetailResponse.getRewardElementInfo().getCoinAmount(), 0)) {
            int i = C25493ixk.FragmentManager.Dap;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investStOktDrawDetailResponse.getRewardElementInfo().getCoinAmount();
            pairArr[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, coinAmount == null ? "" : coinAmount, 6, 2, false, false, 24, null));
            java.lang.String tokenSymbol = investStOktDrawDetailResponse.getRewardElementInfo().getTokenSymbol();
            if (tokenSymbol == null) {
                tokenSymbol = str;
            }
            pairArr[1] = C56390yDp.OLrzqt("token", tokenSymbol);
            viewOnClickListenerC54939xaY.setTitle(C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr)));
            STOKTDrawDetailItemInfo sTOKTDrawDetailItemInfo = (STOKTDrawDetailItemInfo) CollectionsKt___CollectionsKt.firstOrNull(investStOktDrawDetailResponse.getStOktDrawDetailList());
            if (sTOKTDrawDetailItemInfo == null || (stOktDrawRecords2 = sTOKTDrawDetailItemInfo.getStOktDrawRecords()) == null || (strAEQbTJ = C27491jwG.AEQbTJ(stOktDrawRecords2, new Function1() { // from class: o.jxi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27569jxf.AEQbTJ((STOKTDrawDetailRecordInfo) obj);
                }
            })) == null) {
                strAEQbTJ = "0";
            }
            java.lang.String str2 = strAEQbTJ;
            android.widget.TextView textView = c23816iKjAEQbTJ.KWHzl;
            int i2 = C25493ixk.FragmentManager.zDGrpR;
            kotlin.Pair[] pairArr2 = new kotlin.Pair[2];
            pairArr2[0] = C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(c27492jwH, str2, 6, 2, false, false, 24, null));
            java.lang.String tokenSymbol2 = investStOktDrawDetailResponse.getRewardElementInfo().getTokenSymbol();
            if (tokenSymbol2 == null) {
                tokenSymbol2 = str;
            }
            pairArr2[1] = C56390yDp.OLrzqt("token", tokenSymbol2);
            textView.setText(C33069mpW.KWHzl(context, i2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(pairArr2)));
            viewOnClickListenerC54939xaY.EZpvd(C25493ixk.FragmentManager.zEHIKV, new View.OnClickListener() { // from class: o.jxm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C27569jxf.copydefault(function1, investStOktDrawDetailResponse, view);
                }
            });
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.dPkBzA, (View.OnClickListener) null, 2, (java.lang.Object) null);
        } else {
            viewOnClickListenerC54939xaY.setTitle(C25493ixk.FragmentManager.FQMcgEfQMcgE);
            c23816iKjAEQbTJ.KWHzl.setText(C25493ixk.FragmentManager.aeJQwa);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C25493ixk.FragmentManager.svhCHd, (View.OnClickListener) null, 2, (java.lang.Object) null);
        }
        android.widget.TextView textView2 = c23816iKjAEQbTJ.OLrzqt;
        STOKTDrawDetailItemInfo sTOKTDrawDetailItemInfo2 = (STOKTDrawDetailItemInfo) CollectionsKt___CollectionsKt.firstOrNull(investStOktDrawDetailResponse.getStOktDrawDetailList());
        textView2.setText((sTOKTDrawDetailItemInfo2 == null || (stOktDrawRecords = sTOKTDrawDetailItemInfo2.getStOktDrawRecords()) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(stOktDrawRecords, "\n", null, null, 0, null, new Function1() { // from class: o.jxq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27569jxf.OLrzqt(context, str, (STOKTDrawDetailRecordInfo) obj);
            }
        }, 30, null));
        c23816iKjAEQbTJ.copydefault.setMaxHeightPercent(0.5f);
        C55118xds root = c23816iKjAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, root, 0, 2, null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final java.lang.String AEQbTJ(STOKTDrawDetailRecordInfo sTOKTDrawDetailRecordInfo) {
        Intrinsics.checkNotNullParameter(sTOKTDrawDetailRecordInfo, "");
        return sTOKTDrawDetailRecordInfo.getDrawAmount();
    }

    public static final void copydefault(Function1 function1, InvestStOktDrawDetailResponse investStOktDrawDetailResponse, android.view.View view) {
        function1.invoke(investStOktDrawDetailResponse.getRewardElementInfo());
    }

    public static final java.lang.CharSequence OLrzqt(android.content.Context context, java.lang.String str, STOKTDrawDetailRecordInfo sTOKTDrawDetailRecordInfo) {
        Intrinsics.checkNotNullParameter(sTOKTDrawDetailRecordInfo, "");
        return C33069mpW.KWHzl(context, C25493ixk.FragmentManager.clearRegistrations, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, sTOKTDrawDetailRecordInfo.getDrawAmount(), 6, 2, false, false, 24, null)), C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt("date", sTOKTDrawDetailRecordInfo.getDrawTime())));
    }

    public final void EZpvd(@NotNull android.app.Activity activity, @NotNull android.widget.LinearLayout linearLayout, @NotNull java.util.List<InvestTokenWithAmount> list, int i, int i2, int i3) {
        java.util.Iterator<InvestTokenWithAmount> it;
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(activity);
        linearLayout.removeAllViews();
        boolean z = true;
        if (list.isEmpty() || i == InvestAction.Deploy.getValue()) {
            iLE ileAEQbTJ = iLE.AEQbTJ(layoutInflaterFrom, linearLayout, true);
            Intrinsics.checkNotNullExpressionValue(ileAEQbTJ, "");
            ileAEQbTJ.OLrzqt.setText("--");
            ileAEQbTJ.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            ileAEQbTJ.KWHzl.setText("--");
            return;
        }
        java.util.Iterator<InvestTokenWithAmount> it2 = list.iterator();
        while (it2.hasNext()) {
            InvestTokenWithAmount next = it2.next();
            iLE ileAEQbTJ2 = iLE.AEQbTJ(layoutInflaterFrom, linearLayout, z);
            Intrinsics.checkNotNullExpressionValue(ileAEQbTJ2, "");
            ileAEQbTJ2.KWHzl.setText("--");
            if (yDY.gEmmrt(InvestAction.Subscription, InvestAction.StartFarming, InvestAction.Repay).contains(InvestAction.Companion.copydefault(i))) {
                if (i == 0 && i2 == 2) {
                    if (i3 == 3) {
                        ileAEQbTJ2.OLrzqt.setText(activity.getString(C25493ixk.FragmentManager.DcMfJKDCKfqPDCfLja));
                    }
                    it = it2;
                    ileAEQbTJ2.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
                if (next.getTokenId().length() > 0) {
                    ileAEQbTJ2.OLrzqt.setText("-1 " + next.getTokenSymbol() + " #" + next.getTokenId());
                    it = it2;
                    ileAEQbTJ2.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                } else {
                    android.widget.TextView textView = ileAEQbTJ2.OLrzqt;
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    it = it2;
                    textView.setText("-" + C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(c27492jwH, next.getCoinAmount(), 6, 2, false, false, 24, null) + " " + next.getTokenSymbol());
                    ileAEQbTJ2.KWHzl.setText(C27492jwH.formatCurrencyData$default(c27492jwH, next.getCurrencyAmount(), null, null, null, 14, null));
                    ileAEQbTJ2.OLrzqt.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                }
            } else {
                it = it2;
                if (i == z && next.getTokenId().length() > 0) {
                    ileAEQbTJ2.OLrzqt.setText("+1 " + next.getTokenSymbol() + " #" + next.getTokenId());
                } else {
                    android.widget.TextView textView2 = ileAEQbTJ2.OLrzqt;
                    C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
                    textView2.setText(Marker.ANY_NON_NULL_MARKER + C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(c27492jwH2, next.getCoinAmount(), 6, 2, false, false, 24, null) + " " + next.getTokenSymbol());
                    ileAEQbTJ2.KWHzl.setText(C27492jwH.formatCurrencyData$default(c27492jwH2, next.getCurrencyAmount(), null, null, null, 14, null));
                }
                ileAEQbTJ2.OLrzqt.setTextColor(C55366xib.KWHzl(C52761wXj.ActionBar.DGgnkA, activity));
            }
            it2 = it;
            z = true;
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, @NotNull android.widget.LinearLayout linearLayout, @NotNull java.util.List<InvestUnderlyingToken> list) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        linearLayout.removeAllViews();
        for (InvestUnderlyingToken investUnderlyingToken : list) {
            iLI ili = (iLI) DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.RAQtXZ, linearLayout, true);
            android.widget.ImageView imageView = ili.EZpvd;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            loadCircleWithBorder$default(this, imageView, investUnderlyingToken.getTokenLogo(), OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
            ili.copydefault.setText(investUnderlyingToken.getTokenSymbol());
        }
    }

    public static /* synthetic */ android.text.SpannableStringBuilder handleLines$default(C27569jxf c27569jxf, java.util.ArrayList arrayList, int i, android.graphics.Paint paint, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 16) != 0) {
            z = false;
        }
        return c27569jxf.copydefault((java.util.ArrayList<java.lang.String>) arrayList, i, paint, i2, z);
    }

    public final android.text.SpannableStringBuilder copydefault(@NotNull java.util.ArrayList<java.lang.String> arrayList, int i, @NotNull android.graphics.Paint paint, int i2, boolean z) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(paint, "");
        java.lang.String str2 = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(str2, "");
        java.lang.String str3 = str2;
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<java.lang.String> it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        float f = 0.0f;
        while (it.hasNext()) {
            java.lang.String next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            java.lang.String str4 = next;
            float fMeasureText = paint.measureText(str4);
            f += fMeasureText;
            if (f > i2) {
                if (sb.length() > 0) {
                    java.lang.String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    arrayList2.add(string);
                }
                C59445zhF.EZpvd(sb);
                sb.append(str4);
                f = fMeasureText;
            } else if (z) {
                sb.insert(0, str4);
            } else {
                sb.append(str4);
            }
        }
        if (sb.length() > 0) {
            java.lang.String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrayList2.add(string2);
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        for (java.lang.String str5 : arrayList2) {
            str = str.length() == 0 ? str5 : str + "\n" + str5;
        }
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str3, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default < 0) {
            return null;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), iIndexOf$default, str3.length() + iIndexOf$default, 34);
        return spannableStringBuilder;
    }

    public final void OLrzqt(@NotNull android.widget.LinearLayout linearLayout, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2, InvestTipsBean investTipsBean, boolean z3, boolean z4) {
        android.view.View next;
        AbstractC23829iKw abstractC23829iKw;
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(linearLayout.getContext());
        boolean z5 = linearLayout.getChildCount() == 0;
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
            if (z5) {
                abstractC23829iKw = (AbstractC23829iKw) DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.hvKCwS, linearLayout, true);
                abstractC23829iKw.getRoot().setTag(investTokenWithAmount.getTokenAddress());
                C27569jxf c27569jxf = OLrzqt;
                android.widget.ImageView imageView = abstractC23829iKw.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    android.widget.TextView textView = abstractC23829iKw.copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(8);
                    abstractC23829iKw.OLrzqt.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + investTokenWithAmount.getTokenId());
                } else {
                    abstractC23829iKw.OLrzqt.setText(investTokenWithAmount.getTokenSymbol());
                    android.widget.TextView textView2 = abstractC23829iKw.copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                }
            } else {
                java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (C59449zhJ.gEmmrt(C33129mqd.gEmmrt(next.getTag()), investTokenWithAmount.getTokenAddress(), true)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                android.view.View view = next;
                if (view == null || (abstractC23829iKw = (AbstractC23829iKw) DataBindingUtil.bind(view)) == null) {
                }
                i++;
            }
            if (z) {
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                } else {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
                }
                abstractC23829iKw.copydefault.setText(C27492jwH.formatZeroCurrencyData$default(C27492jwH.OLrzqt, false, 1, null));
            } else if (z2) {
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.KWHzl.setText(z4 ? "--" : C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                } else {
                    abstractC23829iKw.KWHzl.setText(z4 ? "--" : C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
                }
                abstractC23829iKw.copydefault.setText("--");
            } else {
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                } else if (investTokenWithAmount.getCoinAmount().length() == 0) {
                    abstractC23829iKw.KWHzl.setText("--");
                } else {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
                }
                if (investTokenWithAmount.getCurrencyAmount().length() == 0) {
                    abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                    abstractC23829iKw.copydefault.setText("--");
                } else {
                    if (!CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt(2, 3, 4)), investTipsBean != null ? java.lang.Integer.valueOf(investTipsBean.getTipsType()) : null) || C33129mqd.OLrzqt((java.lang.Object) investTokenWithAmount.getCurrencyAmount(), (java.lang.Object) 0)) {
                        abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                    } else {
                        abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                    }
                    abstractC23829iKw.copydefault.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                }
            }
            if (z5 && i > 2 && z4) {
                abstractC23829iKw.getRoot().setVisibility(z3 ? 0 : 8);
            }
            i++;
        }
    }

    public final void AEQbTJ(@NotNull android.widget.LinearLayout linearLayout, @NotNull java.util.List<InvestTokenWithAmount> list, boolean z, boolean z2, InvestTipsBean investTipsBean, boolean z3, boolean z4, final Function0<Unit> function0) {
        android.view.View next;
        AbstractC23829iKw abstractC23829iKw;
        Intrinsics.checkNotNullParameter(linearLayout, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(linearLayout.getContext());
        boolean z5 = linearLayout.getChildCount() == 0;
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
            if (z5) {
                abstractC23829iKw = (AbstractC23829iKw) DataBindingUtil.inflate(layoutInflaterFrom, C25493ixk.Activity.hvKCwS, linearLayout, true);
                abstractC23829iKw.getRoot().setTag(investTokenWithAmount.getTokenAddress());
                C27569jxf c27569jxf = OLrzqt;
                android.widget.ImageView imageView = abstractC23829iKw.EZpvd;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                loadCircleWithBorder$default(c27569jxf, imageView, investTokenWithAmount.getTokenLogo(), c27569jxf.OLrzqt(), C32113mPz.ActionBar.fJNWhG, 0.0f, 16, null);
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.copydefault.setVisibility(4);
                    abstractC23829iKw.OLrzqt.setText(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + investTokenWithAmount.getTokenId());
                } else {
                    abstractC23829iKw.copydefault.setVisibility(0);
                    abstractC23829iKw.OLrzqt.setText(investTokenWithAmount.getTokenSymbol());
                }
            } else {
                java.util.Iterator<android.view.View> it = ViewGroupKt.getChildren(linearLayout).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (C59449zhJ.gEmmrt(C33129mqd.gEmmrt(next.getTag()), investTokenWithAmount.getTokenAddress(), true)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                android.view.View view = next;
                if (view == null || (abstractC23829iKw = (AbstractC23829iKw) DataBindingUtil.bind(view)) == null) {
                }
                i++;
            }
            if (z) {
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                } else {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.OLrzqt.OLrzqt(false));
                }
                abstractC23829iKw.copydefault.setText(C27492jwH.formatZeroCurrencyData$default(C27492jwH.OLrzqt, false, 1, null));
                abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                abstractC23829iKw.copydefault.setCompoundDrawablesRelative(null, null, null, null);
                abstractC23829iKw.copydefault.setCompoundDrawablePadding(0);
            } else if (z2) {
                abstractC23829iKw.KWHzl.setText("--");
                abstractC23829iKw.copydefault.setText("--");
                abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                abstractC23829iKw.copydefault.setCompoundDrawablesRelative(null, null, null, null);
                abstractC23829iKw.copydefault.setCompoundDrawablePadding(0);
            } else {
                if (investTokenWithAmount.getTokenId().length() > 0) {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null));
                } else if (investTokenWithAmount.getCoinAmount().length() == 0) {
                    abstractC23829iKw.KWHzl.setText("--");
                } else {
                    abstractC23829iKw.KWHzl.setText(C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(C27492jwH.OLrzqt, investTokenWithAmount.getCoinAmount(), 6, 2, false, false, 24, null));
                }
                if (investTokenWithAmount.getCurrencyAmount().length() == 0) {
                    abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                    abstractC23829iKw.copydefault.setCompoundDrawablesRelative(null, null, null, null);
                    abstractC23829iKw.copydefault.setCompoundDrawablePadding(0);
                    abstractC23829iKw.copydefault.setText("--");
                } else {
                    java.lang.String currencyData$default = C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, investTokenWithAmount.getCurrencyAmount(), null, null, null, 14, null);
                    if (investTipsBean != null && investTipsBean.getTipsType() == 1 && list.size() == 1) {
                        C27569jxf c27569jxf2 = OLrzqt;
                        android.widget.TextView textView = abstractC23829iKw.copydefault;
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        c27569jxf2.KWHzl(textView, currencyData$default, investTipsBean.getValueOffset());
                        C8003auW.copydefault(abstractC23829iKw.copydefault).throttleFirst(500L, java.util.concurrent.TimeUnit.MILLISECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.jxj
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // o.InterfaceC58227yxM
                            public final void accept(java.lang.Object obj2) {
                                C27569jxf.OLrzqt(function0, obj2);
                            }
                        });
                    } else if (((investTipsBean != null && investTipsBean.getTipsType() == 3) || (investTipsBean != null && investTipsBean.getTipsType() == 4)) && C33129mqd.OLrzqt((java.lang.Object) investTokenWithAmount.getCurrencyAmount(), (java.lang.Object) 0)) {
                        abstractC23829iKw.copydefault.setCompoundDrawablesRelative(null, null, null, null);
                        abstractC23829iKw.copydefault.setCompoundDrawablePadding(0);
                        abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                        abstractC23829iKw.copydefault.setText(currencyData$default);
                    } else {
                        abstractC23829iKw.copydefault.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                        abstractC23829iKw.copydefault.setCompoundDrawablesRelative(null, null, null, null);
                        abstractC23829iKw.copydefault.setCompoundDrawablePadding(0);
                        abstractC23829iKw.copydefault.setText(currencyData$default);
                    }
                    if (!z5 && i > 2 && z4) {
                        abstractC23829iKw.getRoot().setVisibility(z3 ? 0 : 8);
                    }
                    i++;
                }
            }
            if (!z5) {
            }
            i++;
        }
    }

    public static final void OLrzqt(Function0 function0, java.lang.Object obj) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void KWHzl(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        textView.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.GGlJim);
        android.graphics.drawable.Drawable drawableMutate = drawableKWHzl != null ? drawableKWHzl.mutate() : null;
        if (drawableMutate != null) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, context);
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            drawableMutate.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context2));
            DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.iLAtSv));
        }
        textView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        android.content.Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textView.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context3));
        java.lang.String str3 = str + " (-" + C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, str2, false, 2, null) + ")";
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str3);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.iLAtSv)), str.length(), str3.length(), 34);
        textView.setText(spannableStringBuilder);
    }

    public final void AEQbTJ(@NotNull android.content.Context context, android.widget.TextView textView, @NotNull android.view.View view, @NotNull InvestTipInfoVo investTipInfoVo, Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1) {
        java.lang.String url;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        java.lang.String tipContent = investTipInfoVo.getTipContent();
        if (tipContent != null && tipContent.length() != 0) {
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (textView != null) {
                textView.setText(investTipInfoVo.getTipContent());
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        if (investTipInfoVo.getClickAction() == InvestClickActionType.NO_ACTION) {
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        if (investTipInfoVo.getClickAction() == InvestClickActionType.CUSTOM_REDIRECT && investTipInfoVo.getCustomRedirectData() != null) {
            java.lang.String location = investTipInfoVo.getCustomRedirectData().getLocation();
            if (location == null || location.length() == 0) {
                return;
            }
            view.setOnClickListener(new TaskDescription(view, 1000L, function1, investTipInfoVo));
            return;
        }
        if (investTipInfoVo.getClickAction() == InvestClickActionType.HOVER_ON && investTipInfoVo.getHoverOnData() != null) {
            java.lang.String content = investTipInfoVo.getHoverOnData().getContent();
            if (content == null || content.length() == 0) {
                return;
            }
            view.setOnClickListener(new PendingIntent(view, 1000L, context, view, investTipInfoVo));
            return;
        }
        if (investTipInfoVo.getClickAction() != InvestClickActionType.POPUP || investTipInfoVo.getPopUpData() == null) {
            if (investTipInfoVo.getClickAction() != InvestClickActionType.REDIRECT || investTipInfoVo.getRedirectData() == null || (url = investTipInfoVo.getRedirectData().getUrl()) == null || url.length() == 0) {
                return;
            }
            view.setOnClickListener(new FragmentManager(view, 1000L, context, investTipInfoVo));
            return;
        }
        view.setOnClickListener(new Fragment(view, 1000L, context, investTipInfoVo, function0));
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jxf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleTipInfo$default(C27569jxf c27569jxf, android.content.Context context, InvestTipInfoVo investTipInfoVo, Function0 function0, Function1 function1, int i, java.lang.Object obj) throws java.io.UnsupportedEncodingException {
        if ((i & 4) != 0) {
            function0 = new Function0() { // from class: o.jxk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C27569jxf.copydefault();
                }
            };
        }
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: o.jxl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C27569jxf.OLrzqt((java.lang.String) obj2);
                }
            };
        }
        c27569jxf.OLrzqt(context, investTipInfoVo, function0, function1);
    }

    public static final Unit OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(@NotNull android.content.Context context, @NotNull InvestTipInfoVo investTipInfoVo, @NotNull Function0<Unit> function0, @NotNull Function1<? super java.lang.String, Unit> function1) throws java.io.UnsupportedEncodingException {
        java.lang.String url;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (investTipInfoVo.getClickAction() == InvestClickActionType.CUSTOM_REDIRECT && investTipInfoVo.getCustomRedirectData() != null) {
            java.lang.String location = investTipInfoVo.getCustomRedirectData().getLocation();
            if (location == null || location.length() == 0) {
                return;
            }
            function1.invoke(investTipInfoVo.getCustomRedirectData().getLocation());
            return;
        }
        if (investTipInfoVo.getClickAction() == InvestClickActionType.POPUP && investTipInfoVo.getPopUpData() != null) {
            C27496jwL.EZpvd.copydefault(context, investTipInfoVo.getPopUpData(), function0);
        } else {
            if (investTipInfoVo.getClickAction() != InvestClickActionType.REDIRECT || investTipInfoVo.getRedirectData() == null || (url = investTipInfoVo.getRedirectData().getUrl()) == null || url.length() == 0) {
                return;
            }
            C27508jwX.openUrl$default(C27508jwX.AEQbTJ, context, investTipInfoVo.getRedirectData().getUrl(), false, 2, null);
        }
    }

    public final void copydefault(OKReminder oKReminder, @NotNull InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        if (oKReminder != null) {
            oKReminder.setCloseIconVisibility(false);
            oKReminder.setMessage((java.lang.CharSequence) investTipInfoVo.getTipContent());
            java.lang.String type = investTipInfoVo.getType();
            if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "1")) {
                oKReminder.setStyle(0);
            } else if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) "2")) {
                oKReminder.setStyle(2);
            } else {
                oKReminder.setStyle(2);
            }
        }
    }

    public final void KWHzl(@NotNull android.content.Context context, androidx.fragment.app.FragmentManager fragmentManager, @NotNull InvestTipInfoVo investTipInfoVo, Function0<Unit> function0, Function1<? super java.lang.String, Unit> function1) throws java.io.UnsupportedEncodingException {
        java.lang.String url;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(investTipInfoVo, "");
        if (investTipInfoVo.getClickAction() != InvestClickActionType.NO_ACTION) {
            if (investTipInfoVo.getClickAction() == InvestClickActionType.CUSTOM_REDIRECT && investTipInfoVo.getCustomRedirectData() != null) {
                java.lang.String location = investTipInfoVo.getCustomRedirectData().getLocation();
                if (location == null || location.length() == 0 || function1 == null) {
                    return;
                }
                function1.invoke(investTipInfoVo.getCustomRedirectData().getLocation());
                return;
            }
            if (investTipInfoVo.getClickAction() != InvestClickActionType.POPUP || investTipInfoVo.getPopUpData() == null) {
                if (investTipInfoVo.getClickAction() != InvestClickActionType.REDIRECT || investTipInfoVo.getRedirectData() == null || (url = investTipInfoVo.getRedirectData().getUrl()) == null || url.length() == 0) {
                    return;
                }
                C27508jwX.openUrl$default(C27508jwX.AEQbTJ, context, investTipInfoVo.getRedirectData().getUrl(), false, 2, null);
                return;
            }
            if (!C59449zhJ.equals$default(investTipInfoVo.getPopUpData().getPosition(), InvestPopUpData.POSITION_BOTTOM, false, 2, null)) {
                C27496jwL.EZpvd.copydefault(context, investTipInfoVo.getPopUpData(), function0);
            } else if (fragmentManager != null) {
                iUT.Companion.EZpvd(investTipInfoVo.getPopUpData()).show(fragmentManager, (java.lang.String) null);
            }
        }
    }

    public static /* synthetic */ android.graphics.drawable.Drawable loadDrawable$default(C27569jxf c27569jxf, android.content.Context context, int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object obj) {
        return c27569jxf.OLrzqt(context, i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5);
    }

    public final android.graphics.drawable.Drawable OLrzqt(@NotNull android.content.Context context, @androidx.annotation.DrawableRes int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(context, "");
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        drawable.setBounds(i2, i3, i4, i5);
        return drawable;
    }

    public final void AEQbTJ(android.content.Context context, android.view.View view, java.lang.String str) {
        mAE.OLrzqt(context, view, AnchorPopupWindow.Style.Gray, str, AnchorPopupWindow.VerticalPosition.ABOVE, true, 0, 0, 8388613, 8388613, new android.graphics.Rect(C55298xhM.copydefault(16.0f, context), 0, C55298xhM.copydefault(16.0f, context), 0), new android.graphics.Rect(0, 0, 0, 0), new int[]{0, 0});
    }

    public final void AEQbTJ(@NotNull android.widget.ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500L);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        imageView.startAnimation(rotateAnimation);
    }

    public static /* synthetic */ void saveToClipboard$OKDeFi_invest_biz$default(C27569jxf c27569jxf, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c27569jxf.copydefault(context, str, z);
    }

    public final void copydefault(@NotNull InvestOrderDetailsInfoVo.InvestLineInfo investLineInfo, @NotNull android.content.Context context, @NotNull android.widget.TextView textView, @NotNull android.widget.TextView textView2, @NotNull android.view.View view, @NotNull android.view.View view2) {
        android.view.View view3;
        android.widget.TextView textView3;
        android.view.View view4;
        View.OnClickListener onClickListener;
        Intrinsics.checkNotNullParameter(investLineInfo, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(textView2, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        textView.setText(investLineInfo.getKey());
        java.lang.String keyTip = investLineInfo.getKeyTip();
        if (keyTip != null && keyTip.length() != 0) {
            android.graphics.drawable.Drawable drawableLoadDrawable$default = loadDrawable$default(this, context, C52761wXj.TaskDescription.GGlJim, 0, 0, C55298xhM.OLrzqt(14, context), C55298xhM.OLrzqt(14, context), 12, null);
            if (drawableLoadDrawable$default != null) {
                drawableLoadDrawable$default.setTint(ContextCompat.getColor(context, C52761wXj.Activity.iOIMNp));
            } else {
                drawableLoadDrawable$default = null;
            }
            textView.setCompoundDrawablesRelative(null, null, drawableLoadDrawable$default, null);
            textView.setCompoundDrawablePadding(C55298xhM.OLrzqt(4, context));
            view3 = view2;
            textView3 = textView2;
            onClickListener = null;
            view4 = view;
            textView.setOnClickListener(new Activity(textView, 1000L, context, investLineInfo));
        } else {
            view3 = view2;
            textView3 = textView2;
            view4 = view;
            onClickListener = null;
            textView.setCompoundDrawablesRelative(null, null, null, null);
            textView.setOnClickListener(null);
        }
        java.lang.String copyText = investLineInfo.getCopyText();
        if (copyText != null && copyText.length() != 0) {
            view4.setVisibility(0);
            view3.setOnClickListener(new Application(view3, 1000L, investLineInfo));
        } else {
            view4.setVisibility(8);
        }
        java.lang.String jumpUrl = investLineInfo.getJumpUrl();
        if (jumpUrl == null || jumpUrl.length() == 0) {
            textView3.setText(investLineInfo.getValue());
            textView3.setOnClickListener(onClickListener);
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.text.style.UnderlineSpan underlineSpan = new android.text.style.UnderlineSpan();
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33129mqd.gEmmrt(investLineInfo.getValue()));
        spannableStringBuilder.setSpan(underlineSpan, length, spannableStringBuilder.length(), 17);
        textView3.setText(new android.text.SpannedString(spannableStringBuilder));
        textView3.setOnClickListener(new StateListAnimator(textView3, 1000L, investLineInfo));
    }

    public static /* synthetic */ void setTitleStyle$OKDeFi_invest_biz$default(C27569jxf c27569jxf, C33537myN c33537myN, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = C52761wXj.LoaderManager.hrNTAI;
        }
        if ((i3 & 2) != 0) {
            i2 = ContextCompat.getColor(c33537myN.getContext(), C52761wXj.Activity.gLWkOL);
        }
        c27569jxf.EZpvd(c33537myN, i, i2);
    }

    public final void EZpvd(@NotNull C33537myN c33537myN, @androidx.annotation.StyleRes int i, @androidx.annotation.ColorInt int i2) {
        Intrinsics.checkNotNullParameter(c33537myN, "");
        TextViewCompat.setTextAppearance(c33537myN.getTitle(), i);
        c33537myN.setTitleColor(i2);
    }

    public static /* synthetic */ void setStatusBarsStyle$OKDeFi_invest_biz$default(C27569jxf c27569jxf, android.app.Activity activity, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = ContextCompat.getColor(activity, C52761wXj.Activity.registerUser);
        }
        c27569jxf.OLrzqt(activity, i);
    }

    public final void OLrzqt(@NotNull android.app.Activity activity, @androidx.annotation.ColorInt int i) {
        Intrinsics.checkNotNullParameter(activity, "");
        boolean z = !C27543jxF.KWHzl(activity);
        C33567myr.AEQbTJ(activity, z);
        activity.getWindow().setNavigationBarColor(i);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView());
        Intrinsics.checkNotNullExpressionValue(insetsController, "");
        insetsController.setAppearanceLightStatusBars(z);
        insetsController.setAppearanceLightNavigationBars(z);
    }

    public final void AEQbTJ(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        Glide.KWHzl(imageView).EZpvd(str).AEQbTJ(ContextCompat.getDrawable(imageView.getContext(), i)).OLrzqt(ContextCompat.getDrawable(imageView.getContext(), i)).EZpvd(imageView);
    }

    public final int copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 65) {
            if (iHashCode != 66) {
                if (iHashCode == 68 && str.equals("D")) {
                    return C52761wXj.Activity.DQzvGN;
                }
            } else if (str.equals("B")) {
                return C52761wXj.Activity.gdmIOq;
            }
        } else if (str.equals(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
            return EZpvd(C52761wXj.ActionBar.DNMMPQ, context);
        }
        return EZpvd(C52761wXj.ActionBar.DNMMPQ, context);
    }

    public final int copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 65) {
            if (iHashCode != 66) {
                if (iHashCode == 68 && str.equals("D")) {
                    return Color.parseColor("#EC1E49");
                }
            } else if (str.equals("B")) {
                return Color.parseColor("#E8A803");
            }
        } else if (str.equals(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS)) {
            return Color.parseColor("#56FF07");
        }
        return Color.parseColor("#56FF07");
    }

    public final void OLrzqt(@NotNull android.widget.ImageView imageView, java.lang.String str, @androidx.annotation.DrawableRes int i, C5448Sc c5448Sc, C5448Sc c5448Sc2) {
        Intrinsics.checkNotNullParameter(imageView, "");
        if (str == null || str.length() == 0) {
            C5335Nt<android.graphics.drawable.Drawable> c5335NtOLrzqt = Glide.KWHzl(imageView).OLrzqt(java.lang.Integer.valueOf(i));
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            if (c5448Sc2 != null) {
                c5335NtOLrzqt = c5335NtOLrzqt.OLrzqt((RX<?>) c5448Sc2);
            }
            c5335NtOLrzqt.EZpvd(imageView);
            return;
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
        if (c5448Sc != null) {
            c5335NtEZpvd = c5335NtEZpvd.OLrzqt((RX<?>) c5448Sc);
        }
        c5335NtEZpvd.AEQbTJ(i).copydefault(i).KWHzl(i).EZpvd(imageView);
    }

    public final void OLrzqt(@NotNull android.widget.ImageView imageView, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        android.graphics.drawable.Drawable drawable = ResourcesCompat.getDrawable(imageView.getResources(), i, imageView.getContext().getTheme());
        if (drawable != null) {
            drawable.setAutoMirrored(true);
            imageView.setImageDrawable(drawable);
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return str;
        }
        if (z2) {
            return str + " ← ";
        }
        return " → " + str;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable generateSolidBackground$default(C27569jxf c27569jxf, android.content.Context context, int i, java.lang.Integer num, float f, java.lang.Integer num2, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        java.lang.Integer num3 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            f = 0.0f;
        }
        return c27569jxf.EZpvd(context, i3, num3, f, (i2 & 16) != 0 ? null : num2);
    }

    public final android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context, int i, @androidx.annotation.ColorRes java.lang.Integer num, float f, @androidx.annotation.ColorRes java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (num != null) {
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, num.intValue())));
        }
        if (f > 0.0f && num2 != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, num2.intValue()));
        }
        return gradientDrawable;
    }

    public static /* synthetic */ android.graphics.drawable.Drawable generateCircleBackground$default(C27569jxf c27569jxf, android.content.Context context, int i, java.lang.Integer num, float f, java.lang.Integer num2, int i2, java.lang.Object obj) {
        java.lang.Integer num3 = (i2 & 4) != 0 ? null : num;
        if ((i2 & 8) != 0) {
            f = 0.0f;
        }
        return c27569jxf.copydefault(context, i, num3, f, (i2 & 16) != 0 ? null : num2);
    }

    public final android.graphics.drawable.Drawable copydefault(@NotNull android.content.Context context, int i, @androidx.annotation.ColorRes java.lang.Integer num, float f, @androidx.annotation.ColorRes java.lang.Integer num2) {
        Intrinsics.checkNotNullParameter(context, "");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setSize(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (num != null) {
            gradientDrawable.setColor(android.content.res.ColorStateList.valueOf(ContextCompat.getColor(context, num.intValue())));
        }
        if (f > 0.0f && num2 != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, num2.intValue()));
        }
        return gradientDrawable;
    }

    public static /* synthetic */ void loadCircularImage$default(C27569jxf c27569jxf, android.widget.ImageView imageView, java.lang.String str, float f, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            f = 0.0f;
        }
        c27569jxf.OLrzqt(imageView, str, f, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : drawable);
    }

    public final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull java.lang.String str, float f, @androidx.annotation.ColorInt java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return;
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = Glide.KWHzl(imageView).EZpvd(str);
        Intrinsics.checkNotNullExpressionValue(c5335NtEZpvd, "");
        if (f > 0.0f && num != null) {
            c5335NtEZpvd = (C5335Nt) c5335NtEZpvd.EZpvd((NN<android.graphics.Bitmap>) new C57660ymc(imageView.getContext(), f, num.intValue(), false));
        }
        c5335NtEZpvd.OLrzqt((RX<?>) new C5448Sc().EZpvd(drawable).OLrzqt(drawable)).EZpvd(imageView);
    }

    public static /* synthetic */ void loadTokenLogoGroup$default(C27569jxf c27569jxf, C27212jqt c27212jqt, java.util.List list, int i, float f, java.lang.Integer num, android.graphics.drawable.Drawable drawable, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            f = 0.5f;
        }
        c27569jxf.EZpvd(c27212jqt, (java.util.List<java.lang.String>) list, i, f, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : drawable);
    }

    public final void EZpvd(@NotNull C27212jqt c27212jqt, @NotNull java.util.List<java.lang.String> list, @androidx.annotation.LayoutRes int i, float f, @androidx.annotation.ColorInt java.lang.Integer num, android.graphics.drawable.Drawable drawable) {
        Intrinsics.checkNotNullParameter(c27212jqt, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(c27212jqt.getContext());
        c27212jqt.removeAllViews();
        for (java.lang.String str : list) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(i, (android.view.ViewGroup) c27212jqt, false);
            Intrinsics.copydefault(viewInflate, "");
            android.widget.ImageView imageView = (android.widget.ImageView) viewInflate;
            OLrzqt.OLrzqt(imageView, str, f, num, drawable);
            c27212jqt.addView(imageView);
        }
    }

    public final void KWHzl(@NotNull android.widget.TextView textView, @androidx.annotation.DrawableRes int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i, context);
        android.graphics.drawable.Drawable drawableMutate = drawableEZpvd != null ? drawableEZpvd.mutate() : null;
        if (drawableMutate != null) {
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iCopydefault = C55298xhM.copydefault(16.0f, context2);
            android.content.Context context3 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawableMutate.setBounds(0, 0, iCopydefault, C55298xhM.copydefault(16.0f, context3));
            DrawableCompat.setTint(drawableMutate, C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
            textView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(@NotNull android.content.Context context, @NotNull InterfaceC24178iXu.LoaderManager loaderManager) {
        java.lang.String strAYXKKw;
        java.lang.String string;
        java.lang.String string2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(loaderManager, "");
        if (loaderManager.valueOf()) {
            C27496jwL.showDialog$default(C27496jwL.EZpvd, context, null, C33070mpX.AYXKKw(C25493ixk.FragmentManager.QSLkRj), null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.hrNTAI), null, null, null, false, 1978, null);
            return;
        }
        int iOLrzqt = loaderManager.OLrzqt();
        if (iOLrzqt == 1) {
            strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.OJuSTm);
        } else {
            if (iOLrzqt == 2) {
                string = context.getString(C25493ixk.FragmentManager.OxVOHk);
                Intrinsics.checkNotNullExpressionValue(string, "");
                C27496jwL c27496jwL = C27496jwL.EZpvd;
                if (!C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(loaderManager.OLrzqt()))) {
                    string2 = context.getString(C25493ixk.FragmentManager.OFhtUX);
                } else {
                    string2 = context.getString(C25493ixk.FragmentManager.fQQVvf);
                }
                C27496jwL.showDialog$default(c27496jwL, context, string2, string, null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RckOJh), null, null, null, false, 1976, null);
            }
            if (iOLrzqt == 3 || iOLrzqt == 4 || iOLrzqt == 5 || iOLrzqt == 7) {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.sILrnl);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.hKJZrr);
            }
        }
        string = strAYXKKw;
        C27496jwL c27496jwL2 = C27496jwL.EZpvd;
        if (!C27577jxn.copydefault.EZpvd(java.lang.Integer.valueOf(loaderManager.OLrzqt()))) {
        }
        C27496jwL.showDialog$default(c27496jwL2, context, string2, string, null, false, false, C33070mpX.AYXKKw(C25493ixk.FragmentManager.RckOJh), null, null, null, false, 1976, null);
    }

    public final int copydefault(boolean z) {
        if (z) {
            return C33070mpX.copydefault(C25493ixk.TaskDescription.AYXKKw);
        }
        return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
    }

    public final void EZpvd(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "");
        android.view.View childAt = viewPager2.getChildAt(0);
        if (childAt != null) {
            childAt.setOverScrollMode(2);
        }
    }

    public final void copydefault(@NotNull android.widget.TextView textView, long j, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(textView, "");
        long millis = java.util.concurrent.TimeUnit.DAYS.toMillis(1L);
        long millis2 = java.util.concurrent.TimeUnit.HOURS.toMillis(1L);
        long millis3 = java.util.concurrent.TimeUnit.MINUTES.toMillis(1L);
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (jCurrentTimeMillis < j) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(C33069mpW.KWHzl(context, C25493ixk.FragmentManager.fJNWhG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("duration", copydefault(millis, textView, millis2, millis3, j - jCurrentTimeMillis)))));
        } else if (j <= jCurrentTimeMillis && jCurrentTimeMillis <= j2) {
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            textView.setText(C33069mpW.KWHzl(context2, C25493ixk.FragmentManager.fARcdN, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("duration", copydefault(millis, textView, millis2, millis3, j2 - jCurrentTimeMillis)))));
        } else {
            textView.setVisibility(8);
        }
        boolean z = jCurrentTimeMillis >= j;
        android.content.Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(generateCircleBackground$default(this, context3, i2, java.lang.Integer.valueOf(z ? C52761wXj.Activity.DcMfJK : C52761wXj.Activity.gdmIOq), 0.0f, null, 24, null), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        textView.setCompoundDrawablePadding(i);
    }

    public static final java.lang.String copydefault(long j, android.widget.TextView textView, long j2, long j3, long j4) {
        if (j4 >= j) {
            int iEZpvd = yII.EZpvd(C33129mqd.AEQbTJ(java.lang.Long.valueOf(j4)) / j);
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            return pTD.EZpvd(context, C25493ixk.Application.copydefault, iEZpvd, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iEZpvd))));
        }
        if (j4 >= j2) {
            int iAhwBna = C33129mqd.AhwBna(java.lang.Double.valueOf(java.lang.Math.ceil(C33129mqd.AEQbTJ(java.lang.Long.valueOf(j4)) / j2)));
            android.content.Context context2 = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            return pTD.EZpvd(context2, C25493ixk.Application.EZpvd, iAhwBna, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna))));
        }
        if (j4 < j3) {
            return "1";
        }
        int iAhwBna2 = C33129mqd.AhwBna(java.lang.Double.valueOf(java.lang.Math.ceil(C33129mqd.AEQbTJ(java.lang.Long.valueOf(j4)) / j3)));
        android.content.Context context3 = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        return pTD.EZpvd(context3, C25493ixk.Application.KWHzl, iAhwBna2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(iAhwBna2))));
    }

    public final int EZpvd(@androidx.annotation.AttrRes int i, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public final android.content.Context AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        android.app.Activity activityAEQbTJ = C54819xWm.KWHzl().AEQbTJ();
        return activityAEQbTJ != null ? activityAEQbTJ : context;
    }

    public final int copydefault(int i, int i2) {
        return Color.argb(i2 * 25, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static /* synthetic */ int getAssetColor$default(C27569jxf c27569jxf, android.content.Context context, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = context.getColor(C52761wXj.Activity.itxZVF);
        }
        return c27569jxf.EZpvd(context, str, i);
    }

    public final int EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC9851bdQ interfaceC9851bdQ = (InterfaceC9851bdQ) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC9851bdQ.class));
        return (interfaceC9851bdQ == null || interfaceC9851bdQ.fetchVPNInfo()) ? C33129mqd.AEQbTJ(str, "0") ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : C33129mqd.gEmmrt(str, "0") ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, context, 0.0f, 2, null) : i : i;
    }

    public final void copydefault(@NotNull android.content.Context context, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) ContextCompat.getSystemService(context, android.content.ClipboardManager.class);
        if (clipboardManager == null) {
            return;
        }
        clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        if (z) {
            C55328xhq.show$default(C55328xhq.OLrzqt, context.getString(C25493ixk.FragmentManager.sendBehavioSecData), ContextCompat.getDrawable(context, C52761wXj.TaskDescription.FYtjSf), 0, (java.lang.Integer) null, 0, 0, 60, (java.lang.Object) null);
        }
    }

    public final android.graphics.drawable.Drawable EZpvd(@NotNull android.content.Context context, int i, @androidx.annotation.ColorRes @NotNull java.util.List<java.lang.Integer> list, @NotNull GradientDrawable.Orientation orientation, float f, @androidx.annotation.ColorRes java.lang.Integer num) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(orientation, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(ContextCompat.getColor(context, ((java.lang.Number) it.next()).intValue())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, CollectionsKt___CollectionsKt.fARcdN((java.util.Collection<java.lang.Integer>) arrayList));
        gradientDrawable.setCornerRadius(C55298xhM.dpInt$default(i, (android.content.Context) null, 1, (java.lang.Object) null));
        if (f > 0.0f && num != null) {
            gradientDrawable.setStroke(C55298xhM.dpInt$default(f, (android.content.Context) null, 1, (java.lang.Object) null), ContextCompat.getColor(context, num.intValue()));
        }
        return gradientDrawable;
    }
}

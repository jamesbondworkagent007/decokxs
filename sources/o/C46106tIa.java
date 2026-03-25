package o;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.components.track.TrackChannel;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.data.OrbitSettingUpgradeCardType;
import com.okinc.social_trade_api.data.AffiliatePartnerBeanForPlanet;
import com.okinc.uilab.item.OKRegularCell;
import java.util.Date;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C46106tIa;
import o.C46388tSm;
import o.C47501trL;
import o.C52761wXj;
import o.InterfaceC46130tIy;
import o.InterfaceC8101awQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46106tIa extends androidx.recyclerview.widget.ListAdapter<InterfaceC46130tIy, RecyclerView.ViewHolder> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public static final int OLrzqt = android.view.View.generateViewId();
    public final Function1<InterfaceC46130tIy.Activity, Unit> AEQbTJ;
    public final androidx.fragment.app.FragmentManager KWHzl;
    public final Function1<InterfaceC46130tIy, Unit> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.tIy, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tIy$Activity, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C46106tIa(@NotNull Function1<? super InterfaceC46130tIy, Unit> function1, @NotNull Function1<? super InterfaceC46130tIy.Activity, Unit> function12, androidx.fragment.app.FragmentManager fragmentManager) {
        super(InterfaceC46130tIy.Companion.copydefault());
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.copydefault = function1;
        this.AEQbTJ = function12;
        this.KWHzl = fragmentManager;
    }

    /* JADX INFO: renamed from: o.tIa$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIa.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        InterfaceC46130tIy item = getItem(i);
        if (item instanceof InterfaceC46130tIy.Dialog) {
            return 2;
        }
        if ((item instanceof InterfaceC46130tIy.TaskDescription) || (item instanceof InterfaceC46130tIy.LoaderManager)) {
            return 3;
        }
        if (item instanceof InterfaceC46130tIy.Activity) {
            return 4;
        }
        if (item instanceof InterfaceC46130tIy.PendingIntent) {
            return 5;
        }
        if (item instanceof InterfaceC46130tIy.ActionBar) {
            return 6;
        }
        return item instanceof InterfaceC46130tIy.StateListAnimator ? 7 : 1;
    }

    /* JADX INFO: renamed from: o.tIa$Activity */
    public static final class Activity extends RecyclerView.ViewHolder {
        public final Function1<InterfaceC46130tIy, Unit> AEQbTJ;
        public final android.widget.TextView EZpvd;
        public final OKRegularCell OLrzqt;

        /* JADX INFO: renamed from: o.tIa$Activity$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ Activity AYXKKw;
            public final /* synthetic */ InterfaceC46130tIy EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ Ref.ObjectRef OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, android.view.View view2, Activity activity, InterfaceC46130tIy interfaceC46130tIy, Ref.ObjectRef objectRef) {
                this.KWHzl = view;
                this.AEQbTJ = j;
                this.copydefault = view2;
                this.AYXKKw = activity;
                this.EZpvd = interfaceC46130tIy;
                this.OLrzqt = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    this.AYXKKw.AEQbTJ.invoke(this.EZpvd);
                    Function0 function0 = (Function0) this.OLrzqt.element;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tIy, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull OKRegularCell oKRegularCell, @NotNull Function1<? super InterfaceC46130tIy, Unit> function1) {
            super(oKRegularCell);
            Intrinsics.checkNotNullParameter(oKRegularCell, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = oKRegularCell;
            this.AEQbTJ = function1;
            android.view.View viewFindViewById = oKRegularCell.findViewById(C46106tIa.OLrzqt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            this.EZpvd = (android.widget.TextView) viewFindViewById;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, o.tId] */
        /* JADX WARN: Type inference failed for: r0v9, types: [T, o.tIc] */
        public final void AEQbTJ(@NotNull final InterfaceC46130tIy interfaceC46130tIy) {
            Intrinsics.checkNotNullParameter(interfaceC46130tIy, "");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            this.OLrzqt.setTitle(C33070mpX.OLrzqt(interfaceC46130tIy.copydefault(), this.OLrzqt.getContext()));
            this.EZpvd.setText(interfaceC46130tIy.AEQbTJ());
            if (interfaceC46130tIy instanceof InterfaceC46130tIy.LoaderManager) {
                this.OLrzqt.setTitle(C33070mpX.OLrzqt(((InterfaceC46130tIy.LoaderManager) interfaceC46130tIy).copydefault(), this.OLrzqt.getContext()));
                tRT.KWHzl(this.EZpvd);
                android.widget.TextView textView = this.EZpvd;
                int i = C52761wXj.Activity.QwvEab;
                android.content.Context context = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView.setTextColor(C33070mpX.OLrzqt(i, context));
                ?? r0 = new Function0() { // from class: o.tId
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46106tIa.Activity.KWHzl(this.AEQbTJ, interfaceC46130tIy);
                    }
                };
                objectRef.element = r0;
                ((Function0) r0).invoke();
            } else if (interfaceC46130tIy instanceof InterfaceC46130tIy.TaskDescription) {
                InterfaceC46130tIy.TaskDescription taskDescription = (InterfaceC46130tIy.TaskDescription) interfaceC46130tIy;
                android.text.SpannableString spannableString = new android.text.SpannableString(C33070mpX.OLrzqt(taskDescription.copydefault(), this.OLrzqt.getContext()) + "  ");
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(this.OLrzqt.getContext(), C52761wXj.TaskDescription.GGlJim);
                if (drawable == null) {
                    return;
                }
                drawable.setBounds(0, 0, C55298xhM.dp2px$default(19.0f, null, 1, null), C55298xhM.dp2px$default(19.0f, null, 1, null));
                int i2 = C52761wXj.Activity.QwvEab;
                android.content.Context context2 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                C33057mpK.copydefault(drawable, C33070mpX.OLrzqt(i2, context2));
                spannableString.setSpan(new android.text.style.ImageSpan(drawable, 0), spannableString.length() - 1, spannableString.length(), 18);
                this.OLrzqt.setTitle(spannableString);
                tRT.KWHzl(this.EZpvd);
                android.widget.TextView textView2 = this.EZpvd;
                int i3 = C52761wXj.Activity.QwvEab;
                android.content.Context context3 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView2.setTextColor(C33070mpX.OLrzqt(i3, context3));
                AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanetGEmmrt = taskDescription.gEmmrt();
                java.lang.Integer numValueOf = affiliatePartnerBeanForPlanetGEmmrt != null ? java.lang.Integer.valueOf(affiliatePartnerBeanForPlanetGEmmrt.getCurrentNum()) : null;
                AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanetGEmmrt2 = taskDescription.gEmmrt();
                pUU.KWHzl("ProfileSettingAdapter", "curNum: " + numValueOf + ", maxNum: " + (affiliatePartnerBeanForPlanetGEmmrt2 != null ? java.lang.Integer.valueOf(affiliatePartnerBeanForPlanetGEmmrt2.getMaxNum()) : null));
                AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanetGEmmrt3 = taskDescription.gEmmrt();
                int currentNum = affiliatePartnerBeanForPlanetGEmmrt3 != null ? affiliatePartnerBeanForPlanetGEmmrt3.getCurrentNum() : 0;
                AffiliatePartnerBeanForPlanet affiliatePartnerBeanForPlanetGEmmrt4 = taskDescription.gEmmrt();
                int maxNum = affiliatePartnerBeanForPlanetGEmmrt4 != null ? affiliatePartnerBeanForPlanetGEmmrt4.getMaxNum() : 0;
                if (currentNum <= 0 || maxNum <= 0) {
                    this.EZpvd.setText(C47501trL.Fragment.aJFbMH);
                } else {
                    this.EZpvd.setText(C33069mpW.copydefault(C47501trL.Fragment.alsFma, C56424yEw.gEmmrt(C56390yDp.OLrzqt("linked", java.lang.String.valueOf(currentNum)), C56390yDp.OLrzqt("max", java.lang.String.valueOf(maxNum)))));
                }
                android.widget.LinearLayout linearLayoutCopydefault = this.OLrzqt.copydefault();
                int childCount = linearLayoutCopydefault.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    android.view.View childAt = linearLayoutCopydefault.getChildAt(i4);
                    Intrinsics.checkNotNullExpressionValue(childAt, "");
                    childAt.setOnClickListener(new View.OnClickListener() { // from class: o.tHZ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C46106tIa.Activity.OLrzqt(this.EZpvd, view);
                        }
                    });
                }
                ?? r02 = new Function0() { // from class: o.tIc
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46106tIa.Activity.EZpvd(this.KWHzl);
                    }
                };
                objectRef.element = r02;
                ((Function0) r02).invoke();
            } else if (interfaceC46130tIy instanceof InterfaceC46130tIy.FragmentManager) {
                InterfaceC46130tIy.FragmentManager fragmentManager = (InterfaceC46130tIy.FragmentManager) interfaceC46130tIy;
                this.OLrzqt.setTitle(C33070mpX.OLrzqt(fragmentManager.copydefault(), this.OLrzqt.getContext()));
                tRT.KWHzl(this.EZpvd);
                android.widget.TextView textView3 = this.EZpvd;
                int i5 = C52761wXj.Activity.QwvEab;
                android.content.Context context4 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                textView3.setTextColor(C33070mpX.OLrzqt(i5, context4));
                this.EZpvd.setText(fragmentManager.AEQbTJ());
            } else if (interfaceC46130tIy.KWHzl()) {
                android.widget.TextView textView4 = this.EZpvd;
                int i6 = C52761wXj.Activity.QwvEab;
                android.content.Context context5 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView4.setTextColor(C33070mpX.OLrzqt(i6, context5));
                android.widget.TextView textView5 = this.EZpvd;
                int i7 = C52761wXj.TaskDescription.gdmIOq;
                android.content.Context context6 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(i7, context6);
                if (drawableEZpvd != null) {
                    android.content.Context context7 = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context7, "");
                    C33057mpK.EZpvd(drawableEZpvd, C55298xhM.copydefault(6.0f, context7));
                    int i8 = C52761wXj.Activity.DQzvGN;
                    android.content.Context context8 = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context8, "");
                    C33057mpK.copydefault(drawableEZpvd, C33070mpX.OLrzqt(i8, context8));
                } else {
                    drawableEZpvd = null;
                }
                textView5.setCompoundDrawablesRelative(drawableEZpvd, null, this.EZpvd.getCompoundDrawablesRelative()[2], null);
            } else {
                android.widget.TextView textView6 = this.EZpvd;
                int i9 = C52761wXj.Activity.QwvEab;
                android.content.Context context9 = this.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                textView6.setTextColor(C33070mpX.OLrzqt(i9, context9));
                android.widget.TextView textView7 = this.EZpvd;
                textView7.setCompoundDrawablesRelative(null, null, textView7.getCompoundDrawablesRelative()[2], null);
            }
            OKRegularCell oKRegularCell = this.OLrzqt;
            oKRegularCell.setOnClickListener(new ActionBar(oKRegularCell, 300L, oKRegularCell, this, interfaceC46130tIy, objectRef));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit KWHzl(Activity activity, InterfaceC46130tIy interfaceC46130tIy) {
            android.graphics.drawable.Drawable drawableEZpvd;
            java.lang.String strKWHzl;
            java.lang.Long fieldNames;
            boolean zAubY = C46386tSk.copydefault.AubY(tKU.Companion.KWHzl().KWHzl());
            android.widget.TextView textView = activity.EZpvd;
            if (zAubY) {
                int i = C52761wXj.TaskDescription.gdmIOq;
                android.content.Context context = activity.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                drawableEZpvd = C33070mpX.EZpvd(i, context);
                if (drawableEZpvd != null) {
                    android.content.Context context2 = activity.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C33057mpK.EZpvd(drawableEZpvd, C55298xhM.copydefault(6.0f, context2));
                    int i2 = C52761wXj.Activity.DQzvGN;
                    android.content.Context context3 = activity.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    C33057mpK.copydefault(drawableEZpvd, C33070mpX.OLrzqt(i2, context3));
                } else {
                    drawableEZpvd = null;
                }
            }
            textView.setCompoundDrawablesRelative(drawableEZpvd, null, activity.EZpvd.getCompoundDrawablesRelative()[2], null);
            if (zAubY) {
                activity.EZpvd.setText("");
            } else {
                CurveResetInfo curveResetInfoAhwBna = ((InterfaceC46130tIy.LoaderManager) interfaceC46130tIy).AhwBna();
                if (curveResetInfoAhwBna != null && (strKWHzl = curveResetInfoAhwBna.KWHzl()) != null && (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strKWHzl)) != null) {
                    activity.EZpvd.setText(pTA.formatDate$default(new Date(fieldNames.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null));
                }
            }
            return Unit.INSTANCE;
        }

        public static final void OLrzqt(Activity activity, android.view.View view) {
            android.content.Context context = activity.OLrzqt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.copydefault(C47501trL.Fragment.DcMfJKDCKfqPDCfLja);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C47501trL.Fragment.hfdhUn), new View.OnClickListener() { // from class: o.tIb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C46106tIa.Activity.copydefault(viewOnClickListenerC54939xaY, view2);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }

        public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
            viewOnClickListenerC54939xaY.dismiss();
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final Unit EZpvd(Activity activity) {
            android.graphics.drawable.Drawable drawableEZpvd;
            android.widget.TextView textView = activity.EZpvd;
            if (C46386tSk.copydefault.getFieldNames(tKU.Companion.KWHzl().KWHzl())) {
                int i = C52761wXj.TaskDescription.gdmIOq;
                android.content.Context context = activity.OLrzqt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                drawableEZpvd = C33070mpX.EZpvd(i, context);
                if (drawableEZpvd != null) {
                    android.content.Context context2 = activity.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    C33057mpK.EZpvd(drawableEZpvd, C55298xhM.copydefault(6.0f, context2));
                    int i2 = C52761wXj.Activity.DQzvGN;
                    android.content.Context context3 = activity.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    C33057mpK.copydefault(drawableEZpvd, C33070mpX.OLrzqt(i2, context3));
                } else {
                    drawableEZpvd = null;
                }
            }
            textView.setCompoundDrawablesRelative(drawableEZpvd, null, activity.EZpvd.getCompoundDrawablesRelative()[2], null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tIa$Application */
    public static final class Application extends RecyclerView.ViewHolder {
        public final C46276tOi EZpvd;
        public final Function1<InterfaceC46130tIy.Activity, Unit> KWHzl;

        /* JADX INFO: renamed from: o.tIa$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ InterfaceC46130tIy.Activity EZpvd;
            public final /* synthetic */ Application OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, Application application, InterfaceC46130tIy.Activity activity) {
                this.AEQbTJ = view;
                this.copydefault = j;
                this.OLrzqt = application;
                this.EZpvd = activity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                    this.OLrzqt.KWHzl.invoke(this.EZpvd);
                }
            }
        }

        /* JADX INFO: renamed from: o.tIa$Application$StateListAnimator */
        public static final class StateListAnimator implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ tOI EZpvd;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public StateListAnimator(android.view.View view, long j, tOI toi, java.lang.String str) {
                this.OLrzqt = view;
                this.AEQbTJ = j;
                this.EZpvd = toi;
                this.copydefault = str;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_BannerClose_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                    this.EZpvd.copydefault.setVisibility(8);
                    C46386tSk.copydefault.AuCTel(this.copydefault);
                    pUU.KWHzl("qjf", "alertBanner close button action");
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super o.tIy$Activity, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@NotNull C46276tOi c46276tOi, @NotNull Function1<? super InterfaceC46130tIy.Activity, Unit> function1) {
            super(c46276tOi.getRoot());
            Intrinsics.checkNotNullParameter(c46276tOi, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = c46276tOi;
            this.KWHzl = function1;
        }

        public final void copydefault(@NotNull InterfaceC46130tIy.Activity activity) {
            java.lang.Integer orbiterPlusExpireStatus;
            Intrinsics.checkNotNullParameter(activity, "");
            tOI toi = this.EZpvd.KWHzl;
            C46388tSm.TaskDescription taskDescription = C46388tSm.Companion;
            OrbitBeanResp orbitBeanRespValues = taskDescription.KWHzl().values();
            java.lang.String strCopydefault = taskDescription.KWHzl().copydefault();
            pUU.KWHzl("qjf", "ProfileSettingAdapter->orbiterPlusExpireStatus = " + (orbitBeanRespValues != null ? orbitBeanRespValues.getOrbiterPlusExpireStatus() : null));
            C46386tSk c46386tSk = C46386tSk.copydefault;
            pUU.KWHzl("qjf", "ProfileSettingAdapter->orbiterPlusAlertBannerClosed = " + c46386tSk.valueOf(strCopydefault));
            if (orbitBeanRespValues != null && (orbiterPlusExpireStatus = orbitBeanRespValues.getOrbiterPlusExpireStatus()) != null && orbiterPlusExpireStatus.intValue() == 2 && !c46386tSk.valueOf(strCopydefault)) {
                C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_Banner_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                toi.copydefault.setVisibility(0);
                int i = C47501trL.Fragment.Ufzxmz;
                OrbitBeanResp orbitBeanRespValues2 = taskDescription.KWHzl().values();
                toi.copydefault.setTitle(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C33129mqd.gEmmrt(orbitBeanRespValues2 != null ? orbitBeanRespValues2.getOrbiterPlusDaysLeft() : null)))));
                toi.copydefault.AEQbTJ().setVisibility(0);
                toi.copydefault.setPrimaryAction(C33070mpX.AYXKKw(C47501trL.Fragment.DNMMPQ), new Function0() { // from class: o.tIf
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C46106tIa.Application.EZpvd(this.EZpvd);
                    }
                });
                android.widget.ImageView imageViewOLrzqt = toi.copydefault.OLrzqt();
                imageViewOLrzqt.setOnClickListener(new StateListAnimator(imageViewOLrzqt, 1000L, toi, strCopydefault));
            }
            InterfaceC8101awQ interfaceC8101awQ = (InterfaceC8101awQ) C43251rlk.OLrzqt(InterfaceC8101awQ.class);
            if (interfaceC8101awQ != null) {
                android.widget.ImageView imageView = toi.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                InterfaceC8101awQ.Activity.loadUserAvatar$default(interfaceC8101awQ, imageView, false, null, 6, null);
            }
            toi.AYXKKw.setText(activity.djBIcL());
            android.widget.TextView textView = toi.KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            C46102tHx c46102tHx = toi.OLrzqt;
            c46102tHx.setOnClickListener(new ActionBar(c46102tHx, 1000L, this, activity));
        }

        public static final Unit EZpvd(Application application) {
            pUU.KWHzl("qjf", "alertBanner action click");
            C32866mlf.onEvent$default("Orbit_ExpiringOrbiterPlus_Banner_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            kOH koh = (kOH) C43248rlh.KWHzl.AEQbTJ(kOH.class);
            android.content.Context context = application.EZpvd.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            koh.KWHzl(context);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tIa$Dialog */
    public static final class Dialog extends RecyclerView.ViewHolder {
        public final android.view.View AEQbTJ;
        public final Function1<InterfaceC46130tIy, Unit> EZpvd;
        public final C46243tNc OLrzqt;

        /* JADX INFO: renamed from: o.tIa$Dialog$Activity */
        public final /* synthetic */ class Activity {
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[OrbitSettingUpgradeCardType.values().length];
                try {
                    iArr[OrbitSettingUpgradeCardType.NON_ORBITER_TO_ORBITER.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[OrbitSettingUpgradeCardType.ORBITER_TO_ORBITER_PLUS.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[OrbitSettingUpgradeCardType.ORBITER_PLUS_RECALL.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                OLrzqt = iArr;
            }
        }

        /* JADX INFO: renamed from: o.tIa$Dialog$Application */
        public static final class Application implements View.OnClickListener {
            public final /* synthetic */ Dialog AEQbTJ;
            public final /* synthetic */ long EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ InterfaceC46130tIy.PendingIntent OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Application(android.view.View view, long j, android.view.View view2, Dialog dialog, InterfaceC46130tIy.PendingIntent pendingIntent) {
                this.copydefault = view;
                this.EZpvd = j;
                this.KWHzl = view2;
                this.AEQbTJ = dialog;
                this.OLrzqt = pendingIntent;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    this.AEQbTJ.EZpvd.invoke(this.OLrzqt);
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super o.tIy, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Dialog(@NotNull android.view.View view, @NotNull C46243tNc c46243tNc, @NotNull Function1<? super InterfaceC46130tIy, Unit> function1) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(c46243tNc, "");
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = view;
            this.OLrzqt = c46243tNc;
            this.EZpvd = function1;
        }

        public final void EZpvd(@NotNull InterfaceC46130tIy.PendingIntent pendingIntent) {
            Intrinsics.checkNotNullParameter(pendingIntent, "");
            this.AEQbTJ.setContentDescription("profile_settings_orbit_background");
            android.view.View view = this.AEQbTJ;
            view.setOnClickListener(new Application(view, 300L, view, this, pendingIntent));
            int i = Activity.OLrzqt[pendingIntent.gEmmrt().ordinal()];
            if (i == 1) {
                this.OLrzqt.AhwBna.setText(C47501trL.Fragment.ffGIBT);
                this.OLrzqt.AEQbTJ.setText(C47501trL.Fragment.OuxcSI);
            } else if (i == 2) {
                C32866mlf.onEvent$default("Orbit_PersonalProfile_OrbiterPlusBanner_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
                this.OLrzqt.AhwBna.setText(C47501trL.Fragment.DLGVGj);
                this.OLrzqt.AEQbTJ.setText(C47501trL.Fragment.gmHjFq);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.OLrzqt.AhwBna.setText(C47501trL.Fragment.UhxbNG);
                this.OLrzqt.AEQbTJ.setText(C47501trL.Fragment.RKcVTr);
            }
        }
    }

    /* JADX INFO: renamed from: o.tIa$LoaderManager */
    public static final class LoaderManager extends RecyclerView.ViewHolder {
        public LoaderManager(android.view.View view) {
            super(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder activity;
        Intrinsics.checkNotNullParameter(viewGroup, "");
        switch (i) {
            case 1:
                android.content.Context context = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                activity = new Activity(KWHzl(context), this.copydefault);
                break;
            case 2:
                android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                int iOLrzqt = C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX);
                android.content.Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView.setPaddingRelative(iOLrzqt, C55298xhM.copydefault(20.0f, context2), C33070mpX.OLrzqt(C52761wXj.StateListAnimator.QUSxYX), 0);
                textView.setLayoutParams(marginLayoutParams);
                textView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
                int i2 = C52761wXj.Activity.QwvEab;
                android.content.Context context3 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView.setTextColor(C33070mpX.OLrzqt(i2, context3));
                return new ActionBar(textView);
            case 3:
                android.content.Context context4 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                activity = new Activity(KWHzl(context4), this.copydefault);
                break;
            case 4:
                C46276tOi c46276tOiAEQbTJ = C46276tOi.AEQbTJ(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c46276tOiAEQbTJ, "");
                activity = new Application(c46276tOiAEQbTJ, this.AEQbTJ);
                break;
            case 5:
                C46243tNc c46243tNcKWHzl = C46243tNc.KWHzl(android.view.LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(c46243tNcKWHzl, "");
                ViewGroup.LayoutParams layoutParams = c46243tNcKWHzl.getRoot().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams2 == null) {
                    marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
                }
                android.content.Context context5 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                marginLayoutParams2.setMarginStart(C55298xhM.copydefault(24.0f, context5));
                android.content.Context context6 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                marginLayoutParams2.setMarginEnd(C55298xhM.copydefault(24.0f, context6));
                android.content.Context context7 = viewGroup.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "");
                marginLayoutParams2.bottomMargin = C55298xhM.copydefault(16.0f, context7);
                c46243tNcKWHzl.getRoot().setLayoutParams(marginLayoutParams2);
                ConstraintLayout root = c46243tNcKWHzl.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "");
                return new Dialog(root, c46243tNcKWHzl, this.copydefault);
            case 6:
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(viewGroup.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                android.content.Context context8 = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "");
                android.view.View fragmentContainerView = new FragmentContainerView(context8);
                fragmentContainerView.setId(android.view.View.generateViewId());
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
                android.content.Context context9 = fragmentContainerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "");
                marginLayoutParams3.setMarginStart(C55298xhM.copydefault(8.0f, context9));
                android.content.Context context10 = fragmentContainerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "");
                marginLayoutParams3.setMarginEnd(C55298xhM.copydefault(8.0f, context10));
                fragmentContainerView.setLayoutParams(marginLayoutParams3);
                linearLayout.addView(fragmentContainerView);
                return new TaskDescription(linearLayout, this.KWHzl);
            case 7:
                android.view.View view = new android.view.View(viewGroup.getContext());
                android.content.Context context11 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "");
                ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, C55298xhM.copydefault(0.5f, context11));
                android.content.Context context12 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "");
                marginLayoutParams4.setMarginStart(C55298xhM.copydefault(24.0f, context12));
                android.content.Context context13 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "");
                marginLayoutParams4.setMarginEnd(C55298xhM.copydefault(24.0f, context13));
                android.content.Context context14 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "");
                marginLayoutParams4.topMargin = C55298xhM.copydefault(8.0f, context14);
                android.content.Context context15 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "");
                marginLayoutParams4.bottomMargin = C55298xhM.copydefault(8.0f, context15);
                view.setLayoutParams(marginLayoutParams4);
                int i3 = C52761wXj.Activity.zuBGHE;
                android.content.Context context16 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "");
                view.setBackgroundColor(C33070mpX.OLrzqt(i3, context16));
                return new LoaderManager(view);
            default:
                throw new java.lang.IllegalArgumentException("Unknown viewType: " + i);
        }
        return activity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder viewHolder, int i) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(viewHolder, "");
        InterfaceC46130tIy item = getItem(i);
        if (viewHolder instanceof Activity) {
            viewHolder.itemView.setContentDescription(item.OLrzqt());
            Intrinsics.copydefault(item);
            ((Activity) viewHolder).AEQbTJ(item);
            return;
        }
        java.lang.Integer numValueOf = null;
        if (viewHolder instanceof ActionBar) {
            if (item instanceof InterfaceC46130tIy.Dialog) {
                int i2 = i + 1;
                numValueOf = java.lang.Integer.valueOf((i2 >= getItemCount() || !(getItem(i2) instanceof InterfaceC46130tIy.ActionBar)) ? C47501trL.Fragment.iPSTqm : C47501trL.Fragment.zhUgOk);
            }
            android.view.View view = viewHolder.itemView;
            if (numValueOf != null) {
                strOLrzqt = numValueOf.intValue() == C47501trL.Fragment.zhUgOk ? "pr_orbit_settings_label_chat" : "pr_orbit_profile_label_profile";
            } else {
                strOLrzqt = item.OLrzqt();
            }
            view.setContentDescription(strOLrzqt);
            ((ActionBar) viewHolder).copydefault(numValueOf);
            return;
        }
        if (viewHolder instanceof Application) {
            viewHolder.itemView.setContentDescription(item.OLrzqt());
            if (item instanceof InterfaceC46130tIy.Activity) {
                ((Application) viewHolder).copydefault((InterfaceC46130tIy.Activity) item);
                return;
            }
            return;
        }
        if (viewHolder instanceof Dialog) {
            viewHolder.itemView.setContentDescription(item.OLrzqt());
            if (item instanceof InterfaceC46130tIy.PendingIntent) {
                ((Dialog) viewHolder).EZpvd((InterfaceC46130tIy.PendingIntent) item);
                return;
            }
            return;
        }
        if (viewHolder instanceof TaskDescription) {
            viewHolder.itemView.setContentDescription(item.OLrzqt());
            ((TaskDescription) viewHolder).copydefault(null);
        }
    }

    /* JADX INFO: renamed from: o.tIa$ActionBar */
    public static final class ActionBar extends RecyclerView.ViewHolder {
        public final android.widget.TextView KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull android.widget.TextView textView) {
            super(textView);
            Intrinsics.checkNotNullParameter(textView, "");
            this.KWHzl = textView;
        }

        public static /* synthetic */ void bind$default(ActionBar actionBar, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = null;
            }
            actionBar.copydefault(num);
        }

        public final void copydefault(java.lang.Integer num) {
            this.KWHzl.setText(num != null ? num.intValue() : C47501trL.Fragment.iPSTqm);
        }
    }

    public final OKRegularCell KWHzl(android.content.Context context) {
        OKRegularCell oKRegularCellBasicCell$default = C46461tVe.basicCell$default(context, null, 2, null);
        oKRegularCellBasicCell$default.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setId(OLrzqt);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextAppearance(C52761wXj.LoaderManager.RdAHlO);
        textView.setTextColor(C33070mpX.OLrzqt(C52761wXj.Activity.QwvEab, context));
        textView.setTextAlignment(6);
        textView.setGravity(16);
        android.graphics.drawable.Drawable drawableEZpvd = C33070mpX.EZpvd(C52761wXj.TaskDescription.DGUQLI, context);
        android.graphics.drawable.Drawable drawableMutate = drawableEZpvd != null ? drawableEZpvd.mutate() : null;
        if (drawableMutate != null) {
            drawableMutate.setTintList(ContextCompat.getColorStateList(context, C52761wXj.Activity.QwvEab));
        }
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableMutate, (android.graphics.drawable.Drawable) null);
        textView.setCompoundDrawablePadding(C55298xhM.copydefault(4.0f, context));
        oKRegularCellBasicCell$default.addView(textView);
        return oKRegularCellBasicCell$default;
    }

    /* JADX INFO: renamed from: o.tIa$TaskDescription */
    public static final class TaskDescription extends RecyclerView.ViewHolder {
        public final android.widget.LinearLayout EZpvd;
        public androidx.fragment.app.Fragment KWHzl;
        public final androidx.fragment.app.FragmentManager OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull android.widget.LinearLayout linearLayout, androidx.fragment.app.FragmentManager fragmentManager) {
            super(linearLayout);
            Intrinsics.checkNotNullParameter(linearLayout, "");
            this.EZpvd = linearLayout;
            this.OLrzqt = fragmentManager;
        }

        public final void copydefault(androidx.fragment.app.Fragment fragment) {
            android.view.View childAt = this.EZpvd.getChildAt(0);
            FragmentContainerView fragmentContainerView = childAt instanceof FragmentContainerView ? (FragmentContainerView) childAt : null;
            if (fragmentContainerView == null || fragment == null || Intrinsics.EZpvd(this.KWHzl, fragment)) {
                return;
            }
            this.KWHzl = fragment;
            androidx.fragment.app.FragmentManager fragmentManager = this.OLrzqt;
            if (fragmentManager != null) {
                androidx.fragment.app.Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(fragmentContainerView.getId());
                if (fragmentFindFragmentById != null) {
                    fragmentManager.beginTransaction().remove(fragmentFindFragmentById).commitNow();
                }
                fragmentManager.beginTransaction().replace(fragmentContainerView.getId(), fragment).commitNow();
            }
        }
    }
}

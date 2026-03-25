package o;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.okex.lite.navigation.ukbanner.UKBannerManager$checkIfUKBannerRequired$1$1;
import com.okinc.okex.lite.navigation.ukbanner.UKBannerManager$setUKBannerType$1$1;
import com.okinc.okex.lite.ukbanner.UKBannerType;
import com.okinc.uilab.banner.OKAlertBanner;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C45716svX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45776swv {
    public static final C45776swv KWHzl = new C45776swv();
    public static final java.util.Map<java.lang.String, androidx.core.util.Consumer<android.content.res.Configuration>> AEQbTJ = new LinkedHashMap();
    public static final java.util.Set<android.app.Activity> copydefault = Collections.newSetFromMap(new WeakHashMap());
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.swv$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[UKBannerType.values().length];
            try {
                iArr[UKBannerType.APPROVED_6OCT23.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[UKBannerType.NOT_APPROVED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX INFO: renamed from: o.swv$ActionBar */
    public static final class ActionBar implements View.OnLayoutChangeListener {
        public final /* synthetic */ android.view.ViewGroup EZpvd;
        public final /* synthetic */ OKAlertBanner KWHzl;

        public ActionBar(android.view.ViewGroup viewGroup, OKAlertBanner oKAlertBanner) {
            this.EZpvd = viewGroup;
            this.KWHzl = oKAlertBanner;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            int height = view.getHeight();
            C43296rmc.AEQbTJ("UK_WARNING_TEST", "insertUKWarningBanner topMargin: " + height);
            android.view.ViewGroup viewGroup = this.EZpvd;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = height;
                marginLayoutParams = marginLayoutParams2;
            }
            viewGroup.setLayoutParams(marginLayoutParams);
            this.KWHzl.bringToFront();
        }
    }

    private C45776swv() {
    }

    public final void KWHzl(@NotNull android.app.Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (z) {
            copydefault.add(activity);
            if (activity instanceof AbstractActivityC33041mov) {
                EZpvd((AbstractActivityC33041mov) activity);
                C45765swk.EZpvd.AEQbTJ((AppCompatActivity) activity);
                return;
            }
            return;
        }
        copydefault.remove(activity);
        if (activity instanceof AbstractActivityC33041mov) {
            OLrzqt(activity);
        }
    }

    public static /* synthetic */ void setUKBannerType$default(C45776swv c45776swv, AbstractActivityC33041mov abstractActivityC33041mov, UKBannerType uKBannerType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uKBannerType = UKBannerType.NOT_APPROVED;
        }
        c45776swv.KWHzl(abstractActivityC33041mov, uKBannerType);
    }

    public final void KWHzl(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, @NotNull final UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        if (!(abstractActivityC33041mov instanceof ActivityC45804sxx) && !((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).fIwbmz()) {
            final OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
            oKComplianceRestrictionService.KWHzl(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), java.lang.Boolean.FALSE, new Function1() { // from class: o.swu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45776swv.AEQbTJ(abstractActivityC33041mov, oKComplianceRestrictionService, uKBannerType, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        C45765swk.EZpvd.copydefault((android.app.Activity) abstractActivityC33041mov, false);
    }

    public static final Unit AEQbTJ(AbstractActivityC33041mov abstractActivityC33041mov, OKComplianceRestrictionService oKComplianceRestrictionService, UKBannerType uKBannerType, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(abstractActivityC33041mov), Dispatchers.getIO(), null, new UKBannerManager$setUKBannerType$1$1(oKComplianceRestrictionService, abstractActivityC33041mov, uKBannerType, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(@NotNull final android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof AbstractActivityC33041mov) {
            final OKComplianceRestrictionService oKComplianceRestrictionService = (OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class);
            oKComplianceRestrictionService.KWHzl(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), java.lang.Boolean.FALSE, new Function1() { // from class: o.swt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C45776swv.KWHzl(activity, oKComplianceRestrictionService, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        C45765swk.EZpvd.copydefault(activity, true);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(android.app.Activity activity, OKComplianceRestrictionService oKComplianceRestrictionService, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope((LifecycleOwner) activity), Dispatchers.getIO(), null, new UKBannerManager$checkIfUKBannerRequired$1$1(oKComplianceRestrictionService, activity, null), 2, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void insertOrUpdateUKWarningBanner$default(C45776swv c45776swv, AbstractActivityC33041mov abstractActivityC33041mov, UKBannerType uKBannerType, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uKBannerType = UKBannerType.NOT_APPROVED;
        }
        c45776swv.EZpvd(abstractActivityC33041mov, uKBannerType, z);
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, UKBannerType uKBannerType, boolean z) {
        if (copydefault.contains(abstractActivityC33041mov)) {
            C43296rmc.AEQbTJ("UKBannerManager", "Skip inserting UK Banner because inline banner is active");
            return;
        }
        android.view.View decorView = abstractActivityC33041mov.getWindow() == null ? null : abstractActivityC33041mov.getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            EZpvd(abstractActivityC33041mov, (android.view.ViewGroup) decorView, uKBannerType, z);
        }
    }

    public final void EZpvd(@NotNull AbstractActivityC33041mov abstractActivityC33041mov) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        android.view.View decorView = abstractActivityC33041mov.getWindow() == null ? null : abstractActivityC33041mov.getWindow().getDecorView();
        if (decorView instanceof android.view.ViewGroup) {
            OLrzqt((android.view.ViewGroup) decorView);
            androidx.core.util.Consumer<android.content.res.Configuration> consumer = AEQbTJ.get(abstractActivityC33041mov.getClass().getName());
            if (consumer == null) {
                return;
            }
            abstractActivityC33041mov.removeOnConfigurationChangedListener(consumer);
        }
    }

    public final void OLrzqt(android.view.ViewGroup viewGroup) {
        OKAlertBanner oKAlertBanner = (OKAlertBanner) viewGroup.findViewById(C45716svX.ActionBar.dNCPSb);
        if (oKAlertBanner != null) {
            C43296rmc.AEQbTJ("UK_WARNING_TEST", "remove existing UKWarningBanner");
            viewGroup.removeView(oKAlertBanner);
            android.view.View viewFindViewById = viewGroup.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = 0;
                marginLayoutParams = marginLayoutParams2;
            }
            frameLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public static /* synthetic */ void setBannerView$default(C45776swv c45776swv, AbstractActivityC33041mov abstractActivityC33041mov, android.view.ViewGroup viewGroup, UKBannerType uKBannerType, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            uKBannerType = UKBannerType.NOT_APPROVED;
        }
        c45776swv.EZpvd(abstractActivityC33041mov, viewGroup, uKBannerType, z);
    }

    public final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, android.view.ViewGroup viewGroup, UKBannerType uKBannerType, boolean z) {
        if (viewGroup.findViewById(C45716svX.ActionBar.dNCPSb) == null) {
            android.view.View viewFindViewById = viewGroup.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
            OKAlertBanner oKAlertBannerKWHzl = KWHzl((android.content.Context) abstractActivityC33041mov, uKBannerType);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.topMargin = C33570myu.AEQbTJ((android.content.Context) abstractActivityC33041mov);
            oKAlertBannerKWHzl.setId(C45716svX.ActionBar.dNCPSb);
            viewGroup.addView(oKAlertBannerKWHzl, 0, marginLayoutParams);
            AEQbTJ((android.widget.FrameLayout) viewFindViewById, oKAlertBannerKWHzl);
            EZpvd(abstractActivityC33041mov, viewGroup, uKBannerType);
            return;
        }
        if (z) {
            return;
        }
        android.view.View viewFindViewById2 = viewGroup.findViewById(C45716svX.ActionBar.dNCPSb);
        OKAlertBanner oKAlertBanner = viewFindViewById2 instanceof OKAlertBanner ? (OKAlertBanner) viewFindViewById2 : null;
        if (oKAlertBanner != null) {
            android.view.View viewFindViewById3 = viewGroup.findViewById(android.R.id.content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
            C45776swv c45776swv = KWHzl;
            c45776swv.AEQbTJ(abstractActivityC33041mov, uKBannerType, oKAlertBanner);
            c45776swv.AEQbTJ((android.widget.FrameLayout) viewFindViewById3, oKAlertBanner);
        }
    }

    public final void EZpvd(final AbstractActivityC33041mov abstractActivityC33041mov, final android.view.ViewGroup viewGroup, final UKBannerType uKBannerType) {
        java.util.Map<java.lang.String, androidx.core.util.Consumer<android.content.res.Configuration>> map = AEQbTJ;
        androidx.core.util.Consumer<android.content.res.Configuration> consumer = map.get(abstractActivityC33041mov.getClass().getName());
        if (consumer != null) {
            abstractActivityC33041mov.removeOnConfigurationChangedListener(consumer);
        }
        androidx.core.util.Consumer<android.content.res.Configuration> consumer2 = new androidx.core.util.Consumer() { // from class: o.swr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                C45776swv.OLrzqt(viewGroup, abstractActivityC33041mov, uKBannerType, (android.content.res.Configuration) obj);
            }
        };
        abstractActivityC33041mov.addOnConfigurationChangedListener(consumer2);
        map.put(abstractActivityC33041mov.getClass().getName(), consumer2);
    }

    public static final void OLrzqt(android.view.ViewGroup viewGroup, AbstractActivityC33041mov abstractActivityC33041mov, UKBannerType uKBannerType, android.content.res.Configuration configuration) {
        OKAlertBanner oKAlertBanner = (OKAlertBanner) viewGroup.findViewById(C45716svX.ActionBar.dNCPSb);
        if (oKAlertBanner == null) {
            return;
        }
        KWHzl.AEQbTJ(abstractActivityC33041mov, uKBannerType, oKAlertBanner);
    }

    public static /* synthetic */ OKAlertBanner getUKWarningBannerView$default(C45776swv c45776swv, android.content.Context context, UKBannerType uKBannerType, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            uKBannerType = UKBannerType.NOT_APPROVED;
        }
        return c45776swv.KWHzl(context, uKBannerType);
    }

    public final OKAlertBanner KWHzl(@NotNull android.content.Context context, @NotNull UKBannerType uKBannerType) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uKBannerType, "");
        OKAlertBanner oKAlertBanner = new OKAlertBanner(context, null, 0, 6, null);
        KWHzl.AEQbTJ(context, uKBannerType, oKAlertBanner);
        return oKAlertBanner;
    }

    public final void AEQbTJ(android.content.Context context, UKBannerType uKBannerType, OKAlertBanner oKAlertBanner) {
        oKAlertBanner.setType(2);
        java.lang.String string = context.getString(C45716svX.TaskDescription.valueOf);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = TaskDescription.OLrzqt[uKBannerType.ordinal()] == 1 ? context.getString(C45716svX.TaskDescription.OLrzqt) : "";
        Intrinsics.copydefault((java.lang.Object) string2);
        java.lang.String str = context.getString(C45716svX.TaskDescription.AYXKKw) + " " + string + "  " + string2;
        oKAlertBanner.KWHzl().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        oKAlertBanner.setMessage(copydefault(context, str, string, string2));
    }

    public final java.lang.CharSequence copydefault(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.text.SpannableStringBuilder spannableStringBuilderValueOf = android.text.SpannableStringBuilder.valueOf(str);
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        int iLastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) str, str3, 0, false, 6, (java.lang.Object) null);
        spannableStringBuilderValueOf.setSpan(new android.text.style.StyleSpan() { // from class: com.okinc.okex.lite.navigation.ukbanner.UKBannerManager$getSpannableString$1
            @Override // android.text.style.StyleSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                Intrinsics.checkNotNullParameter(textPaint, "");
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            }
        }, 0, str.length(), 33);
        spannableStringBuilderValueOf.setSpan(new Application(context), iLastIndexOf$default, str2.length() + iLastIndexOf$default, 33);
        spannableStringBuilderValueOf.setSpan(new Activity(context), iLastIndexOf$default2, str3.length() + iLastIndexOf$default2, 33);
        Intrinsics.copydefault(spannableStringBuilderValueOf);
        return spannableStringBuilderValueOf;
    }

    /* JADX INFO: renamed from: o.swv$Application */
    public static final class Application extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context EZpvd;

        public Application(android.content.Context context) {
            this.EZpvd = context;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            if (this.EZpvd instanceof ActivityC45804sxx) {
                return;
            }
            this.EZpvd.startActivity(new android.content.Intent(this.EZpvd, (java.lang.Class<?>) ActivityC45804sxx.class));
        }
    }

    /* JADX INFO: renamed from: o.swv$Activity */
    public static final class Activity extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
        }

        public Activity(android.content.Context context) {
            this.OLrzqt = context;
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setTextSize(C45776swv.KWHzl.EZpvd(10.0f, this.OLrzqt));
        }
    }

    public final float EZpvd(float f, android.content.Context context) {
        return android.util.TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public final void AEQbTJ(android.view.ViewGroup viewGroup, OKAlertBanner oKAlertBanner) {
        if (ViewCompat.isLaidOut(oKAlertBanner) && !oKAlertBanner.isLayoutRequested()) {
            int height = oKAlertBanner.getHeight();
            C43296rmc.AEQbTJ("UK_WARNING_TEST", "insertUKWarningBanner topMargin: " + height);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = height;
                layoutParams2 = marginLayoutParams;
            }
            viewGroup.setLayoutParams(layoutParams2);
            oKAlertBanner.bringToFront();
            return;
        }
        oKAlertBanner.addOnLayoutChangeListener(new ActionBar(viewGroup, oKAlertBanner));
    }
}

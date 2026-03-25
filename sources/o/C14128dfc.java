package o;

import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dfc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14128dfc {
    public static final C14128dfc KWHzl = new C14128dfc();

    private C14128dfc() {
    }

    /* JADX INFO: renamed from: o.dfc$ActionBar */
    public static final class ActionBar extends android.text.style.ClickableSpan {
        public final /* synthetic */ android.content.Context KWHzl;
        public final /* synthetic */ C9789bcH copydefault;

        public ActionBar(C9789bcH c9789bcH, android.content.Context context) {
            this.copydefault = c9789bcH;
            this.KWHzl = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C14128dfc.KWHzl.EZpvd(this.copydefault);
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.KWHzl, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDescription)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(this.KWHzl, C52761wXj.Activity.DeEinT));
        }
    }

    public final kotlin.Pair<java.lang.CharSequence, java.lang.CharSequence> KWHzl(@NotNull android.content.Context context, @NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.util.Map<java.lang.String, ? extends java.lang.CharSequence> map, C9789bcH c9789bcH, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default(C33070mpX.AYXKKw(i), "{" + str + "}", "", false, 4, (java.lang.Object) null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        StateListAnimator stateListAnimator = new StateListAnimator(function0, context);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.RequiresPermissionRead));
        spannableStringBuilder.setSpan(stateListAnimator, length, spannableStringBuilder.length(), 17);
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        return new kotlin.Pair<>(strReplace$default, spannableStringValueOf);
    }

    /* JADX INFO: renamed from: o.dfc$StateListAnimator */
    public static final class StateListAnimator extends android.text.style.ClickableSpan {
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ android.content.Context KWHzl;

        public StateListAnimator(Function0<Unit> function0, android.content.Context context) {
            this.EZpvd = function0;
            this.KWHzl = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            Function0<Unit> function0 = this.EZpvd;
            if (function0 != null) {
                function0.invoke();
            }
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(this.KWHzl, C52761wXj.Activity.DeEinT));
        }
    }

    public static /* synthetic */ java.lang.CharSequence generateEoaAddressRiskSubTitle$default(C14128dfc c14128dfc, android.content.Context context, android.content.res.Resources resources, java.util.List list, C9789bcH c9789bcH, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            c9789bcH = null;
        }
        return c14128dfc.copydefault(context, resources, list, c9789bcH);
    }

    public final java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull android.content.res.Resources resources, @NotNull java.util.List<java.lang.String> list, C9789bcH c9789bcH) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String addressStr$default = "";
        int i = 0;
        for (java.lang.Object obj : CollectionsKt___CollectionsKt.OqFWZa(list)) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.lang.String str = (java.lang.String) obj;
            if (i == 0) {
                addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
            } else {
                addressStr$default = ((java.lang.Object) addressStr$default) + "、" + C14079deg.getAddressStr$default(C14079deg.EZpvd, str, false, 2, null);
            }
            i++;
        }
        int i2 = C13754dXa.FragmentManager.setRatingType;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(addressStr$default);
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, spannableStringValueOf);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        TaskDescription taskDescription = new TaskDescription(c9789bcH, context);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.onSkipToNext));
        spannableStringBuilder.setSpan(taskDescription, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        android.text.SpannableString spannableStringValueOf2 = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf2, "");
        return C33069mpW.KWHzl(resources, i2, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) C56424yEw.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt("link", spannableStringValueOf2)));
    }

    /* JADX INFO: renamed from: o.dfc$TaskDescription */
    public static final class TaskDescription extends android.text.style.ClickableSpan {
        public final /* synthetic */ C9789bcH KWHzl;
        public final /* synthetic */ android.content.Context copydefault;

        public TaskDescription(C9789bcH c9789bcH, android.content.Context context) {
            this.KWHzl = c9789bcH;
            this.copydefault = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(android.view.View view) {
            Intrinsics.checkNotNullParameter(view, "");
            C14128dfc.KWHzl.EZpvd(this.KWHzl);
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, this.copydefault, BundleKt.bundleOf(C56390yDp.OLrzqt("url", C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDescription)), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(android.text.TextPaint textPaint) {
            Intrinsics.checkNotNullParameter(textPaint, "");
            textPaint.setUnderlineText(true);
            textPaint.setColor(ContextCompat.getColor(this.copydefault, C52761wXj.Activity.DeEinT));
        }
    }

    public final void EZpvd(C9789bcH c9789bcH) {
        if (c9789bcH instanceof C9870bdj) {
            if (((C9870bdj) c9789bcH).AEQbTJ()) {
                C32866mlf.onEvent$default("Confirmationpage_HighAccuracyBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.deY
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14128dfc.ejfBZ((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                return;
            } else {
                C32866mlf.onEvent$default("Confirmationpage_NormalBlackAddressAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.deZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C14128dfc.djBIcL((EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                return;
            }
        }
        if (c9789bcH instanceof C9831bcx) {
            C32866mlf.onEvent$default("Confirmationpage_EthsignSignatureAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dfh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.valueOf((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (c9789bcH instanceof C9871bdk) {
            C32866mlf.onEvent$default("Confirmationpage_ZeroValuePurchaseAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dff
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.fetchVPNInfo((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (c9789bcH instanceof C9877bdq) {
            C32866mlf.onEvent$default("Confirmationpage_SOLAccountOwnershipChangeAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dfe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.isConnected((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            return;
        }
        if (c9789bcH instanceof C9873bdm) {
            C32866mlf.onEvent$default("Confirmationpage_WithdrawalAddressChangeAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.DbNXlk((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else if (c9789bcH instanceof C9814bcg) {
            C32866mlf.onEvent$default("Confirmationpage_EOAAuthorizationAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dfg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.values((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else if (c9789bcH instanceof C9839bdE) {
            C32866mlf.onEvent$default("Confirmationpage_TronAccountPermissionUpgradeAlert_Popup_View", (TrackChannel[]) null, new Function1() { // from class: o.dfk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C14128dfc.AkhnZx((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    public static final Unit ejfBZ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit values(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("is_click_risk_link", "true", true);
        return Unit.INSTANCE;
    }

    public final java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull android.content.res.Resources resources, @androidx.annotation.StringRes int i, @NotNull java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.CharSequence> map, C9789bcH c9789bcH) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(resources, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        ActionBar actionBar = new ActionBar(c9789bcH, context);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.sYOsaF));
        spannableStringBuilder.setSpan(actionBar, length, spannableStringBuilder.length(), 17);
        Unit unit = Unit.INSTANCE;
        android.text.SpannableString spannableStringValueOf = android.text.SpannableString.valueOf(new android.text.SpannedString(spannableStringBuilder));
        Intrinsics.checkNotNullExpressionValue(spannableStringValueOf, "");
        java.util.Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt(str, spannableStringValueOf));
        if (map != null) {
            for (Map.Entry<java.lang.String, ? extends java.lang.CharSequence> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                android.text.SpannableString spannableStringValueOf2 = android.text.SpannableString.valueOf(entry.getValue());
                Intrinsics.checkNotNullExpressionValue(spannableStringValueOf2, "");
                mapDjBIcL.put(key, spannableStringValueOf2);
            }
        }
        Unit unit2 = Unit.INSTANCE;
        return C33069mpW.KWHzl(resources, i, (java.util.Map<java.lang.String, ? extends android.text.Spannable>) mapDjBIcL);
    }
}

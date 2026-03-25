package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.planet.biz_performance.data.ChartProfileCopyTrading;
import com.okinc.planet.biz_performance.data.UserProfileCopyTradingRes;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47501trL;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tBy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45941tBy extends AbstractC43310rmq<UserProfileCopyTradingRes, AbstractC46282tOo> {
    public final Function1<java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C45941tBy() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function1<java.lang.String, Unit> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC43310rmq
    public int getItemLayoutId() {
        return C47501trL.Application.dUDNAs;
    }

    @Override // o.AbstractC43310rmq
    public int getVariableId() {
        return 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function1) : (r1v0 kotlin.jvm.functions.Function1))
 A[MD:(kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>):void (m)] (LINE:35) call: o.tBy.<init>(kotlin.jvm.functions.Function1):void type: THIS */
    public /* synthetic */ C45941tBy(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C45941tBy(Function1<? super java.lang.String, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
    @Override // o.AbstractC43310rmq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull C43312rms<AbstractC46282tOo> c43312rms, @NotNull UserProfileCopyTradingRes userProfileCopyTradingRes) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(userProfileCopyTradingRes, "");
        super.onBindViewHolder((C43312rms) c43312rms, userProfileCopyTradingRes);
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = c43312rms.getBindingAdapter();
        int itemCount = bindingAdapter != null ? bindingAdapter.getItemCount() : 0;
        ViewGroup.LayoutParams layoutParams = c43312rms.itemView.getLayoutParams();
        if (itemCount == 1) {
            layoutParams.width = -1;
        } else {
            layoutParams.width = C55298xhM.dp2px$default(320.0f, null, 1, null);
        }
        c43312rms.itemView.setLayoutParams(layoutParams);
        java.lang.String strOLrzqt = userProfileCopyTradingRes.OLrzqt();
        int iHashCode = strOLrzqt.hashCode();
        if (iHashCode != 65959) {
            if (iHashCode != 2552066) {
                if (iHashCode == 2558355 && strOLrzqt.equals("SWAP")) {
                    ((AbstractC46282tOo) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.fmB));
                    android.widget.LinearLayout linearLayout = ((AbstractC46282tOo) c43312rms.OLrzqt()).AhwBna;
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                    linearLayout.setVisibility(0);
                    ((AbstractC46282tOo) c43312rms.OLrzqt()).valueOf.setText(pTB.formatLocalized$default(userProfileCopyTradingRes.valueOf(), null, 1, null));
                    ViewGroup.LayoutParams layoutParams2 = ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.getLayoutParams();
                    Intrinsics.copydefault(layoutParams2, "");
                    ((FrameLayout.LayoutParams) layoutParams2).gravity = 1;
                    ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.setGravity(8388611);
                    ((AbstractC46282tOo) c43312rms.OLrzqt()).EZpvd.setGravity(8388611);
                    java.lang.CharSequence text = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl.getText();
                    android.text.Spannable spannable = text instanceof android.text.Spannable ? (android.text.Spannable) text : null;
                    if (spannable != null) {
                        java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), java.lang.Object.class);
                        Intrinsics.checkNotNullExpressionValue(spans, "");
                        for (java.lang.Object obj : spans) {
                            spannable.removeSpan(obj);
                        }
                    }
                    AppCompatTextView appCompatTextView = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl;
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                    android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((java.lang.CharSequence) pTB.formatLocalized$default(userProfileCopyTradingRes.AYXKKw(), null, 1, null));
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append((java.lang.CharSequence) "/");
                    spannableStringBuilder.append((java.lang.CharSequence) pTB.formatLocalized$default(userProfileCopyTradingRes.AEQbTJ(), null, 1, null));
                    appCompatTextView.setText(new android.text.SpannedString(spannableStringBuilder));
                }
            } else if (strOLrzqt.equals("SPOT")) {
                ((AbstractC46282tOo) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.onComplete));
                android.widget.LinearLayout linearLayout2 = ((AbstractC46282tOo) c43312rms.OLrzqt()).AhwBna;
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                linearLayout2.setVisibility(0);
                ((AbstractC46282tOo) c43312rms.OLrzqt()).valueOf.setText(pTB.formatLocalized$default(userProfileCopyTradingRes.valueOf(), null, 1, null));
                ViewGroup.LayoutParams layoutParams3 = ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.getLayoutParams();
                Intrinsics.copydefault(layoutParams3, "");
                ((FrameLayout.LayoutParams) layoutParams3).gravity = 1;
                ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.setGravity(8388611);
                ((AbstractC46282tOo) c43312rms.OLrzqt()).EZpvd.setGravity(8388611);
                java.lang.CharSequence text2 = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl.getText();
                android.text.Spannable spannable2 = text2 instanceof android.text.Spannable ? (android.text.Spannable) text2 : null;
                if (spannable2 != null) {
                    java.lang.Object[] spans2 = spannable2.getSpans(0, spannable2.length(), java.lang.Object.class);
                    Intrinsics.checkNotNullExpressionValue(spans2, "");
                    for (java.lang.Object obj2 : spans2) {
                        spannable2.removeSpan(obj2);
                    }
                }
                AppCompatTextView appCompatTextView2 = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl;
                android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
                android.text.style.ForegroundColorSpan foregroundColorSpan2 = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                int length2 = spannableStringBuilder2.length();
                spannableStringBuilder2.append((java.lang.CharSequence) pTB.formatLocalized$default(userProfileCopyTradingRes.AYXKKw(), null, 1, null));
                spannableStringBuilder2.setSpan(foregroundColorSpan2, length2, spannableStringBuilder2.length(), 17);
                spannableStringBuilder2.append((java.lang.CharSequence) "/");
                spannableStringBuilder2.append((java.lang.CharSequence) pTB.formatLocalized$default(userProfileCopyTradingRes.AEQbTJ(), null, 1, null));
                appCompatTextView2.setText(new android.text.SpannedString(spannableStringBuilder2));
            }
        } else if (strOLrzqt.equals("BOT")) {
            ((AbstractC46282tOo) c43312rms.OLrzqt()).gEmmrt.setText(C33070mpX.AYXKKw(C47501trL.Fragment.DMb));
            android.widget.LinearLayout linearLayout3 = ((AbstractC46282tOo) c43312rms.OLrzqt()).AhwBna;
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "");
            linearLayout3.setVisibility(8);
            ViewGroup.LayoutParams layoutParams4 = ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.getLayoutParams();
            Intrinsics.copydefault(layoutParams4, "");
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 8388613;
            ((AbstractC46282tOo) c43312rms.OLrzqt()).copydefault.setGravity(8388613);
            ((AbstractC46282tOo) c43312rms.OLrzqt()).EZpvd.setGravity(8388613);
            java.lang.CharSequence text3 = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl.getText();
            android.text.Spannable spannable3 = text3 instanceof android.text.Spannable ? (android.text.Spannable) text3 : null;
            if (spannable3 != null) {
                java.lang.Object[] spans3 = spannable3.getSpans(0, spannable3.length(), java.lang.Object.class);
                Intrinsics.checkNotNullExpressionValue(spans3, "");
                for (java.lang.Object obj3 : spans3) {
                    spannable3.removeSpan(obj3);
                }
            }
            AppCompatTextView appCompatTextView3 = ((AbstractC46282tOo) c43312rms.OLrzqt()).KWHzl;
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            android.text.style.ForegroundColorSpan foregroundColorSpan3 = new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
            int length3 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((java.lang.CharSequence) pTB.formatLocalized$default(userProfileCopyTradingRes.KWHzl(), null, 1, null));
            spannableStringBuilder3.setSpan(foregroundColorSpan3, length3, spannableStringBuilder3.length(), 17);
            appCompatTextView3.setText(new android.text.SpannedString(spannableStringBuilder3));
        }
        ((AbstractC46282tOo) c43312rms.OLrzqt()).DbNXlk.setText(C33069mpW.copydefault(C47501trL.Fragment.DQYQgr, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", userProfileCopyTradingRes.isConnected()))));
        ((AbstractC46282tOo) c43312rms.OLrzqt()).AEQbTJ.setText(C46367tRs.AEQbTJ(PlanetNumericString.AEQbTJ(userProfileCopyTradingRes.copydefault()), false));
        ((AbstractC46282tOo) c43312rms.OLrzqt()).isConnected.setText(C46367tRs.m8766pnlDollarFormatHYcmJmU$default(PlanetNumericString.AEQbTJ(userProfileCopyTradingRes.AhwBna()), false, 1, null));
        ((AbstractC46282tOo) c43312rms.OLrzqt()).AkhnZx.setText(pTB.formatICUPercent$default(java.lang.Double.valueOf(C33129mqd.AEQbTJ(userProfileCopyTradingRes.djBIcL())), RoundingMode.HALF_UP, null, DisplaySign.EXCEPT_ZERO, java.lang.Double.valueOf(100.0d), null, 18, null));
        ((AbstractC46282tOo) c43312rms.OLrzqt()).isConnected.setTextColor(C46368tRt.getPercentColor$default(C33129mqd.djBIcL(userProfileCopyTradingRes.AhwBna()), 0, 1, null));
        ((AbstractC46282tOo) c43312rms.OLrzqt()).AkhnZx.setTextColor(C46368tRt.getPercentColor$default(C33129mqd.djBIcL(userProfileCopyTradingRes.djBIcL()), 0, 1, null));
        OLrzqt(c43312rms, userProfileCopyTradingRes.gEmmrt());
        android.view.View root = ((AbstractC46282tOo) c43312rms.OLrzqt()).getRoot();
        root.setOnClickListener(new Application(root, 300L, root, this, userProfileCopyTradingRes));
    }

    public final void OLrzqt(@NotNull C43312rms<AbstractC46282tOo> c43312rms, @NotNull java.util.List<ChartProfileCopyTrading> list) {
        Intrinsics.checkNotNullParameter(c43312rms, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ChartProfileCopyTrading chartProfileCopyTrading : list) {
            arrayList.add(new tVX(C33129mqd.valueOf(java.lang.Long.valueOf(chartProfileCopyTrading.AEQbTJ())), chartProfileCopyTrading.KWHzl()));
        }
        C46496tWm.setData$default(((AbstractC46282tOo) c43312rms.OLrzqt()).djBIcL, arrayList, null, null, 6, null);
    }

    /* JADX INFO: renamed from: o.tBy$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ UserProfileCopyTradingRes AEQbTJ;
        public final /* synthetic */ C45941tBy EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, android.view.View view2, C45941tBy c45941tBy, UserProfileCopyTradingRes userProfileCopyTradingRes) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.KWHzl = view2;
            this.EZpvd = c45941tBy;
            this.AEQbTJ = userProfileCopyTradingRes;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function1<java.lang.String, Unit> function1KWHzl = this.EZpvd.KWHzl();
                if (function1KWHzl != null) {
                    function1KWHzl.invoke(this.AEQbTJ.OLrzqt());
                }
            }
        }
    }
}

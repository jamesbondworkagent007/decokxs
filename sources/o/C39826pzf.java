package o;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.os.BundleKt;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import o.C52761wXj;
import o.pDU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39826pzf extends android.widget.LinearLayout {
    public java.lang.String AEQbTJ;
    public final java.util.ArrayList<KlineFlashItem> AYXKKw;
    public java.lang.Runnable AhwBna;
    public KlineFlashItem EZpvd;
    public int KWHzl;
    public final oPL OLrzqt;
    public android.animation.ValueAnimator copydefault;
    public Function0<Unit> djBIcL;
    public int gEmmrt;
    public Function1<? super KlineFlashItem, Unit> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39826pzf(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39826pzf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCloseClick(Function0<Unit> function0) {
        this.djBIcL = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnFlashNewsClick(Function1<? super KlineFlashItem, Unit> function1) {
        this.valueOf = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:38) call: o.pzf.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C39826pzf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39826pzf(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new java.util.ArrayList<>();
        this.AEQbTJ = "";
        setOrientation(0);
        this.OLrzqt = oPL.EZpvd(android.view.LayoutInflater.from(context), this, true);
        setupClickListeners();
    }

    public final void setupClickListeners() {
        android.widget.TextView textView = this.OLrzqt.djBIcL;
        textView.setOnClickListener(new ActionBar(textView, 1000L, this));
        android.widget.ImageView imageView = this.OLrzqt.EZpvd;
        imageView.setOnClickListener(new Activity(imageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.pzf$StateListAnimator */
    public static final class StateListAnimator implements Function1<EventParamsList, Unit> {
        public static final StateListAnimator KWHzl = new StateListAnimator();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            OLrzqt(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "Display", DebugKt.DEBUG_PROPERTY_VALUE_OFF, false, 4, null);
        }
    }

    public final void setFlashNewsData(@NotNull java.util.List<KlineFlashItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return;
        }
        this.AYXKKw.clear();
        if (list.size() > 20) {
            this.AYXKKw.addAll(list.subList(0, 20));
        } else {
            this.AYXKKw.addAll(list);
        }
        this.gEmmrt = this.AYXKKw.size() < 5 ? this.AYXKKw.size() : 5;
        KlineFlashItem klineFlashItem = (KlineFlashItem) CollectionsKt___CollectionsKt.AkhnZx(list, 0);
        this.EZpvd = klineFlashItem;
        AEQbTJ(klineFlashItem);
        KWHzl(klineFlashItem);
    }

    public static /* synthetic */ void displayFlashNews$default(C39826pzf c39826pzf, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        c39826pzf.copydefault(str, z);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.AYXKKw.isEmpty()) {
            return;
        }
        this.AEQbTJ = str;
        if (this.OLrzqt.KWHzl.getVisibility() != 0) {
            pDU.TaskDescription taskDescription = pDU.Companion;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            android.widget.LinearLayout linearLayout = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            taskDescription.OLrzqt(context, linearLayout, C55298xhM.dp2px$default(28.0f, null, 1, null)).AEQbTJ(z);
        }
        copydefault(str);
    }

    public final void OLrzqt() {
        this.OLrzqt.KWHzl.setVisibility(8);
    }

    public final void KWHzl() {
        java.lang.Runnable runnable = this.AhwBna;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.AYXKKw.isEmpty() && this.OLrzqt.KWHzl.getVisibility() == 0) {
            copydefault(str);
        }
    }

    public final void copydefault(java.lang.String str) {
        removeCallbacks(this.AhwBna);
        TaskDescription taskDescription = new TaskDescription(str);
        this.AhwBna = taskDescription;
        post(taskDescription);
    }

    /* JADX INFO: renamed from: o.pzf$TaskDescription */
    public static final class TaskDescription implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String OLrzqt;

        public TaskDescription(java.lang.String str) {
            this.OLrzqt = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C39826pzf.this.KWHzl(this.OLrzqt);
            if (C39826pzf.this.AYXKKw.size() > 1) {
                C39826pzf.this.postDelayed(this, 3000L);
            }
        }
    }

    /* JADX INFO: renamed from: o.pzf$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C39826pzf AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C39826pzf c39826pzf) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c39826pzf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                KlineFlashItem klineFlashItem = this.AEQbTJ.EZpvd;
                if (klineFlashItem != null) {
                    this.AEQbTJ.EZpvd(klineFlashItem);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.pzf$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C39826pzf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C39826pzf c39826pzf) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = c39826pzf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.OLrzqt.OLrzqt();
                SPUtils.put("kline_flash_news_on", java.lang.Boolean.FALSE);
                pUU.KWHzl("FlashNewsView", "user close flash news");
                C32866mlf.onEvent$default("KLine_TopNews_Display_Click", (TrackChannel[]) null, StateListAnimator.KWHzl, 1, (java.lang.Object) null);
                Function0<Unit> function0Copydefault = this.OLrzqt.copydefault();
                if (function0Copydefault != null) {
                    function0Copydefault.invoke();
                }
            }
        }
    }

    public final void KWHzl(final java.lang.String str) {
        if (this.AYXKKw.isEmpty()) {
            return;
        }
        KlineFlashItem klineFlashItem = (KlineFlashItem) CollectionsKt___CollectionsKt.AkhnZx(this.AYXKKw, this.KWHzl);
        if (klineFlashItem != null) {
            this.EZpvd = klineFlashItem;
            copydefault(klineFlashItem);
        }
        C32866mlf.onEvent$default("KLine_Top_News_View", (TrackChannel[]) null, new Function1() { // from class: o.pze
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C39826pzf.EZpvd(str, this, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        this.KWHzl = (this.KWHzl + 1) % this.gEmmrt;
    }

    public static final Unit EZpvd(java.lang.String str, C39826pzf c39826pzf, EventParamsList eventParamsList) {
        java.lang.String flashId;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "token", str, false, 4, null);
        KlineFlashItem klineFlashItem = c39826pzf.EZpvd;
        EventParamsList.put$default(eventParamsList, "feed_item_id", (klineFlashItem == null || (flashId = klineFlashItem.getFlashId()) == null) ? "" : flashId, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(KlineFlashItem klineFlashItem) {
        java.lang.String content = null;
        java.lang.String translatedContent = klineFlashItem != null ? klineFlashItem.getTranslatedContent() : null;
        if (translatedContent != null && translatedContent.length() != 0) {
            content = klineFlashItem.getTranslatedContent();
        } else if (klineFlashItem != null) {
            content = klineFlashItem.getContent();
        }
        if (content == null || content.length() == 0) {
            return;
        }
        android.widget.LinearLayout linearLayout = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        android.animation.ValueAnimator valueAnimator = this.copydefault;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (linearLayout.getHeight() == 0) {
            linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new Application(linearLayout, this, klineFlashItem));
        } else {
            EZpvd(linearLayout, klineFlashItem);
        }
    }

    /* JADX INFO: renamed from: o.pzf$Application */
    public static final class Application implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ android.widget.LinearLayout AEQbTJ;
        public final /* synthetic */ C39826pzf KWHzl;
        public final /* synthetic */ KlineFlashItem OLrzqt;

        public Application(android.widget.LinearLayout linearLayout, C39826pzf c39826pzf, KlineFlashItem klineFlashItem) {
            this.AEQbTJ = linearLayout;
            this.KWHzl = c39826pzf;
            this.OLrzqt = klineFlashItem;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.AEQbTJ.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.AEQbTJ.getHeight() > 0) {
                this.KWHzl.EZpvd(this.AEQbTJ, this.OLrzqt);
            }
        }
    }

    public final void EZpvd(final android.widget.LinearLayout linearLayout, final KlineFlashItem klineFlashItem) {
        final android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.pzb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C39826pzf.copydefault(linearLayout, valueAnimatorOfFloat, this, klineFlashItem, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.copydefault = valueAnimatorOfFloat;
    }

    public static final void copydefault(android.widget.LinearLayout linearLayout, android.animation.ValueAnimator valueAnimator, C39826pzf c39826pzf, KlineFlashItem klineFlashItem, android.animation.ValueAnimator valueAnimator2) {
        Intrinsics.checkNotNullParameter(valueAnimator2, "");
        if (!linearLayout.isAttachedToWindow()) {
            valueAnimator.cancel();
            return;
        }
        float animatedFraction = valueAnimator2.getAnimatedFraction();
        if (animatedFraction < 0.5f) {
            linearLayout.setTranslationY((-linearLayout.getHeight()) * animatedFraction * 2);
        } else {
            c39826pzf.AEQbTJ(klineFlashItem);
            c39826pzf.KWHzl(klineFlashItem);
            linearLayout.setTranslationY(linearLayout.getHeight() * (1 - animatedFraction) * 2);
        }
        c39826pzf.EZpvd = klineFlashItem;
    }

    private final void AEQbTJ(KlineFlashItem klineFlashItem) {
        java.lang.String content = null;
        java.lang.String translatedContent = klineFlashItem != null ? klineFlashItem.getTranslatedContent() : null;
        if (translatedContent != null && translatedContent.length() != 0) {
            content = klineFlashItem.getTranslatedContent();
        } else if (klineFlashItem != null) {
            content = klineFlashItem.getContent();
        }
        android.widget.TextView textView = this.OLrzqt.djBIcL;
        if (content == null) {
            content = "";
        }
        textView.setText(content);
    }

    private final void KWHzl(KlineFlashItem klineFlashItem) {
        java.lang.String flashType = klineFlashItem != null ? klineFlashItem.getFlashType() : null;
        if (Intrinsics.EZpvd((java.lang.Object) flashType, (java.lang.Object) "campaign")) {
            this.OLrzqt.OLrzqt.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.OeawrHOeawrH));
        } else if (Intrinsics.EZpvd((java.lang.Object) flashType, (java.lang.Object) "ai_insight")) {
            this.OLrzqt.OLrzqt.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.hDKMBd));
        } else {
            this.OLrzqt.OLrzqt.setImageDrawable(C33070mpX.KWHzl(C52761wXj.TaskDescription.Dff));
        }
    }

    public final void EZpvd(KlineFlashItem klineFlashItem) {
        java.lang.String flashType = klineFlashItem.getFlashType();
        if (Intrinsics.EZpvd((java.lang.Object) flashType, (java.lang.Object) "campaign")) {
            OLrzqt(klineFlashItem);
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) flashType, (java.lang.Object) "ai_insight")) {
            OLrzqt(this.AEQbTJ);
            return;
        }
        Function1<? super KlineFlashItem, Unit> function1 = this.valueOf;
        if (function1 != null) {
            function1.invoke(klineFlashItem);
        }
    }

    public final void OLrzqt(KlineFlashItem klineFlashItem) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", klineFlashItem.getUrlSlug())), null, 4, null);
    }

    public final void OLrzqt(java.lang.String str) {
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c43056riA.copydefault(context, "market", "/feed/tokenInsight", C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt("fromPage", "chart")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.animation.ValueAnimator valueAnimator = this.copydefault;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.copydefault = null;
        KWHzl();
        java.lang.Runnable runnable = this.AhwBna;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.AhwBna = null;
    }
}

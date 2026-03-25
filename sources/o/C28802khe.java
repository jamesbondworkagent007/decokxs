package o;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.okinc.business.market.features.meme.preview.ui.TwitterMediaItem;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.ActivityC28808khk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.khe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28802khe extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: o.khe$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TwitterMediaItem.MediaType.values().length];
            try {
                iArr[TwitterMediaItem.MediaType.VIDEO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TwitterMediaItem.MediaType.PHOTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28802khe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28802khe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.khe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28802khe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28802khe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        setMinimumHeight(120);
    }

    public final android.widget.FrameLayout copydefault(TwitterMediaItem twitterMediaItem) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        final android.widget.ImageView imageView = new android.widget.ImageView(frameLayout.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setAdjustViewBounds(false);
        java.lang.String strEZpvd = twitterMediaItem.EZpvd();
        if (strEZpvd == null) {
            strEZpvd = twitterMediaItem.KWHzl();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd)) {
            C33054mpH.KWHzl(imageView, strEZpvd, new Function1() { // from class: o.khb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28802khe.EZpvd(imageView, ((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        if (twitterMediaItem.copydefault() == TwitterMediaItem.MediaType.VIDEO) {
            android.widget.ImageView imageView2 = new android.widget.ImageView(frameLayout.getContext());
            imageView2.setImageResource(C52761wXj.TaskDescription.HrFqwD);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            int i = C52761wXj.Activity.zblBkD;
            android.content.Context context = imageView2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            imageView2.setColorFilter(C25382ivf.copydefault(i, context));
            imageView2.setAlpha(0.9f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C55298xhM.dp2px$default(48.0f, null, 1, null), C55298xhM.dp2px$default(48.0f, null, 1, null));
            layoutParams.gravity = 17;
            Unit unit = Unit.INSTANCE;
            frameLayout.addView(imageView2, layoutParams);
        }
        frameLayout.setOnClickListener(new Activity(frameLayout, 1000L, twitterMediaItem, frameLayout));
        return frameLayout;
    }

    public static final Unit EZpvd(android.widget.ImageView imageView, boolean z) {
        if (!z) {
            C28806khi.KWHzl(imageView);
            int i = C52761wXj.Activity.idLUrz;
            android.content.Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            imageView.setBackgroundColor(C25382ivf.copydefault(i, context));
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(TwitterMediaItem twitterMediaItem) {
        android.widget.FrameLayout frameLayoutCopydefault = copydefault(twitterMediaItem);
        frameLayoutCopydefault.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayoutCopydefault);
    }

    public final void KWHzl(java.util.List<TwitterMediaItem> list) {
        int iDp2px$default = C55298xhM.dp2px$default(2.0f, null, 1, null);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginEnd(iDp2px$default);
        frameLayout.setLayoutParams(layoutParams);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        frameLayout.addView(copydefault(list.get(0)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.addView(copydefault(list.get(1)), new FrameLayout.LayoutParams(-1, -1));
        linearLayout.addView(frameLayout);
        linearLayout.addView(frameLayout2);
        addView(linearLayout);
    }

    public final void AEQbTJ(java.util.List<TwitterMediaItem> list) {
        int iDp2px$default = C55298xhM.dp2px$default(2.0f, null, 1, null);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginEnd(iDp2px$default);
        frameLayout.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams2.bottomMargin = iDp2px$default;
        frameLayout2.setLayoutParams(layoutParams2);
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(getContext());
        frameLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        frameLayout.addView(copydefault(list.get(0)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.addView(copydefault(list.get(1)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(copydefault(list.get(2)), new FrameLayout.LayoutParams(-1, -1));
        linearLayout2.addView(frameLayout2);
        linearLayout2.addView(frameLayout3);
        linearLayout.addView(frameLayout);
        linearLayout.addView(linearLayout2);
        addView(linearLayout);
    }

    /* JADX INFO: renamed from: o.khe$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ android.widget.FrameLayout KWHzl;
        public final /* synthetic */ TwitterMediaItem OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, TwitterMediaItem twitterMediaItem, android.widget.FrameLayout frameLayout) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = twitterMediaItem;
            this.KWHzl = frameLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                int i = ActionBar.copydefault[this.OLrzqt.copydefault().ordinal()];
                if (i == 1) {
                    ActivityC28808khk.TaskDescription taskDescription = ActivityC28808khk.Companion;
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    taskDescription.KWHzl(context, this.OLrzqt.KWHzl());
                    return;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                android.content.Context context2 = this.KWHzl.getContext();
                if (context2 != null) {
                    C25352ivB.copydefault(context2, this.OLrzqt.KWHzl(), false);
                }
            }
        }
    }

    public final void OLrzqt(java.util.List<TwitterMediaItem> list, int i) {
        int iDp2px$default = C55298xhM.dp2px$default(2.0f, null, 1, null);
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams.setMarginEnd(iDp2px$default);
        linearLayout2.setLayoutParams(layoutParams);
        android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams2.bottomMargin = iDp2px$default;
        frameLayout.setLayoutParams(layoutParams2);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0, 1.0f);
        layoutParams3.bottomMargin = iDp2px$default;
        frameLayout3.setLayoutParams(layoutParams3);
        android.widget.FrameLayout frameLayout4 = new android.widget.FrameLayout(getContext());
        frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        frameLayout.addView(copydefault(list.get(0)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.addView(copydefault(list.get(1)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout3.addView(copydefault(list.get(2)), new FrameLayout.LayoutParams(-1, -1));
        frameLayout4.addView(copydefault(list.get(3)), new FrameLayout.LayoutParams(-1, -1));
        if (i > 0) {
            android.widget.TextView textView = new android.widget.TextView(getContext());
            textView.setText(Marker.ANY_NON_NULL_MARKER + i);
            int i2 = C52761wXj.Activity.zblBkD;
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setTextColor(C25382ivf.copydefault(i2, context));
            textView.setTextSize(16.0f);
            textView.setGravity(17);
            textView.setBackgroundColor(1711276032);
            textView.setClickable(false);
            textView.setFocusable(false);
            frameLayout4.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        }
        linearLayout2.addView(frameLayout);
        linearLayout2.addView(frameLayout2);
        linearLayout3.addView(frameLayout3);
        linearLayout3.addView(frameLayout4);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        addView(linearLayout);
    }

    public final void setMedia(@NotNull java.util.List<TwitterMediaItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((TwitterMediaItem) obj).KWHzl())) {
                arrayList.add(obj);
            }
        }
        removeAllViews();
        if (arrayList.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int size = arrayList.size();
        if (size == 1) {
            EZpvd((TwitterMediaItem) arrayList.get(0));
            return;
        }
        if (size == 2) {
            KWHzl(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 2));
        } else if (size == 3) {
            AEQbTJ(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 3));
        } else {
            OLrzqt(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList, 4), arrayList.size() - 4);
        }
    }
}

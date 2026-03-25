package o;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.core.graphics.Insets;
import com.google.android.exoplayer2.audio.WavUtil;
import com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C55162xej;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xeg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55159xeg extends android.widget.FrameLayout {
    public ActionBar<InterfaceC55169xeq<java.lang.Number>> AEQbTJ;
    public android.animation.ValueAnimator AhwBna;
    public Activity EZpvd;
    public final C55385xiu KWHzl;
    public boolean OLrzqt;
    public boolean copydefault;
    public boolean djBIcL;
    public android.animation.ValueAnimator valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55159xeg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55159xeg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Activity EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:31) call: o.xeg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55159xeg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55159xeg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.EZpvd = new C55098xdY(context, null, null, null, null, null, null, null, null, null, null, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null).KWHzl();
        this.copydefault = true;
        C55385xiu c55385xiuOLrzqt = C55385xiu.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c55385xiuOLrzqt, "");
        this.KWHzl = c55385xiuOLrzqt;
        C55162xej c55162xej = c55385xiuOLrzqt.OLrzqt;
        c55162xej.setOnLineReadyListener(new C55162xej.Activity() { // from class: o.xed
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C55162xej.Activity
            public final void KWHzl(java.util.List list, int i2, int i3) {
                C55159xeg.KWHzl(this.EZpvd, list, i2, i3);
            }
        });
        Intrinsics.copydefault(c55162xej);
        OLrzqt(c55162xej);
        c55162xej.setVisibility(0);
        C55162xej c55162xej2 = c55385xiuOLrzqt.EZpvd;
        Intrinsics.copydefault(c55162xej2);
        OLrzqt(c55162xej2);
        c55162xej2.setVisibility(4);
        c55385xiuOLrzqt.AYXKKw.setAlpha(0.0f);
        c55385xiuOLrzqt.copydefault.setAlpha(0.0f);
        OLrzqt();
    }

    public static final void KWHzl(C55159xeg c55159xeg, java.util.List list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        c55159xeg.OLrzqt = i == i2;
        c55159xeg.copydefault = false;
        c55159xeg.setMinMaxTextViewPositions(list, i, i2);
        c55159xeg.copydefault();
    }

    public final void OLrzqt() {
        C55162xej c55162xej = this.KWHzl.OLrzqt;
        c55162xej.setLineWidth(this.EZpvd.OLrzqt());
        c55162xej.setLineColor(this.EZpvd.AkhnZx().OLrzqt());
        c55162xej.setShadow(this.EZpvd.AEQbTJ(), this.EZpvd.AkhnZx().OLrzqt());
        c55162xej.m8792setAnimationDurationLRDsOJo(this.EZpvd.KWHzl());
        c55162xej.setDottedGridShadePattern(this.EZpvd.copydefault().OLrzqt(), this.EZpvd.copydefault().AEQbTJ(), this.EZpvd.copydefault().EZpvd());
        c55162xej.setEnableDottedGridShade(this.EZpvd.EZpvd());
        C55162xej c55162xej2 = this.KWHzl.EZpvd;
        c55162xej2.setLineWidth(this.EZpvd.OLrzqt());
        c55162xej2.setLineColor(this.EZpvd.AkhnZx().EZpvd());
        c55162xej2.setShadow(this.EZpvd.AEQbTJ(), this.EZpvd.AkhnZx().EZpvd());
        c55162xej2.m8792setAnimationDurationLRDsOJo(this.EZpvd.KWHzl());
        c55162xej2.setDottedGridShadePattern(this.EZpvd.copydefault().KWHzl(), this.EZpvd.copydefault().AEQbTJ(), this.EZpvd.copydefault().EZpvd());
        c55162xej2.setEnableDottedGridShade(this.EZpvd.EZpvd());
        this.KWHzl.KWHzl.setColorScheme(new OKVerticalSeparatorView.StateListAnimator(this.EZpvd.AkhnZx().AhwBna(), this.EZpvd.AkhnZx().AYXKKw(), this.EZpvd.AkhnZx().KWHzl(), this.EZpvd.AkhnZx().copydefault(), this.EZpvd.AkhnZx().AEQbTJ()));
        this.KWHzl.KWHzl.setLineStyle(this.EZpvd.isConnected());
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        EZpvd(textView, this.EZpvd.AYXKKw());
        android.widget.TextView textView2 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        EZpvd(textView2, this.EZpvd.AYXKKw());
        android.widget.TextView textView3 = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        EZpvd(textView3, this.EZpvd.AhwBna());
        android.widget.TextView textView4 = this.KWHzl.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        OLrzqt(textView4);
        setLineInsets(this.EZpvd.values(), this.KWHzl.djBIcL.getMeasuredHeight() + this.EZpvd.DbNXlk());
    }

    public final void EZpvd(android.widget.TextView textView, StateListAnimator stateListAnimator) {
        java.lang.Integer numCopydefault = stateListAnimator.copydefault();
        if (numCopydefault != null) {
            textView.setTextAppearance(numCopydefault.intValue());
        }
        java.lang.Float fEZpvd = stateListAnimator.EZpvd();
        if (fEZpvd != null) {
            float fFloatValue = fEZpvd.floatValue();
            java.lang.Integer numOLrzqt = stateListAnimator.OLrzqt();
            textView.setTextSize(numOLrzqt != null ? numOLrzqt.intValue() : 2, fFloatValue);
        }
        java.lang.Integer numAEQbTJ = stateListAnimator.AEQbTJ();
        if (numAEQbTJ != null) {
            textView.setTextColor(numAEQbTJ.intValue());
        }
    }

    public final void setLineInsets(Insets insets, float f) {
        this.KWHzl.OLrzqt.setPadding(insets.left, yII.EZpvd(insets.top + f), insets.right, insets.bottom);
        this.KWHzl.EZpvd.setPadding(insets.left, yII.EZpvd(insets.top + f), insets.right, insets.bottom);
        OKVerticalSeparatorView oKVerticalSeparatorView = this.KWHzl.KWHzl;
        Insets insetsOf = Insets.of(0, yII.EZpvd(f), 0, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf, "");
        oKVerticalSeparatorView.setFocusLineInsets(insetsOf);
    }

    /* JADX INFO: renamed from: o.xeg$LoaderManager */
    public static final class LoaderManager implements C55162xej.ActionBar {
        public final /* synthetic */ C55162xej copydefault;

        public LoaderManager(C55162xej c55162xej) {
            this.copydefault = c55162xej;
        }

        @Override // o.C55162xej.ActionBar
        public void EZpvd(int i, float f, PointF pointF) {
            Intrinsics.checkNotNullParameter(pointF, "");
            OLrzqt(i, f, pointF, true);
        }

        @Override // o.C55162xej.ActionBar
        public void copydefault(int i, float f, PointF pointF) {
            Intrinsics.checkNotNullParameter(pointF, "");
            OLrzqt(i, f, pointF, false);
        }

        public final void OLrzqt(int i, float f, PointF pointF, boolean z) {
            if (C55159xeg.this.EZpvd().gEmmrt()) {
                ActionBar actionBar = C55159xeg.this.AEQbTJ;
                if (actionBar != null) {
                    C55159xeg c55159xeg = C55159xeg.this;
                    InterfaceC55169xeq interfaceC55169xeq = (InterfaceC55169xeq) CollectionsKt___CollectionsKt.AkhnZx(actionBar.KWHzl(), i);
                    if (interfaceC55169xeq != null) {
                        boolean zOLrzqt = actionBar.OLrzqt(interfaceC55169xeq);
                        c55159xeg.EZpvd(zOLrzqt);
                        c55159xeg.KWHzl.KWHzl.setMarker(pointF, zOLrzqt);
                        android.widget.TextView textView = c55159xeg.KWHzl.djBIcL;
                        Intrinsics.copydefault(textView);
                        textView.setVisibility(0);
                        textView.setText(actionBar.AEQbTJ(interfaceC55169xeq));
                        c55159xeg.OLrzqt(textView);
                        android.graphics.Rect rect = new android.graphics.Rect();
                        c55159xeg.KWHzl.getRoot().getDrawingRect(rect);
                        c55159xeg.offsetDescendantRectToMyCoords(c55159xeg.KWHzl.OLrzqt, rect);
                        c55159xeg.OLrzqt(textView, pointF.x, rect);
                        if (z) {
                            actionBar.copydefault(i, interfaceC55169xeq);
                        } else {
                            actionBar.EZpvd(i, interfaceC55169xeq);
                        }
                    }
                }
                C55159xeg.this.copydefault = true;
                C55159xeg.this.copydefault();
                if (C55159xeg.this.EZpvd().djBIcL().invoke().booleanValue()) {
                    C55168xep c55168xep = C55168xep.EZpvd;
                    android.content.Context context = this.copydefault.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C55168xep.vibrate$default(c55168xep, context, 0L, 2, null);
                }
            }
        }

        @Override // o.C55162xej.ActionBar
        public void EZpvd() {
            if (C55159xeg.this.EZpvd().gEmmrt()) {
                ActionBar actionBar = C55159xeg.this.AEQbTJ;
                if (actionBar != null) {
                    C55159xeg c55159xeg = C55159xeg.this;
                    c55159xeg.EZpvd(actionBar.OLrzqt(null));
                    c55159xeg.KWHzl.KWHzl.KWHzl();
                    android.widget.TextView textView = c55159xeg.KWHzl.djBIcL;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setVisibility(4);
                    actionBar.EZpvd();
                }
                C55159xeg.this.copydefault = false;
                C55159xeg.this.copydefault();
            }
        }
    }

    private final void OLrzqt(C55162xej c55162xej) {
        c55162xej.setOnPressEntryListener(new LoaderManager(c55162xej));
        c55162xej.setOnDrawLineListener(new Dialog());
    }

    /* JADX INFO: renamed from: o.xeg$Dialog */
    public static final class Dialog implements C55162xej.TaskDescription {
        public Dialog() {
        }

        @Override // o.C55162xej.TaskDescription
        public void OLrzqt() {
            android.animation.ValueAnimator valueAnimator = C55159xeg.this.AhwBna;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C55159xeg c55159xeg = C55159xeg.this;
            android.widget.TextView textView = c55159xeg.KWHzl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c55159xeg.AhwBna = c55159xeg.AEQbTJ(textView);
            android.animation.ValueAnimator valueAnimator2 = C55159xeg.this.AhwBna;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }

        @Override // o.C55162xej.TaskDescription
        public void copydefault() {
            android.animation.ValueAnimator valueAnimator = C55159xeg.this.valueOf;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            C55159xeg c55159xeg = C55159xeg.this;
            android.widget.TextView textView = c55159xeg.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            c55159xeg.valueOf = c55159xeg.AEQbTJ(textView);
            android.animation.ValueAnimator valueAnimator2 = C55159xeg.this.valueOf;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }
    }

    public final android.animation.ValueAnimator AEQbTJ(final android.view.View view) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(C59462zhW.gEmmrt(this.EZpvd.valueOf()));
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.xee
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                C55159xeg.EZpvd(view, valueAnimator);
            }
        });
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "");
        return valueAnimatorOfFloat;
    }

    public static final void EZpvd(android.view.View view, android.animation.ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.copydefault(animatedValue, "");
        view.setAlpha(((java.lang.Float) animatedValue).floatValue());
    }

    public final void EZpvd(boolean z) {
        C55162xej c55162xej = this.KWHzl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55162xej, "");
        c55162xej.setVisibility(z ^ true ? 4 : 0);
        C55162xej c55162xej2 = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55162xej2, "");
        c55162xej2.setVisibility(z ? 4 : 0);
    }

    public final void setMinMaxTextViewPositions(java.util.List<? extends PointF> list, int i, int i2) {
        float fHeight;
        float fFetchVPNInfo;
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= list.size()) {
            this.KWHzl.AYXKKw.setText("");
            this.KWHzl.copydefault.setText("");
            return;
        }
        PointF pointF = list.get(i);
        PointF pointF2 = list.get(i2);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.KWHzl.OLrzqt.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(this.KWHzl.OLrzqt, rect);
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        ActionBar<InterfaceC55169xeq<java.lang.Number>> actionBar = this.AEQbTJ;
        if (actionBar != null) {
            textView.setText(actionBar.EZpvd((InterfaceC55169xeq) actionBar.KWHzl().get(i)));
        }
        Intrinsics.copydefault(textView);
        OLrzqt(textView);
        OLrzqt(textView, pointF.x, rect);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            boolean zEZpvd = this.EZpvd.EZpvd();
            if (zEZpvd) {
                fHeight = rect.height() - this.EZpvd.values().bottom;
                fFetchVPNInfo = this.EZpvd.fetchVPNInfo();
            } else {
                if (zEZpvd) {
                    throw new NoWhenBranchMatchedException();
                }
                fHeight = pointF.y;
                fFetchVPNInfo = this.EZpvd.fetchVPNInfo();
            }
            marginLayoutParams.topMargin = (int) (fHeight + fFetchVPNInfo);
            textView.setLayoutParams(marginLayoutParams);
            android.widget.TextView textView2 = this.KWHzl.copydefault;
            ActionBar<InterfaceC55169xeq<java.lang.Number>> actionBar2 = this.AEQbTJ;
            if (actionBar2 != null) {
                textView2.setText(actionBar2.EZpvd((InterfaceC55169xeq) actionBar2.KWHzl().get(i2)));
            }
            Intrinsics.copydefault(textView2);
            OLrzqt(textView2);
            OLrzqt(textView2, pointF2.x, rect);
            ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.topMargin = (int) ((pointF2.y - textView2.getMeasuredHeight()) - this.EZpvd.fetchVPNInfo());
                textView2.setLayoutParams(marginLayoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void copydefault() {
        boolean z = this.copydefault || this.djBIcL;
        android.widget.TextView textView = this.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((z || this.OLrzqt) ? 4 : 0);
        android.widget.TextView textView2 = this.KWHzl.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(z ? 4 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.xeg$ActionBar<T extends o.xeq<? extends java.lang.Number>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends InterfaceC55169xeq<? extends java.lang.Number>> void setAdapter(@NotNull final ActionBar<T> actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.AEQbTJ = actionBar;
        actionBar.AEQbTJ(new ActionBar.StateListAnimator() { // from class: o.xef
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C55159xeg.ActionBar.StateListAnimator
            public final void EZpvd(java.util.List list) {
                C55159xeg.setAdapter$lambda$17(this.AEQbTJ, actionBar, list);
            }
        });
        actionBar.EZpvd(new ActionBar.TaskDescription() { // from class: o.xeh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C55159xeg.ActionBar.TaskDescription
            public final void OLrzqt(boolean z) {
                this.EZpvd.KWHzl(z);
            }
        });
    }

    public final void setEntries(java.util.List<java.lang.Float> list, C55170xer c55170xer, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, fromInclusive = false, to = 1.0d, toInclusive = true) float f) {
        this.KWHzl.OLrzqt.setEntries(list, c55170xer, f);
        this.KWHzl.EZpvd.setEntries(list, c55170xer, f);
        this.KWHzl.AYXKKw.setAlpha(0.0f);
        this.KWHzl.copydefault.setAlpha(0.0f);
    }

    public final void KWHzl(boolean z) {
        this.KWHzl.OLrzqt.copydefault(z);
        this.KWHzl.EZpvd.copydefault(z);
    }

    public final void setConfig(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.EZpvd = activity;
        OLrzqt();
    }

    public final void setHighestLowestLabelVisibility(boolean z) {
        this.djBIcL = z;
        copydefault();
    }

    public final void OLrzqt(android.view.View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public final void OLrzqt(android.view.View view, float f, android.graphics.Rect rect) {
        float f2 = this.EZpvd.values().left;
        float fWidth = (rect.width() - this.EZpvd.values().right) - view.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = (int) C56548yJl.KWHzl(f - (view.getMeasuredWidth() / 2.0f), f2, C56548yJl.copydefault(fWidth, f2));
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX INFO: renamed from: o.xeg$ActionBar */
    public static abstract class ActionBar<T extends InterfaceC55169xeq<? extends java.lang.Number>> {
        public TaskDescription AhwBna;
        public java.util.List<? extends T> EZpvd = yDY.AhwBna();
        public StateListAnimator<T> gEmmrt;

        /* JADX INFO: renamed from: o.xeg$ActionBar$StateListAnimator */
        public interface StateListAnimator<T> {
            void EZpvd(@NotNull java.util.List<? extends T> list);
        }

        /* JADX INFO: renamed from: o.xeg$ActionBar$TaskDescription */
        public interface TaskDescription {
            void OLrzqt(boolean z);
        }

        public abstract float AEQbTJ();

        public abstract java.lang.String AEQbTJ(@NotNull T t);

        public abstract java.lang.String EZpvd(@NotNull T t);

        public void EZpvd() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd(int i, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(TaskDescription taskDescription) {
            this.AhwBna = taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<T> KWHzl() {
            return this.EZpvd;
        }

        public abstract C55170xer OLrzqt();

        public abstract boolean OLrzqt(T t);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void copydefault(int i, @NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
        }

        public final void AEQbTJ(StateListAnimator<T> stateListAnimator) {
            this.gEmmrt = stateListAnimator;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(this.EZpvd);
            }
        }

        public final void KWHzl(@NotNull java.util.List<? extends T> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.List<? extends T> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
            this.EZpvd = listAxsJAYsNCnLh;
            StateListAnimator<T> stateListAnimator = this.gEmmrt;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(listAxsJAYsNCnLh);
            }
            TaskDescription taskDescription = this.AhwBna;
            if (taskDescription != null) {
                taskDescription.OLrzqt(z);
            }
        }

        public final void copydefault() {
            java.util.List<? extends T> listAhwBna = yDY.AhwBna();
            this.EZpvd = listAhwBna;
            StateListAnimator<T> stateListAnimator = this.gEmmrt;
            if (stateListAnimator != null) {
                stateListAnimator.EZpvd(listAhwBna);
            }
            TaskDescription taskDescription = this.AhwBna;
            if (taskDescription != null) {
                taskDescription.OLrzqt(false);
            }
        }
    }

    /* JADX INFO: renamed from: o.xeg$Application */
    public static final class Application {
        public final int AEQbTJ;
        public final int AYXKKw;
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;
        public final int djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, java.lang.Object obj) {
            if ((i8 & 1) != 0) {
                i = application.copydefault;
            }
            if ((i8 & 2) != 0) {
                i2 = application.OLrzqt;
            }
            int i9 = i2;
            if ((i8 & 4) != 0) {
                i3 = application.djBIcL;
            }
            int i10 = i3;
            if ((i8 & 8) != 0) {
                i4 = application.AYXKKw;
            }
            int i11 = i4;
            if ((i8 & 16) != 0) {
                i5 = application.EZpvd;
            }
            int i12 = i5;
            if ((i8 & 32) != 0) {
                i6 = application.KWHzl;
            }
            int i13 = i6;
            if ((i8 & 64) != 0) {
                i7 = application.AEQbTJ;
            }
            return application.KWHzl(i, i9, i10, i11, i12, i13, i7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, @androidx.annotation.ColorInt int i7) {
            return new Application(i, i2, i3, i4, i5, i6, i7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.copydefault == application.copydefault && this.OLrzqt == application.OLrzqt && this.djBIcL == application.djBIcL && this.AYXKKw == application.AYXKKw && this.EZpvd == application.EZpvd && this.KWHzl == application.KWHzl && this.AEQbTJ == application.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.djBIcL)) * 31) + java.lang.Integer.hashCode(this.AYXKKw)) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.KWHzl)) * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "LineColorScheme(lineRiseColor=" + this.copydefault + ", lineFallColor=" + this.OLrzqt + ", touchMaskColor=" + this.djBIcL + ", touchSeparatorColor=" + this.AYXKKw + ", touchFocusDotBorderColor=" + this.EZpvd + ", touchFocusDotRiseColor=" + this.KWHzl + ", touchFocusDotFallColor=" + this.AEQbTJ + ")";
        }

        public Application(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, @androidx.annotation.ColorInt int i3, @androidx.annotation.ColorInt int i4, @androidx.annotation.ColorInt int i5, @androidx.annotation.ColorInt int i6, @androidx.annotation.ColorInt int i7) {
            this.copydefault = i;
            this.OLrzqt = i2;
            this.djBIcL = i3;
            this.AYXKKw = i4;
            this.EZpvd = i5;
            this.KWHzl = i6;
            this.AEQbTJ = i7;
        }
    }

    /* JADX INFO: renamed from: o.xeg$StateListAnimator */
    public static final class StateListAnimator {
        public static final int AEQbTJ = 0;
        public final java.lang.Float EZpvd;
        public final java.lang.Integer KWHzl;
        public final java.lang.Integer OLrzqt;
        public final java.lang.Integer copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Integer num, java.lang.Float f, java.lang.Integer num2, java.lang.Integer num3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                num = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                f = stateListAnimator.EZpvd;
            }
            if ((i & 4) != 0) {
                num2 = stateListAnimator.copydefault;
            }
            if ((i & 8) != 0) {
                num3 = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.OLrzqt(num, f, num2, num3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(@androidx.annotation.StyleRes java.lang.Integer num, java.lang.Float f, java.lang.Integer num2, @androidx.annotation.ColorInt java.lang.Integer num3) {
            return new StateListAnimator(num, f, num2, num3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Integer num = this.KWHzl;
            int iHashCode = num == null ? 0 : num.hashCode();
            java.lang.Float f = this.EZpvd;
            int iHashCode2 = f == null ? 0 : f.hashCode();
            java.lang.Integer num2 = this.copydefault;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            java.lang.Integer num3 = this.OLrzqt;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TextConfig(textAppearance=" + this.KWHzl + ", textSize=" + this.EZpvd + ", textSizeUnit=" + this.copydefault + ", textColor=" + this.OLrzqt + ")";
        }

        public StateListAnimator(@androidx.annotation.StyleRes java.lang.Integer num, java.lang.Float f, java.lang.Integer num2, @androidx.annotation.ColorInt java.lang.Integer num3) {
            this.KWHzl = num;
            this.EZpvd = f;
            this.copydefault = num2;
            this.OLrzqt = num3;
        }
    }

    /* JADX INFO: renamed from: o.xeg$TaskDescription */
    public static final class TaskDescription {
        public final int EZpvd;
        public final int KWHzl;
        public final int OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
            if ((i5 & 1) != 0) {
                i = taskDescription.copydefault;
            }
            if ((i5 & 2) != 0) {
                i2 = taskDescription.EZpvd;
            }
            if ((i5 & 4) != 0) {
                i3 = taskDescription.OLrzqt;
            }
            if ((i5 & 8) != 0) {
                i4 = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, int i3, int i4) {
            return new TaskDescription(i, i2, i3, i4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return this.copydefault == taskDescription.copydefault && this.EZpvd == taskDescription.EZpvd && this.OLrzqt == taskDescription.OLrzqt && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.copydefault) * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Integer.hashCode(this.OLrzqt)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "DottedGridConfig(riseColor=" + this.copydefault + ", fallColor=" + this.EZpvd + ", dotEdgeLength=" + this.OLrzqt + ", patternPadding=" + this.KWHzl + ")";
        }

        public TaskDescription(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2, int i3, int i4) {
            this.copydefault = i;
            this.EZpvd = i2;
            this.OLrzqt = i3;
            this.KWHzl = i4;
        }
    }

    /* JADX INFO: renamed from: o.xeg$Activity */
    public static final class Activity {
        public final float AEQbTJ;
        public final long AYXKKw;
        public final boolean AhwBna;
        public final float AkhnZx;
        public final Insets DbNXlk;
        public final boolean EZpvd;
        public final TaskDescription KWHzl;
        public final long OLrzqt;
        public final float copydefault;
        public final StateListAnimator djBIcL;
        public final OKVerticalSeparatorView.LineStyle fetchVPNInfo;
        public final Function0<java.lang.Boolean> gEmmrt;
        public final Application isConnected;
        public final StateListAnimator valueOf;
        public final float values;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 o.xeg$Application)
  (r2v0 float)
  (r3v0 float)
  (r4v0 long)
  (r6v0 androidx.core.graphics.Insets)
  (r7v0 o.xeg$StateListAnimator)
  (r8v0 long)
  (r10v0 float)
  (r11v0 o.xeg$StateListAnimator)
  (r12v0 float)
  (r13v0 kotlin.jvm.functions.Function0)
  (r14v0 boolean)
  (r15v0 com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView$LineStyle)
  (r16v0 o.xeg$TaskDescription)
  (r17v0 boolean)
 A[MD:(o.xeg$Application, float, float, long, androidx.core.graphics.Insets, o.xeg$StateListAnimator, long, float, o.xeg$StateListAnimator, float, kotlin.jvm.functions.Function0<java.lang.Boolean>, boolean, com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView$LineStyle, o.xeg$TaskDescription, boolean):void (m)] call: o.xeg.Activity.<init>(o.xeg$Application, float, float, long, androidx.core.graphics.Insets, o.xeg$StateListAnimator, long, float, o.xeg$StateListAnimator, float, kotlin.jvm.functions.Function0, boolean, com.okinc.uilab.okinteractivelinechart.OKVerticalSeparatorView$LineStyle, o.xeg$TaskDescription, boolean):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(Application application, float f, float f2, long j, Insets insets, StateListAnimator stateListAnimator, long j2, float f3, StateListAnimator stateListAnimator2, float f4, Function0 function0, boolean z, OKVerticalSeparatorView.LineStyle lineStyle, TaskDescription taskDescription, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(application, f, f2, j, insets, stateListAnimator, j2, f3, stateListAnimator2, f4, function0, z, lineStyle, taskDescription, z2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AYXKKw() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AkhnZx() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float DbNXlk() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull Application application, float f, float f2, long j, @NotNull Insets insets, @NotNull StateListAnimator stateListAnimator, long j2, float f3, @NotNull StateListAnimator stateListAnimator2, float f4, @NotNull Function0<java.lang.Boolean> function0, boolean z, @NotNull OKVerticalSeparatorView.LineStyle lineStyle, @NotNull TaskDescription taskDescription, boolean z2) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(insets, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(stateListAnimator2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(lineStyle, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            return new Activity(application, f, f2, j, insets, stateListAnimator, j2, f3, stateListAnimator2, f4, function0, z, lineStyle, taskDescription, z2, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function0<java.lang.Boolean> djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.isConnected, activity.isConnected) && java.lang.Float.compare(this.copydefault, activity.copydefault) == 0 && java.lang.Float.compare(this.AEQbTJ, activity.AEQbTJ) == 0 && C59462zhW.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.DbNXlk, activity.DbNXlk) && Intrinsics.EZpvd(this.djBIcL, activity.djBIcL) && C59462zhW.EZpvd(this.AYXKKw, activity.AYXKKw) && java.lang.Float.compare(this.AkhnZx, activity.AkhnZx) == 0 && Intrinsics.EZpvd(this.valueOf, activity.valueOf) && java.lang.Float.compare(this.values, activity.values) == 0 && Intrinsics.EZpvd(this.gEmmrt, activity.gEmmrt) && this.AhwBna == activity.AhwBna && this.fetchVPNInfo == activity.fetchVPNInfo && Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.EZpvd == activity.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float fetchVPNInfo() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean gEmmrt() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((((((((((((((this.isConnected.hashCode() * 31) + java.lang.Float.hashCode(this.copydefault)) * 31) + java.lang.Float.hashCode(this.AEQbTJ)) * 31) + C59462zhW.AuCTel(this.OLrzqt)) * 31) + this.DbNXlk.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + C59462zhW.AuCTel(this.AYXKKw)) * 31) + java.lang.Float.hashCode(this.AkhnZx)) * 31) + this.valueOf.hashCode()) * 31) + java.lang.Float.hashCode(this.values)) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKVerticalSeparatorView.LineStyle isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ChartConfig(lineColorScheme=" + this.isConnected + ", chartLineWidth=" + this.copydefault + ", chartLineShadowRadius=" + this.AEQbTJ + ", chartLineDrawingAnimationDuration=" + C59462zhW.getFieldNames(this.OLrzqt) + ", lineInsets=" + this.DbNXlk + ", highestLowestLabelConfig=" + this.djBIcL + ", highestLowestLabelAnimationDuration=" + C59462zhW.getFieldNames(this.AYXKKw) + ", marginBetweenLineAndExtremeLabel=" + this.AkhnZx + ", focusTipLabelConfig=" + this.valueOf + ", marginBetweenLineAndTimeLabel=" + this.values + ", enableHapticFeedback=" + this.gEmmrt + ", enableTouchChart=" + this.AhwBna + ", touchSeparatorStyle=" + this.fetchVPNInfo + ", dottedGridConfig=" + this.KWHzl + ", enableDottedGrid=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long valueOf() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Insets values() {
            return this.DbNXlk;
        }

        public Activity(Application application, float f, float f2, long j, Insets insets, StateListAnimator stateListAnimator, long j2, float f3, StateListAnimator stateListAnimator2, float f4, Function0<java.lang.Boolean> function0, boolean z, OKVerticalSeparatorView.LineStyle lineStyle, TaskDescription taskDescription, boolean z2) {
            Intrinsics.checkNotNullParameter(application, "");
            Intrinsics.checkNotNullParameter(insets, "");
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            Intrinsics.checkNotNullParameter(stateListAnimator2, "");
            Intrinsics.checkNotNullParameter(function0, "");
            Intrinsics.checkNotNullParameter(lineStyle, "");
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.isConnected = application;
            this.copydefault = f;
            this.AEQbTJ = f2;
            this.OLrzqt = j;
            this.DbNXlk = insets;
            this.djBIcL = stateListAnimator;
            this.AYXKKw = j2;
            this.AkhnZx = f3;
            this.valueOf = stateListAnimator2;
            this.values = f4;
            this.gEmmrt = function0;
            this.AhwBna = z;
            this.fetchVPNInfo = lineStyle;
            this.KWHzl = taskDescription;
            this.EZpvd = z2;
        }
    }

    public static final void setAdapter$lambda$17(C55159xeg c55159xeg, ActionBar actionBar, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((InterfaceC55169xeq) it.next()).KWHzl().floatValue()));
        }
        c55159xeg.setEntries(arrayList, actionBar.OLrzqt(), actionBar.AEQbTJ());
        c55159xeg.EZpvd(actionBar.OLrzqt(null));
    }
}

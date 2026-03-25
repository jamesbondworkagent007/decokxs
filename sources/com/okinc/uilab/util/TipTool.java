package com.okinc.uilab.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.okinc.business.invest_biz.data.bean.InvestPopUpData;
import com.okinc.uilab.util.TipTool;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33569myt;
import o.C52761wXj;
import o.C55296xhK;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55375xik;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TipTool {
    public final PendingIntent AhwBna;
    public final View KWHzl;
    public boolean OLrzqt;
    public PopupWindow djBIcL;
    public C55375xik valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public static final int copydefault = C55298xhM.dpInt$default(8.0f, (Context) null, 1, (Object) null);
    public static final int AEQbTJ = C55298xhM.dpInt$default(8.0f, (Context) null, 1, (Object) null);

    public interface ActionBar {
        void AEQbTJ(View view);
    }

    /* JADX INFO: loaded from: classes17.dex */
    public interface Application {
        void EZpvd(View view);
    }

    public interface StateListAnimator {
        void EZpvd(@NotNull View view, Animator.AnimatorListener animatorListener);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 android.view.View) A[MD:(android.view.View):void (m)] call: com.okinc.uilab.util.TipTool.<init>(android.view.View):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TipTool(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PendingIntent KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PopupWindow copydefault() {
        return this.djBIcL;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.uilab.util.TipTool.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TipTool KWHzl(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            return new TipTool(view, null);
        }
    }

    public TipTool(View view) {
        this.KWHzl = view;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        PendingIntent pendingIntent = new PendingIntent(this, OLrzqt(context));
        pendingIntent.setAnchorView(view);
        this.AhwBna = pendingIntent;
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C55375xik c55375xik = new C55375xik(context2, null, 0, 6, null);
        this.valueOf = c55375xik;
        c55375xik.setContentDescription("OKToolTips");
        PopupWindow popupWindow = new PopupWindow(this.valueOf, -2, -2);
        popupWindow.setOutsideTouchable(true);
        this.djBIcL = popupWindow;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Position {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position START = new Position("START", 0);
        public static final Position TOP = new Position("TOP", 1);
        public static final Position END = new Position("END", 2);
        public static final Position BOTTOM = new Position(InvestPopUpData.POSITION_BOTTOM, 3);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Position[] $values() {
            return new Position[]{START, TOP, END, BOTTOM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Position> getEntries() {
            return $ENTRIES;
        }

        private Position(String str, int i) {
        }

        static {
            Position[] positionArr$values = $values();
            $VALUES = positionArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(positionArr$values);
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Alignment {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;
        public static final Alignment START = new Alignment("START", 0);
        public static final Alignment CENTER = new Alignment("CENTER", 1);
        public static final Alignment END = new Alignment("END", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{START, CENTER, END};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Alignment> getEntries() {
            return $ENTRIES;
        }

        private Alignment(String str, int i) {
        }

        static {
            Alignment[] alignmentArr$values = $values();
            $VALUES = alignmentArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(alignmentArr$values);
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }

    public final TipTool AEQbTJ(@NotNull Position position) {
        Intrinsics.checkNotNullParameter(position, "");
        this.AhwBna.setPosition(position);
        return this;
    }

    public final TipTool EZpvd(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AhwBna.setCustomView(view);
        return this;
    }

    public final TipTool OLrzqt(int i) {
        this.AhwBna.setBubbleBackgroundColor(i);
        return this;
    }

    public final TipTool KWHzl(ActionBar actionBar) {
        this.AhwBna.setHideListener(actionBar);
        return this;
    }

    public final TipTool OLrzqt(int i, int i2, int i3, int i4) {
        PendingIntent pendingIntent = this.AhwBna;
        pendingIntent.setMarginStart$OKUILib_uilib(i);
        pendingIntent.setMarginTop$OKUILib_uilib(i2);
        pendingIntent.setMarginEnd$OKUILib_uilib(i3);
        pendingIntent.setMarginBottom$OKUILib_uilib(i4);
        return this;
    }

    public final TipTool AEQbTJ(int i) {
        this.AhwBna.setCustomBubbleAnchorDistance$OKUILib_uilib(Integer.valueOf(i));
        return this;
    }

    public final TipTool KWHzl(float f) {
        this.AhwBna.setBubbleRadius(f);
        return this;
    }

    public static /* synthetic */ TipTool setClickOutsideToDisappear$default(TipTool tipTool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return tipTool.EZpvd(z);
    }

    public final TipTool EZpvd(boolean z) {
        PopupWindow popupWindow = this.djBIcL;
        if (popupWindow != null) {
            popupWindow.setOutsideTouchable(z);
        }
        return this;
    }

    public static /* synthetic */ TipTool setShadowSpread$default(TipTool tipTool, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        return tipTool.AEQbTJ(f);
    }

    public final TipTool AEQbTJ(float f) {
        this.AhwBna.setShadowSpreadScope$OKUILib_uilib(f);
        return this;
    }

    public final TipTool EZpvd(int i) {
        this.AhwBna.setMarginBorder$OKUILib_uilib(i);
        return this;
    }

    public final TipTool OLrzqt(CharSequence charSequence) {
        if (this.AhwBna.OLrzqt() instanceof TextView) {
            View viewOLrzqt = this.AhwBna.OLrzqt();
            Intrinsics.copydefault(viewOLrzqt, "");
            ((TextView) viewOLrzqt).setText(charSequence);
        }
        return this;
    }

    public final TipTool copydefault(float f) {
        if (this.AhwBna.OLrzqt() instanceof TextView) {
            View viewOLrzqt = this.AhwBna.OLrzqt();
            Intrinsics.copydefault(viewOLrzqt, "");
            ((TextView) viewOLrzqt).setTextSize(f);
        }
        return this;
    }

    public static /* synthetic */ TipTool setStrokeColor$default(TipTool tipTool, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return tipTool.KWHzl(i);
    }

    public final TipTool KWHzl(int i) {
        this.AhwBna.setStrokeColor(i);
        return this;
    }

    public final TipTool djBIcL() {
        this.OLrzqt = true;
        Context context = this.AhwBna.getContext();
        if (context instanceof android.app.Activity) {
            View decorView = ((android.app.Activity) context).getWindow().getDecorView();
            Intrinsics.copydefault(decorView, "");
            final ViewGroup viewGroup = (ViewGroup) decorView;
            this.KWHzl.post(new Runnable() { // from class: o.xhZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    TipTool.copydefault(this.EZpvd, viewGroup);
                }
            });
        }
        return this;
    }

    public static final void copydefault(TipTool tipTool, ViewGroup viewGroup) {
        if (tipTool.OLrzqt) {
            Rect rect = new Rect();
            tipTool.KWHzl.getGlobalVisibleRect(rect);
            int[] iArr = new int[2];
            tipTool.KWHzl.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            if (tipTool.KWHzl.getRootView() instanceof ViewGroup) {
                View rootView = tipTool.KWHzl.getRootView();
                Intrinsics.copydefault(rootView, "");
                ((ViewGroup) rootView).addView(tipTool.AhwBna, -2, -2);
            } else {
                viewGroup.addView(tipTool.AhwBna, -2, -2);
            }
            tipTool.AhwBna.getViewTreeObserver().addOnPreDrawListener(tipTool.new LoaderManager(rect));
        }
    }

    public static final class LoaderManager implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Rect AEQbTJ;

        public LoaderManager(Rect rect) {
            this.AEQbTJ = rect;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TipTool.this.KWHzl().getViewTreeObserver().removeOnPreDrawListener(this);
            if (!TipTool.this.OLrzqt) {
                return true;
            }
            TipTool.this.KWHzl().copydefault(this.AEQbTJ);
            return false;
        }
    }

    public final TipTool OLrzqt() {
        this.OLrzqt = false;
        this.AhwBna.KWHzl();
        PopupWindow popupWindow = this.djBIcL;
        if (popupWindow != null) {
            popupWindow.dismiss();
            popupWindow.setOnDismissListener(null);
        }
        return this;
    }

    public static /* synthetic */ TipTool setShadowInterceptEvent$default(TipTool tipTool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return tipTool.OLrzqt(z);
    }

    public final TipTool OLrzqt(boolean z) {
        PopupWindow popupWindow = this.djBIcL;
        if (popupWindow != null) {
            popupWindow.setOutsideTouchable(!z);
        }
        return this;
    }

    public final android.app.Activity OLrzqt(Context context) {
        for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof android.app.Activity) {
                return (android.app.Activity) baseContext;
            }
        }
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        Intrinsics.checkNotNullExpressionValue(activityOLrzqt, "");
        return activityOLrzqt;
    }

    public final class PendingIntent extends FrameLayout {
        public float AEQbTJ;
        public boolean AYXKKw;
        public Path AhwBna;
        public int AkhnZx;
        public long AuCTel;
        public float AuCTelauCTel;
        public ActionBar AubY;
        public final /* synthetic */ TipTool AwvSrB;
        public int DbNXlk;
        public View EZpvd;
        public boolean KWHzl;
        public Alignment OLrzqt;
        public Rect copydefault;
        public Paint djBIcL;
        public int ejfBZ;
        public final int fARcdN;
        public boolean fIwbmz;
        public Application fJNWhG;
        public Integer fetchVPNInfo;
        public int gEmmrt;
        public int getFieldNames;
        public int getNewProxyInstance;
        public int hDKMBd;
        public View isConnected;
        public int iwGUEr;
        public int uzCIH;
        public int valueOf;
        public int values;
        public Position wlaJM;
        public Paint zLjUOn;
        public float zsXlph;
        public StateListAnimator zuBGHE;

        public final /* synthetic */ class StateListAnimator {
            public static final /* synthetic */ int[] EZpvd;
            public static final /* synthetic */ int[] OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[Position.values().length];
                try {
                    iArr[Position.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Position.TOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Position.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Position.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                EZpvd = iArr;
                int[] iArr2 = new int[Alignment.values().length];
                try {
                    iArr2[Alignment.END.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[Alignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[Alignment.START.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                OLrzqt = iArr2;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final View OLrzqt() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.zsXlph;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAnchorView(View view) {
            this.EZpvd = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAnimation(@NotNull StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            this.zuBGHE = stateListAnimator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setArrowOffset$OKUILib_uilib(float f) {
            this.AEQbTJ = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAutoHide(boolean z) {
            this.KWHzl = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBubbleRadius(float f) {
            this.AuCTelauCTel = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setClickToHide(boolean z) {
            this.AYXKKw = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContentPaddingBottom$OKUILib_uilib(int i) {
            this.gEmmrt = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContentPaddingEnd$OKUILib_uilib(int i) {
            this.values = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContentPaddingStart$OKUILib_uilib(int i) {
            this.DbNXlk = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setContentPaddingTop$OKUILib_uilib(int i) {
            this.AkhnZx = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setCustomBubbleAnchorDistance$OKUILib_uilib(Integer num) {
            this.fetchVPNInfo = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDefaultTipView$OKUILib_uilib(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            this.isConnected = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDisplayListener(Application application) {
            this.fJNWhG = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDuration(long j) {
            this.AuCTel = j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHideListener(ActionBar actionBar) {
            this.AubY = actionBar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginBorder$OKUILib_uilib(int i) {
            this.getFieldNames = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginBottom$OKUILib_uilib(int i) {
            this.getNewProxyInstance = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginEnd$OKUILib_uilib(int i) {
            this.iwGUEr = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginStart$OKUILib_uilib(int i) {
            this.hDKMBd = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setMarginTop$OKUILib_uilib(int i) {
            this.uzCIH = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setShadowSpreadScope$OKUILib_uilib(float f) {
            this.zsXlph = f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(@NotNull TipTool tipTool, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "");
            this.AwvSrB = tipTool;
            this.DbNXlk = C55298xhM.KWHzl(12.0f, context);
            this.AkhnZx = C55298xhM.KWHzl(8.0f, context);
            this.values = C55298xhM.KWHzl(12.0f, context);
            this.gEmmrt = C55298xhM.KWHzl(8.0f, context);
            this.AEQbTJ = -1.0f;
            this.getFieldNames = C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null);
            this.djBIcL = new Paint(1);
            this.zLjUOn = new Paint(1);
            this.valueOf = ContextCompat.getColor(context, C52761wXj.Activity.svY);
            this.wlaJM = Position.BOTTOM;
            this.OLrzqt = Alignment.CENTER;
            this.AuCTel = 214748364L;
            this.zuBGHE = new Activity(tipTool, 0L, 1, null);
            this.AuCTelauCTel = C55298xhM.EZpvd(8.0f, context);
            this.fARcdN = C55298xhM.KWHzl(4.0f, context);
            setWillNotDraw(false);
            View viewInflate = LayoutInflater.from(context).inflate(C52761wXj.Fragment.RlQdEF, (ViewGroup) this, false);
            this.isConnected = viewInflate;
            Intrinsics.copydefault(viewInflate, "");
            TextView textView = (TextView) viewInflate;
            textView.setPadding(0, 0, 0, 0);
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            textView.setMaxWidth(C55302xhQ.EZpvd(resources) - C55298xhM.OLrzqt(56, context));
            addView(textView, -2, -2);
            Paint paint = this.djBIcL;
            paint.setColor(this.valueOf);
            paint.setStyle(Paint.Style.FILL);
            Paint paint2 = this.zLjUOn;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(C55298xhM.EZpvd(0.5f, context));
            paint2.setColor(ContextCompat.getColor(context, C52761wXj.Activity.aBDePw));
            ViewCompat.addOnUnhandledKeyEventListener(this, new ViewCompat.OnUnhandledKeyEventListenerCompat() { // from class: o.xhY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat
                public final boolean onUnhandledKeyEvent(android.view.View view, android.view.KeyEvent keyEvent) {
                    return TipTool.PendingIntent.KWHzl(this.copydefault, view, keyEvent);
                }
            });
        }

        public static final boolean KWHzl(PendingIntent pendingIntent, View view, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(keyEvent, "");
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 4) {
                return false;
            }
            pendingIntent.KWHzl();
            return false;
        }

        public final void setCustomView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "");
            removeView(this.isConnected);
            this.isConnected = view;
            addView(view, -2, -2);
        }

        public final void setBubbleBackgroundColor(int i) {
            this.valueOf = i;
            this.djBIcL.setColor(i);
            this.isConnected.setBackgroundColor(i);
            postInvalidate();
        }

        public final void setAlignment(@NotNull Alignment alignment) {
            Intrinsics.checkNotNullParameter(alignment, "");
            this.OLrzqt = alignment;
            postInvalidate();
        }

        public final void setPosition(@NotNull Position position) {
            Intrinsics.checkNotNullParameter(position, "");
            this.wlaJM = position;
            int i = StateListAnimator.EZpvd[position.ordinal()];
            if (i == 1) {
                setPaddingRelative(this.DbNXlk, this.AkhnZx, this.values + TipTool.copydefault, this.gEmmrt);
            } else if (i == 2) {
                setPaddingRelative(this.DbNXlk, this.AkhnZx, this.values, this.gEmmrt + TipTool.copydefault);
            } else if (i == 3) {
                setPaddingRelative(this.DbNXlk + TipTool.copydefault, this.AkhnZx, this.values, this.gEmmrt);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                setPaddingRelative(this.DbNXlk, this.AkhnZx + TipTool.copydefault, this.values, this.gEmmrt);
            }
            postInvalidate();
        }

        public final void valueOf() {
            ViewParent parent = getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }

        public final void copydefault(@NotNull Rect rect) {
            Intrinsics.checkNotNullParameter(rect, "");
            this.copydefault = new Rect(rect);
            EZpvd(rect);
            AEQbTJ(rect);
            AEQbTJ();
        }

        public final void KWHzl() {
            valueOf();
            this.EZpvd = null;
        }

        public final void setStrokeColor(int i) {
            this.zLjUOn.setColor(i);
            invalidate();
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            float f = this.AuCTelauCTel;
            this.AhwBna = copydefault(rectF, f, f, f, f);
        }

        @Override // android.view.View
        public void onDraw(@NotNull Canvas canvas) {
            Intrinsics.checkNotNullParameter(canvas, "");
            super.onDraw(canvas);
            Path path = this.AhwBna;
            if (path != null) {
                Intrinsics.copydefault(path);
                canvas.drawPath(path, this.djBIcL);
                Path path2 = this.AhwBna;
                Intrinsics.copydefault(path2);
                canvas.drawPath(path2, this.zLjUOn);
            }
        }

        public static final class Application extends AnimatorListenerAdapter {
            public Application() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                Intrinsics.checkNotNullParameter(animator, "");
                super.onAnimationEnd(animator);
                Application application = PendingIntent.this.fJNWhG;
                if (application != null) {
                    application.EZpvd(PendingIntent.this);
                }
            }
        }

        public final void djBIcL() {
            this.zuBGHE.EZpvd(this, new Application());
        }

        public final void EZpvd() {
            if (this.AYXKKw) {
                setOnClickListener(new View.OnClickListener() { // from class: o.xic
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        TipTool.PendingIntent.OLrzqt(this.AEQbTJ, view);
                    }
                });
            }
            if (this.KWHzl) {
                postDelayed(new Runnable() { // from class: o.xie
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        TipTool.PendingIntent.KWHzl(this.AEQbTJ);
                    }
                }, this.AuCTel);
            }
        }

        public static final void OLrzqt(PendingIntent pendingIntent, View view) {
            pendingIntent.valueOf();
        }

        public static final void KWHzl(PendingIntent pendingIntent) {
            pendingIntent.valueOf();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void EZpvd(Rect rect) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            Resources resources = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "");
            int iEZpvd = C55302xhQ.EZpvd(resources);
            Position position = this.wlaJM;
            Position position2 = Position.START;
            if (position == position2 || position == Position.END) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (C55296xhK.OLrzqt(context)) {
                    if (this.wlaJM == position2 && rect.right + getWidth() > iEZpvd) {
                        int i = rect.right;
                        layoutParams.width = ((iEZpvd - i) - this.getFieldNames) - this.fARcdN;
                    } else if (this.wlaJM == Position.END) {
                        int width = getWidth();
                        int i2 = rect.left;
                        if (width > i2) {
                            layoutParams.width = (i2 - this.getFieldNames) - this.fARcdN;
                        }
                    }
                } else if (this.wlaJM == position2) {
                    int width2 = getWidth();
                    int i3 = rect.left;
                    if (width2 > i3) {
                        layoutParams.width = (i3 - this.getFieldNames) - this.fARcdN;
                    } else if (this.wlaJM == Position.END && rect.right + getWidth() > iEZpvd) {
                        int i4 = rect.right;
                        layoutParams.width = ((iEZpvd - i4) - this.getFieldNames) - this.fARcdN;
                    }
                }
            } else if (position == Position.TOP || position == Position.BOTTOM) {
                int width3 = (getWidth() - rect.width()) / 2;
                int i5 = rect.right + width3;
                if (i5 > iEZpvd) {
                    this.fIwbmz = false;
                    this.ejfBZ = (i5 - iEZpvd) + this.getFieldNames;
                } else {
                    int i6 = rect.left;
                    if (i6 - width3 < 0) {
                        this.fIwbmz = true;
                        this.ejfBZ = (width3 - i6) + this.getFieldNames;
                    }
                }
            }
            setLayoutParams(layoutParams);
        }

        public final void AEQbTJ(Rect rect) {
            int iEZpvd;
            int i;
            float fEZpvd;
            float width;
            int height;
            float f;
            Integer num = this.fetchVPNInfo;
            int iIntValue = num != null ? num.intValue() : this.fARcdN;
            Position position = this.wlaJM;
            Position position2 = Position.START;
            if (position == position2 || position == Position.END) {
                int i2 = AEQbTJ(this.EZpvd)[1];
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                int iEZpvd2 = i2 - C55302xhQ.EZpvd(context);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                int iAEQbTJ = C55302xhQ.AEQbTJ(context2);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                int iCopydefault = (iAEQbTJ - i2) - C55302xhQ.copydefault(context3);
                if (getHeight() / 2 > iEZpvd2) {
                    this.AEQbTJ = iEZpvd2 + (TipTool.copydefault / 2.0f);
                    int height2 = getHeight() / 2;
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    iEZpvd = height2 - (i2 - C55302xhQ.EZpvd(context4));
                } else if (iCopydefault < getHeight() / 2) {
                    this.AEQbTJ = (getHeight() - iCopydefault) + (TipTool.copydefault / 2.0f);
                    iEZpvd = -((getHeight() / 2) - iCopydefault);
                } else {
                    iEZpvd = 0;
                }
                int iHeight = rect.height();
                int iCopydefault2 = C56548yJl.copydefault(iHeight, getHeight());
                int iValueOf = C56548yJl.valueOf(iHeight, getHeight());
                int i3 = StateListAnimator.OLrzqt[this.OLrzqt.ordinal()];
                if (i3 == 1) {
                    iWidth = iCopydefault2 - iValueOf;
                } else if (i3 == 2) {
                    iWidth = ((iCopydefault2 * (-1)) / 2) + (iValueOf / 2);
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (this.wlaJM == position2) {
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    if (C55296xhK.OLrzqt(context5)) {
                        Intrinsics.checkNotNullExpressionValue(getResources(), "");
                        fEZpvd = ((((C55302xhQ.EZpvd(r1) - rect.right) - getWidth()) - iIntValue) - this.hDKMBd) - this.zsXlph;
                        width = -fEZpvd;
                    } else {
                        width = ((rect.left - getWidth()) - iIntValue) - this.hDKMBd;
                        i = this.getFieldNames;
                        if (width < i) {
                            width = i;
                        }
                    }
                } else {
                    Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    if (C55296xhK.OLrzqt(context6)) {
                        Intrinsics.checkNotNullExpressionValue(getResources(), "");
                        fEZpvd = (C55302xhQ.EZpvd(r1) - rect.left) + iIntValue + this.iwGUEr + this.zsXlph;
                        width = -fEZpvd;
                    } else {
                        i = rect.right + iIntValue + this.iwGUEr;
                        width = i;
                    }
                }
                setTranslationX(width);
                setTranslationY(rect.top + iWidth + iEZpvd);
                return;
            }
            iWidth = this.OLrzqt == Alignment.CENTER ? (rect.width() / 2) - (getWidth() / 2) : 0;
            if (this.wlaJM == Position.TOP) {
                height = ((rect.top - getHeight()) - iIntValue) - this.uzCIH;
            } else {
                height = rect.bottom + iIntValue + this.getNewProxyInstance;
            }
            setTranslationY(height);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            if (C55296xhK.OLrzqt(context7)) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "");
                int iEZpvd3 = C55302xhQ.EZpvd(resources);
                int i4 = rect.left;
                int iWidth = rect.width() / 2;
                f = -((((iEZpvd3 - i4) - iWidth) - (getWidth() / 2)) - (this.fIwbmz ? this.ejfBZ : -this.ejfBZ));
            } else {
                f = rect.left + iWidth + (this.fIwbmz ? this.ejfBZ : -this.ejfBZ);
            }
            setTranslationX(f);
        }

        public final int[] AEQbTJ(View view) {
            Intrinsics.copydefault(view);
            int width = view.getWidth() / 2;
            int height = view.getHeight() / 2;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new int[]{iArr[0] + width, iArr[1] + height};
        }

        public final void AEQbTJ() {
            if (ViewCompat.getLayoutDirection(this) == 1) {
                Position position = this.wlaJM;
                Position position2 = Position.START;
                if (position == position2) {
                    this.wlaJM = Position.END;
                } else if (position == Position.END) {
                    this.wlaJM = position2;
                }
            }
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f = this.AuCTelauCTel;
            this.AhwBna = copydefault(rectF, f, f, f, f);
            djBIcL();
            EZpvd();
            getViewTreeObserver().addOnPreDrawListener(new Activity(this.AwvSrB));
        }

        public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
            public final /* synthetic */ TipTool EZpvd;

            public Activity(TipTool tipTool) {
                this.EZpvd = tipTool;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                PendingIntent.this.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!this.EZpvd.OLrzqt) {
                    return true;
                }
                int[] iArr = new int[2];
                this.EZpvd.KWHzl().getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                PendingIntent pendingIntentKWHzl = this.EZpvd.KWHzl();
                pendingIntentKWHzl.setTranslationX(i - pendingIntentKWHzl.copydefault());
                pendingIntentKWHzl.setTranslationY(i2 - pendingIntentKWHzl.copydefault());
                ViewParent parent = this.EZpvd.KWHzl().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(this.EZpvd.KWHzl());
                }
                C55375xik c55375xik = this.EZpvd.valueOf;
                if (c55375xik != null) {
                    TipTool tipTool = this.EZpvd;
                    PendingIntent pendingIntent = PendingIntent.this;
                    c55375xik.addView(tipTool.KWHzl(), -2, -2);
                    c55375xik.setShadowColor(Color.parseColor("#0D000000"));
                    c55375xik.setShadowSpread(pendingIntent.copydefault());
                }
                PendingIntent pendingIntentKWHzl2 = this.EZpvd.KWHzl();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 8388659;
                pendingIntentKWHzl2.setLayoutParams(layoutParams);
                pendingIntentKWHzl2.setTranslationX(0.0f);
                pendingIntentKWHzl2.setTranslationY(0.0f);
                PopupWindow popupWindowCopydefault = this.EZpvd.copydefault();
                if (popupWindowCopydefault != null) {
                    final TipTool tipTool2 = this.EZpvd;
                    final PendingIntent pendingIntent2 = PendingIntent.this;
                    popupWindowCopydefault.setFocusable(false);
                    popupWindowCopydefault.setWidth(tipTool2.KWHzl().getMeasuredWidth() + (((int) pendingIntent2.copydefault()) * 2));
                    android.app.Activity activityOLrzqt = C33569myt.OLrzqt(pendingIntent2.getContext());
                    if (activityOLrzqt != null && !activityOLrzqt.isDestroyed() && !activityOLrzqt.isFinishing()) {
                        popupWindowCopydefault.showAtLocation(tipTool2.KWHzl, 0, i - ((int) pendingIntent2.copydefault()), i2 - ((int) pendingIntent2.copydefault()));
                    }
                    popupWindowCopydefault.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o.xid
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            TipTool.PendingIntent.Activity.OLrzqt(tipTool2, pendingIntent2);
                        }
                    });
                }
                return false;
            }

            public static final void OLrzqt(TipTool tipTool, PendingIntent pendingIntent) {
                tipTool.KWHzl().KWHzl();
                ActionBar actionBar = pendingIntent.AubY;
                if (actionBar != null) {
                    actionBar.AEQbTJ(pendingIntent);
                }
            }
        }

        public final Path copydefault(RectF rectF, float f, float f2, float f3, float f4) {
            Position position;
            float f5;
            float f6;
            float f7 = 2;
            float f8 = f * f7;
            float f9 = f2 * f7;
            float f10 = f4 * f7;
            float f11 = f3 * f7;
            Path path = new Path();
            if (this.copydefault == null) {
                return path;
            }
            if (f8 < 0.0f) {
                f8 = 0.0f;
            }
            if (f9 < 0.0f) {
                f9 = 0.0f;
            }
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            Position position2 = this.wlaJM;
            Position position3 = Position.END;
            float f12 = position2 == position3 ? TipTool.copydefault : 0.0f;
            Position position4 = this.wlaJM;
            Position position5 = Position.BOTTOM;
            float f13 = position4 == position5 ? TipTool.copydefault : 0.0f;
            Position position6 = this.wlaJM;
            Position position7 = Position.START;
            float f14 = position6 == position7 ? TipTool.copydefault : 0.0f;
            Position position8 = this.wlaJM;
            Position position9 = Position.TOP;
            if (position8 == position9) {
                f5 = TipTool.copydefault;
                position = position3;
            } else {
                position = position3;
                f5 = 0.0f;
            }
            float f15 = rectF.left + f12;
            float f16 = rectF.top + f13;
            float f17 = rectF.right - f14;
            float f18 = rectF.bottom - f5;
            float f19 = this.AEQbTJ;
            float f20 = f8;
            path.moveTo(f15 + (f8 / 2.0f), f16);
            if (this.wlaJM == position5) {
                if (f19 == -1.0f) {
                    Intrinsics.copydefault(this.copydefault);
                    this.AEQbTJ = r4.centerX() - getX();
                }
                float f21 = (this.AEQbTJ + f15) - (TipTool.AEQbTJ / 2);
                path.lineTo(f21 - (TipTool.AEQbTJ / 2), f16);
                f6 = f11;
                path.lineTo((TipTool.AEQbTJ / 2) + f21, rectF.top);
                path.lineTo(f21 + (TipTool.AEQbTJ / 2) + TipTool.AEQbTJ, f16);
            } else {
                f6 = f11;
            }
            path.lineTo(f17 - (f9 / 2.0f), f16);
            path.quadTo(f17, f16, f17, (f9 / f7) + f16);
            if (this.wlaJM == position7) {
                if (f19 == -1.0f) {
                    float f22 = f18 / 2.0f;
                    path.lineTo(f17, f22 - TipTool.AEQbTJ);
                    path.lineTo(rectF.right, f22);
                    path.lineTo(f17, f22 + TipTool.AEQbTJ);
                } else {
                    float f23 = ((this.AEQbTJ + f16) - (TipTool.AEQbTJ / 2)) - this.zsXlph;
                    path.lineTo(f17, f23 - TipTool.AEQbTJ);
                    path.lineTo(rectF.right, f23);
                    path.lineTo(f17, f23 + TipTool.AEQbTJ);
                }
            }
            float f24 = f10 / f7;
            path.lineTo(f17, f18 - f24);
            path.quadTo(f17, f18, f17 - f24, f18);
            if (this.wlaJM == position9) {
                if (f19 == -1.0f) {
                    Intrinsics.copydefault(this.copydefault);
                    this.AEQbTJ = r2.centerX() - getX();
                }
                float f25 = this.AEQbTJ + f15 + (TipTool.AEQbTJ / 2);
                path.lineTo((TipTool.AEQbTJ / 2) + f25, f18);
                path.lineTo(f25 - (TipTool.AEQbTJ / 2), rectF.bottom);
                path.lineTo((f25 - (TipTool.AEQbTJ / 2)) - TipTool.AEQbTJ, f18);
            }
            float f26 = f6 / f7;
            path.lineTo(f15 + f26, f18);
            path.quadTo(f15, f18, f15, f18 - f26);
            if (this.wlaJM == position) {
                if (f19 == -1.0f) {
                    float f27 = f18 / 2.0f;
                    path.lineTo(f15, TipTool.AEQbTJ + f27);
                    path.lineTo(rectF.left, f27);
                    path.lineTo(f15, f27 - TipTool.AEQbTJ);
                } else {
                    float f28 = ((this.AEQbTJ + f16) - (TipTool.AEQbTJ / 2)) - this.zsXlph;
                    path.lineTo(f15, f28 - TipTool.AEQbTJ);
                    path.lineTo(rectF.left, f28);
                    path.lineTo(f15, f28 + TipTool.AEQbTJ);
                }
            }
            float f29 = f20 / f7;
            path.lineTo(f15, f16 + f29);
            path.quadTo(f15, f16, f29 + f15, f16);
            path.close();
            return path;
        }
    }

    public final class Activity implements StateListAnimator {
        public final long AEQbTJ;

        public Activity(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 com.okinc.uilab.util.TipTool)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(com.okinc.uilab.util.TipTool, long):void (m)] (LINE:974) call: com.okinc.uilab.util.TipTool.Activity.<init>(com.okinc.uilab.util.TipTool, long):void type: THIS */
        public /* synthetic */ Activity(TipTool tipTool, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0L : j);
        }

        @Override // com.okinc.uilab.util.TipTool.StateListAnimator
        public void EZpvd(@NotNull View view, Animator.AnimatorListener animatorListener) {
            Intrinsics.checkNotNullParameter(view, "");
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(this.AEQbTJ).setListener(animatorListener);
        }
    }
}

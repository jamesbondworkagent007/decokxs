package o;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.app.FrameMetricsAggregator;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.wYT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wZc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC52808wZc implements wYT, ViewTreeObserver.OnGlobalLayoutListener {
    public boolean AYXKKw;
    public boolean AhwBna;
    public android.os.Message AkhnZx;
    public final java.util.List<PendingIntent> AuCTel;
    public int DbNXlk;
    public android.view.View EZpvd;
    public android.os.Message KWHzl;
    public final android.content.Context OLrzqt;
    public boolean copydefault;
    public android.os.Message djBIcL;
    public android.os.Message ejfBZ;
    public android.os.Message fetchVPNInfo;
    public wYY gEmmrt;
    public int isConnected;
    public boolean valueOf;
    public final ActionBar values;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.wZc$Activity */
    public interface Activity {
        void copydefault(android.graphics.Bitmap bitmap, PendingIntent pendingIntent);
    }

    /* JADX INFO: renamed from: o.wZc$Application */
    public interface Application {
        void OLrzqt(float f, float f2, RectF rectF, TaskDescription taskDescription);
    }

    /* JADX INFO: renamed from: o.wZc$PendingIntent */
    public static final class PendingIntent {
        public Activity AEQbTJ;
        public android.view.View AYXKKw;
        public Application copydefault;
        public int EZpvd = -1;
        public RectF OLrzqt = new RectF();
        public TaskDescription KWHzl = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull RectF rectF) {
            Intrinsics.checkNotNullParameter(rectF, "");
            this.OLrzqt = rectF;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(@NotNull TaskDescription taskDescription) {
            Intrinsics.checkNotNullParameter(taskDescription, "");
            this.KWHzl = taskDescription;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final android.view.View AYXKKw() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(Activity activity) {
            this.AEQbTJ = activity;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RectF OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(android.view.View view) {
            this.AYXKKw = view;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(Application application) {
            this.copydefault = application;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.EZpvd = i;
        }
    }

    /* JADX INFO: renamed from: o.wZc$TaskDescription */
    public static final class TaskDescription {
        public float AEQbTJ;
        public float EZpvd;
        public float KWHzl;
        public float OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(float f) {
            this.KWHzl = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float copydefault() {
            return this.EZpvd;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.view.View AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.DbNXlk = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ(android.view.View view) {
        this.EZpvd = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc EZpvd(boolean z) {
        this.copydefault = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc KWHzl(int i) {
        this.isConnected = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc copydefault() {
        this.AYXKKw = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc copydefault(boolean z) {
        this.valueOf = z;
        return this;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = context;
        this.valueOf = true;
        this.isConnected = -2013265920;
        this.DbNXlk = -2013265920;
        this.copydefault = true;
        this.AuCTel = new java.util.ArrayList();
        Intrinsics.copydefault(context, "");
        AEQbTJ(((android.app.Activity) context).findViewById(android.R.id.content));
        this.values = new ActionBar(this);
        valueOf();
    }

    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc EZpvd(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        AEQbTJ(view);
        valueOf();
        return this;
    }

    public final void AkhnZx() {
        android.view.View viewAEQbTJ = AEQbTJ();
        Intrinsics.copydefault(viewAEQbTJ, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewAEQbTJ;
        for (PendingIntent pendingIntent : this.AuCTel) {
            android.graphics.Rect rect = new android.graphics.Rect();
            android.view.View viewAYXKKw = pendingIntent.AYXKKw();
            if (viewAYXKKw != null) {
                viewAYXKKw.getGlobalVisibleRect(rect);
            }
            RectF rectF = new RectF(rect);
            pendingIntent.AEQbTJ(rectF);
            Application applicationAEQbTJ = pendingIntent.AEQbTJ();
            Intrinsics.copydefault(applicationAEQbTJ);
            applicationAEQbTJ.OLrzqt(viewGroup.getWidth() - rectF.right, viewGroup.getHeight() - rectF.bottom, rectF, pendingIntent.EZpvd());
        }
    }

    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc OLrzqt(android.view.View view, int i, Application application, Activity activity) {
        if (!(AEQbTJ() instanceof android.view.ViewGroup)) {
            return this;
        }
        if (application == null && i != -1) {
            throw new java.lang.IllegalArgumentException("onPositionCallback can not be null.".toString());
        }
        android.view.View viewAEQbTJ = AEQbTJ();
        Intrinsics.copydefault(viewAEQbTJ, "");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewAEQbTJ;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        RectF rectF = new RectF(rect);
        if (rect.isEmpty()) {
            return this;
        }
        TaskDescription taskDescription = new TaskDescription();
        if (application != null) {
            application.OLrzqt(viewGroup.getWidth() - rectF.right, viewGroup.getHeight() - rectF.bottom, rectF, taskDescription);
        }
        PendingIntent pendingIntent = new PendingIntent();
        pendingIntent.copydefault(i);
        pendingIntent.AEQbTJ(rectF);
        pendingIntent.OLrzqt(view);
        pendingIntent.AEQbTJ(taskDescription);
        pendingIntent.OLrzqt(application);
        pendingIntent.EZpvd(activity == null ? new C52822wZq(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, FrameMetricsAggregator.EVERY_DURATION, null) : activity);
        this.AuCTel.add(pendingIntent);
        return this;
    }

    public final ViewTreeObserverOnGlobalLayoutListenerC52808wZc EZpvd(wYT.Activity activity) {
        this.ejfBZ = activity != null ? this.values.obtainMessage(66, activity) : null;
        return this;
    }

    public wYY KWHzl() {
        wYY wyy = this.gEmmrt;
        if (wyy != null) {
            return wyy;
        }
        android.content.Context context = this.OLrzqt;
        Intrinsics.copydefault(context, "");
        wYY wyy2 = (wYY) ((android.app.Activity) context).findViewById(C52761wXj.FragmentManager.getPostValueLengthLimit);
        this.gEmmrt = wyy2;
        return wyy2;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc EZpvd() {
        wYY wyyKWHzl = KWHzl();
        if (wyyKWHzl != null) {
            wYY.addViewForTip$OKUILib_uilib$default(wyyKWHzl, false, 1, null);
        }
        return this;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc OLrzqt() {
        wYY wyyKWHzl = KWHzl();
        if (wyyKWHzl != null) {
            wyyKWHzl.KWHzl(false);
        }
        return this;
    }

    public final void gEmmrt() {
        int id;
        if (!this.AYXKKw) {
            throw new java.lang.IllegalArgumentException("only for isNext mode,please invoke enableNext() first".toString());
        }
        if (KWHzl() == null) {
            return;
        }
        wYY wyyKWHzl = KWHzl();
        PendingIntent pendingIntentOLrzqt = wyyKWHzl != null ? wyyKWHzl.OLrzqt() : null;
        android.os.Message message = this.AkhnZx;
        if (message == null || pendingIntentOLrzqt == null) {
            return;
        }
        if (message != null) {
            if (pendingIntentOLrzqt.AYXKKw() == null) {
                id = -1;
            } else {
                android.view.View viewAYXKKw = pendingIntentOLrzqt.AYXKKw();
                Intrinsics.copydefault(viewAYXKKw);
                id = viewAYXKKw.getId();
            }
            message.arg1 = id;
            message.arg2 = pendingIntentOLrzqt.copydefault();
        }
        android.os.Message.obtain(this.AkhnZx).sendToTarget();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.wYY.addViewForTip$OKUILib_uilib$default(o.wYY, boolean, int, java.lang.Object):void */
    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc DbNXlk() {
        if (KWHzl() != null) {
            wYY wyyKWHzl = KWHzl();
            this.gEmmrt = wyyKWHzl;
            this.AhwBna = true;
            Intrinsics.copydefault(wyyKWHzl);
            this.AYXKKw = wyyKWHzl.EZpvd();
            return this;
        }
        if (this.AuCTel.isEmpty()) {
            return this;
        }
        wYY wyy = new wYY(this.OLrzqt, this, this.isConnected, this.DbNXlk, this.AuCTel, this.AYXKKw);
        wyy.setId(C52761wXj.FragmentManager.getPostValueLengthLimit);
        if (AEQbTJ() instanceof android.widget.FrameLayout) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            android.view.View viewAEQbTJ = AEQbTJ();
            Intrinsics.copydefault(viewAEQbTJ, "");
            android.view.View viewAEQbTJ2 = AEQbTJ();
            Intrinsics.copydefault(viewAEQbTJ2, "");
            ((android.view.ViewGroup) viewAEQbTJ).addView(wyy, ((android.view.ViewGroup) viewAEQbTJ2).getChildCount(), layoutParams);
        } else {
            android.view.View viewAEQbTJ3 = AEQbTJ();
            if ((viewAEQbTJ3 != null ? viewAEQbTJ3.getParent() : null) != null) {
                android.view.View viewAEQbTJ4 = AEQbTJ();
                android.view.ViewParent parent = viewAEQbTJ4 != null ? viewAEQbTJ4.getParent() : null;
                Intrinsics.copydefault(parent, "");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                viewGroup.removeView(AEQbTJ());
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(viewGroup.getContext());
                frameLayout.addView(AEQbTJ(), new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(wyy);
                android.view.View viewAEQbTJ5 = AEQbTJ();
                viewGroup.addView(frameLayout, viewAEQbTJ5 != null ? viewAEQbTJ5.getLayoutParams() : null);
            }
        }
        if (this.valueOf) {
            wyy.setOnClickListener(new View.OnClickListener() { // from class: o.wZa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    ViewTreeObserverOnGlobalLayoutListenerC52808wZc.AEQbTJ(this.EZpvd, view);
                }
            });
        }
        wYY.addViewForTip$OKUILib_uilib$default(wyy, false, 1, null);
        this.gEmmrt = wyy;
        this.AhwBna = true;
        isConnected();
        return this;
    }

    public static final void AEQbTJ(ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc, android.view.View view) {
        if (viewTreeObserverOnGlobalLayoutListenerC52808wZc.copydefault) {
            viewTreeObserverOnGlobalLayoutListenerC52808wZc.AYXKKw();
        }
        viewTreeObserverOnGlobalLayoutListenerC52808wZc.djBIcL();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC52808wZc AYXKKw() {
        if (KWHzl() == null) {
            return this;
        }
        wYY wyy = this.gEmmrt;
        android.view.ViewParent parent = wyy != null ? wyy.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if ((viewGroup instanceof android.widget.RelativeLayout) || (viewGroup instanceof android.widget.FrameLayout)) {
            viewGroup.removeView(this.gEmmrt);
        } else {
            if (viewGroup != null) {
                viewGroup.removeView(this.gEmmrt);
            }
            android.view.View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            android.view.ViewParent parent2 = viewGroup != null ? viewGroup.getParent() : null;
            android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
            if (childAt != null && viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
                viewGroup2.addView(childAt, viewGroup.getLayoutParams());
            }
        }
        this.gEmmrt = null;
        values();
        this.AhwBna = false;
        AEQbTJ((android.view.View) null);
        fetchVPNInfo();
        this.AuCTel.clear();
        return this;
    }

    public final void djBIcL() {
        android.os.Message message = this.KWHzl;
        if (message != null) {
            android.os.Message.obtain(message).sendToTarget();
        }
    }

    public final void values() {
        android.os.Message message = this.fetchVPNInfo;
        if (message != null) {
            android.os.Message.obtain(message).sendToTarget();
        }
    }

    public final void isConnected() {
        android.os.Message message = this.ejfBZ;
        if (message != null) {
            android.os.Message.obtain(message).sendToTarget();
        }
    }

    public final void AhwBna() {
        android.os.Message message = this.djBIcL;
        if (message != null) {
            android.os.Message.obtain(message).sendToTarget();
        }
    }

    public final void valueOf() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View viewAEQbTJ = AEQbTJ();
        if (viewAEQbTJ == null || (viewTreeObserver = viewAEQbTJ.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void fetchVPNInfo() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View viewAEQbTJ = AEQbTJ();
        if (viewAEQbTJ == null || (viewTreeObserver = viewAEQbTJ.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        fetchVPNInfo();
        AhwBna();
    }

    /* JADX INFO: renamed from: o.wZc$ActionBar */
    public static final class ActionBar extends android.os.Handler {
        public final WeakReference<ViewTreeObserverOnGlobalLayoutListenerC52808wZc> EZpvd;

        public ActionBar(ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc) {
            super(android.os.Looper.getMainLooper());
            this.EZpvd = new WeakReference<>(viewTreeObserverOnGlobalLayoutListenerC52808wZc);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull android.os.Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            ViewTreeObserverOnGlobalLayoutListenerC52808wZc viewTreeObserverOnGlobalLayoutListenerC52808wZc = this.EZpvd.get();
            if (viewTreeObserverOnGlobalLayoutListenerC52808wZc == null) {
            }
            wYY wyyKWHzl = viewTreeObserverOnGlobalLayoutListenerC52808wZc.KWHzl();
            android.view.View viewAEQbTJ = viewTreeObserverOnGlobalLayoutListenerC52808wZc.AEQbTJ();
            if (wyyKWHzl == null || viewAEQbTJ == null) {
                return;
            }
            switch (message.what) {
                case 64:
                    java.lang.Object obj = message.obj;
                    Intrinsics.copydefault(obj, "");
                    ((wYT.StateListAnimator) obj).EZpvd();
                    break;
                case 65:
                    java.lang.Object obj2 = message.obj;
                    Intrinsics.copydefault(obj2, "");
                    ((wYT.TaskDescription) obj2).AEQbTJ();
                    break;
                case 66:
                    java.lang.Object obj3 = message.obj;
                    Intrinsics.copydefault(obj3, "");
                    ((wYT.Activity) obj3).EZpvd(wyyKWHzl);
                    break;
                case 67:
                    android.view.View viewFindViewById = viewAEQbTJ.findViewById(message.arg1);
                    android.view.View viewFindViewById2 = wyyKWHzl.findViewById(message.arg2);
                    java.lang.Object obj4 = message.obj;
                    Intrinsics.copydefault(obj4, "");
                    ((wYT.ActionBar) obj4).copydefault(wyyKWHzl, viewFindViewById, viewFindViewById2);
                    break;
                case 68:
                    java.lang.Object obj5 = message.obj;
                    Intrinsics.copydefault(obj5, "");
                    ((wYT.Application) obj5).OLrzqt();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: o.wZc$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wZc.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}

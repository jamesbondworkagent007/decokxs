package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.okinc.components.track.TrackChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C57406yhn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.usg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnClickListenerC49657usg extends android.widget.FrameLayout implements View.OnClickListener {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public Activity AEQbTJ;
    public Observer<java.lang.String> AYXKKw;
    public Function0<Unit> EZpvd;
    public AbstractC49534uqP KWHzl;
    public TaskDescription OLrzqt;
    public StateListAnimator djBIcL;
    public Observer<java.lang.String> gEmmrt;
    public ActionBar valueOf;

    /* JADX INFO: renamed from: o.usg$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void copydefault();
    }

    /* JADX INFO: renamed from: o.usg$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public interface Activity {
        void EZpvd();
    }

    /* JADX INFO: renamed from: o.usg$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public interface StateListAnimator {
    }

    /* JADX INFO: renamed from: o.usg$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public interface TaskDescription {
        void copydefault();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnBaseTokenClickListener(@NotNull TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        this.OLrzqt = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnCoinSearchListener(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.AEQbTJ = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMarketListener(Function0<Unit> function0) {
        this.EZpvd = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMenuClickListener(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.valueOf = actionBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnMoreOptionsClickListener(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.djBIcL = stateListAnimator;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC49657usg(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC49657usg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC49657usg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    /* JADX INFO: renamed from: o.usg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.usg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void copydefault() {
        AbstractC49534uqP abstractC49534uqP = (AbstractC49534uqP) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.fetchVPNInfo, this, true);
        this.KWHzl = abstractC49534uqP;
        AbstractC49534uqP abstractC49534uqP2 = null;
        if (abstractC49534uqP == null) {
            Intrinsics.gEmmrt("");
            abstractC49534uqP = null;
        }
        abstractC49534uqP.EZpvd(this);
        AbstractC49534uqP abstractC49534uqP3 = this.KWHzl;
        if (abstractC49534uqP3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49534uqP3 = null;
        }
        abstractC49534uqP3.setLifecycleOwner(null);
        AbstractC49534uqP abstractC49534uqP4 = this.KWHzl;
        if (abstractC49534uqP4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49534uqP2 = abstractC49534uqP4;
        }
        abstractC49534uqP2.copydefault.setImageResource(C57406yhn.Activity.iwGUEr);
        setupComponentListeners();
    }

    public final void setupComponentListeners() {
        AbstractC49534uqP abstractC49534uqP = this.KWHzl;
        AbstractC49534uqP abstractC49534uqP2 = null;
        if (abstractC49534uqP == null) {
            Intrinsics.gEmmrt("");
            abstractC49534uqP = null;
        }
        android.widget.ImageView imageView = abstractC49534uqP.djBIcL;
        imageView.setOnClickListener(new LoaderManager(imageView, 1000L, this));
        AbstractC49534uqP abstractC49534uqP3 = this.KWHzl;
        if (abstractC49534uqP3 == null) {
            Intrinsics.gEmmrt("");
            abstractC49534uqP3 = null;
        }
        LinearLayoutCompat linearLayoutCompat = abstractC49534uqP3.gEmmrt;
        linearLayoutCompat.setOnClickListener(new PendingIntent(linearLayoutCompat, 1000L, this));
        AbstractC49534uqP abstractC49534uqP4 = this.KWHzl;
        if (abstractC49534uqP4 == null) {
            Intrinsics.gEmmrt("");
            abstractC49534uqP4 = null;
        }
        android.widget.ImageView imageView2 = abstractC49534uqP4.AEQbTJ;
        imageView2.setOnClickListener(new Fragment(imageView2, 1000L, this));
        AbstractC49534uqP abstractC49534uqP5 = this.KWHzl;
        if (abstractC49534uqP5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC49534uqP2 = abstractC49534uqP5;
        }
        C49658ush c49658ush = abstractC49534uqP2.values;
        c49658ush.setOnClickListener(new Dialog(c49658ush, 1000L, this));
    }

    /* JADX INFO: renamed from: o.usg$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ ViewOnClickListenerC49657usg KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, ViewOnClickListenerC49657usg viewOnClickListenerC49657usg) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = viewOnClickListenerC49657usg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                TaskDescription taskDescription = this.KWHzl.OLrzqt;
                if (taskDescription != null) {
                    taskDescription.copydefault();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.usg$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC49657usg EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, ViewOnClickListenerC49657usg viewOnClickListenerC49657usg) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = viewOnClickListenerC49657usg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                Function0 function0 = this.EZpvd.EZpvd;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.usg$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ ViewOnClickListenerC49657usg copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, ViewOnClickListenerC49657usg viewOnClickListenerC49657usg) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.copydefault = viewOnClickListenerC49657usg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActionBar actionBar = this.copydefault.valueOf;
                if (actionBar != null) {
                    actionBar.copydefault();
                }
                C32866mlf.onEvent$default("trade_sidebar_click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
            }
        }
    }

    /* JADX INFO: renamed from: o.usg$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC49657usg EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, ViewOnClickListenerC49657usg viewOnClickListenerC49657usg) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = viewOnClickListenerC49657usg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                Activity activity = this.EZpvd.AEQbTJ;
                if (activity != null) {
                    activity.EZpvd();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.djBIcL = null;
        this.valueOf = null;
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.EZpvd = null;
        this.AYXKKw = null;
        this.gEmmrt = null;
    }
}

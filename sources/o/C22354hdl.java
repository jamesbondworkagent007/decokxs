package o;

import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hdl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22354hdl extends C31215lpn {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final DexHomeViewModel AEQbTJ;
    public final C59534zip AYXKKw;
    public final Function1<TradingType, Unit> AhwBna;
    public final android.app.Activity EZpvd;
    public final hEC OLrzqt;
    public final WindowManager.LayoutParams copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 android.app.Activity)
  (r2v0 com.okinc.business.trade.features.home.domain.model.TradingType)
  (r3v0 com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel)
  (r4v0 kotlin.jvm.functions.Function1)
 A[MD:(android.app.Activity, com.okinc.business.trade.features.home.domain.model.TradingType, com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel, kotlin.jvm.functions.Function1<? super com.okinc.business.trade.features.home.domain.model.TradingType, kotlin.Unit>):void (m)] call: o.hdl.<init>(android.app.Activity, com.okinc.business.trade.features.home.domain.model.TradingType, com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel, kotlin.jvm.functions.Function1):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C22354hdl(android.app.Activity activity, TradingType tradingType, DexHomeViewModel dexHomeViewModel, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, tradingType, dexHomeViewModel, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super com.okinc.business.trade.features.home.domain.model.TradingType, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C22354hdl(android.app.Activity activity, TradingType tradingType, DexHomeViewModel dexHomeViewModel, Function1<? super TradingType, Unit> function1) {
        super(activity);
        this.EZpvd = activity;
        this.AEQbTJ = dexHomeViewModel;
        this.AhwBna = function1;
        this.copydefault = activity.getWindow().getAttributes();
        hEC hecAEQbTJ = hEC.AEQbTJ(activity.getLayoutInflater());
        hecAEQbTJ.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Intrinsics.checkNotNullExpressionValue(hecAEQbTJ, "");
        this.OLrzqt = hecAEQbTJ;
        C59534zip c59534zip = new C59534zip();
        this.AYXKKw = c59534zip;
        LinearLayoutCompat root = hecAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        setContentView(root);
        c59534zip.register(C28244kUf.class, new C22352hdj());
        c59534zip.register(C22353hdk.class, new C22351hdi(tradingType, new Function1() { // from class: o.hdn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22354hdl.AEQbTJ(this.copydefault, (C22353hdk) obj);
            }
        }));
        hecAEQbTJ.AEQbTJ.setLayoutManager(new LinearLayoutManager(EZpvd()));
        hecAEQbTJ.AEQbTJ.setAdapter(c59534zip);
    }

    /* JADX INFO: renamed from: o.hdl$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hdl.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void EZpvd(@NotNull android.app.Activity activity, @NotNull TradingType tradingType, @NotNull DexHomeViewModel dexHomeViewModel, @NotNull Function1<? super TradingType, Unit> function1) {
            Intrinsics.checkNotNullParameter(activity, "");
            Intrinsics.checkNotNullParameter(tradingType, "");
            Intrinsics.checkNotNullParameter(dexHomeViewModel, "");
            Intrinsics.checkNotNullParameter(function1, "");
            new C22354hdl(activity, tradingType, dexHomeViewModel, function1, null).OLrzqt();
        }
    }

    public static final Unit AEQbTJ(final C22354hdl c22354hdl, final C22353hdk c22353hdk) {
        Intrinsics.checkNotNullParameter(c22353hdk, "");
        c22354hdl.AYXKKw.notifyDataSetChanged();
        c22354hdl.OLrzqt.getRoot().postDelayed(new java.lang.Runnable() { // from class: o.hdp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C22354hdl.OLrzqt(this.EZpvd, c22353hdk);
            }
        }, 100L);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C22354hdl c22354hdl, C22353hdk c22353hdk) {
        c22354hdl.AhwBna.invoke(c22353hdk.KWHzl());
        c22354hdl.dismiss();
    }

    public final void OLrzqt() {
        WindowManager.LayoutParams layoutParams = this.copydefault;
        if (layoutParams != null) {
            layoutParams.alpha = 0.65f;
        }
        this.EZpvd.getWindow().setAttributes(this.copydefault);
        KWHzl();
        copydefault();
        showAtLocation(this.EZpvd.getWindow().getDecorView(), 48, 0, 0);
    }

    public final void KWHzl() {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this.OLrzqt.OLrzqt, androidx.constraintlayout.motion.widget.Key.ROTATION, 0.0f, -90.0f);
        objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 1.96f, 0.48f, 0.96f));
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.start();
    }

    public final void copydefault() {
        this.AYXKKw.setItems(this.AEQbTJ.fetchVPNInfo());
        this.AYXKKw.notifyDataSetChanged();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        RxBus.AEQbTJ(new xXE());
        WindowManager.LayoutParams layoutParams = this.copydefault;
        if (layoutParams != null) {
            layoutParams.alpha = 1.0f;
        }
        this.EZpvd.getWindow().setAttributes(this.copydefault);
    }
}

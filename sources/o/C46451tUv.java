package o;

import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46451tUv {
    public final java.lang.String EZpvd;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;
    public static final Activity Companion = new Activity(null);
    public static final C46451tUv AEQbTJ = new C46451tUv("okx_digi_icon_dark.webp", "images/account/android/google_auth/", false);
    public static final C46451tUv KWHzl = new C46451tUv("eco_ic_coupon.webp", null, false, 2, null);

    public C46451tUv(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("images/social_trading/Android/") : (r2v0 java.lang.String))
  (r3v0 boolean)
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:239) call: o.tUv.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C46451tUv(java.lang.String str, java.lang.String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "images/social_trading/Android/" : str2, z);
    }

    /* JADX INFO: renamed from: o.tUv$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tUv.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C46451tUv EZpvd() {
            return C46451tUv.AEQbTJ;
        }

        public final C46451tUv OLrzqt() {
            return C46451tUv.KWHzl;
        }
    }

    public static /* synthetic */ java.lang.String getUrl$default(C46451tUv c46451tUv, android.content.Context context, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = c46451tUv.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c46451tUv.OLrzqt;
        }
        return c46451tUv.AEQbTJ(context, str, z);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C43454rpb.copydefault(str + this.copydefault, context, z);
    }

    public static /* synthetic */ void loadAsDrawable$default(C46451tUv c46451tUv, android.content.Context context, int i, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MIN_VALUE;
        }
        c46451tUv.copydefault(context, i, function1);
    }

    public final void copydefault(@NotNull android.content.Context context, int i, @NotNull Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (C46443tUn.copydefault.AEQbTJ(context)) {
            Glide.AEQbTJ(context).EZpvd(getUrl$default(this, context, null, false, 6, null)).OLrzqt((RX<?>) new C5448Sc().copydefault(i, i)).OLrzqt(new StateListAnimator(function1));
        }
    }

    /* JADX INFO: renamed from: o.tUv$StateListAnimator */
    public static final class StateListAnimator extends AbstractC5449Sd<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> OLrzqt;

        @Override // o.InterfaceC5462Sq
        public void a_(android.graphics.drawable.Drawable drawable) {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/So;)V */
        @Override // o.InterfaceC5462Sq
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable, InterfaceC5460So<? super android.graphics.drawable.Drawable> interfaceC5460So) {
            Intrinsics.checkNotNullParameter(drawable, "");
            this.OLrzqt.invoke(drawable);
        }
    }
}

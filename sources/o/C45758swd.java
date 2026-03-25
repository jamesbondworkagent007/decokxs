package o;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.base.utils.commmon.ThreadUtils;
import com.okinc.uilab.banner.OKAlertBanner;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C45716svX;
import o.C45758swd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.swd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45758swd {
    public final ComponentCallbacks2C5333Nr EZpvd;
    public final OKAlertBanner KWHzl;
    public final C55135xeI copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public static final int OLrzqt = C45716svX.ActionBar.ORxRYg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKAlertBanner OLrzqt() {
        return this.KWHzl;
    }

    public C45758swd(@NotNull OKAlertBanner oKAlertBanner, @NotNull C55135xeI c55135xeI, @NotNull ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr) {
        Intrinsics.checkNotNullParameter(oKAlertBanner, "");
        Intrinsics.checkNotNullParameter(c55135xeI, "");
        Intrinsics.checkNotNullParameter(componentCallbacks2C5333Nr, "");
        this.KWHzl = oKAlertBanner;
        this.copydefault = c55135xeI;
        this.EZpvd = componentCallbacks2C5333Nr;
    }

    public C45758swd(@NotNull final android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        OKAlertBanner oKAlertBanner = new OKAlertBanner(context, null, C45716svX.Activity.copydefault, 2, null);
        C55135xeI c55135xeI = new C55135xeI(context, new InterfaceC55228xfw() { // from class: o.swg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC55228xfw
            public final boolean OLrzqt(java.lang.String str) {
                return C45758swd.OLrzqt(context, str);
            }
        });
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        this(oKAlertBanner, c55135xeI, componentCallbacks2C5333NrAEQbTJ);
        this.KWHzl.setTag(this);
    }

    public static final boolean OLrzqt(android.content.Context context, java.lang.String str) {
        C45770swp c45770swp = new C45770swp(context);
        Intrinsics.copydefault((java.lang.Object) str);
        c45770swp.OLrzqt(str);
        return true;
    }

    public final OKAlertBanner EZpvd(@NotNull C45759swe c45759swe) {
        Intrinsics.checkNotNullParameter(c45759swe, "");
        return AEQbTJ(this.KWHzl, c45759swe);
    }

    public final OKAlertBanner AEQbTJ(OKAlertBanner oKAlertBanner, C45759swe c45759swe) {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            copydefault(oKAlertBanner, c45759swe);
            OLrzqt(oKAlertBanner, c45759swe, this.EZpvd);
            OLrzqt(oKAlertBanner, c45759swe, this.copydefault);
            oKAlertBanner.setId(OLrzqt);
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            oKAlertBanner.setVisibility(8);
        }
        return oKAlertBanner;
    }

    public final void copydefault(@NotNull OKAlertBanner oKAlertBanner, @NotNull C45759swe c45759swe) {
        Intrinsics.checkNotNullParameter(oKAlertBanner, "");
        Intrinsics.checkNotNullParameter(c45759swe, "");
        oKAlertBanner.setType(4);
        oKAlertBanner.setBackgroundColor(C33492mxV.OLrzqt() ? c45759swe.copydefault() : c45759swe.AEQbTJ());
        oKAlertBanner.KWHzl().setTextSize(2, 12.0f);
    }

    /* JADX INFO: renamed from: o.swd$Activity */
    public static final class Activity implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ C45759swe EZpvd;
        public final /* synthetic */ OKAlertBanner copydefault;

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            return false;
        }

        public Activity(C45759swe c45759swe, OKAlertBanner oKAlertBanner) {
            this.EZpvd = c45759swe;
            this.copydefault = oKAlertBanner;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        public boolean copydefault(final android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            int iKWHzl = C33492mxV.OLrzqt() ? this.EZpvd.KWHzl() : this.EZpvd.AhwBna();
            if (drawable != null) {
                C33057mpK.copydefault(drawable, iKWHzl);
            }
            final OKAlertBanner oKAlertBanner = this.copydefault;
            ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.swj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45758swd.Activity.KWHzl(oKAlertBanner, drawable);
                }
            });
            return true;
        }

        public static final void KWHzl(OKAlertBanner oKAlertBanner, android.graphics.drawable.Drawable drawable) {
            oKAlertBanner.setLeadingIcon(drawable);
        }
    }

    public final void OLrzqt(OKAlertBanner oKAlertBanner, C45759swe c45759swe, ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr) {
        try {
            Intrinsics.copydefault(componentCallbacks2C5333Nr.EZpvd(C43023rhU.EZpvd(c45759swe.EZpvd())).OLrzqt((RY<android.graphics.drawable.Drawable>) new Activity(c45759swe, oKAlertBanner)).AEQbTJ());
        } catch (java.lang.Exception unused) {
        }
    }

    public final void OLrzqt(@NotNull OKAlertBanner oKAlertBanner, @NotNull C45759swe c45759swe, @NotNull C55135xeI c55135xeI) {
        Intrinsics.checkNotNullParameter(oKAlertBanner, "");
        Intrinsics.checkNotNullParameter(c45759swe, "");
        Intrinsics.checkNotNullParameter(c55135xeI, "");
        int iValueOf = C33492mxV.OLrzqt() ? c45759swe.valueOf() : c45759swe.djBIcL();
        android.text.Spannable spannableAEQbTJ = c55135xeI.AEQbTJ(c45759swe.OLrzqt());
        spannableAEQbTJ.setSpan(new android.text.style.ForegroundColorSpan(iValueOf), 0, spannableAEQbTJ.length(), 33);
        oKAlertBanner.KWHzl().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        oKAlertBanner.setMessage(spannableAEQbTJ);
    }

    /* JADX INFO: renamed from: o.swd$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.swd.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final int copydefault() {
            return C45758swd.OLrzqt;
        }
    }
}

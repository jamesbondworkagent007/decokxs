package o;

import android.view.ViewTreeObserver;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.tradeuilib.imgs.OKRemoteImageResource;
import com.okinc.tradeuilib.imgs.RemoteSupportedScaleType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.utr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49721utr {

    /* JADX INFO: renamed from: o.utr$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RemoteSupportedScaleType.values().length];
            try {
                iArr[RemoteSupportedScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[RemoteSupportedScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[RemoteSupportedScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final void OLrzqt(@NotNull android.widget.ImageView imageView, @NotNull OKRemoteImageResource.Resource resource, android.content.Context context, @androidx.annotation.DrawableRes int i, @NotNull RemoteSupportedScaleType remoteSupportedScaleType, java.lang.String str, int i2, int i3, Function0<Unit> function0, Function1<? super android.graphics.drawable.Drawable, Unit> function1, boolean z, java.lang.String str2) {
        int i4;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(remoteSupportedScaleType, "");
        if (context != null) {
            java.lang.String strCopydefault = C43454rpb.copydefault(resource.getFilename(), context, z ? false : resource.getSupportDark());
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = i3;
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = i2;
            if (i2 == -1 || (i4 = intRef.element) == -1) {
                imageView.getViewTreeObserver().addOnPreDrawListener(new Activity(imageView, intRef2, intRef, strCopydefault, context, i, remoteSupportedScaleType, str, function1, function0));
                return;
            } else {
                copydefault(imageView, strCopydefault, context, i, remoteSupportedScaleType, str, i2, i4, function1);
                return;
            }
        }
        pUU.copydefault(str2, "fail to load remote image because context is null");
    }

    /* JADX INFO: renamed from: o.utr$Activity */
    public static final class Activity implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> AEQbTJ;
        public final /* synthetic */ android.widget.ImageView AYXKKw;
        public final /* synthetic */ RemoteSupportedScaleType AhwBna;
        public final /* synthetic */ Function0<Unit> EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ Ref.IntRef djBIcL;
        public final /* synthetic */ java.lang.String gEmmrt;
        public final /* synthetic */ Ref.IntRef valueOf;

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(android.widget.ImageView imageView, Ref.IntRef intRef, Ref.IntRef intRef2, java.lang.String str, android.content.Context context, int i, RemoteSupportedScaleType remoteSupportedScaleType, java.lang.String str2, Function1<? super android.graphics.drawable.Drawable, Unit> function1, Function0<Unit> function0) {
            this.AYXKKw = imageView;
            this.djBIcL = intRef;
            this.valueOf = intRef2;
            this.copydefault = str;
            this.OLrzqt = context;
            this.KWHzl = i;
            this.AhwBna = remoteSupportedScaleType;
            this.gEmmrt = str2;
            this.AEQbTJ = function1;
            this.EZpvd = function0;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.AYXKKw.getViewTreeObserver().removeOnPreDrawListener(this);
            this.djBIcL.element = this.AYXKKw.getMeasuredHeight();
            this.valueOf.element = this.AYXKKw.getMeasuredWidth();
            C49721utr.copydefault(this.AYXKKw, this.copydefault, this.OLrzqt, this.KWHzl, this.AhwBna, this.gEmmrt, this.djBIcL.element, this.valueOf.element, this.AEQbTJ);
            Unit unit = Unit.INSTANCE;
            Function0<Unit> function0 = this.EZpvd;
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
    }

    public static final void copydefault(android.widget.ImageView imageView, java.lang.String str, android.content.Context context, @androidx.annotation.DrawableRes int i, RemoteSupportedScaleType remoteSupportedScaleType, java.lang.String str2, int i2, int i3, Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
        C5448Sc c5448ScDjBIcL;
        if (str == null || str.length() == 0 || !AEQbTJ(context)) {
            if (function1 != null) {
                function1.invoke(null);
                return;
            }
            return;
        }
        int i4 = Application.EZpvd[remoteSupportedScaleType.ordinal()];
        if (i4 == 1) {
            c5448ScDjBIcL = new C5448Sc().djBIcL();
        } else if (i4 == 2) {
            c5448ScDjBIcL = new C5448Sc().valueOf();
        } else {
            if (i4 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c5448ScDjBIcL = new C5448Sc().fetchVPNInfo();
        }
        C5448Sc c5448ScCopydefault = c5448ScDjBIcL.KWHzl(i).copydefault(AbstractC5360Os.copydefault).copydefault(false);
        Intrinsics.checkNotNullExpressionValue(c5448ScCopydefault, "");
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, str, str2, i2, i3).OLrzqt((RX<?>) c5448ScCopydefault).OLrzqt((RY<android.graphics.drawable.Drawable>) new ActionBar(function1)).EZpvd(imageView);
    }

    /* JADX INFO: renamed from: o.utr$ActionBar */
    public static final class ActionBar implements RY<android.graphics.drawable.Drawable> {
        public final /* synthetic */ Function1<android.graphics.drawable.Drawable, Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(Function1<? super android.graphics.drawable.Drawable, Unit> function1) {
            this.copydefault = function1;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
            Function1<android.graphics.drawable.Drawable, Unit> function1 = this.copydefault;
            if (function1 == null) {
                return false;
            }
            function1.invoke(null);
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
            Function1<android.graphics.drawable.Drawable, Unit> function1 = this.copydefault;
            if (function1 == null) {
                return false;
            }
            function1.invoke(drawable);
            return false;
        }
    }

    public static final boolean AEQbTJ(android.content.Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        android.app.Activity activity = (android.app.Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }
}

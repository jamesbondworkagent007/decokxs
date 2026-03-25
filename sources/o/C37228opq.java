package o;

import android.graphics.PointF;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.GlideException;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.imui.preview.adapter.IMMediaPagerAdapter$BaseViewHolder$notifyLoadingState$1;
import com.okinc.im.imui.preview.model.ImageState;
import com.okinc.im.imui.preview.model.PagerState;
import com.okinc.im.imui.tracking.model.MediaType;
import com.okinc.im.imui.tracking.model.ResultState;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKMediaMessageContent;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKSightMessage;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import o.C37228opq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C37228opq extends androidx.recyclerview.widget.ListAdapter<C37186opA, StateListAnimator> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public final LifecycleOwner EZpvd;
    public RecyclerView OLrzqt;
    public ActionBar copydefault;
    public final java.util.Map<java.lang.String, C35943oJl> valueOf;

    /* JADX INFO: renamed from: o.opq$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void KWHzl(long j);

        void KWHzl(long j, float f, @NotNull PointF pointF);

        void OLrzqt(long j, boolean z);

        void OLrzqt(@NotNull OKMessage oKMessage, @NotNull java.lang.String str);

        void OLrzqt(boolean z, MediaType mediaType, @NotNull ResultState resultState);

        void copydefault(int i);

        void isConnected();

        void values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        this.copydefault = actionBar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37228opq(@NotNull LifecycleOwner lifecycleOwner) {
        super(new PendingIntent());
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.EZpvd = lifecycleOwner;
        this.valueOf = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: o.opq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.opq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void EZpvd(int i) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String str;
        C35943oJl c35943oJl;
        C37233opv c37233opvOLrzqt;
        IMImageModel iMImageModelOLrzqt;
        android.net.Uri uriAYXKKw;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(getItem(i));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        C37186opA c37186opA = (C37186opA) objM7377constructorimpl;
        java.lang.String string = (c37186opA == null || (c37233opvOLrzqt = c37186opA.OLrzqt()) == null || (iMImageModelOLrzqt = c37233opvOLrzqt.OLrzqt()) == null || (uriAYXKKw = iMImageModelOLrzqt.AYXKKw()) == null) ? null : uriAYXKKw.toString();
        java.lang.String str2 = this.AEQbTJ;
        pUU.EZpvd("IMMediaPagerAdapter", "onPageChanged: from " + (str2 != null ? C59454zhO.isConnected(str2, 30) : null) + " to " + (string != null ? C59454zhO.isConnected(string, 30) : null));
        if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) string) && (str = this.AEQbTJ) != null && (c35943oJl = this.valueOf.get(str)) != null) {
            java.lang.String str3 = this.AEQbTJ;
            pUU.EZpvd("IMMediaPagerAdapter", "onPageChanged: pausing player for " + (str3 != null ? C59454zhO.isConnected(str3, 30) : null));
            c35943oJl.AhwBna();
        }
        this.AEQbTJ = string;
    }

    public final void KWHzl() {
        pUU.EZpvd("IMMediaPagerAdapter", "onPageScrollStarted: pausing all " + this.valueOf.size() + " players");
        java.util.Iterator<T> it = this.valueOf.values().iterator();
        while (it.hasNext()) {
            ((C35943oJl) it.next()).AhwBna();
        }
    }

    public final void OLrzqt() {
        C35943oJl c35943oJl;
        java.lang.String str = this.AEQbTJ;
        pUU.EZpvd("IMMediaPagerAdapter", "pauseCurrentPlayer: url=" + (str != null ? C59454zhO.isConnected(str, 30) : null));
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null || (c35943oJl = this.valueOf.get(str2)) == null) {
            return;
        }
        c35943oJl.AhwBna();
    }

    public final void copydefault() {
        C35943oJl c35943oJl;
        java.lang.String str = this.AEQbTJ;
        pUU.EZpvd("IMMediaPagerAdapter", "resumeCurrentPlayer: url=" + (str != null ? C59454zhO.isConnected(str, 30) : null));
        java.lang.String str2 = this.AEQbTJ;
        if (str2 == null || (c35943oJl = this.valueOf.get(str2)) == null) {
            return;
        }
        c35943oJl.DbNXlk();
    }

    public final void AEQbTJ() {
        pUU.EZpvd("IMMediaPagerAdapter", "releaseCurrentPlayer: releasing " + this.valueOf.size() + " players");
        java.util.Iterator<T> it = this.valueOf.values().iterator();
        while (it.hasNext()) {
            ((C35943oJl) it.next()).valueOf();
        }
        this.valueOf.clear();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.opq$Application */
    public final class Application extends StateListAnimator {
        public final nOS AEQbTJ;
        public android.view.View djBIcL;
        public final /* synthetic */ C37228opq valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public nOS AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C37228opq.StateListAnimator
        public android.view.View OLrzqt() {
            return this.djBIcL;
        }

        /* JADX INFO: renamed from: o.opq$Application$Activity */
        public static final class Activity implements RY<java.io.File> {
            public final /* synthetic */ Application AEQbTJ;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ nOS OLrzqt;
            public final /* synthetic */ C37228opq copydefault;

            /* JADX INFO: renamed from: o.opq$Application$Activity$Activity, reason: collision with other inner class name */
            public static final class ViewOnClickListenerC0908Activity implements View.OnClickListener {
                public final /* synthetic */ android.view.View AEQbTJ;
                public final /* synthetic */ long EZpvd;
                public final /* synthetic */ C37228opq copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public ViewOnClickListenerC0908Activity(android.view.View view, long j, C37228opq c37228opq) {
                    this.AEQbTJ = view;
                    this.EZpvd = j;
                    this.copydefault = c37228opq;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                        C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                        ActionBar actionBar = this.copydefault.copydefault;
                        if (actionBar != null) {
                            actionBar.values();
                        }
                    }
                }
            }

            public Activity(nOS nos, Application application, C37228opq c37228opq, long j) {
                this.OLrzqt = nos;
                this.AEQbTJ = application;
                this.copydefault = c37228opq;
                this.KWHzl = j;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(java.io.File file, java.lang.Object obj, InterfaceC5462Sq<java.io.File> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                android.widget.ImageView imageView = this.OLrzqt.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = this.OLrzqt.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                android.widget.TextView textView = this.OLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.LinearLayout linearLayout = this.OLrzqt.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                this.AEQbTJ.copydefault(false);
                ActionBar actionBar = this.copydefault.copydefault;
                if (actionBar != null) {
                    actionBar.OLrzqt(true, MediaType.IMAGE, ResultState.SUCCESS);
                }
                if (dataSource == com.bumptech.glide.load.DataSource.REMOTE) {
                    float fElapsedRealtime = (android.os.SystemClock.elapsedRealtime() - this.KWHzl) / 1000.0f;
                    ActionBar actionBar2 = this.copydefault.copydefault;
                    if (actionBar2 != null) {
                        actionBar2.copydefault(yII.EZpvd(fElapsedRealtime));
                    }
                }
                return false;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<java.io.File> interfaceC5462Sq, boolean z) {
                android.widget.TextView textView = this.OLrzqt.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                android.widget.LinearLayout linearLayout = this.OLrzqt.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                Glide.AEQbTJ(this.OLrzqt.getRoot().getContext()).AEQbTJ(this.OLrzqt.AEQbTJ);
                SubsamplingScaleImageView subsamplingScaleImageView = this.OLrzqt.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
                subsamplingScaleImageView.setVisibility(8);
                android.widget.ImageView imageView = this.OLrzqt.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                this.AEQbTJ.copydefault(false);
                android.widget.LinearLayout linearLayout2 = this.OLrzqt.copydefault;
                linearLayout2.setOnClickListener(new ViewOnClickListenerC0908Activity(linearLayout2, 1000L, this.copydefault));
                ActionBar actionBar = this.copydefault.copydefault;
                if (actionBar != null) {
                    actionBar.OLrzqt(true, MediaType.IMAGE, ResultState.FAILURE);
                }
                return false;
            }
        }

        /* JADX INFO: renamed from: o.opq$Application$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ C37233opv AEQbTJ;
            public final /* synthetic */ C37228opq EZpvd;
            public final /* synthetic */ android.view.View KWHzl;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C37228opq c37228opq, C37233opv c37233opv) {
                this.KWHzl = view;
                this.copydefault = j;
                this.EZpvd = c37228opq;
                this.AEQbTJ = c37233opv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.copydefault;
                    if (actionBar != null) {
                        actionBar.OLrzqt(this.AEQbTJ.KWHzl(), TtmlNode.TAG_IMAGE);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.opq$Application$Application, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0909Application implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C37228opq copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0909Application(android.view.View view, long j, C37228opq c37228opq) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = c37228opq;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    ActionBar actionBar = this.copydefault.copydefault;
                    if (actionBar != null) {
                        actionBar.values();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C37228opq c37228opq, nOS nos) {
            super(c37228opq, nos);
            Intrinsics.checkNotNullParameter(nos, "");
            this.valueOf = c37228opq;
            this.AEQbTJ = nos;
            this.djBIcL = AEQbTJ().valueOf;
        }

        @Override // o.C37228opq.StateListAnimator
        public void KWHzl(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOS nosAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.valueOf;
            OKMessage oKMessageKWHzl = c37233opv.KWHzl();
            android.widget.ImageView imageView = nosAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            SubsamplingScaleImageView subsamplingScaleImageView = nosAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            KWHzl(oKMessageKWHzl, imageView, subsamplingScaleImageView);
            android.widget.ImageView imageView2 = nosAEQbTJ.EZpvd.OLrzqt;
            imageView2.setOnClickListener(new ViewOnClickListenerC0909Application(imageView2, 1000L, c37228opq));
            android.widget.ImageView imageView3 = nosAEQbTJ.EZpvd.KWHzl;
            imageView3.setOnClickListener(new ActionBar(imageView3, 1000L, c37228opq, c37233opv));
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOS nosAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.valueOf;
            android.widget.ImageView imageView = nosAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            SubsamplingScaleImageView subsamplingScaleImageView = nosAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            subsamplingScaleImageView.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.content.Context context = nosAEQbTJ.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            IMImageModel iMImageModelOLrzqt = c37233opv.OLrzqt();
            NN[] nnArr = {new nPH()};
            pUU.EZpvd("IMImageHelper", "buildGlideThumbnailRequest: model:" + iMImageModelOLrzqt.AYXKKw() + ", stableId:" + iMImageModelOLrzqt.fetchVPNInfo());
            C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(nnArr, 1)).EZpvd(context.getTheme());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            C5448Sc c5448Sc = c5448ScEZpvd;
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C5335Nt c5335NtCopydefault = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ, android.graphics.drawable.Drawable.class).copydefault(IMImageModel.copy$default(iMImageModelOLrzqt, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 63, null)).OLrzqt((RX<?>) c5448Sc).copydefault(iMImageHelper.copydefault(context, "Fallback Request (sourceStrategy=OnlyThumbs, blurThumb=false)"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
            C5335Nt c5335NtCopydefault2 = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ2, android.graphics.drawable.Drawable.class).copydefault(iMImageModelOLrzqt).OLrzqt((RX<?>) c5448Sc).AEQbTJ(c5335NtCopydefault).copydefault(iMImageHelper.copydefault(context, "Primary Request"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault2, "");
            c5335NtCopydefault2.OLrzqt((RY) new StateListAnimator(c37228opq, c37233opv)).EZpvd(nosAEQbTJ.AEQbTJ);
        }

        /* JADX INFO: renamed from: o.opq$Application$StateListAnimator */
        public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ C37233opv KWHzl;
            public final /* synthetic */ C37228opq OLrzqt;

            public StateListAnimator(C37228opq c37228opq, C37233opv c37233opv) {
                this.OLrzqt = c37228opq;
                this.KWHzl = c37233opv;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                Intrinsics.checkNotNullParameter(drawable, "");
                ActionBar actionBar = this.OLrzqt.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.KWHzl.KWHzl().getSeq());
                return false;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                ActionBar actionBar = this.OLrzqt.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.KWHzl.KWHzl().getSeq());
                return false;
            }
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull final C37233opv c37233opv, ImageState imageState) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            final nOS nosAEQbTJ = AEQbTJ();
            final C37228opq c37228opq = this.valueOf;
            SubsamplingScaleImageView subsamplingScaleImageView = nosAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            subsamplingScaleImageView.setVisibility(0);
            C5448Sc baseGlideOptions$default = StateListAnimator.getBaseGlideOptions$default(this, c37233opv.OLrzqt(), null, null, 6, null);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.content.Context context = nosAEQbTJ.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            IMImageModel iMImageModelOLrzqt = c37233opv.OLrzqt();
            NN[] nnArr = {new nPH()};
            pUU.EZpvd("IMImageHelper", "buildGlideThumbnailRequest: model:" + iMImageModelOLrzqt.AYXKKw() + ", stableId:" + iMImageModelOLrzqt.fetchVPNInfo());
            C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(nnArr, 1)).EZpvd(context.getTheme());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            C5448Sc c5448Sc = c5448ScEZpvd;
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C5335Nt c5335NtCopydefault = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ, java.io.File.class).copydefault(IMImageModel.copy$default(iMImageModelOLrzqt, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 63, null)).OLrzqt((RX<?>) c5448Sc).copydefault(iMImageHelper.copydefault(context, "Fallback Request (sourceStrategy=OnlyThumbs, blurThumb=false)"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
            C5335Nt<java.io.File> c5335NtCopydefault2 = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ2, java.io.File.class).copydefault(iMImageModelOLrzqt).OLrzqt((RX<?>) c5448Sc).AEQbTJ(c5335NtCopydefault).copydefault(iMImageHelper.copydefault(context, "Primary Request"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault2, "");
            Activity activity = new Activity(nosAEQbTJ, this, c37228opq, android.os.SystemClock.elapsedRealtime());
            SubsamplingScaleImageView subsamplingScaleImageView2 = nosAEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView2, "");
            nPC npc = new nPC(subsamplingScaleImageView2, new Function2() { // from class: o.opu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C37228opq.Application.OLrzqt(nosAEQbTJ, c37233opv, c37228opq, ((java.lang.Float) obj).floatValue(), (PointF) obj2);
                }
            });
            copydefault(!(imageState != null ? imageState.KWHzl() : false));
        }

        public static final Unit OLrzqt(nOS nos, C37233opv c37233opv, C37228opq c37228opq, float f, PointF pointF) {
            Intrinsics.checkNotNullParameter(pointF, "");
            android.widget.ImageView imageView = nos.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.content.Context context = nos.AEQbTJ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            IMImageModel iMImageModelOLrzqt = c37233opv.OLrzqt();
            NN[] nnArr = {new nPH()};
            pUU.EZpvd("IMImageHelper", "buildGlideThumbnailRequest: model:" + iMImageModelOLrzqt.AYXKKw() + ", stableId:" + iMImageModelOLrzqt.fetchVPNInfo());
            C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ((NN<android.graphics.Bitmap>[]) java.util.Arrays.copyOf(nnArr, 1)).EZpvd(context.getTheme());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            C5448Sc c5448Sc = c5448ScEZpvd;
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C5335Nt c5335NtCopydefault = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ, android.graphics.drawable.Drawable.class).copydefault(IMImageModel.copy$default(iMImageModelOLrzqt, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 63, null)).OLrzqt((RX<?>) c5448Sc).copydefault(iMImageHelper.copydefault(context, "Fallback Request (sourceStrategy=OnlyThumbs, blurThumb=false)"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
            C5335Nt c5335NtCopydefault2 = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ2, android.graphics.drawable.Drawable.class).copydefault(iMImageModelOLrzqt).OLrzqt((RX<?>) c5448Sc).AEQbTJ(c5335NtCopydefault).copydefault(iMImageHelper.copydefault(context, "Primary Request"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault2, "");
            c5335NtCopydefault2.EZpvd(nos.AEQbTJ);
            ActionBar actionBar = c37228opq.copydefault;
            if (actionBar != null) {
                actionBar.KWHzl(c37233opv.KWHzl().getSeq(), f, pointF);
            }
            ActionBar actionBar2 = c37228opq.copydefault;
            if (actionBar2 != null) {
                actionBar2.OLrzqt(c37233opv.KWHzl().getSeq(), true);
            }
            pUU.EZpvd("IMMediaPagerAdapter", "ImageViewHolder: onInitialStateCalculated => messageId: " + c37233opv.KWHzl().getSeq() + ", scale: " + f + ", center: " + pointF);
            return Unit.INSTANCE;
        }

        @Override // o.C37228opq.StateListAnimator
        public void KWHzl(final ImageState imageState) {
            java.lang.Object objM7377constructorimpl;
            Unit unit;
            pUU.EZpvd("IMMediaPagerAdapter", "ImageViewHolder: prepareForFinish => preCheck: resetZoom: " + imageState);
            Function0 function0 = new Function0() { // from class: o.ops
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37228opq.Application.OLrzqt(this.OLrzqt, imageState);
                }
            };
            try {
                Result.Application application = Result.Companion;
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (imageState != null) {
                float fOLrzqt = imageState.OLrzqt();
                PointF pointFAEQbTJ = imageState.AEQbTJ();
                if (!AEQbTJ().OLrzqt.isReady()) {
                    throw new java.lang.IllegalArgumentException("SubsamplingScaleImageView not ready".toString());
                }
                SubsamplingScaleImageView.AnimationBuilder animationBuilderAnimateScaleAndCenter = AEQbTJ().OLrzqt.animateScaleAndCenter(fOLrzqt, pointFAEQbTJ);
                if (animationBuilderAnimateScaleAndCenter != null) {
                    animationBuilderAnimateScaleAndCenter.withDuration(60L).withInterruptible(false).withOnAnimationEventListener(new TaskDescription(imageState, function0)).start();
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                objM7377constructorimpl = Result.m7377constructorimpl(unit);
                java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.OLrzqt("IMMediaPagerAdapter", "ImageViewHolder: prepareForFinish => No animation: resetZoom: " + imageState, thM7380exceptionOrNullimpl);
                    function0.invoke();
                    return;
                }
                return;
            }
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }

        public static final Unit OLrzqt(Application application, ImageState imageState) {
            android.widget.ImageView imageView = application.AEQbTJ().AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            SubsamplingScaleImageView subsamplingScaleImageView = application.AEQbTJ().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            subsamplingScaleImageView.setVisibility(8);
            super.KWHzl(imageState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.opq$Application$TaskDescription */
        public static final class TaskDescription implements SubsamplingScaleImageView.OnAnimationEventListener {
            public final /* synthetic */ Function0<Unit> EZpvd;
            public final /* synthetic */ ImageState copydefault;

            public TaskDescription(ImageState imageState, Function0<Unit> function0) {
                this.copydefault = imageState;
                this.EZpvd = function0;
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onComplete() {
                pUU.EZpvd("IMMediaPagerAdapter", "ImageViewHolder: prepareForFinish => onComplete: resetZoom: " + this.copydefault);
                this.EZpvd.invoke();
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onInterruptedByUser() {
                pUU.EZpvd("IMMediaPagerAdapter", "ImageViewHolder: prepareForFinish => onInterruptedByUser: resetZoom: " + this.copydefault);
                this.EZpvd.invoke();
            }

            @Override // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.OnAnimationEventListener
            public void onInterruptedByNewAnim() {
                pUU.EZpvd("IMMediaPagerAdapter", "ImageViewHolder: prepareForFinish => onInterruptedByNewAnim: resetZoom: " + this.copydefault);
                this.EZpvd.invoke();
            }
        }
    }

    /* JADX INFO: renamed from: o.opq$TaskDescription */
    public final class TaskDescription extends StateListAnimator {
        public final nOS AEQbTJ;
        public final /* synthetic */ C37228opq AYXKKw;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public nOS AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX INFO: renamed from: o.opq$TaskDescription$Application */
        public static final class Application implements RY<QX> {
            public final /* synthetic */ nOS EZpvd;
            public final /* synthetic */ C37228opq KWHzl;
            public final /* synthetic */ TaskDescription copydefault;

            /* JADX INFO: renamed from: o.opq$TaskDescription$Application$TaskDescription, reason: collision with other inner class name */
            public static final class ViewOnClickListenerC0910TaskDescription implements View.OnClickListener {
                public final /* synthetic */ C37228opq AEQbTJ;
                public final /* synthetic */ android.view.View OLrzqt;
                public final /* synthetic */ long copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public ViewOnClickListenerC0910TaskDescription(android.view.View view, long j, C37228opq c37228opq) {
                    this.OLrzqt = view;
                    this.copydefault = j;
                    this.AEQbTJ = c37228opq;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                        C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                        ActionBar actionBar = this.AEQbTJ.copydefault;
                        if (actionBar != null) {
                            actionBar.values();
                        }
                    }
                }
            }

            public Application(nOS nos, TaskDescription taskDescription, C37228opq c37228opq) {
                this.EZpvd = nos;
                this.copydefault = taskDescription;
                this.KWHzl = c37228opq;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(QX qx, java.lang.Object obj, InterfaceC5462Sq<QX> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                android.widget.ImageView imageView = this.EZpvd.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = this.EZpvd.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                android.widget.ImageView imageView3 = this.EZpvd.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                android.widget.TextView textView = this.EZpvd.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(8);
                android.widget.LinearLayout linearLayout = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(8);
                SubsamplingScaleImageView subsamplingScaleImageView = this.EZpvd.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
                subsamplingScaleImageView.setVisibility(8);
                this.copydefault.copydefault(false);
                ActionBar actionBar = this.KWHzl.copydefault;
                if (actionBar != null) {
                    actionBar.OLrzqt(true, MediaType.GIF, ResultState.SUCCESS);
                }
                return false;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<QX> interfaceC5462Sq, boolean z) {
                android.widget.TextView textView = this.EZpvd.AhwBna;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(0);
                android.widget.LinearLayout linearLayout = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                linearLayout.setVisibility(0);
                Glide.AEQbTJ(this.EZpvd.getRoot().getContext()).AEQbTJ(this.EZpvd.AEQbTJ);
                android.widget.ImageView imageView = this.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(8);
                android.widget.ImageView imageView2 = this.EZpvd.EZpvd.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(8);
                this.copydefault.copydefault(false);
                android.widget.LinearLayout linearLayout2 = this.EZpvd.copydefault;
                linearLayout2.setOnClickListener(new ViewOnClickListenerC0910TaskDescription(linearLayout2, 1000L, this.KWHzl));
                ActionBar actionBar = this.KWHzl.copydefault;
                if (actionBar != null) {
                    actionBar.OLrzqt(true, MediaType.GIF, ResultState.FAILURE);
                }
                return false;
            }
        }

        /* JADX INFO: renamed from: o.opq$TaskDescription$ActionBar */
        public static final class ActionBar implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C37228opq KWHzl;
            public final /* synthetic */ long OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(android.view.View view, long j, C37228opq c37228opq) {
                this.EZpvd = view;
                this.OLrzqt = j;
                this.KWHzl = c37228opq;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    ActionBar actionBar = this.KWHzl.copydefault;
                    if (actionBar != null) {
                        actionBar.values();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.opq$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0911TaskDescription implements View.OnClickListener {
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C37228opq KWHzl;
            public final /* synthetic */ C37233opv OLrzqt;
            public final /* synthetic */ long copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0911TaskDescription(android.view.View view, long j, C37228opq c37228opq, C37233opv c37233opv) {
                this.EZpvd = view;
                this.copydefault = j;
                this.KWHzl = c37228opq;
                this.OLrzqt = c37233opv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    ActionBar actionBar = this.KWHzl.copydefault;
                    if (actionBar != null) {
                        actionBar.OLrzqt(this.OLrzqt.KWHzl(), TtmlNode.TAG_IMAGE);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C37228opq c37228opq, nOS nos) {
            super(c37228opq, nos);
            Intrinsics.checkNotNullParameter(nos, "");
            this.AYXKKw = c37228opq;
            this.AEQbTJ = nos;
        }

        @Override // o.C37228opq.StateListAnimator
        public void KWHzl(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOS nosAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.AYXKKw;
            OKMessage oKMessageKWHzl = c37233opv.KWHzl();
            android.widget.ImageView imageView = nosAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            android.widget.ImageView imageView2 = nosAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            KWHzl(oKMessageKWHzl, imageView, imageView2);
            android.widget.ImageView imageView3 = nosAEQbTJ.EZpvd.OLrzqt;
            imageView3.setOnClickListener(new ActionBar(imageView3, 1000L, c37228opq));
            android.widget.ImageView imageView4 = nosAEQbTJ.EZpvd.KWHzl;
            imageView4.setOnClickListener(new ViewOnClickListenerC0911TaskDescription(imageView4, 1000L, c37228opq, c37233opv));
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOS nosAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.AYXKKw;
            android.widget.ImageView imageView = nosAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            android.widget.ImageView imageView2 = nosAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.widget.ImageView imageView3 = nosAEQbTJ.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            iMImageHelper.KWHzl(imageView3, c37233opv.OLrzqt().AYXKKw(), (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : new StateListAnimator(c37228opq, c37233opv), (20 & 16) != 0 ? null : null);
        }

        /* JADX INFO: renamed from: o.opq$TaskDescription$StateListAnimator */
        public static final class StateListAnimator implements RY<QX> {
            public final /* synthetic */ C37228opq AEQbTJ;
            public final /* synthetic */ C37233opv KWHzl;

            public StateListAnimator(C37228opq c37228opq, C37233opv c37233opv) {
                this.AEQbTJ = c37228opq;
                this.KWHzl = c37233opv;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<QX> interfaceC5462Sq, boolean z) {
                ActionBar actionBar = this.AEQbTJ.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.KWHzl.KWHzl().getSeq());
                return false;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(QX qx, java.lang.Object obj, InterfaceC5462Sq<QX> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                ActionBar actionBar = this.AEQbTJ.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.KWHzl.KWHzl().getSeq());
                return false;
            }
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull C37233opv c37233opv, ImageState imageState) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOS nosAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.AYXKKw;
            android.widget.ImageView imageView = nosAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            IMImageHelper iMImageHelper = IMImageHelper.OLrzqt;
            android.widget.ImageView imageView2 = nosAEQbTJ.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            iMImageHelper.KWHzl(imageView2, c37233opv.OLrzqt().AYXKKw(), (20 & 4) != 0 ? null : null, (20 & 8) != 0 ? null : new Application(nosAEQbTJ, this, c37228opq), (20 & 16) != 0 ? null : null);
        }
    }

    /* JADX INFO: renamed from: o.opq$Dialog */
    public final class Dialog extends StateListAnimator {
        public final nOU AEQbTJ;
        public java.lang.String AhwBna;
        public final /* synthetic */ C37228opq djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public nOU AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AhwBna;
        }

        /* JADX INFO: renamed from: o.opq$Dialog$Activity */
        public static final class Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ C37228opq EZpvd;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, long j, C37228opq c37228opq) {
                this.copydefault = view;
                this.AEQbTJ = j;
                this.EZpvd = c37228opq;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.copydefault;
                    if (actionBar != null) {
                        actionBar.values();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: o.opq$Dialog$TaskDescription */
        public static final class TaskDescription implements View.OnClickListener {
            public final /* synthetic */ C37228opq EZpvd;
            public final /* synthetic */ long KWHzl;
            public final /* synthetic */ android.view.View OLrzqt;
            public final /* synthetic */ C37233opv copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, long j, C37228opq c37228opq, C37233opv c37233opv) {
                this.OLrzqt = view;
                this.KWHzl = j;
                this.EZpvd = c37228opq;
                this.copydefault = c37233opv;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                    ActionBar actionBar = this.EZpvd.copydefault;
                    if (actionBar != null) {
                        actionBar.OLrzqt(this.copydefault.KWHzl(), MimeTypes.BASE_TYPE_VIDEO);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dialog(@NotNull C37228opq c37228opq, nOU nou) {
            super(c37228opq, nou);
            Intrinsics.checkNotNullParameter(nou, "");
            this.djBIcL = c37228opq;
            this.AEQbTJ = nou;
        }

        @Override // o.C37228opq.StateListAnimator
        public void KWHzl(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOU nouAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.djBIcL;
            OKMessage oKMessageKWHzl = c37233opv.KWHzl();
            android.widget.ImageView imageView = nouAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C35943oJl c35943oJl = nouAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35943oJl, "");
            KWHzl(oKMessageKWHzl, imageView, c35943oJl);
            android.widget.ImageView imageView2 = nouAEQbTJ.KWHzl.OLrzqt;
            imageView2.setOnClickListener(new Activity(imageView2, 1000L, c37228opq));
            android.widget.ImageView imageView3 = nouAEQbTJ.KWHzl.KWHzl;
            imageView3.setOnClickListener(new TaskDescription(imageView3, 1000L, c37228opq, c37233opv));
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull C37233opv c37233opv) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            nOU nouAEQbTJ = AEQbTJ();
            C37228opq c37228opq = this.djBIcL;
            android.widget.ImageView imageView = nouAEQbTJ.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(0);
            C35943oJl c35943oJl = nouAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35943oJl, "");
            c35943oJl.setVisibility(8);
            C5448Sc c5448ScEZpvd = StateListAnimator.getBaseGlideOptions$default(this, c37233opv.OLrzqt(), null, null, 6, null).EZpvd(new nPH());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            Glide.KWHzl(nouAEQbTJ.copydefault).KWHzl(IMImageModel.copy$default(c37233opv.OLrzqt(), null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 191, null)).OLrzqt((RX<?>) c5448ScEZpvd).copydefault(AbstractC5360Os.KWHzl).OLrzqt((RY) new ActionBar(c37228opq, c37233opv)).EZpvd(nouAEQbTJ.copydefault);
        }

        /* JADX INFO: renamed from: o.opq$Dialog$ActionBar */
        public static final class ActionBar implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ C37228opq KWHzl;
            public final /* synthetic */ C37233opv OLrzqt;

            public ActionBar(C37228opq c37228opq, C37233opv c37233opv) {
                this.KWHzl = c37228opq;
                this.OLrzqt = c37233opv;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                Intrinsics.checkNotNullParameter(drawable, "");
                ActionBar actionBar = this.KWHzl.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.OLrzqt.KWHzl().getSeq());
                return false;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                ActionBar actionBar = this.KWHzl.copydefault;
                if (actionBar == null) {
                    return false;
                }
                actionBar.KWHzl(this.OLrzqt.KWHzl().getSeq());
                return false;
            }
        }

        @Override // o.C37228opq.StateListAnimator
        public void OLrzqt(@NotNull C37233opv c37233opv, ImageState imageState) {
            Intrinsics.checkNotNullParameter(c37233opv, "");
            final nOU nouAEQbTJ = AEQbTJ();
            final C37228opq c37228opq = this.djBIcL;
            final Function0 function0 = new Function0() { // from class: o.opt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C37228opq.Dialog.EZpvd(nouAEQbTJ, c37228opq);
                }
            };
            C35943oJl c35943oJl = nouAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35943oJl, "");
            c35943oJl.setVisibility(0);
            nouAEQbTJ.EZpvd.setOnErrorListener(new Function1() { // from class: o.opw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C37228opq.Dialog.KWHzl(function0, (ExoPlaybackException) obj);
                }
            });
            Glide.AEQbTJ(this.itemView.getContext()).KWHzl(IMImageModel.copy$default(c37233opv.OLrzqt(), null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 191, null)).OLrzqt((RY<android.graphics.drawable.Drawable>) new StateListAnimator(nouAEQbTJ, c37228opq, function0)).EZpvd(nouAEQbTJ.EZpvd.KWHzl());
            java.lang.String string = c37233opv.OLrzqt().AYXKKw().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            pUU.EZpvd("IMMediaPagerAdapter", "VideoViewHolder.bindMainContent: url=" + C59454zhO.isConnected(string, 50));
            this.AhwBna = string;
            c37228opq.valueOf.put(string, nouAEQbTJ.EZpvd);
            nouAEQbTJ.EZpvd.setUp(string);
        }

        public static final Unit EZpvd(nOU nou, C37228opq c37228opq) {
            android.widget.ImageView imageView = nou.KWHzl.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            ActionBar actionBar = c37228opq.copydefault;
            if (actionBar == null) {
                return null;
            }
            actionBar.OLrzqt(true, MediaType.VIDEO, ResultState.FAILURE);
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(Function0 function0, ExoPlaybackException exoPlaybackException) {
            Intrinsics.checkNotNullParameter(exoPlaybackException, "");
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.opq$Dialog$StateListAnimator */
        public static final class StateListAnimator implements RY<android.graphics.drawable.Drawable> {
            public final /* synthetic */ nOU EZpvd;
            public final /* synthetic */ C37228opq KWHzl;
            public final /* synthetic */ Function0<Unit> copydefault;

            public StateListAnimator(nOU nou, C37228opq c37228opq, Function0<Unit> function0) {
                this.EZpvd = nou;
                this.KWHzl = c37228opq;
                this.copydefault = function0;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
            @Override // o.RY
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public boolean copydefault(android.graphics.drawable.Drawable drawable, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, com.bumptech.glide.load.DataSource dataSource, boolean z) {
                android.widget.ImageView imageView = this.EZpvd.KWHzl.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(imageView, "");
                imageView.setVisibility(0);
                android.widget.ImageView imageView2 = this.EZpvd.KWHzl.KWHzl;
                Intrinsics.checkNotNullExpressionValue(imageView2, "");
                imageView2.setVisibility(0);
                android.widget.ImageView imageView3 = this.EZpvd.copydefault;
                Intrinsics.checkNotNullExpressionValue(imageView3, "");
                imageView3.setVisibility(8);
                ActionBar actionBar = this.KWHzl.copydefault;
                if (actionBar != null) {
                    actionBar.OLrzqt(true, MediaType.VIDEO, ResultState.SUCCESS);
                }
                return false;
            }

            @Override // o.RY
            public boolean OLrzqt(GlideException glideException, java.lang.Object obj, InterfaceC5462Sq<android.graphics.drawable.Drawable> interfaceC5462Sq, boolean z) {
                this.copydefault.invoke();
                return false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.OLrzqt = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        this.OLrzqt = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final android.view.View KWHzl(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.OLrzqt;
        if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) != null) {
            if (viewHolderFindViewHolderForAdapterPosition instanceof Application) {
                return ((Application) viewHolderFindViewHolderForAdapterPosition).AEQbTJ().AEQbTJ;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof TaskDescription) {
                return ((TaskDescription) viewHolderFindViewHolderForAdapterPosition).AEQbTJ().KWHzl;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof Dialog) {
                return ((Dialog) viewHolderFindViewHolderForAdapterPosition).AEQbTJ().EZpvd;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        OKMediaMessageContent oKMediaMessageContentEZpvd = getItem(i).OLrzqt().EZpvd();
        if (oKMediaMessageContentEZpvd instanceof OKGIFMessage) {
            return MediaType.GIF.ordinal();
        }
        if (oKMediaMessageContentEZpvd instanceof OKSightMessage) {
            return MediaType.VIDEO.ordinal();
        }
        return MediaType.IMAGE.ordinal();
    }

    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public StateListAnimator onCreateViewHolder(@NotNull android.view.ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(viewGroup.getContext());
        if (i == MediaType.IMAGE.ordinal()) {
            nOS nosCopydefault = nOS.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(nosCopydefault, "");
            android.widget.ImageView imageView = nosCopydefault.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            android.widget.ImageView imageView2 = nosCopydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            SubsamplingScaleImageView subsamplingScaleImageView = nosCopydefault.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView, "");
            subsamplingScaleImageView.setVisibility(4);
            android.widget.ImageView imageView3 = nosCopydefault.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView3, "");
            imageView3.setVisibility(0);
            return new Application(this, nosCopydefault);
        }
        if (i == MediaType.GIF.ordinal()) {
            nOS nosCopydefault2 = nOS.copydefault(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(nosCopydefault2, "");
            android.widget.ImageView imageView4 = nosCopydefault2.EZpvd.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView4, "");
            imageView4.setVisibility(8);
            SubsamplingScaleImageView subsamplingScaleImageView2 = nosCopydefault2.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(subsamplingScaleImageView2, "");
            subsamplingScaleImageView2.setVisibility(8);
            android.widget.ImageView imageView5 = nosCopydefault2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView5, "");
            imageView5.setVisibility(4);
            android.widget.ImageView imageView6 = nosCopydefault2.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(imageView6, "");
            imageView6.setVisibility(0);
            return new TaskDescription(this, nosCopydefault2);
        }
        if (i == MediaType.VIDEO.ordinal()) {
            nOU nouEZpvd = nOU.EZpvd(layoutInflaterFrom, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(nouEZpvd, "");
            android.widget.ImageView imageView7 = nouEZpvd.KWHzl.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView7, "");
            imageView7.setVisibility(8);
            C35943oJl c35943oJl = nouEZpvd.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c35943oJl, "");
            c35943oJl.setVisibility(4);
            android.widget.ImageView imageView8 = nouEZpvd.copydefault;
            Intrinsics.checkNotNullExpressionValue(imageView8, "");
            imageView8.setVisibility(0);
            return new Dialog(this, nouEZpvd);
        }
        throw new java.lang.IllegalArgumentException("Invalid view type");
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i, @NotNull java.util.List<java.lang.Object> list) {
        ImageState imageStateKWHzl;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            onBindViewHolder(stateListAnimator, i);
            return;
        }
        if (CollectionsKt___CollectionsKt.AuCTelauCTel(list) instanceof ImageState) {
            C37186opA item = getItem(i);
            if (item == null || (imageStateKWHzl = item.KWHzl()) == null) {
                return;
            }
            stateListAnimator.copydefault(!imageStateKWHzl.KWHzl());
            return;
        }
        C37186opA item2 = getItem(i);
        Intrinsics.copydefault(item2);
        stateListAnimator.KWHzl(item2);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull StateListAnimator stateListAnimator, int i) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        C37186opA item = getItem(i);
        Intrinsics.copydefault(item);
        stateListAnimator.KWHzl(item);
    }

    /* JADX DEBUG: Method merged with bridge method: onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(@NotNull StateListAnimator stateListAnimator) {
        C35943oJl c35943oJlRemove;
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.KWHzl();
        pUU.EZpvd("IMMediaPagerAdapter", "onViewRecycled: holder=" + C56524yIo.AEQbTJ(stateListAnimator.getClass()).valueOf());
        if (stateListAnimator instanceof Application) {
            nOS nosAEQbTJ = ((Application) stateListAnimator).AEQbTJ();
            Glide.AEQbTJ(nosAEQbTJ.getRoot().getContext()).AEQbTJ(nosAEQbTJ.AEQbTJ);
            Glide.AEQbTJ(nosAEQbTJ.getRoot().getContext()).AEQbTJ(nosAEQbTJ.OLrzqt);
        } else if (stateListAnimator instanceof TaskDescription) {
            nOS nosAEQbTJ2 = ((TaskDescription) stateListAnimator).AEQbTJ();
            Glide.AEQbTJ(nosAEQbTJ2.getRoot().getContext()).AEQbTJ(nosAEQbTJ2.AEQbTJ);
            Glide.AEQbTJ(nosAEQbTJ2.getRoot().getContext()).AEQbTJ(nosAEQbTJ2.KWHzl);
        } else if (stateListAnimator instanceof Dialog) {
            Dialog dialog = (Dialog) stateListAnimator;
            nOU nouAEQbTJ = dialog.AEQbTJ();
            Glide.AEQbTJ(nouAEQbTJ.getRoot().getContext()).AEQbTJ(nouAEQbTJ.copydefault);
            java.lang.String strEZpvd = dialog.EZpvd();
            if (strEZpvd != null && (c35943oJlRemove = this.valueOf.remove(strEZpvd)) != null) {
                pUU.EZpvd("IMMediaPagerAdapter", "onViewRecycled: releasing video player for " + C59454zhO.isConnected(strEZpvd, 30));
                c35943oJlRemove.valueOf();
            }
        }
        super.onViewRecycled(stateListAnimator);
    }

    /* JADX INFO: renamed from: o.opq$PendingIntent */
    public static final class PendingIntent extends DiffUtil.ItemCallback<C37186opA> {
        /* JADX DEBUG: Method merged with bridge method: areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(@NotNull C37186opA c37186opA, @NotNull C37186opA c37186opA2) {
            Intrinsics.checkNotNullParameter(c37186opA, "");
            Intrinsics.checkNotNullParameter(c37186opA2, "");
            return c37186opA.OLrzqt().KWHzl().getSeq() == c37186opA2.OLrzqt().KWHzl().getSeq();
        }

        /* JADX DEBUG: Method merged with bridge method: areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(@NotNull C37186opA c37186opA, @NotNull C37186opA c37186opA2) {
            Intrinsics.checkNotNullParameter(c37186opA, "");
            Intrinsics.checkNotNullParameter(c37186opA2, "");
            return c37186opA.copydefault() == c37186opA2.copydefault() && c37186opA.AEQbTJ() == c37186opA2.AEQbTJ() && Intrinsics.EZpvd(c37186opA.KWHzl(), c37186opA2.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) c37186opA.OLrzqt().OLrzqt().fetchVPNInfo(), (java.lang.Object) c37186opA2.OLrzqt().OLrzqt().fetchVPNInfo());
        }

        /* JADX DEBUG: Method merged with bridge method: getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Object getChangePayload(@NotNull C37186opA c37186opA, @NotNull C37186opA c37186opA2) {
            Intrinsics.checkNotNullParameter(c37186opA, "");
            Intrinsics.checkNotNullParameter(c37186opA2, "");
            return c37186opA.AEQbTJ() != c37186opA2.AEQbTJ() ? c37186opA2.AEQbTJ() : !Intrinsics.EZpvd(c37186opA.KWHzl(), c37186opA2.KWHzl()) ? c37186opA2.KWHzl() : c37186opA2.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.opq$StateListAnimator */
    public abstract class StateListAnimator extends RecyclerView.ViewHolder {
        public final /* synthetic */ C37228opq EZpvd;
        public final ViewBinding KWHzl;
        public android.view.View OLrzqt;
        public Job copydefault;

        /* JADX INFO: renamed from: o.opq$StateListAnimator$TaskDescription */
        public final /* synthetic */ class TaskDescription {
            public static final /* synthetic */ int[] KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            static {
                int[] iArr = new int[PagerState.values().length];
                try {
                    iArr[PagerState.TRANSITION_PROXY.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[PagerState.MAIN_CONTENT.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[PagerState.PREPARE_FOR_FINISH.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                KWHzl = iArr;
            }
        }

        public abstract void KWHzl(@NotNull C37233opv c37233opv);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public android.view.View OLrzqt() {
            return this.OLrzqt;
        }

        public abstract void OLrzqt(@NotNull C37233opv c37233opv);

        public abstract void OLrzqt(@NotNull C37233opv c37233opv, ImageState imageState);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull C37228opq c37228opq, ViewBinding viewBinding) {
            super(viewBinding.getRoot());
            Intrinsics.checkNotNullParameter(viewBinding, "");
            this.EZpvd = c37228opq;
            this.KWHzl = viewBinding;
        }

        public final void copydefault(boolean z) {
            if (z) {
                if (this.copydefault == null) {
                    this.copydefault = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.EZpvd.EZpvd), null, null, new IMMediaPagerAdapter$BaseViewHolder$notifyLoadingState$1(this, null), 3, null);
                }
            } else {
                KWHzl();
                android.view.View viewOLrzqt = OLrzqt();
                if (viewOLrzqt != null) {
                    viewOLrzqt.setVisibility(8);
                }
            }
        }

        public final void KWHzl() {
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.copydefault = null;
        }

        public static /* synthetic */ C5448Sc getBaseGlideOptions$default(StateListAnimator stateListAnimator, IMImageModel iMImageModel, android.widget.ImageView imageView, android.net.Uri uri, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBaseGlideOptions");
            }
            if ((i & 1) != 0) {
                iMImageModel = null;
            }
            if ((i & 2) != 0) {
                imageView = null;
            }
            if ((i & 4) != 0) {
                uri = null;
            }
            return stateListAnimator.copydefault(iMImageModel, imageView, uri);
        }

        public final C5448Sc copydefault(IMImageModel iMImageModel, android.widget.ImageView imageView, android.net.Uri uri) {
            return IMImageHelper.OLrzqt.copydefault(new C5448Sc(), iMImageModel, imageView, uri);
        }

        public final void KWHzl(@NotNull OKMessage oKMessage, @NotNull android.view.View view, @NotNull android.view.View view2) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(view2, "");
            java.lang.String strCopydefault = ActivityC37218opg.Companion.copydefault(oKMessage);
            view.setTransitionName(strCopydefault);
            view2.setTransitionName(strCopydefault);
        }

        public final void KWHzl(@NotNull C37186opA c37186opA) {
            Intrinsics.checkNotNullParameter(c37186opA, "");
            pUU.EZpvd("IMMediaPagerAdapter", "bind: messageId => " + c37186opA.OLrzqt().KWHzl().getSeq() + ", itemState => " + c37186opA.AEQbTJ() + ", isCurrentItem => " + c37186opA.copydefault() + ", media: " + c37186opA.OLrzqt().OLrzqt().copydefault());
            KWHzl(c37186opA.OLrzqt());
            int i = TaskDescription.KWHzl[c37186opA.AEQbTJ().ordinal()];
            if (i == 1) {
                OLrzqt(c37186opA.OLrzqt());
                return;
            }
            if (i == 2) {
                OLrzqt(c37186opA.OLrzqt(), c37186opA.KWHzl());
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c37186opA.copydefault()) {
                    KWHzl(c37186opA.KWHzl());
                }
            }
        }

        public void KWHzl(ImageState imageState) {
            ActionBar actionBar = this.EZpvd.copydefault;
            if (actionBar != null) {
                actionBar.isConnected();
            }
        }
    }
}

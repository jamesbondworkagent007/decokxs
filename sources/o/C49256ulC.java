package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseFailedException;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.platforms.SharePlatform;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.InterfaceC49121uia;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ulC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49256ulC extends AbstractC49065uhX {
    public C48958ufW OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;
    public final int copydefault = C48931uew.Application.KWHzl;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ulJ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49256ulC.EZpvd(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ulI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49256ulC.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    /* JADX INFO: renamed from: o.ulC$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ulC.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C49256ulC KWHzl(@NotNull ShareConfig shareConfig) {
            Intrinsics.checkNotNullParameter(shareConfig, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("config", shareConfig);
            C49256ulC c49256ulC = new C49256ulC();
            c49256ulC.setArguments(bundle);
            return c49256ulC;
        }
    }

    public final ShareConfig copydefault() {
        android.os.Parcelable parcelable = requireArguments().getParcelable("config");
        Intrinsics.copydefault(parcelable);
        return (ShareConfig) parcelable;
    }

    private final C48929ueu AEQbTJ() {
        return (C48929ueu) this.KWHzl.getValue();
    }

    public static final C48929ueu EZpvd(C49256ulC c49256ulC) {
        return new C48929ueu(c49256ulC.copydefault());
    }

    public static final C59534zip EZpvd() {
        return new C59534zip();
    }

    private final C59534zip KWHzl() {
        return (C59534zip) this.EZpvd.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C48958ufW c48958ufWOLrzqt = C48958ufW.OLrzqt(view);
        Intrinsics.copydefault(c48958ufWOLrzqt);
        this.OLrzqt = c48958ufWOLrzqt;
        pUU.KWHzl("OKShare", "EmbedSharePlatformsFragment->initView");
        KWHzl(copydefault());
    }

    public final void KWHzl(ShareConfig shareConfig) {
        IShareParams shareParams = shareConfig.getShareParams();
        C48992ugD c48992ugD = C48992ugD.KWHzl;
        c48992ugD.AEQbTJ(shareParams.getShareFrom());
        c48992ugD.KWHzl(shareParams.getTriggerSource(), shareParams.getShareFrom());
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AEQbTJ().observe(getViewLifecycleOwner(), new TaskDescription());
    }

    /* JADX INFO: renamed from: o.ulC$TaskDescription */
    public static final class TaskDescription extends AbstractC32992mnz<java.util.List<? extends SharePlatform>> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Z */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public boolean KWHzl(java.util.List<? extends SharePlatform> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return false;
        }

        public TaskDescription() {
            super(null, null, 0, 7, null);
        }

        /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void AEQbTJ(java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(list, "");
            super.AEQbTJ(list, view);
            C49256ulC c49256ulC = C49256ulC.this;
            C48958ufW c48958ufW = c49256ulC.OLrzqt;
            if (c48958ufW == null) {
                Intrinsics.gEmmrt("");
                c48958ufW = null;
            }
            RecyclerView recyclerView = c48958ufW.EZpvd;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            c49256ulC.KWHzl(recyclerView, list);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C49256ulC.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Throwable;Ljava/lang/Object;Landroid/view/View;)V */
        @Override // o.AbstractC32992mnz
        public void KWHzl(java.lang.Throwable th, java.util.List<? extends SharePlatform> list, android.view.View view) {
            Intrinsics.checkNotNullParameter(th, "");
            super.KWHzl(th, list, view);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C49256ulC.this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            java.lang.String strKWHzl = C49256ulC.this.KWHzl(th);
            if (strKWHzl != null) {
                C55326xho.toastWithFailedIcon$default(strKWHzl, 0, 1, (java.lang.Object) null);
            }
        }
    }

    public final java.lang.String KWHzl(@NotNull java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (th instanceof OKServerException) {
            return th.getMessage();
        }
        if (th instanceof ResponseFailedException) {
            return th.getMessage();
        }
        return null;
    }

    @Override // o.AbstractC49065uhX
    public void OLrzqt(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        requireArguments().putParcelable("config", shareConfig);
        AEQbTJ().AEQbTJ(copydefault());
        AEQbTJ().KWHzl(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(RecyclerView recyclerView, java.util.List<? extends java.lang.Object> list) {
        if (recyclerView.getLayoutManager() == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        if (recyclerView.getAdapter() == null) {
            KWHzl().register(SharePlatform.class, new Activity());
            KWHzl().setItems(list);
            recyclerView.setAdapter(KWHzl());
        } else {
            KWHzl().setItems(list);
            KWHzl().notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: o.ulC$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Activity extends C49264ulK {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
        /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Lo/rms;Ljava/lang/Object;)V */
        @Override // o.C49264ulK, o.AbstractC43310rmq
        /* JADX INFO: renamed from: EZpvd */
        public void onBindViewHolder(@NotNull C43312rms<AbstractC49032ugr> c43312rms, @NotNull SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(c43312rms, "");
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            super.onBindViewHolder(c43312rms, sharePlatform);
            android.view.View view = c43312rms.itemView;
            view.setOnClickListener(new ViewOnClickListenerC0978Activity(view, 1000L, C49256ulC.this, sharePlatform));
        }

        /* JADX INFO: renamed from: o.ulC$Activity$Activity, reason: collision with other inner class name */
        public static final class ViewOnClickListenerC0978Activity implements View.OnClickListener {
            public final /* synthetic */ long AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ SharePlatform KWHzl;
            public final /* synthetic */ C49256ulC copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ViewOnClickListenerC0978Activity(android.view.View view, long j, C49256ulC c49256ulC, SharePlatform sharePlatform) {
                this.EZpvd = view;
                this.AEQbTJ = j;
                this.copydefault = c49256ulC;
                this.KWHzl = sharePlatform;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                    C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                    this.copydefault.OLrzqt(this.KWHzl);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(SharePlatform sharePlatform) {
        ShareConfig shareConfigCopydefault = copydefault();
        IShareParams shareParams = shareConfigCopydefault.getShareParams();
        if (shareParams.getShareType() == ShareType.SHARE_IMAGE) {
            Intrinsics.copydefault(shareParams, "");
            ImageShareParams imageShareParams = (ImageShareParams) shareParams;
            if (imageShareParams.isValidForShare()) {
                AEQbTJ(sharePlatform, imageShareParams, null);
                return;
            } else {
                C55326xho.toast$default("please provide filePath when created ImageShareParams", (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                return;
            }
        }
        AEQbTJ(sharePlatform, shareConfigCopydefault.getShareParams(), null);
    }

    private final void AEQbTJ(SharePlatform sharePlatform, IShareParams iShareParams, java.lang.Integer num) {
        C48992ugD c48992ugD = C48992ugD.KWHzl;
        c48992ugD.EZpvd(sharePlatform, iShareParams.getShareFrom());
        c48992ugD.OLrzqt(iShareParams.getTriggerSource(), sharePlatform, iShareParams.getShareFrom(), num);
        C49098uiD c49098uiD = C49098uiD.OLrzqt;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c49098uiD.AEQbTJ(fragmentActivityRequireActivity, iShareParams, sharePlatform, new ActionBar(sharePlatform, iShareParams));
    }

    /* JADX INFO: renamed from: o.ulC$ActionBar */
    public static final class ActionBar implements InterfaceC49121uia.Activity {
        public final /* synthetic */ IShareParams AEQbTJ;
        public final /* synthetic */ SharePlatform copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC49121uia.Activity
        public void EZpvd(SharePlatform sharePlatform, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            Intrinsics.checkNotNullParameter(th, "");
        }

        public ActionBar(SharePlatform sharePlatform, IShareParams iShareParams) {
            this.copydefault = sharePlatform;
            this.AEQbTJ = iShareParams;
        }

        @Override // o.InterfaceC49121uia.Activity
        public void KWHzl(SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            C48992ugD.KWHzl.OLrzqt(this.copydefault, this.AEQbTJ.getShareFrom());
        }
    }
}

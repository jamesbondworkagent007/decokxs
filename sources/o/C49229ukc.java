package o;

import android.graphics.BitmapFactory;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.amplifyframework.ui.liveness.camera.LivenessCoordinator;
import com.okinc.biz.share.ShareFileProvider;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.share.api.params.IShareParams;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.SharePlatformsConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageFooterConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.bean.text.TextShareParams;
import com.okinc.share.platforms.SharePlatform;
import com.okinc.web.WebActivity;
import com.reown.android.pulse.model.ConnectionMethod;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import o.C49229ukc;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ukc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C49229ukc extends AbstractC32996moC {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public AbstractC49025ugk KWHzl;
    public AbstractC49065uhX djBIcL;
    public final int OLrzqt = C48931uew.Application.isConnected;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.ukO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49229ukc.fARcdN();
        }
    });
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.ukN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49229ukc.KWHzl();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.ukc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ukc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C49229ukc OLrzqt() {
            android.os.Bundle bundle = new android.os.Bundle();
            C49229ukc c49229ukc = new C49229ukc();
            c49229ukc.setArguments(bundle);
            return c49229ukc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC48893ueK fARcdN() {
        return (InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class);
    }

    private final InterfaceC48893ueK isConnected() {
        return (InterfaceC48893ueK) this.copydefault.getValue();
    }

    public static final TaskDescription KWHzl() {
        return new TaskDescription();
    }

    public final TaskDescription AEQbTJ() {
        return (TaskDescription) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.ukc$TaskDescription */
    public static final class TaskDescription implements InterfaceC49097uiC {
        @Override // o.InterfaceC49097uiC
        public void OLrzqt(SharePlatform sharePlatform, AbstractC49100uiF abstractC49100uiF) {
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            Intrinsics.checkNotNullParameter(abstractC49100uiF, "");
            pUU.KWHzl("ShareAPITest", "platform:" + sharePlatform + ", result:" + abstractC49100uiF);
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        ViewDataBinding viewDataBindingBind = DataBindingUtil.bind(view);
        Intrinsics.copydefault(viewDataBindingBind);
        this.KWHzl = (AbstractC49025ugk) viewDataBindingBind;
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).KWHzl(this, new StateListAnimator());
        AbstractC49025ugk abstractC49025ugk = this.KWHzl;
        if (abstractC49025ugk == null) {
            Intrinsics.gEmmrt("");
            abstractC49025ugk = null;
        }
        abstractC49025ugk.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.uks
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.AuCTel(this.EZpvd, view2);
            }
        });
        abstractC49025ugk.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.ukB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.fARcdN(this.AEQbTJ, view2);
            }
        });
        abstractC49025ugk.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.ukz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.ejfBZ(this.EZpvd, view2);
            }
        });
        abstractC49025ugk.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.ukE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.fIwbmz(this.AEQbTJ, view2);
            }
        });
        abstractC49025ugk.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.ukF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.hDKMBd(this.AEQbTJ, view2);
            }
        });
        abstractC49025ugk.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.ukG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.getFieldNames(this.EZpvd, view2);
            }
        });
        abstractC49025ugk.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.ukC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.uzCIH(this.AEQbTJ, view2);
            }
        });
        abstractC49025ugk.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.ukD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.getNewProxyInstance(this.EZpvd, view2);
            }
        });
        abstractC49025ugk.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.ukL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.isConnected(this.AEQbTJ, view2);
            }
        });
        abstractC49025ugk.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.ukI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.AkhnZx(this.KWHzl, view2);
            }
        });
        abstractC49025ugk.isConnected.setOnClickListener(new View.OnClickListener() { // from class: o.ukx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.fetchVPNInfo(this.OLrzqt, view2);
            }
        });
        abstractC49025ugk.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.uky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C49229ukc.fJNWhG(this.EZpvd, view2);
            }
        });
        EZpvd();
    }

    /* JADX INFO: renamed from: o.ukc$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC48970ufi {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC48970ufi
        public void KWHzl(C48972ufk c48972ufk, Function1<? super MultiShareConfig, Unit> function1) {
            Intrinsics.checkNotNullParameter(c48972ufk, "");
            Intrinsics.checkNotNullParameter(function1, "");
            android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(C49229ukc.this.getResources(), C48931uew.TaskDescription.OLrzqt);
            ImageSource.StateListAnimator stateListAnimator = ImageSource.Companion;
            FragmentActivity fragmentActivityRequireActivity = C49229ukc.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            Intrinsics.copydefault(bitmapDecodeResource);
            ImageSource imageSourceEZpvd = stateListAnimator.EZpvd(fragmentActivityRequireActivity, bitmapDecodeResource);
            ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
            FragmentActivity fragmentActivityRequireActivity2 = C49229ukc.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            function1.invoke(MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, C56402yEa.EZpvd(ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.OLrzqt(fragmentActivityRequireActivity2, bitmapDecodeResource, imageSourceEZpvd, new Function1() { // from class: o.ukX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C49229ukc.StateListAnimator.copydefault((ImageShareParams) obj);
                }
            }), null, 2, null)), false, 0.0f, false, null, null, 62, null));
        }

        public static final Unit copydefault(ImageShareParams imageShareParams) {
            Intrinsics.checkNotNullParameter(imageShareParams, "");
            imageShareParams.setShareFrom("test");
            return Unit.INSTANCE;
        }
    }

    public static final void AuCTel(C49229ukc c49229ukc, android.view.View view) {
        WebActivity.TaskDescription taskDescription = WebActivity.Companion;
        android.content.Context contextRequireContext = c49229ukc.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        WebActivity.TaskDescription.openPage$default(taskDescription, contextRequireContext, BundleKt.bundleOf(C56390yDp.OLrzqt("url", "file:///android_asset/share_jsbridge_test.html")), null, 4, null);
    }

    public static final void fARcdN(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.values();
    }

    public static final void ejfBZ(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.valueOf();
    }

    public static final void fIwbmz(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.djBIcL();
    }

    public static final void hDKMBd(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.gEmmrt();
    }

    public static final void getFieldNames(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.AkhnZx();
    }

    public static final void uzCIH(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.AhwBna();
    }

    public static final void getNewProxyInstance(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.AYXKKw();
    }

    public static final void isConnected(C49229ukc c49229ukc, android.view.View view) {
        android.graphics.Bitmap bitmapOLrzqt = C33487mxQ.OLrzqt(c49229ukc.requireContext(), C48931uew.Application.hDKMBd, C55298xhM.dpInt$default(360, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(LivenessCoordinator.TARGET_HEIGHT, (android.content.Context) null, 1, (java.lang.Object) null), true, null);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapOLrzqt);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapOLrzqt);
        Intrinsics.copydefault(fileAEQbTJ);
        java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        Intrinsics.copydefault((java.lang.Object) absolutePath);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(actionBar.KWHzl(absolutePath, new Function1() { // from class: o.ukK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.isConnected((ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.ukQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.djBIcL((ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKIsConnected = c49229ukc.isConnected();
        FragmentActivity fragmentActivityRequireActivity = c49229ukc.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.copydefault((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCopydefault);
    }

    public static final Unit isConnected(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("test");
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_CROP, false, null, null, 14, null));
        return Unit.INSTANCE;
    }

    public static final void AkhnZx(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.fetchVPNInfo();
    }

    public static final void fetchVPNInfo(C49229ukc c49229ukc, android.view.View view) {
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(c49229ukc.getResources(), C48931uew.TaskDescription.OLrzqt);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapDecodeResource);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapDecodeResource);
        Intrinsics.copydefault(fileAEQbTJ);
        java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        Intrinsics.copydefault((java.lang.Object) absolutePath);
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, actionBar.KWHzl(absolutePath, new Function1() { // from class: o.ukt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.DbNXlk((ImageShareParams) obj);
            }
        }), null, 2, null);
        AbstractC49065uhX abstractC49065uhX = c49229ukc.djBIcL;
        if (abstractC49065uhX != null) {
            abstractC49065uhX.OLrzqt(shareConfigCreate$default);
        }
    }

    public static final Unit DbNXlk(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("update config");
        imageShareParams.setBody("share body");
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(C49229ukc c49229ukc, android.view.View view) {
        c49229ukc.DbNXlk();
    }

    public final void DbNXlk() {
        AbstractC49025ugk abstractC49025ugk = this.KWHzl;
        if (abstractC49025ugk == null) {
            Intrinsics.gEmmrt("");
            abstractC49025ugk = null;
        }
        final java.lang.String strValueOf = java.lang.String.valueOf(abstractC49025ugk.values.getText());
        AbstractC49025ugk abstractC49025ugk2 = this.KWHzl;
        if (abstractC49025ugk2 == null) {
            Intrinsics.gEmmrt("");
            abstractC49025ugk2 = null;
        }
        TextShareParams textShareParamsKWHzl = TextShareParams.Companion.KWHzl("sms title", java.lang.String.valueOf(abstractC49025ugk2.DbNXlk.getText()), new Function1() { // from class: o.ukM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AEQbTJ(strValueOf, (TextShareParams) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.KWHzl(fragmentActivityRequireActivity, textShareParamsKWHzl, SharePlatform.SMS, null);
    }

    public static final Unit AEQbTJ(java.lang.String str, TextShareParams textShareParams) {
        Intrinsics.checkNotNullParameter(textShareParams, "");
        textShareParams.getExtras().putString("sms_address", str);
        textShareParams.setShareFrom("apitest");
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        this.djBIcL = ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(ShareConfig.ActionBar.create$default(ShareConfig.Companion, LinkShareParams.Companion.AEQbTJ("https://okx.com", new Function1() { // from class: o.ukk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.copydefault((LinkShareParams) obj);
            }
        }), null, 2, null));
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C48931uew.StateListAnimator.hDKMBd;
        AbstractC49065uhX abstractC49065uhX = this.djBIcL;
        Intrinsics.copydefault(abstractC49065uhX);
        fragmentTransactionBeginTransaction.replace(i, abstractC49065uhX, "SharePlatformsFragment").commitNowAllowingStateLoss();
    }

    public static final Unit copydefault(LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        linkShareParams.setShareFrom("embed share");
        return Unit.INSTANCE;
    }

    public final void values() {
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(ShareConfig.Companion, TextShareParams.Companion.KWHzl("title", "body", new Function1() { // from class: o.ukv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.OLrzqt((TextShareParams) obj);
            }
        }), null, 2, null);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCreate$default, AEQbTJ());
    }

    public static final Unit OLrzqt(TextShareParams textShareParams) {
        Intrinsics.checkNotNullParameter(textShareParams, "");
        textShareParams.setShareFrom("test");
        textShareParams.setBody("shareBody");
        return Unit.INSTANCE;
    }

    public final void valueOf() {
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(LinkShareParams.Companion.AEQbTJ("https://www.okx.com/ul/ocGWa8j", new Function1() { // from class: o.ukZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.KWHzl((LinkShareParams) obj);
            }
        }), new Function1() { // from class: o.uke
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.KWHzl(this.EZpvd, (ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit KWHzl(LinkShareParams linkShareParams) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        linkShareParams.setShareFrom("test");
        linkShareParams.setBody("share body,please join us by click the url -> https://www.okx.com/ul/ocGWa8j");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C49229ukc c49229ukc, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        C33061mpO.setupSpanStyles$default("hello123world", new java.lang.String[]{"123"}, 0, null, false, new Function1() { // from class: o.ukP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }, 14, null);
        ImageSource.Companion.OLrzqt("https://static.coinall.ltd/cdn/assets/imgs/244/84D446EF6A65AF94.jpeg");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C49229ukc c49229ukc, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(c49229ukc.getResources().getColor(C52761wXj.Activity.iqeXgQ)));
        list.add(new android.text.style.TextAppearanceSpan(c49229ukc.requireContext(), C52761wXj.PictureInPictureParams.ORrpqH));
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ImageSource.StateListAnimator stateListAnimator = ImageSource.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapDecodeResource);
        ImageSource imageSourceEZpvd = stateListAnimator.EZpvd(fragmentActivityRequireActivity, bitmapDecodeResource);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        ImageShareParams imageShareParamsOLrzqt = actionBar.OLrzqt(fragmentActivityRequireActivity2, bitmapDecodeResource, imageSourceEZpvd, new Function1() { // from class: o.ukn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AkhnZx((ImageShareParams) obj);
            }
        });
        imageShareParamsOLrzqt.getExtras().putBoolean("isEnableIMShare", true);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(imageShareParamsOLrzqt, new Function1() { // from class: o.uku
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.values((ShareConfig) obj);
            }
        });
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity3, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity3, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit AkhnZx(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("test");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 2, false, (java.lang.String) null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit values(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ujY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.valueOf((ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("title");
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        final android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        Intrinsics.copydefault(bitmapDecodeResource);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(actionBar, this, bitmapDecodeResource, (ImageSource) null, new Function1() { // from class: o.ukR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.EZpvd(this.KWHzl, bitmapDecodeResource, (ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ula
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.isConnected((ShareConfig) obj);
            }
        });
        AuCTel(shareConfigCopydefault);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit EZpvd(C49229ukc c49229ukc, android.graphics.Bitmap bitmap, ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("test");
        imageShareParams.setBody("share body");
        imageShareParams.setPreviewImageSource(ImageSource.Companion.AEQbTJ(C48931uew.TaskDescription.AEQbTJ));
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, false, (java.lang.String) null, 119, (DefaultConstructorMarker) null));
        FragmentActivity fragmentActivityRequireActivity = c49229ukc.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        imageShareParams.setPendingShareParamsTransformer(fragmentActivityRequireActivity, new Activity(bitmap));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.ukc$Activity */
    public static final class Activity implements InterfaceC48906ueX {
        public final /* synthetic */ android.graphics.Bitmap OLrzqt;

        public Activity(android.graphics.Bitmap bitmap) {
            this.OLrzqt = bitmap;
        }

        @Override // o.InterfaceC48906ueX
        public <T extends IShareParams> T copydefault(T t, SharePlatform sharePlatform) {
            Intrinsics.checkNotNullParameter(t, "");
            Intrinsics.checkNotNullParameter(sharePlatform, "");
            ImageShareParams imageShareParams = (ImageShareParams) t;
            ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
            android.graphics.Bitmap bitmap = this.OLrzqt;
            Intrinsics.copydefault(bitmap);
            java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmap);
            Intrinsics.copydefault(fileAEQbTJ);
            imageShareParams.setPendingShareImagePath(fileAEQbTJ.getAbsolutePath());
            return imageShareParams;
        }
    }

    public static final Unit isConnected(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ukS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AYXKKw((ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("title");
        imageDefaultPreviewConfig.setEditable(true);
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        Intrinsics.copydefault(bitmapDecodeResource);
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(ImageShareParams.ActionBar.create$default(actionBar, fragmentActivityRequireActivity, bitmapDecodeResource, (ImageSource) null, new Function1() { // from class: o.ukV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.values((ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ukT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.DbNXlk((ShareConfig) obj);
            }
        });
        AuCTel(shareConfigCopydefault);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity2, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity2, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit values(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setShareFrom("test");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig("title", "subtitle", ConnectionMethod.QR_CODE, 1, 1, false, "performShareImageActionWithActivity", 32, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ukd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.gEmmrt((ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("title");
        imageDefaultPreviewConfig.setEditable(true);
        imageDefaultPreviewConfig.setPreviewBottomTips("bottom tips");
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapDecodeResource);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapDecodeResource);
        Intrinsics.copydefault(fileAEQbTJ);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(actionBar.KWHzl(absolutePath, new Function1() { // from class: o.ukr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fetchVPNInfo((ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.ukA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AkhnZx((ShareConfig) obj);
            }
        });
        AuCTel(shareConfigCopydefault);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit fetchVPNInfo(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share body content->https://www.okx.com");
        imageShareParams.setShareFrom("test");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 2, false, (java.lang.String) null, 103, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, true, null, new Function1() { // from class: o.ukw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.isConnected((ImageDefaultPreviewConfig) obj);
            }
        }, 4, null));
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("title");
        imageDefaultPreviewConfig.setEditable(true);
        return Unit.INSTANCE;
    }

    public final void AkhnZx() {
        ImageSource imageSourceOLrzqt = ImageSource.Companion.OLrzqt(C43386roM.EZpvd.EZpvd() + "/cdn/assets/imgs/244/84D446EF6A65AF94.jpeg");
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapDecodeResource);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapDecodeResource);
        Intrinsics.copydefault(fileAEQbTJ);
        android.graphics.Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.AEQbTJ);
        Intrinsics.copydefault(bitmapDecodeResource2);
        java.io.File fileAEQbTJ2 = stateListAnimator.AEQbTJ(bitmapDecodeResource2);
        Intrinsics.copydefault(fileAEQbTJ2);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(actionBar, imageSourceOLrzqt, null, new Function1() { // from class: o.ukf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fJNWhG((ImageShareParams) obj);
            }
        }, 2, null);
        ShareConfig.ActionBar actionBar2 = ShareConfig.Companion;
        ShareConfig shareConfigCreate$default = ShareConfig.ActionBar.create$default(actionBar2, imageShareParamsCreate$default, null, 2, null);
        java.lang.String absolutePath = fileAEQbTJ2.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCopydefault = actionBar2.copydefault(actionBar.KWHzl(absolutePath, new Function1() { // from class: o.ukh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AuCTel((ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.ukg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fetchVPNInfo((ShareConfig) obj);
            }
        });
        BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        java.lang.String absolutePath2 = fileAEQbTJ.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "");
        ShareConfig shareConfigCopydefault2 = actionBar2.copydefault(actionBar.KWHzl(absolutePath2, new Function1() { // from class: o.ukm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fARcdN((ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.uki
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.ejfBZ((ShareConfig) obj);
            }
        });
        android.graphics.Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.AEQbTJ);
        Intrinsics.copydefault(bitmapDecodeResource3);
        ShareConfig shareConfigCopydefault3 = actionBar2.copydefault(ImageShareParams.ActionBar.create$default(actionBar, this, bitmapDecodeResource3, (ImageSource) null, new Function1() { // from class: o.ukj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.ejfBZ((ImageShareParams) obj);
            }
        }, 4, (java.lang.Object) null), new Function1() { // from class: o.ukl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fIwbmz((ShareConfig) obj);
            }
        });
        MultiShareConfig multiShareConfigCreate$default = MultiShareConfig.ActionBar.create$default(MultiShareConfig.Companion, yDY.gEmmrt(shareConfigCreate$default, shareConfigCopydefault, shareConfigCopydefault2, shareConfigCopydefault3, shareConfigCopydefault, shareConfigCopydefault2, shareConfigCopydefault3), false, 0.88f, false, null, null, 56, null);
        multiShareConfigCreate$default.setMultiSharedPreviewFragmentClass(C49197ujx.class);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.EZpvd((AbstractActivityC33041mov) fragmentActivityRequireActivity, multiShareConfigCreate$default, AEQbTJ());
    }

    public static final Unit fJNWhG(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share body");
        imageShareParams.setShareFrom("test");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 2, false, (java.lang.String) null, 103, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit AuCTel(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share body1 content->https://www.okx.com");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, false, (java.lang.String) null, 127, (DefaultConstructorMarker) null));
        imageShareParams.setShareFrom("imageShareParams1");
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, false, null, new Function1() { // from class: o.ukJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.AkhnZx((ImageDefaultPreviewConfig) obj);
            }
        }, 6, null));
        shareConfig.setSharePlatformConfig(SharePlatformsConfig.ActionBar.create$default(SharePlatformsConfig.Companion, yDY.gEmmrt(SharePlatform.SINA_WEIBO, SharePlatform.QQ, SharePlatform.WECHAT_MOMENTS), null, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("share  title1");
        imageDefaultPreviewConfig.setPreviewContent("share content1");
        imageDefaultPreviewConfig.setEditable(true);
        imageDefaultPreviewConfig.setImagePreviewPadding(new android.graphics.Rect(0, 0, 0, 0));
        imageDefaultPreviewConfig.setPreviewBottomTips("bottom tips1");
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share body2 content->https://www.okx.com");
        imageShareParams.setShareFrom("imageShareParams2");
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageCustomPreviewConfig.Activity.create$default(ImageCustomPreviewConfig.Companion, C49196ujw.class, null, new Function1() { // from class: o.ukH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.KWHzl((ImageCustomPreviewConfig) obj);
            }
        }, 2, null));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ImageCustomPreviewConfig imageCustomPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageCustomPreviewConfig, "");
        imageCustomPreviewConfig.setPreviewTitle("title");
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share body3 content->https://okx.com");
        imageShareParams.setShareFrom("tes3t");
        imageShareParams.setImageFooterConfig(new ImageFooterConfig((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, false, (java.lang.String) null, 127, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, false, null, new Function1() { // from class: o.ukq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fetchVPNInfo((ImageDefaultPreviewConfig) obj);
            }
        }, 6, null));
        return Unit.INSTANCE;
    }

    public static final Unit fetchVPNInfo(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("shareConfig3 title ");
        imageDefaultPreviewConfig.setPreviewContent("https://okx.com/btc/market/trading/key=sdfdsf");
        imageDefaultPreviewConfig.setEditable(true);
        imageDefaultPreviewConfig.setImagePreviewPadding(new android.graphics.Rect(0, 0, 0, 0));
        imageDefaultPreviewConfig.setPreviewBottomTips("bottom tips3bottom tips3bottom tips3");
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        android.graphics.Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), C48931uew.TaskDescription.OLrzqt);
        ShareFileProvider.StateListAnimator stateListAnimator = ShareFileProvider.Companion;
        Intrinsics.copydefault(bitmapDecodeResource);
        java.io.File fileAEQbTJ = stateListAnimator.AEQbTJ(bitmapDecodeResource);
        Intrinsics.copydefault(fileAEQbTJ);
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        java.lang.String absolutePath = fileAEQbTJ.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "");
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(actionBar.KWHzl(absolutePath, new Function1() { // from class: o.uko
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fIwbmz((ImageShareParams) obj);
            }
        }), new Function1() { // from class: o.ukp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.fARcdN((ShareConfig) obj);
            }
        });
        AuCTel(shareConfigCopydefault);
        InterfaceC48893ueK interfaceC48893ueKIsConnected = isConnected();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        interfaceC48893ueKIsConnected.OLrzqt((AbstractActivityC33041mov) fragmentActivityRequireActivity, shareConfigCopydefault, AEQbTJ());
    }

    public static final Unit fIwbmz(ImageShareParams imageShareParams) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        imageShareParams.setBody("share to all platforms");
        imageShareParams.setShareFrom("test");
        return Unit.INSTANCE;
    }

    public static final Unit fARcdN(ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        shareConfig.setPreviewConfig(ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, ImagePreviewType.CENTER_INSIDE, false, null, new Function1() { // from class: o.ukU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C49229ukc.values((ImageDefaultPreviewConfig) obj);
            }
        }, 6, null));
        return Unit.INSTANCE;
    }

    public static final Unit values(ImageDefaultPreviewConfig imageDefaultPreviewConfig) {
        Intrinsics.checkNotNullParameter(imageDefaultPreviewConfig, "");
        imageDefaultPreviewConfig.setPreviewTitle("shareAllPlatforms title");
        imageDefaultPreviewConfig.setPreviewContent("shareAllPlatforms preview content");
        imageDefaultPreviewConfig.setEditable(true);
        return Unit.INSTANCE;
    }

    public final void AuCTel(ShareConfig shareConfig) {
        shareConfig.setSharePlatformConfig(SharePlatformsConfig.ActionBar.create$default(SharePlatformsConfig.Companion, yDY.gEmmrt(SharePlatform.SMS, SharePlatform.TWITTER, SharePlatform.SINA_WEIBO, SharePlatform.WECHAT, SharePlatform.VK, SharePlatform.FACEBOOK, SharePlatform.INSTAGRAM, SharePlatform.DISCORD, SharePlatform.VIBER, SharePlatform.KAKAO, SharePlatform.LINE, SharePlatform.FACEBOOK_MESSENGER, SharePlatform.QQ, SharePlatform.ZALO, SharePlatform.WECHAT_MOMENTS, SharePlatform.TELEGRAM, SharePlatform.WHATS_APP), null, 2, null));
    }
}

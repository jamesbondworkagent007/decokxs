package o;

import com.okinc.share.api.params.IShareParams;
import com.okinc.share.api.platform.ISharePlatformsConfig;
import com.okinc.share.api.preview.ISharePreviewConfig;
import com.okinc.share.bean.AndroidPlatformComponents;
import com.okinc.share.bean.ImagePreviewType;
import com.okinc.share.bean.PlatformComponentInfo;
import com.okinc.share.bean.ShareConfig;
import com.okinc.share.bean.SharePlatformComponents;
import com.okinc.share.bean.SharePlatformsConfig;
import com.okinc.share.bean.SharePreviewMode;
import com.okinc.share.bean.ShareType;
import com.okinc.share.bean.image.ImageCustomLuaPreviewConfig;
import com.okinc.share.bean.image.ImageCustomPreviewConfig;
import com.okinc.share.bean.image.ImageDefaultPreviewConfig;
import com.okinc.share.bean.image.ImageFooterConfig;
import com.okinc.share.bean.image.ImageShareParams;
import com.okinc.share.bean.image.ImageSource;
import com.okinc.share.bean.link.LinkDefaultPreviewConfig;
import com.okinc.share.bean.link.LinkShareParams;
import com.okinc.share.bean.text.TextDefaultPreviewConfig;
import com.okinc.share.bean.text.TextShareParams;
import com.okinc.share.platforms.SharePlatform;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.AbstractC2499AOc;
import o.AbstractC2565AQq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import uniffi.growth.ShareParamsKind;
import uniffi.growth.TriggerSource;

/* JADX INFO: renamed from: o.ueG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48889ueG {
    public static final C48889ueG KWHzl = new C48889ueG();

    /* JADX INFO: renamed from: o.ueG$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] AhwBna;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;
        public static final /* synthetic */ int[] valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ShareParamsKind.values().length];
            try {
                iArr[ShareParamsKind.TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ShareParamsKind.IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareParamsKind.LINK.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[ImagePreviewType.values().length];
            try {
                iArr2[ImagePreviewType.CENTER_INSIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[ImagePreviewType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
            int[] iArr3 = new int[uniffi.growth.ImagePreviewType.values().length];
            try {
                iArr3[uniffi.growth.ImagePreviewType.CENTER_INSIDE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr3[uniffi.growth.ImagePreviewType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            copydefault = iArr3;
            int[] iArr4 = new int[ShareType.values().length];
            try {
                iArr4[ShareType.SHARE_TEXT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr4[ShareType.SHARE_IMAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr4[ShareType.SHARE_WEBPAGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            EZpvd = iArr4;
            int[] iArr5 = new int[SharePreviewMode.values().length];
            try {
                iArr5[SharePreviewMode.DEFAULT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr5[SharePreviewMode.CUSTOM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr5[SharePreviewMode.CUSTOM_LUA.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            OLrzqt = iArr5;
            int[] iArr6 = new int[TriggerSource.values().length];
            try {
                iArr6[TriggerSource.BUTTON_CLICK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr6[TriggerSource.SCREEN_SHOT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            valueOf = iArr6;
            int[] iArr7 = new int[com.okinc.share.bean.TriggerSource.values().length];
            try {
                iArr7[com.okinc.share.bean.TriggerSource.BUTTON_CLICK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr7[com.okinc.share.bean.TriggerSource.SCREEN_SHOT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            AhwBna = iArr7;
        }
    }

    private C48889ueG() {
    }

    public final java.lang.ClassLoader OLrzqt() {
        java.lang.ClassLoader contextClassLoader = java.lang.Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? java.lang.ClassLoader.getSystemClassLoader() : contextClassLoader;
    }

    public final APJ copydefault(@NotNull ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        APM apmAEQbTJ = AEQbTJ(shareConfig.getShareParams());
        AbstractC2565AQq abstractC2565AQqOLrzqt = OLrzqt(shareConfig.getPreviewConfig(), shareConfig.getShareParams().getShareType());
        ISharePlatformsConfig sharePlatformConfig = shareConfig.getSharePlatformConfig();
        APJ apj = new APJ(apmAEQbTJ, abstractC2565AQqOLrzqt, sharePlatformConfig != null ? KWHzl(sharePlatformConfig) : null);
        pUU.EZpvd("ShareConfigConverter", "NativeShareConfig.toRust cost=" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return apj;
    }

    public final ShareConfig AEQbTJ(@NotNull final APJ apj) {
        Intrinsics.checkNotNullParameter(apj, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        ShareConfig shareConfigCopydefault = ShareConfig.Companion.copydefault(KWHzl(apj.EZpvd()), new Function1() { // from class: o.ueH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C48889ueG.EZpvd(apj, (ShareConfig) obj);
            }
        });
        pUU.EZpvd("ShareConfigConverter", "RustShareConfig.toNative cost=" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
        return shareConfigCopydefault;
    }

    public static final Unit EZpvd(APJ apj, ShareConfig shareConfig) {
        Intrinsics.checkNotNullParameter(shareConfig, "");
        C2563AQo c2563AQoOLrzqt = apj.OLrzqt();
        shareConfig.setSharePlatformConfig(c2563AQoOLrzqt != null ? KWHzl.KWHzl(c2563AQoOLrzqt) : null);
        shareConfig.setPreviewConfig(KWHzl.copydefault(apj.copydefault()));
        return Unit.INSTANCE;
    }

    public final APM AEQbTJ(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        APL aplOLrzqt = OLrzqt(iShareParams);
        if (iShareParams instanceof TextShareParams) {
            return new APM(ShareParamsKind.TEXT, new C2561AQm(aplOLrzqt), null, null);
        }
        if (iShareParams instanceof ImageShareParams) {
            return new APM(ShareParamsKind.IMAGE, null, copydefault((ImageShareParams) iShareParams, aplOLrzqt), null);
        }
        if (iShareParams instanceof LinkShareParams) {
            return new APM(ShareParamsKind.LINK, null, null, KWHzl((LinkShareParams) iShareParams, aplOLrzqt));
        }
        throw new java.lang.IllegalStateException(("Unsupported share params type: " + iShareParams.getClass()).toString());
    }

    public final APL OLrzqt(@NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(iShareParams, "");
        kotlin.Pair<java.util.Map<java.lang.String, java.lang.String>, byte[]> pairEZpvd = EZpvd(iShareParams.getExtras());
        return new APL(pairEZpvd.component1(), pairEZpvd.component2(), iShareParams.getTitle(), iShareParams.getSubtitle(), iShareParams.getBody(), copydefault(iShareParams.getTriggerSource()), iShareParams.getShareFrom(), iShareParams.getSmsBody(), iShareParams.getEmailBody(), iShareParams.getEmailSubject(), iShareParams.getWcMomentBody());
    }

    public final ANY copydefault(@NotNull ImageShareParams imageShareParams, @NotNull APL apl) {
        Intrinsics.checkNotNullParameter(imageShareParams, "");
        Intrinsics.checkNotNullParameter(apl, "");
        AbstractC2499AOc abstractC2499AOcKWHzl = KWHzl(imageShareParams.getPreviewImageSource());
        ImageFooterConfig imageFooterConfig = imageShareParams.getImageFooterConfig();
        return new ANY(apl, abstractC2499AOcKWHzl, imageFooterConfig != null ? KWHzl(imageFooterConfig) : null, imageShareParams.getPendingShareImagePath(), imageShareParams.getPendingShareBitmapKey());
    }

    public final C2500AOd KWHzl(@NotNull LinkShareParams linkShareParams, @NotNull APL apl) {
        Intrinsics.checkNotNullParameter(linkShareParams, "");
        Intrinsics.checkNotNullParameter(apl, "");
        return new C2500AOd(apl, linkShareParams.getLinkUrl(), KWHzl(linkShareParams.getLinkIconImageSource()));
    }

    public final IShareParams KWHzl(@NotNull APM apm) {
        java.lang.Object obj;
        Intrinsics.checkNotNullParameter(apm, "");
        ShareParamsKind shareParamsKindEZpvd = apm.EZpvd();
        int[] iArr = TaskDescription.KWHzl;
        int i = iArr[shareParamsKindEZpvd.ordinal()];
        if (i == 1) {
            C2561AQm c2561AQmKWHzl = apm.KWHzl();
            obj = c2561AQmKWHzl;
            if (c2561AQmKWHzl == null) {
                throw new java.lang.IllegalStateException("RustTextShareParams is null".toString());
            }
        } else if (i == 2) {
            ANY anyAEQbTJ = apm.AEQbTJ();
            obj = anyAEQbTJ;
            if (anyAEQbTJ == null) {
                throw new java.lang.IllegalStateException("RustImageShareParams is null".toString());
            }
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C2500AOd c2500AOdCopydefault = apm.copydefault();
            obj = c2500AOdCopydefault;
            if (c2500AOdCopydefault == null) {
                throw new java.lang.IllegalStateException("RustLinkShareParams is null".toString());
            }
        }
        int i2 = iArr[apm.EZpvd().ordinal()];
        if (i2 == 1) {
            APL aplAEQbTJ = ((C2561AQm) obj).AEQbTJ();
            IShareParams iShareParamsCreate$default = TextShareParams.Application.create$default(TextShareParams.Companion, aplAEQbTJ.valueOf(), aplAEQbTJ.AEQbTJ(), null, 4, null);
            OLrzqt(aplAEQbTJ, iShareParamsCreate$default);
            return iShareParamsCreate$default;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            C2500AOd c2500AOd = (C2500AOd) obj;
            LinkShareParams linkShareParamsCreate$default = LinkShareParams.Activity.create$default(LinkShareParams.Companion, c2500AOd.copydefault(), null, 2, null);
            OLrzqt(c2500AOd.EZpvd(), linkShareParamsCreate$default);
            AbstractC2499AOc abstractC2499AOcOLrzqt = c2500AOd.OLrzqt();
            linkShareParamsCreate$default.setLinkIconImageSource(abstractC2499AOcOLrzqt != null ? EZpvd(abstractC2499AOcOLrzqt) : null);
            return linkShareParamsCreate$default;
        }
        ANY any = (ANY) obj;
        ImageShareParams.ActionBar actionBar = ImageShareParams.Companion;
        AbstractC2499AOc abstractC2499AOcCopydefault = any.copydefault();
        ImageShareParams imageShareParamsCreate$default = ImageShareParams.ActionBar.create$default(actionBar, abstractC2499AOcCopydefault != null ? EZpvd(abstractC2499AOcCopydefault) : null, any.AEQbTJ(), null, 4, null);
        OLrzqt(any.EZpvd(), imageShareParamsCreate$default);
        ANX anxOLrzqt = any.OLrzqt();
        imageShareParamsCreate$default.setImageFooterConfig(anxOLrzqt != null ? copydefault(anxOLrzqt) : null);
        java.lang.String strKWHzl = any.KWHzl();
        if (strKWHzl == null) {
            return imageShareParamsCreate$default;
        }
        imageShareParamsCreate$default.setPendingShareBitmapKey(strKWHzl);
        return imageShareParamsCreate$default;
    }

    public final void OLrzqt(@NotNull APL apl, @NotNull IShareParams iShareParams) {
        Intrinsics.checkNotNullParameter(apl, "");
        Intrinsics.checkNotNullParameter(iShareParams, "");
        iShareParams.setTitle(apl.valueOf());
        iShareParams.setSubtitle(apl.AhwBna());
        iShareParams.setBody(apl.AEQbTJ());
        iShareParams.setShareFrom(apl.djBIcL());
        iShareParams.setTriggerSource(EZpvd(apl.AYXKKw()));
        iShareParams.setExtras(OLrzqt(apl.OLrzqt(), apl.copydefault()));
        iShareParams.setSmsBody(apl.gEmmrt());
        iShareParams.setEmailBody(apl.KWHzl());
        iShareParams.setEmailSubject(apl.EZpvd());
        iShareParams.setWcMomentBody(apl.AkhnZx());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [o.AOc] */
    /* JADX WARN: Type inference failed for: r17v0, types: [o.APH] */
    public final AbstractC2565AQq OLrzqt(@NotNull ISharePreviewConfig iSharePreviewConfig, @NotNull ShareType shareType) {
        AbstractC2565AQq application;
        Intrinsics.checkNotNullParameter(iSharePreviewConfig, "");
        Intrinsics.checkNotNullParameter(shareType, "");
        java.lang.String previewTitle = iSharePreviewConfig.getPreviewTitle();
        java.lang.String previewContent = iSharePreviewConfig.getPreviewContent();
        AbstractC2499AOc abstractC2499AOcKWHzl = KWHzl(iSharePreviewConfig.getPreviewIcon());
        boolean editable = iSharePreviewConfig.getEditable();
        java.lang.CharSequence previewBottomTips = iSharePreviewConfig.getPreviewBottomTips();
        C2564AQp c2564AQp = new C2564AQp(previewTitle, previewContent, abstractC2499AOcKWHzl, editable, previewBottomTips != null ? previewBottomTips.toString() : null);
        if (iSharePreviewConfig instanceof TextDefaultPreviewConfig) {
            return new AbstractC2565AQq.ActionBar(new C2562AQn(c2564AQp, KWHzl(shareType), uniffi.growth.SharePreviewMode.DEFAULT));
        }
        if (iSharePreviewConfig instanceof ImageDefaultPreviewConfig) {
            uniffi.growth.ShareType shareTypeKWHzl = KWHzl(shareType);
            ImageDefaultPreviewConfig imageDefaultPreviewConfig = (ImageDefaultPreviewConfig) iSharePreviewConfig;
            uniffi.growth.SharePreviewMode sharePreviewModeAEQbTJ = AEQbTJ(imageDefaultPreviewConfig.getSharePreviewMode());
            uniffi.growth.ImagePreviewType imagePreviewTypeAEQbTJ = AEQbTJ(imageDefaultPreviewConfig.getImagePreviewType());
            boolean zIsShowing = imageDefaultPreviewConfig.isShowing();
            android.graphics.Rect imagePreviewPadding = imageDefaultPreviewConfig.getImagePreviewPadding();
            application = new AbstractC2565AQq.Activity(new ANZ(c2564AQp, shareTypeKWHzl, sharePreviewModeAEQbTJ, imagePreviewTypeAEQbTJ, zIsShowing, imagePreviewPadding != null ? EZpvd(imagePreviewPadding) : null));
        } else {
            if (iSharePreviewConfig instanceof ImageCustomPreviewConfig) {
                uniffi.growth.ShareType shareTypeKWHzl2 = KWHzl(shareType);
                ImageCustomPreviewConfig imageCustomPreviewConfig = (ImageCustomPreviewConfig) iSharePreviewConfig;
                uniffi.growth.SharePreviewMode sharePreviewModeAEQbTJ2 = AEQbTJ(imageCustomPreviewConfig.getSharePreviewMode());
                java.lang.String name = imageCustomPreviewConfig.getCustomFragmentClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "");
                return new AbstractC2565AQq.TaskDescription(new ANW(c2564AQp, shareTypeKWHzl2, sharePreviewModeAEQbTJ2, name));
            }
            if (iSharePreviewConfig instanceof ImageCustomLuaPreviewConfig) {
                ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfig = (ImageCustomLuaPreviewConfig) iSharePreviewConfig;
                application = new AbstractC2565AQq.StateListAnimator(new C2497AOa(c2564AQp, KWHzl(shareType), AEQbTJ(imageCustomLuaPreviewConfig.getSharePreviewMode()), imageCustomLuaPreviewConfig.getCustomMenuItemsKey(), imageCustomLuaPreviewConfig.getCustomViewKey()));
            } else if (iSharePreviewConfig instanceof LinkDefaultPreviewConfig) {
                uniffi.growth.ShareType shareTypeKWHzl3 = KWHzl(shareType);
                LinkDefaultPreviewConfig linkDefaultPreviewConfig = (LinkDefaultPreviewConfig) iSharePreviewConfig;
                uniffi.growth.SharePreviewMode sharePreviewModeAEQbTJ3 = AEQbTJ(linkDefaultPreviewConfig.getSharePreviewMode());
                java.lang.CharSequence previewStyleBody = linkDefaultPreviewConfig.getPreviewStyleBody();
                java.lang.String string = previewStyleBody != null ? previewStyleBody.toString() : null;
                ImageSource previewImage = linkDefaultPreviewConfig.getPreviewImage();
                application = new AbstractC2565AQq.Application(new C2501AOe(c2564AQp, shareTypeKWHzl3, sharePreviewModeAEQbTJ3, string, previewImage != null ? KWHzl(previewImage) : null));
            } else {
                throw new java.lang.IllegalStateException(("Unsupported preview config: " + iSharePreviewConfig.getClass()).toString());
            }
        }
        return application;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final ISharePreviewConfig copydefault(@NotNull AbstractC2565AQq abstractC2565AQq) throws java.lang.ClassNotFoundException {
        ISharePreviewConfig iSharePreviewConfig;
        Intrinsics.checkNotNullParameter(abstractC2565AQq, "");
        if (abstractC2565AQq instanceof AbstractC2565AQq.ActionBar) {
            TextDefaultPreviewConfig.TaskDescription taskDescription = TextDefaultPreviewConfig.Companion;
            AbstractC2565AQq.ActionBar actionBar = (AbstractC2565AQq.ActionBar) abstractC2565AQq;
            java.lang.String strKWHzl = actionBar.KWHzl().KWHzl().KWHzl();
            java.lang.String strCopydefault = actionBar.KWHzl().KWHzl().copydefault();
            AbstractC2499AOc abstractC2499AOcEZpvd = actionBar.KWHzl().KWHzl().EZpvd();
            return TextDefaultPreviewConfig.TaskDescription.create$default(taskDescription, strKWHzl, strCopydefault, abstractC2499AOcEZpvd != null ? EZpvd(abstractC2499AOcEZpvd) : null, null, 8, null);
        }
        if (abstractC2565AQq instanceof AbstractC2565AQq.Activity) {
            AbstractC2565AQq.Activity activity = (AbstractC2565AQq.Activity) abstractC2565AQq;
            ImageDefaultPreviewConfig imageDefaultPreviewConfigCreate$default = ImageDefaultPreviewConfig.TaskDescription.create$default(ImageDefaultPreviewConfig.Companion, AEQbTJ(activity.AEQbTJ().AEQbTJ()), activity.AEQbTJ().AYXKKw(), activity.AEQbTJ().KWHzl().KWHzl(), null, 8, null);
            APH aphEZpvd = activity.AEQbTJ().EZpvd();
            imageDefaultPreviewConfigCreate$default.setImagePreviewPadding(aphEZpvd != null ? KWHzl.KWHzl(aphEZpvd) : null);
            KWHzl.KWHzl(activity.AEQbTJ().KWHzl(), imageDefaultPreviewConfigCreate$default);
            iSharePreviewConfig = imageDefaultPreviewConfigCreate$default;
        } else if (abstractC2565AQq instanceof AbstractC2565AQq.TaskDescription) {
            ImageCustomPreviewConfig.Activity activity2 = ImageCustomPreviewConfig.Companion;
            AbstractC2565AQq.TaskDescription taskDescription2 = (AbstractC2565AQq.TaskDescription) abstractC2565AQq;
            java.lang.Class<?> cls = java.lang.Class.forName(taskDescription2.AEQbTJ().KWHzl());
            Intrinsics.copydefault(cls, "");
            ImageCustomPreviewConfig imageCustomPreviewConfigCreate$default = ImageCustomPreviewConfig.Activity.create$default(activity2, cls, taskDescription2.AEQbTJ().EZpvd().KWHzl(), null, 4, null);
            KWHzl.KWHzl(taskDescription2.AEQbTJ().EZpvd(), imageCustomPreviewConfigCreate$default);
            iSharePreviewConfig = imageCustomPreviewConfigCreate$default;
        } else if (abstractC2565AQq instanceof AbstractC2565AQq.StateListAnimator) {
            AbstractC2565AQq.StateListAnimator stateListAnimator = (AbstractC2565AQq.StateListAnimator) abstractC2565AQq;
            ImageCustomLuaPreviewConfig imageCustomLuaPreviewConfigCreateFromKeys$default = ImageCustomLuaPreviewConfig.TaskDescription.createFromKeys$default(ImageCustomLuaPreviewConfig.Companion, stateListAnimator.AEQbTJ().OLrzqt().KWHzl(), stateListAnimator.AEQbTJ().copydefault(), stateListAnimator.AEQbTJ().EZpvd(), null, 8, null);
            KWHzl.KWHzl(stateListAnimator.AEQbTJ().OLrzqt(), imageCustomLuaPreviewConfigCreateFromKeys$default);
            iSharePreviewConfig = imageCustomLuaPreviewConfigCreateFromKeys$default;
        } else {
            if (!(abstractC2565AQq instanceof AbstractC2565AQq.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            LinkDefaultPreviewConfig.Activity activity3 = LinkDefaultPreviewConfig.Companion;
            AbstractC2565AQq.Application application = (AbstractC2565AQq.Application) abstractC2565AQq;
            java.lang.String strKWHzl2 = application.OLrzqt().OLrzqt().KWHzl();
            java.lang.String strCopydefault2 = application.OLrzqt().OLrzqt().copydefault();
            AbstractC2499AOc abstractC2499AOcEZpvd2 = application.OLrzqt().OLrzqt().EZpvd();
            ImageSource imageSourceEZpvd = abstractC2499AOcEZpvd2 != null ? EZpvd(abstractC2499AOcEZpvd2) : null;
            java.lang.String strKWHzl3 = application.OLrzqt().KWHzl();
            AbstractC2499AOc abstractC2499AOcEZpvd3 = application.OLrzqt().EZpvd();
            return LinkDefaultPreviewConfig.Activity.create$default(activity3, strKWHzl2, strCopydefault2, imageSourceEZpvd, strKWHzl3, abstractC2499AOcEZpvd3 != null ? EZpvd(abstractC2499AOcEZpvd3) : null, null, 32, null);
        }
        return iSharePreviewConfig;
    }

    public final void KWHzl(@NotNull C2564AQp c2564AQp, @NotNull ISharePreviewConfig iSharePreviewConfig) {
        Intrinsics.checkNotNullParameter(c2564AQp, "");
        Intrinsics.checkNotNullParameter(iSharePreviewConfig, "");
        iSharePreviewConfig.setPreviewTitle(c2564AQp.KWHzl());
        iSharePreviewConfig.setPreviewContent(c2564AQp.copydefault());
        AbstractC2499AOc abstractC2499AOcEZpvd = c2564AQp.EZpvd();
        iSharePreviewConfig.setPreviewIcon(abstractC2499AOcEZpvd != null ? EZpvd(abstractC2499AOcEZpvd) : null);
        iSharePreviewConfig.setEditable(c2564AQp.OLrzqt());
        iSharePreviewConfig.setPreviewBottomTips(c2564AQp.AEQbTJ());
    }

    public final C2563AQo KWHzl(@NotNull ISharePlatformsConfig iSharePlatformsConfig) {
        Intrinsics.checkNotNullParameter(iSharePlatformsConfig, "");
        java.util.List<SharePlatform> replacedSharePlatforms = iSharePlatformsConfig.getReplacedSharePlatforms();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = replacedSharePlatforms.iterator();
        while (it.hasNext()) {
            uniffi.growth.SharePlatform sharePlatformEZpvd = KWHzl.EZpvd((SharePlatform) it.next());
            if (sharePlatformEZpvd != null) {
                arrayList.add(sharePlatformEZpvd);
            }
        }
        return new C2563AQo(arrayList);
    }

    public final SharePlatformsConfig KWHzl(@NotNull C2563AQo c2563AQo) {
        Intrinsics.checkNotNullParameter(c2563AQo, "");
        java.util.List<uniffi.growth.SharePlatform> listEZpvd = c2563AQo.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl.KWHzl((uniffi.growth.SharePlatform) it.next()));
        }
        return SharePlatformsConfig.ActionBar.create$default(SharePlatformsConfig.Companion, arrayList, null, 2, null);
    }

    public final uniffi.growth.SharePlatform EZpvd(@NotNull SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        return ANQ.sharePlatformFromPlatformId(sharePlatform.getPlatformId());
    }

    public final SharePlatform KWHzl(@NotNull uniffi.growth.SharePlatform sharePlatform) {
        Intrinsics.checkNotNullParameter(sharePlatform, "");
        SharePlatform sharePlatformValueOf = SharePlatform.CREATOR.valueOf(sharePlatform.getValue());
        return sharePlatformValueOf == null ? SharePlatform.QRCODE : sharePlatformValueOf;
    }

    public final ANX KWHzl(@NotNull ImageFooterConfig imageFooterConfig) {
        Intrinsics.checkNotNullParameter(imageFooterConfig, "");
        return new ANX(imageFooterConfig.getTitle(), imageFooterConfig.getSubtitle(), imageFooterConfig.getQrcode(), imageFooterConfig.getPosition(), imageFooterConfig.getTheme(), imageFooterConfig.getEnableLogo(), imageFooterConfig.getShareFrom());
    }

    public final ImageFooterConfig copydefault(@NotNull ANX anx) {
        Intrinsics.checkNotNullParameter(anx, "");
        return new ImageFooterConfig(anx.djBIcL(), anx.KWHzl(), anx.copydefault(), anx.AEQbTJ(), anx.AhwBna(), anx.OLrzqt(), anx.EZpvd());
    }

    public final AbstractC2499AOc KWHzl(ImageSource imageSource) {
        if (imageSource == null) {
            return null;
        }
        android.net.Uri uri = imageSource.getUri();
        int resourceId = imageSource.getResourceId();
        java.lang.String bitmapKey = imageSource.getBitmapKey();
        if (uri != null) {
            java.lang.String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new AbstractC2499AOc.Application(string);
        }
        if (resourceId != 0) {
            return new AbstractC2499AOc.Activity(resourceId);
        }
        if (bitmapKey != null) {
            return new AbstractC2499AOc.ActionBar(bitmapKey);
        }
        return null;
    }

    public final ImageSource EZpvd(@NotNull AbstractC2499AOc abstractC2499AOc) {
        Intrinsics.checkNotNullParameter(abstractC2499AOc, "");
        if (abstractC2499AOc instanceof AbstractC2499AOc.Application) {
            return ImageSource.Companion.OLrzqt(((AbstractC2499AOc.Application) abstractC2499AOc).OLrzqt());
        }
        if (abstractC2499AOc instanceof AbstractC2499AOc.Activity) {
            return ImageSource.Companion.AEQbTJ(((AbstractC2499AOc.Activity) abstractC2499AOc).AEQbTJ());
        }
        if (abstractC2499AOc instanceof AbstractC2499AOc.ActionBar) {
            return ImageSource.Companion.KWHzl(((AbstractC2499AOc.ActionBar) abstractC2499AOc).OLrzqt());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final APH EZpvd(@NotNull android.graphics.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "");
        return new APH(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final android.graphics.Rect KWHzl(@NotNull APH aph) {
        Intrinsics.checkNotNullParameter(aph, "");
        return new android.graphics.Rect(aph.AEQbTJ(), aph.EZpvd(), aph.KWHzl(), aph.copydefault());
    }

    public final uniffi.growth.ImagePreviewType AEQbTJ(@NotNull ImagePreviewType imagePreviewType) {
        Intrinsics.checkNotNullParameter(imagePreviewType, "");
        int i = TaskDescription.AEQbTJ[imagePreviewType.ordinal()];
        if (i == 1) {
            return uniffi.growth.ImagePreviewType.CENTER_INSIDE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return uniffi.growth.ImagePreviewType.CENTER_CROP;
    }

    public final ImagePreviewType AEQbTJ(@NotNull uniffi.growth.ImagePreviewType imagePreviewType) {
        Intrinsics.checkNotNullParameter(imagePreviewType, "");
        int i = TaskDescription.copydefault[imagePreviewType.ordinal()];
        if (i == 1) {
            return ImagePreviewType.CENTER_INSIDE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return ImagePreviewType.CENTER_CROP;
    }

    public final uniffi.growth.ShareType KWHzl(@NotNull ShareType shareType) {
        Intrinsics.checkNotNullParameter(shareType, "");
        int i = TaskDescription.EZpvd[shareType.ordinal()];
        if (i == 1) {
            return uniffi.growth.ShareType.SHARE_TEXT;
        }
        if (i == 2) {
            return uniffi.growth.ShareType.SHARE_IMAGE;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return uniffi.growth.ShareType.SHARE_WEBPAGE;
    }

    public final uniffi.growth.SharePreviewMode AEQbTJ(@NotNull SharePreviewMode sharePreviewMode) {
        Intrinsics.checkNotNullParameter(sharePreviewMode, "");
        int i = TaskDescription.OLrzqt[sharePreviewMode.ordinal()];
        if (i == 1) {
            return uniffi.growth.SharePreviewMode.DEFAULT;
        }
        if (i == 2) {
            return uniffi.growth.SharePreviewMode.CUSTOM;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return uniffi.growth.SharePreviewMode.CUSTOM_LUA;
    }

    public final com.okinc.share.bean.TriggerSource EZpvd(@NotNull TriggerSource triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        int i = TaskDescription.valueOf[triggerSource.ordinal()];
        if (i == 1) {
            return com.okinc.share.bean.TriggerSource.BUTTON_CLICK;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return com.okinc.share.bean.TriggerSource.SCREEN_SHOT;
    }

    public final TriggerSource copydefault(@NotNull com.okinc.share.bean.TriggerSource triggerSource) {
        Intrinsics.checkNotNullParameter(triggerSource, "");
        int i = TaskDescription.AhwBna[triggerSource.ordinal()];
        if (i == 1) {
            return TriggerSource.BUTTON_CLICK;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return TriggerSource.SCREEN_SHOT;
    }

    public final kotlin.Pair<java.util.Map<java.lang.String, java.lang.String>, byte[]> EZpvd(android.os.Bundle bundle) {
        java.lang.Object obj;
        if (bundle == null) {
            return C56390yDp.OLrzqt(C56424yEw.KWHzl(), null);
        }
        bundle.setClassLoader(OLrzqt());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        try {
            java.util.Set<java.lang.String> setKeySet = bundle.keySet();
            Intrinsics.copydefault(setKeySet);
            boolean z = false;
            for (java.lang.String str : setKeySet) {
                try {
                    obj = bundle.get(str);
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("ShareConfigConverter", "Failed to get bundle value for key=" + str + ", treating as complex type", e);
                }
                if (obj instanceof java.lang.String) {
                    linkedHashMap.put(str, obj);
                } else if (obj instanceof java.lang.Boolean) {
                    linkedHashMap2.put(str, java.lang.String.valueOf(((java.lang.Boolean) obj).booleanValue()));
                    linkedHashMap3.put(str, "b");
                } else if (obj instanceof java.lang.Integer) {
                    linkedHashMap2.put(str, java.lang.String.valueOf(((java.lang.Number) obj).intValue()));
                    linkedHashMap3.put(str, "i");
                } else if (obj instanceof java.lang.Long) {
                    linkedHashMap2.put(str, java.lang.String.valueOf(((java.lang.Number) obj).longValue()));
                    linkedHashMap3.put(str, "l");
                } else if (obj instanceof java.lang.Float) {
                    linkedHashMap2.put(str, java.lang.String.valueOf(((java.lang.Number) obj).floatValue()));
                    linkedHashMap3.put(str, "f");
                } else if (obj instanceof java.lang.Double) {
                    linkedHashMap2.put(str, java.lang.String.valueOf(((java.lang.Number) obj).doubleValue()));
                    linkedHashMap3.put(str, com.ibm.icu.text.DateFormat.DAY);
                } else {
                    z = true;
                }
            }
            if (z) {
                return C56390yDp.OLrzqt(linkedHashMap, OLrzqt(bundle));
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.putAll(linkedHashMap);
            linkedHashMap4.putAll(linkedHashMap2);
            if (!linkedHashMap3.isEmpty()) {
                linkedHashMap4.put("__okx_share_extras_types_v1__", new JSONObject(linkedHashMap3).toString());
            }
            return C56390yDp.OLrzqt(linkedHashMap4, null);
        } catch (java.lang.Exception e2) {
            pUU.AEQbTJ("ShareConfigConverter", "Failed to get bundle keySet, fallback to empty extras", e2);
            return C56390yDp.OLrzqt(C56424yEw.KWHzl(), null);
        }
    }

    public final byte[] OLrzqt(android.os.Bundle bundle) throws java.lang.Throwable {
        android.os.Parcel parcelObtain;
        android.os.Parcel parcel = null;
        bArrMarshall = null;
        byte[] bArrMarshall = null;
        try {
            parcelObtain = android.os.Parcel.obtain();
            try {
                parcelObtain.writeBundle(bundle);
                bArrMarshall = parcelObtain.marshall();
            } catch (java.lang.Exception unused) {
                if (parcelObtain != null) {
                }
                return bArrMarshall;
            } catch (java.lang.Throwable th) {
                th = th;
                parcel = parcelObtain;
                if (parcel != null) {
                    parcel.recycle();
                }
                throw th;
            }
        } catch (java.lang.Exception unused2) {
            parcelObtain = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public final android.os.Bundle OLrzqt(byte[] bArr) throws java.lang.Throwable {
        android.os.Parcel parcelObtain;
        android.os.Parcel parcel = null;
        bundle = null;
        android.os.Bundle bundle = null;
        try {
            parcelObtain = android.os.Parcel.obtain();
        } catch (java.lang.Exception unused) {
            parcelObtain = null;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            bundle = parcelObtain.readBundle(OLrzqt());
        } catch (java.lang.Exception unused2) {
            if (parcelObtain != null) {
            }
            return bundle;
        } catch (java.lang.Throwable th2) {
            th = th2;
            parcel = parcelObtain;
            if (parcel != null) {
                parcel.recycle();
            }
            throw th;
        }
        parcelObtain.recycle();
        return bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [599=5] */
    public final android.os.Bundle OLrzqt(java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        android.os.Bundle bundle;
        if (bArr == null || (bundle = KWHzl.OLrzqt(bArr)) == null) {
            bundle = new android.os.Bundle();
        }
        bundle.setClassLoader(OLrzqt());
        if (bArr != null) {
            for (Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                if (!Intrinsics.EZpvd((java.lang.Object) key, (java.lang.Object) "__okx_share_extras_types_v1__")) {
                    bundle.putString(key, value);
                }
            }
            return bundle;
        }
        java.util.Map<java.lang.String, java.lang.String> mapCopydefault = copydefault(map.get("__okx_share_extras_types_v1__"));
        for (Map.Entry<java.lang.String, java.lang.String> entry2 : map.entrySet()) {
            java.lang.String key2 = entry2.getKey();
            java.lang.String value2 = entry2.getValue();
            if (!Intrinsics.EZpvd((java.lang.Object) key2, (java.lang.Object) "__okx_share_extras_types_v1__")) {
                java.lang.String str = mapCopydefault.get(key2);
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 98) {
                        if (iHashCode != 100) {
                            if (iHashCode != 102) {
                                if (iHashCode != 105) {
                                    if (iHashCode == 108 && str.equals("l")) {
                                        java.lang.Long fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(value2);
                                        if (fieldNames != null) {
                                            bundle.putLong(key2, fieldNames.longValue());
                                        } else {
                                            bundle.putString(key2, value2);
                                        }
                                    }
                                } else if (str.equals("i")) {
                                    java.lang.Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value2);
                                    if (intOrNull != null) {
                                        bundle.putInt(key2, intOrNull.intValue());
                                    } else {
                                        bundle.putString(key2, value2);
                                    }
                                }
                            } else if (str.equals("f")) {
                                java.lang.Float fFIwbmz = C59443zhD.fIwbmz(value2);
                                if (fFIwbmz != null) {
                                    bundle.putFloat(key2, fFIwbmz.floatValue());
                                } else {
                                    bundle.putString(key2, value2);
                                }
                            }
                        } else if (str.equals(com.ibm.icu.text.DateFormat.DAY)) {
                            java.lang.Double dAuCTel = C59443zhD.AuCTel(value2);
                            if (dAuCTel != null) {
                                bundle.putDouble(key2, dAuCTel.doubleValue());
                            } else {
                                bundle.putString(key2, value2);
                            }
                        }
                    } else if (str.equals("b")) {
                        java.lang.Boolean boolEZpvd = KWHzl.EZpvd(value2);
                        if (boolEZpvd != null) {
                            bundle.putBoolean(key2, boolEZpvd.booleanValue());
                        } else {
                            bundle.putString(key2, value2);
                        }
                    }
                }
                bundle.putString(key2, value2);
            }
        }
        return bundle;
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return C56424yEw.KWHzl();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                java.lang.String strOptString = jSONObject.optString(next, "");
                Intrinsics.copydefault((java.lang.Object) strOptString);
                if (strOptString.length() > 0) {
                    linkedHashMap.put(next, strOptString);
                }
            }
            return linkedHashMap;
        } catch (java.lang.Exception unused) {
            return C56424yEw.KWHzl();
        }
    }

    public final java.lang.Boolean EZpvd(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "true")) {
            return java.lang.Boolean.TRUE;
        }
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) "false")) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    public static final PlatformComponentInfo OLrzqt(API api2, int i) {
        C2485ANo c2485ANo = api2.AEQbTJ().get(java.lang.String.valueOf(i));
        if (c2485ANo == null) {
            return null;
        }
        return new PlatformComponentInfo(c2485ANo.copydefault(), c2485ANo.OLrzqt());
    }

    public final SharePlatformComponents copydefault(@NotNull API api2) {
        Intrinsics.checkNotNullParameter(api2, "");
        return new SharePlatformComponents(new AndroidPlatformComponents(OLrzqt(api2, 1), OLrzqt(api2, 2), OLrzqt(api2, 3), OLrzqt(api2, 4), OLrzqt(api2, 6), OLrzqt(api2, 7), OLrzqt(api2, 8), OLrzqt(api2, 9), OLrzqt(api2, 10), OLrzqt(api2, 11), OLrzqt(api2, 12), OLrzqt(api2, 13), OLrzqt(api2, 14), OLrzqt(api2, 15), OLrzqt(api2, 16), OLrzqt(api2, 17)));
    }
}

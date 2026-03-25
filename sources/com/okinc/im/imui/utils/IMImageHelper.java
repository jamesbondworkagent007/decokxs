package com.okinc.im.imui.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.exifinterface.media.ExifInterface;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.okinc.im.imui.chatsettings.AutoDownloadOption;
import com.okinc.im.imui.glide.model.IMImageModel;
import com.okinc.im.imui.utils.IMImageHelper;
import com.okinc.im.widgets.GroupInviteType;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC5360Os;
import o.AbstractC5396Qc;
import o.AbstractC5458Sm;
import o.ActivityC37218opg;
import o.C32979mnm;
import o.C33070mpX;
import o.C33492mxV;
import o.C34059nPx;
import o.C34703nhO;
import o.C35254nrp;
import o.C35399nuc;
import o.C44105sDn;
import o.C44157sFk;
import o.C52761wXj;
import o.C5335Nt;
import o.C5417Qx;
import o.C5448Sc;
import o.C5465St;
import o.C5468Sw;
import o.C55113xdn;
import o.C55297xhL;
import o.C55298xhM;
import o.C55302xhQ;
import o.C55326xho;
import o.C56392yDr;
import o.C56444yFp;
import o.ComponentCallbacks2C5333Nr;
import o.InterfaceC5457Sl;
import o.InterfaceC5462Sq;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.NH;
import o.NN;
import o.QX;
import o.RX;
import o.RY;
import o.ViewOnClickListenerC54939xaY;
import o.nPF;
import o.nPK;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IMImageHelper {
    public static final IMImageHelper OLrzqt = new IMImageHelper();
    public static final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ozj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(IMImageHelper.valueOf());
        }
    });
    public static final HashMap<C34059nPx, WeakReference<nPK>> AEQbTJ = new HashMap<>();
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.ozr
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return IMImageHelper.AYXKKw();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ozp
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return IMImageHelper.AEQbTJ();
        }
    });
    public static final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ozn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return IMImageHelper.djBIcL();
        }
    });
    public static final Map<DefaultIconKey, Drawable> EZpvd = new LinkedHashMap();
    public static final int copydefault = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[GroupInviteType.values().length];
            try {
                iArr[GroupInviteType.GROUP_INVITE_RECEIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupInviteType.GROUP_INVITE_SEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[AutoDownloadOption.values().length];
            try {
                iArr2[AutoDownloadOption.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AutoDownloadOption.WIFI.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AutoDownloadOption.WIFI_AND_CELLULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            EZpvd = iArr2;
        }
    }

    private IMImageHelper() {
    }

    public final int values() {
        Resources resources = C32979mnm.EZpvd.OLrzqt().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        return C55302xhQ.EZpvd(resources);
    }

    public final int AkhnZx() {
        return ((Number) valueOf.getValue()).intValue();
    }

    public static final int valueOf() {
        return C33070mpX.OLrzqt(C35399nuc.TaskDescription.KWHzl);
    }

    public final C34059nPx isConnected() {
        return (C34059nPx) gEmmrt.getValue();
    }

    public static final C34059nPx AYXKKw() {
        return new C34059nPx(0.56f, C55298xhM.dp2px$default(36.0f, null, 1, null), C55298xhM.dp2px$default(36.0f, null, 1, null), C55298xhM.dp2px$default(36.0f, null, 1, null), C55298xhM.dp2px$default(36.0f, null, 1, null), 0.0f, 0, 0, 0, 0, null, 2016, null);
    }

    public final C34059nPx fetchVPNInfo() {
        return (C34059nPx) KWHzl.getValue();
    }

    public static final C34059nPx AEQbTJ() {
        return new C34059nPx(0.56f, C55298xhM.dp2px$default(180.0f, null, 1, null), C55298xhM.dp2px$default(240.0f, null, 1, null), C55298xhM.dp2px$default(260.0f, null, 1, null), C55298xhM.dp2px$default(400.0f, null, 1, null), 0.64f, C55298xhM.dp2px$default(205.0f, null, 1, null), C55298xhM.dp2px$default(275.0f, null, 1, null), C55298xhM.dp2px$default(120.0f, null, 1, null), C55298xhM.dp2px$default(180.0f, null, 1, null), null);
    }

    public final C34059nPx ejfBZ() {
        return (C34059nPx) AhwBna.getValue();
    }

    public static final C34059nPx djBIcL() {
        return new C34059nPx(0.6f, C55298xhM.dp2px$default(194.0f, null, 1, null), C55298xhM.dp2px$default(264.0f, null, 1, null), C55298xhM.dp2px$default(194.0f, null, 1, null), C55298xhM.dp2px$default(340.0f, null, 1, null), 0.0f, 0, 0, 0, 0, Float.valueOf(1.65f), 992, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DefaultIconKey {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ DefaultIconKey[] $VALUES;
        public static final DefaultIconKey GROUP_AVATAR = new DefaultIconKey("GROUP_AVATAR", 0);
        public static final DefaultIconKey GROUP_AVATAR_NIGHT = new DefaultIconKey("GROUP_AVATAR_NIGHT", 1);
        public static final DefaultIconKey GROUP_INVITE_AVATAR_RECEIVE = new DefaultIconKey("GROUP_INVITE_AVATAR_RECEIVE", 2);
        public static final DefaultIconKey GROUP_INVITE_AVATAR_RECEIVE_NIGHT = new DefaultIconKey("GROUP_INVITE_AVATAR_RECEIVE_NIGHT", 3);
        public static final DefaultIconKey GROUP_INVITE_AVATAR_SEND = new DefaultIconKey("GROUP_INVITE_AVATAR_SEND", 4);
        public static final DefaultIconKey GROUP_INVITE_AVATAR_SEND_NIGHT = new DefaultIconKey("GROUP_INVITE_AVATAR_SEND_NIGHT", 5);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ DefaultIconKey[] $values() {
            return new DefaultIconKey[]{GROUP_AVATAR, GROUP_AVATAR_NIGHT, GROUP_INVITE_AVATAR_RECEIVE, GROUP_INVITE_AVATAR_RECEIVE_NIGHT, GROUP_INVITE_AVATAR_SEND, GROUP_INVITE_AVATAR_SEND_NIGHT};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<DefaultIconKey> getEntries() {
            return $ENTRIES;
        }

        private DefaultIconKey(String str, int i) {
        }

        static {
            DefaultIconKey[] defaultIconKeyArr$values = $values();
            $VALUES = defaultIconKeyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(defaultIconKeyArr$values);
        }

        public static DefaultIconKey valueOf(String str) {
            return (DefaultIconKey) Enum.valueOf(DefaultIconKey.class, str);
        }

        public static DefaultIconKey[] values() {
            return (DefaultIconKey[]) $VALUES.clone();
        }
    }

    public final Drawable AhwBna() {
        return OLrzqt(C33492mxV.OLrzqt() ? DefaultIconKey.GROUP_AVATAR_NIGHT : DefaultIconKey.GROUP_AVATAR, C35399nuc.ActionBar.AuCTel, C52761wXj.Activity.DCUTEIddSDPG);
    }

    public final Drawable gEmmrt() {
        return OLrzqt(C33492mxV.OLrzqt() ? DefaultIconKey.GROUP_INVITE_AVATAR_RECEIVE_NIGHT : DefaultIconKey.GROUP_INVITE_AVATAR_RECEIVE, C35399nuc.ActionBar.AuCTel, C52761wXj.Activity.DCUTEIddSDPG);
    }

    public final Drawable DbNXlk() {
        return OLrzqt(C33492mxV.OLrzqt() ? DefaultIconKey.GROUP_INVITE_AVATAR_SEND_NIGHT : DefaultIconKey.GROUP_INVITE_AVATAR_SEND, C35399nuc.ActionBar.getFieldNames, C52761wXj.Activity.WS);
    }

    public static /* synthetic */ C5448Sc applySignature$default(IMImageHelper iMImageHelper, C5448Sc c5448Sc, IMImageModel iMImageModel, ImageView imageView, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            iMImageModel = null;
        }
        if ((i & 2) != 0) {
            imageView = null;
        }
        if ((i & 4) != 0) {
            uri = null;
        }
        return iMImageHelper.copydefault(c5448Sc, iMImageModel, imageView, uri);
    }

    public final C5448Sc copydefault(@NotNull C5448Sc c5448Sc, IMImageModel iMImageModel, ImageView imageView, Uri uri) {
        Intrinsics.checkNotNullParameter(c5448Sc, "");
        String strFetchVPNInfo = iMImageModel != null ? iMImageModel.fetchVPNInfo() : null;
        if (strFetchVPNInfo != null) {
            C5448Sc c5448ScAEQbTJ = c5448Sc.AEQbTJ(new C5465St(strFetchVPNInfo));
            Intrinsics.copydefault(c5448ScAEQbTJ);
            return c5448ScAEQbTJ;
        }
        if (uri == null) {
            return c5448Sc;
        }
        if (imageView != null && Intrinsics.EZpvd((Object) uri.getScheme(), (Object) "android.resource")) {
            NH nhEZpvd = C5468Sw.EZpvd(imageView.getContext());
            Intrinsics.checkNotNullExpressionValue(nhEZpvd, "");
            C5448Sc c5448ScAEQbTJ2 = c5448Sc.AEQbTJ(nhEZpvd);
            Intrinsics.copydefault(c5448ScAEQbTJ2);
            return c5448ScAEQbTJ2;
        }
        C5448Sc c5448ScAEQbTJ3 = c5448Sc.AEQbTJ(new C5465St(uri.toString()));
        Intrinsics.copydefault(c5448ScAEQbTJ3);
        return c5448ScAEQbTJ3;
    }

    public final Drawable OLrzqt(DefaultIconKey defaultIconKey, @DrawableRes int i, @ColorRes int i2) {
        Map<DefaultIconKey, Drawable> map = EZpvd;
        if (map.containsKey(defaultIconKey)) {
            return map.get(defaultIconKey);
        }
        Drawable drawableKWHzl = C33070mpX.KWHzl(i);
        LayerDrawable layerDrawable = drawableKWHzl instanceof LayerDrawable ? (LayerDrawable) drawableKWHzl : null;
        if (layerDrawable != null) {
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(C35399nuc.StateListAnimator.zpGcln);
            if (drawableFindDrawableByLayerId != null) {
                drawableFindDrawableByLayerId.setTint(C33070mpX.copydefault(i2));
            }
        } else {
            layerDrawable = null;
        }
        map.put(defaultIconKey, layerDrawable);
        return layerDrawable;
    }

    public static /* synthetic */ void loadGroupAvatar$default(IMImageHelper iMImageHelper, ImageView imageView, String str, GroupInviteType groupInviteType, int i, Object obj) {
        if ((i & 4) != 0) {
            groupInviteType = null;
        }
        iMImageHelper.copydefault(imageView, str, groupInviteType);
    }

    public final void copydefault(@NotNull ImageView imageView, String str, GroupInviteType groupInviteType) {
        Drawable drawableAhwBna;
        Intrinsics.checkNotNullParameter(imageView, "");
        int i = groupInviteType == null ? -1 : ActionBar.copydefault[groupInviteType.ordinal()];
        if (i == -1) {
            drawableAhwBna = AhwBna();
        } else if (i == 1) {
            drawableAhwBna = gEmmrt();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            drawableAhwBna = DbNXlk();
        }
        C5448Sc c5448ScAEQbTJ = new C5448Sc().gEmmrt().copydefault(AbstractC5360Os.AEQbTJ).AEQbTJ(drawableAhwBna).EZpvd(imageView.getContext().getTheme()).AEQbTJ(C5468Sw.EZpvd(imageView.getContext()));
        Intrinsics.checkNotNullExpressionValue(c5448ScAEQbTJ, "");
        C5448Sc c5448Sc = c5448ScAEQbTJ;
        if (str == null) {
            str = "";
        }
        OLrzqt(imageView, str, c5448Sc);
    }

    public final void AEQbTJ(@NotNull ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i2 = (int) (i * imageView.getContext().getResources().getDisplayMetrics().density);
        layoutParams.width = i2;
        layoutParams.height = i2;
        imageView.setLayoutParams(layoutParams);
    }

    public final void OLrzqt(ImageView imageView, String str, C5448Sc c5448Sc) {
        int i = (imageView.getLayoutParams().width <= 0 || imageView.getLayoutParams().height <= 0) ? 200 : imageView.getLayoutParams().width;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(imageView);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrKWHzl, "");
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrKWHzl, str, "lfit", i, i).OLrzqt((RX<?>) c5448Sc).EZpvd(imageView);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TaskDescription<T> implements RY<T> {
        public final /* synthetic */ String EZpvd;

        public TaskDescription(String str) {
            this.EZpvd = str;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, Object obj, InterfaceC5462Sq<T> interfaceC5462Sq, boolean z) {
            if (obj instanceof IMImageModel) {
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " FAILED. isFirstResource: " + z + ", Model: " + ((IMImageModel) obj).copydefault());
            } else {
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " FAILED. isFirstResource: " + z + ", Model: " + obj);
            }
            if (interfaceC5462Sq == null) {
                return false;
            }
            final String str = this.EZpvd;
            interfaceC5462Sq.OLrzqt(new InterfaceC5457Sl() { // from class: o.ozo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC5457Sl
                public final void OLrzqt(int i, int i2) {
                    IMImageHelper.TaskDescription.OLrzqt(str, i, i2);
                }
            });
            return false;
        }

        public static final void OLrzqt(String str, int i, int i2) {
            pUU.EZpvd("IMImageHelper", "GlideListener: " + str + " FAILED. target.width: " + i + ", target.height: " + i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.RY
        public boolean copydefault(T t, Object obj, InterfaceC5462Sq<T> interfaceC5462Sq, DataSource dataSource, boolean z) {
            if (obj instanceof IMImageModel) {
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " SUCCEEDED. DataSource: " + dataSource + ", isFirstResource: " + z + ", Model: " + ((IMImageModel) obj).copydefault());
            } else {
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " SUCCEEDED. DataSource: " + dataSource + ", isFirstResource: " + z + ", Model: " + obj);
            }
            if (t instanceof Drawable) {
                Drawable drawable = (Drawable) t;
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " SUCCEEDED. type: Drawable, resource.width: " + drawable.getIntrinsicWidth() + ", resource.height: " + drawable.getIntrinsicHeight());
            } else if (t instanceof File) {
                pUU.EZpvd("IMImageHelper", "GlideListener: " + this.EZpvd + " SUCCEEDED. type: File, resource.length: " + ((File) t).length());
            }
            if (interfaceC5462Sq == null) {
                return false;
            }
            final String str = this.EZpvd;
            interfaceC5462Sq.OLrzqt(new InterfaceC5457Sl() { // from class: o.ozw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC5457Sl
                public final void OLrzqt(int i, int i2) {
                    IMImageHelper.TaskDescription.AEQbTJ(str, i, i2);
                }
            });
            return false;
        }

        public static final void AEQbTJ(String str, int i, int i2) {
            pUU.EZpvd("IMImageHelper", "GlideListener: " + str + " SUCCEEDED. target.width: " + i + ", target.height: " + i2);
        }
    }

    public final <T> RY<T> copydefault(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C34703nhO.AhwBna(context)) {
            return new TaskDescription(str);
        }
        return null;
    }

    public static /* synthetic */ C5335Nt buildThumbnailRequest$default(IMImageHelper iMImageHelper, Context context, IMImageModel iMImageModel, NN[] nnArr, boolean z, int i, Object obj) {
        boolean z2 = (i & 8) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(nnArr, "");
        pUU.EZpvd("IMImageHelper", "buildGlideThumbnailRequest: model:" + iMImageModel.AYXKKw() + ", stableId:" + iMImageModel.fetchVPNInfo());
        C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ((NN<Bitmap>[]) Arrays.copyOf(nnArr, nnArr.length)).EZpvd(context.getTheme());
        Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
        C5448Sc c5448Sc = c5448ScEZpvd;
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C5335Nt c5335NtCopydefault = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ, Object.class).copydefault(IMImageModel.copy$default(iMImageModel, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, z2, 63, null)).OLrzqt((RX<?>) c5448Sc).copydefault(iMImageHelper.copydefault(context, "Fallback Request (sourceStrategy=OnlyThumbs, blurThumb=" + z2 + ")"));
        Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(context);
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
        Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
        C5335Nt c5335NtCopydefault2 = iMImageHelper.copydefault(componentCallbacks2C5333NrAEQbTJ2, Object.class).copydefault(iMImageModel).OLrzqt((RX<?>) c5448Sc).AEQbTJ(c5335NtCopydefault).copydefault(iMImageHelper.copydefault(context, "Primary Request"));
        Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault2, "");
        return c5335NtCopydefault2;
    }

    public final <T> C5335Nt<T> copydefault(@NotNull ComponentCallbacks2C5333Nr componentCallbacks2C5333Nr, @NotNull Class<T> cls) {
        Intrinsics.checkNotNullParameter(componentCallbacks2C5333Nr, "");
        Intrinsics.checkNotNullParameter(cls, "");
        C5335Nt<T> c5335NtKWHzl = componentCallbacks2C5333Nr.KWHzl((Class) cls);
        Intrinsics.checkNotNullExpressionValue(c5335NtKWHzl, "");
        return c5335NtKWHzl;
    }

    public static /* synthetic */ void loadCacheOnlyImageWithThumbnail$default(IMImageHelper iMImageHelper, ImageView imageView, IMImageModel iMImageModel, C34059nPx c34059nPx, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        iMImageHelper.KWHzl(imageView, iMImageModel, c34059nPx, z);
    }

    public final void KWHzl(@NotNull ImageView imageView, @NotNull IMImageModel iMImageModel, @NotNull C34059nPx c34059nPx, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        boolean z2 = iMImageModel.values() != null;
        pUU.EZpvd("IMImageHelper", "loadCacheOnlyImageWithThumbnail: hasBase64:" + z2 + ", localUri:" + iMImageModel.gEmmrt() + ", remoteUri:" + iMImageModel.valueOf() + ", applyBlur:" + z);
        if (iMImageModel.djBIcL()) {
            pUU.EZpvd("IMImageHelper", "loadCacheOnlyImageWithThumbnail: model:" + iMImageModel.AYXKKw() + ", stableId:" + iMImageModel.fetchVPNInfo());
            imageView.setMinimumWidth(c34059nPx.fetchVPNInfo());
            imageView.setMinimumHeight(c34059nPx.OLrzqt());
            HashMap<C34059nPx, WeakReference<nPK>> map = AEQbTJ;
            WeakReference<nPK> weakReference = map.get(c34059nPx);
            if (weakReference == null) {
                WeakReference<nPK> weakReference2 = new WeakReference<>(new nPK(c34059nPx));
                map.put(c34059nPx, weakReference2);
                weakReference = weakReference2;
            }
            nPK npk = weakReference.get();
            ArrayList arrayList = new ArrayList();
            if (npk != null) {
                arrayList.add(npk);
            }
            nPF npf = new nPF(imageView, c34059nPx);
            IMImageModel iMImageModelCopy$default = IMImageModel.copy$default(iMImageModel, null, null, null, null, null, null, IMImageModel.SourceStrategy.SkipRemote, z, 63, null);
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            NN[] nnArr = (NN[]) arrayList.toArray(new NN[0]);
            NN[] nnArr2 = (NN[]) Arrays.copyOf(nnArr, nnArr.length);
            pUU.EZpvd("IMImageHelper", "buildGlideThumbnailRequest: model:" + iMImageModelCopy$default.AYXKKw() + ", stableId:" + iMImageModelCopy$default.fetchVPNInfo());
            C5448Sc c5448ScEZpvd = new C5448Sc().AYXKKw().AEQbTJ((NN<Bitmap>[]) Arrays.copyOf(nnArr2, nnArr2.length)).EZpvd(context.getTheme());
            Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
            C5448Sc c5448Sc = c5448ScEZpvd;
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
            C5335Nt c5335NtCopydefault = copydefault(componentCallbacks2C5333NrAEQbTJ, Drawable.class).copydefault(IMImageModel.copy$default(iMImageModelCopy$default, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, z, 63, null)).OLrzqt((RX<?>) c5448Sc).copydefault(copydefault(context, "Fallback Request (sourceStrategy=OnlyThumbs, blurThumb=" + z + ")"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(context);
            Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
            C5335Nt c5335NtCopydefault2 = copydefault(componentCallbacks2C5333NrAEQbTJ2, Drawable.class).copydefault(iMImageModelCopy$default).OLrzqt((RX<?>) c5448Sc).AEQbTJ(c5335NtCopydefault).copydefault(copydefault(context, "Primary Request"));
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault2, "");
            c5335NtCopydefault2.OLrzqt(npf);
        }
    }

    public final void AEQbTJ(@NotNull ImageView imageView, @NotNull IMImageModel iMImageModel, @NotNull C34059nPx c34059nPx) {
        C5448Sc c5448ScEZpvd;
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        if (iMImageModel.djBIcL()) {
            imageView.setMinimumWidth(c34059nPx.fetchVPNInfo());
            imageView.setMinimumHeight(c34059nPx.OLrzqt());
            HashMap<C34059nPx, WeakReference<nPK>> map = AEQbTJ;
            WeakReference<nPK> weakReference = map.get(c34059nPx);
            if (weakReference == null) {
                weakReference = new WeakReference<>(new nPK(c34059nPx));
                map.put(c34059nPx, weakReference);
            }
            nPK npk = weakReference.get();
            if (npk != null) {
                c5448ScEZpvd = new C5448Sc().EZpvd(npk).EZpvd(imageView.getContext().getTheme());
            } else {
                c5448ScEZpvd = new C5448Sc().EZpvd(imageView.getContext().getTheme());
            }
            C5448Sc c5448Sc = c5448ScEZpvd;
            Intrinsics.copydefault(c5448Sc);
            C5448Sc c5448ScApplySignature$default = applySignature$default(this, c5448Sc, iMImageModel, imageView, null, 4, null);
            C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).KWHzl(IMImageModel.copy$default(iMImageModel, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 191, null)).OLrzqt((RX<?>) c5448Sc).copydefault(AbstractC5360Os.KWHzl);
            Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
            C5335Nt c5335Nt = c5335NtCopydefault;
            C5335Nt<Drawable> c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd(iMImageModel.valueOf()).EZpvd((C5335Nt<Drawable>) c5335Nt).OLrzqt((RX<?>) c5448ScApplySignature$default);
            Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
            nPF npf = new nPF(imageView, c34059nPx);
            if (iMImageModel.gEmmrt() != null) {
            } else if (iMImageModel.valueOf() != null) {
            }
        }
    }

    public final void copydefault(@NotNull ImageView imageView, @NotNull IMImageModel iMImageModel, @NotNull C34059nPx c34059nPx) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        boolean z = iMImageModel.values() != null;
        pUU.EZpvd("IMImageHelper", "loadRemoteImageWithThumbnail: hasBase64:" + z + ", localUri:" + iMImageModel.gEmmrt() + ", remoteUri:" + iMImageModel.valueOf());
        if (iMImageModel.values() == null && iMImageModel.gEmmrt() == null && iMImageModel.valueOf() == null) {
            return;
        }
        pUU.EZpvd("IMImageHelper", "loadRemoteImageWithThumbnail: model:" + iMImageModel.AYXKKw() + ", stableId:" + iMImageModel.fetchVPNInfo());
        imageView.setMinimumWidth(c34059nPx.fetchVPNInfo());
        imageView.setMinimumHeight(c34059nPx.OLrzqt());
        HashMap<C34059nPx, WeakReference<nPK>> map = AEQbTJ;
        WeakReference<nPK> weakReference = map.get(c34059nPx);
        if (weakReference == null) {
            WeakReference<nPK> weakReference2 = new WeakReference<>(new nPK(c34059nPx));
            map.put(c34059nPx, weakReference2);
            weakReference = weakReference2;
        }
        AbstractC5396Qc[] abstractC5396QcArr = (AbstractC5396Qc[]) yDY.valueOf(weakReference.get(), new C5417Qx(AkhnZx())).toArray(new AbstractC5396Qc[0]);
        C5448Sc c5448ScEZpvd = new C5448Sc().AEQbTJ((NN<Bitmap>[]) Arrays.copyOf(abstractC5396QcArr, abstractC5396QcArr.length)).EZpvd(imageView.getContext().getTheme());
        Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
        C5448Sc c5448Sc = c5448ScEZpvd;
        C5448Sc c5448ScApplySignature$default = applySignature$default(this, c5448Sc, iMImageModel, imageView, null, 4, null);
        C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).EZpvd().copydefault(IMImageModel.copy$default(iMImageModel, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 191, null)).OLrzqt((RX<?>) c5448Sc).copydefault(AbstractC5360Os.KWHzl);
        Intrinsics.checkNotNullExpressionValue(c5335NtCopydefault, "");
        C5335Nt c5335Nt = c5335NtCopydefault;
        C5335Nt<Bitmap> c5335NtOLrzqt = Glide.KWHzl(imageView).EZpvd().EZpvd(iMImageModel.valueOf()).EZpvd((C5335Nt<Bitmap>) c5335Nt).OLrzqt((RX<?>) c5448ScApplySignature$default);
        Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
        if (iMImageModel.gEmmrt() != null) {
            Glide.KWHzl(imageView).EZpvd().EZpvd(iMImageModel.gEmmrt()).OLrzqt((RX<?>) c5448ScApplySignature$default).AEQbTJ(c5335NtOLrzqt).EZpvd(imageView);
        } else if (iMImageModel.valueOf() != null) {
            c5335NtOLrzqt.EZpvd(imageView);
        } else {
            c5335Nt.EZpvd(imageView);
        }
    }

    public final void KWHzl(@NotNull ImageView imageView, Uri uri, @DrawableRes Integer num, RY<QX> ry, AbstractC5458Sm<QX> abstractC5458Sm) {
        Intrinsics.checkNotNullParameter(imageView, "");
        C5448Sc c5448ScEZpvd = new C5448Sc().EZpvd(imageView.getContext().getTheme());
        if (num != null) {
            c5448ScEZpvd = c5448ScEZpvd.KWHzl(num.intValue());
        }
        C5448Sc c5448Sc = c5448ScEZpvd;
        Intrinsics.checkNotNullExpressionValue(c5448Sc, "");
        C5448Sc c5448ScApplySignature$default = applySignature$default(this, c5448Sc, null, imageView, uri, 1, null);
        pUU.EZpvd("IMImageHelper", "loadGifImage: gif uri: " + uri);
        C5335Nt c5335NtOLrzqt = Glide.KWHzl(imageView).copydefault().EZpvd(uri).copydefault(AbstractC5360Os.EZpvd).OLrzqt((RX<?>) c5448ScApplySignature$default).OLrzqt((RY) ry);
        if (abstractC5458Sm != null) {
        } else {
            c5335NtOLrzqt.EZpvd(imageView);
        }
    }

    public final Object AEQbTJ(@NotNull View view, @NotNull Continuation<? super String> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new IMImageHelper$prepareShareImage$2(view, null), continuation);
    }

    public final Object copydefault(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super Uri> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new IMImageHelper$copyCacheImageToGallery$2(str, context, null), continuation);
    }

    public final boolean EZpvd(@NotNull Context context) {
        AutoDownloadOption autoDownloadOptionValueOf;
        Intrinsics.checkNotNullParameter(context, "");
        String strKWHzl = C44157sFk.KWHzl();
        String string = context.getSharedPreferences("auto_download_prefs", 0).getString("auto_download_" + strKWHzl, "WIFI_AND_CELLULAR");
        try {
            autoDownloadOptionValueOf = AutoDownloadOption.valueOf(string != null ? string : "WIFI_AND_CELLULAR");
        } catch (IllegalArgumentException unused) {
            autoDownloadOptionValueOf = AutoDownloadOption.WIFI_AND_CELLULAR;
        }
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()) : null;
        boolean z = networkCapabilities != null && networkCapabilities.hasTransport(1);
        boolean z2 = networkCapabilities != null && networkCapabilities.hasTransport(0);
        int i = ActionBar.EZpvd[autoDownloadOptionValueOf.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return z;
        }
        if (i == 3) {
            return z || z2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void KWHzl(@NotNull View view, @NotNull C35254nrp c35254nrp) {
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(c35254nrp, "");
        ActivityC37218opg.Application application = ActivityC37218opg.Companion;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        view.getContext().startActivity(application.EZpvd(context, c35254nrp.OLrzqt()), application.OLrzqt(view, c35254nrp.OLrzqt()));
    }

    public final void EZpvd(@NotNull Context context, @NotNull IMImageModel iMImageModel, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Uri uriGEmmrt = iMImageModel.gEmmrt();
        if (uriGEmmrt != null) {
            try {
                String path = uriGEmmrt.getPath();
                if (path != null && path.length() != 0) {
                    File file = new File(path);
                    if (file.exists() && file.canRead() && file.length() > 0) {
                        function1.invoke(Boolean.TRUE);
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
        Uri uriValueOf = iMImageModel.valueOf();
        if (uriValueOf != null) {
            C5335Nt<Bitmap> c5335Nt = iMImageModel.values() != null ? (C5335Nt) Glide.AEQbTJ(context).EZpvd().copydefault(iMImageModel.values()).copydefault(AbstractC5360Os.AEQbTJ) : null;
            C5335Nt<Bitmap> c5335NtEZpvd = Glide.AEQbTJ(context).EZpvd().EZpvd(uriValueOf);
            if (c5335Nt != null) {
                c5335NtEZpvd.EZpvd(c5335Nt);
            }
            c5335NtEZpvd.copydefault(AbstractC5360Os.AEQbTJ);
            c5335NtEZpvd.AEQbTJ(true);
            String strFetchVPNInfo = iMImageModel.fetchVPNInfo();
            if (strFetchVPNInfo != null) {
                c5335NtEZpvd.AEQbTJ(new C5465St(strFetchVPNInfo));
            }
            Intrinsics.copydefault(c5335NtEZpvd.OLrzqt((RY<Bitmap>) new Activity(function1)).EZpvd());
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    public static final class Activity implements RY<Bitmap> {
        public final /* synthetic */ Function1<Boolean, Unit> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(Function1<? super Boolean, Unit> function1) {
            this.EZpvd = function1;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, Object obj, InterfaceC5462Sq<Bitmap> interfaceC5462Sq, boolean z) {
            this.EZpvd.invoke(Boolean.FALSE);
            return true;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public boolean copydefault(Bitmap bitmap, Object obj, InterfaceC5462Sq<Bitmap> interfaceC5462Sq, DataSource dataSource, boolean z) {
            this.EZpvd.invoke(Boolean.valueOf(bitmap != null));
            return true;
        }
    }

    public final void copydefault(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35399nuc.LoaderManager.bindToGooglePlayService));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35399nuc.LoaderManager.DcMfJKsgNvtZ));
        viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C44105sDn.PendingIntent.EZpvd), new View.OnClickListener() { // from class: o.ozq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                IMImageHelper.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCancelable(true);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(View view, String str, C55113xdn c55113xdn, View view2, View view3) {
        Object tag = view.getTag();
        if (Intrinsics.EZpvd((Object) (tag instanceof String ? (String) tag : null), (Object) str)) {
            c55113xdn.copydefault();
            view2.setVisibility(8);
            view3.setVisibility(0);
            C55326xho.toast$default(C33070mpX.AYXKKw(C35399nuc.LoaderManager.AuCTelauCTel), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
    }

    public final void AEQbTJ(@NotNull ImageView imageView, @NotNull IMImageModel iMImageModel, @NotNull C34059nPx c34059nPx, @NotNull Function0<Unit> function0, @NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(imageView, "");
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(c34059nPx, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        boolean z = iMImageModel.values() != null;
        pUU.EZpvd("IMImageHelper", "loadRemoteImageWithThumbnail: hasBase64:" + z + ", localUri:" + iMImageModel.gEmmrt() + ", remoteUri:" + iMImageModel.valueOf());
        if (iMImageModel.values() == null && iMImageModel.gEmmrt() == null && iMImageModel.valueOf() == null) {
            return;
        }
        pUU.EZpvd("IMImageHelper", "loadRemoteImageWithThumbnail: model:" + iMImageModel.AYXKKw() + ", stableId:" + iMImageModel.fetchVPNInfo());
        imageView.setMinimumWidth(c34059nPx.fetchVPNInfo());
        imageView.setMinimumHeight(c34059nPx.OLrzqt());
        HashMap<C34059nPx, WeakReference<nPK>> map = AEQbTJ;
        WeakReference<nPK> weakReference = map.get(c34059nPx);
        if (weakReference == null) {
            WeakReference<nPK> weakReference2 = new WeakReference<>(new nPK(c34059nPx));
            map.put(c34059nPx, weakReference2);
            weakReference = weakReference2;
        }
        nPK[] npkArr = (nPK[]) yDY.OLrzqt(weakReference.get()).toArray(new nPK[0]);
        C5448Sc c5448ScEZpvd = new C5448Sc().AEQbTJ((NN<Bitmap>[]) Arrays.copyOf(npkArr, npkArr.length)).EZpvd(imageView.getContext().getTheme());
        Intrinsics.checkNotNullExpressionValue(c5448ScEZpvd, "");
        C5448Sc c5448Sc = c5448ScEZpvd;
        C5448Sc c5448ScApplySignature$default = applySignature$default(this, c5448Sc, iMImageModel, imageView, null, 4, null);
        C5335Nt c5335NtCopydefault = Glide.KWHzl(imageView).KWHzl(IMImageModel.copy$default(iMImageModel, null, null, null, null, null, null, IMImageModel.SourceStrategy.OnlyThumbs, false, 191, null)).OLrzqt((RX<?>) c5448Sc).copydefault(AbstractC5360Os.KWHzl);
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C5335Nt<Drawable> c5335NtOLrzqt = c5335NtCopydefault.OLrzqt(copydefault(context, "Thumbnail Request"));
        Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt, "");
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C5335Nt<Drawable> c5335NtOLrzqt2 = Glide.KWHzl(imageView).EZpvd(iMImageModel.valueOf()).EZpvd(c5335NtOLrzqt).OLrzqt((RX<?>) c5448ScApplySignature$default).OLrzqt((RY<Drawable>) new StateListAnimator(booleanRef, objectRef));
        Intrinsics.checkNotNullExpressionValue(c5335NtOLrzqt2, "");
        nPF npf = new nPF(imageView, c34059nPx);
        C5335Nt<Drawable> c5335NtAEQbTJ = Glide.KWHzl(imageView).EZpvd(iMImageModel.gEmmrt()).OLrzqt((RX<?>) c5448ScApplySignature$default).AEQbTJ(c5335NtOLrzqt2);
        Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c5335NtAEQbTJ.copydefault(copydefault(context2, "Local Image Request")).OLrzqt((RY<Drawable>) new Application(booleanRef, objectRef, function1, function0)).OLrzqt(npf);
    }

    public static final class StateListAnimator implements RY<Drawable> {
        public final /* synthetic */ Ref.BooleanRef OLrzqt;
        public final /* synthetic */ Ref.ObjectRef<GlideException> copydefault;

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        public boolean copydefault(Drawable drawable, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, DataSource dataSource, boolean z) {
            return false;
        }

        public StateListAnimator(Ref.BooleanRef booleanRef, Ref.ObjectRef<GlideException> objectRef) {
            this.OLrzqt = booleanRef;
            this.copydefault = objectRef;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bumptech.glide.load.engine.GlideException */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, boolean z) {
            this.OLrzqt.element = true;
            this.copydefault.element = glideException;
            pUU.AEQbTJ("IMImageHelper", "Remote request failed", glideException);
            return false;
        }
    }

    public static final class Application implements RY<Drawable> {
        public final /* synthetic */ Function1<Boolean, Unit> AEQbTJ;
        public final /* synthetic */ Ref.ObjectRef<GlideException> EZpvd;
        public final /* synthetic */ Ref.BooleanRef KWHzl;
        public final /* synthetic */ Function0<Unit> copydefault;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Ref.BooleanRef booleanRef, Ref.ObjectRef<GlideException> objectRef, Function1<? super Boolean, Unit> function1, Function0<Unit> function0) {
            this.KWHzl = booleanRef;
            this.EZpvd = objectRef;
            this.AEQbTJ = function1;
            this.copydefault = function0;
        }

        @Override // o.RY
        public boolean OLrzqt(GlideException glideException, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, boolean z) {
            boolean zOLrzqt;
            if (this.KWHzl.element) {
                zOLrzqt = IMImageHelper.OLrzqt.OLrzqt(this.EZpvd.element);
            } else {
                zOLrzqt = IMImageHelper.OLrzqt.OLrzqt(glideException);
            }
            this.AEQbTJ.invoke(Boolean.valueOf(zOLrzqt));
            return false;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;Lo/Sq;Lcom/bumptech/glide/load/DataSource;Z)Z */
        @Override // o.RY
        public boolean copydefault(Drawable drawable, Object obj, InterfaceC5462Sq<Drawable> interfaceC5462Sq, DataSource dataSource, boolean z) {
            this.copydefault.invoke();
            return false;
        }
    }

    public final boolean OLrzqt(GlideException glideException) {
        String message;
        String message2;
        String message3;
        String message4;
        String message5;
        String message6;
        if (glideException != null) {
            List<Throwable> rootCauses = glideException.getRootCauses();
            if (rootCauses != null) {
                for (Throwable th : rootCauses) {
                    String message7 = th.getMessage();
                    if ((message7 != null && StringsKt__StringsKt.contains$default((CharSequence) message7, (CharSequence) "403", false, 2, (Object) null)) || (((message4 = th.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message4, (CharSequence) "404", false, 2, (Object) null)) || (((message5 = th.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message5, (CharSequence) "Forbidden", false, 2, (Object) null)) || ((message6 = th.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message6, (CharSequence) "expired", false, 2, (Object) null))))) {
                        return true;
                    }
                }
            }
            String message8 = glideException.getMessage();
            if ((message8 != null && StringsKt__StringsKt.contains$default((CharSequence) message8, (CharSequence) "403", false, 2, (Object) null)) || (((message = glideException.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "404", false, 2, (Object) null)) || (((message2 = glideException.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message2, (CharSequence) "Forbidden", false, 2, (Object) null)) || ((message3 = glideException.getMessage()) != null && StringsKt__StringsKt.contains$default((CharSequence) message3, (CharSequence) "expired", false, 2, (Object) null))))) {
                return true;
            }
        }
        return false;
    }

    public final Runnable copydefault(@NotNull final C55113xdn c55113xdn, @NotNull final View view, @NotNull final View view2, @NotNull final View view3, @NotNull final String str, long j) {
        Intrinsics.checkNotNullParameter(c55113xdn, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(view2, "");
        Intrinsics.checkNotNullParameter(view3, "");
        Intrinsics.checkNotNullParameter(str, "");
        view2.setVisibility(8);
        view.setVisibility(0);
        c55113xdn.setVisibility(0);
        c55113xdn.KWHzl(0L);
        Runnable runnable = new Runnable() { // from class: o.ozk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                IMImageHelper.EZpvd(view3, str, c55113xdn, view, view2);
            }
        };
        view3.postDelayed(runnable, j);
        return runnable;
    }
}

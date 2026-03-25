package com.okinc.common.glide;

import android.content.Context;
import android.graphics.drawable.PictureDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.GlideException;
import com.caverock.androidsvg.SVG;
import com.okinc.common.glide.BaseConfigModule;
import com.okinc.network.okg.unifieddomain.DomainType;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C32547mfe;
import o.C32581mgL;
import o.C32582mgM;
import o.C33129mqd;
import o.C43385roL;
import o.C5328Nm;
import o.C5370Pc;
import o.C5378Pk;
import o.C5448Sc;
import o.C55061xco;
import o.C55063xcq;
import o.C56392yDr;
import o.InterfaceC32484meU;
import o.InterfaceC5462Sq;
import o.InterfaceC56387yDm;
import o.OR;
import o.OV;
import o.OY;
import o.RN;
import o.RY;
import o.pUV;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class BaseConfigModule extends RN {
    public static final int $stable = 8;
    private final InterfaceC56387yDm verify$delegate = C56392yDr.copydefault(new Function0() { // from class: o.meY
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BaseConfigModule.verify_delegate$lambda$0();
        }
    });
    private final InterfaceC56387yDm imageSizeChecker$delegate = C56392yDr.copydefault(new Function0() { // from class: o.mfb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return BaseConfigModule.imageSizeChecker_delegate$lambda$1();
        }
    });

    @Override // o.RN
    public boolean isManifestParsingEnabled() {
        return false;
    }

    public static final pUV verify_delegate$lambda$0() {
        return new pUV("OKImageLoad", false, false, false, 14, null);
    }

    public final pUV getVerify() {
        return (pUV) this.verify$delegate.getValue();
    }

    public final C32581mgL getImageSizeChecker() {
        return (C32581mgL) this.imageSizeChecker$delegate.getValue();
    }

    public static final C32581mgL imageSizeChecker_delegate$lambda$1() {
        if (C32582mgM.EZpvd.copydefault()) {
            return new C32581mgL();
        }
        return null;
    }

    @Override // o.RN
    public void applyOptions(@NotNull Context context, @NotNull C5328Nm c5328Nm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c5328Nm, "");
        C5448Sc c5448ScAEQbTJ = new C5448Sc().AEQbTJ(DecodeFormat.PREFER_ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(c5448ScAEQbTJ, "");
        c5328Nm.EZpvd(c5448ScAEQbTJ);
        OV ov = new OV(context);
        OY.StateListAnimator stateListAnimator = new OY.StateListAnimator(context);
        c5328Nm.copydefault(new OR(C33129mqd.valueOf(Float.valueOf(stateListAnimator.KWHzl().AEQbTJ() * 0.5f))));
        c5328Nm.KWHzl(new C5370Pc(C33129mqd.valueOf(Integer.valueOf(stateListAnimator.KWHzl().copydefault()))));
        c5328Nm.OLrzqt(ov);
        c5328Nm.OLrzqt(new TaskDescription());
        C32581mgL imageSizeChecker = getImageSizeChecker();
        if (imageSizeChecker != null) {
            imageSizeChecker.AEQbTJ(context, c5328Nm);
        }
    }

    public static final class TaskDescription implements RY<Object> {
        public TaskDescription() {
        }

        @Override // o.RY
        public boolean OLrzqt(final GlideException glideException, final Object obj, InterfaceC5462Sq<Object> interfaceC5462Sq, boolean z) {
            final BaseConfigModule baseConfigModule = BaseConfigModule.this;
            baseConfigModule.runBlock(obj, new Function0() { // from class: o.mfa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BaseConfigModule.TaskDescription.EZpvd(baseConfigModule, obj, glideException);
                }
            });
            return false;
        }

        public static final Unit EZpvd(BaseConfigModule baseConfigModule, Object obj, GlideException glideException) {
            baseConfigModule.getVerify().AEQbTJ("Load image failed, model: " + (obj != null ? baseConfigModule.getReplacedCdnUrl(obj) : null) + ", exception: " + (glideException != null ? glideException.getMessage() : null));
            return Unit.INSTANCE;
        }

        @Override // o.RY
        public boolean copydefault(final Object obj, final Object obj2, InterfaceC5462Sq<Object> interfaceC5462Sq, final DataSource dataSource, boolean z) {
            if (dataSource != DataSource.REMOTE) {
                return false;
            }
            final BaseConfigModule baseConfigModule = BaseConfigModule.this;
            baseConfigModule.runBlock(obj2, new Function0() { // from class: o.mfd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return BaseConfigModule.TaskDescription.AEQbTJ(baseConfigModule, obj2, obj, dataSource);
                }
            });
            return false;
        }

        public static final Unit AEQbTJ(BaseConfigModule baseConfigModule, Object obj, Object obj2, DataSource dataSource) {
            baseConfigModule.getVerify().copydefault("Load image success, model: " + (obj != null ? baseConfigModule.getReplacedCdnUrl(obj) : null) + ", resource: " + obj2 + ", data source: " + dataSource);
            return Unit.INSTANCE;
        }
    }

    public final String getReplacedCdnUrl(Object obj) {
        if (obj instanceof String) {
            try {
                return C43385roL.Companion.EZpvd().copydefault(DomainType.CDN, HttpUrl.Companion.get((String) obj)).toString();
            } catch (Exception unused) {
                return ((String) obj).toString();
            }
        }
        return obj.toString();
    }

    public final void runBlock(Object obj, Function0<Unit> function0) {
        if (obj instanceof CharSequence) {
            function0.invoke();
        }
    }

    @Override // o.RJ
    public void registerComponents(@NotNull Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(glide, "");
        Intrinsics.checkNotNullParameter(registry, "");
        registry.EZpvd(C5378Pk.class, InputStream.class, new C32547mfe.TaskDescription()).AEQbTJ(SVG.class, PictureDrawable.class, new C55061xco()).AEQbTJ(InputStream.class, SVG.class, new C55063xcq());
        InterfaceC32484meU.Companion.KWHzl().EZpvd(context, glide, registry);
        C32581mgL imageSizeChecker = getImageSizeChecker();
        if (imageSizeChecker != null) {
            imageSizeChecker.copydefault(context, glide, registry);
        }
    }
}

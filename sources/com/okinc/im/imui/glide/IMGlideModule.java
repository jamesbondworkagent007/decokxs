package com.okinc.im.imui.glide;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.okinc.im.imui.glide.model.IMImageModel;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C34055nPt;
import o.RJ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IMGlideModule extends RJ {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);
    public static final String TAG = "IMGlide";

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.glide.IMGlideModule.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.RJ
    public void registerComponents(@NotNull Context context, @NotNull Glide glide, @NotNull Registry registry) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(glide, "");
        Intrinsics.checkNotNullParameter(registry, "");
        pUU.KWHzl(TAG, "registerComponents-->");
        super.registerComponents(context, glide, registry);
        registry.OLrzqt(IMImageModel.class, InputStream.class, new C34055nPt());
    }
}

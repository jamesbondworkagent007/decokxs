package com.okinc.liveness.lca.ai;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaOknn {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    public final native FaceInfo[] detectFromBitmap(boolean z, @NotNull Bitmap bitmap, float f, float f2, float f3, float f4, float f5, float f6);

    public final native boolean loadModel(@NotNull AssetManager assetManager);

    public final native boolean loadQCModel(@NotNull AssetManager assetManager);

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ai.LcaOknn.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        try {
            System.loadLibrary("oknn");
            pUU.KWHzl("kyc_in_house", "Success load oknn .so");
        } catch (Throwable th) {
            pUU.OLrzqt("kyc_in_house", "Failed to load native oknn .so", th);
        }
        try {
            System.loadLibrary("lca_ai");
            pUU.KWHzl("kyc_in_house", "Success load lca_ai .so");
        } catch (Throwable th2) {
            pUU.OLrzqt("kyc_in_house", "Failed to load native lca_ai .so", th2);
        }
    }
}

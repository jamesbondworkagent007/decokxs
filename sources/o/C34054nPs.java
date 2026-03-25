package o;

import com.okinc.im.imui.glide.model.IMImageModel;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC5386Ps;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nPs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34054nPs implements InterfaceC5386Ps<IMImageModel, java.io.InputStream> {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InterfaceC5386Ps<android.net.Uri, java.io.InputStream> KWHzl;
    public final InterfaceC5386Ps<java.lang.String, java.io.InputStream> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@NotNull IMImageModel iMImageModel) {
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        return true;
    }

    public C34054nPs(@NotNull InterfaceC5386Ps<android.net.Uri, java.io.InputStream> interfaceC5386Ps, @NotNull InterfaceC5386Ps<java.lang.String, java.io.InputStream> interfaceC5386Ps2) {
        Intrinsics.checkNotNullParameter(interfaceC5386Ps, "");
        Intrinsics.checkNotNullParameter(interfaceC5386Ps2, "");
        this.KWHzl = interfaceC5386Ps;
        this.OLrzqt = interfaceC5386Ps2;
    }

    /* JADX INFO: renamed from: o.nPs$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nPs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final boolean OLrzqt(android.net.Uri uri) {
        java.lang.Object objM7377constructorimpl;
        boolean z;
        try {
            Result.Application application = Result.Companion;
            java.io.InputStream inputStreamOpenInputStream = C32979mnm.EZpvd.OLrzqt().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                yFA.copydefault(inputStreamOpenInputStream, null);
                z = true;
            } else {
                z = false;
            }
            pUU.EZpvd("IMImageModelLoader", "uriExists(" + uri + "): " + z);
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(z));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("IMImageModelLoader", "uriExists(" + uri + "): false with exception", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = java.lang.Boolean.FALSE;
        }
        return ((java.lang.Boolean) objM7377constructorimpl).booleanValue();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@NotNull IMImageModel iMImageModel, int i, int i2, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(iMImageModel, "");
        Intrinsics.checkNotNullParameter(nm, "");
        pUU.EZpvd("IMImageModelLoader", "buildLoadData called with sourceStrategy: " + iMImageModel.AkhnZx() + ", blurThumb: " + iMImageModel.AhwBna() + ", model: " + iMImageModel.copydefault());
        return AEQbTJ(KWHzl(iMImageModel, i, i2, nm), iMImageModel);
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> KWHzl(IMImageModel iMImageModel, int i, int i2, NM nm) {
        IMImageModel.SourceStrategy sourceStrategyAkhnZx = iMImageModel.AkhnZx();
        IMImageModel.SourceStrategy sourceStrategy = IMImageModel.SourceStrategy.OnlyThumbs;
        if (sourceStrategyAkhnZx != sourceStrategy && iMImageModel.gEmmrt() != null && OLrzqt(iMImageModel.gEmmrt())) {
            return OLrzqt(iMImageModel.gEmmrt(), i, i2, nm);
        }
        if (iMImageModel.AkhnZx() != sourceStrategy && iMImageModel.AkhnZx() != IMImageModel.SourceStrategy.SkipRemote && iMImageModel.valueOf() != null) {
            return AEQbTJ(iMImageModel.valueOf(), i, i2, nm);
        }
        if (iMImageModel.isConnected() != null && !Intrinsics.EZpvd(iMImageModel.isConnected(), iMImageModel.gEmmrt()) && OLrzqt(iMImageModel.isConnected())) {
            return EZpvd(iMImageModel.isConnected(), i, i2, nm);
        }
        if (iMImageModel.AhwBna()) {
            return OLrzqt(iMImageModel, i, i2, nm);
        }
        java.lang.String strValues = iMImageModel.values();
        if (strValues != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues)) {
            return AEQbTJ2(iMImageModel, i, i2, nm);
        }
        pUU.EZpvd("IMImageModelLoader", "No suitable image source found");
        return null;
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(InterfaceC5386Ps.Application<java.io.InputStream> application, IMImageModel iMImageModel) {
        if (application == null) {
            return null;
        }
        java.lang.String strFetchVPNInfo = iMImageModel.fetchVPNInfo();
        if (strFetchVPNInfo != null) {
            pUU.EZpvd("IMImageModelLoader", "Using stableId as cache key: " + strFetchVPNInfo);
            return new InterfaceC5386Ps.Application<>(new C5465St(strFetchVPNInfo), C56402yEa.EZpvd(new C5465St(strFetchVPNInfo)), application.EZpvd);
        }
        pUU.EZpvd("IMImageModelLoader", "No stableId available, using original cache key");
        return application;
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> OLrzqt(android.net.Uri uri, int i, int i2, NM nm) {
        pUU.EZpvd("IMImageModelLoader", "Using localUri: " + uri);
        return this.KWHzl.AEQbTJ(uri, i, i2, nm);
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(android.net.Uri uri, int i, int i2, NM nm) {
        pUU.EZpvd("IMImageModelLoader", "Using remoteUri: " + uri);
        return this.KWHzl.AEQbTJ(uri, i, i2, nm);
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> EZpvd(android.net.Uri uri, int i, int i2, NM nm) {
        pUU.EZpvd("IMImageModelLoader", "Using thumbUri: " + uri);
        return this.KWHzl.AEQbTJ(uri, i, i2, nm);
    }

    public final InterfaceC5386Ps.Application<java.io.InputStream> OLrzqt(IMImageModel iMImageModel, int i, int i2, NM nm) throws java.security.NoSuchAlgorithmException {
        android.net.Uri uriDbNXlk = iMImageModel.DbNXlk();
        if (uriDbNXlk != null && OLrzqt(uriDbNXlk)) {
            pUU.EZpvd("IMImageModelLoader", "Using cached blur Uri: " + uriDbNXlk);
            return this.KWHzl.AEQbTJ(uriDbNXlk, i, i2, nm);
        }
        java.lang.String strValues = iMImageModel.values();
        if (strValues != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strValues)) {
            pUU.EZpvd("IMImageModelLoader", "Using thumbnail base64 data as fallback for blur");
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("data:image/jpeg;base64,%s", java.util.Arrays.copyOf(new java.lang.Object[]{iMImageModel.values()}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            return this.OLrzqt.AEQbTJ(str, i, i2, nm);
        }
        pUU.EZpvd("IMImageModelLoader", "No blur cache found and no thumbnail available");
        return null;
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ2(IMImageModel iMImageModel, int i, int i2, NM nm) {
        pUU.EZpvd("IMImageModelLoader", "Using thumbnail base64 data");
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str = java.lang.String.format("data:image/jpeg;base64,%s", java.util.Arrays.copyOf(new java.lang.Object[]{iMImageModel.values()}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return this.OLrzqt.AEQbTJ(str, i, i2, nm);
    }
}

package o;

import com.okinc.annual.download.AnnualDownloadInfo;
import io.reactivex.BackpressureStrategy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.axi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C8172axi {
    public static LuaFunction AhwBna;
    public static C33143mqr KWHzl;
    public static AnnualDownloadInfo OLrzqt;
    public static boolean copydefault;
    public static LuaFunction valueOf;
    public static final C8172axi EZpvd = new C8172axi();
    public static final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.axA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C8172axi.OLrzqt();
        }
    });
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final void AYXKKw() {
        copydefault = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(AnnualDownloadInfo annualDownloadInfo, LuaFunction luaFunction, LuaFunction luaFunction2) {
        OLrzqt = annualDownloadInfo;
        valueOf = luaFunction;
        AhwBna = luaFunction2;
    }

    private C8172axi() {
    }

    public static final android.os.Handler OLrzqt() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final android.os.Handler gEmmrt() {
        return (android.os.Handler) gEmmrt.getValue();
    }

    public final void KWHzl(java.lang.String str, java.util.Map<java.lang.String, ? extends java.lang.Object> map, LuaFunction luaFunction, LuaFunction luaFunction2) {
        pUU.KWHzl("AnnualDownLoadHelper", "parseParamAndDownLoad");
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(map != null ? map.get("fileUrl") : null);
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(map != null ? map.get("fileName") : null);
        java.lang.String strGEmmrt3 = C33129mqd.gEmmrt(map != null ? map.get("remoteFileMD5") : null);
        java.lang.String strGEmmrt4 = C33129mqd.gEmmrt(map != null ? map.get("audioName") : null);
        java.lang.String strGEmmrt5 = C33129mqd.gEmmrt(map != null ? map.get("remoteAudioMD5") : null);
        java.lang.String strGEmmrt6 = C33129mqd.gEmmrt(map != null ? map.get("lottieFolderName") : null);
        java.lang.String strGEmmrt7 = C33129mqd.gEmmrt(map != null ? map.get("lottieMD5s") : null);
        C8175axl c8175axl = C8175axl.AEQbTJ;
        OLrzqt(new AnnualDownloadInfo(str2, strGEmmrt, strGEmmrt2, strGEmmrt3, strGEmmrt4, strGEmmrt5, strGEmmrt6, c8175axl.OLrzqt(strGEmmrt7), C33129mqd.AhwBna(map != null ? map.get("version") : null), C33129mqd.gEmmrt(map != null ? map.get("imageFolderName") : null), c8175axl.EZpvd(C33129mqd.gEmmrt(map != null ? map.get("imageMD5s") : null))), luaFunction, luaFunction2);
    }

    public final void OLrzqt(final AnnualDownloadInfo annualDownloadInfo, LuaFunction luaFunction, final LuaFunction luaFunction2) {
        if (!EZpvd(annualDownloadInfo)) {
            if (luaFunction2 != null) {
                luaFunction2.invoke(EZpvd("check param is invalid"));
            }
        } else {
            if (copydefault) {
                KWHzl(luaFunction, luaFunction2);
                return;
            }
            AEQbTJ(annualDownloadInfo, luaFunction, luaFunction2);
            if (C8175axl.AEQbTJ.KWHzl(annualDownloadInfo.getVersion())) {
                pUU.KWHzl("AnnualDownLoadHelper", "version upgrade");
                copydefault(annualDownloadInfo);
            } else {
                EZpvd(annualDownloadInfo, new Function1() { // from class: o.axB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C8172axi.copydefault(luaFunction2, annualDownloadInfo, ((java.lang.Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    public static final Unit copydefault(LuaFunction luaFunction, AnnualDownloadInfo annualDownloadInfo, boolean z) {
        pUU.KWHzl("AnnualDownLoadHelper", "checkFileIsExist result=" + z);
        if (!z) {
            EZpvd.copydefault(annualDownloadInfo);
        } else if (luaFunction != null) {
            luaFunction.invoke(EZpvd.AhwBna());
        }
        return Unit.INSTANCE;
    }

    public final boolean EZpvd(AnnualDownloadInfo annualDownloadInfo) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) annualDownloadInfo.getZipFileUrl()) && C33129mqd.OLrzqt((java.lang.CharSequence) annualDownloadInfo.getZipFileName());
    }

    public final void KWHzl(LuaFunction luaFunction, LuaFunction luaFunction2) {
        pUU.KWHzl("AnnualDownLoadHelper", "dealDownLoadingLogic just update callback");
        valueOf = luaFunction;
        AhwBna = luaFunction2;
    }

    public final void EZpvd(final AnnualDownloadInfo annualDownloadInfo, final Function1<? super java.lang.Boolean, Unit> function1) {
        pUU.KWHzl("AnnualDownLoadHelper", "checkFileIsExist");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.axx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C8172axi.OLrzqt(annualDownloadInfo, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function12 = new Function1() { // from class: o.axG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8172axi.copydefault(function1, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.axr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8172axi.copydefault(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.axn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8172axi.AEQbTJ(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.axq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8172axi.djBIcL(function13, obj);
            }
        });
    }

    public static final void OLrzqt(AnnualDownloadInfo annualDownloadInfo, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C8175axl c8175axl = C8175axl.AEQbTJ;
        boolean zOLrzqt = c8175axl.OLrzqt(annualDownloadInfo.getSaveDirectoryName(), annualDownloadInfo.getAudioName(), annualDownloadInfo.getAudioMD5());
        boolean zAEQbTJ = c8175axl.AEQbTJ(annualDownloadInfo.getSaveDirectoryName(), annualDownloadInfo.getLottieFoldName(), annualDownloadInfo.getLottieMD5List());
        boolean zEZpvd = c8175axl.EZpvd(annualDownloadInfo.getSaveDirectoryName(), annualDownloadInfo.getImageFoldName(), annualDownloadInfo.getImageMD5List());
        pUU.KWHzl("AnnualDownLoadHelper", "checkFileIsExit:mp3Check=" + zOLrzqt + ",lottieCheck=" + zAEQbTJ + ",imageCheck=" + zEZpvd);
        interfaceC58184ywW.onNext(java.lang.Boolean.valueOf(zOLrzqt && zAEQbTJ && zEZpvd));
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Function1 function1, java.lang.Boolean bool) {
        Intrinsics.copydefault(bool);
        function1.invoke(bool);
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(Function1 function1, java.lang.Throwable th) {
        pUU.copydefault("AnnualDownLoadHelper", "checkFileIsExit error=" + th.getMessage());
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public final void copydefault(final AnnualDownloadInfo annualDownloadInfo) {
        if (copydefault) {
            return;
        }
        copydefault = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = C8175axl.AEQbTJ.copydefault(annualDownloadInfo.getZipFileName());
        pUU.KWHzl("AnnualDownLoadHelper", "startDownLoad," + java.lang.System.currentTimeMillis());
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.axp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                C8172axi.AEQbTJ(annualDownloadInfo, objectRef, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER).copydefault(yBP.AEQbTJ()).KWHzl(yBP.AEQbTJ());
        final Function1 function1 = new Function1() { // from class: o.axo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8172axi.EZpvd(objectRef, annualDownloadInfo, (java.lang.Boolean) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.axs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8172axi.AYXKKw(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.axw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C8172axi.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.axz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C8172axi.valueOf(function12, obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AEQbTJ(AnnualDownloadInfo annualDownloadInfo, Ref.ObjectRef objectRef, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        C8175axl.AEQbTJ.OLrzqt();
        C33143mqr c33143mqr = new C33143mqr(C43246rlf.OLrzqt.valueOf(), annualDownloadInfo.getZipFileUrl(), (java.lang.String) objectRef.element, new TaskDescription(new Ref.BooleanRef(), objectRef, interfaceC58184ywW));
        KWHzl = c33143mqr;
        c33143mqr.EZpvd();
    }

    /* JADX INFO: renamed from: o.axi$TaskDescription */
    public static final class TaskDescription implements InterfaceC33145mqt {
        public final /* synthetic */ Ref.BooleanRef AEQbTJ;
        public final /* synthetic */ InterfaceC58184ywW<java.lang.Boolean> EZpvd;
        public final /* synthetic */ Ref.ObjectRef<java.lang.String> copydefault;

        public TaskDescription(Ref.BooleanRef booleanRef, Ref.ObjectRef<java.lang.String> objectRef, InterfaceC58184ywW<java.lang.Boolean> interfaceC58184ywW) {
            this.AEQbTJ = booleanRef;
            this.copydefault = objectRef;
            this.EZpvd = interfaceC58184ywW;
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(long j, long j2) {
            double dAEQbTJ = j / C33129mqd.AEQbTJ(java.lang.Long.valueOf(j2));
            pUU.EZpvd("AnnualDownLoadHelper", "onProgress: " + dAEQbTJ);
            C8172axi.EZpvd.OLrzqt(C8172axi.valueOf, dAEQbTJ);
            if (j == j2) {
                this.AEQbTJ.element = true;
            }
        }

        /* JADX WARN: Type inference failed for: r7v4, types: [T, java.lang.String] */
        @Override // o.InterfaceC33145mqt
        public void EZpvd(int i, java.lang.String str) {
            pUU.KWHzl("AnnualDownLoadHelper", "onError: code=" + i + ",desc=" + str);
            if (this.AEQbTJ.element) {
                Ref.ObjectRef<java.lang.String> objectRef = this.copydefault;
                objectRef.element = ((java.lang.Object) objectRef.element) + "tmp";
                pUU.KWHzl("AnnualDownLoadHelper", "try unzip file:" + ((java.lang.Object) this.copydefault.element));
                this.EZpvd.onNext(java.lang.Boolean.TRUE);
                return;
            }
            C8172axi c8172axi = C8172axi.EZpvd;
            c8172axi.AEQbTJ(C8172axi.AhwBna, "downError:code=" + i + ",desc=" + str);
            this.EZpvd.onNext(java.lang.Boolean.FALSE);
            c8172axi.djBIcL();
        }

        @Override // o.InterfaceC33145mqt
        public void copydefault(java.lang.String str) {
            pUU.KWHzl("AnnualDownLoadHelper", "download Success");
            this.EZpvd.onNext(java.lang.Boolean.TRUE);
        }
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(Ref.ObjectRef objectRef, AnnualDownloadInfo annualDownloadInfo, java.lang.Boolean bool) throws java.lang.Throwable {
        if (!bool.booleanValue()) {
            EZpvd.djBIcL();
            return Unit.INSTANCE;
        }
        pUU.KWHzl("AnnualDownLoadHelper", "check MD5 file is:" + objectRef.element);
        C8175axl c8175axl = C8175axl.AEQbTJ;
        if (!c8175axl.AEQbTJ((java.lang.String) objectRef.element, annualDownloadInfo.getZipMD5())) {
            c8175axl.OLrzqt();
            pUU.KWHzl("AnnualDownLoadHelper", "zip MD5 check fail");
            EZpvd.AEQbTJ(AhwBna, "zip MD5 check fail,path=" + objectRef.element);
        } else {
            pUU.KWHzl("AnnualDownLoadHelper", "zip MD5 check success");
            C33550mya.OLrzqt(c8175axl.djBIcL(), (java.lang.String) objectRef.element);
            c8175axl.AEQbTJ((java.lang.String) objectRef.element);
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairEZpvd = c8175axl.EZpvd(c8175axl.djBIcL(), annualDownloadInfo.getSaveDirectoryName());
            if (pairEZpvd.getFirst().booleanValue()) {
                pUU.KWHzl("AnnualDownLoadHelper", "rename success");
                EZpvd.copydefault(AhwBna);
                c8175axl.AEQbTJ(annualDownloadInfo.getVersion());
            } else {
                EZpvd.AEQbTJ(AhwBna, pairEZpvd.getSecond());
            }
        }
        EZpvd.djBIcL();
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        C8172axi c8172axi = EZpvd;
        c8172axi.AEQbTJ(AhwBna, "other error,msg=" + th.getMessage());
        c8172axi.djBIcL();
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(final LuaFunction luaFunction, final java.lang.String str) {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.axt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C8172axi.EZpvd(str, luaFunction);
            }
        });
    }

    public static final void EZpvd(java.lang.String str, LuaFunction luaFunction) {
        LuaValue[] luaValueArrEZpvd = EZpvd.EZpvd(str);
        if (luaFunction != null) {
            luaFunction.invoke(luaValueArrEZpvd);
        }
    }

    public final void copydefault(final LuaFunction luaFunction) {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.axy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C8172axi.AEQbTJ(luaFunction);
            }
        });
    }

    public static final void AEQbTJ(LuaFunction luaFunction) {
        LuaValue[] luaValueArrAhwBna = EZpvd.AhwBna();
        if (luaFunction != null) {
            luaFunction.invoke(luaValueArrAhwBna);
        }
    }

    public final void OLrzqt(final LuaFunction luaFunction, final double d) {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.axv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C8172axi.OLrzqt(d, luaFunction);
            }
        });
    }

    public static final void OLrzqt(double d, LuaFunction luaFunction) {
        LuaValue[] luaValueArrVarargsOf = LuaValue.varargsOf(LuaNumber.copydefault(d));
        if (luaFunction != null) {
            luaFunction.invoke(luaValueArrVarargsOf);
        }
    }

    public final void djBIcL() {
        gEmmrt().post(new java.lang.Runnable() { // from class: o.axu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C8172axi.AYXKKw();
            }
        });
    }

    public final LuaValue[] EZpvd(java.lang.String str) {
        LuaValue[] luaValueArrVarargsOf = LuaValue.varargsOf(LuaBoolean.AEQbTJ(false), LuaString.copydefault(str));
        Intrinsics.checkNotNullExpressionValue(luaValueArrVarargsOf, "");
        return luaValueArrVarargsOf;
    }

    public final LuaValue[] AhwBna() {
        LuaValue[] luaValueArrVarargsOf = LuaValue.varargsOf(LuaBoolean.AEQbTJ(true), LuaValue.Nil());
        Intrinsics.checkNotNullExpressionValue(luaValueArrVarargsOf, "");
        return luaValueArrVarargsOf;
    }

    public final void valueOf() {
        LuaFunction luaFunction = valueOf;
        if (luaFunction != null) {
            luaFunction.destroy();
        }
        valueOf = null;
        LuaFunction luaFunction2 = AhwBna;
        if (luaFunction2 != null) {
            luaFunction2.destroy();
        }
        AhwBna = null;
    }
}
